package com.google.android.gms.dynamite;

import android.content.Context;

public final class h
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    int i = parama.a(paramContext, paramString);
    a = i;
    int j = 0;
    if (i != 0) {}
    for (i = parama.b(paramContext, paramString, false);; i = parama.b(paramContext, paramString, true))
    {
      b = i;
      break;
    }
    int k = a;
    if (k == 0)
    {
      if (i == 0)
      {
        c = 0;
        break label121;
      }
    }
    else {
      j = k;
    }
    if (i >= j) {
      c = 1;
    } else {
      c = -1;
    }
    label121:
    return localb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */