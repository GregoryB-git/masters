package androidx.media;

import v1.b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9733a = bVar.p(audioAttributesImplBase.f9733a, 1);
        audioAttributesImplBase.f9734b = bVar.p(audioAttributesImplBase.f9734b, 2);
        audioAttributesImplBase.f9735c = bVar.p(audioAttributesImplBase.f9735c, 3);
        audioAttributesImplBase.f9736d = bVar.p(audioAttributesImplBase.f9736d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.x(false, false);
        bVar.F(audioAttributesImplBase.f9733a, 1);
        bVar.F(audioAttributesImplBase.f9734b, 2);
        bVar.F(audioAttributesImplBase.f9735c, 3);
        bVar.F(audioAttributesImplBase.f9736d, 4);
    }
}
