package com.geekerstar.miaosha_01.redis;

public class OrderKey extends BasePrefix {

	public OrderKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}

}
