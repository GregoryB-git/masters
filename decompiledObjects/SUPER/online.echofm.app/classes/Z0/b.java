package Z0;

import F0.E;
import F0.F;
import F0.K;
import F0.W;
import F0.u;
import W2.g;
import a3.f;
import android.util.Pair;
import d0.A;
import d0.h;
import d0.h.b;
import d0.m;
import d0.q.b;
import d0.x;
import d0.x.b;
import g0.M;
import g0.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class b
{
  public static final byte[] a = M.r0("OpusHead");
  
  public static s A(a.a parama, a.b paramb, long paramLong, m paramm, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = (a.a)g0.a.e(parama.f(1835297121));
    int i = e(m(eg1751411826b));
    Object localObject2 = null;
    if (i == -1) {
      return null;
    }
    g localg = z(eg1953196132b);
    long l1 = -9223372036854775807L;
    if (paramLong == -9223372036854775807L) {
      paramLong = g.a(localg);
    }
    long l2 = rb).q;
    if (paramLong == -9223372036854775807L) {}
    for (paramLong = l1;; paramLong = M.W0(paramLong, 1000000L, l2)) {
      break;
    }
    paramb = (a.a)g0.a.e(((a.a)g0.a.e(((a.a)localObject1).f(1835626086))).f(1937007212));
    localObject1 = o(eg1835296868b);
    paramb = paramb.g(1937011556);
    if (paramb != null)
    {
      paramm = x(b, g.b(localg), g.c(localg), (String)second, paramm, paramBoolean2);
      if (!paramBoolean1)
      {
        parama = parama.f(1701082227);
        if (parama != null)
        {
          parama = j(parama);
          if (parama != null)
          {
            paramb = (long[])first;
            parama = (long[])second;
            break label266;
          }
        }
      }
      paramb = null;
      parama = paramb;
      label266:
      if (b == null) {
        parama = (a.a)localObject2;
      } else {
        parama = new s(g.b(localg), i, ((Long)first).longValue(), l2, paramLong, b, d, a, c, paramb, parama);
      }
      return parama;
    }
    throw A.a("Malformed sample table (stbl) missing sample description (stsd)", null);
  }
  
  public static List B(a.a parama, E paramE, long paramLong, m paramm, boolean paramBoolean1, boolean paramBoolean2, g paramg)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < d.size(); i++)
    {
      a.a locala = (a.a)d.get(i);
      if (a == 1953653099)
      {
        s locals = (s)paramg.apply(A(locala, (a.b)g0.a.e(parama.g(1836476516)), paramLong, paramm, paramBoolean1, paramBoolean2));
        if (locals != null) {
          localArrayList.add(w(locals, (a.a)g0.a.e(((a.a)g0.a.e(((a.a)g0.a.e(locala.f(1835297121))).f(1835626086))).f(1937007212)), paramE));
        }
      }
    }
    return localArrayList;
  }
  
  public static x C(a.b paramb)
  {
    g0.z localz = b;
    localz.T(8);
    for (Object localObject = new x(new x.b[0]); localz.a() >= 8; localObject = paramb)
    {
      int i = localz.f();
      int j = localz.p();
      int k = localz.p();
      if (k == 1835365473)
      {
        localz.T(i);
        paramb = D(localz, i + j);
      }
      for (;;)
      {
        paramb = ((x)localObject).b(paramb);
        break;
        if (k == 1936553057)
        {
          localz.T(i);
          paramb = q.b(localz, i + j);
        }
        else
        {
          paramb = (a.b)localObject;
          if (k != -1451722374) {
            break;
          }
          paramb = F(localz);
        }
      }
      localz.T(i + j);
    }
    return (x)localObject;
  }
  
  public static x D(g0.z paramz, int paramInt)
  {
    paramz.U(8);
    f(paramz);
    while (paramz.f() < paramInt)
    {
      int i = paramz.f();
      int j = paramz.p();
      if (paramz.p() == 1768715124)
      {
        paramz.T(i);
        return n(paramz, i + j);
      }
      paramz.T(i + j);
    }
    return null;
  }
  
  public static void E(g0.z paramz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, m paramm, d paramd, int paramInt6)
  {
    int i = paramInt2;
    paramz.T(i + 16);
    paramz.U(16);
    int j = paramz.M();
    int k = paramz.M();
    paramz.U(50);
    int m = paramz.f();
    Object localObject1 = paramm;
    int n = paramInt1;
    if (paramInt1 == 1701733238)
    {
      localObject2 = u(paramz, i, paramInt3);
      localObject1 = paramm;
      if (localObject2 != null)
      {
        paramInt1 = ((Integer)first).intValue();
        if (paramm == null) {
          localObject1 = null;
        } else {
          localObject1 = paramm.c(second).b);
        }
        a[paramInt6] = ((t)second);
      }
      paramz.T(m);
      n = paramInt1;
    }
    String str = "video/3gpp";
    if (n == 1831958048) {
      paramm = "video/mpeg";
    } else if (n == 1211250227) {
      paramm = "video/3gpp";
    } else {
      paramm = null;
    }
    float f = 1.0F;
    paramInt1 = 8;
    int i1 = 8;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    int i2 = -1;
    int i3 = -1;
    paramInt6 = -1;
    i = -1;
    int i4 = -1;
    Object localObject2 = null;
    Object localObject6 = null;
    int i5 = 0;
    int i6 = n;
    Object localObject7 = localObject1;
    for (;;)
    {
      localObject1 = paramd;
      int i7 = paramInt3;
      n = paramInt2;
      int i8;
      int i9;
      if (m - n < i7)
      {
        paramz.T(m);
        i8 = paramz.f();
        i9 = paramz.p();
        if ((i9 == 0) && (paramz.f() - n == i7)) {
          break;
        }
      }
      boolean bool;
      if (i9 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      u.a(bool, "childAtomSize must be positive");
      i7 = paramz.p();
      if (i7 == 1635148611)
      {
        if (paramm == null) {
          bool = true;
        } else {
          bool = false;
        }
        u.a(bool, null);
        paramz.T(i8 + 8);
        paramm = F0.d.b(paramz);
        localObject3 = a;
        c = b;
        if (i5 == 0) {
          f = k;
        }
        localObject4 = l;
        i3 = j;
        paramInt6 = g;
        i = h;
        i4 = i;
        paramInt1 = e;
        n = f;
        paramm = "video/avc";
      }
      else if (i7 == 1752589123)
      {
        if (paramm == null) {
          bool = true;
        } else {
          bool = false;
        }
        u.a(bool, null);
        paramz.T(i8 + 8);
        paramm = F.a(paramz);
        localObject3 = a;
        c = b;
        if (i5 == 0) {
          f = j;
        }
        i3 = k;
        localObject4 = l;
        paramInt6 = g;
        i = h;
        i4 = i;
        paramInt1 = e;
        n = f;
        paramm = "video/hevc";
      }
      else
      {
        Object localObject8;
        Object localObject9;
        if ((i7 == 1685480259) || (i7 != 1685485123))
        {
          if (i7 == 1987076931)
          {
            if (paramm == null) {}
            for (bool = true;; bool = false) {
              break;
            }
            u.a(bool, null);
            if (i6 == 1987063864) {
              paramm = "video/x-vnd.on2.vp8";
            } else {
              paramm = "video/x-vnd.on2.vp9";
            }
            paramz.T(i8 + 12);
            paramz.U(2);
            n = paramz.G();
            if ((n & 0x1) != 0) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            }
            paramInt6 = paramz.G();
            i4 = paramz.G();
            paramInt6 = h.j(paramInt6);
            if (paramInt1 != 0) {
              i = 1;
            } else {
              i = 2;
            }
            i4 = h.k(i4);
            paramInt1 = n >> 4;
            n = paramInt1;
            break label1707;
          }
          if (i7 == 1635135811)
          {
            paramInt1 = i9 - 8;
            paramm = new byte[paramInt1];
            paramz.l(paramm, 0, paramInt1);
            localObject3 = X2.v.Z(paramm);
            paramz.T(i8 + 8);
            paramm = h(paramz);
            paramInt1 = e;
            n = f;
            paramInt6 = a;
            i = b;
            i4 = c;
            paramm = "video/av01";
            break label1707;
          }
          if (i7 == 1668050025)
          {
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = a();
            }
            ((ByteBuffer)localObject1).position(21);
            ((ByteBuffer)localObject1).putShort(paramz.C());
            ((ByteBuffer)localObject1).putShort(paramz.C());
          }
          for (localObject2 = localObject1;; localObject2 = localObject1)
          {
            n = paramInt1;
            paramInt1 = n;
            n = i1;
            break label1707;
            if (i7 != 1835295606) {
              break;
            }
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = a();
            }
            short s1 = paramz.C();
            short s2 = paramz.C();
            short s3 = paramz.C();
            short s4 = paramz.C();
            short s5 = paramz.C();
            short s6 = paramz.C();
            short s7 = paramz.C();
            short s8 = paramz.C();
            long l1 = paramz.I();
            long l2 = paramz.I();
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
          }
          n = paramInt1;
          Object localObject10;
          if (i7 == 1681012275)
          {
            if (paramm == null) {
              bool = true;
            } else {
              bool = false;
            }
            u.a(bool, null);
            localObject1 = str;
            localObject8 = localObject6;
            paramInt1 = i2;
            localObject9 = localObject5;
            localObject10 = localObject3;
          }
          for (;;)
          {
            paramm = (m)localObject1;
            localObject3 = localObject10;
            localObject5 = localObject9;
            i2 = paramInt1;
            localObject6 = localObject8;
            break;
            if (i7 == 1702061171)
            {
              if (paramm == null) {
                bool = true;
              } else {
                bool = false;
              }
              u.a(bool, null);
              localObject8 = k(paramz, i8);
              localObject1 = b.a((b)localObject8);
              paramm = b.b((b)localObject8);
              if (paramm != null) {
                localObject3 = X2.v.Z(paramm);
              }
              localObject10 = localObject3;
              localObject9 = localObject5;
              paramInt1 = i2;
            }
            else
            {
              if (i7 == 1885434736)
              {
                f = s(paramz, i8);
                paramInt1 = n;
                i5 = 1;
                n = i1;
                break label1707;
              }
              if (i7 == 1937126244)
              {
                localObject9 = t(paramz, i8, i9);
                localObject1 = paramm;
                localObject10 = localObject3;
                paramInt1 = i2;
                localObject8 = localObject6;
              }
              else
              {
                if (i7 != 1936995172) {
                  break label1459;
                }
                i7 = paramz.G();
                paramz.U(3);
                localObject1 = paramm;
                localObject10 = localObject3;
                localObject9 = localObject5;
                paramInt1 = i2;
                localObject8 = localObject6;
                if (i7 == 0)
                {
                  paramInt1 = paramz.G();
                  if (paramInt1 != 0)
                  {
                    if (paramInt1 != 1)
                    {
                      if (paramInt1 != 2)
                      {
                        if (paramInt1 != 3)
                        {
                          localObject1 = paramm;
                          localObject10 = localObject3;
                          localObject9 = localObject5;
                          paramInt1 = i2;
                          localObject8 = localObject6;
                        }
                        else
                        {
                          paramInt1 = 3;
                          localObject1 = paramm;
                          localObject10 = localObject3;
                          localObject9 = localObject5;
                          localObject8 = localObject6;
                        }
                      }
                      else
                      {
                        paramInt1 = 2;
                        localObject1 = paramm;
                        localObject10 = localObject3;
                        localObject9 = localObject5;
                        localObject8 = localObject6;
                      }
                    }
                    else
                    {
                      paramInt1 = 1;
                      localObject1 = paramm;
                      localObject10 = localObject3;
                      localObject9 = localObject5;
                      localObject8 = localObject6;
                    }
                  }
                  else
                  {
                    paramInt1 = 0;
                    localObject1 = paramm;
                    localObject10 = localObject3;
                    localObject9 = localObject5;
                    localObject8 = localObject6;
                  }
                }
              }
            }
          }
          label1459:
          if (i7 == 1668246642)
          {
            localObject8 = paramm;
            localObject1 = localObject4;
            if (paramInt6 == -1)
            {
              localObject8 = paramm;
              localObject1 = localObject4;
              if (i4 == -1)
              {
                n = paramz.p();
                if ((n != 1852009592) && (n != 1852009571))
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("Unsupported color type: ");
                  ((StringBuilder)localObject1).append(a.a(n));
                  g0.o.h("AtomParsers", ((StringBuilder)localObject1).toString());
                  localObject8 = paramm;
                  localObject1 = localObject4;
                }
                else
                {
                  i = paramz.M();
                  i4 = paramz.M();
                  paramz.U(2);
                  if ((i9 == 19) && ((paramz.G() & 0x80) != 0)) {
                    paramInt6 = 1;
                  } else {
                    paramInt6 = 0;
                  }
                  n = h.j(i);
                  if (paramInt6 != 0) {
                    i = 1;
                  } else {
                    i = 2;
                  }
                  i4 = h.k(i4);
                  paramInt6 = n;
                  n = i1;
                  break label1707;
                }
              }
            }
          }
          else
          {
            localObject1 = localObject4;
            localObject8 = paramm;
          }
        }
        for (;;)
        {
          paramm = (m)localObject8;
          localObject4 = localObject1;
          break;
          localObject9 = F0.o.a(paramz);
          localObject8 = paramm;
          localObject1 = localObject4;
          if (localObject9 != null)
          {
            localObject1 = c;
            localObject8 = "video/dolby-vision";
          }
        }
      }
      label1707:
      m += i9;
      i1 = n;
    }
    if (paramm == null) {
      return;
    }
    paramm = new q.b().Z(paramInt4).o0(paramm).O((String)localObject4).v0(j).Y(k).k0(f).n0(paramInt5).l0((byte[])localObject5).r0(i2).b0((List)localObject3).g0(i3).U((m)localObject7);
    localObject3 = new h.b().d(paramInt6).c(i).e(i4);
    if (localObject2 != null) {
      paramz = ((ByteBuffer)localObject2).array();
    } else {
      paramz = null;
    }
    paramz = paramm.P(((h.b)localObject3).f(paramz).g(paramInt1).b(i1).a());
    if (localObject6 != null) {
      paramz.M(f.m(b.d((b)localObject6))).j0(f.m(b.c((b)localObject6)));
    }
    b = paramz.K();
  }
  
  public static x F(g0.z paramz)
  {
    int i = paramz.C();
    paramz.U(2);
    paramz = paramz.D(i);
    i = Math.max(paramz.lastIndexOf('+'), paramz.lastIndexOf('-'));
    try
    {
      float f1 = Float.parseFloat(paramz.substring(0, i));
      float f2 = Float.parseFloat(paramz.substring(i, paramz.length() - 1));
      paramz = new h0/b;
      paramz.<init>(f1, f2);
      paramz = new x(new x.b[] { paramz });
      return paramz;
    }
    catch (IndexOutOfBoundsException|NumberFormatException paramz) {}
    return null;
  }
  
  public static ByteBuffer a()
  {
    return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
  }
  
  public static boolean b(long[] paramArrayOfLong, long paramLong1, long paramLong2, long paramLong3)
  {
    int i = paramArrayOfLong.length;
    boolean bool = true;
    int j = i - 1;
    i = M.p(4, 0, j);
    j = M.p(paramArrayOfLong.length - 4, 0, j);
    if ((paramArrayOfLong[0] > paramLong2) || (paramLong2 >= paramArrayOfLong[i]) || (paramArrayOfLong[j] >= paramLong3) || (paramLong3 > paramLong1)) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 1) {
      bool = false;
    }
    return bool;
  }
  
  public static int d(g0.z paramz, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramz.f();
    boolean bool;
    if (i >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    u.a(bool, null);
    while (i - paramInt2 < paramInt3)
    {
      paramz.T(i);
      int j = paramz.p();
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      }
      u.a(bool, "childAtomSize must be positive");
      if (paramz.p() == paramInt1) {
        return i;
      }
      i += j;
    }
    return -1;
  }
  
  public static int e(int paramInt)
  {
    if (paramInt == 1936684398) {
      return 1;
    }
    if (paramInt == 1986618469) {
      return 2;
    }
    if ((paramInt != 1952807028) && (paramInt != 1935832172) && (paramInt != 1937072756) && (paramInt != 1668047728))
    {
      if (paramInt == 1835365473) {
        return 5;
      }
      return -1;
    }
    return 3;
  }
  
  public static void f(g0.z paramz)
  {
    int i = paramz.f();
    paramz.U(4);
    int j = i;
    if (paramz.p() != 1751411826) {
      j = i + 4;
    }
    paramz.T(j);
  }
  
  public static void g(g0.z paramz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, m paramm, d paramd, int paramInt5)
  {
    int i = paramInt2;
    paramz.T(i + 16);
    int j;
    if (paramBoolean)
    {
      j = paramz.M();
      paramz.U(6);
    }
    else
    {
      paramz.U(8);
      j = 0;
    }
    int m;
    int n;
    int i1;
    if ((j != 0) && (j != 1))
    {
      if (j == 2)
      {
        paramz.U(16);
        k = (int)Math.round(paramz.o());
        m = paramz.K();
        paramz.U(4);
        n = paramz.K();
        i1 = paramz.K();
        if ((i1 & 0x1) != 0) {
          j = 1;
        } else {
          j = 0;
        }
        if ((i1 & 0x2) != 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (j == 0)
        {
          if (n == 8)
          {
            j = 3;
            break label246;
          }
          if (n == 16)
          {
            if (i1 != 0)
            {
              j = 268435456;
              break label246;
            }
            j = 2;
            break label246;
          }
          if (n == 24)
          {
            if (i1 != 0)
            {
              j = 1342177280;
              break label246;
            }
            j = 21;
            break label246;
          }
          if (n == 32)
          {
            if (i1 != 0)
            {
              j = 1610612736;
              break label246;
            }
            j = 22;
            break label246;
          }
        }
        else if (n == 32)
        {
          j = 4;
          break label246;
        }
        j = -1;
        label246:
        paramz.U(8);
        i2 = 0;
        n = j;
        j = k;
        i1 = m;
        m = i2;
      }
    }
    else
    {
      i1 = paramz.M();
      paramz.U(6);
      k = paramz.H();
      paramz.T(paramz.f() - 4);
      m = paramz.p();
      if (j == 1) {
        paramz.U(16);
      }
      n = -1;
      j = k;
    }
    int i2 = paramz.f();
    Object localObject1 = paramm;
    int k = paramInt1;
    if (paramInt1 == 1701733217)
    {
      localObject2 = u(paramz, i, paramInt3);
      localObject3 = paramm;
      if (localObject2 != null)
      {
        paramInt1 = ((Integer)first).intValue();
        if (paramm == null) {
          localObject3 = null;
        } else {
          localObject3 = paramm.c(second).b);
        }
        a[paramInt5] = ((t)second);
      }
      paramz.T(i2);
      k = paramInt1;
      localObject1 = localObject3;
    }
    String str1 = "audio/mhm1";
    if (k == 1633889587) {
      paramm = "audio/ac3";
    } else if (k == 1700998451) {
      paramm = "audio/eac3";
    } else if (k == 1633889588) {
      paramm = "audio/ac4";
    } else if (k == 1685353315) {
      paramm = "audio/vnd.dts";
    } else if ((k != 1685353320) && (k != 1685353324))
    {
      if (k == 1685353317)
      {
        paramm = "audio/vnd.dts.hd;profile=lbr";
      }
      else if (k == 1685353336)
      {
        paramm = "audio/vnd.dts.uhd;profile=p2";
      }
      else if (k == 1935764850)
      {
        paramm = "audio/3gpp";
      }
      else if (k == 1935767394)
      {
        paramm = "audio/amr-wb";
      }
      else
      {
        if (k == 1936684916) {}
        do
        {
          paramm = "audio/raw";
          n = 2;
          break label819;
          if (k == 1953984371)
          {
            paramm = "audio/raw";
            n = 268435456;
            break label819;
          }
          if (k != 1819304813) {
            break;
          }
        } while (n == -1);
        paramm = "audio/raw";
        break label819;
        if ((k != 778924082) && (k != 778924083))
        {
          if (k == 1835557169) {
            paramm = "audio/mha1";
          } else if (k == 1835560241) {
            paramm = "audio/mhm1";
          } else if (k == 1634492771) {
            paramm = "audio/alac";
          } else if (k == 1634492791) {
            paramm = "audio/g711-alaw";
          } else if (k == 1970037111) {
            paramm = "audio/g711-mlaw";
          } else if (k == 1332770163) {
            paramm = "audio/opus";
          } else if (k == 1716281667) {
            paramm = "audio/flac";
          } else if (k == 1835823201) {
            paramm = "audio/true-hd";
          } else {
            paramm = null;
          }
        }
        else {
          paramm = "audio/mpeg";
        }
      }
    }
    else {
      paramm = "audio/vnd.dts.hd";
    }
    label819:
    Object localObject3 = null;
    Object localObject2 = null;
    Object localObject4 = null;
    k = i2;
    paramInt1 = i1;
    paramInt5 = j;
    Object localObject5 = paramm;
    while (k - paramInt2 < paramInt3)
    {
      paramz.T(k);
      i2 = paramz.p();
      boolean bool;
      if (i2 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      u.a(bool, "childAtomSize must be positive");
      j = paramz.p();
      if (j == 1835557187)
      {
        paramz.T(k + 8);
        paramz.U(1);
        j = paramz.G();
        paramz.U(1);
        if (Objects.equals(localObject5, str1)) {
          localObject6 = String.format("mhm1.%02X", new Object[] { Integer.valueOf(j) });
        } else {
          localObject6 = String.format("mha1.%02X", new Object[] { Integer.valueOf(j) });
        }
        j = paramz.M();
        paramm = new byte[j];
        paramz.l(paramm, 0, j);
        if (localObject2 == null) {
          paramm = X2.v.Z(paramm);
        } else {
          paramm = X2.v.a0(paramm, (byte[])((List)localObject2).get(0));
        }
        localObject3 = localObject6;
      }
      for (;;)
      {
        j = paramInt5;
        localObject6 = localObject3;
        i1 = paramInt1;
        break label1875;
        if (j == 1835557200)
        {
          paramz.T(k + 8);
          j = paramz.G();
          localObject6 = localObject3;
          paramm = (m)localObject2;
          if (j <= 0) {
            break;
          }
          paramm = new byte[j];
          paramz.l(paramm, 0, j);
          if (localObject2 == null)
          {
            paramm = X2.v.Z(paramm);
            localObject6 = localObject3;
            break;
          }
          paramm = X2.v.a0((byte[])((List)localObject2).get(0), paramm);
          localObject6 = localObject3;
          break;
        }
        if ((j != 1702061171) && ((paramBoolean) && (j == 2002876005))) {
          break label1669;
        }
        if (j == 1684103987) {
          paramz.T(k + 8);
        }
        for (paramm = F0.b.d(paramz, Integer.toString(paramInt4), paramString, (m)localObject1);; paramm = F0.b.h(paramz, Integer.toString(paramInt4), paramString, (m)localObject1))
        {
          b = paramm;
          break label1651;
          if (j != 1684366131) {
            break;
          }
          paramz.T(k + 8);
        }
        if (j == 1684103988)
        {
          paramz.T(k + 8);
          b = F0.c.b(paramz, Integer.toString(paramInt4), paramString, (m)localObject1);
          break label1651;
        }
        if (j != 1684892784) {
          break label1341;
        }
        if (m <= 0) {
          break label1309;
        }
        paramInt5 = m;
        paramInt1 = 2;
        paramm = (m)localObject2;
      }
      label1309:
      paramz = new StringBuilder();
      paramz.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
      paramz.append(m);
      throw A.a(paramz.toString(), null);
      label1341:
      if ((j == 1684305011) || (j != 1969517683))
      {
        if (j == 1682927731)
        {
          j = i2 - 8;
          localObject2 = a;
          paramm = Arrays.copyOf((byte[])localObject2, localObject2.length + j);
          paramz.T(k + 8);
          paramz.l(paramm, localObject2.length, j);
          paramm = K.a(paramm);
          j = paramInt5;
          localObject6 = localObject3;
          i1 = paramInt1;
          break label1875;
        }
        if (j == 1684425825)
        {
          paramm = new byte[i2 - 8];
          paramm[0] = ((byte)102);
          paramm[1] = ((byte)76);
          paramm[2] = ((byte)97);
          paramm[3] = ((byte)67);
          paramz.T(k + 12);
          paramz.l(paramm, 4, i2 - 12);
          paramm = X2.v.Z(paramm);
          j = paramInt5;
          localObject6 = localObject3;
          i1 = paramInt1;
          break label1875;
        }
        if (j == 1634492771)
        {
          paramInt1 = i2 - 12;
          paramm = new byte[paramInt1];
          paramz.T(k + 12);
          paramz.l(paramm, 0, paramInt1);
          localObject2 = g0.d.e(paramm);
          j = ((Integer)first).intValue();
          i1 = ((Integer)second).intValue();
          paramm = X2.v.Z(paramm);
          localObject6 = localObject3;
          break label1875;
        }
      }
      else
      {
        b = new q.b().Z(paramInt4).o0((String)localObject5).N(paramInt1).p0(paramInt5).U((m)localObject1).e0(paramString).K();
      }
      label1651:
      j = paramInt5;
      Object localObject6 = localObject3;
      i1 = paramInt1;
      paramm = (m)localObject2;
      break label1875;
      label1669:
      if (j == 1702061171) {}
      for (i = k;; i = d(paramz, 1702061171, k, i2)) {
        break;
      }
      j = paramInt5;
      localObject6 = localObject3;
      i1 = paramInt1;
      paramm = (m)localObject2;
      if (i != -1)
      {
        b localb = k(paramz, i);
        String str2 = b.a(localb);
        byte[] arrayOfByte = b.b(localb);
        localObject5 = str2;
        j = paramInt5;
        localObject6 = localObject3;
        i1 = paramInt1;
        paramm = (m)localObject2;
        localObject4 = localb;
        if (arrayOfByte != null) {
          if ("audio/vorbis".equals(str2))
          {
            paramm = W.e(arrayOfByte);
            localObject5 = str2;
            j = paramInt5;
            localObject6 = localObject3;
            i1 = paramInt1;
            localObject4 = localb;
          }
          else
          {
            if ("audio/mp4a-latm".equals(str2))
            {
              paramm = F0.a.e(arrayOfByte);
              paramInt5 = a;
              paramInt1 = b;
              localObject3 = c;
            }
            paramm = X2.v.Z(arrayOfByte);
            localObject4 = localb;
            i1 = paramInt1;
            localObject6 = localObject3;
            j = paramInt5;
            localObject5 = str2;
          }
        }
      }
      label1875:
      k += i2;
      paramInt5 = j;
      localObject3 = localObject6;
      paramInt1 = i1;
      localObject2 = paramm;
    }
    if ((b == null) && (localObject5 != null))
    {
      paramz = new q.b().Z(paramInt4).o0((String)localObject5).O((String)localObject3).N(paramInt1).p0(paramInt5).i0(n).b0((List)localObject2).U((m)localObject1).e0(paramString);
      if (localObject4 != null) {
        paramz.M(f.m(b.d((b)localObject4))).j0(f.m(b.c((b)localObject4)));
      }
      b = paramz.K();
    }
  }
  
  public static h h(g0.z paramz)
  {
    h.b localb = new h.b();
    y localy = new y(paramz.e());
    localy.p(paramz.f() * 8);
    int i = 1;
    localy.s(1);
    int j = localy.h(3);
    localy.r(6);
    boolean bool1 = localy.g();
    boolean bool2 = localy.g();
    int k = 10;
    if ((j == 2) && (bool1))
    {
      if (bool2) {
        j = 12;
      } else {
        j = 10;
      }
      localb.g(j);
      j = k;
      if (bool2) {
        j = 12;
      }
    }
    for (;;)
    {
      localb.b(j);
      break;
      if (j > 2) {
        break;
      }
      if (bool1) {
        j = 10;
      } else {
        j = 8;
      }
      localb.g(j);
      if (bool1) {
        j = k;
      } else {
        j = 8;
      }
    }
    localy.r(13);
    localy.q();
    j = localy.h(4);
    if (j != 1)
    {
      paramz = new StringBuilder();
      paramz.append("Unsupported obu_type: ");
      paramz.append(j);
      paramz = paramz.toString();
    }
    int m;
    for (;;)
    {
      g0.o.f("AtomParsers", paramz);
      return localb.a();
      if (localy.g())
      {
        paramz = "Unsupported obu_extension_flag";
      }
      else
      {
        bool1 = localy.g();
        localy.q();
        if ((bool1) && (localy.h(8) > 127))
        {
          paramz = "Excessive obu_size";
        }
        else
        {
          m = localy.h(3);
          localy.q();
          if (localy.g())
          {
            paramz = "Unsupported reduced_still_picture_header";
          }
          else if (localy.g())
          {
            paramz = "Unsupported timing_info_present_flag";
          }
          else
          {
            if (!localy.g()) {
              break;
            }
            paramz = "Unsupported initial_display_delay_present_flag";
          }
        }
      }
    }
    int n = localy.h(5);
    k = 0;
    for (j = 0; j <= n; j++)
    {
      localy.r(12);
      if (localy.h(5) > 7) {
        localy.q();
      }
    }
    n = localy.h(4);
    j = localy.h(4);
    localy.r(n + 1);
    localy.r(j + 1);
    if (localy.g()) {
      localy.r(7);
    }
    localy.r(7);
    bool1 = localy.g();
    if (bool1) {
      localy.r(2);
    }
    if (((localy.g()) || (localy.h(1) > 0)) && (!localy.g())) {
      localy.r(1);
    }
    if (bool1) {
      localy.r(3);
    }
    localy.r(3);
    bool1 = localy.g();
    if ((m == 2) && (bool1)) {
      localy.q();
    }
    j = k;
    if (m != 1)
    {
      j = k;
      if (localy.g()) {
        j = 1;
      }
    }
    if (localy.g())
    {
      m = localy.h(8);
      k = localy.h(8);
      n = localy.h(8);
      if ((j == 0) && (m == 1) && (k == 13) && (n == 0)) {
        j = 1;
      } else {
        j = localy.h(1);
      }
      paramz = localb.d(h.j(m));
      if (j == 1) {
        j = i;
      } else {
        j = 2;
      }
      paramz.c(j).e(h.k(k));
    }
    return localb.a();
  }
  
  public static Pair i(g0.z paramz, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    boolean bool1 = false;
    int j = -1;
    int k = 0;
    Object localObject1 = null;
    Object localObject3;
    for (Object localObject2 = localObject1; i - paramInt1 < paramInt2; localObject2 = localObject3)
    {
      paramz.T(i);
      int m = paramz.p();
      int n = paramz.p();
      Object localObject4;
      if (n == 1718775137)
      {
        localObject3 = Integer.valueOf(paramz.p());
        localObject4 = localObject1;
      }
      else if (n == 1935894637)
      {
        paramz.U(4);
        localObject4 = paramz.D(4);
        localObject3 = localObject2;
      }
      else
      {
        localObject4 = localObject1;
        localObject3 = localObject2;
        if (n == 1935894633)
        {
          j = i;
          k = m;
          localObject3 = localObject2;
          localObject4 = localObject1;
        }
      }
      i += m;
      localObject1 = localObject4;
    }
    if ((!"cenc".equals(localObject1)) && (!"cbc1".equals(localObject1)) && (!"cens".equals(localObject1)) && (!"cbcs".equals(localObject1))) {
      return null;
    }
    if (localObject2 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    u.a(bool2, "frma atom is mandatory");
    if (j != -1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    u.a(bool2, "schi atom is mandatory");
    paramz = v(paramz, j, k, (String)localObject1);
    boolean bool2 = bool1;
    if (paramz != null) {
      bool2 = true;
    }
    u.a(bool2, "tenc atom is mandatory");
    return Pair.create(localObject2, (t)M.i(paramz));
  }
  
  public static Pair j(a.a parama)
  {
    parama = parama.g(1701606260);
    if (parama == null) {
      return null;
    }
    g0.z localz = b;
    localz.T(8);
    int i = a.c(localz.p());
    int j = localz.K();
    parama = new long[j];
    long[] arrayOfLong = new long[j];
    int k = 0;
    while (k < j)
    {
      long l;
      if (i == 1) {
        l = localz.L();
      } else {
        l = localz.I();
      }
      parama[k] = l;
      if (i == 1) {
        l = localz.z();
      } else {
        l = localz.p();
      }
      arrayOfLong[k] = l;
      if (localz.C() == 1)
      {
        localz.U(2);
        k++;
      }
      else
      {
        throw new IllegalArgumentException("Unsupported media rate.");
      }
    }
    return Pair.create(parama, arrayOfLong);
  }
  
  public static b k(g0.z paramz, int paramInt)
  {
    paramz.T(paramInt + 12);
    paramz.U(1);
    l(paramz);
    paramz.U(2);
    paramInt = paramz.G();
    if ((paramInt & 0x80) != 0) {
      paramz.U(2);
    }
    if ((paramInt & 0x40) != 0) {
      paramz.U(paramz.G());
    }
    if ((paramInt & 0x20) != 0) {
      paramz.U(2);
    }
    paramz.U(1);
    l(paramz);
    String str = d0.z.h(paramz.G());
    if ((!"audio/mpeg".equals(str)) && (!"audio/vnd.dts".equals(str)) && (!"audio/vnd.dts.hd".equals(str)))
    {
      paramz.U(4);
      long l1 = paramz.I();
      long l2 = paramz.I();
      paramz.U(1);
      paramInt = l(paramz);
      byte[] arrayOfByte = new byte[paramInt];
      paramz.l(arrayOfByte, 0, paramInt);
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
  
  public static int l(g0.z paramz)
  {
    int i = paramz.G();
    for (int j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F) {
      i = paramz.G();
    }
    return j;
  }
  
  public static int m(g0.z paramz)
  {
    paramz.T(16);
    return paramz.p();
  }
  
  public static x n(g0.z paramz, int paramInt)
  {
    paramz.U(8);
    ArrayList localArrayList = new ArrayList();
    while (paramz.f() < paramInt)
    {
      x.b localb = j.c(paramz);
      if (localb != null) {
        localArrayList.add(localb);
      }
    }
    if (localArrayList.isEmpty()) {
      paramz = null;
    } else {
      paramz = new x(localArrayList);
    }
    return paramz;
  }
  
  public static Pair o(g0.z paramz)
  {
    int i = 8;
    paramz.T(8);
    int j = a.c(paramz.p());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    }
    paramz.U(k);
    long l = paramz.I();
    int k = i;
    if (j == 0) {
      k = 4;
    }
    paramz.U(k);
    k = paramz.M();
    paramz = new StringBuilder();
    paramz.append("");
    paramz.append((char)((k >> 10 & 0x1F) + 96));
    paramz.append((char)((k >> 5 & 0x1F) + 96));
    paramz.append((char)((k & 0x1F) + 96));
    return Pair.create(Long.valueOf(l), paramz.toString());
  }
  
  public static x p(a.a parama)
  {
    Object localObject1 = parama.g(1751411826);
    Object localObject2 = parama.g(1801812339);
    Object localObject3 = parama.g(1768715124);
    Object localObject4 = null;
    parama = (a.a)localObject4;
    if (localObject1 != null)
    {
      parama = (a.a)localObject4;
      if (localObject2 != null)
      {
        parama = (a.a)localObject4;
        if (localObject3 != null) {
          if (m(b) != 1835299937)
          {
            parama = (a.a)localObject4;
          }
          else
          {
            localObject1 = b;
            ((g0.z)localObject1).T(12);
            int i = ((g0.z)localObject1).p();
            parama = new String[i];
            int k;
            for (int j = 0; j < i; j++)
            {
              k = ((g0.z)localObject1).p();
              ((g0.z)localObject1).U(4);
              parama[j] = ((g0.z)localObject1).D(k - 8);
            }
            localObject3 = b;
            ((g0.z)localObject3).T(8);
            localObject1 = new ArrayList();
            while (((g0.z)localObject3).a() > 8)
            {
              j = ((g0.z)localObject3).f();
              k = ((g0.z)localObject3).p();
              int m = ((g0.z)localObject3).p() - 1;
              if ((m >= 0) && (m < i))
              {
                localObject2 = j.h((g0.z)localObject3, j + k, parama[m]);
                if (localObject2 != null) {
                  ((ArrayList)localObject1).add(localObject2);
                }
              }
              else
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("Skipped metadata with unknown key index: ");
                ((StringBuilder)localObject2).append(m);
                g0.o.h("AtomParsers", ((StringBuilder)localObject2).toString());
              }
              ((g0.z)localObject3).T(j + k);
            }
            if (((ArrayList)localObject1).isEmpty()) {
              parama = (a.a)localObject4;
            } else {
              parama = new x((List)localObject1);
            }
          }
        }
      }
    }
    return parama;
  }
  
  public static void q(g0.z paramz, int paramInt1, int paramInt2, int paramInt3, d paramd)
  {
    paramz.T(paramInt2 + 16);
    if (paramInt1 == 1835365492)
    {
      paramz.A();
      paramz = paramz.A();
      if (paramz != null) {
        b = new q.b().Z(paramInt3).o0(paramz).K();
      }
    }
  }
  
  public static h0.c r(g0.z paramz)
  {
    paramz.T(8);
    long l1;
    if (a.c(paramz.p()) == 0) {
      l1 = paramz.I();
    }
    for (long l2 = paramz.I();; l2 = paramz.z())
    {
      break;
      l1 = paramz.z();
    }
    return new h0.c(l1, l2, paramz.I());
  }
  
  public static float s(g0.z paramz, int paramInt)
  {
    paramz.T(paramInt + 8);
    paramInt = paramz.K();
    int i = paramz.K();
    return paramInt / i;
  }
  
  public static byte[] t(g0.z paramz, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    while (i - paramInt1 < paramInt2)
    {
      paramz.T(i);
      int j = paramz.p();
      if (paramz.p() == 1886547818) {
        return Arrays.copyOfRange(paramz.e(), i, j + i);
      }
      i += j;
    }
    return null;
  }
  
  public static Pair u(g0.z paramz, int paramInt1, int paramInt2)
  {
    int i = paramz.f();
    while (i - paramInt1 < paramInt2)
    {
      paramz.T(i);
      int j = paramz.p();
      boolean bool;
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      }
      u.a(bool, "childAtomSize must be positive");
      if (paramz.p() == 1936289382)
      {
        Pair localPair = i(paramz, i, j);
        if (localPair != null) {
          return localPair;
        }
      }
      i += j;
    }
    return null;
  }
  
  public static t v(g0.z paramz, int paramInt1, int paramInt2, String paramString)
  {
    int i = paramInt1 + 8;
    for (;;)
    {
      Object localObject1 = null;
      if (i - paramInt1 >= paramInt2) {
        break;
      }
      paramz.T(i);
      int j = paramz.p();
      if (paramz.p() == 1952804451)
      {
        paramInt1 = a.c(paramz.p());
        paramz.U(1);
        if (paramInt1 == 0)
        {
          paramz.U(1);
          paramInt2 = 0;
          paramInt1 = paramInt2;
        }
        else
        {
          paramInt2 = paramz.G();
          paramInt1 = paramInt2 & 0xF;
          paramInt2 = (paramInt2 & 0xF0) >> 4;
        }
        boolean bool;
        if (paramz.G() == 1) {
          bool = true;
        } else {
          bool = false;
        }
        j = paramz.G();
        byte[] arrayOfByte = new byte[16];
        paramz.l(arrayOfByte, 0, 16);
        Object localObject2 = localObject1;
        if (bool)
        {
          localObject2 = localObject1;
          if (j == 0)
          {
            i = paramz.G();
            localObject2 = new byte[i];
            paramz.l((byte[])localObject2, 0, i);
          }
        }
        return new t(bool, paramString, j, arrayOfByte, paramInt2, paramInt1, (byte[])localObject2);
      }
      i += j;
    }
    return null;
  }
  
  public static v w(s params, a.a parama, E paramE)
  {
    Object localObject1 = parama.g(1937011578);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new e((a.b)localObject1, f);
    }
    else
    {
      localObject1 = parama.g(1937013298);
      if (localObject1 == null) {
        break label2309;
      }
      localObject2 = new f((a.b)localObject1);
    }
    int i = ((c)localObject2).b();
    if (i == 0) {
      return new v(params, new long[0], new int[0], 0, new long[0], new int[0], 0L);
    }
    localObject1 = parama.g(1937007471);
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = (a.b)g0.a.e(parama.g(1668232756));
      bool1 = true;
    }
    else
    {
      bool1 = false;
    }
    Object localObject3 = b;
    Object localObject4 = eg1937011555b;
    Object localObject5 = eg1937011827b;
    localObject1 = parama.g(1937011571);
    if (localObject1 != null) {
      localObject1 = b;
    } else {
      localObject1 = null;
    }
    parama = parama.g(1668576371);
    if (parama != null) {
      localObject6 = b;
    } else {
      localObject6 = null;
    }
    Object localObject7 = new a((g0.z)localObject4, (g0.z)localObject3, bool1);
    ((g0.z)localObject5).T(12);
    int j = ((g0.z)localObject5).K() - 1;
    int k = ((g0.z)localObject5).K();
    int m = ((g0.z)localObject5).K();
    if (localObject6 != null)
    {
      ((g0.z)localObject6).T(12);
      n = ((g0.z)localObject6).K();
    }
    else
    {
      n = 0;
    }
    if (localObject1 != null)
    {
      ((g0.z)localObject1).T(12);
      i1 = ((g0.z)localObject1).K();
      if (i1 > 0)
      {
        i2 = ((g0.z)localObject1).K() - 1;
      }
      else
      {
        i2 = -1;
        localObject1 = null;
      }
    }
    else
    {
      i2 = -1;
      i1 = 0;
    }
    int i3 = ((c)localObject2).a();
    parama = f.n;
    int i4;
    if ((i3 != -1) && (("audio/raw".equals(parama)) || ("audio/g711-mlaw".equals(parama)) || ("audio/g711-alaw".equals(parama))) && (j == 0) && (n == 0) && (i1 == 0)) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    Object localObject8;
    long l3;
    if (i4 != 0)
    {
      i2 = a;
      localObject1 = new long[i2];
      parama = new int[i2];
      while (((a)localObject7).a())
      {
        i2 = b;
        localObject1[i2] = d;
        parama[i2] = c;
      }
      localObject6 = e.a(i3, (long[])localObject1, parama, m);
      localObject2 = a;
      localObject3 = b;
      i2 = c;
      localObject1 = d;
      parama = e;
      l1 = f;
      i4 = i;
    }
    else
    {
      localObject8 = new long[i];
      localObject3 = new int[i];
      localObject4 = new long[i];
      parama = new int[i];
      int i5 = i2;
      int i6 = 0;
      i3 = 0;
      int i7 = 0;
      int i8 = 0;
      int i9 = 0;
      l2 = 0L;
      l1 = 0L;
      i2 = n;
      i4 = k;
      int i10 = i1;
      i1 = i8;
      k = i7;
      n = i;
      i = i6;
      while (i < n)
      {
        bool1 = true;
        boolean bool2;
        for (;;)
        {
          bool2 = bool1;
          if (k != 0) {
            break;
          }
          bool1 = ((a)localObject7).a();
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          l1 = d;
          k = c;
        }
        i8 = i4;
        if (!bool2)
        {
          g0.o.h("AtomParsers", "Unexpected end of chunk data");
          localObject1 = Arrays.copyOf((long[])localObject8, i);
          localObject2 = Arrays.copyOf((int[])localObject3, i);
          localObject4 = Arrays.copyOf((long[])localObject4, i);
          parama = Arrays.copyOf(parama, i);
          n = i;
          i4 = k;
          localObject3 = localObject1;
          localObject1 = localObject4;
          break label1033;
        }
        i7 = i2;
        i4 = i1;
        i6 = i9;
        if (localObject6 != null)
        {
          while ((i9 == 0) && (i2 > 0))
          {
            i9 = ((g0.z)localObject6).K();
            i1 = ((g0.z)localObject6).p();
            i2--;
          }
          i6 = i9 - 1;
          i4 = i1;
          i7 = i2;
        }
        localObject8[i] = l1;
        i2 = ((c)localObject2).c();
        localObject3[i] = i2;
        i9 = i3;
        if (i2 > i3) {
          i9 = i2;
        }
        localObject4[i] = (l2 + i4);
        if (localObject1 == null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        parama[i] = i2;
        i2 = i5;
        int i11 = i10;
        if (i == i5)
        {
          parama[i] = 1;
          i1 = i10 - 1;
          i2 = i5;
          i11 = i1;
          if (i1 > 0)
          {
            i2 = ((g0.z)g0.a.e(localObject1)).K() - 1;
            i11 = i1;
          }
        }
        l2 += m;
        i1 = i8 - 1;
        if ((i1 == 0) && (j > 0))
        {
          i1 = ((g0.z)localObject5).K();
          i3 = ((g0.z)localObject5).p();
          j--;
        }
        for (;;)
        {
          break;
          i3 = m;
        }
        l3 = localObject3[i];
        i++;
        l1 += l3;
        m = i3;
        k--;
        i8 = i4;
        i5 = i2;
        i10 = i11;
        i3 = i9;
        i4 = i1;
        i2 = i7;
        i1 = i8;
        i9 = i6;
      }
      i8 = i4;
      i4 = k;
      localObject1 = localObject4;
      localObject2 = localObject3;
      localObject3 = localObject8;
      label1033:
      l1 = i1;
      if (localObject6 != null) {
        while (i2 > 0)
        {
          if (((g0.z)localObject6).K() != 0)
          {
            i2 = 0;
            break label1077;
          }
          ((g0.z)localObject6).p();
          i2--;
        }
      }
      i2 = 1;
      label1077:
      if ((i10 == 0) && (i8 == 0) && (i4 == 0) && (j == 0) && (i9 == 0) && (i2 != 0)) {
        break label1263;
      }
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("Inconsistent stbl box for track ");
      ((StringBuilder)localObject4).append(a);
      ((StringBuilder)localObject4).append(": remainingSynchronizationSamples ");
      ((StringBuilder)localObject4).append(i10);
      ((StringBuilder)localObject4).append(", remainingSamplesAtTimestampDelta ");
      ((StringBuilder)localObject4).append(i8);
      ((StringBuilder)localObject4).append(", remainingSamplesInChunk ");
      ((StringBuilder)localObject4).append(i4);
      ((StringBuilder)localObject4).append(", remainingTimestampDeltaChanges ");
      ((StringBuilder)localObject4).append(j);
      ((StringBuilder)localObject4).append(", remainingSamplesAtTimestampOffset ");
      ((StringBuilder)localObject4).append(i9);
      if (i2 == 0) {
        localObject6 = ", ctts invalid";
      } else {
        localObject6 = "";
      }
      ((StringBuilder)localObject4).append((String)localObject6);
      g0.o.h("AtomParsers", ((StringBuilder)localObject4).toString());
      label1263:
      localObject6 = localObject3;
      i2 = i3;
      l1 = l2 + l1;
      localObject3 = localObject2;
      localObject2 = localObject6;
      i4 = n;
    }
    localObject7 = params;
    long l2 = M.W0(l1, 1000000L, c);
    Object localObject6 = h;
    if (localObject6 == null)
    {
      M.X0((long[])localObject1, 1000000L, c);
      return new v(params, (long[])localObject2, (int[])localObject3, i2, (long[])localObject1, parama, l2);
    }
    if ((localObject6.length == 1) && (b == 1) && (localObject1.length >= 2))
    {
      l3 = ((long[])g0.a.e(i))[0];
      l2 = l3 + M.W0(h[0], c, d);
      if (b((long[])localObject1, l1, l3, l2))
      {
        l3 = M.W0(l3 - localObject1[0], f.C, c);
        l2 = M.W0(l1 - l2, f.C, c);
        if (((l3 == 0L) && (l2 == 0L)) || (l3 > 2147483647L) || (l2 > 2147483647L)) {
          break label1574;
        }
        a = ((int)l3);
        b = ((int)l2);
        M.X0((long[])localObject1, 1000000L, c);
        return new v(params, (long[])localObject2, (int[])localObject3, i2, (long[])localObject1, parama, M.W0(h[0], 1000000L, d));
      }
    }
    for (;;)
    {
      break;
    }
    label1574:
    int n = i2;
    paramE = h;
    if ((paramE.length == 1) && (paramE[0] == 0L))
    {
      l2 = ((long[])g0.a.e(i))[0];
      for (i2 = 0; i2 < localObject1.length; i2++) {
        localObject1[i2] = M.W0(localObject1[i2] - l2, 1000000L, c);
      }
      return new v(params, (long[])localObject2, (int[])localObject3, n, (long[])localObject1, parama, M.W0(l1 - l2, 1000000L, c));
    }
    if (b == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    localObject5 = new int[paramE.length];
    int[] arrayOfInt = new int[paramE.length];
    localObject6 = (long[])g0.a.e(i);
    j = 0;
    int i2 = 0;
    k = 0;
    int i1 = 0;
    paramE = (E)localObject3;
    for (;;)
    {
      localObject3 = h;
      if (j >= localObject3.length) {
        break;
      }
      l1 = localObject6[j];
      if (l1 != -1L)
      {
        l2 = M.W0(localObject3[j], c, d);
        localObject5[j] = M.h((long[])localObject1, l1, true, true);
        arrayOfInt[j] = M.d((long[])localObject1, l1 + l2, bool1, false);
        for (;;)
        {
          i3 = localObject5[j];
          i = arrayOfInt[j];
          if ((i3 >= i) || ((parama[i3] & 0x1) != 0)) {
            break;
          }
          localObject5[j] = (i3 + 1);
        }
        k += i - i3;
        if (i1 != i3) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        i1 = i2 | i1;
        i2 = i;
      }
      else
      {
        i = i2;
        i2 = i1;
        i1 = i;
      }
      j++;
      i = i1;
      i1 = i2;
      i2 = i;
    }
    j = 0;
    i1 = 1;
    if (k == i4) {
      i1 = 0;
    }
    i = i2 | i1;
    if (i != 0) {
      localObject4 = new long[k];
    } else {
      localObject4 = localObject2;
    }
    if (i != 0) {
      localObject8 = new int[k];
    } else {
      localObject8 = paramE;
    }
    if (i != 0) {
      i2 = 0;
    } else {
      i2 = n;
    }
    if (i != 0) {
      localObject6 = new int[k];
    } else {
      localObject6 = parama;
    }
    long[] arrayOfLong = new long[k];
    long l1 = 0L;
    n = 0;
    localObject3 = paramE;
    paramE = parama;
    parama = (a.a)localObject6;
    i1 = j;
    localObject6 = localObject5;
    localObject5 = arrayOfInt;
    while (i1 < h.length)
    {
      l3 = i[i1];
      i4 = localObject6[i1];
      k = localObject5[i1];
      if (i != 0)
      {
        j = k - i4;
        System.arraycopy(localObject2, i4, localObject4, n, j);
        System.arraycopy(localObject3, i4, localObject8, n, j);
        System.arraycopy(paramE, i4, parama, n, j);
      }
      while (i4 < k)
      {
        long l4 = M.W0(l1, 1000000L, d);
        l2 = M.W0(localObject1[i4] - l3, 1000000L, c);
        if (c(b)) {
          l2 = Math.max(0L, l2);
        }
        arrayOfLong[n] = (l4 + l2);
        if ((i != 0) && (localObject8[n] > i2)) {
          i2 = localObject3[i4];
        }
        n++;
        i4++;
      }
      l2 = h[i1];
      i1++;
      l1 += l2;
    }
    return new v(params, (long[])localObject4, (int[])localObject8, i2, arrayOfLong, parama, M.W0(l1, 1000000L, d));
    label2309:
    throw A.a("Track has no sample table size information", null);
  }
  
  public static d x(g0.z paramz, int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    paramz.T(12);
    int i = paramz.p();
    d locald = new d(i);
    for (int j = 0; j < i; j++)
    {
      int k = paramz.f();
      int m = paramz.p();
      boolean bool;
      if (m > 0) {
        bool = true;
      } else {
        bool = false;
      }
      u.a(bool, "childAtomSize must be positive");
      int n = paramz.p();
      if ((n == 1635148593) || (n == 1635148595) || (n == 1701733238) || (n == 1831958048) || (n == 1836070006) || (n == 1752589105) || (n == 1751479857) || (n == 1932670515) || (n == 1211250227) || (n == 1987063864) || (n == 1987063865) || (n == 1635135537) || (n == 1685479798) || (n == 1685479729) || (n == 1685481573) || (n != 1685481521)) {
        if ((n != 1836069985) && (n != 1701733217) && (n != 1633889587) && (n != 1700998451) && (n != 1633889588) && (n != 1835823201) && (n != 1685353315) && (n != 1685353317) && (n != 1685353320) && (n != 1685353324) && (n != 1685353336) && (n != 1935764850) && (n != 1935767394) && (n != 1819304813) && (n != 1936684916) && (n != 1953984371) && (n != 778924082) && (n != 778924083) && (n != 1835557169) && (n != 1835560241) && (n != 1634492771) && (n != 1634492791) && (n != 1970037111) && (n != 1332770163) && (n != 1716281667)) {
          if ((n != 1414810956) && (n != 1954034535) && (n != 2004251764) && (n != 1937010800) && (n != 1664495672)) {
            if (n == 1835365492) {
              q(paramz, n, k, paramInt1, locald);
            }
          }
        }
      }
      for (;;)
      {
        break;
        if (n == 1667329389)
        {
          b = new q.b().Z(paramInt1).o0("application/x-camera-motion").K();
          continue;
          y(paramz, n, k, m, paramInt1, paramString, locald);
        }
        else
        {
          continue;
          g(paramz, n, k, m, paramInt1, paramString, paramBoolean, paramm, locald, j);
          break;
          E(paramz, n, k, m, paramInt1, paramInt2, paramm, locald, j);
        }
      }
      paramz.T(k + m);
    }
    return locald;
  }
  
  public static void y(g0.z paramz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, d paramd)
  {
    paramz.T(paramInt2 + 16);
    String str = "application/ttml+xml";
    Object localObject = null;
    long l = Long.MAX_VALUE;
    if (paramInt1 == 1414810956)
    {
      paramz = str;
    }
    else if (paramInt1 == 1954034535)
    {
      paramInt1 = paramInt3 - 16;
      localObject = new byte[paramInt1];
      paramz.l((byte[])localObject, 0, paramInt1);
      localObject = X2.v.Z(localObject);
      paramz = "application/x-quicktime-tx3g";
    }
    else if (paramInt1 == 2004251764)
    {
      paramz = "application/x-mp4-vtt";
    }
    else if (paramInt1 == 1937010800)
    {
      l = 0L;
      paramz = str;
    }
    else
    {
      if (paramInt1 != 1664495672) {
        break label160;
      }
      d = 1;
      paramz = "application/x-mp4-cea-608";
    }
    b = new q.b().Z(paramInt4).o0(paramz).e0(paramString).s0(l).b0((List)localObject).K();
    return;
    label160:
    throw new IllegalStateException();
  }
  
  public static g z(g0.z paramz)
  {
    int i = 8;
    paramz.T(8);
    int j = a.c(paramz.p());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    }
    paramz.U(k);
    int m = paramz.p();
    paramz.U(4);
    int n = paramz.f();
    int k = i;
    if (j == 0) {
      k = 4;
    }
    int i1 = 0;
    long l1;
    for (i = 0;; i++)
    {
      l1 = -9223372036854775807L;
      if (i >= k) {
        break;
      }
      if (paramz.e()[(n + i)] != -1)
      {
        if (j == 0) {
          l2 = paramz.I();
        } else {
          l2 = paramz.L();
        }
        if (l2 == 0L)
        {
          l2 = l1;
          break label139;
        }
        break label139;
      }
    }
    paramz.U(k);
    long l2 = l1;
    label139:
    paramz.U(16);
    n = paramz.p();
    int i2 = paramz.p();
    paramz.U(4);
    j = paramz.p();
    i = paramz.p();
    if ((n == 0) && (i2 == 65536) && (j == -65536) && (i == 0))
    {
      k = 90;
    }
    else if ((n == 0) && (i2 == -65536) && (j == 65536) && (i == 0))
    {
      k = 270;
    }
    else
    {
      k = i1;
      if (n == -65536)
      {
        k = i1;
        if (i2 == 0)
        {
          k = i1;
          if (j == 0)
          {
            k = i1;
            if (i == -65536) {
              k = 180;
            }
          }
        }
      }
    }
    return new g(m, l2, k);
  }
  
  public static final class a
  {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final g0.z f;
    public final g0.z g;
    public int h;
    public int i;
    
    public a(g0.z paramz1, g0.z paramz2, boolean paramBoolean)
    {
      g = paramz1;
      f = paramz2;
      e = paramBoolean;
      paramz2.T(12);
      a = paramz2.K();
      paramz1.T(12);
      i = paramz1.K();
      int j = paramz1.p();
      paramBoolean = true;
      if (j != 1) {
        paramBoolean = false;
      }
      u.a(paramBoolean, "first_chunk must be 1");
      b = -1;
    }
    
    public boolean a()
    {
      int j = b + 1;
      b = j;
      if (j == a) {
        return false;
      }
      long l;
      if (e) {
        l = f.L();
      } else {
        l = f.I();
      }
      d = l;
      if (b == h)
      {
        c = g.K();
        g.U(4);
        j = i - 1;
        i = j;
        if (j > 0) {
          j = g.K() - 1;
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
    public final t[] a;
    public d0.q b;
    public int c;
    public int d;
    
    public d(int paramInt)
    {
      a = new t[paramInt];
      d = 0;
    }
  }
  
  public static final class e
    implements b.c
  {
    public final int a;
    public final int b;
    public final g0.z c;
    
    public e(a.b paramb, d0.q paramq)
    {
      paramb = b;
      c = paramb;
      paramb.T(12);
      int i = paramb.K();
      int j = i;
      if ("audio/raw".equals(n))
      {
        int k = M.g0(D, B);
        if (i != 0)
        {
          j = i;
          if (i % k == 0) {}
        }
        else
        {
          paramq = new StringBuilder();
          paramq.append("Audio sample size mismatch. stsd sample size: ");
          paramq.append(k);
          paramq.append(", stsz sample size: ");
          paramq.append(i);
          g0.o.h("AtomParsers", paramq.toString());
          j = k;
        }
      }
      i = j;
      if (j == 0) {
        i = -1;
      }
      a = i;
      b = paramb.K();
    }
    
    public int a()
    {
      return a;
    }
    
    public int b()
    {
      return b;
    }
    
    public int c()
    {
      int i = a;
      int j = i;
      if (i == -1) {
        j = c.K();
      }
      return j;
    }
  }
  
  public static final class f
    implements b.c
  {
    public final g0.z a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    
    public f(a.b paramb)
    {
      paramb = b;
      a = paramb;
      paramb.T(12);
      c = (paramb.K() & 0xFF);
      b = paramb.K();
    }
    
    public int a()
    {
      return -1;
    }
    
    public int b()
    {
      return b;
    }
    
    public int c()
    {
      int i = c;
      if (i == 8) {
        return a.G();
      }
      if (i == 16) {
        return a.M();
      }
      i = d;
      d = (i + 1);
      if (i % 2 == 0)
      {
        i = a.G();
        e = i;
        return (i & 0xF0) >> 4;
      }
      return e & 0xF;
    }
  }
  
  public static final class g
  {
    public final int a;
    public final long b;
    public final int c;
    
    public g(int paramInt1, long paramLong, int paramInt2)
    {
      a = paramInt1;
      b = paramLong;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */