package eb;

import java.util.List;
import n7.d;

public enum e1$a
{
  public final int a;
  public final byte[] b;
  
  static
  {
    a locala1 = new a("OK", 0, 0);
    c = locala1;
    a locala2 = new a("CANCELLED", 1, 1);
    d = locala2;
    a locala3 = new a("UNKNOWN", 2, 2);
    e = locala3;
    a locala4 = new a("INVALID_ARGUMENT", 3, 3);
    f = locala4;
    a locala5 = new a("DEADLINE_EXCEEDED", 4, 4);
    o = locala5;
    a locala6 = new a("NOT_FOUND", 5, 5);
    p = locala6;
    a locala7 = new a("ALREADY_EXISTS", 6, 6);
    q = locala7;
    a locala8 = new a("PERMISSION_DENIED", 7, 7);
    r = locala8;
    a locala9 = new a("RESOURCE_EXHAUSTED", 8, 8);
    s = locala9;
    a locala10 = new a("FAILED_PRECONDITION", 9, 9);
    t = locala10;
    a locala11 = new a("ABORTED", 10, 10);
    u = locala11;
    a locala12 = new a("OUT_OF_RANGE", 11, 11);
    v = locala12;
    a locala13 = new a("UNIMPLEMENTED", 12, 12);
    w = locala13;
    a locala14 = new a("INTERNAL", 13, 13);
    x = locala14;
    a locala15 = new a("UNAVAILABLE", 14, 14);
    y = locala15;
    a locala16 = new a("DATA_LOSS", 15, 15);
    z = locala16;
    a locala17 = new a("UNAUTHENTICATED", 16, 16);
    A = locala17;
    B = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17 };
  }
  
  public e1$a(int paramInt)
  {
    a = paramInt;
    b = Integer.toString(paramInt).getBytes(d.a);
  }
  
  public final e1 f()
  {
    return (e1)e1.d.get(a);
  }
}

/* Location:
 * Qualified Name:     eb.e1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */