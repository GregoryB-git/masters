package ma;

import f;

public final class k0$b
  implements r0
{
  public r0[] a;
  
  public k0$b(r0... paramVarArgs)
  {
    a = paramVarArgs;
  }
  
  public final q0 a(Class<?> paramClass)
  {
    for (localObject : a) {
      if (((r0)localObject).b(paramClass)) {
        return ((r0)localObject).a(paramClass);
      }
    }
    Object localObject = f.l("No factory is available for message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  public final boolean b(Class<?> paramClass)
  {
    r0[] arrayOfr0 = a;
    int i = arrayOfr0.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfr0[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     ma.k0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */