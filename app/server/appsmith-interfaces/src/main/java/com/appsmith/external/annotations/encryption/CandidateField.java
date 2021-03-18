package com.appsmith.external.annotations.encryption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;

@Getter
@Setter
@AllArgsConstructor
public class CandidateField {
    private Field field;
    private Type type;

    enum Type {
        ANNOTATED_FIELD,
        APPSMITH_FIELD_KNOWN,
        APPSMITH_FIELD_UNKNOWN,
        APPSMITH_FIELD_POLYMORPHIC
    }
}
