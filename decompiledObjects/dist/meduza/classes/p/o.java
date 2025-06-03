package p;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public final class o
{
  public final Intent a;
  public final Bundle b;
  
  public o(Intent paramIntent, Bundle paramBundle)
  {
    a = paramIntent;
    b = paramBundle;
  }
  
  public static final class a
  {
    public static ActivityOptions a()
    {
      return ActivityOptions.makeBasic();
    }
  }
  
  public static final class b
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
  
  public static final class c
  {
    public static void a(ActivityOptions paramActivityOptions, boolean paramBoolean)
    {
      paramActivityOptions.setShareIdentityEnabled(paramBoolean);
    }
  }
  
  public static final class d
  {
    public final Intent a;
    public final a.a b;
    public ArrayList<Bundle> c;
    public ActivityOptions d;
    public Bundle e;
    public int f;
    public boolean g;
    
    public d()
    {
      a = new Intent("android.intent.action.VIEW");
      b = new a.a();
      f = 0;
      g = true;
    }
    
    public d(u paramu)
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      a = localIntent;
      b = new a.a();
      f = 0;
      g = true;
      if (paramu != null)
      {
        localIntent.setPackage(d.getPackageName());
        IBinder localIBinder = c.asBinder();
        paramu = e;
        Bundle localBundle = new Bundle();
        localBundle.putBinder("android.support.customtabs.extra.SESSION", localIBinder);
        if (paramu != null) {
          localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", paramu);
        }
        localIntent.putExtras(localBundle);
      }
    }
    
    public final o a()
    {
      boolean bool = a.hasExtra("android.support.customtabs.extra.SESSION");
      Object localObject1 = null;
      if (!bool)
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putBinder("android.support.customtabs.extra.SESSION", null);
        a.putExtras((Bundle)localObject2);
      }
      Object localObject2 = c;
      if (localObject2 != null) {
        a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", (ArrayList)localObject2);
      }
      a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", g);
      localObject2 = a;
      b.getClass();
      ((Intent)localObject2).putExtras(new Bundle());
      localObject2 = e;
      if (localObject2 != null) {
        a.putExtras((Bundle)localObject2);
      }
      a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", f);
      int i = Build.VERSION.SDK_INT;
      if (i >= 24)
      {
        localObject3 = o.b.a();
        if (!TextUtils.isEmpty((CharSequence)localObject3))
        {
          if (a.hasExtra("com.android.browser.headers")) {
            localObject2 = a.getBundleExtra("com.android.browser.headers");
          } else {
            localObject2 = new Bundle();
          }
          if (!((BaseBundle)localObject2).containsKey("Accept-Language"))
          {
            ((BaseBundle)localObject2).putString("Accept-Language", (String)localObject3);
            a.putExtra("com.android.browser.headers", (Bundle)localObject2);
          }
        }
      }
      if (i >= 34)
      {
        if (d == null) {
          d = o.a.a();
        }
        o.c.a(d, false);
      }
      Object localObject3 = d;
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = ((ActivityOptions)localObject3).toBundle();
      }
      return new o(a, (Bundle)localObject2);
    }
    
    public final void b(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= 2))
      {
        f = paramInt;
        if (paramInt == 1) {
          a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (paramInt == 2) {
          a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
          a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
        return;
      }
      throw new IllegalArgumentException("Invalid value for the shareState argument");
    }
  }
}

/* Location:
 * Qualified Name:     p.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */