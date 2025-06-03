package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class a0
{
  public static final Charset a;
  public static final byte[] b;
  public static final ByteBuffer c;
  
  static
  {
    Charset.forName("US-ASCII");
    a = Charset.forName("UTF-8");
    Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = new byte[0];
    b = arrayOfByte;
    c = ByteBuffer.wrap(arrayOfByte);
    i.f(arrayOfByte, 0, 0, false);
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
  
  public static abstract interface a
  {
    public abstract int a();
  }
  
  public static abstract interface b
  {
    public abstract boolean a();
  }
  
  public static abstract interface c
    extends a0.d<Integer>
  {}
  
  public static abstract interface d<E>
    extends List<E>, RandomAccess
  {
    public abstract void b();
    
    public abstract d<E> c(int paramInt);
    
    public abstract boolean g();
  }
}

/* Location:
 * Qualified Name:     ma.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */