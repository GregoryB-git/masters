package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class hf
{
  private static final byte[] a = wl.c("OpusHead");
  
  private static int a(vy paramvy)
  {
    paramvy.c(16);
    return paramvy.l();
  }
  
  private static Pair<String, byte[]> a(vy paramvy, int paramInt)
  {
    paramvy.c(paramInt + 8 + 4);
    paramvy.d(1);
    b(paramvy);
    paramvy.d(2);
    paramInt = paramvy.e();
    if ((paramInt & 0x80) != 0) {
      paramvy.d(2);
    }
    if ((paramInt & 0x40) != 0) {
      paramvy.d(paramvy.f());
    }
    if ((paramInt & 0x20) != 0) {
      paramvy.d(2);
    }
    paramvy.d(1);
    b(paramvy);
    String str = vs.a(paramvy.e());
    if ((!"audio/mpeg".equals(str)) && (!"audio/vnd.dts".equals(str)) && (!"audio/vnd.dts.hd".equals(str)))
    {
      paramvy.d(12);
      paramvy.d(1);
      paramInt = b(paramvy);
      byte[] arrayOfByte = new byte[paramInt];
      paramvy.a(arrayOfByte, 0, paramInt);
      return Pair.create(str, arrayOfByte);
    }
    return Pair.create(str, null);
  }
  
  private static Pair<Integer, hy> a(vy paramvy, int paramInt1, int paramInt2)
  {
    int i = paramvy.d();
    while (i - paramInt1 < paramInt2)
    {
      paramvy.c(i);
      int j = paramvy.l();
      boolean bool1 = true;
      boolean bool2;
      if (j > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      rp.a(bool2, "childAtomSize should be positive");
      if (paramvy.l() == 1936289382)
      {
        int k = i + 8;
        int m = 0;
        int n = -1;
        Object localObject1 = null;
        int i1;
        Object localObject3;
        Object localObject4;
        for (Object localObject2 = null; k - i < j; localObject2 = localObject3)
        {
          paramvy.c(k);
          i1 = paramvy.l();
          int i2 = paramvy.l();
          if (i2 == 1718775137)
          {
            localObject3 = Integer.valueOf(paramvy.l());
            localObject4 = localObject1;
          }
          else if (i2 == 1935894637)
          {
            paramvy.d(4);
            localObject4 = paramvy.e(4);
            localObject3 = localObject2;
          }
          else
          {
            localObject4 = localObject1;
            localObject3 = localObject2;
            if (i2 == 1935894633)
            {
              n = k;
              m = i1;
              localObject3 = localObject2;
              localObject4 = localObject1;
            }
          }
          k += i1;
          localObject1 = localObject4;
        }
        if ((!"cenc".equals(localObject1)) && (!"cbc1".equals(localObject1)) && (!"cens".equals(localObject1)) && (!"cbcs".equals(localObject1)))
        {
          localObject2 = null;
        }
        else
        {
          if (localObject2 != null) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          rp.a(bool2, "frma atom is mandatory");
          if (n != -1) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          rp.a(bool2, "schi atom is mandatory");
          k = n + 8;
          while (k - n < m)
          {
            paramvy.c(k);
            i1 = paramvy.l();
            if (paramvy.l() == 1952804451)
            {
              k = ha.a(paramvy.l());
              paramvy.d(1);
              if (k == 0)
              {
                paramvy.d(1);
                k = 0;
                m = k;
              }
              else
              {
                m = paramvy.e();
                k = m & 0xF;
                m = (m & 0xF0) >> 4;
              }
              if (paramvy.e() == 1) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              i1 = paramvy.e();
              localObject3 = new byte[16];
              paramvy.a((byte[])localObject3, 0, 16);
              if ((bool2) && (i1 == 0))
              {
                n = paramvy.e();
                localObject4 = new byte[n];
                paramvy.a((byte[])localObject4, 0, n);
              }
              else
              {
                localObject4 = null;
              }
              localObject1 = new hy(bool2, (String)localObject1, i1, (byte[])localObject3, m, k, (byte[])localObject4);
              break label500;
            }
            k += i1;
          }
          localObject1 = null;
          label500:
          if (localObject1 != null) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          rp.a(bool2, "tenc atom is mandatory");
          localObject2 = Pair.create(localObject2, localObject1);
        }
        if (localObject2 != null) {
          return (Pair<Integer, hy>)localObject2;
        }
      }
      i += j;
    }
    return null;
  }
  
  public static hz a(hd paramhd, hc paramhc, long paramLong, fe paramfe, boolean paramBoolean1, boolean paramBoolean2)
    throws ce
  {
    Object localObject1 = paramfe;
    Object localObject2 = paramhd.d(1835297121);
    int i = a(c1751411826b);
    if (i == 1936684398) {
      i = 1;
    } else if (i == 1986618469) {
      i = 2;
    } else if ((i != 1952807028) && (i != 1935832172) && (i != 1937072756) && (i != 1668047728))
    {
      if (i == 1835365473) {
        i = 4;
      } else {
        i = -1;
      }
    }
    else {
      i = 3;
    }
    if (i == -1) {
      return null;
    }
    Object localObject3 = c1953196132b;
    ((vy)localObject3).c(8);
    int j = ha.a(((vy)localObject3).l());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    }
    ((vy)localObject3).d(k);
    int m = ((vy)localObject3).l();
    ((vy)localObject3).d(4);
    int n = ((vy)localObject3).d();
    if (j == 0) {
      k = 4;
    } else {
      k = 8;
    }
    for (int i1 = 0; i1 < k; i1++) {
      if (a[(n + i1)] != -1)
      {
        i1 = 0;
        break label240;
      }
    }
    i1 = 1;
    label240:
    long l1 = -9223372036854775807L;
    if (i1 != 0) {
      ((vy)localObject3).d(k);
    }
    long l2;
    do
    {
      l2 = -9223372036854775807L;
      break;
      if (j == 0) {
        l2 = ((vy)localObject3).j();
      } else {
        l2 = ((vy)localObject3).q();
      }
    } while (l2 == 0L);
    ((vy)localObject3).d(16);
    j = ((vy)localObject3).l();
    int k = ((vy)localObject3).l();
    ((vy)localObject3).d(4);
    n = ((vy)localObject3).l();
    i1 = ((vy)localObject3).l();
    if ((j == 0) && (k == 65536) && (n == -65536) && (i1 == 0)) {
      k = 90;
    } else if ((j == 0) && (k == -65536) && (n == 65536) && (i1 == 0)) {
      k = 270;
    } else if ((j == -65536) && (k == 0) && (n == 0) && (i1 == -65536)) {
      k = 180;
    } else {
      k = 0;
    }
    localObject3 = new hi(m, l2, k);
    if (paramLong == -9223372036854775807L) {
      paramLong = hi.a((hi)localObject3);
    }
    paramhc = b;
    paramhc.c(8);
    if (ha.a(paramhc.l()) == 0) {
      k = 8;
    } else {
      k = 16;
    }
    paramhc.d(k);
    long l3 = paramhc.j();
    if (paramLong == -9223372036854775807L) {
      l2 = l1;
    } else {
      l2 = wl.c(paramLong, 1000000L, l3);
    }
    paramhc = ((hd)localObject2).d(1835626086).d(1937007212);
    localObject2 = c1835296868b;
    ((vy)localObject2).c(8);
    i1 = ha.a(((vy)localObject2).l());
    if (i1 == 0) {
      k = 8;
    } else {
      k = 16;
    }
    ((vy)localObject2).d(k);
    paramLong = ((vy)localObject2).j();
    if (i1 == 0) {
      k = 4;
    } else {
      k = 8;
    }
    ((vy)localObject2).d(k);
    k = ((vy)localObject2).f();
    char c1 = (char)((k >> 10 & 0x1F) + 96);
    char c2 = (char)((k >> 5 & 0x1F) + 96);
    char c3 = (char)((k & 0x1F) + 96);
    localObject2 = new StringBuilder(3);
    ((StringBuilder)localObject2).append(c1);
    ((StringBuilder)localObject2).append(c2);
    ((StringBuilder)localObject2).append(c3);
    Pair localPair = Pair.create(Long.valueOf(paramLong), ((StringBuilder)localObject2).toString());
    vy localvy = c1937011556b;
    int i2 = hi.b((hi)localObject3);
    n = hi.c((hi)localObject3);
    String str = (String)second;
    localvy.c(12);
    int i3 = localvy.l();
    paramhc = new hh(i3);
    k = 0;
    j = i;
    l1 = l3;
    i = k;
    while (i < i3)
    {
      int i4 = localvy.d();
      int i5 = localvy.l();
      boolean bool;
      if (i5 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      rp.a(bool, "childAtomSize should be positive");
      k = localvy.l();
      if ((k != 1635148593) && (k != 1635148595) && (k != 1701733238) && (k != 1836070006) && (k != 1752589105) && (k != 1751479857) && (k != 1932670515) && (k != 1987063864) && (k != 1987063865) && (k != 1635135537) && (k != 1685479798) && (k != 1685479729) && (k != 1685481573) && (k != 1685481521))
      {
        if ((k != 1836069985) && (k != 1701733217) && (k != 1633889587) && (k != 1700998451) && (k != 1633889588) && (k != 1685353315) && (k != 1685353317) && (k != 1685353320) && (k != 1685353324) && (k != 1935764850) && (k != 1935767394) && (k != 1819304813) && (k != 1936684916) && (k != 778924083) && (k != 1634492771) && (k != 1634492791) && (k != 1970037111) && (k != 1332770163) && (k != 1716281667))
        {
          if ((k != 1414810956) && (k != 1954034535) && (k != 2004251764) && (k != 1937010800) && (k != 1664495672))
          {
            if (k == 1667329389)
            {
              b = bw.a(Integer.toString(i2), "application/x-camera-motion", null, -1, null);
            }
            else
            {
              localObject2 = localObject1;
              localObject1 = paramhc;
              paramhc = (hc)localObject2;
              break label1464;
            }
          }
          else
          {
            localObject4 = paramhc;
            localvy.c(i4 + 8 + 8);
            if (k == 1414810956) {
              localObject2 = "application/ttml+xml";
            }
            for (;;)
            {
              for (paramLong = Long.MAX_VALUE;; paramLong = 0L)
              {
                localObject5 = null;
                break label1305;
                if (k == 1954034535)
                {
                  k = i5 - 8 - 8;
                  localObject2 = new byte[k];
                  localvy.a((byte[])localObject2, 0, k);
                  localObject5 = Collections.singletonList(localObject2);
                  localObject2 = "application/x-quicktime-tx3g";
                  paramLong = Long.MAX_VALUE;
                  break label1305;
                }
                if (k == 2004251764)
                {
                  localObject2 = "application/x-mp4-vtt";
                  break;
                }
                if (k != 1937010800) {
                  break label1284;
                }
                localObject2 = "application/ttml+xml";
              }
              label1284:
              if (k != 1664495672) {
                break label1343;
              }
              d = 1;
              localObject2 = "application/x-mp4-cea-608";
            }
            label1305:
            b = bw.a(Integer.toString(i2), (String)localObject2, null, -1, 0, str, -1, null, paramLong, (List)localObject5);
          }
          localObject2 = paramhc;
          paramhc = (hc)localObject1;
          localObject1 = localObject2;
          break label1464;
          label1343:
          throw new IllegalStateException();
        }
        else
        {
          localObject2 = paramhc;
          localvy.c(i4 + 8 + 8);
          if (paramBoolean2)
          {
            i1 = localvy.f();
            localvy.d(6);
          }
          else
          {
            localvy.d(8);
            i1 = 0;
          }
          if ((i1 == 0) || (i1 == 1)) {
            break label1478;
          }
          if (i1 == 2)
          {
            localvy.d(16);
            i1 = (int)Math.round(Double.longBitsToDouble(localvy.m()));
            m = localvy.p();
            localvy.d(20);
            break label1516;
          }
          paramhc = (hc)localObject1;
        }
        for (localObject1 = localObject2;; localObject1 = localObject2)
        {
          label1464:
          localObject5 = localObject1;
          localObject6 = paramhc;
          localObject4 = localObject3;
          break;
          label1478:
          m = localvy.f();
          localvy.d(6);
          i6 = localvy.n();
          if (i1 == 1) {
            localvy.d(16);
          }
          i1 = i6;
          label1516:
          i7 = localvy.d();
          if (k == 1701733217)
          {
            localObject5 = a(localvy, i4, i5);
            if (localObject5 != null)
            {
              k = ((Integer)first).intValue();
              if (localObject1 == null) {
                paramhc = null;
              } else {
                paramhc = ((fe)localObject1).a(second).b);
              }
              a[i] = ((hy)second);
            }
            else
            {
              paramhc = (hc)localObject1;
            }
            localvy.c(i7);
            localObject1 = paramhc;
          }
          if (k == 1633889587) {
            paramhc = "audio/ac3";
          } else if (k == 1700998451) {
            paramhc = "audio/eac3";
          } else if (k == 1633889588) {
            paramhc = "audio/ac4";
          } else if (k == 1685353315) {
            paramhc = "audio/vnd.dts";
          } else if ((k != 1685353320) && (k != 1685353324))
          {
            if (k == 1685353317) {
              paramhc = "audio/vnd.dts.hd;profile=lbr";
            } else if (k == 1935764850) {
              paramhc = "audio/3gpp";
            } else if (k == 1935767394) {
              paramhc = "audio/amr-wb";
            } else if ((k != 1819304813) && (k != 1936684916))
            {
              if (k == 778924083) {
                paramhc = "audio/mpeg";
              } else if (k == 1634492771) {
                paramhc = "audio/alac";
              } else if (k == 1634492791) {
                paramhc = "audio/g711-alaw";
              } else if (k == 1970037111) {
                paramhc = "audio/g711-mlaw";
              } else if (k == 1332770163) {
                paramhc = "audio/opus";
              } else if (k == 1716281667) {
                paramhc = "audio/flac";
              } else {
                paramhc = null;
              }
            }
            else {
              paramhc = "audio/raw";
            }
          }
          else {
            paramhc = "audio/vnd.dts.hd";
          }
          i6 = m;
          localObject5 = paramhc;
          k = i7;
          paramhc = null;
          for (m = i1; k - i4 < i5; m = i1)
          {
            localvy.c(k);
            i8 = localvy.l();
            if (i8 > 0) {
              bool = true;
            } else {
              bool = false;
            }
            rp.a(bool, "childAtomSize should be positive");
            i1 = localvy.l();
            if ((i1 != 1702061171) && ((!paramBoolean2) || (i1 != 2002876005)))
            {
              if (i1 == 1684103987)
              {
                localvy.c(k + 8);
                b = dc.a(localvy, Integer.toString(i2), str, (fe)localObject1);
              }
              for (;;)
              {
                break;
                if (i1 == 1684366131)
                {
                  localvy.c(k + 8);
                  b = dc.b(localvy, Integer.toString(i2), str, (fe)localObject1);
                }
                else if (i1 == 1684103988)
                {
                  localvy.c(k + 8);
                  b = de.a(localvy, Integer.toString(i2), str, (fe)localObject1);
                }
                else if (i1 == 1684305011)
                {
                  b = bw.a(Integer.toString(i2), (String)localObject5, null, -1, -1, i6, m, null, (fe)localObject1, 0, str);
                }
                else if (i1 == 1682927731)
                {
                  i1 = i8 - 8;
                  localObject4 = a;
                  paramhc = new byte[localObject4.length + i1];
                  System.arraycopy(localObject4, 0, paramhc, 0, localObject4.length);
                  localvy.c(k + 8);
                  localvy.a(paramhc, localObject4.length, i1);
                }
                else
                {
                  if ((i1 == 1684425825) || (i1 == 1634492771)) {
                    break label2195;
                  }
                }
              }
              for (;;)
              {
                i7 = i6;
                i1 = m;
                break;
                label2195:
                i1 = i8 - 12;
                paramhc = new byte[i1];
                localvy.c(k + 12);
                localvy.a(paramhc, 0, i1);
              }
            }
            if (i1 == 1702061171)
            {
              i1 = k;
              i9 = i1;
            }
            else
            {
              i1 = localvy.d();
              for (;;)
              {
                if (i1 - k >= i8) {
                  break label2324;
                }
                localvy.c(i1);
                i7 = localvy.l();
                if (i7 > 0) {
                  bool = true;
                } else {
                  bool = false;
                }
                rp.a(bool, "childAtomSize should be positive");
                if (localvy.l() == 1702061171) {
                  break;
                }
                i1 += i7;
              }
              label2324:
              i9 = -1;
            }
            i7 = i6;
            i1 = m;
            if (i9 != -1)
            {
              paramhc = a(localvy, i9);
              localObject4 = (String)first;
              localObject6 = (byte[])second;
              localObject5 = localObject4;
              paramhc = (hc)localObject6;
              i7 = i6;
              i1 = m;
              if ("audio/mp4a-latm".equals(localObject4))
              {
                paramhc = vg.a((byte[])localObject6);
                i1 = ((Integer)first).intValue();
                i7 = ((Integer)second).intValue();
                paramhc = (hc)localObject6;
                localObject5 = localObject4;
              }
            }
            k += i8;
            i6 = i7;
          }
          if ((b == null) && (localObject5 != null))
          {
            if ("audio/raw".equals(localObject5)) {
              k = 2;
            } else {
              k = -1;
            }
            localObject4 = Integer.toString(i2);
            if (paramhc == null) {
              paramhc = null;
            } else {
              paramhc = Collections.singletonList(paramhc);
            }
            b = bw.a((String)localObject4, (String)localObject5, null, -1, -1, i6, m, k, paramhc, (fe)localObject1, 0, str);
          }
          paramhc = paramfe;
        }
      }
      Object localObject7 = localObject3;
      i1 = i;
      hc localhc = paramhc;
      localvy.c(i4 + 8 + 8);
      localvy.d(16);
      int i9 = localvy.f();
      int i8 = localvy.f();
      localvy.d(50);
      int i6 = localvy.d();
      Object localObject8;
      if (k == 1701733238)
      {
        localObject3 = a(localvy, i4, i5);
        if (localObject3 != null)
        {
          k = ((Integer)first).intValue();
          paramhc = paramfe;
          if (paramhc == null) {
            paramhc = null;
          } else {
            paramhc = paramhc.a(second).b);
          }
          a[i1] = ((hy)second);
        }
        else
        {
          paramhc = paramfe;
        }
        localvy.c(i6);
        m = k;
        localObject8 = paramhc;
      }
      else
      {
        localObject8 = paramfe;
        m = k;
      }
      fe localfe = paramfe;
      int i7 = -1;
      float f = 1.0F;
      i = 0;
      localObject2 = null;
      paramhc = null;
      localObject1 = null;
      localObject3 = null;
      while (i6 - i4 < i5)
      {
        localvy.c(i6);
        int i10 = localvy.d();
        int i11 = localvy.l();
        if ((i11 == 0) && (localvy.d() - i4 == i5)) {
          break;
        }
        if (i11 > 0) {
          bool = true;
        } else {
          bool = false;
        }
        rp.a(bool, "childAtomSize should be positive");
        int i12 = localvy.l();
        if (i12 == 1635148611)
        {
          if (paramhc == null) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          localvy.c(i10 + 8);
          paramhc = wn.a(localvy);
          localObject3 = a;
          c = b;
          if (i == 0) {
            f = c;
          }
          paramhc = "video/avc";
        }
        else
        {
          if (i12 != 1752589123) {
            break label2953;
          }
          if (paramhc == null) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          localvy.c(i10 + 8);
          paramhc = wt.a(localvy);
          localObject3 = a;
          c = b;
          paramhc = "video/hevc";
        }
        label2953:
        label3279:
        for (;;)
        {
          k = i7;
          break label3451;
          if ((i12 == 1685480259) || (i12 == 1685485123)) {
            break label3409;
          }
          if (i12 == 1987076931)
          {
            if (paramhc == null) {
              bool = true;
            } else {
              bool = false;
            }
            rp.c(bool);
            if (m == 1987063864) {
              paramhc = "video/x-vnd.on2.vp8";
            } else {
              paramhc = "video/x-vnd.on2.vp9";
            }
          }
          else if (i12 == 1635135811)
          {
            if (paramhc == null) {
              bool = true;
            } else {
              bool = false;
            }
            rp.c(bool);
            paramhc = "video/av01";
          }
          else if (i12 == 1681012275)
          {
            if (paramhc == null) {
              bool = true;
            } else {
              bool = false;
            }
            rp.c(bool);
            paramhc = "video/3gpp";
          }
          else if (i12 == 1702061171)
          {
            if (paramhc == null) {
              bool = true;
            } else {
              bool = false;
            }
            rp.c(bool);
            localObject3 = a(localvy, i10);
            paramhc = (String)first;
            localObject3 = Collections.singletonList((byte[])second);
          }
          else
          {
            if (i12 == 1885434736)
            {
              localvy.c(i10 + 8);
              k = localvy.p();
              i = localvy.p();
              f = k / i;
              i = 1;
              k = i7;
              break label3451;
            }
            if (i12 != 1937126244) {
              break;
            }
            k = i10 + 8;
            while (k - i10 < i11)
            {
              localvy.c(k);
              i12 = localvy.l();
              if (localvy.l() == 1886547818)
              {
                localObject2 = Arrays.copyOfRange(a, k, i12 + k);
                break label3279;
              }
              k += i12;
            }
            localObject2 = null;
          }
        }
        k = i;
        if (i12 == 1936995172)
        {
          i10 = localvy.e();
          localvy.d(3);
          localObject5 = paramhc;
          localObject4 = localObject1;
          if (i10 == 0)
          {
            i10 = localvy.e();
            if (i10 != 0)
            {
              if (i10 != 1)
              {
                if (i10 != 2)
                {
                  if (i10 != 3)
                  {
                    localObject5 = paramhc;
                    localObject4 = localObject1;
                  }
                  else
                  {
                    i = k;
                    k = 3;
                    break label3451;
                  }
                }
                else
                {
                  i = k;
                  k = 2;
                  break label3451;
                }
              }
              else
              {
                i = k;
                k = 1;
                break label3451;
              }
            }
            else
            {
              i = k;
              k = 0;
              break label3451;
            }
          }
        }
        else
        {
          localObject5 = paramhc;
          localObject4 = localObject1;
          break label3440;
          label3409:
          localObject6 = wo.a(localvy);
          localObject5 = paramhc;
          localObject4 = localObject1;
          if (localObject6 != null)
          {
            localObject4 = a;
            localObject5 = "video/dolby-vision";
          }
        }
        label3440:
        k = i7;
        localObject1 = localObject4;
        paramhc = (hc)localObject5;
        label3451:
        i6 += i11;
        i7 = k;
      }
      Object localObject5 = localhc;
      Object localObject6 = localfe;
      Object localObject4 = localObject7;
      i = i1;
      if (paramhc != null)
      {
        b = bw.a(Integer.toString(i2), paramhc, (String)localObject1, -1, -1, i9, i8, -1.0F, (List)localObject3, n, f, (byte[])localObject2, i7, null, (fe)localObject8);
        i = i1;
        localObject4 = localObject7;
        localObject6 = localfe;
        localObject5 = localhc;
      }
      localvy.c(i4 + i5);
      i++;
      localObject1 = localObject6;
      localObject3 = localObject4;
      paramhc = (hc)localObject5;
    }
    if (!paramBoolean1)
    {
      paramhd = paramhd.d(1701082227);
      if (paramhd != null)
      {
        paramhd = paramhd.c(1701606260);
        if (paramhd != null)
        {
          paramhd = b;
          paramhd.c(8);
          i1 = ha.a(paramhd.l());
          k = paramhd.p();
          localObject1 = new long[k];
          paramfe = new long[k];
          i = 0;
          while (i < k)
          {
            if (i1 == 1) {
              paramLong = paramhd.q();
            } else {
              paramLong = paramhd.j();
            }
            localObject1[i] = paramLong;
            if (i1 == 1) {
              paramLong = paramhd.m();
            } else {
              paramLong = paramhd.l();
            }
            paramfe[i] = paramLong;
            if (paramhd.h() == 1)
            {
              paramhd.d(2);
              i++;
            }
            else
            {
              throw new IllegalArgumentException("Unsupported media rate.");
            }
          }
          paramhd = Pair.create(localObject1, paramfe);
          break label3744;
        }
      }
      paramhd = Pair.create(null, null);
      label3744:
      paramfe = (long[])first;
      paramhd = (long[])second;
    }
    else
    {
      paramfe = null;
      paramhd = paramfe;
    }
    if (b == null) {
      return null;
    }
    return new hz(hi.b((hi)localObject3), j, ((Long)first).longValue(), l1, l2, b, d, a, c, paramfe, paramhd);
  }
  
  public static ia a(hz paramhz, hd paramhd, ga paramga)
    throws ce
  {
    Object localObject1 = paramhd.c(1937011578);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new hg((hc)localObject1);
    }
    else
    {
      localObject1 = paramhd.c(1937013298);
      if (localObject1 == null) {
        break label2543;
      }
      localObject2 = new hj((hc)localObject1);
    }
    int i = ((he)localObject2).a();
    if (i == 0) {
      return new ia(paramhz, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
    }
    localObject1 = paramhd.c(1937007471);
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = paramhd.c(1668232756);
      bool1 = true;
    }
    else
    {
      bool1 = false;
    }
    Object localObject3 = b;
    Object localObject4 = c1937011555b;
    Object localObject5 = c1937011827b;
    localObject1 = paramhd.c(1937011571);
    Object localObject6 = null;
    if (localObject1 != null) {
      localObject1 = b;
    } else {
      localObject1 = null;
    }
    paramhd = paramhd.c(1668576371);
    Object localObject7;
    if (paramhd != null) {
      localObject7 = b;
    } else {
      localObject7 = null;
    }
    Object localObject8 = new hk((vy)localObject4, (vy)localObject3, bool1);
    ((vy)localObject5).c(12);
    int j = ((vy)localObject5).p() - 1;
    int k = ((vy)localObject5).p();
    int m = ((vy)localObject5).p();
    int n;
    if (localObject7 != null)
    {
      ((vy)localObject7).c(12);
      n = ((vy)localObject7).p();
    }
    else
    {
      n = 0;
    }
    int i1 = -1;
    int i2;
    int i3;
    if (localObject1 != null)
    {
      ((vy)localObject1).c(12);
      i2 = ((vy)localObject1).p();
      i3 = i2;
      paramhd = (hd)localObject6;
      if (i2 <= 0) {
        break label315;
      }
      i1 = ((vy)localObject1).p() - 1;
      i3 = i2;
    }
    else
    {
      i3 = 0;
    }
    paramhd = (hd)localObject1;
    label315:
    if ((((he)localObject2).c()) && ("audio/raw".equals(f.i)) && (j == 0) && (n == 0) && (i3 == 0)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    long l1 = 0L;
    int i4;
    long l3;
    int i6;
    int i9;
    long l4;
    if (i2 == 0)
    {
      localObject4 = new long[i];
      localObject1 = new int[i];
      localObject3 = new long[i];
      localObject6 = new int[i];
      i4 = i1;
      l2 = 0L;
      l3 = l2;
      int i5 = 0;
      i6 = 0;
      int i7 = 0;
      int i8 = 0;
      i9 = 0;
      i1 = n;
      i2 = k;
      int i10 = i3;
      k = i8;
      n = i7;
      i3 = i1;
      i1 = i;
      i = i5;
      while (i < i1)
      {
        bool1 = true;
        boolean bool2;
        for (;;)
        {
          bool2 = bool1;
          if (k != 0) {
            break;
          }
          bool1 = ((hk)localObject8).a();
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          l3 = d;
          k = c;
        }
        i8 = i2;
        if (!bool2)
        {
          Log.w("AtomParsers", "Unexpected end of chunk data");
          paramhd = Arrays.copyOf((long[])localObject4, i);
          localObject1 = Arrays.copyOf((int[])localObject1, i);
          localObject2 = Arrays.copyOf((long[])localObject3, i);
          localObject3 = Arrays.copyOf((int[])localObject6, i);
          i1 = i;
          i2 = k;
          localObject6 = paramhd;
          paramhd = (hd)localObject3;
          break label889;
        }
        i7 = i3;
        i2 = n;
        i5 = i9;
        if (localObject7 != null)
        {
          while ((i9 == 0) && (i3 > 0))
          {
            i9 = ((vy)localObject7).p();
            n = ((vy)localObject7).l();
            i3--;
          }
          i5 = i9 - 1;
          i2 = n;
          i7 = i3;
        }
        localObject4[i] = l3;
        i3 = ((he)localObject2).b();
        localObject1[i] = i3;
        i9 = i6;
        if (i3 > i6) {
          i9 = i3;
        }
        localObject3[i] = (l2 + i2);
        if (paramhd == null) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        localObject6[i] = i3;
        i3 = i4;
        int i11 = i10;
        if (i == i4)
        {
          localObject6[i] = 1;
          n = i10 - 1;
          i3 = i4;
          i11 = n;
          if (n > 0)
          {
            i3 = paramhd.p() - 1;
            i11 = n;
          }
        }
        l2 += m;
        n = i8 - 1;
        if ((n == 0) && (j > 0))
        {
          n = ((vy)localObject5).p();
          i6 = ((vy)localObject5).l();
          j--;
        }
        else
        {
          i6 = m;
        }
        l4 = localObject1[i];
        i8 = k - 1;
        i++;
        l3 += l4;
        m = i6;
        k = i2;
        i4 = i3;
        i10 = i11;
        i6 = i9;
        i2 = n;
        i3 = i7;
        n = k;
        k = i8;
        i9 = i5;
      }
      i8 = i2;
      i2 = k;
      localObject2 = localObject3;
      paramhd = (hd)localObject6;
      localObject6 = localObject4;
      label889:
      l3 = l2 + n;
      while (i3 > 0)
      {
        if (((vy)localObject7).p() != 0)
        {
          i3 = 0;
          break label931;
        }
        ((vy)localObject7).l();
        i3--;
      }
      i3 = 1;
      label931:
      if ((i10 == 0) && (i8 == 0) && (i2 == 0) && (j == 0) && (i9 == 0) && (i3 != 0)) {
        break label1131;
      }
      n = a;
      if (i3 == 0) {
        localObject7 = ", ctts invalid";
      } else {
        localObject7 = "";
      }
      localObject3 = new StringBuilder(((String)localObject7).length() + 262);
      ((StringBuilder)localObject3).append("Inconsistent stbl box for track ");
      ((StringBuilder)localObject3).append(n);
      ((StringBuilder)localObject3).append(": remainingSynchronizationSamples ");
      ((StringBuilder)localObject3).append(i10);
      ((StringBuilder)localObject3).append(", remainingSamplesAtTimestampDelta ");
      ((StringBuilder)localObject3).append(i8);
      ((StringBuilder)localObject3).append(", remainingSamplesInChunk ");
      ((StringBuilder)localObject3).append(i2);
      ((StringBuilder)localObject3).append(", remainingTimestampDeltaChanges ");
      ((StringBuilder)localObject3).append(j);
      ((StringBuilder)localObject3).append(", remainingSamplesAtTimestampOffset ");
      ((StringBuilder)localObject3).append(i9);
      ((StringBuilder)localObject3).append((String)localObject7);
      Log.w("AtomParsers", ((StringBuilder)localObject3).toString());
      label1131:
      n = i1;
      localObject7 = localObject6;
      localObject6 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject7;
      i3 = i6;
    }
    else
    {
      j = a;
      paramhd = new long[j];
      localObject1 = new int[j];
      while (((hk)localObject8).a())
      {
        i3 = b;
        paramhd[i3] = d;
        localObject1[i3] = c;
      }
      localObject2 = f;
      i6 = wl.b(v, t);
      l2 = m;
      i9 = 8192 / i6;
      n = 0;
      i3 = 0;
      while (n < j)
      {
        i3 += wl.a(localObject1[n], i9);
        n++;
      }
      localObject3 = new long[i3];
      localObject6 = new int[i3];
      localObject2 = new long[i3];
      localObject7 = new int[i3];
      i1 = 0;
      k = 0;
      i2 = 0;
      i3 = 0;
      n = j;
      while (i1 < n)
      {
        j = localObject1[i1];
        l3 = paramhd[i1];
        while (j > 0)
        {
          i4 = Math.min(i9, j);
          localObject3[i2] = l3;
          m = i6 * i4;
          localObject6[i2] = m;
          i3 = Math.max(i3, m);
          localObject2[i2] = (k * l2);
          localObject7[i2] = 1;
          l3 += localObject6[i2];
          k += i4;
          j -= i4;
          i2++;
        }
        i1++;
      }
      localObject7 = new hn((long[])localObject3, (int[])localObject6, i3, (long[])localObject2, (int[])localObject7, l2 * k, (byte)0);
      localObject1 = a;
      localObject2 = b;
      i3 = c;
      localObject6 = d;
      paramhd = e;
      l3 = f;
      n = i;
    }
    hz localhz = paramhz;
    long l2 = wl.c(l3, 1000000L, c);
    if ((h != null) && (!paramga.a()))
    {
      localObject7 = h;
      if ((localObject7.length == 1) && (b == 1) && (localObject6.length >= 2))
      {
        long l5 = i[0];
        l2 = wl.c(localObject7[0], c, d) + l5;
        i2 = localObject6.length - 1;
        i1 = wl.a(4, 0, i2);
        i2 = wl.a(localObject6.length - 4, 0, i2);
        l4 = localObject6[0];
        if ((l4 <= l5) && (l5 < localObject6[i1]) && (localObject6[i2] < l2) && (l2 <= l3)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0)
        {
          l4 = wl.c(l5 - l4, f.u, c);
          l2 = wl.c(l3 - l2, f.u, c);
          if (((l4 != 0L) || (l2 != 0L)) && (l4 <= 2147483647L) && (l2 <= 2147483647L))
          {
            a = ((int)l4);
            b = ((int)l2);
            wl.a((long[])localObject6, 1000000L, c);
            return new ia(paramhz, (long[])localObject1, (int[])localObject2, i3, (long[])localObject6, paramhd, wl.c(h[0], 1000000L, d));
          }
        }
      }
      paramga = h;
      if ((paramga.length == 1) && (paramga[0] == 0L))
      {
        l2 = i[0];
        for (n = 0; n < localObject6.length; n++) {
          localObject6[n] = wl.c(localObject6[n] - l2, 1000000L, c);
        }
        return new ia(paramhz, (long[])localObject1, (int[])localObject2, i3, (long[])localObject6, paramhd, wl.c(l3 - l2, 1000000L, c));
      }
      if (b == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      localObject8 = new int[paramga.length];
      int[] arrayOfInt = new int[paramga.length];
      k = 0;
      i2 = 0;
      i1 = 0;
      j = 0;
      paramga = (ga)localObject2;
      for (;;)
      {
        localObject2 = h;
        if (k >= localObject2.length) {
          break;
        }
        l2 = i[k];
        if (l2 != -1L)
        {
          l3 = wl.c(localObject2[k], c, d);
          localObject8[k] = wl.b((long[])localObject6, l2, true, true);
          arrayOfInt[k] = wl.b((long[])localObject6, l2 + l3, bool1, false);
          for (;;)
          {
            i9 = localObject8[k];
            i6 = arrayOfInt[k];
            if ((i9 >= i6) || ((paramhd[i9] & 0x1) != 0)) {
              break;
            }
            localObject8[k] = (i9 + 1);
          }
          if (j != i9) {
            i = 1;
          } else {
            i = 0;
          }
          j = i6;
          i1 = i6 - i9 + i1;
          i2 |= i;
        }
        k++;
      }
      k = 0;
      j = 1;
      if (i1 != n) {
        n = j;
      } else {
        n = 0;
      }
      i = i2 | n;
      if (i != 0) {
        localObject7 = new long[i1];
      } else {
        localObject7 = localObject1;
      }
      if (i != 0) {
        localObject3 = new int[i1];
      } else {
        localObject3 = paramga;
      }
      if (i != 0) {
        i3 = 0;
      }
      if (i != 0) {
        localObject4 = new int[i1];
      } else {
        localObject4 = paramhd;
      }
      long[] arrayOfLong = new long[i1];
      i2 = 0;
      localObject5 = localObject1;
      localObject2 = paramga;
      l3 = l1;
      n = k;
      localObject1 = paramhd;
      paramga = arrayOfInt;
      while (n < h.length)
      {
        l2 = i[n];
        k = localObject8[n];
        i1 = paramga[n];
        if (i != 0)
        {
          j = i1 - k;
          System.arraycopy(localObject5, k, localObject7, i2, j);
          System.arraycopy(localObject2, k, localObject3, i2, j);
          System.arraycopy(localObject1, k, localObject4, i2, j);
        }
        paramhd = (hd)localObject2;
        localObject2 = localObject8;
        while (k < i1)
        {
          l1 = d;
          j = i3;
          arrayOfLong[i2] = (wl.c(l3, 1000000L, l1) + wl.c(localObject6[k] - l2, 1000000L, c));
          i3 = j;
          if (i != 0)
          {
            i3 = j;
            if (localObject3[i2] > j) {
              i3 = paramhd[k];
            }
          }
          i2++;
          k++;
        }
        l3 += h[n];
        n++;
        localObject8 = localObject2;
        localObject2 = paramhd;
      }
      return new ia(paramhz, (long[])localObject7, (int[])localObject3, i3, arrayOfLong, (int[])localObject4, wl.c(l3, 1000000L, d));
    }
    wl.a((long[])localObject6, 1000000L, c);
    return new ia(paramhz, (long[])localObject1, (int[])localObject2, i3, (long[])localObject6, paramhd, l2);
    label2543:
    throw new ce("Track has no sample table size information");
  }
  
  public static kd a(hc paramhc, boolean paramBoolean)
  {
    if (paramBoolean) {
      return null;
    }
    vy localvy = b;
    localvy.c(8);
    while (localvy.b() >= 8)
    {
      int i = localvy.d();
      int j = localvy.l();
      if (localvy.l() == 1835365473)
      {
        localvy.c(i);
        localvy.d(12);
        while (localvy.d() < i + j)
        {
          int k = localvy.d();
          int m = localvy.l();
          if (localvy.l() == 1768715124)
          {
            localvy.c(k);
            localvy.d(8);
            paramhc = new ArrayList();
            while (localvy.d() < k + m)
            {
              kd.a locala = ht.a(localvy);
              if (locala != null) {
                paramhc.add(locala);
              }
            }
            if (paramhc.isEmpty()) {
              break;
            }
            return new kd(paramhc);
          }
          localvy.c(k + m);
        }
        return null;
      }
      localvy.c(i + j);
    }
    return null;
  }
  
  public static kd a(hd paramhd)
  {
    Object localObject1 = paramhd.c(1751411826);
    Object localObject2 = paramhd.c(1801812339);
    Object localObject3 = paramhd.c(1768715124);
    if ((localObject1 != null) && (localObject2 != null) && (localObject3 != null) && (a(b) == 1835299937))
    {
      localObject2 = b;
      ((vy)localObject2).c(12);
      int i = ((vy)localObject2).l();
      paramhd = new String[i];
      int k;
      for (int j = 0; j < i; j++)
      {
        k = ((vy)localObject2).l();
        ((vy)localObject2).d(4);
        paramhd[j] = ((vy)localObject2).e(k - 8);
      }
      localObject2 = b;
      ((vy)localObject2).c(8);
      localObject3 = new ArrayList();
      while (((vy)localObject2).b() > 8)
      {
        int m = ((vy)localObject2).d();
        k = ((vy)localObject2).l();
        j = ((vy)localObject2).l() - 1;
        if ((j >= 0) && (j < i))
        {
          localObject1 = ht.a((vy)localObject2, m + k, paramhd[j]);
          if (localObject1 != null) {
            ((ArrayList)localObject3).add(localObject1);
          }
        }
        else
        {
          localObject1 = new StringBuilder(52);
          ((StringBuilder)localObject1).append("Skipped metadata with unknown key index: ");
          ((StringBuilder)localObject1).append(j);
          Log.w("AtomParsers", ((StringBuilder)localObject1).toString());
        }
        ((vy)localObject2).c(m + k);
      }
      if (((ArrayList)localObject3).isEmpty()) {
        return null;
      }
      return new kd((List)localObject3);
    }
    return null;
  }
  
  private static int b(vy paramvy)
  {
    int i = paramvy.e();
    for (int j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F) {
      i = paramvy.e();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */