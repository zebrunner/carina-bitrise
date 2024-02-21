package com.zebrunner.carina.bitrise;

import com.zebrunner.carina.commons.artifact.IAppInfo;

public final class BitriseApp implements IAppInfo {
    private String directLink;
    private String build;

    BitriseApp() {
    }

    @Override
    public String getDirectLink() {
        return this.directLink;
    }

    void setDirectLink(String directLink) {
        this.directLink = directLink;
    }

    @Override
    public String getBuild() {
        return this.build;
    }

    void setBuild(String build) {
        this.build = build;
    }
}

