package E5;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class p
  implements i
{
  public static final p a = new p();
  public static final boolean b;
  public static final Charset c = Charset.forName("UTF8");
  
  static
  {
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
  }
  
  public static final void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.position() % paramInt;
    if (i != 0) {
      paramByteBuffer.position(paramByteBuffer.position() + paramInt - i);
    }
  }
  
  public static final byte[] d(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[e(paramByteBuffer)];
    paramByteBuffer.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static final int e(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasRemaining())
    {
      int i = paramByteBuffer.get() & 0xFF;
      if (i < 254) {
        return i;
      }
      if (i == 254) {
        return paramByteBuffer.getChar();
      }
      return paramByteBuffer.getInt();
    }
    throw new IllegalArgumentException("Message corrupted");
  }
  
  public static final void h(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    int i = paramByteArrayOutputStream.size() % paramInt;
    if (i != 0) {
      for (int j = 0; j < paramInt - i; j++) {
        paramByteArrayOutputStream.write(0);
      }
    }
  }
  
  public static final void i(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfByte)
  {
    o(paramByteArrayOutputStream, paramArrayOfByte.length);
    paramByteArrayOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static final void j(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (b)
    {
      paramByteArrayOutputStream.write(paramInt);
      paramInt >>>= 8;
    }
    for (;;)
    {
      paramByteArrayOutputStream.write(paramInt);
      break;
      paramByteArrayOutputStream.write(paramInt >>> 8);
    }
  }
  
  public static final void k(ByteArrayOutputStream paramByteArrayOutputStream, double paramDouble)
  {
    n(paramByteArrayOutputStream, Double.doubleToLongBits(paramDouble));
  }
  
  public static final void l(ByteArrayOutputStream paramByteArrayOutputStream, float paramFloat)
  {
    m(paramByteArrayOutputStream, Float.floatToIntBits(paramFloat));
  }
  
  public static final void m(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (b)
    {
      paramByteArrayOutputStream.write(paramInt);
      paramByteArrayOutputStream.write(paramInt >>> 8);
      paramByteArrayOutputStream.write(paramInt >>> 16);
      paramInt >>>= 24;
    }
    for (;;)
    {
      paramByteArrayOutputStream.write(paramInt);
      break;
      paramByteArrayOutputStream.write(paramInt >>> 24);
      paramByteArrayOutputStream.write(paramInt >>> 16);
      paramByteArrayOutputStream.write(paramInt >>> 8);
    }
  }
  
  public static final void n(ByteArrayOutputStream paramByteArrayOutputStream, long paramLong)
  {
    if (b)
    {
      paramByteArrayOutputStream.write((byte)(int)paramLong);
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 8));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 16));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 24));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 32));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 40));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 48));
      paramLong >>>= 56;
    }
    for (;;)
    {
      paramByteArrayOutputStream.write((byte)(int)paramLong);
      break;
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 56));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 48));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 40));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 32));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 24));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 16));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 8));
    }
  }
  
  public static final void o(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (paramInt < 254)
    {
      paramByteArrayOutputStream.write(paramInt);
    }
    else if (paramInt <= 65535)
    {
      paramByteArrayOutputStream.write(254);
      j(paramByteArrayOutputStream, paramInt);
    }
    else
    {
      paramByteArrayOutputStream.write(255);
      m(paramByteArrayOutputStream, paramInt);
    }
  }
  
  public ByteBuffer a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    a locala = new a();
    p(locala, paramObject);
    paramObject = ByteBuffer.allocateDirect(locala.size());
    ((ByteBuffer)paramObject).put(locala.a(), 0, locala.size());
    return (ByteBuffer)paramObject;
  }
  
  public Object b(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return null;
    }
    paramByteBuffer.order(ByteOrder.nativeOrder());
    Object localObject = f(paramByteBuffer);
    if (!paramByteBuffer.hasRemaining()) {
      return localObject;
    }
    throw new IllegalArgumentException("Message corrupted");
  }
  
  public final Object f(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasRemaining()) {
      return g(paramByteBuffer.get(), paramByteBuffer);
    }
    throw new IllegalArgumentException("Message corrupted");
  }
  
  public Object g(byte paramByte, ByteBuffer paramByteBuffer)
  {
    byte b1 = 0;
    byte b2 = 0;
    Object localObject1;
    switch (paramByte)
    {
    default: 
      throw new IllegalArgumentException("Message corrupted");
    case 14: 
      paramByte = e(paramByteBuffer);
      localObject1 = new float[paramByte];
      c(paramByteBuffer, 4);
      paramByteBuffer.asFloatBuffer().get((float[])localObject1);
    case 13: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
      for (;;)
      {
        paramByteBuffer.position(paramByteBuffer.position() + paramByte * 4);
        paramByteBuffer = (ByteBuffer)localObject1;
        break;
        b1 = e(paramByteBuffer);
        Object localObject2 = new HashMap();
        for (paramByte = b2;; paramByte++)
        {
          localObject1 = localObject2;
          if (paramByte >= b1) {
            break;
          }
          ((Map)localObject2).put(f(paramByteBuffer), f(paramByteBuffer));
        }
        paramByteBuffer = (ByteBuffer)localObject1;
        break;
        b2 = e(paramByteBuffer);
        localObject2 = new ArrayList(b2);
        for (paramByte = b1;; paramByte++)
        {
          localObject1 = localObject2;
          if (paramByte >= b2) {
            break;
          }
          ((List)localObject2).add(f(paramByteBuffer));
        }
        paramByte = e(paramByteBuffer);
        localObject1 = new double[paramByte];
        c(paramByteBuffer, 8);
        paramByteBuffer.asDoubleBuffer().get((double[])localObject1);
        for (;;)
        {
          paramByteBuffer.position(paramByteBuffer.position() + paramByte * 8);
          paramByteBuffer = (ByteBuffer)localObject1;
          break;
          paramByte = e(paramByteBuffer);
          localObject1 = new long[paramByte];
          c(paramByteBuffer, 8);
          paramByteBuffer.asLongBuffer().get((long[])localObject1);
        }
        paramByte = e(paramByteBuffer);
        localObject1 = new int[paramByte];
        c(paramByteBuffer, 4);
        paramByteBuffer.asIntBuffer().get((int[])localObject1);
      }
    case 8: 
      paramByteBuffer = d(paramByteBuffer);
      break;
    case 7: 
      paramByteBuffer = new String(d(paramByteBuffer), c);
      break;
    case 6: 
      c(paramByteBuffer, 8);
      paramByteBuffer = Double.valueOf(paramByteBuffer.getDouble());
      break;
    case 5: 
      paramByteBuffer = new BigInteger(new String(d(paramByteBuffer), c), 16);
      break;
    case 4: 
      paramByteBuffer = Long.valueOf(paramByteBuffer.getLong());
      break;
    case 3: 
      paramByteBuffer = Integer.valueOf(paramByteBuffer.getInt());
      break;
    case 2: 
      paramByteBuffer = Boolean.FALSE;
      break;
    case 1: 
      paramByteBuffer = Boolean.TRUE;
      break;
    case 0: 
      paramByteBuffer = null;
    }
    return paramByteBuffer;
  }
  
  public void p(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if ((paramObject != null) && (!paramObject.equals(null)))
    {
      if ((paramObject instanceof Boolean))
      {
        if (((Boolean)paramObject).booleanValue()) {
          m = 1;
        } else {
          m = 2;
        }
        paramByteArrayOutputStream.write(m);
      }
      else if ((paramObject instanceof Number))
      {
        if ((!(paramObject instanceof Integer)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof Byte)))
        {
          if ((paramObject instanceof Long))
          {
            paramByteArrayOutputStream.write(4);
            n(paramByteArrayOutputStream, ((Long)paramObject).longValue());
          }
          else if ((!(paramObject instanceof Float)) && (!(paramObject instanceof Double)))
          {
            if ((paramObject instanceof BigInteger))
            {
              paramByteArrayOutputStream.write(5);
              i(paramByteArrayOutputStream, ((BigInteger)paramObject).toString(16).getBytes(c));
            }
            else
            {
              paramByteArrayOutputStream = new StringBuilder();
              paramByteArrayOutputStream.append("Unsupported Number type: ");
              paramByteArrayOutputStream.append(paramObject.getClass());
              throw new IllegalArgumentException(paramByteArrayOutputStream.toString());
            }
          }
          else
          {
            paramByteArrayOutputStream.write(6);
            h(paramByteArrayOutputStream, 8);
            k(paramByteArrayOutputStream, ((Number)paramObject).doubleValue());
          }
        }
        else
        {
          paramByteArrayOutputStream.write(3);
          m(paramByteArrayOutputStream, ((Number)paramObject).intValue());
        }
      }
      else if ((paramObject instanceof CharSequence))
      {
        paramByteArrayOutputStream.write(7);
        i(paramByteArrayOutputStream, paramObject.toString().getBytes(c));
      }
      else if ((paramObject instanceof byte[]))
      {
        paramByteArrayOutputStream.write(8);
        i(paramByteArrayOutputStream, (byte[])paramObject);
      }
      else
      {
        if ((paramObject instanceof int[]))
        {
          paramByteArrayOutputStream.write(9);
          paramObject = (int[])paramObject;
          o(paramByteArrayOutputStream, paramObject.length);
          h(paramByteArrayOutputStream, 4);
          i = paramObject.length;
          while (m < i)
          {
            m(paramByteArrayOutputStream, paramObject[m]);
            m++;
          }
        }
        if ((paramObject instanceof long[]))
        {
          paramByteArrayOutputStream.write(10);
          paramObject = (long[])paramObject;
          o(paramByteArrayOutputStream, paramObject.length);
          h(paramByteArrayOutputStream, 8);
          j = paramObject.length;
          for (m = i; m < j; m++) {
            n(paramByteArrayOutputStream, paramObject[m]);
          }
        }
        if ((paramObject instanceof double[]))
        {
          paramByteArrayOutputStream.write(11);
          paramObject = (double[])paramObject;
          o(paramByteArrayOutputStream, paramObject.length);
          h(paramByteArrayOutputStream, 8);
          i = paramObject.length;
          for (m = j; m < i; m++) {
            k(paramByteArrayOutputStream, paramObject[m]);
          }
        }
        if ((paramObject instanceof List))
        {
          paramByteArrayOutputStream.write(12);
          paramObject = (List)paramObject;
          o(paramByteArrayOutputStream, ((List)paramObject).size());
          paramObject = ((List)paramObject).iterator();
          while (((Iterator)paramObject).hasNext()) {
            p(paramByteArrayOutputStream, ((Iterator)paramObject).next());
          }
        }
        if ((paramObject instanceof Map))
        {
          paramByteArrayOutputStream.write(13);
          paramObject = (Map)paramObject;
          o(paramByteArrayOutputStream, ((Map)paramObject).size());
          Iterator localIterator = ((Map)paramObject).entrySet().iterator();
          while (localIterator.hasNext())
          {
            paramObject = (Map.Entry)localIterator.next();
            p(paramByteArrayOutputStream, ((Map.Entry)paramObject).getKey());
            p(paramByteArrayOutputStream, ((Map.Entry)paramObject).getValue());
          }
        }
        if ((paramObject instanceof float[]))
        {
          paramByteArrayOutputStream.write(14);
          paramObject = (float[])paramObject;
          o(paramByteArrayOutputStream, paramObject.length);
          h(paramByteArrayOutputStream, 4);
          i = paramObject.length;
          for (m = k; m < i; m++) {
            l(paramByteArrayOutputStream, paramObject[m]);
          }
        }
        paramByteArrayOutputStream = new StringBuilder();
        paramByteArrayOutputStream.append("Unsupported value: '");
        paramByteArrayOutputStream.append(paramObject);
        paramByteArrayOutputStream.append("' of type '");
        paramByteArrayOutputStream.append(paramObject.getClass());
        paramByteArrayOutputStream.append("'");
        throw new IllegalArgumentException(paramByteArrayOutputStream.toString());
      }
    }
    else {
      paramByteArrayOutputStream.write(0);
    }
  }
  
  public static final class a
    extends ByteArrayOutputStream
  {
    public byte[] a()
    {
      return buf;
    }
  }
}

/* Location:
 * Qualified Name:     E5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */