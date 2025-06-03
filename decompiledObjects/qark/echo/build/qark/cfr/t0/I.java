/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCodecList
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package t0;

import X2.v;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import d0.h;
import d0.q;
import g0.M;
import g0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t0.A;
import t0.B;
import t0.C;
import t0.D;
import t0.E;
import t0.F;
import t0.G;
import t0.H;
import t0.p;
import t0.z;

public abstract class I {
    public static final Pattern a = Pattern.compile((String)"^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pair A(String string2, String[] stringBuilder) {
        block6 : {
            block7 : {
                block4 : {
                    int n8;
                    int n9;
                    int n10;
                    block5 : {
                        block3 : {
                            if (stringBuilder.length >= 3) break block3;
                            stringBuilder = new StringBuilder();
                            break block4;
                        }
                        try {
                            n10 = Integer.parseInt((String)stringBuilder[1]);
                            n8 = Integer.parseInt((String)stringBuilder[2]);
                        }
                        catch (NumberFormatException numberFormatException) {}
                        n9 = I.T(n10);
                        if (n9 != -1) break block5;
                        string2 = new StringBuilder();
                        string2.append("Unknown VP9 profile: ");
                        string2.append(n10);
                        string2 = string2.toString();
                        break block6;
                    }
                    n10 = I.S(n8);
                    if (n10 != -1) {
                        return new Pair((Object)n9, (Object)n10);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown VP9 level: ");
                    stringBuilder.append(n8);
                    break block7;
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append("Ignoring malformed VP9 codec string: ");
                stringBuilder.append(string2);
            }
            string2 = stringBuilder.toString();
        }
        o.h("MediaCodecUtil", string2);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer B(String string2) {
        if (string2 == null) {
            return null;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2312995: {
                if (!string2.equals((Object)"L186")) break;
                n9 = 25;
                break;
            }
            case 2312992: {
                if (!string2.equals((Object)"L183")) break;
                n9 = 24;
                break;
            }
            case 2312989: {
                if (!string2.equals((Object)"L180")) break;
                n9 = 23;
                break;
            }
            case 2312902: {
                if (!string2.equals((Object)"L156")) break;
                n9 = 22;
                break;
            }
            case 2312899: {
                if (!string2.equals((Object)"L153")) break;
                n9 = 21;
                break;
            }
            case 2312896: {
                if (!string2.equals((Object)"L150")) break;
                n9 = 20;
                break;
            }
            case 2312806: {
                if (!string2.equals((Object)"L123")) break;
                n9 = 19;
                break;
            }
            case 2312803: {
                if (!string2.equals((Object)"L120")) break;
                n9 = 18;
                break;
            }
            case 2193831: {
                if (!string2.equals((Object)"H186")) break;
                n9 = 17;
                break;
            }
            case 2193828: {
                if (!string2.equals((Object)"H183")) break;
                n9 = 16;
                break;
            }
            case 2193825: {
                if (!string2.equals((Object)"H180")) break;
                n9 = 15;
                break;
            }
            case 2193738: {
                if (!string2.equals((Object)"H156")) break;
                n9 = 14;
                break;
            }
            case 2193735: {
                if (!string2.equals((Object)"H153")) break;
                n9 = 13;
                break;
            }
            case 2193732: {
                if (!string2.equals((Object)"H150")) break;
                n9 = 12;
                break;
            }
            case 2193642: {
                if (!string2.equals((Object)"H123")) break;
                n9 = 11;
                break;
            }
            case 2193639: {
                if (!string2.equals((Object)"H120")) break;
                n9 = 10;
                break;
            }
            case 74854: {
                if (!string2.equals((Object)"L93")) break;
                n9 = 9;
                break;
            }
            case 74851: {
                if (!string2.equals((Object)"L90")) break;
                n9 = 8;
                break;
            }
            case 74761: {
                if (!string2.equals((Object)"L63")) break;
                n9 = 7;
                break;
            }
            case 74758: {
                if (!string2.equals((Object)"L60")) break;
                n9 = 6;
                break;
            }
            case 74665: {
                if (!string2.equals((Object)"L30")) break;
                n9 = 5;
                break;
            }
            case 71010: {
                if (!string2.equals((Object)"H93")) break;
                n9 = 4;
                break;
            }
            case 71007: {
                if (!string2.equals((Object)"H90")) break;
                n9 = 3;
                break;
            }
            case 70917: {
                if (!string2.equals((Object)"H63")) break;
                n9 = 2;
                break;
            }
            case 70914: {
                if (!string2.equals((Object)"H60")) break;
                n9 = 1;
                break;
            }
            case 70821: {
                if (!string2.equals((Object)"H30")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return null;
            }
            case 25: {
                n9 = 16777216;
                do {
                    return n9;
                    break;
                } while (true);
            }
            case 24: {
                n9 = 4194304;
                return n9;
            }
            case 23: {
                n9 = 1048576;
                return n9;
            }
            case 22: {
                n9 = 262144;
                return n9;
            }
            case 21: {
                n9 = 65536;
                return n9;
            }
            case 20: {
                n9 = 16384;
                return n9;
            }
            case 19: {
                n9 = 4096;
                return n9;
            }
            case 18: {
                n9 = 1024;
                return n9;
            }
            case 17: {
                n9 = 33554432;
                return n9;
            }
            case 16: {
                n9 = 8388608;
                return n9;
            }
            case 15: {
                n9 = 2097152;
                return n9;
            }
            case 14: {
                n9 = 524288;
                return n9;
            }
            case 13: {
                n9 = 131072;
                return n9;
            }
            case 12: {
                n9 = 32768;
                return n9;
            }
            case 11: {
                n9 = 8192;
                return n9;
            }
            case 10: {
                n9 = 2048;
                return n9;
            }
            case 9: {
                n9 = 256;
                return n9;
            }
            case 8: {
                n9 = 64;
                return n9;
            }
            case 7: {
                return 16;
            }
            case 6: {
                return 4;
            }
            case 5: {
                return 1;
            }
            case 4: {
                n9 = 512;
                return n9;
            }
            case 3: {
                n9 = 128;
                return n9;
            }
            case 2: {
                n9 = 32;
                return n9;
            }
            case 1: {
                return 8;
            }
            case 0: 
        }
        return 2;
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (M.a >= 29 && I.D(mediaCodecInfo)) {
            return true;
        }
        return false;
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        return D.a(mediaCodecInfo);
    }

    public static boolean E(MediaCodecInfo object, String string2, boolean bl, String string3) {
        if (!object.isEncoder()) {
            if (!bl && string2.endsWith(".secure")) {
                return false;
            }
            int n8 = M.a;
            if (n8 < 21 && ("CIPAACDecoder".equals((Object)string2) || "CIPMP3Decoder".equals((Object)string2) || "CIPVorbisDecoder".equals((Object)string2) || "CIPAMRNBDecoder".equals((Object)string2) || "AACDecoder".equals((Object)string2) || "MP3Decoder".equals((Object)string2))) {
                return false;
            }
            if (n8 < 24 && ("OMX.SEC.aac.dec".equals((Object)string2) || "OMX.Exynos.AAC.Decoder".equals((Object)string2)) && "samsung".equals((Object)M.c) && ((object = M.b).startsWith("zeroflte") || object.startsWith("zerolte") || object.startsWith("zenlte") || "SC-05G".equals(object) || "marinelteatt".equals(object) || "404SC".equals(object) || "SC-04G".equals(object) || "SCV31".equals(object))) {
                return false;
            }
            if (n8 == 19 && "OMX.SEC.vp8.dec".equals((Object)string2) && "samsung".equals((Object)M.c) && ((object = M.b).startsWith("d2") || object.startsWith("serrano") || object.startsWith("jflte") || object.startsWith("santos") || object.startsWith("t0"))) {
                return false;
            }
            if (n8 == 19 && M.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals((Object)string2)) {
                return false;
            }
            if (n8 <= 23 && "audio/eac3-joc".equals((Object)string3) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals((Object)string2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String string2) {
        if (M.a >= 29) {
            return I.G(mediaCodecInfo);
        }
        return I.H(mediaCodecInfo, string2) ^ true;
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        return B.a(mediaCodecInfo);
    }

    public static boolean H(MediaCodecInfo object, String string2) {
        boolean bl;
        block10 : {
            boolean bl2;
            block11 : {
                if (M.a >= 29) {
                    return I.I((MediaCodecInfo)object);
                }
                bl = d0.z.o(string2);
                bl2 = true;
                if (bl) {
                    return true;
                }
                if ((object = W2.c.e(object.getName())).startsWith("arc.")) {
                    return false;
                }
                bl = bl2;
                if (object.startsWith("omx.google.")) break block10;
                bl = bl2;
                if (object.startsWith("omx.ffmpeg.")) break block10;
                if (!object.startsWith("omx.sec.")) break block11;
                bl = bl2;
                if (object.contains((CharSequence)".sw.")) break block10;
            }
            bl = bl2;
            if (!object.equals((Object)"omx.qcom.video.decoder.hevcswvdec")) {
                bl = bl2;
                if (!object.startsWith("c2.android.")) {
                    bl = bl2;
                    if (!object.startsWith("c2.google.")) {
                        if (!object.startsWith("omx.") && !object.startsWith("c2.")) {
                            return true;
                        }
                        bl = false;
                    }
                }
            }
        }
        return bl;
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo) {
        return A.a(mediaCodecInfo);
    }

    public static boolean J(MediaCodecInfo object) {
        if (M.a >= 29) {
            return I.K((MediaCodecInfo)object);
        }
        if (!((object = W2.c.e(object.getName())).startsWith("omx.google.") || object.startsWith("c2.android.") || object.startsWith("c2.google."))) {
            return true;
        }
        return false;
    }

    public static boolean K(MediaCodecInfo mediaCodecInfo) {
        return C.a(mediaCodecInfo);
    }

    public static /* synthetic */ int L(p object) {
        object = object.a;
        if (!object.startsWith("OMX.google") && !object.startsWith("c2.android")) {
            if (M.a < 26 && object.equals((Object)"OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    public static /* synthetic */ int M(p p8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static /* synthetic */ int N(q q8, p p8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static /* synthetic */ int O(g g8, Object object, Object object2) {
        return g8.a(object2) - g8.a(object);
    }

    public static int P() {
        if (c == -1) {
            int n8 = 0;
            MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel = I.s("video/avc", false, false);
            if (arrcodecProfileLevel != null) {
                int n9;
                arrcodecProfileLevel = arrcodecProfileLevel.g();
                int n10 = arrcodecProfileLevel.length;
                n8 = 0;
                for (n9 = 0; n9 < n10; ++n9) {
                    n8 = Math.max((int)I.h(arrcodecProfileLevel[n9].level), (int)n8);
                }
                n9 = M.a >= 21 ? 345600 : 172800;
                n8 = Math.max((int)n8, (int)n9);
            }
            c = n8;
        }
        return c;
    }

    public static int Q(int n8) {
        int n9 = 17;
        if (n8 != 17) {
            n9 = 20;
            if (n8 != 20) {
                n9 = 23;
                if (n8 != 23) {
                    n9 = 29;
                    if (n8 != 29) {
                        n9 = 39;
                        if (n8 != 39) {
                            n9 = 42;
                            if (n8 != 42) {
                                switch (n8) {
                                    default: {
                                        return -1;
                                    }
                                    case 6: {
                                        return 6;
                                    }
                                    case 5: {
                                        return 5;
                                    }
                                    case 4: {
                                        return 4;
                                    }
                                    case 3: {
                                        return 3;
                                    }
                                    case 2: {
                                        return 2;
                                    }
                                    case 1: 
                                }
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return n9;
    }

    public static void R(List list, g g8) {
        Collections.sort((List)list, (Comparator)new H(g8));
    }

    public static int S(int n8) {
        if (n8 != 10) {
            if (n8 != 11) {
                if (n8 != 20) {
                    if (n8 != 21) {
                        if (n8 != 30) {
                            if (n8 != 31) {
                                if (n8 != 40) {
                                    if (n8 != 41) {
                                        if (n8 != 50) {
                                            if (n8 != 51) {
                                                switch (n8) {
                                                    default: {
                                                        return -1;
                                                    }
                                                    case 62: {
                                                        return 8192;
                                                    }
                                                    case 61: {
                                                        return 4096;
                                                    }
                                                    case 60: 
                                                }
                                                return 2048;
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int T(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return -1;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int a(p p8) {
        return I.M(p8);
    }

    public static /* synthetic */ int b(g g8, Object object, Object object2) {
        return I.O(g8, object, object2);
    }

    public static /* synthetic */ int c(q q8, p p8) {
        return I.N(q8, p8);
    }

    public static /* synthetic */ int d(p p8) {
        return I.L(p8);
    }

    public static void e(String string2, List list) {
        int n8;
        if ("audio/raw".equals((Object)string2)) {
            if (M.a < 26 && M.b.equals((Object)"R9") && list.size() == 1 && ((p)list.get((int)0)).a.equals((Object)"OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add((Object)p.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            I.R(list, new E());
        }
        if ((n8 = M.a) < 21 && list.size() > 1 && ("OMX.SEC.mp3.dec".equals((Object)(string2 = ((p)list.get((int)0)).a)) || "OMX.SEC.MP3.Decoder".equals((Object)string2) || "OMX.brcm.audio.mp3.decoder".equals((Object)string2))) {
            I.R(list, new F());
        }
        if (n8 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals((Object)((p)list.get((int)0)).a)) {
            list.add((Object)((p)list.remove(0)));
        }
    }

    public static int f(int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 23: {
                return 8388608;
            }
            case 22: {
                return 4194304;
            }
            case 21: {
                return 2097152;
            }
            case 20: {
                return 1048576;
            }
            case 19: {
                return 524288;
            }
            case 18: {
                return 262144;
            }
            case 17: {
                return 131072;
            }
            case 16: {
                return 65536;
            }
            case 15: {
                return 32768;
            }
            case 14: {
                return 16384;
            }
            case 13: {
                return 8192;
            }
            case 12: {
                return 4096;
            }
            case 11: {
                return 2048;
            }
            case 10: {
                return 1024;
            }
            case 9: {
                return 512;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 128;
            }
            case 6: {
                return 64;
            }
            case 5: {
                return 32;
            }
            case 4: {
                return 16;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static int g(int n8) {
        switch (n8) {
            default: {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                switch (n8) {
                                    default: {
                                        switch (n8) {
                                            default: {
                                                return -1;
                                            }
                                            case 52: {
                                                return 65536;
                                            }
                                            case 51: {
                                                return 32768;
                                            }
                                            case 50: 
                                        }
                                        return 16384;
                                    }
                                    case 42: {
                                        return 8192;
                                    }
                                    case 41: {
                                        return 4096;
                                    }
                                    case 40: 
                                }
                                return 2048;
                            }
                            case 32: {
                                return 1024;
                            }
                            case 31: {
                                return 512;
                            }
                            case 30: 
                        }
                        return 256;
                    }
                    case 22: {
                        return 128;
                    }
                    case 21: {
                        return 64;
                    }
                    case 20: 
                }
                return 32;
            }
            case 13: {
                return 16;
            }
            case 12: {
                return 8;
            }
            case 11: {
                return 4;
            }
            case 10: 
        }
        return 1;
    }

    public static int h(int n8) {
        if (n8 != 1 && n8 != 2) {
            switch (n8) {
                default: {
                    return -1;
                }
                case 131072: 
                case 262144: 
                case 524288: {
                    return 35651584;
                }
                case 32768: 
                case 65536: {
                    return 9437184;
                }
                case 16384: {
                    return 5652480;
                }
                case 8192: {
                    return 2228224;
                }
                case 2048: 
                case 4096: {
                    return 2097152;
                }
                case 1024: {
                    return 1310720;
                }
                case 512: {
                    return 921600;
                }
                case 128: 
                case 256: {
                    return 414720;
                }
                case 64: {
                    return 202752;
                }
                case 8: 
                case 16: 
                case 32: 
            }
            return 101376;
        }
        return 25344;
    }

    public static int i(int n8) {
        if (n8 != 66) {
            if (n8 != 77) {
                if (n8 != 88) {
                    if (n8 != 100) {
                        if (n8 != 110) {
                            if (n8 != 122) {
                                if (n8 != 244) {
                                    return -1;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer j(String string2) {
        if (string2 == null) {
            return null;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1570: {
                if (!string2.equals((Object)"13")) break;
                n9 = 12;
                break;
            }
            case 1569: {
                if (!string2.equals((Object)"12")) break;
                n9 = 11;
                break;
            }
            case 1568: {
                if (!string2.equals((Object)"11")) break;
                n9 = 10;
                break;
            }
            case 1567: {
                if (!string2.equals((Object)"10")) break;
                n9 = 9;
                break;
            }
            case 1545: {
                if (!string2.equals((Object)"09")) break;
                n9 = 8;
                break;
            }
            case 1544: {
                if (!string2.equals((Object)"08")) break;
                n9 = 7;
                break;
            }
            case 1543: {
                if (!string2.equals((Object)"07")) break;
                n9 = 6;
                break;
            }
            case 1542: {
                if (!string2.equals((Object)"06")) break;
                n9 = 5;
                break;
            }
            case 1541: {
                if (!string2.equals((Object)"05")) break;
                n9 = 4;
                break;
            }
            case 1540: {
                if (!string2.equals((Object)"04")) break;
                n9 = 3;
                break;
            }
            case 1539: {
                if (!string2.equals((Object)"03")) break;
                n9 = 2;
                break;
            }
            case 1538: {
                if (!string2.equals((Object)"02")) break;
                n9 = 1;
                break;
            }
            case 1537: {
                if (!string2.equals((Object)"01")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return null;
            }
            case 12: {
                n9 = 4096;
                do {
                    return n9;
                    break;
                } while (true);
            }
            case 11: {
                n9 = 2048;
                return n9;
            }
            case 10: {
                n9 = 1024;
                return n9;
            }
            case 9: {
                n9 = 512;
                return n9;
            }
            case 8: {
                n9 = 256;
                return n9;
            }
            case 7: {
                n9 = 128;
                return n9;
            }
            case 6: {
                n9 = 64;
                return n9;
            }
            case 5: {
                n9 = 32;
                return n9;
            }
            case 4: {
                n9 = 16;
                return n9;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer k(String string2) {
        if (string2 == null) {
            return null;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1567: {
                if (!string2.equals((Object)"10")) break;
                n9 = 10;
                break;
            }
            case 1545: {
                if (!string2.equals((Object)"09")) break;
                n9 = 9;
                break;
            }
            case 1544: {
                if (!string2.equals((Object)"08")) break;
                n9 = 8;
                break;
            }
            case 1543: {
                if (!string2.equals((Object)"07")) break;
                n9 = 7;
                break;
            }
            case 1542: {
                if (!string2.equals((Object)"06")) break;
                n9 = 6;
                break;
            }
            case 1541: {
                if (!string2.equals((Object)"05")) break;
                n9 = 5;
                break;
            }
            case 1540: {
                if (!string2.equals((Object)"04")) break;
                n9 = 4;
                break;
            }
            case 1539: {
                if (!string2.equals((Object)"03")) break;
                n9 = 3;
                break;
            }
            case 1538: {
                if (!string2.equals((Object)"02")) break;
                n9 = 2;
                break;
            }
            case 1537: {
                if (!string2.equals((Object)"01")) break;
                n9 = 1;
                break;
            }
            case 1536: {
                if (!string2.equals((Object)"00")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return null;
            }
            case 10: {
                n9 = 1024;
                do {
                    return n9;
                    break;
                } while (true);
            }
            case 9: {
                n9 = 512;
                return n9;
            }
            case 8: {
                n9 = 256;
                return n9;
            }
            case 7: {
                n9 = 128;
                return n9;
            }
            case 6: {
                n9 = 64;
                return n9;
            }
            case 5: {
                n9 = 32;
                return n9;
            }
            case 4: {
                n9 = 16;
                return n9;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pair l(String string2, String[] stringBuilder) {
        if (stringBuilder.length != 3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed MP4A codec string: ");
            stringBuilder.append(string2);
            o.h("MediaCodecUtil", stringBuilder.toString());
            return null;
        }
        try {
            if (!"audio/mp4a-latm".equals((Object)d0.z.h(Integer.parseInt((String)stringBuilder[1], (int)16)))) return null;
            int n8 = I.Q(Integer.parseInt((String)stringBuilder[2]));
            if (n8 == -1) return null;
            return new Pair((Object)n8, (Object)0);
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Ignoring malformed MP4A codec string: ");
        stringBuilder2.append(string2);
        o.h("MediaCodecUtil", stringBuilder2.toString());
        return null;
    }

    public static String m(q q8) {
        if ("audio/eac3-joc".equals((Object)q8.n)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals((Object)q8.n) && (q8 = I.r(q8)) != null) {
            int n8 = (Integer)q8.first;
            if (n8 != 16 && n8 != 256) {
                if (n8 == 512) {
                    return "video/avc";
                }
                if (n8 == 1024) {
                    return "video/av01";
                }
            } else {
                return "video/hevc";
            }
        }
        return null;
    }

    public static List n(z z8, q object, boolean bl, boolean bl2) {
        if ((object = I.m((q)object)) == null) {
            return v.Y();
        }
        return z8.a((String)object, bl, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pair o(String string2, String[] stringBuilder, h h8) {
        block10 : {
            block9 : {
                block6 : {
                    block7 : {
                        int n8;
                        int n9;
                        int n10;
                        int n11;
                        block8 : {
                            block4 : {
                                block5 : {
                                    if (stringBuilder.length >= 4) break block5;
                                    stringBuilder = new StringBuilder();
                                    break block6;
                                }
                                n11 = 1;
                                try {
                                    n8 = Integer.parseInt((String)stringBuilder[1]);
                                    n10 = Integer.parseInt((String)stringBuilder[2].substring(0, 2));
                                    n9 = Integer.parseInt((String)stringBuilder[3]);
                                    if (n8 == 0) break block4;
                                }
                                catch (NumberFormatException numberFormatException) {}
                                string2 = new StringBuilder();
                                string2.append("Unknown AV1 profile: ");
                                string2.append(n8);
                                break block7;
                            }
                            if (n9 == 8 || n9 == 10) break block8;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown AV1 bit depth: ");
                            stringBuilder.append(n9);
                            break block9;
                        }
                        if (n9 != 8) {
                            n11 = h8 != null && (h8.d != null || (n11 = h8.c) == 7 || n11 == 6) ? 4096 : 2;
                        }
                        if ((n8 = I.f(n10)) != -1) {
                            return new Pair((Object)n11, (Object)n8);
                        }
                        string2 = new StringBuilder();
                        string2.append("Unknown AV1 level: ");
                        string2.append(n10);
                    }
                    string2 = string2.toString();
                    break block10;
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append("Ignoring malformed AV1 codec string: ");
                stringBuilder.append(string2);
            }
            string2 = stringBuilder.toString();
        }
        o.h("MediaCodecUtil", string2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pair p(String string2, String[] stringBuilder) {
        block10 : {
            block11 : {
                block8 : {
                    block6 : {
                        int n8;
                        int n9;
                        int n10;
                        block9 : {
                            block5 : {
                                block7 : {
                                    if (stringBuilder.length >= 2) break block7;
                                    stringBuilder = new StringBuilder();
                                    break block8;
                                }
                                try {
                                    if (stringBuilder[1].length() == 6) {
                                        n9 = Integer.parseInt((String)stringBuilder[1].substring(0, 2), (int)16);
                                        n8 = Integer.parseInt((String)stringBuilder[1].substring(4), (int)16);
                                        break block5;
                                    }
                                    if (stringBuilder.length < 3) break block6;
                                    n9 = Integer.parseInt((String)stringBuilder[1]);
                                    n8 = Integer.parseInt((String)stringBuilder[2]);
                                }
                                catch (NumberFormatException numberFormatException) {}
                            }
                            n10 = I.i(n9);
                            if (n10 != -1) break block9;
                            string2 = new StringBuilder();
                            string2.append("Unknown AVC profile: ");
                            string2.append(n9);
                            string2 = string2.toString();
                            break block10;
                        }
                        n9 = I.g(n8);
                        if (n9 != -1) {
                            return new Pair((Object)n10, (Object)n9);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown AVC level: ");
                        stringBuilder.append(n8);
                        break block11;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring malformed AVC codec string: ");
                    stringBuilder.append(string2);
                    o.h("MediaCodecUtil", stringBuilder.toString());
                    return null;
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append("Ignoring malformed AVC codec string: ");
                stringBuilder.append(string2);
            }
            string2 = stringBuilder.toString();
        }
        o.h("MediaCodecUtil", string2);
        return null;
    }

    public static String q(MediaCodecInfo arrstring, String string2, String string3) {
        for (String string4 : arrstring.getSupportedTypes()) {
            if (!string4.equalsIgnoreCase(string3)) continue;
            return string4;
        }
        if (string3.equals((Object)"video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals((Object)string2)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals((Object)string2) || "OMX.realtek.video.decoder.tunneled".equals((Object)string2)) {
                return "video/dv_hevc";
            }
        } else {
            if (string3.equals((Object)"audio/alac") && "OMX.lge.alac.decoder".equals((Object)string2)) {
                return "audio/x-lg-alac";
            }
            if (string3.equals((Object)"audio/flac") && "OMX.lge.flac.decoder".equals((Object)string2)) {
                return "audio/x-lg-flac";
            }
            if (string3.equals((Object)"audio/ac3") && "OMX.lge.ac3.decoder".equals((Object)string2)) {
                return "audio/lg-ac3";
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Pair r(q var0) {
        block18 : {
            var2_1 = var0.j;
            if (var2_1 == null) {
                return null;
            }
            var2_1 = var2_1.split("\\.");
            if ("video/dolby-vision".equals((Object)var0.n)) {
                return I.y(var0.j, var2_1);
            }
            var1_2 = 0;
            var3_3 = var2_1[0];
            var3_3.hashCode();
            switch (var3_3.hashCode()) {
                case 3624515: {
                    if (!var3_3.equals((Object)"vp09")) break;
                    var1_2 = 6;
                    ** break;
                }
                case 3356560: {
                    if (!var3_3.equals((Object)"mp4a")) break;
                    var1_2 = 5;
                    ** break;
                }
                case 3214780: {
                    if (!var3_3.equals((Object)"hvc1")) break;
                    var1_2 = 4;
                    ** break;
                }
                case 3199032: {
                    if (!var3_3.equals((Object)"hev1")) break;
                    var1_2 = 3;
                    ** break;
                }
                case 3006244: {
                    if (!var3_3.equals((Object)"avc2")) break;
                    var1_2 = 2;
                    ** break;
                }
                case 3006243: {
                    if (!var3_3.equals((Object)"avc1")) break;
                    var1_2 = 1;
                    ** break;
                }
                case 3004662: {
                    if (var3_3.equals((Object)"av01")) break block18;
                }
            }
            var1_2 = -1;
            ** break;
        }
        switch (var1_2) {
            default: {
                return null;
            }
            case 6: {
                return I.A(var0.j, var2_1);
            }
            case 5: {
                return I.l(var0.j, var2_1);
            }
            case 3: 
            case 4: {
                return I.z(var0.j, var2_1, var0.A);
            }
            case 1: 
            case 2: {
                return I.p(var0.j, var2_1);
            }
            case 0: 
        }
        return I.o(var0.j, var2_1, var0.A);
    }

    public static p s(String string2, boolean bl, boolean bl2) {
        if ((string2 = I.t(string2, bl, bl2)).isEmpty()) {
            return null;
        }
        return (p)string2.get(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static List t(String var0, boolean var1_2, boolean var2_3) {
        block8 : {
            block7 : {
                // MONITORENTER : t0.I.class
                var6_4 = new b((String)var0, var1_2, var2_3);
                var7_5 = I.b;
                var4_6 = (List)var7_5.get((Object)var6_4);
                if (var4_6 == null) break block7;
                return var4_6;
            }
            var3_7 = M.a;
            if (var3_7 < 21) ** GOTO lbl18
            var4_6 = new f(var1_2, var2_3);
            break block8;
lbl18: // 1 sources:
            var4_6 = new e(null);
        }
        var5_8 = I.u(var6_4, (d)var4_6);
        var4_6 = var5_8;
        if (!var1_2) ** GOTO lbl40
        var4_6 = var5_8;
        if (!var5_8.isEmpty()) ** GOTO lbl40
        var4_6 = var5_8;
        if (21 > var3_7) ** GOTO lbl40
        var4_6 = var5_8;
        if (var3_7 > 23) ** GOTO lbl40
        var5_8 = I.u(var6_4, new e(null));
        var4_6 = var5_8;
        if (!var5_8.isEmpty()) {
            var4_6 = new StringBuilder();
            var4_6.append("MediaCodecList API didn't list secure decoder for: ");
            var4_6.append((String)var0);
            var4_6.append(". Assuming: ");
            var4_6.append(((p)var5_8.get((int)0)).a);
            o.h("MediaCodecUtil", var4_6.toString());
            var4_6 = var5_8;
        }
lbl40: // 7 sources:
        I.e((String)var0, (List)var4_6);
        var0 = v.U((Collection)var4_6);
        var7_5.put((Object)var6_4, var0);
        // MONITOREXIT : t0.I.class
        return var0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static ArrayList u(b var0, d var1_2) {
        try {
            var14_3 = new ArrayList();
            var15_4 = var0.a;
            var2_5 = var1_2.c();
            var5_6 = var1_2.e();
            var3_7 = 0;
            do lbl-1000: // 2 sources:
            {
                var12_17 = var0;
                if (var3_7 >= var2_5) return var14_3;
                var17_23 = var1_2.a(var3_7);
                if (I.C(var17_23) || !I.E(var17_23, (String)(var11_14 = var17_23.getName()), var5_6, var15_4) || (var16_22 = I.q(var17_23, (String)var11_14, var15_4)) == null) break block17;
                break;
            } while (true);
        }
        catch (Exception var0_1) {
            throw new c((Throwable)var0_1, null);
        }
        {
            block17 : {
                block18 : {
                    block19 : {
                        block20 : {
                            try {
                                var13_20 = var17_23.getCapabilitiesForType(var16_22);
                                var6_9 = var1_2.d("tunneled-playback", var16_22, (MediaCodecInfo.CodecCapabilities)var13_20);
                                var7_10 = var1_2.b("tunneled-playback", var16_22, (MediaCodecInfo.CodecCapabilities)var13_20);
                                var8_11 = var12_17.c;
                                if (!var8_11 && var7_10) break block17;
                            }
                            catch (Exception var13_21) {
                                var12_17 = var11_14;
                                var11_14 = var13_21;
                                break block18;
                            }
                            if (var8_11 && !var6_9) break block17;
                            var6_9 = var1_2.d("secure-playback", var16_22, (MediaCodecInfo.CodecCapabilities)var13_20);
                            var7_10 = var1_2.b("secure-playback", var16_22, (MediaCodecInfo.CodecCapabilities)var13_20);
                            var8_11 = var12_17.b;
                            if (!var8_11 && var7_10 || var8_11 && !var6_9) break block17;
                            var7_10 = I.F(var17_23, var15_4);
                            var8_11 = I.H(var17_23, var15_4);
                            var9_12 = I.J(var17_23);
                            if (var5_6 && (var10_13 = var12_17.b) == var6_9) break block20;
                            if (!var5_6) {
                                var10_13 = var12_17.b;
                                if (var10_13) break block19;
                            }
                            break block19;
                        }
                        try {
                            var14_3.add((Object)p.C((String)var11_14, var15_4, var16_22, (MediaCodecInfo.CodecCapabilities)var13_20, var7_10, var8_11, var9_12, false, false));
                            break block17;
                        }
                        catch (Exception var12_18) {}
                        ** GOTO lbl-1000
                    }
                    var12_17 = var11_14;
                    if (var5_6 || !var6_9) break block17;
                    var17_23 = new StringBuilder();
                    var17_23.append((String)var12_17);
                    var17_23.append(".secure");
                    var11_14 = var17_23.toString();
                    try {
                        var14_3.add((Object)p.C((String)var11_14, var15_4, var16_22, (MediaCodecInfo.CodecCapabilities)var13_20, var7_10, var8_11, var9_12, false, true));
                        return var14_3;
                    }
                    catch (Exception var11_15) {}
                    break block18;
                    catch (Exception var11_16) {
                        // empty catch block
                    }
                    break block18;
                    catch (Exception var12_19) {}
lbl-1000: // 2 sources:
                    {
                        var13_20 = var11_14;
                        var11_14 = var12_17;
                        var12_17 = var13_20;
                    }
                }
                var4_8 = M.a;
                if (var4_8 > 23) ** GOTO lbl77
                if (!var14_3.isEmpty()) {
                    var11_14 = new StringBuilder();
                    var11_14.append("Skipping codec ");
                    var11_14.append((String)var12_17);
                    var11_14.append(" (failed to query capabilities)");
                    o.c("MediaCodecUtil", var11_14.toString());
                    break block17;
                }
lbl77: // 3 sources:
                var0 = new StringBuilder();
                var0.append("Failed to query codec ");
                var0.append((String)var12_17);
                var0.append(" (");
                var0.append(var16_22);
                var0.append(")");
                o.c("MediaCodecUtil", var0.toString());
                throw var11_14;
            }
            ++var3_7;
            ** while (true)
        }
    }

    public static List v(z z8, q q8, boolean bl, boolean bl2) {
        List list = z8.a(q8.n, bl, bl2);
        z8 = I.n(z8, q8, bl, bl2);
        return v.M().j((Iterable)list).j((Iterable)z8).k();
    }

    public static List w(List list, q q8) {
        list = new ArrayList((Collection)list);
        I.R(list, new G(q8));
        return list;
    }

    public static p x() {
        return I.s("audio/raw", false, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Pair y(String var0, String[] var1_1) {
        block4 : {
            if (var1_1.length >= 3) break block4;
            var1_1 = new StringBuilder();
            ** GOTO lbl8
        }
        var2_2 = I.a.matcher((CharSequence)var1_1[1]);
        if (!var2_2.matches()) {
            var1_1 = new StringBuilder();
lbl8: // 2 sources:
            var1_1.append("Ignoring malformed Dolby Vision codec string: ");
            var2_2 = var1_1;
            var1_1 = var0;
        } else {
            var0 = I.k((String)(var2_2 = var2_2.group(1)));
            if (var0 == null) {
                var0 = new StringBuilder();
                var3_3 = "Unknown Dolby Vision profile string: ";
                var1_1 = var2_2;
                var2_2 = var3_3;
            } else {
                var2_2 = I.j((String)(var1_1 = var1_1[2]));
                if (var2_2 != null) return new Pair((Object)var0, var2_2);
                var0 = new StringBuilder();
                var2_2 = "Unknown Dolby Vision level string: ";
            }
            var0.append((String)var2_2);
            var2_2 = var0;
        }
        var2_2.append((String)var1_1);
        o.h("MediaCodecUtil", var2_2.toString());
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Pair z(String var0, String[] var1_1, h var2_2) {
        block5 : {
            block4 : {
                block3 : {
                    block2 : {
                        if (var1_1.length >= 4) break block2;
                        var1_1 = new StringBuilder();
                        break block3;
                    }
                    var4_3 = I.a;
                    var3_4 = 1;
                    if ((var4_3 = var4_3.matcher((CharSequence)var1_1[1])).matches()) break block4;
                    var1_1 = new StringBuilder();
                }
                var1_1.append("Ignoring malformed HEVC codec string: ");
                var2_2 = var1_1;
                var1_1 = var0;
                break block5;
            }
            var0 = var4_3.group(1);
            if ("1".equals((Object)var0)) ** GOTO lbl19
            if ("2".equals((Object)var0)) {
                var3_4 = var2_2 != null && var2_2.c == 6 ? 4096 : 2;
lbl19: // 2 sources:
                var1_1 = var1_1[3];
                var0 = I.B((String)var1_1);
                if (var0 != null) return new Pair((Object)var3_4, (Object)var0);
                var0 = new StringBuilder();
                var2_2 = "Unknown HEVC level string: ";
            } else {
                var4_3 = new StringBuilder();
                var2_2 = "Unknown HEVC profile string: ";
                var1_1 = var0;
                var0 = var4_3;
            }
            var0.append((String)var2_2);
            var2_2 = var0;
        }
        var2_2.append((String)var1_1);
        o.h("MediaCodecUtil", var2_2.toString());
        return null;
    }

    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String string2, boolean bl, boolean bl2) {
            this.a = string2;
            this.b = bl;
            this.c = bl2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (object.getClass() != b.class) {
                    return false;
                }
                object = (b)object;
                if (TextUtils.equals((CharSequence)this.a, (CharSequence)object.a) && this.b == object.b && this.c == object.c) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            boolean bl = this.b;
            int n9 = 1237;
            int n10 = bl ? 1231 : 1237;
            if (this.c) {
                n9 = 1231;
            }
            return ((n8 + 31) * 31 + n10) * 31 + n9;
        }
    }

    public static class c
    extends Exception {
        public c(Throwable throwable) {
            super("Failed to query underlying media codecs", throwable);
        }

        public /* synthetic */ c(Throwable throwable,  a8) {
            this(throwable);
        }
    }

    public static interface d {
        public MediaCodecInfo a(int var1);

        public boolean b(String var1, String var2, MediaCodecInfo.CodecCapabilities var3);

        public int c();

        public boolean d(String var1, String var2, MediaCodecInfo.CodecCapabilities var3);

        public boolean e();
    }

    public static final class e
    implements d {
        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        @Override
        public MediaCodecInfo a(int n8) {
            return MediaCodecList.getCodecInfoAt((int)n8);
        }

        @Override
        public boolean b(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override
        public int c() {
            return MediaCodecList.getCodecCount();
        }

        @Override
        public boolean d(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals((Object)string2) && "video/avc".equals((Object)string3)) {
                return true;
            }
            return false;
        }

        @Override
        public boolean e() {
            return false;
        }
    }

    public static final class f
    implements d {
        public final int a;
        public MediaCodecInfo[] b;

        public f(boolean bl, boolean bl2) {
            int n8 = !bl && !bl2 ? 0 : 1;
            this.a = n8;
        }

        @Override
        public MediaCodecInfo a(int n8) {
            this.f();
            return this.b[n8];
        }

        @Override
        public boolean b(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(string2);
        }

        @Override
        public int c() {
            this.f();
            return this.b.length;
        }

        @Override
        public boolean d(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(string2);
        }

        @Override
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    public static interface g {
        public int a(Object var1);
    }

}

