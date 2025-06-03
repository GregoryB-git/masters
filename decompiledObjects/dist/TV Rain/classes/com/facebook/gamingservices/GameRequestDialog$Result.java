package com.facebook.gamingservices;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
  
  private GameRequestDialog$Result(GraphResponse paramGraphResponse)
  {
    try
    {
      paramGraphResponse = paramGraphResponse.getJSONObject();
      Object localObject = paramGraphResponse.optJSONObject("data");
      if (localObject != null) {
        paramGraphResponse = (GraphResponse)localObject;
      }
      requestId = paramGraphResponse.getString("request_id");
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      to = ((List)localObject);
      paramGraphResponse = paramGraphResponse.getJSONArray("to");
      for (int i = 0; i < paramGraphResponse.length(); i++) {
        to.add(paramGraphResponse.getString(i));
      }
      return;
    }
    catch (JSONException paramGraphResponse)
    {
      requestId = null;
      to = new ArrayList();
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
 * Qualified Name:     com.facebook.gamingservices.GameRequestDialog.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */