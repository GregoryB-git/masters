/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetcomposer.ScribeClient;
import java.util.List;

class ScribeClientImpl
implements ScribeClient {
    private final DefaultScribeClient scribeClient;

    public ScribeClientImpl(DefaultScribeClient defaultScribeClient) {
        this.scribeClient = defaultScribeClient;
    }

    @Override
    public void scribe(EventNamespace eventNamespace, List<ScribeItem> list) {
        DefaultScribeClient defaultScribeClient = this.scribeClient;
        if (defaultScribeClient != null) {
            defaultScribeClient.scribe(eventNamespace, list);
        }
    }
}

