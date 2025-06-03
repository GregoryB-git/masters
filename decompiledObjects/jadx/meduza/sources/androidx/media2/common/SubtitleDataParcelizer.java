package androidx.media2.common;

import b2.c;

/* loaded from: classes.dex */
public final class SubtitleDataParcelizer {
    public static SubtitleData read(c cVar) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f1045a = cVar.q(1, subtitleData.f1045a);
        subtitleData.f1046b = cVar.q(2, subtitleData.f1046b);
        byte[] bArr = subtitleData.f1047c;
        if (cVar.l(3)) {
            bArr = cVar.i();
        }
        subtitleData.f1047c = bArr;
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, c cVar) {
        cVar.getClass();
        cVar.J(1, subtitleData.f1045a);
        cVar.J(2, subtitleData.f1046b);
        byte[] bArr = subtitleData.f1047c;
        cVar.y(3);
        cVar.D(bArr);
    }
}
