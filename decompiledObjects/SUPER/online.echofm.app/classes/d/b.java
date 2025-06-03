package d;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b
  extends a
{
  public static Intent e(String[] paramArrayOfString)
  {
    return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
  }
  
  public Intent d(Context paramContext, String[] paramArrayOfString)
  {
    return e(paramArrayOfString);
  }
  
  public a.a f(Context paramContext, String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
    {
      t.a locala = new t.a();
      int i = paramArrayOfString.length;
      int j = 0;
      int k = 1;
      while (j < i)
      {
        String str = paramArrayOfString[j];
        boolean bool;
        if (x.a.a(paramContext, str) == 0) {
          bool = true;
        } else {
          bool = false;
        }
        locala.put(str, Boolean.valueOf(bool));
        if (!bool) {
          k = 0;
        }
        j++;
      }
      if (k != 0) {
        return new a.a(locala);
      }
      return null;
    }
    return new a.a(Collections.emptyMap());
  }
  
  public Map g(int paramInt, Intent paramIntent)
  {
    if (paramInt != -1) {
      return Collections.emptyMap();
    }
    if (paramIntent == null) {
      return Collections.emptyMap();
    }
    String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
    paramIntent = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
    if ((paramIntent != null) && (arrayOfString != null))
    {
      HashMap localHashMap = new HashMap();
      int i = arrayOfString.length;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        String str = arrayOfString[paramInt];
        boolean bool;
        if (paramIntent[paramInt] == 0) {
          bool = true;
        } else {
          bool = false;
        }
        localHashMap.put(str, Boolean.valueOf(bool));
      }
      return localHashMap;
    }
    return Collections.emptyMap();
  }
}

/* Location:
 * Qualified Name:     d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */