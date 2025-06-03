package t0;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import u0.b;
import u0.c;

public final class g
{
  public static b a(MappedByteBuffer paramMappedByteBuffer)
  {
    paramMappedByteBuffer = paramMappedByteBuffer.duplicate();
    Object localObject = new a(paramMappedByteBuffer);
    ((a)localObject).b(4);
    int i = paramMappedByteBuffer.getShort() & 0xFFFF;
    if (i <= 100)
    {
      ((a)localObject).b(6);
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        int m = a.getInt();
        ((a)localObject).b(4);
        l1 = ((a)localObject).a();
        ((a)localObject).b(4);
        if (1835365473 == m) {
          break label96;
        }
      }
      long l1 = -1L;
      label96:
      if (l1 != -1L)
      {
        ((a)localObject).b((int)(l1 - a.position()));
        ((a)localObject).b(12);
        long l2 = ((a)localObject).a();
        k = j;
        while (k < l2)
        {
          j = a.getInt();
          long l3 = ((a)localObject).a();
          ((a)localObject).a();
          if ((1164798569 != j) && (1701669481 != j))
          {
            k++;
          }
          else
          {
            paramMappedByteBuffer.position((int)(l3 + l1));
            localObject = new b();
            paramMappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            k = paramMappedByteBuffer.getInt(paramMappedByteBuffer.position());
            k = paramMappedByteBuffer.position() + k;
            b = paramMappedByteBuffer;
            a = k;
            k -= paramMappedByteBuffer.getInt(k);
            c = k;
            d = b.getShort(k);
            return (b)localObject;
          }
        }
      }
      throw new IOException("Cannot read metadata.");
    }
    throw new IOException("Cannot read metadata.");
  }
  
  public static final class a
  {
    public final ByteBuffer a;
    
    public a(ByteBuffer paramByteBuffer)
    {
      a = paramByteBuffer;
      paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
    
    public final long a()
    {
      return a.getInt() & 0xFFFFFFFF;
    }
    
    public final void b(int paramInt)
    {
      ByteBuffer localByteBuffer = a;
      localByteBuffer.position(localByteBuffer.position() + paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     t0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */