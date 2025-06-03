package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.C;

public final class Q
{
  public static final Q a = new Q();
  public static final String b = Q.class.getName();
  
  public static final void a(Collection paramCollection, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "container");
    Intrinsics.checkNotNullParameter(paramString, "name");
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (paramCollection.next() == null)
      {
        paramCollection = new StringBuilder();
        paramCollection.append("Container '");
        paramCollection.append(paramString);
        paramCollection.append("' cannot contain null values");
        throw new NullPointerException(paramCollection.toString());
      }
    }
  }
  
  public static final String b()
  {
    String str = B.m();
    if (str != null) {
      return str;
    }
    throw new IllegalStateException("No App ID found, please set the App ID.".toString());
  }
  
  public static final String c()
  {
    String str = B.r();
    if (str != null) {
      return str;
    }
    throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
  }
  
  public static final boolean d(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "redirectURI");
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject;
    if (localPackageManager != null)
    {
      localObject = new Intent();
      ((Intent)localObject).setAction("android.intent.action.VIEW");
      ((Intent)localObject).addCategory("android.intent.category.DEFAULT");
      ((Intent)localObject).addCategory("android.intent.category.BROWSABLE");
      ((Intent)localObject).setData(Uri.parse(paramString));
      paramString = localPackageManager.queryIntentActivities((Intent)localObject, 64);
    }
    else
    {
      paramString = null;
    }
    boolean bool = false;
    if (paramString != null)
    {
      localObject = paramString.iterator();
      bool = false;
      while (((Iterator)localObject).hasNext())
      {
        paramString = nextactivityInfo;
        if ((Intrinsics.a(name, "com.facebook.CustomTabActivity")) && (Intrinsics.a(packageName, paramContext.getPackageName()))) {
          bool = true;
        } else {
          return false;
        }
      }
    }
    return bool;
  }
  
  public static final void e(Context paramContext, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {
      paramContext = new ComponentName(paramContext, "com.facebook.FacebookActivity");
    }
    try
    {
      paramContext = localPackageManager.getActivityInfo(paramContext, 1);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    paramContext = null;
    if (paramContext == null) {
      if ((paramBoolean ^ true)) {
        Log.w(b, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      } else {
        throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString());
      }
    }
  }
  
  public static final void f(Context paramContext, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
      if ((paramBoolean ^ true)) {
        Log.w(b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
      } else {
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
      }
    }
  }
  
  public static final void g(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "arg");
    Intrinsics.checkNotNullParameter(paramString2, "name");
    int i;
    if (paramString1.length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    paramString1 = new StringBuilder();
    paramString1.append("Argument '");
    paramString1.append(paramString2);
    paramString1.append("' cannot be empty");
    throw new IllegalArgumentException(paramString1.toString().toString());
  }
  
  public static final void h(Collection paramCollection, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "container");
    Intrinsics.checkNotNullParameter(paramString, "name");
    if ((paramCollection.isEmpty() ^ true)) {
      return;
    }
    paramCollection = new StringBuilder();
    paramCollection.append("Container '");
    paramCollection.append(paramString);
    paramCollection.append("' cannot be empty");
    throw new IllegalArgumentException(paramCollection.toString().toString());
  }
  
  public static final void i(Collection paramCollection, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "container");
    Intrinsics.checkNotNullParameter(paramString, "name");
    a(paramCollection, paramString);
    h(paramCollection, paramString);
  }
  
  public static final void j(Object paramObject, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "name");
    if (paramObject != null) {
      return;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Argument '");
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append("' cannot be null");
    throw new NullPointerException(((StringBuilder)paramObject).toString());
  }
  
  public static final String k(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString2, "name");
    int i;
    if ((paramString1 != null) && (paramString1.length() > 0)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return paramString1;
    }
    paramString1 = new StringBuilder();
    paramString1.append("Argument '");
    paramString1.append(paramString2);
    paramString1.append("' cannot be null or empty");
    throw new IllegalArgumentException(paramString1.toString().toString());
  }
  
  public static final void l()
  {
    if (B.F()) {
      return;
    }
    throw new C("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
  }
}

/* Location:
 * Qualified Name:     O1.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */