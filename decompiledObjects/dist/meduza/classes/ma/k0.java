package ma;

import f;

public final class k0
{
  public static final a b = new a();
  public final r0 a;
  
  public k0()
  {
    Object localObject2 = a0.a;
    a = ((r0)localObject1);
  }
  
  public final class a
    implements r0
  {
    public final q0 a(Class<?> paramClass)
    {
      throw new IllegalStateException("This should never be called.");
    }
    
    public final boolean b(Class<?> paramClass)
    {
      return false;
    }
  }
  
  public static final class b
    implements r0
  {
    public r0[] a;
    
    public b(r0... paramVarArgs)
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
}

/* Location:
 * Qualified Name:     ma.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */