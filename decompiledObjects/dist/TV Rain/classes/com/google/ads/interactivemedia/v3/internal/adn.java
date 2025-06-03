package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.ads.interactivemedia.v3.api.AdsRequest;

final class adn
  extends AsyncTask<String, Void, String>
{
  private final AdsRequest a;
  private final String b;
  
  public adn(ado paramado, AdsRequest paramAdsRequest, String paramString)
  {
    a = paramAdsRequest;
    b = paramString;
  }
  
  private final String a(String... paramVarArgs)
  {
    Object localObject1 = paramVarArgs[0];
    Object localObject3;
    synchronized (ado.g(c))
    {
      if (ado.h(c) == null)
      {
        paramVarArgs = c;
        localObject3 = new com/google/ads/interactivemedia/v3/internal/agt;
        ((agt)localObject3).<init>(agq.a("a.3.14.0", ado.d(paramVarArgs)));
        ado.a(paramVarArgs, (agt)localObject3);
      }
      paramVarArgs = (String[])localObject1;
      if (localObject1 != null)
      {
        localObject3 = Uri.parse((String)localObject1);
        boolean bool = ado.h(c).a((Uri)localObject3);
        paramVarArgs = (String[])localObject1;
        if (!bool) {}
      }
    }
    try
    {
      paramVarArgs = ado.h(c).a((Uri)localObject3, ado.d(c)).toString();
      localObject1 = c;
      ado.a((ado)localObject1, new afy(ado.d((ado)localObject1)));
      return paramVarArgs;
      paramVarArgs = finally;
      throw paramVarArgs;
    }
    catch (ags paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs = (String[])localObject1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */