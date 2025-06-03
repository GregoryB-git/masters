package A2;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;

public final class e0
{
  public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
  public final String a;
  public final String b;
  public final ComponentName c;
  public final int d;
  public final boolean e;
  
  public e0(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    n.e(paramString1);
    a = paramString1;
    n.e(paramString2);
    b = paramString2;
    c = null;
    d = paramInt;
    e = paramBoolean;
  }
  
  public final int a()
  {
    return d;
  }
  
  public final ComponentName b()
  {
    return c;
  }
  
  public final Intent c(Context paramContext)
  {
    Object localObject1;
    if (a != null)
    {
      boolean bool = e;
      localObject1 = null;
      Object localObject2 = null;
      if (bool)
      {
        localObject1 = new Bundle();
        ((BaseBundle)localObject1).putString("serviceActionBundleKey", a);
        try
        {
          paramContext = paramContext.getContentResolver().call(f, "serviceIntentCall", null, (Bundle)localObject1);
        }
        catch (IllegalArgumentException paramContext)
        {
          Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(paramContext.toString()));
          paramContext = null;
        }
        if (paramContext == null) {
          paramContext = (Context)localObject2;
        } else {
          paramContext = (Intent)paramContext.getParcelable("serviceResponseIntentKey");
        }
        localObject1 = paramContext;
        if (paramContext == null)
        {
          Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(a)));
          localObject1 = paramContext;
        }
      }
      if (localObject1 == null) {
        return new Intent(a).setPackage(b);
      }
    }
    else
    {
      localObject1 = new Intent().setComponent(c);
    }
    return (Intent)localObject1;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e0)) {
      return false;
    }
    paramObject = (e0)paramObject;
    return (m.a(a, a)) && (m.a(b, b)) && (m.a(c, c)) && (d == d) && (e == e);
  }
  
  public final int hashCode()
  {
    return m.b(new Object[] { a, b, c, Integer.valueOf(d), Boolean.valueOf(e) });
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = str1;
    if (str1 == null)
    {
      n.i(c);
      str2 = c.flattenToString();
    }
    return str2;
  }
}

/* Location:
 * Qualified Name:     A2.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */