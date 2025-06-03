/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$AudioCapabilities
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.util.Pair
 *  android.util.Range
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package t0;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import android.util.Range;
import d0.h;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.o;
import t0.I;
import t0.v;

public final class p {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public p(String string2, String string3, String string4, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.a = (String)a.e(string2);
        this.b = string3;
        this.c = string4;
        this.d = codecCapabilities;
        this.h = bl;
        this.i = bl2;
        this.j = bl3;
        this.e = bl4;
        this.f = bl5;
        this.g = bl6;
        this.k = z.s(string3);
    }

    public static boolean A(String string2, int n8) {
        if ("video/hevc".equals((Object)string2) && 2 == n8 && ("sailfish".equals((Object)(string2 = M.b)) || "marlin".equals((Object)string2))) {
            return true;
        }
        return false;
    }

    public static boolean B(String string2) {
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals((Object)string2) && "mcv5a".equals((Object)M.b)) {
            return false;
        }
        return true;
    }

    public static p C(String string2, String string3, String string4, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        bl4 = !bl4 && codecCapabilities != null && p.h(codecCapabilities) && !p.z(string2);
        boolean bl6 = codecCapabilities != null && p.s(codecCapabilities);
        bl5 = bl5 || codecCapabilities != null && p.q(codecCapabilities);
        return new p(string2, string3, string4, codecCapabilities, bl, bl2, bl3, bl4, bl6, bl5);
    }

    public static int a(String string2, String string3, int n8) {
        if (n8 <= 1) {
            if (M.a >= 26 && n8 > 0) {
                return n8;
            }
            if (!("audio/mpeg".equals((Object)string3) || "audio/3gpp".equals((Object)string3) || "audio/amr-wb".equals((Object)string3) || "audio/mp4a-latm".equals((Object)string3) || "audio/vorbis".equals((Object)string3) || "audio/opus".equals((Object)string3) || "audio/raw".equals((Object)string3) || "audio/flac".equals((Object)string3) || "audio/g711-alaw".equals((Object)string3) || "audio/g711-mlaw".equals((Object)string3))) {
                if ("audio/gsm".equals((Object)string3)) {
                    return n8;
                }
                int n9 = "audio/ac3".equals((Object)string3) ? 6 : ("audio/eac3".equals((Object)string3) ? 16 : 30);
                string3 = new StringBuilder();
                string3.append("AssumedMaxChannelAdjustment: ");
                string3.append(string2);
                string3.append(", [");
                string3.append(n8);
                string3.append(" to ");
                string3.append(n9);
                string3.append("]");
                o.h("MediaCodecInfo", string3.toString());
                return n9;
            }
        }
        return n8;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9) {
        int n10 = videoCapabilities.getWidthAlignment();
        int n11 = videoCapabilities.getHeightAlignment();
        return new Point(M.k(n8, n10) * n10, M.k(n9, n11) * n11);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9, double d8) {
        Point point = p.c(videoCapabilities, n8, n9);
        n8 = point.x;
        n9 = point.y;
        if (d8 != -1.0 && d8 >= 1.0) {
            return videoCapabilities.areSizeAndRateSupported(n8, n9, Math.floor((double)d8));
        }
        return videoCapabilities.isSizeSupported(n8, n9);
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int n8 = codecCapabilities != null && (codecCapabilities = codecCapabilities.getVideoCapabilities()) != null ? (Integer)codecCapabilities.getBitrateRange().getUpper() : 0;
        n8 = n8 >= 180000000 ? 1024 : (n8 >= 120000000 ? 512 : (n8 >= 60000000 ? 256 : (n8 >= 30000000 ? 128 : (n8 >= 18000000 ? 64 : (n8 >= 12000000 ? 32 : (n8 >= 7200000 ? 16 : (n8 >= 3600000 ? 8 : (n8 >= 1800000 ? 4 : (n8 >= 800000 ? 2 : 1)))))))));
        codecCapabilities = new MediaCodecInfo.CodecProfileLevel();
        codecCapabilities.profile = 1;
        codecCapabilities.level = n8;
        return new MediaCodecInfo.CodecProfileLevel[]{codecCapabilities};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (M.a >= 21 && p.r(codecCapabilities)) {
            return true;
        }
        return false;
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (M.a >= 21 && p.t(codecCapabilities)) {
            return true;
        }
        return false;
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String string2) {
        return "audio/opus".equals((Object)string2);
    }

    public static boolean y(String string2) {
        if (M.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static boolean z(String string2) {
        String string3;
        if (M.a <= 22 && ("ODROID-XU3".equals((Object)(string3 = M.d)) || "Nexus 10".equals((Object)string3)) && ("OMX.Exynos.AVC.Decoder".equals((Object)string2) || "OMX.Exynos.AVC.Decoder.secure".equals((Object)string2))) {
            return true;
        }
        return false;
    }

    public Point b(int n8, int n9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            return null;
        }
        if ((codecCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return p.c((MediaCodecInfo.VideoCapabilities)codecCapabilities, n8, n9);
    }

    public k0.p e(q q8, q q9) {
        int n8;
        block27 : {
            int n9;
            block22 : {
                block26 : {
                    block25 : {
                        block23 : {
                            block24 : {
                                n9 = !M.c(q8.n, q9.n) ? 8 : 0;
                                if (!this.k) break block22;
                                n8 = n9;
                                if (q8.w != q9.w) {
                                    n8 = n9 | 1024;
                                }
                                n9 = n8;
                                if (this.e) break block23;
                                if (q8.t != q9.t) break block24;
                                n9 = n8;
                                if (q8.u == q9.u) break block23;
                            }
                            n9 = n8 | 512;
                        }
                        if (!h.h(q8.A)) break block25;
                        n8 = n9;
                        if (h.h(q9.A)) break block26;
                    }
                    n8 = n9;
                    if (!M.c(q8.A, q9.A)) {
                        n8 = n9 | 2048;
                    }
                }
                n9 = n8;
                if (p.y(this.a)) {
                    n9 = n8;
                    if (!q8.e(q9)) {
                        n9 = n8 | 2;
                    }
                }
                n8 = n9;
                if (n9 == 0) {
                    String string2 = this.a;
                    n9 = q8.e(q9) ? 3 : 2;
                    return new k0.p(string2, q8, q9, n9, 0);
                }
                break block27;
            }
            n8 = n9;
            if (q8.B != q9.B) {
                n8 = n9 | 4096;
            }
            int n10 = n8;
            if (q8.C != q9.C) {
                n10 = n8 | 8192;
            }
            n9 = n10;
            if (q8.D != q9.D) {
                n9 = n10 | 16384;
            }
            if (n9 == 0 && "audio/mp4a-latm".equals((Object)this.b)) {
                Pair pair = I.r(q8);
                Pair pair2 = I.r(q9);
                if (pair != null && pair2 != null) {
                    n8 = (Integer)pair.first;
                    n10 = (Integer)pair2.first;
                    if (n8 == 42 && n10 == 42) {
                        return new k0.p(this.a, q8, q9, 3, 0);
                    }
                }
            }
            n8 = n9;
            if (!q8.e(q9)) {
                n8 = n9 | 32;
            }
            n9 = n8;
            if (p.x(this.b)) {
                n9 = n8 | 2;
            }
            n8 = n9;
            if (n9 == 0) {
                return new k0.p(this.a, q8, q9, 1, 0);
            }
        }
        return new k0.p(this.a, q8, q9, 0, n8);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel;
        block3 : {
            block2 : {
                arrcodecProfileLevel = this.d;
                if (arrcodecProfileLevel == null) break block2;
                MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel2 = arrcodecProfileLevel.profileLevels;
                arrcodecProfileLevel = arrcodecProfileLevel2;
                if (arrcodecProfileLevel2 != null) break block3;
            }
            arrcodecProfileLevel = new MediaCodecInfo.CodecProfileLevel[]{};
        }
        return arrcodecProfileLevel;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean i(int n8) {
        Object object = this.d;
        if (object == null) {
            object = "channelCount.caps";
        } else if ((object = object.getAudioCapabilities()) == null) {
            object = "channelCount.aCaps";
        } else {
            if (p.a(this.a, this.b, object.getMaxInputChannelCount()) >= n8) {
                return true;
            }
            object = new StringBuilder();
            object.append("channelCount.support, ");
            object.append(n8);
            object = object.toString();
        }
        this.w((String)object);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean j(int n8) {
        Object object = this.d;
        if (object == null) {
            object = "sampleRate.caps";
        } else if ((object = object.getAudioCapabilities()) == null) {
            object = "sampleRate.aCaps";
        } else {
            if (object.isSampleRateSupported(n8)) {
                return true;
            }
            object = new StringBuilder();
            object.append("sampleRate.support, ");
            object.append(n8);
            object = object.toString();
        }
        this.w((String)object);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k(q q8, boolean bl) {
        int n8;
        MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel;
        int n9;
        MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel2;
        int n10;
        int n11;
        block11 : {
            block13 : {
                block12 : {
                    arrcodecProfileLevel2 = I.r(q8);
                    if (arrcodecProfileLevel2 == null) {
                        return true;
                    }
                    n8 = (Integer)arrcodecProfileLevel2.first;
                    n10 = n11 = ((Integer)arrcodecProfileLevel2.second).intValue();
                    n9 = n8;
                    if (!"video/dolby-vision".equals((Object)q8.n)) break block11;
                    if (!"video/avc".equals((Object)this.b)) break block12;
                    n9 = 8;
                    break block13;
                }
                n10 = n11;
                n9 = n8;
                if (!"video/hevc".equals((Object)this.b)) break block11;
                n9 = 2;
            }
            n10 = 0;
        }
        if (!this.k && n9 != 42) {
            return true;
        }
        arrcodecProfileLevel2 = arrcodecProfileLevel = this.g();
        if (M.a <= 23) {
            arrcodecProfileLevel2 = arrcodecProfileLevel;
            if ("video/x-vnd.on2.vp9".equals((Object)this.b)) {
                arrcodecProfileLevel2 = arrcodecProfileLevel;
                if (arrcodecProfileLevel.length == 0) {
                    arrcodecProfileLevel2 = p.f(this.d);
                }
            }
        }
        n11 = arrcodecProfileLevel2.length;
        n8 = 0;
        do {
            if (n8 >= n11) {
                arrcodecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel[]();
                arrcodecProfileLevel2.append("codec.profileLevel, ");
                arrcodecProfileLevel2.append(q8.j);
                arrcodecProfileLevel2.append(", ");
                arrcodecProfileLevel2.append(this.c);
                this.w(arrcodecProfileLevel2.toString());
                return false;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = arrcodecProfileLevel2[n8];
            if (!(codecProfileLevel.profile != n9 || codecProfileLevel.level < n10 && bl || p.A(this.b, n9))) {
                return true;
            }
            ++n8;
        } while (true);
    }

    public boolean l(q q8) {
        boolean bl;
        boolean bl2 = this.o(q8);
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (this.k(q8, false)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public boolean m(q q8) {
        boolean bl;
        block13 : {
            block11 : {
                int n8;
                boolean bl2;
                block12 : {
                    boolean bl3 = this.o(q8);
                    bl2 = false;
                    bl = false;
                    if (!bl3) {
                        return false;
                    }
                    if (!this.k(q8, true)) {
                        return false;
                    }
                    if (this.k) {
                        int n9 = q8.t;
                        if (n9 > 0) {
                            int n10 = q8.u;
                            if (n10 <= 0) {
                                return true;
                            }
                            if (M.a >= 21) {
                                return this.u(n9, n10, q8.v);
                            }
                            if (n9 * n10 <= I.P()) {
                                bl = true;
                            }
                            if (!bl) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("legacyFrameSize, ");
                                stringBuilder.append(q8.t);
                                stringBuilder.append("x");
                                stringBuilder.append(q8.u);
                                this.w(stringBuilder.toString());
                            }
                            return bl;
                        }
                        return true;
                    }
                    if (M.a < 21) break block11;
                    n8 = q8.C;
                    if (n8 == -1) break block12;
                    bl = bl2;
                    if (!this.j(n8)) break block13;
                }
                if ((n8 = q8.B) == -1) break block11;
                bl = bl2;
                if (!this.i(n8)) break block13;
            }
            bl = true;
        }
        return bl;
    }

    public boolean n() {
        if (M.a >= 29 && "video/x-vnd.on2.vp9".equals((Object)this.b)) {
            MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel = this.g();
            int n8 = arrcodecProfileLevel.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (arrcodecProfileLevel[i8].profile != 16384) continue;
                return true;
            }
        }
        return false;
    }

    public final boolean o(q q8) {
        if (!this.b.equals((Object)q8.n) && !this.b.equals((Object)I.m(q8))) {
            return false;
        }
        return true;
    }

    public boolean p(q q8) {
        if (this.k) {
            return this.e;
        }
        if ((q8 = I.r(q8)) != null && (Integer)q8.first == 42) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean u(int var1_1, int var2_2, double var3_3) {
        block5 : {
            block6 : {
                block4 : {
                    var6_4 = this.d;
                    if (var6_4 != null) break block4;
                    var6_4 = "sizeAndRate.caps";
                    break block5;
                }
                if ((var6_4 = var6_4.getVideoCapabilities()) != null) break block6;
                var6_4 = "sizeAndRate.vCaps";
                break block5;
            }
            if (M.a < 29) ** GOTO lbl-1000
            var5_5 = v.c((MediaCodecInfo.VideoCapabilities)var6_4, var1_1, var2_2, var3_3);
            if (var5_5 == 2) {
                return true;
            }
            if (var5_5 == 1) {
                var6_4 = new StringBuilder();
                var7_6 = "sizeAndRate.cover, ";
            } else lbl-1000: // 2 sources:
            {
                if (p.d((MediaCodecInfo.VideoCapabilities)var6_4, var1_1, var2_2, var3_3) != false) return true;
                if (var1_1 < var2_2 && p.B(this.a) && p.d((MediaCodecInfo.VideoCapabilities)var6_4, var2_2, var1_1, var3_3)) {
                    var6_4 = new StringBuilder();
                    var6_4.append("sizeAndRate.rotated, ");
                    var6_4.append(var1_1);
                    var6_4.append("x");
                    var6_4.append(var2_2);
                    var6_4.append("@");
                    var6_4.append(var3_3);
                    this.v(var6_4.toString());
                    return true;
                }
                var6_4 = new StringBuilder();
                var7_6 = "sizeAndRate.support, ";
            }
            var6_4.append(var7_6);
            var6_4.append(var1_1);
            var6_4.append("x");
            var6_4.append(var2_2);
            var6_4.append("@");
            var6_4.append(var3_3);
            var6_4 = var6_4.toString();
        }
        this.w((String)var6_4);
        return false;
    }

    public final void v(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssumedSupport [");
        stringBuilder.append(string2);
        stringBuilder.append("] [");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [");
        stringBuilder.append(M.e);
        stringBuilder.append("]");
        o.b("MediaCodecInfo", stringBuilder.toString());
    }

    public final void w(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NoSupport [");
        stringBuilder.append(string2);
        stringBuilder.append("] [");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [");
        stringBuilder.append(M.e);
        stringBuilder.append("]");
        o.b("MediaCodecInfo", stringBuilder.toString());
    }
}

