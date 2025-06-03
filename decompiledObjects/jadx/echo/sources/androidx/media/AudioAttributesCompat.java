package androidx.media;

import N4.h;
import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import com.android.installreferrer.api.InstallReferrerClient;
import v1.d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final SparseIntArray f9725b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f9726c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9727d;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f9728a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributesImpl.a f9729a;

        public a() {
            this.f9729a = AudioAttributesCompat.f9726c ? new AudioAttributesImplBase.a() : Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.a() : new AudioAttributesImplApi21.a();
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f9729a.a());
        }

        public a b(int i7) {
            this.f9729a.d(i7);
            return this;
        }

        public a c(int i7) {
            this.f9729a.c(i7);
            return this;
        }

        public a d(int i7) {
            this.f9729a.b(i7);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9725b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f9727d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f9728a = audioAttributesImpl;
    }

    public static int c(boolean z7, int i7, int i8) {
        if ((i7 & 1) == 1) {
            return z7 ? 1 : 7;
        }
        if ((i7 & 4) == 4) {
            return z7 ? 0 : 6;
        }
        switch (i8) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case 1:
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z7 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 1;
            case 15:
            default:
                if (!z7) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i8 + " in audio attributes");
        }
    }

    public static String e(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i7;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat f(Object obj) {
        if (f9726c) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public int a() {
        return this.f9728a.a();
    }

    public Object d() {
        return this.f9728a.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f9728a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f9728a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f9728a.hashCode();
    }

    public String toString() {
        return this.f9728a.toString();
    }
}
