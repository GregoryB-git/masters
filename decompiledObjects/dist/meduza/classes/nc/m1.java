package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class m1
  extends o1
{
  public final boolean c;
  
  public m1(j1 paramj1)
  {
    super(true);
    J(paramj1);
    paramj1 = (o)o1.b.get(this);
    if ((paramj1 instanceof p)) {
      paramj1 = (p)paramj1;
    } else {
      paramj1 = null;
    }
    if (paramj1 != null) {
      do
      {
        paramj1 = paramj1.m();
        if (paramj1.B()) {
          break;
        }
        paramj1 = (o)o1.b.get(paramj1);
        if ((paramj1 instanceof p)) {
          paramj1 = (p)paramj1;
        } else {
          paramj1 = null;
        }
      } while (paramj1 != null);
    }
    bool = false;
    c = bool;
  }
  
  public final boolean B()
  {
    return c;
  }
  
  public final boolean D()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     nc.m1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */