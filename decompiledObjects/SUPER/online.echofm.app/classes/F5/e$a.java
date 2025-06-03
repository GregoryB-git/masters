package F5;

import D5.l.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

public class e$a
  implements l.b
{
  public e$a(e parame) {}
  
  public String a(String paramString1, String paramString2)
  {
    Object localObject = e.a(a);
    if (paramString2 != null)
    {
      localObject = e.b(paramString2);
      paramString2 = new Configuration(e.a(a).getResources().getConfiguration());
      paramString2.setLocale((Locale)localObject);
      localObject = e.a(a).createConfigurationContext(paramString2);
    }
    paramString2 = e.a(a).getPackageName();
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
 * Qualified Name:     F5.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */