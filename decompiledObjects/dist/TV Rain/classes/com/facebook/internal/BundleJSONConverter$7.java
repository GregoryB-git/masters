package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

final class BundleJSONConverter$7
  implements BundleJSONConverter.Setter
{
  public void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
    throws JSONException
  {
    JSONArray localJSONArray = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray.length() == 0)
    {
      paramBundle.putStringArrayList(paramString, localArrayList);
      return;
    }
    int i = 0;
    while (i < localJSONArray.length())
    {
      paramObject = localJSONArray.get(i);
      if ((paramObject instanceof String))
      {
        localArrayList.add((String)paramObject);
        i++;
      }
      else
      {
        paramBundle = z2.t("Unexpected type in an array: ");
        paramBundle.append(paramObject.getClass());
        throw new IllegalArgumentException(paramBundle.toString());
      }
    }
    paramBundle.putStringArrayList(paramString, localArrayList);
  }
  
  public void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */