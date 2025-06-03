package androidx.emoji2.text.flatbuffer;

class FlexBuffers$Unsigned
{
  public static int byteToUnsignedInt(byte paramByte)
  {
    return paramByte & 0xFF;
  }
  
  public static long intToUnsignedLong(int paramInt)
  {
    return paramInt & 0xFFFFFFFF;
  }
  
  public static int shortToUnsignedInt(short paramShort)
  {
    return paramShort & 0xFFFF;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */