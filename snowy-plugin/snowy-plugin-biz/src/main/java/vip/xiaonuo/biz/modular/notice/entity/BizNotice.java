/*
 * Copyright [2022] [https://www.xiaonuo.vip]
 *
 * Snowy采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改Snowy源码头部的版权声明。
 * 3.本项目代码可免费商业使用，商业使用请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 https://www.xiaonuo.vip
 * 5.不可二次分发开源参与同类竞品，如有想法可联系团队xiaonuobase@qq.com商议合作。
 * 6.若您的项目无法满足以上几点，需要更多功能代码，获取Snowy商业授权许可，请在官网购买授权，地址为 https://www.xiaonuo.vip
 */
package vip.xiaonuo.biz.modular.notice.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import vip.xiaonuo.common.pojo.CommonEntity;

/**
 * 通知公告实体
 *
 * @author yubaoshan
 * @date  2024/07/11 14:46
 **/
@Getter
@Setter
@TableName("BIZ_NOTICE")
public class BizNotice extends CommonEntity {

    /** 主键 */
    @TableId
    @Schema(description = "主键")
    private String id;

    /** 标题 */
    @Schema(description = "标题")
    private String title;

    /** 封面图 */
    @Schema(description = "封面图")
    private String image;

    /** 内容 */
    @Schema(description = "内容")
    private String content;

    /** 摘要 */
    @Schema(description = "摘要")
    private String digest;

    /** 类型 */
    @Schema(description = "类型")
    private String type;

    /** 发布位置 */
    @Schema(description = "发布位置")
    private String place;

    /** 状态 */
    @Schema(description = "状态")
    private String status;

    /** 备注 */
    @Schema(description = "备注")
    private String remark;

    /** 排序 */
    @Schema(description = "排序")
    private String sortCode;

    /** 扩展信息 */
    @Schema(description = "扩展信息")
    private String extJson;
}
