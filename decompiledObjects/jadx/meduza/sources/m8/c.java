package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class c extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10539a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10541c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10542d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10543e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10544g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10545h;

    /* renamed from: i, reason: collision with root package name */
    public final List<f0.a.AbstractC0150a> f10546i;

    public static final class a extends f0.a.b {

        /* renamed from: a, reason: collision with root package name */
        public int f10547a;

        /* renamed from: b, reason: collision with root package name */
        public String f10548b;

        /* renamed from: c, reason: collision with root package name */
        public int f10549c;

        /* renamed from: d, reason: collision with root package name */
        public int f10550d;

        /* renamed from: e, reason: collision with root package name */
        public long f10551e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public long f10552g;

        /* renamed from: h, reason: collision with root package name */
        public String f10553h;

        /* renamed from: i, reason: collision with root package name */
        public List<f0.a.AbstractC0150a> f10554i;

        /* renamed from: j, reason: collision with root package name */
        public byte f10555j;

        public final c a() {
            String str;
            if (this.f10555j == 63 && (str = this.f10548b) != null) {
                return new c(this.f10547a, str, this.f10549c, this.f10550d, this.f10551e, this.f, this.f10552g, this.f10553h, this.f10554i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f10555j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f10548b == null) {
                sb2.append(" processName");
            }
            if ((this.f10555j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f10555j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f10555j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f10555j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f10555j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public c() {
        throw null;
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f10539a = i10;
        this.f10540b = str;
        this.f10541c = i11;
        this.f10542d = i12;
        this.f10543e = j10;
        this.f = j11;
        this.f10544g = j12;
        this.f10545h = str2;
        this.f10546i = list;
    }

    @Override // m8.f0.a
    public final List<f0.a.AbstractC0150a> a() {
        return this.f10546i;
    }

    @Override // m8.f0.a
    public final int b() {
        return this.f10542d;
    }

    @Override // m8.f0.a
    public final int c() {
        return this.f10539a;
    }

    @Override // m8.f0.a
    public final String d() {
        return this.f10540b;
    }

    @Override // m8.f0.a
    public final long e() {
        return this.f10543e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f10539a == aVar.c() && this.f10540b.equals(aVar.d()) && this.f10541c == aVar.f() && this.f10542d == aVar.b() && this.f10543e == aVar.e() && this.f == aVar.g() && this.f10544g == aVar.h() && ((str = this.f10545h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            List<f0.a.AbstractC0150a> list = this.f10546i;
            List<f0.a.AbstractC0150a> a10 = aVar.a();
            if (list == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (list.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.f0.a
    public final int f() {
        return this.f10541c;
    }

    @Override // m8.f0.a
    public final long g() {
        return this.f;
    }

    @Override // m8.f0.a
    public final long h() {
        return this.f10544g;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f10539a ^ 1000003) * 1000003) ^ this.f10540b.hashCode()) * 1000003) ^ this.f10541c) * 1000003) ^ this.f10542d) * 1000003;
        long j10 = this.f10543e;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f10544g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f10545h;
        int hashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC0150a> list = this.f10546i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // m8.f0.a
    public final String i() {
        return this.f10545h;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ApplicationExitInfo{pid=");
        l10.append(this.f10539a);
        l10.append(", processName=");
        l10.append(this.f10540b);
        l10.append(", reasonCode=");
        l10.append(this.f10541c);
        l10.append(", importance=");
        l10.append(this.f10542d);
        l10.append(", pss=");
        l10.append(this.f10543e);
        l10.append(", rss=");
        l10.append(this.f);
        l10.append(", timestamp=");
        l10.append(this.f10544g);
        l10.append(", traceFile=");
        l10.append(this.f10545h);
        l10.append(", buildIdMappingForArch=");
        l10.append(this.f10546i);
        l10.append("}");
        return l10.toString();
    }
}
