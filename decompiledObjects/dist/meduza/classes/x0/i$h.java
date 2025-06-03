package x0;

import b.j;
import d.g;
import d.h;
import o.a;

public final class i$h
  implements a<Void, g>
{
  public i$h(i parami) {}
  
  public final Object apply(Object paramObject)
  {
    paramObject = (Void)paramObject;
    paramObject = a;
    t localt = mHost;
    if ((localt instanceof h)) {
      paramObject = ((h)localt).getActivityResultRegistry();
    } else {
      paramObject = ((i)paramObject).requireActivity().getActivityResultRegistry();
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     x0.i.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */