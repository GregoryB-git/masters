/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import v1.b;
import v1.d;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b b8) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl)b8.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b b8) {
        b8.x(false, false);
        b8.M(audioAttributesCompat.a, 1);
    }
}

