// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import android.os.BaseBundle;
import android.os.Message;
import android.os.Handler$Callback;
import android.view.Display;
import android.hardware.display.DisplayManager;
import k0.v0;
import g0.r;
import b3.f;
import java.nio.ByteBuffer;
import android.media.MediaCrypto;
import k0.Z0;
import j0.i;
import X2.v;
import android.graphics.Point;
import android.util.Pair;
import t0.I;
import g0.a;
import android.media.MediaFormat;
import k0.u;
import g0.M;
import android.os.Bundle;
import android.os.Handler;
import t0.z;
import t0.m;
import d0.P;
import g0.A;
import android.view.Surface;
import java.util.List;
import android.content.Context;
import t0.w;

public class k extends w implements q.b
{
    public static final int[] C1;
    public static boolean D1;
    public static boolean E1;
    public d A1;
    public p B1;
    public final Context V0;
    public final G W0;
    public final boolean X0;
    public final E.a Y0;
    public final int Z0;
    public final boolean a1;
    public final q b1;
    public final q.a c1;
    public c d1;
    public boolean e1;
    public boolean f1;
    public F g1;
    public boolean h1;
    public List i1;
    public Surface j1;
    public o k1;
    public A l1;
    public boolean m1;
    public int n1;
    public long o1;
    public int p1;
    public int q1;
    public int r1;
    public long s1;
    public int t1;
    public long u1;
    public P v1;
    public P w1;
    public int x1;
    public boolean y1;
    public int z1;
    
    static {
        C1 = new int[] { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
    }
    
    public k(final Context context, final m.b b, final z z, final long n, final boolean b2, final Handler handler, final E e, final int n2) {
        this(context, b, z, n, b2, handler, e, n2, 30.0f);
    }
    
    public k(final Context context, final m.b b, final z z, final long n, final boolean b2, final Handler handler, final E e, final int n2, final float n3) {
        this(context, b, z, n, b2, handler, e, n2, n3, null);
    }
    
    public k(Context applicationContext, final m.b b, final z z, final long n, final boolean b2, final Handler handler, final E e, final int z2, final float n2, final G w0) {
        super(2, b, z, b2, n2);
        applicationContext = applicationContext.getApplicationContext();
        this.V0 = applicationContext;
        this.Z0 = z2;
        this.W0 = w0;
        this.Y0 = new E.a(handler, e);
        this.X0 = (w0 == null);
        if (w0 == null) {
            this.b1 = new q(applicationContext, (q.b)this, n);
        }
        else {
            this.b1 = w0.a();
        }
        this.c1 = new q.a();
        this.a1 = Y1();
        this.l1 = g0.A.c;
        this.n1 = 1;
        this.v1 = d0.P.e;
        this.z1 = 0;
        this.w1 = null;
        this.x1 = -1000;
    }
    
    public static void C2(final m m, final byte[] array) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", array);
        m.c(bundle);
    }
    
