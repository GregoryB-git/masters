package W2;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class r
{
  public static String a(String paramString, Object... paramVarArgs)
  {
    String str = String.valueOf(paramString);
    int i = 0;
    if (paramVarArgs == null)
    {
      paramString = new Object[1];
      paramString[0] = "(Object[])null";
    }
    else
    {
      for (j = 0;; j++)
      {
        paramString = paramVarArgs;
        if (j >= paramVarArgs.length) {
          break;
        }
        paramVarArgs[j] = b(paramVarArgs[j]);
      }
    }
    paramVarArgs = new StringBuilder(str.length() + paramString.length * 16);
    int k = 0;
    for (int j = i; j < paramString.length; j++)
    {
      i = str.indexOf("%s", k);
      if (i == -1) {
        break;
      }
      paramVarArgs.append(str, k, i);
      paramVarArgs.append(paramString[j]);
      k = i + 2;
    }
    paramVarArgs.append(str, k, str.length());
    if (j < paramString.length)
    {
      paramVarArgs.append(" [");
      k = j + 1;
      paramVarArgs.append(paramString[j]);
      for (j = k; j < paramString.length; j++)
      {
        paramVarArgs.append(", ");
        paramVarArgs.append(paramString[j]);
      }
      paramVarArgs.append(']');
    }
    return paramVarArgs.toString();
  }
  
  public static String b(Object paramObject)
  {
    if (paramObject == null) {
      return "null";
    }
    try
    {
      String str = paramObject.toString();
      return str;
    }
    catch (Exception localException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramObject.getClass().getName());
      ((StringBuilder)localObject).append('@');
      ((StringBuilder)localObject).append(Integer.toHexString(System.identityHashCode(paramObject)));
      paramObject = ((StringBuilder)localObject).toString();
      localObject = Logger.getLogger("com.google.common.base.Strings");
      Level localLevel = Level.WARNING;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Exception during lenientFormat for ");
      localStringBuilder.append((String)paramObject);
      ((Logger)localObject).log(localLevel, localStringBuilder.toString(), localException);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("<");
      ((StringBuilder)localObject).append((String)paramObject);
      ((StringBuilder)localObject).append(" threw ");
      ((StringBuilder)localObject).append(localException.getClass().getName());
      ((StringBuilder)localObject).append(">");
      return ((StringBuilder)localObject).toString();
    }
  }
}

/* Location:
 * Qualified Name:     W2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */