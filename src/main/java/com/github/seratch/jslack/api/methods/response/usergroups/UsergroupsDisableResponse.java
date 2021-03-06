package com.github.seratch.jslack.api.methods.response.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;
import lombok.Data;

@Data
public class UsergroupsDisableResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Usergroup usergroup;
}