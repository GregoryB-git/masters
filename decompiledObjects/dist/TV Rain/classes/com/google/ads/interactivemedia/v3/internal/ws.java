package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class ws
  extends jo
{
  private static final int[] c = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  private static boolean d;
  private static boolean e;
  private long A;
  private int B;
  private float C;
  private int D;
  private int E;
  private int F;
  private float G;
  private int H;
  private int I;
  private int J;
  private float K;
  private boolean L;
  private int M;
  private long N;
  private long O;
  private int P;
  private wu Q;
  public a b;
  private final Context f;
  private final ww g;
  private final wz h;
  private final long i;
  private final int j;
  private final boolean k;
  private final long[] l;
  private final long[] m;
  private b n;
  private boolean o;
  private boolean p;
  private Surface q;
  private Surface r;
  private int s;
  private boolean t;
  private long u;
  private long v;
  private long w;
  private int x;
  private int y;
  private int z;
  
  public ws(Context paramContext, jt paramjt, long paramLong, Handler paramHandler, xa paramxa, int paramInt)
  {
    this(paramContext, paramjt, 5000L, null, false, paramHandler, paramxa, 50);
  }
  
  private ws(Context paramContext, jt paramjt, long paramLong, fj<fn> paramfj, boolean paramBoolean, Handler paramHandler, xa paramxa, int paramInt)
  {
    this(paramContext, paramjt, paramLong, null, false, false, paramHandler, paramxa, paramInt);
  }
  
  private ws(Context paramContext, jt paramjt, long paramLong, fj<fn> paramfj, boolean paramBoolean1, boolean paramBoolean2, Handler paramHandler, xa paramxa, int paramInt)
  {
    super(2, paramjt, paramfj, paramBoolean1, false, 30.0F);
    i = paramLong;
    j = paramInt;
    paramContext = paramContext.getApplicationContext();
    f = paramContext;
    g = new ww(paramContext);
    h = new wz(paramHandler, paramxa);
    k = "NVIDIA".equals(wl.c);
    l = new long[10];
    m = new long[10];
    O = -9223372036854775807L;
    N = -9223372036854775807L;
    v = -9223372036854775807L;
    D = -1;
    E = -1;
    G = -1.0F;
    C = -1.0F;
    s = 1;
    C();
  }
  
  private final void B()
  {
    if (!t)
    {
      t = true;
      h.a(q);
    }
  }
  
  private final void C()
  {
    H = -1;
    I = -1;
    K = -1.0F;
    J = -1;
  }
  
  private final void D()
  {
    int i1 = D;
    if (((i1 != -1) || (E != -1)) && ((H != i1) || (I != E) || (J != F) || (K != G)))
    {
      h.a(i1, E, F, G);
      H = D;
      I = E;
      J = F;
      K = G;
    }
  }
  
  private final void M()
  {
    int i1 = H;
    if ((i1 != -1) || (I != -1)) {
      h.a(i1, I, J, K);
    }
  }
  
  private final void N()
  {
    if (x > 0)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = w;
      h.a(x, l1 - l2);
      x = 0;
      w = l1;
    }
  }
  
  private static int a(jp paramjp, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -1) && (paramInt2 != -1))
    {
      paramString.getClass();
      int i1 = paramString.hashCode();
      int i2 = 4;
      switch (i1)
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  i1 = -1;
                  break;
                } while (!paramString.equals("video/x-vnd.on2.vp9"));
                i1 = 5;
                break;
              } while (!paramString.equals("video/x-vnd.on2.vp8"));
              i1 = 4;
              break;
            } while (!paramString.equals("video/avc"));
            i1 = 3;
            break;
          } while (!paramString.equals("video/mp4v-es"));
          i1 = 2;
          break;
        } while (!paramString.equals("video/hevc"));
        i1 = 1;
        break;
      } while (!paramString.equals("video/3gpp"));
      i1 = 0;
      switch (i1)
      {
      default: 
        return -1;
      case 3: 
        paramString = wl.d;
        if ((!"BRAVIA 4K 2015".equals(paramString)) && ((!"Amazon".equals(wl.c)) || ((!"KFSOWI".equals(paramString)) && ((!"AFTS".equals(paramString)) || (!d)))))
        {
          paramInt1 = wl.a(paramInt1, 16);
          paramInt1 = wl.a(paramInt2, 16) * paramInt1 << 4 << 4;
        }
        else
        {
          return -1;
        }
        break;
      case 1: 
      case 5: 
        paramInt2 = paramInt1 * paramInt2;
        paramInt1 = i2;
        break;
      case 0: 
      case 2: 
      case 4: 
        paramInt1 *= paramInt2;
      }
      i1 = 2;
      paramInt2 = paramInt1;
      paramInt1 = i1;
      return paramInt2 * 3 / (paramInt1 * 2);
    }
    return -1;
  }
  
  private static Point a(jp paramjp, bw parambw)
  {
    int i1 = o;
    int i2 = n;
    int i3 = 0;
    int i4;
    if (i1 > i2) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    int i5;
    if (i4 != 0) {
      i5 = i1;
    } else {
      i5 = i2;
    }
    if (i4 != 0) {
      i1 = i2;
    }
    float f1 = i1 / i5;
    int[] arrayOfInt = c;
    int i6 = arrayOfInt.length;
    i2 = i3;
    for (;;)
    {
      int i7;
      int i8;
      if (i2 < i6)
      {
        i7 = arrayOfInt[i2];
        i3 = (int)(i7 * f1);
        if ((i7 > i5) && (i3 > i1)) {
          if (wl.a >= 21)
          {
            if (i4 != 0) {
              i8 = i3;
            } else {
              i8 = i7;
            }
            if (i4 == 0) {
              i7 = i3;
            }
            Point localPoint = paramjp.a(i8, i7);
            float f2 = p;
            if (!paramjp.a(x, y, f2)) {
              break label256;
            }
            return localPoint;
          }
        }
      }
      try
      {
        i8 = wl.a(i7, 16) << 4;
        i3 = wl.a(i3, 16) << 4;
        if (i8 * i3 <= jv.b())
        {
          if (i4 != 0) {
            i5 = i3;
          } else {
            i5 = i8;
          }
          if (i4 == 0) {
            i8 = i3;
          }
          paramjp = new Point(i5, i8);
          return paramjp;
        }
        label256:
        i2++;
      }
      catch (ka paramjp)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  private static List<jp> a(jt paramjt, bw parambw, boolean paramBoolean1, boolean paramBoolean2)
    throws ka
  {
    List localList = jv.a(paramjt.a(i, paramBoolean1, paramBoolean2), parambw);
    if ("video/dolby-vision".equals(i))
    {
      parambw = jv.a(parambw);
      if (parambw != null)
      {
        int i1 = ((Integer)first).intValue();
        if ((i1 != 4) && (i1 != 8))
        {
          if (i1 == 9) {
            localList.addAll(paramjt.a("video/avc", paramBoolean1, paramBoolean2));
          }
        }
        else {
          localList.addAll(paramjt.a("video/hevc", paramBoolean1, paramBoolean2));
        }
      }
    }
    return Collections.unmodifiableList(localList);
  }
  
  private final void a(long paramLong1, long paramLong2, bw parambw)
  {
    parambw = Q;
    if (parambw != null) {
      parambw.a();
    }
  }
  
  private final void a(MediaCodec paramMediaCodec, int paramInt)
  {
    rp.b("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    rp.e();
    paramMediaCodec = a;
    f += 1;
  }
  
  private final void a(MediaCodec paramMediaCodec, int paramInt1, int paramInt2)
  {
    D = paramInt1;
    E = paramInt2;
    float f1 = C;
    G = f1;
    if (wl.a >= 21)
    {
      int i1 = B;
      if ((i1 == 90) || (i1 == 270))
      {
        D = paramInt2;
        E = paramInt1;
        G = (1.0F / f1);
      }
    }
    else
    {
      F = B;
    }
    paramMediaCodec.setVideoScalingMode(s);
  }
  
  @TargetApi(21)
  private final void a(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    D();
    rp.b("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong);
    rp.e();
    A = (SystemClock.elapsedRealtime() * 1000L);
    paramMediaCodec = a;
    e += 1;
    y = 0;
    B();
  }
  
  private static boolean a(String paramString)
  {
    boolean bool = paramString.startsWith("OMX.google");
    int i1 = 0;
    if (bool) {
      return false;
    }
    try
    {
      if (!d)
      {
        int i2 = wl.a;
        int i3 = 27;
        if (i2 <= 27)
        {
          paramString = wl.b;
          if (("dangal".equals(paramString)) || ("HWEML".equals(paramString)))
          {
            e = true;
            break label3821;
          }
        }
        if (i2 < 27)
        {
          paramString = wl.b;
          switch (paramString.hashCode())
          {
          default: 
            break;
          case 2048855701: 
            if (paramString.equals("HWWAS-H")) {
              i3 = 55;
            }
            break;
          case 2048319463: 
            if (paramString.equals("HWVNS-H")) {
              i3 = 54;
            }
            break;
          case 2047252157: 
            if (paramString.equals("ELUGA_Prim")) {
              i3 = 28;
            }
            break;
          case 2047190025: 
            if (!paramString.equals("ELUGA_Note")) {
              break;
            }
            break;
          case 2033393791: 
            if (paramString.equals("ASUS_X00AD_2")) {
              i3 = 12;
            }
            break;
          case 2030379515: 
            if (paramString.equals("HWCAM-H")) {
              i3 = 53;
            }
            break;
          case 2029784656: 
            if (paramString.equals("HWBLN-H")) {
              i3 = 52;
            }
            break;
          case 2006372676: 
            if (paramString.equals("BRAVIA_ATV3_4K")) {
              i3 = 16;
            }
            break;
          case 1977196784: 
            if (paramString.equals("Infinix-X572")) {
              i3 = 58;
            }
            break;
          case 1906253259: 
            if (paramString.equals("PB2-670M")) {
              i3 = 86;
            }
            break;
          case 1865889110: 
            if (paramString.equals("santoni")) {
              i3 = 102;
            }
            break;
          case 1709443163: 
            if (paramString.equals("iball8735_9806")) {
              i3 = 57;
            }
            break;
          case 1691543273: 
            if (paramString.equals("CPH1609")) {
              i3 = 20;
            }
            break;
          case 1522194893: 
            if (paramString.equals("woods_f")) {
              i3 = 118;
            }
            break;
          case 1349174697: 
            if (paramString.equals("htc_e56ml_dtul")) {
              i3 = 50;
            }
            break;
          case 1306947716: 
            if (paramString.equals("EverStar_S")) {
              i3 = 30;
            }
            break;
          case 1280332038: 
            if (paramString.equals("hwALE-H")) {
              i3 = 51;
            }
            break;
          case 1176899427: 
            if (paramString.equals("itel_S41")) {
              i3 = 60;
            }
            break;
          case 1150207623: 
            if (paramString.equals("LS-5017")) {
              i3 = 66;
            }
            break;
          case 1060579533: 
            if (paramString.equals("panell_d")) {
              i3 = 82;
            }
            break;
          case 958008161: 
            if (paramString.equals("j2xlteins")) {
              i3 = 61;
            }
            break;
          case 917340916: 
            if (paramString.equals("A7000plus")) {
              i3 = 8;
            }
            break;
          case 835649806: 
            if (paramString.equals("manning")) {
              i3 = 68;
            }
            break;
          case 794040393: 
            if (paramString.equals("GIONEE_WBL7519")) {
              i3 = 48;
            }
            break;
          case 794038622: 
            if (paramString.equals("GIONEE_WBL7365")) {
              i3 = 47;
            }
            break;
          case 793982701: 
            if (paramString.equals("GIONEE_WBL5708")) {
              i3 = 46;
            }
            break;
          case 507412548: 
            if (paramString.equals("QM16XE_U")) {
              i3 = 100;
            }
            break;
          case 407160593: 
            if (paramString.equals("Pixi5-10_4G")) {
              i3 = 92;
            }
            break;
          case 316246818: 
            if (paramString.equals("TB3-850M")) {
              i3 = 110;
            }
            break;
          case 316246811: 
            if (paramString.equals("TB3-850F")) {
              i3 = 109;
            }
            break;
          case 316215116: 
            if (paramString.equals("TB3-730X")) {
              i3 = 108;
            }
            break;
          case 316215098: 
            if (paramString.equals("TB3-730F")) {
              i3 = 107;
            }
            break;
          case 308517133: 
            if (paramString.equals("A7020a48")) {
              i3 = 10;
            }
            break;
          case 307593612: 
            if (paramString.equals("A7010a48")) {
              i3 = 9;
            }
            break;
          case 287431619: 
            if (paramString.equals("griffin")) {
              i3 = 49;
            }
            break;
          case 245388979: 
            if (paramString.equals("marino_f")) {
              i3 = 69;
            }
            break;
          case 182191441: 
            if (paramString.equals("CPY83_I00")) {
              i3 = 21;
            }
            break;
          case 165221241: 
            if (paramString.equals("A2016a40")) {
              i3 = 6;
            }
            break;
          case 102844228: 
            if (paramString.equals("le_x6")) {
              i3 = 65;
            }
            break;
          case 98715550: 
            if (paramString.equals("i9031")) {
              i3 = 56;
            }
            break;
          case 82882791: 
            if (paramString.equals("X3_HK")) {
              i3 = 120;
            }
            break;
          case 80963634: 
            if (paramString.equals("V23GB")) {
              i3 = 113;
            }
            break;
          case 76404911: 
            if (paramString.equals("Q4310")) {
              i3 = 98;
            }
            break;
          case 76404105: 
            if (paramString.equals("Q4260")) {
              i3 = 96;
            }
            break;
          case 76402249: 
            if (paramString.equals("PRO7S")) {
              i3 = 94;
            }
            break;
          case 66216390: 
            if (paramString.equals("F3311")) {
              i3 = 37;
            }
            break;
          case 66215433: 
            if (paramString.equals("F3215")) {
              i3 = 36;
            }
            break;
          case 66215431: 
            if (paramString.equals("F3213")) {
              i3 = 35;
            }
            break;
          case 66215429: 
            if (paramString.equals("F3211")) {
              i3 = 34;
            }
            break;
          case 66214473: 
            if (paramString.equals("F3116")) {
              i3 = 33;
            }
            break;
          case 66214470: 
            if (paramString.equals("F3113")) {
              i3 = 32;
            }
            break;
          case 66214468: 
            if (paramString.equals("F3111")) {
              i3 = 31;
            }
            break;
          case 65355429: 
            if (paramString.equals("E5643")) {
              i3 = 25;
            }
            break;
          case 61542055: 
            if (paramString.equals("A1601")) {
              i3 = 5;
            }
            break;
          case 55178625: 
            if (paramString.equals("Aura_Note_2")) {
              i3 = 13;
            }
            break;
          case 41325051: 
            if (paramString.equals("MEIZU_M5")) {
              i3 = 70;
            }
            break;
          case 3386211: 
            if (paramString.equals("p212")) {
              i3 = 79;
            }
            break;
          case 3351335: 
            if (paramString.equals("mido")) {
              i3 = 72;
            }
            break;
          case 3284551: 
            if (paramString.equals("kate")) {
              i3 = 64;
            }
            break;
          case 3154429: 
            if (paramString.equals("fugu")) {
              i3 = 39;
            }
            break;
          case 2689555: 
            if (paramString.equals("XE2X")) {
              i3 = 121;
            }
            break;
          case 2464648: 
            if (paramString.equals("Q427")) {
              i3 = 97;
            }
            break;
          case 2463773: 
            if (paramString.equals("Q350")) {
              i3 = 95;
            }
            break;
          case 2436959: 
            if (paramString.equals("P681")) {
              i3 = 80;
            }
            break;
          case 1514185: 
            if (paramString.equals("1714")) {
              i3 = 2;
            }
            break;
          case 1514184: 
            if (paramString.equals("1713")) {
              i3 = 1;
            }
            break;
          case 1513190: 
            if (paramString.equals("1601")) {
              i3 = 0;
            }
            break;
          case 101481: 
            if (paramString.equals("flo")) {
              i3 = 38;
            }
            break;
          case 99329: 
            if (paramString.equals("deb")) {
              i3 = 24;
            }
            break;
          case 98848: 
            if (paramString.equals("cv3")) {
              i3 = 23;
            }
            break;
          case 98846: 
            if (paramString.equals("cv1")) {
              i3 = 22;
            }
            break;
          case 88274: 
            if (paramString.equals("Z80")) {
              i3 = 124;
            }
            break;
          case 80618: 
            if (paramString.equals("QX1")) {
              i3 = 101;
            }
            break;
          case 79305: 
            if (paramString.equals("PLE")) {
              i3 = 93;
            }
            break;
          case 78669: 
            if (paramString.equals("P85")) {
              i3 = 81;
            }
            break;
          case 76779: 
            if (paramString.equals("MX6")) {
              i3 = 73;
            }
            break;
          case 75739: 
            if (paramString.equals("M5c")) {
              i3 = 67;
            }
            break;
          case 73405: 
            if (paramString.equals("JGZ")) {
              i3 = 62;
            }
            break;
          case 3483: 
            if (paramString.equals("mh")) {
              i3 = 71;
            }
            break;
          case 2719: 
            if (paramString.equals("V5")) {
              i3 = 114;
            }
            break;
          case 2715: 
            if (paramString.equals("V1")) {
              i3 = 112;
            }
            break;
          case 2564: 
            if (paramString.equals("Q5")) {
              i3 = 99;
            }
            break;
          case 2126: 
            if (paramString.equals("C1")) {
              i3 = 17;
            }
            break;
          case -56598463: 
            if (paramString.equals("woods_fn")) {
              i3 = 119;
            }
            break;
          case -173639913: 
            if (paramString.equals("ELUGA_A3_Pro")) {
              i3 = 26;
            }
            break;
          case -277133239: 
            if (paramString.equals("Z12_PRO")) {
              i3 = 123;
            }
            break;
          case -282781963: 
            if (paramString.equals("BLACK-1X")) {
              i3 = 14;
            }
            break;
          case -290434366: 
            if (paramString.equals("taido_row")) {
              i3 = 106;
            }
            break;
          case -430914369: 
            if (paramString.equals("Pixi4-7_3G")) {
              i3 = 91;
            }
            break;
          case -521118391: 
            if (paramString.equals("GIONEE_GBL7360")) {
              i3 = 42;
            }
            break;
          case -575125681: 
            if (paramString.equals("GiONEE_CBL7513")) {
              i3 = 40;
            }
            break;
          case -782144577: 
            if (paramString.equals("OnePlus5T")) {
              i3 = 78;
            }
            break;
          case -788334647: 
            if (paramString.equals("whyred")) {
              i3 = 117;
            }
            break;
          case -794946968: 
            if (paramString.equals("watson")) {
              i3 = 116;
            }
            break;
          case -797483286: 
            if (paramString.equals("SVP-DTV15")) {
              i3 = 104;
            }
            break;
          case -821392978: 
            if (paramString.equals("A7000-a")) {
              i3 = 7;
            }
            break;
          case -842500323: 
            if (paramString.equals("nicklaus_f")) {
              i3 = 75;
            }
            break;
          case -879245230: 
            if (paramString.equals("tcl_eu")) {
              i3 = 111;
            }
            break;
          case -958336948: 
            if (paramString.equals("ELUGA_Ray_X")) {
              i3 = 29;
            }
            break;
          case -965403638: 
            if (paramString.equals("s905x018")) {
              i3 = 105;
            }
            break;
          case -993250458: 
            if (paramString.equals("A10-70L")) {
              i3 = 4;
            }
            break;
          case -993250464: 
            if (paramString.equals("A10-70F")) {
              i3 = 3;
            }
            break;
          case -1052835013: 
            if (paramString.equals("namath")) {
              i3 = 74;
            }
            break;
          case -1139198265: 
            if (paramString.equals("Slate_Pro")) {
              i3 = 103;
            }
            break;
          case -1180384755: 
            if (paramString.equals("iris60")) {
              i3 = 59;
            }
            break;
          case -1217592143: 
            if (paramString.equals("BRAVIA_ATV2")) {
              i3 = 15;
            }
            break;
          case -1320080169: 
            if (paramString.equals("GiONEE_GBL7319")) {
              i3 = 41;
            }
            break;
          case -1481772729: 
            if (paramString.equals("panell_dt")) {
              i3 = 85;
            }
            break;
          case -1481772730: 
            if (paramString.equals("panell_ds")) {
              i3 = 84;
            }
            break;
          case -1481772737: 
            if (paramString.equals("panell_dl")) {
              i3 = 83;
            }
            break;
          case -1554255044: 
            if (paramString.equals("vernee_M5")) {
              i3 = 115;
            }
            break;
          case -1615810839: 
            if (paramString.equals("Phantom6")) {
              i3 = 90;
            }
            break;
          case -1680025915: 
            if (paramString.equals("ComioS1")) {
              i3 = 18;
            }
            break;
          case -1696512866: 
            if (paramString.equals("XT1663")) {
              i3 = 122;
            }
            break;
          case -1931988508: 
            if (paramString.equals("AquaPowerM")) {
              i3 = 11;
            }
            break;
          case -1936688065: 
            if (paramString.equals("PGN611")) {
              i3 = 89;
            }
            break;
          case -1936688066: 
            if (paramString.equals("PGN610")) {
              i3 = 88;
            }
            break;
          case -1936688988: 
            if (paramString.equals("PGN528")) {
              i3 = 87;
            }
            break;
          case -1978990237: 
            if (paramString.equals("NX573J")) {
              i3 = 77;
            }
            break;
          case -1978993182: 
            if (paramString.equals("NX541J")) {
              i3 = 76;
            }
            break;
          case -2022874474: 
            if (paramString.equals("CP8676_I02")) {
              i3 = 19;
            }
            break;
          case -2097309513: 
            if (paramString.equals("K50a40")) {
              i3 = 63;
            }
            break;
          case -2144781160: 
            if (paramString.equals("GIONEE_SWW1631")) {
              i3 = 45;
            }
            break;
          case -2144781185: 
            if (paramString.equals("GIONEE_SWW1627")) {
              i3 = 44;
            }
            break;
          case -2144781245: 
            if (paramString.equals("GIONEE_SWW1609")) {
              i3 = 43;
            }
            break;
          }
          i3 = -1;
          switch (i3)
          {
          default: 
            break;
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
            e = true;
          }
          paramString = wl.d;
          i3 = paramString.hashCode();
          if (i3 != 2006354)
          {
            if ((i3 == 2006367) && (paramString.equals("AFTN")))
            {
              i3 = 1;
              break label3803;
            }
          }
          else if (paramString.equals("AFTA"))
          {
            i3 = i1;
            break label3803;
          }
          i3 = -1;
          label3803:
          if ((i3 == 0) || (i3 == 1)) {
            e = true;
          }
        }
        label3821:
        d = true;
      }
      return e;
    }
    finally {}
  }
  
  private static int b(jp paramjp, bw parambw)
  {
    if (j != -1)
    {
      int i1 = k.size();
      int i2 = 0;
      int i3 = 0;
      while (i2 < i1)
      {
        i3 += ((byte[])k.get(i2)).length;
        i2++;
      }
      return j + i3;
    }
    return a(paramjp, i, n, o);
  }
  
  private final void b(int paramInt)
  {
    fa localfa = a;
    g += paramInt;
    x += paramInt;
    paramInt = y + paramInt;
    y = paramInt;
    h = Math.max(paramInt, h);
    paramInt = j;
    if ((paramInt > 0) && (x >= paramInt)) {
      N();
    }
  }
  
  private final void b(MediaCodec paramMediaCodec, int paramInt)
  {
    D();
    rp.b("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    rp.e();
    A = (SystemClock.elapsedRealtime() * 1000L);
    paramMediaCodec = a;
    e += 1;
    y = 0;
    B();
  }
  
  private final boolean b(jp paramjp)
  {
    return (wl.a >= 23) && (!L) && (!a(a)) && ((!d) || (wr.a(f)));
  }
  
  private final void c()
  {
    long l1;
    if (i > 0L) {
      l1 = SystemClock.elapsedRealtime() + i;
    } else {
      l1 = -9223372036854775807L;
    }
    v = l1;
  }
  
  private final void d()
  {
    t = false;
    if ((wl.a >= 23) && (L))
    {
      MediaCodec localMediaCodec = H();
      if (localMediaCodec != null) {
        b = new a(localMediaCodec, (byte)0);
      }
    }
  }
  
  private static boolean f(long paramLong)
  {
    return paramLong < -30000L;
  }
  
  public final boolean G()
  {
    return L;
  }
  
  public final void J()
  {
    try
    {
      super.J();
      return;
    }
    finally
    {
      z = 0;
    }
  }
  
  public final boolean L()
  {
    try
    {
      boolean bool = super.L();
      return bool;
    }
    finally
    {
      z = 0;
    }
  }
  
  public final float a(float paramFloat, bw[] paramArrayOfbw)
  {
    int i1 = paramArrayOfbw.length;
    int i2 = 0;
    float f3;
    for (float f1 = -1.0F; i2 < i1; f1 = f3)
    {
      float f2 = p;
      f3 = f1;
      if (f2 != -1.0F) {
        f3 = Math.max(f1, f2);
      }
      i2++;
    }
    if (f1 == -1.0F) {
      return -1.0F;
    }
    return f1 * paramFloat;
  }
  
  public final int a(jp paramjp, bw parambw1, bw parambw2)
  {
    if (paramjp.a(parambw1, parambw2, true))
    {
      int i1 = n;
      b localb = n;
      if ((i1 <= a) && (o <= b) && (b(paramjp, parambw2) <= n.c))
      {
        if (parambw1.b(parambw2)) {
          return 3;
        }
        return 2;
      }
    }
    return 0;
  }
  
  public final int a(jt paramjt, fj<fn> paramfj, bw parambw)
    throws ka
  {
    boolean bool1 = vs.b(i);
    int i1 = 0;
    if (!bool1) {
      return 0;
    }
    fe localfe = l;
    if (localfe != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    List localList1 = a(paramjt, parambw, bool1, false);
    List localList2 = localList1;
    if (bool1)
    {
      localList2 = localList1;
      if (localList1.isEmpty()) {
        localList2 = a(paramjt, parambw, false, false);
      }
    }
    if (localList2.isEmpty()) {
      return 1;
    }
    int i2;
    if ((localfe != null) && (!fn.class.equals(A)) && ((A != null) || (!cm.a(paramfj, localfe)))) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    if (i2 == 0) {
      return 2;
    }
    paramfj = (jp)localList2.get(0);
    boolean bool2 = paramfj.a(parambw);
    if (paramfj.b(parambw)) {
      i2 = 16;
    } else {
      i2 = 8;
    }
    int i3 = i1;
    if (bool2)
    {
      paramjt = a(paramjt, parambw, bool1, true);
      i3 = i1;
      if (!paramjt.isEmpty())
      {
        paramjt = (jp)paramjt.get(0);
        i3 = i1;
        if (paramjt.a(parambw))
        {
          i3 = i1;
          if (paramjt.b(parambw)) {
            i3 = 32;
          }
        }
      }
    }
    if (bool2) {
      i1 = 4;
    } else {
      i1 = 3;
    }
    return i1 | i2 | i3;
  }
  
  public final jr a(Throwable paramThrowable, jp paramjp)
  {
    return new c(paramThrowable, paramjp, q);
  }
  
  public final List<jp> a(jt paramjt, bw parambw, boolean paramBoolean)
    throws ka
  {
    return a(paramjt, parambw, paramBoolean, L);
  }
  
  public final void a(int paramInt, Object paramObject)
    throws ba
  {
    if (paramInt == 1)
    {
      Object localObject = (Surface)paramObject;
      paramObject = localObject;
      if (localObject == null)
      {
        paramObject = r;
        if (paramObject == null)
        {
          jp localjp = I();
          paramObject = localObject;
          if (localjp != null)
          {
            paramObject = localObject;
            if (b(localjp))
            {
              paramObject = wr.a(f, d);
              r = ((Surface)paramObject);
            }
          }
        }
      }
      if (q != paramObject)
      {
        q = ((Surface)paramObject);
        paramInt = f();
        localObject = H();
        if (localObject != null) {
          if ((wl.a >= 23) && (paramObject != null) && (!o))
          {
            ((MediaCodec)localObject).setOutputSurface((Surface)paramObject);
          }
          else
          {
            J();
            F();
          }
        }
        if ((paramObject != null) && (paramObject != r))
        {
          M();
          d();
          if (paramInt != 2) {
            return;
          }
          c();
        }
        else
        {
          C();
          d();
          return;
        }
      }
      else if ((paramObject != null) && (paramObject != r))
      {
        M();
        if (t) {
          h.a(q);
        }
      }
    }
    else
    {
      if (paramInt == 4)
      {
        s = ((Integer)paramObject).intValue();
        paramObject = H();
        if (paramObject != null) {
          ((MediaCodec)paramObject).setVideoScalingMode(s);
        }
        return;
      }
      if (paramInt == 6)
      {
        Q = ((wu)paramObject);
        return;
      }
      super.a(paramInt, paramObject);
    }
  }
  
  public final void a(long paramLong, boolean paramBoolean)
    throws ba
  {
    super.a(paramLong, paramBoolean);
    d();
    u = -9223372036854775807L;
    y = 0;
    N = -9223372036854775807L;
    int i1 = P;
    if (i1 != 0)
    {
      O = l[(i1 - 1)];
      P = 0;
    }
    if (paramBoolean)
    {
      c();
      return;
    }
    v = -9223372036854775807L;
  }
  
  public final void a(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    int i1;
    if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top"))) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2;
    if (i1 != 0) {
      i2 = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
    } else {
      i2 = paramMediaFormat.getInteger("width");
    }
    if (i1 != 0) {
      i1 = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
    } else {
      i1 = paramMediaFormat.getInteger("height");
    }
    a(paramMediaCodec, i2, i1);
  }
  
  public final void a(by paramby)
    throws ba
  {
    super.a(paramby);
    paramby = c;
    h.a(paramby);
    C = r;
    B = q;
  }
  
  public final void a(ez paramez)
  {
    z += 1;
    N = Math.max(c, N);
    if ((wl.a < 23) && (L)) {
      e(c);
    }
  }
  
  public final void a(jp paramjp, MediaCodec paramMediaCodec, bw parambw, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    String str = c;
    Object localObject1 = x();
    int i1 = n;
    int i2 = o;
    int i3 = b(paramjp, parambw);
    int i5;
    if (localObject1.length == 1)
    {
      i4 = i3;
      if (i3 != -1)
      {
        i5 = a(paramjp, i, n, o);
        i4 = i3;
        if (i5 != -1) {
          i4 = Math.min((int)(i3 * 1.5F), i5);
        }
      }
      localObject1 = new b(i1, i2, i4);
    }
    else
    {
      int i6 = localObject1.length;
      i5 = 0;
      int i7 = i5;
      i4 = i2;
      while (i5 < i6)
      {
        localObject2 = localObject1[i5];
        if (paramjp.a(parambw, (bw)localObject2, false))
        {
          int i8 = n;
          if ((i8 != -1) && (o != -1)) {
            i2 = 0;
          } else {
            i2 = 1;
          }
          i7 |= i2;
          i1 = Math.max(i1, i8);
          i4 = Math.max(i4, o);
          i3 = Math.max(i3, b(paramjp, (bw)localObject2));
        }
        i5++;
      }
      i6 = i1;
      i2 = i4;
      i5 = i3;
      if (i7 != 0)
      {
        localObject1 = new StringBuilder(66);
        ((StringBuilder)localObject1).append("Resolutions unknown. Codec max resolution: ");
        ((StringBuilder)localObject1).append(i1);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(i4);
        Log.w("MediaCodecVideoRenderer", ((StringBuilder)localObject1).toString());
        localObject1 = a(paramjp, parambw);
        i6 = i1;
        i2 = i4;
        i5 = i3;
        if (localObject1 != null)
        {
          i6 = Math.max(i1, x);
          i2 = Math.max(i4, y);
          i5 = Math.max(i3, a(paramjp, i, i6, i2));
          localObject1 = new StringBuilder(57);
          ((StringBuilder)localObject1).append("Codec max resolution adjusted to: ");
          ((StringBuilder)localObject1).append(i6);
          ((StringBuilder)localObject1).append("x");
          ((StringBuilder)localObject1).append(i2);
          Log.w("MediaCodecVideoRenderer", ((StringBuilder)localObject1).toString());
        }
      }
      localObject1 = new b(i6, i2, i5);
    }
    n = ((b)localObject1);
    boolean bool = k;
    i3 = M;
    Object localObject2 = new MediaFormat();
    ((MediaFormat)localObject2).setString("mime", str);
    ((MediaFormat)localObject2).setInteger("width", n);
    ((MediaFormat)localObject2).setInteger("height", o);
    h.a((MediaFormat)localObject2, k);
    h.a((MediaFormat)localObject2, "frame-rate", p);
    h.a((MediaFormat)localObject2, "rotation-degrees", q);
    h.a((MediaFormat)localObject2, s);
    if ("video/dolby-vision".equals(i))
    {
      parambw = jv.a(parambw);
      if (parambw != null) {
        h.a((MediaFormat)localObject2, "profile", ((Integer)first).intValue());
      }
    }
    ((MediaFormat)localObject2).setInteger("max-width", a);
    ((MediaFormat)localObject2).setInteger("max-height", b);
    h.a((MediaFormat)localObject2, "max-input-size", c);
    int i4 = wl.a;
    if (i4 >= 23)
    {
      ((MediaFormat)localObject2).setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        ((MediaFormat)localObject2).setFloat("operating-rate", paramFloat);
      }
    }
    if (bool)
    {
      ((MediaFormat)localObject2).setInteger("no-post-process", 1);
      ((MediaFormat)localObject2).setInteger("auto-frc", 0);
    }
    if (i3 != 0)
    {
      ((MediaFormat)localObject2).setFeatureEnabled("tunneled-playback", true);
      ((MediaFormat)localObject2).setInteger("audio-session-id", i3);
    }
    if (q == null)
    {
      rp.c(b(paramjp));
      if (r == null) {
        r = wr.a(f, d);
      }
      q = r;
    }
    paramMediaCodec.configure((MediaFormat)localObject2, q, paramMediaCrypto, 0);
    if ((i4 >= 23) && (L)) {
      b = new a(paramMediaCodec, (byte)0);
    }
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    h.a(paramString, paramLong1, paramLong2);
    o = a(paramString);
    paramString = (jp)rp.a(I());
    int i1 = wl.a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 >= 29)
    {
      bool2 = bool1;
      if ("video/x-vnd.on2.vp9".equals(b))
      {
        paramString = paramString.a();
        int i2 = paramString.length;
        for (i1 = 0;; i1++)
        {
          bool2 = bool1;
          if (i1 >= i2) {
            break;
          }
          if (profile == 16384)
          {
            bool2 = true;
            break;
          }
        }
      }
    }
    p = bool2;
  }
  
  public final void a(boolean paramBoolean)
    throws ba
  {
    super.a(paramBoolean);
    int i1 = M;
    int i2 = yb;
    M = i2;
    if (i2 != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    L = paramBoolean;
    if (i2 != i1) {
      J();
    }
    h.a(a);
    g.a();
  }
  
  public final void a(bw[] paramArrayOfbw, long paramLong)
    throws ba
  {
    if (O == -9223372036854775807L)
    {
      O = paramLong;
    }
    else
    {
      int i1 = P;
      Object localObject = l;
      if (i1 == localObject.length)
      {
        long l1 = localObject[(i1 - 1)];
        localObject = new StringBuilder(65);
        ((StringBuilder)localObject).append("Too many stream changes, so dropping offset: ");
        ((StringBuilder)localObject).append(l1);
        Log.w("MediaCodecVideoRenderer", ((StringBuilder)localObject).toString());
      }
      else
      {
        P = (i1 + 1);
      }
      localObject = l;
      i1 = P;
      localObject[(i1 - 1)] = paramLong;
      m[(i1 - 1)] = N;
    }
    super.a(paramArrayOfbw, paramLong);
  }
  
  public final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, bw parambw)
    throws ba
  {
    if (u == -9223372036854775807L) {
      u = paramLong1;
    }
    long l1 = paramLong3 - O;
    if ((paramBoolean1) && (!paramBoolean2))
    {
      a(paramMediaCodec, paramInt1);
      return true;
    }
    long l2 = paramLong3 - paramLong1;
    if (q == r)
    {
      if (f(l2))
      {
        a(paramMediaCodec, paramInt1);
        return true;
      }
      return false;
    }
    long l3 = SystemClock.elapsedRealtime() * 1000L;
    if (f() == 2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if (t)
    {
      long l4;
      if (paramInt2 != 0)
      {
        l4 = A;
        int i1;
        if ((f(l2)) && (l3 - l4 > 100000L)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {}
      }
      else
      {
        if ((paramInt2 != 0) && (paramLong1 != u))
        {
          l4 = System.nanoTime();
          paramLong2 = g.a(paramLong3, (l2 - (l3 - paramLong2)) * 1000L + l4);
          paramLong3 = (paramLong2 - l4) / 1000L;
          if (paramLong3 < -500000L) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if ((paramInt2 != 0) && (!paramBoolean2)) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            paramInt2 = b(paramLong1);
            if (paramInt2 == 0)
            {
              paramInt2 = 0;
            }
            else
            {
              paramByteBuffer = a;
              i += 1;
              b(z + paramInt2);
              K();
              paramInt2 = 1;
            }
            if (paramInt2 != 0) {
              return false;
            }
          }
          if ((f(paramLong3)) && (!paramBoolean2)) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            rp.b("dropVideoBuffer");
            paramMediaCodec.releaseOutputBuffer(paramInt1, false);
            rp.e();
            b(1);
            return true;
          }
          if (wl.a >= 21)
          {
            if (paramLong3 < 50000L)
            {
              a(l1, paramLong2, parambw);
              a(paramMediaCodec, paramInt1, paramLong2);
              return true;
            }
          }
          else if (paramLong3 < 30000L)
          {
            if (paramLong3 > 11000L) {
              try
              {
                Thread.sleep((paramLong3 - 10000L) / 1000L);
              }
              catch (InterruptedException paramMediaCodec)
              {
                Thread.currentThread().interrupt();
                return false;
              }
            }
            a(l1, paramLong2, parambw);
            b(paramMediaCodec, paramInt1);
            return true;
          }
          return false;
        }
        return false;
      }
    }
    paramLong1 = System.nanoTime();
    a(l1, paramLong1, parambw);
    if (wl.a >= 21) {
      a(paramMediaCodec, paramInt1, paramLong1);
    } else {
      b(paramMediaCodec, paramInt1);
    }
    return true;
  }
  
  public final boolean a(jp paramjp)
  {
    return (q != null) || (b(paramjp));
  }
  
  public final void b(ez paramez)
    throws ba
  {
    if (!p) {
      return;
    }
    Object localObject = (ByteBuffer)rp.a(d);
    if (((Buffer)localObject).remaining() >= 7)
    {
      int i1 = ((ByteBuffer)localObject).get();
      int i2 = ((ByteBuffer)localObject).getShort();
      int i3 = ((ByteBuffer)localObject).getShort();
      int i4 = ((ByteBuffer)localObject).get();
      int i5 = ((ByteBuffer)localObject).get();
      ((ByteBuffer)localObject).position(0);
      if ((i1 == -75) && (i2 == 60) && (i3 == 1) && (i4 == 4) && (i5 == 0))
      {
        paramez = new byte[((Buffer)localObject).remaining()];
        ((ByteBuffer)localObject).get(paramez);
        ((ByteBuffer)localObject).position(0);
        localObject = H();
        Bundle localBundle = new Bundle();
        localBundle.putByteArray("hdr10-plus-info", paramez);
        ((MediaCodec)localObject).setParameters(localBundle);
      }
    }
  }
  
  public final void c(long paramLong)
  {
    z -= 1;
    for (;;)
    {
      int i1 = P;
      if ((i1 == 0) || (paramLong < m[0])) {
        break;
      }
      long[] arrayOfLong = l;
      O = arrayOfLong[0];
      i1--;
      P = i1;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i1);
      arrayOfLong = m;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, P);
    }
  }
  
  public final void e(long paramLong)
  {
    bw localbw = d(paramLong);
    if (localbw != null) {
      a(H(), n, o);
    }
    D();
    B();
    c(paramLong);
  }
  
  public final boolean n()
  {
    if (super.n()) {
      if (!t)
      {
        Surface localSurface = r;
        if (((localSurface == null) || (q != localSurface)) && (H() != null) && (!L)) {}
      }
      else
      {
        v = -9223372036854775807L;
        return true;
      }
    }
    if (v == -9223372036854775807L) {
      return false;
    }
    if (SystemClock.elapsedRealtime() < v) {
      return true;
    }
    v = -9223372036854775807L;
    return false;
  }
  
  public final void t()
  {
    super.t();
    x = 0;
    w = SystemClock.elapsedRealtime();
    A = (SystemClock.elapsedRealtime() * 1000L);
  }
  
  public final void u()
  {
    v = -9223372036854775807L;
    N();
    super.u();
  }
  
  public final void v()
  {
    N = -9223372036854775807L;
    O = -9223372036854775807L;
    P = 0;
    C();
    d();
    g.b();
    b = null;
    try
    {
      super.v();
      return;
    }
    finally
    {
      h.b(a);
    }
  }
  
  public final void w()
  {
    try
    {
      super.w();
      Surface localSurface1 = r;
      if (localSurface1 != null)
      {
        if (q == localSurface1) {
          q = null;
        }
        localSurface1.release();
        r = null;
      }
      return;
    }
    finally
    {
      if (r != null)
      {
        Surface localSurface2 = q;
        Surface localSurface3 = r;
        if (localSurface2 == localSurface3) {
          q = null;
        }
        localSurface3.release();
        r = null;
      }
    }
  }
  
  @TargetApi(23)
  public final class a
    implements MediaCodec.OnFrameRenderedListener
  {
    private a(MediaCodec paramMediaCodec)
    {
      paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
    }
    
    public final void onFrameRendered(MediaCodec paramMediaCodec, long paramLong1, long paramLong2)
    {
      paramMediaCodec = ws.this;
      if (this != b) {
        return;
      }
      paramMediaCodec.e(paramLong1);
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final int c;
    
    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
    }
  }
  
  public static final class c
    extends jr
  {
    private final boolean a;
    
    public c(Throwable paramThrowable, jp paramjp, Surface paramSurface)
    {
      super(paramjp);
      System.identityHashCode(paramSurface);
      boolean bool;
      if ((paramSurface != null) && (!paramSurface.isValid())) {
        bool = false;
      } else {
        bool = true;
      }
      a = bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ws
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */