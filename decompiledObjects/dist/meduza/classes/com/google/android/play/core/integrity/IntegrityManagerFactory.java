package com.google.android.play.core.integrity;

import android.content.Context;

public class IntegrityManagerFactory
{
  public static IntegrityManager create(Context paramContext)
  {
    return z.a(paramContext).a();
  }
  
  public static StandardIntegrityManager createStandard(Context paramContext)
  {
    return ax.a(paramContext).a();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.IntegrityManagerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */