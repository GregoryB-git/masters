package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    public static class a extends AudioAttributesImplApi21.a {
        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public final AudioAttributesImpl.a a(int i10) {
            this.f1022a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        /* renamed from: b */
        public final AudioAttributesImplApi21.a a(int i10) {
            this.f1022a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public final AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f1022a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes);
    }
}
