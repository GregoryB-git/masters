package com.google.android.play.core.integrity;

import android.content.Context;

final class ax
{
  private static aw a;
  
  public static aw a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        u localu = new com/google/android/play/core/integrity/u;
        localu.<init>(null);
        Context localContext = paramContext.getApplicationContext();
        if (localContext != null) {
          paramContext = localContext;
        }
        localu.a(paramContext);
        a = localu.b();
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */