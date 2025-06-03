package e7;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoy;
import d2.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import m6.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n1
{
  public final String a;
  public final Bundle b;
  public Bundle c;
  
  public n1(l1 paraml1, String paramString)
  {
    j.e(paramString);
    a = paramString;
    b = new Bundle();
  }
  
  public final Bundle a()
  {
    if (c == null)
    {
      String str = d.v().getString(a, null);
      if (str != null) {
        try
        {
          Bundle localBundle1 = new android/os/Bundle;
          localBundle1.<init>();
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
              j = -1;
              int k = ((String)localObject2).hashCode();
              if (k != 100)
              {
                if (k != 108)
                {
                  if (k != 115)
                  {
                    if (k != 3352)
                    {
                      if ((k == 3445) && (((String)localObject2).equals("la"))) {
                        j = 4;
                      }
                    }
                    else if (((String)localObject2).equals("ia")) {
                      j = 3;
                    }
                  }
                  else if (((String)localObject2).equals("s")) {
                    j = 0;
                  }
                }
                else if (((String)localObject2).equals("l")) {
                  j = 2;
                }
              }
              else
              {
                boolean bool = ((String)localObject2).equals("d");
                if (bool) {
                  j = 1;
                }
              }
              if (j != 0)
              {
                if (j != 1)
                {
                  if (j != 2)
                  {
                    if (j != 3)
                    {
                      if (j != 4)
                      {
                        d.zzj().o.c("Unrecognized persisted bundle type. Type", localObject2);
                      }
                      else if ((zzoy.zza()) && (d.h().x(null, h0.R0)))
                      {
                        localObject2 = new org/json/JSONArray;
                        ((JSONArray)localObject2).<init>(((JSONObject)localObject1).getString("v"));
                        k = ((JSONArray)localObject2).length();
                        localObject1 = new long[k];
                        for (j = 0; j < k; j++) {
                          localObject1[j] = ((JSONArray)localObject2).optLong(j);
                        }
                        localBundle1.putLongArray(str, (long[])localObject1);
                      }
                    }
                    else if ((zzoy.zza()) && (d.h().x(null, h0.R0)))
                    {
                      localObject2 = new org/json/JSONArray;
                      ((JSONArray)localObject2).<init>(((JSONObject)localObject1).getString("v"));
                      k = ((JSONArray)localObject2).length();
                      localObject1 = new int[k];
                      for (j = 0; j < k; j++) {
                        localObject1[j] = ((JSONArray)localObject2).optInt(j);
                      }
                      localBundle1.putIntArray(str, (int[])localObject1);
                    }
                  }
                  else {
                    localBundle1.putLong(str, Long.parseLong(((JSONObject)localObject1).getString("v")));
                  }
                }
                else {
                  localBundle1.putDouble(str, Double.parseDouble(((JSONObject)localObject1).getString("v")));
                }
              }
              else {
                localBundle1.putString(str, ((JSONObject)localObject1).getString("v"));
              }
            }
            catch (JSONException|NumberFormatException localJSONException1)
            {
              d.zzj().o.b("Error reading value from SharedPreferences. Value dropped");
            }
          }
          c = localBundle1;
        }
        catch (JSONException localJSONException2)
        {
          d.zzj().o.b("Error loading bundle from SharedPreferences. Values will be lost");
        }
      }
      if (c == null) {
        c = b;
      }
    }
    Bundle localBundle2 = c;
    j.i(localBundle2);
    return new Bundle(localBundle2);
  }
  
  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    SharedPreferences.Editor localEditor = d.v().edit();
    if (paramBundle.size() == 0)
    {
      localEditor.remove(a);
    }
    else
    {
      String str = a;
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = paramBundle.keySet().iterator();
      label293:
      label360:
      label381:
      label402:
      label412:
      label475:
      while (localIterator.hasNext())
      {
        Object localObject1 = (String)localIterator.next();
        Object localObject2 = paramBundle.get((String)localObject1);
        if (localObject2 != null) {
          try
          {
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("n", localObject1);
            boolean bool = zzoy.zza();
            m0 localm0;
            if (bool)
            {
              localObject1 = d.h();
              localm0 = h0.R0;
            }
            try
            {
              if (((h)localObject1).x(null, localm0))
              {
                if ((localObject2 instanceof String))
                {
                  localJSONObject.put("v", String.valueOf(localObject2));
                  break label360;
                }
                if ((localObject2 instanceof Long))
                {
                  localJSONObject.put("v", String.valueOf(localObject2));
                  break label381;
                }
                if ((localObject2 instanceof int[]))
                {
                  localJSONObject.put("v", Arrays.toString((int[])localObject2));
                  localObject1 = "ia";
                }
                else
                {
                  if (!(localObject2 instanceof long[])) {
                    break label293;
                  }
                  localJSONObject.put("v", Arrays.toString((long[])localObject2));
                  localObject1 = "la";
                }
                localJSONObject.put("t", localObject1);
                break label412;
                if ((localObject2 instanceof Double))
                {
                  localJSONObject.put("v", String.valueOf(localObject2));
                  break label402;
                }
              }
              for (localObject1 = d.zzj().o;; localObject1 = d.zzj().o)
              {
                localObject2 = localObject2.getClass();
                break;
                localJSONObject.put("v", String.valueOf(localObject2));
                if ((localObject2 instanceof String))
                {
                  localJSONObject.put("t", "s");
                }
                else if ((localObject2 instanceof Long))
                {
                  localJSONObject.put("t", "l");
                }
                else
                {
                  if (!(localObject2 instanceof Double)) {
                    continue;
                  }
                  localJSONObject.put("t", "d");
                }
                localJSONArray.put(localJSONObject);
                break label475;
              }
              ((b1)localObject1).c("Cannot serialize bundle value to SharedPreferences. Type", localObject2);
            }
            catch (JSONException localJSONException1) {}
            d.zzj().o.c("Cannot serialize bundle value to SharedPreferences", localJSONException2);
          }
          catch (JSONException localJSONException2) {}
        }
      }
      localEditor.putString(str, localJSONArray.toString());
    }
    localEditor.apply();
    c = paramBundle;
  }
}

/* Location:
 * Qualified Name:     e7.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */