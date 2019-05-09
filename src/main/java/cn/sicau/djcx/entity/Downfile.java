package cn.sicau.djcx.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.enums.IdType;

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


    @TableId(value = "file_id",type = IdType.AUTO)
    private Long fileId;
    @TableField("file_name")
    private String fileName;
    @TableField("file_url")
    private String fileUrl;


    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
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
