package com.entity.model;

import com.entity.EtcListEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * ETC缴费记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class EtcListModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer etcId;


    /**
     * 缴费前余额
     */
    private Double etcListOldMoney;


    /**
     * 缴费金额(元)
     */
    private Double etcListNewMoney;


    /**
     * 缴费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 是否缴费成功
     */
    private Integer successTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getEtcId() {
        return etcId;
    }


    /**
	 * 设置：用户
	 */
    public void setEtcId(Integer etcId) {
        this.etcId = etcId;
    }
    /**
	 * 获取：缴费前余额
	 */
    public Double getEtcListOldMoney() {
        return etcListOldMoney;
    }


    /**
	 * 设置：缴费前余额
	 */
    public void setEtcListOldMoney(Double etcListOldMoney) {
        this.etcListOldMoney = etcListOldMoney;
    }
    /**
	 * 获取：缴费金额(元)
	 */
    public Double getEtcListNewMoney() {
        return etcListNewMoney;
    }


    /**
	 * 设置：缴费金额(元)
	 */
    public void setEtcListNewMoney(Double etcListNewMoney) {
        this.etcListNewMoney = etcListNewMoney;
    }
    /**
	 * 获取：缴费时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：缴费时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：是否缴费成功
	 */
    public Integer getSuccessTypes() {
        return successTypes;
    }


    /**
	 * 设置：是否缴费成功
	 */
    public void setSuccessTypes(Integer successTypes) {
        this.successTypes = successTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
