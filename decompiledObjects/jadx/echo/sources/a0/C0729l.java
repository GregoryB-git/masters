package a0;

import android.media.session.MediaSessionManager;

/* renamed from: a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729l extends C0730m {

    /* renamed from: d, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f7990d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0729l(android.media.session.MediaSessionManager.RemoteUserInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = a0.AbstractC0726i.a(r4)
            int r1 = a0.AbstractC0727j.a(r4)
            int r2 = a0.AbstractC0728k.a(r4)
            r3.<init>(r0, r1, r2)
            r3.f7990d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0729l.<init>(android.media.session.MediaSessionManager$RemoteUserInfo):void");
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName;
        packageName = remoteUserInfo.getPackageName();
        return packageName;
    }

    public C0729l(String str, int i7, int i8) {
        super(str, i7, i8);
        this.f7990d = AbstractC0725h.a(str, i7, i8);
    }
}
