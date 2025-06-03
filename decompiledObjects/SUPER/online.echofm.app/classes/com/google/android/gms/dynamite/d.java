package com.google.android.gms.dynamite;

import android.content.Context;

public final class d
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    int i = parama.b(paramContext, paramString, false);
    b = i;
    if (i == 0) {
      c = 0;
    } else {
      c = 1;
    }
    return localb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */