package ea;

import a9.g;

public enum m
  implements g
{
  public final int a;
  
  static
  {
    m localm1 = new m("EVENT_TYPE_UNKNOWN", 0, 0);
    m localm2 = new m("SESSION_START", 1, 1);
    b = localm2;
    c = new m[] { localm1, localm2 };
  }
  
  public m(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ea.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */