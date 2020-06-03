package com.passbook.passbook.controller;

import com.passbook.passbook.log.LogConstants;
import com.passbook.passbook.log.LogGenerator;
import com.passbook.passbook.service.IFeedbackService;
import com.passbook.passbook.service.IGainPassTemplateService;
import com.passbook.passbook.service.IInventoryService;
import com.passbook.passbook.service.IUserPassService;
import com.passbook.passbook.vo.Feedback;
import com.passbook.passbook.vo.GainPassTemplateRequest;
import com.passbook.passbook.vo.Pass;
import com.passbook.passbook.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Passbook Controller
 */
@Slf4j
@RestController
@RequestMapping("/passbook")
public class PassbookController {

    private final IUserPassService userPassService;
    private final IInventoryService inventoryService;
    private final IGainPassTemplateService gainPassTemplateService;
    private final IFeedbackService feedbackService;
    private final HttpServletRequest httpServletRequest;

    @Autowired
    public PassbookController(IUserPassService userPassService, IInventoryService inventoryService, IGainPassTemplateService gainPassTemplateService, IFeedbackService feedbackService, HttpServletRequest httpServletRequest) {
        this.userPassService = userPassService;
        this.inventoryService = inventoryService;
        this.gainPassTemplateService = gainPassTemplateService;
        this.feedbackService = feedbackService;
        this.httpServletRequest = httpServletRequest;
    }

    /**
     * <h2>获取用户优惠券信息</h2>
     * @param userId
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/userpassinfo")
    Response userPassInfo(Long userId)throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.USER_PASS_INFO,
                null);
        return userPassService.getUserPassInfo(userId);
    }

    /**
     * <h2>获取用户已使用的优惠券信息</h2>
     * @param userId
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("userusedpassinfo")
    Response userUsedPassInfo(Long userId) throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.USER_USED_PASS_INFO,
                null);
        return userPassService.getUserUsedPassInfo(userId);
    }


    /**
     * <h2>用户是用优惠券</h2>
     * @param pass
     * @return
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("/userusepass")
    Response userUsePass(Pass pass) throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                pass.getUserId(),
                LogConstants.ActionName.USER_USE_PASS,
                pass);
        return userPassService.userUsePass(pass);
    }

    /**
     * <h2>获取优惠券库存信息</h2>
     * @param userId
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/inventoryinfo")
    Response inventoryInfo(Long userId)throws Exception{
        LogGenerator.genLog(
                httpServletRequest,//获取ip地址
                userId,//定位用户
                LogConstants.ActionName.INVENTORY_INFO,//定位日志功能
                null);//请求对象
        return inventoryService.getInventoryInfo(userId);
    }

    /**
     * <h2>用户领取优惠券</h2>
     * @Requsetbody将json转换为请求对象
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("/gainpasstemplate")
    Response gainPassTemplate(@RequestBody GainPassTemplateRequest request)throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                request.getUserId(),
                LogConstants.ActionName.GAIN_PASS_TEMPLATE,
                request);
        return gainPassTemplateService.gainPassTemplate(request);
    }

    /**
     * <h2>用户创建评论</h2>
     * @param feedback
     * @return
     */
    @ResponseBody
    @PostMapping("/createfeedback")
    Response createFeedback(@RequestBody Feedback feedback){
        LogGenerator.genLog(
                httpServletRequest,
                feedback.getUserId(),
                LogConstants.ActionName.CREATE_FEEDBACK,
                feedback);
        return feedbackService.createFeedback(feedback);
    }

    /**
     * <h2>获取用户的feedback</h2>
     * @param userId
     * @return
     */
    @ResponseBody
    @GetMapping("/getfeedback")
    Response getFeedback(Long userId){
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.GET_FEEDBACK,
                null);
        return feedbackService.getFeedback(userId);
    }

    /**
     * 异常展示接口
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/exception")
    Response exception()throws Exception{
        throw new Exception("Welcome to Passsbook application");
    }

}
