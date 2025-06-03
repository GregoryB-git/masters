package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import androidx.annotation.AnyThread;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

public final class LocaleManagerCompat
{
  @VisibleForTesting
  public static LocaleListCompat getConfigurationLocales(Configuration paramConfiguration)
  {
    return Api24Impl.getLocales(paramConfiguration);
  }
  
  @RequiresApi(33)
  private static Object getLocaleManagerForApplication(Context paramContext)
  {
    return paramContext.getSystemService("locale");
  }
  
  @AnyThread
  @NonNull
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static LocaleListCompat getSystemLocales(@NonNull Context paramContext)
  {
    LocaleListCompat localLocaleListCompat = LocaleListCompat.getEmptyLocaleList();
    if (BuildCompat.isAtLeastT())
    {
      Object localObject = getLocaleManagerForApplication(paramContext);
      paramContext = localLocaleListCompat;
      if (localObject != null) {
        paramContext = LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localObject));
      }
    }
    else
    {
      paramContext = getConfigurationLocales(paramContext.getApplicationContext().getResources().getConfiguration());
    }
    return paramContext;
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static String toLanguageTag(Locale paramLocale)
    {
      return paramLocale.toLanguageTag();
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static LocaleListCompat getLocales(Configuration paramConfiguration)
    {
      return LocaleListCompat.forLanguageTags(paramConfiguration.getLocales().toLanguageTags());
    }
  }
  
  @RequiresApi(33)
  public static class Api33Impl
  {
    @DoNotInline
    public static LocaleList localeManagerGetSystemLocales(Object paramObject)
    {
      return ((LocaleManager)paramObject).getSystemLocales();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.LocaleManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */