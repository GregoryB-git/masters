package androidx.emoji2.text.flatbuffer;

class FlexBuffersBuilder$Value
{
  public final double dValue;
  public long iValue;
  public int key;
  public final int minBitWidth;
  public final int type;
  
  public FlexBuffersBuilder$Value(int paramInt1, int paramInt2, int paramInt3, double paramDouble)
  {
    key = paramInt1;
    type = paramInt2;
    minBitWidth = paramInt3;
    dValue = paramDouble;
    iValue = Long.MIN_VALUE;
  }
  
  public FlexBuffersBuilder$Value(int paramInt1, int paramInt2, int paramInt3, long paramLong)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */