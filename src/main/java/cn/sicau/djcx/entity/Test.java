package cn.sicau.djcx.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@TableName(value = "test")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    @TableId("test_id")
    private String testId;
    @TableField("test_time")
    private Date testTime;
    private Date updatetime;


    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.testId;
    }

    @Override
    public String toString() {
        return "Test{" +
        ", testId=" + testId +
        ", testTime=" + testTime +
        ", updatetime=" + updatetime +
        "}";
    }
}
