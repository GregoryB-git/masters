package g9;

public enum l$a
{
  public final String a;
  
  static
  {
    a locala1 = new a("LESS_THAN", 0, "<");
    b = locala1;
    a locala2 = new a("LESS_THAN_OR_EQUAL", 1, "<=");
    c = locala2;
    a locala3 = new a("EQUAL", 2, "==");
    d = locala3;
    a locala4 = new a("NOT_EQUAL", 3, "!=");
    e = locala4;
    a locala5 = new a("GREATER_THAN", 4, ">");
    f = locala5;
    a locala6 = new a("GREATER_THAN_OR_EQUAL", 5, ">=");
    o = locala6;
    a locala7 = new a("ARRAY_CONTAINS", 6, "array_contains");
    p = locala7;
    a locala8 = new a("ARRAY_CONTAINS_ANY", 7, "array_contains_any");
    q = locala8;
    a locala9 = new a("IN", 8, "in");
    r = locala9;
    a locala10 = new a("NOT_IN", 9, "not_in");
    s = locala10;
    t = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10 };
  }
  
  public l$a(String paramString)
  {
    a = paramString;
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     g9.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */