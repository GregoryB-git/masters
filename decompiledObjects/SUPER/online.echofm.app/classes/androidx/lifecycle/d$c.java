package androidx.lifecycle;

public enum d$c
{
  static
  {
    c localc1 = new c("DESTROYED", 0);
    o = localc1;
    c localc2 = new c("INITIALIZED", 1);
    p = localc2;
    c localc3 = new c("CREATED", 2);
    q = localc3;
    c localc4 = new c("STARTED", 3);
    r = localc4;
    c localc5 = new c("RESUMED", 4);
    s = localc5;
    t = new c[] { localc1, localc2, localc3, localc4, localc5 };
  }
  
  public boolean c(c paramc)
  {
    boolean bool;
    if (compareTo(paramc) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */