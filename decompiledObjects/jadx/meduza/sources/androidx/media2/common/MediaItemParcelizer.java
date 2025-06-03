package androidx.media2.common;

import b2.c;

/* loaded from: classes.dex */
public final class MediaItemParcelizer {
    public static MediaItem read(c cVar) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f1028b = (MediaMetadata) cVar.x(mediaItem.f1028b, 1);
        mediaItem.f1029c = cVar.q(2, mediaItem.f1029c);
        mediaItem.f1030d = cVar.q(3, mediaItem.f1030d);
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, c cVar) {
        cVar.getClass();
        if (mediaItem.getClass() != MediaItem.class) {
            throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
        }
        cVar.R(mediaItem.f1028b, 1);
        cVar.J(2, mediaItem.f1029c);
        cVar.J(3, mediaItem.f1030d);
    }
}
