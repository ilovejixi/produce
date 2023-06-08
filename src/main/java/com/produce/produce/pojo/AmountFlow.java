package com.produce.produce.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmountFlow {
    /**
     * id
     */
    private Long id;

    /**
     * 动账流水号
     */
    private String amountFlowNum;

    /**
     * 关联订单号(必传)
     */
    private String orderNum;

    /**
     * 用户手机号(必传)
     */
    private Long userMobile;

    /**
     * 商户号(必传)
     */
    private String merchantNum;

    /**
     * 商户名(必传)
     */
    private String merchantName;

    /**
     * 商家订单号(必传)
     */
    private String merchantOrderNum;

    private Long belongFlow;
//    private Long belongFlowId;

    /**
     * 交易类型(0收款，1支付，2划扣，3还款，4充值，5提现，6退款)(必传)AmountFlowSourceTypeEnum
     */
    private Integer sourceType;

    /**
     * 支付方式0余额1银行卡2微信3支付宝9其他(必传)
     */
    private int transactionType;

    /**
     * 账户id AccountEnum(必传)
     */
    private Long accountId;

    /**
     * 账户方向(0收入，1支出)(必传)
     *
     * 其中 算法费和服务费 是收入   手续费补贴 优惠补贴 这是支出
     */
    private Integer amountType;

    /**
     * 金额(必传)
     */
    private BigDecimal amount;

    /**
     * 冻结，1冻结，2未冻结(必传)
     */
    private int freeze;

    /**
     * 冻结时间
     */
    private Date freezeTime;

    /**
     * 摘要(必传)
     */
    private String summary;

    /**
     * 商品名
     */
    private String goods;

    /**
     * 可用金额(必传)
     */
    private BigDecimal balanceAble;

    /**
     * 冻结金额(必传)
     */
    private BigDecimal amountFreeze;
    /**
     * 交易时间
     */
    private Date transactionTime;
    /**
     * create_time(必传)
     */
    private Date createTime;

    /**
     * update_time(必传)
     */
    private Date updateTime;

    /**
     * 定时任务扫描标识1可用2不可用
     */
    private Integer able;
    /**
     * 动账入库类型1内部账户2商户3用户4退款
     */
    private Integer accountType;
    private String bizCode;
    private String orderTimes;
    private String tkTimes;
    private String businessName;
}
