package com.google.crypto.tink.shaded.protobuf;

public abstract class p0$a
{
  public static void h(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
  {
    if ((!m(paramByte2)) && ((paramByte1 << 28) + (paramByte2 + 112) >> 30 == 0) && (!m(paramByte3)) && (!m(paramByte4)))
    {
      paramByte1 = (paramByte1 & 0x7) << 18 | r(paramByte2) << 12 | r(paramByte3) << 6 | r(paramByte4);
      paramArrayOfChar[paramInt] = l(paramByte1);
      paramArrayOfChar[(paramInt + 1)] = q(paramByte1);
      return;
    }
    throw A.d();
  }
  
  public static void i(byte paramByte, char[] paramArrayOfChar, int paramInt)
  {
    paramArrayOfChar[paramInt] = ((char)(char)paramByte);
  }
  
  public static void j(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
  {
    if ((!m(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!m(paramByte3)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | r(paramByte2) << 6 | r(paramByte3)));
      return;
    }
    throw A.d();
  }
  
  public static void k(byte paramByte1, byte paramByte2, char[] paramArrayOfChar, int paramInt)
  {
    if ((paramByte1 >= -62) && (!m(paramByte2)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0x1F) << 6 | r(paramByte2)));
      return;
    }
    throw A.d();
  }
  
  public static char l(int paramInt)
  {
    return (char)((paramInt >>> 10) + 55232);
  }
  
  public static boolean m(byte paramByte)
  {
    boolean bool;
    if (paramByte > -65) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean n(byte paramByte)
  {
    boolean bool;
    if (paramByte >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean o(byte paramByte)
  {
    boolean bool;
    if (paramByte < -16) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean p(byte paramByte)
  {
    boolean bool;
    if (paramByte < -32) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static char q(int paramInt)
  {
    return (char)((paramInt & 0x3FF) + 56320);
  }
  
  public static int r(byte paramByte)
  {
    return paramByte & 0x3F;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.p0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */