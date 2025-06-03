package s0;

public enum n1
{
  public final o1 a;
  public final int b;
  
  static
  {
    n1 localn11 = new n1("DOUBLE", 0, o1.e, 1);
    n1 localn12 = new n1("FLOAT", 1, o1.d, 5);
    o1 localo11 = o1.c;
    n1 localn13 = new n1("INT64", 2, localo11, 0);
    n1 localn14 = new n1("UINT64", 3, localo11, 0);
    o1 localo12 = o1.b;
    n1 localn15 = new n1("INT32", 4, localo12, 0);
    n1 localn16 = new n1("FIXED64", 5, localo11, 1);
    n1 localn17 = new n1("FIXED32", 6, localo12, 5);
    n1 localn18 = new n1("BOOL", 7, o1.f, 0);
    a locala = new a();
    c = locala;
    Object localObject = o1.r;
    b localb = new b((o1)localObject);
    d = localb;
    localObject = new c((o1)localObject);
    e = (c)localObject;
    f = new n1[] { localn11, localn12, localn13, localn14, localn15, localn16, localn17, localn18, locala, localb, localObject, new d(o1.p), new n1("UINT32", 12, localo12, 0), new n1("ENUM", 13, o1.q, 0), new n1("SFIXED32", 14, localo12, 5), new n1("SFIXED64", 15, localo11, 1), new n1("SINT32", 16, localo12, 0), new n1("SINT64", 17, localo11, 0) };
  }
  
  public n1(o1 paramo1, int paramInt)
  {
    a = paramo1;
    b = paramInt;
  }
  
  public static enum a
  {
    public a()
    {
      super(8, o1.o, 2);
    }
  }
  
  public static enum b
  {
    public b()
    {
      super(9, paramo1, 3);
    }
  }
  
  public static enum c
  {
    public c()
    {
      super(10, paramo1, 2);
    }
  }
  
  public static enum d
  {
    public d()
    {
      super(11, paramo1, 2);
    }
  }
}

/* Location:
 * Qualified Name:     s0.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */