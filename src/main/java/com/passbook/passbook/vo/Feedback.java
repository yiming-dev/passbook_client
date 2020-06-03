package com.passbook.passbook.vo;

import com.google.common.base.Enums;
import com.passbook.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    private Long userId;
    private String type;
    private String templateId;
    private String comment;

    public boolean validate(){
        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class,this.type.toUpperCase()
        ).orNull();
        return !(null == feedbackType || null == comment);
    }
}
