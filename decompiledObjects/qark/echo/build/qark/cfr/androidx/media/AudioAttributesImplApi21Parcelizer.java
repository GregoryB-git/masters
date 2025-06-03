/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.os.Parcelable
 *  java.lang.Object
 */
package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.media.AudioAttributesImplApi21;
import v1.b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b b8) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes)b8.r((Parcelable)audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = b8.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b b8) {
        b8.x(false, false);
        b8.H((Parcelable)audioAttributesImplApi21.a, 1);
        b8.F(audioAttributesImplApi21.b, 2);
    }
}

