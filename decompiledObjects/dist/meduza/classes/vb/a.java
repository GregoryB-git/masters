package vb;

import p2.m0;

public enum a
{
  static
  {
    a locala1 = new a("COROUTINE_SUSPENDED", 0);
    a = locala1;
    a locala2 = new a("UNDECIDED", 1);
    a locala3 = new a("RESUMED", 2);
    a[] arrayOfa = new a[3];
    arrayOfa[0] = locala1;
    arrayOfa[1] = locala2;
    arrayOfa[2] = locala3;
    b = arrayOfa;
    m0.D(arrayOfa);
  }
  
  public a() {}
}

/* Location:
 * Qualified Name:     vb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */