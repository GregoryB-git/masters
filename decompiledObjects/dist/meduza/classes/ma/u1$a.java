package ma;

public final class u1$a
{
  public static void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
  {
    if ((!d(paramByte2)) && (paramByte2 + 112 + (paramByte1 << 28) >> 30 == 0) && (!d(paramByte3)) && (!d(paramByte4)))
    {
      paramByte1 = (paramByte1 & 0x7) << 18 | (paramByte2 & 0x3F) << 12 | (paramByte3 & 0x3F) << 6 | paramByte4 & 0x3F;
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 >>> 10) + 55232));
      paramArrayOfChar[(paramInt + 1)] = ((char)(char)((paramByte1 & 0x3FF) + 56320));
      return;
    }
    throw b0.c();
  }
  
  public static void b(byte paramByte1, byte paramByte2, char[] paramArrayOfChar, int paramInt)
  {
    if ((paramByte1 >= -62) && (!d(paramByte2)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0x1F) << 6 | paramByte2 & 0x3F));
      return;
    }
    throw b0.c();
  }
  
  public static void c(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
  {
    if ((!d(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!d(paramByte3)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | (paramByte2 & 0x3F) << 6 | paramByte3 & 0x3F));
      return;
    }
    throw b0.c();
  }
  
  public static boolean d(byte paramByte)
  {
    boolean bool;
    if (paramByte > -65) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     ma.u1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */