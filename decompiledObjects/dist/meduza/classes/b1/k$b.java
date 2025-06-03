package b1;

public enum k$b
{
  static
  {
    b localb1 = new b("DESTROYED", 0);
    a = localb1;
    b localb2 = new b("INITIALIZED", 1);
    b = localb2;
    b localb3 = new b("CREATED", 2);
    c = localb3;
    b localb4 = new b("STARTED", 3);
    d = localb4;
    b localb5 = new b("RESUMED", 4);
    e = localb5;
    f = new b[] { localb1, localb2, localb3, localb4, localb5 };
  }
  
  public k$b() {}
  
  public final boolean f(b paramb)
  {
    boolean bool;
    if (compareTo(paramb) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     b1.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */