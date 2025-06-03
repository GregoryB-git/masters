package l6;

import j6.e;

public final class v
  extends e1
{
  public final r.d e = new r.d();
  public final d f;
  
  public v(g paramg, d paramd, e parame)
  {
    super(paramg, parame);
    f = paramd;
    mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
  }
  
  public final void onResume()
  {
    super.onResume();
    if (!e.isEmpty()) {
      f.a(this);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    if (!e.isEmpty()) {
      f.a(this);
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    d locald = f;
    locald.getClass();
    synchronized (d.z)
    {
      if (s == this)
      {
        s = null;
        t.clear();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     l6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */