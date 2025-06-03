package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class h extends f0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10584c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10585d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10586e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.e.a f10587g;

    /* renamed from: h, reason: collision with root package name */
    public final f0.e.f f10588h;

    /* renamed from: i, reason: collision with root package name */
    public final f0.e.AbstractC0161e f10589i;

    /* renamed from: j, reason: collision with root package name */
    public final f0.e.c f10590j;

    /* renamed from: k, reason: collision with root package name */
    public final List<f0.e.d> f10591k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10592l;

    public static final class a extends f0.e.b {

        /* renamed from: a, reason: collision with root package name */
        public String f10593a;

        /* renamed from: b, reason: collision with root package name */
        public String f10594b;

        /* renamed from: c, reason: collision with root package name */
        public String f10595c;

        /* renamed from: d, reason: collision with root package name */
        public long f10596d;

        /* renamed from: e, reason: collision with root package name */
        public Long f10597e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public f0.e.a f10598g;

        /* renamed from: h, reason: collision with root package name */
        public f0.e.f f10599h;

        /* renamed from: i, reason: collision with root package name */
        public f0.e.AbstractC0161e f10600i;

        /* renamed from: j, reason: collision with root package name */
        public f0.e.c f10601j;

        /* renamed from: k, reason: collision with root package name */
        public List<f0.e.d> f10602k;

        /* renamed from: l, reason: collision with root package name */
        public int f10603l;

        /* renamed from: m, reason: collision with root package name */
        public byte f10604m;

        public a() {
        }

        public a(f0.e eVar) {
            this.f10593a = eVar.f();
            this.f10594b = eVar.h();
            this.f10595c = eVar.b();
            this.f10596d = eVar.j();
            this.f10597e = eVar.d();
            this.f = eVar.l();
            this.f10598g = eVar.a();
            this.f10599h = eVar.k();
            this.f10600i = eVar.i();
            this.f10601j = eVar.c();
            this.f10602k = eVar.e();
            this.f10603l = eVar.g();
            this.f10604m = (byte) 7;
        }

        public final h a() {
            String str;
            String str2;
            f0.e.a aVar;
            if (this.f10604m == 7 && (str = this.f10593a) != null && (str2 = this.f10594b) != null && (aVar = this.f10598g) != null) {
                return new h(str, str2, this.f10595c, this.f10596d, this.f10597e, this.f, aVar, this.f10599h, this.f10600i, this.f10601j, this.f10602k, this.f10603l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f10593a == null) {
                sb2.append(" generator");
            }
            if (this.f10594b == null) {
                sb2.append(" identifier");
            }
            if ((this.f10604m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f10604m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f10598g == null) {
                sb2.append(" app");
            }
            if ((this.f10604m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, String str3, long j10, Long l10, boolean z10, f0.e.a aVar, f0.e.f fVar, f0.e.AbstractC0161e abstractC0161e, f0.e.c cVar, List list, int i10) {
        this.f10582a = str;
        this.f10583b = str2;
        this.f10584c = str3;
        this.f10585d = j10;
        this.f10586e = l10;
        this.f = z10;
        this.f10587g = aVar;
        this.f10588h = fVar;
        this.f10589i = abstractC0161e;
        this.f10590j = cVar;
        this.f10591k = list;
        this.f10592l = i10;
    }

    @Override // m8.f0.e
    public final f0.e.a a() {
        return this.f10587g;
    }

    @Override // m8.f0.e
    public final String b() {
        return this.f10584c;
    }

    @Override // m8.f0.e
    public final f0.e.c c() {
        return this.f10590j;
    }

    @Override // m8.f0.e
    public final Long d() {
        return this.f10586e;
    }

    @Override // m8.f0.e
    public final List<f0.e.d> e() {
        return this.f10591k;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        f0.e.f fVar;
        f0.e.AbstractC0161e abstractC0161e;
        f0.e.c cVar;
        List<f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e)) {
            return false;
        }
        f0.e eVar = (f0.e) obj;
        return this.f10582a.equals(eVar.f()) && this.f10583b.equals(eVar.h()) && ((str = this.f10584c) != null ? str.equals(eVar.b()) : eVar.b() == null) && this.f10585d == eVar.j() && ((l10 = this.f10586e) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f == eVar.l() && this.f10587g.equals(eVar.a()) && ((fVar = this.f10588h) != null ? fVar.equals(eVar.k()) : eVar.k() == null) && ((abstractC0161e = this.f10589i) != null ? abstractC0161e.equals(eVar.i()) : eVar.i() == null) && ((cVar = this.f10590j) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((list = this.f10591k) != null ? list.equals(eVar.e()) : eVar.e() == null) && this.f10592l == eVar.g();
    }

    @Override // m8.f0.e
    public final String f() {
        return this.f10582a;
    }

    @Override // m8.f0.e
    public final int g() {
        return this.f10592l;
    }

    @Override // m8.f0.e
    public final String h() {
        return this.f10583b;
    }

    public final int hashCode() {
        int hashCode = (((this.f10582a.hashCode() ^ 1000003) * 1000003) ^ this.f10583b.hashCode()) * 1000003;
        String str = this.f10584c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f10585d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f10586e;
        int hashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f10587g.hashCode()) * 1000003;
        f0.e.f fVar = this.f10588h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.AbstractC0161e abstractC0161e = this.f10589i;
        int hashCode5 = (hashCode4 ^ (abstractC0161e == null ? 0 : abstractC0161e.hashCode())) * 1000003;
        f0.e.c cVar = this.f10590j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f10591k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f10592l;
    }

    @Override // m8.f0.e
    public final f0.e.AbstractC0161e i() {
        return this.f10589i;
    }

    @Override // m8.f0.e
    public final long j() {
        return this.f10585d;
    }

    @Override // m8.f0.e
    public final f0.e.f k() {
        return this.f10588h;
    }

    @Override // m8.f0.e
    public final boolean l() {
        return this.f;
    }

    @Override // m8.f0.e
    public final a m() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Session{generator=");
        l10.append(this.f10582a);
        l10.append(", identifier=");
        l10.append(this.f10583b);
        l10.append(", appQualitySessionId=");
        l10.append(this.f10584c);
        l10.append(", startedAt=");
        l10.append(this.f10585d);
        l10.append(", endedAt=");
        l10.append(this.f10586e);
        l10.append(", crashed=");
        l10.append(this.f);
        l10.append(", app=");
        l10.append(this.f10587g);
        l10.append(", user=");
        l10.append(this.f10588h);
        l10.append(", os=");
        l10.append(this.f10589i);
        l10.append(", device=");
        l10.append(this.f10590j);
        l10.append(", events=");
        l10.append(this.f10591k);
        l10.append(", generatorType=");
        return a0.j.m(l10, this.f10592l, "}");
    }
}
