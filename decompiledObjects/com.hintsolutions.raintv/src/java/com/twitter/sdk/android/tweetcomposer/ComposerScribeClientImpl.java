/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetcomposer.ComposerScribeClient;
import com.twitter.sdk.android.tweetcomposer.ScribeClient;
import com.twitter.sdk.android.tweetcomposer.ScribeConstants;
import java.util.Collections;
import java.util.List;

class ComposerScribeClientImpl
implements ComposerScribeClient {
    private final ScribeClient scribeClient;

    public ComposerScribeClientImpl(ScribeClient scribeClient) {
        if (scribeClient != null) {
            this.scribeClient = scribeClient;
            return;
        }
        throw new NullPointerException("scribeClient must not be null");
    }

    @Override
    public void click(String object) {
        object = ScribeConstants.ComposerEventBuilder.setComponent("").setElement((String)object).setAction("click").builder();
        this.scribeClient.scribe((EventNamespace)object, (List<ScribeItem>)Collections.EMPTY_LIST);
    }

    @Override
    public void impression() {
        EventNamespace eventNamespace = ScribeConstants.ComposerEventBuilder.setComponent("").setElement("").setAction("impression").builder();
        this.scribeClient.scribe(eventNamespace, (List<ScribeItem>)Collections.EMPTY_LIST);
    }
}

