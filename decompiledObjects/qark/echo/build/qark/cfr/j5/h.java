/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.security.Key
 *  java.security.SecureRandom
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import j5.a;
import j5.i;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class h
implements i {
    public final Cipher a;
    public final SecureRandom b = new SecureRandom();
    public Key c;

    public h(Context context, a a8) {
        String string2 = this.c();
        SecretKeySpec secretKeySpec = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        context = secretKeySpec.edit();
        secretKeySpec = secretKeySpec.getString(string2, null);
        this.a = this.d();
        if (secretKeySpec != null) {
            try {
                this.c = a8.b(Base64.decode((String)secretKeySpec, (int)0), "AES");
                return;
            }
            catch (Exception exception) {
                Log.e((String)"StorageCipher18Impl", (String)"unwrap key failed", (Throwable)exception);
            }
        }
        secretKeySpec = new byte[16];
        this.b.nextBytes((byte[])secretKeySpec);
        secretKeySpec = new SecretKeySpec((byte[])secretKeySpec, "AES");
        this.c = secretKeySpec;
        context.putString(string2, Base64.encodeToString((byte[])a8.a((Key)secretKeySpec), (int)0));
        context.apply();
    }

    @Override
    public byte[] a(byte[] arrby) {
        int n8 = this.e();
        byte[] arrby2 = new byte[n8];
        this.b.nextBytes(arrby2);
        byte[] arrby3 = this.f(arrby2);
        this.a.init(1, this.c, (AlgorithmParameterSpec)arrby3);
        arrby = this.a.doFinal(arrby);
        arrby3 = new byte[arrby.length + n8];
        System.arraycopy((Object)arrby2, (int)0, (Object)arrby3, (int)0, (int)n8);
        System.arraycopy((Object)arrby, (int)0, (Object)arrby3, (int)n8, (int)arrby.length);
        return arrby3;
    }

    @Override
    public byte[] b(byte[] arrby) {
        int n8 = this.e();
        AlgorithmParameterSpec algorithmParameterSpec = new byte[n8];
        System.arraycopy((Object)arrby, (int)0, (Object)algorithmParameterSpec, (int)0, (int)n8);
        algorithmParameterSpec = this.f((byte[])algorithmParameterSpec);
        int n9 = arrby.length - this.e();
        byte[] arrby2 = new byte[n9];
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)0, (int)n9);
        this.a.init(2, this.c, algorithmParameterSpec);
        return this.a.doFinal(arrby2);
    }

    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher d() {
        return Cipher.getInstance((String)"AES/CBC/PKCS7Padding");
    }

    public int e() {
        return 16;
    }

    public AlgorithmParameterSpec f(byte[] arrby) {
        return new IvParameterSpec(arrby);
    }
}

