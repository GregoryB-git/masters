package androidx.emoji2.text.flatbuffer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class FlexBuffersBuilder
{
  public static final int BUILDER_FLAG_NONE = 0;
  public static final int BUILDER_FLAG_SHARE_ALL = 7;
  public static final int BUILDER_FLAG_SHARE_KEYS = 1;
  public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
  public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
  public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
  private static final int WIDTH_16 = 1;
  private static final int WIDTH_32 = 2;
  private static final int WIDTH_64 = 3;
  private static final int WIDTH_8 = 0;
  private final ReadWriteBuf bb;
  private boolean finished = false;
  private final int flags;
  private Comparator<Value> keyComparator = new Comparator()
  {
    public int compare(FlexBuffersBuilder.Value paramAnonymousValue1, FlexBuffersBuilder.Value paramAnonymousValue2)
    {
      int i = key;
      int j = key;
      int k;
      int m;
      do
      {
        k = FlexBuffersBuilder.access$000(FlexBuffersBuilder.this).get(i);
        m = FlexBuffersBuilder.access$000(FlexBuffersBuilder.this).get(j);
        if (k == 0) {
          return k - m;
        }
        i++;
        j++;
      } while (k == m);
      return k - m;
    }
  };
  private final HashMap<String, Integer> keyPool = new HashMap();
  private final ArrayList<Value> stack = new ArrayList();
  private final HashMap<String, Integer> stringPool = new HashMap();
  
  public FlexBuffersBuilder()
  {
    this(256);
  }
  
  public FlexBuffersBuilder(int paramInt)
  {
    this(new ArrayReadWriteBuf(paramInt), 1);
  }
  
  public FlexBuffersBuilder(ReadWriteBuf paramReadWriteBuf, int paramInt)
  {
    bb = paramReadWriteBuf;
    flags = paramInt;
  }
  
  public FlexBuffersBuilder(ByteBuffer paramByteBuffer)
  {
    this(paramByteBuffer, 1);
  }
  
  @Deprecated
  public FlexBuffersBuilder(ByteBuffer paramByteBuffer, int paramInt)
  {
    this(new ArrayReadWriteBuf(paramByteBuffer.array()), paramInt);
  }
  
  private int align(int paramInt)
  {
    int i = 1 << paramInt;
    for (paramInt = Value.access$100(bb.writePosition(), i); paramInt != 0; paramInt--) {
      bb.put((byte)0);
    }
    return i;
  }
  
  private Value createKeyVector(int paramInt1, int paramInt2)
  {
    long l1 = paramInt2;
    paramInt2 = Math.max(0, widthUInBits(l1));
    int i = paramInt1;
    while (i < stack.size())
    {
      long l2 = stack.get(i)).key;
      j = bb.writePosition();
      i++;
      paramInt2 = Math.max(paramInt2, Value.access$500(4, 0, l2, j, i));
    }
    i = align(paramInt2);
    writeInt(l1, i);
    int j = bb.writePosition();
    while (paramInt1 < stack.size())
    {
      int k = stack.get(paramInt1)).key;
      writeOffset(stack.get(paramInt1)).key, i);
      paramInt1++;
    }
    return new Value(-1, FlexBuffers.toTypedVector(4, 0), paramInt2, j);
  }
  
  private Value createVector(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, Value paramValue)
  {
    int i = paramInt3;
    long l = i;
    paramInt3 = Math.max(0, widthUInBits(l));
    if (paramValue != null)
    {
      paramInt3 = Math.max(paramInt3, Value.access$200(paramValue, bb.writePosition(), 0));
      j = 3;
    }
    else
    {
      j = 1;
    }
    int k = 4;
    int m = paramInt2;
    while (m < stack.size())
    {
      n = Math.max(paramInt3, Value.access$200((Value)stack.get(m), bb.writePosition(), m + j));
      paramInt3 = k;
      if (paramBoolean1)
      {
        paramInt3 = k;
        if (m == paramInt2)
        {
          paramInt3 = stack.get(m)).type;
          if (!FlexBuffers.isTypedVectorElementType(paramInt3)) {
            throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
          }
        }
      }
      m++;
      k = paramInt3;
      paramInt3 = n;
    }
    int n = align(paramInt3);
    if (paramValue != null)
    {
      writeOffset(iValue, n);
      writeInt(1L << minBitWidth, n);
    }
    if (!paramBoolean2) {
      writeInt(l, n);
    }
    m = bb.writePosition();
    for (int j = paramInt2; j < stack.size(); j++) {
      writeAny((Value)stack.get(j), n);
    }
    if (!paramBoolean1) {
      while (paramInt2 < stack.size())
      {
        bb.put(Value.access$400((Value)stack.get(paramInt2), paramInt3));
        paramInt2++;
      }
    }
    if (paramValue != null) {
      paramInt2 = 9;
    }
    for (;;)
    {
      break;
      if (paramBoolean1)
      {
        if (!paramBoolean2) {
          i = 0;
        }
        paramInt2 = FlexBuffers.toTypedVector(k, i);
      }
      else
      {
        paramInt2 = 10;
      }
    }
    return new Value(paramInt1, paramInt2, paramInt3, m);
  }
  
  private int putKey(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    int i = bb.writePosition();
    Object localObject;
    if ((flags & 0x1) != 0)
    {
      localObject = (Integer)keyPool.get(paramString);
      if (localObject == null)
      {
        localObject = paramString.getBytes(StandardCharsets.UTF_8);
        bb.put((byte[])localObject, 0, localObject.length);
        bb.put((byte)0);
        keyPool.put(paramString, Integer.valueOf(i));
      }
      else
      {
        i = ((Integer)localObject).intValue();
      }
    }
    else
    {
      localObject = paramString.getBytes(StandardCharsets.UTF_8);
      bb.put((byte[])localObject, 0, localObject.length);
      bb.put((byte)0);
      keyPool.put(paramString, Integer.valueOf(i));
    }
    return i;
  }
  
  private void putUInt(String paramString, long paramLong)
  {
    int i = putKey(paramString);
    int j = widthUInBits(paramLong);
    if (j == 0) {
      paramString = Value.uInt8(i, (int)paramLong);
    } else if (j == 1) {
      paramString = Value.uInt16(i, (int)paramLong);
    } else if (j == 2) {
      paramString = Value.uInt32(i, (int)paramLong);
    } else {
      paramString = Value.uInt64(i, paramLong);
    }
    stack.add(paramString);
  }
  
  private void putUInt64(String paramString, long paramLong)
  {
    stack.add(Value.uInt64(putKey(paramString), paramLong));
  }
  
  public static int widthUInBits(long paramLong)
  {
    if (paramLong <= FlexBuffers.Unsigned.byteToUnsignedInt((byte)-1)) {
      return 0;
    }
    if (paramLong <= FlexBuffers.Unsigned.shortToUnsignedInt((short)-1)) {
      return 1;
    }
    if (paramLong <= FlexBuffers.Unsigned.intToUnsignedLong(-1)) {
      return 2;
    }
    return 3;
  }
  
  private void writeAny(Value paramValue, int paramInt)
  {
    int i = type;
    if ((i != 0) && (i != 1) && (i != 2)) {
      if (i != 3)
      {
        if (i != 26)
        {
          writeOffset(iValue, paramInt);
          return;
        }
      }
      else
      {
        writeDouble(dValue, paramInt);
        return;
      }
    }
    writeInt(iValue, paramInt);
  }
  
  private Value writeBlob(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
  {
    int i = widthUInBits(paramArrayOfByte.length);
    int j = align(i);
    writeInt(paramArrayOfByte.length, j);
    j = bb.writePosition();
    bb.put(paramArrayOfByte, 0, paramArrayOfByte.length);
    if (paramBoolean) {
      bb.put((byte)0);
    }
    return Value.blob(paramInt1, j, paramInt2, i);
  }
  
  private void writeDouble(double paramDouble, int paramInt)
  {
    if (paramInt == 4) {
      bb.putFloat((float)paramDouble);
    } else if (paramInt == 8) {
      bb.putDouble(paramDouble);
    }
  }
  
  private void writeInt(long paramLong, int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 4)
        {
          if (paramInt == 8) {
            bb.putLong(paramLong);
          }
        }
        else {
          bb.putInt((int)paramLong);
        }
      }
      else {
        bb.putShort((short)(int)paramLong);
      }
    }
    else {
      bb.put((byte)(int)paramLong);
    }
  }
  
  private void writeOffset(long paramLong, int paramInt)
  {
    writeInt((int)(bb.writePosition() - paramLong), paramInt);
  }
  
  private Value writeString(int paramInt, String paramString)
  {
    return writeBlob(paramInt, paramString.getBytes(StandardCharsets.UTF_8), 5, true);
  }
  
  public int endMap(String paramString, int paramInt)
  {
    int i = putKey(paramString);
    paramString = stack;
    Collections.sort(paramString.subList(paramInt, paramString.size()), keyComparator);
    paramString = createKeyVector(paramInt, stack.size() - paramInt);
    Value localValue = createVector(i, paramInt, stack.size() - paramInt, false, false, paramString);
    while (stack.size() > paramInt)
    {
      paramString = stack;
      paramString.remove(paramString.size() - 1);
    }
    stack.add(localValue);
    return (int)iValue;
  }
  
  public int endVector(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramString = createVector(putKey(paramString), paramInt, stack.size() - paramInt, paramBoolean1, paramBoolean2, null);
    while (stack.size() > paramInt)
    {
      ArrayList localArrayList = stack;
      localArrayList.remove(localArrayList.size() - 1);
    }
    stack.add(paramString);
    return (int)iValue;
  }
  
  public ByteBuffer finish()
  {
    int i = align(Value.access$200((Value)stack.get(0), bb.writePosition(), 0));
    writeAny((Value)stack.get(0), i);
    bb.put(Value.access$300((Value)stack.get(0)));
    bb.put((byte)i);
    finished = true;
    return ByteBuffer.wrap(bb.data(), 0, bb.writePosition());
  }
  
  public ReadWriteBuf getBuffer()
  {
    return bb;
  }
  
  public int putBlob(String paramString, byte[] paramArrayOfByte)
  {
    paramString = writeBlob(putKey(paramString), paramArrayOfByte, 25, false);
    stack.add(paramString);
    return (int)iValue;
  }
  
  public int putBlob(byte[] paramArrayOfByte)
  {
    return putBlob(null, paramArrayOfByte);
  }
  
  public void putBoolean(String paramString, boolean paramBoolean)
  {
    stack.add(Value.bool(putKey(paramString), paramBoolean));
  }
  
  public void putBoolean(boolean paramBoolean)
  {
    putBoolean(null, paramBoolean);
  }
  
  public void putFloat(double paramDouble)
  {
    putFloat(null, paramDouble);
  }
  
  public void putFloat(float paramFloat)
  {
    putFloat(null, paramFloat);
  }
  
  public void putFloat(String paramString, double paramDouble)
  {
    stack.add(Value.float64(putKey(paramString), paramDouble));
  }
  
  public void putFloat(String paramString, float paramFloat)
  {
    stack.add(Value.float32(putKey(paramString), paramFloat));
  }
  
  public void putInt(int paramInt)
  {
    putInt(null, paramInt);
  }
  
  public void putInt(long paramLong)
  {
    putInt(null, paramLong);
  }
  
  public void putInt(String paramString, int paramInt)
  {
    putInt(paramString, paramInt);
  }
  
  public void putInt(String paramString, long paramLong)
  {
    int i = putKey(paramString);
    if ((-128L <= paramLong) && (paramLong <= 127L)) {
      stack.add(Value.int8(i, (int)paramLong));
    } else if ((-32768L <= paramLong) && (paramLong <= 32767L)) {
      stack.add(Value.int16(i, (int)paramLong));
    } else if ((-2147483648L <= paramLong) && (paramLong <= 2147483647L)) {
      stack.add(Value.int32(i, (int)paramLong));
    } else {
      stack.add(Value.int64(i, paramLong));
    }
  }
  
  public int putString(String paramString)
  {
    return putString(null, paramString);
  }
  
  public int putString(String paramString1, String paramString2)
  {
    int i = putKey(paramString1);
    if ((flags & 0x2) != 0)
    {
      paramString1 = (Integer)stringPool.get(paramString2);
      if (paramString1 == null)
      {
        paramString1 = writeString(i, paramString2);
        stringPool.put(paramString2, Integer.valueOf((int)iValue));
        stack.add(paramString1);
        return (int)iValue;
      }
      int j = widthUInBits(paramString2.length());
      stack.add(Value.blob(i, paramString1.intValue(), 5, j));
      return paramString1.intValue();
    }
    paramString1 = writeString(i, paramString2);
    stack.add(paramString1);
    return (int)iValue;
  }
  
  public void putUInt(int paramInt)
  {
    putUInt(null, paramInt);
  }
  
  public void putUInt(long paramLong)
  {
    putUInt(null, paramLong);
  }
  
  public void putUInt64(BigInteger paramBigInteger)
  {
    putUInt64(null, paramBigInteger.longValue());
  }
  
  public int startMap()
  {
    return stack.size();
  }
  
  public int startVector()
  {
    return stack.size();
  }
  
  public static class Value
  {
    public final double dValue;
    public long iValue;
    public int key;
    public final int minBitWidth;
    public final int type;
    
    public Value(int paramInt1, int paramInt2, int paramInt3, double paramDouble)
    {
      key = paramInt1;
      type = paramInt2;
      minBitWidth = paramInt3;
      dValue = paramDouble;
      iValue = Long.MIN_VALUE;
    }
    
    public Value(int paramInt1, int paramInt2, int paramInt3, long paramLong)
    {
      key = paramInt1;
      type = paramInt2;
      minBitWidth = paramInt3;
      iValue = paramLong;
      dValue = Double.MIN_VALUE;
    }
    
    public static Value blob(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return new Value(paramInt1, paramInt3, paramInt4, paramInt2);
    }
    
    public static Value bool(int paramInt, boolean paramBoolean)
    {
      long l;
      if (paramBoolean) {
        l = 1L;
      } else {
        l = 0L;
      }
      return new Value(paramInt, 26, 0, l);
    }
    
    private int elemWidth(int paramInt1, int paramInt2)
    {
      return elemWidth(type, minBitWidth, iValue, paramInt1, paramInt2);
    }
    
    private static int elemWidth(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
    {
      if (FlexBuffers.isTypeInline(paramInt1)) {
        return paramInt2;
      }
      paramInt1 = 1;
      while (paramInt1 <= 32)
      {
        paramInt2 = FlexBuffersBuilder.widthUInBits((int)(paramInt4 * paramInt1 + (paddingBytes(paramInt3, paramInt1) + paramInt3) - paramLong));
        if (1L << paramInt2 == paramInt1) {
          return paramInt2;
        }
        paramInt1 *= 2;
      }
      return 3;
    }
    
    public static Value float32(int paramInt, float paramFloat)
    {
      return new Value(paramInt, 3, 2, paramFloat);
    }
    
    public static Value float64(int paramInt, double paramDouble)
    {
      return new Value(paramInt, 3, 3, paramDouble);
    }
    
    public static Value int16(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 1, 1, paramInt2);
    }
    
    public static Value int32(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 1, 2, paramInt2);
    }
    
    public static Value int64(int paramInt, long paramLong)
    {
      return new Value(paramInt, 1, 3, paramLong);
    }
    
    public static Value int8(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 1, 0, paramInt2);
    }
    
    private static byte packedType(int paramInt1, int paramInt2)
    {
      return (byte)(paramInt1 | paramInt2 << 2);
    }
    
    private static int paddingBytes(int paramInt1, int paramInt2)
    {
      return paramInt1 + 1 & paramInt2 - 1;
    }
    
    private byte storedPackedType()
    {
      return storedPackedType(0);
    }
    
    private byte storedPackedType(int paramInt)
    {
      return packedType(storedWidth(paramInt), type);
    }
    
    private int storedWidth(int paramInt)
    {
      if (FlexBuffers.isTypeInline(type)) {
        return Math.max(minBitWidth, paramInt);
      }
      return minBitWidth;
    }
    
    public static Value uInt16(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 2, 1, paramInt2);
    }
    
    public static Value uInt32(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 2, 2, paramInt2);
    }
    
    public static Value uInt64(int paramInt, long paramLong)
    {
      return new Value(paramInt, 2, 3, paramLong);
    }
    
    public static Value uInt8(int paramInt1, int paramInt2)
    {
      return new Value(paramInt1, 2, 0, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffersBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */