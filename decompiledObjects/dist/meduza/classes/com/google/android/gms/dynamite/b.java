package com.google.android.gms.dynamite;

import android.content.Context;

public final class b
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    a = parama.b(paramContext, paramString);
    int i = 1;
    int j = parama.a(paramContext, paramString, true);
    b = j;
    int k = a;
    int m = k;
    if (k == 0)
    {
      if (j == 0) {
        i = 0;
      } else {
        m = 0;
      }
    }
    else if (m >= j) {
      i = -1;
    }
    c = i;
    return localb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */