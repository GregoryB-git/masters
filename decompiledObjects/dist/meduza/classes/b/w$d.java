package b;

import dc.a;

public final class w$d
  implements c
{
  public final p a;
  
  public w$d(p paramp)
  {
    p localp;
    a = localp;
  }
  
  public final void cancel()
  {
    b.c.remove(a);
    if (ec.i.a(b.d, a))
    {
      a.handleOnBackCancelled();
      b.d = null;
    }
    a.removeCancellable(this);
    a locala = a.getEnabledChangedCallback$activity_release();
    if (locala != null) {
      locala.invoke();
    }
    a.setEnabledChangedCallback$activity_release(null);
  }
}

/* Location:
 * Qualified Name:     b.w.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */