package com.google.ads.interactivemedia.v3.internal;

import a;
import android.text.TextUtils;
import android.util.Log;
import z2;

public final class vr
{
  private static int a = 0;
  private static boolean b = true;
  
  private static String a(String paramString, Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return paramString;
    }
    paramThrowable = paramThrowable.getMessage();
    if (TextUtils.isEmpty(paramThrowable)) {
      return paramString;
    }
    return z2.l(a.b(paramThrowable, a.b(paramString, 3)), paramString, " - ", paramThrowable);
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!b)
    {
      Log.w(paramString1, a(paramString2, paramThrowable));
      return;
    }
    Log.w(paramString1, paramString2, paramThrowable);
  }
  
  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!b)
    {
      Log.e(paramString1, a(paramString2, paramThrowable));
      return;
    }
    Log.e(paramString1, paramString2, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */