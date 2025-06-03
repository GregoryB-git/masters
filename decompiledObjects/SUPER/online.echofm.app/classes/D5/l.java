package D5;

import E5.g;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;
import w5.a;

public class l
{
  public final k a;
  public b b;
  public final k.c c;
  
  public l(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/localization", g.a);
    a = parama;
    parama.e(locala);
  }
  
  public void b(List paramList)
  {
    b.f("LocalizationChannel", "Sending Locales to Flutter.");
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Locale localLocale = (Locale)paramList.next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Locale (Language: ");
      localStringBuilder.append(localLocale.getLanguage());
      localStringBuilder.append(", Country: ");
      localStringBuilder.append(localLocale.getCountry());
      localStringBuilder.append(", Variant: ");
      localStringBuilder.append(localLocale.getVariant());
      localStringBuilder.append(")");
      b.f("LocalizationChannel", localStringBuilder.toString());
      localArrayList.add(localLocale.getLanguage());
      localArrayList.add(localLocale.getCountry());
      localArrayList.add(localLocale.getScript());
      localArrayList.add(localLocale.getVariant());
    }
    a.c("setLocale", localArrayList);
  }
  
  public void c(b paramb)
  {
    b = paramb;
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (l.a(l.this) == null) {
        return;
      }
      String str = a;
      str.hashCode();
      if (!str.equals("Localization.getStringResource"))
      {
        paramd.c();
      }
      else
      {
        paramj = (JSONObject)paramj.b();
        try
        {
          str = paramj.getString("key");
          if (paramj.has("locale")) {
            paramj = paramj.getString("locale");
          }
        }
        catch (JSONException paramj)
        {
          break label102;
        }
        paramj = null;
        paramd.a(l.a(l.this).a(str, paramj));
        return;
        label102:
        paramd.b("error", paramj.getMessage(), null);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract String a(String paramString1, String paramString2);
  }
}

/* Location:
 * Qualified Name:     D5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */