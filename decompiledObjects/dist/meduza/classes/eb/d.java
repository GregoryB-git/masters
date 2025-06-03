package eb;

public abstract class d
{
  public abstract void a(a parama, String paramString);
  
  public abstract void b(a parama, String paramString, Object... paramVarArgs);
  
  public static enum a
  {
    static
    {
      a locala1 = new a("DEBUG", 0);
      a = locala1;
      a locala2 = new a("INFO", 1);
      b = locala2;
      a locala3 = new a("WARNING", 2);
      c = locala3;
      a locala4 = new a("ERROR", 3);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     eb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */