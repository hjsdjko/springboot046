package com.entity.model;

import com.entity.FangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房源信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public class FangyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋图片
	 */
	
	private String fangwutupian;
		
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 房屋地址
	 */
	
	private String fangwudizhi;
		
	/**
	 * 出租状态
	 */
	
	private String chuzuzhuangtai;
		
	/**
	 * 房源价格
	 */
	
	private Double fangyuanjiage;
		
	/**
	 * 房屋介绍
	 */
	
	private String fangwujieshao;
		
	/**
	 * 屋内设施
	 */
	
	private String wuneisheshi;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：房屋图片
	 */
	 
	public void setFangwutupian(String fangwutupian) {
		this.fangwutupian = fangwutupian;
	}
	
	/**
	 * 获取：房屋图片
	 */
	public String getFangwutupian() {
		return fangwutupian;
	}
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：房屋地址
	 */
	 
	public void setFangwudizhi(String fangwudizhi) {
		this.fangwudizhi = fangwudizhi;
	}
	
	/**
	 * 获取：房屋地址
	 */
	public String getFangwudizhi() {
		return fangwudizhi;
	}
				
	
	/**
	 * 设置：出租状态
	 */
	 
	public void setChuzuzhuangtai(String chuzuzhuangtai) {
		this.chuzuzhuangtai = chuzuzhuangtai;
	}
	
	/**
	 * 获取：出租状态
	 */
	public String getChuzuzhuangtai() {
		return chuzuzhuangtai;
	}
				
	
	/**
	 * 设置：房源价格
	 */
	 
	public void setFangyuanjiage(Double fangyuanjiage) {
		this.fangyuanjiage = fangyuanjiage;
	}
	
	/**
	 * 获取：房源价格
	 */
	public Double getFangyuanjiage() {
		return fangyuanjiage;
	}
				
	
	/**
	 * 设置：房屋介绍
	 */
	 
	public void setFangwujieshao(String fangwujieshao) {
		this.fangwujieshao = fangwujieshao;
	}
	
	/**
	 * 获取：房屋介绍
	 */
	public String getFangwujieshao() {
		return fangwujieshao;
	}
				
	
	/**
	 * 设置：屋内设施
	 */
	 
	public void setWuneisheshi(String wuneisheshi) {
		this.wuneisheshi = wuneisheshi;
	}
	
	/**
	 * 获取：屋内设施
	 */
	public String getWuneisheshi() {
		return wuneisheshi;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
