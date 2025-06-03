package p6;

import W5.f;

public abstract class a0
  extends F
{
  public long q;
  public boolean r;
  public f s;
  
  public final void H(boolean paramBoolean)
  {
    long l = q - J(paramBoolean);
    q = l;
    if (l > 0L) {
      return;
    }
    if (r) {
      shutdown();
    }
  }
  
  public final long J(boolean paramBoolean)
  {
    long l;
    if (paramBoolean) {
      l = 4294967296L;
    } else {
      l = 1L;
    }
    return l;
  }
  
  public final void K(U paramU)
  {
    f localf1 = s;
    f localf2 = localf1;
    if (localf1 == null)
    {
      localf2 = new f();
      s = localf2;
    }
    localf2.g(paramU);
  }
  
  public long L()
  {
    f localf = s;
    long l = Long.MAX_VALUE;
    if (localf == null) {
      return Long.MAX_VALUE;
    }
    if (!localf.isEmpty()) {
      l = 0L;
    }
    return l;
  }
  
  public final void M(boolean paramBoolean)
  {
    q += J(paramBoolean);
    if (!paramBoolean) {
      r = true;
    }
  }
  
  public final boolean O()
  {
    long l = q;
    boolean bool = true;
    if (l < J(true)) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean P()
  {
    f localf = s;
    boolean bool;
    if (localf != null) {
      bool = localf.isEmpty();
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract long Q();
  
  public final boolean R()
  {
    Object localObject = s;
    if (localObject == null) {
      return false;
    }
    localObject = (U)((f)localObject).W();
    if (localObject == null) {
      return false;
    }
    ((U)localObject).run();
    return true;
  }
  
  public boolean S()
  {
    return false;
  }
  
  public abstract void shutdown();
}

/* Location:
 * Qualified Name:     p6.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */