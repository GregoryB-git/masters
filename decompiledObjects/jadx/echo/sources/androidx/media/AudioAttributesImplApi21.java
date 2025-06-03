package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f9730a;

    /* renamed from: b, reason: collision with root package name */
    public int f9731b;

    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f9732a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.f9732a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a d(int i7) {
            this.f9732a.setContentType(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i7) {
            this.f9732a.setFlags(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int i7) {
            if (i7 == 16) {
                i7 = 12;
            }
            this.f9732a.setUsage(i7);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f9731b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i7 = this.f9731b;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(false, c(), d());
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return this.f9730a;
    }

    public int c() {
        return this.f9730a.getFlags();
    }

    public int d() {
        return this.f9730a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9730a.equals(((AudioAttributesImplApi21) obj).f9730a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9730a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9730a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i7) {
        this.f9730a = audioAttributes;
        this.f9731b = i7;
    }
}
