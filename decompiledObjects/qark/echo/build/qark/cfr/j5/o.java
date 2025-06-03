/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.GCMParameterSpec
 */
package j5;

import android.content.Context;
import j5.a;
import j5.h;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

public class o
extends h {
    public o(Context context, a a8) {
        super(context, a8);
    }

    @Override
    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override
    public Cipher d() {
        return Cipher.getInstance((String)"AES/GCM/NoPadding");
    }

    @Override
    public int e() {
        return 12;
    }

    @Override
    public AlgorithmParameterSpec f(byte[] arrby) {
        return new GCMParameterSpec(128, arrby);
    }
}

