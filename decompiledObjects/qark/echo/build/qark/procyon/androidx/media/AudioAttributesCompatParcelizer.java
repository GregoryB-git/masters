// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import v1.d;
import v1.b;

public class AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final b b) {
        final AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl)b.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final b b) {
        b.x(false, false);
        b.M(audioAttributesCompat.a, 1);
    }
}
