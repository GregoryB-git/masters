/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 */
package com.hintsolutions.raintv.services.push;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class NotificationPayloadRaw
implements Serializable {
    @Expose
    @SerializedName(value="google.sent_time")
    public long sentTime;
}

