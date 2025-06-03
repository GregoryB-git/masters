/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.KeyStore
 *  java.security.KeyStore$LoadStoreParameter
 *  java.security.KeyStoreException
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Arrays
 *  java.util.Locale
 *  javax.crypto.KeyGenerator
 *  javax.crypto.SecretKey
 */
package j3;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import j3.b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import q3.p;
import q3.r;

public final class c
implements c3.r {
    public static final Object c = new Object();
    public static final String d = "c";
    public final String a;
    public KeyStore b;

    public c() {
        this(new a());
    }

    public c(a a8) {
        this.a = a8.a;
        this.b = a8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(String string2) {
        c c8 = new c();
        Object object = c;
        synchronized (object) {
            try {
                if (!c8.f(string2)) {
                    c.e(string2);
                    return true;
                }
                return false;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void e(String string2) {
        string2 = r.b("android-keystore://", string2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance((String)"AES", (String)"AndroidKeyStore");
        keyGenerator.init((AlgorithmParameterSpec)new KeyGenParameterSpec.Builder(string2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        keyGenerator.generateKey();
    }

    public static boolean g() {
        return true;
    }

    public static void h() {
        long l8 = (int)(Math.random() * 40.0);
        try {
            Thread.sleep((long)l8);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    public static c3.a i(c3.a a8) {
        byte[] arrby;
        byte[] arrby2 = p.c(10);
        if (Arrays.equals((byte[])arrby2, (byte[])a8.b(a8.a(arrby2, arrby = new byte[0]), arrby))) {
            return a8;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public c3.a a(String object) {
        synchronized (this) {
            try {
                String string2 = this.a;
                if (string2 == null) return c.i(new b(r.b("android-keystore://", (String)object), this.b));
                if (string2.equals(object)) return c.i(new b(r.b("android-keystore://", (String)object), this.b));
                throw new GeneralSecurityException(String.format((String)"this client is bound to %s, cannot load keys bound to %s", (Object[])new Object[]{this.a, object}));
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean b(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                boolean bl;
                block5 : {
                    boolean bl2;
                    block4 : {
                        try {
                            String string3 = this.a;
                            bl = true;
                            if (string3 == null || !(bl2 = string3.equals((Object)string2))) break block4;
                        }
                        catch (Throwable throwable2) {}
                        return true;
                    }
                    if (this.a != null) return false;
                    bl2 = string2.toLowerCase(Locale.US).startsWith("android-keystore://");
                    if (!bl2) return false;
                    break block5;
                    break block6;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean f(String string2) {
        // MONITORENTER : this
        string2 = r.b("android-keystore://", string2);
        boolean bl = this.b.containsAlias(string2);
        // MONITOREXIT : this
        return bl;
        catch (NullPointerException nullPointerException) {}
        Log.w((String)d, (String)"Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
        try {
            KeyStore keyStore;
            c.h();
            this.b = keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
            keyStore.load(null);
        }
        catch (IOException iOException) {
            throw new GeneralSecurityException((Throwable)iOException);
        }
        boolean bl2 = this.b.containsAlias(string2);
        // MONITOREXIT : this
        return bl2;
    }

    public static final class a {
        public String a = null;
        public KeyStore b = null;

        public a() {
            if (c.g()) {
                void var1_4;
                try {
                    KeyStore keyStore;
                    this.b = keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
                    keyStore.load(null);
                    return;
                }
                catch (IOException iOException) {
                }
                catch (GeneralSecurityException generalSecurityException) {
                    // empty catch block
                }
                throw new IllegalStateException((Throwable)var1_4);
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }

}

