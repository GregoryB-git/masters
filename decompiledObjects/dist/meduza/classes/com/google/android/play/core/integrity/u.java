package com.google.android.play.core.integrity;

import android.content.Context;

final class u
  implements av
{
  private Context a;
  
  public final u a(Context paramContext)
  {
    paramContext.getClass();
    a = paramContext;
    return this;
  }
  
  public final aw b()
  {
    Context localContext = a;
    if (localContext != null) {
      return new w(localContext, null);
    }
    throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */