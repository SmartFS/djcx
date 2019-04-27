package cn.sicau.djcx.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
public class Rules extends Model<Rules> {

    private static final long serialVersionUID = 1L;

    @TableField("punch_require")
    private Integer punchRequire;
    private Serializable id;


    public Integer getPunchRequire() {
        return punchRequire;
    }

    public void setPunchRequire(Integer punchRequire) {
        this.punchRequire = punchRequire;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Rules{" +
        ", punchRequire=" + punchRequire +
        "}";
    }
}
