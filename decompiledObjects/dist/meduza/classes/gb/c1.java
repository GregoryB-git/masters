package gb;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public abstract class c1<T>
{
  public final Set<T> a = Collections.newSetFromMap(new IdentityHashMap());
  
  public abstract void a();
  
  public abstract void b();
  
  public final void c(T paramT, boolean paramBoolean)
  {
    int i = a.size();
    if (paramBoolean)
    {
      a.add(paramT);
      if (i == 0) {
        a();
      }
    }
    else if ((a.remove(paramT)) && (i == 1))
    {
      b();
    }
  }
}

/* Location:
 * Qualified Name:     gb.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */