package T3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e
{
  public static void a(boolean paramBoolean)
  {
    b(paramBoolean, "", new Object[0]);
  }
  
  public static void b(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("hardAssert failed: ");
    localStringBuilder.append(String.format(paramString, paramVarArgs));
    throw new AssertionError(localStringBuilder.toString());
  }
  
  public static Long c(Object paramObject)
  {
    if ((paramObject instanceof Integer)) {
      return Long.valueOf(((Integer)paramObject).intValue());
    }
    if ((paramObject instanceof Long)) {
      return (Long)paramObject;
    }
    return null;
  }
  
  public static String d(List paramList)
  {
    if (paramList.isEmpty()) {
      return "/";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramList = paramList.iterator();
    for (int i = 1; paramList.hasNext(); i = 0)
    {
      String str = (String)paramList.next();
      if (i == 0) {
        localStringBuilder.append("/");
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public static List e(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("/", -1);
    for (int i = 0; i < paramString.length; i++) {
      if (!paramString[i].isEmpty()) {
        localArrayList.add(paramString[i]);
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     T3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */