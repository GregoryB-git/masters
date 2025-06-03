package Z0;

import F0.L;
import F0.M.b;
import F0.Q;
import F0.T;
import F0.x;
import android.util.Pair;
import android.util.SparseArray;
import c1.t.a;
import d0.A;
import d0.m;
import d0.m.b;
import d0.q;
import d0.q.b;
import g0.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class h
  implements F0.r
{
  public static final x K = new f();
  public static final byte[] L = { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  public static final q M = new q.b().o0("application/x-emsg").K();
  public long A;
  public b B;
  public int C;
  public int D;
  public int E;
  public boolean F;
  public F0.t G;
  public T[] H;
  public T[] I;
  public boolean J;
  public final t.a a;
  public final int b;
  public final s c;
  public final List d;
  public final SparseArray e;
  public final z f;
  public final z g;
  public final z h;
  public final byte[] i;
  public final z j;
  public final g0.E k;
  public final Q0.c l;
  public final z m;
  public final ArrayDeque n;
  public final ArrayDeque o;
  public final T p;
  public X2.v q;
  public int r;
  public int s;
  public long t;
  public int u;
  public z v;
  public long w;
  public int x;
  public long y;
  public long z;
  
  public h(t.a parama, int paramInt)
  {
    this(parama, paramInt, null, null, X2.v.Y(), null);
  }
  
  public h(t.a parama, int paramInt, g0.E paramE, s params, List paramList, T paramT)
  {
    a = parama;
    b = paramInt;
    k = paramE;
    c = params;
    d = Collections.unmodifiableList(paramList);
    p = paramT;
    l = new Q0.c();
    m = new z(16);
    f = new z(h0.d.a);
    g = new z(5);
    h = new z();
    parama = new byte[16];
    i = parama;
    j = new z(parama);
    n = new ArrayDeque();
    o = new ArrayDeque();
    e = new SparseArray();
    q = X2.v.Y();
    z = -9223372036854775807L;
    y = -9223372036854775807L;
    A = -9223372036854775807L;
    G = F0.t.a;
    H = new T[0];
    I = new T[0];
  }
  
  public static void A(t paramt, z paramz, u paramu)
  {
    int i1 = d;
    paramz.T(8);
    int i2 = a.b(paramz.p());
    boolean bool = true;
    if ((i2 & 0x1) == 1) {
      paramz.U(8);
    }
    i2 = paramz.G();
    int i3 = paramz.K();
    if (i3 <= f)
    {
      if (i2 == 0)
      {
        paramt = m;
        int i4 = 0;
        i2 = i4;
        for (;;)
        {
          i5 = i2;
          if (i4 >= i3) {
            break;
          }
          i5 = paramz.G();
          i2 += i5;
          if (i5 > i1) {
            bool = true;
          } else {
            bool = false;
          }
          paramt[i4] = bool;
          i4++;
        }
      }
      if (i2 <= i1) {
        bool = false;
      }
      int i5 = i2 * i3;
      Arrays.fill(m, 0, i3, bool);
      Arrays.fill(m, i3, f, false);
      if (i5 > 0) {
        paramu.d(i5);
      }
      return;
    }
    paramt = new StringBuilder();
    paramt.append("Saiz sample count ");
    paramt.append(i3);
    paramt.append(" is greater than fragment sample count");
    paramt.append(f);
    throw A.a(paramt.toString(), null);
  }
  
  public static void B(a.a parama, String paramString, u paramu)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    int i1 = 0;
    int i2;
    while (i1 < c.size())
    {
      Object localObject4 = (a.b)c.get(i1);
      z localz = b;
      i2 = a;
      Object localObject5;
      if (i2 == 1935828848)
      {
        localz.T(12);
        localObject4 = localObject2;
        localObject5 = localObject3;
        if (localz.p() == 1936025959)
        {
          localObject4 = localz;
          localObject5 = localObject3;
        }
      }
      else
      {
        localObject4 = localObject2;
        localObject5 = localObject3;
        if (i2 == 1936158820)
        {
          localz.T(12);
          localObject4 = localObject2;
          localObject5 = localObject3;
          if (localz.p() == 1936025959)
          {
            localObject5 = localz;
            localObject4 = localObject2;
          }
        }
      }
      i1++;
      localObject2 = localObject4;
      localObject3 = localObject5;
    }
    if ((localObject2 != null) && (localObject3 != null))
    {
      ((z)localObject2).T(8);
      i1 = a.c(((z)localObject2).p());
      ((z)localObject2).U(4);
      if (i1 == 1) {
        ((z)localObject2).U(4);
      }
      if (((z)localObject2).p() == 1)
      {
        ((z)localObject3).T(8);
        i1 = a.c(((z)localObject3).p());
        ((z)localObject3).U(4);
        if (i1 == 1)
        {
          if (((z)localObject3).I() == 0L) {
            throw A.d("Variable length description in sgpd found (unsupported)");
          }
        }
        else if (i1 >= 2) {
          ((z)localObject3).U(4);
        }
        if (((z)localObject3).I() == 1L)
        {
          ((z)localObject3).U(1);
          int i3 = ((z)localObject3).G();
          boolean bool;
          if (((z)localObject3).G() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          if (!bool) {
            return;
          }
          i2 = ((z)localObject3).G();
          localObject2 = new byte[16];
          ((z)localObject3).l((byte[])localObject2, 0, 16);
          parama = (a.a)localObject1;
          if (i2 == 0)
          {
            i1 = ((z)localObject3).G();
            parama = new byte[i1];
            ((z)localObject3).l(parama, 0, i1);
          }
          l = true;
          n = new t(bool, paramString, i2, (byte[])localObject2, (i3 & 0xF0) >> 4, i3 & 0xF, parama);
          return;
        }
        throw A.d("Entry count in sgpd != 1 (unsupported).");
      }
      throw A.d("Entry count in sbgp != 1 (unsupported).");
    }
  }
  
  public static void C(z paramz, int paramInt, u paramu)
  {
    paramz.T(paramInt + 8);
    paramInt = a.b(paramz.p());
    if ((paramInt & 0x1) == 0)
    {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramInt = paramz.K();
      if (paramInt == 0)
      {
        Arrays.fill(m, 0, f, false);
        return;
      }
      if (paramInt == f)
      {
        Arrays.fill(m, 0, paramInt, bool);
        paramu.d(paramz.a());
        paramu.b(paramz);
        return;
      }
      paramz = new StringBuilder();
      paramz.append("Senc sample count ");
      paramz.append(paramInt);
      paramz.append(" is different from fragment sample count");
      paramz.append(f);
      throw A.a(paramz.toString(), null);
    }
    throw A.d("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  public static void D(z paramz, u paramu)
  {
    C(paramz, 0, paramu);
  }
  
  public static Pair E(z paramz, long paramLong)
  {
    paramz.T(8);
    int i1 = a.c(paramz.p());
    paramz.U(4);
    long l1 = paramz.I();
    long l2;
    if (i1 == 0) {
      l2 = paramz.I();
    }
    for (long l3 = paramz.I();; l3 = paramz.L())
    {
      paramLong += l3;
      break;
      l2 = paramz.L();
    }
    long l4 = g0.M.W0(l2, 1000000L, l1);
    paramz.U(2);
    i1 = paramz.M();
    int[] arrayOfInt = new int[i1];
    long[] arrayOfLong1 = new long[i1];
    long[] arrayOfLong2 = new long[i1];
    long[] arrayOfLong3 = new long[i1];
    l3 = l4;
    int i2 = 0;
    while (i2 < i1)
    {
      int i3 = paramz.p();
      if ((i3 & 0x80000000) == 0)
      {
        long l5 = paramz.I();
        arrayOfInt[i2] = (i3 & 0x7FFFFFFF);
        arrayOfLong1[i2] = paramLong;
        arrayOfLong3[i2] = l3;
        l2 += l5;
        l3 = g0.M.W0(l2, 1000000L, l1);
        arrayOfLong2[i2] = (l3 - arrayOfLong3[i2]);
        paramz.U(4);
        paramLong += arrayOfInt[i2];
        i2++;
      }
      else
      {
        throw A.a("Unhandled indirect reference", null);
      }
    }
    return Pair.create(Long.valueOf(l4), new F0.h(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3));
  }
  
  public static long F(z paramz)
  {
    paramz.T(8);
    long l1;
    if (a.c(paramz.p()) == 1) {
      l1 = paramz.L();
    } else {
      l1 = paramz.I();
    }
    return l1;
  }
  
  public static b G(z paramz, SparseArray paramSparseArray, boolean paramBoolean)
  {
    paramz.T(8);
    int i1 = a.b(paramz.p());
    int i2 = paramz.p();
    if (paramBoolean) {}
    for (paramSparseArray = paramSparseArray.valueAt(0);; paramSparseArray = paramSparseArray.get(i2))
    {
      paramSparseArray = (b)paramSparseArray;
      break;
    }
    if (paramSparseArray == null) {
      return null;
    }
    if ((i1 & 0x1) != 0)
    {
      long l1 = paramz.L();
      localObject = b;
      c = l1;
      d = l1;
    }
    Object localObject = e;
    if ((i1 & 0x2) != 0) {
      i2 = paramz.p() - 1;
    } else {
      i2 = a;
    }
    int i3;
    if ((i1 & 0x8) != 0) {
      i3 = paramz.p();
    } else {
      i3 = b;
    }
    int i4;
    if ((i1 & 0x10) != 0) {
      i4 = paramz.p();
    } else {
      i4 = c;
    }
    if ((i1 & 0x20) != 0) {
      i1 = paramz.p();
    } else {
      i1 = d;
    }
    b.a = new d(i2, i3, i4, i1);
    return paramSparseArray;
  }
  
  public static void H(a.a parama, SparseArray paramSparseArray, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    paramSparseArray = G(eg1952868452b, paramSparseArray, paramBoolean);
    if (paramSparseArray == null) {
      return;
    }
    u localu = b;
    long l1 = q;
    paramBoolean = r;
    paramSparseArray.k();
    b.b(paramSparseArray, true);
    a.b localb = parama.g(1952867444);
    if ((localb != null) && ((paramInt & 0x2) == 0))
    {
      q = F(b);
      r = true;
    }
    else
    {
      q = l1;
      r = paramBoolean;
    }
    K(parama, paramSparseArray, paramInt);
    paramSparseArray = d.a.a(ea)).a);
    localb = parama.g(1935763834);
    if (localb != null) {
      A((t)g0.a.e(paramSparseArray), b, localu);
    }
    localb = parama.g(1935763823);
    if (localb != null) {
      z(b, localu);
    }
    localb = parama.g(1936027235);
    if (localb != null) {
      D(b, localu);
    }
    if (paramSparseArray != null) {
      paramSparseArray = b;
    } else {
      paramSparseArray = null;
    }
    B(parama, paramSparseArray, localu);
    int i1 = c.size();
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      paramSparseArray = (a.b)c.get(paramInt);
      if (a == 1970628964) {
        L(b, localu, paramArrayOfByte);
      }
    }
  }
  
  public static Pair I(z paramz)
  {
    paramz.T(12);
    return Pair.create(Integer.valueOf(paramz.p()), new d(paramz.p() - 1, paramz.p(), paramz.p(), paramz.p()));
  }
  
  public static int J(b paramb, int paramInt1, int paramInt2, z paramz, int paramInt3)
  {
    Object localObject1 = paramb;
    paramz.T(8);
    int i1 = a.b(paramz.p());
    s locals = d.a;
    u localu = b;
    localObject1 = (d)g0.M.i(a);
    h[paramInt1] = paramz.K();
    Object localObject2 = g;
    long l1 = c;
    localObject2[paramInt1] = l1;
    if ((i1 & 0x1) != 0) {
      localObject2[paramInt1] = (l1 + paramz.p());
    }
    int i2;
    if ((i1 & 0x4) != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = d;
    if (i2 != 0) {
      i3 = paramz.p();
    }
    int i4;
    if ((i1 & 0x100) != 0) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    int i5;
    if ((i1 & 0x200) != 0) {
      i5 = 1;
    } else {
      i5 = 0;
    }
    int i6;
    if ((i1 & 0x400) != 0) {
      i6 = 1;
    } else {
      i6 = 0;
    }
    if ((i1 & 0x800) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (o(locals)) {
      l1 = ((long[])g0.M.i(i))[0];
    } else {
      l1 = 0L;
    }
    int[] arrayOfInt = i;
    long[] arrayOfLong = j;
    localObject2 = k;
    if ((b == 2) && ((paramInt2 & 0x1) != 0)) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    int i7 = paramInt3 + h[paramInt1];
    long l2 = c;
    long l3 = q;
    while (paramInt3 < i7)
    {
      if (i4 != 0) {
        paramInt1 = paramz.p();
      } else {
        paramInt1 = b;
      }
      int i8 = f(paramInt1);
      if (i5 != 0) {
        paramInt1 = paramz.p();
      } else {
        paramInt1 = c;
      }
      int i9 = f(paramInt1);
      if (i6 != 0) {
        paramInt1 = paramz.p();
      } else if ((paramInt3 == 0) && (i2 != 0)) {
        paramInt1 = i3;
      } else {
        paramInt1 = d;
      }
      int i10;
      if (i1 != 0) {
        i10 = paramz.p();
      } else {
        i10 = 0;
      }
      long l4 = g0.M.W0(i10 + l3 - l1, 1000000L, l2);
      arrayOfLong[paramInt3] = l4;
      if (!r) {
        arrayOfLong[paramInt3] = (l4 + d.h);
      }
      arrayOfInt[paramInt3] = i9;
      int i11;
      if (((paramInt1 >> 16 & 0x1) == 0) && ((paramInt2 == 0) || (paramInt3 == 0))) {
        i11 = 1;
      } else {
        i11 = 0;
      }
      localObject2[paramInt3] = i11;
      l3 += i8;
      paramInt3++;
    }
    q = l3;
    return i7;
  }
  
  public static void K(a.a parama, b paramb, int paramInt)
  {
    parama = c;
    int i1 = parama.size();
    int i2 = 0;
    int i3 = 0;
    int i4 = i3;
    int i5 = i4;
    int i6 = i4;
    Object localObject;
    int i7;
    while (i3 < i1)
    {
      localObject = (a.b)parama.get(i3);
      i7 = i6;
      i4 = i5;
      if (a == 1953658222)
      {
        localObject = b;
        ((z)localObject).T(12);
        int i8 = ((z)localObject).K();
        i7 = i6;
        i4 = i5;
        if (i8 > 0)
        {
          i4 = i5 + i8;
          i7 = i6 + 1;
        }
      }
      i3++;
      i6 = i7;
      i5 = i4;
    }
    h = 0;
    g = 0;
    f = 0;
    b.e(i6, i5);
    i5 = 0;
    i6 = i5;
    i3 = i2;
    while (i3 < i1)
    {
      localObject = (a.b)parama.get(i3);
      i7 = i5;
      i4 = i6;
      if (a == 1953658222)
      {
        i4 = J(paramb, i5, paramInt, b, i6);
        i7 = i5 + 1;
      }
      i3++;
      i5 = i7;
      i6 = i4;
    }
  }
  
  public static void L(z paramz, u paramu, byte[] paramArrayOfByte)
  {
    paramz.T(8);
    paramz.l(paramArrayOfByte, 0, 16);
    if (!Arrays.equals(paramArrayOfByte, L)) {
      return;
    }
    C(paramz, 16, paramu);
  }
  
  private void M(long paramLong)
  {
    while ((!n.isEmpty()) && (n.peek()).b == paramLong)) {
      r((a.a)n.pop());
    }
    h();
  }
  
  private boolean N(F0.s params)
  {
    if (u == 0)
    {
      if (!params.d(m.e(), 0, 8, true)) {
        return false;
      }
      u = 8;
      m.T(0);
      t = m.I();
      s = m.p();
    }
    long l1 = t;
    if (l1 == 1L)
    {
      params.readFully(m.e(), 8, 8);
      u += 8;
    }
    for (l1 = m.L();; l1 = l1 - params.p() + u)
    {
      t = l1;
      break;
      if (l1 != 0L) {
        break;
      }
      long l2 = params.a();
      l1 = l2;
      if (l2 == -1L)
      {
        l1 = l2;
        if (!n.isEmpty()) {
          l1 = n.peek()).b;
        }
      }
      if (l1 == -1L) {
        break;
      }
    }
    if (t >= u)
    {
      l1 = params.p() - u;
      int i1 = s;
      if (((i1 == 1836019558) || (i1 == 1835295092)) && (!J))
      {
        G.e(new M.b(z, l1));
        J = true;
      }
      if (s == 1836019558)
      {
        int i2 = e.size();
        for (i1 = 0; i1 < i2; i1++)
        {
          u localu = e.valueAt(i1)).b;
          b = l1;
          d = l1;
          c = l1;
        }
      }
      i1 = s;
      if (i1 == 1835295092)
      {
        B = null;
        w = (l1 + t);
        r = 2;
        return true;
      }
      if (R(i1))
      {
        l1 = params.p() + t - 8L;
        n.push(new a.a(s, l1));
        if (t == u) {
          M(l1);
        } else {
          h();
        }
      }
      else
      {
        if (S(s)) {
          if (u == 8) {
            if (t <= 2147483647L)
            {
              params = new z((int)t);
              System.arraycopy(m.e(), 0, params.e(), 0, 8);
            }
          }
        }
        for (v = params;; v = null)
        {
          r = 1;
          break;
          throw A.d("Leaf atom with length > 2147483647 (unsupported).");
          throw A.d("Leaf atom defines extended atom size (unsupported).");
          if (t > 2147483647L) {
            break label566;
          }
        }
      }
      return true;
      label566:
      throw A.d("Skipping atom with length > 2147483647 (unsupported).");
    }
    throw A.d("Atom size less than header length (unsupported).");
  }
  
  private static boolean R(int paramInt)
  {
    boolean bool;
    if ((paramInt != 1836019574) && (paramInt != 1953653099) && (paramInt != 1835297121) && (paramInt != 1835626086) && (paramInt != 1937007212) && (paramInt != 1836019558) && (paramInt != 1953653094) && (paramInt != 1836475768) && (paramInt != 1701082227)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean S(int paramInt)
  {
    boolean bool;
    if ((paramInt != 1751411826) && (paramInt != 1835296868) && (paramInt != 1836476516) && (paramInt != 1936286840) && (paramInt != 1937011556) && (paramInt != 1937011827) && (paramInt != 1668576371) && (paramInt != 1937011555) && (paramInt != 1937011578) && (paramInt != 1937013298) && (paramInt != 1937007471) && (paramInt != 1668232756) && (paramInt != 1937011571) && (paramInt != 1952867444) && (paramInt != 1952868452) && (paramInt != 1953196132) && (paramInt != 1953654136) && (paramInt != 1953658222) && (paramInt != 1886614376) && (paramInt != 1935763834) && (paramInt != 1935763823) && (paramInt != 1936027235) && (paramInt != 1970628964) && (paramInt != 1935828848) && (paramInt != 1936158820) && (paramInt != 1701606260) && (paramInt != 1835362404) && (paramInt != 1701671783)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int f(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected negative value: ");
    localStringBuilder.append(paramInt);
    throw A.a(localStringBuilder.toString(), null);
  }
  
  private void h()
  {
    r = 0;
    u = 0;
  }
  
  public static m k(List paramList)
  {
    int i1 = paramList.size();
    Object localObject1 = null;
    int i2 = 0;
    Object localObject4;
    for (Object localObject2 = null; i2 < i1; localObject2 = localObject4)
    {
      Object localObject3 = (a.b)paramList.get(i2);
      localObject4 = localObject2;
      if (a == 1886614376)
      {
        localObject4 = localObject2;
        if (localObject2 == null) {
          localObject4 = new ArrayList();
        }
        localObject3 = b.e();
        localObject2 = o.f((byte[])localObject3);
        if (localObject2 == null) {
          g0.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          ((ArrayList)localObject4).add(new m.b((UUID)localObject2, "video/mp4", (byte[])localObject3));
        }
      }
      i2++;
    }
    if (localObject2 == null) {
      paramList = (List)localObject1;
    } else {
      paramList = new m((List)localObject2);
    }
    return paramList;
  }
  
  public static b l(SparseArray paramSparseArray)
  {
    int i1 = paramSparseArray.size();
    Object localObject1 = null;
    long l1 = Long.MAX_VALUE;
    int i2 = 0;
    while (i2 < i1)
    {
      b localb = (b)paramSparseArray.valueAt(i2);
      Object localObject2;
      long l2;
      if (!b.a(localb))
      {
        localObject2 = localObject1;
        l2 = l1;
        if (f == d.b) {}
      }
      else if ((b.a(localb)) && (h == b.e))
      {
        localObject2 = localObject1;
        l2 = l1;
      }
      else
      {
        long l3 = localb.d();
        localObject2 = localObject1;
        l2 = l1;
        if (l3 < l1)
        {
          localObject2 = localb;
          l2 = l3;
        }
      }
      i2++;
      localObject1 = localObject2;
      l1 = l2;
    }
    return (b)localObject1;
  }
  
  public static boolean o(s params)
  {
    long[] arrayOfLong1 = h;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (arrayOfLong1 != null)
    {
      bool2 = bool1;
      if (arrayOfLong1.length == 1)
      {
        long[] arrayOfLong2 = i;
        if (arrayOfLong2 == null)
        {
          bool2 = bool1;
        }
        else
        {
          long l1 = arrayOfLong1[0];
          if (l1 == 0L) {
            return true;
          }
          bool2 = bool1;
          if (g0.M.W0(l1 + arrayOfLong2[0], 1000000L, d) >= e) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public static long x(z paramz)
  {
    paramz.T(8);
    long l1;
    if (a.c(paramz.p()) == 0) {
      l1 = paramz.I();
    } else {
      l1 = paramz.L();
    }
    return l1;
  }
  
  public static void y(a.a parama, SparseArray paramSparseArray, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    int i1 = d.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      a.a locala = (a.a)d.get(i2);
      if (a == 1953653094) {
        H(locala, paramSparseArray, paramBoolean, paramInt, paramArrayOfByte);
      }
    }
  }
  
  public static void z(z paramz, u paramu)
  {
    paramz.T(8);
    int i1 = paramz.p();
    if ((a.b(i1) & 0x1) == 1) {
      paramz.U(8);
    }
    int i2 = paramz.K();
    if (i2 == 1)
    {
      i2 = a.c(i1);
      long l1 = d;
      long l2;
      if (i2 == 0) {
        l2 = paramz.I();
      } else {
        l2 = paramz.L();
      }
      d = (l1 + l2);
      return;
    }
    paramz = new StringBuilder();
    paramz.append("Unexpected saio entry count: ");
    paramz.append(i2);
    throw A.a(paramz.toString(), null);
  }
  
  public final void O(F0.s params)
  {
    int i1 = (int)t - u;
    z localz = v;
    if (localz != null)
    {
      params.readFully(localz.e(), 8, i1);
      t(new a.b(s, localz), params.p());
    }
    else
    {
      params.i(i1);
    }
    M(params.p());
  }
  
  public final void P(F0.s params)
  {
    int i1 = e.size();
    long l1 = Long.MAX_VALUE;
    int i2 = 0;
    Object localObject2;
    for (Object localObject1 = null; i2 < i1; localObject1 = localObject2)
    {
      u localu = e.valueAt(i2)).b;
      long l2 = l1;
      localObject2 = localObject1;
      if (p)
      {
        long l3 = d;
        l2 = l1;
        localObject2 = localObject1;
        if (l3 < l1)
        {
          localObject2 = (b)e.valueAt(i2);
          l2 = l3;
        }
      }
      i2++;
      l1 = l2;
    }
    if (localObject1 == null)
    {
      r = 3;
      return;
    }
    i2 = (int)(l1 - params.p());
    if (i2 >= 0)
    {
      params.i(i2);
      b.a(params);
      return;
    }
    throw A.a("Offset to encryption data was negative.", null);
  }
  
  public final boolean Q(F0.s params)
  {
    Object localObject1 = B;
    Object localObject2 = localObject1;
    int i2;
    if (localObject1 == null)
    {
      localObject2 = l(e);
      if (localObject2 == null)
      {
        i1 = (int)(w - params.p());
        if (i1 >= 0)
        {
          params.i(i1);
          h();
          return false;
        }
        throw A.a("Offset to end of mdat was negative.", null);
      }
      i2 = (int)(((b)localObject2).d() - params.p());
      i1 = i2;
      if (i2 < 0)
      {
        g0.o.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
        i1 = 0;
      }
      params.i(i1);
      B = ((b)localObject2);
    }
    if (r == 3)
    {
      i1 = ((b)localObject2).f();
      C = i1;
      if (f < i)
      {
        params.i(i1);
        ((b)localObject2).m();
        if (!((b)localObject2).h()) {
          B = null;
        }
        r = 3;
        return true;
      }
      if (d.a.g == 1)
      {
        C = (i1 - 8);
        params.i(8);
      }
      if ("audio/ac4".equals(d.a.f.n))
      {
        D = ((b)localObject2).i(C, 7);
        F0.c.a(C, j);
        a.e(j, 7);
      }
      for (i1 = D + 7;; i1 = ((b)localObject2).i(C, 0))
      {
        D = i1;
        break;
      }
      C += D;
      r = 4;
      E = 0;
    }
    s locals = d.a;
    localObject1 = a;
    long l1 = ((b)localObject2).e();
    Object localObject3 = k;
    long l2 = l1;
    if (localObject3 != null) {
      l2 = ((g0.E)localObject3).a(l1);
    }
    if (j != 0)
    {
      localObject3 = g.e();
      localObject3[0] = ((byte)0);
      localObject3[1] = ((byte)0);
      localObject3[2] = ((byte)0);
      i2 = j;
      int i3 = 4 - i2;
      while (D < C)
      {
        i1 = E;
        if (i1 == 0)
        {
          params.readFully((byte[])localObject3, i3, i2 + 1);
          g.T(0);
          i1 = g.p();
          if (i1 >= 1)
          {
            E = (i1 - 1);
            f.T(0);
            ((T)localObject1).e(f, 4);
            ((T)localObject1).e(g, 1);
            boolean bool;
            if ((I.length > 0) && (h0.d.g(f.n, localObject3[4]))) {
              bool = true;
            } else {
              bool = false;
            }
            F = bool;
            D += 5;
            C += i3;
          }
          else
          {
            throw A.a("Invalid NAL length", null);
          }
        }
        else
        {
          if (F)
          {
            h.P(i1);
            params.readFully(h.e(), 0, E);
            ((T)localObject1).e(h, E);
            i1 = E;
            int i4 = h0.d.r(h.e(), h.g());
            h.T("video/hevc".equals(f.n));
            h.S(i4);
            F0.g.a(l2, h, I);
          }
          else
          {
            i1 = ((T)localObject1).f(params, i1, false);
          }
          D += i1;
          E -= i1;
        }
      }
    }
    for (;;)
    {
      i1 = D;
      i2 = C;
      if (i1 >= i2) {
        break;
      }
      i1 = ((T)localObject1).f(params, i2 - i1, false);
      D += i1;
    }
    int i1 = ((b)localObject2).c();
    params = ((b)localObject2).g();
    if (params != null) {
      params = c;
    } else {
      params = null;
    }
    ((T)localObject1).b(l2, i1, C, 0, params);
    w(l2);
    if (!((b)localObject2).h()) {
      B = null;
    }
    r = 3;
    return true;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    int i1 = e.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((b)e.valueAt(i2)).k();
    }
    o.clear();
    x = 0;
    y = paramLong2;
    n.clear();
    h();
  }
  
  public void b(F0.t paramt)
  {
    if ((b & 0x20) == 0) {
      localObject = new c1.v(paramt, a);
    } else {
      localObject = paramt;
    }
    G = ((F0.t)localObject);
    h();
    n();
    Object localObject = c;
    if (localObject != null)
    {
      paramt = new b(paramt.a(0, b), new v(c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0));
      e.put(0, paramt);
      G.j();
    }
  }
  
  public boolean e(F0.s params)
  {
    Q localQ = r.b(params);
    if (localQ != null) {
      params = X2.v.Z(localQ);
    } else {
      params = X2.v.Y();
    }
    q = params;
    boolean bool;
    if (localQ == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int i(F0.s params, L paramL)
  {
    do
    {
      for (;;)
      {
        int i1 = r;
        if (i1 == 0) {
          break;
        }
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (Q(params)) {
              return 0;
            }
          }
          else {
            P(params);
          }
        }
        else {
          O(params);
        }
      }
    } while (N(params));
    return -1;
  }
  
  public final d j(SparseArray paramSparseArray, int paramInt)
  {
    if (paramSparseArray.size() == 1) {}
    for (paramSparseArray = paramSparseArray.valueAt(0);; paramSparseArray = g0.a.e((d)paramSparseArray.get(paramInt))) {
      return (d)paramSparseArray;
    }
  }
  
  public X2.v m()
  {
    return q;
  }
  
  public final void n()
  {
    Object localObject = new T[2];
    H = ((T[])localObject);
    T localT = p;
    int i1 = 0;
    if (localT != null)
    {
      localObject[0] = localT;
      i2 = 1;
    }
    else
    {
      i2 = 0;
    }
    int i3 = b;
    int i4 = 100;
    int i5 = i2;
    if ((i3 & 0x4) != 0)
    {
      localObject[i2] = G.a(100, 5);
      i4 = 101;
      i5 = i2 + 1;
    }
    localObject = (T[])g0.M.O0(H, i5);
    H = ((T[])localObject);
    i5 = localObject.length;
    for (int i2 = 0; i2 < i5; i2++) {
      localObject[i2].d(M);
    }
    I = new T[d.size()];
    i2 = i1;
    while (i2 < I.length)
    {
      localObject = G.a(i4, 3);
      ((T)localObject).d((q)d.get(i2));
      I[i2] = localObject;
      i2++;
      i4++;
    }
  }
  
  public s q(s params)
  {
    return params;
  }
  
  public final void r(a.a parama)
  {
    int i1 = a;
    if (i1 == 1836019574) {
      v(parama);
    } else if (i1 == 1836019558) {
      u(parama);
    } else if (!n.isEmpty()) {
      ((a.a)n.peek()).d(parama);
    }
  }
  
  public void release() {}
  
  public final void s(z paramz)
  {
    if (H.length == 0) {
      return;
    }
    paramz.T(8);
    int i1 = a.c(paramz.p());
    long l1;
    long l2;
    long l3;
    String str;
    long l4;
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        paramz = new StringBuilder();
        paramz.append("Skipping unsupported emsg version: ");
        paramz.append(i1);
        g0.o.h("FragmentedMp4Extractor", paramz.toString());
        return;
      }
      l1 = paramz.I();
      l2 = g0.M.W0(paramz.L(), 1000000L, l1);
      l1 = g0.M.W0(paramz.I(), 1000L, l1);
      l3 = paramz.I();
      localObject = (String)g0.a.e(paramz.A());
      str = (String)g0.a.e(paramz.A());
      l4 = -9223372036854775807L;
    }
    else
    {
      localObject = (String)g0.a.e(paramz.A());
      str = (String)g0.a.e(paramz.A());
      l1 = paramz.I();
      l4 = g0.M.W0(paramz.I(), 1000000L, l1);
      l2 = A;
      if (l2 != -9223372036854775807L) {
        l2 += l4;
      } else {
        l2 = -9223372036854775807L;
      }
      l1 = g0.M.W0(paramz.I(), 1000L, l1);
      l3 = paramz.I();
    }
    byte[] arrayOfByte = new byte[paramz.a()];
    i1 = paramz.a();
    int i2 = 0;
    paramz.l(arrayOfByte, 0, i1);
    paramz = new Q0.a((String)localObject, str, l1, l3, arrayOfByte);
    Object localObject = new z(l.a(paramz));
    int i3 = ((z)localObject).a();
    for (str : H)
    {
      ((z)localObject).T(0);
      str.e((z)localObject, i3);
    }
    if (l2 == -9223372036854775807L)
    {
      o.addLast(new a(l4, true, i3));
      x += i3;
    }
    else
    {
      if (!o.isEmpty()) {
        localObject = o;
      }
      for (paramz = new a(l2, false, i3);; paramz = new a(l2, false, i3))
      {
        ((ArrayDeque)localObject).addLast(paramz);
        break;
        paramz = k;
        if ((paramz == null) || (paramz.g())) {
          break label451;
        }
        localObject = o;
      }
      label451:
      paramz = k;
      l1 = l2;
      if (paramz != null) {
        l1 = paramz.a(l2);
      }
      paramz = H;
      ??? = paramz.length;
      for (i1 = i2; i1 < ???; i1++) {
        paramz[i1].b(l1, 1, i3, 0, null);
      }
    }
  }
  
  public final void t(a.b paramb, long paramLong)
  {
    if (!n.isEmpty())
    {
      ((a.a)n.peek()).e(paramb);
    }
    else
    {
      int i1 = a;
      if (i1 == 1936286840)
      {
        paramb = E(b, paramLong);
        A = ((Long)first).longValue();
        G.e((F0.M)second);
        J = true;
      }
      else if (i1 == 1701671783)
      {
        s(b);
      }
    }
  }
  
  public final void u(a.a parama)
  {
    SparseArray localSparseArray = e;
    s locals = c;
    int i1 = 0;
    boolean bool;
    if (locals != null) {
      bool = true;
    } else {
      bool = false;
    }
    y(parama, localSparseArray, bool, b, i);
    parama = k(c);
    int i2;
    int i3;
    if (parama != null)
    {
      i2 = e.size();
      for (i3 = 0; i3 < i2; i3++) {
        ((b)e.valueAt(i3)).n(parama);
      }
    }
    if (y != -9223372036854775807L)
    {
      i2 = e.size();
      for (i3 = i1; i3 < i2; i3++) {
        ((b)e.valueAt(i3)).l(y);
      }
      y = -9223372036854775807L;
    }
  }
  
  public final void v(a.a parama)
  {
    Object localObject1 = c;
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = true;
    boolean bool2;
    if (localObject1 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.g(bool2, "Unexpected moov box.");
    Object localObject2 = k(c);
    Object localObject3 = (a.a)g0.a.e(parama.f(1836475768));
    localObject1 = new SparseArray();
    int i3 = c.size();
    long l1 = -9223372036854775807L;
    for (int i4 = 0; i4 < i3; i4++)
    {
      Object localObject4 = (a.b)c.get(i4);
      int i5 = a;
      if (i5 == 1953654136)
      {
        localObject4 = I(b);
        ((SparseArray)localObject1).put(((Integer)first).intValue(), (d)second);
      }
      else if (i5 == 1835362404)
      {
        l1 = x(b);
      }
    }
    localObject3 = new F0.E();
    if ((b & 0x10) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    parama = b.B(parama, (F0.E)localObject3, l1, (m)localObject2, bool2, false, new g(this));
    i3 = parama.size();
    if (e.size() == 0)
    {
      for (i4 = i2; i4 < i3; i4++)
      {
        localObject3 = (v)parama.get(i4);
        localObject2 = a;
        localObject3 = new b(G.a(i4, b), (v)localObject3, j((SparseArray)localObject1, a));
        e.put(a, localObject3);
        z = Math.max(z, e);
      }
      G.j();
    }
    else
    {
      if (e.size() == i3) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      g0.a.f(bool2);
      for (i4 = i1; i4 < i3; i4++)
      {
        localObject3 = (v)parama.get(i4);
        localObject2 = a;
        ((b)e.get(a)).j((v)localObject3, j((SparseArray)localObject1, a));
      }
    }
  }
  
  public final void w(long paramLong)
  {
    if (!o.isEmpty())
    {
      a locala = (a)o.removeFirst();
      x -= c;
      long l1 = a;
      long l2 = l1;
      if (b) {
        l2 = l1 + paramLong;
      }
      Object localObject = k;
      l1 = l2;
      if (localObject != null) {
        l1 = ((g0.E)localObject).a(l2);
      }
      localObject = H;
      int i1 = localObject.length;
      for (int i2 = 0; i2 < i1; i2++) {
        localObject[i2].b(l1, 1, c, x, null);
      }
    }
  }
  
  public static final class a
  {
    public final long a;
    public final boolean b;
    public final int c;
    
    public a(long paramLong, boolean paramBoolean, int paramInt)
    {
      a = paramLong;
      b = paramBoolean;
      c = paramInt;
    }
  }
  
  public static final class b
  {
    public final T a;
    public final u b;
    public final z c;
    public v d;
    public d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final z j;
    public final z k;
    public boolean l;
    
    public b(T paramT, v paramv, d paramd)
    {
      a = paramT;
      d = paramv;
      e = paramd;
      b = new u();
      c = new z();
      j = new z(1);
      k = new z();
      j(paramv, paramd);
    }
    
    public int c()
    {
      int m;
      if (!l) {
        m = d.g[f];
      } else if (b.k[f] != 0) {
        m = 1;
      } else {
        m = 0;
      }
      int n = m;
      if (g() != null) {
        n = m | 0x40000000;
      }
      return n;
    }
    
    public long d()
    {
      long l1;
      if (!l) {
        l1 = d.c[f];
      } else {
        l1 = b.g[h];
      }
      return l1;
    }
    
    public long e()
    {
      long l1;
      if (!l) {
        l1 = d.f[f];
      } else {
        l1 = b.c(f);
      }
      return l1;
    }
    
    public int f()
    {
      int m;
      if (!l) {
        m = d.d[f];
      } else {
        m = b.i[f];
      }
      return m;
    }
    
    public t g()
    {
      boolean bool = l;
      Object localObject1 = null;
      if (!bool) {
        return null;
      }
      int m = ib.a)).a;
      t localt = b.n;
      if (localt == null) {
        localt = d.a.a(m);
      }
      Object localObject2 = localObject1;
      if (localt != null)
      {
        localObject2 = localObject1;
        if (a) {
          localObject2 = localt;
        }
      }
      return (t)localObject2;
    }
    
    public boolean h()
    {
      f += 1;
      if (!l) {
        return false;
      }
      int m = g + 1;
      g = m;
      int[] arrayOfInt = b.h;
      int n = h;
      if (m == arrayOfInt[n])
      {
        h = (n + 1);
        g = 0;
        return false;
      }
      return true;
    }
    
    public int i(int paramInt1, int paramInt2)
    {
      Object localObject1 = g();
      if (localObject1 == null) {
        return 0;
      }
      int m = d;
      if (m != 0)
      {
        localObject1 = b.o;
      }
      else
      {
        localObject2 = (byte[])g0.M.i(e);
        k.R((byte[])localObject2, localObject2.length);
        localObject1 = k;
        m = localObject2.length;
      }
      boolean bool = b.g(f);
      int n;
      if ((!bool) && (paramInt2 == 0)) {
        n = 0;
      } else {
        n = 1;
      }
      Object localObject2 = j.e();
      int i1;
      if (n != 0) {
        i1 = 128;
      } else {
        i1 = 0;
      }
      localObject2[0] = ((byte)(byte)(i1 | m));
      j.T(0);
      a.a(j, 1, 1);
      a.a((z)localObject1, m, 1);
      if (n == 0) {
        return m + 1;
      }
      if (!bool)
      {
        c.P(8);
        localObject1 = c.e();
        localObject1[0] = ((byte)0);
        localObject1[1] = ((byte)1);
        localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
        localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
        localObject1[4] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
        localObject1[5] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
        localObject1[6] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
        localObject1[7] = ((byte)(byte)(paramInt1 & 0xFF));
        a.a(c, 8, 1);
        return m + 9;
      }
      localObject2 = b.o;
      paramInt1 = ((z)localObject2).M();
      ((z)localObject2).U(-2);
      paramInt1 = paramInt1 * 6 + 2;
      localObject1 = localObject2;
      if (paramInt2 != 0)
      {
        c.P(paramInt1);
        localObject1 = c.e();
        ((z)localObject2).l((byte[])localObject1, 0, paramInt1);
        paramInt2 = ((localObject1[2] & 0xFF) << 8 | localObject1[3] & 0xFF) + paramInt2;
        localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
        localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
        localObject1 = c;
      }
      a.a((z)localObject1, paramInt1, 1);
      return m + 1 + paramInt1;
    }
    
    public void j(v paramv, d paramd)
    {
      d = paramv;
      e = paramd;
      a.d(a.f);
      k();
    }
    
    public void k()
    {
      b.f();
      f = 0;
      h = 0;
      g = 0;
      i = 0;
      l = false;
    }
    
    public void l(long paramLong)
    {
      for (int m = f;; m++)
      {
        u localu = b;
        if ((m >= f) || (localu.c(m) > paramLong)) {
          break;
        }
        if (b.k[m] != 0) {
          i = m;
        }
      }
    }
    
    public void m()
    {
      t localt = g();
      if (localt == null) {
        return;
      }
      z localz = b.o;
      int m = d;
      if (m != 0) {
        localz.U(m);
      }
      if (b.g(f)) {
        localz.U(localz.M() * 6);
      }
    }
    
    public void n(m paramm)
    {
      Object localObject = d.a.a(ib.a)).a);
      if (localObject != null) {
        localObject = b;
      } else {
        localObject = null;
      }
      paramm = paramm.c((String)localObject);
      paramm = d.a.f.a().U(paramm).K();
      a.d(paramm);
    }
  }
}

/* Location:
 * Qualified Name:     Z0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */