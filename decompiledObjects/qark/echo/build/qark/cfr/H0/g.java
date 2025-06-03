/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package H0;

import H0.a;
import X2.v;
import d0.q;
import g0.M;
import g0.o;
import g0.z;
import java.util.List;

public final class g
implements a {
    public final q a;

    public g(q q8) {
        this.a = q8;
    }

    public static String b(int n8) {
        switch (n8) {
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
            case 2021026148: 
        }
        return "video/mp4v-es";
    }

    public static String c(int n8) {
        if (n8 != 1) {
            if (n8 != 85) {
                if (n8 != 255) {
                    if (n8 != 8192) {
                        if (n8 != 8193) {
                            return null;
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/ac3";
                }
                return "audio/mp4a-latm";
            }
            return "audio/mpeg";
        }
        return "audio/raw";
    }

    public static a d(z object) {
        object.U(4);
        int n8 = object.t();
        int n9 = object.t();
        object.U(4);
        int n10 = object.t();
        object = g.b(n10);
        if (object == null) {
            object = new StringBuilder();
            object.append("Ignoring track with unsupported compression ");
            object.append(n10);
            o.h("StreamFormatChunk", object.toString());
            return null;
        }
        q.b b8 = new q.b();
        b8.v0(n8).Y(n9).o0((String)object);
        return new g(b8.K());
    }

    public static a e(int n8, z z8) {
        if (n8 == 2) {
            return g.d(z8);
        }
        if (n8 == 1) {
            return g.f(z8);
        }
        z8 = new StringBuilder();
        z8.append("Ignoring strf box for unsupported track type: ");
        z8.append(M.p0(n8));
        o.h("StreamFormatChunk", z8.toString());
        return null;
    }

    public static a f(z object) {
        int n8 = object.y();
        String string2 = g.c(n8);
        if (string2 == null) {
            object = new StringBuilder();
            object.append("Ignoring track with unsupported format tag ");
            object.append(n8);
            o.h("StreamFormatChunk", object.toString());
            return null;
        }
        int n9 = object.y();
        int n10 = object.t();
        object.U(6);
        int n11 = M.e0(object.y());
        n8 = object.a() > 0 ? object.y() : 0;
        byte[] arrby = new byte[n8];
        object.l(arrby, 0, n8);
        object = new q.b();
        object.o0(string2).N(n9).p0(n10);
        if ("audio/raw".equals((Object)string2) && n11 != 0) {
            object.i0(n11);
        }
        if ("audio/mp4a-latm".equals((Object)string2) && n8 > 0) {
            object.b0(v.Z(arrby));
        }
        return new g(object.K());
    }

    @Override
    public int a() {
        return 1718776947;
    }
}

