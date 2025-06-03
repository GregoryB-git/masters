package mb;

import eb.c.b;
import java.util.logging.Logger;
import n7.i;

public final class a
{
  public static final c.b<a> a = new c.b("internal-stub-type");
  
  static
  {
    Logger.getLogger(a.class.getName());
    if (!i.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
      Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
    }
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("BLOCKING", 0);
      a locala2 = new a("FUTURE", 1);
      a locala3 = new a("ASYNC", 2);
      a = locala3;
      b = new a[] { locala1, locala2, locala3 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     mb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */