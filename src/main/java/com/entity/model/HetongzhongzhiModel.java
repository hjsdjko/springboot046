package com.entity.model;

import com.entity.HetongzhongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 合同终止
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public class HetongzhongzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋名称
	 */
	
	private String fangwumingcheng;
		
	/**
	 * 房屋图片
	 */
	
	private String fangwutupian;
		
	/**
	 * 房屋地址
	 */
	
	private String fangwudizhi;
		
	/**
	 * 房源价格
	 */
	
	private Double fangyuanjiage;
		
	/**
	 * 签订日期
	 */
	
	private String qiandingriqi;
		
	/**
	 * 合同附件
	 */
	
	private String hetongfujian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 终止时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhongzhishijian;
		
	/**
	 * 终止原因
	 */
	
	private String zhongzhiyuanyin;
				
	
	/**
	 * 设置：房屋名称
	 */
	 
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
	}
				
	
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
	 * 设置：签订日期
	 */
	 
	public void setQiandingriqi(String qiandingriqi) {
		this.qiandingriqi = qiandingriqi;
	}
	
	/**
	 * 获取：签订日期
	 */
	public String getQiandingriqi() {
		return qiandingriqi;
	}
				
	
	/**
	 * 设置：合同附件
	 */
	 
	public void setHetongfujian(String hetongfujian) {
		this.hetongfujian = hetongfujian;
	}
	
	/**
	 * 获取：合同附件
	 */
	public String getHetongfujian() {
		return hetongfujian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：终止时间
	 */
	 
	public void setZhongzhishijian(Date zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}
	
	/**
	 * 获取：终止时间
	 */
	public Date getZhongzhishijian() {
		return zhongzhishijian;
	}
				
	
	/**
	 * 设置：终止原因
	 */
	 
	public void setZhongzhiyuanyin(String zhongzhiyuanyin) {
		this.zhongzhiyuanyin = zhongzhiyuanyin;
	}
	
	/**
	 * 获取：终止原因
	 */
	public String getZhongzhiyuanyin() {
		return zhongzhiyuanyin;
	}
			
}
