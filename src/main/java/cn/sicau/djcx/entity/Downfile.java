package cn.sicau.djcx.entity;

import com.baomidou.mybatisplus.annotations.TableId;
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
public class Downfile extends Model<Downfile> {

    private static final long serialVersionUID = 1L;


    @TableId("file_id")
    private String fileId;
    @TableField("file_name")
    private String fileName;
    @TableField("file_url")
    private String fileUrl;


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.fileId;
    }

    @Override
    public String toString() {
        return "Downfile{" +
        ", fileId=" + fileId +
        ", fileName=" + fileName +
        ", fileUrl=" + fileUrl +
        "}";
    }
}
