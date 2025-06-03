/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

public interface EventTransform<T> {
    public byte[] toBytes(T var1) throws IOException;
}

