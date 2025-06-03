package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class u extends f0.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    public final Double f10691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10692b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10694d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10695e;
    public final long f;

    public static final class a extends f0.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Double f10696a;

        /* renamed from: b, reason: collision with root package name */
        public int f10697b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10698c;

        /* renamed from: d, reason: collision with root package name */
        public int f10699d;

        /* renamed from: e, reason: collision with root package name */
        public long f10700e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public byte f10701g;

        public final u a() {
            if (this.f10701g == 31) {
                return new u(this.f10696a, this.f10697b, this.f10698c, this.f10699d, this.f10700e, this.f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f10701g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f10701g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f10701g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f10701g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f10701g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f10691a = d10;
        this.f10692b = i10;
        this.f10693c = z10;
        this.f10694d = i11;
        this.f10695e = j10;
        this.f = j11;
    }

    @Override // m8.f0.e.d.c
    public final Double a() {
        return this.f10691a;
    }

    @Override // m8.f0.e.d.c
    public final int b() {
        return this.f10692b;
    }

    @Override // m8.f0.e.d.c
    public final long c() {
        return this.f;
    }

    @Override // m8.f0.e.d.c
    public final int d() {
        return this.f10694d;
    }

    @Override // m8.f0.e.d.c
    public final long e() {
        return this.f10695e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.c)) {
            return false;
        }
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Double d10 = this.f10691a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f10692b == cVar.b() && this.f10693c == cVar.f() && this.f10694d == cVar.d() && this.f10695e == cVar.e() && this.f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.f0.e.d.c
    public final boolean f() {
        return this.f10693c;
    }

    public final int hashCode() {
        Double d10 = this.f10691a;
        int hashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f10692b) * 1000003) ^ (this.f10693c ? 1231 : 1237)) * 1000003) ^ this.f10694d) * 1000003;
        long j10 = this.f10695e;
        long j11 = this.f;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Device{batteryLevel=");
        l10.append(this.f10691a);
        l10.append(", batteryVelocity=");
        l10.append(this.f10692b);
        l10.append(", proximityOn=");
        l10.append(this.f10693c);
        l10.append(", orientation=");
        l10.append(this.f10694d);
        l10.append(", ramUsed=");
        l10.append(this.f10695e);
        l10.append(", diskUsed=");
        l10.append(this.f);
        l10.append("}");
        return l10.toString();
    }
}
