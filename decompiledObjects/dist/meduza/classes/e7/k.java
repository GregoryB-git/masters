package e7;

public enum k
{
  public final char a;
  
  static
  {
    k localk1 = new k("UNSET", 0, '0');
    b = localk1;
    k localk2 = new k("REMOTE_DEFAULT", 1, '1');
    c = localk2;
    k localk3 = new k("REMOTE_DELEGATION", 2, '2');
    d = localk3;
    k localk4 = new k("MANIFEST", 3, '3');
    e = localk4;
    k localk5 = new k("INITIALIZATION", 4, '4');
    f = localk5;
    k localk6 = new k("API", 5, '5');
    o = localk6;
    k localk7 = new k("CHILD_ACCOUNT", 6, '6');
    k localk8 = new k("TCF", 7, '7');
    p = localk8;
    k localk9 = new k("REMOTE_ENFORCED_DEFAULT", 8, '8');
    q = localk9;
    k localk10 = new k("FAILSAFE", 9, '9');
    r = localk10;
    s = new k[] { localk1, localk2, localk3, localk4, localk5, localk6, localk7, localk8, localk9, localk10 };
  }
  
  public k(char paramChar)
  {
    a = ((char)paramChar);
  }
}

/* Location:
 * Qualified Name:     e7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */