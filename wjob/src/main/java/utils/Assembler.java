package utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * 1.Spring的BeanUtils的CopyProperties方法需要对应的属性有getter和setter方法；
 * 2.如果存在属性完全相同的内部类，但是不是同一个内部类，即分别属于各自的内部类，则spring会认为属性不同，不会copy；
 * 3.泛型只在编译期起作用，不能依靠泛型来做运行期的限制；
 * 4.最后，spring和apache的copy属性的方法源和目的参数的位置正好相反，所以导包和调用的时候都要注意一下。
 */

/**
 * 对象转换
 */
public class Assembler {
	public static <T> T copyProperties(Object original, Class<T> clazz) {
		if (original == null) {
			return null;
		}
		T target = null;
		try {
			target = clazz.newInstance();
			BeanUtils.copyProperties(original, target);

		} catch (Exception e) {
		}
		return target;
	} 

	public static void copyProperties(Object original, Object dest) {
		try {
			BeanUtils.copyProperties(original, dest);

		} catch (Exception e) {
		}
	}

	public static <T> List<T> copyList(Collection<?> original, Class<T> clazz) {
		if (original == null) {
			return null;
		}
		List<T> results = new ArrayList<T>();
		for (Object each : original) {
			results.add(copyProperties(each, clazz));
		}
		return results;
	}
}
