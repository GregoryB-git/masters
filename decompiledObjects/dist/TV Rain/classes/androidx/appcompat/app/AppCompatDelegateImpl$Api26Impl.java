package androidx.appcompat.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class AppCompatDelegateImpl$Api26Impl
{
  public static void generateConfigDelta_colorMode(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
  {
    int i = colorMode;
    int j = colorMode;
    if ((i & 0x3) != (j & 0x3)) {
      colorMode |= j & 0x3;
    }
    i = colorMode;
    j = colorMode;
    if ((i & 0xC) != (j & 0xC)) {
      colorMode |= j & 0xC;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */