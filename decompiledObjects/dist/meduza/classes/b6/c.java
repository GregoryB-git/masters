package b6;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import k6.a.d;
import m6.h;

public final class c
  implements a.d
{
  public static final c b = new c(new Bundle());
  public final Bundle a;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    Object localObject1 = (c)paramObject;
    paramObject = a;
    localObject1 = a;
    if ((paramObject != null) && (localObject1 != null))
    {
      if (((BaseBundle)paramObject).size() == ((BaseBundle)localObject1).size())
      {
        Object localObject2 = ((BaseBundle)paramObject).keySet();
        if (((Set)localObject2).containsAll(((BaseBundle)localObject1).keySet()))
        {
          localObject2 = ((Set)localObject2).iterator();
          String str;
          do
          {
            bool2 = bool1;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            str = (String)((Iterator)localObject2).next();
          } while (h.a(((BaseBundle)paramObject).get(str), ((BaseBundle)localObject1).get(str)));
        }
      }
    }
    else if (paramObject == localObject1)
    {
      bool2 = bool1;
      break label150;
    }
    boolean bool2 = false;
    label150:
    return bool2;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
}

/* Location:
 * Qualified Name:     b6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */