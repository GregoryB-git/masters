package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class o1$b
  extends n1
{
  public final o1 e;
  public final o1.c f;
  public final p o;
  public final Object p;
  
  public o1$b(o1 paramo1, o1.c paramc, p paramp, Object paramObject)
  {
    e = paramo1;
    f = paramc;
    o = paramp;
    p = paramObject;
  }
  
  public final void l(Throwable paramThrowable)
  {
    o1 localo1 = e;
    o1.c localc = f;
    p localp = o;
    paramThrowable = p;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o1.a;
    localo1.getClass();
    localp = o1.O(localp);
    if ((localp == null) || (!localo1.Y(localc, localp, paramThrowable))) {
      localo1.p(localo1.y(localc, paramThrowable));
    }
  }
}

/* Location:
 * Qualified Name:     nc.o1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */