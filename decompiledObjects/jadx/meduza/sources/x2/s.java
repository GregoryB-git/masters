package x2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import o2.o;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: x, reason: collision with root package name */
    public static final String f16829x;

    /* renamed from: a, reason: collision with root package name */
    public final String f16830a;

    /* renamed from: b, reason: collision with root package name */
    public o.b f16831b;

    /* renamed from: c, reason: collision with root package name */
    public String f16832c;

    /* renamed from: d, reason: collision with root package name */
    public String f16833d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.c f16834e;
    public androidx.work.c f;

    /* renamed from: g, reason: collision with root package name */
    public long f16835g;

    /* renamed from: h, reason: collision with root package name */
    public long f16836h;

    /* renamed from: i, reason: collision with root package name */
    public long f16837i;

    /* renamed from: j, reason: collision with root package name */
    public o2.c f16838j;

    /* renamed from: k, reason: collision with root package name */
    public int f16839k;

    /* renamed from: l, reason: collision with root package name */
    public int f16840l;

    /* renamed from: m, reason: collision with root package name */
    public long f16841m;

    /* renamed from: n, reason: collision with root package name */
    public long f16842n;

    /* renamed from: o, reason: collision with root package name */
    public long f16843o;

    /* renamed from: p, reason: collision with root package name */
    public long f16844p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16845q;

    /* renamed from: r, reason: collision with root package name */
    public int f16846r;

    /* renamed from: s, reason: collision with root package name */
    public int f16847s;
    public final int t;

    /* renamed from: u, reason: collision with root package name */
    public long f16848u;

    /* renamed from: v, reason: collision with root package name */
    public int f16849v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16850w;

    public static final class a {
        public static long a(boolean z10, int i10, int i11, long j10, long j11, int i12, boolean z11, long j12, long j13, long j14, long j15) {
            a0.j.p(i11, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                if (i12 != 0) {
                    long j16 = 900000 + j11;
                    if (j15 < j16) {
                        return j16;
                    }
                }
                return j15;
            }
            if (z10) {
                long scalb = i11 == 2 ? i10 * j10 : (long) Math.scalb(j10, i10 - 1);
                if (scalb > 18000000) {
                    scalb = 18000000;
                }
                return j11 + scalb;
            }
            if (z11) {
                long j17 = i12 == 0 ? j11 + j12 : j11 + j14;
                return ((j13 != j14) && i12 == 0) ? j17 + (j14 - j13) : j17;
            }
            if (j11 == -1) {
                return Long.MAX_VALUE;
            }
            return j11 + j12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f16851a;

        /* renamed from: b, reason: collision with root package name */
        public o.b f16852b;

        public b(o.b bVar, String str) {
            ec.i.e(str, "id");
            this.f16851a = str;
            this.f16852b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ec.i.a(this.f16851a, bVar.f16851a) && this.f16852b == bVar.f16852b;
        }

        public final int hashCode() {
            return this.f16852b.hashCode() + (this.f16851a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("IdAndState(id=");
            l10.append(this.f16851a);
            l10.append(", state=");
            l10.append(this.f16852b);
            l10.append(')');
            return l10.toString();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f16853a;

        /* renamed from: b, reason: collision with root package name */
        public final o.b f16854b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.work.c f16855c;

        /* renamed from: d, reason: collision with root package name */
        public final long f16856d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16857e;
        public final long f;

        /* renamed from: g, reason: collision with root package name */
        public final o2.c f16858g;

        /* renamed from: h, reason: collision with root package name */
        public final int f16859h;

        /* renamed from: i, reason: collision with root package name */
        public int f16860i;

        /* renamed from: j, reason: collision with root package name */
        public long f16861j;

        /* renamed from: k, reason: collision with root package name */
        public long f16862k;

        /* renamed from: l, reason: collision with root package name */
        public int f16863l;

        /* renamed from: m, reason: collision with root package name */
        public final int f16864m;

        /* renamed from: n, reason: collision with root package name */
        public final long f16865n;

        /* renamed from: o, reason: collision with root package name */
        public final int f16866o;

        /* renamed from: p, reason: collision with root package name */
        public final List<String> f16867p;

        /* renamed from: q, reason: collision with root package name */
        public final List<androidx.work.c> f16868q;

        public c(String str, o.b bVar, androidx.work.c cVar, long j10, long j11, long j12, o2.c cVar2, int i10, int i11, long j13, long j14, int i12, int i13, long j15, int i14, ArrayList arrayList, ArrayList arrayList2) {
            ec.i.e(str, "id");
            a0.j.p(i11, "backoffPolicy");
            this.f16853a = str;
            this.f16854b = bVar;
            this.f16855c = cVar;
            this.f16856d = j10;
            this.f16857e = j11;
            this.f = j12;
            this.f16858g = cVar2;
            this.f16859h = i10;
            this.f16860i = i11;
            this.f16861j = j13;
            this.f16862k = j14;
            this.f16863l = i12;
            this.f16864m = i13;
            this.f16865n = j15;
            this.f16866o = i14;
            this.f16867p = arrayList;
            this.f16868q = arrayList2;
        }

        public final o2.o a() {
            int i10;
            o.a aVar;
            o.b bVar;
            HashSet hashSet;
            androidx.work.c cVar;
            androidx.work.c cVar2;
            long j10;
            o2.c cVar3;
            int i11;
            long j11;
            long j12;
            boolean z10;
            androidx.work.c cVar4 = this.f16868q.isEmpty() ^ true ? this.f16868q.get(0) : androidx.work.c.f1454c;
            UUID fromString = UUID.fromString(this.f16853a);
            ec.i.d(fromString, "fromString(id)");
            o.b bVar2 = this.f16854b;
            HashSet hashSet2 = new HashSet(this.f16867p);
            androidx.work.c cVar5 = this.f16855c;
            ec.i.d(cVar4, "progress");
            int i12 = this.f16859h;
            int i13 = this.f16864m;
            o2.c cVar6 = this.f16858g;
            long j13 = this.f16856d;
            long j14 = this.f16857e;
            if (j14 != 0) {
                i10 = i13;
                aVar = new o.a(j14, this.f);
            } else {
                i10 = i13;
                aVar = null;
            }
            o.a aVar2 = aVar;
            o.b bVar3 = this.f16854b;
            o.b bVar4 = o.b.ENQUEUED;
            if (bVar3 == bVar4) {
                String str = s.f16829x;
                boolean z11 = bVar3 == bVar4 && i12 > 0;
                int i14 = this.f16860i;
                cVar = cVar5;
                cVar2 = cVar4;
                long j15 = this.f16861j;
                bVar = bVar2;
                hashSet = hashSet2;
                long j16 = this.f16862k;
                int i15 = this.f16863l;
                if (j14 != 0) {
                    j12 = j13;
                    z10 = true;
                } else {
                    j12 = j13;
                    z10 = false;
                }
                j10 = j12;
                cVar3 = cVar6;
                i11 = i10;
                j11 = a.a(z11, i12, i14, j15, j16, i15, z10, j10, this.f, j14, this.f16865n);
            } else {
                bVar = bVar2;
                hashSet = hashSet2;
                cVar = cVar5;
                cVar2 = cVar4;
                j10 = j13;
                cVar3 = cVar6;
                i11 = i10;
                j11 = Long.MAX_VALUE;
            }
            return new o2.o(fromString, bVar, hashSet, cVar, cVar2, i12, i11, cVar3, j10, aVar2, j11, this.f16866o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ec.i.a(this.f16853a, cVar.f16853a) && this.f16854b == cVar.f16854b && ec.i.a(this.f16855c, cVar.f16855c) && this.f16856d == cVar.f16856d && this.f16857e == cVar.f16857e && this.f == cVar.f && ec.i.a(this.f16858g, cVar.f16858g) && this.f16859h == cVar.f16859h && this.f16860i == cVar.f16860i && this.f16861j == cVar.f16861j && this.f16862k == cVar.f16862k && this.f16863l == cVar.f16863l && this.f16864m == cVar.f16864m && this.f16865n == cVar.f16865n && this.f16866o == cVar.f16866o && ec.i.a(this.f16867p, cVar.f16867p) && ec.i.a(this.f16868q, cVar.f16868q);
        }

        public final int hashCode() {
            int hashCode = (this.f16855c.hashCode() + ((this.f16854b.hashCode() + (this.f16853a.hashCode() * 31)) * 31)) * 31;
            long j10 = this.f16856d;
            int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f16857e;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f;
            int c10 = (q0.g.c(this.f16860i) + ((((this.f16858g.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f16859h) * 31)) * 31;
            long j13 = this.f16861j;
            int i12 = (c10 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f16862k;
            int i13 = (((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f16863l) * 31) + this.f16864m) * 31;
            long j15 = this.f16865n;
            return this.f16868q.hashCode() + ((this.f16867p.hashCode() + ((((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f16866o) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("WorkInfoPojo(id=");
            l10.append(this.f16853a);
            l10.append(", state=");
            l10.append(this.f16854b);
            l10.append(", output=");
            l10.append(this.f16855c);
            l10.append(", initialDelay=");
            l10.append(this.f16856d);
            l10.append(", intervalDuration=");
            l10.append(this.f16857e);
            l10.append(", flexDuration=");
            l10.append(this.f);
            l10.append(", constraints=");
            l10.append(this.f16858g);
            l10.append(", runAttemptCount=");
            l10.append(this.f16859h);
            l10.append(", backoffPolicy=");
            l10.append(defpackage.f.t(this.f16860i));
            l10.append(", backoffDelayDuration=");
            l10.append(this.f16861j);
            l10.append(", lastEnqueueTime=");
            l10.append(this.f16862k);
            l10.append(", periodCount=");
            l10.append(this.f16863l);
            l10.append(", generation=");
            l10.append(this.f16864m);
            l10.append(", nextScheduleTimeOverride=");
            l10.append(this.f16865n);
            l10.append(", stopReason=");
            l10.append(this.f16866o);
            l10.append(", tags=");
            l10.append(this.f16867p);
            l10.append(", progress=");
            l10.append(this.f16868q);
            l10.append(')');
            return l10.toString();
        }
    }

    static {
        String f = o2.j.f("WorkSpec");
        ec.i.d(f, "tagWithPrefix(\"WorkSpec\")");
        f16829x = f;
    }

    public s(String str, o.b bVar, String str2, String str3, androidx.work.c cVar, androidx.work.c cVar2, long j10, long j11, long j12, o2.c cVar3, int i10, int i11, long j13, long j14, long j15, long j16, boolean z10, int i12, int i13, int i14, long j17, int i15, int i16) {
        ec.i.e(str, "id");
        ec.i.e(bVar, "state");
        ec.i.e(str2, "workerClassName");
        ec.i.e(str3, "inputMergerClassName");
        ec.i.e(cVar, "input");
        ec.i.e(cVar2, "output");
        ec.i.e(cVar3, "constraints");
        a0.j.p(i11, "backoffPolicy");
        a0.j.p(i12, "outOfQuotaPolicy");
        this.f16830a = str;
        this.f16831b = bVar;
        this.f16832c = str2;
        this.f16833d = str3;
        this.f16834e = cVar;
        this.f = cVar2;
        this.f16835g = j10;
        this.f16836h = j11;
        this.f16837i = j12;
        this.f16838j = cVar3;
        this.f16839k = i10;
        this.f16840l = i11;
        this.f16841m = j13;
        this.f16842n = j14;
        this.f16843o = j15;
        this.f16844p = j16;
        this.f16845q = z10;
        this.f16846r = i12;
        this.f16847s = i13;
        this.t = i14;
        this.f16848u = j17;
        this.f16849v = i15;
        this.f16850w = i16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ s(java.lang.String r36, o2.o.b r37, java.lang.String r38, java.lang.String r39, androidx.work.c r40, androidx.work.c r41, long r42, long r44, long r46, o2.c r48, int r49, int r50, long r51, long r53, long r55, long r57, boolean r59, int r60, int r61, long r62, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.s.<init>(java.lang.String, o2.o$b, java.lang.String, java.lang.String, androidx.work.c, androidx.work.c, long, long, long, o2.c, int, int, long, long, long, long, boolean, int, int, long, int, int, int):void");
    }

    public final long a() {
        return a.a(this.f16831b == o.b.ENQUEUED && this.f16839k > 0, this.f16839k, this.f16840l, this.f16841m, this.f16842n, this.f16847s, c(), this.f16835g, this.f16837i, this.f16836h, this.f16848u);
    }

    public final boolean b() {
        return !ec.i.a(o2.c.f11702i, this.f16838j);
    }

    public final boolean c() {
        return this.f16836h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return ec.i.a(this.f16830a, sVar.f16830a) && this.f16831b == sVar.f16831b && ec.i.a(this.f16832c, sVar.f16832c) && ec.i.a(this.f16833d, sVar.f16833d) && ec.i.a(this.f16834e, sVar.f16834e) && ec.i.a(this.f, sVar.f) && this.f16835g == sVar.f16835g && this.f16836h == sVar.f16836h && this.f16837i == sVar.f16837i && ec.i.a(this.f16838j, sVar.f16838j) && this.f16839k == sVar.f16839k && this.f16840l == sVar.f16840l && this.f16841m == sVar.f16841m && this.f16842n == sVar.f16842n && this.f16843o == sVar.f16843o && this.f16844p == sVar.f16844p && this.f16845q == sVar.f16845q && this.f16846r == sVar.f16846r && this.f16847s == sVar.f16847s && this.t == sVar.t && this.f16848u == sVar.f16848u && this.f16849v == sVar.f16849v && this.f16850w == sVar.f16850w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.f16834e.hashCode() + a0.j.e(this.f16833d, a0.j.e(this.f16832c, (this.f16831b.hashCode() + (this.f16830a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31;
        long j10 = this.f16835g;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f16836h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f16837i;
        int c10 = (q0.g.c(this.f16840l) + ((((this.f16838j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f16839k) * 31)) * 31;
        long j13 = this.f16841m;
        int i12 = (c10 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f16842n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f16843o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f16844p;
        int i15 = (i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        boolean z10 = this.f16845q;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int c11 = (((((q0.g.c(this.f16846r) + ((i15 + i16) * 31)) * 31) + this.f16847s) * 31) + this.t) * 31;
        long j17 = this.f16848u;
        return ((((c11 + ((int) ((j17 >>> 32) ^ j17))) * 31) + this.f16849v) * 31) + this.f16850w;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("{WorkSpec: ");
        l10.append(this.f16830a);
        l10.append('}');
        return l10.toString();
    }
}
