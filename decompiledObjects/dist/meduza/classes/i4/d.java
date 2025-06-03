package i4;

import android.util.Pair;
import android.util.SparseArray;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import c4.v;
import c4.v.a;
import c4.w;
import f;
import g;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.n;
import v5.p;
import v5.q;
import v5.u;

public final class d
  implements c4.h
{
  public static final byte[] c0 = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  public static final byte[] d0 = e0.B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
  public static final byte[] e0 = { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
  public static final byte[] f0 = { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
  public static final UUID g0 = new UUID(72057594037932032L, -9223371306706625679L);
  public static final Map<String, Integer> h0;
  public long A = -1L;
  public long B = -9223372036854775807L;
  public n C;
  public n D;
  public boolean E;
  public boolean F;
  public int G;
  public long H;
  public long I;
  public int J;
  public int K;
  public int[] L;
  public int M;
  public int N;
  public int O;
  public int P;
  public boolean Q;
  public long R;
  public int S;
  public int T;
  public int U;
  public boolean V;
  public boolean W;
  public boolean X;
  public int Y;
  public byte Z;
  public final c a;
  public boolean a0;
  public final e b;
  public j b0;
  public final SparseArray<b> c;
  public final boolean d;
  public final u e;
  public final u f;
  public final u g;
  public final u h;
  public final u i;
  public final u j;
  public final u k;
  public final u l;
  public final u m;
  public final u n;
  public ByteBuffer o;
  public long p;
  public long q = -1L;
  public long r = -9223372036854775807L;
  public long s = -9223372036854775807L;
  public long t = -9223372036854775807L;
  public b u;
  public boolean v;
  public int w;
  public long x;
  public boolean y;
  public long z = -1L;
  
  static
  {
    HashMap localHashMap = new HashMap();
    g.k(0, localHashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
    h0 = Collections.unmodifiableMap(localHashMap);
  }
  
  public d(int paramInt)
  {
    a = locala;
    d = new a();
    boolean bool;
    if ((paramInt & 0x1) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    b = new e();
    c = new SparseArray();
    g = new u(4);
    h = new u(ByteBuffer.allocate(4).putInt(-1).array());
    i = new u(4);
    e = new u(q.a);
    f = new u(4);
    j = new u();
    k = new u();
    l = new u(8);
    m = new u();
    n = new u();
    L = new int[1];
  }
  
  public static byte[] g(long paramLong1, long paramLong2, String paramString)
  {
    boolean bool;
    if (paramLong1 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    int i1 = (int)(paramLong1 / 3600000000L);
    paramLong1 -= i1 * 3600L * 1000000L;
    int i2 = (int)(paramLong1 / 60000000L);
    paramLong1 -= i2 * 60L * 1000000L;
    int i3 = (int)(paramLong1 / 1000000L);
    int i4 = (int)((paramLong1 - i3 * 1000000L) / paramLong2);
    return e0.B(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4) }));
  }
  
  public final void a(int paramInt)
  {
    if ((C != null) && (D != null)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a Cues");
    throw a1.a(localStringBuilder.toString(), null);
  }
  
  public final void b(j paramj)
  {
    b0 = paramj;
  }
  
  public final void c(int paramInt)
  {
    if (u != null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a TrackEntry");
    throw a1.a(localStringBuilder.toString(), null);
  }
  
  public final int d(i parami, s params)
  {
    F = false;
    int i1 = 1;
    if ((i1 != 0) && (!F))
    {
      a locala = (a)a;
      x6.b.K(d);
      for (;;)
      {
        int i2 = 0;
        Object localObject1 = (a.a)b.peek();
        long l1;
        long l2;
        int i3;
        label213:
        int i4;
        if ((localObject1 != null) && (parami.getPosition() >= b))
        {
          localObject1 = d;
          i1 = b.pop()).a;
          ((a)localObject1).a(i1);
        }
        else
        {
          if (e == 0)
          {
            l1 = c.b(parami, true, false, 4);
            l2 = l1;
            if (l1 == -2L)
            {
              parami.i();
              for (;;)
              {
                parami.m(a, 0, 4);
                i3 = a[0];
                i1 = 0;
                for (;;)
                {
                  localObject1 = e.d;
                  if (i1 >= 8) {
                    break;
                  }
                  l1 = localObject1[i1];
                  l2 = i3;
                  i1++;
                  if ((l2 & l1) != 0L) {
                    break label213;
                  }
                }
                i1 = -1;
                if ((i1 != -1) && (i1 <= 4))
                {
                  i4 = (int)e.a(a, i1, false);
                  d).a.getClass();
                  if ((i4 != 357149030) && (i4 != 524531317) && (i4 != 475249515) && (i4 != 374648427)) {
                    i3 = 0;
                  } else {
                    i3 = 1;
                  }
                  if (i3 != 0)
                  {
                    parami.j(i1);
                    l2 = i4;
                    break;
                  }
                }
                parami.j(1);
              }
            }
            if (l2 == -1L)
            {
              i1 = 0;
              break label5889;
            }
            f = ((int)l2);
            e = 1;
          }
          if (e == 1)
          {
            g = c.b(parami, false, true, 8);
            e = 2;
          }
          localObject1 = d;
          i1 = f;
          a.getClass();
          switch (i1)
          {
          default: 
            i1 = 0;
            break;
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
            i1 = 5;
            break;
          case 161: 
          case 163: 
          case 165: 
          case 16877: 
          case 16981: 
          case 18402: 
          case 21419: 
          case 25506: 
          case 30322: 
            i1 = 4;
            break;
          case 160: 
          case 166: 
          case 174: 
          case 183: 
          case 187: 
          case 224: 
          case 225: 
          case 16868: 
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
            i1 = 1;
            break;
          case 134: 
          case 17026: 
          case 21358: 
          case 2274716: 
            i1 = 3;
            break;
          case 131: 
          case 136: 
          case 155: 
          case 159: 
          case 176: 
          case 179: 
          case 186: 
          case 215: 
          case 231: 
          case 238: 
          case 241: 
          case 251: 
          case 16871: 
          case 16980: 
          case 17029: 
          case 17143: 
          case 18401: 
          case 18408: 
          case 20529: 
          case 20530: 
          case 21420: 
          case 21432: 
          case 21680: 
          case 21682: 
          case 21690: 
          case 21930: 
          case 21945: 
          case 21946: 
          case 21947: 
          case 21948: 
          case 21949: 
          case 21998: 
          case 22186: 
          case 22203: 
          case 25188: 
          case 30114: 
          case 30321: 
          case 2352003: 
          case 2807729: 
            i1 = 2;
          }
          if (i1 == 0) {
            break label5984;
          }
          if (i1 == 1) {
            break label5501;
          }
          if (i1 == 2) {
            break label3835;
          }
          if (i1 == 3) {
            break label3536;
          }
          if (i1 == 4) {
            break label1832;
          }
          if (i1 != 5) {
            break label1801;
          }
          l2 = g;
          if ((l2 != 4L) && (l2 != 8L))
          {
            parami = f.l("Invalid float size: ");
            parami.append(g);
            throw a1.a(parami.toString(), null);
          }
          localObject1 = d;
          i4 = f;
          i3 = (int)l2;
          parami.readFully(a, 0, i3);
          l2 = 0L;
          for (i1 = 0; i1 < i3; i1++) {
            l2 = l2 << 8 | a[i1] & 0xFF;
          }
          double d1;
          if (i3 == 4) {
            d1 = Float.intBitsToFloat((int)l2);
          } else {
            d1 = Double.longBitsToDouble(l2);
          }
          localObject1 = a;
          if (i4 != 181)
          {
            if (i4 != 17545)
            {
              switch (i4)
              {
              default: 
                switch (i4)
                {
                }
                break;
              case 21978: 
                ((d)localObject1).c(i4);
                u.M = ((float)d1);
                break;
              case 21977: 
                ((d)localObject1).c(i4);
                u.L = ((float)d1);
                break;
              case 21976: 
                ((d)localObject1).c(i4);
                u.K = ((float)d1);
                break;
              case 21975: 
                ((d)localObject1).c(i4);
                u.J = ((float)d1);
                break;
              case 21974: 
                ((d)localObject1).c(i4);
                u.I = ((float)d1);
                break;
              case 21973: 
                ((d)localObject1).c(i4);
                u.H = ((float)d1);
                break;
              case 21972: 
                ((d)localObject1).c(i4);
                u.G = ((float)d1);
                break;
              case 21971: 
                ((d)localObject1).c(i4);
                u.F = ((float)d1);
                break;
              case 21970: 
                ((d)localObject1).c(i4);
                u.E = ((float)d1);
                break;
              case 21969: 
                ((d)localObject1).c(i4);
                u.D = ((float)d1);
                break label1790;
                ((d)localObject1).c(i4);
                u.u = ((float)d1);
                break label1790;
                ((d)localObject1).c(i4);
                u.t = ((float)d1);
                break label1790;
                ((d)localObject1).c(i4);
                u.s = ((float)d1);
                break;
              }
              localObject1.getClass();
            }
            else
            {
              s = (d1);
            }
          }
          else
          {
            ((d)localObject1).c(i4);
            u.Q = ((int)d1);
          }
          label1790:
          e = 0;
        }
        i1 = 1;
        break label5889;
        label1801:
        parami = new StringBuilder();
        parami.append("Invalid element type ");
        parami.append(i1);
        throw a1.a(parami.toString(), null);
        label1832:
        localObject1 = d;
        int i5 = f;
        int i6 = (int)g;
        Object localObject2 = a;
        localObject2.getClass();
        if ((i5 != 161) && (i5 != 163))
        {
          if (i5 != 165)
          {
            if (i5 != 16877)
            {
              if (i5 != 16981)
              {
                if (i5 != 18402)
                {
                  if (i5 != 21419)
                  {
                    if (i5 != 25506)
                    {
                      if (i5 == 30322)
                      {
                        ((d)localObject2).c(i5);
                        localObject2 = u;
                        localObject1 = new byte[i6];
                        v = ((byte[])localObject1);
                        parami.readFully((byte[])localObject1, 0, i6);
                      }
                      else
                      {
                        parami = new StringBuilder();
                        parami.append("Unexpected id: ");
                        parami.append(i5);
                        throw a1.a(parami.toString(), null);
                      }
                    }
                    else
                    {
                      ((d)localObject2).c(i5);
                      localObject1 = u;
                      localObject2 = new byte[i6];
                      k = ((byte[])localObject2);
                      parami.readFully((byte[])localObject2, 0, i6);
                    }
                  }
                  else
                  {
                    Arrays.fill(i.a, (byte)0);
                    parami.readFully(i.a, 4 - i6, i6);
                    i.G(0);
                    w = ((int)i.w());
                  }
                }
                else
                {
                  localObject1 = new byte[i6];
                  parami.readFully((byte[])localObject1, 0, i6);
                  ((d)localObject2).c(i5);
                  u.j = new v.a(1, (byte[])localObject1, 0, 0);
                }
              }
              else
              {
                ((d)localObject2).c(i5);
                localObject2 = u;
                localObject1 = new byte[i6];
                i = ((byte[])localObject1);
                parami.readFully((byte[])localObject1, 0, i6);
              }
            }
            else
            {
              ((d)localObject2).c(i5);
              localObject2 = u;
              i1 = g;
              if ((i1 != 1685485123) && (i1 != 1685480259))
              {
                parami.j(i6);
              }
              else
              {
                localObject1 = new byte[i6];
                N = ((byte[])localObject1);
                parami.readFully((byte[])localObject1, 0, i6);
              }
            }
          }
          else if (G == 2)
          {
            localObject1 = (b)c.get(M);
            if ((P == 4) && ("V_VP9".equals(b)))
            {
              n.D(i6);
              parami.readFully(n.a, 0, i6);
            }
            else
            {
              parami.j(i6);
            }
          }
        }
        else
        {
          if (G == 0)
          {
            M = ((int)b.b(parami, false, true, 8));
            N = b.c;
            I = -9223372036854775807L;
            G = 1;
            g.D(0);
          }
          b localb = (b)c.get(M);
          if (localb == null)
          {
            parami.j(i6 - N);
          }
          else
          {
            X.getClass();
            if (G == 1)
            {
              ((d)localObject2).h(parami, 3);
              i3 = (g.a[2] & 0x6) >> 1;
              if (i3 == 0)
              {
                K = 1;
                localObject1 = L;
                if (localObject1 == null) {
                  localObject1 = new int[1];
                } else if (localObject1.length < 1) {
                  localObject1 = new int[Math.max(localObject1.length * 2, 1)];
                }
                L = ((int[])localObject1);
                localObject1[0] = (i6 - N - 3);
              }
              else
              {
                ((d)localObject2).h(parami, 4);
                i1 = (g.a[3] & 0xFF) + 1;
                K = i1;
                localObject1 = L;
                if (localObject1 == null) {
                  localObject1 = new int[i1];
                }
                for (;;)
                {
                  break;
                  if (localObject1.length < i1) {
                    localObject1 = new int[Math.max(localObject1.length * 2, i1)];
                  }
                }
                L = ((int[])localObject1);
                if (i3 == 2)
                {
                  i3 = N;
                  i1 = K;
                  Arrays.fill((int[])localObject1, 0, i1, (i6 - i3 - 4) / i1);
                }
                else
                {
                  i1 = 4;
                  int i7;
                  int i8;
                  if (i3 == 1)
                  {
                    i4 = 0;
                    i3 = i4;
                    for (;;)
                    {
                      i7 = K - 1;
                      if (i4 >= i7) {
                        break;
                      }
                      L[i4] = 0;
                      i7 = i1;
                      do
                      {
                        i1 = i7 + 1;
                        ((d)localObject2).h(parami, i1);
                        i2 = g.a[(i1 - 1)] & 0xFF;
                        localObject1 = L;
                        i8 = localObject1[i4] + i2;
                        localObject1[i4] = i8;
                        i7 = i1;
                      } while (i2 == 255);
                      i3 += i8;
                      i4++;
                    }
                    L[i7] = (i6 - N - i1 - i3);
                  }
                  else
                  {
                    if (i3 != 3) {
                      break label3346;
                    }
                    i4 = 1;
                    i1 = 4;
                    i7 = 0;
                    i8 = -1;
                    i3 = i7;
                    for (;;)
                    {
                      i8 = K + i8;
                      if (i2 >= i8) {
                        break label3204;
                      }
                      L[i2] = i3;
                      i1++;
                      ((d)localObject2).h(parami, i1);
                      localObject1 = g.a;
                      i8 = i1 - 1;
                      if (localObject1[i8] == 0) {
                        break label3196;
                      }
                      while (i3 < 8)
                      {
                        int i9 = i4 << 7 - i3;
                        if ((g.a[i8] & i9) != 0)
                        {
                          i4 = i1 + i3;
                          ((d)localObject2).h(parami, i4);
                          localObject1 = g.a;
                          i1 = i8 + 1;
                          for (l2 = i9 & localObject1[i8] & 0xFF;; l2 = l2 << 8 | localObject1[i8] & 0xFF)
                          {
                            i8 = i1;
                            if (i8 >= i4) {
                              break;
                            }
                            localObject1 = g.a;
                            i1 = i8 + 1;
                          }
                          l1 = l2;
                          i1 = i4;
                          if (i2 <= 0) {
                            break label3109;
                          }
                          l1 = l2 - ((1L << i3 * 7 + 6) - 1L);
                          i1 = i4;
                          break label3109;
                        }
                        i3++;
                        i4 = 1;
                      }
                      l1 = 0L;
                      label3109:
                      if ((l1 < -2147483648L) || (l1 > 2147483647L)) {
                        break;
                      }
                      i3 = (int)l1;
                      localObject1 = L;
                      if (i2 != 0) {
                        i3 += localObject1[(i2 - 1)];
                      }
                      localObject1[i2] = i3;
                      i7 += i3;
                      i2++;
                      i3 = 0;
                      i4 = 1;
                      i8 = -1;
                    }
                    throw a1.a("EBML lacing sample size out of range.", null);
                    label3196:
                    throw a1.a("No valid varint length mask found", null);
                    label3204:
                    L[i8] = (i6 - N - i1 - i7);
                  }
                }
              }
              localObject1 = g.a;
              i1 = localObject1[0];
              i3 = localObject1[1];
              l2 = B;
              H = (((d)localObject2).k(i3 & 0xFF | i1 << 8) + l2);
              if ((d != 2) && ((i5 != 163) || ((g.a[2] & 0x80) != 128))) {
                i1 = 0;
              } else {
                i1 = 1;
              }
              O = i1;
              G = 2;
              J = 0;
              break label3378;
              label3346:
              parami = new StringBuilder();
              parami.append("Unexpected lacing value: ");
              parami.append(i3);
              throw a1.a(parami.toString(), null);
            }
            label3378:
            if (i5 != 163) {
              break label3482;
            }
            for (;;)
            {
              i1 = J;
              if (i1 >= K) {
                break;
              }
              i1 = ((d)localObject2).l(parami, localb, L[i1], false);
              l2 = H;
              ((d)localObject2).e(localb, J * e / 1000 + l2, O, i1, 0);
              J += 1;
            }
          }
          G = 0;
          break label5881;
          for (;;)
          {
            label3482:
            i1 = J;
            if (i1 >= K) {
              break;
            }
            localObject1 = L;
            localObject1[i1] = ((d)localObject2).l(parami, localb, localObject1[i1], true);
            J += 1;
          }
          label3536:
          l2 = g;
          if (l2 <= 2147483647L)
          {
            localObject2 = d;
            i4 = f;
            i1 = (int)l2;
            if (i1 == 0)
            {
              localObject1 = "";
            }
            else
            {
              localObject1 = new byte[i1];
              parami.readFully((byte[])localObject1, 0, i1);
              while (i1 > 0)
              {
                i3 = i1 - 1;
                if (localObject1[i3] != 0) {
                  break;
                }
                i1 = i3;
              }
              localObject1 = new String((byte[])localObject1, 0, i1);
            }
            localObject2 = a;
            localObject2.getClass();
            if (i4 != 134)
            {
              if (i4 != 17026)
              {
                if (i4 != 21358)
                {
                  if (i4 == 2274716)
                  {
                    ((d)localObject2).c(i4);
                    u.W = ((String)localObject1);
                  }
                }
                else
                {
                  ((d)localObject2).c(i4);
                  u.a = ((String)localObject1);
                }
              }
              else if ((!"webm".equals(localObject1)) && (!"matroska".equals(localObject1)))
              {
                parami = new StringBuilder();
                parami.append("DocType ");
                parami.append((String)localObject1);
                parami.append(" not supported");
                throw a1.a(parami.toString(), null);
              }
            }
            else
            {
              ((d)localObject2).c(i4);
              u.b = ((String)localObject1);
            }
          }
          else
          {
            parami = f.l("String element size: ");
            parami.append(g);
            throw a1.a(parami.toString(), null);
            label3835:
            l2 = g;
            if (l2 <= 8L)
            {
              localObject1 = d;
              i3 = f;
              i4 = (int)l2;
              parami.readFully(a, 0, i4);
              i1 = 0;
              l2 = 0L;
              while (i1 < i4)
              {
                l2 = l2 << 8 | a[i1] & 0xFF;
                i1++;
              }
              localObject1 = a;
              localObject1.getClass();
              if (i3 != 20529)
              {
                if (i3 != 20530)
                {
                  boolean bool;
                  switch (i3)
                  {
                  default: 
                    switch (i3)
                    {
                    }
                    break;
                  case 2807729: 
                    r = l2;
                    break;
                  case 2352003: 
                    ((d)localObject1).c(i3);
                    u.e = ((int)l2);
                    break;
                  case 30321: 
                    ((d)localObject1).c(i3);
                    i1 = (int)l2;
                    if (i1 != 0)
                    {
                      if (i1 != 1)
                      {
                        if (i1 != 2)
                        {
                          if (i1 != 3) {
                            break;
                          }
                          u.r = 3;
                          break;
                        }
                        localObject1 = u;
                        i1 = 2;
                      }
                      else
                      {
                        localObject1 = u;
                        i1 = 1;
                      }
                    }
                    else
                    {
                      localObject1 = u;
                      i1 = 0;
                    }
                    r = i1;
                    break;
                  case 30114: 
                    R = l2;
                    break;
                  case 25188: 
                    ((d)localObject1).c(i3);
                    u.P = ((int)l2);
                    break;
                  case 22203: 
                    ((d)localObject1).c(i3);
                    u.S = l2;
                    break;
                  case 22186: 
                    ((d)localObject1).c(i3);
                    u.R = l2;
                    break;
                  case 21998: 
                    ((d)localObject1).c(i3);
                    u.f = ((int)l2);
                    break;
                  case 21930: 
                    ((d)localObject1).c(i3);
                    localObject1 = u;
                    if (l2 == 1L) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    U = bool;
                    break;
                  case 21690: 
                    ((d)localObject1).c(i3);
                    u.p = ((int)l2);
                    break;
                  case 21682: 
                    ((d)localObject1).c(i3);
                    u.q = ((int)l2);
                    break;
                  case 21680: 
                    ((d)localObject1).c(i3);
                    u.o = ((int)l2);
                    break;
                  case 21432: 
                    i1 = (int)l2;
                    ((d)localObject1).c(i3);
                    if (i1 != 0)
                    {
                      if (i1 != 1)
                      {
                        if (i1 != 3)
                        {
                          if (i1 != 15) {
                            break;
                          }
                          u.w = 3;
                          break;
                        }
                        localObject1 = u;
                        i1 = 1;
                      }
                      else
                      {
                        localObject1 = u;
                        i1 = 2;
                      }
                    }
                    else
                    {
                      localObject1 = u;
                      i1 = 0;
                    }
                    w = i1;
                    break;
                  case 21420: 
                    x = (l2 + q);
                    break;
                  case 18408: 
                    if (l2 == 1L) {
                      break;
                    }
                    parami = new StringBuilder();
                    parami.append("AESSettingsCipherMode ");
                    parami.append(l2);
                    parami.append(" not supported");
                    throw a1.a(parami.toString(), null);
                  case 18401: 
                    if (l2 == 5L) {
                      break;
                    }
                    parami = new StringBuilder();
                    parami.append("ContentEncAlgo ");
                    parami.append(l2);
                    parami.append(" not supported");
                    throw a1.a(parami.toString(), null);
                  case 17143: 
                    if (l2 == 1L) {
                      break;
                    }
                    parami = new StringBuilder();
                    parami.append("EBMLReadVersion ");
                    parami.append(l2);
                    parami.append(" not supported");
                    throw a1.a(parami.toString(), null);
                  case 17029: 
                    if ((l2 >= 1L) && (l2 <= 2L)) {
                      break;
                    }
                    parami = new StringBuilder();
                    parami.append("DocTypeReadVersion ");
                    parami.append(l2);
                    parami.append(" not supported");
                    throw a1.a(parami.toString(), null);
                  case 16980: 
                    if (l2 == 3L) {
                      break;
                    }
                    parami = new StringBuilder();
                    parami.append("ContentCompAlgo ");
                    parami.append(l2);
                    parami.append(" not supported");
                    throw a1.a(parami.toString(), null);
                  case 16871: 
                    ((d)localObject1).c(i3);
                    u.g = ((int)l2);
                    break;
                  case 251: 
                    Q = true;
                    break;
                  case 241: 
                    if (E) {
                      break;
                    }
                    ((d)localObject1).a(i3);
                    D.a(l2);
                    E = true;
                    break;
                  case 238: 
                    P = ((int)l2);
                    break;
                  case 231: 
                    B = ((d)localObject1).k(l2);
                    break;
                  case 215: 
                    ((d)localObject1).c(i3);
                    u.c = ((int)l2);
                    break;
                  case 186: 
                    ((d)localObject1).c(i3);
                    u.n = ((int)l2);
                    break;
                  case 179: 
                    ((d)localObject1).a(i3);
                    C.a(((d)localObject1).k(l2));
                    break;
                  case 176: 
                    ((d)localObject1).c(i3);
                    u.m = ((int)l2);
                    break;
                  case 159: 
                    ((d)localObject1).c(i3);
                    u.O = ((int)l2);
                    break;
                  case 155: 
                    I = ((d)localObject1).k(l2);
                    break;
                  case 136: 
                    ((d)localObject1).c(i3);
                    localObject1 = u;
                    if (l2 == 1L) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    V = bool;
                    break;
                  case 131: 
                    ((d)localObject1).c(i3);
                    u.d = ((int)l2);
                    break;
                    ((d)localObject1).c(i3);
                    u.C = ((int)l2);
                    break;
                    ((d)localObject1).c(i3);
                    u.B = ((int)l2);
                    break;
                    ((d)localObject1).c(i3);
                    u.x = true;
                    i1 = w5.b.a((int)l2);
                    if (i1 == -1) {
                      break;
                    }
                    u.y = i1;
                    break;
                    ((d)localObject1).c(i3);
                    i1 = w5.b.b((int)l2);
                    if (i1 == -1) {
                      break;
                    }
                    u.z = i1;
                    break;
                    ((d)localObject1).c(i3);
                    i1 = (int)l2;
                    if (i1 != 1)
                    {
                      if (i1 == 2) {
                        u.A = 1;
                      }
                    }
                    else {
                      u.A = 2;
                    }
                    break;
                  }
                }
                else if (l2 != 1L)
                {
                  parami = new StringBuilder();
                  parami.append("ContentEncodingScope ");
                  parami.append(l2);
                  parami.append(" not supported");
                  throw a1.a(parami.toString(), null);
                }
              }
              else if (l2 != 0L)
              {
                parami = new StringBuilder();
                parami.append("ContentEncodingOrder ");
                parami.append(l2);
                parami.append(" not supported");
                throw a1.a(parami.toString(), null);
              }
            }
            else
            {
              parami = f.l("Invalid integer size: ");
              parami.append(g);
              throw a1.a(parami.toString(), null);
              label5501:
              l2 = parami.getPosition();
              l1 = g;
              b.push(new a.a(f, l1 + l2));
              localObject1 = d;
              i1 = f;
              l1 = g;
              localObject1 = a;
              x6.b.K(b0);
              if (i1 == 160) {
                break label5869;
              }
              if (i1 == 174) {
                break label5854;
              }
              if (i1 == 187) {
                break label5845;
              }
              if (i1 != 19899)
              {
                if (i1 != 20533)
                {
                  if (i1 != 21968)
                  {
                    if (i1 != 408125543)
                    {
                      if (i1 != 475249515)
                      {
                        if ((i1 == 524531317) && (!v)) {
                          if ((d) && (z != -1L))
                          {
                            y = true;
                          }
                          else
                          {
                            b0.t(new t.b(t));
                            v = true;
                          }
                        }
                      }
                      else
                      {
                        C = new n();
                        D = new n();
                      }
                    }
                    else
                    {
                      long l3 = q;
                      if ((l3 != -1L) && (l3 != l2)) {
                        throw a1.a("Multiple Segment elements not supported", null);
                      }
                      q = l2;
                      p = l1;
                    }
                  }
                  else
                  {
                    ((d)localObject1).c(i1);
                    u.x = true;
                  }
                }
                else
                {
                  ((d)localObject1).c(i1);
                  u.h = true;
                }
              }
              else
              {
                w = -1;
                x = -1L;
              }
            }
          }
          break label5881;
          label5845:
          E = false;
          break label5881;
          label5854:
          u = new b();
          break label5881;
          label5869:
          Q = false;
          R = 0L;
        }
        label5881:
        e = 0;
        i1 = 1;
        label5889:
        if (i1 != 0)
        {
          l2 = parami.getPosition();
          if (y)
          {
            A = l2;
            a = z;
            y = false;
          }
          else
          {
            if (!v) {
              break label5971;
            }
            l2 = A;
            if (l2 == -1L) {
              break label5971;
            }
            a = l2;
            A = -1L;
          }
          i3 = 1;
          break label5974;
          label5971:
          i3 = 0;
          label5974:
          if (i3 != 0) {
            return 1;
          }
        }
        break;
        label5984:
        parami.j((int)g);
        e = 0;
      }
    }
    if (i1 == 0)
    {
      for (i1 = 0; i1 < c.size(); i1++)
      {
        parami = (b)c.valueAt(i1);
        X.getClass();
        params = T;
        if (params != null) {
          params.a(X, j);
        }
      }
      return -1;
    }
    return 0;
  }
  
  public final void e(b paramb, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = T;
    if (localObject1 != null)
    {
      ((w)localObject1).b(X, paramLong, paramInt1, paramInt2, paramInt3, j);
    }
    else
    {
      long l1;
      if (("S_TEXT/UTF8".equals(b)) || ("S_TEXT/ASS".equals(b)) || ("S_TEXT/WEBVTT".equals(b)))
      {
        if (K > 1)
        {
          localObject1 = "Skipping subtitle sample in laced block.";
        }
        else
        {
          l1 = I;
          if (l1 != -9223372036854775807L) {
            break label120;
          }
          localObject1 = "Skipping subtitle sample with no duration.";
        }
        m.f("MatroskaExtractor", (String)localObject1);
      }
      else
      {
        break label420;
      }
      label120:
      localObject1 = b;
      Object localObject2 = k.a;
      localObject1.getClass();
      int i1 = ((String)localObject1).hashCode();
      int i2 = -1;
      if (i1 != 738597099)
      {
        if (i1 != 1045209816)
        {
          if ((i1 == 1422270023) && (((String)localObject1).equals("S_TEXT/UTF8"))) {
            i2 = 2;
          }
        }
        else if (((String)localObject1).equals("S_TEXT/WEBVTT")) {
          i2 = 1;
        }
      }
      else if (((String)localObject1).equals("S_TEXT/ASS")) {
        i2 = 0;
      }
      if (i2 != 0)
      {
        if (i2 != 1)
        {
          if (i2 == 2)
          {
            localObject1 = g(l1, 1000L, "%02d:%02d:%02d,%03d");
            i2 = 19;
          }
          else
          {
            throw new IllegalArgumentException();
          }
        }
        else
        {
          localObject1 = g(l1, 1000L, "%02d:%02d:%02d.%03d");
          i2 = 25;
        }
      }
      else
      {
        localObject1 = g(l1, 10000L, "%01d:%02d:%02d:%02d");
        i2 = 21;
      }
      System.arraycopy(localObject1, 0, localObject2, i2, localObject1.length);
      for (i2 = k.b;; i2++)
      {
        localObject1 = k;
        if (i2 >= c) {
          break;
        }
        if (a[i2] == 0)
        {
          ((u)localObject1).F(i2);
          break;
        }
      }
      localObject2 = X;
      localObject1 = k;
      ((v)localObject2).b(c, (u)localObject1);
      paramInt2 += k.c;
      label420:
      i2 = paramInt2;
      if ((paramInt1 & 0x10000000) != 0) {
        if (K > 1)
        {
          n.D(0);
          i2 = paramInt2;
        }
        else
        {
          localObject1 = n;
          i2 = c;
          X.a(i2, (u)localObject1);
          i2 = paramInt2 + i2;
        }
      }
      X.c(paramLong, paramInt1, i2, paramInt3, j);
    }
    F = true;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    B = -9223372036854775807L;
    G = 0;
    Object localObject = (a)a;
    e = 0;
    b.clear();
    localObject = c;
    b = 0;
    c = 0;
    localObject = b;
    b = 0;
    c = 0;
    j();
    for (int i1 = 0; i1 < c.size(); i1++)
    {
      localObject = c.valueAt(i1)).T;
      if (localObject != null)
      {
        b = false;
        c = 0;
      }
    }
  }
  
  public final void h(i parami, int paramInt)
  {
    u localu = g;
    if (c >= paramInt) {
      return;
    }
    byte[] arrayOfByte = a;
    if (arrayOfByte.length < paramInt) {
      localu.a(Math.max(arrayOfByte.length * 2, paramInt));
    }
    localu = g;
    arrayOfByte = a;
    int i1 = c;
    parami.readFully(arrayOfByte, i1, paramInt - i1);
    g.F(paramInt);
  }
  
  public final boolean i(i parami)
  {
    d0.c localc = new d0.c();
    parami = (c4.e)parami;
    long l1 = c;
    boolean bool1 = l1 < -1L;
    long l2 = 1024L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i1 = (int)l3;
    byte[] arrayOfByte = b).a;
    boolean bool2 = false;
    parami.c(arrayOfByte, 0, 4, false);
    l3 = ((u)b).w();
    a = 4;
    while (l3 != 440786851L)
    {
      int i2 = a + 1;
      a = i2;
      if (i2 == i1)
      {
        bool4 = bool2;
        break label355;
      }
      parami.c(b).a, 0, 1, false);
      l3 = b).a[0] & 0xFF | l3 << 8 & 0xFFFFFFFFFFFFFF00;
    }
    l3 = localc.b(parami);
    l2 = a;
    boolean bool4 = bool2;
    if (l3 != Long.MIN_VALUE) {
      if ((bool1) && (l2 + l3 >= l1))
      {
        bool4 = bool2;
      }
      else
      {
        int i3;
        for (;;)
        {
          boolean bool3 = a < l2 + l3;
          if (!bool3) {
            break;
          }
          if (localc.b(parami) == Long.MIN_VALUE)
          {
            bool4 = bool2;
            break label355;
          }
          l1 = localc.b(parami);
          bool3 = l1 < 0L;
          bool4 = bool2;
          if (bool3) {
            break label355;
          }
          if (l1 > 2147483647L)
          {
            bool4 = bool2;
            break label355;
          }
          if (bool3)
          {
            i3 = (int)l1;
            parami.k(i3, false);
            a += i3;
          }
        }
        bool4 = bool2;
        if (i3 == 0) {
          bool4 = true;
        }
      }
    }
    label355:
    return bool4;
  }
  
  public final void j()
  {
    S = 0;
    T = 0;
    U = 0;
    V = false;
    W = false;
    X = false;
    Y = 0;
    Z = ((byte)0);
    a0 = false;
    j.D(0);
  }
  
  public final long k(long paramLong)
  {
    long l1 = r;
    if (l1 != -9223372036854775807L) {
      return e0.O(paramLong, l1, 1000L);
    }
    throw a1.a("Can't scale timecode prior to timecodeScale being set.", null);
  }
  
  public final int l(i parami, b paramb, int paramInt, boolean paramBoolean)
  {
    if ("S_TEXT/UTF8".equals(b)) {
      m(parami, c0, paramInt);
    }
    for (;;)
    {
      paramInt = T;
      j();
      return paramInt;
      if ("S_TEXT/ASS".equals(b))
      {
        m(parami, e0, paramInt);
      }
      else if ("S_TEXT/WEBVTT".equals(b))
      {
        m(parami, f0, paramInt);
      }
      else
      {
        v localv = X;
        boolean bool1 = V;
        boolean bool2 = true;
        Object localObject2;
        int i4;
        if (!bool1)
        {
          if (h)
          {
            O &= 0xBFFFFFFF;
            bool1 = W;
            i1 = 128;
            if (!bool1)
            {
              parami.readFully(g.a, 0, 1);
              S += 1;
              i2 = g.a[0];
              if ((i2 & 0x80) != 128)
              {
                Z = ((byte)i2);
                W = true;
              }
              else
              {
                throw a1.a("Extension bit is set in signal byte", null);
              }
            }
            i3 = Z;
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
              O |= 0x40000000;
              if (!a0)
              {
                parami.readFully(l.a, 0, 8);
                S += 8;
                a0 = true;
                localObject1 = g;
                localObject2 = a;
                if (i2 == 0) {
                  i1 = 0;
                }
                localObject2[0] = ((byte)(byte)(i1 | 0x8));
                ((u)localObject1).G(0);
                localv.a(1, g);
                T += 1;
                l.G(0);
                localv.a(8, l);
                T += 8;
              }
              if (i2 != 0)
              {
                if (!X)
                {
                  parami.readFully(g.a, 0, 1);
                  S += 1;
                  g.G(0);
                  Y = g.v();
                  X = true;
                }
                i2 = Y * 4;
                g.D(i2);
                parami.readFully(g.a, 0, i2);
                S += i2;
                short s1 = (short)(Y / 2 + 1);
                i4 = s1 * 6 + 2;
                localObject1 = o;
                if ((localObject1 == null) || (((Buffer)localObject1).capacity() < i4)) {
                  o = ByteBuffer.allocate(i4);
                }
                o.position(0);
                o.putShort(s1);
                i1 = 0;
                for (i2 = i1;; i2 = i3)
                {
                  i3 = Y;
                  if (i1 >= i3) {
                    break;
                  }
                  i3 = g.y();
                  if (i1 % 2 == 0) {
                    o.putShort((short)(i3 - i2));
                  } else {
                    o.putInt(i3 - i2);
                  }
                  i1++;
                }
                i2 = paramInt - S - i2;
                localObject1 = o;
                if (i3 % 2 == 1)
                {
                  ((ByteBuffer)localObject1).putInt(i2);
                }
                else
                {
                  ((ByteBuffer)localObject1).putShort((short)i2);
                  o.putInt(0);
                }
                m.E(o.array(), i4);
                localv.a(i4, m);
                T += i4;
              }
            }
          }
          else
          {
            localObject1 = i;
            if (localObject1 != null) {
              j.E((byte[])localObject1, localObject1.length);
            }
          }
          if (!"A_OPUS".equals(b)) {
            if (f > 0) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            }
          }
          if (paramBoolean)
          {
            O |= 0x10000000;
            n.D(0);
            i2 = j.c + paramInt - S;
            g.D(4);
            localObject1 = g;
            localObject2 = a;
            localObject2[0] = ((byte)(byte)(i2 >> 24 & 0xFF));
            localObject2[1] = ((byte)(byte)(i2 >> 16 & 0xFF));
            localObject2[2] = ((byte)(byte)(i2 >> 8 & 0xFF));
            localObject2[3] = ((byte)(byte)(i2 & 0xFF));
            localv.a(4, (u)localObject1);
            T += 4;
          }
          V = true;
        }
        int i2 = paramInt + j.c;
        if ((!"V_MPEG4/ISO/AVC".equals(b)) && (!"V_MPEGH/ISO/HEVC".equals(b)))
        {
          if (T != null)
          {
            if (j.c == 0) {
              paramBoolean = bool2;
            } else {
              paramBoolean = false;
            }
            x6.b.H(paramBoolean);
            T.c(parami);
          }
          for (;;)
          {
            paramInt = S;
            if (paramInt >= i2) {
              break;
            }
            paramInt = i2 - paramInt;
            localObject1 = j;
            i1 = c - b;
            if (i1 > 0)
            {
              paramInt = Math.min(paramInt, i1);
              localv.b(paramInt, j);
            }
            else
            {
              paramInt = localv.e(parami, paramInt, false);
            }
            S += paramInt;
            T += paramInt;
          }
        }
        Object localObject1 = f.a;
        localObject1[0] = ((byte)0);
        localObject1[1] = ((byte)0);
        localObject1[2] = ((byte)0);
        int i3 = Y;
        int i1 = 4 - i3;
        while (S < i2)
        {
          paramInt = U;
          if (paramInt == 0)
          {
            localObject2 = j;
            paramInt = Math.min(i3, c - b);
            parami.readFully((byte[])localObject1, i1 + paramInt, i3 - paramInt);
            if (paramInt > 0) {
              j.d((byte[])localObject1, i1, paramInt);
            }
            S += i3;
            f.G(0);
            U = f.y();
            e.G(0);
            localv.b(4, e);
            T += 4;
          }
          else
          {
            localObject2 = j;
            i4 = c - b;
            if (i4 > 0)
            {
              paramInt = Math.min(paramInt, i4);
              localv.b(paramInt, j);
            }
            else
            {
              paramInt = localv.e(parami, paramInt, false);
            }
            S += paramInt;
            T += paramInt;
            U -= paramInt;
          }
        }
        if ("A_VORBIS".equals(b))
        {
          h.G(0);
          localv.b(4, h);
          T += 4;
        }
      }
    }
  }
  
  public final void m(i parami, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = paramArrayOfByte.length + paramInt;
    u localu = k;
    byte[] arrayOfByte = a;
    if (arrayOfByte.length < i1)
    {
      arrayOfByte = Arrays.copyOf(paramArrayOfByte, i1 + paramInt);
      localu.E(arrayOfByte, arrayOfByte.length);
    }
    else
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    }
    parami.readFully(k.a, paramArrayOfByte.length, paramInt);
    k.G(0);
    k.F(i1);
  }
  
  public final void release() {}
  
  public final class a
    implements b
  {
    public a() {}
    
    public final void a(int paramInt)
    {
      d locald = d.this;
      x6.b.K(b0);
      Object localObject1;
      Object localObject7;
      Object localObject8;
      long l1;
      label437:
      label1548:
      label1565:
      label1575:
      label1668:
      label1696:
      int k;
      if (paramInt != 160)
      {
        Object localObject2;
        if (paramInt != 174)
        {
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
                    if (paramInt != 475249515) {
                      break label6061;
                    }
                    if (!v)
                    {
                      localObject1 = b0;
                      localObject2 = C;
                      localObject6 = D;
                      if ((q != -1L) && (t != -9223372036854775807L) && (localObject2 != null))
                      {
                        i = a;
                        if ((i != 0) && (localObject6 != null) && (a == i))
                        {
                          localObject7 = new int[i];
                          localObject8 = new long[i];
                          localObject9 = new long[i];
                          localObject10 = new long[i];
                          for (paramInt = 0; paramInt < i; paramInt++)
                          {
                            localObject10[paramInt] = ((n)localObject2).b(paramInt);
                            l1 = q;
                            localObject8[paramInt] = (((n)localObject6).b(paramInt) + l1);
                          }
                          for (paramInt = 0;; paramInt = j)
                          {
                            j = i - 1;
                            if (paramInt >= j) {
                              break;
                            }
                            j = paramInt + 1;
                            localObject7[paramInt] = ((int)(localObject8[j] - localObject8[paramInt]));
                            localObject10[j] -= localObject10[paramInt];
                          }
                          localObject7[j] = ((int)(q + p - localObject8[j]));
                          l1 = t - localObject10[j];
                          localObject9[j] = l1;
                          localObject11 = localObject7;
                          localObject12 = localObject8;
                          localObject6 = localObject9;
                          localObject2 = localObject10;
                          if (l1 <= 0L)
                          {
                            localObject2 = new StringBuilder();
                            ((StringBuilder)localObject2).append("Discarding last cue point with unexpected duration: ");
                            ((StringBuilder)localObject2).append(l1);
                            m.f("MatroskaExtractor", ((StringBuilder)localObject2).toString());
                            localObject11 = Arrays.copyOf((int[])localObject7, j);
                            localObject12 = Arrays.copyOf((long[])localObject8, j);
                            localObject6 = Arrays.copyOf((long[])localObject9, j);
                            localObject2 = Arrays.copyOf((long[])localObject10, j);
                          }
                          localObject2 = new c4.c((int[])localObject11, (long[])localObject12, (long[])localObject6, (long[])localObject2);
                          break label437;
                        }
                      }
                      localObject2 = new t.b(t);
                      ((j)localObject1).t((c4.t)localObject2);
                      v = true;
                    }
                    C = null;
                    D = null;
                    break label6061;
                  }
                  if (c.size() != 0)
                  {
                    b0.m();
                    break label6061;
                  }
                  throw a1.a("No valid tracks were found", null);
                }
                if (r == -9223372036854775807L) {
                  r = 1000000L;
                }
                l1 = s;
                if (l1 == -9223372036854775807L) {
                  break label6061;
                }
                t = locald.k(l1);
                break label6061;
              }
              locald.c(paramInt);
              localObject2 = u;
              if ((!h) || (i == null)) {
                break label6061;
              }
              throw a1.a("Combining encryption and compression is not supported", null);
            }
            locald.c(paramInt);
            localObject6 = u;
            if (!h) {
              break label6061;
            }
            localObject2 = j;
            if (localObject2 != null)
            {
              l = new a4.d(new a4.d.b[] { new a4.d.b(v3.h.a, null, "video/webm", b) });
              break label6061;
            }
            throw a1.a("Encrypted Track found but ContentEncKeyID was not found", null);
          }
          paramInt = w;
          if (paramInt != -1)
          {
            l1 = x;
            if (l1 != -1L)
            {
              if (paramInt != 475249515) {
                break label6061;
              }
              z = l1;
              break label6061;
            }
          }
          throw a1.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        localObject6 = u;
        x6.b.K(localObject6);
        localObject11 = b;
        if (localObject11 != null)
        {
          paramInt = ((String)localObject11).hashCode();
          localObject9 = "V_MPEG4/ISO/SP";
          localObject10 = "A_MS/ACM";
          localObject7 = "A_TRUEHD";
          localObject8 = "A_VORBIS";
          localObject1 = "A_MPEG/L2";
          localObject12 = "A_MPEG/L3";
          localObject2 = "V_MS/VFW/FOURCC";
          String str = "S_DVBSUB";
          j = 20;
          switch (paramInt)
          {
          default: 
          case 1951062397: 
          case 1950789798: 
          case 1950749482: 
          case 1809237540: 
          case 1422270023: 
          case 1045209816: 
          case 855502857: 
          case 738597099: 
          case 725957860: 
          case 725948237: 
          case 635596514: 
          case 542569478: 
          case 444813526: 
          case 99146302: 
          case 82338134: 
          case 82338133: 
          case 82318131: 
          case 62927045: 
          case 62923603: 
          case 62923557: 
          case -356037306: 
          case -425012669: 
          case -538363109: 
          case -538363189: 
          case -933872740: 
          case -1373388978: 
          case -1482641357: 
          case -1482641358: 
          case -1730367663: 
          case -1784763192: 
          case -1985379776: 
          case -2095575984: 
            for (;;)
            {
              break;
              if (((String)localObject11).equals("A_OPUS"))
              {
                paramInt = 32;
                for (;;)
                {
                  break label1575;
                  if (!((String)localObject11).equals("A_FLAC")) {
                    break;
                  }
                  paramInt = 31;
                  continue;
                  if (!((String)localObject11).equals("A_EAC3")) {
                    break;
                  }
                  paramInt = 30;
                  continue;
                  if (!((String)localObject11).equals("V_MPEG2")) {
                    break;
                  }
                  paramInt = 29;
                  continue;
                  if (!((String)localObject11).equals("S_TEXT/UTF8")) {
                    break;
                  }
                  paramInt = 28;
                  continue;
                  if (!((String)localObject11).equals("S_TEXT/WEBVTT")) {
                    break;
                  }
                  paramInt = 27;
                  continue;
                  if (!((String)localObject11).equals("V_MPEGH/ISO/HEVC")) {
                    break;
                  }
                  paramInt = 26;
                  continue;
                  if (!((String)localObject11).equals("S_TEXT/ASS")) {
                    break;
                  }
                  paramInt = 25;
                  break label1668;
                  if (!((String)localObject11).equals("A_PCM/INT/LIT")) {
                    break;
                  }
                  paramInt = 24;
                  break label1668;
                  if (!((String)localObject11).equals("A_PCM/INT/BIG")) {
                    break;
                  }
                  paramInt = 23;
                  continue;
                  if (!((String)localObject11).equals("A_PCM/FLOAT/IEEE")) {
                    break;
                  }
                  paramInt = 22;
                  continue;
                  if (!((String)localObject11).equals("A_DTS/EXPRESS")) {
                    break;
                  }
                  paramInt = 21;
                  continue;
                  if (!((String)localObject11).equals("V_THEORA")) {
                    break;
                  }
                  paramInt = 20;
                  break label1696;
                  if (!((String)localObject11).equals("S_HDMV/PGS")) {
                    break;
                  }
                  paramInt = 19;
                  continue;
                  if (!((String)localObject11).equals("V_VP9")) {
                    break;
                  }
                  paramInt = 18;
                  continue;
                  if (!((String)localObject11).equals("V_VP8")) {
                    break;
                  }
                  paramInt = 17;
                  continue;
                  if (!((String)localObject11).equals("V_AV1")) {
                    break;
                  }
                  paramInt = 16;
                  continue;
                  if (!((String)localObject11).equals("A_DTS")) {
                    break;
                  }
                  paramInt = 15;
                  break label1668;
                  if (!((String)localObject11).equals("A_AC3")) {
                    break;
                  }
                  paramInt = 14;
                  continue;
                  if (!((String)localObject11).equals("A_AAC")) {
                    break;
                  }
                  paramInt = 13;
                  continue;
                  if (!((String)localObject11).equals("A_DTS/LOSSLESS")) {
                    break;
                  }
                  paramInt = 12;
                  continue;
                  if (!((String)localObject11).equals("S_VOBSUB")) {
                    break;
                  }
                  paramInt = 11;
                  continue;
                  if (!((String)localObject11).equals("V_MPEG4/ISO/AVC")) {
                    break;
                  }
                  paramInt = 10;
                  continue;
                  if (((String)localObject11).equals("V_MPEG4/ISO/ASP"))
                  {
                    paramInt = 9;
                    break label1548;
                    if (!((String)localObject11).equals(str)) {
                      break;
                    }
                    paramInt = 8;
                    break label1668;
                    if (!((String)localObject11).equals(localObject2)) {
                      break label1565;
                    }
                  }
                  else
                  {
                    paramInt = 7;
                  }
                  localObject2 = "V_MS/VFW/FOURCC";
                  continue;
                  if (!((String)localObject11).equals(localObject12))
                  {
                    localObject12 = "A_MPEG/L3";
                    break;
                  }
                  paramInt = 6;
                }
                localObject12 = "A_MPEG/L3";
                break label1668;
                if (((String)localObject11).equals(localObject1))
                {
                  paramInt = 5;
                  break label1668;
                  if (((String)localObject11).equals(localObject8))
                  {
                    paramInt = 4;
                    break label1668;
                    if (((String)localObject11).equals(localObject7))
                    {
                      paramInt = 3;
                      break label1668;
                      if (((String)localObject11).equals(localObject10))
                      {
                        paramInt = 2;
                        break label1668;
                        if (!((String)localObject11).equals(localObject9)) {
                          break;
                        }
                      }
                    }
                  }
                }
              }
            }
            paramInt = 1;
            break;
          case -2095576542: 
            if (((String)localObject11).equals("V_MPEG4/ISO/AP"))
            {
              paramInt = 0;
            }
            else
            {
              localObject2 = "V_MS/VFW/FOURCC";
              paramInt = -1;
            }
            break;
          }
          switch (paramInt)
          {
          default: 
            paramInt = 0;
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
            paramInt = 1;
          }
          if (paramInt != 0)
          {
            localObject8 = b0;
            k = c;
            localObject11 = b;
            localObject11.getClass();
            switch (((String)localObject11).hashCode())
            {
            default: 
              break;
            case 1951062397: 
              if (((String)localObject11).equals("A_OPUS")) {
                paramInt = 32;
              }
              break;
            case 1950789798: 
              if (((String)localObject11).equals("A_FLAC")) {
                paramInt = 31;
              }
              break;
            case 1950749482: 
              if (((String)localObject11).equals("A_EAC3")) {
                paramInt = 30;
              }
              break;
            case 1809237540: 
              if (((String)localObject11).equals("V_MPEG2")) {
                paramInt = 29;
              }
              break;
            case 1422270023: 
              if (((String)localObject11).equals("S_TEXT/UTF8")) {
                paramInt = 28;
              }
              break;
            case 1045209816: 
              if (((String)localObject11).equals("S_TEXT/WEBVTT")) {
                paramInt = 27;
              }
              break;
            case 855502857: 
              if (((String)localObject11).equals("V_MPEGH/ISO/HEVC")) {
                paramInt = 26;
              }
              break;
            case 738597099: 
              if (((String)localObject11).equals("S_TEXT/ASS")) {
                paramInt = 25;
              }
              break;
            case 725957860: 
              if (((String)localObject11).equals("A_PCM/INT/LIT")) {
                paramInt = 24;
              }
              break;
            case 725948237: 
              if (((String)localObject11).equals("A_PCM/INT/BIG")) {
                paramInt = 23;
              }
              break;
            case 635596514: 
              if (((String)localObject11).equals("A_PCM/FLOAT/IEEE")) {
                paramInt = 22;
              }
              break;
            case 542569478: 
              if (((String)localObject11).equals("A_DTS/EXPRESS")) {
                paramInt = 21;
              }
              break;
            case 444813526: 
              paramInt = j;
              if (((String)localObject11).equals("V_THEORA")) {
                break label2798;
              }
            case 99146302: 
              if ((goto 2796) && (((String)localObject11).equals("S_HDMV/PGS"))) {
                paramInt = 19;
              }
              break;
            case 82338134: 
              if (((String)localObject11).equals("V_VP9")) {
                paramInt = 18;
              }
              break;
            case 82338133: 
              if (((String)localObject11).equals("V_VP8")) {
                paramInt = 17;
              }
              break;
            case 82318131: 
              if (((String)localObject11).equals("V_AV1")) {
                paramInt = 16;
              }
              break;
            case 62927045: 
              if (((String)localObject11).equals("A_DTS")) {
                paramInt = 15;
              }
              break;
            case 62923603: 
              if (((String)localObject11).equals("A_AC3")) {
                paramInt = 14;
              }
              break;
            case 62923557: 
              if (((String)localObject11).equals("A_AAC")) {
                paramInt = 13;
              }
              break;
            case -356037306: 
              if (((String)localObject11).equals("A_DTS/LOSSLESS")) {
                paramInt = 12;
              }
              break;
            case -425012669: 
              if (((String)localObject11).equals("S_VOBSUB")) {
                paramInt = 11;
              }
              break;
            case -538363109: 
              if (((String)localObject11).equals("V_MPEG4/ISO/AVC")) {
                paramInt = 10;
              }
              break;
            case -538363189: 
              if (((String)localObject11).equals("V_MPEG4/ISO/ASP")) {
                paramInt = 9;
              }
              break;
            case -933872740: 
              if (((String)localObject11).equals("S_DVBSUB")) {
                paramInt = 8;
              }
              break;
            case -1373388978: 
              if (((String)localObject11).equals(localObject2)) {
                paramInt = 7;
              }
              break;
            case -1482641357: 
              if (((String)localObject11).equals(localObject12)) {
                paramInt = 6;
              }
              break;
            case -1482641358: 
              if (((String)localObject11).equals("A_MPEG/L2")) {
                paramInt = 5;
              }
              break;
            case -1730367663: 
              if (((String)localObject11).equals("A_VORBIS")) {
                paramInt = 4;
              }
              break;
            case -1784763192: 
              if (((String)localObject11).equals("A_TRUEHD")) {
                paramInt = 3;
              }
              break;
            case -1985379776: 
              if (((String)localObject11).equals("A_MS/ACM")) {
                paramInt = 2;
              }
              break;
            case -2095575984: 
              if (((String)localObject11).equals("V_MPEG4/ISO/SP")) {
                paramInt = 1;
              }
              break;
            case -2095576542: 
              if (((String)localObject11).equals("V_MPEG4/ISO/AP")) {
                paramInt = 0;
              }
              break;
            }
            paramInt = -1;
            label2798:
            localObject12 = "video/x-unknown";
            localObject2 = "audio/raw";
            localObject11 = "audio/x-unknown";
            label3917:
            Object localObject3;
            switch (paramInt)
            {
            default: 
              throw a1.a("Unrecognized codec identifier.", null);
            case 32: 
              paramInt = 5760;
              localObject2 = new ArrayList(3);
              localObject12 = localObject6;
              ((ArrayList)localObject2).add(((d.b)localObject12).a(b));
              localObject11 = ByteBuffer.allocate(8);
              localObject10 = ByteOrder.LITTLE_ENDIAN;
              ((ArrayList)localObject2).add(((ByteBuffer)localObject11).order((ByteOrder)localObject10).putLong(R).array());
              ((ArrayList)localObject2).add(ByteBuffer.allocate(8).order((ByteOrder)localObject10).putLong(S).array());
              localObject12 = "audio/opus";
              break;
            case 31: 
              localObject2 = localObject6;
              localObject2 = Collections.singletonList(((d.b)localObject2).a(b));
              localObject12 = "audio/flac";
              break;
            case 30: 
              localObject2 = "audio/eac3";
              break;
            case 29: 
              localObject2 = "video/mpeg2";
              break;
            case 28: 
              localObject2 = "application/x-subrip";
              break;
            case 27: 
              localObject2 = "text/vtt";
              break;
            case 26: 
              localObject12 = localObject6;
              localObject11 = w5.e.a(new u(((d.b)localObject12).a(b)));
              localObject2 = a;
              Y = b;
              localObject12 = g;
              localObject11 = "video/hevc";
              break;
            case 25: 
              localObject2 = localObject6;
              localObject2 = o7.t.u(d.d0, ((d.b)localObject2).a(b));
              localObject12 = "text/x-ssa";
              break;
            case 24: 
              j = e0.v(P);
              paramInt = j;
              if (j == 0)
              {
                localObject2 = new StringBuilder();
                localObject12 = "Unsupported little endian PCM bit depth: ";
              }
              break;
            case 23: 
              paramInt = P;
              if (paramInt == 8)
              {
                paramInt = 3;
              }
              else if (paramInt == 16)
              {
                paramInt = 268435456;
              }
              else
              {
                localObject2 = new StringBuilder();
                localObject12 = "Unsupported big endian PCM bit depth: ";
              }
              break;
            case 22: 
              if (P == 32)
              {
                paramInt = 4;
                m = -1;
                j = 1;
                localObject12 = null;
                i = 3;
                n = paramInt;
                paramInt = m;
              }
              else
              {
                localObject2 = new StringBuilder();
                localObject12 = "Unsupported floating point PCM bit depth: ";
                ((StringBuilder)localObject2).append((String)localObject12);
                ((StringBuilder)localObject2).append(P);
                ((StringBuilder)localObject2).append(". Setting mimeType to ");
                ((StringBuilder)localObject2).append("audio/x-unknown");
                m.f("MatroskaExtractor", ((StringBuilder)localObject2).toString());
                localObject12 = localObject11;
              }
              break;
            case 20: 
              localObject2 = localObject12;
              break;
            case 19: 
              localObject2 = "application/pgs";
              break;
            case 18: 
              localObject2 = "video/x-vnd.on2.vp9";
              break;
            case 17: 
              localObject2 = "video/x-vnd.on2.vp8";
              break;
            case 16: 
              localObject2 = "video/av01";
              break;
            case 15: 
            case 21: 
              localObject2 = "audio/vnd.dts";
              break;
            case 14: 
              localObject2 = "audio/ac3";
              break;
            case 13: 
              localObject2 = localObject6;
              localObject10 = Collections.singletonList(((d.b)localObject2).a(b));
              localObject12 = k;
              localObject12 = x3.a.c(new v5.t((byte[])localObject12, localObject12.length), false);
              Q = a;
              O = b;
              localObject12 = c;
              localObject2 = "audio/mp4a-latm";
              break;
            case 12: 
              localObject2 = "audio/vnd.dts.hd";
              localObject12 = localObject2;
              localObject2 = null;
              break;
            case 11: 
              localObject2 = localObject6;
              localObject2 = o7.t.t(((d.b)localObject2).a(b));
              localObject12 = "application/vobsub";
              break;
            case 10: 
              localObject12 = localObject6;
              localObject11 = w5.a.a(new u(((d.b)localObject12).a(b)));
              localObject2 = a;
              Y = b;
              localObject12 = f;
              localObject11 = "video/avc";
              localObject10 = localObject2;
              localObject2 = localObject11;
              paramInt = -1;
              localObject11 = localObject12;
              localObject12 = localObject2;
              break;
            case 8: 
              localObject2 = localObject6;
              localObject12 = new byte[4];
              System.arraycopy(((d.b)localObject2).a(b), 0, localObject12, 0, 4);
              localObject2 = o7.t.t(localObject12);
              localObject12 = "application/dvbsubs";
              break;
            case 7: 
              localObject2 = localObject6;
              localObject2 = new u(((d.b)localObject2).a(b));
              try
              {
                ((u)localObject2).H(16);
                l1 = ((u)localObject2).l();
                if (l1 == 1482049860L)
                {
                  localObject2 = new Pair("video/divx", null);
                }
                else if (l1 == 859189832L)
                {
                  localObject2 = new Pair("video/3gpp", null);
                }
                else
                {
                  if (l1 == 826496599L)
                  {
                    paramInt = b + 20;
                    localObject2 = a;
                    while (paramInt < localObject2.length - 4)
                    {
                      if ((localObject2[paramInt] == 0) && (localObject2[(paramInt + 1)] == 0) && (localObject2[(paramInt + 2)] == 1) && (localObject2[(paramInt + 3)] == 15))
                      {
                        localObject2 = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange((byte[])localObject2, paramInt, localObject2.length)));
                        break label3917;
                      }
                      paramInt++;
                    }
                    throw a1.a("Failed to find FourCC VC1 initialization data", null);
                  }
                  m.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                  localObject2 = new Pair("video/x-unknown", null);
                }
                localObject12 = (String)first;
                localObject2 = (List)second;
                paramInt = -1;
              }
              catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
              {
                throw a1.a("Error parsing FourCC private data", null);
              }
            case 6: 
              localObject3 = "audio/mpeg";
              break;
            case 5: 
              localObject3 = "audio/mpeg-L2";
              paramInt = 4096;
              localObject11 = null;
              localObject12 = localObject3;
              localObject3 = localObject11;
              j = 1;
              i = 3;
              localObject11 = localObject12;
              localObject12 = localObject3;
              localObject3 = localObject11;
              break;
            case 4: 
              localObject3 = localObject6;
              i = 8192;
              localObject3 = ((d.b)localObject3).a(b);
              if (localObject3[0] == 2)
              {
                paramInt = 0;
                for (j = 1;; j++)
                {
                  n = localObject3[j] & 0xFF;
                  if (n != 255) {
                    break;
                  }
                  paramInt += 255;
                }
                j++;
                n = paramInt + n;
                paramInt = 0;
                for (;;)
                {
                  m = localObject3[j] & 0xFF;
                  if (m != 255) {
                    break;
                  }
                  paramInt += 255;
                  j++;
                }
                j++;
                if (localObject3[j] != 1) {}
              }
              try
              {
                localObject12 = new byte[n];
                System.arraycopy(localObject3, j, localObject12, 0, n);
                j += n;
                if (localObject3[j] == 3)
                {
                  paramInt = j + (paramInt + m);
                  if (localObject3[paramInt] == 5)
                  {
                    localObject11 = new byte[localObject3.length - paramInt];
                    System.arraycopy(localObject3, paramInt, localObject11, 0, localObject3.length - paramInt);
                    localObject3 = new java/util/ArrayList;
                    ((ArrayList)localObject3).<init>(2);
                    ((ArrayList)localObject3).add(localObject12);
                    ((ArrayList)localObject3).add(localObject11);
                    localObject12 = "audio/vorbis";
                    paramInt = i;
                    i = 3;
                    localObject11 = localObject12;
                    j = 1;
                    localObject12 = localObject3;
                    localObject3 = localObject11;
                  }
                }
              }
              catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2) {}
            }
          }
        }
      }
      try
      {
        throw a1.a("Error parsing vorbis codec private", null);
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException4)
      {
        long l2;
        Object localObject5;
        boolean bool;
        float f1;
        float f2;
        for (;;) {}
      }
      throw a1.a("Error parsing vorbis codec private", null);
      throw a1.a("Error parsing vorbis codec private", null);
      throw a1.a("Error parsing vorbis codec private", null);
      throw a1.a("Error parsing vorbis codec private", null);
      T = new w();
      Object localObject12 = "audio/true-hd";
      break label4526;
      localObject12 = localObject6;
      Object localObject9 = new u(((d.b)localObject12).a(b));
      try
      {
        paramInt = ((u)localObject9).n();
        if (paramInt != 1)
        {
          if (paramInt == 65534)
          {
            ((u)localObject9).G(24);
            l1 = ((u)localObject9).o();
            localObject10 = d.g0;
            if (l1 == ((UUID)localObject10).getMostSignificantBits())
            {
              l1 = ((u)localObject9).o();
              l2 = ((UUID)localObject10).getLeastSignificantBits();
              if (l1 != l2) {}
            }
          }
        }
        else
        {
          paramInt = 1;
          break label4414;
        }
        paramInt = 0;
        label4414:
        if (paramInt != 0)
        {
          paramInt = e0.v(P);
          if (paramInt == 0)
          {
            localObject4 = f.l("Unsupported PCM bit depth: ");
            ((StringBuilder)localObject4).append(P);
            ((StringBuilder)localObject4).append(". Setting mimeType to ");
            ((StringBuilder)localObject4).append("audio/x-unknown");
            localObject4 = ((StringBuilder)localObject4).toString();
          }
          else
          {
            localObject11 = null;
            localObject10 = null;
            localObject12 = localObject4;
            i = 3;
            m = 1;
            n = -1;
            localObject4 = localObject11;
            j = paramInt;
            paramInt = m;
            break label4624;
          }
        }
        else
        {
          localObject4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
        }
        m.f("MatroskaExtractor", (String)localObject4);
        localObject12 = localObject11;
        label4526:
        Object localObject4 = null;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException3)
      {
        throw a1.a("Error parsing MS/ACM codec private", null);
      }
      localObject5 = k;
      if (localObject5 == null) {
        localObject5 = null;
      } else {
        localObject5 = Collections.singletonList(localObject5);
      }
      localObject12 = "video/mp4v-es";
      int i = 3;
      int j = 1;
      paramInt = -1;
      Object localObject11 = localObject12;
      localObject12 = localObject5;
      localObject5 = localObject11;
      int n = -1;
      int m = n;
      Object localObject10 = localObject12;
      localObject11 = null;
      n = paramInt;
      paramInt = j;
      localObject12 = localObject5;
      j = m;
      localObject5 = localObject11;
      label4624:
      localObject9 = localObject6;
      localObject11 = localObject5;
      Object localObject6 = localObject12;
      if (N != null)
      {
        localObject7 = w5.c.a(new u(N));
        localObject11 = localObject5;
        localObject6 = localObject12;
        if (localObject7 != null)
        {
          localObject11 = a;
          localObject6 = "video/dolby-vision";
        }
      }
      bool = V;
      if (U) {
        m = 2;
      } else {
        m = 0;
      }
      localObject12 = new i0.a();
      if (p.k((String)localObject6))
      {
        x = O;
        y = Q;
        z = j;
      }
      else if (p.m((String)localObject6))
      {
        if (q == 0)
        {
          j = o;
          paramInt = j;
          if (j == -1) {
            paramInt = m;
          }
          o = paramInt;
          j = p;
          paramInt = j;
          if (j == -1) {
            paramInt = n;
          }
          p = paramInt;
        }
        paramInt = -1;
        f1 = -1.0F;
        j = o;
        f2 = f1;
        if (j != -1)
        {
          i = p;
          f2 = f1;
          if (i != -1) {
            f2 = n * j / (m * i);
          }
        }
        if (x)
        {
          if ((D != -1.0F) && (E != -1.0F) && (F != -1.0F) && (G != -1.0F) && (H != -1.0F) && (I != -1.0F) && (J != -1.0F) && (K != -1.0F) && (L != -1.0F) && (M != -1.0F))
          {
            localObject5 = new byte[25];
            localObject7 = ByteBuffer.wrap((byte[])localObject5).order(ByteOrder.LITTLE_ENDIAN);
            ((ByteBuffer)localObject7).put((byte)0);
            ((ByteBuffer)localObject7).putShort((short)(int)(D * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(E * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(F * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(G * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(H * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(I * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(J * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(K * 50000.0F + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(L + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)(int)(M + 0.5F));
            ((ByteBuffer)localObject7).putShort((short)B);
            ((ByteBuffer)localObject7).putShort((short)C);
          }
          else
          {
            localObject5 = null;
          }
          localObject5 = new w5.b(y, (byte[])localObject5, A, z);
        }
        else
        {
          localObject5 = null;
        }
        localObject7 = a;
        j = paramInt;
        if (localObject7 != null)
        {
          localObject1 = d.h0;
          j = paramInt;
          if (((Map)localObject1).containsKey(localObject7)) {
            j = ((Integer)((Map)localObject1).get(a)).intValue();
          }
        }
        paramInt = j;
        if (r == 0)
        {
          paramInt = j;
          if (Float.compare(s, 0.0F) == 0)
          {
            paramInt = j;
            if (Float.compare(t, 0.0F) == 0) {
              if (Float.compare(u, 0.0F) == 0)
              {
                paramInt = 0;
              }
              else if (Float.compare(t, 90.0F) == 0)
              {
                paramInt = 90;
              }
              else if ((Float.compare(t, -180.0F) != 0) && (Float.compare(t, 180.0F) != 0))
              {
                paramInt = j;
                if (Float.compare(t, -90.0F) == 0) {
                  paramInt = 270;
                }
              }
              else
              {
                paramInt = 180;
              }
            }
          }
        }
        p = m;
        q = n;
        t = f2;
        s = paramInt;
        u = v;
        v = w;
        w = ((w5.b)localObject5);
        paramInt = 2;
      }
      else
      {
        if ((!"application/x-subrip".equals(localObject6)) && (!"text/x-ssa".equals(localObject6)) && (!"text/vtt".equals(localObject6)) && (!"application/vobsub".equals(localObject6)) && (!"application/pgs".equals(localObject6)) && (!"application/dvbsubs".equals(localObject6))) {
          throw a1.a("Unexpected MIME type.", null);
        }
        paramInt = i;
      }
      localObject5 = a;
      if ((localObject5 != null) && (!d.h0.containsKey(localObject5))) {
        b = a;
      }
      ((i0.a)localObject12).b(k);
      k = ((String)localObject6);
      l = n;
      c = W;
      d = (bool | false | m);
      m = ((List)localObject10);
      h = ((String)localObject11);
      n = l;
      localObject5 = ((i0.a)localObject12).a();
      localObject6 = ((j)localObject8).r(c, paramInt);
      X = ((v)localObject6);
      ((v)localObject6).d((i0)localObject5);
      c.put(c, localObject9);
      u = null;
      break label6061;
      throw a1.a("CodecId is missing in TrackEntry element", null);
      if (G == 2)
      {
        localObject12 = (d.b)c.get(M);
        X.getClass();
        if ((R > 0L) && ("A_OPUS".equals(b)))
        {
          localObject6 = n;
          localObject5 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(R).array();
          localObject6.getClass();
          ((u)localObject6).E((byte[])localObject5, localObject5.length);
        }
        paramInt = 0;
        for (j = 0; j < K; j++) {
          paramInt += L[j];
        }
        for (j = 0; j < K; j++)
        {
          l2 = H;
          l1 = e * j / 1000;
          n = O;
          i = n;
          if (j == 0)
          {
            i = n;
            if (!Q) {
              i = n | 0x1;
            }
          }
          n = L[j];
          paramInt -= n;
          locald.e((d.b)localObject12, l2 + l1, i, n, paramInt);
        }
        G = 0;
      }
      label6061:
    }
  }
  
  public static final class b
  {
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0F;
    public float E = -1.0F;
    public float F = -1.0F;
    public float G = -1.0F;
    public float H = -1.0F;
    public float I = -1.0F;
    public float J = -1.0F;
    public float K = -1.0F;
    public float L = -1.0F;
    public float M = -1.0F;
    public byte[] N;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0L;
    public long S = 0L;
    public w T;
    public boolean U;
    public boolean V = true;
    public String W = "eng";
    public v X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public v.a j;
    public byte[] k;
    public a4.d l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0F;
    public float t = 0.0F;
    public float u = 0.0F;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    
    public final byte[] a(String paramString)
    {
      Object localObject = k;
      if (localObject != null) {
        return (byte[])localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Missing CodecPrivate for codec ");
      ((StringBuilder)localObject).append(paramString);
      throw a1.a(((StringBuilder)localObject).toString(), null);
    }
  }
}

/* Location:
 * Qualified Name:     i4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */