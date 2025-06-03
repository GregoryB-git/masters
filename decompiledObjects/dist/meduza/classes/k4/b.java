package k4;

import a4.d;
import android.util.Pair;
import b.a0;
import f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.u;
import w5.c;

public final class b
{
  public static final byte[] a = e0.B("OpusHead");
  
  public static b a(int paramInt, u paramu)
  {
    paramu.G(paramInt + 8 + 4);
    paramu.H(1);
    b(paramu);
    paramu.H(2);
    paramInt = paramu.v();
    if ((paramInt & 0x80) != 0) {
      paramu.H(2);
    }
    if ((paramInt & 0x40) != 0) {
      paramu.H(paramu.v());
    }
    if ((paramInt & 0x20) != 0) {
      paramu.H(2);
    }
    paramu.H(1);
    b(paramu);
    String str = v5.p.f(paramu.v());
    if ((!"audio/mpeg".equals(str)) && (!"audio/vnd.dts".equals(str)) && (!"audio/vnd.dts.hd".equals(str)))
    {
      paramu.H(4);
      long l1 = paramu.w();
      long l2 = paramu.w();
      paramu.H(1);
      paramInt = b(paramu);
      byte[] arrayOfByte = new byte[paramInt];
      paramu.d(arrayOfByte, 0, paramInt);
      if (l2 <= 0L) {
        l2 = -1L;
      }
      if (l1 <= 0L) {
        l1 = -1L;
      }
      return new b(str, arrayOfByte, l2, l1);
    }
    return new b(str, null, -1L, -1L);
  }
  
  public static int b(u paramu)
  {
    int i = paramu.v();
    for (int j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F) {
      i = paramu.v();
    }
    return j;
  }
  
  public static Pair c(int paramInt1, int paramInt2, u paramu)
  {
    int i = b;
    while (i - paramInt1 < paramInt2)
    {
      paramu.G(i);
      int j = paramu.f();
      boolean bool1 = true;
      boolean bool2;
      if (j > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      x6.b.u("childAtomSize must be positive", bool2);
      if (paramu.f() == 1936289382)
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
          paramu.G(k);
          i1 = paramu.f();
          int i2 = paramu.f();
          if (i2 == 1718775137)
          {
            localObject3 = Integer.valueOf(paramu.f());
            localObject4 = localObject1;
          }
          else if (i2 == 1935894637)
          {
            paramu.H(4);
            localObject4 = paramu.s(4);
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
          x6.b.u("frma atom is mandatory", bool2);
          if (n != -1) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          x6.b.u("schi atom is mandatory", bool2);
          k = n + 8;
          while (k - n < m)
          {
            paramu.G(k);
            i1 = paramu.f();
            if (paramu.f() == 1952804451)
            {
              k = paramu.f();
              paramu.H(1);
              if ((k >> 24 & 0xFF) == 0)
              {
                paramu.H(1);
                m = 0;
                k = m;
              }
              else
              {
                k = paramu.v();
                m = k & 0xF;
                k = (k & 0xF0) >> 4;
              }
              if (paramu.v() == 1) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              i1 = paramu.v();
              localObject3 = new byte[16];
              paramu.d((byte[])localObject3, 0, 16);
              if ((bool2) && (i1 == 0))
              {
                n = paramu.v();
                localObject4 = new byte[n];
                paramu.d((byte[])localObject4, 0, n);
              }
              else
              {
                localObject4 = null;
              }
              localObject1 = new k(bool2, (String)localObject1, i1, (byte[])localObject3, k, m, (byte[])localObject4);
              break label504;
            }
            k += i1;
          }
          localObject1 = null;
          label504:
          if (localObject1 != null) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          x6.b.u("tenc atom is mandatory", bool2);
          k = e0.a;
          localObject2 = Pair.create(localObject2, localObject1);
        }
        if (localObject2 != null) {
          return (Pair)localObject2;
        }
      }
      i += j;
    }
    return null;
  }
  
  public static d d(u paramu, int paramInt1, int paramInt2, String paramString, d paramd, boolean paramBoolean)
  {
    paramu.G(12);
    int i = paramu.f();
    Object localObject1 = new d(i);
    int j = 0;
    int i2;
    for (int k = paramInt1;; k = i2)
    {
      Object localObject2 = paramd;
      String str = paramString;
      if (j >= i) {
        break;
      }
      int m = b;
      int n = paramu.f();
      int i1 = n;
      boolean bool;
      if (i1 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Object localObject3 = "childAtomSize must be positive";
      x6.b.u("childAtomSize must be positive", bool);
      i2 = paramu.f();
      Object localObject4;
      long l1;
      label674:
      label735:
      int i3;
      int i4;
      label841:
      label852:
      int i5;
      label954:
      int i6;
      Object localObject5;
      Object localObject6;
      label1407:
      Object localObject7;
      Object localObject8;
      int i7;
      int i8;
      Object localObject9;
      Object localObject10;
      int i9;
      int i10;
      int i11;
      if ((i2 != 1635148593) && (i2 != 1635148595) && (i2 != 1701733238) && (i2 != 1831958048) && (i2 != 1836070006) && (i2 != 1752589105) && (i2 != 1751479857) && (i2 != 1932670515) && (i2 != 1211250227) && (i2 != 1987063864) && (i2 != 1987063865) && (i2 != 1635135537) && (i2 != 1685479798) && (i2 != 1685479729) && (i2 != 1685481573) && (i2 != 1685481521))
      {
        if ((i2 != 1836069985) && (i2 != 1701733217) && (i2 != 1633889587) && (i2 != 1700998451) && (i2 != 1633889588) && (i2 != 1835823201) && (i2 != 1685353315) && (i2 != 1685353317) && (i2 != 1685353320) && (i2 != 1685353324) && (i2 != 1685353336) && (i2 != 1935764850) && (i2 != 1935767394) && (i2 != 1819304813) && (i2 != 1936684916) && (i2 != 1953984371) && (i2 != 778924082) && (i2 != 778924083) && (i2 != 1835557169) && (i2 != 1835560241) && (i2 != 1634492771) && (i2 != 1634492791) && (i2 != 1970037111) && (i2 != 1332770163) && (i2 != 1716281667))
        {
          if ((i2 != 1414810956) && (i2 != 1954034535) && (i2 != 2004251764) && (i2 != 1937010800) && (i2 != 1664495672))
          {
            if (i2 == 1835365492)
            {
              paramu.G(m + 8 + 8);
              if (i2 == 1835365492)
              {
                paramu.p();
                localObject4 = paramu.p();
                if (localObject4 != null)
                {
                  localObject2 = new i0.a();
                  ((i0.a)localObject2).b(k);
                  k = ((String)localObject4);
                  b = new i0((i0.a)localObject2);
                }
              }
            }
            else if (i2 == 1667329389)
            {
              localObject2 = new i0.a();
              ((i0.a)localObject2).b(k);
              k = "application/x-camera-motion";
              b = new i0((i0.a)localObject2);
            }
          }
          else
          {
            paramu.G(m + 8 + 8);
            l1 = Long.MAX_VALUE;
            localObject2 = "application/ttml+xml";
            if (i2 != 1414810956)
            {
              if (i2 == 1954034535)
              {
                i2 = i1 - 8 - 8;
                localObject2 = new byte[i2];
                paramu.d((byte[])localObject2, 0, i2);
                localObject4 = o7.t.t(localObject2);
                localObject2 = "application/x-quicktime-tx3g";
                break label674;
              }
              if (i2 == 2004251764)
              {
                localObject2 = "application/x-mp4-vtt";
              }
              else if (i2 == 1937010800)
              {
                l1 = 0L;
              }
              else
              {
                if (i2 != 1664495672) {
                  break label735;
                }
                d = 1;
                localObject2 = "application/x-mp4-cea-608";
              }
            }
            localObject4 = null;
            localObject3 = new i0.a();
            ((i0.a)localObject3).b(k);
            k = ((String)localObject2);
            c = str;
            o = l1;
            m = ((List)localObject4);
            b = new i0((i0.a)localObject3);
            break label841;
            throw new IllegalStateException();
          }
        }
        else
        {
          paramu.G(m + 8 + 8);
          if (paramBoolean)
          {
            n = paramu.A();
            paramu.H(6);
          }
          else
          {
            paramu.H(8);
            n = 0;
          }
          if ((n == 0) || (n == 1)) {
            break label852;
          }
          if (n == 2)
          {
            paramu.H(16);
            i3 = (int)Math.round(Double.longBitsToDouble(paramu.o()));
            i4 = paramu.y();
            paramu.H(20);
            n = 0;
            break label954;
          }
        }
        i4 = m;
        n = i1;
        break label3162;
        i4 = paramu.A();
        paramu.H(6);
        localObject4 = a;
        i3 = b;
        i5 = i3 + 1;
        i3 = localObject4[i3];
        i3 = localObject4[i5] & 0xFF | (i3 & 0xFF) << 8;
        i5 = i5 + 1 + 2;
        b = i5;
        paramu.G(i5 - 4);
        i5 = paramu.f();
        if (n == 1) {
          paramu.H(16);
        }
        n = i5;
        i6 = b;
        if (i2 == 1701733217)
        {
          localObject4 = c(m, i1, paramu);
          if (localObject4 != null)
          {
            i2 = ((Integer)first).intValue();
            if (localObject2 == null) {
              localObject2 = null;
            } else {
              localObject2 = ((d)localObject2).a(second).b);
            }
            a[j] = ((k)second);
          }
          paramu.G(i6);
          localObject5 = localObject2;
        }
        else
        {
          localObject5 = localObject2;
        }
        localObject6 = "audio/ac3";
        localObject2 = "audio/raw";
        if (i2 == 1633889587)
        {
          localObject2 = "audio/ac3";
        }
        else if (i2 == 1700998451)
        {
          localObject2 = "audio/eac3";
        }
        else if (i2 == 1633889588)
        {
          localObject2 = "audio/ac4";
        }
        else
        {
          if (i2 == 1685353315) {
            localObject2 = "audio/vnd.dts";
          }
          for (;;)
          {
            break;
            if ((i2 != 1685353320) && (i2 != 1685353324))
            {
              if (i2 == 1685353317)
              {
                localObject2 = "audio/vnd.dts.hd;profile=lbr";
              }
              else if (i2 == 1685353336)
              {
                localObject2 = "audio/vnd.dts.uhd;profile=p2";
              }
              else if (i2 == 1935764850)
              {
                localObject2 = "audio/3gpp";
              }
              else if (i2 == 1935767394)
              {
                localObject2 = "audio/amr-wb";
              }
              else if ((i2 != 1819304813) && (i2 != 1936684916))
              {
                if (i2 == 1953984371)
                {
                  i5 = 268435456;
                  break label1407;
                }
                if ((i2 != 778924082) && (i2 != 778924083))
                {
                  if (i2 == 1835557169)
                  {
                    localObject2 = "audio/mha1";
                  }
                  else if (i2 == 1835560241)
                  {
                    localObject2 = "audio/mhm1";
                  }
                  else if (i2 == 1634492771)
                  {
                    localObject2 = "audio/alac";
                  }
                  else if (i2 == 1634492791)
                  {
                    localObject2 = "audio/g711-alaw";
                  }
                  else if (i2 == 1970037111)
                  {
                    localObject2 = "audio/g711-mlaw";
                  }
                  else if (i2 == 1332770163)
                  {
                    localObject2 = "audio/opus";
                  }
                  else if (i2 == 1716281667)
                  {
                    localObject2 = "audio/flac";
                  }
                  else if (i2 == 1835823201)
                  {
                    localObject2 = "audio/true-hd";
                  }
                  else
                  {
                    i5 = -1;
                    localObject2 = null;
                    break label1407;
                  }
                }
                else {
                  localObject2 = "audio/mpeg";
                }
              }
              else
              {
                i5 = 2;
                break label1407;
              }
            }
            else {
              localObject2 = "audio/vnd.dts.hd";
            }
          }
        }
        i5 = -1;
        localObject7 = null;
        localObject8 = null;
        localObject4 = null;
        i2 = i3;
        i3 = i4;
        while (i6 - m < i1)
        {
          paramu.G(i6);
          i7 = paramu.f();
          if (i7 > 0) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.u((String)localObject3, bool);
          i8 = paramu.f();
          if (i8 == 1835557187)
          {
            i4 = i7 - 13;
            localObject7 = new byte[i4];
            paramu.G(i6 + 13);
            paramu.d((byte[])localObject7, 0, i4);
            localObject7 = o7.t.t(localObject7);
            i4 = i2;
          }
          else
          {
            localObject9 = localObject3;
            if ((i8 == 1702061171) || ((paramBoolean) && (i8 == 2002876005))) {
              break label2699;
            }
            if (i8 == 1684103987)
            {
              paramu.G(i6 + 8);
              localObject10 = Integer.toString(paramInt1);
              localObject9 = new v5.t();
              ((v5.t)localObject9).j(a, c);
              ((v5.t)localObject9).k(b * 8);
              i4 = ((v5.t)localObject9).g(2);
              i8 = x3.b.b[i4];
              ((v5.t)localObject9).m(8);
              i9 = x3.b.d[localObject9.g(3)];
              i4 = i9;
              if (((v5.t)localObject9).g(1) != 0) {
                i4 = i9 + 1;
              }
              i9 = ((v5.t)localObject9).g(5);
              i9 = x3.b.e[i9] * 1000;
              ((v5.t)localObject9).c();
              paramu.G(((v5.t)localObject9).d());
              localObject9 = new i0.a();
              a = ((String)localObject10);
              k = ((String)localObject6);
              x = i4;
              y = i8;
              n = ((d)localObject5);
              c = str;
              f = i9;
              g = i9;
              b = new i0((i0.a)localObject9);
            }
            else
            {
              i9 = i2;
              i4 = i3;
              if (i8 == 1684366131)
              {
                paramu.G(i6 + 8);
                localObject9 = Integer.toString(paramInt1);
                Object localObject11 = new v5.t();
                ((v5.t)localObject11).j(a, c);
                ((v5.t)localObject11).k(b * 8);
                i8 = ((v5.t)localObject11).g(13);
                ((v5.t)localObject11).m(3);
                i4 = ((v5.t)localObject11).g(2);
                i10 = x3.b.b[i4];
                ((v5.t)localObject11).m(10);
                i9 = x3.b.d[localObject11.g(3)];
                i4 = i9;
                if (((v5.t)localObject11).g(1) != 0) {
                  i4 = i9 + 1;
                }
                ((v5.t)localObject11).m(3);
                i11 = ((v5.t)localObject11).g(4);
                ((v5.t)localObject11).m(1);
                i9 = i4;
                if (i11 > 0)
                {
                  ((v5.t)localObject11).n(6);
                  i9 = i4;
                  if (((v5.t)localObject11).g(1) != 0) {
                    i9 = i4 + 2;
                  }
                  ((v5.t)localObject11).m(1);
                }
                if (((v5.t)localObject11).b() > 7)
                {
                  ((v5.t)localObject11).m(7);
                  if (((v5.t)localObject11).g(1) != 0)
                  {
                    localObject10 = "audio/eac3-joc";
                    break label2015;
                  }
                }
                localObject10 = "audio/eac3";
                label2015:
                ((v5.t)localObject11).c();
                paramu.G(((v5.t)localObject11).d());
                localObject11 = new i0.a();
                a = ((String)localObject9);
                k = ((String)localObject10);
                x = i9;
                y = i10;
                n = ((d)localObject5);
                c = str;
                g = (i8 * 1000);
                localObject10 = new i0((i0.a)localObject11);
              }
              else
              {
                localObject10 = localObject2;
                if (i8 != 1684103988) {
                  break label2235;
                }
                paramu.G(i6 + 8);
                localObject9 = Integer.toString(paramInt1);
                paramu.H(1);
                if ((paramu.v() & 0x20) >> 5 == 1) {
                  i4 = 48000;
                } else {
                  i4 = 44100;
                }
                localObject10 = new i0.a();
                a = ((String)localObject9);
                k = "audio/ac4";
                x = 2;
                y = i4;
                n = ((d)localObject5);
                c = str;
                localObject10 = new i0((i0.a)localObject10);
              }
              b = ((i0)localObject10);
            }
            for (;;)
            {
              break;
              label2235:
              if (i8 == 1684892784)
              {
                if (n > 0)
                {
                  i2 = 2;
                  localObject3 = localObject9;
                  localObject2 = localObject10;
                  i4 = n;
                  break label2986;
                }
                paramu = new StringBuilder();
                paramu.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                paramu.append(n);
                throw a1.a(paramu.toString(), null);
              }
              if ((i8 != 1684305011) && (i8 != 1969517683))
              {
                if (i8 == 1682927731)
                {
                  i2 = i7 - 8;
                  localObject2 = a;
                  localObject7 = Arrays.copyOf((byte[])localObject2, localObject2.length + i2);
                  paramu.G(i6 + 8);
                  paramu.d((byte[])localObject7, localObject2.length, i2);
                  localObject2 = a0.n((byte[])localObject7);
                }
                else
                {
                  if (i8 != 1684425825) {
                    break label2471;
                  }
                  i2 = i7 - 12;
                  localObject2 = new byte[i2 + 4];
                  localObject2[0] = ((byte)102);
                  localObject2[1] = ((byte)76);
                  localObject2[2] = ((byte)97);
                  localObject2[3] = ((byte)67);
                  paramu.G(i6 + 12);
                  paramu.d((byte[])localObject2, 4, i2);
                  localObject2 = o7.t.t(localObject2);
                }
                i3 = i4;
                i4 = i9;
                localObject7 = localObject2;
                label2471:
                if (i8 == 1634492771)
                {
                  i2 = i7 - 12;
                  localObject2 = new byte[i2];
                  paramu.G(i6 + 12);
                  paramu.d((byte[])localObject2, 0, i2);
                  localObject7 = new u((byte[])localObject2);
                  ((u)localObject7).G(9);
                  i2 = ((u)localObject7).v();
                  ((u)localObject7).G(20);
                  localObject7 = Pair.create(Integer.valueOf(((u)localObject7).y()), Integer.valueOf(i2));
                  i4 = ((Integer)first).intValue();
                  i3 = ((Integer)second).intValue();
                  localObject7 = o7.t.t(localObject2);
                  localObject2 = localObject10;
                  break label2680;
                }
              }
              else
              {
                localObject9 = new i0.a();
                ((i0.a)localObject9).b(k);
                localObject2 = localObject10;
                k = ((String)localObject2);
                i3 = i4;
                x = i3;
                i2 = i9;
                y = i2;
                n = ((d)localObject5);
                c = str;
                b = new i0((i0.a)localObject9);
              }
            }
            i4 = i2;
          }
          label2680:
          i2 = i3;
          i3 = n;
          n = i4;
          i4 = i3;
          break label2986;
          label2699:
          if (i8 == 1702061171)
          {
            i9 = i6;
            localObject3 = localObject9;
            i4 = n;
          }
          else
          {
            i4 = b;
            if (i4 >= i6) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.u(null, bool);
            while (i4 - i6 < i7)
            {
              paramu.G(i4);
              i8 = paramu.f();
              if (i8 > 0) {
                bool = true;
              } else {
                bool = false;
              }
              localObject3 = localObject9;
              x6.b.u((String)localObject3, bool);
              i9 = paramu.f();
              if (i9 == 1702061171)
              {
                i9 = i4;
                i4 = n;
                break label2847;
              }
              i4 += i8;
              localObject9 = localObject3;
            }
            localObject3 = localObject9;
            i9 = -1;
            i4 = n;
          }
          label2847:
          if (i9 != -1)
          {
            localObject8 = a(i9, paramu);
            localObject10 = a;
            localObject9 = b;
            if (localObject9 != null)
            {
              if ("audio/mp4a-latm".equals(localObject10))
              {
                localObject2 = x3.a.c(new v5.t((byte[])localObject9, localObject9.length), false);
                n = a;
                i2 = b;
                localObject2 = c;
              }
              else
              {
                n = i2;
                i2 = i3;
                localObject2 = localObject4;
              }
              localObject7 = o7.t.t(localObject9);
            }
            else
            {
              n = i2;
              i2 = i3;
              localObject2 = localObject4;
            }
            localObject4 = localObject2;
            localObject2 = localObject10;
          }
          else
          {
            n = i2;
            i2 = i3;
          }
          label2986:
          i6 += i7;
          i3 = i2;
          i2 = n;
          n = i4;
        }
        i4 = m;
        n = i1;
        if (b == null)
        {
          i4 = m;
          n = i1;
          if (localObject2 != null)
          {
            localObject3 = new i0.a();
            ((i0.a)localObject3).b(k);
            k = ((String)localObject2);
            h = ((String)localObject4);
            x = i3;
            y = i2;
            z = i5;
            m = ((List)localObject7);
            n = ((d)localObject5);
            c = str;
            if (localObject8 != null)
            {
              f = r7.a.E(c);
              g = r7.a.E(d);
            }
            b = new i0((i0.a)localObject3);
            n = i1;
            i4 = m;
          }
        }
        label3162:
        localObject2 = localObject1;
        i2 = k;
      }
      else
      {
        localObject8 = "childAtomSize must be positive";
        paramu.G(m + 8 + 8);
        paramu.H(16);
        i10 = paramu.A();
        i8 = paramu.A();
        paramu.H(50);
        i11 = b;
        if (i2 == 1701733238)
        {
          localObject4 = c(m, i1, paramu);
          if (localObject4 != null)
          {
            i2 = ((Integer)first).intValue();
            if (paramd == null) {
              localObject2 = null;
            } else {
              localObject2 = paramd.a(second).b);
            }
            a[j] = ((k)second);
          }
          else
          {
            localObject2 = paramd;
          }
          paramu.G(i11);
          i3 = i2;
          localObject6 = localObject2;
        }
        else
        {
          localObject6 = paramd;
          i3 = i2;
        }
        k = n;
        i4 = m;
        if (i3 == 1831958048) {
          localObject3 = "video/mpeg";
        } else if (i3 == 1211250227) {
          localObject3 = "video/3gpp";
        } else {
          localObject3 = null;
        }
        float f1 = 1.0F;
        i2 = -1;
        localObject2 = null;
        localObject7 = null;
        i1 = 0;
        m = -1;
        localObject10 = null;
        n = -1;
        localObject9 = null;
        localObject4 = null;
        i5 = -1;
        i7 = i3;
        localObject5 = localObject1;
        i3 = m;
        while (i11 - i4 < k)
        {
          paramu.G(i11);
          i6 = b;
          float f2 = f1;
          int i12 = paramu.f();
          if ((i12 == 0) && (b - i4 == k)) {
            break;
          }
          if (i12 > 0) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.u((String)localObject8, bool);
          int i13 = paramu.f();
          if (i13 == 1635148611)
          {
            if (localObject3 == null) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.u(null, bool);
            paramu.G(i6 + 8);
            localObject3 = w5.a.a(paramu);
            localObject7 = a;
            c = b;
            if (i1 == 0) {
              f2 = e;
            }
            localObject10 = f;
            localObject3 = "video/avc";
          }
          else if (i13 == 1752589123)
          {
            if (localObject3 == null) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.u(null, bool);
            paramu.G(i6 + 8);
            localObject3 = w5.e.a(paramu);
            localObject7 = a;
            c = b;
            if (i1 == 0) {
              f2 = c;
            }
            localObject10 = g;
            i3 = d;
            i2 = e;
            n = f;
            localObject3 = "video/hevc";
          }
          for (;;)
          {
            break;
            if ((i13 != 1685480259) && (i13 != 1685485123))
            {
              if (i13 == 1987076931)
              {
                if (localObject3 == null) {
                  bool = true;
                } else {
                  bool = false;
                }
                x6.b.u(null, bool);
                if (i7 == 1987063864) {
                  localObject3 = "video/x-vnd.on2.vp8";
                } else {
                  localObject3 = "video/x-vnd.on2.vp9";
                }
                paramu.G(i6 + 12);
                paramu.H(2);
                if ((paramu.v() & 0x1) != 0) {
                  i2 = 1;
                } else {
                  i2 = 0;
                }
                i3 = paramu.v();
                n = paramu.v();
                i3 = w5.b.a(i3);
                if (i2 != 0) {
                  i2 = 1;
                } else {
                  i2 = 2;
                }
                n = w5.b.b(n);
              }
              else if (i13 == 1635135811)
              {
                if (localObject3 == null) {
                  bool = true;
                } else {
                  bool = false;
                }
                x6.b.u(null, bool);
                localObject3 = "video/av01";
              }
              else
              {
                if (i13 != 1668050025) {
                  break label3934;
                }
                localObject1 = localObject2;
                if (localObject2 == null) {
                  localObject1 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                }
                ((ByteBuffer)localObject1).position(21);
                ((ByteBuffer)localObject1).putShort(paramu.r());
                ((ByteBuffer)localObject1).putShort(paramu.r());
                localObject2 = localObject1;
              }
              continue;
              label3934:
              if (i13 == 1835295606)
              {
                localObject1 = localObject2;
                if (localObject2 == null) {
                  localObject1 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                }
                short s1 = paramu.r();
                short s2 = paramu.r();
                short s3 = paramu.r();
                short s4 = paramu.r();
                short s5 = paramu.r();
                short s6 = paramu.r();
                short s7 = paramu.r();
                short s8 = paramu.r();
                l1 = paramu.w();
                long l2 = paramu.w();
                ((ByteBuffer)localObject1).position(1);
                ((ByteBuffer)localObject1).putShort(s5);
                ((ByteBuffer)localObject1).putShort(s6);
                ((ByteBuffer)localObject1).putShort(s1);
                ((ByteBuffer)localObject1).putShort(s2);
                ((ByteBuffer)localObject1).putShort(s3);
                ((ByteBuffer)localObject1).putShort(s4);
                ((ByteBuffer)localObject1).putShort(s7);
                ((ByteBuffer)localObject1).putShort(s8);
                ((ByteBuffer)localObject1).putShort((short)(int)(l1 / 10000L));
                ((ByteBuffer)localObject1).putShort((short)(int)(l2 / 10000L));
                localObject2 = localObject1;
                localObject1 = localObject10;
                break label4741;
              }
              localObject1 = localObject10;
              if (i13 == 1681012275)
              {
                if (localObject3 == null) {
                  bool = true;
                } else {
                  bool = false;
                }
                x6.b.u(null, bool);
                localObject3 = "video/3gpp";
              }
              else
              {
                if (i13 == 1702061171)
                {
                  if (localObject3 == null) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  x6.b.u(null, bool);
                  localObject3 = a(i6, paramu);
                  localObject10 = a;
                  localObject9 = b;
                  if (localObject9 != null) {
                    localObject7 = o7.t.t(localObject9);
                  }
                  break label4733;
                }
                if (i13 == 1885434736)
                {
                  paramu.G(i6 + 8);
                  m = paramu.y();
                  i1 = paramu.y();
                  f2 = m / i1;
                  i1 = 1;
                  break label4741;
                }
                if (i13 != 1937126244) {
                  break label4372;
                }
                m = i6 + 8;
                while (m - i6 < i12)
                {
                  paramu.G(m);
                  i9 = paramu.f();
                  if (paramu.f() == 1886547818)
                  {
                    localObject4 = Arrays.copyOfRange(a, m, i9 + m);
                    break label4365;
                  }
                  m += i9;
                }
                localObject4 = null;
              }
              for (;;)
              {
                label4365:
                localObject10 = localObject1;
                break label4721;
                label4372:
                if (i13 != 1936995172) {
                  break;
                }
                m = paramu.v();
                paramu.H(3);
                if (m == 0)
                {
                  m = paramu.v();
                  if (m != 0)
                  {
                    if (m != 1)
                    {
                      if (m != 2)
                      {
                        if (m == 3) {
                          i5 = 3;
                        }
                      }
                      else {
                        i5 = 2;
                      }
                    }
                    else {
                      i5 = 1;
                    }
                  }
                  else {
                    i5 = 0;
                  }
                }
              }
              i9 = i3;
              i6 = n;
              m = i2;
              if (i13 == 1668246642)
              {
                i9 = i3;
                i6 = n;
                m = i2;
                if (i3 == -1)
                {
                  i9 = i3;
                  i6 = n;
                  m = i2;
                  if (i2 == -1)
                  {
                    i9 = i3;
                    i6 = n;
                    m = i2;
                    if (n == -1)
                    {
                      m = paramu.f();
                      if ((m != 1852009592) && (m != 1852009571))
                      {
                        localObject1 = f.l("Unsupported color type: ");
                        ((StringBuilder)localObject1).append(a.a(m));
                        v5.m.f("AtomParsers", ((StringBuilder)localObject1).toString());
                        i9 = i3;
                        i6 = n;
                        m = i2;
                      }
                      else
                      {
                        i3 = paramu.A();
                        n = paramu.A();
                        paramu.H(2);
                        if ((i12 == 19) && ((paramu.v() & 0x80) != 0)) {
                          i2 = 1;
                        } else {
                          i2 = 0;
                        }
                        i9 = w5.b.a(i3);
                        if (i2 != 0) {
                          m = 1;
                        } else {
                          m = 2;
                        }
                        i6 = w5.b.b(n);
                      }
                    }
                  }
                }
              }
            }
            do
            {
              i3 = i9;
              n = i6;
              i2 = m;
              break;
              localObject1 = c.a(paramu);
              i9 = i3;
              i6 = n;
              m = i2;
            } while (localObject1 == null);
            localObject10 = a;
            localObject3 = "video/dolby-vision";
            label4721:
            localObject1 = localObject10;
            localObject10 = localObject3;
            localObject3 = localObject9;
            label4733:
            localObject9 = localObject3;
            localObject3 = localObject10;
            label4741:
            localObject10 = localObject1;
          }
          i11 += i12;
          f1 = f2;
        }
        localObject1 = null;
        if (localObject3 != null)
        {
          localObject8 = new i0.a();
          ((i0.a)localObject8).b(paramInt1);
          k = ((String)localObject3);
          h = ((String)localObject10);
          p = i10;
          q = i8;
          t = f1;
          s = paramInt2;
          u = ((byte[])localObject4);
          v = i5;
          m = ((List)localObject7);
          n = ((d)localObject6);
          if ((i3 != -1) || (i2 != -1) || (n != -1) || (localObject2 != null))
          {
            localObject4 = localObject1;
            if (localObject2 != null) {
              localObject4 = ((ByteBuffer)localObject2).array();
            }
            w = new w5.b(i3, (byte[])localObject4, i2, n);
          }
          if (localObject9 != null)
          {
            f = r7.a.E(c);
            g = r7.a.E(d);
          }
          b = new i0((i0.a)localObject8);
        }
        localObject2 = localObject5;
        i2 = paramInt1;
        n = k;
      }
      paramu.G(i4 + n);
      j++;
      localObject1 = localObject2;
    }
    return (d)localObject1;
  }
  
  public static ArrayList e(a.a parama, c4.p paramp, long paramLong, d paramd, boolean paramBoolean1, boolean paramBoolean2, n7.e parame)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0;; i++)
    {
      Object localObject1 = parama;
      if (i >= d.size()) {
        break label3978;
      }
      Object localObject2 = (a.a)d.get(i);
      if (a == 1953653099)
      {
        Object localObject4;
        int j;
        int k;
        int m;
        int n;
        int i1;
        int i2;
        label371:
        long l1;
        long l2;
        label424:
        long l3;
        Object localObject5;
        Object localObject6;
        label1157:
        label1223:
        Object localObject7;
        do
        {
          localObject3 = ((a.a)localObject1).c(1836476516);
          localObject3.getClass();
          localObject1 = ((a.a)localObject2).b(1835297121);
          localObject1.getClass();
          localObject4 = ((a.a)localObject1).c(1751411826);
          localObject4.getClass();
          localObject4 = b;
          j = 16;
          ((u)localObject4).G(16);
          k = ((u)localObject4).f();
          if (k == 1936684398) {
            k = 1;
          }
          for (;;)
          {
            m = k;
            break;
            if (k == 1986618469) {
              k = 2;
            } else if ((k != 1952807028) && (k != 1935832172) && (k != 1937072756) && (k != 1668047728))
            {
              if (k == 1835365473)
              {
                k = 5;
              }
              else
              {
                m = -1;
                break;
              }
            }
            else {
              k = 3;
            }
          }
          if (m != -1)
          {
            localObject4 = ((a.a)localObject2).c(1953196132);
            localObject4.getClass();
            localObject4 = b;
            ((u)localObject4).G(8);
            n = ((u)localObject4).f() >> 24 & 0xFF;
            k = j;
            if (n == 0) {
              k = 8;
            }
            ((u)localObject4).H(k);
            i1 = ((u)localObject4).f();
            ((u)localObject4).H(4);
            i2 = b;
            if (n == 0) {
              k = 4;
            } else {
              k = 8;
            }
            for (j = 0; j < k; j++) {
              if (a[(i2 + j)] != -1)
              {
                j = 0;
                break label371;
              }
            }
            j = 1;
            if (j != 0)
            {
              ((u)localObject4).H(k);
            }
            else
            {
              if (n == 0) {
                l1 = ((u)localObject4).w();
              } else {
                l1 = ((u)localObject4).z();
              }
              l2 = l1;
              if (l1 != 0L) {
                break label424;
              }
            }
            l2 = -9223372036854775807L;
            ((u)localObject4).H(16);
            k = ((u)localObject4).f();
            n = ((u)localObject4).f();
            ((u)localObject4).H(4);
            j = ((u)localObject4).f();
            i2 = ((u)localObject4).f();
            if ((k == 0) && (n == 65536) && (j == -65536) && (i2 == 0)) {
              k = 90;
            } else if ((k == 0) && (n == -65536) && (j == 65536) && (i2 == 0)) {
              k = 270;
            } else if ((k == -65536) && (n == 0) && (j == 0) && (i2 == -65536)) {
              k = 180;
            } else {
              k = 0;
            }
            if (paramLong == -9223372036854775807L) {
              l1 = l2;
            } else {
              l1 = paramLong;
            }
            localObject3 = b;
            ((u)localObject3).G(8);
            if ((((u)localObject3).f() >> 24 & 0xFF) == 0) {
              j = 8;
            } else {
              j = 16;
            }
            ((u)localObject3).H(j);
            l3 = ((u)localObject3).w();
            l2 = -9223372036854775807L;
            if (l1 == -9223372036854775807L) {
              l1 = l2;
            } else {
              l1 = e0.O(l1, 1000000L, l3);
            }
            localObject3 = ((a.a)localObject1).b(1835626086);
            localObject3.getClass();
            localObject3 = ((a.a)localObject3).b(1937007212);
            localObject3.getClass();
            localObject1 = ((a.a)localObject1).c(1835296868);
            localObject1.getClass();
            localObject1 = b;
            ((u)localObject1).G(8);
            n = ((u)localObject1).f() >> 24 & 0xFF;
            if (n == 0) {
              j = 8;
            } else {
              j = 16;
            }
            ((u)localObject1).H(j);
            l2 = ((u)localObject1).w();
            if (n == 0) {
              j = 4;
            } else {
              j = 8;
            }
            ((u)localObject1).H(j);
            j = ((u)localObject1).A();
            localObject1 = f.l("");
            ((StringBuilder)localObject1).append((char)((j >> 10 & 0x1F) + 96));
            ((StringBuilder)localObject1).append((char)((j >> 5 & 0x1F) + 96));
            ((StringBuilder)localObject1).append((char)((j & 0x1F) + 96));
            localObject4 = Pair.create(Long.valueOf(l2), ((StringBuilder)localObject1).toString());
            localObject1 = ((a.a)localObject3).c(1937011556);
            if (localObject1 == null) {
              break;
            }
            localObject5 = d(b, i1, k, (String)second, paramd, paramBoolean2);
            if (!paramBoolean1)
            {
              localObject1 = ((a.a)localObject2).b(1701082227);
              if (localObject1 != null)
              {
                localObject1 = ((a.a)localObject1).c(1701606260);
                if (localObject1 == null)
                {
                  localObject1 = null;
                }
                else
                {
                  localObject3 = b;
                  ((u)localObject3).G(8);
                  j = ((u)localObject3).f() >> 24 & 0xFF;
                  k = ((u)localObject3).y();
                  localObject1 = new long[k];
                  localObject6 = new long[k];
                  n = 0;
                  while (n < k)
                  {
                    if (j == 1) {
                      l2 = ((u)localObject3).z();
                    } else {
                      l2 = ((u)localObject3).w();
                    }
                    localObject1[n] = l2;
                    if (j == 1) {
                      l2 = ((u)localObject3).o();
                    } else {
                      l2 = ((u)localObject3).f();
                    }
                    localObject6[n] = l2;
                    if (((u)localObject3).r() == 1)
                    {
                      ((u)localObject3).H(2);
                      n++;
                    }
                    else
                    {
                      throw new IllegalArgumentException("Unsupported media rate.");
                    }
                  }
                  localObject1 = Pair.create(localObject1, localObject6);
                }
                if (localObject1 != null)
                {
                  localObject3 = (long[])first;
                  localObject1 = (long[])second;
                  break label1157;
                }
              }
            }
            localObject3 = null;
            localObject1 = null;
            if (b != null) {}
          }
          else
          {
            localObject1 = null;
            break label1223;
          }
          localObject1 = new j(i1, m, ((Long)first).longValue(), l3, l1, b, d, a, c, (long[])localObject3, (long[])localObject1);
          localObject7 = (j)parame.apply(localObject1);
        } while (localObject7 == null);
        localObject1 = ((a.a)localObject2).b(1835297121);
        localObject1.getClass();
        localObject1 = ((a.a)localObject1).b(1835626086);
        localObject1.getClass();
        Object localObject3 = ((a.a)localObject1).b(1937007212);
        localObject3.getClass();
        localObject1 = ((a.a)localObject3).c(1937011578);
        if (localObject1 != null)
        {
          localObject2 = new e((a.b)localObject1, f);
        }
        else
        {
          localObject1 = ((a.a)localObject3).c(1937013298);
          if (localObject1 == null) {
            break;
          }
          localObject2 = new f((a.b)localObject1);
        }
        int i3 = ((c)localObject2).b();
        if (i3 == 0)
        {
          localObject1 = new m((j)localObject7, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        else
        {
          localObject1 = ((a.a)localObject3).c(1937007471);
          boolean bool1;
          if (localObject1 == null)
          {
            localObject1 = ((a.a)localObject3).c(1668232756);
            localObject1.getClass();
            bool1 = true;
          }
          else
          {
            bool1 = false;
          }
          localObject4 = b;
          localObject1 = ((a.a)localObject3).c(1937011555);
          localObject1.getClass();
          localObject6 = b;
          localObject1 = ((a.a)localObject3).c(1937011827);
          localObject1.getClass();
          Object localObject8 = b;
          localObject1 = ((a.a)localObject3).c(1937011571);
          if (localObject1 != null) {
            localObject1 = b;
          } else {
            localObject1 = null;
          }
          localObject3 = ((a.a)localObject3).c(1668576371);
          if (localObject3 != null) {
            localObject5 = b;
          } else {
            localObject5 = null;
          }
          Object localObject9 = new a((u)localObject6, (u)localObject4, bool1);
          ((u)localObject8).G(12);
          int i4 = ((u)localObject8).y() - 1;
          i1 = ((u)localObject8).y();
          int i5 = ((u)localObject8).y();
          if (localObject5 != null)
          {
            ((u)localObject5).G(12);
            m = ((u)localObject5).y();
          }
          else
          {
            m = 0;
          }
          if (localObject1 != null)
          {
            ((u)localObject1).G(12);
            j = ((u)localObject1).y();
            if (j > 0)
            {
              k = ((u)localObject1).y() - 1;
            }
            else
            {
              k = -1;
              localObject1 = null;
            }
          }
          else
          {
            k = -1;
            j = 0;
          }
          i2 = ((c)localObject2).a();
          localObject3 = f.t;
          if ((i2 != -1) && (("audio/raw".equals(localObject3)) || ("audio/g711-mlaw".equals(localObject3)) || ("audio/g711-alaw".equals(localObject3))) && (i4 == 0) && (m == 0) && (j == 0)) {
            n = 1;
          } else {
            n = 0;
          }
          int i6;
          int i7;
          Object localObject10;
          if (n != 0)
          {
            j = a;
            localObject1 = new long[j];
            localObject3 = new int[j];
            while (((a)localObject9).a())
            {
              k = b;
              localObject1[k] = d;
              localObject3[k] = c;
            }
            l2 = i5;
            i6 = 8192 / i2;
            k = 0;
            m = 0;
            while (k < j)
            {
              i1 = localObject3[k];
              n = e0.a;
              m += (i1 + i6 - 1) / i6;
              k++;
            }
            localObject5 = new long[m];
            localObject2 = new int[m];
            localObject6 = new long[m];
            localObject4 = new int[m];
            m = 0;
            k = 0;
            i7 = 0;
            i1 = 0;
            n = i2;
            i2 = i7;
            while (m < j)
            {
              i7 = localObject3[m];
              l1 = localObject1[m];
              while (i7 > 0)
              {
                i5 = Math.min(i6, i7);
                localObject5[i1] = l1;
                i4 = n * i5;
                localObject2[i1] = i4;
                k = Math.max(k, i4);
                localObject6[i1] = (i2 * l2);
                localObject4[i1] = 1;
                l1 += localObject2[i1];
                i2 += i5;
                i7 -= i5;
                i1++;
              }
              m++;
            }
            l1 = i2;
            localObject3 = localObject5;
            localObject1 = localObject4;
            l1 = l2 * l1;
            j = i3;
          }
          else
          {
            localObject3 = new long[i3];
            localObject6 = new int[i3];
            localObject10 = new long[i3];
            localObject4 = new int[i3];
            l2 = 0L;
            l1 = 0L;
            int i8 = 0;
            int i9 = k;
            int i10 = 0;
            i6 = 0;
            k = m;
            n = i1;
            i7 = 0;
            i2 = 0;
            m = i10;
            i1 = i8;
            i8 = j;
            j = i3;
            i3 = i9;
            while (i2 < j)
            {
              boolean bool2;
              for (bool1 = true; i1 == 0; bool1 = bool2)
              {
                bool2 = ((a)localObject9).a();
                bool1 = bool2;
                if (!bool2) {
                  break;
                }
                l1 = d;
                i1 = c;
              }
              i11 = n;
              if (!bool1)
              {
                v5.m.f("AtomParsers", "Unexpected end of chunk data");
                localObject3 = Arrays.copyOf((long[])localObject3, i2);
                localObject1 = Arrays.copyOf((int[])localObject6, i2);
                localObject2 = Arrays.copyOf((long[])localObject10, i2);
                localObject6 = Arrays.copyOf((int[])localObject4, i2);
                j = i2;
                localObject4 = localObject1;
                localObject1 = localObject6;
                break label2570;
              }
              i10 = k;
              n = m;
              i9 = i6;
              if (localObject5 != null)
              {
                while ((i6 == 0) && (k > 0))
                {
                  i6 = ((u)localObject5).y();
                  m = ((u)localObject5).f();
                  k--;
                }
                i9 = i6 - 1;
                n = m;
                i10 = k;
              }
              localObject3[i2] = l1;
              k = ((c)localObject2).c();
              localObject6[i2] = k;
              i6 = i7;
              if (k > i7) {
                i6 = k;
              }
              localObject10[i2] = (l2 + n);
              if (localObject1 == null) {
                k = 1;
              } else {
                k = 0;
              }
              localObject4[i2] = k;
              k = i3;
              int i12 = i8;
              if (i2 == i3)
              {
                localObject4[i2] = 1;
                m = i8 - 1;
                k = i3;
                i12 = m;
                if (m > 0)
                {
                  localObject1.getClass();
                  k = ((u)localObject1).y() - 1;
                  i12 = m;
                }
              }
              l2 += i5;
              i7 = i11 - 1;
              if ((i7 == 0) && (i4 > 0))
              {
                i7 = ((u)localObject8).y();
                m = ((u)localObject8).f();
                i4--;
              }
              else
              {
                m = i5;
              }
              i5 = i7;
              l1 += localObject6[i2];
              i1--;
              i2++;
              i11 = n;
              i3 = k;
              i8 = i12;
              i7 = i6;
              n = i5;
              i5 = m;
              k = i10;
              m = i11;
              i6 = i9;
            }
            int i11 = n;
            localObject1 = localObject4;
            localObject2 = localObject10;
            localObject4 = localObject6;
            label2570:
            l1 = l2 + m;
            if (localObject5 != null) {
              while (k > 0)
              {
                if (((u)localObject5).y() != 0)
                {
                  k = 0;
                  break label2617;
                }
                ((u)localObject5).f();
                k--;
              }
            }
            k = 1;
            label2617:
            if ((i8 == 0) && (i11 == 0) && (i1 == 0) && (i4 == 0) && (i6 == 0) && (k != 0)) {
              break label2794;
            }
            localObject6 = f.l("Inconsistent stbl box for track ");
            ((StringBuilder)localObject6).append(a);
            ((StringBuilder)localObject6).append(": remainingSynchronizationSamples ");
            ((StringBuilder)localObject6).append(i8);
            ((StringBuilder)localObject6).append(", remainingSamplesAtTimestampDelta ");
            ((StringBuilder)localObject6).append(i11);
            ((StringBuilder)localObject6).append(", remainingSamplesInChunk ");
            ((StringBuilder)localObject6).append(i1);
            ((StringBuilder)localObject6).append(", remainingTimestampDeltaChanges ");
            ((StringBuilder)localObject6).append(i4);
            ((StringBuilder)localObject6).append(", remainingSamplesAtTimestampOffset ");
            ((StringBuilder)localObject6).append(i6);
            if (k == 0) {
              localObject5 = ", ctts invalid";
            } else {
              localObject5 = "";
            }
            ((StringBuilder)localObject6).append((String)localObject5);
            v5.m.f("AtomParsers", ((StringBuilder)localObject6).toString());
            label2794:
            localObject6 = localObject2;
            k = i7;
            localObject2 = localObject4;
          }
          Object localObject11 = localObject7;
          l2 = e0.O(l1, 1000000L, c);
          localObject4 = h;
          if (localObject4 == null)
          {
            e0.P((long[])localObject6, c);
            localObject1 = new m((j)localObject11, (long[])localObject3, (int[])localObject2, k, (long[])localObject6, (int[])localObject1, l2);
          }
          else
          {
            if ((localObject4.length == 1) && (b == 1) && (localObject6.length >= 2))
            {
              localObject4 = i;
              localObject4.getClass();
              l3 = localObject4[0];
              l2 = e0.O(h[0], c, d) + l3;
              n = localObject6.length - 1;
              m = e0.i(4, 0, n);
              n = e0.i(localObject6.length - 4, 0, n);
              long l4 = localObject6[0];
              if ((l4 <= l3) && (l3 < localObject6[m]) && (localObject6[n] < l2) && (l2 <= l1)) {
                m = 1;
              } else {
                m = 0;
              }
              if (m != 0)
              {
                l3 = e0.O(l3 - l4, f.H, c);
                l2 = e0.O(l1 - l2, f.H, c);
                if (((l3 != 0L) || (l2 != 0L)) && (l3 <= 2147483647L) && (l2 <= 2147483647L))
                {
                  a = ((int)l3);
                  b = ((int)l2);
                  e0.P((long[])localObject6, c);
                  localObject1 = new m((j)localObject11, (long[])localObject3, (int[])localObject2, k, (long[])localObject6, (int[])localObject1, e0.O(h[0], 1000000L, d));
                  break label3306;
                }
              }
              else
              {
                l2 = 0L;
                break label3185;
              }
            }
            l2 = 0L;
            label3185:
            localObject4 = h;
            if (localObject4.length == 1)
            {
              m = 0;
              if (localObject4[0] == l2)
              {
                localObject4 = i;
                localObject4.getClass();
                l2 = localObject4[0];
                while (m < localObject6.length)
                {
                  localObject6[m] = e0.O(localObject6[m] - l2, 1000000L, c);
                  m++;
                }
                localObject1 = new m((j)localObject11, (long[])localObject3, (int[])localObject2, k, (long[])localObject6, (int[])localObject1, e0.O(l1 - l2, 1000000L, c));
                label3306:
                break label3948;
              }
            }
            i7 = 0;
            if (b == 1) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            localObject10 = new int[localObject4.length];
            int[] arrayOfInt = new int[localObject4.length];
            localObject4 = i;
            localObject4.getClass();
            i1 = 0;
            m = i1;
            i2 = m;
            n = m;
            m = i1;
            for (i1 = i7;; i1++)
            {
              localObject5 = h;
              if (i1 >= localObject5.length) {
                break;
              }
              l2 = localObject4[i1];
              if (l2 != -1L)
              {
                l1 = e0.O(localObject5[i1], c, d);
                i3 = 1;
                localObject10[i1] = e0.f((long[])localObject6, l2, true);
                arrayOfInt[i1] = e0.b((long[])localObject6, l2 + l1, bool1);
                for (;;)
                {
                  i6 = localObject10[i1];
                  i7 = arrayOfInt[i1];
                  if ((i6 >= i7) || ((localObject1[i6] & 0x1) != 0)) {
                    break;
                  }
                  localObject10[i1] = (i6 + 1);
                }
                if (i2 != i6) {
                  i2 = i3;
                } else {
                  i2 = 0;
                }
                m |= i2;
                i2 = i7;
                n = i7 - i6 + n;
              }
            }
            i1 = 1;
            if (n != j) {
              j = i1;
            } else {
              j = 0;
            }
            i7 = m | j;
            if (i7 != 0) {
              localObject4 = new long[n];
            } else {
              localObject4 = localObject3;
            }
            if (i7 != 0) {
              localObject5 = new int[n];
            } else {
              localObject5 = localObject2;
            }
            if (i7 != 0) {
              k = 0;
            }
            if (i7 != 0) {
              localObject7 = new int[n];
            } else {
              localObject7 = localObject1;
            }
            long[] arrayOfLong = new long[n];
            j = 0;
            m = 0;
            l1 = 0L;
            n = k;
            localObject8 = localObject5;
            localObject9 = localObject4;
            localObject4 = localObject10;
            k = j;
            localObject5 = arrayOfInt;
            localObject10 = localObject3;
            localObject3 = localObject1;
            while (k < h.length)
            {
              l2 = i[k];
              i1 = localObject4[k];
              j = localObject5[k];
              if (i7 != 0)
              {
                i2 = j - i1;
                System.arraycopy(localObject10, i1, localObject9, m, i2);
                localObject1 = localObject2;
                System.arraycopy(localObject1, i1, localObject8, m, i2);
                System.arraycopy(localObject3, i1, localObject7, m, i2);
                localObject2 = localObject9;
              }
              else
              {
                localObject1 = localObject2;
                localObject2 = localObject9;
              }
              while (i1 < j)
              {
                arrayOfLong[m] = (e0.O(l1, 1000000L, d) + e0.O(Math.max(0L, localObject6[i1] - l2), 1000000L, c));
                i2 = n;
                if (i7 != 0)
                {
                  i2 = n;
                  if (localObject8[m] > n) {
                    i2 = localObject1[i1];
                  }
                }
                m++;
                i1++;
                n = i2;
              }
              l1 += h[k];
              k++;
              localObject9 = localObject2;
              localObject2 = localObject1;
            }
            localObject1 = new m((j)localObject11, (long[])localObject9, (int[])localObject8, n, arrayOfLong, (int[])localObject7, e0.O(l1, 1000000L, d));
          }
        }
        label3948:
        localArrayList.add(localObject1);
      }
    }
    throw a1.a("Track has no sample table size information", null);
    throw a1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
    label3978:
    return localArrayList;
  }
  
  public static final class a
  {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final u f;
    public final u g;
    public int h;
    public int i;
    
    public a(u paramu1, u paramu2, boolean paramBoolean)
    {
      g = paramu1;
      f = paramu2;
      e = paramBoolean;
      paramu2.G(12);
      a = paramu2.y();
      paramu1.G(12);
      i = paramu1.y();
      int j = paramu1.f();
      paramBoolean = true;
      if (j != 1) {
        paramBoolean = false;
      }
      x6.b.u("first_chunk must be 1", paramBoolean);
      b = -1;
    }
    
    public final boolean a()
    {
      int j = b + 1;
      b = j;
      if (j == a) {
        return false;
      }
      long l;
      if (e) {
        l = f.z();
      } else {
        l = f.w();
      }
      d = l;
      if (b == h)
      {
        c = g.y();
        g.H(4);
        j = i - 1;
        i = j;
        if (j > 0) {
          j = g.y() - 1;
        } else {
          j = -1;
        }
        h = j;
      }
      return true;
    }
  }
  
  public static final class b
  {
    public final String a;
    public final byte[] b;
    public final long c;
    public final long d;
    
    public b(String paramString, byte[] paramArrayOfByte, long paramLong1, long paramLong2)
    {
      a = paramString;
      b = paramArrayOfByte;
      c = paramLong1;
      d = paramLong2;
    }
  }
  
  public static abstract interface c
  {
    public abstract int a();
    
    public abstract int b();
    
    public abstract int c();
  }
  
  public static final class d
  {
    public final k[] a;
    public i0 b;
    public int c;
    public int d;
    
    public d(int paramInt)
    {
      a = new k[paramInt];
      d = 0;
    }
  }
  
  public static final class e
    implements b.c
  {
    public final int a;
    public final int b;
    public final u c;
    
    public e(a.b paramb, i0 parami0)
    {
      paramb = b;
      c = paramb;
      paramb.G(12);
      int i = paramb.y();
      int j = i;
      if ("audio/raw".equals(t))
      {
        int k = e0.w(I, G);
        if (i != 0)
        {
          j = i;
          if (i % k == 0) {}
        }
        else
        {
          parami0 = new StringBuilder();
          parami0.append("Audio sample size mismatch. stsd sample size: ");
          parami0.append(k);
          parami0.append(", stsz sample size: ");
          parami0.append(i);
          v5.m.f("AtomParsers", parami0.toString());
          j = k;
        }
      }
      i = j;
      if (j == 0) {
        i = -1;
      }
      a = i;
      b = paramb.y();
    }
    
    public final int a()
    {
      return a;
    }
    
    public final int b()
    {
      return b;
    }
    
    public final int c()
    {
      int i = a;
      int j = i;
      if (i == -1) {
        j = c.y();
      }
      return j;
    }
  }
  
  public static final class f
    implements b.c
  {
    public final u a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    
    public f(a.b paramb)
    {
      paramb = b;
      a = paramb;
      paramb.G(12);
      c = (paramb.y() & 0xFF);
      b = paramb.y();
    }
    
    public final int a()
    {
      return -1;
    }
    
    public final int b()
    {
      return b;
    }
    
    public final int c()
    {
      int i = c;
      if (i == 8) {
        return a.v();
      }
      if (i == 16) {
        return a.A();
      }
      i = d;
      d = (i + 1);
      if (i % 2 == 0)
      {
        i = a.v();
        e = i;
        return (i & 0xF0) >> 4;
      }
      return e & 0xF;
    }
  }
}

/* Location:
 * Qualified Name:     k4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */