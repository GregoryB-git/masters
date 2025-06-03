package s0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class x
{
  public static final Charset a = Charset.forName("UTF-8");
  public static final byte[] b;
  
  static
  {
    Charset.forName("ISO-8859-1");
    Object localObject = new byte[0];
    b = (byte[])localObject;
    ByteBuffer.wrap((byte[])localObject);
    localObject = new h.a((byte[])localObject, 0, 0, false);
    try
    {
      ((h.a)localObject).e(0);
      return;
    }
    catch (y localy)
    {
      throw new IllegalArgumentException(localy);
    }
  }
  
  public static int a(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1231;
    } else {
      i = 1237;
    }
    return i;
  }
  
  public static int b(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static v c(Object paramObject1, Object paramObject2)
  {
    paramObject1 = ((o0)paramObject1).a();
    paramObject2 = (o0)paramObject2;
    paramObject1.getClass();
    if (a.getClass().isInstance(paramObject2))
    {
      paramObject2 = (v)paramObject2;
      ((v.a)paramObject1).j();
      v.a.k(b, (v)paramObject2);
      return ((v.a)paramObject1).i();
    }
    throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
  }
  
  public static abstract interface a
  {
    public abstract int a();
  }
  
  public static abstract interface b
  {
    public abstract boolean a();
  }
  
  public static abstract interface c<E>
    extends List<E>, RandomAccess
  {
    public abstract void b();
    
    public abstract c<E> c(int paramInt);
    
    public abstract boolean g();
  }
}

/* Location:
 * Qualified Name:     s0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */