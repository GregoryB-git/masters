package xc;

import ec.i;
import java.nio.ByteBuffer;

public final class r
  implements g
{
  public final w a;
  public final f b;
  public boolean c;
  
  public r(w paramw)
  {
    a = paramw;
    b = new f();
  }
  
  public final g D()
  {
    if ((c ^ true))
    {
      long l = b.g();
      if (l > 0L) {
        a.g0(b, l);
      }
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g O(String paramString)
  {
    i.e(paramString, "string");
    if ((c ^ true))
    {
      b.H0(paramString);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g Y(long paramLong)
  {
    if ((c ^ true))
    {
      b.C0(paramLong);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final z c()
  {
    return a.c();
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	xc/r:c	Z
    //   4: ifne +83 -> 87
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 24	xc/r:b	Lxc/f;
    //   13: astore_2
    //   14: aload_2
    //   15: getfield 78	xc/f:b	J
    //   18: lstore_3
    //   19: aload_1
    //   20: astore 5
    //   22: lload_3
    //   23: lconst_0
    //   24: lcmp
    //   25: ifle +22 -> 47
    //   28: aload_0
    //   29: getfield 19	xc/r:a	Lxc/w;
    //   32: aload_2
    //   33: lload_3
    //   34: invokeinterface 39 4 0
    //   39: aload_1
    //   40: astore 5
    //   42: goto +5 -> 47
    //   45: astore 5
    //   47: aload_0
    //   48: getfield 19	xc/r:a	Lxc/w;
    //   51: invokeinterface 80 1 0
    //   56: aload 5
    //   58: astore_1
    //   59: goto +14 -> 73
    //   62: astore_2
    //   63: aload 5
    //   65: astore_1
    //   66: aload 5
    //   68: ifnonnull +5 -> 73
    //   71: aload_2
    //   72: astore_1
    //   73: aload_0
    //   74: iconst_1
    //   75: putfield 29	xc/r:c	Z
    //   78: aload_1
    //   79: ifnonnull +6 -> 85
    //   82: goto +5 -> 87
    //   85: aload_1
    //   86: athrow
    //   87: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	r
    //   8	78	1	localObject1	Object
    //   13	20	2	localf	f
    //   62	10	2	localObject2	Object
    //   18	16	3	l	long
    //   20	21	5	localObject3	Object
    //   45	22	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   9	19	45	finally
    //   28	39	45	finally
    //   47	56	62	finally
  }
  
  public final g f()
  {
    i.e(null, "byteString");
    throw null;
  }
  
  public final void flush()
  {
    if ((c ^ true))
    {
      f localf = b;
      long l = b;
      if (l > 0L) {
        a.g0(localf, l);
      }
      a.flush();
      return;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    i.e(paramArrayOfByte, "source");
    if ((c ^ true))
    {
      b.write(paramArrayOfByte, paramInt1, paramInt2);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final void g0(f paramf, long paramLong)
  {
    i.e(paramf, "source");
    if ((c ^ true))
    {
      b.g0(paramf, paramLong);
      D();
      return;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final boolean isOpen()
  {
    return c ^ true;
  }
  
  public final f k()
  {
    return b;
  }
  
  public final g o()
  {
    if ((c ^ true))
    {
      f localf = b;
      long l = b;
      if (l > 0L) {
        a.g0(localf, l);
      }
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("buffer(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final int write(ByteBuffer paramByteBuffer)
  {
    i.e(paramByteBuffer, "source");
    if ((c ^ true))
    {
      int i = b.write(paramByteBuffer);
      D();
      return i;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g write(byte[] paramArrayOfByte)
  {
    i.e(paramArrayOfByte, "source");
    if ((c ^ true))
    {
      b.write(paramArrayOfByte);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g writeByte(int paramInt)
  {
    if ((c ^ true))
    {
      b.B0(paramInt);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g writeInt(int paramInt)
  {
    if ((c ^ true))
    {
      b.D0(paramInt);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final g writeShort(int paramInt)
  {
    if ((c ^ true))
    {
      b.F0(paramInt);
      D();
      return this;
    }
    throw new IllegalStateException("closed".toString());
  }
}

/* Location:
 * Qualified Name:     xc.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */