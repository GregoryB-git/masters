package androidx.emoji2.text.flatbuffer;

class Utf8$DecodeUtil
{
  public static void handleFourBytes(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
    throws IllegalArgumentException
  {
    if ((!isNotTrailingByte(paramByte2)) && (paramByte2 + 112 + (paramByte1 << 28) >> 30 == 0) && (!isNotTrailingByte(paramByte3)) && (!isNotTrailingByte(paramByte4)))
    {
      paramByte1 = (paramByte1 & 0x7) << 18 | trailingByteValue(paramByte2) << 12 | trailingByteValue(paramByte3) << 6 | trailingByteValue(paramByte4);
      paramArrayOfChar[paramInt] = highSurrogate(paramByte1);
      paramArrayOfChar[(paramInt + 1)] = lowSurrogate(paramByte1);
      return;
    }
    throw new IllegalArgumentException("Invalid UTF-8");
  }
  
  public static void handleOneByte(byte paramByte, char[] paramArrayOfChar, int paramInt)
  {
    paramArrayOfChar[paramInt] = ((char)(char)paramByte);
  }
  
  public static void handleThreeBytes(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
    throws IllegalArgumentException
  {
    if ((!isNotTrailingByte(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!isNotTrailingByte(paramByte3)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | trailingByteValue(paramByte2) << 6 | trailingByteValue(paramByte3)));
      return;
    }
    throw new IllegalArgumentException("Invalid UTF-8");
  }
  
  public static void handleTwoBytes(byte paramByte1, byte paramByte2, char[] paramArrayOfChar, int paramInt)
    throws IllegalArgumentException
  {
    if (paramByte1 >= -62)
    {
      if (!isNotTrailingByte(paramByte2))
      {
        paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0x1F) << 6 | trailingByteValue(paramByte2)));
        return;
      }
      throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
    }
    throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
  }
  
  private static char highSurrogate(int paramInt)
  {
    return (char)((paramInt >>> 10) + 55232);
  }
  
  private static boolean isNotTrailingByte(byte paramByte)
  {
    boolean bool;
    if (paramByte > -65) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isOneByte(byte paramByte)
  {
    boolean bool;
    if (paramByte >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isThreeBytes(byte paramByte)
  {
    boolean bool;
    if (paramByte < -16) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isTwoBytes(byte paramByte)
  {
    boolean bool;
    if (paramByte < -32) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static char lowSurrogate(int paramInt)
  {
    return (char)((paramInt & 0x3FF) + 56320);
  }
  
  private static int trailingByteValue(byte paramByte)
  {
    return paramByte & 0x3F;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */