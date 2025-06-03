package S5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import q.b;
import q.c;
import q.c.b;

public final class i
  implements a.b
{
  public final Context a;
  public final a b;
  public Activity c;
  
  public i(Context paramContext)
  {
    this(paramContext, new h(paramContext));
  }
  
  public i(Context paramContext, a parama)
  {
    a = paramContext;
    b = parama;
  }
  
  public static boolean g(Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    boolean bool = localIterator.hasNext();
    int i = 0;
    if (bool)
    {
      paramMap = ((String)localIterator.next()).toLowerCase(Locale.US);
      paramMap.hashCode();
      switch (paramMap.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              i = -1;
              break;
            } while (!paramMap.equals("accept-language"));
            i = 3;
            break;
          } while (!paramMap.equals("content-type"));
          i = 2;
          break;
        } while (!paramMap.equals("content-language"));
        i = 1;
        break;
      } while (!paramMap.equals("accept"));
      switch (i)
      {
      }
      return true;
    }
    return false;
  }
  
  public static Bundle i(Map paramMap)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    return localBundle;
  }
  
  public static boolean k(Context paramContext, Uri paramUri, Bundle paramBundle)
  {
    c localc = new c.b().a();
    a.putExtra("com.android.browser.headers", paramBundle);
    try
    {
      localc.a(paramContext, paramUri);
      return true;
    }
    catch (ActivityNotFoundException paramContext) {}
    return false;
  }
  
  public Boolean a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    paramString = b.a(localIntent);
    if (paramString == null) {
      return Boolean.FALSE;
    }
    return Boolean.valueOf("{com.android.fallback/com.android.fallback.Fallback}".equals(paramString) ^ true);
  }
  
  public Boolean b(String paramString, Boolean paramBoolean, a.d paramd)
  {
    h();
    Bundle localBundle = i(paramd.d());
    if ((paramBoolean.booleanValue()) && (!g(paramd.d())))
    {
      paramBoolean = Uri.parse(paramString);
      if (k(c, paramBoolean, localBundle)) {
        return Boolean.TRUE;
      }
    }
    paramString = WebViewActivity.a(c, paramString, paramd.c().booleanValue(), paramd.b().booleanValue(), localBundle);
    try
    {
      c.startActivity(paramString);
      return Boolean.TRUE;
    }
    catch (ActivityNotFoundException paramString) {}
    return Boolean.FALSE;
  }
  
  public void c()
  {
    a.sendBroadcast(new Intent("close action"));
  }
  
  public Boolean d(String paramString, Map paramMap)
  {
    h();
    paramString = new Intent("android.intent.action.VIEW").setData(Uri.parse(paramString)).putExtra("com.android.browser.headers", i(paramMap));
    try
    {
      c.startActivity(paramString);
      return Boolean.TRUE;
    }
    catch (ActivityNotFoundException paramString) {}
    return Boolean.FALSE;
  }
  
  public Boolean e()
  {
    boolean bool;
    if (b.a(a, Collections.emptyList()) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public final void h()
  {
    if (c != null) {
      return;
    }
    throw new a.a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
  }
  
  public void l(Activity paramActivity)
  {
    c = paramActivity;
  }
  
  public static abstract interface a
  {
    public abstract String a(Intent paramIntent);
  }
}

/* Location:
 * Qualified Name:     S5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */