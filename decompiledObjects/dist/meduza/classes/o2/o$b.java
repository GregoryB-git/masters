package o2;

public enum o$b
{
  static
  {
    b localb1 = new b("ENQUEUED", 0);
    a = localb1;
    b localb2 = new b("RUNNING", 1);
    b = localb2;
    b localb3 = new b("SUCCEEDED", 2);
    c = localb3;
    b localb4 = new b("FAILED", 3);
    d = localb4;
    b localb5 = new b("BLOCKED", 4);
    e = localb5;
    b localb6 = new b("CANCELLED", 5);
    f = localb6;
    o = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
  }
  
  public o$b() {}
  
  public final boolean f()
  {
    boolean bool;
    if ((this != c) && (this != d) && (this != f)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     o2.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */