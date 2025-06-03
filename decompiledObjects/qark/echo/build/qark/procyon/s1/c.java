// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s1;

import android.os.Build$VERSION;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.content.Context;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.KeyStoreException;
import java.security.KeyStore;
import android.security.keystore.KeyGenParameterSpec;

public final class c
{
    public final String a;
    public final KeyGenParameterSpec b;
    
    public c(final String a, final Object o) {
        this.a = a;
        this.b = (KeyGenParameterSpec)o;
    }
    
    public String a() {
        return this.a;
    }
    
    public boolean b() {
        try {
            final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            return instance.containsAlias(this.a);
        }
        catch (KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException ex) {
            return false;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MasterKey{keyAlias=");
        sb.append(this.a);
        sb.append(", isKeyStoreBacked=");
        sb.append(this.b());
        sb.append("}");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public KeyGenParameterSpec b;
        public c.b c;
        public boolean d;
        public int e;
        public boolean f;
        public final Context g;
        
        public a(final Context context) {
            this(context, "_androidx_security_master_key_");
        }
        
        public a(final Context context, final String a) {
            this.g = context.getApplicationContext();
            this.a = a;
        }
        
        public c a() {
            return s1.c.a.a.a(this);
        }
        
        public c.a b(final KeyGenParameterSpec b) {
            if (this.c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.a.equals(s1.c.a.a.b(b))) {
                this.b = b;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("KeyGenParamSpec's key alias does not match provided alias (");
            sb.append(this.a);
            sb.append(" vs ");
            sb.append(s1.c.a.a.b(b));
            throw new IllegalArgumentException(sb.toString());
        }
        
        public abstract static class a
        {
            public static c a(final c.a a) {
                final c.b c = a.c;
                if (c == null && a.b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (c == s1.c.b.o) {
                    final KeyGenParameterSpec$Builder setKeySize = new KeyGenParameterSpec$Builder(a.a, 3).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).setKeySize(256);
                    if (a.d) {
                        setKeySize.setUserAuthenticationRequired(true);
                        if (Build$VERSION.SDK_INT >= 30) {
                            b.a(setKeySize, a.e, 3);
                        }
                        else {
                            setKeySize.setUserAuthenticationValidityDurationSeconds(a.e);
                        }
                    }
                    if (Build$VERSION.SDK_INT >= 28 && a.f && a.g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        s1.c.a.a.a.a(setKeySize);
                    }
                    a.b = setKeySize.build();
                }
                final KeyGenParameterSpec b = a.b;
                if (b != null) {
                    return new c(e.c(b), a.b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
            
            public static String b(final KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
            
            public abstract static class a
            {
                public static void a(final KeyGenParameterSpec$Builder keyGenParameterSpec$Builder) {
                    s1.b.a(keyGenParameterSpec$Builder, true);
                }
            }
            
            public abstract static class b
            {
                public static void a(final KeyGenParameterSpec$Builder keyGenParameterSpec$Builder, final int n, final int n2) {
                    d.a(keyGenParameterSpec$Builder, n, n2);
                }
            }
        }
    }
    
    public enum b
    {
        o("AES256_GCM", 0);
        
        static {
            p = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o };
        }
    }
}
