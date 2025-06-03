// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import v1.b;

public class AudioAttributesImplBaseParcelizer
{
    public static AudioAttributesImplBase read(final b b) {
        final AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = b.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = b.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = b.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = b.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final b b) {
        b.x(false, false);
        b.F(audioAttributesImplBase.a, 1);
        b.F(audioAttributesImplBase.b, 2);
        b.F(audioAttributesImplBase.c, 3);
        b.F(audioAttributesImplBase.d, 4);
    }
}
