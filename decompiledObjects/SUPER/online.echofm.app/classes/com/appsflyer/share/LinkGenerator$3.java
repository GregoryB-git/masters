package com.appsflyer.share;

import com.appsflyer.CreateOneLinkHttpTask.ResponseListener;

final class LinkGenerator$3
  implements LinkGenerator.ResponseListener
{
  public LinkGenerator$3(LinkGenerator paramLinkGenerator, CreateOneLinkHttpTask.ResponseListener paramResponseListener) {}
  
  public final void onResponse(String paramString)
  {
    values.onResponse(paramString);
  }
  
  public final void onResponseError(String paramString)
  {
    values.onResponseError(paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.share.LinkGenerator.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */