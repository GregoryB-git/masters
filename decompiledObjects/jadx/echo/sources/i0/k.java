package i0;

import android.net.Uri;
import d0.AbstractC1199v;
import g0.AbstractC1297a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14652a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14654c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14655d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f14656e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14657f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14658g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14659h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14660i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14661j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f14662k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f14663a;

        /* renamed from: b, reason: collision with root package name */
        public long f14664b;

        /* renamed from: c, reason: collision with root package name */
        public int f14665c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f14666d;

        /* renamed from: e, reason: collision with root package name */
        public Map f14667e;

        /* renamed from: f, reason: collision with root package name */
        public long f14668f;

        /* renamed from: g, reason: collision with root package name */
        public long f14669g;

        /* renamed from: h, reason: collision with root package name */
        public String f14670h;

        /* renamed from: i, reason: collision with root package name */
        public int f14671i;

        /* renamed from: j, reason: collision with root package name */
        public Object f14672j;

        public b() {
            this.f14665c = 1;
            this.f14667e = Collections.emptyMap();
            this.f14669g = -1L;
        }

        public k a() {
            AbstractC1297a.i(this.f14663a, "The uri must be set.");
            return new k(this.f14663a, this.f14664b, this.f14665c, this.f14666d, this.f14667e, this.f14668f, this.f14669g, this.f14670h, this.f14671i, this.f14672j);
        }

        public b b(int i7) {
            this.f14671i = i7;
            return this;
        }

        public b c(byte[] bArr) {
            this.f14666d = bArr;
            return this;
        }

        public b d(int i7) {
            this.f14665c = i7;
            return this;
        }

        public b e(Map map) {
            this.f14667e = map;
            return this;
        }

        public b f(String str) {
            this.f14670h = str;
            return this;
        }

        public b g(long j7) {
            this.f14669g = j7;
            return this;
        }

        public b h(long j7) {
            this.f14668f = j7;
            return this;
        }

        public b i(Uri uri) {
            this.f14663a = uri;
            return this;
        }

        public b j(String str) {
            this.f14663a = Uri.parse(str);
            return this;
        }

        public b(k kVar) {
            this.f14663a = kVar.f14652a;
            this.f14664b = kVar.f14653b;
            this.f14665c = kVar.f14654c;
            this.f14666d = kVar.f14655d;
            this.f14667e = kVar.f14656e;
            this.f14668f = kVar.f14658g;
            this.f14669g = kVar.f14659h;
            this.f14670h = kVar.f14660i;
            this.f14671i = kVar.f14661j;
            this.f14672j = kVar.f14662k;
        }
    }

    static {
        AbstractC1199v.a("media3.datasource");
    }

    public k(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj) {
        byte[] bArr2 = bArr;
        long j10 = j7 + j8;
        boolean z7 = true;
        AbstractC1297a.a(j10 >= 0);
        AbstractC1297a.a(j8 >= 0);
        if (j9 <= 0 && j9 != -1) {
            z7 = false;
        }
        AbstractC1297a.a(z7);
        this.f14652a = (Uri) AbstractC1297a.e(uri);
        this.f14653b = j7;
        this.f14654c = i7;
        this.f14655d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14656e = Collections.unmodifiableMap(new HashMap(map));
        this.f14658g = j8;
        this.f14657f = j10;
        this.f14659h = j9;
        this.f14660i = str;
        this.f14661j = i8;
        this.f14662k = obj;
    }

    public static String c(int i7) {
        if (i7 == 1) {
            return "GET";
        }
        if (i7 == 2) {
            return "POST";
        }
        if (i7 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f14654c);
    }

    public boolean d(int i7) {
        return (this.f14661j & i7) == i7;
    }

    public k e(long j7) {
        long j8 = this.f14659h;
        return f(j7, j8 != -1 ? j8 - j7 : -1L);
    }

    public k f(long j7, long j8) {
        return (j7 == 0 && this.f14659h == j8) ? this : new k(this.f14652a, this.f14653b, this.f14654c, this.f14655d, this.f14656e, this.f14658g + j7, j8, this.f14660i, this.f14661j, this.f14662k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f14652a + ", " + this.f14658g + ", " + this.f14659h + ", " + this.f14660i + ", " + this.f14661j + "]";
    }
}
