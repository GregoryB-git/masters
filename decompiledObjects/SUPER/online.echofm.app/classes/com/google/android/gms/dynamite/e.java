package com.google.android.gms.dynamite;

import android.content.Context;

public final class e
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    a = parama.a(paramContext, paramString);
    int i = parama.b(paramContext, paramString, true);
    b = i;
    int j = a;
    int k = j;
    if (j == 0)
    {
      k = 0;
      if (i == 0)
      {
        c = 0;
        break label95;
      }
    }
    if (k >= i) {
      c = -1;
    } else {
      c = 1;
    }
    label95:
    return localb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */