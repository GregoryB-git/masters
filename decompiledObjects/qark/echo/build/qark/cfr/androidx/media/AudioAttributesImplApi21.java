/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21
implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int n8) {
        this.a = audioAttributes;
        this.b = n8;
    }

    @Override
    public int a() {
        int n8 = this.b;
        if (n8 != -1) {
            return n8;
        }
        return AudioAttributesCompat.c(false, this.c(), this.d());
    }

    @Override
    public Object b() {
        return this.a;
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.getUsage();
    }

    public boolean equals(Object object) {
        if (!(object instanceof AudioAttributesImplApi21)) {
            return false;
        }
        object = (AudioAttributesImplApi21)object;
        return this.a.equals((Object)object.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioAttributesCompat: audioattributes=");
        stringBuilder.append((Object)this.a);
        return stringBuilder.toString();
    }

    public static class a
    implements AudioAttributesImpl.a {
        public final AudioAttributes.Builder a = new AudioAttributes.Builder();

        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        public a e(int n8) {
            this.a.setContentType(n8);
            return this;
        }

        public a f(int n8) {
            this.a.setFlags(n8);
            return this;
        }

        public a g(int n8) {
            int n9 = n8;
            if (n8 == 16) {
                n9 = 12;
            }
            this.a.setUsage(n9);
            return this;
        }
    }

}

