/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.identity;

class WebViewException
extends Exception {
    private static final long serialVersionUID = -7397331487240298819L;
    private final int errorCode;
    private final String failingUrl;

    public WebViewException(int n, String string2, String string3) {
        super(string2);
        this.errorCode = n;
        this.failingUrl = string3;
    }

    public String getDescription() {
        return this.getMessage();
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFailingUrl() {
        return this.failingUrl;
    }
}

