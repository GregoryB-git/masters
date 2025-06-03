package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.List;

public class WebMessage
{
  public String data;
  public List<WebMessagePort> ports;
  
  public WebMessage(String paramString, List<WebMessagePort> paramList)
  {
    data = paramString;
    ports = paramList;
  }
  
  public void dispose()
  {
    List localList = ports;
    if (localList != null) {
      localList.clear();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */