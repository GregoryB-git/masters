package io.flutter.plugin.localization;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler;
import java.util.Locale;

class LocalizationPlugin$1
  implements LocalizationChannel.LocalizationMessageHandler
{
  public LocalizationPlugin$1(LocalizationPlugin paramLocalizationPlugin) {}
  
  public String getStringResource(String paramString1, String paramString2)
  {
    Object localObject = LocalizationPlugin.access$000(this$0);
    if (paramString2 != null)
    {
      localObject = LocalizationPlugin.localeFromString(paramString2);
      paramString2 = new Configuration(LocalizationPlugin.access$000(this$0).getResources().getConfiguration());
      paramString2.setLocale((Locale)localObject);
      localObject = LocalizationPlugin.access$000(this$0).createConfigurationContext(paramString2);
    }
    paramString2 = LocalizationPlugin.access$000(this$0).getPackageName();
    int i = ((Context)localObject).getResources().getIdentifier(paramString1, "string", paramString2);
    if (i != 0) {
      paramString1 = ((Context)localObject).getResources().getString(i);
    } else {
      paramString1 = null;
    }
    return paramString1;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.localization.LocalizationPlugin.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */