package l8;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
{
  public final HashMap a = new HashMap();
  public final int b = 64;
  public final int c;
  
  public e(int paramInt)
  {
    c = paramInt;
  }
  
  public static String a(int paramInt, String paramString)
  {
    String str = paramString;
    if (paramString != null)
    {
      paramString = paramString.trim();
      str = paramString;
      if (paramString.length() > paramInt) {
        str = paramString.substring(0, paramInt);
      }
    }
    return str;
  }
  
  public final boolean b(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      try
      {
        String str = a(c, paramString1);
        if ((a.size() >= b) && (!a.containsKey(str)))
        {
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>();
          paramString2.append("Ignored entry \"");
          paramString2.append(paramString1);
          paramString2.append("\" when adding custom keys. Maximum allowable: ");
          paramString2.append(b);
          Log.w("FirebaseCrashlytics", paramString2.toString(), null);
          return false;
        }
        paramString1 = a(c, paramString2);
        Object localObject = (String)a.get(str);
        boolean bool;
        if (localObject == null)
        {
          if (paramString1 == null) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else {
          bool = ((String)localObject).equals(paramString1);
        }
        if (bool) {
          return false;
        }
        localObject = a;
        if (paramString2 == null) {
          paramString1 = "";
        }
        ((HashMap)localObject).put(str, paramString1);
        return true;
      }
      finally
      {
        break label196;
      }
    }
    paramString1 = new java/lang/IllegalArgumentException;
    paramString1.<init>("Custom attribute key must not be null.");
    throw paramString1;
    label196:
    throw paramString1;
  }
  
  public final void c(Map<String, String> paramMap)
  {
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        String str = (String)paramMap.getKey();
        if (str != null)
        {
          str = a(c, str);
          if ((a.size() >= b) && (!a.containsKey(str)))
          {
            i++;
          }
          else
          {
            paramMap = (String)paramMap.getValue();
            HashMap localHashMap = a;
            if (paramMap == null) {
              paramMap = "";
            } else {
              paramMap = a(c, paramMap);
            }
            localHashMap.put(str, paramMap);
          }
        }
        else
        {
          paramMap = new java/lang/IllegalArgumentException;
          paramMap.<init>("Custom attribute key must not be null.");
          throw paramMap;
        }
      }
      if (i > 0)
      {
        paramMap = new java/lang/StringBuilder;
        paramMap.<init>();
        paramMap.append("Ignored ");
        paramMap.append(i);
        paramMap.append(" entries when adding custom keys. Maximum allowable: ");
        paramMap.append(b);
        Log.w("FirebaseCrashlytics", paramMap.toString(), null);
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     l8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */