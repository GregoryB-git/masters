package androidx.media;

import b2.c;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(c cVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1023a = cVar.o(audioAttributesImplBase.f1023a, 1);
        audioAttributesImplBase.f1024b = cVar.o(audioAttributesImplBase.f1024b, 2);
        audioAttributesImplBase.f1025c = cVar.o(audioAttributesImplBase.f1025c, 3);
        audioAttributesImplBase.f1026d = cVar.o(audioAttributesImplBase.f1026d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, c cVar) {
        cVar.getClass();
        cVar.I(audioAttributesImplBase.f1023a, 1);
        cVar.I(audioAttributesImplBase.f1024b, 2);
        cVar.I(audioAttributesImplBase.f1025c, 3);
        cVar.I(audioAttributesImplBase.f1026d, 4);
    }
}
