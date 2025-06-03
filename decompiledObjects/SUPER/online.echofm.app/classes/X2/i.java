package X2;

import W2.m;

public abstract class i
{
  public static void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      paramObject2 = new StringBuilder();
      ((StringBuilder)paramObject2).append("null value in entry: ");
      ((StringBuilder)paramObject2).append(paramObject1);
      ((StringBuilder)paramObject2).append("=null");
      throw new NullPointerException(((StringBuilder)paramObject2).toString());
    }
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("null key in entry: null=");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new NullPointerException(((StringBuilder)paramObject1).toString());
  }
  
  public static int b(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static void c(boolean paramBoolean)
  {
    m.p(paramBoolean, "no calls to next() since the last call to remove()");
  }
}

/* Location:
 * Qualified Name:     X2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */