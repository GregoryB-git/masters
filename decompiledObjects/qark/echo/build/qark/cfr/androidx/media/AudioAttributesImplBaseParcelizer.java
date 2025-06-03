/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.media;

import androidx.media.AudioAttributesImplBase;
import v1.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b b8) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = b8.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = b8.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = b8.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = b8.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b b8) {
        b8.x(false, false);
        b8.F(audioAttributesImplBase.a, 1);
        b8.F(audioAttributesImplBase.b, 2);
        b8.F(audioAttributesImplBase.c, 3);
        b8.F(audioAttributesImplBase.d, 4);
    }
}

