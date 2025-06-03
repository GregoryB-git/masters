package o2;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f11726a;

    /* renamed from: b, reason: collision with root package name */
    public final b f11727b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f11728c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.c f11729d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.c f11730e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11731g;

    /* renamed from: h, reason: collision with root package name */
    public final c f11732h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11733i;

    /* renamed from: j, reason: collision with root package name */
    public final a f11734j;

    /* renamed from: k, reason: collision with root package name */
    public final long f11735k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11736l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f11737a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11738b;

        public a(long j10, long j11) {
            this.f11737a = j10;
            this.f11738b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ec.i.a(a.class, obj.getClass())) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f11737a == this.f11737a && aVar.f11738b == this.f11738b;
        }

        public final int hashCode() {
            long j10 = this.f11737a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f11738b;
            return i10 + ((int) ((j11 >>> 32) ^ j11));
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("PeriodicityInfo{repeatIntervalMillis=");
            l10.append(this.f11737a);
            l10.append(", flexIntervalMillis=");
            l10.append(this.f11738b);
            l10.append('}');
            return l10.toString();
        }
    }

    public enum b {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean f() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public o(UUID uuid, b bVar, HashSet hashSet, androidx.work.c cVar, androidx.work.c cVar2, int i10, int i11, c cVar3, long j10, a aVar, long j11, int i12) {
        ec.i.e(bVar, "state");
        ec.i.e(cVar, "outputData");
        ec.i.e(cVar3, "constraints");
        this.f11726a = uuid;
        this.f11727b = bVar;
        this.f11728c = hashSet;
        this.f11729d = cVar;
        this.f11730e = cVar2;
        this.f = i10;
        this.f11731g = i11;
        this.f11732h = cVar3;
        this.f11733i = j10;
        this.f11734j = aVar;
        this.f11735k = j11;
        this.f11736l = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ec.i.a(o.class, obj.getClass())) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f == oVar.f && this.f11731g == oVar.f11731g && ec.i.a(this.f11726a, oVar.f11726a) && this.f11727b == oVar.f11727b && ec.i.a(this.f11729d, oVar.f11729d) && ec.i.a(this.f11732h, oVar.f11732h) && this.f11733i == oVar.f11733i && ec.i.a(this.f11734j, oVar.f11734j) && this.f11735k == oVar.f11735k && this.f11736l == oVar.f11736l && ec.i.a(this.f11728c, oVar.f11728c)) {
            return ec.i.a(this.f11730e, oVar.f11730e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f11732h.hashCode() + ((((((this.f11730e.hashCode() + ((this.f11728c.hashCode() + ((this.f11729d.hashCode() + ((this.f11727b.hashCode() + (this.f11726a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.f11731g) * 31)) * 31;
        long j10 = this.f11733i;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        a aVar = this.f11734j;
        int hashCode2 = (i10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        long j11 = this.f11735k;
        return ((hashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f11736l;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("WorkInfo{id='");
        l10.append(this.f11726a);
        l10.append("', state=");
        l10.append(this.f11727b);
        l10.append(", outputData=");
        l10.append(this.f11729d);
        l10.append(", tags=");
        l10.append(this.f11728c);
        l10.append(", progress=");
        l10.append(this.f11730e);
        l10.append(", runAttemptCount=");
        l10.append(this.f);
        l10.append(", generation=");
        l10.append(this.f11731g);
        l10.append(", constraints=");
        l10.append(this.f11732h);
        l10.append(", initialDelayMillis=");
        l10.append(this.f11733i);
        l10.append(", periodicityInfo=");
        l10.append(this.f11734j);
        l10.append(", nextScheduleTimeMillis=");
        l10.append(this.f11735k);
        l10.append("}, stopReason=");
        l10.append(this.f11736l);
        return l10.toString();
    }
}
