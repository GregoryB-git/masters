package X2;

public abstract class O
{
  public static Object a(Object paramObject, int paramInt)
  {
    if (paramObject != null) {
      return paramObject;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("at index ");
    ((StringBuilder)paramObject).append(paramInt);
    throw new NullPointerException(((StringBuilder)paramObject).toString());
  }
  
  public static Object[] b(Object... paramVarArgs)
  {
    c(paramVarArgs, paramVarArgs.length);
    return paramVarArgs;
  }
  
  public static Object[] c(Object[] paramArrayOfObject, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      a(paramArrayOfObject[i], i);
    }
    return paramArrayOfObject;
  }
  
  public static Object[] d(Object[] paramArrayOfObject, int paramInt)
  {
    return Q.b(paramArrayOfObject, paramInt);
  }
}

/* Location:
 * Qualified Name:     X2.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */