package com.apple.down.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtils{
	
	/**
	 * check network statue
	 * @param context
	 */
	public static int checkNetworkStatue(Context context){
		ConnectivityManager connectivityManager = (ConnectivityManager) context
		.getSystemService(Context.CONNECTIVITY_SERVICE);//��ȡϵͳ�����ӷ���
		NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();//��ȡ������������
		return (activeNetInfo==null)?ConnectivityManager.TYPE_MOBILE:activeNetInfo.getType();
	}
}
