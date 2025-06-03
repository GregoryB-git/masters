package com.google.android.gms.internal.measurement;

import android.net.Uri;
import t.h;

public final class F2
  implements K2
{
  public final h a;
  
  public F2(h paramh)
  {
    a = paramh;
  }
  
  public final String a(Uri paramUri, String paramString1, String paramString2, String paramString3)
  {
    if (paramUri != null) {
      paramString1 = paramUri.toString();
    } else {
      if (paramString1 == null) {
        break label31;
      }
    }
    paramUri = (h)a.get(paramString1);
    break label33;
    label31:
    paramUri = null;
    label33:
    if (paramUri == null) {
      return null;
    }
    paramString1 = paramString3;
    if (paramString2 != null)
    {
      paramString1 = new StringBuilder();
      paramString1.append(paramString2);
      paramString1.append(paramString3);
      paramString1 = paramString1.toString();
    }
    return (String)paramUri.get(paramString1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.F2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */