package w5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Display.HdrCapabilities;
import android.view.Surface;
import com.google.android.gms.internal.base.a;
import g.q;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o4.j.a;
import o4.j.c;
import o4.m.c;
import o4.p.b;
import o7.l0;
import o7.t;
import o7.t.a;
import p2.m0;
import v3.d0.b;
import v3.i0;
import v3.i0.a;
import v3.l1;
import v3.x0;
import v5.e0;
import x0.q0;
import z4.c0;

public final class g
  extends o4.m
{
  public static final int[] u1 = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  public static boolean v1;
  public static boolean w1;
  public final Context K0;
  public final j L0;
  public final n.a M0;
  public final long N0 = 5000L;
  public final int O0 = 50;
  public final boolean P0;
  public b Q0;
  public boolean R0;
  public boolean S0;
  public Surface T0;
  public h U0;
  public boolean V0;
  public int W0;
  public boolean X0;
  public boolean Y0;
  public boolean Z0;
  public long a1;
  public long b1;
  public long c1;
  public int d1;
  public int e1;
  public int f1;
  public long g1;
  public long h1;
  public long i1;
  public int j1;
  public long k1;
  public int l1;
  public int m1;
  public int n1;
  public float o1;
  public o p1;
  public boolean q1;
  public int r1;
  public c s1;
  public i t1;
  
  public g(Context paramContext, o4.h paramh, Handler paramHandler, d0.b paramb)
  {
    super(2, paramh, 30.0F);
    paramContext = paramContext.getApplicationContext();
    K0 = paramContext;
    L0 = new j(paramContext);
    M0 = new n.a(paramHandler, paramb);
    P0 = "NVIDIA".equals(e0.c);
    b1 = -9223372036854775807L;
    l1 = -1;
    m1 = -1;
    o1 = -1.0F;
    W0 = 1;
    r1 = 0;
    p1 = null;
  }
  
  public static boolean B0(String paramString)
  {
    if (paramString.startsWith("OMX.google")) {
      return false;
    }
    try
    {
      if (!v1)
      {
        w1 = C0();
        v1 = true;
      }
      return w1;
    }
    finally {}
  }
  
  public static boolean C0()
  {
    int i = e0.a;
    int j = 28;
    if (i <= 28)
    {
      str1 = e0.b;
      str1.getClass();
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
    if ((i <= 27) && ("HWEML".equals(e0.b))) {
      return true;
    }
    String str1 = e0.d;
    str1.getClass();
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
                      k = -1;
                      break;
                    } while (!str1.equals("AFTEUFF014"));
                    k = 8;
                    break;
                  } while (!str1.equals("AFTSO001"));
                  k = 7;
                  break;
                } while (!str1.equals("AFTEU014"));
                k = 6;
                break;
              } while (!str1.equals("AFTEU011"));
              k = 5;
              break;
            } while (!str1.equals("AFTR"));
            k = 4;
            break;
          } while (!str1.equals("AFTN"));
          k = 3;
          break;
        } while (!str1.equals("AFTA"));
        k = 2;
        break;
      } while (!str1.equals("AFTKMST12"));
      k = 1;
      break;
    } while (!str1.equals("AFTJMST12"));
    int k = 0;
    switch (k)
    {
    default: 
      if (i <= 26)
      {
        String str2 = e0.b;
        str2.getClass();
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
                                                                                                                                                                                                                                                                                            } while (!str2.equals("HWWAS-H"));
                                                                                                                                                                                                                                                                                            k = 139;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                          } while (!str2.equals("HWVNS-H"));
                                                                                                                                                                                                                                                                                          k = 138;
                                                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                                                        } while (!str2.equals("ELUGA_Prim"));
                                                                                                                                                                                                                                                                                        k = 137;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                      } while (!str2.equals("ELUGA_Note"));
                                                                                                                                                                                                                                                                                      k = 136;
                                                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                                                    } while (!str2.equals("ASUS_X00AD_2"));
                                                                                                                                                                                                                                                                                    k = 135;
                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                  } while (!str2.equals("HWCAM-H"));
                                                                                                                                                                                                                                                                                  k = 134;
                                                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                                                } while (!str2.equals("HWBLN-H"));
                                                                                                                                                                                                                                                                                k = 133;
                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                              } while (!str2.equals("DM-01K"));
                                                                                                                                                                                                                                                                              k = 132;
                                                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                                                            } while (!str2.equals("BRAVIA_ATV3_4K"));
                                                                                                                                                                                                                                                                            k = 131;
                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                          } while (!str2.equals("Infinix-X572"));
                                                                                                                                                                                                                                                                          k = 130;
                                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                                        } while (!str2.equals("PB2-670M"));
                                                                                                                                                                                                                                                                        k = 129;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                      } while (!str2.equals("santoni"));
                                                                                                                                                                                                                                                                      k = 128;
                                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                                    } while (!str2.equals("iball8735_9806"));
                                                                                                                                                                                                                                                                    k = 127;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                  } while (!str2.equals("CPH1715"));
                                                                                                                                                                                                                                                                  k = 126;
                                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                                } while (!str2.equals("CPH1609"));
                                                                                                                                                                                                                                                                k = 125;
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                              } while (!str2.equals("woods_f"));
                                                                                                                                                                                                                                                              k = 124;
                                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                                            } while (!str2.equals("htc_e56ml_dtul"));
                                                                                                                                                                                                                                                            k = 123;
                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                          } while (!str2.equals("EverStar_S"));
                                                                                                                                                                                                                                                          k = 122;
                                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                                        } while (!str2.equals("hwALE-H"));
                                                                                                                                                                                                                                                        k = 121;
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                      } while (!str2.equals("itel_S41"));
                                                                                                                                                                                                                                                      k = 120;
                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                    } while (!str2.equals("LS-5017"));
                                                                                                                                                                                                                                                    k = 119;
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                  } while (!str2.equals("panell_d"));
                                                                                                                                                                                                                                                  k = 118;
                                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                                } while (!str2.equals("j2xlteins"));
                                                                                                                                                                                                                                                k = 117;
                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                              } while (!str2.equals("A7000plus"));
                                                                                                                                                                                                                                              k = 116;
                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                            } while (!str2.equals("manning"));
                                                                                                                                                                                                                                            k = 115;
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                          } while (!str2.equals("GIONEE_WBL7519"));
                                                                                                                                                                                                                                          k = 114;
                                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                                        } while (!str2.equals("GIONEE_WBL7365"));
                                                                                                                                                                                                                                        k = 113;
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                      } while (!str2.equals("GIONEE_WBL5708"));
                                                                                                                                                                                                                                      k = 112;
                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                    } while (!str2.equals("QM16XE_U"));
                                                                                                                                                                                                                                    k = 111;
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                  } while (!str2.equals("Pixi5-10_4G"));
                                                                                                                                                                                                                                  k = 110;
                                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                                } while (!str2.equals("TB3-850M"));
                                                                                                                                                                                                                                k = 109;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                              } while (!str2.equals("TB3-850F"));
                                                                                                                                                                                                                              k = 108;
                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                            } while (!str2.equals("TB3-730X"));
                                                                                                                                                                                                                            k = 107;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                          } while (!str2.equals("TB3-730F"));
                                                                                                                                                                                                                          k = 106;
                                                                                                                                                                                                                          break;
                                                                                                                                                                                                                        } while (!str2.equals("A7020a48"));
                                                                                                                                                                                                                        k = 105;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                      } while (!str2.equals("A7010a48"));
                                                                                                                                                                                                                      k = 104;
                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                    } while (!str2.equals("griffin"));
                                                                                                                                                                                                                    k = 103;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                  } while (!str2.equals("marino_f"));
                                                                                                                                                                                                                  k = 102;
                                                                                                                                                                                                                  break;
                                                                                                                                                                                                                } while (!str2.equals("CPY83_I00"));
                                                                                                                                                                                                                k = 101;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                              } while (!str2.equals("A2016a40"));
                                                                                                                                                                                                              k = 100;
                                                                                                                                                                                                              break;
                                                                                                                                                                                                            } while (!str2.equals("le_x6"));
                                                                                                                                                                                                            k = 99;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                          } while (!str2.equals("l5460"));
                                                                                                                                                                                                          k = 98;
                                                                                                                                                                                                          break;
                                                                                                                                                                                                        } while (!str2.equals("i9031"));
                                                                                                                                                                                                        k = 97;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                      } while (!str2.equals("X3_HK"));
                                                                                                                                                                                                      k = 96;
                                                                                                                                                                                                      break;
                                                                                                                                                                                                    } while (!str2.equals("V23GB"));
                                                                                                                                                                                                    k = 95;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                  } while (!str2.equals("Q4310"));
                                                                                                                                                                                                  k = 94;
                                                                                                                                                                                                  break;
                                                                                                                                                                                                } while (!str2.equals("Q4260"));
                                                                                                                                                                                                k = 93;
                                                                                                                                                                                                break;
                                                                                                                                                                                              } while (!str2.equals("PRO7S"));
                                                                                                                                                                                              k = 92;
                                                                                                                                                                                              break;
                                                                                                                                                                                            } while (!str2.equals("F3311"));
                                                                                                                                                                                            k = 91;
                                                                                                                                                                                            break;
                                                                                                                                                                                          } while (!str2.equals("F3215"));
                                                                                                                                                                                          k = 90;
                                                                                                                                                                                          break;
                                                                                                                                                                                        } while (!str2.equals("F3213"));
                                                                                                                                                                                        k = 89;
                                                                                                                                                                                        break;
                                                                                                                                                                                      } while (!str2.equals("F3211"));
                                                                                                                                                                                      k = 88;
                                                                                                                                                                                      break;
                                                                                                                                                                                    } while (!str2.equals("F3116"));
                                                                                                                                                                                    k = 87;
                                                                                                                                                                                    break;
                                                                                                                                                                                  } while (!str2.equals("F3113"));
                                                                                                                                                                                  k = 86;
                                                                                                                                                                                  break;
                                                                                                                                                                                } while (!str2.equals("F3111"));
                                                                                                                                                                                k = 85;
                                                                                                                                                                                break;
                                                                                                                                                                              } while (!str2.equals("E5643"));
                                                                                                                                                                              k = 84;
                                                                                                                                                                              break;
                                                                                                                                                                            } while (!str2.equals("A1601"));
                                                                                                                                                                            k = 83;
                                                                                                                                                                            break;
                                                                                                                                                                          } while (!str2.equals("Aura_Note_2"));
                                                                                                                                                                          k = 82;
                                                                                                                                                                          break;
                                                                                                                                                                        } while (!str2.equals("602LV"));
                                                                                                                                                                        k = 81;
                                                                                                                                                                        break;
                                                                                                                                                                      } while (!str2.equals("601LV"));
                                                                                                                                                                      k = 80;
                                                                                                                                                                      break;
                                                                                                                                                                    } while (!str2.equals("MEIZU_M5"));
                                                                                                                                                                    k = 79;
                                                                                                                                                                    break;
                                                                                                                                                                  } while (!str2.equals("p212"));
                                                                                                                                                                  k = 78;
                                                                                                                                                                  break;
                                                                                                                                                                } while (!str2.equals("mido"));
                                                                                                                                                                k = 77;
                                                                                                                                                                break;
                                                                                                                                                              } while (!str2.equals("kate"));
                                                                                                                                                              k = 76;
                                                                                                                                                              break;
                                                                                                                                                            } while (!str2.equals("fugu"));
                                                                                                                                                            k = 75;
                                                                                                                                                            break;
                                                                                                                                                          } while (!str2.equals("XE2X"));
                                                                                                                                                          k = 74;
                                                                                                                                                          break;
                                                                                                                                                        } while (!str2.equals("Q427"));
                                                                                                                                                        k = 73;
                                                                                                                                                        break;
                                                                                                                                                      } while (!str2.equals("Q350"));
                                                                                                                                                      k = 72;
                                                                                                                                                      break;
                                                                                                                                                    } while (!str2.equals("P681"));
                                                                                                                                                    k = 71;
                                                                                                                                                    break;
                                                                                                                                                  } while (!str2.equals("F04J"));
                                                                                                                                                  k = 70;
                                                                                                                                                  break;
                                                                                                                                                } while (!str2.equals("F04H"));
                                                                                                                                                k = 69;
                                                                                                                                                break;
                                                                                                                                              } while (!str2.equals("F03H"));
                                                                                                                                              k = 68;
                                                                                                                                              break;
                                                                                                                                            } while (!str2.equals("F02H"));
                                                                                                                                            k = 67;
                                                                                                                                            break;
                                                                                                                                          } while (!str2.equals("F01J"));
                                                                                                                                          k = 66;
                                                                                                                                          break;
                                                                                                                                        } while (!str2.equals("F01H"));
                                                                                                                                        k = 65;
                                                                                                                                        break;
                                                                                                                                      } while (!str2.equals("1714"));
                                                                                                                                      k = 64;
                                                                                                                                      break;
                                                                                                                                    } while (!str2.equals("1713"));
                                                                                                                                    k = 63;
                                                                                                                                    break;
                                                                                                                                  } while (!str2.equals("1601"));
                                                                                                                                  k = 62;
                                                                                                                                  break;
                                                                                                                                } while (!str2.equals("flo"));
                                                                                                                                k = 61;
                                                                                                                                break;
                                                                                                                              } while (!str2.equals("deb"));
                                                                                                                              k = 60;
                                                                                                                              break;
                                                                                                                            } while (!str2.equals("cv3"));
                                                                                                                            k = 59;
                                                                                                                            break;
                                                                                                                          } while (!str2.equals("cv1"));
                                                                                                                          k = 58;
                                                                                                                          break;
                                                                                                                        } while (!str2.equals("Z80"));
                                                                                                                        k = 57;
                                                                                                                        break;
                                                                                                                      } while (!str2.equals("QX1"));
                                                                                                                      k = 56;
                                                                                                                      break;
                                                                                                                    } while (!str2.equals("PLE"));
                                                                                                                    k = 55;
                                                                                                                    break;
                                                                                                                  } while (!str2.equals("P85"));
                                                                                                                  k = 54;
                                                                                                                  break;
                                                                                                                } while (!str2.equals("MX6"));
                                                                                                                k = 53;
                                                                                                                break;
                                                                                                              } while (!str2.equals("M5c"));
                                                                                                              k = 52;
                                                                                                              break;
                                                                                                            } while (!str2.equals("M04"));
                                                                                                            k = 51;
                                                                                                            break;
                                                                                                          } while (!str2.equals("JGZ"));
                                                                                                          k = 50;
                                                                                                          break;
                                                                                                        } while (!str2.equals("mh"));
                                                                                                        k = 49;
                                                                                                        break;
                                                                                                      } while (!str2.equals("b5"));
                                                                                                      k = 48;
                                                                                                      break;
                                                                                                    } while (!str2.equals("V5"));
                                                                                                    k = 47;
                                                                                                    break;
                                                                                                  } while (!str2.equals("V1"));
                                                                                                  k = 46;
                                                                                                  break;
                                                                                                } while (!str2.equals("Q5"));
                                                                                                k = 45;
                                                                                                break;
                                                                                              } while (!str2.equals("C1"));
                                                                                              k = 44;
                                                                                              break;
                                                                                            } while (!str2.equals("woods_fn"));
                                                                                            k = 43;
                                                                                            break;
                                                                                          } while (!str2.equals("ELUGA_A3_Pro"));
                                                                                          k = 42;
                                                                                          break;
                                                                                        } while (!str2.equals("Z12_PRO"));
                                                                                        k = 41;
                                                                                        break;
                                                                                      } while (!str2.equals("BLACK-1X"));
                                                                                      k = 40;
                                                                                      break;
                                                                                    } while (!str2.equals("taido_row"));
                                                                                    k = 39;
                                                                                    break;
                                                                                  } while (!str2.equals("Pixi4-7_3G"));
                                                                                  k = 38;
                                                                                  break;
                                                                                } while (!str2.equals("GIONEE_GBL7360"));
                                                                                k = 37;
                                                                                break;
                                                                              } while (!str2.equals("GiONEE_CBL7513"));
                                                                              k = 36;
                                                                              break;
                                                                            } while (!str2.equals("OnePlus5T"));
                                                                            k = 35;
                                                                            break;
                                                                          } while (!str2.equals("whyred"));
                                                                          k = 34;
                                                                          break;
                                                                        } while (!str2.equals("watson"));
                                                                        k = 33;
                                                                        break;
                                                                      } while (!str2.equals("SVP-DTV15"));
                                                                      k = 32;
                                                                      break;
                                                                    } while (!str2.equals("A7000-a"));
                                                                    k = 31;
                                                                    break;
                                                                  } while (!str2.equals("nicklaus_f"));
                                                                  k = 30;
                                                                  break;
                                                                } while (!str2.equals("tcl_eu"));
                                                                k = 29;
                                                                break;
                                                                k = j;
                                                                if (str2.equals("ELUGA_Ray_X")) {
                                                                  break;
                                                                }
                                                              } while ((goto 1768) || (!str2.equals("s905x018")));
                                                              k = 27;
                                                              break;
                                                            } while (!str2.equals("A10-70L"));
                                                            k = 26;
                                                            break;
                                                          } while (!str2.equals("A10-70F"));
                                                          k = 25;
                                                          break;
                                                        } while (!str2.equals("namath"));
                                                        k = 24;
                                                        break;
                                                      } while (!str2.equals("Slate_Pro"));
                                                      k = 23;
                                                      break;
                                                    } while (!str2.equals("iris60"));
                                                    k = 22;
                                                    break;
                                                  } while (!str2.equals("BRAVIA_ATV2"));
                                                  k = 21;
                                                  break;
                                                } while (!str2.equals("GiONEE_GBL7319"));
                                                k = 20;
                                                break;
                                              } while (!str2.equals("panell_dt"));
                                              k = 19;
                                              break;
                                            } while (!str2.equals("panell_ds"));
                                            k = 18;
                                            break;
                                          } while (!str2.equals("panell_dl"));
                                          k = 17;
                                          break;
                                        } while (!str2.equals("vernee_M5"));
                                        k = 16;
                                        break;
                                      } while (!str2.equals("pacificrim"));
                                      k = 15;
                                      break;
                                    } while (!str2.equals("Phantom6"));
                                    k = 14;
                                    break;
                                  } while (!str2.equals("ComioS1"));
                                  k = 13;
                                  break;
                                } while (!str2.equals("XT1663"));
                                k = 12;
                                break;
                              } while (!str2.equals("RAIJIN"));
                              k = 11;
                              break;
                            } while (!str2.equals("AquaPowerM"));
                            k = 10;
                            break;
                          } while (!str2.equals("PGN611"));
                          k = 9;
                          break;
                        } while (!str2.equals("PGN610"));
                        k = 8;
                        break;
                      } while (!str2.equals("PGN528"));
                      k = 7;
                      break;
                    } while (!str2.equals("NX573J"));
                    k = 6;
                    break;
                  } while (!str2.equals("NX541J"));
                  k = 5;
                  break;
                } while (!str2.equals("CP8676_I02"));
                k = 4;
                break;
              } while (!str2.equals("K50a40"));
              k = 3;
              break;
            } while (!str2.equals("GIONEE_SWW1631"));
            k = 2;
            break;
          } while (!str2.equals("GIONEE_SWW1627"));
          k = 1;
          break;
        } while (!str2.equals("GIONEE_SWW1609"));
        k = 0;
        switch (k)
        {
        default: 
          str1.getClass();
          if (!str1.equals("JSN-L21")) {
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
  
  public static int D0(i0 parami0, o4.l paraml)
  {
    int i = y;
    int j = z;
    if ((i != -1) && (j != -1))
    {
      String str = t;
      boolean bool = "video/dolby-vision".equals(str);
      int k = 2;
      if (bool)
      {
        parami0 = o4.p.d(parami0);
        if (parami0 != null)
        {
          int m = ((Integer)first).intValue();
          if ((m == 512) || (m == 1) || (m == 2))
          {
            str = "video/avc";
            break label101;
          }
        }
        str = "video/hevc";
      }
      label101:
      str.getClass();
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
          if (str.equals("video/hevc")) {
            break;
          }
        } while ((goto 180) || (!str.equals("video/av01")));
        k = 1;
        break;
      } while (!str.equals("video/3gpp"));
      k = 0;
      switch (k)
      {
      default: 
        return -1;
      case 6: 
        return i * j * 3 / 8;
      case 4: 
        parami0 = e0.d;
        if ((!"BRAVIA 4K 2015".equals(parami0)) && ((!"Amazon".equals(e0.c)) || ((!"KFSOWI".equals(parami0)) && ((!"AFTS".equals(parami0)) || (!f)))))
        {
          k = (i + 16 - 1) / 16;
          return (j + 16 - 1) / 16 * k * 16 * 16 * 3 / 4;
        }
        return -1;
      case 2: 
        return Math.max(2097152, i * j * 3 / 4);
      }
      return i * j * 3 / 4;
    }
    return -1;
  }
  
  public static t E0(Context paramContext, o4.n paramn, i0 parami0, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = t;
    if (localObject == null)
    {
      paramContext = t.b;
      return l0.e;
    }
    localObject = paramn.a((String)localObject, paramBoolean1, paramBoolean2);
    String str = o4.p.b(parami0);
    if (str == null) {
      return t.p((Collection)localObject);
    }
    paramn = paramn.a(str, paramBoolean1, paramBoolean2);
    if ((e0.a >= 26) && ("video/dolby-vision".equals(t)) && (!paramn.isEmpty()) && (!a.a(paramContext))) {
      return t.p(paramn);
    }
    paramContext = t.b;
    paramContext = new t.a();
    paramContext.d((List)localObject);
    paramContext.d(paramn);
    return paramContext.e();
  }
  
  public static int F0(i0 parami0, o4.l paraml)
  {
    if (u != -1)
    {
      int i = v.size();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        k += ((byte[])v.get(j)).length;
        j++;
      }
      return u + k;
    }
    return D0(parami0, paraml);
  }
  
  public final void A0()
  {
    X0 = false;
    if ((e0.a >= 23) && (q1))
    {
      o4.j localj = O;
      if (localj != null) {
        s1 = new c(localj);
      }
    }
  }
  
  public final void B()
  {
    p1 = null;
    A0();
    V0 = false;
    s1 = null;
    try
    {
      super.B();
      z3.e locale;
      return;
    }
    finally
    {
      Object localObject3 = M0;
      Object localObject1 = F0;
      localObject3.getClass();
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new q0(6, localObject3, localObject1));
      }
    }
  }
  
  public final void C(boolean paramBoolean1, boolean paramBoolean2)
  {
    F0 = new z3.e();
    Object localObject = c;
    localObject.getClass();
    boolean bool = a;
    if ((bool) && (r1 == 0)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    x6.b.H(paramBoolean1);
    if (q1 != bool)
    {
      q1 = bool;
      o0();
    }
    localObject = M0;
    z3.e locale = F0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new w.g(13, localObject, locale));
    }
    Y0 = paramBoolean2;
    Z0 = false;
  }
  
  public final void D(long paramLong, boolean paramBoolean)
  {
    super.D(paramLong, paramBoolean);
    A0();
    j localj = L0;
    m = 0L;
    p = -1L;
    n = -1L;
    paramLong = -9223372036854775807L;
    g1 = -9223372036854775807L;
    a1 = -9223372036854775807L;
    e1 = 0;
    if (paramBoolean)
    {
      if (N0 > 0L) {
        paramLong = SystemClock.elapsedRealtime() + N0;
      }
      b1 = paramLong;
    }
    else
    {
      b1 = -9223372036854775807L;
    }
  }
  
  /* Error */
  public final void E()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 712	o4/m:M	()V
    //   4: aload_0
    //   5: invokevirtual 675	o4/m:o0	()V
    //   8: aload_0
    //   9: getfield 715	o4/m:I	La4/e;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull +6 -> 20
    //   17: goto +10 -> 27
    //   20: aload_1
    //   21: aconst_null
    //   22: invokeinterface 720 2 0
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 715	o4/m:I	La4/e;
    //   32: aload_0
    //   33: getfield 722	w5/g:U0	Lw5/h;
    //   36: astore_1
    //   37: aload_1
    //   38: ifnull +25 -> 63
    //   41: aload_0
    //   42: getfield 724	w5/g:T0	Landroid/view/Surface;
    //   45: aload_1
    //   46: if_acmpne +8 -> 54
    //   49: aload_0
    //   50: aconst_null
    //   51: putfield 724	w5/g:T0	Landroid/view/Surface;
    //   54: aload_1
    //   55: invokevirtual 729	w5/h:release	()V
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 722	w5/g:U0	Lw5/h;
    //   63: return
    //   64: astore_1
    //   65: goto +27 -> 92
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 715	o4/m:I	La4/e;
    //   73: astore_2
    //   74: aload_2
    //   75: ifnull +10 -> 85
    //   78: aload_2
    //   79: aconst_null
    //   80: invokeinterface 720 2 0
    //   85: aload_0
    //   86: aconst_null
    //   87: putfield 715	o4/m:I	La4/e;
    //   90: aload_1
    //   91: athrow
    //   92: aload_0
    //   93: getfield 722	w5/g:U0	Lw5/h;
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +25 -> 123
    //   101: aload_0
    //   102: getfield 724	w5/g:T0	Landroid/view/Surface;
    //   105: aload_2
    //   106: if_acmpne +8 -> 114
    //   109: aload_0
    //   110: aconst_null
    //   111: putfield 724	w5/g:T0	Landroid/view/Surface;
    //   114: aload_2
    //   115: invokevirtual 729	w5/h:release	()V
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield 722	w5/g:U0	Lw5/h;
    //   123: aload_1
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	g
    //   12	43	1	localObject1	Object
    //   64	1	1	localObject2	Object
    //   68	56	1	localObject3	Object
    //   73	42	2	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	64	finally
    //   20	27	64	finally
    //   27	32	64	finally
    //   69	74	64	finally
    //   78	85	64	finally
    //   85	92	64	finally
    //   0	8	68	finally
  }
  
  public final void F()
  {
    d1 = 0;
    c1 = SystemClock.elapsedRealtime();
    h1 = (SystemClock.elapsedRealtime() * 1000L);
    i1 = 0L;
    j1 = 0;
    j localj = L0;
    d = true;
    m = 0L;
    p = -1L;
    n = -1L;
    if (b != null)
    {
      j.e locale = c;
      locale.getClass();
      b.sendEmptyMessage(1);
      b.b(new io.flutter.plugins.firebase.auth.g(localj, 11));
    }
    localj.c(false);
  }
  
  public final void G()
  {
    b1 = -9223372036854775807L;
    G0();
    int i = j1;
    if (i != 0)
    {
      localObject1 = M0;
      long l = i1;
      localObject2 = a;
      if (localObject2 != null) {
        ((Handler)localObject2).post(new k((n.a)localObject1, l, i));
      }
      i1 = 0L;
      j1 = 0;
    }
    Object localObject2 = L0;
    d = false;
    Object localObject1 = b;
    if (localObject1 != null)
    {
      ((j.b)localObject1).a();
      localObject1 = c;
      localObject1.getClass();
      b.sendEmptyMessage(2);
    }
    ((j)localObject2).a();
  }
  
  public final void G0()
  {
    if (d1 > 0)
    {
      long l2 = SystemClock.elapsedRealtime();
      long l3 = c1;
      n.a locala = M0;
      int i = d1;
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new k(locala, i, l2 - l3));
      }
      d1 = 0;
      c1 = l2;
    }
  }
  
  public final void H0()
  {
    Z0 = true;
    if (!X0)
    {
      X0 = true;
      n.a locala = M0;
      Surface localSurface = T0;
      if (a != null)
      {
        long l = SystemClock.elapsedRealtime();
        a.post(new l(locala, localSurface, l));
      }
      V0 = true;
    }
  }
  
  public final void I0()
  {
    int i = l1;
    if ((i != -1) || (m1 != -1))
    {
      o localo = p1;
      if ((localo == null) || (a != i) || (b != m1) || (c != n1) || (d != o1))
      {
        int j = l1;
        i = m1;
        int k = n1;
        localo = new o(o1, j, i, k);
        p1 = localo;
        n.a locala = M0;
        Handler localHandler = a;
        if (localHandler != null) {
          localHandler.post(new x0.f(12, locala, localo));
        }
      }
    }
  }
  
  public final void J0(o4.j paramj, int paramInt)
  {
    I0();
    m0.i("releaseOutputBuffer");
    paramj.j(paramInt, true);
    m0.B();
    h1 = (SystemClock.elapsedRealtime() * 1000L);
    paramj = F0;
    e += 1;
    e1 = 0;
    H0();
  }
  
  public final z3.i K(o4.l paraml, i0 parami01, i0 parami02)
  {
    z3.i locali = paraml.b(parami01, parami02);
    int i = e;
    int j = y;
    b localb = Q0;
    if (j <= a)
    {
      j = i;
      if (z <= b) {}
    }
    else
    {
      j = i | 0x100;
    }
    i = j;
    if (F0(parami02, paraml) > Q0.c) {
      i = j | 0x40;
    }
    paraml = a;
    if (i != 0) {
      j = 0;
    } else {
      j = d;
    }
    return new z3.i(paraml, parami01, parami02, j, i);
  }
  
  public final void K0(o4.j paramj, int paramInt, long paramLong)
  {
    I0();
    m0.i("releaseOutputBuffer");
    paramj.e(paramInt, paramLong);
    m0.B();
    h1 = (SystemClock.elapsedRealtime() * 1000L);
    paramj = F0;
    e += 1;
    e1 = 0;
    H0();
  }
  
  public final o4.k L(IllegalStateException paramIllegalStateException, o4.l paraml)
  {
    return new f(paramIllegalStateException, paraml, T0);
  }
  
  public final boolean L0(o4.l paraml)
  {
    int i = e0.a;
    boolean bool1 = true;
    boolean bool2;
    if ((i >= 23) && (!q1) && (!B0(a)))
    {
      bool2 = bool1;
      if (f)
      {
        paraml = K0;
        i = h.d;
        try
        {
          if (!h.e)
          {
            h.d = h.a(paraml);
            h.e = true;
          }
          i = h.d;
          if (i != 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            bool2 = bool1;
          }
        }
        finally {}
      }
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void M0(o4.j paramj, int paramInt)
  {
    m0.i("skipVideoBuffer");
    paramj.j(paramInt, false);
    m0.B();
    paramj = F0;
    f += 1;
  }
  
  public final void N0(int paramInt1, int paramInt2)
  {
    z3.e locale = F0;
    h += paramInt1;
    paramInt1 += paramInt2;
    g += paramInt1;
    d1 += paramInt1;
    paramInt1 = e1 + paramInt1;
    e1 = paramInt1;
    i = Math.max(paramInt1, i);
    paramInt1 = O0;
    if ((paramInt1 > 0) && (d1 >= paramInt1)) {
      G0();
    }
  }
  
  public final void O0(long paramLong)
  {
    z3.e locale = F0;
    k += paramLong;
    l += 1;
    i1 += paramLong;
    j1 += 1;
  }
  
  public final boolean T()
  {
    boolean bool;
    if ((q1) && (e0.a < 23)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final float U(float paramFloat, i0[] paramArrayOfi0)
  {
    int i = paramArrayOfi0.length;
    float f2 = -1.0F;
    int j = 0;
    float f5;
    for (float f3 = -1.0F; j < i; f3 = f5)
    {
      float f4 = A;
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
  
  public final ArrayList V(o4.n paramn, i0 parami0, boolean paramBoolean)
  {
    paramn = E0(K0, paramn, parami0, paramBoolean, q1);
    Pattern localPattern = o4.p.a;
    paramn = new ArrayList(paramn);
    Collections.sort(paramn, new o4.o(new e(parami0, 6), 0));
    return paramn;
  }
  
  public final j.a X(o4.l paraml, i0 parami0, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    Object localObject1 = U0;
    if ((localObject1 != null) && (a != f))
    {
      if (T0 == localObject1) {
        T0 = null;
      }
      ((h)localObject1).release();
      U0 = null;
    }
    Object localObject2 = c;
    i0[] arrayOfi0 = p;
    arrayOfi0.getClass();
    int i = y;
    int j = z;
    int k = F0(parami0, paraml);
    int m;
    int n;
    int i2;
    int i4;
    int i5;
    if (arrayOfi0.length == 1)
    {
      m = k;
      if (k != -1)
      {
        n = D0(parami0, paraml);
        m = k;
        if (n != -1) {
          m = Math.min((int)(k * 1.5F), n);
        }
      }
      localObject1 = new b(i, j, m);
    }
    else
    {
      i2 = arrayOfi0.length;
      i3 = 0;
      n = 0;
      m = j;
      while (i3 < i2)
      {
        localObject3 = arrayOfi0[i3];
        localObject1 = localObject3;
        if (F != null)
        {
          localObject1 = localObject3;
          if (F == null)
          {
            localObject1 = new i0.a((i0)localObject3);
            w = F;
            localObject1 = new i0((i0.a)localObject1);
          }
        }
        i4 = i;
        i5 = m;
        i6 = k;
        j = n;
        if (bd != 0)
        {
          i6 = y;
          if ((i6 != -1) && (z != -1)) {
            j = 0;
          } else {
            j = 1;
          }
          j = n | j;
          i4 = Math.max(i, i6);
          i5 = Math.max(m, z);
          i6 = Math.max(k, F0((i0)localObject1, paraml));
        }
        i3++;
        i = i4;
        m = i5;
        k = i6;
        n = j;
      }
      i6 = i;
      j = m;
      i3 = k;
      if (n != 0)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Resolutions unknown. Codec max resolution: ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(m);
        v5.m.f("MediaCodecVideoRenderer", ((StringBuilder)localObject1).toString());
        n = z;
        i6 = y;
        if (n > i6) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          i3 = n;
        } else {
          i3 = i6;
        }
        if (j != 0) {
          n = i6;
        }
        f2 = n / i3;
        localObject3 = u1;
        i6 = 0;
      }
    }
    for (;;)
    {
      if (i6 < 9)
      {
        i2 = localObject3[i6];
        i4 = (int)(i2 * f2);
        if ((i2 > i3) && (i4 > n)) {
          if (e0.a >= 21)
          {
            if (j != 0) {
              i5 = i4;
            } else {
              i5 = i2;
            }
            if (j == 0) {
              i2 = i4;
            }
            localObject1 = d;
            if (localObject1 != null)
            {
              localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getVideoCapabilities();
              if (localObject1 != null) {}
            }
            else
            {
              localObject1 = null;
              break label658;
            }
            i4 = ((MediaCodecInfo.VideoCapabilities)localObject1).getWidthAlignment();
            int i7 = ((MediaCodecInfo.VideoCapabilities)localObject1).getHeightAlignment();
            localObject1 = new Point((i5 + i4 - 1) / i4 * i4, (i2 + i7 - 1) / i7 * i7);
            label658:
            float f3 = A;
            if (paraml.f(x, y, f3)) {
              break label784;
            }
          }
        }
      }
      try
      {
        i5 = (i2 + 16 - 1) / 16 * 16;
        i4 = (i4 + 16 - 1) / 16 * 16;
        if (i5 * i4 <= o4.p.i())
        {
          if (j != 0) {
            n = i4;
          } else {
            n = i5;
          }
          if (j == 0) {
            i5 = i4;
          }
          localObject1 = new Point(n, i5);
          break label784;
        }
        i6++;
      }
      catch (p.b localb)
      {
        boolean bool;
        for (;;) {}
      }
    }
    localObject1 = null;
    label784:
    int i6 = i;
    j = m;
    int i3 = k;
    if (localObject1 != null)
    {
      i6 = Math.max(i, x);
      j = Math.max(m, y);
      localObject1 = new i0.a(parami0);
      p = i6;
      q = j;
      i3 = Math.max(k, D0(new i0((i0.a)localObject1), paraml));
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Codec max resolution adjusted to: ");
      ((StringBuilder)localObject1).append(i6);
      ((StringBuilder)localObject1).append("x");
      ((StringBuilder)localObject1).append(j);
      v5.m.f("MediaCodecVideoRenderer", ((StringBuilder)localObject1).toString());
    }
    localObject1 = new b(i6, j, i3);
    Q0 = ((b)localObject1);
    bool = P0;
    if (q1) {
      k = r1;
    } else {
      k = 0;
    }
    Object localObject3 = new MediaFormat();
    ((MediaFormat)localObject3).setString("mime", (String)localObject2);
    ((MediaFormat)localObject3).setInteger("width", y);
    ((MediaFormat)localObject3).setInteger("height", z);
    x6.b.q0((MediaFormat)localObject3, v);
    float f2 = A;
    if (f2 != -1.0F) {
      ((MediaFormat)localObject3).setFloat("frame-rate", f2);
    }
    x6.b.h0((MediaFormat)localObject3, "rotation-degrees", B);
    localObject2 = F;
    if (localObject2 != null)
    {
      x6.b.h0((MediaFormat)localObject3, "color-transfer", c);
      x6.b.h0((MediaFormat)localObject3, "color-standard", a);
      x6.b.h0((MediaFormat)localObject3, "color-range", b);
      localObject2 = d;
      if (localObject2 != null) {
        ((MediaFormat)localObject3).setByteBuffer("hdr-static-info", ByteBuffer.wrap((byte[])localObject2));
      }
    }
    if ("video/dolby-vision".equals(t))
    {
      localObject2 = o4.p.d(parami0);
      if (localObject2 != null) {
        x6.b.h0((MediaFormat)localObject3, "profile", ((Integer)first).intValue());
      }
    }
    ((MediaFormat)localObject3).setInteger("max-width", a);
    ((MediaFormat)localObject3).setInteger("max-height", b);
    x6.b.h0((MediaFormat)localObject3, "max-input-size", c);
    if (e0.a >= 23)
    {
      ((MediaFormat)localObject3).setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        ((MediaFormat)localObject3).setFloat("operating-rate", paramFloat);
      }
    }
    if (bool)
    {
      ((MediaFormat)localObject3).setInteger("no-post-process", 1);
      ((MediaFormat)localObject3).setInteger("auto-frc", 0);
    }
    if (k != 0)
    {
      ((MediaFormat)localObject3).setFeatureEnabled("tunneled-playback", true);
      ((MediaFormat)localObject3).setInteger("audio-session-id", k);
    }
    if (T0 == null) {
      if (L0(paraml))
      {
        if (U0 == null) {
          U0 = h.b(K0, f);
        }
        T0 = U0;
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    return new j.a(paraml, (MediaFormat)localObject3, parami0, T0, paramMediaCrypto);
  }
  
  public final void Y(z3.g paramg)
  {
    if (!S0) {
      return;
    }
    Object localObject = f;
    localObject.getClass();
    if (((Buffer)localObject).remaining() >= 7)
    {
      int i = ((ByteBuffer)localObject).get();
      int j = ((ByteBuffer)localObject).getShort();
      int k = ((ByteBuffer)localObject).getShort();
      int m = ((ByteBuffer)localObject).get();
      int n = ((ByteBuffer)localObject).get();
      ((ByteBuffer)localObject).position(0);
      if ((i == -75) && (j == 60) && (k == 1) && (m == 4) && ((n == 0) || (n == 1)))
      {
        paramg = new byte[((Buffer)localObject).remaining()];
        ((ByteBuffer)localObject).get(paramg);
        ((ByteBuffer)localObject).position(0);
        o4.j localj = O;
        localObject = new Bundle();
        ((Bundle)localObject).putByteArray("hdr10-plus-info", paramg);
        localj.d((Bundle)localObject);
      }
    }
  }
  
  public final boolean b()
  {
    if (super.b()) {
      if (!X0)
      {
        h localh = U0;
        if (((localh == null) || (T0 != localh)) && (O != null) && (!q1)) {}
      }
      else
      {
        b1 = -9223372036854775807L;
        return true;
      }
    }
    if (b1 == -9223372036854775807L) {
      return false;
    }
    if (SystemClock.elapsedRealtime() < b1) {
      return true;
    }
    b1 = -9223372036854775807L;
    return false;
  }
  
  public final void c0(Exception paramException)
  {
    v5.m.d("MediaCodecVideoRenderer", "Video codec error", paramException);
    n.a locala = M0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new q(8, locala, paramException));
    }
  }
  
  public final void d0(String paramString, long paramLong1, long paramLong2)
  {
    Object localObject = M0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new m((n.a)localObject, paramString, paramLong1, paramLong2));
    }
    R0 = B0(paramString);
    paramString = V;
    paramString.getClass();
    int i = e0.a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i >= 29)
    {
      bool2 = bool1;
      if ("video/x-vnd.on2.vp9".equals(b))
      {
        paramString = d;
        if (paramString != null)
        {
          localObject = profileLevels;
          paramString = (String)localObject;
          if (localObject != null) {}
        }
        else
        {
          paramString = new MediaCodecInfo.CodecProfileLevel[0];
        }
        int j = paramString.length;
        for (i = 0;; i++)
        {
          bool2 = bool1;
          if (i >= j) {
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
    S0 = bool2;
    if ((e0.a >= 23) && (q1))
    {
      paramString = O;
      paramString.getClass();
      s1 = new c(paramString);
    }
  }
  
  public final void e0(String paramString)
  {
    n.a locala = M0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new q(7, locala, paramString));
    }
  }
  
  public final z3.i f0(l3.l paraml)
  {
    z3.i locali = super.f0(paraml);
    n.a locala = M0;
    i0 locali0 = (i0)b;
    paraml = a;
    if (paraml != null) {
      paraml.post(new x0(locala, locali0, locali, 2));
    }
    return locali;
  }
  
  public final void g0(i0 parami0, MediaFormat paramMediaFormat)
  {
    o4.j localj = O;
    if (localj != null) {
      localj.k(W0);
    }
    int i;
    if (q1)
    {
      l1 = y;
      m1 = z;
    }
    else
    {
      paramMediaFormat.getClass();
      if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top"))) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if (i != 0) {
        j = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
      } else {
        j = paramMediaFormat.getInteger("width");
      }
      l1 = j;
      if (i != 0) {
        i = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
      } else {
        i = paramMediaFormat.getInteger("height");
      }
      m1 = i;
    }
    float f = C;
    o1 = f;
    if (e0.a >= 21)
    {
      i = B;
      if ((i == 90) || (i == 270))
      {
        i = l1;
        l1 = m1;
        m1 = i;
        o1 = (1.0F / f);
      }
    }
    else
    {
      n1 = B;
    }
    paramMediaFormat = L0;
    f = A;
    parami0 = a;
    a.c();
    b.c();
    c = false;
    d = -9223372036854775807L;
    e = 0;
    paramMediaFormat.b();
  }
  
  public final String getName()
  {
    return "MediaCodecVideoRenderer";
  }
  
  public final void i0(long paramLong)
  {
    super.i0(paramLong);
    if (!q1) {
      f1 -= 1;
    }
  }
  
  public final void j0()
  {
    A0();
  }
  
  public final void k0(z3.g paramg)
  {
    boolean bool = q1;
    if (!bool) {
      f1 += 1;
    }
    if ((e0.a < 23) && (bool))
    {
      long l = e;
      z0(l);
      I0();
      paramg = F0;
      e += 1;
      H0();
      i0(l);
    }
  }
  
  public final void m(float paramFloat1, float paramFloat2)
  {
    super.m(paramFloat1, paramFloat2);
    j localj = L0;
    i = paramFloat1;
    m = 0L;
    p = -1L;
    n = -1L;
    localj.c(false);
  }
  
  public final boolean m0(long paramLong1, long paramLong2, o4.j paramj, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, i0 parami0)
  {
    paramj.getClass();
    if (a1 == -9223372036854775807L) {
      a1 = paramLong1;
    }
    Object localObject;
    if (paramLong3 != g1)
    {
      localObject = L0;
      l2 = n;
      if (l2 != -1L)
      {
        p = l2;
        q = o;
      }
      m += 1L;
      paramByteBuffer = a;
      l3 = paramLong3 * 1000L;
      a.b(l3);
      d.a locala;
      if (a.a())
      {
        c = false;
      }
      else if (d != -9223372036854775807L)
      {
        if (c)
        {
          locala = b;
          l2 = d;
          int i;
          if (l2 == 0L) {
            i = 0;
          } else {
            i = g[((int)((l2 - 1L) % 15L))];
          }
          if (i == 0) {}
        }
        else
        {
          b.c();
          b.b(d);
        }
        c = true;
        b.b(l3);
      }
      if ((c) && (b.a()))
      {
        locala = a;
        a = b;
        b = locala;
        c = false;
      }
      d = l3;
      if (a.a()) {
        paramInt2 = 0;
      } else {
        paramInt2 = e + 1;
      }
      e = paramInt2;
      ((j)localObject).b();
      g1 = paramLong3;
    }
    long l4 = G0.b;
    long l5 = paramLong3 - l4;
    if ((paramBoolean1) && (!paramBoolean2))
    {
      M0(paramj, paramInt1);
      return true;
    }
    double d = M;
    if (f == 2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    long l3 = SystemClock.elapsedRealtime() * 1000L;
    long l2 = ((paramLong3 - paramLong1) / d);
    paramLong3 = l2;
    if (paramInt2 != 0) {
      paramLong3 = l2 - (l3 - paramLong2);
    }
    if (T0 == U0)
    {
      if (paramLong3 < -30000L) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if (paramInt2 != 0)
      {
        M0(paramj, paramInt1);
        O0(paramLong3);
        return true;
      }
      return false;
    }
    paramLong2 = h1;
    if (!Z0 ? (paramInt2 != 0) || (Y0) : !X0) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    }
    if ((b1 == -9223372036854775807L) && (paramLong1 >= l4)) {
      if (paramInt3 == 0)
      {
        if (paramInt2 != 0)
        {
          if (paramLong3 < -30000L) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          }
          if ((paramInt3 != 0) && (l3 - paramLong2 > 100000L)) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          }
          if (paramInt3 == 0) {}
        }
      }
      else
      {
        paramInt3 = 1;
        break label612;
      }
    }
    paramInt3 = 0;
    label612:
    if (paramInt3 != 0)
    {
      paramLong1 = System.nanoTime();
      paramByteBuffer = t1;
      if (paramByteBuffer != null) {
        paramByteBuffer.c(l5, paramLong1, parami0, Q);
      }
      if (e0.a >= 21) {
        K0(paramj, paramInt1, paramLong1);
      } else {
        J0(paramj, paramInt1);
      }
      O0(paramLong3);
      return true;
    }
    if ((paramInt2 != 0) && (paramLong1 != a1))
    {
      l3 = System.nanoTime();
      paramLong3 = paramLong3 * 1000L + l3;
      paramByteBuffer = L0;
      if ((p != -1L) && (a.a()))
      {
        localObject = a;
        if (((d)localObject).a())
        {
          localObject = a;
          paramLong2 = e;
          if (paramLong2 == 0L) {
            paramLong2 = 0L;
          } else {
            paramLong2 = f / paramLong2;
          }
        }
        else
        {
          paramLong2 = -9223372036854775807L;
        }
        paramLong2 = q + ((float)((m - p) * paramLong2) / i);
        if (Math.abs(paramLong3 - paramLong2) <= 20000000L) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 == 0)
        {
          m = 0L;
          p = -1L;
          n = -1L;
          paramLong2 = paramLong3;
        }
      }
      else
      {
        paramLong2 = paramLong3;
      }
      n = m;
      o = paramLong2;
      localObject = c;
      if ((localObject != null) && (k != -9223372036854775807L))
      {
        paramLong3 = a;
        if (paramLong3 != -9223372036854775807L)
        {
          l4 = k;
          paramLong3 = (paramLong2 - paramLong3) / l4 * l4 + paramLong3;
          if (paramLong2 <= paramLong3)
          {
            l2 = paramLong3 - l4;
          }
          else
          {
            l2 = paramLong3;
            paramLong3 = l4 + paramLong3;
          }
          if (paramLong3 - paramLong2 >= paramLong2 - l2) {
            paramLong3 = l2;
          }
          paramLong2 = paramLong3 - l;
        }
      }
      paramLong3 = (paramLong2 - l3) / 1000L;
      if (b1 != -9223372036854775807L) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if (paramLong3 < -500000L) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      }
      if ((paramInt3 != 0) && (!paramBoolean2)) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      }
      if (paramInt3 != 0)
      {
        paramByteBuffer = o;
        paramByteBuffer.getClass();
        paramInt3 = paramByteBuffer.m(paramLong1 - q);
        if (paramInt3 == 0)
        {
          paramInt3 = 0;
        }
        else
        {
          paramByteBuffer = F0;
          if (paramInt2 != 0)
          {
            d += paramInt3;
            f += f1;
          }
          else
          {
            j += 1;
            N0(paramInt3, f1);
          }
          if (R()) {
            a0();
          }
          paramInt3 = 1;
        }
        if (paramInt3 != 0) {
          return false;
        }
      }
      if (paramLong3 < -30000L) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      }
      if ((paramInt3 != 0) && (!paramBoolean2)) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      }
      if (paramInt3 != 0)
      {
        if (paramInt2 != 0)
        {
          M0(paramj, paramInt1);
        }
        else
        {
          m0.i("dropVideoBuffer");
          paramj.j(paramInt1, false);
          m0.B();
          N0(0, 1);
        }
        O0(paramLong3);
        return true;
      }
      if (e0.a >= 21)
      {
        if (paramLong3 < 50000L)
        {
          if (paramLong2 == k1)
          {
            M0(paramj, paramInt1);
          }
          else
          {
            paramByteBuffer = t1;
            if (paramByteBuffer != null) {
              paramByteBuffer.c(l5, paramLong2, parami0, Q);
            }
            K0(paramj, paramInt1, paramLong2);
          }
          O0(paramLong3);
          k1 = paramLong2;
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
          catch (InterruptedException paramj)
          {
            Thread.currentThread().interrupt();
            return false;
          }
        }
        paramByteBuffer = t1;
        if (paramByteBuffer != null) {
          paramByteBuffer.c(l5, paramLong2, parami0, Q);
        }
        J0(paramj, paramInt1);
        O0(paramLong3);
        return true;
      }
      return false;
    }
    return false;
  }
  
  public final void q(int paramInt, Object paramObject)
  {
    Object localObject1;
    if (paramInt != 1)
    {
      if (paramInt != 7)
      {
        if (paramInt != 10)
        {
          if (paramInt != 4)
          {
            if (paramInt == 5)
            {
              localObject1 = L0;
              paramInt = ((Integer)paramObject).intValue();
              if (j != paramInt)
              {
                j = paramInt;
                ((j)localObject1).c(true);
              }
            }
          }
          else
          {
            paramInt = ((Integer)paramObject).intValue();
            W0 = paramInt;
            paramObject = O;
            if (paramObject != null) {
              ((o4.j)paramObject).k(paramInt);
            }
          }
        }
        else
        {
          paramInt = ((Integer)paramObject).intValue();
          if (r1 != paramInt)
          {
            r1 = paramInt;
            if (q1) {
              o0();
            }
          }
        }
      }
      else {
        t1 = ((i)paramObject);
      }
    }
    else
    {
      if ((paramObject instanceof Surface)) {
        localObject1 = (Surface)paramObject;
      } else {
        localObject1 = null;
      }
      paramObject = localObject1;
      Object localObject2;
      if (localObject1 == null)
      {
        paramObject = U0;
        if (paramObject == null)
        {
          localObject2 = V;
          paramObject = localObject1;
          if (localObject2 != null)
          {
            paramObject = localObject1;
            if (L0((o4.l)localObject2))
            {
              paramObject = h.b(K0, f);
              U0 = ((h)paramObject);
            }
          }
        }
      }
      long l;
      if (T0 != paramObject)
      {
        T0 = ((Surface)paramObject);
        localObject2 = L0;
        localObject2.getClass();
        if ((paramObject instanceof h)) {
          localObject1 = null;
        } else {
          localObject1 = paramObject;
        }
        if (e != localObject1)
        {
          ((j)localObject2).a();
          e = ((Surface)localObject1);
          ((j)localObject2).c(true);
        }
        V0 = false;
        paramInt = f;
        localObject1 = O;
        if (localObject1 != null) {
          if ((e0.a >= 23) && (paramObject != null) && (!R0))
          {
            ((o4.j)localObject1).m((Surface)paramObject);
          }
          else
          {
            o0();
            a0();
          }
        }
        if ((paramObject != null) && (paramObject != U0))
        {
          localObject2 = p1;
          if (localObject2 != null)
          {
            paramObject = M0;
            localObject1 = a;
            if (localObject1 != null) {
              ((Handler)localObject1).post(new x0.f(12, paramObject, localObject2));
            }
          }
          A0();
          if (paramInt == 2)
          {
            if (N0 > 0L) {
              l = SystemClock.elapsedRealtime() + N0;
            } else {
              l = -9223372036854775807L;
            }
            b1 = l;
          }
        }
        else
        {
          p1 = null;
          A0();
        }
      }
      else if ((paramObject != null) && (paramObject != U0))
      {
        localObject2 = p1;
        if (localObject2 != null)
        {
          localObject1 = M0;
          paramObject = a;
          if (paramObject != null) {
            ((Handler)paramObject).post(new x0.f(12, localObject1, localObject2));
          }
        }
        if (V0)
        {
          paramObject = M0;
          localObject1 = T0;
          if (a != null)
          {
            l = SystemClock.elapsedRealtime();
            a.post(new l((n.a)paramObject, (Surface)localObject1, l));
          }
        }
      }
    }
  }
  
  public final void q0()
  {
    super.q0();
    f1 = 0;
  }
  
  public final boolean u0(o4.l paraml)
  {
    boolean bool;
    if ((T0 == null) && (!L0(paraml))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final int w0(o4.n paramn, i0 parami0)
  {
    boolean bool1 = v5.p.m(t);
    int i = 0;
    if (!bool1) {
      return a0.j.b(0, 0, 0);
    }
    if (w != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject1 = E0(K0, paramn, parami0, bool1, false);
    Object localObject2 = localObject1;
    if (bool1)
    {
      localObject2 = localObject1;
      if (((List)localObject1).isEmpty()) {
        localObject2 = E0(K0, paramn, parami0, false, false);
      }
    }
    if (((List)localObject2).isEmpty()) {
      return a0.j.b(1, 0, 0);
    }
    int j = O;
    if ((j != 0) && (j != 2)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j == 0) {
      return a0.j.b(2, 0, 0);
    }
    o4.l locall = (o4.l)((List)localObject2).get(0);
    boolean bool2 = locall.d(parami0);
    if (!bool2) {
      for (j = 1; j < ((List)localObject2).size(); j++)
      {
        localObject1 = (o4.l)((List)localObject2).get(j);
        if (((o4.l)localObject1).d(parami0))
        {
          j = 0;
          bool2 = true;
          localObject2 = localObject1;
          break label232;
        }
      }
    }
    j = 1;
    localObject2 = locall;
    label232:
    int k;
    if (bool2) {
      k = 4;
    } else {
      k = 3;
    }
    int m;
    if (((o4.l)localObject2).e(parami0)) {
      m = 16;
    } else {
      m = 8;
    }
    int n;
    if (g) {
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
    if (e0.a >= 26)
    {
      i2 = j;
      if ("video/dolby-vision".equals(t))
      {
        i2 = j;
        if (!a.a(K0)) {
          i2 = 256;
        }
      }
    }
    j = i;
    if (bool2)
    {
      paramn = E0(K0, paramn, parami0, bool1, true);
      j = i;
      if (!paramn.isEmpty())
      {
        localObject2 = o4.p.a;
        paramn = new ArrayList(paramn);
        Collections.sort(paramn, new o4.o(new e(parami0, 6), 0));
        paramn = (o4.l)paramn.get(0);
        j = i;
        if (paramn.d(parami0))
        {
          j = i;
          if (paramn.e(parami0)) {
            j = 32;
          }
        }
      }
    }
    return k | m | j | n | i2;
  }
  
  public static final class a
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
        if (a.v(paramContext))
        {
          paramContext = paramContext.getHdrCapabilities().getSupportedHdrTypes();
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
  
  public final class c
    implements j.c, Handler.Callback
  {
    public final Handler a;
    
    public c(o4.j paramj)
    {
      this$1 = e0.l(this);
      a = g.this;
      paramj.g(this, g.this);
    }
    
    public final void a(long paramLong)
    {
      g localg = g.this;
      if ((this == s1) && (O != null)) {
        if (paramLong == Long.MAX_VALUE) {
          D0 = true;
        } else {
          try
          {
            localg.z0(paramLong);
            localg.I0();
            z3.e locale = F0;
            e += 1;
            localg.H0();
            localg.i0(paramLong);
          }
          catch (v3.n localn)
          {
            E0 = localn;
          }
        }
      }
    }
    
    public final void b(long paramLong)
    {
      if (e0.a < 30)
      {
        Message localMessage = Message.obtain(a, 0, (int)(paramLong >> 32), (int)paramLong);
        a.sendMessageAtFrontOfQueue(localMessage);
      }
      else
      {
        a(paramLong);
      }
    }
    
    public final boolean handleMessage(Message paramMessage)
    {
      if (what != 0) {
        return false;
      }
      int i = arg1;
      int j = arg2;
      int k = e0.a;
      a((i & 0xFFFFFFFF) << 32 | 0xFFFFFFFF & j);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     w5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */