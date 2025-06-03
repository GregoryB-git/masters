package ba;

import b9.c;

public enum a$a
  implements c
{
  public final int a;
  
  static
  {
    a locala1 = new a("UNKNOWN_EVENT", 0, 0);
    a locala2 = new a("MESSAGE_DELIVERED", 1, 1);
    b = locala2;
    c = new a[] { locala1, locala2, new a("MESSAGE_OPEN", 2, 2) };
  }
  
  public a$a(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ba.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */