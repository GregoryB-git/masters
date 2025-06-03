package androidx.media;

import N4.h;
import androidx.media.AudioAttributesImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f9733a;

    /* renamed from: b, reason: collision with root package name */
    public int f9734b;

    /* renamed from: c, reason: collision with root package name */
    public int f9735c;

    /* renamed from: d, reason: collision with root package name */
    public int f9736d;

    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        public int f9737a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f9738b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f9739c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f9740d = -1;

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.f9738b, this.f9739c, this.f9737a, this.f9740d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a d(int i7) {
            if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
                i7 = 0;
            }
            this.f9738b = i7;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i7) {
            this.f9739c = (i7 & 1023) | this.f9739c;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int i7) {
            switch (i7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 15:
                    break;
                case 16:
                    i7 = 12;
                    break;
                default:
                    i7 = 0;
                    break;
            }
            this.f9737a = i7;
            return this;
        }
    }

    public AudioAttributesImplBase() {
        this.f9733a = 0;
        this.f9734b = 0;
        this.f9735c = 0;
        this.f9736d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i7 = this.f9736d;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(false, this.f9735c, this.f9733a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return null;
    }

    public int c() {
        return this.f9734b;
    }

    public int d() {
        int i7 = this.f9735c;
        int a7 = a();
        if (a7 == 6) {
            i7 |= 4;
        } else if (a7 == 7) {
            i7 |= 1;
        }
        return i7 & 273;
    }

    public int e() {
        return this.f9733a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f9734b == audioAttributesImplBase.c() && this.f9735c == audioAttributesImplBase.d() && this.f9733a == audioAttributesImplBase.e() && this.f9736d == audioAttributesImplBase.f9736d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9734b), Integer.valueOf(this.f9735c), Integer.valueOf(this.f9733a), Integer.valueOf(this.f9736d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f9736d != -1) {
            sb.append(" stream=");
            sb.append(this.f9736d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.f9733a));
        sb.append(" content=");
        sb.append(this.f9734b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9735c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i7, int i8, int i9, int i10) {
        this.f9734b = i7;
        this.f9735c = i8;
        this.f9733a = i9;
        this.f9736d = i10;
    }
}
