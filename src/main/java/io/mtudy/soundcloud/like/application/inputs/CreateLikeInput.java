package io.mtudy.soundcloud.like.application.inputs;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class CreateLikeInput {
    @NotBlank
    private String type;

    @NotBlank
    private String typeId;

    public CreateLikeInput(String type, String typeId) {
        this.type = type;
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public String getTypeId() {
        return typeId;
    }
}
