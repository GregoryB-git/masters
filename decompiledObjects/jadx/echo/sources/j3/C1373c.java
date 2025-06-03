package j3;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import c3.InterfaceC0823a;
import c3.InterfaceC0840r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import q3.AbstractC1900p;
import q3.AbstractC1902r;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373c implements InterfaceC0840r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15448c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final String f15449d = "c";

    /* renamed from: a, reason: collision with root package name */
    public final String f15450a;

    /* renamed from: b, reason: collision with root package name */
    public KeyStore f15451b;

    /* renamed from: j3.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f15452a = null;

        /* renamed from: b, reason: collision with root package name */
        public KeyStore f15453b;

        public a() {
            this.f15453b = null;
            if (!C1373c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f15453b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1373c() {
        this(new a());
    }

    public static boolean d(String str) {
        C1373c c1373c = new C1373c();
        synchronized (f15448c) {
            try {
                if (c1373c.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str) {
        String b7 = AbstractC1902r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b7, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static boolean g() {
        return true;
    }

    public static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    public static InterfaceC0823a i(InterfaceC0823a interfaceC0823a) {
        byte[] c7 = AbstractC1900p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c7, interfaceC0823a.b(interfaceC0823a.a(c7, bArr), bArr))) {
            return interfaceC0823a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // c3.InterfaceC0840r
    public synchronized InterfaceC0823a a(String str) {
        try {
            String str2 = this.f15450a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f15450a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(new C1372b(AbstractC1902r.b("android-keystore://", str), this.f15451b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L17;
     */
    @Override // c3.InterfaceC0840r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f15450a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.f15450a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1373c.b(java.lang.String):boolean");
    }

    public synchronized boolean f(String str) {
        String b7;
        b7 = AbstractC1902r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f15449d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f15451b = keyStore;
                keyStore.load(null);
                return this.f15451b.containsAlias(b7);
            } catch (IOException e7) {
                throw new GeneralSecurityException(e7);
            }
        }
        return this.f15451b.containsAlias(b7);
    }

    public C1373c(a aVar) {
        this.f15450a = aVar.f15452a;
        this.f15451b = aVar.f15453b;
    }
}
