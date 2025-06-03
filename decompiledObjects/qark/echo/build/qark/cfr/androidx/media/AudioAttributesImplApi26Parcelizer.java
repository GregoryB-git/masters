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
import androidx.media.AudioAttributesImplApi26;
import v1.b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b b8) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes)b8.r((Parcelable)audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = b8.p(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b b8) {
        b8.x(false, false);
        b8.H((Parcelable)audioAttributesImplApi26.a, 1);
        b8.F(audioAttributesImplApi26.b, 2);
    }
}

