package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;

public class co
{
  private final Context a;
  
  public co(Context paramContext)
  {
    a = paramContext;
  }
  
  public cj[] a(Handler paramHandler, xa paramxa, dn paramdn)
  {
    Context localContext = a;
    jt localjt = jt.a;
    return new cj[] { new ws(localContext, localjt, 5000L, paramHandler, paramxa, 50), new ep(a, localjt, paramHandler, paramdn) };
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.co
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */