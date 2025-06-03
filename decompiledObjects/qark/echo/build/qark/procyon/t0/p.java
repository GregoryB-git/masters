// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCodecInfo$AudioCapabilities;
import android.util.Pair;
import d0.h;
import d0.q;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.graphics.Point;
import android.media.MediaCodecInfo$VideoCapabilities;
import g0.o;
import g0.M;
import d0.z;
import g0.a;
import android.media.MediaCodecInfo$CodecCapabilities;

public final class p
{
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo$CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    
    public p(final String s, final String b, final String c, final MediaCodecInfo$CodecCapabilities d, final boolean h, final boolean i, final boolean j, final boolean e, final boolean f, final boolean g) {
        this.a = (String)g0.a.e(s);
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.i = i;
        this.j = j;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = z.s(b);
    }
    
    public static boolean A(String b, final int n) {
        if ("video/hevc".equals(b) && 2 == n) {
            b = M.b;
            if ("sailfish".equals(b) || "marlin".equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean B(final String anObject) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(anObject) || !"mcv5a".equals(M.b);
    }
    
    public static p C(final String s, final String s2, final String s3, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return new p(s, s2, s3, mediaCodecInfo$CodecCapabilities, b, b2, b3, !b4 && mediaCodecInfo$CodecCapabilities != null && h(mediaCodecInfo$CodecCapabilities) && !z(s), mediaCodecInfo$CodecCapabilities != null && s(mediaCodecInfo$CodecCapabilities), b5 || (mediaCodecInfo$CodecCapabilities != null && q(mediaCodecInfo$CodecCapabilities)));
    }
    
    public static int a(final String str, final String anObject, final int i) {
        if (i <= 1) {
            if (M.a >= 26 && i > 0) {
                return i;
            }
            if (!"audio/mpeg".equals(anObject) && !"audio/3gpp".equals(anObject) && !"audio/amr-wb".equals(anObject) && !"audio/mp4a-latm".equals(anObject) && !"audio/vorbis".equals(anObject) && !"audio/opus".equals(anObject) && !"audio/raw".equals(anObject) && !"audio/flac".equals(anObject) && !"audio/g711-alaw".equals(anObject) && !"audio/g711-mlaw".equals(anObject)) {
                if ("audio/gsm".equals(anObject)) {
                    return i;
                }
                int j;
                if ("audio/ac3".equals(anObject)) {
                    j = 6;
                }
                else if ("audio/eac3".equals(anObject)) {
                    j = 16;
                }
                else {
                    j = 30;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("AssumedMaxChannelAdjustment: ");
                sb.append(str);
                sb.append(", [");
                sb.append(i);
                sb.append(" to ");
                sb.append(j);
                sb.append("]");
                o.h("MediaCodecInfo", sb.toString());
                return j;
            }
        }
        return i;
    }
    
    public static Point c(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, final int n, final int n2) {
        final int widthAlignment = mediaCodecInfo$VideoCapabilities.getWidthAlignment();
        final int heightAlignment = mediaCodecInfo$VideoCapabilities.getHeightAlignment();
        return new Point(M.k(n, widthAlignment) * widthAlignment, M.k(n2, heightAlignment) * heightAlignment);
    }
    
    public static boolean d(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int x, int y, final double a) {
        final Point c = c(mediaCodecInfo$VideoCapabilities, x, y);
        x = c.x;
        y = c.y;
        if (a != -1.0 && a >= 1.0) {
            return mediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(x, y, Math.floor(a));
        }
        return mediaCodecInfo$VideoCapabilities.isSizeSupported(x, y);
    }
    
    public static MediaCodecInfo$CodecProfileLevel[] f(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        int intValue = 0;
        Label_0032: {
            if (mediaCodecInfo$CodecCapabilities != null) {
                final MediaCodecInfo$VideoCapabilities videoCapabilities = mediaCodecInfo$CodecCapabilities.getVideoCapabilities();
                if (videoCapabilities != null) {
                    intValue = (int)videoCapabilities.getBitrateRange().getUpper();
                    break Label_0032;
                }
            }
            intValue = 0;
        }
        int level;
        if (intValue >= 180000000) {
            level = 1024;
        }
        else if (intValue >= 120000000) {
            level = 512;
        }
        else if (intValue >= 60000000) {
            level = 256;
        }
        else if (intValue >= 30000000) {
            level = 128;
        }
        else if (intValue >= 18000000) {
            level = 64;
        }
        else if (intValue >= 12000000) {
            level = 32;
        }
        else if (intValue >= 7200000) {
            level = 16;
        }
        else if (intValue >= 3600000) {
            level = 8;
        }
        else if (intValue >= 1800000) {
            level = 4;
        }
        else if (intValue >= 800000) {
            level = 2;
        }
        else {
            level = 1;
        }
        final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel = new MediaCodecInfo$CodecProfileLevel();
        mediaCodecInfo$CodecProfileLevel.profile = 1;
        mediaCodecInfo$CodecProfileLevel.level = level;
        return new MediaCodecInfo$CodecProfileLevel[] { mediaCodecInfo$CodecProfileLevel };
    }
    
    public static boolean h(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return mediaCodecInfo$CodecCapabilities.isFeatureSupported("adaptive-playback");
    }
    
    public static boolean q(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return M.a >= 21 && r(mediaCodecInfo$CodecCapabilities);
    }
    
    public static boolean r(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return mediaCodecInfo$CodecCapabilities.isFeatureSupported("secure-playback");
    }
    
    public static boolean s(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return M.a >= 21 && t(mediaCodecInfo$CodecCapabilities);
    }
    
    public static boolean t(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return mediaCodecInfo$CodecCapabilities.isFeatureSupported("tunneled-playback");
    }
    
    public static boolean x(final String anObject) {
        return "audio/opus".equals(anObject);
    }
    
    public static boolean y(final String anObject) {
        return M.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(anObject);
    }
    
    public static boolean z(final String s) {
        if (M.a <= 22) {
            final String d = M.d;
            if (("ODROID-XU3".equals(d) || "Nexus 10".equals(d)) && ("OMX.Exynos.AVC.Decoder".equals(s) || "OMX.Exynos.AVC.Decoder.secure".equals(s))) {
                return true;
            }
        }
        return false;
    }
    
    public Point b(final int n, final int n2) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        if (d == null) {
            return null;
        }
        final MediaCodecInfo$VideoCapabilities videoCapabilities = d.getVideoCapabilities();
        if (videoCapabilities == null) {
            return null;
        }
        return c(videoCapabilities, n, n2);
    }
    
    public k0.p e(final q q, final q q2) {
        int n;
        if (!M.c(q.n, q2.n)) {
            n = 8;
        }
        else {
            n = 0;
        }
        int n6;
        if (this.k) {
            int n2 = n;
            if (q.w != q2.w) {
                n2 = (n | 0x400);
            }
            int n3 = n2;
            Label_0092: {
                if (!this.e) {
                    if (q.t == q2.t) {
                        n3 = n2;
                        if (q.u == q2.u) {
                            break Label_0092;
                        }
                    }
                    n3 = (n2 | 0x200);
                }
            }
            int n4 = 0;
            Label_0139: {
                if (d0.h.h(q.A)) {
                    n4 = n3;
                    if (d0.h.h(q2.A)) {
                        break Label_0139;
                    }
                }
                n4 = n3;
                if (!M.c(q.A, q2.A)) {
                    n4 = (n3 | 0x800);
                }
            }
            int n5 = n4;
            if (y(this.a)) {
                n5 = n4;
                if (!q.e(q2)) {
                    n5 = (n4 | 0x2);
                }
            }
            if ((n6 = n5) == 0) {
                final String a = this.a;
                int n7;
                if (q.e(q2)) {
                    n7 = 3;
                }
                else {
                    n7 = 2;
                }
                return new k0.p(a, q, q2, n7, 0);
            }
        }
        else {
            int n8 = n;
            if (q.B != q2.B) {
                n8 = (n | 0x1000);
            }
            int n9 = n8;
            if (q.C != q2.C) {
                n9 = (n8 | 0x2000);
            }
            int n10 = n9;
            if (q.D != q2.D) {
                n10 = (n9 | 0x4000);
            }
            if (n10 == 0 && "audio/mp4a-latm".equals(this.b)) {
                final Pair r = I.r(q);
                final Pair r2 = I.r(q2);
                if (r != null && r2 != null) {
                    final int intValue = (int)r.first;
                    final int intValue2 = (int)r2.first;
                    if (intValue == 42 && intValue2 == 42) {
                        return new k0.p(this.a, q, q2, 3, 0);
                    }
                }
            }
            int n11 = n10;
            if (!q.e(q2)) {
                n11 = (n10 | 0x20);
            }
            int n12 = n11;
            if (x(this.b)) {
                n12 = (n11 | 0x2);
            }
            if ((n6 = n12) == 0) {
                return new k0.p(this.a, q, q2, 1, 0);
            }
        }
        return new k0.p(this.a, q, q2, 0, n6);
    }
    
    public MediaCodecInfo$CodecProfileLevel[] g() {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        MediaCodecInfo$CodecProfileLevel[] profileLevels;
        if (d == null || (profileLevels = d.profileLevels) == null) {
            profileLevels = new MediaCodecInfo$CodecProfileLevel[0];
        }
        return profileLevels;
    }
    
    public boolean i(final int i) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        String string;
        if (d == null) {
            string = "channelCount.caps";
        }
        else {
            final MediaCodecInfo$AudioCapabilities audioCapabilities = d.getAudioCapabilities();
            if (audioCapabilities == null) {
                string = "channelCount.aCaps";
            }
            else {
                if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                    return true;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("channelCount.support, ");
                sb.append(i);
                string = sb.toString();
            }
        }
        this.w(string);
        return false;
    }
    
    public boolean j(final int i) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        String string;
        if (d == null) {
            string = "sampleRate.caps";
        }
        else {
            final MediaCodecInfo$AudioCapabilities audioCapabilities = d.getAudioCapabilities();
            if (audioCapabilities == null) {
                string = "sampleRate.aCaps";
            }
            else {
                if (audioCapabilities.isSampleRateSupported(i)) {
                    return true;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("sampleRate.support, ");
                sb.append(i);
                string = sb.toString();
            }
        }
        this.w(string);
        return false;
    }
    
    public final boolean k(final q q, final boolean b) {
        final Pair r = I.r(q);
        if (r == null) {
            return true;
        }
        final int intValue = (int)r.first;
        int intValue2 = (int)r.second;
        int n = intValue;
        Label_0105: {
            if ("video/dolby-vision".equals(q.n)) {
                if ("video/avc".equals(this.b)) {
                    n = 8;
                }
                else {
                    intValue2 = intValue2;
                    n = intValue;
                    if (!"video/hevc".equals(this.b)) {
                        break Label_0105;
                    }
                    n = 2;
                }
                intValue2 = 0;
            }
        }
        if (!this.k && n != 42) {
            return true;
        }
        MediaCodecInfo$CodecProfileLevel[] array2;
        final MediaCodecInfo$CodecProfileLevel[] array = array2 = this.g();
        if (M.a <= 23) {
            array2 = array;
            if ("video/x-vnd.on2.vp9".equals(this.b)) {
                array2 = array;
                if (array.length == 0) {
                    array2 = f(this.d);
                }
            }
        }
        for (int length = array2.length, i = 0; i < length; ++i) {
            final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel = array2[i];
            if (mediaCodecInfo$CodecProfileLevel.profile == n && (mediaCodecInfo$CodecProfileLevel.level >= intValue2 || !b) && !A(this.b, n)) {
                return true;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("codec.profileLevel, ");
        sb.append(q.j);
        sb.append(", ");
        sb.append(this.c);
        this.w(sb.toString());
        return false;
    }
    
    public boolean l(final q q) {
        final boolean o = this.o(q);
        boolean b = false;
        if (o) {
            b = b;
            if (this.k(q, false)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean m(final q q) {
        final boolean o = this.o(q);
        final boolean b = false;
        boolean b2 = false;
        if (!o) {
            return false;
        }
        if (!this.k(q, true)) {
            return false;
        }
        if (!this.k) {
            if (M.a >= 21) {
                final int c = q.C;
                if (c != -1) {
                    final boolean b3 = b;
                    if (!this.j(c)) {
                        return b3;
                    }
                }
                final int b4 = q.B;
                if (b4 != -1) {
                    final boolean b3 = b;
                    if (!this.i(b4)) {
                        return b3;
                    }
                }
            }
            return true;
        }
        final int t = q.t;
        if (t <= 0) {
            return true;
        }
        final int u = q.u;
        if (u <= 0) {
            return true;
        }
        if (M.a >= 21) {
            return this.u(t, u, q.v);
        }
        if (t * u <= I.P()) {
            b2 = true;
        }
        if (!b2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("legacyFrameSize, ");
            sb.append(q.t);
            sb.append("x");
            sb.append(q.u);
            this.w(sb.toString());
        }
        return b2;
    }
    
    public boolean n() {
        if (M.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            final MediaCodecInfo$CodecProfileLevel[] g = this.g();
            for (int length = g.length, i = 0; i < length; ++i) {
                if (g[i].profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean o(final q q) {
        return this.b.equals(q.n) || this.b.equals(I.m(q));
    }
    
    public boolean p(final q q) {
        if (this.k) {
            return this.e;
        }
        final Pair r = I.r(q);
        return r != null && (int)r.first == 42;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
    
    public boolean u(final int n, final int n2, final double n3) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        String string = null;
        Label_0016: {
            if (d == null) {
                string = "sizeAndRate.caps";
            }
            else {
                final MediaCodecInfo$VideoCapabilities videoCapabilities = d.getVideoCapabilities();
                if (videoCapabilities == null) {
                    string = "sizeAndRate.vCaps";
                }
                else {
                    while (true) {
                        Label_0147: {
                            if (M.a < 29) {
                                break Label_0147;
                            }
                            final int c = v.c(videoCapabilities, n, n2, n3);
                            if (c == 2) {
                                return true;
                            }
                            if (c != 1) {
                                break Label_0147;
                            }
                            final StringBuilder sb = new StringBuilder();
                            final String str = "sizeAndRate.cover, ";
                            sb.append(str);
                            sb.append(n);
                            sb.append("x");
                            sb.append(n2);
                            sb.append("@");
                            sb.append(n3);
                            string = sb.toString();
                            break Label_0016;
                        }
                        if (d(videoCapabilities, n, n2, n3)) {
                            return true;
                        }
                        if (n < n2 && B(this.a) && d(videoCapabilities, n2, n, n3)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(n);
                            sb2.append("x");
                            sb2.append(n2);
                            sb2.append("@");
                            sb2.append(n3);
                            this.v(sb2.toString());
                            return true;
                        }
                        final StringBuilder sb = new StringBuilder();
                        final String str = "sizeAndRate.support, ";
                        continue;
                    }
                }
            }
        }
        this.w(string);
        return false;
    }
    
    public final void v(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append("] [");
        sb.append(M.e);
        sb.append("]");
        o.b("MediaCodecInfo", sb.toString());
    }
    
    public final void w(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append("] [");
        sb.append(M.e);
        sb.append("]");
        o.b("MediaCodecInfo", sb.toString());
    }
}
