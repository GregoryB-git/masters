package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import defpackage.f;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f1020a;

    /* renamed from: b, reason: collision with root package name */
    public int f1021b = -1;

    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f1022a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            if (i10 == 16) {
                i10 = 12;
            }
            this.f1022a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f1022a.build());
        }
    }

    public AudioAttributesImplApi21() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f1020a = audioAttributes;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f1021b;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f1020a.getFlags(), this.f1020a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f1020a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1020a.equals(((AudioAttributesImplApi21) obj).f1020a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1020a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = f.l("AudioAttributesCompat: audioattributes=");
        l10.append(this.f1020a);
        return l10.toString();
    }
}
