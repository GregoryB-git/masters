package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class m extends f0.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final f0.e.d.a.b f10639a;

    /* renamed from: b, reason: collision with root package name */
    public final List<f0.c> f10640b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.c> f10641c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f10642d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e.d.a.c f10643e;
    public final List<f0.e.d.a.c> f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10644g;

    public static final class a extends f0.e.d.a.AbstractC0152a {

        /* renamed from: a, reason: collision with root package name */
        public f0.e.d.a.b f10645a;

        /* renamed from: b, reason: collision with root package name */
        public List<f0.c> f10646b;

        /* renamed from: c, reason: collision with root package name */
        public List<f0.c> f10647c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f10648d;

        /* renamed from: e, reason: collision with root package name */
        public f0.e.d.a.c f10649e;
        public List<f0.e.d.a.c> f;

        /* renamed from: g, reason: collision with root package name */
        public int f10650g;

        /* renamed from: h, reason: collision with root package name */
        public byte f10651h = 1;

        public a(f0.e.d.a aVar) {
            this.f10645a = aVar.e();
            this.f10646b = aVar.d();
            this.f10647c = aVar.f();
            this.f10648d = aVar.b();
            this.f10649e = aVar.c();
            this.f = aVar.a();
            this.f10650g = aVar.g();
        }

        public final m a() {
            f0.e.d.a.b bVar;
            if (this.f10651h == 1 && (bVar = this.f10645a) != null) {
                return new m(bVar, this.f10646b, this.f10647c, this.f10648d, this.f10649e, this.f, this.f10650g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f10645a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f10651h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public m() {
        throw null;
    }

    public m(f0.e.d.a.b bVar, List list, List list2, Boolean bool, f0.e.d.a.c cVar, List list3, int i10) {
        this.f10639a = bVar;
        this.f10640b = list;
        this.f10641c = list2;
        this.f10642d = bool;
        this.f10643e = cVar;
        this.f = list3;
        this.f10644g = i10;
    }

    @Override // m8.f0.e.d.a
    public final List<f0.e.d.a.c> a() {
        return this.f;
    }

    @Override // m8.f0.e.d.a
    public final Boolean b() {
        return this.f10642d;
    }

    @Override // m8.f0.e.d.a
    public final f0.e.d.a.c c() {
        return this.f10643e;
    }

    @Override // m8.f0.e.d.a
    public final List<f0.c> d() {
        return this.f10640b;
    }

    @Override // m8.f0.e.d.a
    public final f0.e.d.a.b e() {
        return this.f10639a;
    }

    public final boolean equals(Object obj) {
        List<f0.c> list;
        List<f0.c> list2;
        Boolean bool;
        f0.e.d.a.c cVar;
        List<f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a)) {
            return false;
        }
        f0.e.d.a aVar = (f0.e.d.a) obj;
        return this.f10639a.equals(aVar.e()) && ((list = this.f10640b) != null ? list.equals(aVar.d()) : aVar.d() == null) && ((list2 = this.f10641c) != null ? list2.equals(aVar.f()) : aVar.f() == null) && ((bool = this.f10642d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && ((cVar = this.f10643e) != null ? cVar.equals(aVar.c()) : aVar.c() == null) && ((list3 = this.f) != null ? list3.equals(aVar.a()) : aVar.a() == null) && this.f10644g == aVar.g();
    }

    @Override // m8.f0.e.d.a
    public final List<f0.c> f() {
        return this.f10641c;
    }

    @Override // m8.f0.e.d.a
    public final int g() {
        return this.f10644g;
    }

    @Override // m8.f0.e.d.a
    public final a h() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode = (this.f10639a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f10640b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f10641c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f10642d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f10643e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f10644g;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Application{execution=");
        l10.append(this.f10639a);
        l10.append(", customAttributes=");
        l10.append(this.f10640b);
        l10.append(", internalKeys=");
        l10.append(this.f10641c);
        l10.append(", background=");
        l10.append(this.f10642d);
        l10.append(", currentProcessDetails=");
        l10.append(this.f10643e);
        l10.append(", appProcessDetails=");
        l10.append(this.f);
        l10.append(", uiOrientation=");
        return a0.j.m(l10, this.f10644g, "}");
    }
}
