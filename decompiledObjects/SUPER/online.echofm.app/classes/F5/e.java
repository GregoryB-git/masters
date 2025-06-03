package F5;

import D5.l.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import g0.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class e
{
  public final D5.l a;
  public final Context b;
  public final l.b c;
  
  public e(Context paramContext, D5.l paraml)
  {
    a locala = new a();
    c = locala;
    b = paramContext;
    a = paraml;
    paraml.c(locala);
  }
  
  public static Locale b(String paramString)
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
  
  public Locale c(List paramList)
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
        localObject1 = new ArrayList();
        localObject2 = J.a(b.getResources().getConfiguration());
        int j = a.a((LocaleList)localObject2);
        for (i = 0; i < j; i++)
        {
          Locale localLocale = E.l.a((LocaleList)localObject2, i);
          localObject3 = localLocale.getLanguage();
          localObject4 = localObject3;
          if (!localLocale.getScript().isEmpty())
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append((String)localObject3);
            ((StringBuilder)localObject4).append("-");
            ((StringBuilder)localObject4).append(localLocale.getScript());
            localObject4 = ((StringBuilder)localObject4).toString();
          }
          localObject3 = localObject4;
          if (!localLocale.getCountry().isEmpty())
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append((String)localObject4);
            ((StringBuilder)localObject3).append("-");
            ((StringBuilder)localObject3).append(localLocale.getCountry());
            localObject3 = ((StringBuilder)localObject3).toString();
          }
          ((List)localObject1).add(c.a((String)localObject3));
          d.a();
          ((List)localObject1).add(c.a(localLocale.getLanguage()));
          d.a();
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append(localLocale.getLanguage());
          ((StringBuilder)localObject4).append("-*");
          ((List)localObject1).add(c.a(((StringBuilder)localObject4).toString()));
        }
        localObject4 = b.a((List)localObject1, paramList);
        if (localObject4 == null) {}
      }
      do
      {
        return (Locale)localObject4;
        while (!((Iterator)localObject1).hasNext())
        {
          do
          {
            for (;;)
            {
              return (Locale)paramList.get(0);
              if (i < 24) {
                break;
              }
              localObject3 = J.a(b.getResources().getConfiguration());
              for (i = 0; i < a.a((LocaleList)localObject3); i++)
              {
                localObject4 = E.l.a((LocaleList)localObject3, i);
                localObject2 = paramList.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject1 = (Locale)((Iterator)localObject2).next();
                  if (((Locale)localObject4).equals(localObject1)) {
                    return (Locale)localObject1;
                  }
                }
                localObject2 = paramList.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject1 = (Locale)((Iterator)localObject2).next();
                  if (((Locale)localObject4).getLanguage().equals(((Locale)localObject1).toLanguageTag())) {
                    return (Locale)localObject1;
                  }
                }
                localObject2 = paramList.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject1 = (Locale)((Iterator)localObject2).next();
                  if (((Locale)localObject4).getLanguage().equals(((Locale)localObject1).getLanguage())) {
                    return (Locale)localObject1;
                  }
                }
              }
            }
            localObject4 = b.getResources().getConfiguration().locale;
          } while (localObject4 == null);
          localObject3 = paramList.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject1 = (Locale)((Iterator)localObject3).next();
            if (((Locale)localObject4).equals(localObject1)) {
              return (Locale)localObject1;
            }
          }
          localObject1 = paramList.iterator();
        }
        localObject3 = (Locale)((Iterator)localObject1).next();
      } while (!((Locale)localObject4).getLanguage().equals(((Locale)localObject3).toString()));
      return (Locale)localObject3;
    }
    return null;
  }
  
  public void d(Configuration paramConfiguration)
  {
    ArrayList localArrayList = new ArrayList();
    if (Build.VERSION.SDK_INT >= 24)
    {
      paramConfiguration = J.a(paramConfiguration);
      int i = a.a(paramConfiguration);
      for (int j = 0; j < i; j++) {
        localArrayList.add(E.l.a(paramConfiguration, j));
      }
    }
    localArrayList.add(locale);
    a.b(localArrayList);
  }
  
  public class a
    implements l.b
  {
    public a() {}
    
    public String a(String paramString1, String paramString2)
    {
      Object localObject = e.a(e.this);
      if (paramString2 != null)
      {
        localObject = e.b(paramString2);
        paramString2 = new Configuration(e.a(e.this).getResources().getConfiguration());
        paramString2.setLocale((Locale)localObject);
        localObject = e.a(e.this).createConfigurationContext(paramString2);
      }
      paramString2 = e.a(e.this).getPackageName();
      int i = ((Context)localObject).getResources().getIdentifier(paramString1, "string", paramString2);
      if (i != 0) {
        paramString1 = ((Context)localObject).getResources().getString(i);
      } else {
        paramString1 = null;
      }
      return paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     F5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */