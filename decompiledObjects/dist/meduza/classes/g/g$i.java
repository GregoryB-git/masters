package g;

import android.content.res.Configuration;

public final class g$i
{
  public static void a(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    int i = colorMode;
    int j = colorMode & 0x3;
    if ((i & 0x3) != j) {
      colorMode |= j;
    }
    j = colorMode;
    i = colorMode & 0xC;
    if ((j & 0xC) != i) {
      colorMode |= i;
    }
  }
}

/* Location:
 * Qualified Name:     g.g.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */