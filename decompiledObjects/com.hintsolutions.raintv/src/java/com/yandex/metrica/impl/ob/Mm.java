/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.lm;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

public class mm
implements RequestBodyEncrypter {
    private lm a;

    public mm() {
        this(new lm());
    }

    @VisibleForTesting
    public mm(lm lm2) {
        this.a = lm2;
    }

    @Override
    @Nullable
    public byte[] encrypt(@Nullable byte[] byArray) {
        return this.a.a(byArray);
    }

    @Override
    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }
}

