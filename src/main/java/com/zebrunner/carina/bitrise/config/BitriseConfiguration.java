package com.zebrunner.carina.bitrise.config;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.config.IParameter;

public final class BitriseConfiguration extends Configuration {

    public enum Parameter implements IParameter {

        BITRISE_ACCESS_KEY_TOKEN("bitrise_access_token");

        private final String name;

        Parameter(String name) {
            this.name = name;
        }

        @Override
        public String getKey() {
            return name;
        }
    }

    public static void setFilter() {

    }


}
