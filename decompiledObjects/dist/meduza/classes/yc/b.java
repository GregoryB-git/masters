package yc;

public final class b
{
  public static final char[] a;
  public static final float[][] b;
  public static final float[][] c;
  public static final float[] d;
  public static final float[][] e;
  
  public static final int a(char paramChar)
  {
    char c1 = '\001';
    char c2;
    if (('0' <= paramChar) && (paramChar < ':')) {
      c2 = '\001';
    } else {
      c2 = '\000';
    }
    if (c2 != 0)
    {
      c2 = paramChar - '0';
    }
    else
    {
      char c3 = 'a';
      if (('a' <= paramChar) && (paramChar < 'g')) {
        c2 = '\001';
      } else {
        c2 = '\000';
      }
      if (c2 != 0)
      {
        c2 = c3;
      }
      else
      {
        c3 = 'A';
        if (('A' <= paramChar) && (paramChar < 'G')) {
          c2 = c1;
        } else {
          c2 = '\000';
        }
        if (c2 == 0) {
          break label101;
        }
        c2 = c3;
      }
      c2 = paramChar - c2 + 10;
    }
    return c2;
    label101:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected hex digit: ");
    localStringBuilder.append(paramChar);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static float b(int paramInt)
  {
    float f = paramInt / 255.0F;
    if (f <= 0.04045F) {}
    for (f /= 12.92F;; f = (float)Math.pow((f + 0.055F) / 1.055F, 2.4000000953674316D)) {
      return f * 100.0F;
    }
  }
  
  public static float c()
  {
    return (float)Math.pow((50.0F + 16.0D) / 116.0D, 3.0D) * 100.0F;
  }
}

/* Location:
 * Qualified Name:     yc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */