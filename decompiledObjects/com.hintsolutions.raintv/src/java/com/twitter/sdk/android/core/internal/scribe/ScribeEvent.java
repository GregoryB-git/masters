/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.Collections;
import java.util.List;

public class ScribeEvent {
    private static final String CURRENT_FORMAT_VERSION = "2";
    @SerializedName(value="_category_")
    public final String category;
    @SerializedName(value="event_namespace")
    public final EventNamespace eventNamespace;
    @SerializedName(value="format_version")
    public final String formatVersion;
    @SerializedName(value="items")
    public final List<ScribeItem> items;
    @SerializedName(value="ts")
    public final String timestamp;

    public ScribeEvent(String string2, EventNamespace eventNamespace, long l) {
        this(string2, eventNamespace, l, (List<ScribeItem>)Collections.emptyList());
    }

    public ScribeEvent(String string2, EventNamespace eventNamespace, long l, List<ScribeItem> list) {
        this.category = string2;
        this.eventNamespace = eventNamespace;
        this.timestamp = String.valueOf((long)l);
        this.formatVersion = CURRENT_FORMAT_VERSION;
        this.items = Collections.unmodifiableList(list);
    }

    public boolean equals(Object list) {
        if (this == list) {
            return true;
        }
        if (list != null && this.getClass() == list.getClass()) {
            list = (ScribeEvent)list;
            Object object = this.category;
            if (object != null ? !object.equals((Object)list.category) : list.category != null) {
                return false;
            }
            object = this.eventNamespace;
            if (object != null ? !object.equals(list.eventNamespace) : list.eventNamespace != null) {
                return false;
            }
            object = this.formatVersion;
            if (object != null ? !object.equals((Object)list.formatVersion) : list.formatVersion != null) {
                return false;
            }
            object = this.timestamp;
            if (object != null ? !object.equals((Object)list.timestamp) : list.timestamp != null) {
                return false;
            }
            object = this.items;
            list = list.items;
            return !(object != null ? !object.equals(list) : list != null);
        }
        return false;
    }

    public int hashCode() {
        List<ScribeItem> list = this.eventNamespace;
        int n = 0;
        int n2 = list != null ? list.hashCode() : 0;
        list = this.timestamp;
        int n3 = list != null ? list.hashCode() : 0;
        list = this.formatVersion;
        int n4 = list != null ? list.hashCode() : 0;
        list = this.category;
        int n5 = list != null ? list.hashCode() : 0;
        list = this.items;
        if (list != null) {
            n = list.hashCode();
        }
        return (((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("event_namespace=");
        stringBuilder.append((Object)this.eventNamespace);
        stringBuilder.append(", ts=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", format_version=");
        stringBuilder.append(this.formatVersion);
        stringBuilder.append(", _category_=");
        stringBuilder.append(this.category);
        stringBuilder.append(", items=");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("[");
        stringBuilder2.append(TextUtils.join((CharSequence)", ", this.items));
        stringBuilder2.append("]");
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}

