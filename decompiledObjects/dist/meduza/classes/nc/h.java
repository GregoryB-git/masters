package nc;

import dc.l;
import f;
import java.util.concurrent.Future;

public final class h
  extends i
{
  public final Object b;
  
  public final void h(Throwable paramThrowable)
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      if (paramThrowable != null) {
        ((Future)b).cancel(false);
      }
      return;
    }
    ((l)b).invoke(paramThrowable);
  }
  
  public final String toString()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      localStringBuilder = f.l("CancelFutureOnCancel[");
      localStringBuilder.append((Future)b);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
    StringBuilder localStringBuilder = f.l("InvokeOnCancel[");
    localStringBuilder.append(((l)b).getClass().getSimpleName());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(this));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */