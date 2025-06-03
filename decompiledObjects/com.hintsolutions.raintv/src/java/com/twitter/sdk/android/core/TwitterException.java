/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.core;

public class TwitterException
extends RuntimeException {
    public TwitterException(String string2) {
        super(string2);
    }

    public TwitterException(String string2, Throwable throwable) {
        super(string2, throwable);
    }
}

