package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import b2.c;

/* loaded from: classes.dex */
public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(c cVar) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.f1092a = cVar.o(mediaController$PlaybackInfo.f1092a, 1);
        mediaController$PlaybackInfo.f1093b = cVar.o(mediaController$PlaybackInfo.f1093b, 2);
        mediaController$PlaybackInfo.f1094c = cVar.o(mediaController$PlaybackInfo.f1094c, 3);
        mediaController$PlaybackInfo.f1095d = cVar.o(mediaController$PlaybackInfo.f1095d, 4);
        mediaController$PlaybackInfo.f1096e = (AudioAttributesCompat) cVar.x(mediaController$PlaybackInfo.f1096e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, c cVar) {
        cVar.getClass();
        cVar.I(mediaController$PlaybackInfo.f1092a, 1);
        cVar.I(mediaController$PlaybackInfo.f1093b, 2);
        cVar.I(mediaController$PlaybackInfo.f1094c, 3);
        cVar.I(mediaController$PlaybackInfo.f1095d, 4);
        cVar.R(mediaController$PlaybackInfo.f1096e, 5);
    }
}
