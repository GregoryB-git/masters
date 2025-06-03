package H0;

import X2.AbstractC0703v;
import d0.C1194q;
import g0.M;
import g0.o;
import g0.z;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final C1194q f2161a;

    public g(C1194q c1194q) {
        this.f2161a = c1194q;
    }

    public static String b(int i7) {
        switch (i7) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String c(int i7) {
        if (i7 == 1) {
            return "audio/raw";
        }
        if (i7 == 85) {
            return "audio/mpeg";
        }
        if (i7 == 255) {
            return "audio/mp4a-latm";
        }
        if (i7 == 8192) {
            return "audio/ac3";
        }
        if (i7 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static a d(z zVar) {
        zVar.U(4);
        int t7 = zVar.t();
        int t8 = zVar.t();
        zVar.U(4);
        int t9 = zVar.t();
        String b7 = b(t9);
        if (b7 != null) {
            C1194q.b bVar = new C1194q.b();
            bVar.v0(t7).Y(t8).o0(b7);
            return new g(bVar.K());
        }
        o.h("StreamFormatChunk", "Ignoring track with unsupported compression " + t9);
        return null;
    }

    public static a e(int i7, z zVar) {
        if (i7 == 2) {
            return d(zVar);
        }
        if (i7 == 1) {
            return f(zVar);
        }
        o.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + M.p0(i7));
        return null;
    }

    public static a f(z zVar) {
        int y7 = zVar.y();
        String c7 = c(y7);
        if (c7 == null) {
            o.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + y7);
            return null;
        }
        int y8 = zVar.y();
        int t7 = zVar.t();
        zVar.U(6);
        int e02 = M.e0(zVar.y());
        int y9 = zVar.a() > 0 ? zVar.y() : 0;
        byte[] bArr = new byte[y9];
        zVar.l(bArr, 0, y9);
        C1194q.b bVar = new C1194q.b();
        bVar.o0(c7).N(y8).p0(t7);
        if ("audio/raw".equals(c7) && e02 != 0) {
            bVar.i0(e02);
        }
        if ("audio/mp4a-latm".equals(c7) && y9 > 0) {
            bVar.b0(AbstractC0703v.Z(bArr));
        }
        return new g(bVar.K());
    }

    @Override // H0.a
    public int a() {
        return 1718776947;
    }
}
