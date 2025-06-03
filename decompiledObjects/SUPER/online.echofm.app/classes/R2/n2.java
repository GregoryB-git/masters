package R2;

import A2.n;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.g7;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n2
{
  public final String a;
  public final Bundle b;
  public Bundle c;
  
  public n2(l2 paraml2, String paramString, Bundle paramBundle)
  {
    n.e(paramString);
    a = paramString;
    b = new Bundle();
  }
  
  public final Bundle a()
  {
    if (c == null)
    {
      String str = d.F().getString(a, null);
      if (str != null) {
        try
        {
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(str);
          for (int i = 0;; i++)
          {
            int j = localJSONArray.length();
            if (i >= j) {
              break;
            }
            try
            {
              Object localObject1 = localJSONArray.getJSONObject(i);
              str = ((JSONObject)localObject1).getString("n");
              Object localObject2 = ((JSONObject)localObject1).getString("t");
              j = ((String)localObject2).hashCode();
              if (j != 100)
              {
                if (j != 108)
                {
                  if (j != 115)
                  {
                    if (j != 3352)
                    {
                      if ((j == 3445) && (((String)localObject2).equals("la")))
                      {
                        j = 4;
                        break label221;
                      }
                    }
                    else if (((String)localObject2).equals("ia"))
                    {
                      j = 3;
                      break label221;
                    }
                  }
                  else if (((String)localObject2).equals("s"))
                  {
                    j = 0;
                    break label221;
                  }
                }
                else if (((String)localObject2).equals("l"))
                {
                  j = 2;
                  break label221;
                }
              }
              else
              {
                boolean bool = ((String)localObject2).equals("d");
                if (bool)
                {
                  j = 1;
                  break label221;
                }
              }
              j = -1;
              label221:
              if (j != 0)
              {
                if (j != 1)
                {
                  if (j != 2)
                  {
                    int k;
                    if (j != 3)
                    {
                      if (j != 4)
                      {
                        d.j().G().b("Unrecognized persisted bundle type. Type", localObject2);
                      }
                      else if ((g7.a()) && (d.f().s(K.M0)))
                      {
                        localObject2 = new org/json/JSONArray;
                        ((JSONArray)localObject2).<init>(((JSONObject)localObject1).getString("v"));
                        k = ((JSONArray)localObject2).length();
                        localObject1 = new long[k];
                        for (j = 0; j < k; j++) {
                          localObject1[j] = ((JSONArray)localObject2).optLong(j);
                        }
                        localBundle.putLongArray(str, (long[])localObject1);
                      }
                    }
                    else if ((g7.a()) && (d.f().s(K.M0)))
                    {
                      localObject2 = new org/json/JSONArray;
                      ((JSONArray)localObject2).<init>(((JSONObject)localObject1).getString("v"));
                      k = ((JSONArray)localObject2).length();
                      localObject1 = new int[k];
                      for (j = 0; j < k; j++) {
                        localObject1[j] = ((JSONArray)localObject2).optInt(j);
                      }
                      localBundle.putIntArray(str, (int[])localObject1);
                    }
                  }
                  else
                  {
                    localBundle.putLong(str, Long.parseLong(((JSONObject)localObject1).getString("v")));
                  }
                }
                else {
                  localBundle.putDouble(str, Double.parseDouble(((JSONObject)localObject1).getString("v")));
                }
              }
              else {
                localBundle.putString(str, ((JSONObject)localObject1).getString("v"));
              }
            }
            catch (JSONException|NumberFormatException localJSONException1)
            {
              d.j().G().a("Error reading value from SharedPreferences. Value dropped");
            }
          }
          c = localBundle;
        }
        catch (JSONException localJSONException2)
        {
          d.j().G().a("Error loading bundle from SharedPreferences. Values will be lost");
        }
      }
      if (c == null) {
        c = b;
      }
    }
    return c;
  }
  
  public final void b(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = d.F().edit();
    if (localBundle.size() == 0) {
      paramBundle.remove(a);
    } else {
      paramBundle.putString(a, c(localBundle));
    }
    paramBundle.apply();
    c = localBundle;
  }
  
  public final String c(Bundle paramBundle)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle.get(str);
      if (localObject1 != null)
      {
        Object localObject3;
        try
        {
          localObject3 = new org/json/JSONObject;
          ((JSONObject)localObject3).<init>();
          ((JSONObject)localObject3).put("n", str);
          boolean bool = g7.a();
          if ((!bool) || (!d.f().s(K.M0))) {
            break label307;
          }
          if ((localObject1 instanceof String))
          {
            ((JSONObject)localObject3).put("v", String.valueOf(localObject1));
            label118:
            ((JSONObject)localObject3).put("t", "s");
          }
        }
        catch (JSONException localJSONException)
        {
          break label385;
        }
        if ((localJSONException instanceof Long))
        {
          ((JSONObject)localObject3).put("v", String.valueOf(localJSONException));
          label157:
          ((JSONObject)localObject3).put("t", "l");
        }
        else
        {
          if ((localJSONException instanceof int[])) {
            ((JSONObject)localObject3).put("v", Arrays.toString((int[])localJSONException));
          }
          for (localObject2 = "ia";; localObject2 = "la")
          {
            ((JSONObject)localObject3).put("t", localObject2);
            break label353;
            if (!(localObject2 instanceof long[])) {
              break;
            }
            ((JSONObject)localObject3).put("v", Arrays.toString((long[])localObject2));
          }
          if ((localObject2 instanceof Double))
          {
            ((JSONObject)localObject3).put("v", String.valueOf(localObject2));
            label263:
            ((JSONObject)localObject3).put("t", "d");
          }
          else
          {
            localObject3 = d.j().G();
          }
        }
        for (Object localObject2 = localObject2.getClass();; localObject2 = localObject2.getClass())
        {
          ((a2)localObject3).b("Cannot serialize bundle value to SharedPreferences. Type", localObject2);
          break;
          label307:
          ((JSONObject)localObject3).put("v", String.valueOf(localObject2));
          if ((localObject2 instanceof String)) {
            break label118;
          }
          if ((localObject2 instanceof Long)) {
            break label157;
          }
          if ((localObject2 instanceof Double))
          {
            break label263;
            label353:
            localJSONArray.put(localObject3);
            break;
          }
          localObject3 = d.j().G();
        }
        label385:
        d.j().G().b("Cannot serialize bundle value to SharedPreferences", localObject2);
      }
    }
    return localJSONArray.toString();
  }
}

/* Location:
 * Qualified Name:     R2.n2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */