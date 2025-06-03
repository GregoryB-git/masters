package com.facebook;

import org.json.JSONArray;
import org.json.JSONObject;

final class GraphRequest$2
  implements GraphRequest.Callback
{
  public GraphRequest$2(GraphRequest.GraphJSONArrayCallback paramGraphJSONArrayCallback) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (val$callback != null)
    {
      Object localObject = paramGraphResponse.getJSONObject();
      if (localObject != null) {
        localObject = ((JSONObject)localObject).optJSONArray("data");
      } else {
        localObject = null;
      }
      val$callback.onCompleted((JSONArray)localObject, paramGraphResponse);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */