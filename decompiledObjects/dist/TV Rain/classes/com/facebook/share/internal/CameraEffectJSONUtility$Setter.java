package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import org.json.JSONException;
import org.json.JSONObject;

public abstract interface CameraEffectJSONUtility$Setter
{
  public abstract void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
    throws JSONException;
  
  public abstract void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException;
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.Setter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */