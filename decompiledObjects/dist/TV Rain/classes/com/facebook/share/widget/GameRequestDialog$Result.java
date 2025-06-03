package com.facebook.share.widget;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestDialog$Result
{
  public String requestId;
  public List<String> to;
  
  private GameRequestDialog$Result(Bundle paramBundle)
  {
    requestId = paramBundle.getString("request");
    to = new ArrayList();
    while (paramBundle.containsKey(String.format("to[%d]", new Object[] { Integer.valueOf(to.size()) })))
    {
      List localList = to;
      localList.add(paramBundle.getString(String.format("to[%d]", new Object[] { Integer.valueOf(localList.size()) })));
    }
  }
  
  public String getRequestId()
  {
    return requestId;
  }
  
  public List<String> getRequestRecipients()
  {
    return to;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.GameRequestDialog.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */