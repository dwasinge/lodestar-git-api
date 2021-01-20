package com.redhat.labs.lodestar.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BackendWebHook {

    private String eventName;
    private BackendWebHookProject project;

}
