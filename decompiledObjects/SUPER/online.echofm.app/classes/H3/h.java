package H3;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class h
{
  public static final AtomicLong a = new AtomicLong(0L);
  public static String b;
  
  public h(C paramC)
  {
    Object localObject = new byte[10];
    e((byte[])localObject);
    d((byte[])localObject);
    c((byte[])localObject);
    paramC = i.A(paramC.a().c());
    localObject = i.u((byte[])localObject);
    Locale localLocale = Locale.US;
    b = String.format(localLocale, "%s%s%s%s", new Object[] { ((String)localObject).substring(0, 12), ((String)localObject).substring(12, 16), ((String)localObject).subSequence(16, 20), paramC.substring(0, 12) }).toUpperCase(localLocale);
  }
  
  public static byte[] a(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt((int)paramLong);
    localByteBuffer.order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.position(0);
    return localByteBuffer.array();
  }
  
  public static byte[] b(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort((short)(int)paramLong);
    localByteBuffer.order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.position(0);
    return localByteBuffer.array();
  }
  
  public final void c(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = b(Integer.valueOf(Process.myPid()).shortValue());
    paramArrayOfByte[8] = ((byte)arrayOfByte[0]);
    paramArrayOfByte[9] = ((byte)arrayOfByte[1]);
  }
  
  public final void d(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = b(a.incrementAndGet());
    paramArrayOfByte[6] = ((byte)arrayOfByte[0]);
    paramArrayOfByte[7] = ((byte)arrayOfByte[1]);
  }
  
  public final void e(byte[] paramArrayOfByte)
  {
    long l = new Date().getTime();
    byte[] arrayOfByte = a(l / 1000L);
    paramArrayOfByte[0] = ((byte)arrayOfByte[0]);
    paramArrayOfByte[1] = ((byte)arrayOfByte[1]);
    paramArrayOfByte[2] = ((byte)arrayOfByte[2]);
    paramArrayOfByte[3] = ((byte)arrayOfByte[3]);
    arrayOfByte = b(l % 1000L);
    paramArrayOfByte[4] = ((byte)arrayOfByte[0]);
    paramArrayOfByte[5] = ((byte)arrayOfByte[1]);
  }
  
  public String toString()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     H3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */