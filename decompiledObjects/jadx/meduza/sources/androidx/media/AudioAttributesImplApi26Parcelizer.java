package androidx.media;

import android.media.AudioAttributes;
import b2.c;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(c cVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1020a = (AudioAttributes) cVar.s(audioAttributesImplApi26.f1020a, 1);
        audioAttributesImplApi26.f1021b = cVar.o(audioAttributesImplApi26.f1021b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, c cVar) {
        cVar.getClass();
        cVar.M(audioAttributesImplApi26.f1020a, 1);
        cVar.I(audioAttributesImplApi26.f1021b, 2);
    }
}
