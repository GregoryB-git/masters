package c8;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase_auth_api.zzv;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;
import p6.a;
import r.b;
import r.h;

public final class c0
{
  public static final a a = new a("JSONParser", new String[0]);
  
  public static ArrayList a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = a((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = c((JSONObject)localObject1);
        }
      }
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public static Map<String, Object> b(String paramString)
  {
    j.e(paramString);
    Object localObject = zzv.zza('.').zza(paramString);
    if (((List)localObject).size() < 2)
    {
      a.c(f.j("Invalid idToken ", paramString), new Object[0]);
      return new HashMap();
    }
    paramString = (String)((List)localObject).get(1);
    try
    {
      localObject = new java/lang/String;
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = Base64.decode(paramString, 11);
      }
      ((String)localObject).<init>(paramString, "UTF-8");
      localObject = d((String)localObject);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = new HashMap();
      }
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      a.b("Unable to decode token", paramString, new Object[0]);
    }
    return new HashMap();
  }
  
  public static b c(JSONObject paramJSONObject)
  {
    b localb = new b();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = a((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = c((JSONObject)localObject1);
        }
      }
      localb.put(str, localObject2);
    }
    return localb;
  }
  
  public static b d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      if (localJSONObject != JSONObject.NULL)
      {
        paramString = c(localJSONObject);
        return paramString;
      }
      return null;
    }
    catch (Exception paramString)
    {
      Log.d("JSONParser", "Failed to parse JSONObject into Map.");
      throw new zzzp(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     c8.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */