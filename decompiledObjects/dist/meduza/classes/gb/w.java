package gb;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class w
  extends b
{
  public static final a e = new a();
  public static final b f = new b();
  public static final c o = new c();
  public static final d p = new d();
  public static final e q = new e();
  public final ArrayDeque a;
  public ArrayDeque b;
  public int c;
  public boolean d;
  
  public w()
  {
    new ArrayDeque(2);
    a = new ArrayDeque();
  }
  
  public w(int paramInt)
  {
    new ArrayDeque(2);
    a = new ArrayDeque(paramInt);
  }
  
  public final void C()
  {
    if (d)
    {
      b.add((u2)a.remove());
      u2 localu2 = (u2)a.peek();
      if (localu2 != null) {
        localu2.Z();
      }
    }
    else
    {
      ((u2)a.remove()).close();
    }
  }
  
  public final void H()
  {
    if (((u2)a.peek()).b() == 0) {
      C();
    }
  }
  
  public final <T> int I(g<T> paramg, int paramInt1, T paramT, int paramInt2)
  {
    f(paramInt1);
    w localw;
    if (!a.isEmpty()) {
      localw = this;
    } else {
      localw = this;
    }
    while ((paramInt1 > 0) && (!a.isEmpty()))
    {
      u2 localu2 = (u2)a.peek();
      int i = Math.min(paramInt1, localu2.b());
      paramInt2 = paramg.a(localu2, i, paramT, paramInt2);
      paramInt1 -= i;
      c -= i;
      localw.H();
    }
    if (paramInt1 <= 0) {
      return paramInt2;
    }
    throw new AssertionError("Failed executing read operation");
  }
  
  public final <T> int M(f<T> paramf, int paramInt1, T paramT, int paramInt2)
  {
    try
    {
      paramInt1 = I(paramf, paramInt1, paramT, paramInt2);
      return paramInt1;
    }
    catch (IOException paramf)
    {
      throw new AssertionError(paramf);
    }
  }
  
  public final void U(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    M(o, paramInt2, paramArrayOfByte, paramInt1);
  }
  
  public final void Z()
  {
    if (b == null) {
      b = new ArrayDeque(Math.min(a.size(), 16));
    }
    while (!b.isEmpty()) {
      ((u2)b.remove()).close();
    }
    d = true;
    u2 localu2 = (u2)a.peek();
    if (localu2 != null) {
      localu2.Z();
    }
  }
  
  public final int b()
  {
    return c;
  }
  
  public final void close()
  {
    while (!a.isEmpty()) {
      ((u2)a.remove()).close();
    }
    if (b != null) {
      while (!b.isEmpty()) {
        ((u2)b.remove()).close();
      }
    }
  }
  
  public final void g(u2 paramu2)
  {
    int i;
    if ((d) && (a.isEmpty())) {
      i = 1;
    } else {
      i = 0;
    }
    if (!(paramu2 instanceof w))
    {
      a.add(paramu2);
      int j = c;
      c = (paramu2.b() + j);
    }
    else
    {
      w localw = (w)paramu2;
      while (!a.isEmpty())
      {
        paramu2 = (u2)a.remove();
        a.add(paramu2);
      }
      c += c;
      c = 0;
      localw.close();
    }
    if (i != 0) {
      ((u2)a.peek()).Z();
    }
  }
  
  public final void m0(OutputStream paramOutputStream, int paramInt)
  {
    I(q, paramInt, paramOutputStream, 0);
  }
  
  public final boolean markSupported()
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      if (!((u2)localIterator.next()).markSupported()) {
        return false;
      }
    }
    return true;
  }
  
  public final u2 r(int paramInt)
  {
    if (paramInt <= 0) {
      return v2.a;
    }
    f(paramInt);
    c -= paramInt;
    Object localObject1 = null;
    Object localObject2 = null;
    for (;;)
    {
      u2 localu2 = (u2)a.peek();
      int i = localu2.b();
      if (i > paramInt)
      {
        localu2 = localu2.r(paramInt);
        paramInt = 0;
      }
      else
      {
        if (d)
        {
          localu2 = localu2.r(i);
          C();
        }
        else
        {
          localu2 = (u2)a.poll();
        }
        paramInt -= i;
      }
      if (localObject1 == null)
      {
        localObject1 = localu2;
      }
      else
      {
        Object localObject3 = localObject1;
        Object localObject4 = localObject2;
        if (localObject2 == null)
        {
          i = 2;
          if (paramInt != 0) {
            i = Math.min(a.size() + 2, 16);
          }
          localObject4 = new w(i);
          ((w)localObject4).g((u2)localObject1);
          localObject3 = localObject4;
        }
        ((w)localObject4).g(localu2);
        localObject2 = localObject4;
        localObject1 = localObject3;
      }
      if (paramInt <= 0) {
        return (u2)localObject1;
      }
    }
  }
  
  public final int readUnsignedByte()
  {
    return M(e, 1, null, 0);
  }
  
  public final void reset()
  {
    if (d)
    {
      Object localObject = (u2)a.peek();
      int j;
      if (localObject != null)
      {
        int i = ((u2)localObject).b();
        ((u2)localObject).reset();
        j = c;
        j = ((u2)localObject).b() - i + j;
        localObject = this;
      }
      else
      {
        localObject = this;
      }
      for (;;)
      {
        u2 localu2 = (u2)b.pollLast();
        if (localu2 == null) {
          break;
        }
        localu2.reset();
        a.addFirst(localu2);
        j = c;
        j = localu2.b() + j;
        c = j;
      }
      return;
    }
    throw new InvalidMarkException();
  }
  
  public final void skipBytes(int paramInt)
  {
    M(f, paramInt, null, 0);
  }
  
  public final void v0(ByteBuffer paramByteBuffer)
  {
    M(p, paramByteBuffer.remaining(), paramByteBuffer, 0);
  }
  
  public final class a
    implements w.f<Void>
  {
    public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
    {
      paramObject = (Void)paramObject;
      return paramu2.readUnsignedByte();
    }
  }
  
  public final class b
    implements w.f<Void>
  {
    public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
    {
      paramObject = (Void)paramObject;
      paramu2.skipBytes(paramInt1);
      return 0;
    }
  }
  
  public final class c
    implements w.f<byte[]>
  {
    public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
    {
      paramu2.U((byte[])paramObject, paramInt2, paramInt1);
      return paramInt2 + paramInt1;
    }
  }
  
  public final class d
    implements w.f<ByteBuffer>
  {
    public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
    {
      paramObject = (ByteBuffer)paramObject;
      paramInt2 = ((Buffer)paramObject).limit();
      ((Buffer)paramObject).limit(((Buffer)paramObject).position() + paramInt1);
      paramu2.v0((ByteBuffer)paramObject);
      ((Buffer)paramObject).limit(paramInt2);
      return 0;
    }
  }
  
  public final class e
    implements w.g<OutputStream>
  {
    public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
    {
      paramu2.m0((OutputStream)paramObject, paramInt1);
      return 0;
    }
  }
  
  public static abstract interface f<T>
    extends w.g<T>
  {}
  
  public static abstract interface g<T>
  {
    public abstract int a(u2 paramu2, int paramInt1, T paramT, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     gb.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */