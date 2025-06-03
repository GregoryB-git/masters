package g1;

import android.media.session.MediaSessionManager$RemoteUserInfo;

/* loaded from: classes.dex */
public final class u extends v {
    public u(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
    }

    public u(String str, int i10, int i11) {
        super(str, i10, i11);
        new MediaSessionManager$RemoteUserInfo(str, i10, i11);
    }

    public static String a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        return mediaSessionManager$RemoteUserInfo.getPackageName();
    }
}
