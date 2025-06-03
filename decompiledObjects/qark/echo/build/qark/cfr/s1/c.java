/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.KeyStore
 *  java.security.KeyStore$LoadStoreParameter
 *  java.security.KeyStoreException
 *  java.security.NoSuchAlgorithmException
 *  java.security.cert.CertificateException
 */
package s1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import s1.d;
import s1.e;

public final class c {
    public final String a;
    public final KeyGenParameterSpec b;

    public c(String string2, Object object) {
        this.a = string2;
        this.b = (KeyGenParameterSpec)object;
    }

    public String a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.a);
        }
        catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException iOException) {
            return false;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MasterKey{keyAlias=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isKeyStoreBacked=");
        stringBuilder.append(this.b());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class s1.c$a {
        public final String a;
        public KeyGenParameterSpec b;
        public b c;
        public boolean d;
        public int e;
        public boolean f;
        public final Context g;

        public s1.c$a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public s1.c$a(Context context, String string2) {
            this.g = context.getApplicationContext();
            this.a = string2;
        }

        public c a() {
            return a.a(this);
        }

        public s1.c$a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.c == null) {
                if (this.a.equals((Object)a.b(keyGenParameterSpec))) {
                    this.b = keyGenParameterSpec;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("KeyGenParamSpec's key alias does not match provided alias (");
                stringBuilder.append(this.a);
                stringBuilder.append(" vs ");
                stringBuilder.append(a.b(keyGenParameterSpec));
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
        }

        public static abstract class s1.c$a$a {
            public static c a(s1.c$a a8) {
                s1.c$b b8 = a8.c;
                if (b8 == null && a8.b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (b8 == s1.c$b.o) {
                    b8 = new KeyGenParameterSpec.Builder(a8.a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                    if (a8.d) {
                        b8.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a((KeyGenParameterSpec.Builder)b8, a8.e, 3);
                        } else {
                            b8.setUserAuthenticationValidityDurationSeconds(a8.e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && a8.f && a8.g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        a.a((KeyGenParameterSpec.Builder)b8);
                    }
                    a8.b = b8.build();
                }
                if ((b8 = a8.b) != null) {
                    return new c(e.c((KeyGenParameterSpec)b8), (Object)a8.b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            public static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }

            public static abstract class a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    s1.b.a(builder, true);
                }
            }

            public static abstract class b {
                public static void a(KeyGenParameterSpec.Builder builder, int n8, int n9) {
                    d.a(builder, n8, n9);
                }
            }

        }

    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* synthetic */ b[] p;

        static {
            p = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])p.clone();
        }
    }

}

