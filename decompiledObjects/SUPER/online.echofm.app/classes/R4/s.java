package R4;

import g6.a;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.text.i;

public final class s
{
  public final boolean a;
  public final x b;
  public final a c;
  public final String d;
  public int e;
  public p f;
  
  public s(boolean paramBoolean, x paramx, a parama)
  {
    a = paramBoolean;
    b = paramx;
    c = parama;
    d = b();
    e = -1;
  }
  
  public final p a()
  {
    int i = e + 1;
    e = i;
    if (i == 0) {}
    for (String str = d;; str = b()) {
      break;
    }
    f = new p(str, d, e, b.a());
    return d();
  }
  
  public final String b()
  {
    String str = ((UUID)c.invoke()).toString();
    Intrinsics.checkNotNullExpressionValue(str, "uuidGenerator().toString()");
    str = i.q(str, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
    return str;
  }
  
  public final boolean c()
  {
    return a;
  }
  
  public final p d()
  {
    p localp = f;
    if (localp != null) {
      return localp;
    }
    Intrinsics.n("currentSession");
    return null;
  }
  
  public final boolean e()
  {
    boolean bool;
    if (f != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     R4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */