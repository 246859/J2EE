package com.lite.business.entity.batch;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class Batch {

    @TableId(value = "batch_id", type = IdType.AUTO)
    private Integer batchId;

    /**
     * 创建批次用户id
     */
    private Integer cusId;

    /**
     * 批次编码
     */
    private String number;

    /**
     * 创建批次时间
     */
    private LocalDateTime createtime;

    /**
     * 备注
     */
    private String note;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Batch{" +
            "batchId=" + batchId +
            ", cusId=" + cusId +
            ", number=" + number +
            ", createtime=" + createtime +
            ", note=" + note +
        "}";
    }
}
