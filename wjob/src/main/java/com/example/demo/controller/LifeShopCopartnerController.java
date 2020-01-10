package com.example.demo.controller;

import com.example.demo.entity.LifeGoodsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//@Log4j
//@Slf4j
@Api(value = "后台商家管理", description = "后台商家管理")
@Controller
@RequestMapping(value = "/lifeShopCopartner")
public class LifeShopCopartnerController {

    /**
     * web城市合伙人列表
     */
    @ApiOperation(value = "商家管理列表", httpMethod = "GET", response = LifeGoodsDTO.class)
    @ResponseBody
    @RequestMapping(value = "/webQueryList", method = RequestMethod.GET)
    public void webQueryLifeShopCopartnerList( @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
      return ;
    }

    @ApiOperation(value = "查看详情", httpMethod = "GET", response = LifeGoodsDTO.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopId", value = "商户id", paramType = "query", dataType = "Long", required = true)})
    @ResponseBody
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public void query(@RequestParam Long shopId) {
        return;
    }


    @ApiOperation(value = "确认城市合伙人", httpMethod = "GET")
    @ApiImplicitParams({@ApiImplicitParam(name = "shopId", value = "商户id", dataType = "Long", required = true),
            @ApiImplicitParam(name = "cityCopartnerUserId", value = "城市合伙人的userid", dataType = "Long", required = true)})
    @ResponseBody
    @RequestMapping(value = "/confirmCopartner", method = RequestMethod.GET)
    public void confirmCopartner(@RequestParam Long shopId, @RequestParam Long cityCopartnerUserId) {

        return;
    }

}
