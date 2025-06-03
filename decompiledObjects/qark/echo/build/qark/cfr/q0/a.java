/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Map
 *  javax.crypto.Cipher
 *  javax.crypto.CipherInputStream
 *  javax.crypto.NoSuchPaddingException
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package q0;

import android.net.Uri;
import i0.g;
import i0.i;
import i0.k;
import i0.y;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
implements g {
    public final g a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public a(g g8, byte[] arrby, byte[] arrby2) {
        this.a = g8;
        this.b = arrby;
        this.c = arrby2;
    }

    @Override
    public final void c(y y8) {
        g0.a.e(y8);
        this.a.c(y8);
    }

    @Override
    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final long e(k object) {
        void var1_7;
        void var1_4;
        Cipher cipher = this.q();
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(this.c);
        try {
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)ivParameterSpec);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new RuntimeException((Throwable)var1_4);
        }
        catch (InvalidKeyException invalidKeyException) {
            // empty catch block
        }
        object = new i(this.a, (k)object);
        this.d = new CipherInputStream((InputStream)object, cipher);
        object.b();
        return -1L;
        throw new RuntimeException((Throwable)var1_4);
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new RuntimeException((Throwable)var1_7);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_7);
    }

    @Override
    public final Map g() {
        return this.a.g();
    }

    @Override
    public final Uri k() {
        return this.a.k();
    }

    public Cipher q() {
        return Cipher.getInstance((String)"AES/CBC/PKCS7Padding");
    }

    @Override
    public final int read(byte[] arrby, int n8, int n9) {
        g0.a.e((Object)this.d);
        n8 = n9 = this.d.read(arrby, n8, n9);
        if (n9 < 0) {
            n8 = -1;
        }
        return n8;
    }
}

