package ea;

import a9.g;

public enum r
  implements g
{
  public final int a;
  
  static
  {
    r localr1 = new r("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    r localr2 = new r("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    r localr3 = new r("LOG_ENVIRONMENT_STAGING", 2, 2);
    r localr4 = new r("LOG_ENVIRONMENT_PROD", 3, 3);
    b = localr4;
    c = new r[] { localr1, localr2, localr3, localr4 };
  }
  
  public r(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ea.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */