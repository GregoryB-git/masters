package d5;

import v5.d0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f3492a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3493b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3494c;

    /* renamed from: d, reason: collision with root package name */
    public int f3495d;

    public i(long j10, long j11, String str) {
        this.f3494c = str == null ? "" : str;
        this.f3492a = j10;
        this.f3493b = j11;
    }

    public final i a(i iVar, String str) {
        String c10 = d0.c(str, this.f3494c);
        if (iVar != null && c10.equals(d0.c(str, iVar.f3494c))) {
            long j10 = this.f3493b;
            if (j10 != -1) {
                long j11 = this.f3492a;
                if (j11 + j10 == iVar.f3492a) {
                    long j12 = iVar.f3493b;
                    return new i(j11, j12 == -1 ? -1L : j10 + j12, c10);
                }
            }
            long j13 = iVar.f3493b;
            if (j13 != -1) {
                long j14 = iVar.f3492a;
                if (j14 + j13 == this.f3492a) {
                    return new i(j14, j10 == -1 ? -1L : j13 + j10, c10);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3492a == iVar.f3492a && this.f3493b == iVar.f3493b && this.f3494c.equals(iVar.f3494c);
    }

    public final int hashCode() {
        if (this.f3495d == 0) {
            this.f3495d = this.f3494c.hashCode() + ((((527 + ((int) this.f3492a)) * 31) + ((int) this.f3493b)) * 31);
        }
        return this.f3495d;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RangedUri(referenceUri=");
        l10.append(this.f3494c);
        l10.append(", start=");
        l10.append(this.f3492a);
        l10.append(", length=");
        l10.append(this.f3493b);
        l10.append(")");
        return l10.toString();
    }
}
