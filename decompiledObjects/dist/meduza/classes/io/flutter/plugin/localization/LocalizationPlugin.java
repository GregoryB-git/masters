package io.flutter.plugin.localization;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import g;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Locale.LanguageRange;

public class LocalizationPlugin
{
  private final Context context;
  private final LocalizationChannel localizationChannel;
  public final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;
  
  public LocalizationPlugin(Context paramContext, LocalizationChannel paramLocalizationChannel)
  {
    LocalizationChannel.LocalizationMessageHandler local1 = new LocalizationChannel.LocalizationMessageHandler()
    {
      public String getStringResource(String paramAnonymousString1, String paramAnonymousString2)
      {
        Object localObject = LocalizationPlugin.access$000(LocalizationPlugin.this);
        if (paramAnonymousString2 != null)
        {
          localObject = LocalizationPlugin.localeFromString(paramAnonymousString2);
          paramAnonymousString2 = new Configuration(LocalizationPlugin.access$000(LocalizationPlugin.this).getResources().getConfiguration());
          paramAnonymousString2.setLocale((Locale)localObject);
          localObject = LocalizationPlugin.access$000(LocalizationPlugin.this).createConfigurationContext(paramAnonymousString2);
        }
        paramAnonymousString2 = LocalizationPlugin.access$000(LocalizationPlugin.this).getPackageName();
        int i = ((Context)localObject).getResources().getIdentifier(paramAnonymousString1, "string", paramAnonymousString2);
        if (i != 0) {
          paramAnonymousString1 = ((Context)localObject).getResources().getString(i);
        } else {
          paramAnonymousString1 = null;
        }
        return paramAnonymousString1;
      }
    };
    localizationMessageHandler = local1;
    context = paramContext;
    localizationChannel = paramLocalizationChannel;
    paramLocalizationChannel.setLocalizationMessageHandler(local1);
  }
  
  public static Locale localeFromString(String paramString)
  {
    String[] arrayOfString = paramString.replace('_', '-').split("-", -1);
    String str1 = arrayOfString[0];
    int i = arrayOfString.length;
    String str2 = "";
    int j = 1;
    if ((i > 1) && (arrayOfString[1].length() == 4))
    {
      paramString = arrayOfString[1];
      j = 2;
    }
    else
    {
      paramString = "";
    }
    String str3 = str2;
    if (arrayOfString.length > j)
    {
      str3 = str2;
      if (arrayOfString[j].length() >= 2)
      {
        str3 = str2;
        if (arrayOfString[j].length() <= 3) {
          str3 = arrayOfString[j];
        }
      }
    }
    return new Locale(str1, str3, paramString);
  }
  
  public Locale resolveNativeLocale(List<Locale> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if (i >= 26)
      {
        ArrayList localArrayList = new ArrayList();
        localObject1 = context.getResources().getConfiguration().getLocales();
        int j = ((LocaleList)localObject1).size();
        for (i = 0; i < j; i++)
        {
          localObject2 = ((LocaleList)localObject1).get(i);
          localObject3 = ((Locale)localObject2).getLanguage();
          localObject4 = localObject3;
          if (!((Locale)localObject2).getScript().isEmpty())
          {
            localObject4 = g.g((String)localObject3, "-");
            ((StringBuilder)localObject4).append(((Locale)localObject2).getScript());
            localObject4 = ((StringBuilder)localObject4).toString();
          }
          localObject3 = localObject4;
          if (!((Locale)localObject2).getCountry().isEmpty())
          {
            localObject4 = g.g((String)localObject4, "-");
            ((StringBuilder)localObject4).append(((Locale)localObject2).getCountry());
            localObject3 = ((StringBuilder)localObject4).toString();
          }
          localArrayList.add(new Locale.LanguageRange((String)localObject3));
          localArrayList.add(new Locale.LanguageRange(((Locale)localObject2).getLanguage()));
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append(((Locale)localObject2).getLanguage());
          ((StringBuilder)localObject4).append("-*");
          localArrayList.add(new Locale.LanguageRange(((StringBuilder)localObject4).toString()));
        }
        localObject4 = Locale.lookup(localArrayList, paramList);
        if (localObject4 != null) {
          return (Locale)localObject4;
        }
      }
      else
      {
        if (i >= 24)
        {
          localObject3 = context.getResources().getConfiguration().getLocales();
          for (i = 0; i < ((LocaleList)localObject3).size(); i++)
          {
            localObject4 = ((LocaleList)localObject3).get(i);
            localObject2 = paramList.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject1 = (Locale)((Iterator)localObject2).next();
              if (((Locale)localObject4).equals(localObject1)) {
                return (Locale)localObject1;
              }
            }
            localObject1 = paramList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (Locale)((Iterator)localObject1).next();
              if (((Locale)localObject4).getLanguage().equals(((Locale)localObject2).toLanguageTag())) {
                return (Locale)localObject2;
              }
            }
            localObject1 = paramList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (Locale)((Iterator)localObject1).next();
              if (((Locale)localObject4).getLanguage().equals(((Locale)localObject2).getLanguage())) {
                return (Locale)localObject2;
              }
            }
          }
        }
        localObject4 = context.getResources().getConfiguration().locale;
        if (localObject4 != null)
        {
          localObject1 = paramList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (Locale)((Iterator)localObject1).next();
            if (((Locale)localObject4).equals(localObject3)) {
              return (Locale)localObject3;
            }
          }
          localObject1 = paramList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (Locale)((Iterator)localObject1).next();
            if (((Locale)localObject4).getLanguage().equals(((Locale)localObject3).toString())) {
              return (Locale)localObject3;
            }
          }
        }
      }
      return (Locale)paramList.get(0);
    }
    return null;
  }
  
  public void sendLocalesToFlutter(Configuration paramConfiguration)
  {
    ArrayList localArrayList = new ArrayList();
    if (Build.VERSION.SDK_INT >= 24)
    {
      paramConfiguration = paramConfiguration.getLocales();
      int i = paramConfiguration.size();
      for (int j = 0; j < i; j++) {
        localArrayList.add(paramConfiguration.get(j));
      }
    }
    localArrayList.add(locale);
    localizationChannel.sendLocales(localArrayList);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.localization.LocalizationPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */