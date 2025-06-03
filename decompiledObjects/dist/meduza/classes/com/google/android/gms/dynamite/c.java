package com.google.android.gms.dynamite;

import android.content.Context;

public final class c
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    int i = parama.b(paramContext, paramString);
    a = i;
    int j = 1;
    int k = 0;
    if (i != 0) {
      i = parama.a(paramContext, paramString, false);
    } else {
      i = parama.a(paramContext, paramString, true);
    }
    b = i;
    int m = a;
    if (m == 0)
    {
      if (i == 0)
      {
        j = 0;
        break label106;
      }
    }
    else {
      k = m;
    }
    if (k >= i) {
      j = -1;
    }
    label106:
    c = j;
    return localb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */