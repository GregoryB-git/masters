/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26
extends AudioAttributesImplApi21 {
    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    public static class a
    extends AudioAttributesImplApi21.a {
        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi26(this.a.build());
        }

        public a h(int n8) {
            this.a.setUsage(n8);
            return this;
        }
    }

}

