package t0;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d0.AbstractC1203z;
import d0.C1185h;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import k0.C1429p;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f19482a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19483b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19484c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f19485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19486e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19487f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19488g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19489h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19490i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19491j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19492k;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f19482a = (String) AbstractC1297a.e(str);
        this.f19483b = str2;
        this.f19484c = str3;
        this.f19485d = codecCapabilities;
        this.f19489h = z7;
        this.f19490i = z8;
        this.f19491j = z9;
        this.f19486e = z10;
        this.f19487f = z11;
        this.f19488g = z12;
        this.f19492k = AbstractC1203z.s(str2);
    }

    public static boolean A(String str, int i7) {
        if ("video/hevc".equals(str) && 2 == i7) {
            String str2 = M.f14262b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(M.f14262b)) ? false : true;
    }

    public static p C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new p(str, str2, str3, codecCapabilities, z7, z8, z9, (z10 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z11 || (codecCapabilities != null && q(codecCapabilities)));
    }

    public static int a(String str, String str2, int i7) {
        if (i7 > 1 || ((M.f14261a >= 26 && i7 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i7;
        }
        int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        g0.o.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i7 + " to " + i8 + "]");
        return i8;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(M.k(i7, widthAlignment) * widthAlignment, M.k(i8, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point c7 = c(videoCapabilities, i7, i8);
        int i9 = c7.x;
        int i10 = c7.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i7 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i7;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return M.f14261a >= 21 && r(codecCapabilities);
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return M.f14261a >= 21 && t(codecCapabilities);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean y(String str) {
        return M.f14264d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean z(String str) {
        if (M.f14261a <= 22) {
            String str2 = M.f14264d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19485d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i7, i8);
    }

    public C1429p e(C1194q c1194q, C1194q c1194q2) {
        int i7 = !M.c(c1194q.f12726n, c1194q2.f12726n) ? 8 : 0;
        if (this.f19492k) {
            if (c1194q.f12735w != c1194q2.f12735w) {
                i7 |= 1024;
            }
            if (!this.f19486e && (c1194q.f12732t != c1194q2.f12732t || c1194q.f12733u != c1194q2.f12733u)) {
                i7 |= 512;
            }
            if ((!C1185h.h(c1194q.f12701A) || !C1185h.h(c1194q2.f12701A)) && !M.c(c1194q.f12701A, c1194q2.f12701A)) {
                i7 |= 2048;
            }
            if (y(this.f19482a) && !c1194q.e(c1194q2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C1429p(this.f19482a, c1194q, c1194q2, c1194q.e(c1194q2) ? 3 : 2, 0);
            }
        } else {
            if (c1194q.f12702B != c1194q2.f12702B) {
                i7 |= 4096;
            }
            if (c1194q.f12703C != c1194q2.f12703C) {
                i7 |= 8192;
            }
            if (c1194q.f12704D != c1194q2.f12704D) {
                i7 |= 16384;
            }
            if (i7 == 0 && "audio/mp4a-latm".equals(this.f19483b)) {
                Pair r7 = AbstractC1968I.r(c1194q);
                Pair r8 = AbstractC1968I.r(c1194q2);
                if (r7 != null && r8 != null) {
                    int intValue = ((Integer) r7.first).intValue();
                    int intValue2 = ((Integer) r8.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C1429p(this.f19482a, c1194q, c1194q2, 3, 0);
                    }
                }
            }
            if (!c1194q.e(c1194q2)) {
                i7 |= 32;
            }
            if (x(this.f19483b)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C1429p(this.f19482a, c1194q, c1194q2, 1, 0);
            }
        }
        return new C1429p(this.f19482a, c1194q, c1194q2, 0, i7);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19485d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19485d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (a(this.f19482a, this.f19483b, audioCapabilities.getMaxInputChannelCount()) >= i7) {
                    return true;
                }
                str = "channelCount.support, " + i7;
            }
        }
        w(str);
        return false;
    }

    public boolean j(int i7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19485d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i7)) {
                    return true;
                }
                str = "sampleRate.support, " + i7;
            }
        }
        w(str);
        return false;
    }

    public final boolean k(C1194q c1194q, boolean z7) {
        Pair r7 = AbstractC1968I.r(c1194q);
        if (r7 == null) {
            return true;
        }
        int intValue = ((Integer) r7.first).intValue();
        int intValue2 = ((Integer) r7.second).intValue();
        if ("video/dolby-vision".equals(c1194q.f12726n)) {
            if (!"video/avc".equals(this.f19483b)) {
                intValue = "video/hevc".equals(this.f19483b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f19492k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g7 = g();
        if (M.f14261a <= 23 && "video/x-vnd.on2.vp9".equals(this.f19483b) && g7.length == 0) {
            g7 = f(this.f19485d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g7) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z7) && !A(this.f19483b, intValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + c1194q.f12722j + ", " + this.f19484c);
        return false;
    }

    public boolean l(C1194q c1194q) {
        return o(c1194q) && k(c1194q, false);
    }

    public boolean m(C1194q c1194q) {
        int i7;
        if (!o(c1194q) || !k(c1194q, true)) {
            return false;
        }
        if (!this.f19492k) {
            if (M.f14261a >= 21) {
                int i8 = c1194q.f12703C;
                if (i8 != -1 && !j(i8)) {
                    return false;
                }
                int i9 = c1194q.f12702B;
                if (i9 != -1 && !i(i9)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = c1194q.f12732t;
        if (i10 <= 0 || (i7 = c1194q.f12733u) <= 0) {
            return true;
        }
        if (M.f14261a >= 21) {
            return u(i10, i7, c1194q.f12734v);
        }
        boolean z7 = i10 * i7 <= AbstractC1968I.P();
        if (!z7) {
            w("legacyFrameSize, " + c1194q.f12732t + "x" + c1194q.f12733u);
        }
        return z7;
    }

    public boolean n() {
        if (M.f14261a >= 29 && "video/x-vnd.on2.vp9".equals(this.f19483b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(C1194q c1194q) {
        return this.f19483b.equals(c1194q.f12726n) || this.f19483b.equals(AbstractC1968I.m(c1194q));
    }

    public boolean p(C1194q c1194q) {
        if (this.f19492k) {
            return this.f19486e;
        }
        Pair r7 = AbstractC1968I.r(c1194q);
        return r7 != null && ((Integer) r7.first).intValue() == 42;
    }

    public String toString() {
        return this.f19482a;
    }

    public boolean u(int i7, int i8, double d7) {
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19485d;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (M.f14261a >= 29) {
                    int c7 = v.c(videoCapabilities, i7, i8, d7);
                    if (c7 == 2) {
                        return true;
                    }
                    if (c7 == 1) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb.append(str);
                        sb.append(i7);
                        sb.append("x");
                        sb.append(i8);
                        sb.append("@");
                        sb.append(d7);
                        sb2 = sb.toString();
                    }
                }
                if (!d(videoCapabilities, i7, i8, d7)) {
                    if (i7 < i8 && B(this.f19482a) && d(videoCapabilities, i8, i7, d7)) {
                        v("sizeAndRate.rotated, " + i7 + "x" + i8 + "@" + d7);
                    } else {
                        sb = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i7);
                        sb.append("x");
                        sb.append(i8);
                        sb.append("@");
                        sb.append(d7);
                        sb2 = sb.toString();
                    }
                }
                return true;
            }
            sb2 = "sizeAndRate.vCaps";
        }
        w(sb2);
        return false;
    }

    public final void v(String str) {
        g0.o.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f19482a + ", " + this.f19483b + "] [" + M.f14265e + "]");
    }

    public final void w(String str) {
        g0.o.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f19482a + ", " + this.f19483b + "] [" + M.f14265e + "]");
    }
}
