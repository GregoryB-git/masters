package ma;

public enum v1
{
  public final w1 a;
  public final int b;
  
  static
  {
    v1 localv11 = new v1("DOUBLE", 0, w1.e, 1);
    v1 localv12 = new v1("FLOAT", 1, w1.d, 5);
    w1 localw11 = w1.c;
    v1 localv13 = new v1("INT64", 2, localw11, 0);
    v1 localv14 = new v1("UINT64", 3, localw11, 0);
    w1 localw12 = w1.b;
    v1 localv15 = new v1("INT32", 4, localw12, 0);
    v1 localv16 = new v1("FIXED64", 5, localw11, 1);
    v1 localv17 = new v1("FIXED32", 6, localw12, 5);
    v1 localv18 = new v1("BOOL", 7, w1.f, 0);
    a locala = new a();
    c = locala;
    Object localObject = w1.r;
    b localb = new b((w1)localObject);
    d = localb;
    localObject = new c((w1)localObject);
    e = (c)localObject;
    f = new v1[] { localv11, localv12, localv13, localv14, localv15, localv16, localv17, localv18, locala, localb, localObject, new d(w1.p), new v1("UINT32", 12, localw12, 0), new v1("ENUM", 13, w1.q, 0), new v1("SFIXED32", 14, localw12, 5), new v1("SFIXED64", 15, localw11, 1), new v1("SINT32", 16, localw12, 0), new v1("SINT64", 17, localw11, 0) };
  }
  
  public v1(w1 paramw1, int paramInt)
  {
    a = paramw1;
    b = paramInt;
  }
  
  public enum a
  {
    public a()
    {
      super(8, w1.o, 2);
    }
  }
  
  public enum b
  {
    public b()
    {
      super(9, this$1, 3);
    }
  }
  
  public enum c
  {
    public c()
    {
      super(10, this$1, 2);
    }
  }
  
  public enum d
  {
    public d()
    {
      super(11, this$1, 2);
    }
  }
}

/* Location:
 * Qualified Name:     ma.v1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */