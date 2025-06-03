package o4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import o7.t;
import v3.i0;
import v5.e0;
import w3.v;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f11853a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<a, List<l>> f11854b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static int f11855c = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f11856a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11857b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f11858c;

        public a(String str, boolean z10, boolean z11) {
            this.f11856a = str;
            this.f11857b = z10;
            this.f11858c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f11856a, aVar.f11856a) && this.f11857b == aVar.f11857b && this.f11858c == aVar.f11858c;
        }

        public final int hashCode() {
            return ((a0.j.e(this.f11856a, 31, 31) + (this.f11857b ? 1231 : 1237)) * 31) + (this.f11858c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        public b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    public interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class d implements c {
        @Override // o4.p.c
        public final MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // o4.p.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // o4.p.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // o4.p.c
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // o4.p.c
        public final boolean e() {
            return false;
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f11859a;

        /* renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f11860b;

        public e(boolean z10, boolean z11) {
            this.f11859a = (z10 || z11) ? 1 : 0;
        }

        @Override // o4.p.c
        public final MediaCodecInfo a(int i10) {
            if (this.f11860b == null) {
                this.f11860b = new MediaCodecList(this.f11859a).getCodecInfos();
            }
            return this.f11860b[i10];
        }

        @Override // o4.p.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // o4.p.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // o4.p.c
        public final int d() {
            if (this.f11860b == null) {
                this.f11860b = new MediaCodecList(this.f11859a).getCodecInfos();
            }
            return this.f11860b.length;
        }

        @Override // o4.p.c
        public final boolean e() {
            return true;
        }
    }

    public interface f<T> {
        int b(T t);
    }

    public static void a(String str, ArrayList arrayList) {
        int i10 = 0;
        if ("audio/raw".equals(str)) {
            if (e0.f15881a < 26 && e0.f15882b.equals("R9") && arrayList.size() == 1 && ((l) arrayList.get(0)).f11804a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(l.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new o(new e0.e(13), i10));
        }
        int i11 = e0.f15881a;
        if (i11 < 21 && arrayList.size() > 1) {
            String str2 = ((l) arrayList.get(0)).f11804a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new o(new v(8), i10));
            }
        }
        if (i11 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((l) arrayList.get(0)).f11804a)) {
            return;
        }
        arrayList.add((l) arrayList.remove(0));
    }

    public static String b(i0 i0Var) {
        Pair<Integer, Integer> d10;
        if ("audio/eac3-joc".equals(i0Var.t)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(i0Var.t) || (d10 = d(i0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) d10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036a A[Catch: NumberFormatException -> 0x0379, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0379, blocks: (B:197:0x0328, B:199:0x033a, B:211:0x0358, B:219:0x036a), top: B:196:0x0328 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(v3.i0 r17) {
        /*
            Method dump skipped, instructions count: 2394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.p.d(v3.i0):android.util.Pair");
    }

    public static synchronized List<l> e(String str, boolean z10, boolean z11) {
        synchronized (p.class) {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<l>> hashMap = f11854b;
            List<l> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i10 = e0.f15881a;
            ArrayList<l> f10 = f(aVar, i10 >= 21 ? new e(z10, z11) : new d());
            if (z10 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(aVar, new d());
                if (!f10.isEmpty()) {
                    v5.m.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + f10.get(0).f11804a);
                }
            }
            a(str, f10);
            t p10 = t.p(f10);
            hashMap.put(aVar, p10);
            return p10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|(1:34)(1:96)|35|(1:37)(3:87|(1:95)(1:93)|94)|(4:(2:81|82)|61|(9:64|65|66|67|68|69|70|72|73)|14)|41|42|43|44|14) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
    
        v5.m.c("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c8, code lost:
    
        if (r1.f11857b == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[Catch: Exception -> 0x018a, TryCatch #2 {Exception -> 0x018a, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:14:0x015d, B:15:0x0034, B:18:0x003f, B:47:0x0136, B:50:0x013e, B:52:0x0144, B:55:0x0165, B:56:0x0188), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e A[Catch: Exception -> 0x018a, TRY_ENTER, TryCatch #2 {Exception -> 0x018a, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:14:0x015d, B:15:0x0034, B:18:0x003f, B:47:0x0136, B:50:0x013e, B:52:0x0144, B:55:0x0165, B:56:0x0188), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<o4.l> f(o4.p.a r24, o4.p.c r25) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.p.f(o4.p$a, o4.p$c):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = e0.f15881a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = e0.f15882b;
            if ("a70".equals(str3) || ("Xiaomi".equals(e0.f15883c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = e0.f15882b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = e0.f15882b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(e0.f15883c))) {
            String str6 = e0.f15882b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(e0.f15883c)) {
            String str7 = e0.f15882b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && e0.f15882b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (e0.f15881a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (v5.p.k(str)) {
            return true;
        }
        String x02 = x6.b.x0(mediaCodecInfo.getName());
        if (x02.startsWith("arc.")) {
            return false;
        }
        if (x02.startsWith("omx.google.") || x02.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((x02.startsWith("omx.sec.") && x02.contains(".sw.")) || x02.equals("omx.qcom.video.decoder.hevcswvdec") || x02.startsWith("c2.android.") || x02.startsWith("c2.google.")) {
            return true;
        }
        return (x02.startsWith("omx.") || x02.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f11855c == -1) {
            int i11 = 0;
            List<l> e10 = e("video/avc", false, false);
            l lVar = e10.isEmpty() ? null : e10.get(0);
            if (lVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = lVar.f11807d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, e0.f15881a >= 21 ? 345600 : 172800);
            }
            f11855c = i11;
        }
        return f11855c;
    }
}
