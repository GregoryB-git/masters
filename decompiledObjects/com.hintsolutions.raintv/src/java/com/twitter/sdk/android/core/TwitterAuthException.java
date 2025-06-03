/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.TwitterException;

public class TwitterAuthException
extends TwitterException {
    private static final long serialVersionUID = 577033016879783994L;

    public TwitterAuthException(String string2) {
        super(string2);
    }

    public TwitterAuthException(String string2, Throwable throwable) {
        super(string2, throwable);
    }
}

