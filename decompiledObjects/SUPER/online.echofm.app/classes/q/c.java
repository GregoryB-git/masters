package q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import w.d;

public final class c
{
  public final Intent a;
  public final Bundle b;
  
  public c(Intent paramIntent, Bundle paramBundle)
  {
    a = paramIntent;
    b = paramBundle;
  }
  
  public void a(Context paramContext, Uri paramUri)
  {
    a.setData(paramUri);
    x.a.j(paramContext, a, b);
  }
  
  public static abstract class a
  {
    public static String a()
    {
      Object localObject = LocaleList.getAdjustedDefault();
      if (((LocaleList)localObject).size() > 0) {
        localObject = ((LocaleList)localObject).get(0).toLanguageTag();
      } else {
        localObject = null;
      }
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    public final Intent a = new Intent("android.intent.action.VIEW");
    public final a.a b = new a.a();
    public ArrayList c;
    public Bundle d;
    public ArrayList e;
    public SparseArray f;
    public Bundle g;
    public int h = 0;
    public boolean i = true;
    
    public b() {}
    
    public b(e parame) {}
    
    public c a()
    {
      if (!a.hasExtra("android.support.customtabs.extra.SESSION")) {
        c(null, null);
      }
      Object localObject = c;
      if (localObject != null) {
        a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", (ArrayList)localObject);
      }
      localObject = e;
      if (localObject != null) {
        a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", (ArrayList)localObject);
      }
      a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", i);
      a.putExtras(b.a().a());
      localObject = g;
      if (localObject != null) {
        a.putExtras((Bundle)localObject);
      }
      if (f != null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", f);
        a.putExtras((Bundle)localObject);
      }
      a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", h);
      if (Build.VERSION.SDK_INT >= 24) {
        b();
      }
      return new c(a, d);
    }
    
    public final void b()
    {
      String str = c.a.a();
      if (!TextUtils.isEmpty(str))
      {
        Bundle localBundle;
        if (a.hasExtra("com.android.browser.headers")) {
          localBundle = a.getBundleExtra("com.android.browser.headers");
        } else {
          localBundle = new Bundle();
        }
        if (!localBundle.containsKey("Accept-Language"))
        {
          localBundle.putString("Accept-Language", str);
          a.putExtra("com.android.browser.headers", localBundle);
        }
      }
    }
    
    public final void c(IBinder paramIBinder, PendingIntent paramPendingIntent)
    {
      Bundle localBundle = new Bundle();
      d.b(localBundle, "android.support.customtabs.extra.SESSION", paramIBinder);
      if (paramPendingIntent != null) {
        localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", paramPendingIntent);
      }
      a.putExtras(localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     q.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */