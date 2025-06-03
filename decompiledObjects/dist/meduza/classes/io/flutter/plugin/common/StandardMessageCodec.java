package io.flutter.plugin.common;

import f;
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

public class StandardMessageCodec
  implements MessageCodec<Object>
{
  private static final byte BIGINT = 5;
  private static final byte BYTE_ARRAY = 8;
  private static final byte DOUBLE = 6;
  private static final byte DOUBLE_ARRAY = 11;
  private static final byte FALSE = 2;
  private static final byte FLOAT_ARRAY = 14;
  public static final StandardMessageCodec INSTANCE = new StandardMessageCodec();
  private static final byte INT = 3;
  private static final byte INT_ARRAY = 9;
  private static final byte LIST = 12;
  private static final boolean LITTLE_ENDIAN;
  private static final byte LONG = 4;
  private static final byte LONG_ARRAY = 10;
  private static final byte MAP = 13;
  private static final byte NULL = 0;
  private static final byte STRING = 7;
  private static final String TAG = "StandardMessageCodec#";
  private static final byte TRUE = 1;
  private static final Charset UTF8 = Charset.forName("UTF8");
  
  static
  {
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    }
    LITTLE_ENDIAN = bool;
  }
  
  public static final void readAlignment(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.position() % paramInt;
    if (i != 0) {
      paramByteBuffer.position(paramByteBuffer.position() + paramInt - i);
    }
  }
  
  public static final byte[] readBytes(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[readSize(paramByteBuffer)];
    paramByteBuffer.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static final int readSize(ByteBuffer paramByteBuffer)
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
  
  public static final void writeAlignment(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    int i = paramByteArrayOutputStream.size() % paramInt;
    if (i != 0) {
      for (int j = 0; j < paramInt - i; j++) {
        paramByteArrayOutputStream.write(0);
      }
    }
  }
  
  public static final void writeBytes(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfByte)
  {
    writeSize(paramByteArrayOutputStream, paramArrayOfByte.length);
    paramByteArrayOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static final void writeChar(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (LITTLE_ENDIAN)
    {
      paramByteArrayOutputStream.write(paramInt);
      paramInt >>>= 8;
    }
    else
    {
      paramByteArrayOutputStream.write(paramInt >>> 8);
    }
    paramByteArrayOutputStream.write(paramInt);
  }
  
  public static final void writeDouble(ByteArrayOutputStream paramByteArrayOutputStream, double paramDouble)
  {
    writeLong(paramByteArrayOutputStream, Double.doubleToLongBits(paramDouble));
  }
  
  public static final void writeFloat(ByteArrayOutputStream paramByteArrayOutputStream, float paramFloat)
  {
    writeInt(paramByteArrayOutputStream, Float.floatToIntBits(paramFloat));
  }
  
  public static final void writeInt(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (LITTLE_ENDIAN)
    {
      paramByteArrayOutputStream.write(paramInt);
      paramByteArrayOutputStream.write(paramInt >>> 8);
      paramByteArrayOutputStream.write(paramInt >>> 16);
      paramInt >>>= 24;
    }
    else
    {
      paramByteArrayOutputStream.write(paramInt >>> 24);
      paramByteArrayOutputStream.write(paramInt >>> 16);
      paramByteArrayOutputStream.write(paramInt >>> 8);
    }
    paramByteArrayOutputStream.write(paramInt);
  }
  
  public static final void writeLong(ByteArrayOutputStream paramByteArrayOutputStream, long paramLong)
  {
    if (LITTLE_ENDIAN)
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
    else
    {
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 56));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 48));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 40));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 32));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 24));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 16));
      paramByteArrayOutputStream.write((byte)(int)(paramLong >>> 8));
    }
    paramByteArrayOutputStream.write((byte)(int)paramLong);
  }
  
  public static final void writeSize(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    if (paramInt < 254)
    {
      paramByteArrayOutputStream.write(paramInt);
    }
    else if (paramInt <= 65535)
    {
      paramByteArrayOutputStream.write(254);
      writeChar(paramByteArrayOutputStream, paramInt);
    }
    else
    {
      paramByteArrayOutputStream.write(255);
      writeInt(paramByteArrayOutputStream, paramInt);
    }
  }
  
  public Object decodeMessage(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return null;
    }
    paramByteBuffer.order(ByteOrder.nativeOrder());
    Object localObject = readValue(paramByteBuffer);
    if (!paramByteBuffer.hasRemaining()) {
      return localObject;
    }
    throw new IllegalArgumentException("Message corrupted");
  }
  
  public ByteBuffer encodeMessage(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    ExposedByteArrayOutputStream localExposedByteArrayOutputStream = new ExposedByteArrayOutputStream();
    writeValue(localExposedByteArrayOutputStream, paramObject);
    paramObject = ByteBuffer.allocateDirect(localExposedByteArrayOutputStream.size());
    ((ByteBuffer)paramObject).put(localExposedByteArrayOutputStream.buffer(), 0, localExposedByteArrayOutputStream.size());
    return (ByteBuffer)paramObject;
  }
  
  public final Object readValue(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasRemaining()) {
      return readValueOfType(paramByteBuffer.get(), paramByteBuffer);
    }
    throw new IllegalArgumentException("Message corrupted");
  }
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    byte b1 = 0;
    byte b2 = 0;
    Object localObject1;
    Object localObject2;
    switch (paramByte)
    {
    default: 
      throw new IllegalArgumentException("Message corrupted");
    case 14: 
      paramByte = readSize(paramByteBuffer);
      localObject1 = new float[paramByte];
      readAlignment(paramByteBuffer, 4);
      paramByteBuffer.asFloatBuffer().get((float[])localObject1);
      break;
    case 13: 
      b1 = readSize(paramByteBuffer);
      localObject2 = new HashMap();
      for (paramByte = b2;; paramByte++)
      {
        localObject1 = localObject2;
        if (paramByte >= b1) {
          break;
        }
        ((HashMap)localObject2).put(readValue(paramByteBuffer), readValue(paramByteBuffer));
      }
    case 12: 
      b2 = readSize(paramByteBuffer);
      localObject2 = new ArrayList(b2);
      for (paramByte = b1;; paramByte++)
      {
        localObject1 = localObject2;
        if (paramByte >= b2) {
          break;
        }
        ((ArrayList)localObject2).add(readValue(paramByteBuffer));
      }
      paramByteBuffer = (ByteBuffer)localObject1;
      break;
    case 11: 
      paramByte = readSize(paramByteBuffer);
      localObject1 = new double[paramByte];
      readAlignment(paramByteBuffer, 8);
      paramByteBuffer.asDoubleBuffer().get((double[])localObject1);
      break;
    case 10: 
      paramByte = readSize(paramByteBuffer);
      localObject1 = new long[paramByte];
      readAlignment(paramByteBuffer, 8);
      paramByteBuffer.asLongBuffer().get((long[])localObject1);
      paramByte = paramByte * 8 + paramByteBuffer.position();
      break;
    case 9: 
      paramByte = readSize(paramByteBuffer);
      localObject1 = new int[paramByte];
      readAlignment(paramByteBuffer, 4);
      paramByteBuffer.asIntBuffer().get((int[])localObject1);
      paramByte = paramByte * 4 + paramByteBuffer.position();
      paramByteBuffer.position(paramByte);
      paramByteBuffer = (ByteBuffer)localObject1;
      break;
    case 8: 
      paramByteBuffer = readBytes(paramByteBuffer);
      break;
    case 7: 
      paramByteBuffer = new String(readBytes(paramByteBuffer), UTF8);
      break;
    case 6: 
      readAlignment(paramByteBuffer, 8);
      paramByteBuffer = Double.valueOf(paramByteBuffer.getDouble());
      break;
    case 5: 
      paramByteBuffer = new BigInteger(new String(readBytes(paramByteBuffer), UTF8), 16);
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
    }
    paramByteBuffer = null;
    return paramByteBuffer;
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
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
            writeLong(paramByteArrayOutputStream, ((Long)paramObject).longValue());
          }
          else if ((!(paramObject instanceof Float)) && (!(paramObject instanceof Double)))
          {
            if ((paramObject instanceof BigInteger))
            {
              paramByteArrayOutputStream.write(5);
              writeBytes(paramByteArrayOutputStream, ((BigInteger)paramObject).toString(16).getBytes(UTF8));
            }
            else
            {
              paramByteArrayOutputStream = f.l("Unsupported Number type: ");
              paramByteArrayOutputStream.append(paramObject.getClass());
              throw new IllegalArgumentException(paramByteArrayOutputStream.toString());
            }
          }
          else
          {
            paramByteArrayOutputStream.write(6);
            writeAlignment(paramByteArrayOutputStream, 8);
            writeDouble(paramByteArrayOutputStream, ((Number)paramObject).doubleValue());
          }
        }
        else
        {
          paramByteArrayOutputStream.write(3);
          writeInt(paramByteArrayOutputStream, ((Number)paramObject).intValue());
        }
      }
      else if ((paramObject instanceof CharSequence))
      {
        paramByteArrayOutputStream.write(7);
        writeBytes(paramByteArrayOutputStream, paramObject.toString().getBytes(UTF8));
      }
      else if ((paramObject instanceof byte[]))
      {
        paramByteArrayOutputStream.write(8);
        writeBytes(paramByteArrayOutputStream, (byte[])paramObject);
      }
      else
      {
        if ((paramObject instanceof int[]))
        {
          paramByteArrayOutputStream.write(9);
          paramObject = (int[])paramObject;
          writeSize(paramByteArrayOutputStream, paramObject.length);
          writeAlignment(paramByteArrayOutputStream, 4);
          i = paramObject.length;
          while (m < i)
          {
            writeInt(paramByteArrayOutputStream, paramObject[m]);
            m++;
          }
        }
        if ((paramObject instanceof long[]))
        {
          paramByteArrayOutputStream.write(10);
          paramObject = (long[])paramObject;
          writeSize(paramByteArrayOutputStream, paramObject.length);
          writeAlignment(paramByteArrayOutputStream, 8);
          j = paramObject.length;
          for (m = i; m < j; m++) {
            writeLong(paramByteArrayOutputStream, paramObject[m]);
          }
        }
        if ((paramObject instanceof double[]))
        {
          paramByteArrayOutputStream.write(11);
          paramObject = (double[])paramObject;
          writeSize(paramByteArrayOutputStream, paramObject.length);
          writeAlignment(paramByteArrayOutputStream, 8);
          i = paramObject.length;
          for (m = j; m < i; m++) {
            writeDouble(paramByteArrayOutputStream, paramObject[m]);
          }
        }
        if ((paramObject instanceof List))
        {
          paramByteArrayOutputStream.write(12);
          paramObject = (List)paramObject;
          writeSize(paramByteArrayOutputStream, ((List)paramObject).size());
          paramObject = ((List)paramObject).iterator();
          while (((Iterator)paramObject).hasNext()) {
            writeValue(paramByteArrayOutputStream, ((Iterator)paramObject).next());
          }
        }
        if ((paramObject instanceof Map))
        {
          paramByteArrayOutputStream.write(13);
          paramObject = (Map)paramObject;
          writeSize(paramByteArrayOutputStream, ((Map)paramObject).size());
          Iterator localIterator = ((Map)paramObject).entrySet().iterator();
          while (localIterator.hasNext())
          {
            paramObject = (Map.Entry)localIterator.next();
            writeValue(paramByteArrayOutputStream, ((Map.Entry)paramObject).getKey());
            writeValue(paramByteArrayOutputStream, ((Map.Entry)paramObject).getValue());
          }
        }
        if ((paramObject instanceof float[]))
        {
          paramByteArrayOutputStream.write(14);
          paramObject = (float[])paramObject;
          writeSize(paramByteArrayOutputStream, paramObject.length);
          writeAlignment(paramByteArrayOutputStream, 4);
          i = paramObject.length;
          for (m = k; m < i; m++) {
            writeFloat(paramByteArrayOutputStream, paramObject[m]);
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
  
  public static final class ExposedByteArrayOutputStream
    extends ByteArrayOutputStream
  {
    public byte[] buffer()
    {
      return buf;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.StandardMessageCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */