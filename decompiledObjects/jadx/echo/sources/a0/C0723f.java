package a0;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723f {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0724g f7989a;

    public C0723f(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a7 = C0729l.a(remoteUserInfo);
        if (a7 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(a7)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f7989a = new C0729l(remoteUserInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0723f) {
            return this.f7989a.equals(((C0723f) obj).f7989a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7989a.hashCode();
    }

    public C0723f(String str, int i7, int i8) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f7989a = Build.VERSION.SDK_INT >= 28 ? new C0729l(str, i7, i8) : new C0730m(str, i7, i8);
    }
}
