package s0;

import f;

public final class u
  implements n0
{
  public static final u a = new u();
  
  public final m0 a(Class<?> paramClass)
  {
    if (v.class.isAssignableFrom(paramClass)) {
      try
      {
        localObject = (m0)v.l(paramClass.asSubclass(v.class)).k(v.f.c);
        return (m0)localObject;
      }
      catch (Exception localException)
      {
        localObject = f.l("Unable to get message info for ");
        ((StringBuilder)localObject).append(paramClass.getName());
        throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
      }
    }
    Object localObject = f.l("Unsupported message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public final boolean b(Class<?> paramClass)
  {
    return v.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     s0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */