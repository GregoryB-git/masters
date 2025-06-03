package ad;

import p2.m0;

public enum a
{
  static
  {
    a locala1 = new a("UNDEFINED", 0);
    a locala2 = new a("ENQUEUED", 1);
    a = locala2;
    a locala3 = new a("RUNNING", 2);
    b = locala3;
    a locala4 = new a("COMPLETE", 3);
    c = locala4;
    a locala5 = new a("FAILED", 4);
    d = locala5;
    a locala6 = new a("CANCELED", 5);
    e = locala6;
    a locala7 = new a("PAUSED", 6);
    f = locala7;
    a[] arrayOfa = new a[7];
    arrayOfa[0] = locala1;
    arrayOfa[1] = locala2;
    arrayOfa[2] = locala3;
    arrayOfa[3] = locala4;
    arrayOfa[4] = locala5;
    arrayOfa[5] = locala6;
    arrayOfa[6] = locala7;
    o = arrayOfa;
    m0.D(arrayOfa);
  }
  
  public a() {}
}

/* Location:
 * Qualified Name:     ad.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */