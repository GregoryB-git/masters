package androidx.media2.common;

import b2.c;

/* loaded from: classes.dex */
public final class VideoSizeParcelizer {
    public static VideoSize read(c cVar) {
        VideoSize videoSize = new VideoSize();
        videoSize.f1048a = cVar.o(videoSize.f1048a, 1);
        videoSize.f1049b = cVar.o(videoSize.f1049b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, c cVar) {
        cVar.getClass();
        cVar.I(videoSize.f1048a, 1);
        cVar.I(videoSize.f1049b, 2);
    }
}
