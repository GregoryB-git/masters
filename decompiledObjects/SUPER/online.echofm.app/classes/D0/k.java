package D0;

import X2.v;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import b3.f;
import d0.P;
import g0.A;
import g0.M;
import g0.a;
import g0.c;
import g0.r;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import k0.Z0;
import k0.b1;
import k0.u;
import k0.v0;
import t0.I;
import t0.I.c;
import t0.m.a;
import t0.m.b;
import t0.m.d;
import t0.w;

public class k
  extends w
  implements q.b
{
  public static final int[] C1 = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
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
  
  public k(Context paramContext, m.b paramb, t0.z paramz, long paramLong, boolean paramBoolean, Handler paramHandler, E paramE, int paramInt)
  {
    this(paramContext, paramb, paramz, paramLong, paramBoolean, paramHandler, paramE, paramInt, 30.0F);
  }
  
  public k(Context paramContext, m.b paramb, t0.z paramz, long paramLong, boolean paramBoolean, Handler paramHandler, E paramE, int paramInt, float paramFloat)
  {
    this(paramContext, paramb, paramz, paramLong, paramBoolean, paramHandler, paramE, paramInt, paramFloat, null);
  }
  
  public k(Context paramContext, m.b paramb, t0.z paramz, long paramLong, boolean paramBoolean, Handler paramHandler, E paramE, int paramInt, float paramFloat, G paramG)
  {
    super(2, paramb, paramz, paramBoolean, paramFloat);
    paramContext = paramContext.getApplicationContext();
    V0 = paramContext;
    Z0 = paramInt;
    W0 = paramG;
    Y0 = new E.a(paramHandler, paramE);
    if (paramG == null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    X0 = paramBoolean;
    if (paramG == null) {
      b1 = new q(paramContext, this, paramLong);
    } else {
      b1 = paramG.a();
    }
    c1 = new q.a();
    a1 = Y1();
    l1 = A.c;
    n1 = 1;
    v1 = P.e;
    z1 = 0;
    w1 = null;
    x1 = 64536;
  }
  
  public static void C2(t0.m paramm, byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("hdr10-plus-info", paramArrayOfByte);
    paramm.c(localBundle);
  }
  
  private void M2()
  {
    t0.m localm = F0();
    if (localm == null) {
      return;
    }
    if (M.a >= 35)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("importance", Math.max(0, -x1));
      localm.c(localBundle);
    }
  }
  
  public static boolean V1()
  {
    boolean bool;
    if (M.a >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void X1(MediaFormat paramMediaFormat, int paramInt)
  {
    paramMediaFormat.setFeatureEnabled("tunneled-playback", true);
    paramMediaFormat.setInteger("audio-session-id", paramInt);
  }
  
  public static boolean Y1()
  {
    return "NVIDIA".equals(M.c);
  }
  
  public static boolean a2()
  {
    int i = M.a;
    int j = 7;
    String str1;
    if (i <= 28)
    {
      str1 = M.b;
      str1.hashCode();
      switch (str1.hashCode())
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
                  do
                  {
                    do
                    {
                      k = -1;
                      break;
                    } while (!str1.equals("machuca"));
                    k = 7;
                    break;
                  } while (!str1.equals("once"));
                  k = 6;
                  break;
                } while (!str1.equals("magnolia"));
                k = 5;
                break;
              } while (!str1.equals("aquaman"));
              k = 4;
              break;
            } while (!str1.equals("oneday"));
            k = 3;
            break;
          } while (!str1.equals("dangalUHD"));
          k = 2;
          break;
        } while (!str1.equals("dangalFHD"));
        k = 1;
        break;
      } while (!str1.equals("dangal"));
      k = 0;
      switch (k)
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
        return true;
      }
    }
    if ((i <= 27) && ("HWEML".equals(M.b))) {
      return true;
    }
    String str2 = M.d;
    str2.hashCode();
    switch (str2.hashCode())
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
                do
                {
                  do
                  {
                    do
                    {
                      k = -1;
                      break;
                    } while (!str2.equals("AFTEUFF014"));
                    k = 8;
                    break;
                  } while (!str2.equals("AFTSO001"));
                  k = 7;
                  break;
                } while (!str2.equals("AFTEU014"));
                k = 6;
                break;
              } while (!str2.equals("AFTEU011"));
              k = 5;
              break;
            } while (!str2.equals("AFTR"));
            k = 4;
            break;
          } while (!str2.equals("AFTN"));
          k = 3;
          break;
        } while (!str2.equals("AFTA"));
        k = 2;
        break;
      } while (!str2.equals("AFTKMST12"));
      k = 1;
      break;
    } while (!str2.equals("AFTJMST12"));
    int k = 0;
    switch (k)
    {
    default: 
      if (i <= 26)
      {
        str1 = M.b;
        str1.hashCode();
        switch (str1.hashCode())
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
                                                                                                                                                                                                                                                                                            do
                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                              k = -1;
                                                                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                                                                            } while (!str1.equals("HWWAS-H"));
                                                                                                                                                                                                                                                                                            k = 139;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                          } while (!str1.equals("HWVNS-H"));
                                                                                                                                                                                                                                                                                          k = 138;
                                                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                                                        } while (!str1.equals("ELUGA_Prim"));
                                                                                                                                                                                                                                                                                        k = 137;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                      } while (!str1.equals("ELUGA_Note"));
                                                                                                                                                                                                                                                                                      k = 136;
                                                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                                                    } while (!str1.equals("ASUS_X00AD_2"));
                                                                                                                                                                                                                                                                                    k = 135;
                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                  } while (!str1.equals("HWCAM-H"));
                                                                                                                                                                                                                                                                                  k = 134;
                                                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                                                } while (!str1.equals("HWBLN-H"));
                                                                                                                                                                                                                                                                                k = 133;
                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                              } while (!str1.equals("DM-01K"));
                                                                                                                                                                                                                                                                              k = 132;
                                                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                                                            } while (!str1.equals("BRAVIA_ATV3_4K"));
                                                                                                                                                                                                                                                                            k = 131;
                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                          } while (!str1.equals("Infinix-X572"));
                                                                                                                                                                                                                                                                          k = 130;
                                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                                        } while (!str1.equals("PB2-670M"));
                                                                                                                                                                                                                                                                        k = 129;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                      } while (!str1.equals("santoni"));
                                                                                                                                                                                                                                                                      k = 128;
                                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                                    } while (!str1.equals("iball8735_9806"));
                                                                                                                                                                                                                                                                    k = 127;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                  } while (!str1.equals("CPH1715"));
                                                                                                                                                                                                                                                                  k = 126;
                                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                                } while (!str1.equals("CPH1609"));
                                                                                                                                                                                                                                                                k = 125;
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                              } while (!str1.equals("woods_f"));
                                                                                                                                                                                                                                                              k = 124;
                                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                                            } while (!str1.equals("htc_e56ml_dtul"));
                                                                                                                                                                                                                                                            k = 123;
                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                          } while (!str1.equals("EverStar_S"));
                                                                                                                                                                                                                                                          k = 122;
                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                        } while (!str1.equals("hwALE-H"));
                                                                                                                                                                                                                                                        k = 121;
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                      } while (!str1.equals("itel_S41"));
                                                                                                                                                                                                                                                      k = 120;
                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                    } while (!str1.equals("LS-5017"));
                                                                                                                                                                                                                                                    k = 119;
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                  } while (!str1.equals("panell_d"));
                                                                                                                                                                                                                                                  k = 118;
                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                } while (!str1.equals("j2xlteins"));
                                                                                                                                                                                                                                                k = 117;
                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                              } while (!str1.equals("A7000plus"));
                                                                                                                                                                                                                                              k = 116;
                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                            } while (!str1.equals("manning"));
                                                                                                                                                                                                                                            k = 115;
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                          } while (!str1.equals("GIONEE_WBL7519"));
                                                                                                                                                                                                                                          k = 114;
                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                        } while (!str1.equals("GIONEE_WBL7365"));
                                                                                                                                                                                                                                        k = 113;
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                      } while (!str1.equals("GIONEE_WBL5708"));
                                                                                                                                                                                                                                      k = 112;
                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                    } while (!str1.equals("QM16XE_U"));
                                                                                                                                                                                                                                    k = 111;
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                  } while (!str1.equals("Pixi5-10_4G"));
                                                                                                                                                                                                                                  k = 110;
                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                } while (!str1.equals("TB3-850M"));
                                                                                                                                                                                                                                k = 109;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                              } while (!str1.equals("TB3-850F"));
                                                                                                                                                                                                                              k = 108;
                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                            } while (!str1.equals("TB3-730X"));
                                                                                                                                                                                                                            k = 107;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                          } while (!str1.equals("TB3-730F"));
                                                                                                                                                                                                                          k = 106;
                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                        } while (!str1.equals("A7020a48"));
                                                                                                                                                                                                                        k = 105;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                      } while (!str1.equals("A7010a48"));
                                                                                                                                                                                                                      k = 104;
                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                    } while (!str1.equals("griffin"));
                                                                                                                                                                                                                    k = 103;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                  } while (!str1.equals("marino_f"));
                                                                                                                                                                                                                  k = 102;
                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                } while (!str1.equals("CPY83_I00"));
                                                                                                                                                                                                                k = 101;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                              } while (!str1.equals("A2016a40"));
                                                                                                                                                                                                              k = 100;
                                                                                                                                                                                                              break;
                                                                                                                                                                                                            } while (!str1.equals("le_x6"));
                                                                                                                                                                                                            k = 99;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                          } while (!str1.equals("l5460"));
                                                                                                                                                                                                          k = 98;
                                                                                                                                                                                                          break;
                                                                                                                                                                                                        } while (!str1.equals("i9031"));
                                                                                                                                                                                                        k = 97;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                      } while (!str1.equals("X3_HK"));
                                                                                                                                                                                                      k = 96;
                                                                                                                                                                                                      break;
                                                                                                                                                                                                    } while (!str1.equals("V23GB"));
                                                                                                                                                                                                    k = 95;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                  } while (!str1.equals("Q4310"));
                                                                                                                                                                                                  k = 94;
                                                                                                                                                                                                  break;
                                                                                                                                                                                                } while (!str1.equals("Q4260"));
                                                                                                                                                                                                k = 93;
                                                                                                                                                                                                break;
                                                                                                                                                                                              } while (!str1.equals("PRO7S"));
                                                                                                                                                                                              k = 92;
                                                                                                                                                                                              break;
                                                                                                                                                                                            } while (!str1.equals("F3311"));
                                                                                                                                                                                            k = 91;
                                                                                                                                                                                            break;
                                                                                                                                                                                          } while (!str1.equals("F3215"));
                                                                                                                                                                                          k = 90;
                                                                                                                                                                                          break;
                                                                                                                                                                                        } while (!str1.equals("F3213"));
                                                                                                                                                                                        k = 89;
                                                                                                                                                                                        break;
                                                                                                                                                                                      } while (!str1.equals("F3211"));
                                                                                                                                                                                      k = 88;
                                                                                                                                                                                      break;
                                                                                                                                                                                    } while (!str1.equals("F3116"));
                                                                                                                                                                                    k = 87;
                                                                                                                                                                                    break;
                                                                                                                                                                                  } while (!str1.equals("F3113"));
                                                                                                                                                                                  k = 86;
                                                                                                                                                                                  break;
                                                                                                                                                                                } while (!str1.equals("F3111"));
                                                                                                                                                                                k = 85;
                                                                                                                                                                                break;
                                                                                                                                                                              } while (!str1.equals("E5643"));
                                                                                                                                                                              k = 84;
                                                                                                                                                                              break;
                                                                                                                                                                            } while (!str1.equals("A1601"));
                                                                                                                                                                            k = 83;
                                                                                                                                                                            break;
                                                                                                                                                                          } while (!str1.equals("Aura_Note_2"));
                                                                                                                                                                          k = 82;
                                                                                                                                                                          break;
                                                                                                                                                                        } while (!str1.equals("602LV"));
                                                                                                                                                                        k = 81;
                                                                                                                                                                        break;
                                                                                                                                                                      } while (!str1.equals("601LV"));
                                                                                                                                                                      k = 80;
                                                                                                                                                                      break;
                                                                                                                                                                    } while (!str1.equals("MEIZU_M5"));
                                                                                                                                                                    k = 79;
                                                                                                                                                                    break;
                                                                                                                                                                  } while (!str1.equals("p212"));
                                                                                                                                                                  k = 78;
                                                                                                                                                                  break;
                                                                                                                                                                } while (!str1.equals("mido"));
                                                                                                                                                                k = 77;
                                                                                                                                                                break;
                                                                                                                                                              } while (!str1.equals("kate"));
                                                                                                                                                              k = 76;
                                                                                                                                                              break;
                                                                                                                                                            } while (!str1.equals("fugu"));
                                                                                                                                                            k = 75;
                                                                                                                                                            break;
                                                                                                                                                          } while (!str1.equals("XE2X"));
                                                                                                                                                          k = 74;
                                                                                                                                                          break;
                                                                                                                                                        } while (!str1.equals("Q427"));
                                                                                                                                                        k = 73;
                                                                                                                                                        break;
                                                                                                                                                      } while (!str1.equals("Q350"));
                                                                                                                                                      k = 72;
                                                                                                                                                      break;
                                                                                                                                                    } while (!str1.equals("P681"));
                                                                                                                                                    k = 71;
                                                                                                                                                    break;
                                                                                                                                                  } while (!str1.equals("F04J"));
                                                                                                                                                  k = 70;
                                                                                                                                                  break;
                                                                                                                                                } while (!str1.equals("F04H"));
                                                                                                                                                k = 69;
                                                                                                                                                break;
                                                                                                                                              } while (!str1.equals("F03H"));
                                                                                                                                              k = 68;
                                                                                                                                              break;
                                                                                                                                            } while (!str1.equals("F02H"));
                                                                                                                                            k = 67;
                                                                                                                                            break;
                                                                                                                                          } while (!str1.equals("F01J"));
                                                                                                                                          k = 66;
                                                                                                                                          break;
                                                                                                                                        } while (!str1.equals("F01H"));
                                                                                                                                        k = 65;
                                                                                                                                        break;
                                                                                                                                      } while (!str1.equals("1714"));
                                                                                                                                      k = 64;
                                                                                                                                      break;
                                                                                                                                    } while (!str1.equals("1713"));
                                                                                                                                    k = 63;
                                                                                                                                    break;
                                                                                                                                  } while (!str1.equals("1601"));
                                                                                                                                  k = 62;
                                                                                                                                  break;
                                                                                                                                } while (!str1.equals("flo"));
                                                                                                                                k = 61;
                                                                                                                                break;
                                                                                                                              } while (!str1.equals("deb"));
                                                                                                                              k = 60;
                                                                                                                              break;
                                                                                                                            } while (!str1.equals("cv3"));
                                                                                                                            k = 59;
                                                                                                                            break;
                                                                                                                          } while (!str1.equals("cv1"));
                                                                                                                          k = 58;
                                                                                                                          break;
                                                                                                                        } while (!str1.equals("Z80"));
                                                                                                                        k = 57;
                                                                                                                        break;
                                                                                                                      } while (!str1.equals("QX1"));
                                                                                                                      k = 56;
                                                                                                                      break;
                                                                                                                    } while (!str1.equals("PLE"));
                                                                                                                    k = 55;
                                                                                                                    break;
                                                                                                                  } while (!str1.equals("P85"));
                                                                                                                  k = 54;
                                                                                                                  break;
                                                                                                                } while (!str1.equals("MX6"));
                                                                                                                k = 53;
                                                                                                                break;
                                                                                                              } while (!str1.equals("M5c"));
                                                                                                              k = 52;
                                                                                                              break;
                                                                                                            } while (!str1.equals("M04"));
                                                                                                            k = 51;
                                                                                                            break;
                                                                                                          } while (!str1.equals("JGZ"));
                                                                                                          k = 50;
                                                                                                          break;
                                                                                                        } while (!str1.equals("mh"));
                                                                                                        k = 49;
                                                                                                        break;
                                                                                                      } while (!str1.equals("b5"));
                                                                                                      k = 48;
                                                                                                      break;
                                                                                                    } while (!str1.equals("V5"));
                                                                                                    k = 47;
                                                                                                    break;
                                                                                                  } while (!str1.equals("V1"));
                                                                                                  k = 46;
                                                                                                  break;
                                                                                                } while (!str1.equals("Q5"));
                                                                                                k = 45;
                                                                                                break;
                                                                                              } while (!str1.equals("C1"));
                                                                                              k = 44;
                                                                                              break;
                                                                                            } while (!str1.equals("woods_fn"));
                                                                                            k = 43;
                                                                                            break;
                                                                                          } while (!str1.equals("ELUGA_A3_Pro"));
                                                                                          k = 42;
                                                                                          break;
                                                                                        } while (!str1.equals("Z12_PRO"));
                                                                                        k = 41;
                                                                                        break;
                                                                                      } while (!str1.equals("BLACK-1X"));
                                                                                      k = 40;
                                                                                      break;
                                                                                    } while (!str1.equals("taido_row"));
                                                                                    k = 39;
                                                                                    break;
                                                                                  } while (!str1.equals("Pixi4-7_3G"));
                                                                                  k = 38;
                                                                                  break;
                                                                                } while (!str1.equals("GIONEE_GBL7360"));
                                                                                k = 37;
                                                                                break;
                                                                              } while (!str1.equals("GiONEE_CBL7513"));
                                                                              k = 36;
                                                                              break;
                                                                            } while (!str1.equals("OnePlus5T"));
                                                                            k = 35;
                                                                            break;
                                                                          } while (!str1.equals("whyred"));
                                                                          k = 34;
                                                                          break;
                                                                        } while (!str1.equals("watson"));
                                                                        k = 33;
                                                                        break;
                                                                      } while (!str1.equals("SVP-DTV15"));
                                                                      k = 32;
                                                                      break;
                                                                    } while (!str1.equals("A7000-a"));
                                                                    k = 31;
                                                                    break;
                                                                  } while (!str1.equals("nicklaus_f"));
                                                                  k = 30;
                                                                  break;
                                                                } while (!str1.equals("tcl_eu"));
                                                                k = 29;
                                                                break;
                                                              } while (!str1.equals("ELUGA_Ray_X"));
                                                              k = 28;
                                                              break;
                                                            } while (!str1.equals("s905x018"));
                                                            k = 27;
                                                            break;
                                                          } while (!str1.equals("A10-70L"));
                                                          k = 26;
                                                          break;
                                                        } while (!str1.equals("A10-70F"));
                                                        k = 25;
                                                        break;
                                                      } while (!str1.equals("namath"));
                                                      k = 24;
                                                      break;
                                                    } while (!str1.equals("Slate_Pro"));
                                                    k = 23;
                                                    break;
                                                  } while (!str1.equals("iris60"));
                                                  k = 22;
                                                  break;
                                                } while (!str1.equals("BRAVIA_ATV2"));
                                                k = 21;
                                                break;
                                              } while (!str1.equals("GiONEE_GBL7319"));
                                              k = 20;
                                              break;
                                            } while (!str1.equals("panell_dt"));
                                            k = 19;
                                            break;
                                          } while (!str1.equals("panell_ds"));
                                          k = 18;
                                          break;
                                        } while (!str1.equals("panell_dl"));
                                        k = 17;
                                        break;
                                      } while (!str1.equals("vernee_M5"));
                                      k = 16;
                                      break;
                                    } while (!str1.equals("pacificrim"));
                                    k = 15;
                                    break;
                                  } while (!str1.equals("Phantom6"));
                                  k = 14;
                                  break;
                                } while (!str1.equals("ComioS1"));
                                k = 13;
                                break;
                              } while (!str1.equals("XT1663"));
                              k = 12;
                              break;
                            } while (!str1.equals("RAIJIN"));
                            k = 11;
                            break;
                          } while (!str1.equals("AquaPowerM"));
                          k = 10;
                          break;
                        } while (!str1.equals("PGN611"));
                        k = 9;
                        break;
                      } while (!str1.equals("PGN610"));
                      k = 8;
                      break;
                      k = j;
                      if (str1.equals("PGN528")) {
                        break;
                      }
                    } while ((goto 1792) || (!str1.equals("NX573J")));
                    k = 6;
                    break;
                  } while (!str1.equals("NX541J"));
                  k = 5;
                  break;
                } while (!str1.equals("CP8676_I02"));
                k = 4;
                break;
              } while (!str1.equals("K50a40"));
              k = 3;
              break;
            } while (!str1.equals("GIONEE_SWW1631"));
            k = 2;
            break;
          } while (!str1.equals("GIONEE_SWW1627"));
          k = 1;
          break;
        } while (!str1.equals("GIONEE_SWW1609"));
        k = 0;
        switch (k)
        {
        default: 
          str2.hashCode();
          if (!str2.equals("JSN-L21")) {
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
          return true;
        }
      }
      return false;
    }
    return true;
  }
  
  public static int c2(t0.p paramp, d0.q paramq)
  {
    int i = t;
    int j = u;
    if ((i != -1) && (j != -1))
    {
      String str = (String)a.e(n);
      boolean bool = "video/dolby-vision".equals(str);
      int k = 1;
      if (bool)
      {
        paramq = I.r(paramq);
        if (paramq != null)
        {
          int m = ((Integer)first).intValue();
          if ((m == 512) || (m == 1) || (m == 2))
          {
            str = "video/avc";
            break label107;
          }
        }
        str = "video/hevc";
      }
      label107:
      str.hashCode();
      switch (str.hashCode())
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
                  k = -1;
                  break;
                } while (!str.equals("video/x-vnd.on2.vp9"));
                k = 6;
                break;
              } while (!str.equals("video/x-vnd.on2.vp8"));
              k = 5;
              break;
            } while (!str.equals("video/avc"));
            k = 4;
            break;
          } while (!str.equals("video/mp4v-es"));
          k = 3;
          break;
        } while (!str.equals("video/hevc"));
        k = 2;
        break;
        if (str.equals("video/av01")) {
          break;
        }
      } while ((goto 184) || (!str.equals("video/3gpp")));
      k = 0;
      switch (k)
      {
      default: 
        return -1;
      case 6: 
        return h2(i * j, 4);
      case 4: 
        paramq = M.d;
        if ((!"BRAVIA 4K 2015".equals(paramq)) && ((!"Amazon".equals(M.c)) || ((!"KFSOWI".equals(paramq)) && ((!"AFTS".equals(paramq)) || (!g))))) {
          return h2(M.k(i, 16) * M.k(j, 16) * 256, 2);
        }
        return -1;
      case 2: 
        return Math.max(2097152, h2(i * j, 2));
      }
      return h2(i * j, 2);
    }
    return -1;
  }
  
  public static Point d2(t0.p paramp, d0.q paramq)
  {
    int i = u;
    int j = t;
    int k = 0;
    int m;
    if (i > j) {
      m = 1;
    } else {
      m = 0;
    }
    int n;
    if (m != 0) {
      n = i;
    } else {
      n = j;
    }
    if (m != 0) {
      i = j;
    }
    float f2 = i / n;
    int[] arrayOfInt = C1;
    int i2 = arrayOfInt.length;
    j = k;
    for (;;)
    {
      int i3;
      if (j < i2)
      {
        k = arrayOfInt[j];
        i3 = (int)(k * f2);
        if ((k > n) && (i3 > i)) {
          if (M.a >= 21)
          {
            int i4;
            if (m != 0) {
              i4 = i3;
            } else {
              i4 = k;
            }
            if (m == 0) {
              k = i3;
            }
            Point localPoint = paramp.b(i4, k);
            float f3 = v;
            if ((localPoint == null) || (!paramp.u(x, y, f3))) {
              break label263;
            }
            return localPoint;
          }
        }
      }
      try
      {
        k = M.k(k, 16) * 16;
        i3 = M.k(i3, 16) * 16;
        if (k * i3 <= I.P())
        {
          if (m != 0) {
            n = i3;
          } else {
            n = k;
          }
          if (m == 0) {
            k = i3;
          }
          paramp = new Point(n, k);
          return paramp;
        }
        label263:
        j++;
      }
      catch (I.c paramp)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  public static List f2(Context paramContext, t0.z paramz, d0.q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = n;
    if (str == null) {
      return v.Y();
    }
    if ((M.a >= 26) && ("video/dolby-vision".equals(str)) && (!b.a(paramContext)))
    {
      paramContext = I.n(paramz, paramq, paramBoolean1, paramBoolean2);
      if (!paramContext.isEmpty()) {
        return paramContext;
      }
    }
    return I.v(paramz, paramq, paramBoolean1, paramBoolean2);
  }
  
  public static int g2(t0.p paramp, d0.q paramq)
  {
    if (o != -1)
    {
      int i = q.size();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        k += ((byte[])q.get(j)).length;
        j++;
      }
      return o + k;
    }
    return c2(paramp, paramq);
  }
  
  public static int h2(int paramInt1, int paramInt2)
  {
    return paramInt1 * 3 / (paramInt2 * 2);
  }
  
  public final void A2(t0.m paramm, int paramInt, long paramLong1, long paramLong2)
  {
    if (M.a >= 21) {
      B2(paramm, paramInt, paramLong1, paramLong2);
    } else {
      z2(paramm, paramInt, paramLong1);
    }
  }
  
  public void B2(t0.m paramm, int paramInt, long paramLong1, long paramLong2)
  {
    g0.F.a("releaseOutputBuffer");
    paramm.m(paramInt, paramLong2);
    g0.F.b();
    paramm = Q0;
    e += 1;
    q1 = 0;
    if (g1 == null)
    {
      n2(v1);
      l2();
    }
  }
  
  public final void D2(Object paramObject)
  {
    if ((paramObject instanceof Surface)) {
      paramObject = (Surface)paramObject;
    } else {
      paramObject = null;
    }
    Object localObject = paramObject;
    if (paramObject == null)
    {
      localObject = k1;
      if (localObject == null)
      {
        t0.p localp = H0();
        localObject = paramObject;
        if (localp != null)
        {
          localObject = paramObject;
          if (K2(localp))
          {
            localObject = o.c(V0, g);
            k1 = ((o)localObject);
          }
        }
      }
    }
    if (j1 != localObject)
    {
      j1 = ((Surface)localObject);
      if (g1 == null) {
        b1.q((Surface)localObject);
      }
      m1 = false;
      int i = getState();
      paramObject = F0();
      if ((paramObject != null) && (g1 == null)) {
        if ((M.a >= 23) && (localObject != null) && (!e1))
        {
          E2((t0.m)paramObject, (Surface)localObject);
        }
        else
        {
          w1();
          f1();
        }
      }
      if ((localObject != null) && (localObject != k1))
      {
        q2();
        if (i == 2) {
          b1.e(true);
        }
      }
      else
      {
        w1 = null;
        paramObject = g1;
        if (paramObject != null) {
          ((F)paramObject).v();
        }
      }
      s2();
    }
    else if ((localObject != null) && (localObject != k1))
    {
      q2();
      p2();
    }
  }
  
  public void E2(t0.m paramm, Surface paramSurface)
  {
    paramm.j(paramSurface);
  }
  
  public void F2(List paramList)
  {
    i1 = paramList;
    F localF = g1;
    if (localF != null) {
      localF.C(paramList);
    }
  }
  
  public int G0(i parami)
  {
    if ((M.a >= 34) && (y1) && (t < P())) {
      return 32;
    }
    return 0;
  }
  
  public boolean G2(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if ((paramLong1 < -500000L) && (!paramBoolean)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public boolean H2(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if ((paramLong1 < -30000L) && (!paramBoolean)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public void I(float paramFloat1, float paramFloat2)
  {
    super.I(paramFloat1, paramFloat2);
    F localF = g1;
    if (localF != null) {
      localF.u(paramFloat1);
    } else {
      b1.r(paramFloat1);
    }
  }
  
  public boolean I0()
  {
    boolean bool;
    if ((y1) && (M.a < 23)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean I1(t0.p paramp)
  {
    boolean bool;
    if ((j1 == null) && (!K2(paramp))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean I2(long paramLong1, long paramLong2)
  {
    boolean bool;
    if ((paramLong1 < -30000L) && (paramLong2 > 100000L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public float J0(float paramFloat, d0.q paramq, d0.q[] paramArrayOfq)
  {
    int i = paramArrayOfq.length;
    float f2 = -1.0F;
    int j = 0;
    float f5;
    for (float f3 = -1.0F; j < i; f3 = f5)
    {
      float f4 = v;
      f5 = f3;
      if (f4 != -1.0F) {
        f5 = Math.max(f3, f4);
      }
      j++;
    }
    if (f3 == -1.0F) {
      paramFloat = f2;
    } else {
      paramFloat = f3 * paramFloat;
    }
    return paramFloat;
  }
  
  public boolean J2()
  {
    return true;
  }
  
  public final boolean K2(t0.p paramp)
  {
    boolean bool;
    if ((M.a >= 23) && (!y1) && (!W1(a)) && ((!g) || (o.b(V0)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public List L0(t0.z paramz, d0.q paramq, boolean paramBoolean)
  {
    return I.w(f2(V0, paramz, paramq, paramBoolean, y1), paramq);
  }
  
  public int L1(t0.z paramz, d0.q paramq)
  {
    boolean bool1 = d0.z.s(n);
    int i = 0;
    if (!bool1) {
      return Z0.a(0);
    }
    if (r != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject1 = f2(V0, paramz, paramq, bool1, false);
    Object localObject2 = localObject1;
    if (bool1)
    {
      localObject2 = localObject1;
      if (((List)localObject1).isEmpty()) {
        localObject2 = f2(V0, paramz, paramq, false, false);
      }
    }
    if (((List)localObject2).isEmpty()) {
      return Z0.a(1);
    }
    if (!w.M1(paramq)) {
      return Z0.a(2);
    }
    localObject1 = (t0.p)((List)localObject2).get(0);
    boolean bool2 = ((t0.p)localObject1).m(paramq);
    if (!bool2) {
      for (j = 1; j < ((List)localObject2).size(); j++)
      {
        t0.p localp = (t0.p)((List)localObject2).get(j);
        if (localp.m(paramq))
        {
          j = 0;
          bool2 = true;
          localObject2 = localp;
          break label199;
        }
      }
    }
    int j = 1;
    localObject2 = localObject1;
    label199:
    int k;
    if (bool2) {
      k = 4;
    } else {
      k = 3;
    }
    int m;
    if (((t0.p)localObject2).p(paramq)) {
      m = 16;
    } else {
      m = 8;
    }
    int n;
    if (h) {
      n = 64;
    } else {
      n = 0;
    }
    if (j != 0) {
      j = 128;
    } else {
      j = 0;
    }
    int i2 = j;
    if (M.a >= 26)
    {
      i2 = j;
      if ("video/dolby-vision".equals(n))
      {
        i2 = j;
        if (!b.a(V0)) {
          i2 = 256;
        }
      }
    }
    j = i;
    if (bool2)
    {
      paramz = f2(V0, paramz, paramq, bool1, true);
      j = i;
      if (!paramz.isEmpty())
      {
        paramz = (t0.p)I.w(paramz, paramq).get(0);
        j = i;
        if (paramz.m(paramq))
        {
          j = i;
          if (paramz.p(paramq)) {
            j = 32;
          }
        }
      }
    }
    return Z0.c(k, m, j, n, i2);
  }
  
  public void L2(t0.m paramm, int paramInt, long paramLong)
  {
    g0.F.a("skipVideoBuffer");
    paramm.f(paramInt, false);
    g0.F.b();
    paramm = Q0;
    f += 1;
  }
  
  public void N2(int paramInt1, int paramInt2)
  {
    k0.o localo = Q0;
    h += paramInt1;
    paramInt1 += paramInt2;
    g += paramInt1;
    p1 += paramInt1;
    paramInt1 = q1 + paramInt1;
    q1 = paramInt1;
    i = Math.max(paramInt1, i);
    paramInt1 = Z0;
    if ((paramInt1 > 0) && (p1 >= paramInt1)) {
      k2();
    }
  }
  
  public m.a O0(t0.p paramp, d0.q paramq, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    Object localObject1 = k1;
    if ((localObject1 != null) && (o != g)) {
      y2();
    }
    Object localObject2 = c;
    localObject1 = e2(paramp, paramq, R());
    d1 = ((c)localObject1);
    boolean bool = a1;
    if (y1) {}
    for (int i = z1;; i = 0) {
      break;
    }
    localObject2 = i2(paramq, (String)localObject2, (c)localObject1, paramFloat, bool, i);
    if (j1 == null) {
      if (K2(paramp))
      {
        if (k1 == null) {
          k1 = o.c(V0, g);
        }
        j1 = k1;
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    r2((MediaFormat)localObject2);
    localObject1 = g1;
    if (localObject1 != null) {
      localObject1 = ((F)localObject1).x();
    } else {
      localObject1 = j1;
    }
    return m.a.b(paramp, (MediaFormat)localObject2, paramq, (Surface)localObject1, paramMediaCrypto);
  }
  
  public void O2(long paramLong)
  {
    Q0.a(paramLong);
    s1 += paramLong;
    t1 += 1;
  }
  
  public void T()
  {
    w1 = null;
    F localF = g1;
    if (localF != null) {
      localF.L();
    } else {
      b1.g();
    }
    s2();
    m1 = false;
    A1 = null;
    try
    {
      super.T();
      return;
    }
    finally
    {
      Y0.m(Q0);
      Y0.D(P.e);
    }
  }
  
  public void T0(i parami)
  {
    if (!f1) {
      return;
    }
    ByteBuffer localByteBuffer = (ByteBuffer)a.e(u);
    if (localByteBuffer.remaining() >= 7)
    {
      int i = localByteBuffer.get();
      int j = localByteBuffer.getShort();
      int k = localByteBuffer.getShort();
      int m = localByteBuffer.get();
      int n = localByteBuffer.get();
      localByteBuffer.position(0);
      if ((i == -75) && (j == 60) && (k == 1) && (m == 4) && ((n == 0) || (n == 1)))
      {
        parami = new byte[localByteBuffer.remaining()];
        localByteBuffer.get(parami);
        localByteBuffer.position(0);
        C2((t0.m)a.e(F0()), parami);
      }
    }
  }
  
  public void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.U(paramBoolean1, paramBoolean2);
    boolean bool = Mb;
    if ((bool) && (z1 == 0)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    a.f(paramBoolean1);
    if (y1 != bool)
    {
      y1 = bool;
      w1();
    }
    Y0.o(Q0);
    if (!h1)
    {
      if (((i1 != null) || (!X0)) && (g1 == null))
      {
        localObject = W0;
        if (localObject == null) {
          localObject = new d.b(V0, b1).f(L()).e();
        }
        g1 = ((G)localObject).b();
      }
      h1 = true;
    }
    Object localObject = g1;
    if (localObject != null)
    {
      ((F)localObject).F(new a(), f.a());
      localObject = B1;
      if (localObject != null) {
        g1.z((p)localObject);
      }
      if ((j1 != null) && (!l1.equals(A.c))) {
        g1.I(j1, l1);
      }
      g1.u(R0());
      localObject = i1;
      if (localObject != null) {
        g1.C((List)localObject);
      }
      g1.K(paramBoolean2);
    }
    else
    {
      b1.o(L());
      b1.h(paramBoolean2);
    }
  }
  
  public void V()
  {
    super.V();
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    F localF = g1;
    if (localF != null)
    {
      localF.A(true);
      g1.D(P0(), b2());
    }
    super.W(paramLong, paramBoolean);
    if (g1 == null) {
      b1.m();
    }
    if (paramBoolean) {
      b1.e(false);
    }
    s2();
    q1 = 0;
  }
  
  public boolean W1(String paramString)
  {
    if (paramString.startsWith("OMX.google")) {
      return false;
    }
    try
    {
      if (!D1)
      {
        E1 = a2();
        D1 = true;
      }
    }
    finally
    {
      break label45;
    }
    return E1;
    label45:
    throw paramString;
  }
  
  public void X()
  {
    super.X();
    F localF = g1;
    if ((localF != null) && (X0)) {
      localF.release();
    }
  }
  
  public void Z()
  {
    try
    {
      super.Z();
      return;
    }
    finally
    {
      h1 = false;
      if (k1 != null) {
        y2();
      }
    }
  }
  
  public void Z1(t0.m paramm, int paramInt, long paramLong)
  {
    g0.F.a("dropVideoBuffer");
    paramm.f(paramInt, false);
    g0.F.b();
    N2(0, 1);
  }
  
  public void a0()
  {
    super.a0();
    p1 = 0;
    o1 = L().b();
    s1 = 0L;
    t1 = 0;
    F localF = g1;
    if (localF != null) {
      localF.y();
    } else {
      b1.k();
    }
  }
  
  public void b0()
  {
    k2();
    m2();
    F localF = g1;
    if (localF != null) {
      localF.B();
    } else {
      b1.l();
    }
    super.b0();
  }
  
  public long b2()
  {
    return 0L;
  }
  
  public boolean c()
  {
    if (super.c())
    {
      F localF = g1;
      if ((localF == null) || (localF.c())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public String d()
  {
    return "MediaCodecVideoRenderer";
  }
  
  public boolean e()
  {
    Object localObject;
    if (super.e())
    {
      localObject = g1;
      if ((localObject == null) || (((F)localObject).e()))
      {
        bool = true;
        break label32;
      }
    }
    boolean bool = false;
    label32:
    if (bool)
    {
      localObject = k1;
      if (((localObject != null) && (j1 == localObject)) || (F0() == null) || (y1)) {
        return true;
      }
    }
    return b1.d(bool);
  }
  
  public c e2(t0.p paramp, d0.q paramq, d0.q[] paramArrayOfq)
  {
    int i = t;
    int j = u;
    int k = g2(paramp, paramq);
    if (paramArrayOfq.length == 1)
    {
      m = k;
      if (k != -1)
      {
        n = c2(paramp, paramq);
        m = k;
        if (n != -1) {
          m = Math.min((int)(k * 1.5F), n);
        }
      }
      return new c(i, j, m);
    }
    int i2 = paramArrayOfq.length;
    int i3 = 0;
    int n = i3;
    int m = j;
    while (i3 < i2)
    {
      d0.q localq1 = paramArrayOfq[i3];
      d0.q localq2 = localq1;
      if (A != null)
      {
        localq2 = localq1;
        if (A == null) {
          localq2 = localq1.a().P(A).K();
        }
      }
      int i4 = i;
      int i5 = m;
      i6 = k;
      j = n;
      if (ed != 0)
      {
        i6 = t;
        if ((i6 != -1) && (u != -1)) {
          j = 0;
        } else {
          j = 1;
        }
        j = n | j;
        i4 = Math.max(i, i6);
        i5 = Math.max(m, u);
        i6 = Math.max(k, g2(paramp, localq2));
      }
      i3++;
      i = i4;
      m = i5;
      k = i6;
      n = j;
    }
    int i6 = i;
    j = m;
    i3 = k;
    if (n != 0)
    {
      paramArrayOfq = new StringBuilder();
      paramArrayOfq.append("Resolutions unknown. Codec max resolution: ");
      paramArrayOfq.append(i);
      paramArrayOfq.append("x");
      paramArrayOfq.append(m);
      g0.o.h("MediaCodecVideoRenderer", paramArrayOfq.toString());
      paramArrayOfq = d2(paramp, paramq);
      i6 = i;
      j = m;
      i3 = k;
      if (paramArrayOfq != null)
      {
        i6 = Math.max(i, x);
        j = Math.max(m, y);
        i3 = Math.max(k, c2(paramp, paramq.a().v0(i6).Y(j).K()));
        paramp = new StringBuilder();
        paramp.append("Codec max resolution adjusted to: ");
        paramp.append(i6);
        paramp.append("x");
        paramp.append(j);
        g0.o.h("MediaCodecVideoRenderer", paramp.toString());
      }
    }
    return new c(i6, j, i3);
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    super.f(paramLong1, paramLong2);
    F localF = g1;
    if (localF != null) {
      try
      {
        localF.f(paramLong1, paramLong2);
      }
      catch (F.b localb)
      {
        throw J(localb, o, 7001);
      }
    }
  }
  
  public void h1(Exception paramException)
  {
    g0.o.d("MediaCodecVideoRenderer", "Video codec error", paramException);
    Y0.C(paramException);
  }
  
  public void i1(String paramString, m.a parama, long paramLong1, long paramLong2)
  {
    Y0.k(paramString, paramLong1, paramLong2);
    e1 = W1(paramString);
    f1 = ((t0.p)a.e(H0())).n();
    s2();
  }
  
  public MediaFormat i2(d0.q paramq, String paramString, c paramc, float paramFloat, boolean paramBoolean, int paramInt)
  {
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", paramString);
    localMediaFormat.setInteger("width", t);
    localMediaFormat.setInteger("height", u);
    r.e(localMediaFormat, q);
    r.c(localMediaFormat, "frame-rate", v);
    r.d(localMediaFormat, "rotation-degrees", w);
    r.b(localMediaFormat, A);
    if ("video/dolby-vision".equals(n))
    {
      paramq = I.r(paramq);
      if (paramq != null) {
        r.d(localMediaFormat, "profile", ((Integer)first).intValue());
      }
    }
    localMediaFormat.setInteger("max-width", a);
    localMediaFormat.setInteger("max-height", b);
    r.d(localMediaFormat, "max-input-size", c);
    int i = M.a;
    if (i >= 23)
    {
      localMediaFormat.setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        localMediaFormat.setFloat("operating-rate", paramFloat);
      }
    }
    if (paramBoolean)
    {
      localMediaFormat.setInteger("no-post-process", 1);
      localMediaFormat.setInteger("auto-frc", 0);
    }
    if (paramInt != 0) {
      X1(localMediaFormat, paramInt);
    }
    if (i >= 35) {
      localMediaFormat.setInteger("importance", Math.max(0, -x1));
    }
    return localMediaFormat;
  }
  
  public void j()
  {
    F localF = g1;
    if (localF != null) {
      localF.j();
    } else {
      b1.a();
    }
  }
  
  public void j1(String paramString)
  {
    Y0.l(paramString);
  }
  
  public boolean j2(long paramLong, boolean paramBoolean)
  {
    int i = g0(paramLong);
    if (i == 0) {
      return false;
    }
    if (paramBoolean)
    {
      localObject = Q0;
      d += i;
      f += r1;
    }
    else
    {
      localObject = Q0;
      j += 1;
      N2(i, r1);
    }
    C0();
    Object localObject = g1;
    if (localObject != null) {
      ((F)localObject).A(false);
    }
    return true;
  }
  
  public k0.p k0(t0.p paramp, d0.q paramq1, d0.q paramq2)
  {
    k0.p localp = paramp.e(paramq1, paramq2);
    int i = e;
    c localc = (c)a.e(d1);
    if (t <= a)
    {
      j = i;
      if (u <= b) {}
    }
    else
    {
      j = i | 0x100;
    }
    i = j;
    if (g2(paramp, paramq2) > c) {
      i = j | 0x40;
    }
    paramp = a;
    if (i != 0) {}
    for (int j = 0;; j = d) {
      break;
    }
    return new k0.p(paramp, paramq1, paramq2, j, i);
  }
  
  public k0.p k1(v0 paramv0)
  {
    k0.p localp = super.k1(paramv0);
    Y0.p((d0.q)a.e(b), localp);
    return localp;
  }
  
  public final void k2()
  {
    if (p1 > 0)
    {
      long l2 = L().b();
      long l3 = o1;
      Y0.n(p1, l2 - l3);
      p1 = 0;
      o1 = l2;
    }
  }
  
  public void l1(d0.q paramq, MediaFormat paramMediaFormat)
  {
    t0.m localm = F0();
    if (localm != null) {
      localm.g(n1);
    }
    boolean bool = y1;
    int i = 0;
    int j;
    int k;
    int m;
    if (bool)
    {
      j = t;
      k = u;
    }
    else
    {
      a.e(paramMediaFormat);
      if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top"))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        k = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
      } else {
        k = paramMediaFormat.getInteger("width");
      }
      if (j != 0) {
        j = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
      } else {
        j = paramMediaFormat.getInteger("height");
      }
      m = j;
      j = k;
      k = m;
    }
    float f2 = x;
    int i2;
    float f3;
    int i3;
    if (V1())
    {
      int n = w;
      if (n != 90)
      {
        m = k;
        i2 = i;
        f3 = f2;
        i3 = j;
        if (n != 270) {}
      }
      else
      {
        f3 = 1.0F / f2;
        m = j;
        i2 = i;
        i3 = k;
      }
    }
    else
    {
      m = k;
      i2 = i;
      f3 = f2;
      i3 = j;
      if (g1 == null)
      {
        i2 = w;
        i3 = j;
        f3 = f2;
        m = k;
      }
    }
    v1 = new P(i3, m, i2, f3);
    if (g1 != null)
    {
      x2();
      g1.G(1, paramq.a().v0(i3).Y(m).n0(i2).k0(f3).K());
    }
    else
    {
      b1.p(v);
    }
  }
  
  public final void l2()
  {
    if ((b1.i()) && (j1 != null)) {
      u2();
    }
  }
  
  public boolean m(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    return H2(paramLong1, paramLong2, paramBoolean);
  }
  
  public final void m2()
  {
    int i = t1;
    if (i != 0)
    {
      Y0.B(s1, i);
      s1 = 0L;
      t1 = 0;
    }
  }
  
  public boolean n(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((G2(paramLong1, paramLong3, paramBoolean1)) && (j2(paramLong2, paramBoolean2))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    return paramBoolean1;
  }
  
  public void n1(long paramLong)
  {
    super.n1(paramLong);
    if (!y1) {
      r1 -= 1;
    }
  }
  
  public final void n2(P paramP)
  {
    if ((!paramP.equals(P.e)) && (!paramP.equals(w1)))
    {
      w1 = paramP;
      Y0.D(paramP);
    }
  }
  
  public void o1()
  {
    super.o1();
    F localF = g1;
    if (localF != null) {
      localF.D(P0(), b2());
    } else {
      b1.j();
    }
    s2();
  }
  
  public final boolean o2(t0.m paramm, int paramInt, long paramLong, d0.q paramq)
  {
    long l2 = c1.g();
    long l3 = c1.f();
    if (M.a >= 21)
    {
      if ((J2()) && (l2 == u1))
      {
        L2(paramm, paramInt, paramLong);
      }
      else
      {
        t2(paramLong, l2, paramq);
        B2(paramm, paramInt, paramLong, l2);
      }
      O2(l3);
      u1 = l2;
      return true;
    }
    if (l3 < 30000L)
    {
      if (l3 > 11000L) {
        try
        {
          Thread.sleep((l3 - 10000L) / 1000L);
        }
        catch (InterruptedException paramm)
        {
          Thread.currentThread().interrupt();
          return false;
        }
      }
      t2(paramLong, l2, paramq);
      z2(paramm, paramInt, paramLong);
      O2(l3);
      return true;
    }
    return false;
  }
  
  public void p1(i parami)
  {
    boolean bool = y1;
    if (!bool) {
      r1 += 1;
    }
    if ((M.a < 23) && (bool)) {
      v2(t);
    }
  }
  
  public final void p2()
  {
    Surface localSurface = j1;
    if ((localSurface != null) && (m1)) {
      Y0.A(localSurface);
    }
  }
  
  public void q1(d0.q paramq)
  {
    F localF = g1;
    if ((localF != null) && (!localF.J())) {
      try
      {
        g1.H(paramq);
      }
      catch (F.b localb)
      {
        throw J(localb, paramq, 7000);
      }
    }
  }
  
  public final void q2()
  {
    P localP = w1;
    if (localP != null) {
      Y0.D(localP);
    }
  }
  
  public final void r2(MediaFormat paramMediaFormat)
  {
    F localF = g1;
    if ((localF != null) && (!localF.E())) {
      paramMediaFormat.setInteger("allow-frame-drop", 0);
    }
  }
  
  public boolean s1(long paramLong1, long paramLong2, t0.m paramm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, d0.q paramq)
  {
    a.e(paramm);
    long l = paramLong3 - P0();
    paramInt2 = b1.c(paramLong3, paramLong1, paramLong2, Q0(), paramBoolean2, c1);
    if (paramInt2 == 4) {
      return false;
    }
    if ((paramBoolean1) && (!paramBoolean2))
    {
      L2(paramm, paramInt1, l);
      return true;
    }
    if ((j1 == k1) && (g1 == null))
    {
      if (c1.f() < 30000L)
      {
        L2(paramm, paramInt1, l);
        O2(c1.f());
        return true;
      }
      return false;
    }
    paramByteBuffer = g1;
    if (paramByteBuffer != null) {
      try
      {
        paramByteBuffer.f(paramLong1, paramLong2);
        paramLong1 = g1.w(paramLong3 + b2(), paramBoolean2);
        if (paramLong1 == -9223372036854775807L) {
          return false;
        }
        A2(paramm, paramInt1, l, paramLong1);
        return true;
      }
      catch (F.b paramm)
      {
        throw J(paramm, o, 7001);
      }
    }
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 != 2)
        {
          if (paramInt2 != 3)
          {
            if (paramInt2 == 5) {
              return false;
            }
            throw new IllegalStateException(String.valueOf(paramInt2));
          }
          L2(paramm, paramInt1, l);
          O2(c1.f());
          return true;
        }
        Z1(paramm, paramInt1, l);
        O2(c1.f());
        return true;
      }
      return o2((t0.m)a.h(paramm), paramInt1, l, paramq);
    }
    paramLong1 = L().c();
    t2(l, paramLong1, paramq);
    A2(paramm, paramInt1, l, paramLong1);
    O2(c1.f());
    return true;
  }
  
  public final void s2()
  {
    if (y1)
    {
      int i = M.a;
      if (i >= 23)
      {
        t0.m localm = F0();
        if (localm == null) {
          return;
        }
        A1 = new d(localm);
        if (i >= 33)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("tunnel-peek", 1);
          localm.c(localBundle);
        }
      }
    }
  }
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt != 1)
    {
      Object localObject;
      if (paramInt != 7)
      {
        if (paramInt != 10)
        {
          if (paramInt != 16)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5)
              {
                if (paramInt != 13)
                {
                  if (paramInt != 14)
                  {
                    super.t(paramInt, paramObject);
                  }
                  else
                  {
                    localObject = (A)a.e(paramObject);
                    if ((((A)localObject).b() != 0) && (((A)localObject).a() != 0))
                    {
                      l1 = ((A)localObject);
                      paramObject = g1;
                      if (paramObject != null) {
                        ((F)paramObject).I((Surface)a.h(j1), (A)localObject);
                      }
                    }
                  }
                }
                else {
                  F2((List)a.e(paramObject));
                }
              }
              else {
                b1.n(((Integer)a.e(paramObject)).intValue());
              }
            }
            else
            {
              n1 = ((Integer)a.e(paramObject)).intValue();
              paramObject = F0();
              if (paramObject != null) {
                ((t0.m)paramObject).g(n1);
              }
            }
          }
          else
          {
            x1 = ((Integer)a.e(paramObject)).intValue();
            M2();
          }
        }
        else
        {
          paramInt = ((Integer)a.e(paramObject)).intValue();
          if (z1 != paramInt)
          {
            z1 = paramInt;
            if (y1) {
              w1();
            }
          }
        }
      }
      else
      {
        localObject = (p)a.e(paramObject);
        B1 = ((p)localObject);
        paramObject = g1;
        if (paramObject != null) {
          ((F)paramObject).z((p)localObject);
        }
      }
    }
    else
    {
      D2(paramObject);
    }
  }
  
  public t0.o t0(Throwable paramThrowable, t0.p paramp)
  {
    return new j(paramThrowable, paramp, j1);
  }
  
  public final void t2(long paramLong1, long paramLong2, d0.q paramq)
  {
    p localp = B1;
    if (localp != null) {
      localp.k(paramLong1, paramLong2, paramq, K0());
    }
  }
  
  public final void u2()
  {
    Y0.A(j1);
    m1 = true;
  }
  
  public void v2(long paramLong)
  {
    P1(paramLong);
    n2(v1);
    k0.o localo = Q0;
    e += 1;
    l2();
    n1(paramLong);
  }
  
  public final void w2()
  {
    E1();
  }
  
  public void x2() {}
  
  public boolean y(long paramLong1, long paramLong2)
  {
    return I2(paramLong1, paramLong2);
  }
  
  public void y1()
  {
    super.y1();
    r1 = 0;
  }
  
  public final void y2()
  {
    Surface localSurface = j1;
    o localo = k1;
    if (localSurface == localo) {
      j1 = null;
    }
    if (localo != null)
    {
      localo.release();
      k1 = null;
    }
  }
  
  public void z2(t0.m paramm, int paramInt, long paramLong)
  {
    g0.F.a("releaseOutputBuffer");
    paramm.f(paramInt, true);
    g0.F.b();
    paramm = Q0;
    e += 1;
    q1 = 0;
    if (g1 == null)
    {
      n2(v1);
      l2();
    }
  }
  
  public class a
    implements F.a
  {
    public a() {}
    
    public void a(F paramF)
    {
      a.h(k.Q1(k.this));
      k.R1(k.this);
    }
    
    public void b(F paramF)
    {
      N2(0, 1);
    }
    
    public void c(F paramF, P paramP) {}
  }
  
  public static final abstract class b
  {
    public static boolean a(Context paramContext)
    {
      paramContext = (DisplayManager)paramContext.getSystemService("display");
      boolean bool1 = false;
      if (paramContext != null) {
        paramContext = paramContext.getDisplay(0);
      } else {
        paramContext = null;
      }
      boolean bool2 = bool1;
      if (paramContext != null)
      {
        bool2 = bool1;
        if (l.a(paramContext))
        {
          paramContext = n.a(m.a(paramContext));
          int i = paramContext.length;
          for (int j = 0;; j++)
          {
            bool2 = bool1;
            if (j >= i) {
              break;
            }
            if (paramContext[j] == 1)
            {
              bool2 = true;
              break;
            }
          }
        }
      }
      return bool2;
    }
  }
  
  public static final class c
  {
    public final int a;
    public final int b;
    public final int c;
    
    public c(int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
    }
  }
  
  public final class d
    implements m.d, Handler.Callback
  {
    public final Handler o;
    
    public d(t0.m paramm)
    {
      this$1 = M.B(this);
      o = k.this;
      paramm.o(this, k.this);
    }
    
    public void a(t0.m paramm, long paramLong1, long paramLong2)
    {
      if (M.a < 30)
      {
        paramm = Message.obtain(o, 0, (int)(paramLong1 >> 32), (int)paramLong1);
        o.sendMessageAtFrontOfQueue(paramm);
      }
      else
      {
        b(paramLong1);
      }
    }
    
    public final void b(long paramLong)
    {
      k localk = k.this;
      if ((this == A1) && (k.S1(localk) != null)) {
        if (paramLong == Long.MAX_VALUE) {
          k.T1(k.this);
        } else {
          try
          {
            v2(paramLong);
          }
          catch (u localu)
          {
            k.U1(k.this, localu);
          }
        }
      }
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      if (what != 0) {
        return false;
      }
      b(M.g1(arg1, arg2));
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     D0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */