/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;

public class SyndicationClientEvent
extends ScribeEvent {
    public static final String CLIENT_NAME = "tfw";
    private static final String SCRIBE_CATEGORY = "tfw_client_event";
    @SerializedName(value="event_info")
    public final String eventInfo;
    @SerializedName(value="external_ids")
    public final ExternalIds externalIds;
    @SerializedName(value="language")
    public final String language;

    public SyndicationClientEvent(EventNamespace eventNamespace, String string2, long l, String string3, String string4, List<ScribeItem> list) {
        super(SCRIBE_CATEGORY, eventNamespace, l, list);
        this.language = string3;
        this.eventInfo = string2;
        this.externalIds = new Object(this, string4){
            @SerializedName(value="6")
            public final String adId;
            public final SyndicationClientEvent this$0;
            {
                this.this$0 = syndicationClientEvent;
                this.adId = string2;
            }
        };
    }
}

