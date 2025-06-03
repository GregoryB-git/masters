package gb;

import eb.e1;
import eb.s0;

public abstract interface t
  extends n3
{
  public abstract void b(s0 params0);
  
  public abstract void d(e1 parame1, a parama, s0 params0);
  
  public static enum a
  {
    static
    {
      a locala1 = new a("PROCESSED", 0);
      a = locala1;
      a locala2 = new a("REFUSED", 1);
      b = locala2;
      a locala3 = new a("DROPPED", 2);
      c = locala3;
      a locala4 = new a("MISCARRIED", 3);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     gb.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */