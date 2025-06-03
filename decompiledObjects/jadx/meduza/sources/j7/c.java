package j7;

import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f8530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8531b;

    public c(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f8530a = pendingIntent;
        this.f8531b = z10;
    }

    @Override // j7.b
    public final PendingIntent a() {
        return this.f8530a;
    }

    @Override // j7.b
    public final boolean b() {
        return this.f8531b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8530a.equals(bVar.a()) && this.f8531b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8530a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8531b ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder m10 = defpackage.f.m("ReviewInfo{pendingIntent=", this.f8530a.toString(), ", isNoOp=");
        m10.append(this.f8531b);
        m10.append("}");
        return m10.toString();
    }
}
