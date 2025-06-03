package t0;

import X2.AbstractC0703v;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import d0.AbstractC1203z;
import d0.C1185h;
import d0.C1194q;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t0.AbstractC1968I;

/* renamed from: t0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1968I {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19410a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19411b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f19412c = -1;

    /* renamed from: t0.I$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f19413a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19414b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19415c;

        public b(String str, boolean z7, boolean z8) {
            this.f19413a = str;
            this.f19414b = z7;
            this.f19415c = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f19413a, bVar.f19413a) && this.f19414b == bVar.f19414b && this.f19415c == bVar.f19415c;
        }

        public int hashCode() {
            return ((((this.f19413a.hashCode() + 31) * 31) + (this.f19414b ? 1231 : 1237)) * 31) + (this.f19415c ? 1231 : 1237);
        }
    }

    /* renamed from: t0.I$c */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: t0.I$d */
    public interface d {
        MediaCodecInfo a(int i7);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int c();

        boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean e();
    }

    /* renamed from: t0.I$e */
    public static final class e implements d {
        public e() {
        }

        @Override // t0.AbstractC1968I.d
        public MediaCodecInfo a(int i7) {
            return MediaCodecList.getCodecInfoAt(i7);
        }

        @Override // t0.AbstractC1968I.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // t0.AbstractC1968I.d
        public int c() {
            return MediaCodecList.getCodecCount();
        }

        @Override // t0.AbstractC1968I.d
        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // t0.AbstractC1968I.d
        public boolean e() {
            return false;
        }
    }

    /* renamed from: t0.I$f */
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f19416a;

        /* renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f19417b;

        public f(boolean z7, boolean z8) {
            this.f19416a = (z7 || z8) ? 1 : 0;
        }

        @Override // t0.AbstractC1968I.d
        public MediaCodecInfo a(int i7) {
            f();
            return this.f19417b[i7];
        }

        @Override // t0.AbstractC1968I.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // t0.AbstractC1968I.d
        public int c() {
            f();
            return this.f19417b.length;
        }

        @Override // t0.AbstractC1968I.d
        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // t0.AbstractC1968I.d
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f19417b == null) {
                this.f19417b = new MediaCodecList(this.f19416a).getCodecInfos();
            }
        }
    }

    /* renamed from: t0.I$g */
    public interface g {
        int a(Object obj);
    }

    public static Pair A(String str, String[] strArr) {
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int T6;
        String str2;
        if (strArr.length >= 3) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
                T6 = T(parseInt);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (T6 == -1) {
                str2 = "Unknown VP9 profile: " + parseInt;
                g0.o.h("MediaCodecUtil", str2);
                return null;
            }
            int S6 = S(parseInt2);
            if (S6 != -1) {
                return new Pair(Integer.valueOf(T6), Integer.valueOf(S6));
            }
            sb = new StringBuilder();
            sb.append("Unknown VP9 level: ");
            sb.append(parseInt2);
            str2 = sb.toString();
            g0.o.h("MediaCodecUtil", str2);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        str2 = sb.toString();
        g0.o.h("MediaCodecUtil", str2);
        return null;
    }

    public static Integer B(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                i7 = 32;
                break;
            case "H90":
                i7 = 128;
                break;
            case "H93":
                i7 = 512;
                break;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                i7 = 64;
                break;
            case "L93":
                i7 = 256;
                break;
            case "H120":
                i7 = 2048;
                break;
            case "H123":
                i7 = 8192;
                break;
            case "H150":
                i7 = 32768;
                break;
            case "H153":
                i7 = 131072;
                break;
            case "H156":
                i7 = 524288;
                break;
            case "H180":
                i7 = 2097152;
                break;
            case "H183":
                i7 = 8388608;
                break;
            case "H186":
                i7 = 33554432;
                break;
            case "L120":
                i7 = 1024;
                break;
            case "L123":
                i7 = 4096;
                break;
            case "L150":
                i7 = 16384;
                break;
            case "L153":
                i7 = 65536;
                break;
            case "L156":
                i7 = 262144;
                break;
            case "L180":
                i7 = 1048576;
                break;
            case "L183":
                i7 = 4194304;
                break;
            case "L186":
                i7 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return M.f14261a >= 29 && D(mediaCodecInfo);
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z7, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z7 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = M.f14261a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(M.f14263c))) {
            String str3 = M.f14262b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i7 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(M.f14263c)) {
            String str4 = M.f14262b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i7 == 19 && M.f14262b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return M.f14261a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    public static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (M.f14261a >= 29) {
            return I(mediaCodecInfo);
        }
        if (AbstractC1203z.o(str)) {
            return true;
        }
        String e7 = W2.c.e(mediaCodecInfo.getName());
        if (e7.startsWith("arc.")) {
            return false;
        }
        if (e7.startsWith("omx.google.") || e7.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e7.startsWith("omx.sec.") && e7.contains(".sw.")) || e7.equals("omx.qcom.video.decoder.hevcswvdec") || e7.startsWith("c2.android.") || e7.startsWith("c2.google.")) {
            return true;
        }
        return (e7.startsWith("omx.") || e7.startsWith("c2.")) ? false : true;
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    public static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (M.f14261a >= 29) {
            return K(mediaCodecInfo);
        }
        String e7 = W2.c.e(mediaCodecInfo.getName());
        return (e7.startsWith("omx.google.") || e7.startsWith("c2.android.") || e7.startsWith("c2.google.")) ? false : true;
    }

    public static boolean K(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    public static /* synthetic */ int L(p pVar) {
        String str = pVar.f19482a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (M.f14261a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int M(p pVar) {
        return pVar.f19482a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int N(C1194q c1194q, p pVar) {
        return pVar.l(c1194q) ? 1 : 0;
    }

    public static /* synthetic */ int O(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int P() {
        if (f19412c == -1) {
            int i7 = 0;
            p s7 = s("video/avc", false, false);
            if (s7 != null) {
                MediaCodecInfo.CodecProfileLevel[] g7 = s7.g();
                int length = g7.length;
                int i8 = 0;
                while (i7 < length) {
                    i8 = Math.max(h(g7[i7].level), i8);
                    i7++;
                }
                i7 = Math.max(i8, M.f14261a >= 21 ? 345600 : 172800);
            }
            f19412c = i7;
        }
        return f19412c;
    }

    public static int Q(int i7) {
        int i8 = 17;
        if (i7 != 17) {
            i8 = 20;
            if (i7 != 20) {
                i8 = 23;
                if (i7 != 23) {
                    i8 = 29;
                    if (i7 != 29) {
                        i8 = 39;
                        if (i7 != 39) {
                            i8 = 42;
                            if (i7 != 42) {
                                switch (i7) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i8;
    }

    public static void R(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: t0.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int O6;
                O6 = AbstractC1968I.O(AbstractC1968I.g.this, obj, obj2);
                return O6;
            }
        });
    }

    public static int S(int i7) {
        if (i7 == 10) {
            return 1;
        }
        if (i7 == 11) {
            return 2;
        }
        if (i7 == 20) {
            return 4;
        }
        if (i7 == 21) {
            return 8;
        }
        if (i7 == 30) {
            return 16;
        }
        if (i7 == 31) {
            return 32;
        }
        if (i7 == 40) {
            return 64;
        }
        if (i7 == 41) {
            return 128;
        }
        if (i7 == 50) {
            return 256;
        }
        if (i7 == 51) {
            return 512;
        }
        switch (i7) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int T(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (M.f14261a < 26 && M.f14262b.equals("R9") && list.size() == 1 && ((p) list.get(0)).f19482a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(p.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            R(list, new g() { // from class: t0.E
                @Override // t0.AbstractC1968I.g
                public final int a(Object obj) {
                    int L6;
                    L6 = AbstractC1968I.L((p) obj);
                    return L6;
                }
            });
        }
        int i7 = M.f14261a;
        if (i7 < 21 && list.size() > 1) {
            String str2 = ((p) list.get(0)).f19482a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                R(list, new g() { // from class: t0.F
                    @Override // t0.AbstractC1968I.g
                    public final int a(Object obj) {
                        int M6;
                        M6 = AbstractC1968I.M((p) obj);
                        return M6;
                    }
                });
            }
        }
        if (i7 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((p) list.get(0)).f19482a)) {
            return;
        }
        list.add((p) list.remove(0));
    }

    public static int f(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 4096;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int g(int i7) {
        switch (i7) {
            case 10:
                return 1;
            case 11:
                return 4;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 8;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 16;
            default:
                switch (i7) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i7) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i7) {
                                    case RequestError.NETWORK_FAILURE /* 40 */:
                                        return 2048;
                                    case RequestError.NO_DEV_KEY /* 41 */:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i7) {
                                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i7) {
        if (i7 == 1 || i7 == 2) {
            return 25344;
        }
        switch (i7) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int i(int i7) {
        if (i7 == 66) {
            return 1;
        }
        if (i7 == 77) {
            return 2;
        }
        if (i7 == 88) {
            return 4;
        }
        if (i7 == 100) {
            return 8;
        }
        if (i7 == 110) {
            return 16;
        }
        if (i7 != 122) {
            return i7 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer j(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i7 = 16;
                break;
            case "06":
                i7 = 32;
                break;
            case "07":
                i7 = 64;
                break;
            case "08":
                i7 = 128;
                break;
            case "09":
                i7 = 256;
                break;
            case "10":
                i7 = 512;
                break;
            case "11":
                i7 = 1024;
                break;
            case "12":
                i7 = 2048;
                break;
            case "13":
                i7 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }

    public static Integer k(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i7 = 16;
                break;
            case "05":
                i7 = 32;
                break;
            case "06":
                i7 = 64;
                break;
            case "07":
                i7 = 128;
                break;
            case "08":
                i7 = 256;
                break;
            case "09":
                i7 = 512;
                break;
            case "10":
                i7 = 1024;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }

    public static Pair l(String str, String[] strArr) {
        int Q6;
        if (strArr.length != 3) {
            g0.o.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(AbstractC1203z.h(Integer.parseInt(strArr[1], 16))) && (Q6 = Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(Q6), 0);
            }
        } catch (NumberFormatException unused) {
            g0.o.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(C1194q c1194q) {
        Pair r7;
        if ("audio/eac3-joc".equals(c1194q.f12726n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c1194q.f12726n) || (r7 = r(c1194q)) == null) {
            return null;
        }
        int intValue = ((Integer) r7.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static List n(z zVar, C1194q c1194q, boolean z7, boolean z8) {
        String m7 = m(c1194q);
        return m7 == null ? AbstractC0703v.Y() : zVar.a(m7, z7, z8);
    }

    public static Pair o(String str, String[] strArr, C1185h c1185h) {
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int parseInt3;
        StringBuilder sb2;
        int i7;
        String sb3;
        if (strArr.length >= 4) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                parseInt3 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (parseInt != 0) {
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
            } else {
                if (parseInt3 != 8 && parseInt3 != 10) {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(parseInt3);
                    sb3 = sb.toString();
                    g0.o.h("MediaCodecUtil", sb3);
                    return null;
                }
                int i8 = parseInt3 != 8 ? (c1185h == null || !(c1185h.f12631d != null || (i7 = c1185h.f12630c) == 7 || i7 == 6)) ? 2 : 4096 : 1;
                int f7 = f(parseInt2);
                if (f7 != -1) {
                    return new Pair(Integer.valueOf(i8), Integer.valueOf(f7));
                }
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 level: ");
                sb2.append(parseInt2);
            }
            sb3 = sb2.toString();
            g0.o.h("MediaCodecUtil", sb3);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        sb3 = sb.toString();
        g0.o.h("MediaCodecUtil", sb3);
        return null;
    }

    public static Pair p(String str, String[] strArr) {
        StringBuilder sb;
        int parseInt;
        int i7;
        int i8;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i7 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    parseInt = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        g0.o.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    parseInt = Integer.parseInt(strArr[2]);
                    i7 = parseInt2;
                }
                i8 = i(i7);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (i8 == -1) {
                str2 = "Unknown AVC profile: " + i7;
                g0.o.h("MediaCodecUtil", str2);
                return null;
            }
            int g7 = g(parseInt);
            if (g7 != -1) {
                return new Pair(Integer.valueOf(i8), Integer.valueOf(g7));
            }
            sb = new StringBuilder();
            sb.append("Unknown AVC level: ");
            sb.append(parseInt);
            str2 = sb.toString();
            g0.o.h("MediaCodecUtil", str2);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        g0.o.h("MediaCodecUtil", str2);
        return null;
    }

    public static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair r(d0.C1194q r6) {
        /*
            java.lang.String r0 = r6.f12722j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f12726n
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f12722j
            android.util.Pair r6 = y(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f12722j
            android.util.Pair r6 = A(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f12722j
            android.util.Pair r6 = l(r6, r0)
            return r6
        L8a:
            java.lang.String r1 = r6.f12722j
            d0.h r6 = r6.f12701A
            android.util.Pair r6 = z(r1, r0, r6)
            return r6
        L93:
            java.lang.String r6 = r6.f12722j
            android.util.Pair r6 = p(r6, r0)
            return r6
        L9a:
            java.lang.String r1 = r6.f12722j
            d0.h r6 = r6.f12701A
            android.util.Pair r6 = o(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC1968I.r(d0.q):android.util.Pair");
    }

    public static p s(String str, boolean z7, boolean z8) {
        List t7 = t(str, z7, z8);
        if (t7.isEmpty()) {
            return null;
        }
        return (p) t7.get(0);
    }

    public static synchronized List t(String str, boolean z7, boolean z8) {
        synchronized (AbstractC1968I.class) {
            try {
                b bVar = new b(str, z7, z8);
                HashMap hashMap = f19411b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i7 = M.f14261a;
                ArrayList u7 = u(bVar, i7 >= 21 ? new f(z7, z8) : new e());
                if (z7 && u7.isEmpty() && 21 <= i7 && i7 <= 23) {
                    u7 = u(bVar, new e());
                    if (!u7.isEmpty()) {
                        g0.o.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((p) u7.get(0)).f19482a);
                    }
                }
                e(str, u7);
                AbstractC0703v U6 = AbstractC0703v.U(u7);
                hashMap.put(bVar, U6);
                return U6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008c, code lost:
    
        if (r1.f19414b == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0124, B:10:0x002d, B:13:0x0038, B:39:0x00fd, B:42:0x0105, B:44:0x010b, B:47:0x0130, B:48:0x0153), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList u(t0.AbstractC1968I.b r24, t0.AbstractC1968I.d r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC1968I.u(t0.I$b, t0.I$d):java.util.ArrayList");
    }

    public static List v(z zVar, C1194q c1194q, boolean z7, boolean z8) {
        List a7 = zVar.a(c1194q.f12726n, z7, z8);
        return AbstractC0703v.M().j(a7).j(n(zVar, c1194q, z7, z8)).k();
    }

    public static List w(List list, final C1194q c1194q) {
        ArrayList arrayList = new ArrayList(list);
        R(arrayList, new g() { // from class: t0.G
            @Override // t0.AbstractC1968I.g
            public final int a(Object obj) {
                int N6;
                N6 = AbstractC1968I.N(C1194q.this, (p) obj);
                return N6;
            }
        });
        return arrayList;
    }

    public static p x() {
        return s("audio/raw", false, false);
    }

    public static Pair y(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f19410a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer k7 = k(str);
                if (k7 == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer j7 = j(str);
                    if (j7 != null) {
                        return new Pair(k7, j7);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb.append(str2);
                sb.append(str);
                g0.o.h("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed Dolby Vision codec string: ");
        sb.append(str);
        g0.o.h("MediaCodecUtil", sb.toString());
        return null;
    }

    public static Pair z(String str, String[] strArr, C1185h c1185h) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i7 = 1;
            Matcher matcher = f19410a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if (!"2".equals(str)) {
                        sb = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb.append(str2);
                        sb.append(str);
                        g0.o.h("MediaCodecUtil", sb.toString());
                        return null;
                    }
                    i7 = (c1185h == null || c1185h.f12630c != 6) ? 2 : 4096;
                }
                str = strArr[3];
                Integer B7 = B(str);
                if (B7 != null) {
                    return new Pair(Integer.valueOf(i7), B7);
                }
                sb = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb.append(str2);
                sb.append(str);
                g0.o.h("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        g0.o.h("MediaCodecUtil", sb.toString());
        return null;
    }
}
