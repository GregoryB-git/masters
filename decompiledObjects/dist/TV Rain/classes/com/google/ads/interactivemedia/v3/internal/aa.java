package com.google.ads.interactivemedia.v3.internal;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa
{
  private static WindowManager a;
  private static String[] b = { "x", "y", "width", "height" };
  private static float c = getSystemgetDisplayMetricsdensity;
  
  public static JSONObject a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("x", paramInt1 / c);
      localJSONObject.put("y", paramInt2 / c);
      localJSONObject.put("width", paramInt3 / c);
      localJSONObject.put("height", paramInt4 / c);
    }
    catch (JSONException localJSONException)
    {
      h.a("Error with creating viewStateObject", localJSONException);
    }
    return localJSONObject;
  }
  
  public static void a(Context paramContext)
  {
    if (paramContext != null)
    {
      c = getResourcesgetDisplayMetricsdensity;
      a = (WindowManager)paramContext.getSystemService("window");
    }
  }
  
  public static void a(JSONObject paramJSONObject)
  {
    Object localObject = a;
    float f1 = 0.0F;
    float f2;
    if (localObject != null)
    {
      localObject = new Point(0, 0);
      a.getDefaultDisplay().getRealSize((Point)localObject);
      f1 = x;
      f2 = c;
      f1 /= f2;
      f2 = y / f2;
    }
    else
    {
      f2 = 0.0F;
    }
    localObject = new ad(f1, f2);
    try
    {
      paramJSONObject.put("width", a);
      paramJSONObject.put("height", b);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      aiq.a(paramJSONObject);
    }
  }
  
  public static void a(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      paramJSONObject.put("adSessionId", paramString);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      h.a("Error with setting ad session id", paramJSONObject);
    }
  }
  
  public static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    try
    {
      paramJSONObject.put(paramString, paramObject);
      return;
    }
    catch (JSONException paramObject)
    {
      paramJSONObject = new StringBuilder(a.b(paramString, 47));
      paramJSONObject.append("JSONException during JSONObject.put for name [");
      paramJSONObject.append(paramString);
      paramJSONObject.append("]");
      h.a(paramJSONObject.toString(), (Exception)paramObject);
    }
  }
  
  public static void a(JSONObject paramJSONObject, List<String> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put((String)paramList.next());
    }
    try
    {
      paramJSONObject.put("isFriendlyObstructionFor", localJSONArray);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      h.a("Error with setting friendly obstruction", paramJSONObject);
    }
  }
  
  public static void a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    try
    {
      JSONArray localJSONArray1 = paramJSONObject1.optJSONArray("childViews");
      JSONArray localJSONArray2 = localJSONArray1;
      if (localJSONArray1 == null)
      {
        localJSONArray2 = new org/json/JSONArray;
        localJSONArray2.<init>();
        paramJSONObject1.put("childViews", localJSONArray2);
      }
      localJSONArray2.put(paramJSONObject2);
      return;
    }
    catch (JSONException paramJSONObject1)
    {
      aiq.a(paramJSONObject1);
    }
  }
  
  private static boolean a(JSONArray paramJSONArray1, JSONArray paramJSONArray2)
  {
    if ((paramJSONArray1 == null) && (paramJSONArray2 == null)) {
      return true;
    }
    return (paramJSONArray1 != null) && (paramJSONArray2 != null) && (paramJSONArray1.length() == paramJSONArray2.length());
  }
  
  public static boolean b(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    if ((paramJSONObject1 == null) && (paramJSONObject2 == null)) {
      return true;
    }
    if ((paramJSONObject1 != null) && (paramJSONObject2 != null))
    {
      Object localObject2;
      for (localObject2 : b) {
        if (paramJSONObject1.optDouble((String)localObject2) != paramJSONObject2.optDouble((String)localObject2))
        {
          ??? = 0;
          break label74;
        }
      }
      ??? = 1;
      label74:
      if ((??? != 0) && (paramJSONObject1.optString("adSessionId", "").equals(paramJSONObject2.optString("adSessionId", ""))))
      {
        ??? = paramJSONObject1.optJSONArray("isFriendlyObstructionFor");
        localObject2 = paramJSONObject2.optJSONArray("isFriendlyObstructionFor");
        if ((??? != null) || (localObject2 != null))
        {
          if (!a((JSONArray)???, (JSONArray)localObject2)) {
            ??? = 0;
          } else {
            for (??? = 0;; ???++)
            {
              if (??? >= ((JSONArray)???).length()) {
                break label184;
              }
              if (!((JSONArray)???).optString(???, "").equals(((JSONArray)localObject2).optString(???, ""))) {
                break;
              }
            }
          }
        }
        else {
          label184:
          ??? = 1;
        }
        if (??? != 0)
        {
          paramJSONObject1 = paramJSONObject1.optJSONArray("childViews");
          paramJSONObject2 = paramJSONObject2.optJSONArray("childViews");
          if ((paramJSONObject1 != null) || (paramJSONObject2 != null))
          {
            if (!a(paramJSONObject1, paramJSONObject2)) {
              ??? = 0;
            } else {
              for (??? = 0;; ???++)
              {
                if (??? >= paramJSONObject1.length()) {
                  break label267;
                }
                if (!b(paramJSONObject1.optJSONObject(???), paramJSONObject2.optJSONObject(???))) {
                  break;
                }
              }
            }
          }
          else {
            label267:
            ??? = 1;
          }
          if (??? != 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */