package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(c cVar) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.f1101a = (SessionCommand) cVar.x(mediaSession$CommandButton.f1101a, 1);
        mediaSession$CommandButton.f1102b = cVar.o(mediaSession$CommandButton.f1102b, 2);
        CharSequence charSequence = mediaSession$CommandButton.f1103c;
        if (cVar.l(3)) {
            charSequence = cVar.j();
        }
        mediaSession$CommandButton.f1103c = charSequence;
        mediaSession$CommandButton.f1104d = cVar.h(4, mediaSession$CommandButton.f1104d);
        mediaSession$CommandButton.f1105e = cVar.f(5, mediaSession$CommandButton.f1105e);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, c cVar) {
        cVar.getClass();
        cVar.R(mediaSession$CommandButton.f1101a, 1);
        cVar.I(mediaSession$CommandButton.f1102b, 2);
        CharSequence charSequence = mediaSession$CommandButton.f1103c;
        cVar.y(3);
        cVar.E(charSequence);
        cVar.B(4, mediaSession$CommandButton.f1104d);
        cVar.z(5, mediaSession$CommandButton.f1105e);
    }
}
