package com.facebook.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

final class BundleJSONConverter$2
  implements BundleJSONConverter.Setter
{
  public void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
    throws JSONException
  {
    paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
  }
  
  public void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    paramJSONObject.put(paramString, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */