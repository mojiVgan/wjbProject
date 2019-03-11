package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UserLoginInfo implements Serializable {

	private static final long serialVersionUID = 8548632202908173580L;

    private String userid;

    private String loginId;

    private String password;

    private String userType;

    private String sessionId;

    private Date lastLoginTime;

    private String clientIp;

    private String menuTypeId;

    private Date lastModifyPwdDate;

    private String isFirstLogin;

    private String isInUse;

    private String vendorId;

    private Date lockTime;

    private Integer errorTimes;
    
    
//    private Set<Role> roles = new HashSet<Role>();
//
//    private Collection<SysFunc> funcDatas;
    
    private Set<String> urlSet = new HashSet<String>();
    
    private Map<String, String> funcDataMap;
    
    private String mallStaffName;
    
//    private MallStaffBasicInfo mallStaffBasicInfo;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPassword() {
        if(this.password!=null){
            return this.password;
        }else{
            return password;
        }
        
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(String menuTypeId) {
        this.menuTypeId = menuTypeId == null ? null : menuTypeId.trim();
    }

    public Date getLastModifyPwdDate() {
        return lastModifyPwdDate;
    }

    public void setLastModifyPwdDate(Date lastModifyPwdDate) {
        this.lastModifyPwdDate = lastModifyPwdDate;
    }


    public String getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(String isFirstLogin) {
        this.isFirstLogin = isFirstLogin == null ? null : isFirstLogin.trim();
    }

    public String getIsInUse() {
        return isInUse;
    }

    public void setIsInUse(String isInUse) {
        this.isInUse = isInUse == null ? null : isInUse.trim();
    }

    /* (non-Javadoc)
     * @see org.springframework.security.userdetails.UserDetails#getAuthorities()
     */
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<GrantedAuthority> authorities = new LinkedHashSet<GrantedAuthority>();
//        for(Role r : roles){
//            authorities.addAll(r.getBankManageGrants());
//        }
//        return (authorities);
//    }

    /* (non-Javadoc)
     * @see org.springframework.security.userdetails.UserDetails#getUsername()
     */
    public String getUsername() {
        return getLoginId();
    }

    public boolean isAccountNonExpired() {
        //if the lastModifyPwdDate is null,return.
//        if(this.lastModifyPwdDate==null){
//            return true;
//        }
//        Date now = new Date();
//        if(Constants.USER_TYPE0.equals(this.userType)){
//            String days = com.i2f.i2one.emall.util.WebUtils.getSystemParm(Constants.M_PASSWORD_PARAM_TYPE, Constants.M_PASSWORD_PARAM_TYPE_INVALIDATE_DAYS);
//            if(StringUtils.isNotEmpty(days)){
//                return now.before(DateUtils.addDays(this.lastModifyPwdDate, Integer.valueOf(days)));
//            }
//        }else if(Constants.USER_TYPE1.equals(this.userType)){
//            String days = com.i2f.i2one.emall.util.WebUtils.getSystemParm(Constants.V_PASSWORD_PARAM_TYPE, Constants.V_PASSWORD_PARAM_TYPE_INVALIDATE_DAYS);
//            if(StringUtils.isNotEmpty(days)){
//                return now.before(DateUtils.addDays(this.lastModifyPwdDate, Integer.valueOf(days)));
//            }
//        }
        return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.userdetails.UserDetails#isAccountNonLocked()
     */


    /* (non-Javadoc)
     * @see org.springframework.security.userdetails.UserDetails#isCredentialsNonExpired()
     */
    
    
    public boolean isCredentialsNonExpired() {
        
        return true;
    }

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

    /**
     * @param lockTime The lockTime to set.
     */
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * @return Returns the lockTime.
     */
    public Date getLockTime() {
        return lockTime;
    }

    /**
     * @param errorTimes The errorTimes to set.
     */
    public void setErrorTimes(Integer errorTimes) {
        this.errorTimes = errorTimes;
    }

    /**
     * @return Returns the errorTimes.
     */
    public Integer getErrorTimes() {
        return errorTimes;
    }


	public Set<String> getUrlSet() {
		return urlSet;
	}

	public void setUrlSet(Set<String> urlSet) {
		this.urlSet = urlSet;
	}
    
	public String getMallStaffName() {
		return mallStaffName;
	}

	public void setMallStaffName(String mallStaffName) {
		this.mallStaffName = mallStaffName;
	}




    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("userid: " + this.userid)
                .append("loginId: " + this.loginId)
                .append("clientIp: " +this.clientIp)
                .append("menuTypeId: " + this.menuTypeId)
                .append("userType: " + this.userType)
                .append("lastLoginTime: " + this.lastLoginTime)
                .append("lastModifyPwdDate: " + this.lastModifyPwdDate);
        return sb.toString();
    }

}