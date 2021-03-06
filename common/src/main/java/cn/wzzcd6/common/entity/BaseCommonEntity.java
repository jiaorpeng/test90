package cn.wzzcd6.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import cn.wzzcd6.common.utils.SnowFlakeUtil;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xiaomalover <xiaomalover@gmail.com>
 * 所有实体的其类，ID使用雪花算法
 */
@Data
public abstract class BaseCommonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    @TableField(fill = FieldFill.INSERT)
    private Long createdAt;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updatedAt;
}
