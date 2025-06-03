package va;

import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class t
{
  public final String a;
  public final List<Object> b;
  
  public t(String paramString, List<Object> paramList)
  {
    a = paramString;
    paramString = paramList;
    if (paramList == null) {
      paramString = new ArrayList();
    }
    b = paramString;
  }
  
  public static Object a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = paramObject;
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      localObject = new byte[((List)paramObject).size()];
      for (int i = 0; i < ((List)paramObject).size(); i++) {
        localObject[i] = ((byte)(byte)((Integer)((List)paramObject).get(i)).intValue());
      }
    }
    return localObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof t))
    {
      paramObject = (t)paramObject;
      String str = a;
      if (str != null)
      {
        if (!str.equals(a)) {
          return false;
        }
      }
      else if (a != null) {
        return false;
      }
      if (b.size() != b.size()) {
        return false;
      }
      for (int i = 0; i < b.size(); i++) {
        if (((b.get(i) instanceof byte[])) && ((b.get(i) instanceof byte[])))
        {
          if (!Arrays.equals((byte[])b.get(i), (byte[])b.get(i))) {
            return false;
          }
        }
        else if (!b.get(i).equals(b.get(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    Object localObject = b;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = f.l(" ");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     va.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */