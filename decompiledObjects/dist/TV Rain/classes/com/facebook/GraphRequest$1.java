package com.facebook;

final class GraphRequest$1
  implements GraphRequest.Callback
{
  public GraphRequest$1(GraphRequest.GraphJSONObjectCallback paramGraphJSONObjectCallback) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    GraphRequest.GraphJSONObjectCallback localGraphJSONObjectCallback = val$callback;
    if (localGraphJSONObjectCallback != null) {
      localGraphJSONObjectCallback.onCompleted(paramGraphResponse.getJSONObject(), paramGraphResponse);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */