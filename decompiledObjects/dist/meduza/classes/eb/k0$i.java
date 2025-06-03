package eb;

import java.util.List;
import x6.b;

public abstract class k0$i
{
  public final u a()
  {
    List localList = b();
    boolean bool = true;
    if ((localList == null) || (localList.size() != 1)) {
      bool = false;
    }
    b.G(localList, "%s does not have exactly one group", bool);
    return (u)localList.get(0);
  }
  
  public abstract List<u> b();
  
  public abstract a c();
  
  public abstract d d();
  
  public abstract Object e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h(k0.k paramk);
  
  public abstract void i(List<u> paramList);
}

/* Location:
 * Qualified Name:     eb.k0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */