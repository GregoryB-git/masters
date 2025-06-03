package B3;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public final class o$b
{
  public final Executor a;
  public final List b = new ArrayList();
  public final List c = new ArrayList();
  public j d = j.a;
  
  public o$b(Executor paramExecutor)
  {
    a = paramExecutor;
  }
  
  public b b(c paramc)
  {
    c.add(paramc);
    return this;
  }
  
  public b c(ComponentRegistrar paramComponentRegistrar)
  {
    b.add(new p(paramComponentRegistrar));
    return this;
  }
  
  public b d(Collection paramCollection)
  {
    b.addAll(paramCollection);
    return this;
  }
  
  public o e()
  {
    return new o(a, b, c, d, null);
  }
  
  public b g(j paramj)
  {
    d = paramj;
    return this;
  }
}

/* Location:
 * Qualified Name:     B3.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */