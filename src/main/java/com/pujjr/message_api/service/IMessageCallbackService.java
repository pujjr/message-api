package com.pujjr.message_api.service;

public interface IMessageCallbackService 
{
	/**
	 * 更新短信发送状态
	 * @param sendId 发送ID
	 * @param status 发送状态
	 */
	public void updateSmsSendStatus(String sendId,String status);
}
