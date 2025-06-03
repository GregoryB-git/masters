package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ParameterComponent
{
  private static final String PARAMETER_NAME_KEY = "name";
  private static final String PARAMETER_PATH_KEY = "path";
  private static final String PARAMETER_VALUE_KEY = "value";
  public final String name;
  public final List<PathComponent> path;
  public final String pathType;
  public final String value;
  
  public ParameterComponent(JSONObject paramJSONObject)
    throws JSONException
  {
    name = paramJSONObject.getString("name");
    value = paramJSONObject.optString("value");
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("path");
    if (localJSONArray != null) {
      for (int i = 0; i < localJSONArray.length(); i++) {
        localArrayList.add(new PathComponent(localJSONArray.getJSONObject(i)));
      }
    }
    path = localArrayList;
    pathType = paramJSONObject.optString("path_type", "absolute");
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.ParameterComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */