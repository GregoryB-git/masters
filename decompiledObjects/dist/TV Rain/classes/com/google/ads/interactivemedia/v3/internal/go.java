package com.google.ads.interactivemedia.v3.internal;

import a;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import z2;

public final class go
  implements fw
{
  private static final byte[] a = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  private static final byte[] b = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
  private static final byte[] c = wl.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
  private static final byte[] d = { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
  private static final byte[] e = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
  private static final UUID f = new UUID(72057594037932032L, -9223371306706625679L);
  private gr A;
  private boolean B;
  private int C;
  private long D;
  private boolean E;
  private long F = -1L;
  private long G = -1L;
  private long H = -9223372036854775807L;
  private vq I;
  private vq J;
  private boolean K;
  private int L;
  private long M;
  private long N;
  private int O;
  private int P;
  private int[] Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private int V;
  private boolean W;
  private boolean X;
  private boolean Y;
  private boolean Z;
  private byte aa;
  private int ab;
  private int ac;
  private int ad;
  private boolean ae;
  private boolean af;
  private fy ag;
  private final gp g;
  private final gs h;
  private final SparseArray<gr> i;
  private final boolean j;
  private final vy k;
  private final vy l;
  private final vy m;
  private final vy n;
  private final vy o;
  private final vy p;
  private final vy q;
  private final vy r;
  private final vy s;
  private final vy t;
  private ByteBuffer u;
  private long v;
  private long w = -1L;
  private long x = -9223372036854775807L;
  private long y = -9223372036854775807L;
  private long z = -9223372036854775807L;
  
  public go()
  {
    this(0);
  }
  
  public go(int paramInt)
  {
    this(new gp(), paramInt);
  }
  
  private go(gp paramgp, int paramInt)
  {
    g = paramgp;
    boolean bool = false;
    paramgp.a(new gm(this, (byte)0));
    if ((paramInt & 0x1) == 0) {
      bool = true;
    }
    j = bool;
    h = new gs();
    i = new SparseArray();
    m = new vy(4);
    n = new vy(ByteBuffer.allocate(4).putInt(-1).array());
    o = new vy(4);
    k = new vy(vu.a);
    l = new vy(4);
    p = new vy();
    q = new vy();
    r = new vy(8);
    s = new vy();
    t = new vy();
  }
  
  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 181: 
    case 17545: 
    case 21969: 
    case 21970: 
    case 21971: 
    case 21972: 
    case 21973: 
    case 21974: 
    case 21975: 
    case 21976: 
    case 21977: 
    case 21978: 
    case 30323: 
    case 30324: 
    case 30325: 
      return 5;
    case 161: 
    case 163: 
    case 165: 
    case 16981: 
    case 18402: 
    case 21419: 
    case 25506: 
    case 30322: 
      return 4;
    case 160: 
    case 166: 
    case 174: 
    case 183: 
    case 187: 
    case 224: 
    case 225: 
    case 18407: 
    case 19899: 
    case 20532: 
    case 20533: 
    case 21936: 
    case 21968: 
    case 25152: 
    case 28032: 
    case 30113: 
    case 30320: 
    case 290298740: 
    case 357149030: 
    case 374648427: 
    case 408125543: 
    case 440786851: 
    case 475249515: 
    case 524531317: 
      return 1;
    case 134: 
    case 17026: 
    case 21358: 
    case 2274716: 
      return 3;
    }
    return 2;
  }
  
  private final int a(fz paramfz, gi paramgi, int paramInt)
    throws IOException, InterruptedException
  {
    int i1 = p.b();
    if (i1 > 0)
    {
      paramInt = Math.min(paramInt, i1);
      paramgi.a(p, paramInt);
    }
    else
    {
      paramInt = paramgi.a(paramfz, paramInt, false);
    }
    V += paramInt;
    ad += paramInt;
    return paramInt;
  }
  
  private final long a(long paramLong)
    throws ce
  {
    long l1 = x;
    if (l1 != -9223372036854775807L) {
      return wl.c(paramLong, l1, 1000L);
    }
    throw new ce("Can't scale timecode prior to timecodeScale being set.");
  }
  
  private final void a(fz paramfz, int paramInt)
    throws IOException, InterruptedException
  {
    if (m.c() >= paramInt) {
      return;
    }
    vy localvy = m;
    byte[] arrayOfByte = a;
    if (arrayOfByte.length < paramInt) {
      localvy.a(Arrays.copyOf(arrayOfByte, Math.max(arrayOfByte.length << 1, paramInt)), m.c());
    }
    localvy = m;
    paramfz.b(a, localvy.c(), paramInt - m.c());
    m.b(paramInt);
  }
  
  private final void a(fz paramfz, gr paramgr, int paramInt)
    throws IOException, InterruptedException
  {
    if ("S_TEXT/UTF8".equals(b))
    {
      a(paramfz, a, paramInt);
      return;
    }
    if ("S_TEXT/ASS".equals(b))
    {
      a(paramfz, d, paramInt);
      return;
    }
    gi localgi = U;
    boolean bool1 = W;
    boolean bool2 = true;
    int i3;
    if (!bool1)
    {
      Object localObject2;
      if (g)
      {
        T &= 0xBFFFFFFF;
        bool1 = X;
        i1 = 128;
        if (!bool1)
        {
          paramfz.b(m.a, 0, 1);
          V += 1;
          i2 = m.a[0];
          if ((i2 & 0x80) != 128)
          {
            aa = ((byte)i2);
            X = true;
          }
          else
          {
            throw new ce("Extension bit is set in signal byte");
          }
        }
        i3 = aa;
        if ((i3 & 0x1) == 1) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0)
        {
          if ((i3 & 0x2) == 2) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          T |= 0x40000000;
          if (!Y)
          {
            paramfz.b(r.a, 0, 8);
            V += 8;
            Y = true;
            localObject1 = m;
            localObject2 = a;
            if (i2 == 0) {
              i1 = 0;
            }
            localObject2[0] = ((byte)(byte)(i1 | 0x8));
            ((vy)localObject1).c(0);
            localgi.a(m, 1);
            ad += 1;
            r.c(0);
            localgi.a(r, 8);
            ad += 8;
          }
          if (i2 != 0)
          {
            if (!Z)
            {
              paramfz.b(m.a, 0, 1);
              V += 1;
              m.c(0);
              ab = m.e();
              Z = true;
            }
            i2 = ab << 2;
            m.a(i2);
            paramfz.b(m.a, 0, i2);
            V += i2;
            short s1 = (short)(ab / 2 + 1);
            int i4 = s1 * 6 + 2;
            localObject1 = u;
            if ((localObject1 == null) || (((Buffer)localObject1).capacity() < i4)) {
              u = ByteBuffer.allocate(i4);
            }
            u.position(0);
            u.putShort(s1);
            i1 = 0;
            for (i2 = i1;; i2 = i3)
            {
              i3 = ab;
              if (i1 >= i3) {
                break;
              }
              i3 = m.p();
              if (i1 % 2 == 0) {
                u.putShort((short)(i3 - i2));
              } else {
                u.putInt(i3 - i2);
              }
              i1++;
            }
            i2 = paramInt - V - i2;
            if (i3 % 2 == 1)
            {
              u.putInt(i2);
            }
            else
            {
              u.putShort((short)i2);
              u.putInt(0);
            }
            s.a(u.array(), i4);
            localgi.a(s, i4);
            ad += i4;
          }
        }
      }
      else
      {
        localObject1 = h;
        if (localObject1 != null) {
          p.a((byte[])localObject1, localObject1.length);
        }
      }
      if (f > 0)
      {
        T |= 0x10000000;
        t.a();
        m.a(4);
        localObject2 = m;
        localObject1 = a;
        localObject1[0] = ((byte)(byte)(paramInt >>> 24));
        localObject1[1] = ((byte)(byte)(paramInt >> 16));
        localObject1[2] = ((byte)(byte)(paramInt >> 8));
        localObject1[3] = ((byte)(byte)paramInt);
        localgi.a((vy)localObject2, 4);
        ad += 4;
      }
      W = true;
    }
    paramInt = p.c() + paramInt;
    if ((!"V_MPEG4/ISO/AVC".equals(b)) && (!"V_MPEGH/ISO/HEVC".equals(b)))
    {
      if (R != null)
      {
        if (p.c() != 0) {
          bool2 = false;
        }
        rp.c(bool2);
        R.a(paramfz, T, paramInt);
      }
      for (;;)
      {
        i2 = V;
        if (i2 >= paramInt) {
          break;
        }
        a(paramfz, localgi, paramInt - i2);
      }
    }
    Object localObject1 = l.a;
    localObject1[0] = ((byte)0);
    localObject1[1] = ((byte)0);
    localObject1[2] = ((byte)0);
    int i2 = V;
    int i1 = 4 - i2;
    while (V < paramInt)
    {
      i3 = ac;
      if (i3 == 0)
      {
        i3 = Math.min(i2, p.b());
        paramfz.b((byte[])localObject1, i1 + i3, i2 - i3);
        if (i3 > 0) {
          p.a((byte[])localObject1, i1, i3);
        }
        V += i2;
        l.c(0);
        ac = l.p();
        k.c(0);
        localgi.a(k, 4);
        ad += 4;
      }
      else
      {
        ac = (i3 - a(paramfz, localgi, i3));
      }
    }
    if ("A_VORBIS".equals(b))
    {
      n.c(0);
      localgi.a(n, 4);
      ad += 4;
    }
  }
  
  private final void a(fz paramfz, byte[] paramArrayOfByte, int paramInt)
    throws IOException, InterruptedException
  {
    int i1 = paramArrayOfByte.length + paramInt;
    vy localvy = q;
    byte[] arrayOfByte = a;
    if (arrayOfByte.length < i1) {
      a = Arrays.copyOf(paramArrayOfByte, i1 + paramInt);
    } else {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    }
    paramfz.b(q.a, paramArrayOfByte.length, paramInt);
    q.a(i1);
  }
  
  private final void a(gr paramgr, long paramLong)
  {
    gq localgq = R;
    if (localgq != null)
    {
      localgq.a(paramgr, paramLong);
    }
    else
    {
      if ("S_TEXT/UTF8".equals(b)) {
        a(paramgr, "%02d:%02d:%02d,%03d", 19, 1000L, b);
      } else if ("S_TEXT/ASS".equals(b)) {
        a(paramgr, "%01d:%02d:%02d:%02d", 21, 10000L, e);
      }
      if ((T & 0x10000000) != 0)
      {
        int i1 = t.c();
        U.a(t, i1);
        ad += i1;
      }
      U.a(paramLong, T, ad, 0, i);
    }
    ae = true;
    d();
  }
  
  private final void a(gr paramgr, String paramString, int paramInt, long paramLong, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = q.a;
    long l1 = N;
    if (l1 == -9223372036854775807L)
    {
      paramString = paramArrayOfByte;
    }
    else
    {
      int i1 = (int)(l1 / 3600000000L);
      l1 -= i1 * 3600 * 1000000L;
      int i2 = (int)(l1 / 60000000L);
      l1 -= i2 * 60 * 1000000L;
      int i3 = (int)(l1 / 1000000L);
      int i4 = (int)((l1 - i3 * 1000000L) / paramLong);
      paramString = wl.c(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4) }));
    }
    System.arraycopy(paramString, 0, arrayOfByte, paramInt, paramArrayOfByte.length);
    paramgr = U;
    paramString = q;
    paramgr.a(paramString, paramString.c());
    paramInt = ad;
    ad = (q.c() + paramInt);
  }
  
  private static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return new int[paramInt];
    }
    if (paramArrayOfInt.length >= paramInt) {
      return paramArrayOfInt;
    }
    return new int[Math.max(paramArrayOfInt.length << 1, paramInt)];
  }
  
  public static boolean b(int paramInt)
  {
    return (paramInt == 357149030) || (paramInt == 524531317) || (paramInt == 475249515) || (paramInt == 374648427);
  }
  
  private final void d()
  {
    V = 0;
    ad = 0;
    ac = 0;
    W = false;
    X = false;
    Z = false;
    ab = 0;
    aa = ((byte)0);
    Y = false;
    p.a();
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    int i1 = 0;
    ae = false;
    int i2 = 1;
    int i3;
    while ((i2 != 0) && (!ae))
    {
      boolean bool = g.a(paramfz);
      i2 = bool;
      if (bool)
      {
        long l1 = paramfz.c();
        if (E)
        {
          G = l1;
          a = F;
          E = false;
        }
        for (;;)
        {
          i3 = 1;
          break label120;
          if (!B) {
            break;
          }
          l1 = G;
          if (l1 == -1L) {
            break;
          }
          a = l1;
          G = -1L;
        }
        i3 = 0;
        label120:
        i2 = bool;
        if (i3 != 0) {
          return 1;
        }
      }
    }
    if (i2 == 0)
    {
      for (i3 = i1; i3 < i.size(); i3++)
      {
        paramfz = (gr)i.valueAt(i3);
        paramgf = R;
        if (paramgf != null) {
          paramgf.a(paramfz);
        }
      }
      return -1;
    }
    return 0;
  }
  
  public final void a(int paramInt, double paramDouble)
    throws ce
  {
    if (paramInt != 181)
    {
      if (paramInt != 17545)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            break;
          case 30325: 
            A.t = ((float)paramDouble);
            return;
          case 30324: 
            A.s = ((float)paramDouble);
            return;
          }
          A.r = ((float)paramDouble);
          return;
        case 21978: 
          A.L = ((float)paramDouble);
          return;
        case 21977: 
          A.K = ((float)paramDouble);
          return;
        case 21976: 
          A.J = ((float)paramDouble);
          return;
        case 21975: 
          A.I = ((float)paramDouble);
          return;
        case 21974: 
          A.H = ((float)paramDouble);
          return;
        case 21973: 
          A.G = ((float)paramDouble);
          return;
        case 21972: 
          A.F = ((float)paramDouble);
          return;
        case 21971: 
          A.E = ((float)paramDouble);
          return;
        case 21970: 
          A.D = ((float)paramDouble);
          return;
        }
        A.C = ((float)paramDouble);
        return;
      }
      y = (paramDouble);
      return;
    }
    A.O = ((int)paramDouble);
  }
  
  public final void a(int paramInt1, int paramInt2, fz paramfz)
    throws IOException, InterruptedException
  {
    int i1 = 4;
    int i2 = 0;
    Object localObject1;
    if ((paramInt1 != 161) && (paramInt1 != 163))
    {
      if (paramInt1 != 165)
      {
        if (paramInt1 != 16981)
        {
          if (paramInt1 != 18402)
          {
            if (paramInt1 != 21419)
            {
              if (paramInt1 != 25506)
              {
                if (paramInt1 == 30322)
                {
                  localObject1 = A;
                  localObject2 = new byte[paramInt2];
                  u = ((byte[])localObject2);
                  paramfz.b((byte[])localObject2, 0, paramInt2);
                  return;
                }
                throw new ce(z2.k(26, "Unexpected id: ", paramInt1));
              }
              localObject2 = A;
              localObject1 = new byte[paramInt2];
              j = ((byte[])localObject1);
              paramfz.b((byte[])localObject1, 0, paramInt2);
              return;
            }
            Arrays.fill(o.a, (byte)0);
            paramfz.b(o.a, 4 - paramInt2, paramInt2);
            o.c(0);
            C = ((int)o.j());
            return;
          }
          localObject2 = new byte[paramInt2];
          paramfz.b((byte[])localObject2, 0, paramInt2);
          A.i = new gl(1, (byte[])localObject2, 0, 0);
          return;
        }
        localObject2 = A;
        localObject1 = new byte[paramInt2];
        h = ((byte[])localObject1);
        paramfz.b((byte[])localObject1, 0, paramInt2);
        return;
      }
      if (L != 2) {
        return;
      }
      localObject2 = (gr)i.get(R);
      if ((U == 4) && ("V_VP9".equals(b)))
      {
        t.a(paramInt2);
        paramfz.b(t.a, 0, paramInt2);
        return;
      }
      paramfz.b(paramInt2);
      return;
    }
    if (L == 0)
    {
      R = ((int)h.a(paramfz, false, true, 8));
      S = h.b();
      N = -9223372036854775807L;
      L = 1;
      m.a();
    }
    Object localObject2 = (gr)i.get(R);
    if (localObject2 == null)
    {
      paramfz.b(paramInt2 - S);
      L = 0;
      return;
    }
    if (L == 1)
    {
      a(paramfz, 3);
      int i3 = (m.a[2] & 0x6) >> 1;
      if (i3 == 0)
      {
        P = 1;
        localObject1 = a(Q, 1);
        Q = ((int[])localObject1);
        localObject1[0] = (paramInt2 - S - 3);
      }
      else
      {
        if (paramInt1 != 163) {
          break label1225;
        }
        a(paramfz, 4);
        int i4 = (m.a[3] & 0xFF) + 1;
        P = i4;
        localObject1 = a(Q, i4);
        Q = ((int[])localObject1);
        if (i3 == 2)
        {
          i2 = S;
          i1 = P;
          Arrays.fill((int[])localObject1, 0, i1, (paramInt2 - i2 - 4) / i1);
        }
        else
        {
          int i5;
          int i6;
          if (i3 == 1)
          {
            i4 = 0;
            i2 = i4;
            for (;;)
            {
              i3 = P;
              if (i4 >= i3 - 1) {
                break;
              }
              Q[i4] = 0;
              i3 = i1;
              do
              {
                i1 = i3 + 1;
                a(paramfz, i1);
                i5 = m.a[(i1 - 1)] & 0xFF;
                localObject1 = Q;
                i6 = localObject1[i4] + i5;
                localObject1[i4] = i6;
                i3 = i1;
              } while (i5 == 255);
              i2 += i6;
              i4++;
            }
            Q[(i3 - 1)] = (paramInt2 - S - i1 - i2);
          }
          else
          {
            if (i3 != 3) {
              break label1207;
            }
            i4 = 0;
            for (;;)
            {
              i3 = 0;
              i5 = P;
              if (i2 >= i5 - 1) {
                break label1039;
              }
              Q[i2] = 0;
              i5 = i1 + 1;
              a(paramfz, i5);
              localObject1 = m.a;
              i6 = i5 - 1;
              if (localObject1[i6] == 0) {
                break label1028;
              }
              long l1 = 0L;
              long l2;
              for (;;)
              {
                i1 = i5;
                l2 = l1;
                if (i3 >= 8) {
                  break;
                }
                i1 = 1 << 7 - i3;
                if ((m.a[i6] & i1) != 0)
                {
                  i5 += i3;
                  a(paramfz, i5);
                  l2 = i1 & m.a[i6] & 0xFF;
                  for (i1 = i6 + 1;; i1++)
                  {
                    l1 = l2;
                    if (i1 >= i5) {
                      break;
                    }
                    l2 = l1 << 8 | m.a[i1] & 0xFF;
                  }
                  i1 = i5;
                  l2 = l1;
                  if (i2 <= 0) {
                    break;
                  }
                  l2 = l1 - ((1L << i3 * 7 + 6) - 1L);
                  i1 = i5;
                  break;
                }
                i3++;
              }
              if ((l2 < -2147483648L) || (l2 > 2147483647L)) {
                break;
              }
              i3 = (int)l2;
              localObject1 = Q;
              if (i2 != 0) {
                i3 += localObject1[(i2 - 1)];
              }
              localObject1[i2] = i3;
              i4 += i3;
              i2++;
            }
            throw new ce("EBML lacing sample size out of range.");
            label1028:
            throw new ce("No valid varint length mask found");
            label1039:
            Q[(i5 - 1)] = (paramInt2 - S - i1 - i4);
          }
        }
      }
      localObject1 = m.a;
      paramInt2 = localObject1[0];
      i1 = localObject1[1];
      M = (H + a(i1 & 0xFF | paramInt2 << 8));
      i1 = m.a[2];
      if ((i1 & 0x8) == 8) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if ((d != 2) && ((paramInt1 != 163) || ((i1 & 0x80) != 128))) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      if (paramInt2 != 0) {
        paramInt2 = Integer.MIN_VALUE;
      } else {
        paramInt2 = 0;
      }
      T = (i1 | paramInt2);
      L = 2;
      O = 0;
      break label1236;
      label1207:
      throw new ce(z2.k(36, "Unexpected lacing value: ", i3));
      label1225:
      throw new ce("Lacing only supported in SimpleBlocks.");
    }
    label1236:
    if (paramInt1 == 163)
    {
      for (;;)
      {
        paramInt1 = O;
        if (paramInt1 >= P) {
          break;
        }
        a(paramfz, (gr)localObject2, Q[paramInt1]);
        a((gr)localObject2, M + O * e / 1000);
        O += 1;
      }
      L = 0;
      return;
    }
    a(paramfz, (gr)localObject2, Q[0]);
  }
  
  public final void a(int paramInt, long paramLong)
    throws ce
  {
    if (paramInt != 20529)
    {
      if (paramInt != 20530)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            break;
          case 21949: 
            A.B = ((int)paramLong);
            return;
          case 21948: 
            A.A = ((int)paramLong);
            return;
          case 21947: 
            localObject = A;
            w = true;
            paramInt = (int)paramLong;
            if (paramInt != 1)
            {
              if (paramInt != 9)
              {
                if ((paramInt != 4) && (paramInt != 5) && (paramInt != 6) && (paramInt != 7)) {
                  return;
                }
                x = 2;
                return;
              }
              x = 6;
              return;
            }
            x = 1;
            return;
          case 21946: 
            paramInt = (int)paramLong;
            if (paramInt != 1) {
              if (paramInt != 16)
              {
                if (paramInt != 18)
                {
                  if ((paramInt == 6) || (paramInt == 7)) {}
                }
                else {
                  A.y = 7;
                }
              }
              else
              {
                A.y = 6;
                return;
              }
            }
            A.y = 3;
            return;
          case 21945: 
            paramInt = (int)paramLong;
            if (paramInt != 1)
            {
              if (paramInt != 2) {
                return;
              }
              A.z = 1;
              return;
            }
            A.z = 2;
            return;
          }
          break;
        case 2807729: 
          x = paramLong;
          return;
        case 2352003: 
          A.e = ((int)paramLong);
          return;
        case 30321: 
          paramInt = (int)paramLong;
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              if (paramInt != 2)
              {
                if (paramInt != 3) {
                  return;
                }
                A.q = 3;
                return;
              }
              A.q = 2;
              return;
            }
            A.q = 1;
            return;
          }
          A.q = 0;
          return;
        case 25188: 
          A.N = ((int)paramLong);
          return;
        case 22203: 
          A.Q = paramLong;
          return;
        case 22186: 
          A.P = paramLong;
          return;
        case 21998: 
          A.f = ((int)paramLong);
          return;
        case 21930: 
          localObject = A;
          if (paramLong == 1L) {
            bool2 = true;
          }
          S = bool2;
          return;
        case 21690: 
          A.o = ((int)paramLong);
          return;
        case 21682: 
          A.p = ((int)paramLong);
          return;
        case 21680: 
          A.n = ((int)paramLong);
          return;
        case 21432: 
          paramInt = (int)paramLong;
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              if (paramInt != 3)
              {
                if (paramInt != 15) {
                  return;
                }
                A.v = 3;
                return;
              }
              A.v = 1;
              return;
            }
            A.v = 2;
            return;
          }
          A.v = 0;
          return;
        case 21420: 
          D = (paramLong + w);
          return;
        case 18408: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder(56);
          ((StringBuilder)localObject).append("AESSettingsCipherMode ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw new ce(((StringBuilder)localObject).toString());
        case 18401: 
          if (paramLong == 5L) {
            break;
          }
          localObject = new StringBuilder(49);
          ((StringBuilder)localObject).append("ContentEncAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw new ce(((StringBuilder)localObject).toString());
        case 17143: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder(50);
          ((StringBuilder)localObject).append("EBMLReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw new ce(((StringBuilder)localObject).toString());
        case 17029: 
          if ((paramLong >= 1L) && (paramLong <= 2L)) {
            break;
          }
          localObject = new StringBuilder(53);
          ((StringBuilder)localObject).append("DocTypeReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw new ce(((StringBuilder)localObject).toString());
        case 16980: 
          if (paramLong == 3L) {
            break;
          }
          localObject = new StringBuilder(50);
          ((StringBuilder)localObject).append("ContentCompAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw new ce(((StringBuilder)localObject).toString());
        case 251: 
          af = true;
          return;
        case 241: 
          if (K) {
            break;
          }
          J.a(paramLong);
          K = true;
          return;
        case 238: 
          U = ((int)paramLong);
          break;
        case 231: 
          H = a(paramLong);
          return;
        case 215: 
          A.c = ((int)paramLong);
          return;
        case 186: 
          A.m = ((int)paramLong);
          return;
        case 179: 
          I.a(a(paramLong));
          return;
        case 176: 
          A.l = ((int)paramLong);
          return;
        case 159: 
          A.M = ((int)paramLong);
          return;
        case 155: 
          N = a(paramLong);
          return;
        case 136: 
          localObject = A;
          bool2 = bool1;
          if (paramLong == 1L) {
            bool2 = true;
          }
          T = bool2;
          return;
        case 131: 
          A.d = ((int)paramLong);
          return;
        }
      }
      else if (paramLong != 1L)
      {
        localObject = new StringBuilder(55);
        ((StringBuilder)localObject).append("ContentEncodingScope ");
        ((StringBuilder)localObject).append(paramLong);
        ((StringBuilder)localObject).append(" not supported");
        throw new ce(((StringBuilder)localObject).toString());
      }
    }
    else {
      if (paramLong != 0L) {
        break label1246;
      }
    }
    return;
    label1246:
    Object localObject = new StringBuilder(55);
    ((StringBuilder)localObject).append("ContentEncodingOrder ");
    ((StringBuilder)localObject).append(paramLong);
    ((StringBuilder)localObject).append(" not supported");
    throw new ce(((StringBuilder)localObject).toString());
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2)
    throws ce
  {
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 187)
        {
          if (paramInt != 19899)
          {
            if (paramInt != 20533)
            {
              if (paramInt != 21968)
              {
                if (paramInt != 408125543)
                {
                  if (paramInt != 475249515)
                  {
                    if ((paramInt == 524531317) && (!B))
                    {
                      if ((j) && (F != -1L))
                      {
                        E = true;
                        return;
                      }
                      ag.a(new gg(z));
                      B = true;
                    }
                  }
                  else
                  {
                    I = new vq();
                    J = new vq();
                  }
                }
                else
                {
                  long l1 = w;
                  if ((l1 != -1L) && (l1 != paramLong1)) {
                    throw new ce("Multiple Segment elements not supported");
                  }
                  w = paramLong1;
                  v = paramLong2;
                }
              }
              else {
                A.w = true;
              }
              return;
            }
            A.g = true;
            return;
          }
          C = -1;
          D = -1L;
          return;
        }
        K = false;
        return;
      }
      A = new gr((byte)0);
      return;
    }
    af = false;
  }
  
  public final void a(int paramInt, String paramString)
    throws ce
  {
    if (paramInt != 134)
    {
      if (paramInt != 17026)
      {
        if (paramInt != 21358)
        {
          if (paramInt == 2274716) {
            gr.a(A, paramString);
          }
        }
        else {
          A.a = paramString;
        }
      }
      else if ((!"webm".equals(paramString)) && (!"matroska".equals(paramString))) {
        throw new ce(z2.l(a.b(paramString, 22), "DocType ", paramString, " not supported"));
      }
      return;
    }
    A.b = paramString;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    H = -9223372036854775807L;
    int i1 = 0;
    L = 0;
    g.a();
    h.a();
    d();
    while (i1 < i.size())
    {
      gq localgq = i.valueAt(i1)).R;
      if (localgq != null) {
        localgq.a();
      }
      i1++;
    }
  }
  
  public final void a(fy paramfy)
  {
    ag = paramfy;
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return new gt().a(paramfz);
  }
  
  public final void c() {}
  
  public final void c(int paramInt)
    throws ce
  {
    int i1 = 0;
    int i2 = 0;
    if (paramInt != 160)
    {
      Object localObject1;
      if (paramInt != 174)
      {
        long l1;
        if (paramInt != 19899)
        {
          if (paramInt != 25152)
          {
            if (paramInt != 28032)
            {
              if (paramInt != 357149030)
              {
                if (paramInt != 374648427)
                {
                  if ((paramInt == 475249515) && (!B))
                  {
                    localObject1 = ag;
                    if ((w != -1L) && (z != -9223372036854775807L))
                    {
                      localObject2 = I;
                      if ((localObject2 != null) && (((vq)localObject2).a() != 0))
                      {
                        localObject2 = J;
                        if ((localObject2 != null) && (((vq)localObject2).a() == I.a()))
                        {
                          int i3 = I.a();
                          int[] arrayOfInt = new int[i3];
                          long[] arrayOfLong1 = new long[i3];
                          long[] arrayOfLong2 = new long[i3];
                          localObject2 = new long[i3];
                          for (i1 = 0;; i1++)
                          {
                            paramInt = i2;
                            if (i1 >= i3) {
                              break;
                            }
                            localObject2[i1] = I.a(i1);
                            l1 = w;
                            arrayOfLong1[i1] = (J.a(i1) + l1);
                          }
                          for (;;)
                          {
                            i1 = i3 - 1;
                            if (paramInt >= i1) {
                              break;
                            }
                            i1 = paramInt + 1;
                            arrayOfInt[paramInt] = ((int)(arrayOfLong1[i1] - arrayOfLong1[paramInt]));
                            localObject2[i1] -= localObject2[paramInt];
                            paramInt = i1;
                          }
                          arrayOfInt[i1] = ((int)(w + v - arrayOfLong1[i1]));
                          arrayOfLong2[i1] = (z - localObject2[i1]);
                          I = null;
                          J = null;
                          localObject2 = new fv(arrayOfInt, arrayOfLong1, arrayOfLong2, (long[])localObject2);
                          break label359;
                        }
                      }
                    }
                    I = null;
                    J = null;
                    localObject2 = new gg(z);
                    label359:
                    ((fy)localObject1).a((ge)localObject2);
                    B = true;
                  }
                }
                else if (i.size() != 0) {
                  ag.a();
                } else {
                  throw new ce("No valid tracks were found");
                }
              }
              else
              {
                if (x == -9223372036854775807L) {
                  x = 1000000L;
                }
                l1 = y;
                if (l1 != -9223372036854775807L) {
                  z = a(l1);
                }
              }
            }
            else
            {
              localObject2 = A;
              if ((g) && (h != null)) {
                throw new ce("Combining encryption and compression is not supported");
              }
            }
          }
          else
          {
            localObject2 = A;
            if (g)
            {
              if (i != null)
              {
                k = new fe(new fe.a[] { new fe.a(av.a, "video/webm", A.i.b) });
                return;
              }
              throw new ce("Encrypted Track found but ContentEncKeyID was not found");
            }
          }
        }
        else
        {
          paramInt = C;
          if (paramInt == -1) {
            break label602;
          }
          l1 = D;
          if (l1 == -1L) {
            break label602;
          }
          if (paramInt == 475249515) {
            F = l1;
          }
        }
        return;
        label602:
        throw new ce("Mandatory element SeekID or SeekPosition not found");
      }
      Object localObject2 = A.b;
      if ((!"V_VP8".equals(localObject2)) && (!"V_VP9".equals(localObject2)) && (!"V_AV1".equals(localObject2)) && (!"V_MPEG2".equals(localObject2)) && (!"V_MPEG4/ISO/SP".equals(localObject2)) && (!"V_MPEG4/ISO/ASP".equals(localObject2)) && (!"V_MPEG4/ISO/AP".equals(localObject2)) && (!"V_MPEG4/ISO/AVC".equals(localObject2)) && (!"V_MPEGH/ISO/HEVC".equals(localObject2)) && (!"V_MS/VFW/FOURCC".equals(localObject2)) && (!"V_THEORA".equals(localObject2)) && (!"A_OPUS".equals(localObject2)) && (!"A_VORBIS".equals(localObject2)) && (!"A_AAC".equals(localObject2)) && (!"A_MPEG/L2".equals(localObject2)) && (!"A_MPEG/L3".equals(localObject2)) && (!"A_AC3".equals(localObject2)) && (!"A_EAC3".equals(localObject2)) && (!"A_TRUEHD".equals(localObject2)) && (!"A_DTS".equals(localObject2)) && (!"A_DTS/EXPRESS".equals(localObject2)) && (!"A_DTS/LOSSLESS".equals(localObject2)) && (!"A_FLAC".equals(localObject2)) && (!"A_MS/ACM".equals(localObject2)) && (!"A_PCM/INT/LIT".equals(localObject2)) && (!"S_TEXT/UTF8".equals(localObject2)) && (!"S_TEXT/ASS".equals(localObject2)) && (!"S_VOBSUB".equals(localObject2)) && (!"S_HDMV/PGS".equals(localObject2)))
      {
        paramInt = i1;
        if (!"S_DVBSUB".equals(localObject2)) {}
      }
      else
      {
        paramInt = 1;
      }
      if (paramInt != 0)
      {
        localObject2 = A;
        ((gr)localObject2).a(ag, c);
        localObject1 = i;
        localObject2 = A;
        ((SparseArray)localObject1).put(c, localObject2);
      }
      A = null;
      return;
    }
    if (L != 2) {
      return;
    }
    if (!af) {
      T |= 0x1;
    }
    a((gr)i.get(R), M);
    L = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.go
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */