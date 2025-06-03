package nc;

import sc.n;

public abstract class s1
  extends a0
{
  public abstract s1 C0();
  
  public String toString()
  {
    Object localObject1 = r0.a;
    localObject1 = n.a;
    Object localObject2;
    if (this == localObject1)
    {
      localObject1 = "Dispatchers.Main";
    }
    else
    {
      try
      {
        localObject1 = ((s1)localObject1).C0();
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        localObject2 = null;
      }
      if (this == localObject2) {
        localObject2 = "Dispatchers.Main.immediate";
      } else {
        localObject2 = null;
      }
    }
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(getClass().getSimpleName());
      ((StringBuilder)localObject2).append('@');
      ((StringBuilder)localObject2).append(g0.b(this));
      localObject3 = ((StringBuilder)localObject2).toString();
    }
    return (String)localObject3;
  }
}

/* Location:
 * Qualified Name:     nc.s1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */