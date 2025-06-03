package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class i
{
  public static volatile int f = 100;
  public int a;
  public int b = f;
  public int c = Integer.MAX_VALUE;
  public j d;
  public boolean e = false;
  
  public static int b(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long c(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static i f(InputStream paramInputStream)
  {
    return g(paramInputStream, 4096);
  }
  
  public static i g(InputStream paramInputStream, int paramInt)
  {
    if (paramInt > 0)
    {
      if (paramInputStream == null) {
        return h(z.d);
      }
      return new c(paramInputStream, paramInt, null);
    }
    throw new IllegalArgumentException("bufferSize must be > 0");
  }
  
  public static i h(byte[] paramArrayOfByte)
  {
    return i(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static i i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return j(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public static i j(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new b(paramArrayOfByte, paramInt1, paramInt2, paramBoolean, null);
    try
    {
      paramArrayOfByte.l(paramInt2);
      return paramArrayOfByte;
    }
    catch (A paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract String A();
  
  public abstract int B();
  
  public abstract int C();
  
  public abstract long D();
  
  public abstract boolean E(int paramInt);
  
  public abstract void a(int paramInt);
  
  public abstract int d();
  
  public abstract boolean e();
  
  public abstract void k(int paramInt);
  
  public abstract int l(int paramInt);
  
  public abstract boolean m();
  
  public abstract h n();
  
  public abstract double o();
  
  public abstract int p();
  
  public abstract int q();
  
  public abstract long r();
  
  public abstract float s();
  
  public abstract int t();
  
  public abstract long u();
  
  public abstract int v();
  
  public abstract long w();
  
  public abstract int x();
  
  public abstract long y();
  
  public abstract String z();
  
  public static final class b
    extends i
  {
    public final byte[] g;
    public final boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o = Integer.MAX_VALUE;
    
    public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      super();
      g = paramArrayOfByte;
      i = (paramInt2 + paramInt1);
      k = paramInt1;
      l = paramInt1;
      h = paramBoolean;
    }
    
    public String A()
    {
      int i1 = J();
      if (i1 > 0)
      {
        int i2 = i;
        int i3 = k;
        if (i1 <= i2 - i3)
        {
          String str = p0.e(g, i3, i1);
          k += i1;
          return str;
        }
      }
      if (i1 == 0) {
        return "";
      }
      if (i1 <= 0) {
        throw A.g();
      }
      throw A.m();
    }
    
    public int B()
    {
      if (e())
      {
        m = 0;
        return 0;
      }
      int i1 = J();
      m = i1;
      if (q0.a(i1) != 0) {
        return m;
      }
      throw A.c();
    }
    
    public int C()
    {
      return J();
    }
    
    public long D()
    {
      return K();
    }
    
    public boolean E(int paramInt)
    {
      int i1 = q0.b(paramInt);
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 4)
              {
                if (i1 == 5)
                {
                  O(4);
                  return true;
                }
                throw A.e();
              }
              return false;
            }
            N();
            a(q0.c(q0.a(paramInt), 4));
            return true;
          }
          O(J());
          return true;
        }
        O(8);
        return true;
      }
      P();
      return true;
    }
    
    public byte F()
    {
      int i1 = k;
      if (i1 != i)
      {
        byte[] arrayOfByte = g;
        k = (i1 + 1);
        return arrayOfByte[i1];
      }
      throw A.m();
    }
    
    public byte[] G(int paramInt)
    {
      if (paramInt > 0)
      {
        int i1 = i;
        int i2 = k;
        if (paramInt <= i1 - i2)
        {
          paramInt += i2;
          k = paramInt;
          return Arrays.copyOfRange(g, i2, paramInt);
        }
      }
      if (paramInt <= 0)
      {
        if (paramInt == 0) {
          return z.d;
        }
        throw A.g();
      }
      throw A.m();
    }
    
    public int H()
    {
      int i1 = k;
      if (i - i1 >= 4)
      {
        byte[] arrayOfByte = g;
        k = (i1 + 4);
        int i2 = arrayOfByte[i1];
        int i3 = arrayOfByte[(i1 + 1)];
        int i4 = arrayOfByte[(i1 + 2)];
        return (arrayOfByte[(i1 + 3)] & 0xFF) << 24 | i2 & 0xFF | (i3 & 0xFF) << 8 | (i4 & 0xFF) << 16;
      }
      throw A.m();
    }
    
    public long I()
    {
      int i1 = k;
      if (i - i1 >= 8)
      {
        byte[] arrayOfByte = g;
        k = (i1 + 8);
        long l1 = arrayOfByte[i1];
        long l2 = arrayOfByte[(i1 + 1)];
        long l3 = arrayOfByte[(i1 + 2)];
        long l4 = arrayOfByte[(i1 + 3)];
        long l5 = arrayOfByte[(i1 + 4)];
        long l6 = arrayOfByte[(i1 + 5)];
        long l7 = arrayOfByte[(i1 + 6)];
        return (arrayOfByte[(i1 + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
      }
      throw A.m();
    }
    
    public int J()
    {
      int i1 = k;
      int i2 = i;
      byte[] arrayOfByte;
      int i3;
      int i4;
      if (i2 != i1)
      {
        arrayOfByte = g;
        i3 = i1 + 1;
        i4 = arrayOfByte[i1];
        if (i4 >= 0)
        {
          k = i3;
          return i4;
        }
        if (i2 - i3 >= 9)
        {
          i2 = i1 + 2;
          i4 = arrayOfByte[i3] << 7 ^ i4;
          if (i4 < 0)
          {
            i4 ^= 0xFFFFFF80;
            break label302;
          }
          i3 = i1 + 3;
          i2 = arrayOfByte[i2] << 14 ^ i4;
          if (i2 >= 0)
          {
            i2 ^= 0x3F80;
            i4 = i3;
            i3 = i4;
            i4 = i2;
            i2 = i3;
            break label302;
          }
          i4 = i1 + 4;
          i2 ^= arrayOfByte[i3] << 21;
          if (i2 < 0) {
            i2 = 0xFFE03F80 ^ i2;
          }
        }
      }
      label299:
      for (;;)
      {
        i3 = i4;
        i4 = i2;
        i2 = i3;
        break label302;
        i3 = i1 + 5;
        int i5 = arrayOfByte[i4];
        i2 = i2 ^ i5 << 28 ^ 0xFE03F80;
        i4 = i3;
        if (i5 < 0)
        {
          i5 = i1 + 6;
          i4 = i5;
          if (arrayOfByte[i3] >= 0) {
            break label299;
          }
          i3 = i1 + 7;
          i4 = i3;
          if (arrayOfByte[i5] < 0)
          {
            i5 = i1 + 8;
            i4 = i5;
            if (arrayOfByte[i3] >= 0) {
              break label299;
            }
            i3 = i1 + 9;
            i4 = i3;
            if (arrayOfByte[i5] < 0)
            {
              if (arrayOfByte[i3] < 0) {
                return (int)L();
              }
              i3 = i1 + 10;
              i4 = i2;
              i2 = i3;
              break label302;
            }
          }
        }
        break;
      }
      label302:
      k = i2;
      return i4;
    }
    
    public long K()
    {
      int i1 = k;
      int i2 = i;
      long l1;
      if (i2 != i1)
      {
        byte[] arrayOfByte = g;
        int i3 = i1 + 1;
        int i4 = arrayOfByte[i1];
        if (i4 >= 0)
        {
          k = i3;
          return i4;
        }
        if (i2 - i3 >= 9)
        {
          i2 = i1 + 2;
          i3 = arrayOfByte[i3] << 7 ^ i4;
          if (i3 < 0)
          {
            l1 = i3 ^ 0xFFFFFF80;
            break label373;
          }
          i4 = i1 + 3;
          i3 = arrayOfByte[i2] << 14 ^ i3;
          if (i3 >= 0)
          {
            l1 = i3 ^ 0x3F80;
            i2 = i4;
            break label373;
          }
          i2 = i1 + 4;
          i4 = i3 ^ arrayOfByte[i4] << 21;
          if (i4 < 0)
          {
            l1 = 0xFFE03F80 ^ i4;
            break label373;
          }
          l1 = i4;
          i4 = i1 + 5;
          long l2 = l1 ^ arrayOfByte[i2] << 28;
          if (l2 >= 0L)
          {
            l1 = 266354560L;
            i2 = i4;
            l1 = l2 ^ l1;
            break label373;
          }
          i3 = i1 + 6;
          l2 ^= arrayOfByte[i4] << 35;
          if (l2 < 0L) {
            l1 = -34093383808L;
          }
          for (i2 = i3;; i2 = i4)
          {
            l1 = l2 ^ l1;
            break label373;
            i2 = i1 + 7;
            l2 ^= arrayOfByte[i3] << 42;
            if (l2 >= 0L)
            {
              l1 = 4363953127296L;
              break;
            }
            i4 = i1 + 8;
            l2 ^= arrayOfByte[i2] << 49;
            if (l2 >= 0L) {
              break label320;
            }
            l1 = -558586000294016L;
          }
          label320:
          i3 = i1 + 9;
          l1 = l2 ^ arrayOfByte[i4] << 56 ^ 0xFE03F80FE03F80;
          i2 = i3;
          if (l1 >= 0L) {
            break label373;
          }
          if (arrayOfByte[i3] >= 0L) {
            break label368;
          }
        }
      }
      return L();
      label368:
      i2 = i1 + 10;
      label373:
      k = i2;
      return l1;
    }
    
    public long L()
    {
      long l1 = 0L;
      for (int i1 = 0; i1 < 64; i1 += 7)
      {
        int i2 = F();
        l1 |= (i2 & 0x7F) << i1;
        if ((i2 & 0x80) == 0) {
          return l1;
        }
      }
      throw A.f();
    }
    
    public final void M()
    {
      int i1 = i + j;
      i = i1;
      int i2 = i1 - l;
      int i3 = o;
      if (i2 > i3)
      {
        i3 = i2 - i3;
        j = i3;
        i = (i1 - i3);
      }
      else
      {
        j = 0;
      }
    }
    
    public void N()
    {
      int i1;
      do
      {
        i1 = B();
      } while ((i1 != 0) && (E(i1)));
    }
    
    public void O(int paramInt)
    {
      if (paramInt >= 0)
      {
        int i1 = i;
        int i2 = k;
        if (paramInt <= i1 - i2)
        {
          k = (i2 + paramInt);
          return;
        }
      }
      if (paramInt < 0) {
        throw A.g();
      }
      throw A.m();
    }
    
    public final void P()
    {
      if (i - k >= 10) {
        Q();
      } else {
        R();
      }
    }
    
    public final void Q()
    {
      for (int i1 = 0; i1 < 10; i1++)
      {
        byte[] arrayOfByte = g;
        int i2 = k;
        k = (i2 + 1);
        if (arrayOfByte[i2] >= 0) {
          return;
        }
      }
      throw A.f();
    }
    
    public final void R()
    {
      for (int i1 = 0; i1 < 10; i1++) {
        if (F() >= 0) {
          return;
        }
      }
      throw A.f();
    }
    
    public void a(int paramInt)
    {
      if (m == paramInt) {
        return;
      }
      throw A.b();
    }
    
    public int d()
    {
      return k - l;
    }
    
    public boolean e()
    {
      boolean bool;
      if (k == i) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void k(int paramInt)
    {
      o = paramInt;
      M();
    }
    
    public int l(int paramInt)
    {
      if (paramInt >= 0)
      {
        int i1 = paramInt + d();
        if (i1 >= 0)
        {
          paramInt = o;
          if (i1 <= paramInt)
          {
            o = i1;
            M();
            return paramInt;
          }
          throw A.m();
        }
        throw A.h();
      }
      throw A.g();
    }
    
    public boolean m()
    {
      boolean bool;
      if (K() != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public h n()
    {
      int i1 = J();
      if (i1 > 0)
      {
        int i2 = i;
        int i3 = k;
        if (i1 <= i2 - i3)
        {
          h localh;
          if ((h) && (n)) {
            localh = h.f0(g, i3, i1);
          } else {
            localh = h.k(g, i3, i1);
          }
          k += i1;
          return localh;
        }
      }
      if (i1 == 0) {
        return h.p;
      }
      return h.e0(G(i1));
    }
    
    public double o()
    {
      return Double.longBitsToDouble(I());
    }
    
    public int p()
    {
      return J();
    }
    
    public int q()
    {
      return H();
    }
    
    public long r()
    {
      return I();
    }
    
    public float s()
    {
      return Float.intBitsToFloat(H());
    }
    
    public int t()
    {
      return J();
    }
    
    public long u()
    {
      return K();
    }
    
    public int v()
    {
      return H();
    }
    
    public long w()
    {
      return I();
    }
    
    public int x()
    {
      return i.b(J());
    }
    
    public long y()
    {
      return i.c(K());
    }
    
    public String z()
    {
      int i1 = J();
      if (i1 > 0)
      {
        int i2 = i;
        int i3 = k;
        if (i1 <= i2 - i3)
        {
          String str = new String(g, i3, i1, z.b);
          k += i1;
          return str;
        }
      }
      if (i1 == 0) {
        return "";
      }
      if (i1 < 0) {
        throw A.g();
      }
      throw A.m();
    }
  }
  
  public static final class c
    extends i
  {
    public final InputStream g;
    public final byte[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n = Integer.MAX_VALUE;
    
    public c(InputStream paramInputStream, int paramInt)
    {
      super();
      z.b(paramInputStream, "input");
      g = paramInputStream;
      h = new byte[paramInt];
      i = 0;
      k = 0;
      m = 0;
    }
    
    public static int F(InputStream paramInputStream)
    {
      try
      {
        int i1 = paramInputStream.available();
        return i1;
      }
      catch (A paramInputStream)
      {
        paramInputStream.j();
        throw paramInputStream;
      }
    }
    
    public static int G(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      try
      {
        paramInt1 = paramInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
        return paramInt1;
      }
      catch (A paramInputStream)
      {
        paramInputStream.j();
        throw paramInputStream;
      }
    }
    
    private void R()
    {
      int i1 = i + j;
      i = i1;
      int i2 = m + i1;
      int i3 = n;
      if (i2 > i3)
      {
        i2 -= i3;
        j = i2;
        i = (i1 - i2);
      }
      else
      {
        j = 0;
      }
    }
    
    public static long T(InputStream paramInputStream, long paramLong)
    {
      try
      {
        paramLong = paramInputStream.skip(paramLong);
        return paramLong;
      }
      catch (A paramInputStream)
      {
        paramInputStream.j();
        throw paramInputStream;
      }
    }
    
    private void X()
    {
      if (i - k >= 10) {
        Y();
      } else {
        Z();
      }
    }
    
    private void Y()
    {
      for (int i1 = 0; i1 < 10; i1++)
      {
        byte[] arrayOfByte = h;
        int i2 = k;
        k = (i2 + 1);
        if (arrayOfByte[i2] >= 0) {
          return;
        }
      }
      throw A.f();
    }
    
    private void Z()
    {
      for (int i1 = 0; i1 < 10; i1++) {
        if (I() >= 0) {
          return;
        }
      }
      throw A.f();
    }
    
    public String A()
    {
      int i1 = O();
      int i2 = k;
      int i3 = i;
      byte[] arrayOfByte;
      if ((i1 <= i3 - i2) && (i1 > 0))
      {
        arrayOfByte = h;
        k = (i2 + i1);
      }
      else
      {
        if (i1 == 0) {
          return "";
        }
        i2 = 0;
        if (i1 <= i3)
        {
          S(i1);
          arrayOfByte = h;
          k = i1;
        }
        else
        {
          arrayOfByte = J(i1, false);
        }
      }
      return p0.e(arrayOfByte, i2, i1);
    }
    
    public int B()
    {
      if (e())
      {
        l = 0;
        return 0;
      }
      int i1 = O();
      l = i1;
      if (q0.a(i1) != 0) {
        return l;
      }
      throw A.c();
    }
    
    public int C()
    {
      return O();
    }
    
    public long D()
    {
      return P();
    }
    
    public boolean E(int paramInt)
    {
      int i1 = q0.b(paramInt);
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 4)
              {
                if (i1 == 5)
                {
                  V(4);
                  return true;
                }
                throw A.e();
              }
              return false;
            }
            U();
            a(q0.c(q0.a(paramInt), 4));
            return true;
          }
          V(O());
          return true;
        }
        V(8);
        return true;
      }
      X();
      return true;
    }
    
    public final h H(int paramInt)
    {
      byte[] arrayOfByte1 = K(paramInt);
      if (arrayOfByte1 != null) {
        return h.i(arrayOfByte1);
      }
      int i1 = k;
      int i2 = i;
      int i3 = i2 - i1;
      m += i2;
      k = 0;
      i = 0;
      Object localObject = L(paramInt - i3);
      arrayOfByte1 = new byte[paramInt];
      System.arraycopy(h, i1, arrayOfByte1, 0, i3);
      localObject = ((List)localObject).iterator();
      paramInt = i3;
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, arrayOfByte2.length);
        paramInt += arrayOfByte2.length;
      }
      return h.e0(arrayOfByte1);
    }
    
    public byte I()
    {
      if (k == i) {
        S(1);
      }
      byte[] arrayOfByte = h;
      int i1 = k;
      k = (i1 + 1);
      return arrayOfByte[i1];
    }
    
    public final byte[] J(int paramInt, boolean paramBoolean)
    {
      Object localObject1 = K(paramInt);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (paramBoolean) {
          localObject2 = (byte[])((byte[])localObject1).clone();
        }
        return (byte[])localObject2;
      }
      int i1 = k;
      int i2 = i;
      int i3 = i2 - i1;
      m += i2;
      k = 0;
      i = 0;
      localObject1 = L(paramInt - i3);
      Object localObject2 = new byte[paramInt];
      System.arraycopy(h, i1, localObject2, 0, i3);
      localObject1 = ((List)localObject1).iterator();
      paramInt = i3;
      while (((Iterator)localObject1).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject1).next();
        System.arraycopy(arrayOfByte, 0, localObject2, paramInt, arrayOfByte.length);
        paramInt += arrayOfByte.length;
      }
      return (byte[])localObject2;
    }
    
    public final byte[] K(int paramInt)
    {
      if (paramInt == 0) {
        return z.d;
      }
      if (paramInt >= 0)
      {
        int i1 = m;
        int i2 = k;
        int i3 = i1 + i2 + paramInt;
        if (i3 - c <= 0)
        {
          int i4 = n;
          if (i3 <= i4)
          {
            i1 = i - i2;
            i4 = paramInt - i1;
            if ((i4 >= 4096) && (i4 > F(g))) {
              return null;
            }
            byte[] arrayOfByte = new byte[paramInt];
            System.arraycopy(h, k, arrayOfByte, 0, i1);
            m += i;
            k = 0;
            i = 0;
            while (i1 < paramInt)
            {
              i4 = G(g, arrayOfByte, i1, paramInt - i1);
              if (i4 != -1)
              {
                m += i4;
                i1 += i4;
              }
              else
              {
                throw A.m();
              }
            }
            return arrayOfByte;
          }
          V(i4 - i1 - i2);
          throw A.m();
        }
        throw A.l();
      }
      throw A.g();
    }
    
    public final List L(int paramInt)
    {
      ArrayList localArrayList = new ArrayList();
      while (paramInt > 0)
      {
        int i1 = Math.min(paramInt, 4096);
        byte[] arrayOfByte = new byte[i1];
        int i2 = 0;
        while (i2 < i1)
        {
          int i3 = g.read(arrayOfByte, i2, i1 - i2);
          if (i3 != -1)
          {
            m += i3;
            i2 += i3;
          }
          else
          {
            throw A.m();
          }
        }
        paramInt -= i1;
        localArrayList.add(arrayOfByte);
      }
      return localArrayList;
    }
    
    public int M()
    {
      int i1 = k;
      int i2 = i1;
      if (i - i1 < 4)
      {
        S(4);
        i2 = k;
      }
      byte[] arrayOfByte = h;
      k = (i2 + 4);
      int i3 = arrayOfByte[i2];
      i1 = arrayOfByte[(i2 + 1)];
      int i4 = arrayOfByte[(i2 + 2)];
      return (arrayOfByte[(i2 + 3)] & 0xFF) << 24 | i3 & 0xFF | (i1 & 0xFF) << 8 | (i4 & 0xFF) << 16;
    }
    
    public long N()
    {
      int i1 = k;
      int i2 = i1;
      if (i - i1 < 8)
      {
        S(8);
        i2 = k;
      }
      byte[] arrayOfByte = h;
      k = (i2 + 8);
      long l1 = arrayOfByte[i2];
      long l2 = arrayOfByte[(i2 + 1)];
      long l3 = arrayOfByte[(i2 + 2)];
      long l4 = arrayOfByte[(i2 + 3)];
      long l5 = arrayOfByte[(i2 + 4)];
      long l6 = arrayOfByte[(i2 + 5)];
      long l7 = arrayOfByte[(i2 + 6)];
      return (arrayOfByte[(i2 + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
    }
    
    public int O()
    {
      int i1 = k;
      int i2 = i;
      byte[] arrayOfByte;
      int i3;
      int i4;
      if (i2 != i1)
      {
        arrayOfByte = h;
        i3 = i1 + 1;
        i4 = arrayOfByte[i1];
        if (i4 >= 0)
        {
          k = i3;
          return i4;
        }
        if (i2 - i3 >= 9)
        {
          i2 = i1 + 2;
          i3 = arrayOfByte[i3] << 7 ^ i4;
          if (i3 < 0)
          {
            i3 ^= 0xFFFFFF80;
            break label302;
          }
          i4 = i1 + 3;
          i2 = arrayOfByte[i2] << 14 ^ i3;
          if (i2 >= 0)
          {
            i2 ^= 0x3F80;
            i3 = i4;
            i4 = i3;
            i3 = i2;
            i2 = i4;
            break label302;
          }
          i3 = i1 + 4;
          i2 ^= arrayOfByte[i4] << 21;
          if (i2 < 0) {
            i2 = 0xFFE03F80 ^ i2;
          }
        }
      }
      label299:
      for (;;)
      {
        i4 = i3;
        i3 = i2;
        i2 = i4;
        break label302;
        i4 = i1 + 5;
        int i5 = arrayOfByte[i3];
        i2 = i2 ^ i5 << 28 ^ 0xFE03F80;
        i3 = i4;
        if (i5 < 0)
        {
          i5 = i1 + 6;
          i3 = i5;
          if (arrayOfByte[i4] >= 0) {
            break label299;
          }
          i4 = i1 + 7;
          i3 = i4;
          if (arrayOfByte[i5] < 0)
          {
            i5 = i1 + 8;
            i3 = i5;
            if (arrayOfByte[i4] >= 0) {
              break label299;
            }
            i4 = i1 + 9;
            i3 = i4;
            if (arrayOfByte[i5] < 0)
            {
              if (arrayOfByte[i4] < 0) {
                return (int)Q();
              }
              i4 = i1 + 10;
              i3 = i2;
              i2 = i4;
              break label302;
            }
          }
        }
        break;
      }
      label302:
      k = i2;
      return i3;
    }
    
    public long P()
    {
      int i1 = k;
      int i2 = i;
      long l1;
      if (i2 != i1)
      {
        byte[] arrayOfByte = h;
        int i3 = i1 + 1;
        int i4 = arrayOfByte[i1];
        if (i4 >= 0)
        {
          k = i3;
          return i4;
        }
        if (i2 - i3 >= 9)
        {
          i2 = i1 + 2;
          i4 = arrayOfByte[i3] << 7 ^ i4;
          if (i4 < 0)
          {
            l1 = i4 ^ 0xFFFFFF80;
            break label368;
          }
          i3 = i1 + 3;
          i4 = arrayOfByte[i2] << 14 ^ i4;
          if (i4 >= 0)
          {
            l1 = i4 ^ 0x3F80;
            i2 = i3;
            break label368;
          }
          i2 = i1 + 4;
          i3 = i4 ^ arrayOfByte[i3] << 21;
          if (i3 < 0)
          {
            l1 = 0xFFE03F80 ^ i3;
            break label368;
          }
          l1 = i3;
          i3 = i1 + 5;
          l1 ^= arrayOfByte[i2] << 28;
          if (l1 >= 0L)
          {
            l2 = 266354560L;
            i2 = i3;
            l1 ^= l2;
            break label368;
          }
          i2 = i1 + 6;
          long l2 = l1 ^ arrayOfByte[i3] << 35;
          if (l2 < 0L) {}
          for (l1 = -34093383808L;; l1 = -558586000294016L)
          {
            l1 = l2 ^ l1;
            break label368;
            i3 = i1 + 7;
            l1 = l2 ^ arrayOfByte[i2] << 42;
            if (l1 >= 0L)
            {
              l2 = 4363953127296L;
              i2 = i3;
              break;
            }
            i2 = i1 + 8;
            l2 = l1 ^ arrayOfByte[i3] << 49;
            if (l2 >= 0L) {
              break label316;
            }
          }
          label316:
          i3 = i1 + 9;
          l1 = l2 ^ arrayOfByte[i2] << 56 ^ 0xFE03F80FE03F80;
          i2 = i3;
          if (l1 >= 0L) {
            break label368;
          }
          if (arrayOfByte[i3] >= 0L) {
            break label363;
          }
        }
      }
      return Q();
      label363:
      i2 = i1 + 10;
      label368:
      k = i2;
      return l1;
    }
    
    public long Q()
    {
      long l1 = 0L;
      for (int i1 = 0; i1 < 64; i1 += 7)
      {
        int i2 = I();
        l1 |= (i2 & 0x7F) << i1;
        if ((i2 & 0x80) == 0) {
          return l1;
        }
      }
      throw A.f();
    }
    
    public final void S(int paramInt)
    {
      if (!a0(paramInt))
      {
        if (paramInt > c - m - k) {
          throw A.l();
        }
        throw A.m();
      }
    }
    
    public void U()
    {
      int i1;
      do
      {
        i1 = B();
      } while ((i1 != 0) && (E(i1)));
    }
    
    public void V(int paramInt)
    {
      int i1 = i;
      int i2 = k;
      if ((paramInt <= i1 - i2) && (paramInt >= 0)) {
        k = (i2 + paramInt);
      } else {
        W(paramInt);
      }
    }
    
    public final void W(int paramInt)
    {
      if (paramInt >= 0)
      {
        int i1 = m;
        int i2 = k;
        int i4 = n;
        int i3;
        if (i1 + i2 + paramInt <= i4)
        {
          m = (i1 + i2);
          i1 = i - i2;
          i = 0;
          k = 0;
          while (i1 < paramInt) {
            try
            {
              Object localObject1 = g;
              long l1 = paramInt - i1;
              long l2 = T((InputStream)localObject1, l1);
              boolean bool = l2 < 0L;
              if ((!bool) && (l2 <= l1))
              {
                if (bool) {
                  i1 += (int)l2;
                }
              }
              else
              {
                IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append(g.getClass());
                ((StringBuilder)localObject1).append("#skip returned invalid result: ");
                ((StringBuilder)localObject1).append(l2);
                ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
                localIllegalStateException.<init>(((StringBuilder)localObject1).toString());
                throw localIllegalStateException;
              }
            }
            finally
            {
              m += i1;
              R();
            }
          }
          m += i1;
          R();
          if (i1 < paramInt)
          {
            i3 = i;
            i1 = i3 - k;
            for (k = i3;; k = i3)
            {
              S(1);
              i4 = paramInt - i1;
              i3 = i;
              if (i4 <= i3) {
                break;
              }
              i1 += i3;
            }
            k = i4;
          }
          return;
        }
        V(i4 - i1 - i3);
        throw A.m();
      }
      throw A.g();
    }
    
    public void a(int paramInt)
    {
      if (l == paramInt) {
        return;
      }
      throw A.b();
    }
    
    public final boolean a0(int paramInt)
    {
      int i1 = k;
      int i2 = i;
      if (i1 + paramInt > i2)
      {
        int i3 = c;
        int i4 = m;
        if (paramInt > i3 - i4 - i1) {
          return false;
        }
        if (i4 + i1 + paramInt > n) {
          return false;
        }
        if (i1 > 0)
        {
          if (i2 > i1)
          {
            localObject = h;
            System.arraycopy(localObject, i1, localObject, 0, i2 - i1);
          }
          m += i1;
          i -= i1;
          k = 0;
        }
        localObject = g;
        byte[] arrayOfByte = h;
        i1 = i;
        i1 = G((InputStream)localObject, arrayOfByte, i1, Math.min(arrayOfByte.length - i1, c - m - i1));
        if ((i1 != 0) && (i1 >= -1) && (i1 <= h.length))
        {
          if (i1 > 0)
          {
            i += i1;
            R();
            boolean bool;
            if (i >= paramInt) {
              bool = true;
            } else {
              bool = a0(paramInt);
            }
            return bool;
          }
          return false;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(g.getClass());
        ((StringBuilder)localObject).append("#read(byte[]) returned invalid result: ");
        ((StringBuilder)localObject).append(i1);
        ((StringBuilder)localObject).append("\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("refillBuffer() called when ");
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append(" bytes were already available in buffer");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    public int d()
    {
      return m + k;
    }
    
    public boolean e()
    {
      boolean bool;
      if (k == i)
      {
        bool = true;
        if (!a0(1)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    
    public void k(int paramInt)
    {
      n = paramInt;
      R();
    }
    
    public int l(int paramInt)
    {
      if (paramInt >= 0)
      {
        paramInt += m + k;
        int i1 = n;
        if (paramInt <= i1)
        {
          n = paramInt;
          R();
          return i1;
        }
        throw A.m();
      }
      throw A.g();
    }
    
    public boolean m()
    {
      boolean bool;
      if (P() != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public h n()
    {
      int i1 = O();
      int i2 = i;
      int i3 = k;
      if ((i1 <= i2 - i3) && (i1 > 0))
      {
        h localh = h.k(h, i3, i1);
        k += i1;
        return localh;
      }
      if (i1 == 0) {
        return h.p;
      }
      return H(i1);
    }
    
    public double o()
    {
      return Double.longBitsToDouble(N());
    }
    
    public int p()
    {
      return O();
    }
    
    public int q()
    {
      return M();
    }
    
    public long r()
    {
      return N();
    }
    
    public float s()
    {
      return Float.intBitsToFloat(M());
    }
    
    public int t()
    {
      return O();
    }
    
    public long u()
    {
      return P();
    }
    
    public int v()
    {
      return M();
    }
    
    public long w()
    {
      return N();
    }
    
    public int x()
    {
      return i.b(O());
    }
    
    public long y()
    {
      return i.c(P());
    }
    
    public String z()
    {
      int i1 = O();
      String str;
      if (i1 > 0)
      {
        int i2 = i;
        int i3 = k;
        if (i1 <= i2 - i3)
        {
          str = new String(h, i3, i1, z.b);
          k += i1;
          return str;
        }
      }
      if (i1 == 0) {
        return "";
      }
      if (i1 <= i)
      {
        S(i1);
        str = new String(h, k, i1, z.b);
        k += i1;
        return str;
      }
      return new String(J(i1, false), z.b);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */