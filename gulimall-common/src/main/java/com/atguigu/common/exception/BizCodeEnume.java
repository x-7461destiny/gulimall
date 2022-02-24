package com.atguigu.common.exception;

/**
 * 借误码和错误信息定义类
 * 错误码定义规则为5为数字
 * 1
 * 前两位表示业务场景，最后三位表示错误码。例如：100001。18:通用 981:系统未知异常
 * 2.
 * 3.
 * 维护借误码后需要维护错误描述，将他们定义为枚举形式
 * 错误码列表：
 * 18：通用
 * 081：参数格式校验
 * 11：商品
 * 12：订单
 * 13：购物车
 * 14：物流
 */
public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VAILD_EXCEPTION(10001,"参数格式校验异常");


    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
