package com.zebrunner.carina.bitrise.config;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.config.EncryptorConfiguration;
import com.zebrunner.carina.utils.config.IParameter;

import java.util.Optional;

public final class BitriseConfiguration extends Configuration {

    public enum Parameter implements IParameter {

        BITRISE_ACCESS_KEY_TOKEN("bitrise_access_token") {
            @Override
            public boolean hidden() {
                return true;
            }
        };

        private final String name;

        Parameter(String name) {
            this.name = name;
        }

        @Override
        public String getKey() {
            return name;
        }
    }

    @Override
    public String toString() {
        Optional<String> asString = asString(EncryptorConfiguration.Parameter.values());
        return asString.map(s -> "\n=========== Bitrise configuration ===========\n" +
                s).orElse("");
    }

}
