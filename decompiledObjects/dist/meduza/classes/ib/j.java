package ib;

public enum j
{
  public final String a;
  
  static
  {
    j localj1 = new j("HTTP_1_0", 0, "http/1.0");
    b = localj1;
    j localj2 = new j("HTTP_1_1", 1, "http/1.1");
    c = localj2;
    j localj3 = new j("SPDY_3", 2, "spdy/3.1");
    d = localj3;
    j localj4 = new j("HTTP_2", 3, "h2");
    e = localj4;
    f = new j[] { localj1, localj2, localj3, localj4 };
  }
  
  public j(String paramString)
  {
    a = paramString;
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ib.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */