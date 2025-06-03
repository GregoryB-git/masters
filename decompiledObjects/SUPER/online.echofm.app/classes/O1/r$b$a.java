package O1;

import W5.m;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r$b$a
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

/* Location:
 * Qualified Name:     O1.r.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */