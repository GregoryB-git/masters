package ea;

import dc.a;
import ec.i;
import java.util.Locale;
import java.util.UUID;
import lc.h;

public final class e0
{
  public final m0 a;
  public final a<UUID> b;
  public final String c;
  public int d;
  public x e;
  
  public e0() {}
  
  public e0(int paramInt)
  {
    a = localm0;
    b = locald0;
    c = a();
    d = -1;
  }
  
  public final String a()
  {
    String str = ((UUID)b.invoke()).toString();
    i.d(str, "uuidGenerator().toString()");
    str = h.m0(str, "-", "").toLowerCase(Locale.ROOT);
    i.d(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
    return str;
  }
}

/* Location:
 * Qualified Name:     ea.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */