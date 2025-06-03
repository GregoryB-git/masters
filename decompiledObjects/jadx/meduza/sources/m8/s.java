package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class s extends f0.e.d.a.b.AbstractC0155d.AbstractC0156a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10673b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10674c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10675d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10676e;

    public static final class a extends f0.e.d.a.b.AbstractC0155d.AbstractC0156a.AbstractC0157a {

        /* renamed from: a, reason: collision with root package name */
        public long f10677a;

        /* renamed from: b, reason: collision with root package name */
        public String f10678b;

        /* renamed from: c, reason: collision with root package name */
        public String f10679c;

        /* renamed from: d, reason: collision with root package name */
        public long f10680d;

        /* renamed from: e, reason: collision with root package name */
        public int f10681e;
        public byte f;

        public final s a() {
            String str;
            if (this.f == 7 && (str = this.f10678b) != null) {
                return new s(this.f10677a, str, this.f10679c, this.f10680d, this.f10681e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f10678b == null) {
                sb2.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public s(long j10, String str, String str2, long j11, int i10) {
        this.f10672a = j10;
        this.f10673b = str;
        this.f10674c = str2;
        this.f10675d = j11;
        this.f10676e = i10;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d.AbstractC0156a
    public final String a() {
        return this.f10674c;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d.AbstractC0156a
    public final int b() {
        return this.f10676e;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d.AbstractC0156a
    public final long c() {
        return this.f10675d;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d.AbstractC0156a
    public final long d() {
        return this.f10672a;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d.AbstractC0156a
    public final String e() {
        return this.f10673b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0155d.AbstractC0156a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0155d.AbstractC0156a abstractC0156a = (f0.e.d.a.b.AbstractC0155d.AbstractC0156a) obj;
        return this.f10672a == abstractC0156a.d() && this.f10673b.equals(abstractC0156a.e()) && ((str = this.f10674c) != null ? str.equals(abstractC0156a.a()) : abstractC0156a.a() == null) && this.f10675d == abstractC0156a.c() && this.f10676e == abstractC0156a.b();
    }

    public final int hashCode() {
        long j10 = this.f10672a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10673b.hashCode()) * 1000003;
        String str = this.f10674c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f10675d;
        return ((hashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10676e;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Frame{pc=");
        l10.append(this.f10672a);
        l10.append(", symbol=");
        l10.append(this.f10673b);
        l10.append(", file=");
        l10.append(this.f10674c);
        l10.append(", offset=");
        l10.append(this.f10675d);
        l10.append(", importance=");
        return a0.j.m(l10, this.f10676e, "}");
    }
}
