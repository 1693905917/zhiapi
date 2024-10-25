package com.hzp.zhiapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 根据ID请求
 *
 * @author hzp
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}