package ba;

import b9.c;

public enum a$c
  implements c
{
  public final int a;
  
  static
  {
    c localc1 = new c("UNKNOWN_OS", 0, 0);
    c localc2 = new c("ANDROID", 1, 1);
    b = localc2;
    c = new c[] { localc1, localc2, new c("IOS", 2, 2), new c("WEB", 3, 3) };
  }
  
  public a$c(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ba.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */