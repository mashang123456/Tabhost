package com.ue.tabhost;

/**
 * 选项卡：图标、文字、对应class
 */
public class Constant {
	
	public static final class ConValue{
		
		/**
		 * Tab选项卡的图标
		 */
		public static int mImageViewArray[] = {
			R.drawable.tab_icon1,
			R.drawable.tab_icon2,
			R.drawable.tab_icon3,
			R.drawable.tab_icon4,
		};
		
		/**
		 * Tab选项卡的文字
		 */
		public static String mTextViewArray[] = {"即时货源", "当天货源", "服务", "个人中心"};
		
		/** 
         * 每一个Tab界面 
         */ 
		public static Class<?> mTabClassArray[] = {
			ActivityOne.class,
			ActivityTwo.class,
			ActivityThree.class,
			ActivityFour.class,
		};
	}
}
