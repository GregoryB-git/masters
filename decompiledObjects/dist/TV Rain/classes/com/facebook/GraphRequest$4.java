package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;
import org.json.JSONObject;
import z2;

class GraphRequest$4
  implements GraphRequest.Callback
{
  public GraphRequest$4(GraphRequest paramGraphRequest, GraphRequest.Callback paramCallback) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    Object localObject1 = paramGraphResponse.getJSONObject();
    if (localObject1 != null) {
      localObject1 = ((JSONObject)localObject1).optJSONObject("__debug__");
    } else {
      localObject1 = null;
    }
    JSONArray localJSONArray;
    if (localObject1 != null) {
      localJSONArray = ((JSONObject)localObject1).optJSONArray("messages");
    } else {
      localJSONArray = null;
    }
    if (localJSONArray != null) {
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        Object localObject2 = localJSONArray.optJSONObject(i);
        if (localObject2 != null) {
          localObject1 = ((JSONObject)localObject2).optString("message");
        } else {
          localObject1 = null;
        }
        Object localObject3;
        if (localObject2 != null) {
          localObject3 = ((JSONObject)localObject2).optString("type");
        } else {
          localObject3 = null;
        }
        if (localObject2 != null) {
          localObject2 = ((JSONObject)localObject2).optString("link");
        } else {
          localObject2 = null;
        }
        if ((localObject1 != null) && (localObject3 != null))
        {
          LoggingBehavior localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
          if (((String)localObject3).equals("warning")) {
            localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
          }
          localObject3 = localObject1;
          if (!Utility.isNullOrEmpty((String)localObject2)) {
            localObject3 = z2.p((String)localObject1, " Link: ", (String)localObject2);
          }
          Logger.log(localLoggingBehavior, GraphRequest.TAG, (String)localObject3);
        }
      }
    }
    localObject1 = val$callback;
    if (localObject1 != null) {
      ((GraphRequest.Callback)localObject1).onCompleted(paramGraphResponse);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */