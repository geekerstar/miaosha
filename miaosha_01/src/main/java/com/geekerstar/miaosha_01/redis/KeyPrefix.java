package com.geekerstar.miaosha_01.redis;

public interface KeyPrefix {

	public int expireSeconds();

	public String getPrefix();

}
