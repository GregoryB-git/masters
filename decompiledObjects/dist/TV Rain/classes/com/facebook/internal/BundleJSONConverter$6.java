package com.facebook.internal;

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class BundleJSONConverter$6
  implements BundleJSONConverter.Setter
{
  public void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
    throws JSONException
  {
    throw new IllegalArgumentException("Unexpected type from JSON");
  }
  
  public void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    paramObject = (String[])paramObject;
    int i = paramObject.length;
    for (int j = 0; j < i; j++) {
      localJSONArray.put(paramObject[j]);
    }
    paramJSONObject.put(paramString, localJSONArray);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */