package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;
import com.google.ads.interactivemedia.v3.api.StreamRequest;

final class adp
  extends AsyncTask<Void, Void, String>
{
  private final StreamRequest a;
  private final String b;
  
  public adp(ado paramado, StreamRequest paramStreamRequest, String paramString)
  {
    a = paramStreamRequest;
    b = paramString;
  }
  
  private final String a()
  {
    synchronized (ado.g(c))
    {
      if (ado.h(c) == null)
      {
        localObject2 = c;
        agt localagt = new com/google/ads/interactivemedia/v3/internal/agt;
        localagt.<init>(agq.a("a.3.14.0", ado.d((ado)localObject2)));
        ado.a((ado)localObject2, localagt);
      }
      Object localObject2 = ado.h(c).a().d(ado.d(c));
      ??? = c;
      ado.a((ado)???, new afy(ado.d((ado)???)));
      return (String)localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */