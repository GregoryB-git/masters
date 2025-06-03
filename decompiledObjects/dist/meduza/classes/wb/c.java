package wb;

import ec.i;
import ub.e;
import ub.f;
import ub.f.a;
import ub.h;

public abstract class c
  extends a
{
  private final h _context;
  private transient e<Object> intercepted;
  
  public c(e<Object> parame)
  {
    this(parame, localh);
  }
  
  public c(e<Object> parame, h paramh)
  {
    super(parame);
    _context = paramh;
  }
  
  public h getContext()
  {
    h localh = _context;
    i.b(localh);
    return localh;
  }
  
  public final e<Object> intercepted()
  {
    Object localObject1 = intercepted;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = (f)getContext().get(f.a.a);
      if (localObject2 != null)
      {
        localObject1 = ((f)localObject2).C(this);
        localObject2 = localObject1;
        if (localObject1 != null) {}
      }
      else
      {
        localObject2 = this;
      }
      intercepted = ((e)localObject2);
    }
    return (e<Object>)localObject2;
  }
  
  public void releaseIntercepted()
  {
    e locale = intercepted;
    if ((locale != null) && (locale != this))
    {
      Object localObject = getContext();
      int i = f.n;
      localObject = ((h)localObject).get(f.a.a);
      i.b(localObject);
      ((f)localObject).Q(locale);
    }
    intercepted = b.a;
  }
}

/* Location:
 * Qualified Name:     wb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */