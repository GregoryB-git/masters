package ma;

import f;

public final class v
  implements r0
{
  public static final v a = new v();
  
  public final q0 a(Class<?> paramClass)
  {
    if (w.class.isAssignableFrom(paramClass)) {
      try
      {
        q0 localq0 = (q0)w.u(paramClass.asSubclass(w.class)).t(w.f.c);
        return localq0;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder2 = f.l("Unable to get message info for ");
        localStringBuilder2.append(paramClass.getName());
        throw new RuntimeException(localStringBuilder2.toString(), localException);
      }
    }
    StringBuilder localStringBuilder1 = f.l("Unsupported message type: ");
    localStringBuilder1.append(paramClass.getName());
    throw new IllegalArgumentException(localStringBuilder1.toString());
  }
  
  public final boolean b(Class<?> paramClass)
  {
    return w.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     ma.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */