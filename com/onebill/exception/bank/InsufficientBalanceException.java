package com.onebill.exception.bank;

public class InsufficientBalanceException extends RuntimeException {
    private String msg;
	public InsufficientBalanceException(String msg) {
		//this.msg=msg;
		super(msg);
	}
//    public String getMsg() {
//    	return msg;
//    }
}
