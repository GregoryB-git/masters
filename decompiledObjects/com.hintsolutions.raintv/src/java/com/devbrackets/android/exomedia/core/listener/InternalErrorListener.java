/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.core.listener;

public interface InternalErrorListener {
    public void onAudioSinkUnderrun(int var1, long var2, long var4);

    public void onDrmSessionManagerError(Exception var1);
}

