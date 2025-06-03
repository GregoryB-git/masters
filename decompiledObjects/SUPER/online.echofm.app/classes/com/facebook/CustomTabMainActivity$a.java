package com.facebook;

import O1.P;
import android.net.Uri;
import android.os.Bundle;

public final class CustomTabMainActivity$a
{
  public final Bundle b(String paramString)
  {
    paramString = Uri.parse(paramString);
    Object localObject = P.a;
    localObject = P.o0(paramString.getQuery());
    ((Bundle)localObject).putAll(P.o0(paramString.getFragment()));
    return (Bundle)localObject;
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabMainActivity.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */