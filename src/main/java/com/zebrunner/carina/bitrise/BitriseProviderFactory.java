package com.zebrunner.carina.bitrise;

import com.zebrunner.carina.commons.artifact.ArtifactManagerFactory;
import com.zebrunner.carina.commons.artifact.IArtifactManager;
import com.zebrunner.carina.commons.artifact.IArtifactManagerFactory;

import static com.zebrunner.carina.bitrise.BitriseManager.BITRISE_ENDPOINT_PATTERN;

@ArtifactManagerFactory
public class BitriseProviderFactory implements IArtifactManagerFactory {
    @Override
    public boolean isSuitable(String url) {
        return BITRISE_ENDPOINT_PATTERN.matcher(url).find();
    }

    @Override
    public IArtifactManager getInstance() {
        return BitriseManager.getInstance();
    }
}
