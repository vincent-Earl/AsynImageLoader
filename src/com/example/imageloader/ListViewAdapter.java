package com.example.imageloader;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.imageloader.AsynImageLoader.ImageLoadInterface;

/** 
 * 文件名称:   ListViewAdapter.java 
 * 功能描述:  
 * 版本信息:   Copyright (c)2013 
 * 公司信息:   瑜旭网络
 * 开发人员:   yuyejiang
 * 版本日志:   1.0 
 * 创建时间:   2013年11月26日 下午5:03:43 
 * 
 * 修改历史: 
 * 时间         开发者      版本号    修改内容 
 * ------------------------------------------------------------------ 
 * 2013年11月26日   yuyejiang      1.0         1.0 Version 
 */
public class ListViewAdapter extends BaseAdapter {
	private Context context;
	private List<String> imageList = new ArrayList<String>();
//	private ImageView image;
	private AsynImageLoader loader;
	public ListViewAdapter(Context context,List<String> imageList) {
		super();
		this.context = context;
		this.imageList = imageList;
		loader = new AsynImageLoader();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imageList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView==null){
			convertView = (View)LayoutInflater.from(context).inflate(R.layout.listitem, null);
			holder =  new ViewHolder();
			holder.image = (ImageView)convertView.findViewById(R.id.image);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
//		image = (ImageView)convertView.findViewById(R.id.image);
//		View view = (View)LayoutInflater.from(context).inflate(R.layout.listitem, null);
//		final ImageView image = (ImageView)view.findViewById(R.id.image);
//		loader.loadImage(imageList.get(position), new ImageLoadInterface() {
//			
//			@Override
//			public void loadImageCallback(final Drawable drawable) {
//				// TODO Auto-generated method stub
//				Activity act = (Activity)context;
//				act.runOnUiThread(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						if(drawable!=null){
//							holder.image.setImageDrawable(drawable);
//						}
//					}
//				});
//			}
//		});
		CommonUtils.getInstance().loadImage(convertView, imageList.get(position));
		return convertView;
	}
	static class ViewHolder{
		ImageView image;
	}
}
