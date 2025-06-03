package s0;

public final class m1$a
{
  public static void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
  {
    if ((!c(paramByte2)) && (paramByte2 + 112 + (paramByte1 << 28) >> 30 == 0) && (!c(paramByte3)) && (!c(paramByte4)))
    {
      paramByte1 = (paramByte1 & 0x7) << 18 | (paramByte2 & 0x3F) << 12 | (paramByte3 & 0x3F) << 6 | paramByte4 & 0x3F;
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 >>> 10) + 55232));
      paramArrayOfChar[(paramInt + 1)] = ((char)(char)((paramByte1 & 0x3FF) + 56320));
      return;
    }
    throw y.a();
  }
  
  public static void b(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
  {
    if ((!c(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!c(paramByte3)))
    {
      paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | (paramByte2 & 0x3F) << 6 | paramByte3 & 0x3F));
      return;
    }
    throw y.a();
  }
  
  public static boolean c(byte paramByte)
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
 * Qualified Name:     s0.m1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */