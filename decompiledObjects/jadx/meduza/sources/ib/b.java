package ib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7899e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7900a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f7901b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f7902c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7903d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7904a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f7905b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f7906c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7907d;

        public a(b bVar) {
            this.f7904a = bVar.f7900a;
            this.f7905b = bVar.f7901b;
            this.f7906c = bVar.f7902c;
            this.f7907d = bVar.f7903d;
        }

        public a(boolean z10) {
            this.f7904a = z10;
        }

        public final void a(ib.a... aVarArr) {
            if (!this.f7904a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                strArr[i10] = aVarArr[i10].f7898a;
            }
            this.f7905b = strArr;
        }

        public final void b(k... kVarArr) {
            if (!this.f7904a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                strArr[i10] = kVarArr[i10].f7944a;
            }
            this.f7906c = strArr;
        }
    }

    static {
        ib.a[] aVarArr = {ib.a.TLS_AES_128_GCM_SHA256, ib.a.TLS_AES_256_GCM_SHA384, ib.a.TLS_CHACHA20_POLY1305_SHA256, ib.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ib.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ib.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ib.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ib.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ib.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, ib.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, ib.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, ib.a.TLS_RSA_WITH_AES_128_GCM_SHA256, ib.a.TLS_RSA_WITH_AES_256_GCM_SHA384, ib.a.TLS_RSA_WITH_AES_128_CBC_SHA, ib.a.TLS_RSA_WITH_AES_256_CBC_SHA, ib.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        a aVar = new a(true);
        aVar.a(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        aVar.b(kVar, kVar2);
        if (!aVar.f7904a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        aVar.f7907d = true;
        b bVar = new b(aVar);
        f7899e = bVar;
        a aVar2 = new a(bVar);
        aVar2.b(kVar, kVar2, k.TLS_1_1, k.TLS_1_0);
        if (!aVar2.f7904a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        aVar2.f7907d = true;
        new b(aVar2);
        new b(new a(false));
    }

    public b(a aVar) {
        this.f7900a = aVar.f7904a;
        this.f7901b = aVar.f7905b;
        this.f7902c = aVar.f7906c;
        this.f7903d = aVar.f7907d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = this.f7900a;
        if (z10 != bVar.f7900a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f7901b, bVar.f7901b) && Arrays.equals(this.f7902c, bVar.f7902c) && this.f7903d == bVar.f7903d);
    }

    public final int hashCode() {
        if (this.f7900a) {
            return ((((527 + Arrays.hashCode(this.f7901b)) * 31) + Arrays.hashCode(this.f7902c)) * 31) + (!this.f7903d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        k kVar;
        if (!this.f7900a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f7901b;
        int i10 = 0;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            ib.a[] aVarArr = new ib.a[strArr.length];
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f7901b;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str.startsWith("SSL_")) {
                    StringBuilder l10 = defpackage.f.l("TLS_");
                    l10.append(str.substring(4));
                    str = l10.toString();
                }
                aVarArr[i11] = ib.a.valueOf(str);
                i11++;
            }
            String[] strArr3 = l.f7945a;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder m10 = defpackage.f.m("ConnectionSpec(cipherSuites=", unmodifiableList == null ? "[use default]" : unmodifiableList.toString(), ", tlsVersions=");
        k[] kVarArr = new k[this.f7902c.length];
        while (true) {
            String[] strArr4 = this.f7902c;
            if (i10 >= strArr4.length) {
                String[] strArr5 = l.f7945a;
                m10.append(Collections.unmodifiableList(Arrays.asList((Object[]) kVarArr.clone())));
                m10.append(", supportsTlsExtensions=");
                m10.append(this.f7903d);
                m10.append(")");
                return m10.toString();
            }
            String str2 = strArr4[i10];
            if ("TLSv1.3".equals(str2)) {
                kVar = k.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                kVar = k.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                kVar = k.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                kVar = k.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(defpackage.g.d("Unexpected TLS version: ", str2));
                }
                kVar = k.SSL_3_0;
            }
            kVarArr[i10] = kVar;
            i10++;
        }
    }
}
