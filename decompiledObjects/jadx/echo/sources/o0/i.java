package o0;

import android.net.Uri;
import g0.G;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f18127a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18128b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18129c;

    /* renamed from: d, reason: collision with root package name */
    public int f18130d;

    public i(String str, long j7, long j8) {
        this.f18129c = str == null ? "" : str;
        this.f18127a = j7;
        this.f18128b = j8;
    }

    public i a(i iVar, String str) {
        String c7 = c(str);
        if (iVar != null && c7.equals(iVar.c(str))) {
            long j7 = this.f18128b;
            if (j7 != -1) {
                long j8 = this.f18127a;
                if (j8 + j7 == iVar.f18127a) {
                    long j9 = iVar.f18128b;
                    return new i(c7, j8, j9 != -1 ? j7 + j9 : -1L);
                }
            }
            long j10 = iVar.f18128b;
            if (j10 != -1) {
                long j11 = iVar.f18127a;
                if (j11 + j10 == this.f18127a) {
                    return new i(c7, j11, j7 != -1 ? j10 + j7 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return G.f(str, this.f18129c);
    }

    public String c(String str) {
        return G.e(str, this.f18129c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18127a == iVar.f18127a && this.f18128b == iVar.f18128b && this.f18129c.equals(iVar.f18129c);
    }

    public int hashCode() {
        if (this.f18130d == 0) {
            this.f18130d = ((((527 + ((int) this.f18127a)) * 31) + ((int) this.f18128b)) * 31) + this.f18129c.hashCode();
        }
        return this.f18130d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f18129c + ", start=" + this.f18127a + ", length=" + this.f18128b + ")";
    }
}
