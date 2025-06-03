package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

final class CameraEffectJSONUtility$3
  implements CameraEffectJSONUtility.Setter
{
  public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
    throws JSONException
  {
    JSONArray localJSONArray = (JSONArray)paramObject;
    String[] arrayOfString = new String[localJSONArray.length()];
    int i = 0;
    while (i < localJSONArray.length())
    {
      paramObject = localJSONArray.get(i);
      if ((paramObject instanceof String))
      {
        arrayOfString[i] = ((String)paramObject);
        i++;
      }
      else
      {
        paramBuilder = z2.t("Unexpected type in an array: ");
        paramBuilder.append(paramObject.getClass());
        throw new IllegalArgumentException(paramBuilder.toString());
      }
    }
    paramBuilder.putArgument(paramString, arrayOfString);
  }
  
  public void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */