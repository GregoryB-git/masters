package Y1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m$a
{
  public final m.b b(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.getJSONObject("permissions").getJSONArray("data");
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    int i = paramJSONObject.length();
    if (i > 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        Object localObject = paramJSONObject.optJSONObject(j);
        String str = ((JSONObject)localObject).optString("permission");
        Intrinsics.checkNotNullExpressionValue(str, "permission");
        if ((str.length() != 0) && (!Intrinsics.a(str, "installed")))
        {
          localObject = ((JSONObject)localObject).optString("status");
          if (localObject != null)
          {
            j = ((String)localObject).hashCode();
            if (j != -1309235419)
            {
              if (j != 280295099)
              {
                if ((j == 568196142) && (((String)localObject).equals("declined"))) {
                  localArrayList2.add(str);
                }
              }
              else if (((String)localObject).equals("granted")) {
                localArrayList1.add(str);
              }
            }
            else if (((String)localObject).equals("expired")) {
              localArrayList3.add(str);
            }
          }
        }
        if (k >= i) {
          break;
        }
      }
    }
    return new m.b(localArrayList1, localArrayList2, localArrayList3);
  }
}

/* Location:
 * Qualified Name:     Y1.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */