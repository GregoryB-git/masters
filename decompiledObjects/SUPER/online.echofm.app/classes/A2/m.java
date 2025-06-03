package A2;

import java.util.Arrays;
import java.util.List;

public abstract class m
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramObject1 != paramObject2) {
      if (paramObject1 != null)
      {
        if (paramObject1.equals(paramObject2)) {
          bool2 = bool1;
        } else {
          return false;
        }
      }
      else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public static int b(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static a c(Object paramObject)
  {
    return new a(paramObject, null);
  }
  
  public static final class a
  {
    public final List a;
    public final Object b;
    
    public a a(String paramString, Object paramObject)
    {
      List localList = a;
      n.i(paramString);
      String str = String.valueOf(paramObject);
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append(paramString);
      ((StringBuilder)paramObject).append("=");
      ((StringBuilder)paramObject).append(str);
      localList.add(((StringBuilder)paramObject).toString());
      return this;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100);
      localStringBuilder.append(b.getClass().getSimpleName());
      localStringBuilder.append('{');
      int i = a.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)a.get(j));
        if (j < i - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     A2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */