package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

public final class o
{
  @SuppressLint({"StaticFieldLeak"})
  private static o a = new o();
  private Context b;
  
  public static o a()
  {
    return a;
  }
  
  public final void a(Context paramContext)
  {
    if (paramContext != null) {
      paramContext = paramContext.getApplicationContext();
    } else {
      paramContext = null;
    }
    b = paramContext;
  }
  
  public final Context b()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */