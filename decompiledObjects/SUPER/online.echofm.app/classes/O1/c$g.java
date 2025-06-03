package O1;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class c$g
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    JSONArray localJSONArray = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray.length() == 0)
    {
      paramBundle.putStringArrayList(paramString, localArrayList);
      return;
    }
    int i = localJSONArray.length();
    if (i > 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        paramObject = localJSONArray.get(j);
        if (!(paramObject instanceof String)) {
          break;
        }
        localArrayList.add(paramObject);
        if (k >= i) {
          break label126;
        }
      }
      throw new IllegalArgumentException(Intrinsics.i("Unexpected type in an array: ", paramObject.getClass()));
    }
    label126:
    paramBundle.putStringArrayList(paramString, localArrayList);
  }
}

/* Location:
 * Qualified Name:     O1.c.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */