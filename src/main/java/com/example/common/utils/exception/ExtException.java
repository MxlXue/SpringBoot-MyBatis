package com.example.common.utils.exception;

/**
 * 功能:扩展异常
 *
 * @author 张军才
 * @date 2017年5月15日 下午4:40:47
 *
 */
public class ExtException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    
    public ExtException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

}
