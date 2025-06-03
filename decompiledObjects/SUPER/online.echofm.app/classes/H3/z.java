package H3;

public enum z
{
  public final int o;
  
  static
  {
    z localz1 = new z("DEVELOPER", 0, 1);
    p = localz1;
    z localz2 = new z("USER_SIDELOAD", 1, 2);
    q = localz2;
    z localz3 = new z("TEST_DISTRIBUTION", 2, 3);
    r = localz3;
    z localz4 = new z("APP_STORE", 3, 4);
    s = localz4;
    t = new z[] { localz1, localz2, localz3, localz4 };
  }
  
  public z(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static z c(String paramString)
  {
    if (paramString != null) {
      paramString = s;
    } else {
      paramString = p;
    }
    return paramString;
  }
  
  public int e()
  {
    return o;
  }
  
  public String toString()
  {
    return Integer.toString(o);
  }
}

/* Location:
 * Qualified Name:     H3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */