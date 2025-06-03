/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.scribe;

public class ScribeConfig {
    public static final String BASE_URL = "https://api.twitter.com";
    public static final int DEFAULT_MAX_FILES_TO_KEEP = 100;
    public static final int DEFAULT_SEND_INTERVAL_SECONDS = 600;
    public final String baseUrl;
    public final boolean isEnabled;
    public final int maxFilesToKeep;
    public final String pathType;
    public final String pathVersion;
    public final int sendIntervalSeconds;
    public final String sequence;
    public final String userAgent;

    public ScribeConfig(boolean bl, String string2, String string3, String string4, String string5, String string6, int n, int n2) {
        this.isEnabled = bl;
        this.baseUrl = string2;
        this.pathVersion = string3;
        this.pathType = string4;
        this.sequence = string5;
        this.userAgent = string6;
        this.maxFilesToKeep = n;
        this.sendIntervalSeconds = n2;
    }
}

