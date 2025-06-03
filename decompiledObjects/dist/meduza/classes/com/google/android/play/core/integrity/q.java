package com.google.android.play.core.integrity;

import android.content.Context;

final class q
  implements x
{
  private Context a;
  
  public final q a(Context paramContext)
  {
    paramContext.getClass();
    a = paramContext;
    return this;
  }
  
  public final s b()
  {
    Context localContext = a;
    if (localContext != null) {
      return new s(localContext, null);
    }
    throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */