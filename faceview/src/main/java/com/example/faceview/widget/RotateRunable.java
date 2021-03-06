package com.example.faceview.widget;

import android.view.View;
import android.view.animation.Animation;

/**
 * @author qijiang.guo
 *
 */
public class RotateRunable implements Runnable {
	/**
	 * DEFAULT ANIMATION TIME.
	 */
	static final int ANIMATION_TIME = 300;

	/**
	 * rotate animation.
	 */
	private Animation mAnimation;
	
	/**
	 * target view.
	 */
	private View mContextView;
	
	/**
	 * @deprecated param relayout not working.
	 * 
	 * @param animation animation
	 * @param v the animation view.
	 * @param degree rotate degree.
	 * @param relayout not working.
	 */
	public RotateRunable(Animation animation, View v, int degree, boolean relayout) {
		super();
		// TODO Auto-generated constructor stub
		mAnimation = animation;
		mContextView = v;
	}

	public RotateRunable(Animation animation, View v, int degree) {
		super();
		// TODO Auto-generated constructor stub
		mAnimation = animation;
		mContextView = v;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		mContextView.startAnimation(mAnimation);
	}
	
}
