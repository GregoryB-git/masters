package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class k extends f0.e.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10613c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10614d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10615e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10616g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10617h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10618i;

    public static final class a extends f0.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        public int f10619a;

        /* renamed from: b, reason: collision with root package name */
        public String f10620b;

        /* renamed from: c, reason: collision with root package name */
        public int f10621c;

        /* renamed from: d, reason: collision with root package name */
        public long f10622d;

        /* renamed from: e, reason: collision with root package name */
        public long f10623e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public int f10624g;

        /* renamed from: h, reason: collision with root package name */
        public String f10625h;

        /* renamed from: i, reason: collision with root package name */
        public String f10626i;

        /* renamed from: j, reason: collision with root package name */
        public byte f10627j;

        public final k a() {
            String str;
            String str2;
            String str3;
            if (this.f10627j == 63 && (str = this.f10620b) != null && (str2 = this.f10625h) != null && (str3 = this.f10626i) != null) {
                return new k(this.f10619a, str, this.f10621c, this.f10622d, this.f10623e, this.f, this.f10624g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f10627j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f10620b == null) {
                sb2.append(" model");
            }
            if ((this.f10627j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f10627j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f10627j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f10627j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f10627j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f10625h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f10626i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f10611a = i10;
        this.f10612b = str;
        this.f10613c = i11;
        this.f10614d = j10;
        this.f10615e = j11;
        this.f = z10;
        this.f10616g = i12;
        this.f10617h = str2;
        this.f10618i = str3;
    }

    @Override // m8.f0.e.c
    public final int a() {
        return this.f10611a;
    }

    @Override // m8.f0.e.c
    public final int b() {
        return this.f10613c;
    }

    @Override // m8.f0.e.c
    public final long c() {
        return this.f10615e;
    }

    @Override // m8.f0.e.c
    public final String d() {
        return this.f10617h;
    }

    @Override // m8.f0.e.c
    public final String e() {
        return this.f10612b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.c)) {
            return false;
        }
        f0.e.c cVar = (f0.e.c) obj;
        return this.f10611a == cVar.a() && this.f10612b.equals(cVar.e()) && this.f10613c == cVar.b() && this.f10614d == cVar.g() && this.f10615e == cVar.c() && this.f == cVar.i() && this.f10616g == cVar.h() && this.f10617h.equals(cVar.d()) && this.f10618i.equals(cVar.f());
    }

    @Override // m8.f0.e.c
    public final String f() {
        return this.f10618i;
    }

    @Override // m8.f0.e.c
    public final long g() {
        return this.f10614d;
    }

    @Override // m8.f0.e.c
    public final int h() {
        return this.f10616g;
    }

    public final int hashCode() {
        int hashCode = (((((this.f10611a ^ 1000003) * 1000003) ^ this.f10612b.hashCode()) * 1000003) ^ this.f10613c) * 1000003;
        long j10 = this.f10614d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f10615e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f10616g) * 1000003) ^ this.f10617h.hashCode()) * 1000003) ^ this.f10618i.hashCode();
    }

    @Override // m8.f0.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Device{arch=");
        l10.append(this.f10611a);
        l10.append(", model=");
        l10.append(this.f10612b);
        l10.append(", cores=");
        l10.append(this.f10613c);
        l10.append(", ram=");
        l10.append(this.f10614d);
        l10.append(", diskSpace=");
        l10.append(this.f10615e);
        l10.append(", simulator=");
        l10.append(this.f);
        l10.append(", state=");
        l10.append(this.f10616g);
        l10.append(", manufacturer=");
        l10.append(this.f10617h);
        l10.append(", modelClass=");
        return defpackage.g.f(l10, this.f10618i, "}");
    }
}
