package x2;

import A2.l0;
import E2.i;
import G2.c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public class k
{
  public static final int a = n.a;
  public static final k b = new k();
  
  public static k f()
  {
    return b;
  }
  
  public int a(Context paramContext)
  {
    return n.a(paramContext);
  }
  
  public Intent b(Context paramContext, int paramInt, String paramString)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt != 3) {
        return null;
      }
      return l0.c("com.google.android.gms");
    }
    if ((paramContext != null) && (i.d(paramContext))) {
      return l0.a();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(a);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append("-");
    if (paramContext != null) {
      localStringBuilder.append(paramContext.getPackageName());
    }
    localStringBuilder.append("-");
    if (paramContext != null) {}
    try
    {
      localStringBuilder.append(aegetPackageName0versionCode);
      return l0.b("com.google.android.gms", localStringBuilder.toString());
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public PendingIntent c(Context paramContext, int paramInt1, int paramInt2)
  {
    return d(paramContext, paramInt1, paramInt2, null);
  }
  
  public PendingIntent d(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    paramString = b(paramContext, paramInt1, paramString);
    if (paramString == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, paramString, M2.d.a | 0x8000000);
  }
  
  public String e(int paramInt)
  {
    return n.b(paramInt);
  }
  
  public int g(Context paramContext)
  {
    return h(paramContext, a);
  }
  
  public int h(Context paramContext, int paramInt)
  {
    paramInt = n.e(paramContext, paramInt);
    if (n.f(paramContext, paramInt)) {
      return 18;
    }
    return paramInt;
  }
  
  public boolean i(Context paramContext, String paramString)
  {
    return n.j(paramContext, paramString);
  }
  
  public boolean j(int paramInt)
  {
    return n.h(paramInt);
  }
}

/* Location:
 * Qualified Name:     x2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */