package M4;

public enum k
{
  public long o;
  
  static
  {
    a locala = new a("TERABYTES", 0, 1099511627776L);
    p = locala;
    b localb = new b("GIGABYTES", 1, 1073741824L);
    q = localb;
    c localc = new c("MEGABYTES", 2, 1048576L);
    r = localc;
    d locald = new d("KILOBYTES", 3, 1024L);
    s = locald;
    e locale = new e("BYTES", 4, 1L);
    t = locale;
    u = new k[] { locala, localb, localc, locald, locale };
  }
  
  public k(long paramLong)
  {
    o = paramLong;
  }
  
  public long c(long paramLong)
  {
    return paramLong * o / so;
  }
  
  public enum a
  {
    public a(long paramLong)
    {
      super(paramInt, paramLong, null);
    }
  }
  
  public enum b
  {
    public b(long paramLong)
    {
      super(paramInt, paramLong, null);
    }
  }
  
  public enum c
  {
    public c(long paramLong)
    {
      super(paramInt, paramLong, null);
    }
  }
  
  public enum d
  {
    public d(long paramLong)
    {
      super(paramInt, paramLong, null);
    }
  }
  
  public enum e
  {
    public e(long paramLong)
    {
      super(paramInt, paramLong, null);
    }
  }
}

/* Location:
 * Qualified Name:     M4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */