package com.form1099K.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordId {

    @JsonProperty("RecordId")
    private String RecordId;

    public String getRecordId() {
        return RecordId;
    }

    public void setRecordId(String recordId) {
        RecordId = recordId;
    }
}
