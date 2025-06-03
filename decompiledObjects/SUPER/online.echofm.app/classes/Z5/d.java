package Z5;

import X5.e;
import X5.g;
import X5.g.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class d
  extends a
{
  private final g _context;
  private transient X5.d intercepted;
  
  public d(X5.d paramd)
  {
    this(paramd, localg);
  }
  
  public d(X5.d paramd, g paramg)
  {
    super(paramd);
    _context = paramg;
  }
  
  @NotNull
  public g getContext()
  {
    g localg = _context;
    Intrinsics.b(localg);
    return localg;
  }
  
  @NotNull
  public final X5.d intercepted()
  {
    X5.d locald = intercepted;
    Object localObject = locald;
    if (locald == null)
    {
      localObject = (e)getContext().b(e.c);
      if (localObject != null)
      {
        locald = ((e)localObject).i(this);
        localObject = locald;
        if (locald != null) {}
      }
      else
      {
        localObject = this;
      }
      intercepted = ((X5.d)localObject);
    }
    return (X5.d)localObject;
  }
  
  public void releaseIntercepted()
  {
    X5.d locald = intercepted;
    if ((locald != null) && (locald != this))
    {
      g.b localb = getContext().b(e.c);
      Intrinsics.b(localb);
      ((e)localb).C(locald);
    }
    intercepted = c.o;
  }
}

/* Location:
 * Qualified Name:     Z5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */