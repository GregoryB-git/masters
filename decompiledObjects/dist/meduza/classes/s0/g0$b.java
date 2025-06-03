package s0;

import f;

public final class g0$b
  implements n0
{
  public n0[] a;
  
  public g0$b(n0... paramVarArgs)
  {
    a = paramVarArgs;
  }
  
  public final m0 a(Class<?> paramClass)
  {
    for (Object localObject2 : a) {
      if (((n0)localObject2).b(paramClass)) {
        return ((n0)localObject2).a(paramClass);
      }
    }
    ??? = f.l("No factory is available for message type: ");
    ((StringBuilder)???).append(paramClass.getName());
    throw new UnsupportedOperationException(((StringBuilder)???).toString());
  }
  
  public final boolean b(Class<?> paramClass)
  {
    n0[] arrayOfn0 = a;
    int i = arrayOfn0.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfn0[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     s0.g0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */