package x1;

import O1.C;
import O1.C.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class M
{
  public static final a c = new a(null);
  public static final String d = M.class.getSimpleName();
  public final String a;
  public final SharedPreferences b;
  
  public M(Context paramContext, String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() != 0) {}
    }
    else
    {
      str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    }
    a = str;
    paramString = paramContext.getApplicationContext();
    if (paramString != null) {
      paramContext = paramString;
    }
    paramContext = paramContext.getSharedPreferences(str, 0);
    Intrinsics.checkNotNullExpressionValue(paramContext, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
    b = paramContext;
  }
  
  public final void a()
  {
    b.edit().clear().apply();
  }
  
  public final void b(String paramString, Bundle paramBundle)
  {
    Object localObject1 = b.getString(paramString, "{}");
    Object localObject2;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (localObject1 != null)
    {
      localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("valueType");
      if (localObject1 != null)
      {
        int i = ((String)localObject1).hashCode();
        j = 0;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        switch (i)
        {
        default: 
          break;
        case 2067161310: 
          if (((String)localObject1).equals("short[]"))
          {
            localObject1 = ((JSONObject)localObject2).getJSONArray("value");
            j = ((JSONArray)localObject1).length();
            localObject2 = new short[j];
            k = j - 1;
            if (k >= 0) {
              for (;;)
              {
                j = i4 + 1;
                localObject2[i4] = ((short)(short)((JSONArray)localObject1).getInt(i4));
                if (j > k) {
                  break;
                }
                i4 = j;
              }
            }
            paramBundle.putShortArray(paramString, (short[])localObject2);
          }
          break;
        case 1359468275: 
          if (((String)localObject1).equals("double[]"))
          {
            localObject2 = ((JSONObject)localObject2).getJSONArray("value");
            i4 = ((JSONArray)localObject2).length();
            localObject1 = new double[i4];
            k = i4 - 1;
            if (k >= 0) {
              for (i4 = j;; i4 = j)
              {
                j = i4 + 1;
                localObject1[i4] = ((JSONArray)localObject2).getDouble(i4);
                if (j > k) {
                  break;
                }
              }
            }
            paramBundle.putDoubleArray(paramString, (double[])localObject1);
          }
          break;
        case 109413500: 
          if (((String)localObject1).equals("short")) {
            paramBundle.putShort(paramString, (short)((JSONObject)localObject2).getInt("value"));
          }
          break;
        case 100361105: 
          if (((String)localObject1).equals("int[]"))
          {
            localObject1 = ((JSONObject)localObject2).getJSONArray("value");
            i4 = ((JSONArray)localObject1).length();
            localObject2 = new int[i4];
            m = i4 - 1;
            if (m >= 0) {
              for (i4 = k;; i4 = j)
              {
                j = i4 + 1;
                localObject2[i4] = ((JSONArray)localObject1).getInt(i4);
                if (j > m) {
                  break;
                }
              }
            }
            paramBundle.putIntArray(paramString, (int[])localObject2);
          }
          break;
        case 97526364: 
          if (((String)localObject1).equals("float")) {
            paramBundle.putFloat(paramString, (float)((JSONObject)localObject2).getDouble("value"));
          }
          break;
        case 3327612: 
          if (((String)localObject1).equals("long")) {
            paramBundle.putLong(paramString, ((JSONObject)localObject2).getLong("value"));
          }
          break;
        case 3118337: 
          if (!((String)localObject1).equals("enum")) {
            break;
          }
        }
      }
    }
    try
    {
      paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(((JSONObject)localObject2).getString("enumType")), ((JSONObject)localObject2).getString("value")));
    }
    catch (ClassNotFoundException|IllegalArgumentException paramString)
    {
      Object localObject3;
      label1412:
      label1419:
      for (;;) {}
    }
    if (((String)localObject1).equals("char"))
    {
      localObject1 = ((JSONObject)localObject2).getString("value");
      if ((localObject1 != null) && (((String)localObject1).length() == 1))
      {
        paramBundle.putChar(paramString, ((String)localObject1).charAt(0));
        break label1419;
        if (((String)localObject1).equals("byte"))
        {
          paramBundle.putByte(paramString, (byte)((JSONObject)localObject2).getInt("value"));
          break label1419;
          if (((String)localObject1).equals("bool"))
          {
            paramBundle.putBoolean(paramString, ((JSONObject)localObject2).getBoolean("value"));
            break label1419;
            if (((String)localObject1).equals("int"))
            {
              paramBundle.putInt(paramString, ((JSONObject)localObject2).getInt("value"));
              break label1419;
              if (((String)localObject1).equals("float[]"))
              {
                localObject1 = ((JSONObject)localObject2).getJSONArray("value");
                i4 = ((JSONArray)localObject1).length();
                localObject2 = new float[i4];
                k = i4 - 1;
                if (k >= 0) {
                  for (i4 = m;; i4 = j)
                  {
                    j = i4 + 1;
                    localObject2[i4] = ((float)((JSONArray)localObject1).getDouble(i4));
                    if (j > k) {
                      break;
                    }
                  }
                }
                paramBundle.putFloatArray(paramString, (float[])localObject2);
                break label1419;
                if (((String)localObject1).equals("string"))
                {
                  paramBundle.putString(paramString, ((JSONObject)localObject2).getString("value"));
                  break label1419;
                  if (((String)localObject1).equals("long[]"))
                  {
                    localObject2 = ((JSONObject)localObject2).getJSONArray("value");
                    i4 = ((JSONArray)localObject2).length();
                    localObject1 = new long[i4];
                    k = i4 - 1;
                    if (k >= 0) {
                      for (i4 = n;; i4 = j)
                      {
                        j = i4 + 1;
                        localObject1[i4] = ((JSONArray)localObject2).getLong(i4);
                        if (j > k) {
                          break;
                        }
                      }
                    }
                    paramBundle.putLongArray(paramString, (long[])localObject1);
                    break label1419;
                    if (((String)localObject1).equals("double"))
                    {
                      paramBundle.putDouble(paramString, ((JSONObject)localObject2).getDouble("value"));
                      break label1419;
                      if (((String)localObject1).equals("char[]"))
                      {
                        localObject2 = ((JSONObject)localObject2).getJSONArray("value");
                        i4 = ((JSONArray)localObject2).length();
                        localObject3 = new char[i4];
                        k = i4 - 1;
                        if (k >= 0) {
                          for (i4 = 0;; i4 = j)
                          {
                            j = i4 + 1;
                            localObject1 = ((JSONArray)localObject2).getString(i4);
                            if ((localObject1 != null) && (((String)localObject1).length() == 1)) {
                              localObject3[i4] = ((String)localObject1).charAt(0);
                            }
                            if (j > k) {
                              break;
                            }
                          }
                        }
                        paramBundle.putCharArray(paramString, (char[])localObject3);
                        break label1419;
                        if (((String)localObject1).equals("byte[]"))
                        {
                          localObject1 = ((JSONObject)localObject2).getJSONArray("value");
                          i4 = ((JSONArray)localObject1).length();
                          localObject2 = new byte[i4];
                          k = i4 - 1;
                          if (k >= 0) {
                            for (i4 = i1;; i4 = j)
                            {
                              j = i4 + 1;
                              localObject2[i4] = ((byte)(byte)((JSONArray)localObject1).getInt(i4));
                              if (j > k) {
                                break;
                              }
                            }
                          }
                          paramBundle.putByteArray(paramString, (byte[])localObject2);
                          break label1419;
                          if (((String)localObject1).equals("bool[]"))
                          {
                            localObject1 = ((JSONObject)localObject2).getJSONArray("value");
                            i4 = ((JSONArray)localObject1).length();
                            localObject2 = new boolean[i4];
                            k = i4 - 1;
                            if (k >= 0) {
                              for (i4 = i2;; i4 = j)
                              {
                                j = i4 + 1;
                                localObject2[i4] = ((JSONArray)localObject1).getBoolean(i4);
                                if (j > k) {
                                  break;
                                }
                              }
                            }
                            paramBundle.putBooleanArray(paramString, (boolean[])localObject2);
                            break label1419;
                            if (((String)localObject1).equals("stringList"))
                            {
                              localObject2 = ((JSONObject)localObject2).getJSONArray("value");
                              k = ((JSONArray)localObject2).length();
                              localObject3 = new ArrayList(k);
                              if (k > 0)
                              {
                                for (i4 = i3;; i4 = j)
                                {
                                  j = i4 + 1;
                                  localObject1 = ((JSONArray)localObject2).get(i4);
                                  if (localObject1 == JSONObject.NULL)
                                  {
                                    localObject1 = null;
                                  }
                                  else
                                  {
                                    if (localObject1 == null) {
                                      break;
                                    }
                                    localObject1 = (String)localObject1;
                                  }
                                  ((ArrayList)localObject3).add(i4, localObject1);
                                  if (j >= k) {
                                    break label1412;
                                  }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                              }
                              paramBundle.putStringArrayList(paramString, (ArrayList)localObject3);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return;
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final Bundle c()
  {
    Bundle localBundle = new Bundle();
    Object localObject1 = b.getAll().keySet().iterator();
    Object localObject2;
    for (;;)
    {
      localObject2 = localBundle;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        try
        {
          Intrinsics.checkNotNullExpressionValue(localObject2, "key");
          b((String)localObject2, localBundle);
        }
        catch (JSONException localJSONException)
        {
          localObject1 = C.e;
          N localN = N.r;
          String str = d;
          Intrinsics.checkNotNullExpressionValue(str, "TAG");
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Error reading cached value for key: '");
          localStringBuilder.append(localObject2);
          localStringBuilder.append("' -- ");
          localStringBuilder.append(localJSONException);
          ((C.a)localObject1).a(localN, 5, str, localStringBuilder.toString());
          localObject2 = null;
        }
      }
    }
    return (Bundle)localObject2;
  }
  
  public static final class a
  {
    public final String a(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      return paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }
    
    public final Date b(Bundle paramBundle, String paramString)
    {
      Object localObject = null;
      if (paramBundle == null) {
        return null;
      }
      long l = paramBundle.getLong(paramString, Long.MIN_VALUE);
      if (l == Long.MIN_VALUE) {
        paramBundle = (Bundle)localObject;
      } else {
        paramBundle = new Date(l);
      }
      return paramBundle;
    }
    
    public final Date c(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      return b(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
    }
    
    public final Date d(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      return b(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
    }
    
    public final h e(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
        paramBundle = (h)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
      } else if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
        paramBundle = h.q;
      } else {
        paramBundle = h.t;
      }
      return paramBundle;
    }
    
    public final String f(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      return paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
    }
    
    public final boolean g(Bundle paramBundle)
    {
      boolean bool1 = false;
      if (paramBundle == null) {
        return false;
      }
      String str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
      boolean bool2 = bool1;
      if (str != null) {
        if (str.length() == 0)
        {
          bool2 = bool1;
        }
        else
        {
          bool2 = bool1;
          if (paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
  }
}

/* Location:
 * Qualified Name:     x1.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */