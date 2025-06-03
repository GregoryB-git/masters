package O1;

import V5.m;
import V5.q;
import W5.C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.r.a;

public final class j
{
  public static final a g = new a(null);
  public static j h;
  public final Map a;
  public final Map b;
  public final Map c;
  public final String d;
  public final String e;
  public final String f;
  
  public j(Map paramMap1, Map paramMap2, Map paramMap3, String paramString1, String paramString2, String paramString3)
  {
    a = paramMap1;
    b = paramMap2;
    c = paramMap3;
    d = paramString1;
    e = paramString2;
    f = paramString3;
  }
  
  public final r.a c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return r.a.q;
    }
    Object localObject = a;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)a.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return r.a.p;
      }
    }
    localObject = c;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)c.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return r.a.o;
      }
    }
    localObject = b;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)b.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return r.a.q;
      }
    }
    return r.a.p;
  }
  
  public final String d(r.a parama)
  {
    int i;
    if (parama == null) {
      i = -1;
    } else {
      i = b.a[parama.ordinal()];
    }
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          parama = null;
        } else {
          parama = e;
        }
      }
      else {
        parama = f;
      }
    }
    else {
      parama = d;
    }
    return parama;
  }
  
  public static final class a
  {
    public final j a(JSONArray paramJSONArray)
    {
      if (paramJSONArray == null) {
        return null;
      }
      int i = paramJSONArray.length();
      if (i > 0)
      {
        int j = 0;
        Object localObject1 = null;
        localObject2 = localObject1;
        localObject3 = localObject2;
        localObject4 = localObject3;
        localObject5 = localObject4;
        Object localObject6 = localObject5;
        localObject7 = localObject5;
        Object localObject8 = localObject4;
        localObject9 = localObject3;
        Object localObject10 = localObject2;
        for (;;)
        {
          int k = j + 1;
          JSONObject localJSONObject = paramJSONArray.optJSONObject(j);
          if (localJSONObject == null)
          {
            localObject5 = localObject1;
            localObject11 = localObject10;
            localObject4 = localObject8;
            localObject3 = localObject7;
            localObject2 = localObject6;
          }
          else
          {
            String str = localJSONObject.optString("name");
            if (str == null)
            {
              localObject5 = localObject1;
              localObject11 = localObject10;
              localObject4 = localObject8;
              localObject3 = localObject7;
              localObject2 = localObject6;
            }
            else if (i.l(str, "other", true))
            {
              localObject4 = localJSONObject.optString("recovery_message", null);
              localObject5 = d(localJSONObject);
              localObject11 = localObject10;
              localObject3 = localObject7;
              localObject2 = localObject6;
            }
            else if (i.l(str, "transient", true))
            {
              localObject3 = localJSONObject.optString("recovery_message", null);
              localObject11 = d(localJSONObject);
              localObject5 = localObject1;
              localObject4 = localObject8;
              localObject2 = localObject6;
            }
            else
            {
              localObject5 = localObject1;
              localObject11 = localObject10;
              localObject4 = localObject8;
              localObject3 = localObject7;
              localObject2 = localObject6;
              if (i.l(str, "login_recoverable", true))
              {
                localObject2 = localJSONObject.optString("recovery_message", null);
                localObject9 = d(localJSONObject);
                localObject3 = localObject7;
                localObject4 = localObject8;
                localObject11 = localObject10;
                localObject5 = localObject1;
              }
            }
          }
          if (k >= i)
          {
            paramJSONArray = (JSONArray)localObject5;
            localObject5 = localObject3;
            localObject3 = localObject9;
            localObject9 = localObject5;
            localObject5 = localObject2;
            break;
          }
          j = k;
          localObject1 = localObject5;
          localObject10 = localObject11;
          localObject8 = localObject4;
          localObject7 = localObject3;
          localObject6 = localObject2;
        }
      }
      Object localObject7 = null;
      paramJSONArray = (JSONArray)localObject7;
      Object localObject2 = paramJSONArray;
      Object localObject3 = localObject2;
      Object localObject4 = localObject3;
      Object localObject5 = localObject4;
      Object localObject9 = localObject4;
      localObject4 = localObject3;
      localObject3 = localObject2;
      Object localObject11 = paramJSONArray;
      paramJSONArray = (JSONArray)localObject7;
      return new j(paramJSONArray, (Map)localObject11, (Map)localObject3, (String)localObject4, (String)localObject9, (String)localObject5);
    }
    
    public final j b()
    {
      try
      {
        if (j.a() == null) {
          j.b(c());
        }
      }
      finally
      {
        break label46;
      }
      Object localObject2 = j.a();
      if (localObject2 != null) {
        return (j)localObject2;
      }
      localObject2 = new java/lang/NullPointerException;
      ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
      throw ((Throwable)localObject2);
      label46:
      throw ((Throwable)localObject2);
    }
    
    public final j c()
    {
      return new j(null, C.e(new m[] { q.a(Integer.valueOf(2), null), q.a(Integer.valueOf(4), null), q.a(Integer.valueOf(9), null), q.a(Integer.valueOf(17), null), q.a(Integer.valueOf(341), null) }), C.e(new m[] { q.a(Integer.valueOf(102), null), q.a(Integer.valueOf(190), null), q.a(Integer.valueOf(412), null) }), null, null, null);
    }
    
    public final Map d(JSONObject paramJSONObject)
    {
      JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
      if ((localJSONArray1 != null) && (localJSONArray1.length() != 0))
      {
        HashMap localHashMap = new HashMap();
        int i = localJSONArray1.length();
        if (i > 0)
        {
          int k;
          for (int j = 0;; j = k)
          {
            k = j + 1;
            paramJSONObject = localJSONArray1.optJSONObject(j);
            if (paramJSONObject != null)
            {
              int m = paramJSONObject.optInt("code");
              if (m != 0)
              {
                JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
                if ((localJSONArray2 != null) && (localJSONArray2.length() > 0))
                {
                  HashSet localHashSet = new HashSet();
                  int n = localJSONArray2.length();
                  paramJSONObject = localHashSet;
                  if (n > 0)
                  {
                    int i1;
                    for (j = 0;; j = i1)
                    {
                      i1 = j + 1;
                      j = localJSONArray2.optInt(j);
                      if (j != 0) {
                        localHashSet.add(Integer.valueOf(j));
                      }
                      if (i1 >= n)
                      {
                        paramJSONObject = localHashSet;
                        break;
                      }
                    }
                  }
                }
                else
                {
                  paramJSONObject = null;
                }
                localHashMap.put(Integer.valueOf(m), paramJSONObject);
              }
            }
            if (k >= i) {
              break;
            }
          }
        }
        return localHashMap;
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     O1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */