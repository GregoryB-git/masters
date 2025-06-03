// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j3;

import java.io.Serializable;
import java.io.IOException;
import android.util.Log;
import java.util.Locale;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import q3.p;
import c3.a;
import java.security.spec.AlgorithmParameterSpec;
import android.security.keystore.KeyGenParameterSpec$Builder;
import javax.crypto.KeyGenerator;
import java.security.KeyStore;
import c3.r;

public final class c implements r
{
    public static final Object c;
    public static final String d = "c";
    public final String a;
    public KeyStore b;
    
    static {
        c = new Object();
    }
    
    public c() {
        this(new a());
    }
    
    public c(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public static boolean d(final String s) {
        final c c = new c();
        final Object c2 = j3.c.c;
        // monitorenter(c2)
        while (true) {
            try {
                if (!c.f(s)) {
                    e(s);
                    // monitorexit(c2)
                    return true;
                }
                // monitorexit(c2)
                return false;
                // monitorexit(c2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void e(String b) {
        b = q3.r.b("android-keystore://", b);
        final KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance.init((AlgorithmParameterSpec)new KeyGenParameterSpec$Builder(b, 3).setKeySize(256).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).build());
        instance.generateKey();
    }
    
    public static boolean g() {
        return true;
    }
    
    public static void h() {
        final long n = (int)(Math.random() * 40.0);
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {}
    }
    
    public static c3.a i(final c3.a a) {
        final byte[] c = p.c(10);
        final byte[] array = new byte[0];
        if (Arrays.equals(c, a.b(a.a(c, array), array))) {
            return a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }
    
    @Override
    public c3.a a(final String anObject) {
        // monitorenter(this)
        while (true) {
            try {
                final String a = this.a;
                if (a != null && !a.equals(anObject)) {
                    throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, anObject));
                }
                // monitorexit(this)
                return i(new b(q3.r.b("android-keystore://", anObject), this.b));
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public boolean b(final String anObject) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0067: {
            boolean b;
            try {
                final String a = this.a;
                b = true;
                if (a != null && a.equals(anObject)) {
                    // monitorexit(this)
                    return true;
                }
            }
            finally {
                break Label_0067;
            }
            final String s;
            if (this.a != null || !s.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                b = false;
            }
            return b;
        }
    }
    // monitorexit(this)
    
    public boolean f(String b) {
        // monitorenter(this)
        while (true) {
            while (true) {
                try {
                    b = q3.r.b("android-keystore://", (String)b);
                    final c c = this;
                    final KeyStore keyStore = c.b;
                    final Serializable s = b;
                    final boolean b2 = keyStore.containsAlias((String)s);
                    final c c2 = this;
                    // monitorexit(c2)
                    return b2;
                }
                finally {
                    final Serializable s2;
                    b = s2;
                    break Label_0077;
                }
                try {
                    final c c = this;
                    final KeyStore keyStore = c.b;
                    final Serializable s = b;
                    final boolean b2 = keyStore.containsAlias((String)s);
                    final c c2 = this;
                    // monitorexit(c2)
                    return b2;
                    // monitorexit(this)
                    Log.w(j3.c.d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                    try {
                        h();
                        (this.b = KeyStore.getInstance("AndroidKeyStore")).load(null);
                        // monitorexit(this)
                        return this.b.containsAlias((String)b);
                    }
                    catch (IOException b) {
                        throw new GeneralSecurityException((Throwable)b);
                    }
                    continue;
                }
                catch (NullPointerException ex) {}
                break;
            }
            continue;
        }
    }
    
    public static final class a
    {
        public String a;
        public KeyStore b;
        
        public a() {
            this.a = null;
            this.b = null;
            if (g()) {
                KeyStore instance = null;
                try {
                    instance = KeyStore.getInstance("AndroidKeyStore");
                    (this.b = instance).load(null);
                    return;
                }
                catch (IOException instance) {}
                catch (GeneralSecurityException ex) {}
                throw new IllegalStateException((Throwable)instance);
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }
}