    private void M2() {
        final m f0 = this.F0();
        if (f0 == null) {
            return;
        }
        if (g0.M.a >= 35) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("importance", Math.max(0, -this.x1));
            f0.c(bundle);
        }
    }
    
    public static /* synthetic */ Surface Q1(final k k) {
        return k.j1;
    }
    
    public static boolean V1() {
        return M.a >= 21;
    }
    
    public static void X1(final MediaFormat mediaFormat, final int n) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", n);
    }
    
    public static boolean Y1() {
        return "NVIDIA".equals(M.c);
    }
    
    public static boolean a2() {
        final int a = M.a;
        final int n = 7;
        if (a <= 28) {
            final String b = M.b;
            b.hashCode();
            int n2 = 0;
            Label_0245: {
                switch (b) {
                    case "machuca": {
                        n2 = 7;
                        break Label_0245;
                    }
                    case "once": {
                        n2 = 6;
                        break Label_0245;
                    }
                    case "magnolia": {
                        n2 = 5;
                        break Label_0245;
                    }
                    case "aquaman": {
                        n2 = 4;
                        break Label_0245;
                    }
                    case "oneday": {
                        n2 = 3;
                        break Label_0245;
                    }
                    case "dangalUHD": {
                        n2 = 2;
                        break Label_0245;
                    }
                    case "dangalFHD": {
                        n2 = 1;
                        break Label_0245;
                    }
                    case "dangal": {
                        n2 = 0;
                        break Label_0245;
                    }
                    default:
                        break;
                }
                n2 = -1;
            }
            switch (n2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7: {
                    return true;
                }
            }
        }
        if (a <= 27 && "HWEML".equals(M.b)) {
            return true;
        }
        final String d = M.d;
        d.hashCode();
        int n3 = 0;
        Label_0579: {
            switch (d) {
                case "AFTEUFF014": {
                    n3 = 8;
                    break Label_0579;
                }
                case "AFTSO001": {
                    n3 = 7;
                    break Label_0579;
                }
                case "AFTEU014": {
                    n3 = 6;
                    break Label_0579;
                }
                case "AFTEU011": {
                    n3 = 5;
                    break Label_0579;
                }
                case "AFTR": {
                    n3 = 4;
                    break Label_0579;
                }
                case "AFTN": {
                    n3 = 3;
                    break Label_0579;
                }
                case "AFTA": {
                    n3 = 2;
                    break Label_0579;
                }
                case "AFTKMST12": {
                    n3 = 1;
                    break Label_0579;
                }
                case "AFTJMST12": {
                    n3 = 0;
                    break Label_0579;
                }
                default:
                    break;
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                if (a > 26) {
                    return false;
                }
                final String b2 = M.b;
                b2.hashCode();
                int n4 = 0;
                Label_4588: {
                    switch (b2.hashCode()) {
                        case 2048855701: {
                            if (!b2.equals("HWWAS-H")) {
                                break;
                            }
                            n4 = 139;
                            break Label_4588;
                        }
                        case 2048319463: {
                            if (!b2.equals("HWVNS-H")) {
                                break;
                            }
                            n4 = 138;
                            break Label_4588;
                        }
                        case 2047252157: {
                            if (!b2.equals("ELUGA_Prim")) {
                                break;
                            }
                            n4 = 137;
                            break Label_4588;
                        }
                        case 2047190025: {
                            if (!b2.equals("ELUGA_Note")) {
                                break;
                            }
                            n4 = 136;
                            break Label_4588;
                        }
                        case 2033393791: {
                            if (!b2.equals("ASUS_X00AD_2")) {
                                break;
                            }
                            n4 = 135;
                            break Label_4588;
                        }
                        case 2030379515: {
                            if (!b2.equals("HWCAM-H")) {
                                break;
                            }
                            n4 = 134;
                            break Label_4588;
                        }
                        case 2029784656: {
                            if (!b2.equals("HWBLN-H")) {
                                break;
                            }
                            n4 = 133;
                            break Label_4588;
                        }
                        case 2019281702: {
                            if (!b2.equals("DM-01K")) {
                                break;
                            }
                            n4 = 132;
                            break Label_4588;
                        }
                        case 2006372676: {
                            if (!b2.equals("BRAVIA_ATV3_4K")) {
                                break;
                            }
                            n4 = 131;
                            break Label_4588;
                        }
                        case 1977196784: {
                            if (!b2.equals("Infinix-X572")) {
                                break;
                            }
                            n4 = 130;
                            break Label_4588;
                        }
                        case 1906253259: {
                            if (!b2.equals("PB2-670M")) {
                                break;
                            }
                            n4 = 129;
                            break Label_4588;
                        }
                        case 1865889110: {
                            if (!b2.equals("santoni")) {
                                break;
                            }
                            n4 = 128;
                            break Label_4588;
                        }
                        case 1709443163: {
                            if (!b2.equals("iball8735_9806")) {
                                break;
                            }
                            n4 = 127;
                            break Label_4588;
                        }
                        case 1691544261: {
                            if (!b2.equals("CPH1715")) {
                                break;
                            }
                            n4 = 126;
                            break Label_4588;
                        }
                        case 1691543273: {
                            if (!b2.equals("CPH1609")) {
                                break;
                            }
                            n4 = 125;
                            break Label_4588;
                        }
                        case 1522194893: {
                            if (!b2.equals("woods_f")) {
                                break;
                            }
                            n4 = 124;
                            break Label_4588;
                        }
                        case 1349174697: {
                            if (!b2.equals("htc_e56ml_dtul")) {
                                break;
                            }
                            n4 = 123;
                            break Label_4588;
                        }
                        case 1306947716: {
                            if (!b2.equals("EverStar_S")) {
                                break;
                            }
                            n4 = 122;
                            break Label_4588;
                        }
                        case 1280332038: {
                            if (!b2.equals("hwALE-H")) {
                                break;
                            }
                            n4 = 121;
                            break Label_4588;
                        }
                        case 1176899427: {
                            if (!b2.equals("itel_S41")) {
                                break;
                            }
                            n4 = 120;
                            break Label_4588;
                        }
                        case 1150207623: {
                            if (!b2.equals("LS-5017")) {
                                break;
                            }
                            n4 = 119;
                            break Label_4588;
                        }
                        case 1060579533: {
                            if (!b2.equals("panell_d")) {
                                break;
                            }
                            n4 = 118;
                            break Label_4588;
                        }
                        case 958008161: {
                            if (!b2.equals("j2xlteins")) {
                                break;
                            }
                            n4 = 117;
                            break Label_4588;
                        }
                        case 917340916: {
                            if (!b2.equals("A7000plus")) {
                                break;
                            }
                            n4 = 116;
                            break Label_4588;
                        }
                        case 835649806: {
                            if (!b2.equals("manning")) {
                                break;
                            }
                            n4 = 115;
                            break Label_4588;
                        }
                        case 794040393: {
                            if (!b2.equals("GIONEE_WBL7519")) {
                                break;
                            }
                            n4 = 114;
                            break Label_4588;
                        }
                        case 794038622: {
                            if (!b2.equals("GIONEE_WBL7365")) {
                                break;
                            }
                            n4 = 113;
                            break Label_4588;
                        }
                        case 793982701: {
                            if (!b2.equals("GIONEE_WBL5708")) {
                                break;
                            }
                            n4 = 112;
                            break Label_4588;
                        }
                        case 507412548: {
                            if (!b2.equals("QM16XE_U")) {
                                break;
                            }
                            n4 = 111;
                            break Label_4588;
                        }
                        case 407160593: {
                            if (!b2.equals("Pixi5-10_4G")) {
                                break;
                            }
                            n4 = 110;
                            break Label_4588;
                        }
                        case 316246818: {
                            if (!b2.equals("TB3-850M")) {
                                break;
                            }
                            n4 = 109;
                            break Label_4588;
                        }
                        case 316246811: {
                            if (!b2.equals("TB3-850F")) {
                                break;
                            }
                            n4 = 108;
                            break Label_4588;
                        }
                        case 316215116: {
                            if (!b2.equals("TB3-730X")) {
                                break;
                            }
                            n4 = 107;
                            break Label_4588;
                        }
                        case 316215098: {
                            if (!b2.equals("TB3-730F")) {
                                break;
                            }
                            n4 = 106;
                            break Label_4588;
                        }
                        case 308517133: {
                            if (!b2.equals("A7020a48")) {
                                break;
                            }
                            n4 = 105;
                            break Label_4588;
                        }
                        case 307593612: {
                            if (!b2.equals("A7010a48")) {
                                break;
                            }
                            n4 = 104;
                            break Label_4588;
                        }
                        case 287431619: {
                            if (!b2.equals("griffin")) {
                                break;
                            }
                            n4 = 103;
                            break Label_4588;
                        }
                        case 245388979: {
                            if (!b2.equals("marino_f")) {
                                break;
                            }
                            n4 = 102;
                            break Label_4588;
                        }
                        case 182191441: {
                            if (!b2.equals("CPY83_I00")) {
                                break;
                            }
                            n4 = 101;
                            break Label_4588;
                        }
                        case 165221241: {
                            if (!b2.equals("A2016a40")) {
                                break;
                            }
                            n4 = 100;
                            break Label_4588;
                        }
                        case 102844228: {
                            if (!b2.equals("le_x6")) {
                                break;
                            }
                            n4 = 99;
                            break Label_4588;
                        }
                        case 101370885: {
                            if (!b2.equals("l5460")) {
                                break;
                            }
                            n4 = 98;
                            break Label_4588;
                        }
                        case 98715550: {
                            if (!b2.equals("i9031")) {
                                break;
                            }
                            n4 = 97;
                            break Label_4588;
                        }
                        case 82882791: {
                            if (!b2.equals("X3_HK")) {
                                break;
                            }
                            n4 = 96;
                            break Label_4588;
                        }
                        case 80963634: {
                            if (!b2.equals("V23GB")) {
                                break;
                            }
                            n4 = 95;
                            break Label_4588;
                        }
                        case 76404911: {
                            if (!b2.equals("Q4310")) {
                                break;
                            }
                            n4 = 94;
                            break Label_4588;
                        }
                        case 76404105: {
                            if (!b2.equals("Q4260")) {
                                break;
                            }
                            n4 = 93;
                            break Label_4588;
                        }
                        case 76402249: {
                            if (!b2.equals("PRO7S")) {
                                break;
                            }
                            n4 = 92;
                            break Label_4588;
                        }
                        case 66216390: {
                            if (!b2.equals("F3311")) {
                                break;
                            }
                            n4 = 91;
                            break Label_4588;
                        }
                        case 66215433: {
                            if (!b2.equals("F3215")) {
                                break;
                            }
                            n4 = 90;
                            break Label_4588;
                        }
                        case 66215431: {
                            if (!b2.equals("F3213")) {
                                break;
                            }
                            n4 = 89;
                            break Label_4588;
                        }
                        case 66215429: {
                            if (!b2.equals("F3211")) {
                                break;
                            }
                            n4 = 88;
                            break Label_4588;
                        }
                        case 66214473: {
                            if (!b2.equals("F3116")) {
                                break;
                            }
                            n4 = 87;
                            break Label_4588;
                        }
                        case 66214470: {
                            if (!b2.equals("F3113")) {
                                break;
                            }
                            n4 = 86;
                            break Label_4588;
                        }
                        case 66214468: {
                            if (!b2.equals("F3111")) {
                                break;
                            }
                            n4 = 85;
                            break Label_4588;
                        }
                        case 65355429: {
                            if (!b2.equals("E5643")) {
                                break;
                            }
                            n4 = 84;
                            break Label_4588;
                        }
                        case 61542055: {
                            if (!b2.equals("A1601")) {
                                break;
                            }
                            n4 = 83;
                            break Label_4588;
                        }
                        case 55178625: {
                            if (!b2.equals("Aura_Note_2")) {
                                break;
                            }
                            n4 = 82;
                            break Label_4588;
                        }
                        case 51350594: {
                            if (!b2.equals("602LV")) {
                                break;
                            }
                            n4 = 81;
                            break Label_4588;
                        }
                        case 51349633: {
                            if (!b2.equals("601LV")) {
                                break;
                            }
                            n4 = 80;
                            break Label_4588;
                        }
                        case 41325051: {
                            if (!b2.equals("MEIZU_M5")) {
                                break;
                            }
                            n4 = 79;
                            break Label_4588;
                        }
                        case 3386211: {
                            if (!b2.equals("p212")) {
                                break;
                            }
                            n4 = 78;
                            break Label_4588;
                        }
                        case 3351335: {
                            if (!b2.equals("mido")) {
                                break;
                            }
                            n4 = 77;
                            break Label_4588;
                        }
                        case 3284551: {
                            if (!b2.equals("kate")) {
                                break;
                            }
                            n4 = 76;
                            break Label_4588;
                        }
                        case 3154429: {
                            if (!b2.equals("fugu")) {
                                break;
                            }
                            n4 = 75;
                            break Label_4588;
                        }
                        case 2689555: {
                            if (!b2.equals("XE2X")) {
                                break;
                            }
                            n4 = 74;
                            break Label_4588;
                        }
                        case 2464648: {
                            if (!b2.equals("Q427")) {
                                break;
                            }
                            n4 = 73;
                            break Label_4588;
                        }
                        case 2463773: {
                            if (!b2.equals("Q350")) {
                                break;
                            }
                            n4 = 72;
                            break Label_4588;
                        }
                        case 2436959: {
                            if (!b2.equals("P681")) {
                                break;
                            }
                            n4 = 71;
                            break Label_4588;
                        }
                        case 2133184: {
                            if (!b2.equals("F04J")) {
                                break;
                            }
                            n4 = 70;
                            break Label_4588;
                        }
                        case 2133182: {
                            if (!b2.equals("F04H")) {
                                break;
                            }
                            n4 = 69;
                            break Label_4588;
                        }
                        case 2133151: {
                            if (!b2.equals("F03H")) {
                                break;
                            }
                            n4 = 68;
                            break Label_4588;
                        }
                        case 2133120: {
                            if (!b2.equals("F02H")) {
                                break;
                            }
                            n4 = 67;
                            break Label_4588;
                        }
                        case 2133091: {
                            if (!b2.equals("F01J")) {
                                break;
                            }
                            n4 = 66;
                            break Label_4588;
                        }
                        case 2133089: {
                            if (!b2.equals("F01H")) {
                                break;
                            }
                            n4 = 65;
                            break Label_4588;
                        }
                        case 1514185: {
                            if (!b2.equals("1714")) {
                                break;
                            }
                            n4 = 64;
                            break Label_4588;
                        }
                        case 1514184: {
                            if (!b2.equals("1713")) {
                                break;
                            }
                            n4 = 63;
                            break Label_4588;
                        }
                        case 1513190: {
                            if (!b2.equals("1601")) {
                                break;
                            }
                            n4 = 62;
                            break Label_4588;
                        }
                        case 101481: {
                            if (!b2.equals("flo")) {
                                break;
                            }
                            n4 = 61;
                            break Label_4588;
                        }
                        case 99329: {
                            if (!b2.equals("deb")) {
                                break;
                            }
                            n4 = 60;
                            break Label_4588;
                        }
                        case 98848: {
                            if (!b2.equals("cv3")) {
                                break;
                            }
                            n4 = 59;
                            break Label_4588;
                        }
                        case 98846: {
                            if (!b2.equals("cv1")) {
                                break;
                            }
                            n4 = 58;
                            break Label_4588;
                        }
                        case 88274: {
                            if (!b2.equals("Z80")) {
                                break;
                            }
                            n4 = 57;
                            break Label_4588;
                        }
                        case 80618: {
                            if (!b2.equals("QX1")) {
                                break;
                            }
                            n4 = 56;
                            break Label_4588;
                        }
                        case 79305: {
                            if (!b2.equals("PLE")) {
                                break;
                            }
                            n4 = 55;
                            break Label_4588;
                        }
                        case 78669: {
                            if (!b2.equals("P85")) {
                                break;
                            }
                            n4 = 54;
                            break Label_4588;
                        }
                        case 76779: {
                            if (!b2.equals("MX6")) {
                                break;
                            }
                            n4 = 53;
                            break Label_4588;
                        }
                        case 75739: {
                            if (!b2.equals("M5c")) {
                                break;
                            }
                            n4 = 52;
                            break Label_4588;
                        }
                        case 75537: {
                            if (!b2.equals("M04")) {
                                break;
                            }
                            n4 = 51;
                            break Label_4588;
                        }
                        case 73405: {
                            if (!b2.equals("JGZ")) {
                                break;
                            }
                            n4 = 50;
                            break Label_4588;
                        }
                        case 3483: {
                            if (!b2.equals("mh")) {
                                break;
                            }
                            n4 = 49;
                            break Label_4588;
                        }
                        case 3091: {
                            if (!b2.equals("b5")) {
                                break;
                            }
                            n4 = 48;
                            break Label_4588;
                        }
                        case 2719: {
                            if (!b2.equals("V5")) {
                                break;
                            }
                            n4 = 47;
                            break Label_4588;
                        }
                        case 2715: {
                            if (!b2.equals("V1")) {
                                break;
                            }
                            n4 = 46;
                            break Label_4588;
                        }
                        case 2564: {
                            if (!b2.equals("Q5")) {
                                break;
                            }
                            n4 = 45;
                            break Label_4588;
                        }
                        case 2126: {
                            if (!b2.equals("C1")) {
                                break;
                            }
                            n4 = 44;
                            break Label_4588;
                        }
                        case -56598463: {
                            if (!b2.equals("woods_fn")) {
                                break;
                            }
                            n4 = 43;
                            break Label_4588;
                        }
                        case -173639913: {
                            if (!b2.equals("ELUGA_A3_Pro")) {
                                break;
                            }
                            n4 = 42;
                            break Label_4588;
                        }
                        case -277133239: {
                            if (!b2.equals("Z12_PRO")) {
                                break;
                            }
                            n4 = 41;
                            break Label_4588;
                        }
                        case -282781963: {
                            if (!b2.equals("BLACK-1X")) {
                                break;
                            }
                            n4 = 40;
                            break Label_4588;
                        }
                        case -290434366: {
                            if (!b2.equals("taido_row")) {
                                break;
                            }
                            n4 = 39;
                            break Label_4588;
                        }
                        case -430914369: {
                            if (!b2.equals("Pixi4-7_3G")) {
                                break;
                            }
                            n4 = 38;
                            break Label_4588;
                        }
                        case -521118391: {
                            if (!b2.equals("GIONEE_GBL7360")) {
                                break;
                            }
                            n4 = 37;
                            break Label_4588;
                        }
                        case -575125681: {
                            if (!b2.equals("GiONEE_CBL7513")) {
                                break;
                            }
                            n4 = 36;
                            break Label_4588;
                        }
                        case -782144577: {
                            if (!b2.equals("OnePlus5T")) {
                                break;
                            }
                            n4 = 35;
                            break Label_4588;
                        }
                        case -788334647: {
                            if (!b2.equals("whyred")) {
                                break;
                            }
                            n4 = 34;
                            break Label_4588;
                        }
                        case -794946968: {
                            if (!b2.equals("watson")) {
                                break;
                            }
                            n4 = 33;
                            break Label_4588;
                        }
                        case -797483286: {
                            if (!b2.equals("SVP-DTV15")) {
                                break;
                            }
                            n4 = 32;
                            break Label_4588;
                        }
                        case -821392978: {
                            if (!b2.equals("A7000-a")) {
                                break;
                            }
                            n4 = 31;
                            break Label_4588;
                        }
                        case -842500323: {
                            if (!b2.equals("nicklaus_f")) {
                                break;
                            }
                            n4 = 30;
                            break Label_4588;
                        }
                        case -879245230: {
                            if (!b2.equals("tcl_eu")) {
                                break;
                            }
                            n4 = 29;
                            break Label_4588;
                        }
                        case -958336948: {
                            if (!b2.equals("ELUGA_Ray_X")) {
                                break;
                            }
                            n4 = 28;
                            break Label_4588;
                        }
                        case -965403638: {
                            if (!b2.equals("s905x018")) {
                                break;
                            }
                            n4 = 27;
                            break Label_4588;
                        }
                        case -993250458: {
                            if (!b2.equals("A10-70L")) {
                                break;
                            }
                            n4 = 26;
                            break Label_4588;
                        }
                        case -993250464: {
                            if (!b2.equals("A10-70F")) {
                                break;
                            }
                            n4 = 25;
                            break Label_4588;
                        }
                        case -1052835013: {
                            if (!b2.equals("namath")) {
                                break;
                            }
                            n4 = 24;
                            break Label_4588;
                        }
                        case -1139198265: {
                            if (!b2.equals("Slate_Pro")) {
                                break;
                            }
                            n4 = 23;
                            break Label_4588;
                        }
                        case -1180384755: {
                            if (!b2.equals("iris60")) {
                                break;
                            }
                            n4 = 22;
                            break Label_4588;
                        }
                        case -1217592143: {
                            if (!b2.equals("BRAVIA_ATV2")) {
                                break;
                            }
                            n4 = 21;
                            break Label_4588;
                        }
                        case -1320080169: {
                            if (!b2.equals("GiONEE_GBL7319")) {
                                break;
                            }
                            n4 = 20;
                            break Label_4588;
                        }
                        case -1481772729: {
                            if (!b2.equals("panell_dt")) {
                                break;
                            }
                            n4 = 19;
                            break Label_4588;
                        }
                        case -1481772730: {
                            if (!b2.equals("panell_ds")) {
                                break;
                            }
                            n4 = 18;
                            break Label_4588;
                        }
                        case -1481772737: {
                            if (!b2.equals("panell_dl")) {
                                break;
                            }
                            n4 = 17;
                            break Label_4588;
                        }
                        case -1554255044: {
                            if (!b2.equals("vernee_M5")) {
                                break;
                            }
                            n4 = 16;
                            break Label_4588;
                        }
                        case -1600724499: {
                            if (!b2.equals("pacificrim")) {
                                break;
                            }
                            n4 = 15;
                            break Label_4588;
                        }
                        case -1615810839: {
                            if (!b2.equals("Phantom6")) {
                                break;
                            }
                            n4 = 14;
                            break Label_4588;
                        }
                        case -1680025915: {
                            if (!b2.equals("ComioS1")) {
                                break;
                            }
                            n4 = 13;
                            break Label_4588;
                        }
                        case -1696512866: {
                            if (!b2.equals("XT1663")) {
                                break;
                            }
                            n4 = 12;
                            break Label_4588;
                        }
                        case -1885099851: {
                            if (!b2.equals("RAIJIN")) {
                                break;
                            }
                            n4 = 11;
                            break Label_4588;
                        }
                        case -1931988508: {
                            if (!b2.equals("AquaPowerM")) {
                                break;
                            }
                            n4 = 10;
                            break Label_4588;
                        }
                        case -1936688065: {
                            if (!b2.equals("PGN611")) {
                                break;
                            }
                            n4 = 9;
                            break Label_4588;
                        }
                        case -1936688066: {
                            if (!b2.equals("PGN610")) {
                                break;
                            }
                            n4 = 8;
                            break Label_4588;
                        }
                        case -1936688988: {
                            n4 = n;
                            if (!b2.equals("PGN528")) {
                                break;
                            }
                            break Label_4588;
                        }
                        case -1978990237: {
                            if (!b2.equals("NX573J")) {
                                break;
                            }
                            n4 = 6;
                            break Label_4588;
                        }
                        case -1978993182: {
                            if (!b2.equals("NX541J")) {
                                break;
                            }
                            n4 = 5;
                            break Label_4588;
                        }
                        case -2022874474: {
                            if (!b2.equals("CP8676_I02")) {
                                break;
                            }
                            n4 = 4;
                            break Label_4588;
                        }
                        case -2097309513: {
                            if (!b2.equals("K50a40")) {
                                break;
                            }
                            n4 = 3;
                            break Label_4588;
                        }
                        case -2144781160: {
                            if (!b2.equals("GIONEE_SWW1631")) {
                                break;
                            }
                            n4 = 2;
                            break Label_4588;
                        }
                        case -2144781185: {
                            if (!b2.equals("GIONEE_SWW1627")) {
                                break;
                            }
                            n4 = 1;
                            break Label_4588;
                        }
                        case -2144781245: {
                            if (!b2.equals("GIONEE_SWW1609")) {
                                break;
                            }
                            n4 = 0;
                            break Label_4588;
                        }
                    }
                    n4 = -1;
                }
                switch (n4) {
                    default: {
                        d.hashCode();
                        if (!d.equals("JSN-L21")) {
                            return false;
                        }
                        return true;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139: {
                        return true;
                    }
                }
                break;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                return true;
            }
        }
    }
    
    public static int c2(final t0.p p2, final d0.q q) {
        final int t = q.t;
        final int u = q.u;
        if (t == -1) {
            return -1;
        }
        if (u == -1) {
            return -1;
        }
        String anObject = (String)a.e(q.n);
        final boolean equals = "video/dolby-vision".equals(anObject);
        int n = 1;
        Label_0107: {
            if (equals) {
                final Pair r = I.r(q);
                if (r != null) {
                    final int intValue = (int)r.first;
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        anObject = "video/avc";
                        break Label_0107;
                    }
                }
                anObject = "video/hevc";
            }
        }
        anObject.hashCode();
        Label_0315: {
            switch (anObject) {
                case "video/x-vnd.on2.vp9": {
                    n = 6;
                    break Label_0315;
                }
                case "video/x-vnd.on2.vp8": {
                    n = 5;
                    break Label_0315;
                }
                case "video/avc": {
                    n = 4;
                    break Label_0315;
                }
                case "video/mp4v-es": {
                    n = 3;
                    break Label_0315;
                }
                case "video/hevc": {
                    n = 2;
                    break Label_0315;
                }
                case "video/av01": {
                    break Label_0315;
                }
                case "video/3gpp": {
                    n = 0;
                    break Label_0315;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 6: {
                return h2(t * u, 4);
            }
            case 4: {
                final String d = M.d;
                if (!"BRAVIA 4K 2015".equals(d)) {
                    if ("Amazon".equals(M.c)) {
                        if ("KFSOWI".equals(d)) {
                            return -1;
                        }
                        if ("AFTS".equals(d) && p2.g) {
                            return -1;
                        }
                    }
                    return h2(M.k(t, 16) * M.k(u, 16) * 256, 2);
                }
                return -1;
            }
            case 2: {
                return Math.max(2097152, h2(t * u, 2));
            }
            case 0:
            case 1:
            case 3:
            case 5: {
                return h2(t * u, 2);
            }
        }
    }
    
    public static Point d2(final t0.p p2, final d0.q q) {
        int u = q.u;
        final int t = q.t;
        final int n = 0;
        final boolean b = u > t;
        int n2;
        if (b) {
            n2 = u;
        }
        else {
            n2 = t;
        }
        if (b) {
            u = t;
        }
        final float n3 = u / (float)n2;
        final int[] c1 = k.C1;
        final int length = c1.length;
        int n4 = n;
        while (true) {
            Label_0264: {
                if (n4 >= length) {
                    break Label_0264;
                }
                final int n5 = c1[n4];
                int n6 = (int)(n5 * n3);
                if (n5 <= n2) {
                    break Label_0264;
                }
                if (n6 <= u) {
                    return null;
                }
                Label_0255: {
                    if (M.a >= 21) {
                        int n7;
                        if (b) {
                            n7 = n6;
                        }
                        else {
                            n7 = n5;
                        }
                        if (b) {
                            n6 = n5;
                        }
                        final Point b2 = p2.b(n7, n6);
                        final float v = q.v;
                        if (b2 != null && p2.u(b2.x, b2.y, v)) {
                            return b2;
                        }
                        break Label_0255;
                    }
                    while (true) {
                        while (true) {
                            int n9 = 0;
                            Label_0273: {
                                int n8 = 0;
                                Label_0269: {
                                    try {
                                        n8 = M.k(n5, 16) * 16;
                                        n9 = M.k(n6, 16) * 16;
                                        if (n8 * n9 > I.P()) {
                                            ++n4;
                                            break;
                                        }
                                        if (b) {
                                            final int n10 = n9;
                                            break Label_0273;
                                        }
                                        break Label_0269;
                                        int n10 = 0;
                                        return new Point(n10, n8);
                                        return null;
                                    }
                                    catch (I.c c2) {
                                        return null;
                                    }
                                }
                                final int n10 = n8;
                            }
                            if (b) {
                                continue;
                            }
                            int n8 = n9;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    public static List f2(final Context context, final z z, final d0.q q, final boolean b, final boolean b2) {
        final String n = q.n;
        if (n == null) {
            return v.Y();
        }
        if (M.a >= 26 && "video/dolby-vision".equals(n) && !k.b.a(context)) {
            final List n2 = I.n(z, q, b, b2);
            if (!n2.isEmpty()) {
                return n2;
            }
        }
        return I.v(z, q, b, b2);
    }
    
    public static int g2(final t0.p p2, final d0.q q) {
        if (q.o != -1) {
            final int size = q.q.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                n += ((byte[])q.q.get(i)).length;
                ++i;
            }
            return q.o + n;
        }
        return c2(p2, q);
    }
    
    public static int h2(final int n, final int n2) {
        return n * 3 / (n2 * 2);
    }
    
    public final void A2(final m m, final int n, final long n2, final long n3) {
        if (g0.M.a >= 21) {
            this.B2(m, n, n2, n3);
            return;
        }
        this.z2(m, n, n2);
    }
    
    public void B2(final m m, final int n, final long n2, final long n3) {
        g0.F.a("releaseOutputBuffer");
        m.m(n, n3);
        g0.F.b();
        final k0.o q0 = super.Q0;
        ++q0.e;
        this.q1 = 0;
        if (this.g1 == null) {
            this.n2(this.v1);
            this.l2();
        }
    }
    
    public final void D2(final Object o) {
        Surface surface;
        if (o instanceof Surface) {
            surface = (Surface)o;
        }
        else {
            surface = null;
        }
        o o2 = (o)surface;
        if (surface == null) {
            o2 = this.k1;
            if (o2 == null) {
                final t0.p h0 = this.H0();
                o2 = (o)surface;
                if (h0 != null) {
                    o2 = (o)surface;
                    if (this.K2(h0)) {
                        o2 = o.c(this.V0, h0.g);
                        this.k1 = o2;
                    }
                }
            }
        }
        if (this.j1 != o2) {
            this.j1 = o2;
            if (this.g1 == null) {
                this.b1.q(o2);
            }
            this.m1 = false;
            final int state = this.getState();
            final m f0 = this.F0();
            if (f0 != null && this.g1 == null) {
                if (g0.M.a >= 23 && o2 != null && !this.e1) {
                    this.E2(f0, o2);
                }
                else {
                    this.w1();
                    this.f1();
                }
            }
            if (o2 != null && o2 != this.k1) {
                this.q2();
                if (state == 2) {
                    this.b1.e(true);
                }
            }
            else {
                this.w1 = null;
                final F g1 = this.g1;
                if (g1 != null) {
                    g1.v();
                }
            }
            this.s2();
            return;
        }
        if (o2 != null && o2 != this.k1) {
            this.q2();
            this.p2();
        }
    }
    
    public void E2(final m m, final Surface surface) {
        m.j(surface);
    }
    
    public void F2(final List i1) {
        this.i1 = i1;
        final F g1 = this.g1;
        if (g1 != null) {
            g1.C(i1);
        }
    }
    
    @Override
    public int G0(final i i) {
        if (g0.M.a >= 34 && this.y1 && i.t < this.P()) {
            return 32;
        }
        return 0;
    }
    
    public boolean G2(final long n, final long n2, final boolean b) {
        return n < -500000L && !b;
    }
    
    public boolean H2(final long n, final long n2, final boolean b) {
        return n < -30000L && !b;
    }
    
    @Override
    public void I(final float n, final float n2) {
        super.I(n, n2);
        final F g1 = this.g1;
        if (g1 != null) {
            g1.u(n);
            return;
        }
        this.b1.r(n);
    }
    
    @Override
    public boolean I0() {
        return this.y1 && g0.M.a < 23;
    }
    
    @Override
    public boolean I1(final t0.p p) {
        return this.j1 != null || this.K2(p);
    }
    
    public boolean I2(final long n, final long n2) {
        return n < -30000L && n2 > 100000L;
    }
    
    @Override
    public float J0(final float n, final d0.q q, final d0.q[] array) {
        final int length = array.length;
        int i = 0;
        float a = -1.0f;
        while (i < length) {
            final float v = array[i].v;
            float max = a;
            if (v != -1.0f) {
                max = Math.max(a, v);
            }
            ++i;
            a = max;
        }
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * n;
    }
    
    public boolean J2() {
        return true;
    }
    
    public final boolean K2(final t0.p p) {
        return g0.M.a >= 23 && !this.y1 && !this.W1(p.a) && (!p.g || D0.o.b(this.V0));
    }
    
    @Override
    public List L0(final z z, final d0.q q, final boolean b) {
        return t0.I.w(f2(this.V0, z, q, b, this.y1), q);
    }
    
    @Override
    public int L1(final z z, final d0.q q) {
        final boolean s = d0.z.s(q.n);
        final int n = 0;
        if (!s) {
            return k0.Z0.a(0);
        }
        final boolean b = q.r != null;
        List list2;
        final List list = list2 = f2(this.V0, z, q, b, (boolean)(0 != 0));
        if (b) {
            list2 = list;
            if (list.isEmpty()) {
                list2 = f2(this.V0, z, q, false, false);
            }
        }
        if (list2.isEmpty()) {
            return k0.Z0.a(1);
        }
        if (!w.M1(q)) {
            return k0.Z0.a(2);
        }
        final t0.p p2 = list2.get(0);
        int m = p2.m(q) ? 1 : 0;
        boolean b2 = false;
        t0.p p4 = null;
        Label_0201: {
            if (m == 0) {
                for (int i = 1; i < list2.size(); ++i) {
                    final t0.p p3 = list2.get(i);
                    if (p3.m(q)) {
                        b2 = false;
                        m = 1;
                        p4 = p3;
                        break Label_0201;
                    }
                }
            }
            b2 = true;
            p4 = p2;
        }
        int n2;
        if (m != 0) {
            n2 = 4;
        }
        else {
            n2 = 3;
        }
        int n3;
        if (p4.p(q)) {
            n3 = 16;
        }
        else {
            n3 = 8;
        }
        int n4;
        if (p4.h) {
            n4 = 64;
        }
        else {
            n4 = 0;
        }
        int n5;
        if (b2) {
            n5 = 128;
        }
        else {
            n5 = 0;
        }
        int n6 = n5;
        if (g0.M.a >= 26) {
            n6 = n5;
            if ("video/dolby-vision".equals(q.n)) {
                n6 = n5;
                if (!k.b.a(this.V0)) {
                    n6 = 256;
                }
            }
        }
        int n7 = n;
        if (m != 0) {
            final List f2 = f2(this.V0, z, q, b, true);
            n7 = n;
            if (!f2.isEmpty()) {
                final t0.p p5 = t0.I.w(f2, q).get(0);
                n7 = n;
                if (p5.m(q)) {
                    n7 = n;
                    if (p5.p(q)) {
                        n7 = 32;
                    }
                }
            }
        }
        return k0.Z0.c(n2, n3, n7, n4, n6);
    }
    
    public void L2(final m m, final int n, final long n2) {
        g0.F.a("skipVideoBuffer");
        m.f(n, false);
        g0.F.b();
        final k0.o q0 = super.Q0;
        ++q0.f;
    }
    
    public void N2(int z0, final int n) {
        final k0.o q0 = super.Q0;
        q0.h += z0;
        z0 += n;
        q0.g += z0;
        this.p1 += z0;
        z0 += this.q1;
        this.q1 = z0;
        q0.i = Math.max(z0, q0.i);
        z0 = this.Z0;
        if (z0 > 0 && this.p1 >= z0) {
            this.k2();
        }
    }
    
    @Override
    public m.a O0(final t0.p p4, final d0.q q, final MediaCrypto mediaCrypto, final float n) {
        final o k1 = this.k1;
        if (k1 != null && k1.o != p4.g) {
            this.y2();
        }
        final String c = p4.c;
        final c e2 = this.e2(p4, q, this.R());
        this.d1 = e2;
        final boolean a1 = this.a1;
        int z1;
        if (this.y1) {
            z1 = this.z1;
        }
        else {
            z1 = 0;
        }
        final MediaFormat i2 = this.i2(q, c, e2, n, a1, z1);
        if (this.j1 == null) {
            if (!this.K2(p4)) {
                throw new IllegalStateException();
            }
            if (this.k1 == null) {
                this.k1 = D0.o.c(this.V0, p4.g);
            }
            this.j1 = this.k1;
        }
        this.r2(i2);
        final F g1 = this.g1;
        Surface surface;
        if (g1 != null) {
            surface = g1.x();
        }
        else {
            surface = this.j1;
        }
        return t0.m.a.b(p4, i2, q, surface, mediaCrypto);
    }
    
    public void O2(final long n) {
        super.Q0.a(n);
        this.s1 += n;
        ++this.t1;
    }
    
    @Override
    public void T() {
        this.w1 = null;
        final F g1 = this.g1;
        if (g1 != null) {
            g1.L();
        }
        else {
            this.b1.g();
        }
        this.s2();
        this.m1 = false;
        this.A1 = null;
        try {
            super.T();
        }
        finally {
            this.Y0.m(super.Q0);
            this.Y0.D(d0.P.e);
        }
    }
    
    @Override
    public void T0(final i i) {
        if (!this.f1) {
            return;
        }
        final ByteBuffer byteBuffer = (ByteBuffer)a.e(i.u);
        if (byteBuffer.remaining() >= 7) {
            final byte value = byteBuffer.get();
            final short short1 = byteBuffer.getShort();
            final short short2 = byteBuffer.getShort();
            final byte value2 = byteBuffer.get();
            final byte value3 = byteBuffer.get();
            byteBuffer.position(0);
            if (value == -75 && short1 == 60 && short2 == 1 && value2 == 4 && (value3 == 0 || value3 == 1)) {
                final byte[] dst = new byte[byteBuffer.remaining()];
                byteBuffer.get(dst);
                byteBuffer.position(0);
                C2((m)a.e(this.F0()), dst);
            }
        }
    }
    
    @Override
    public void U(final boolean b, final boolean b2) {
        super.U(b, b2);
        final boolean b3 = this.M().b;
        a.f(!b3 || this.z1 != 0);
        if (this.y1 != b3) {
            this.y1 = b3;
            this.w1();
        }
        this.Y0.o(super.Q0);
        if (!this.h1) {
            if ((this.i1 != null || !this.X0) && this.g1 == null) {
                G g = this.W0;
                if (g == null) {
                    g = new D0.d.b(this.V0, this.b1).f(this.L()).e();
                }
                this.g1 = g.b();
            }
            this.h1 = true;
        }
        final F g2 = this.g1;
        if (g2 != null) {
            g2.F((F.a)new F.a() {
                @Override
                public void a(final F f) {
                    a.h(k.Q1(k.this));
                    k.this.u2();
                }
                
                @Override
                public void b(final F f) {
                    k.this.N2(0, 1);
                }
                
                @Override
                public void c(final F f, final P p2) {
                }
            }, f.a());
            final p b4 = this.B1;
            if (b4 != null) {
                this.g1.z(b4);
            }
            if (this.j1 != null && !this.l1.equals(g0.A.c)) {
                this.g1.I(this.j1, this.l1);
            }
            this.g1.u(this.R0());
            final List i1 = this.i1;
            if (i1 != null) {
                this.g1.C(i1);
            }
            this.g1.K(b2);
            return;
        }
        this.b1.o(this.L());
        this.b1.h(b2);
    }
    
    @Override
    public void V() {
        super.V();
    }
    
    @Override
    public void W(final long n, final boolean b) {
        final F g1 = this.g1;
        if (g1 != null) {
            g1.A(true);
            this.g1.D(this.P0(), this.b2());
        }
        super.W(n, b);
        if (this.g1 == null) {
            this.b1.m();
        }
        if (b) {
            this.b1.e(false);
        }
        this.s2();
        this.q1 = 0;
    }
    
    public boolean W1(final String s) {
        if (s.startsWith("OMX.google")) {
            return false;
        }
        // monitorenter(k.class)
        while (true) {
            try {
                if (!k.D1) {
                    k.E1 = a2();
                    k.D1 = true;
                }
                // monitorexit(k.class)
                return k.E1;
                // monitorexit(k.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void X() {
        super.X();
        final F g1 = this.g1;
        if (g1 != null && this.X0) {
            g1.release();
        }
    }
    
    @Override
    public void Z() {
        try {
            super.Z();
        }
        finally {
            this.h1 = false;
            if (this.k1 != null) {
                this.y2();
            }
        }
    }
    
    public void Z1(final m m, final int n, final long n2) {
        g0.F.a("dropVideoBuffer");
        m.f(n, false);
        g0.F.b();
        this.N2(0, 1);
    }
    
    @Override
    public void a0() {
        super.a0();
        this.p1 = 0;
        this.o1 = this.L().b();
        this.s1 = 0L;
        this.t1 = 0;
        final F g1 = this.g1;
        if (g1 != null) {
            g1.y();
            return;
        }
        this.b1.k();
    }
    
    @Override
    public void b0() {
        this.k2();
        this.m2();
        final F g1 = this.g1;
        if (g1 != null) {
            g1.B();
        }
        else {
            this.b1.l();
        }
        super.b0();
    }
    
    public long b2() {
        return 0L;
    }
    
    @Override
    public boolean c() {
        if (super.c()) {
            final F g1 = this.g1;
            if (g1 == null || g1.c()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String d() {
        return "MediaCodecVideoRenderer";
    }
    
    @Override
    public boolean e() {
        boolean b = false;
        Label_0032: {
            if (super.e()) {
                final F g1 = this.g1;
                if (g1 == null || g1.e()) {
                    b = true;
                    break Label_0032;
                }
            }
            b = false;
        }
        if (b) {
            final o k1 = this.k1;
            if ((k1 != null && this.j1 == k1) || this.F0() == null || this.y1) {
                return true;
            }
        }
        return this.b1.d(b);
    }
    
    public c e2(final t0.p p3, final d0.q q, final d0.q[] array) {
        int t = q.t;
        final int u = q.u;
        int g2 = g2(p3, q);
        if (array.length == 1) {
            int min;
            if ((min = g2) != -1) {
                final int c2 = c2(p3, q);
                min = g2;
                if (c2 != -1) {
                    min = Math.min((int)(g2 * 1.5f), c2);
                }
            }
            return new c(t, u, min);
        }
        final int length = array.length;
        boolean b;
        int i = (b = false) ? 1 : 0;
        int a = u;
        while (i < length) {
            d0.q k;
            final d0.q q2 = k = array[i];
            if (q.A != null) {
                k = q2;
                if (q2.A == null) {
                    k = q2.a().P(q.A).K();
                }
            }
            int max = t;
            int max2 = a;
            int max3 = g2;
            boolean b2 = b;
            if (p3.e(q, k).d != 0) {
                final int t2 = k.t;
                b2 = (b | (t2 == -1 || k.u == -1));
                max = Math.max(t, t2);
                max2 = Math.max(a, k.u);
                max3 = Math.max(g2, g2(p3, k));
            }
            ++i;
            t = max;
            a = max2;
            g2 = max3;
            b = b2;
        }
        int max4 = t;
        int max5 = a;
        int max6 = g2;
        if (b) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(t);
            sb.append("x");
            sb.append(a);
            g0.o.h("MediaCodecVideoRenderer", sb.toString());
            final Point d2 = d2(p3, q);
            max4 = t;
            max5 = a;
            max6 = g2;
            if (d2 != null) {
                max4 = Math.max(t, d2.x);
                max5 = Math.max(a, d2.y);
                max6 = Math.max(g2, c2(p3, q.a().v0(max4).Y(max5).K()));
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(max4);
                sb2.append("x");
                sb2.append(max5);
                g0.o.h("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new c(max4, max5, max6);
    }
    
    @Override
    public void f(final long n, final long n2) {
        super.f(n, n2);
        final F g1 = this.g1;
        if (g1 != null) {
            try {
                g1.f(n, n2);
            }
            catch (F.b b) {
                throw this.J(b, b.o, 7001);
            }
        }
    }
    
    @Override
    public void h1(final Exception ex) {
        g0.o.d("MediaCodecVideoRenderer", "Video codec error", ex);
        this.Y0.C(ex);
    }
    
    @Override
    public void i1(final String s, final m.a a, final long n, final long n2) {
        this.Y0.k(s, n, n2);
        this.e1 = this.W1(s);
        this.f1 = ((t0.p)a.e(this.H0())).n();
        this.s2();
    }
    
    public MediaFormat i2(final d0.q q, final String s, final c c, final float n, final boolean b, final int n2) {
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", s);
        mediaFormat.setInteger("width", q.t);
        mediaFormat.setInteger("height", q.u);
        g0.r.e(mediaFormat, q.q);
        g0.r.c(mediaFormat, "frame-rate", q.v);
        g0.r.d(mediaFormat, "rotation-degrees", q.w);
        g0.r.b(mediaFormat, q.A);
        if ("video/dolby-vision".equals(q.n)) {
            final Pair r = t0.I.r(q);
            if (r != null) {
                g0.r.d(mediaFormat, "profile", (int)r.first);
            }
        }
        mediaFormat.setInteger("max-width", c.a);
        mediaFormat.setInteger("max-height", c.b);
        g0.r.d(mediaFormat, "max-input-size", c.c);
        final int a = g0.M.a;
        if (a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (n != -1.0f) {
                mediaFormat.setFloat("operating-rate", n);
            }
        }
        if (b) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (n2 != 0) {
            X1(mediaFormat, n2);
        }
        if (a >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.x1));
        }
        return mediaFormat;
    }
    
    @Override
    public void j() {
        final F g1 = this.g1;
        if (g1 != null) {
            g1.j();
            return;
        }
        this.b1.a();
    }
    
    @Override
    public void j1(final String s) {
        this.Y0.l(s);
    }
    
    public boolean j2(final long n, final boolean b) {
        final int g0 = this.g0(n);
        if (g0 == 0) {
            return false;
        }
        if (b) {
            final k0.o q0 = super.Q0;
            q0.d += g0;
            q0.f += this.r1;
        }
        else {
            final k0.o q2 = super.Q0;
            ++q2.j;
            this.N2(g0, this.r1);
        }
        this.C0();
        final F g2 = this.g1;
        if (g2 != null) {
            g2.A(false);
        }
        return true;
    }
    
    @Override
    public k0.p k0(final t0.p p3, final d0.q q, final d0.q q2) {
        final k0.p e = p3.e(q, q2);
        final int e2 = e.e;
        final c c = (c)a.e(this.d1);
        int n = 0;
        Label_0063: {
            if (q2.t <= c.a) {
                n = e2;
                if (q2.u <= c.b) {
                    break Label_0063;
                }
            }
            n = (e2 | 0x100);
        }
        int n2 = n;
        if (g2(p3, q2) > c.c) {
            n2 = (n | 0x40);
        }
        final String a = p3.a;
        int d;
        if (n2 != 0) {
            d = 0;
        }
        else {
            d = e.d;
        }
        return new k0.p(a, q, q2, d, n2);
    }
    
    @Override
    public k0.p k1(final v0 v0) {
        final k0.p k1 = super.k1(v0);
        this.Y0.p((d0.q)a.e(v0.b), k1);
        return k1;
    }
    
    public final void k2() {
        if (this.p1 > 0) {
            final long b = this.L().b();
            this.Y0.n(this.p1, b - this.o1);
            this.p1 = 0;
            this.o1 = b;
        }
    }
    
    @Override
    public void l1(final d0.q q, final MediaFormat mediaFormat) {
        final m f0 = this.F0();
        if (f0 != null) {
            f0.g(this.n1);
        }
        final boolean y1 = this.y1;
        final int n = 0;
        int t;
        int u;
        if (y1) {
            t = q.t;
            u = q.u;
        }
        else {
            a.e(mediaFormat);
            final boolean b = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer;
            if (b) {
                integer = mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left") + 1;
            }
            else {
                integer = mediaFormat.getInteger("width");
            }
            int integer2;
            if (b) {
                integer2 = mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top") + 1;
            }
            else {
                integer2 = mediaFormat.getInteger("height");
            }
            final int n2 = integer2;
            t = integer;
            u = n2;
        }
        final float x = q.x;
        int n3 = 0;
        int w2 = 0;
        float n4 = 0.0f;
        int n5 = 0;
        Label_0296: {
            if (V1()) {
                final int w = q.w;
                if (w != 90) {
                    n3 = u;
                    w2 = n;
                    n4 = x;
                    n5 = t;
                    if (w != 270) {
                        break Label_0296;
                    }
                }
                n4 = 1.0f / x;
                n3 = t;
                w2 = n;
                n5 = u;
            }
            else {
                n3 = u;
                w2 = n;
                n4 = x;
                n5 = t;
                if (this.g1 == null) {
                    w2 = q.w;
                    n5 = t;
                    n4 = x;
                    n3 = u;
                }
            }
        }
        this.v1 = new P(n5, n3, w2, n4);
        if (this.g1 != null) {
            this.x2();
            this.g1.G(1, q.a().v0(n5).Y(n3).n0(w2).k0(n4).K());
            return;
        }
        this.b1.p(q.v);
    }
    
    public final void l2() {
        if (this.b1.i() && this.j1 != null) {
            this.u2();
        }
    }
    
    @Override
    public boolean m(final long n, final long n2, final boolean b) {
        return this.H2(n, n2, b);
    }
    
    public final void m2() {
        final int t1 = this.t1;
        if (t1 != 0) {
            this.Y0.B(this.s1, t1);
            this.s1 = 0L;
            this.t1 = 0;
        }
    }
    
    @Override
    public boolean n(final long n, final long n2, final long n3, final boolean b, final boolean b2) {
        return this.G2(n, n3, b) && this.j2(n2, b2);
    }
    
    @Override
    public void n1(final long n) {
        super.n1(n);
        if (!this.y1) {
            --this.r1;
        }
    }
    
    public final void n2(final P w1) {
        if (!w1.equals(d0.P.e) && !w1.equals(this.w1)) {
            this.w1 = w1;
            this.Y0.D(w1);
        }
    }
    
    @Override
    public void o1() {
        super.o1();
        final F g1 = this.g1;
        if (g1 != null) {
            g1.D(this.P0(), this.b2());
        }
        else {
            this.b1.j();
        }
        this.s2();
    }
    
    public final boolean o2(final m m, final int n, final long n2, final d0.q q) {
        final long g = this.c1.g();
        final long f = this.c1.f();
        if (g0.M.a >= 21) {
            if (this.J2() && g == this.u1) {
                this.L2(m, n, n2);
            }
            else {
                this.t2(n2, g, q);
                this.B2(m, n, n2, g);
            }
            this.O2(f);
            this.u1 = g;
            return true;
        }
        if (f >= 30000L) {
            return false;
        }
        Label_0127: {
            if (f <= 11000L) {
                break Label_0127;
            }
            while (true) {
                while (true) {
                    try {
                        Thread.sleep((f - 10000L) / 1000L);
                        this.t2(n2, g, q);
                        this.z2(m, n, n2);
                        this.O2(f);
                        return true;
                        Thread.currentThread().interrupt();
                        return false;
                    }
                    catch (InterruptedException ex) {}
                    continue;
                }
            }
        }
    }
    
    @Override
    public void p1(final i i) {
        final boolean y1 = this.y1;
        if (!y1) {
            ++this.r1;
        }
        if (g0.M.a < 23 && y1) {
            this.v2(i.t);
        }
    }
    
    public final void p2() {
        final Surface j1 = this.j1;
        if (j1 != null && this.m1) {
            this.Y0.A(j1);
        }
    }
    
    @Override
    public void q1(final d0.q q) {
        final F g1 = this.g1;
        if (g1 != null && !g1.J()) {
            try {
                this.g1.H(q);
            }
            catch (F.b b) {
                throw this.J(b, q, 7000);
            }
        }
    }
    
    public final void q2() {
        final P w1 = this.w1;
        if (w1 != null) {
            this.Y0.D(w1);
        }
    }
    
    public final void r2(final MediaFormat mediaFormat) {
        final F g1 = this.g1;
        if (g1 != null && !g1.E()) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }
    
    @Override
    public boolean s1(long n, final long n2, final m m, final ByteBuffer byteBuffer, final int n3, int c, final int n4, final long n5, final boolean b, final boolean b2, final d0.q q) {
        a.e(m);
        final long n6 = n5 - this.P0();
        c = this.b1.c(n5, n, n2, this.Q0(), b2, this.c1);
        if (c == 4) {
            return false;
        }
        if (b && !b2) {
            this.L2(m, n3, n6);
            return true;
        }
        if (this.j1 == this.k1 && this.g1 == null) {
            if (this.c1.f() < 30000L) {
                this.L2(m, n3, n6);
                this.O2(this.c1.f());
                return true;
            }
            return false;
        }
        else {
            final F g1 = this.g1;
            if (g1 != null) {
                try {
                    g1.f(n, n2);
                    n = this.g1.w(n5 + this.b2(), b2);
                    if (n == -9223372036854775807L) {
                        return false;
                    }
                    this.A2(m, n3, n6, n);
                    return true;
                }
                catch (F.b b3) {
                    throw this.J(b3, b3.o, 7001);
                }
            }
            if (c == 0) {
                n = this.L().c();
                this.t2(n6, n, q);
                this.A2(m, n3, n6, n);
                this.O2(this.c1.f());
                return true;
            }
            if (c == 1) {
                return this.o2((m)a.h(m), n3, n6, q);
            }
            if (c == 2) {
                this.Z1(m, n3, n6);
                this.O2(this.c1.f());
                return true;
            }
            if (c == 3) {
                this.L2(m, n3, n6);
                this.O2(this.c1.f());
                return true;
            }
            if (c == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(c));
        }
    }
    
    public final void s2() {
        if (this.y1) {
            final int a = g0.M.a;
            if (a < 23) {
                return;
            }
            final m f0 = this.F0();
            if (f0 == null) {
                return;
            }
            this.A1 = new d(f0);
            if (a >= 33) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putInt("tunnel-peek", 1);
                f0.c(bundle);
            }
        }
    }
    
    @Override
    public void t(int intValue, final Object o) {
        if (intValue != 1) {
            if (intValue != 7) {
                if (intValue != 10) {
                    if (intValue == 16) {
                        this.x1 = (int)a.e(o);
                        this.M2();
                        return;
                    }
                    if (intValue != 4) {
                        if (intValue == 5) {
                            this.b1.n((int)a.e(o));
                            return;
                        }
                        if (intValue == 13) {
                            this.F2((List)a.e(o));
                            return;
                        }
                        if (intValue != 14) {
                            super.t(intValue, o);
                            return;
                        }
                        final A l1 = (A)a.e(o);
                        if (l1.b() != 0 && l1.a() != 0) {
                            this.l1 = l1;
                            final F g1 = this.g1;
                            if (g1 != null) {
                                g1.I((Surface)a.h(this.j1), l1);
                            }
                        }
                    }
                    else {
                        this.n1 = (int)a.e(o);
                        final m f0 = this.F0();
                        if (f0 != null) {
                            f0.g(this.n1);
                        }
                    }
                }
                else {
                    intValue = (int)a.e(o);
                    if (this.z1 != intValue) {
                        this.z1 = intValue;
                        if (this.y1) {
                            this.w1();
                        }
                    }
                }
            }
            else {
                final p b1 = (p)a.e(o);
                this.B1 = b1;
                final F g2 = this.g1;
                if (g2 != null) {
                    g2.z(b1);
                }
            }
        }
        else {
            this.D2(o);
        }
    }
    
    @Override
    public t0.o t0(final Throwable t, final t0.p p2) {
        return new j(t, p2, this.j1);
    }
    
    public final void t2(final long n, final long n2, final d0.q q) {
        final p b1 = this.B1;
        if (b1 != null) {
            b1.k(n, n2, q, this.K0());
        }
    }
    
    public final void u2() {
        this.Y0.A(this.j1);
        this.m1 = true;
    }
    
    public void v2(final long n) {
        this.P1(n);
        this.n2(this.v1);
        final k0.o q0 = super.Q0;
        ++q0.e;
        this.l2();
        this.n1(n);
    }
    
    public final void w2() {
        this.E1();
    }
    
    public void x2() {
    }
    
    @Override
    public boolean y(final long n, final long n2) {
        return this.I2(n, n2);
    }
    
    @Override
    public void y1() {
        super.y1();
        this.r1 = 0;
    }
    
    public final void y2() {
        final Surface j1 = this.j1;
        final o k1 = this.k1;
        if (j1 == k1) {
            this.j1 = null;
        }
        if (k1 != null) {
            k1.release();
            this.k1 = null;
        }
    }
    
    public void z2(final m m, final int n, final long n2) {
        g0.F.a("releaseOutputBuffer");
        m.f(n, true);
        g0.F.b();
        final k0.o q0 = super.Q0;
        ++q0.e;
        this.q1 = 0;
        if (this.g1 == null) {
            this.n2(this.v1);
            this.l2();
        }
    }
    
    public abstract static final class b
    {
        public static boolean a(final Context context) {
            final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
            Display display;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
            else {
                display = null;
            }
            if (display != null && l.a(display)) {
                final int[] a = D0.n.a(D0.m.a(display));
                for (int length = a.length, i = 0; i < length; ++i) {
                    if (a[i] == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final int c;
        
        public c(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public final class d implements m.d, Handler$Callback
    {
        public final Handler o;
        
        public d(final m m) {
            m.o((m.d)this, this.o = g0.M.B((Handler$Callback)this));
        }
        
        @Override
        public void a(final m m, final long n, final long n2) {
            if (g0.M.a < 30) {
                this.o.sendMessageAtFrontOfQueue(Message.obtain(this.o, 0, (int)(n >> 32), (int)n));
                return;
            }
            this.b(n);
        }
        
        public final void b(final long n) {
            final k p = k.this;
            if (this == p.A1) {
                if (p.F0() == null) {
                    return;
                }
                if (n == Long.MAX_VALUE) {
                    k.this.w2();
                    return;
                }
                try {
                    k.this.v2(n);
                }
                catch (u u) {
                    w.this.F1(u);
                }
            }
        }
        
        public boolean handleMessage(final Message message) {
            if (message.what != 0) {
                return false;
            }
            this.b(g0.M.g1(message.arg1, message.arg2));
            return true;
        }
    }
}
