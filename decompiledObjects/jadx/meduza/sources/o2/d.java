package o2;

import android.app.Notification;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f11712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11713b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f11714c;

    public d(int i10, int i11, Notification notification) {
        this.f11712a = i10;
        this.f11714c = notification;
        this.f11713b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11712a == dVar.f11712a && this.f11713b == dVar.f11713b) {
            return this.f11714c.equals(dVar.f11714c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11714c.hashCode() + (((this.f11712a * 31) + this.f11713b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f11712a + ", mForegroundServiceType=" + this.f11713b + ", mNotification=" + this.f11714c + '}';
    }
}
