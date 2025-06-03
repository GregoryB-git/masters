package androidx.media;

import defpackage.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f1023a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1024b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1025c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1026d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f1026d;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f1025c, this.f1023a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1024b != audioAttributesImplBase.f1024b) {
            return false;
        }
        int i10 = this.f1025c;
        int i11 = audioAttributesImplBase.f1025c;
        int a10 = audioAttributesImplBase.a();
        if (a10 == 6) {
            i11 |= 4;
        } else if (a10 == 7) {
            i11 |= 1;
        }
        return i10 == (i11 & 273) && this.f1023a == audioAttributesImplBase.f1023a && this.f1026d == audioAttributesImplBase.f1026d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1024b), Integer.valueOf(this.f1025c), Integer.valueOf(this.f1023a), Integer.valueOf(this.f1026d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1026d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1026d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f1023a;
        int i11 = AudioAttributesCompat.f1018b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = f.h("unknown usage ", i10);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f1024b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1025c).toUpperCase());
        return sb2.toString();
    }
}
