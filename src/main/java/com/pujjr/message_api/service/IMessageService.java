package com.pujjr.message_api.service;

public interface IMessageService 
{
	/**
	 * 发送短信
	 * @param sendId 发送ID
	 * @param mobile 手机号码
	 * @param content 短信内容
	 * @throws Exception 
	 */
	public String sendSms(String sendId,String mobile,String content) throws Exception;
}
