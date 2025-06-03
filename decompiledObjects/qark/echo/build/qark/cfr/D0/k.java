/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.hardware.display.DisplayManager
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Pair
 *  android.view.Display
 *  android.view.Surface
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package D0;

import D0.E;
import D0.F;
import D0.G;
import D0.d;
import D0.j;
import D0.l;
import D0.m;
import D0.n;
import D0.o;
import D0.p;
import D0.q;
import X2.v;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import b3.f;
import d0.P;
import d0.h;
import d0.q;
import g0.A;
import g0.M;
import g0.a;
import g0.r;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import k0.Z0;
import k0.b1;
import k0.u;
import k0.v0;
import t0.I;
import t0.m;
import t0.w;
import t0.z;

public class k
extends w
implements q.b {
    public static final int[] C1 = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
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

    public k(Context context, m.b b8, z z8, long l8, boolean bl, Handler handler, E e8, int n8) {
        this(context, b8, z8, l8, bl, handler, e8, n8, 30.0f);
    }

    public k(Context context, m.b b8, z z8, long l8, boolean bl, Handler handler, E e8, int n8, float f8) {
        this(context, b8, z8, l8, bl, handler, e8, n8, f8, null);
    }

    public k(Context context, m.b b8, z z8, long l8, boolean bl, Handler handler, E e8, int n8, float f8, G g8) {
        super(2, b8, z8, bl, f8);
        this.V0 = context = context.getApplicationContext();
        this.Z0 = n8;
        this.W0 = g8;
        this.Y0 = new E.a(handler, e8);
        bl = g8 == null;
        this.X0 = bl;
        this.b1 = g8 == null ? new q(context, this, l8) : g8.a();
        this.c1 = new q.a();
        this.a1 = k.Y1();
        this.l1 = A.c;
        this.n1 = 1;
        this.v1 = P.e;
        this.z1 = 0;
        this.w1 = null;
        this.x1 = -1000;
    }

    public static void C2(t0.m m8, byte[] arrby) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", arrby);
        m8.c(bundle);
    }

    private void M2() {
        t0.m m8 = this.F0();
        if (m8 == null) {
            return;
        }
        if (M.a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max((int)0, (int)(- this.x1)));
            m8.c(bundle);
        }
    }

    public static boolean V1() {
        if (M.a >= 21) {
            return true;
        }
        return false;
    }

    public static void X1(MediaFormat mediaFormat, int n8) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", n8);
    }

    public static boolean Y1() {
        return "NVIDIA".equals((Object)M.c);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a2() {
        block176 : {
            block174 : {
                block175 : {
                    var2 = M.a;
                    var1_1 = 7;
                    if (var2 > 28) break block174;
                    var3_2 = M.b;
                    var3_2.hashCode();
                    switch (var3_2.hashCode()) {
                        case 825323514: {
                            if (!var3_2.equals((Object)"machuca")) break;
                            var0_3 = 7;
                            ** break;
                        }
                        case 3415681: {
                            if (!var3_2.equals((Object)"once")) break;
                            var0_3 = 6;
                            ** break;
                        }
                        case -64886864: {
                            if (!var3_2.equals((Object)"magnolia")) break;
                            var0_3 = 5;
                            ** break;
                        }
                        case -760312546: {
                            if (!var3_2.equals((Object)"aquaman")) break;
                            var0_3 = 4;
                            ** break;
                        }
                        case -1012436106: {
                            if (!var3_2.equals((Object)"oneday")) break;
                            var0_3 = 3;
                            ** break;
                        }
                        case -1220066608: {
                            if (!var3_2.equals((Object)"dangalUHD")) break;
                            var0_3 = 2;
                            ** break;
                        }
                        case -1220081023: {
                            if (!var3_2.equals((Object)"dangalFHD")) break;
                            var0_3 = 1;
                            ** break;
                        }
                        case -1339091551: {
                            if (var3_2.equals((Object)"dangal")) break block175;
                        }
                    }
                    var0_3 = -1;
                    ** break;
                }
                var0_3 = 0;
lbl41: // 9 sources:
                switch (var0_3) {
                    default: {
                        ** break;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                }
                return true;
            }
            if (var2 <= 27 && "HWEML".equals((Object)M.b)) {
                return true;
            }
            var3_2 = M.d;
            var3_2.hashCode();
            switch (var3_2.hashCode()) {
                case 2119412532: {
                    if (!var3_2.equals((Object)"AFTEUFF014")) break;
                    var0_3 = 8;
                    ** break;
                }
                case 1798172390: {
                    if (!var3_2.equals((Object)"AFTSO001")) break;
                    var0_3 = 7;
                    ** break;
                }
                case 1785421876: {
                    if (!var3_2.equals((Object)"AFTEU014")) break;
                    var0_3 = 6;
                    ** break;
                }
                case 1785421873: {
                    if (!var3_2.equals((Object)"AFTEU011")) break;
                    var0_3 = 5;
                    ** break;
                }
                case 2006371: {
                    if (!var3_2.equals((Object)"AFTR")) break;
                    var0_3 = 4;
                    ** break;
                }
                case 2006367: {
                    if (!var3_2.equals((Object)"AFTN")) break;
                    var0_3 = 3;
                    ** break;
                }
                case 2006354: {
                    if (!var3_2.equals((Object)"AFTA")) break;
                    var0_3 = 2;
                    ** break;
                }
                case -321033677: {
                    if (!var3_2.equals((Object)"AFTKMST12")) break;
                    var0_3 = 1;
                    ** break;
                }
                case -349662828: {
                    if (var3_2.equals((Object)"AFTJMST12")) break block176;
                }
            }
            var0_3 = -1;
            ** break;
        }
        var0_3 = 0;
lbl90: // 10 sources:
        switch (var0_3) {
            default: {
                if (var2 > 26) return false;
                var4_4 = M.b;
                var4_4.hashCode();
                switch (var4_4.hashCode()) {
                    case 2048855701: {
                        if (!var4_4.equals((Object)"HWWAS-H")) break;
                        var0_3 = 139;
                        ** break;
                    }
                    case 2048319463: {
                        if (!var4_4.equals((Object)"HWVNS-H")) break;
                        var0_3 = 138;
                        ** break;
                    }
                    case 2047252157: {
                        if (!var4_4.equals((Object)"ELUGA_Prim")) break;
                        var0_3 = 137;
                        ** break;
                    }
                    case 2047190025: {
                        if (!var4_4.equals((Object)"ELUGA_Note")) break;
                        var0_3 = 136;
                        ** break;
                    }
                    case 2033393791: {
                        if (!var4_4.equals((Object)"ASUS_X00AD_2")) break;
                        var0_3 = 135;
                        ** break;
                    }
                    case 2030379515: {
                        if (!var4_4.equals((Object)"HWCAM-H")) break;
                        var0_3 = 134;
                        ** break;
                    }
                    case 2029784656: {
                        if (!var4_4.equals((Object)"HWBLN-H")) break;
                        var0_3 = 133;
                        ** break;
                    }
                    case 2019281702: {
                        if (!var4_4.equals((Object)"DM-01K")) break;
                        var0_3 = 132;
                        ** break;
                    }
                    case 2006372676: {
                        if (!var4_4.equals((Object)"BRAVIA_ATV3_4K")) break;
                        var0_3 = 131;
                        ** break;
                    }
                    case 1977196784: {
                        if (!var4_4.equals((Object)"Infinix-X572")) break;
                        var0_3 = 130;
                        ** break;
                    }
                    case 1906253259: {
                        if (!var4_4.equals((Object)"PB2-670M")) break;
                        var0_3 = 129;
                        ** break;
                    }
                    case 1865889110: {
                        if (!var4_4.equals((Object)"santoni")) break;
                        var0_3 = 128;
                        ** break;
                    }
                    case 1709443163: {
                        if (!var4_4.equals((Object)"iball8735_9806")) break;
                        var0_3 = 127;
                        ** break;
                    }
                    case 1691544261: {
                        if (!var4_4.equals((Object)"CPH1715")) break;
                        var0_3 = 126;
                        ** break;
                    }
                    case 1691543273: {
                        if (!var4_4.equals((Object)"CPH1609")) break;
                        var0_3 = 125;
                        ** break;
                    }
                    case 1522194893: {
                        if (!var4_4.equals((Object)"woods_f")) break;
                        var0_3 = 124;
                        ** break;
                    }
                    case 1349174697: {
                        if (!var4_4.equals((Object)"htc_e56ml_dtul")) break;
                        var0_3 = 123;
                        ** break;
                    }
                    case 1306947716: {
                        if (!var4_4.equals((Object)"EverStar_S")) break;
                        var0_3 = 122;
                        ** break;
                    }
                    case 1280332038: {
                        if (!var4_4.equals((Object)"hwALE-H")) break;
                        var0_3 = 121;
                        ** break;
                    }
                    case 1176899427: {
                        if (!var4_4.equals((Object)"itel_S41")) break;
                        var0_3 = 120;
                        ** break;
                    }
                    case 1150207623: {
                        if (!var4_4.equals((Object)"LS-5017")) break;
                        var0_3 = 119;
                        ** break;
                    }
                    case 1060579533: {
                        if (!var4_4.equals((Object)"panell_d")) break;
                        var0_3 = 118;
                        ** break;
                    }
                    case 958008161: {
                        if (!var4_4.equals((Object)"j2xlteins")) break;
                        var0_3 = 117;
                        ** break;
                    }
                    case 917340916: {
                        if (!var4_4.equals((Object)"A7000plus")) break;
                        var0_3 = 116;
                        ** break;
                    }
                    case 835649806: {
                        if (!var4_4.equals((Object)"manning")) break;
                        var0_3 = 115;
                        ** break;
                    }
                    case 794040393: {
                        if (!var4_4.equals((Object)"GIONEE_WBL7519")) break;
                        var0_3 = 114;
                        ** break;
                    }
                    case 794038622: {
                        if (!var4_4.equals((Object)"GIONEE_WBL7365")) break;
                        var0_3 = 113;
                        ** break;
                    }
                    case 793982701: {
                        if (!var4_4.equals((Object)"GIONEE_WBL5708")) break;
                        var0_3 = 112;
                        ** break;
                    }
                    case 507412548: {
                        if (!var4_4.equals((Object)"QM16XE_U")) break;
                        var0_3 = 111;
                        ** break;
                    }
                    case 407160593: {
                        if (!var4_4.equals((Object)"Pixi5-10_4G")) break;
                        var0_3 = 110;
                        ** break;
                    }
                    case 316246818: {
                        if (!var4_4.equals((Object)"TB3-850M")) break;
                        var0_3 = 109;
                        ** break;
                    }
                    case 316246811: {
                        if (!var4_4.equals((Object)"TB3-850F")) break;
                        var0_3 = 108;
                        ** break;
                    }
                    case 316215116: {
                        if (!var4_4.equals((Object)"TB3-730X")) break;
                        var0_3 = 107;
                        ** break;
                    }
                    case 316215098: {
                        if (!var4_4.equals((Object)"TB3-730F")) break;
                        var0_3 = 106;
                        ** break;
                    }
                    case 308517133: {
                        if (!var4_4.equals((Object)"A7020a48")) break;
                        var0_3 = 105;
                        ** break;
                    }
                    case 307593612: {
                        if (!var4_4.equals((Object)"A7010a48")) break;
                        var0_3 = 104;
                        ** break;
                    }
                    case 287431619: {
                        if (!var4_4.equals((Object)"griffin")) break;
                        var0_3 = 103;
                        ** break;
                    }
                    case 245388979: {
                        if (!var4_4.equals((Object)"marino_f")) break;
                        var0_3 = 102;
                        ** break;
                    }
                    case 182191441: {
                        if (!var4_4.equals((Object)"CPY83_I00")) break;
                        var0_3 = 101;
                        ** break;
                    }
                    case 165221241: {
                        if (!var4_4.equals((Object)"A2016a40")) break;
                        var0_3 = 100;
                        ** break;
                    }
                    case 102844228: {
                        if (!var4_4.equals((Object)"le_x6")) break;
                        var0_3 = 99;
                        ** break;
                    }
                    case 101370885: {
                        if (!var4_4.equals((Object)"l5460")) break;
                        var0_3 = 98;
                        ** break;
                    }
                    case 98715550: {
                        if (!var4_4.equals((Object)"i9031")) break;
                        var0_3 = 97;
                        ** break;
                    }
                    case 82882791: {
                        if (!var4_4.equals((Object)"X3_HK")) break;
                        var0_3 = 96;
                        ** break;
                    }
                    case 80963634: {
                        if (!var4_4.equals((Object)"V23GB")) break;
                        var0_3 = 95;
                        ** break;
                    }
                    case 76404911: {
                        if (!var4_4.equals((Object)"Q4310")) break;
                        var0_3 = 94;
                        ** break;
                    }
                    case 76404105: {
                        if (!var4_4.equals((Object)"Q4260")) break;
                        var0_3 = 93;
                        ** break;
                    }
                    case 76402249: {
                        if (!var4_4.equals((Object)"PRO7S")) break;
                        var0_3 = 92;
                        ** break;
                    }
                    case 66216390: {
                        if (!var4_4.equals((Object)"F3311")) break;
                        var0_3 = 91;
                        ** break;
                    }
                    case 66215433: {
                        if (!var4_4.equals((Object)"F3215")) break;
                        var0_3 = 90;
                        ** break;
                    }
                    case 66215431: {
                        if (!var4_4.equals((Object)"F3213")) break;
                        var0_3 = 89;
                        ** break;
                    }
                    case 66215429: {
                        if (!var4_4.equals((Object)"F3211")) break;
                        var0_3 = 88;
                        ** break;
                    }
                    case 66214473: {
                        if (!var4_4.equals((Object)"F3116")) break;
                        var0_3 = 87;
                        ** break;
                    }
                    case 66214470: {
                        if (!var4_4.equals((Object)"F3113")) break;
                        var0_3 = 86;
                        ** break;
                    }
                    case 66214468: {
                        if (!var4_4.equals((Object)"F3111")) break;
                        var0_3 = 85;
                        ** break;
                    }
                    case 65355429: {
                        if (!var4_4.equals((Object)"E5643")) break;
                        var0_3 = 84;
                        ** break;
                    }
                    case 61542055: {
                        if (!var4_4.equals((Object)"A1601")) break;
                        var0_3 = 83;
                        ** break;
                    }
                    case 55178625: {
                        if (!var4_4.equals((Object)"Aura_Note_2")) break;
                        var0_3 = 82;
                        ** break;
                    }
                    case 51350594: {
                        if (!var4_4.equals((Object)"602LV")) break;
                        var0_3 = 81;
                        ** break;
                    }
                    case 51349633: {
                        if (!var4_4.equals((Object)"601LV")) break;
                        var0_3 = 80;
                        ** break;
                    }
                    case 41325051: {
                        if (!var4_4.equals((Object)"MEIZU_M5")) break;
                        var0_3 = 79;
                        ** break;
                    }
                    case 3386211: {
                        if (!var4_4.equals((Object)"p212")) break;
                        var0_3 = 78;
                        ** break;
                    }
                    case 3351335: {
                        if (!var4_4.equals((Object)"mido")) break;
                        var0_3 = 77;
                        ** break;
                    }
                    case 3284551: {
                        if (!var4_4.equals((Object)"kate")) break;
                        var0_3 = 76;
                        ** break;
                    }
                    case 3154429: {
                        if (!var4_4.equals((Object)"fugu")) break;
                        var0_3 = 75;
                        ** break;
                    }
                    case 2689555: {
                        if (!var4_4.equals((Object)"XE2X")) break;
                        var0_3 = 74;
                        ** break;
                    }
                    case 2464648: {
                        if (!var4_4.equals((Object)"Q427")) break;
                        var0_3 = 73;
                        ** break;
                    }
                    case 2463773: {
                        if (!var4_4.equals((Object)"Q350")) break;
                        var0_3 = 72;
                        ** break;
                    }
                    case 2436959: {
                        if (!var4_4.equals((Object)"P681")) break;
                        var0_3 = 71;
                        ** break;
                    }
                    case 2133184: {
                        if (!var4_4.equals((Object)"F04J")) break;
                        var0_3 = 70;
                        ** break;
                    }
                    case 2133182: {
                        if (!var4_4.equals((Object)"F04H")) break;
                        var0_3 = 69;
                        ** break;
                    }
                    case 2133151: {
                        if (!var4_4.equals((Object)"F03H")) break;
                        var0_3 = 68;
                        ** break;
                    }
                    case 2133120: {
                        if (!var4_4.equals((Object)"F02H")) break;
                        var0_3 = 67;
                        ** break;
                    }
                    case 2133091: {
                        if (!var4_4.equals((Object)"F01J")) break;
                        var0_3 = 66;
                        ** break;
                    }
                    case 2133089: {
                        if (!var4_4.equals((Object)"F01H")) break;
                        var0_3 = 65;
                        ** break;
                    }
                    case 1514185: {
                        if (!var4_4.equals((Object)"1714")) break;
                        var0_3 = 64;
                        ** break;
                    }
                    case 1514184: {
                        if (!var4_4.equals((Object)"1713")) break;
                        var0_3 = 63;
                        ** break;
                    }
                    case 1513190: {
                        if (!var4_4.equals((Object)"1601")) break;
                        var0_3 = 62;
                        ** break;
                    }
                    case 101481: {
                        if (!var4_4.equals((Object)"flo")) break;
                        var0_3 = 61;
                        ** break;
                    }
                    case 99329: {
                        if (!var4_4.equals((Object)"deb")) break;
                        var0_3 = 60;
                        ** break;
                    }
                    case 98848: {
                        if (!var4_4.equals((Object)"cv3")) break;
                        var0_3 = 59;
                        ** break;
                    }
                    case 98846: {
                        if (!var4_4.equals((Object)"cv1")) break;
                        var0_3 = 58;
                        ** break;
                    }
                    case 88274: {
                        if (!var4_4.equals((Object)"Z80")) break;
                        var0_3 = 57;
                        ** break;
                    }
                    case 80618: {
                        if (!var4_4.equals((Object)"QX1")) break;
                        var0_3 = 56;
                        ** break;
                    }
                    case 79305: {
                        if (!var4_4.equals((Object)"PLE")) break;
                        var0_3 = 55;
                        ** break;
                    }
                    case 78669: {
                        if (!var4_4.equals((Object)"P85")) break;
                        var0_3 = 54;
                        ** break;
                    }
                    case 76779: {
                        if (!var4_4.equals((Object)"MX6")) break;
                        var0_3 = 53;
                        ** break;
                    }
                    case 75739: {
                        if (!var4_4.equals((Object)"M5c")) break;
                        var0_3 = 52;
                        ** break;
                    }
                    case 75537: {
                        if (!var4_4.equals((Object)"M04")) break;
                        var0_3 = 51;
                        ** break;
                    }
                    case 73405: {
                        if (!var4_4.equals((Object)"JGZ")) break;
                        var0_3 = 50;
                        ** break;
                    }
                    case 3483: {
                        if (!var4_4.equals((Object)"mh")) break;
                        var0_3 = 49;
                        ** break;
                    }
                    case 3091: {
                        if (!var4_4.equals((Object)"b5")) break;
                        var0_3 = 48;
                        ** break;
                    }
                    case 2719: {
                        if (!var4_4.equals((Object)"V5")) break;
                        var0_3 = 47;
                        ** break;
                    }
                    case 2715: {
                        if (!var4_4.equals((Object)"V1")) break;
                        var0_3 = 46;
                        ** break;
                    }
                    case 2564: {
                        if (!var4_4.equals((Object)"Q5")) break;
                        var0_3 = 45;
                        ** break;
                    }
                    case 2126: {
                        if (!var4_4.equals((Object)"C1")) break;
                        var0_3 = 44;
                        ** break;
                    }
                    case -56598463: {
                        if (!var4_4.equals((Object)"woods_fn")) break;
                        var0_3 = 43;
                        ** break;
                    }
                    case -173639913: {
                        if (!var4_4.equals((Object)"ELUGA_A3_Pro")) break;
                        var0_3 = 42;
                        ** break;
                    }
                    case -277133239: {
                        if (!var4_4.equals((Object)"Z12_PRO")) break;
                        var0_3 = 41;
                        ** break;
                    }
                    case -282781963: {
                        if (!var4_4.equals((Object)"BLACK-1X")) break;
                        var0_3 = 40;
                        ** break;
                    }
                    case -290434366: {
                        if (!var4_4.equals((Object)"taido_row")) break;
                        var0_3 = 39;
                        ** break;
                    }
                    case -430914369: {
                        if (!var4_4.equals((Object)"Pixi4-7_3G")) break;
                        var0_3 = 38;
                        ** break;
                    }
                    case -521118391: {
                        if (!var4_4.equals((Object)"GIONEE_GBL7360")) break;
                        var0_3 = 37;
                        ** break;
                    }
                    case -575125681: {
                        if (!var4_4.equals((Object)"GiONEE_CBL7513")) break;
                        var0_3 = 36;
                        ** break;
                    }
                    case -782144577: {
                        if (!var4_4.equals((Object)"OnePlus5T")) break;
                        var0_3 = 35;
                        ** break;
                    }
                    case -788334647: {
                        if (!var4_4.equals((Object)"whyred")) break;
                        var0_3 = 34;
                        ** break;
                    }
                    case -794946968: {
                        if (!var4_4.equals((Object)"watson")) break;
                        var0_3 = 33;
                        ** break;
                    }
                    case -797483286: {
                        if (!var4_4.equals((Object)"SVP-DTV15")) break;
                        var0_3 = 32;
                        ** break;
                    }
                    case -821392978: {
                        if (!var4_4.equals((Object)"A7000-a")) break;
                        var0_3 = 31;
                        ** break;
                    }
                    case -842500323: {
                        if (!var4_4.equals((Object)"nicklaus_f")) break;
                        var0_3 = 30;
                        ** break;
                    }
                    case -879245230: {
                        if (!var4_4.equals((Object)"tcl_eu")) break;
                        var0_3 = 29;
                        ** break;
                    }
                    case -958336948: {
                        if (!var4_4.equals((Object)"ELUGA_Ray_X")) break;
                        var0_3 = 28;
                        ** break;
                    }
                    case -965403638: {
                        if (!var4_4.equals((Object)"s905x018")) break;
                        var0_3 = 27;
                        ** break;
                    }
                    case -993250458: {
                        if (!var4_4.equals((Object)"A10-70L")) break;
                        var0_3 = 26;
                        ** break;
                    }
                    case -993250464: {
                        if (!var4_4.equals((Object)"A10-70F")) break;
                        var0_3 = 25;
                        ** break;
                    }
                    case -1052835013: {
                        if (!var4_4.equals((Object)"namath")) break;
                        var0_3 = 24;
                        ** break;
                    }
                    case -1139198265: {
                        if (!var4_4.equals((Object)"Slate_Pro")) break;
                        var0_3 = 23;
                        ** break;
                    }
                    case -1180384755: {
                        if (!var4_4.equals((Object)"iris60")) break;
                        var0_3 = 22;
                        ** break;
                    }
                    case -1217592143: {
                        if (!var4_4.equals((Object)"BRAVIA_ATV2")) break;
                        var0_3 = 21;
                        ** break;
                    }
                    case -1320080169: {
                        if (!var4_4.equals((Object)"GiONEE_GBL7319")) break;
                        var0_3 = 20;
                        ** break;
                    }
                    case -1481772729: {
                        if (!var4_4.equals((Object)"panell_dt")) break;
                        var0_3 = 19;
                        ** break;
                    }
                    case -1481772730: {
                        if (!var4_4.equals((Object)"panell_ds")) break;
                        var0_3 = 18;
                        ** break;
                    }
                    case -1481772737: {
                        if (!var4_4.equals((Object)"panell_dl")) break;
                        var0_3 = 17;
                        ** break;
                    }
                    case -1554255044: {
                        if (!var4_4.equals((Object)"vernee_M5")) break;
                        var0_3 = 16;
                        ** break;
                    }
                    case -1600724499: {
                        if (!var4_4.equals((Object)"pacificrim")) break;
                        var0_3 = 15;
                        ** break;
                    }
                    case -1615810839: {
                        if (!var4_4.equals((Object)"Phantom6")) break;
                        var0_3 = 14;
                        ** break;
                    }
                    case -1680025915: {
                        if (!var4_4.equals((Object)"ComioS1")) break;
                        var0_3 = 13;
                        ** break;
                    }
                    case -1696512866: {
                        if (!var4_4.equals((Object)"XT1663")) break;
                        var0_3 = 12;
                        ** break;
                    }
                    case -1885099851: {
                        if (!var4_4.equals((Object)"RAIJIN")) break;
                        var0_3 = 11;
                        ** break;
                    }
                    case -1931988508: {
                        if (!var4_4.equals((Object)"AquaPowerM")) break;
                        var0_3 = 10;
                        ** break;
                    }
                    case -1936688065: {
                        if (!var4_4.equals((Object)"PGN611")) break;
                        var0_3 = 9;
                        ** break;
                    }
                    case -1936688066: {
                        if (!var4_4.equals((Object)"PGN610")) break;
                        var0_3 = 8;
                        ** break;
                    }
                    case -1936688988: {
                        var0_3 = var1_1;
                        if (!var4_4.equals((Object)"PGN528")) {
                            break;
                        }
                        ** GOTO lbl658
                    }
                    case -1978990237: {
                        if (!var4_4.equals((Object)"NX573J")) break;
                        var0_3 = 6;
                        ** break;
                    }
                    case -1978993182: {
                        if (!var4_4.equals((Object)"NX541J")) break;
                        var0_3 = 5;
                        ** break;
                    }
                    case -2022874474: {
                        if (!var4_4.equals((Object)"CP8676_I02")) break;
                        var0_3 = 4;
                        ** break;
                    }
                    case -2097309513: {
                        if (!var4_4.equals((Object)"K50a40")) break;
                        var0_3 = 3;
                        ** break;
                    }
                    case -2144781160: {
                        if (!var4_4.equals((Object)"GIONEE_SWW1631")) break;
                        var0_3 = 2;
                        ** break;
                    }
                    case -2144781185: {
                        if (!var4_4.equals((Object)"GIONEE_SWW1627")) break;
                        var0_3 = 1;
                        ** break;
                    }
                    case -2144781245: {
                        if (var4_4.equals((Object)"GIONEE_SWW1609")) ** GOTO lbl657
                    }
                }
                var0_3 = -1;
                ** break;
lbl657: // 1 sources:
                var0_3 = 0;
lbl658: // 141 sources:
                switch (var0_3) {
                    default: {
                        var3_2.hashCode();
                        if (var3_2.equals((Object)"JSN-L21") != false) return true;
                        return false;
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
                    case 139: 
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
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int c2(t0.p var0, d0.q var1_1) {
        block18 : {
            block19 : {
                var3_2 = var1_1.t;
                var4_3 = var1_1.u;
                if (var3_2 == -1) return -1;
                if (var4_3 == -1) {
                    return -1;
                }
                var7_4 = (String)a.e(var1_1.n);
                var6_5 = "video/dolby-vision".equals((Object)var7_4);
                var2_6 = 1;
                if (var6_5) {
                    var7_4 = (var1_1 = I.r((d0.q)var1_1)) != null && ((var5_7 = ((Integer)var1_1.first).intValue()) == 512 || var5_7 == 1 || var5_7 == 2) ? "video/avc" : "video/hevc";
                }
                var7_4.hashCode();
                switch (var7_4.hashCode()) {
                    case 1599127257: {
                        if (!var7_4.equals((Object)"video/x-vnd.on2.vp9")) break;
                        var2_6 = 6;
                        ** break;
                    }
                    case 1599127256: {
                        if (!var7_4.equals((Object)"video/x-vnd.on2.vp8")) break;
                        var2_6 = 5;
                        ** break;
                    }
                    case 1331836730: {
                        if (!var7_4.equals((Object)"video/avc")) break;
                        var2_6 = 4;
                        ** break;
                    }
                    case 1187890754: {
                        if (!var7_4.equals((Object)"video/mp4v-es")) break;
                        var2_6 = 3;
                        ** break;
                    }
                    case -1662541442: {
                        if (!var7_4.equals((Object)"video/hevc")) break;
                        var2_6 = 2;
                        ** break;
                    }
                    case -1662735862: {
                        if (!var7_4.equals((Object)"video/av01")) {
                            break;
                        }
                        break block18;
                    }
                    case -1664118616: {
                        if (var7_4.equals((Object)"video/3gpp")) break block19;
                    }
                }
                var2_6 = -1;
                ** break;
            }
            var2_6 = 0;
        }
        switch (var2_6) {
            default: {
                return -1;
            }
            case 6: {
                return k.h2(var3_2 * var4_3, 4);
            }
            case 4: {
                var1_1 = M.d;
                if ("BRAVIA 4K 2015".equals(var1_1) != false) return -1;
                if ("Amazon".equals((Object)M.c) == false) return k.h2(M.k(var3_2, 16) * M.k(var4_3, 16) * 256, 2);
                if ("KFSOWI".equals(var1_1) != false) return -1;
                if ("AFTS".equals(var1_1) == false) return k.h2(M.k(var3_2, 16) * M.k(var4_3, 16) * 256, 2);
                if (var0.g == false) return k.h2(M.k(var3_2, 16) * M.k(var4_3, 16) * 256, 2);
                return -1;
            }
            case 2: {
                return Math.max((int)2097152, (int)k.h2(var3_2 * var4_3, 2));
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: 
        }
        return k.h2(var3_2 * var4_3, 2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Point d2(t0.p p8, d0.q q8) {
        int n8;
        int n9 = q8.u;
        int n10 = q8.t;
        int n11 = 0;
        boolean bl = n9 > n10;
        int n12 = bl ? n9 : n10;
        if (bl) {
            n9 = n10;
        }
        float f8 = (float)n9 / (float)n12;
        int[] arrn = C1;
        int n13 = arrn.length;
        n10 = n11;
        while (n10 < n13) {
            block9 : {
                n8 = arrn[n10];
                n11 = (int)((float)n8 * f8);
                if (n8 <= n12) return null;
                if (n11 <= n9) {
                    return null;
                }
                if (M.a >= 21) {
                    int n14 = bl ? n11 : n8;
                    if (bl) {
                        n11 = n8;
                    }
                    Point point = p8.b(n14, n11);
                    float f9 = q8.v;
                    if (point != null && p8.u(point.x, point.y, f9)) {
                        return point;
                    }
                } else {
                    n8 = M.k(n8, 16) * 16;
                    n11 = M.k(n11, 16) * 16;
                    if (n8 * n11 > I.P()) break block9;
                    n12 = bl ? n11 : n8;
                }
            }
            ++n10;
        }
        return null;
        catch (I.c c8) {
            return null;
        }
        if (bl) return new Point(n12, n8);
        n8 = n11;
        return new Point(n12, n8);
    }

    public static List f2(Context context, z z8, d0.q q8, boolean bl, boolean bl2) {
        String string2 = q8.n;
        if (string2 == null) {
            return v.Y();
        }
        if (M.a >= 26 && "video/dolby-vision".equals((Object)string2) && !b.a(context) && !(context = I.n(z8, q8, bl, bl2)).isEmpty()) {
            return context;
        }
        return I.v(z8, q8, bl, bl2);
    }

    public static int g2(t0.p p8, d0.q q8) {
        if (q8.o != -1) {
            int n8 = q8.q.size();
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += ((byte[])q8.q.get(i8)).length;
            }
            return q8.o + n9;
        }
        return k.c2(p8, q8);
    }

    public static int h2(int n8, int n9) {
        return n8 * 3 / (n9 * 2);
    }

    public final void A2(t0.m m8, int n8, long l8, long l9) {
        if (M.a >= 21) {
            this.B2(m8, n8, l8, l9);
            return;
        }
        this.z2(m8, n8, l8);
    }

    public void B2(t0.m object, int n8, long l8, long l9) {
        g0.F.a("releaseOutputBuffer");
        object.m(n8, l9);
        g0.F.b();
        object = this.Q0;
        ++object.e;
        this.q1 = 0;
        if (this.g1 == null) {
            this.n2(this.v1);
            this.l2();
        }
    }

    public final void D2(Object object) {
        object = object instanceof Surface ? (Surface)object : null;
        Object object2 = object;
        if (object == null && (object2 = this.k1) == null) {
            t0.p p8 = this.H0();
            object2 = object;
            if (p8 != null) {
                object2 = object;
                if (this.K2(p8)) {
                    this.k1 = object2 = o.c(this.V0, p8.g);
                }
            }
        }
        if (this.j1 != object2) {
            this.j1 = object2;
            if (this.g1 == null) {
                this.b1.q((Surface)object2);
            }
            this.m1 = false;
            int n8 = this.getState();
            object = this.F0();
            if (object != null && this.g1 == null) {
                if (M.a >= 23 && object2 != null && !this.e1) {
                    this.E2((t0.m)object, (Surface)object2);
                } else {
                    this.w1();
                    this.f1();
                }
            }
            if (object2 != null && object2 != this.k1) {
                this.q2();
                if (n8 == 2) {
                    this.b1.e(true);
                }
            } else {
                this.w1 = null;
                object = this.g1;
                if (object != null) {
                    object.v();
                }
            }
            this.s2();
            return;
        }
        if (object2 != null && object2 != this.k1) {
            this.q2();
            this.p2();
        }
    }

    public void E2(t0.m m8, Surface surface) {
        m8.j(surface);
    }

    public void F2(List list) {
        this.i1 = list;
        F f8 = this.g1;
        if (f8 != null) {
            f8.C(list);
        }
    }

    @Override
    public int G0(i i8) {
        if (M.a >= 34 && this.y1 && i8.t < this.P()) {
            return 32;
        }
        return 0;
    }

    public boolean G2(long l8, long l9, boolean bl) {
        if (l8 < -500000L && !bl) {
            return true;
        }
        return false;
    }

    public boolean H2(long l8, long l9, boolean bl) {
        if (l8 < -30000L && !bl) {
            return true;
        }
        return false;
    }

    @Override
    public void I(float f8, float f9) {
        super.I(f8, f9);
        F f10 = this.g1;
        if (f10 != null) {
            f10.u(f8);
            return;
        }
        this.b1.r(f8);
    }

    @Override
    public boolean I0() {
        if (this.y1 && M.a < 23) {
            return true;
        }
        return false;
    }

    @Override
    public boolean I1(t0.p p8) {
        if (this.j1 == null && !this.K2(p8)) {
            return false;
        }
        return true;
    }

    public boolean I2(long l8, long l9) {
        if (l8 < -30000L && l9 > 100000L) {
            return true;
        }
        return false;
    }

    @Override
    public float J0(float f8, d0.q q8, d0.q[] arrq) {
        int n8 = arrq.length;
        float f9 = -1.0f;
        for (int i8 = 0; i8 < n8; ++i8) {
            float f10 = arrq[i8].v;
            float f11 = f9;
            if (f10 != -1.0f) {
                f11 = Math.max((float)f9, (float)f10);
            }
            f9 = f11;
        }
        if (f9 == -1.0f) {
            return -1.0f;
        }
        return f9 * f8;
    }

    public boolean J2() {
        return true;
    }

    public final boolean K2(t0.p p8) {
        if (!(M.a < 23 || this.y1 || this.W1(p8.a) || p8.g && !o.b(this.V0))) {
            return true;
        }
        return false;
    }

    @Override
    public List L0(z z8, d0.q q8, boolean bl) {
        return I.w(k.f2(this.V0, z8, q8, bl, this.y1), q8);
    }

    @Override
    public int L1(z object, d0.q q8) {
        int n8;
        Object object2;
        boolean bl = d0.z.s(q8.n);
        int n9 = 0;
        if (!bl) {
            return Z0.a(0);
        }
        bl = q8.r != null;
        Object object3 = object2 = k.f2(this.V0, (z)object, q8, bl, false);
        if (bl) {
            object3 = object2;
            if (object2.isEmpty()) {
                object3 = k.f2(this.V0, (z)object, q8, false, false);
            }
        }
        if (object3.isEmpty()) {
            return Z0.a(1);
        }
        if (!w.M1(q8)) {
            return Z0.a(2);
        }
        object2 = (t0.p)object3.get(0);
        boolean bl2 = object2.m(q8);
        if (!bl2) {
            for (n8 = 1; n8 < object3.size(); ++n8) {
                t0.p p8 = (t0.p)object3.get(n8);
                if (!p8.m(q8)) continue;
                n8 = 0;
                bl2 = true;
                object3 = p8;
                break;
            }
        } else {
            n8 = 1;
            object3 = object2;
        }
        int n10 = bl2 ? 4 : 3;
        int n11 = object3.p(q8) ? 16 : 8;
        int n12 = object3.h ? 64 : 0;
        n8 = n8 != 0 ? 128 : 0;
        int n13 = n8;
        if (M.a >= 26) {
            n13 = n8;
            if ("video/dolby-vision".equals((Object)q8.n)) {
                n13 = n8;
                if (!b.a(this.V0)) {
                    n13 = 256;
                }
            }
        }
        n8 = n9;
        if (bl2) {
            object = k.f2(this.V0, (z)object, q8, bl, true);
            n8 = n9;
            if (!object.isEmpty()) {
                object = (t0.p)I.w((List)object, q8).get(0);
                n8 = n9;
                if (object.m(q8)) {
                    n8 = n9;
                    if (object.p(q8)) {
                        n8 = 32;
                    }
                }
            }
        }
        return Z0.c(n10, n11, n8, n12, n13);
    }

    public void L2(t0.m object, int n8, long l8) {
        g0.F.a("skipVideoBuffer");
        object.f(n8, false);
        g0.F.b();
        object = this.Q0;
        ++object.f;
    }

    public void N2(int n8, int n9) {
        k0.o o8 = this.Q0;
        o8.h += n8;
        o8.g += (n8 += n9);
        this.p1 += n8;
        this.q1 = n8 = this.q1 + n8;
        o8.i = Math.max((int)n8, (int)o8.i);
        n8 = this.Z0;
        if (n8 > 0 && this.p1 >= n8) {
            this.k2();
        }
    }

    @Override
    public m.a O0(t0.p p8, d0.q q8, MediaCrypto mediaCrypto, float f8) {
        c c8;
        Object object = this.k1;
        if (object != null && object.o != p8.g) {
            this.y2();
        }
        object = p8.c;
        this.d1 = c8 = this.e2(p8, q8, this.R());
        boolean bl = this.a1;
        int n8 = this.y1 ? this.z1 : 0;
        c8 = this.i2(q8, (String)object, c8, f8, bl, n8);
        if (this.j1 == null) {
            if (this.K2(p8)) {
                if (this.k1 == null) {
                    this.k1 = o.c(this.V0, p8.g);
                }
                this.j1 = this.k1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.r2((MediaFormat)c8);
        object = this.g1;
        object = object != null ? object.x() : this.j1;
        return m.a.b(p8, (MediaFormat)c8, q8, (Surface)object, mediaCrypto);
    }

    public void O2(long l8) {
        this.Q0.a(l8);
        this.s1 += l8;
        ++this.t1;
    }

    @Override
    public void T() {
        this.w1 = null;
        F f8 = this.g1;
        if (f8 != null) {
            f8.L();
        } else {
            this.b1.g();
        }
        this.s2();
        this.m1 = false;
        this.A1 = null;
        try {
            super.T();
            return;
        }
        finally {
            this.Y0.m(this.Q0);
            this.Y0.D(P.e);
        }
    }

    @Override
    public void T0(i i8) {
        if (!this.f1) {
            return;
        }
        i8 = (ByteBuffer)a.e((Object)i8.u);
        if (i8.remaining() >= 7) {
            byte by = i8.get();
            short s8 = i8.getShort();
            short s9 = i8.getShort();
            byte by2 = i8.get();
            byte by3 = i8.get();
            i8.position(0);
            if (by == -75 && s8 == 60 && s9 == 1 && by2 == 4 && (by3 == 0 || by3 == 1)) {
                byte[] arrby = new byte[i8.remaining()];
                i8.get(arrby);
                i8.position(0);
                k.C2((t0.m)a.e(this.F0()), arrby);
            }
        }
    }

    @Override
    public void U(boolean bl, boolean bl2) {
        Object object;
        super.U(bl, bl2);
        boolean bl3 = this.M().b;
        bl = !bl3 || this.z1 != 0;
        a.f(bl);
        if (this.y1 != bl3) {
            this.y1 = bl3;
            this.w1();
        }
        this.Y0.o(this.Q0);
        if (!this.h1) {
            if (!(this.i1 == null && this.X0 || this.g1 != null)) {
                object = this.W0;
                if (object == null) {
                    object = new d.b(this.V0, this.b1).f(this.L()).e();
                }
                this.g1 = object.b();
            }
            this.h1 = true;
        }
        if ((object = this.g1) != null) {
            object.F(new F.a(){

                @Override
                public void a(F f8) {
                    a.h((Object)k.this.j1);
                    k.this.u2();
                }

                @Override
                public void b(F f8) {
                    k.this.N2(0, 1);
                }

                @Override
                public void c(F f8, P p8) {
                }
            }, f.a());
            object = this.B1;
            if (object != null) {
                this.g1.z((p)object);
            }
            if (this.j1 != null && !this.l1.equals(A.c)) {
                this.g1.I(this.j1, this.l1);
            }
            this.g1.u(this.R0());
            object = this.i1;
            if (object != null) {
                this.g1.C((List)object);
            }
            this.g1.K(bl2);
            return;
        }
        this.b1.o(this.L());
        this.b1.h(bl2);
    }

    @Override
    public void V() {
        k0.n.super.V();
    }

    @Override
    public void W(long l8, boolean bl) {
        F f8 = this.g1;
        if (f8 != null) {
            f8.A(true);
            this.g1.D(this.P0(), this.b2());
        }
        super.W(l8, bl);
        if (this.g1 == null) {
            this.b1.m();
        }
        if (bl) {
            this.b1.e(false);
        }
        this.s2();
        this.q1 = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean W1(String string2) {
        if (string2.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!D1) {
                    E1 = k.a2();
                    D1 = true;
                }
                return E1;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void X() {
        k0.n.super.X();
        F f8 = this.g1;
        if (f8 != null && this.X0) {
            f8.release();
        }
    }

    @Override
    public void Z() {
        try {
            super.Z();
            return;
        }
        finally {
            this.h1 = false;
            if (this.k1 != null) {
                this.y2();
            }
        }
    }

    public void Z1(t0.m m8, int n8, long l8) {
        g0.F.a("dropVideoBuffer");
        m8.f(n8, false);
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
        F f8 = this.g1;
        if (f8 != null) {
            f8.y();
            return;
        }
        this.b1.k();
    }

    @Override
    public void b0() {
        this.k2();
        this.m2();
        F f8 = this.g1;
        if (f8 != null) {
            f8.B();
        } else {
            this.b1.l();
        }
        super.b0();
    }

    public long b2() {
        return 0L;
    }

    @Override
    public boolean c() {
        F f8;
        if (super.c() && ((f8 = this.g1) == null || f8.c())) {
            return true;
        }
        return false;
    }

    @Override
    public String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public boolean e() {
        Object object;
        boolean bl = super.e() && ((object = this.g1) == null || object.e());
        if (bl && ((object = this.k1) != null && this.j1 == object || this.F0() == null || this.y1)) {
            return true;
        }
        return this.b1.d(bl);
    }

    public c e2(t0.p p8, d0.q q8, d0.q[] stringBuilder) {
        int n8;
        int n9;
        int n10 = q8.t;
        int n11 = q8.u;
        int n12 = k.g2(p8, q8);
        if (stringBuilder.length == 1) {
            int n13 = n12;
            if (n12 != -1) {
                int n14 = k.c2(p8, q8);
                n13 = n12;
                if (n14 != -1) {
                    n13 = Math.min((int)((int)((float)n12 * 1.5f)), (int)n14);
                }
            }
            return new c(n10, n11, n13);
        }
        int n15 = stringBuilder.length;
        int n16 = n8 = 0;
        int n17 = n11;
        while (n8 < n15) {
            d0.q q9;
            d0.q q10 = q9 = stringBuilder[n8];
            if (q8.A != null) {
                q10 = q9;
                if (q9.A == null) {
                    q10 = q9.a().P(q8.A).K();
                }
            }
            int n18 = n10;
            int n19 = n17;
            n9 = n12;
            n11 = n16;
            if (p8.e((d0.q)q8, (d0.q)q10).d != 0) {
                n9 = q10.t;
                n11 = n9 != -1 && q10.u != -1 ? 0 : 1;
                n11 = n16 | n11;
                n18 = Math.max((int)n10, (int)n9);
                n19 = Math.max((int)n17, (int)q10.u);
                n9 = Math.max((int)n12, (int)k.g2(p8, q10));
            }
            ++n8;
            n10 = n18;
            n17 = n19;
            n12 = n9;
            n16 = n11;
        }
        n9 = n10;
        n11 = n17;
        n8 = n12;
        if (n16 != 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Resolutions unknown. Codec max resolution: ");
            stringBuilder.append(n10);
            stringBuilder.append("x");
            stringBuilder.append(n17);
            g0.o.h("MediaCodecVideoRenderer", stringBuilder.toString());
            stringBuilder = k.d2(p8, q8);
            n9 = n10;
            n11 = n17;
            n8 = n12;
            if (stringBuilder != null) {
                n9 = Math.max((int)n10, (int)stringBuilder.x);
                n11 = Math.max((int)n17, (int)stringBuilder.y);
                n8 = Math.max((int)n12, (int)k.c2(p8, q8.a().v0(n9).Y(n11).K()));
                p8 = new StringBuilder();
                p8.append("Codec max resolution adjusted to: ");
                p8.append(n9);
                p8.append("x");
                p8.append(n11);
                g0.o.h("MediaCodecVideoRenderer", p8.toString());
            }
        }
        return new c(n9, n11, n8);
    }

    @Override
    public void f(long l8, long l9) {
        super.f(l8, l9);
        F f8 = this.g1;
        if (f8 != null) {
            try {
                f8.f(l8, l9);
                return;
            }
            catch (F.b b8) {
                throw this.J((Throwable)b8, b8.o, 7001);
            }
        }
    }

    @Override
    public void h1(Exception exception) {
        g0.o.d("MediaCodecVideoRenderer", "Video codec error", (Throwable)exception);
        this.Y0.C(exception);
    }

    @Override
    public void i1(String string2, m.a a8, long l8, long l9) {
        this.Y0.k(string2, l8, l9);
        this.e1 = this.W1(string2);
        this.f1 = ((t0.p)a.e(this.H0())).n();
        this.s2();
    }

    public MediaFormat i2(d0.q q8, String string2, c c8, float f8, boolean bl, int n8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", string2);
        mediaFormat.setInteger("width", q8.t);
        mediaFormat.setInteger("height", q8.u);
        r.e(mediaFormat, q8.q);
        r.c(mediaFormat, "frame-rate", q8.v);
        r.d(mediaFormat, "rotation-degrees", q8.w);
        r.b(mediaFormat, q8.A);
        if ("video/dolby-vision".equals((Object)q8.n) && (q8 = I.r(q8)) != null) {
            r.d(mediaFormat, "profile", (Integer)q8.first);
        }
        mediaFormat.setInteger("max-width", c8.a);
        mediaFormat.setInteger("max-height", c8.b);
        r.d(mediaFormat, "max-input-size", c8.c);
        int n9 = M.a;
        if (n9 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (bl) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (n8 != 0) {
            k.X1(mediaFormat, n8);
        }
        if (n9 >= 35) {
            mediaFormat.setInteger("importance", Math.max((int)0, (int)(- this.x1)));
        }
        return mediaFormat;
    }

    @Override
    public void j() {
        F f8 = this.g1;
        if (f8 != null) {
            f8.j();
            return;
        }
        this.b1.a();
    }

    @Override
    public void j1(String string2) {
        this.Y0.l(string2);
    }

    public boolean j2(long l8, boolean bl) {
        Object object;
        int n8 = this.g0(l8);
        if (n8 == 0) {
            return false;
        }
        if (bl) {
            object = this.Q0;
            object.d += n8;
            object.f += this.r1;
        } else {
            object = this.Q0;
            ++object.j;
            this.N2(n8, this.r1);
        }
        this.C0();
        object = this.g1;
        if (object != null) {
            object.A(false);
        }
        return true;
    }

    @Override
    public k0.p k0(t0.p object, d0.q q8, d0.q q9) {
        int n8;
        int n9;
        block5 : {
            block4 : {
                k0.p p8 = object.e(q8, q9);
                n8 = p8.e;
                c c8 = (c)a.e(this.d1);
                if (q9.t > c8.a) break block4;
                n9 = n8;
                if (q9.u <= c8.b) break block5;
            }
            n9 = n8 | 256;
        }
        n8 = n9;
        if (k.g2((t0.p)object, q9) > c8.c) {
            n8 = n9 | 64;
        }
        object = object.a;
        n9 = n8 != 0 ? 0 : p8.d;
        return new k0.p((String)object, q8, q9, n9, n8);
    }

    @Override
    public k0.p k1(v0 v02) {
        k0.p p8 = super.k1(v02);
        this.Y0.p((d0.q)a.e(v02.b), p8);
        return p8;
    }

    public final void k2() {
        if (this.p1 > 0) {
            long l8 = this.L().b();
            long l9 = this.o1;
            this.Y0.n(this.p1, l8 - l9);
            this.p1 = 0;
            this.o1 = l8;
        }
    }

    @Override
    public void l1(d0.q q8, MediaFormat mediaFormat) {
        int n8;
        int n9;
        int n10;
        float f8;
        block9 : {
            int n11;
            int n12;
            float f9;
            int n13;
            block7 : {
                block8 : {
                    t0.m m8 = this.F0();
                    if (m8 != null) {
                        m8.g(this.n1);
                    }
                    boolean bl = this.y1;
                    n13 = 0;
                    if (bl) {
                        n12 = q8.t;
                        n11 = q8.u;
                    } else {
                        a.e((Object)mediaFormat);
                        n12 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top") ? 1 : 0;
                        n11 = n12 != 0 ? mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left") + 1 : mediaFormat.getInteger("width");
                        n12 = n12 != 0 ? mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top") + 1 : mediaFormat.getInteger("height");
                        n10 = n12;
                        n12 = n11;
                        n11 = n10;
                    }
                    f9 = q8.x;
                    if (!k.V1()) break block7;
                    int n14 = q8.w;
                    if (n14 == 90) break block8;
                    n10 = n11;
                    n8 = n13;
                    f8 = f9;
                    n9 = n12;
                    if (n14 != 270) break block9;
                }
                f8 = 1.0f / f9;
                n10 = n12;
                n8 = n13;
                n9 = n11;
                break block9;
            }
            n10 = n11;
            n8 = n13;
            f8 = f9;
            n9 = n12;
            if (this.g1 == null) {
                n8 = q8.w;
                n9 = n12;
                f8 = f9;
                n10 = n11;
            }
        }
        this.v1 = new P(n9, n10, n8, f8);
        if (this.g1 != null) {
            this.x2();
            this.g1.G(1, q8.a().v0(n9).Y(n10).n0(n8).k0(f8).K());
            return;
        }
        this.b1.p(q8.v);
    }

    public final void l2() {
        if (this.b1.i() && this.j1 != null) {
            this.u2();
        }
    }

    @Override
    public boolean m(long l8, long l9, boolean bl) {
        return this.H2(l8, l9, bl);
    }

    public final void m2() {
        int n8 = this.t1;
        if (n8 != 0) {
            this.Y0.B(this.s1, n8);
            this.s1 = 0L;
            this.t1 = 0;
        }
    }

    @Override
    public boolean n(long l8, long l9, long l10, boolean bl, boolean bl2) {
        if (this.G2(l8, l10, bl) && this.j2(l9, bl2)) {
            return true;
        }
        return false;
    }

    @Override
    public void n1(long l8) {
        super.n1(l8);
        if (!this.y1) {
            --this.r1;
        }
    }

    public final void n2(P p8) {
        if (!p8.equals(P.e) && !p8.equals(this.w1)) {
            this.w1 = p8;
            this.Y0.D(p8);
        }
    }

    @Override
    public void o1() {
        super.o1();
        F f8 = this.g1;
        if (f8 != null) {
            f8.D(this.P0(), this.b2());
        } else {
            this.b1.j();
        }
        this.s2();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean o2(t0.m m8, int n8, long l8, d0.q q8) {
        long l9 = this.c1.g();
        long l10 = this.c1.f();
        if (M.a >= 21) {
            if (this.J2() && l9 == this.u1) {
                this.L2(m8, n8, l8);
            } else {
                this.t2(l8, l9, q8);
                this.B2(m8, n8, l8, l9);
            }
            this.O2(l10);
            this.u1 = l9;
            return true;
        }
        if (l10 >= 30000L) return false;
        if (l10 > 11000L) {
            Thread.sleep((long)((l10 - 10000L) / 1000L));
        }
        this.t2(l8, l9, q8);
        this.z2(m8, n8, l8);
        this.O2(l10);
        return true;
        catch (InterruptedException interruptedException) {}
        Thread.currentThread().interrupt();
        return false;
    }

    @Override
    public void p1(i i8) {
        boolean bl = this.y1;
        if (!bl) {
            ++this.r1;
        }
        if (M.a < 23 && bl) {
            this.v2(i8.t);
        }
    }

    public final void p2() {
        Surface surface = this.j1;
        if (surface != null && this.m1) {
            this.Y0.A((Object)surface);
        }
    }

    @Override
    public void q1(d0.q q8) {
        F f8 = this.g1;
        if (f8 != null && !f8.J()) {
            try {
                this.g1.H(q8);
                return;
            }
            catch (F.b b8) {
                throw this.J((Throwable)b8, q8, 7000);
            }
        }
    }

    public final void q2() {
        P p8 = this.w1;
        if (p8 != null) {
            this.Y0.D(p8);
        }
    }

    public final void r2(MediaFormat mediaFormat) {
        F f8 = this.g1;
        if (f8 != null && !f8.E()) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }

    @Override
    public boolean s1(long l8, long l9, t0.m m8, ByteBuffer object, int n8, int n9, int n10, long l10, boolean bl, boolean bl2, d0.q q8) {
        a.e(m8);
        long l11 = l10 - this.P0();
        n9 = this.b1.c(l10, l8, l9, this.Q0(), bl2, this.c1);
        if (n9 == 4) {
            return false;
        }
        if (bl && !bl2) {
            this.L2(m8, n8, l11);
            return true;
        }
        if (this.j1 == this.k1 && this.g1 == null) {
            if (this.c1.f() < 30000L) {
                this.L2(m8, n8, l11);
                this.O2(this.c1.f());
                return true;
            }
            return false;
        }
        object = this.g1;
        if (object != null) {
            try {
                object.f(l8, l9);
            }
            catch (F.b b8) {
                throw this.J((Throwable)b8, b8.o, 7001);
            }
            l8 = this.g1.w(l10 + this.b2(), bl2);
            if (l8 == -9223372036854775807L) {
                return false;
            }
            this.A2(m8, n8, l11, l8);
            return true;
        }
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf((int)n9));
                    }
                    this.L2(m8, n8, l11);
                    this.O2(this.c1.f());
                    return true;
                }
                this.Z1(m8, n8, l11);
                this.O2(this.c1.f());
                return true;
            }
            return this.o2((t0.m)a.h(m8), n8, l11, q8);
        }
        l8 = this.L().c();
        this.t2(l11, l8, q8);
        this.A2(m8, n8, l11, l8);
        this.O2(this.c1.f());
        return true;
    }

    public final void s2() {
        if (this.y1) {
            int n8 = M.a;
            if (n8 < 23) {
                return;
            }
            t0.m m8 = this.F0();
            if (m8 == null) {
                return;
            }
            this.A1 = new d(m8);
            if (n8 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                m8.c(bundle);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void t(int n8, Object object) {
        if (n8 != 1) {
            if (n8 != 7) {
                if (n8 != 10) {
                    if (n8 != 16) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                if (n8 != 13) {
                                    if (n8 != 14) {
                                        super.t(n8, object);
                                        return;
                                    }
                                    if ((object = (A)a.e(object)).b() == 0 || object.a() == 0) return;
                                    this.l1 = object;
                                    F f8 = this.g1;
                                    if (f8 == null) return;
                                    f8.I((Surface)a.h((Object)this.j1), (A)object);
                                    return;
                                }
                                this.F2((List)a.e(object));
                                return;
                            }
                            this.b1.n((Integer)a.e(object));
                            return;
                        }
                        this.n1 = (Integer)a.e(object);
                        object = this.F0();
                        if (object == null) return;
                        object.g(this.n1);
                        return;
                    }
                    this.x1 = (Integer)a.e(object);
                    this.M2();
                    return;
                }
                n8 = (Integer)a.e(object);
                if (this.z1 == n8) return;
                this.z1 = n8;
                if (!this.y1) return;
                this.w1();
                return;
            }
            this.B1 = object = (p)a.e(object);
            F f9 = this.g1;
            if (f9 == null) return;
            f9.z((p)object);
            return;
        }
        this.D2(object);
    }

    @Override
    public t0.o t0(Throwable throwable, t0.p p8) {
        return new j(throwable, p8, this.j1);
    }

    public final void t2(long l8, long l9, d0.q q8) {
        p p8 = this.B1;
        if (p8 != null) {
            p8.k(l8, l9, q8, this.K0());
        }
    }

    public final void u2() {
        this.Y0.A((Object)this.j1);
        this.m1 = true;
    }

    public void v2(long l8) {
        this.P1(l8);
        this.n2(this.v1);
        k0.o o8 = this.Q0;
        ++o8.e;
        this.l2();
        this.n1(l8);
    }

    public final void w2() {
        this.E1();
    }

    public void x2() {
    }

    @Override
    public boolean y(long l8, long l9) {
        return this.I2(l8, l9);
    }

    @Override
    public void y1() {
        super.y1();
        this.r1 = 0;
    }

    public final void y2() {
        Surface surface = this.j1;
        o o8 = this.k1;
        if (surface == o8) {
            this.j1 = null;
        }
        if (o8 != null) {
            o8.release();
            this.k1 = null;
        }
    }

    public void z2(t0.m object, int n8, long l8) {
        g0.F.a("releaseOutputBuffer");
        object.f(n8, true);
        g0.F.b();
        object = this.Q0;
        ++object.e;
        this.q1 = 0;
        if (this.g1 == null) {
            this.n2(this.v1);
            this.l2();
        }
    }

    public static final abstract class b {
        public static boolean a(Context display) {
            display = (display = (DisplayManager)display.getSystemService("display")) != null ? display.getDisplay(0) : null;
            if (display != null && l.a(display)) {
                display = n.a(m.a(display));
                int n8 = display.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (display[i8] != 1) continue;
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }
    }

    public final class d
    implements m.d,
    Handler.Callback {
        public final Handler o;

        public d(t0.m m8) {
            k.this = M.B(this);
            this.o = k.this;
            m8.o(this, (Handler)k.this);
        }

        @Override
        public void a(t0.m m8, long l8, long l9) {
            if (M.a < 30) {
                m8 = Message.obtain((Handler)this.o, (int)0, (int)((int)(l8 >> 32)), (int)((int)l8));
                this.o.sendMessageAtFrontOfQueue((Message)m8);
                return;
            }
            this.b(l8);
        }

        public final void b(long l8) {
            k k8 = k.this;
            if (this == k8.A1) {
                if (k8.F0() == null) {
                    return;
                }
                if (l8 == Long.MAX_VALUE) {
                    k.this.w2();
                    return;
                }
                try {
                    k.this.v2(l8);
                    return;
                }
                catch (u u8) {
                    k.this.F1(u8);
                }
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            this.b(M.g1(message.arg1, message.arg2));
            return true;
        }
    }

}

