package u5;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class G
{
  public long a;
  public b b;
  public long c;
  public long d;
  public boolean e;
  public a f;
  public String g;
  
  public ByteBuffer a()
  {
    try
    {
      Object localObject = g;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((String)localObject).getBytes("UTF-8");
      }
      int i;
      if (localObject == null) {
        i = 0;
      } else {
        i = localObject.length;
      }
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i + 56);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.putLong(i);
      localByteBuffer.putLong(a);
      localByteBuffer.putLong(b.e());
      localByteBuffer.putLong(c);
      localByteBuffer.putLong(d);
      long l;
      if (e) {
        l = 1L;
      } else {
        l = 0L;
      }
      localByteBuffer.putLong(l);
      localByteBuffer.putLong(f.e());
      if (localObject != null) {
        localByteBuffer.put((byte[])localObject);
      }
      return localByteBuffer;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError("UTF-8 not supported");
    }
  }
  
  public static enum a
  {
    public final long o;
    
    public a(long paramLong)
    {
      o = paramLong;
    }
    
    public long e()
    {
      return o;
    }
  }
  
  public static enum b
  {
    public long o;
    
    public b(long paramLong)
    {
      o = paramLong;
    }
    
    public long e()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     u5.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */