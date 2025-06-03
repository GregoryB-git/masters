package O1;

import W5.m;
import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r
{
  public static final a w = new a(null);
  public final boolean a;
  public final String b;
  public final boolean c;
  public final int d;
  public final EnumSet e;
  public final Map f;
  public final boolean g;
  public final j h;
  public final String i;
  public final String j;
  public final boolean k;
  public final boolean l;
  public final JSONArray m;
  public final String n;
  public final boolean o;
  public final boolean p;
  public final String q;
  public final String r;
  public final String s;
  public final JSONArray t;
  public final JSONArray u;
  public final Map v;
  
  public r(boolean paramBoolean1, String paramString1, boolean paramBoolean2, int paramInt, EnumSet paramEnumSet, Map paramMap1, boolean paramBoolean3, j paramj, String paramString2, String paramString3, boolean paramBoolean4, boolean paramBoolean5, JSONArray paramJSONArray1, String paramString4, boolean paramBoolean6, boolean paramBoolean7, String paramString5, String paramString6, String paramString7, JSONArray paramJSONArray2, JSONArray paramJSONArray3, Map paramMap2)
  {
    a = paramBoolean1;
    b = paramString1;
    c = paramBoolean2;
    d = paramInt;
    e = paramEnumSet;
    f = paramMap1;
    g = paramBoolean3;
    h = paramj;
    i = paramString2;
    j = paramString3;
    k = paramBoolean4;
    l = paramBoolean5;
    m = paramJSONArray1;
    n = paramString4;
    o = paramBoolean6;
    p = paramBoolean7;
    q = paramString5;
    r = paramString6;
    s = paramString7;
    t = paramJSONArray2;
    u = paramJSONArray3;
    v = paramMap2;
  }
  
  public final boolean a()
  {
    return g;
  }
  
  public final boolean b()
  {
    return l;
  }
  
  public final j c()
  {
    return h;
  }
  
  public final JSONArray d()
  {
    return m;
  }
  
  public final boolean e()
  {
    return k;
  }
  
  public final JSONArray f()
  {
    return u;
  }
  
  public final JSONArray g()
  {
    return t;
  }
  
  public final String h()
  {
    return q;
  }
  
  public final String i()
  {
    return s;
  }
  
  public final String j()
  {
    return n;
  }
  
  public final int k()
  {
    return d;
  }
  
  public final EnumSet l()
  {
    return e;
  }
  
  public final String m()
  {
    return r;
  }
  
  public final boolean n()
  {
    return a;
  }
  
  public static final class a {}
  
  public static final class b
  {
    public static final a e = new a(null);
    public final String a;
    public final String b;
    public final Uri c;
    public final int[] d;
    
    public b(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
    {
      a = paramString1;
      b = paramString2;
      c = paramUri;
      d = paramArrayOfInt;
    }
    
    public final String a()
    {
      return a;
    }
    
    public final String b()
    {
      return b;
    }
    
    public static final class a
    {
      public final r.b a(JSONObject paramJSONObject)
      {
        Intrinsics.checkNotNullParameter(paramJSONObject, "dialogConfigJSON");
        String str1 = paramJSONObject.optString("name");
        boolean bool = P.c0(str1);
        Uri localUri = null;
        if (bool) {
          return null;
        }
        Intrinsics.checkNotNullExpressionValue(str1, "dialogNameWithFeature");
        Object localObject = i.V(str1, new String[] { "|" }, false, 0, 6, null);
        if (((List)localObject).size() != 2) {
          return null;
        }
        str1 = (String)m.r((List)localObject);
        localObject = (String)m.z((List)localObject);
        if ((!P.c0(str1)) && (!P.c0((String)localObject)))
        {
          String str2 = paramJSONObject.optString("url");
          if (!P.c0(str2)) {
            localUri = Uri.parse(str2);
          }
          return new r.b(str1, (String)localObject, localUri, b(paramJSONObject.optJSONArray("versions")), null);
        }
        return null;
      }
      
      public final int[] b(JSONArray paramJSONArray)
      {
        int[] arrayOfInt2;
        if (paramJSONArray != null)
        {
          int i = paramJSONArray.length();
          int[] arrayOfInt1 = new int[i];
          Object localObject = arrayOfInt1;
          if (i > 0)
          {
            int k;
            for (int j = 0;; j = k)
            {
              k = j + 1;
              int m = -1;
              int n = paramJSONArray.optInt(j, -1);
              int i1 = n;
              if (n == -1)
              {
                localObject = paramJSONArray.optString(j);
                i1 = n;
                if (!P.c0((String)localObject)) {
                  try
                  {
                    Intrinsics.checkNotNullExpressionValue(localObject, "versionString");
                    i1 = Integer.parseInt((String)localObject);
                  }
                  catch (NumberFormatException localNumberFormatException)
                  {
                    P.i0("FacebookSDK", localNumberFormatException);
                    i1 = m;
                  }
                }
              }
              arrayOfInt1[j] = i1;
              if (k >= i)
              {
                arrayOfInt2 = arrayOfInt1;
                break;
              }
            }
          }
        }
        else
        {
          arrayOfInt2 = null;
        }
        return arrayOfInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     O1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */