package x3;

public final class b
{
  public static final int[] a = { 1, 2, 3, 6 };
  public static final int[] b = { 48000, 44100, 32000 };
  public static final int[] c = { 24000, 22050, 16000 };
  public static final int[] d = { 2, 1, 2, 3, 3, 4, 4, 5 };
  public static final int[] e = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  public static final int[] f = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt2 / 2;
    if (paramInt1 >= 0)
    {
      int[] arrayOfInt1 = b;
      if ((paramInt1 < 3) && (paramInt2 >= 0))
      {
        int[] arrayOfInt2 = f;
        if (i < 19)
        {
          paramInt1 = arrayOfInt1[paramInt1];
          if (paramInt1 == 44100) {
            return (paramInt2 % 2 + arrayOfInt2[i]) * 2;
          }
          paramInt2 = e[i];
          if (paramInt1 == 32000) {
            return paramInt2 * 6;
          }
          return paramInt2 * 4;
        }
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     x3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */