// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCodecList;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import d0.h;
import X2.v;
import android.media.MediaCodecInfo$CodecCapabilities;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import android.media.MediaCodecInfo$CodecProfileLevel;
import d0.q;
import W2.c;
import d0.z;
import g0.M;
import android.media.MediaCodecInfo;
import g0.o;
import android.util.Pair;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class I
{
    public static final Pattern a;
    public static final HashMap b;
    public static int c;
    
    static {
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        I.c = -1;
    }
    
    public static Pair A(String str, final String[] array) {
        Label_0032: {
            StringBuilder sb = null;
            Label_0027: {
                if (array.length < 3) {
                    sb = new StringBuilder();
                }
                else {
                    while (true) {
                        try {
                            final int int1 = Integer.parseInt(array[1]);
                            final int int2 = Integer.parseInt(array[2]);
                            final int t = T(int1);
                            if (t == -1) {
                                str = new StringBuilder();
                                ((StringBuilder)str).append("Unknown VP9 profile: ");
                                ((StringBuilder)str).append(int1);
                                str = ((StringBuilder)str).toString();
                                break Label_0032;
                            }
                            final int s = S(int2);
                            if (s == -1) {
                                sb = new StringBuilder();
                                sb.append("Unknown VP9 level: ");
                                sb.append(int2);
                                break Label_0027;
                            }
                            return new Pair((Object)t, (Object)s);
                            sb = new StringBuilder();
                        }
                        catch (NumberFormatException ex) {
                            continue;
                        }
                        break;
                    }
                }
                sb.append("Ignoring malformed VP9 codec string: ");
                sb.append((String)str);
            }
            str = sb.toString();
        }
        o.h("MediaCodecUtil", (String)str);
        return null;
    }
    
    public static Integer B(final String s) {
        if (s == null) {
            return null;
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2312995: {
                if (!s.equals("L186")) {
                    break;
                }
                n = 25;
                break;
            }
            case 2312992: {
                if (!s.equals("L183")) {
                    break;
                }
                n = 24;
                break;
            }
            case 2312989: {
                if (!s.equals("L180")) {
                    break;
                }
                n = 23;
                break;
            }
            case 2312902: {
                if (!s.equals("L156")) {
                    break;
                }
                n = 22;
                break;
            }
            case 2312899: {
                if (!s.equals("L153")) {
                    break;
                }
                n = 21;
                break;
            }
            case 2312896: {
                if (!s.equals("L150")) {
                    break;
                }
                n = 20;
                break;
            }
            case 2312806: {
                if (!s.equals("L123")) {
                    break;
                }
                n = 19;
                break;
            }
            case 2312803: {
                if (!s.equals("L120")) {
                    break;
                }
                n = 18;
                break;
            }
            case 2193831: {
                if (!s.equals("H186")) {
                    break;
                }
                n = 17;
                break;
            }
            case 2193828: {
                if (!s.equals("H183")) {
                    break;
                }
                n = 16;
                break;
            }
            case 2193825: {
                if (!s.equals("H180")) {
                    break;
                }
                n = 15;
                break;
            }
            case 2193738: {
                if (!s.equals("H156")) {
                    break;
                }
                n = 14;
                break;
            }
            case 2193735: {
                if (!s.equals("H153")) {
                    break;
                }
                n = 13;
                break;
            }
            case 2193732: {
                if (!s.equals("H150")) {
                    break;
                }
                n = 12;
                break;
            }
            case 2193642: {
                if (!s.equals("H123")) {
                    break;
                }
                n = 11;
                break;
            }
            case 2193639: {
                if (!s.equals("H120")) {
                    break;
                }
                n = 10;
                break;
            }
            case 74854: {
                if (!s.equals("L93")) {
                    break;
                }
                n = 9;
                break;
            }
            case 74851: {
                if (!s.equals("L90")) {
                    break;
                }
                n = 8;
                break;
            }
            case 74761: {
                if (!s.equals("L63")) {
                    break;
                }
                n = 7;
                break;
            }
            case 74758: {
                if (!s.equals("L60")) {
                    break;
                }
                n = 6;
                break;
            }
            case 74665: {
                if (!s.equals("L30")) {
                    break;
                }
                n = 5;
                break;
            }
            case 71010: {
                if (!s.equals("H93")) {
                    break;
                }
                n = 4;
                break;
            }
            case 71007: {
                if (!s.equals("H90")) {
                    break;
                }
                n = 3;
                break;
            }
            case 70917: {
                if (!s.equals("H63")) {
                    break;
                }
                n = 2;
                break;
            }
            case 70914: {
                if (!s.equals("H60")) {
                    break;
                }
                n = 1;
                break;
            }
            case 70821: {
                if (!s.equals("H30")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        int i = 0;
        switch (n) {
            default: {
                return null;
            }
            case 25: {
                i = 16777216;
                break;
            }
            case 24: {
                i = 4194304;
                break;
            }
            case 23: {
                i = 1048576;
                break;
            }
            case 22: {
                i = 262144;
                break;
            }
            case 21: {
                i = 65536;
                break;
            }
            case 20: {
                i = 16384;
                break;
            }
            case 19: {
                i = 4096;
                break;
            }
            case 18: {
                i = 1024;
                break;
            }
            case 17: {
                i = 33554432;
                break;
            }
            case 16: {
                i = 8388608;
                break;
            }
            case 15: {
                i = 2097152;
                break;
            }
            case 14: {
                i = 524288;
                break;
            }
            case 13: {
                i = 131072;
                break;
            }
            case 12: {
                i = 32768;
                break;
            }
            case 11: {
                i = 8192;
                break;
            }
            case 10: {
                i = 2048;
                break;
            }
            case 9: {
                i = 256;
                break;
            }
            case 8: {
                i = 64;
                break;
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
                i = 512;
                break;
            }
            case 3: {
                i = 128;
                break;
            }
            case 2: {
                i = 32;
                break;
            }
            case 1: {
                return 8;
            }
            case 0: {
                return 2;
            }
        }
        return i;
    }
    
    public static boolean C(final MediaCodecInfo mediaCodecInfo) {
        return M.a >= 29 && D(mediaCodecInfo);
    }
    
    public static boolean D(final MediaCodecInfo mediaCodecInfo) {
        return D.a(mediaCodecInfo);
    }
    
    public static boolean E(final MediaCodecInfo mediaCodecInfo, final String anObject, final boolean b, final String anObject2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!b && anObject.endsWith(".secure")) {
            return false;
        }
        final int a = M.a;
        if (a < 21 && ("CIPAACDecoder".equals(anObject) || "CIPMP3Decoder".equals(anObject) || "CIPVorbisDecoder".equals(anObject) || "CIPAMRNBDecoder".equals(anObject) || "AACDecoder".equals(anObject) || "MP3Decoder".equals(anObject))) {
            return false;
        }
        if (a < 24 && ("OMX.SEC.aac.dec".equals(anObject) || "OMX.Exynos.AAC.Decoder".equals(anObject)) && "samsung".equals(M.c)) {
            final String b2 = M.b;
            if (b2.startsWith("zeroflte") || b2.startsWith("zerolte") || b2.startsWith("zenlte") || "SC-05G".equals(b2) || "marinelteatt".equals(b2) || "404SC".equals(b2) || "SC-04G".equals(b2) || "SCV31".equals(b2)) {
                return false;
            }
        }
        if (a == 19 && "OMX.SEC.vp8.dec".equals(anObject) && "samsung".equals(M.c)) {
            final String b3 = M.b;
            if (b3.startsWith("d2") || b3.startsWith("serrano") || b3.startsWith("jflte") || b3.startsWith("santos") || b3.startsWith("t0")) {
                return false;
            }
        }
        return (a != 19 || !M.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(anObject)) && (a > 23 || !"audio/eac3-joc".equals(anObject2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(anObject));
    }
    
    public static boolean F(final MediaCodecInfo mediaCodecInfo, final String s) {
        if (M.a >= 29) {
            return G(mediaCodecInfo);
        }
        return H(mediaCodecInfo, s) ^ true;
    }
    
    public static boolean G(final MediaCodecInfo mediaCodecInfo) {
        return B.a(mediaCodecInfo);
    }
    
    public static boolean H(final MediaCodecInfo mediaCodecInfo, final String s) {
        if (M.a >= 29) {
            return I(mediaCodecInfo);
        }
        final boolean o = z.o(s);
        final boolean b = true;
        if (o) {
            return true;
        }
        final String e = W2.c.e(mediaCodecInfo.getName());
        if (e.startsWith("arc.")) {
            return false;
        }
        boolean b2 = b;
        if (!e.startsWith("omx.google.")) {
            b2 = b;
            if (!e.startsWith("omx.ffmpeg.")) {
                if (e.startsWith("omx.sec.")) {
                    b2 = b;
                    if (e.contains(".sw.")) {
                        return b2;
                    }
                }
                b2 = b;
                if (!e.equals("omx.qcom.video.decoder.hevcswvdec")) {
                    b2 = b;
                    if (!e.startsWith("c2.android.")) {
                        b2 = b;
                        if (!e.startsWith("c2.google.")) {
                            if (!e.startsWith("omx.") && !e.startsWith("c2.")) {
                                return true;
                            }
                            b2 = false;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public static boolean I(final MediaCodecInfo mediaCodecInfo) {
        return A.a(mediaCodecInfo);
    }
    
    public static boolean J(final MediaCodecInfo mediaCodecInfo) {
        if (M.a >= 29) {
            return K(mediaCodecInfo);
        }
        final String e = W2.c.e(mediaCodecInfo.getName());
        return !e.startsWith("omx.google.") && !e.startsWith("c2.android.") && !e.startsWith("c2.google.");
    }
    
    public static boolean K(final MediaCodecInfo mediaCodecInfo) {
        return C.a(mediaCodecInfo);
    }
    
    public static int P() {
        if (I.c == -1) {
            int max = 0;
            int i = 0;
            final p s = s("video/avc", false, false);
            if (s != null) {
                final MediaCodecInfo$CodecProfileLevel[] g = s.g();
                final int length = g.length;
                int max2 = 0;
                while (i < length) {
                    max2 = Math.max(h(g[i].level), max2);
                    ++i;
                }
                int b;
                if (M.a >= 21) {
                    b = 345600;
                }
                else {
                    b = 172800;
                }
                max = Math.max(max2, b);
            }
            I.c = max;
        }
        return I.c;
    }
    
    public static int Q(final int n) {
        int n2 = 17;
        if (n != 17) {
            n2 = 20;
            if (n != 20) {
                n2 = 23;
                if (n != 23) {
                    n2 = 29;
                    if (n != 29) {
                        n2 = 39;
                        if (n != 39) {
                            n2 = 42;
                            if (n != 42) {
                                switch (n) {
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
                                    case 1: {
                                        return 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static void R(final List list, final g g) {
        Collections.sort((List<Object>)list, new H(g));
    }
    
    public static int S(final int n) {
        if (n == 10) {
            return 1;
        }
        if (n == 11) {
            return 2;
        }
        if (n == 20) {
            return 4;
        }
        if (n == 21) {
            return 8;
        }
        if (n == 30) {
            return 16;
        }
        if (n == 31) {
            return 32;
        }
        if (n == 40) {
            return 64;
        }
        if (n == 41) {
            return 128;
        }
        if (n == 50) {
            return 256;
        }
        if (n == 51) {
            return 512;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 62: {
                return 8192;
            }
            case 61: {
                return 4096;
            }
            case 60: {
                return 2048;
            }
        }
    }
    
    public static int T(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return -1;
        }
        return 8;
    }
    
    public static void e(String a, final List list) {
        if ("audio/raw".equals(a)) {
            if (M.a < 26 && M.b.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(p.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            R(list, (g)new E());
        }
        final int a2 = M.a;
        if (a2 < 21 && list.size() > 1) {
            a = list.get(0).a;
            if ("OMX.SEC.mp3.dec".equals(a) || "OMX.SEC.MP3.Decoder".equals(a) || "OMX.brcm.audio.mp3.decoder".equals(a)) {
                R(list, (g)new F());
            }
        }
        if (a2 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).a)) {
            list.add(list.remove(0));
        }
    }
    
    public static int f(final int n) {
        switch (n) {
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
            case 0: {
                return 1;
            }
        }
    }
    
    public static int g(final int n) {
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                return -1;
                                            }
                                            case 52: {
                                                return 65536;
                                            }
                                            case 51: {
                                                return 32768;
                                            }
                                            case 50: {
                                                return 16384;
                                            }
                                        }
                                        break;
                                    }
                                    case 42: {
                                        return 8192;
                                    }
                                    case 41: {
                                        return 4096;
                                    }
                                    case 40: {
                                        return 2048;
                                    }
                                }
                                break;
                            }
                            case 32: {
                                return 1024;
                            }
                            case 31: {
                                return 512;
                            }
                            case 30: {
                                return 256;
                            }
                        }
                        break;
                    }
                    case 22: {
                        return 128;
                    }
                    case 21: {
                        return 64;
                    }
                    case 20: {
                        return 32;
                    }
                }
                break;
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
            case 10: {
                return 1;
            }
        }
    }
    
    public static int h(final int n) {
        if (n == 1 || n == 2) {
            return 25344;
        }
        switch (n) {
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
            case 32: {
                return 101376;
            }
        }
    }
    
    public static int i(final int n) {
        if (n == 66) {
            return 1;
        }
        if (n == 77) {
            return 2;
        }
        if (n == 88) {
            return 4;
        }
        if (n == 100) {
            return 8;
        }
        if (n == 110) {
            return 16;
        }
        if (n == 122) {
            return 32;
        }
        if (n != 244) {
            return -1;
        }
        return 64;
    }
    
    public static Integer j(final String s) {
        if (s == null) {
            return null;
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1570: {
                if (!s.equals("13")) {
                    break;
                }
                n = 12;
                break;
            }
            case 1569: {
                if (!s.equals("12")) {
                    break;
                }
                n = 11;
                break;
            }
            case 1568: {
                if (!s.equals("11")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1567: {
                if (!s.equals("10")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1545: {
                if (!s.equals("09")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1544: {
                if (!s.equals("08")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1543: {
                if (!s.equals("07")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1542: {
                if (!s.equals("06")) {
                    break;
                }
                n = 5;
                break;
            }
            case 1541: {
                if (!s.equals("05")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1540: {
                if (!s.equals("04")) {
                    break;
                }
                n = 3;
                break;
            }
            case 1539: {
                if (!s.equals("03")) {
                    break;
                }
                n = 2;
                break;
            }
            case 1538: {
                if (!s.equals("02")) {
                    break;
                }
                n = 1;
                break;
            }
            case 1537: {
                if (!s.equals("01")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        int i = 0;
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                i = 4096;
                break;
            }
            case 11: {
                i = 2048;
                break;
            }
            case 10: {
                i = 1024;
                break;
            }
            case 9: {
                i = 512;
                break;
            }
            case 8: {
                i = 256;
                break;
            }
            case 7: {
                i = 128;
                break;
            }
            case 6: {
                i = 64;
                break;
            }
            case 5: {
                i = 32;
                break;
            }
            case 4: {
                i = 16;
                break;
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
            case 0: {
                return 1;
            }
        }
        return i;
    }
    
    public static Integer k(final String s) {
        if (s == null) {
            return null;
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1567: {
                if (!s.equals("10")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1545: {
                if (!s.equals("09")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1544: {
                if (!s.equals("08")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1543: {
                if (!s.equals("07")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1542: {
                if (!s.equals("06")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1541: {
                if (!s.equals("05")) {
                    break;
                }
                n = 5;
                break;
            }
            case 1540: {
                if (!s.equals("04")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1539: {
                if (!s.equals("03")) {
                    break;
                }
                n = 3;
                break;
            }
            case 1538: {
                if (!s.equals("02")) {
                    break;
                }
                n = 2;
                break;
            }
            case 1537: {
                if (!s.equals("01")) {
                    break;
                }
                n = 1;
                break;
            }
            case 1536: {
                if (!s.equals("00")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        int i = 0;
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                i = 1024;
                break;
            }
            case 9: {
                i = 512;
                break;
            }
            case 8: {
                i = 256;
                break;
            }
            case 7: {
                i = 128;
                break;
            }
            case 6: {
                i = 64;
                break;
            }
            case 5: {
                i = 32;
                break;
            }
            case 4: {
                i = 16;
                break;
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
            case 0: {
                return 1;
            }
        }
        return i;
    }
    
    public static Pair l(final String s, final String[] array) {
        if (array.length != 3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed MP4A codec string: ");
            sb.append(s);
            o.h("MediaCodecUtil", sb.toString());
            return null;
        }
        while (true) {
            while (true) {
                try {
                    if ("audio/mp4a-latm".equals(z.h(Integer.parseInt(array[1], 16)))) {
                        final int q = Q(Integer.parseInt(array[2]));
                        if (q != -1) {
                            return new Pair((Object)q, (Object)0);
                        }
                    }
                    return null;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring malformed MP4A codec string: ");
                    sb2.append(s);
                    o.h("MediaCodecUtil", sb2.toString());
                    return null;
                }
                catch (NumberFormatException ex) {}
                continue;
            }
        }
    }
    
    public static String m(final q q) {
        if ("audio/eac3-joc".equals(q.n)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(q.n)) {
            final Pair r = r(q);
            if (r != null) {
                final int intValue = (int)r.first;
                if (intValue == 16 || intValue == 256) {
                    return "video/hevc";
                }
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
            }
        }
        return null;
    }
    
    public static List n(final t0.z z, final q q, final boolean b, final boolean b2) {
        final String m = m(q);
        if (m == null) {
            return v.Y();
        }
        return z.a(m, b, b2);
    }
    
    public static Pair o(String str, final String[] array, final h h) {
        Label_0033: {
            StringBuilder sb = null;
            Label_0028: {
                if (array.length < 4) {
                    sb = new StringBuilder();
                }
                else {
                    int i = 1;
                    while (true) {
                        try {
                            final int int1 = Integer.parseInt(array[1]);
                            final int int2 = Integer.parseInt(array[2].substring(0, 2));
                            final int int3 = Integer.parseInt(array[3]);
                            if (int1 != 0) {
                                str = new StringBuilder();
                                ((StringBuilder)str).append("Unknown AV1 profile: ");
                                ((StringBuilder)str).append(int1);
                            }
                            else {
                                if (int3 != 8 && int3 != 10) {
                                    sb = new StringBuilder();
                                    sb.append("Unknown AV1 bit depth: ");
                                    sb.append(int3);
                                    break Label_0028;
                                }
                                Label_0195: {
                                    if (int3 != 8) {
                                        Label_0193: {
                                            if (h != null) {
                                                if (h.d == null) {
                                                    final int c = h.c;
                                                    if (c != 7 && c != 6) {
                                                        break Label_0193;
                                                    }
                                                }
                                                i = 4096;
                                                break Label_0195;
                                            }
                                        }
                                        i = 2;
                                    }
                                }
                                final int f = f(int2);
                                if (f != -1) {
                                    return new Pair((Object)i, (Object)f);
                                }
                                str = new StringBuilder();
                                ((StringBuilder)str).append("Unknown AV1 level: ");
                                ((StringBuilder)str).append(int2);
                            }
                            str = ((StringBuilder)str).toString();
                            break Label_0033;
                            sb = new StringBuilder();
                        }
                        catch (NumberFormatException ex) {
                            continue;
                        }
                        break;
                    }
                }
                sb.append("Ignoring malformed AV1 codec string: ");
                sb.append((String)str);
            }
            str = sb.toString();
        }
        o.h("MediaCodecUtil", (String)str);
        return null;
    }
    
    public static Pair p(String o, final String[] array) {
        Label_0033: {
            StringBuilder sb = null;
            Label_0028: {
                if (array.length < 2) {
                    sb = new StringBuilder();
                }
                else {
                    while (true) {
                        try {
                            int i;
                            int j;
                            if (array[1].length() == 6) {
                                i = Integer.parseInt(array[1].substring(0, 2), 16);
                                j = Integer.parseInt(array[1].substring(4), 16);
                            }
                            else {
                                if (array.length < 3) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Ignoring malformed AVC codec string: ");
                                    sb2.append((String)o);
                                    o.h("MediaCodecUtil", sb2.toString());
                                    return null;
                                }
                                i = Integer.parseInt(array[1]);
                                j = Integer.parseInt(array[2]);
                            }
                            final int k = i(i);
                            if (k == -1) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append("Unknown AVC profile: ");
                                ((StringBuilder)o).append(i);
                                o = ((StringBuilder)o).toString();
                                break Label_0033;
                            }
                            final int g = g(j);
                            if (g == -1) {
                                sb = new StringBuilder();
                                sb.append("Unknown AVC level: ");
                                sb.append(j);
                                break Label_0028;
                            }
                            return new Pair((Object)k, (Object)g);
                            sb = new StringBuilder();
                        }
                        catch (NumberFormatException ex) {
                            continue;
                        }
                        break;
                    }
                }
                sb.append("Ignoring malformed AVC codec string: ");
                sb.append((String)o);
            }
            o = sb.toString();
        }
        o.h("MediaCodecUtil", (String)o);
        return null;
    }
    
    public static String q(final MediaCodecInfo mediaCodecInfo, final String s, final String anotherString) {
        final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        for (int length = supportedTypes.length, i = 0; i < length; ++i) {
            final String s2 = supportedTypes[i];
            if (s2.equalsIgnoreCase(anotherString)) {
                return s2;
            }
        }
        if (anotherString.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(s)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(s) || "OMX.realtek.video.decoder.tunneled".equals(s)) {
                return "video/dv_hevc";
            }
        }
        else {
            if (anotherString.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s)) {
                return "audio/x-lg-alac";
            }
            if (anotherString.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s)) {
                return "audio/x-lg-flac";
            }
            if (anotherString.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(s)) {
                return "audio/lg-ac3";
            }
        }
        return null;
    }
    
    public static Pair r(final q q) {
        final String j = q.j;
        if (j == null) {
            return null;
        }
        final String[] split = j.split("\\.");
        if ("video/dolby-vision".equals(q.n)) {
            return y(q.j, split);
        }
        int n = 0;
        final String s = split[0];
        s.hashCode();
        Label_0251: {
            switch (s) {
                case "vp09": {
                    n = 6;
                    break Label_0251;
                }
                case "mp4a": {
                    n = 5;
                    break Label_0251;
                }
                case "hvc1": {
                    n = 4;
                    break Label_0251;
                }
                case "hev1": {
                    n = 3;
                    break Label_0251;
                }
                case "avc2": {
                    n = 2;
                    break Label_0251;
                }
                case "avc1": {
                    n = 1;
                    break Label_0251;
                }
                case "av01": {
                    break Label_0251;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return A(q.j, split);
            }
            case 5: {
                return l(q.j, split);
            }
            case 3:
            case 4: {
                return z(q.j, split, q.A);
            }
            case 1:
            case 2: {
                return p(q.j, split);
            }
            case 0: {
                return o(q.j, split, q.A);
            }
        }
    }
    
    public static p s(final String s, final boolean b, final boolean b2) {
        final List t = t(s, b, b2);
        if (t.isEmpty()) {
            return null;
        }
        return t.get(0);
    }
    
    public static List t(final String str, final boolean b, final boolean b2) {
        // monitorenter(I.class)
        while (true) {
            try {
                final b b3 = new b(str, b, b2);
                final HashMap b4 = I.b;
                final List list = b4.get(b3);
                if (list != null) {
                    // monitorexit(I.class)
                    return list;
                }
                final int a = M.a;
                d d;
                if (a >= 21) {
                    d = new f(b, b2);
                }
                else {
                    d = new e(null);
                }
                ArrayList<p> list3;
                final ArrayList<p> list2 = list3 = (ArrayList<p>)u(b3, d);
                if (b) {
                    list3 = list2;
                    if (list2.isEmpty()) {
                        list3 = list2;
                        if (21 <= a) {
                            list3 = list2;
                            if (a <= 23) {
                                final ArrayList list4 = list3 = (ArrayList<p>)u(b3, (d)new e(null));
                                if (!list4.isEmpty()) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                                    sb.append(str);
                                    sb.append(". Assuming: ");
                                    sb.append(list4.get(0).a);
                                    o.h("MediaCodecUtil", sb.toString());
                                    list3 = (ArrayList<p>)list4;
                                }
                            }
                        }
                    }
                }
                e(str, list3);
                final v u = v.U(list3);
                b4.put(b3, u);
                // monitorexit(I.class)
                return u;
                // monitorexit(I.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static ArrayList u(b b, final d d) {
        while (true) {
            try {
                final ArrayList<p> list = new ArrayList<p>();
                final String a = b.a;
                final int c = d.c();
                final boolean e = d.e();
                int n = 0;
                while (true) {
                    Object str = b;
                    if (n >= c) {
                        return list;
                    }
                    final MediaCodecInfo a2 = d.a(n);
                Label_0533:
                    while (true) {
                        if (C(a2)) {
                            break Label_0533;
                        }
                        Serializable s = a2.getName();
                        if (!E(a2, (String)s, e, a)) {
                            break Label_0533;
                        }
                        final String q = q(a2, (String)s, a);
                        if (q == null) {
                            break Label_0533;
                        }
                        MediaCodecInfo$CodecCapabilities capabilitiesForType = null;
                        boolean d2;
                        boolean b2;
                        boolean c2;
                        boolean d3;
                        boolean b3;
                        boolean b4;
                        boolean f = false;
                        boolean h = false;
                        boolean j = false;
                        StringBuilder sb;
                        String s2;
                        Label_0394:Label_0564_Outer:
                        while (true) {
                            Label_0272: {
                                try {
                                    capabilitiesForType = a2.getCapabilitiesForType(q);
                                    d2 = d.d("tunneled-playback", q, capabilitiesForType);
                                    b2 = d.b("tunneled-playback", q, capabilitiesForType);
                                    c2 = ((b)str).c;
                                    if (!c2 && b2) {
                                        break Label_0533;
                                    }
                                    break Label_0394;
                                    Label_0162: {
                                        d3 = d.d("secure-playback", q, capabilitiesForType);
                                    }
                                    b3 = d.b("secure-playback", q, capabilitiesForType);
                                    b4 = ((b)str).b;
                                    // iftrue(Label_0549:, b4 || !b3)
                                    break Label_0533;
                                    break Label_0272;
                                    Label_0212:
                                    f = F(a2, a);
                                    h = H(a2, a);
                                    j = J(a2);
                                }
                                // iftrue(Label_0272:, !e)
                                // iftrue(Label_0289:, str.b == d3)
                                catch (Exception ex) {
                                    str = s;
                                    s = ex;
                                    break Label_0394;
                                }
                            }
                            Label_0579: {
                                if (e) {
                                    break Label_0579;
                                }
                                while (true) {
                                    try {
                                        Label_0317: {
                                            if (((b)str).b) {
                                                str = s;
                                                break Label_0317;
                                            }
                                            while (true) {
                                                try {
                                                    Label_0289: {
                                                        list.add(p.C((String)s, a, q, capabilitiesForType, f, h, j, false, false));
                                                    }
                                                    break;
                                                    throw new c((Throwable)b, null);
                                                    // iftrue(Label_0462:, M.a > 23 || list.isEmpty())
                                                    // iftrue(Label_0162:, !c2 || d2)
                                                    Block_21: {
                                                        break Block_21;
                                                        break;
                                                    }
                                                    s = new StringBuilder();
                                                    ((StringBuilder)s).append("Skipping codec ");
                                                    ((StringBuilder)s).append((String)str);
                                                    ((StringBuilder)s).append(" (failed to query capabilities)");
                                                    o.c("MediaCodecUtil", ((StringBuilder)s).toString());
                                                    break;
                                                    Label_0549:
                                                    // iftrue(Label_0212:, !b4 || d3)
                                                    continue Label_0533;
                                                    while (true) {
                                                        sb = new StringBuilder();
                                                        try {
                                                            sb.append((String)str);
                                                            sb.append(".secure");
                                                            s = sb.toString();
                                                            try {
                                                                list.add(p.C((String)s, a, q, capabilitiesForType, f, h, j, false, true));
                                                                return list;
                                                            }
                                                            catch (Exception s) {}
                                                        }
                                                        catch (Exception ex2) {}
                                                        continue Label_0394;
                                                        Label_0462:
                                                        b = (b)new StringBuilder();
                                                        ((StringBuilder)b).append("Failed to query codec ");
                                                        ((StringBuilder)b).append((String)str);
                                                        ((StringBuilder)b).append(" (");
                                                        ((StringBuilder)b).append(q);
                                                        ((StringBuilder)b).append(")");
                                                        o.c("MediaCodecUtil", ((StringBuilder)b).toString());
                                                        throw s;
                                                        continue Label_0564_Outer;
                                                    }
                                                }
                                                // iftrue(Label_0591:, e || !d3)
                                                catch (Exception ex3) {}
                                                s2 = (String)s;
                                                s = (Serializable)str;
                                                str = s2;
                                                continue Label_0394;
                                            }
                                        }
                                    }
                                    catch (Exception str) {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    Label_0591: {
                        ++n;
                    }
                }
            }
            catch (Exception b5) {}
            final b b5;
            b = b5;
            continue;
        }
    }
    
    public static List v(final t0.z z, final q q, final boolean b, final boolean b2) {
        return v.M().j(z.a(q.n, b, b2)).j(n(z, q, b, b2)).k();
    }
    
    public static List w(final List c, final q q) {
        final ArrayList list = new ArrayList(c);
        R(list, (g)new G(q));
        return list;
    }
    
    public static p x() {
        return s("audio/raw", false, false);
    }
    
    public static Pair y(final String s, final String[] array) {
        String str = null;
        StringBuilder sb3 = null;
        Label_0026: {
            StringBuilder sb;
            if (array.length < 3) {
                sb = new StringBuilder();
            }
            else {
                final Matcher matcher = I.a.matcher(array[1]);
                if (matcher.matches()) {
                    final String group = matcher.group(1);
                    final Integer k = k(group);
                    StringBuilder sb2;
                    String str2;
                    if (k == null) {
                        sb2 = new StringBuilder();
                        final String s2 = "Unknown Dolby Vision profile string: ";
                        str = group;
                        str2 = s2;
                    }
                    else {
                        str = array[2];
                        final Integer j = j(str);
                        if (j != null) {
                            return new Pair((Object)k, (Object)j);
                        }
                        sb2 = new StringBuilder();
                        str2 = "Unknown Dolby Vision level string: ";
                    }
                    sb2.append(str2);
                    sb3 = sb2;
                    break Label_0026;
                }
                sb = new StringBuilder();
            }
            sb.append("Ignoring malformed Dolby Vision codec string: ");
            sb3 = sb;
            str = s;
        }
        sb3.append(str);
        o.h("MediaCodecUtil", sb3.toString());
        return null;
    }
    
    public static Pair z(String group, final String[] array, final h h) {
        String str2 = null;
        StringBuilder sb4 = null;
        Label_0026: {
            StringBuilder sb;
            if (array.length < 4) {
                sb = new StringBuilder();
            }
            else {
                final Pattern a = I.a;
                int i = 1;
                final Matcher matcher = a.matcher(array[1]);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    String str = null;
                    StringBuilder sb3 = null;
                    Label_0156: {
                        if (!"1".equals(group)) {
                            if (!"2".equals(group)) {
                                final StringBuilder sb2 = new StringBuilder();
                                str = "Unknown HEVC profile string: ";
                                str2 = group;
                                sb3 = sb2;
                                break Label_0156;
                            }
                            if (h != null && h.c == 6) {
                                i = 4096;
                            }
                            else {
                                i = 2;
                            }
                        }
                        str2 = array[3];
                        final Integer b = B(str2);
                        if (b != null) {
                            return new Pair((Object)i, (Object)b);
                        }
                        sb3 = new StringBuilder();
                        str = "Unknown HEVC level string: ";
                    }
                    sb3.append(str);
                    sb4 = sb3;
                    break Label_0026;
                }
                sb = new StringBuilder();
            }
            sb.append("Ignoring malformed HEVC codec string: ");
            sb4 = sb;
            str2 = group;
        }
        sb4.append(str2);
        o.h("MediaCodecUtil", sb4.toString());
        return null;
    }
    
    public static final class b
    {
        public final String a;
        public final boolean b;
        public final boolean c;
        
        public b(final String a, final boolean b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (o.getClass() != b.class) {
                return false;
            }
            final b b = (b)o;
            return TextUtils.equals((CharSequence)this.a, (CharSequence)b.a) && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final boolean b = this.b;
            int n = 1237;
            int n2;
            if (b) {
                n2 = 1231;
            }
            else {
                n2 = 1237;
            }
            if (this.c) {
                n = 1231;
            }
            return ((hashCode + 31) * 31 + n2) * 31 + n;
        }
    }
    
    public static class c extends Exception
    {
        public c(final Throwable cause) {
            super("Failed to query underlying media codecs", cause);
        }
    }
    
    public interface d
    {
        MediaCodecInfo a(final int p0);
        
        boolean b(final String p0, final String p1, final MediaCodecInfo$CodecCapabilities p2);
        
        int c();
        
        boolean d(final String p0, final String p1, final MediaCodecInfo$CodecCapabilities p2);
        
        boolean e();
    }
    
    public static final class e implements d
    {
        @Override
        public MediaCodecInfo a(final int n) {
            return MediaCodecList.getCodecInfoAt(n);
        }
        
        @Override
        public boolean b(final String s, final String s2, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
            return false;
        }
        
        @Override
        public int c() {
            return MediaCodecList.getCodecCount();
        }
        
        @Override
        public boolean d(final String anObject, final String anObject2, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
            return "secure-playback".equals(anObject) && "video/avc".equals(anObject2);
        }
        
        @Override
        public boolean e() {
            return false;
        }
    }
    
    public static final class f implements d
    {
        public final int a;
        public MediaCodecInfo[] b;
        
        public f(final boolean b, final boolean b2) {
            this.a = ((b || b2) ? 1 : 0);
        }
        
        @Override
        public MediaCodecInfo a(final int n) {
            this.f();
            return this.b[n];
        }
        
        @Override
        public boolean b(final String s, final String s2, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
            return mediaCodecInfo$CodecCapabilities.isFeatureRequired(s);
        }
        
        @Override
        public int c() {
            this.f();
            return this.b.length;
        }
        
        @Override
        public boolean d(final String s, final String s2, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
            return mediaCodecInfo$CodecCapabilities.isFeatureSupported(s);
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
    
    public interface g
    {
        int a(final Object p0);
    }
}
