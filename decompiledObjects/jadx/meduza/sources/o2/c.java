package o2;

import android.net.Uri;
import android.os.Build;
import java.util.Set;
import sb.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f11702i = new c(1, false, false, false, false, -1, -1, u.f14326a);

    /* renamed from: a, reason: collision with root package name */
    public final int f11703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11705c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11706d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11707e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11708g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<a> f11709h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f11710a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11711b;

        public a(boolean z10, Uri uri) {
            this.f11710a = uri;
            this.f11711b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ec.i.a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            ec.i.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return ec.i.a(this.f11710a, aVar.f11710a) && this.f11711b == aVar.f11711b;
        }

        public final int hashCode() {
            return (this.f11710a.hashCode() * 31) + (this.f11711b ? 1231 : 1237);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;ZZZZJJLjava/util/Set<Lo2/c$a;>;)V */
    public c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set) {
        a0.j.p(i10, "requiredNetworkType");
        ec.i.e(set, "contentUriTriggers");
        this.f11703a = i10;
        this.f11704b = z10;
        this.f11705c = z11;
        this.f11706d = z12;
        this.f11707e = z13;
        this.f = j10;
        this.f11708g = j11;
        this.f11709h = set;
    }

    public c(c cVar) {
        ec.i.e(cVar, "other");
        this.f11704b = cVar.f11704b;
        this.f11705c = cVar.f11705c;
        this.f11703a = cVar.f11703a;
        this.f11706d = cVar.f11706d;
        this.f11707e = cVar.f11707e;
        this.f11709h = cVar.f11709h;
        this.f = cVar.f;
        this.f11708g = cVar.f11708g;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT < 24 || (this.f11709h.isEmpty() ^ true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ec.i.a(c.class, obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11704b == cVar.f11704b && this.f11705c == cVar.f11705c && this.f11706d == cVar.f11706d && this.f11707e == cVar.f11707e && this.f == cVar.f && this.f11708g == cVar.f11708g && this.f11703a == cVar.f11703a) {
            return ec.i.a(this.f11709h, cVar.f11709h);
        }
        return false;
    }

    public final int hashCode() {
        int c10 = ((((((((q0.g.c(this.f11703a) * 31) + (this.f11704b ? 1 : 0)) * 31) + (this.f11705c ? 1 : 0)) * 31) + (this.f11706d ? 1 : 0)) * 31) + (this.f11707e ? 1 : 0)) * 31;
        long j10 = this.f;
        int i10 = (c10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f11708g;
        return this.f11709h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Constraints{requiredNetworkType=");
        l10.append(a0.j.x(this.f11703a));
        l10.append(", requiresCharging=");
        l10.append(this.f11704b);
        l10.append(", requiresDeviceIdle=");
        l10.append(this.f11705c);
        l10.append(", requiresBatteryNotLow=");
        l10.append(this.f11706d);
        l10.append(", requiresStorageNotLow=");
        l10.append(this.f11707e);
        l10.append(", contentTriggerUpdateDelayMillis=");
        l10.append(this.f);
        l10.append(", contentTriggerMaxDelayMillis=");
        l10.append(this.f11708g);
        l10.append(", contentUriTriggers=");
        l10.append(this.f11709h);
        l10.append(", }");
        return l10.toString();
    }
}
