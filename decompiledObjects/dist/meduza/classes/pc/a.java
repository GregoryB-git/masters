package pc;

public enum a
{
  static
  {
    a locala1 = new a("SUSPEND", 0);
    a = locala1;
    a locala2 = new a("DROP_OLDEST", 1);
    b = locala2;
    a locala3 = new a("DROP_LATEST", 2);
    c = locala3;
    d = new a[] { locala1, locala2, locala3 };
  }
  
  public a() {}
}

/* Location:
 * Qualified Name:     pc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */