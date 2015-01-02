package com.nexters.ssss.controller.gateway.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.nexters.ssss.util.sessionUtil;
import com.nexters.ssss.util.serviceIf;

/**
 * 로그인
 * @author limjuhyun
 *
 */
public class LG0001 implements serviceIf {

	private static final boolean isNeedLogin = false;
	private sessionUtil sessionutil;

	@Override
	public Map<String, Object> doFirst(HttpSession session, JSONObject reqData) {
		sessionutil = new sessionUtil(session);
		
		if(isNeedLogin){
			sessionutil.isUserLogin();
		}
		
		return execute(reqData);
	}

	@Override
	public Map<String, Object> execute(JSONObject reqData) {
		// TODO Auto-generated method stub
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		sessionutil.setUsrId("test");
		
		return rsltMap;
	}
}
