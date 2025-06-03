/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

public interface RequestBodyEncrypter {
    public byte[] encrypt(byte[] var1);

    public RequestBodyEncryptionMode getEncryptionMode();
}

