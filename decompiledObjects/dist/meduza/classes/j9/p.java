package j9;

import ka.d0;
import ka.u;
import ma.n1;

public final class p
{
  public static n1 a(d0 paramd0)
  {
    return paramd0.Y().L("__local_write_time__").b0();
  }
  
  public static d0 b(d0 paramd0)
  {
    d0 locald0 = paramd0.Y().K("__previous_value__");
    paramd0 = locald0;
    if (c(locald0)) {
      paramd0 = b(locald0);
    }
    return paramd0;
  }
  
  public static boolean c(d0 paramd0)
  {
    if (paramd0 == null) {
      paramd0 = null;
    } else {
      paramd0 = paramd0.Y().K("__type__");
    }
    boolean bool;
    if ((paramd0 != null) && ("server_timestamp".equals(paramd0.a0()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     j9.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */