package androidx.core.telephony.mbms;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class MbmsHelper
{
  @Nullable
  public static CharSequence getBestNameForService(@NonNull Context paramContext, @NonNull ServiceInfo paramServiceInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getBestNameForService(paramContext, paramServiceInfo);
    }
    return null;
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    public static CharSequence getBestNameForService(Context paramContext, ServiceInfo paramServiceInfo)
    {
      Object localObject1 = paramServiceInfo.getNamedContentLocales();
      boolean bool = ((Set)localObject1).isEmpty();
      Object localObject2 = null;
      if (bool) {
        return null;
      }
      String[] arrayOfString = new String[((Set)localObject1).size()];
      int i = 0;
      localObject1 = paramServiceInfo.getNamedContentLocales().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        arrayOfString[i] = ((Locale)((Iterator)localObject1).next()).toLanguageTag();
        i++;
      }
      paramContext = paramContext.getResources().getConfiguration().getLocales().getFirstMatch(arrayOfString);
      if (paramContext == null) {
        paramContext = (Context)localObject2;
      } else {
        paramContext = paramServiceInfo.getNameForLocale(paramContext);
      }
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.telephony.mbms.MbmsHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */