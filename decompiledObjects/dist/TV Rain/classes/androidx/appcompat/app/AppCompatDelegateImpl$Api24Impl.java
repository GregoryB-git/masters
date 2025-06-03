package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class AppCompatDelegateImpl$Api24Impl
{
  public static void generateConfigDelta_locale(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
  {
    LocaleList localLocaleList = paramConfiguration1.getLocales();
    paramConfiguration1 = paramConfiguration2.getLocales();
    if (!localLocaleList.equals(paramConfiguration1))
    {
      paramConfiguration3.setLocales(paramConfiguration1);
      locale = locale;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */