package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class CameraEffectJSONUtility$2
  implements CameraEffectJSONUtility.Setter
{
  public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
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
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */