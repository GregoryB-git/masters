// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import v1.b;

public class AudioAttributesImplApi21Parcelizer
{
    public static AudioAttributesImplApi21 read(final b b) {
        final AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes)b.r((Parcelable)audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = b.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final b b) {
        b.x(false, false);
        b.H((Parcelable)audioAttributesImplApi21.a, 1);
        b.F(audioAttributesImplApi21.b, 2);
    }
}
