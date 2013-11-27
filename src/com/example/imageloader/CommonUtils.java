package com.example.imageloader;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.imageloader.AsynImageLoader.ImageLoadInterface;

/** 
 * 文件名称:   CommonUtils.java 
 * 功能描述:  
 * 版本信息:   Copyright (c)2013 
 * 公司信息:   瑜旭网络
 * 开发人员:   yuyejiang
 * 版本日志:   1.0 
 * 创建时间:   2013年11月27日 上午10:02:57 
 * 
 * 修改历史: 
 * 时间         开发者      版本号    修改内容 
 * ------------------------------------------------------------------ 
 * 2013年11月27日   yuyejiang      1.0         1.0 Version  
 */
public class CommonUtils {
	private static CommonUtils instance;
	private static AsynImageLoader loader;
	public static synchronized CommonUtils getInstance(){
		if(instance == null){
			Log.d("CommonUtils", "CommonUtils init");
			instance = new CommonUtils();
			loader = new AsynImageLoader();
		}
		return instance;
	}
	public void loadImage(final View view ,String imageUrl){
		loader.loadImage(imageUrl, new ImageLoadInterface() {
			
			@Override
			public void loadImageCallback(final Drawable drawable) {
				// TODO Auto-generated method stub
				Activity activity = (Activity)view.getContext();
				activity.runOnUiThread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						ImageView imageView = (ImageView)view.findViewById(R.id.image);
						imageView.setImageDrawable(drawable);
					}
				});
			}
		});
	}
}
