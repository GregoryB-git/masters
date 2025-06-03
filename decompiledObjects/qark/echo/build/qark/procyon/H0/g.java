// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import java.util.List;
import X2.v;
import g0.M;
import g0.o;
import g0.z;
import d0.q;

public final class g implements a
{
    public final q a;
    
    public g(final q a) {
        this.a = a;
    }
    
    public static String b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1196444237:
            case 1735420525: {
                return "video/mjpeg";
            }
            case 859066445: {
                return "video/mp43";
            }
            case 842289229: {
                return "video/mp42";
            }
            case 826496577:
            case 828601953:
            case 875967048: {
                return "video/avc";
            }
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148: {
                return "video/mp4v-es";
            }
        }
    }
    
    public static String c(final int n) {
        if (n == 1) {
            return "audio/raw";
        }
        if (n == 85) {
            return "audio/mpeg";
        }
        if (n == 255) {
            return "audio/mp4a-latm";
        }
        if (n == 8192) {
            return "audio/ac3";
        }
        if (n != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }
    
    public static a d(final z z) {
        z.U(4);
        final int t = z.t();
        final int t2 = z.t();
        z.U(4);
        final int t3 = z.t();
        final String b = b(t3);
        if (b == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring track with unsupported compression ");
            sb.append(t3);
            o.h("StreamFormatChunk", sb.toString());
            return null;
        }
        final q.b b2 = new q.b();
        b2.v0(t).Y(t2).o0(b);
        return new g(b2.K());
    }
    
    public static a e(final int n, final z z) {
        if (n == 2) {
            return d(z);
        }
        if (n == 1) {
            return f(z);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Ignoring strf box for unsupported track type: ");
        sb.append(M.p0(n));
        o.h("StreamFormatChunk", sb.toString());
        return null;
    }
    
    public static a f(final z z) {
        final int y = z.y();
        final String c = c(y);
        if (c == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring track with unsupported format tag ");
            sb.append(y);
            o.h("StreamFormatChunk", sb.toString());
            return null;
        }
        final int y2 = z.y();
        final int t = z.t();
        z.U(6);
        final int e0 = M.e0(z.y());
        int y3;
        if (z.a() > 0) {
            y3 = z.y();
        }
        else {
            y3 = 0;
        }
        final byte[] array = new byte[y3];
        z.l(array, 0, y3);
        final q.b b = new q.b();
        b.o0(c).N(y2).p0(t);
        if ("audio/raw".equals(c) && e0 != 0) {
            b.i0(e0);
        }
        if ("audio/mp4a-latm".equals(c) && y3 > 0) {
            b.b0(v.Z(array));
        }
        return new g(b.K());
    }
    
    @Override
    public int a() {
        return 1718776947;
    }
}
