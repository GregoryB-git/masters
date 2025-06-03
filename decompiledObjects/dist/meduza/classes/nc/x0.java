package nc;

import sb.i;

public abstract class x0
  extends a0
{
  public long c;
  public boolean d;
  public i<p0<?>> e;
  
  public final void C0(boolean paramBoolean)
  {
    long l1 = c;
    if (paramBoolean) {
      l2 = 4294967296L;
    } else {
      l2 = 1L;
    }
    long l2 = l1 - l2;
    c = l2;
    if (l2 > 0L) {
      return;
    }
    if (d) {
      shutdown();
    }
  }
  
  public final void D0(p0<?> paramp0)
  {
    i locali1 = e;
    i locali2 = locali1;
    if (locali1 == null)
    {
      locali2 = new i();
      e = locali2;
    }
    locali2.addLast(paramp0);
  }
  
  public final void E0(boolean paramBoolean)
  {
    long l1 = c;
    long l2;
    if (paramBoolean) {
      l2 = 4294967296L;
    } else {
      l2 = 1L;
    }
    c = (l2 + l1);
    if (!paramBoolean) {
      d = true;
    }
  }
  
  public final boolean F0()
  {
    boolean bool;
    if (c >= 4294967296L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long G0()
  {
    if (!H0()) {
      return Long.MAX_VALUE;
    }
    return 0L;
  }
  
  public final boolean H0()
  {
    Object localObject = e;
    if (localObject == null) {
      return false;
    }
    if (((i)localObject).isEmpty()) {
      localObject = null;
    } else {
      localObject = ((i)localObject).removeFirst();
    }
    localObject = (p0)localObject;
    if (localObject == null) {
      return false;
    }
    ((p0)localObject).run();
    return true;
  }
  
  public void shutdown() {}
}

/* Location:
 * Qualified Name:     nc.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */