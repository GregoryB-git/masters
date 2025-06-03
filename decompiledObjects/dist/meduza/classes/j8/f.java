package j8;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class f
{
  public static final String b;
  public static final AtomicLong c = new AtomicLong(0L);
  public final String a;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(UUID.randomUUID().toString());
    localStringBuilder.append(System.currentTimeMillis());
    b = g.i(localStringBuilder.toString());
  }
  
  public f()
  {
    long l1 = new Date().getTime();
    long l2 = l1 / 1000L;
    Object localObject = ByteBuffer.allocate(4);
    ((ByteBuffer)localObject).putInt((int)l2);
    ((ByteBuffer)localObject).order(ByteOrder.BIG_ENDIAN);
    ((ByteBuffer)localObject).position(0);
    localObject = ((ByteBuffer)localObject).array();
    int i = localObject[0];
    int j = localObject[1];
    int k = localObject[2];
    int m = localObject[3];
    localObject = a(l1 % 1000L);
    int n = localObject[0];
    int i1 = localObject[1];
    localObject = a(c.incrementAndGet());
    int i2 = localObject[0];
    int i3 = localObject[1];
    localObject = a(Integer.valueOf(Process.myPid()).shortValue());
    String str = g.f(new byte[] { i, j, k, m, n, i1, i2, i3, localObject[0], localObject[1] });
    localObject = Locale.US;
    a = String.format((Locale)localObject, "%s%s%s%s", new Object[] { str.substring(0, 12), str.substring(12, 16), str.subSequence(16, 20), b.substring(0, 12) }).toUpperCase((Locale)localObject);
  }
  
  public static byte[] a(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort((short)(int)paramLong);
    localByteBuffer.order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.position(0);
    return localByteBuffer.array();
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     j8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */