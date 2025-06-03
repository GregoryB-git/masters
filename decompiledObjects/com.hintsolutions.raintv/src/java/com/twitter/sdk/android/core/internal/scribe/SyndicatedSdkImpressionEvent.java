/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.Collections;
import java.util.List;

public class SyndicatedSdkImpressionEvent
extends ScribeEvent {
    public static final String CLIENT_NAME = "android";
    private static final String SCRIBE_CATEGORY = "syndicated_sdk_impression";
    @SerializedName(value="device_id_created_at")
    public final long deviceIdCreatedAt;
    @SerializedName(value="external_ids")
    public final ExternalIds externalIds;
    @SerializedName(value="language")
    public final String language;

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long l, String string2, String string3) {
        this(eventNamespace, l, string2, string3, (List<ScribeItem>)Collections.emptyList());
    }

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long l, String string2, String string3, List<ScribeItem> list) {
        super(SCRIBE_CATEGORY, eventNamespace, l, list);
        this.language = string2;
        this.externalIds = new Object(this, string3){
            @SerializedName(value="AD_ID")
            public final String adId;
            public final SyndicatedSdkImpressionEvent this$0;
            {
                this.this$0 = syndicatedSdkImpressionEvent;
                this.adId = string2;
            }
        };
        this.deviceIdCreatedAt = 0L;
    }
}

