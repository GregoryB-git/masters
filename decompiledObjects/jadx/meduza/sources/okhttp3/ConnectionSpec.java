package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionSpec f12207e;
    public static final ConnectionSpec f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12209b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f12210c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f12211d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12212a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f12213b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f12214c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12215d;

        public Builder(ConnectionSpec connectionSpec) {
            this.f12212a = connectionSpec.f12208a;
            this.f12213b = connectionSpec.f12210c;
            this.f12214c = connectionSpec.f12211d;
            this.f12215d = connectionSpec.f12209b;
        }

        public Builder(boolean z10) {
            this.f12212a = z10;
        }

        public final void a(String... strArr) {
            if (!this.f12212a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f12213b = (String[]) strArr.clone();
        }

        public final void b(CipherSuite... cipherSuiteArr) {
            if (!this.f12212a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i10 = 0; i10 < cipherSuiteArr.length; i10++) {
                strArr[i10] = cipherSuiteArr[i10].f12199a;
            }
            a(strArr);
        }

        public final void c(String... strArr) {
            if (!this.f12212a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f12214c = (String[]) strArr.clone();
        }

        public final void d(TlsVersion... tlsVersionArr) {
            if (!this.f12212a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i10 = 0; i10 < tlsVersionArr.length; i10++) {
                strArr[i10] = tlsVersionArr[i10].f12369a;
            }
            c(strArr);
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f12195q;
        CipherSuite cipherSuite2 = CipherSuite.f12196r;
        CipherSuite cipherSuite3 = CipherSuite.f12197s;
        CipherSuite cipherSuite4 = CipherSuite.t;
        CipherSuite cipherSuite5 = CipherSuite.f12198u;
        CipherSuite cipherSuite6 = CipherSuite.f12189k;
        CipherSuite cipherSuite7 = CipherSuite.f12191m;
        CipherSuite cipherSuite8 = CipherSuite.f12190l;
        CipherSuite cipherSuite9 = CipherSuite.f12192n;
        CipherSuite cipherSuite10 = CipherSuite.f12194p;
        CipherSuite cipherSuite11 = CipherSuite.f12193o;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11, CipherSuite.f12187i, CipherSuite.f12188j, CipherSuite.f12185g, CipherSuite.f12186h, CipherSuite.f12184e, CipherSuite.f, CipherSuite.f12183d};
        Builder builder = new Builder(true);
        builder.b(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.d(tlsVersion, tlsVersion2);
        if (!builder.f12212a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder.f12215d = true;
        new ConnectionSpec(builder);
        Builder builder2 = new Builder(true);
        builder2.b(cipherSuiteArr2);
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
        builder2.d(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3);
        if (!builder2.f12212a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder2.f12215d = true;
        f12207e = new ConnectionSpec(builder2);
        Builder builder3 = new Builder(true);
        builder3.b(cipherSuiteArr2);
        builder3.d(tlsVersion3);
        if (!builder3.f12212a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder3.f12215d = true;
        new ConnectionSpec(builder3);
        f = new ConnectionSpec(new Builder(false));
    }

    public ConnectionSpec(Builder builder) {
        this.f12208a = builder.f12212a;
        this.f12210c = builder.f12213b;
        this.f12211d = builder.f12214c;
        this.f12209b = builder.f12215d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f12208a) {
            return false;
        }
        String[] strArr = this.f12211d;
        if (strArr != null && !Util.r(Util.f12385o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f12210c;
        return strArr2 == null || Util.r(CipherSuite.f12181b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z10 = this.f12208a;
        if (z10 != connectionSpec.f12208a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f12210c, connectionSpec.f12210c) && Arrays.equals(this.f12211d, connectionSpec.f12211d) && this.f12209b == connectionSpec.f12209b);
    }

    public final int hashCode() {
        if (this.f12208a) {
            return ((((527 + Arrays.hashCode(this.f12210c)) * 31) + Arrays.hashCode(this.f12211d)) * 31) + (!this.f12209b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        List list;
        if (!this.f12208a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f12210c;
        List list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str3 : strArr) {
                    arrayList.add(CipherSuite.a(str3));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr2 = this.f12211d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String str4 : strArr2) {
                    arrayList2.add(TlsVersion.f(str4));
                }
                list2 = Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f12209b + ")";
    }
}
