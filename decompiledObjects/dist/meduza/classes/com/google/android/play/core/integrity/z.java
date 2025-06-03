package com.google.android.play.core.integrity;

import android.content.Context;

final class z
{
  private static s a;
  
  public static s a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        q localq = new com/google/android/play/core/integrity/q;
        localq.<init>(null);
        Context localContext = paramContext.getApplicationContext();
        if (localContext != null) {
          paramContext = localContext;
        }
        localq.a(paramContext);
        a = localq.b();
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */