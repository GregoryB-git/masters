/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.scribe.SyndicatedSdkImpressionEvent
 *  com.twitter.sdk.android.core.internal.scribe.SyndicationClientEvent
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.internal.scribe.SyndicatedSdkImpressionEvent;
import com.twitter.sdk.android.core.internal.scribe.SyndicationClientEvent;
import java.util.Collections;
import java.util.List;

public class ScribeEventFactory {
    public static ScribeEvent newScribeEvent(EventNamespace eventNamespace, long l, String string2, String string3) {
        return ScribeEventFactory.newScribeEvent(eventNamespace, "", l, string2, string3, (List<ScribeItem>)Collections.emptyList());
    }

    public static ScribeEvent newScribeEvent(EventNamespace eventNamespace, String string2, long l, String string3, String string4, List<ScribeItem> list) {
        String string5 = eventNamespace.client;
        string5.getClass();
        if (!string5.equals((Object)"tfw")) {
            return new SyndicatedSdkImpressionEvent(eventNamespace, l, string3, string4, list);
        }
        return new SyndicationClientEvent(eventNamespace, string2, l, string3, string4, list);
    }
}

