package com.example.nice.util;import android.content.Context;import android.widget.Toast;import com.example.nice.NiceWarm;/** * @author yinxinya * @version 1.0 * @title:单例Toast 防止Toast过多的情况一直显示 * @description: * @company: 美丽说（北京）网络科技有限公司 * @created * @changeRecord */public class CaoNiMeiToast extends Toast {	private static Toast mToast;	private CaoNiMeiToast(Context context) {		super(context);	}	public static Toast makeText(Context context, CharSequence text,			int duration) {		if (mToast == null) {			if (context == null) {				mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", duration);			} else {				mToast = Toast.makeText(context, "", duration);			}		}		mToast.setText(text);		mToast.setDuration(duration);		return mToast;	}	public static Toast makeText(Context context, int resId, int duration) {		if (mToast == null) {			if (context == null) {				mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", duration);			} else {				mToast = Toast.makeText(context, "", duration);			}		}		mToast.setText(context.getString(resId));		mToast.setDuration(duration);		return mToast;	}	public static void makeShortText(CharSequence text) {		if (mToast == null) {			mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", Toast.LENGTH_SHORT);		}		mToast.setText(text);		mToast.setDuration(Toast.LENGTH_SHORT);		mToast.show();	}	public static void makeShortText(int resId) {		if (mToast == null) {			mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", Toast.LENGTH_SHORT);		}		mToast.setText(NiceWarm.getInstance().getApplicationContext().getString(resId));		mToast.setDuration(Toast.LENGTH_SHORT);		mToast.show();	}	public static void makeLongText(CharSequence text) {		if (mToast == null) {			mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", Toast.LENGTH_LONG);		}		mToast.setText(text);		mToast.setDuration(Toast.LENGTH_LONG);		mToast.show();	}	public static void makeLongText(int resId) {		if (mToast == null) {			mToast = Toast.makeText(NiceWarm.getInstance().getApplicationContext(), "", Toast.LENGTH_LONG);		}		mToast.setText(NiceWarm.getInstance().getApplicationContext().getString(resId));		mToast.setDuration(Toast.LENGTH_LONG);		mToast.show();	}}