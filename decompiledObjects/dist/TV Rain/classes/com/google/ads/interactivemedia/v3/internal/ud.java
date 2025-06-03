package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

public final class ud
  implements ts
{
  private final Context a;
  private final vc b;
  private final ts c;
  
  private ud(Context paramContext, vc paramvc, ts paramts)
  {
    a = paramContext.getApplicationContext();
    b = paramvc;
    c = paramts;
  }
  
  public ud(Context paramContext, String paramString)
  {
    this(paramContext, paramString, null);
  }
  
  private ud(Context paramContext, String paramString, vc paramvc)
  {
    this(paramContext, null, new uj(paramString, null));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ud
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */