package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

public final class a
{
  private boolean a;
  
  public final void a(Context paramContext)
  {
    h.a(paramContext, "Application Context cannot be null");
    if (!a)
    {
      a = true;
      j.a().a(paramContext);
      n.a().a(paramContext);
      aa.a(paramContext);
      o.a().a(paramContext);
    }
  }
  
  public final boolean a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */