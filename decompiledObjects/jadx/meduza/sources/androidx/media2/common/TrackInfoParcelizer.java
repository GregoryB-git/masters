package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import b2.c;

/* loaded from: classes.dex */
public final class TrackInfoParcelizer {
    public static SessionPlayer$TrackInfo read(c cVar) {
        SessionPlayer$TrackInfo sessionPlayer$TrackInfo = new SessionPlayer$TrackInfo();
        sessionPlayer$TrackInfo.f1040a = cVar.o(sessionPlayer$TrackInfo.f1040a, 1);
        sessionPlayer$TrackInfo.f1041b = cVar.o(sessionPlayer$TrackInfo.f1041b, 3);
        Bundle h10 = cVar.h(4, sessionPlayer$TrackInfo.f1044e);
        sessionPlayer$TrackInfo.f1044e = h10;
        if (h10 != null && !h10.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            sessionPlayer$TrackInfo.f1042c = mediaFormat;
            Bundle bundle = sessionPlayer$TrackInfo.f1044e;
            if (bundle.containsKey("language")) {
                mediaFormat.setString("language", bundle.getString("language"));
            }
            MediaFormat mediaFormat2 = sessionPlayer$TrackInfo.f1042c;
            Bundle bundle2 = sessionPlayer$TrackInfo.f1044e;
            if (bundle2.containsKey("mime")) {
                mediaFormat2.setString("mime", bundle2.getString("mime"));
            }
            MediaFormat mediaFormat3 = sessionPlayer$TrackInfo.f1042c;
            Bundle bundle3 = sessionPlayer$TrackInfo.f1044e;
            if (bundle3.containsKey("is-forced-subtitle")) {
                mediaFormat3.setInteger("is-forced-subtitle", bundle3.getInt("is-forced-subtitle"));
            }
            MediaFormat mediaFormat4 = sessionPlayer$TrackInfo.f1042c;
            Bundle bundle4 = sessionPlayer$TrackInfo.f1044e;
            if (bundle4.containsKey("is-autoselect")) {
                mediaFormat4.setInteger("is-autoselect", bundle4.getInt("is-autoselect"));
            }
            MediaFormat mediaFormat5 = sessionPlayer$TrackInfo.f1042c;
            Bundle bundle5 = sessionPlayer$TrackInfo.f1044e;
            if (bundle5.containsKey("is-default")) {
                mediaFormat5.setInteger("is-default", bundle5.getInt("is-default"));
            }
        }
        Bundle bundle6 = sessionPlayer$TrackInfo.f1044e;
        if (bundle6 == null || !bundle6.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            sessionPlayer$TrackInfo.f1043d = sessionPlayer$TrackInfo.f1041b != 1;
        } else {
            sessionPlayer$TrackInfo.f1043d = sessionPlayer$TrackInfo.f1044e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
        }
        return sessionPlayer$TrackInfo;
    }

    public static void write(SessionPlayer$TrackInfo sessionPlayer$TrackInfo, c cVar) {
        cVar.getClass();
        synchronized (sessionPlayer$TrackInfo.f) {
            try {
                Bundle bundle = new Bundle();
                sessionPlayer$TrackInfo.f1044e = bundle;
                bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", sessionPlayer$TrackInfo.f1042c == null);
                MediaFormat mediaFormat = sessionPlayer$TrackInfo.f1042c;
                if (mediaFormat != null) {
                    Bundle bundle2 = sessionPlayer$TrackInfo.f1044e;
                    if (mediaFormat.containsKey("language")) {
                        bundle2.putString("language", mediaFormat.getString("language"));
                    }
                    MediaFormat mediaFormat2 = sessionPlayer$TrackInfo.f1042c;
                    Bundle bundle3 = sessionPlayer$TrackInfo.f1044e;
                    if (mediaFormat2.containsKey("mime")) {
                        bundle3.putString("mime", mediaFormat2.getString("mime"));
                    }
                    MediaFormat mediaFormat3 = sessionPlayer$TrackInfo.f1042c;
                    Bundle bundle4 = sessionPlayer$TrackInfo.f1044e;
                    if (mediaFormat3.containsKey("is-forced-subtitle")) {
                        bundle4.putInt("is-forced-subtitle", mediaFormat3.getInteger("is-forced-subtitle"));
                    }
                    MediaFormat mediaFormat4 = sessionPlayer$TrackInfo.f1042c;
                    Bundle bundle5 = sessionPlayer$TrackInfo.f1044e;
                    if (mediaFormat4.containsKey("is-autoselect")) {
                        bundle5.putInt("is-autoselect", mediaFormat4.getInteger("is-autoselect"));
                    }
                    MediaFormat mediaFormat5 = sessionPlayer$TrackInfo.f1042c;
                    Bundle bundle6 = sessionPlayer$TrackInfo.f1044e;
                    if (mediaFormat5.containsKey("is-default")) {
                        bundle6.putInt("is-default", mediaFormat5.getInteger("is-default"));
                    }
                }
                sessionPlayer$TrackInfo.f1044e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", sessionPlayer$TrackInfo.f1043d);
            } catch (Throwable th) {
                throw th;
            }
        }
        cVar.I(sessionPlayer$TrackInfo.f1040a, 1);
        cVar.I(sessionPlayer$TrackInfo.f1041b, 3);
        cVar.B(4, sessionPlayer$TrackInfo.f1044e);
    }
}
