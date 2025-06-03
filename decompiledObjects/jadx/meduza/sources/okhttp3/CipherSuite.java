package okhttp3;

import defpackage.f;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CipherSuite {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<String> f12181b = new AnonymousClass1();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f12182c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final CipherSuite f12183d;

    /* renamed from: e, reason: collision with root package name */
    public static final CipherSuite f12184e;
    public static final CipherSuite f;

    /* renamed from: g, reason: collision with root package name */
    public static final CipherSuite f12185g;

    /* renamed from: h, reason: collision with root package name */
    public static final CipherSuite f12186h;

    /* renamed from: i, reason: collision with root package name */
    public static final CipherSuite f12187i;

    /* renamed from: j, reason: collision with root package name */
    public static final CipherSuite f12188j;

    /* renamed from: k, reason: collision with root package name */
    public static final CipherSuite f12189k;

    /* renamed from: l, reason: collision with root package name */
    public static final CipherSuite f12190l;

    /* renamed from: m, reason: collision with root package name */
    public static final CipherSuite f12191m;

    /* renamed from: n, reason: collision with root package name */
    public static final CipherSuite f12192n;

    /* renamed from: o, reason: collision with root package name */
    public static final CipherSuite f12193o;

    /* renamed from: p, reason: collision with root package name */
    public static final CipherSuite f12194p;

    /* renamed from: q, reason: collision with root package name */
    public static final CipherSuite f12195q;

    /* renamed from: r, reason: collision with root package name */
    public static final CipherSuite f12196r;

    /* renamed from: s, reason: collision with root package name */
    public static final CipherSuite f12197s;
    public static final CipherSuite t;

    /* renamed from: u, reason: collision with root package name */
    public static final CipherSuite f12198u;

    /* renamed from: a, reason: collision with root package name */
    public final String f12199a;

    /* renamed from: okhttp3.CipherSuite$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L11:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L27
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L24
                if (r4 >= r5) goto L22
                goto L35
            L22:
                r2 = r3
                goto L35
            L24:
                int r1 = r1 + 1
                goto L11
            L27:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L34
                if (r7 >= r8) goto L22
                goto L35
            L34:
                r2 = 0
            L35:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite.AnonymousClass1.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        b("SSL_RSA_WITH_NULL_MD5");
        b("SSL_RSA_WITH_NULL_SHA");
        b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b("SSL_RSA_WITH_RC4_128_MD5");
        b("SSL_RSA_WITH_RC4_128_SHA");
        b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_RSA_WITH_DES_CBC_SHA");
        f12183d = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b("SSL_DH_anon_WITH_RC4_128_MD5");
        b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DH_anon_WITH_DES_CBC_SHA");
        b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_DES_CBC_SHA");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_RC4_128_SHA");
        b("TLS_KRB5_WITH_DES_CBC_MD5");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b("TLS_KRB5_WITH_RC4_128_MD5");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f12184e = b("TLS_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f = b("TLS_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_NULL_SHA256");
        b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_PSK_WITH_RC4_128_SHA");
        b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b("TLS_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_SEED_CBC_SHA");
        f12185g = b("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f12186h = b("TLS_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b("TLS_FALLBACK_SCSV");
        b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_NULL_SHA");
        b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f12187i = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f12188j = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDH_anon_WITH_NULL_SHA");
        b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f12189k = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f12190l = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f12191m = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f12192n = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f12193o = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f12194p = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f12195q = b("TLS_AES_128_GCM_SHA256");
        f12196r = b("TLS_AES_256_GCM_SHA384");
        f12197s = b("TLS_CHACHA20_POLY1305_SHA256");
        t = b("TLS_AES_128_CCM_SHA256");
        f12198u = b("TLS_AES_256_CCM_8_SHA256");
    }

    public CipherSuite(String str) {
        str.getClass();
        this.f12199a = str;
    }

    public static synchronized CipherSuite a(String str) {
        CipherSuite cipherSuite;
        synchronized (CipherSuite.class) {
            LinkedHashMap linkedHashMap = f12182c;
            cipherSuite = (CipherSuite) linkedHashMap.get(str);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) linkedHashMap.get(c(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str);
                }
                linkedHashMap.put(str, cipherSuite);
            }
        }
        return cipherSuite;
    }

    public static CipherSuite b(String str) {
        CipherSuite cipherSuite = new CipherSuite(str);
        f12182c.put(str, cipherSuite);
        return cipherSuite;
    }

    public static String c(String str) {
        if (str.startsWith("TLS_")) {
            StringBuilder l10 = f.l("SSL_");
            l10.append(str.substring(4));
            return l10.toString();
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        StringBuilder l11 = f.l("TLS_");
        l11.append(str.substring(4));
        return l11.toString();
    }

    public final String toString() {
        return this.f12199a;
    }
}
