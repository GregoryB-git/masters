// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import v1.b;

public class AudioAttributesImplApi26Parcelizer
{
    public static AudioAttributesImplApi26 read(final b b) {
        final AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes)b.r((Parcelable)audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = b.p(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final b b) {
        b.x(false, false);
        b.H((Parcelable)audioAttributesImplApi26.a, 1);
        b.F(audioAttributesImplApi26.b, 2);
    }
}
