package androidx.media;

import android.media.AudioAttributes;
import b2.c;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(c cVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1020a = (AudioAttributes) cVar.s(audioAttributesImplApi21.f1020a, 1);
        audioAttributesImplApi21.f1021b = cVar.o(audioAttributesImplApi21.f1021b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, c cVar) {
        cVar.getClass();
        cVar.M(audioAttributesImplApi21.f1020a, 1);
        cVar.I(audioAttributesImplApi21.f1021b, 2);
    }
}
