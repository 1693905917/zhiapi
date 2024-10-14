package com.hzp.zhiapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzp.zhiapi.model.entity.InterfaceInfo;
import com.hzp.zhiapi.model.entity.Post;

/**
* @author ASUS
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-10-14 22:04:49
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
