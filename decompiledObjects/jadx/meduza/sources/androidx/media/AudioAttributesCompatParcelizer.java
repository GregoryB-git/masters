package androidx.media;

import b2.c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(c cVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1019a = (AudioAttributesImpl) cVar.x(audioAttributesCompat.f1019a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, c cVar) {
        cVar.getClass();
        cVar.R(audioAttributesCompat.f1019a, 1);
    }
}
