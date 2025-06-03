package h3;

public enum b$b
{
  static
  {
    a locala = new a("ALGORITHM_NOT_FIPS", 0);
    o = locala;
    b localb = new b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
    p = localb;
    q = new b[] { locala, localb };
  }
  
  public abstract boolean c();
  
  public enum a
  {
    public a()
    {
      super(paramInt, null);
    }
    
    public boolean c()
    {
      return b.c() ^ true;
    }
  }
  
  public enum b
  {
    public b()
    {
      super(paramInt, null);
    }
    
    public boolean c()
    {
      boolean bool;
      if ((b.c()) && (!b.b())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     h3.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */