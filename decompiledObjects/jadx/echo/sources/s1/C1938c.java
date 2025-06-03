package s1;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19203a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyGenParameterSpec f19204b;

    /* renamed from: s1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f19205a;

        /* renamed from: b, reason: collision with root package name */
        public KeyGenParameterSpec f19206b;

        /* renamed from: c, reason: collision with root package name */
        public b f19207c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19208d;

        /* renamed from: e, reason: collision with root package name */
        public int f19209e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19210f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f19211g;

        /* renamed from: s1.c$a$a, reason: collision with other inner class name */
        public static class C0264a {

            /* renamed from: s1.c$a$a$a, reason: collision with other inner class name */
            public static class C0265a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: s1.c$a$a$b */
            public static class b {
                public static void a(KeyGenParameterSpec.Builder builder, int i7, int i8) {
                    builder.setUserAuthenticationParameters(i7, i8);
                }
            }

            public static C1938c a(a aVar) {
                b bVar = aVar.f19207c;
                if (bVar == null && aVar.f19206b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f19205a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f19208d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f19209e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f19209e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f19210f && aVar.f19211g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0265a.a(keySize);
                    }
                    aVar.f19206b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f19206b;
                if (keyGenParameterSpec != null) {
                    return new C1938c(e.c(keyGenParameterSpec), aVar.f19206b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            public static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public C1938c a() {
            return C0264a.a(this);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f19207c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f19205a.equals(C0264a.b(keyGenParameterSpec))) {
                this.f19206b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f19205a + " vs " + C0264a.b(keyGenParameterSpec));
        }

        public a(Context context, String str) {
            this.f19211g = context.getApplicationContext();
            this.f19205a = str;
        }
    }

    /* renamed from: s1.c$b */
    public enum b {
        AES256_GCM
    }

    public C1938c(String str, Object obj) {
        this.f19203a = str;
        this.f19204b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f19203a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f19203a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f19203a + ", isKeyStoreBacked=" + b() + "}";
    }
}
