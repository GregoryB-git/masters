package z4;

import android.media.MediaCodec.CryptoInfo;
import c4.v.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t5.o;
import v5.e0;
import v5.u;
import z3.c;
import z3.c.a;
import z3.g;

public final class a0
{
  public final t5.b a;
  public final int b;
  public final u c;
  public a d;
  public a e;
  public a f;
  public long g;
  
  public a0(t5.b paramb)
  {
    a = paramb;
    int i = b;
    b = i;
    c = new u(32);
    paramb = new a(i, 0L);
    d = paramb;
    e = paramb;
    f = paramb;
  }
  
  public static a d(a parama, long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    a locala;
    long l;
    int i;
    for (;;)
    {
      locala = parama;
      l = paramLong;
      i = paramInt;
      if (paramLong < b) {
        break;
      }
      parama = d;
    }
    while (i > 0)
    {
      int j = Math.min(i, (int)(b - l));
      parama = c;
      paramByteBuffer.put(a, (int)(l - a) + b, j);
      paramInt = i - j;
      paramLong = l + j;
      l = paramLong;
      i = paramInt;
      if (paramLong == b)
      {
        locala = d;
        l = paramLong;
        i = paramInt;
      }
    }
    return locala;
  }
  
  public static a e(a parama, long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    while (paramLong >= b) {
      parama = d;
    }
    int i = paramInt;
    while (i > 0)
    {
      int j = Math.min(i, (int)(b - paramLong));
      t5.a locala = c;
      System.arraycopy(a, (int)(paramLong - a) + b, paramArrayOfByte, paramInt - i, j);
      int k = i - j;
      long l = paramLong + j;
      i = k;
      paramLong = l;
      if (l == b)
      {
        parama = d;
        i = k;
        paramLong = l;
      }
    }
    return parama;
  }
  
  public static a f(a parama, g paramg, b0.a parama1, u paramu)
  {
    Object localObject1 = parama;
    long l1;
    int i;
    if (paramg.m(1073741824))
    {
      l1 = b;
      i = 1;
      paramu.D(1);
      parama = e(parama, l1, a, 1);
      l1 += 1L;
      localObject1 = a;
      int j = 0;
      int k = localObject1[0];
      if ((k & 0x80) != 0) {
        m = 1;
      } else {
        m = 0;
      }
      k &= 0x7F;
      c localc = b;
      localObject1 = a;
      if (localObject1 == null) {
        a = new byte[16];
      } else {
        Arrays.fill((byte[])localObject1, (byte)0);
      }
      localObject1 = e(parama, l1, a, k);
      long l2 = l1 + k;
      l1 = l2;
      parama = (a)localObject1;
      if (m != 0)
      {
        paramu.D(2);
        parama = e((a)localObject1, l2, a, 2);
        l1 = l2 + 2L;
        i = paramu.A();
      }
      Object localObject2 = d;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (localObject2.length >= i) {}
      }
      else
      {
        localObject1 = new int[i];
      }
      Object localObject3 = e;
      if (localObject3 != null)
      {
        localObject2 = localObject3;
        if (localObject3.length >= i) {}
      }
      else
      {
        localObject2 = new int[i];
      }
      if (m != 0)
      {
        m = i * 6;
        paramu.D(m);
        localObject3 = e(parama, l1, a, m);
        l2 = l1 + m;
        paramu.G(0);
        for (m = j;; m++)
        {
          l1 = l2;
          parama = (a)localObject3;
          if (m >= i) {
            break;
          }
          localObject1[m] = paramu.A();
          localObject2[m] = paramu.y();
        }
      }
      localObject1[0] = 0;
      localObject2[0] = (a - (int)(l1 - b));
      Object localObject4 = c;
      int m = e0.a;
      localObject3 = b;
      byte[] arrayOfByte = a;
      k = a;
      j = c;
      m = d;
      f = i;
      d = ((int[])localObject1);
      e = ((int[])localObject2);
      b = ((byte[])localObject3);
      a = arrayOfByte;
      c = k;
      g = j;
      h = m;
      localObject4 = i;
      numSubSamples = i;
      numBytesOfClearData = ((int[])localObject1);
      numBytesOfEncryptedData = ((int[])localObject2);
      key = ((byte[])localObject3);
      iv = arrayOfByte;
      mode = k;
      if (e0.a >= 24)
      {
        localObject1 = j;
        localObject1.getClass();
        c.a.a((c.a)localObject1, j, m);
      }
      l2 = b;
      i = (int)(l1 - l2);
      b = (l2 + i);
      a -= i;
      localObject1 = parama;
    }
    if (paramg.m(268435456))
    {
      paramu.D(4);
      parama = e((a)localObject1, b, a, 4);
      i = paramu.y();
      b += 4L;
      a -= 4;
      paramg.q(i);
      localObject1 = d(parama, b, c, i);
      b += i;
      i = a - i;
      a = i;
      parama = f;
      if ((parama != null) && (parama.capacity() >= i)) {
        f.clear();
      } else {
        f = ByteBuffer.allocate(i);
      }
      l1 = b;
      parama = f;
    }
    else
    {
      paramg.q(a);
      l1 = b;
      parama = c;
    }
    return d((a)localObject1, l1, parama, a);
  }
  
  public final void a(a parama)
  {
    if (c == null) {
      return;
    }
    localo = (o)a;
    Object localObject1 = parama;
    for (;;)
    {
      if (localObject1 != null) {}
      try
      {
        Object localObject2 = f;
        int i = e;
        e = (i + 1);
        t5.a locala = c;
        locala.getClass();
        localObject2[i] = locala;
        d -= 1;
        localObject2 = d;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (c != null) {}
        }
        else
        {
          localObject1 = null;
        }
      }
      finally {}
    }
    localo.notifyAll();
    c = null;
    d = null;
  }
  
  public final void b(long paramLong)
  {
    if (paramLong == -1L) {
      return;
    }
    for (;;)
    {
      Object localObject1 = d;
      if (paramLong >= b)
      {
        ??? = a;
        localObject1 = c;
        synchronized ((o)???)
        {
          t5.a[] arrayOfa = f;
          int i = e;
          e = (i + 1);
          arrayOfa[i] = localObject1;
          d -= 1;
          ???.notifyAll();
          localObject1 = d;
          c = null;
          ??? = d;
          d = null;
          d = ((a)???);
        }
      }
    }
    if (e.a < a) {
      e = locala;
    }
  }
  
  public final int c(int paramInt)
  {
    a locala = f;
    if (c == null) {
      synchronized ((o)a)
      {
        int i = d + 1;
        d = i;
        int j = e;
        Object localObject2;
        if (j > 0)
        {
          localObject2 = f;
          j--;
          e = j;
          localObject2 = localObject2[j];
          localObject2.getClass();
          f[e] = null;
        }
        else
        {
          localObject2 = new t5/a;
          ((t5.a)localObject2).<init>(new byte[b], 0);
          t5.a[] arrayOfa = f;
          if (i > arrayOfa.length) {
            f = ((t5.a[])Arrays.copyOf(arrayOfa, arrayOfa.length * 2));
          }
        }
        long l = f.b;
        ??? = new a(b, l);
        c = ((t5.a)localObject2);
        d = ((a)???);
      }
    }
    return Math.min(paramInt, (int)(f.b - g));
  }
  
  public static final class a
  {
    public long a;
    public long b;
    public t5.a c;
    public a d;
    
    public a(int paramInt, long paramLong)
    {
      boolean bool;
      if (c == null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      a = paramLong;
      b = (paramLong + paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     z4.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */