package com.hzp.zhiapi.service;

import com.hzp.zhiapi.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ASUS
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-10-25 17:43:03
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /*
     * @description:统计调用次数
     * @author:  HZP
     * @date: 2024/10/25 18:46
     * @param:
     * @return:
     **/
    boolean invokeCount(long interfaceInfoId,long userId);
}
