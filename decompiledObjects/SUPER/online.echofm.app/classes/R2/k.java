package R2;

public enum k
{
  public final char o;
  
  static
  {
    k localk1 = new k("UNSET", 0, '0');
    p = localk1;
    k localk2 = new k("REMOTE_DEFAULT", 1, '1');
    q = localk2;
    k localk3 = new k("REMOTE_DELEGATION", 2, '2');
    r = localk3;
    k localk4 = new k("MANIFEST", 3, '3');
    s = localk4;
    k localk5 = new k("INITIALIZATION", 4, '4');
    t = localk5;
    k localk6 = new k("API", 5, '5');
    u = localk6;
    k localk7 = new k("CHILD_ACCOUNT", 6, '6');
    v = localk7;
    k localk8 = new k("FAILSAFE", 7, '9');
    w = localk8;
    x = new k[] { localk1, localk2, localk3, localk4, localk5, localk6, localk7, localk8 };
  }
  
  public k(char paramChar)
  {
    o = ((char)paramChar);
  }
  
  public static k e(char paramChar)
  {
    for (k localk : ) {
      if (o == paramChar) {
        return localk;
      }
    }
    return p;
  }
}

/* Location:
 * Qualified Name:     R2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */