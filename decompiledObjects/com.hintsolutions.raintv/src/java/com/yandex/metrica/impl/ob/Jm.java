/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class jm {
    private final String a;
    private final byte[] b;
    private final byte[] c;

    public jm(String string, byte[] byArray, byte[] byArray2) {
        this.a = string;
        this.b = byArray;
        this.c = byArray2;
    }

    @SuppressLint(value={"TrulyRandom"})
    public byte[] a(byte[] byArray) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
        Cipher cipher = Cipher.getInstance((String)this.a);
        cipher.init(1, (Key)secretKeySpec, (AlgorithmParameterSpec)new IvParameterSpec(this.c));
        return cipher.doFinal(byArray);
    }

    public byte[] a(byte[] byArray, int n4, int n5) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
        Cipher cipher = Cipher.getInstance((String)this.a);
        cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)new IvParameterSpec(this.c));
        return cipher.doFinal(byArray, n4, n5);
    }
}

