package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import org.json.JSONException;
import org.json.JSONObject;

final class CameraEffectJSONUtility$1
  implements CameraEffectJSONUtility.Setter
{
  public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
    throws JSONException
  {
    paramBuilder.putArgument(paramString, (String)paramObject);
  }
  
  public void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    paramJSONObject.put(paramString, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */