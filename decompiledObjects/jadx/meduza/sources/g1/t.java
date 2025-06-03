package g1;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public v f5793a;

    public t(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        String a10 = u.a(mediaSessionManager$RemoteUserInfo);
        if (a10 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(a10)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f5793a = new u(mediaSessionManager$RemoteUserInfo);
    }

    public t(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f5793a = Build.VERSION.SDK_INT >= 28 ? new u(str, i10, i11) : new v(str, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f5793a.equals(((t) obj).f5793a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5793a.hashCode();
    }
}
