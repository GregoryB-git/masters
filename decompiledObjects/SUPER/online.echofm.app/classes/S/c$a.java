package S;

import e6.g;
import g6.a;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class c$a
  extends l
  implements a
{
  public c$a(a parama)
  {
    super(0);
  }
  
  public final File a()
  {
    File localFile = (File)o.invoke();
    Object localObject = g.k(localFile);
    h localh = h.a;
    if (Intrinsics.a(localObject, localh.f())) {
      return localFile;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("File extension for file: ");
    ((StringBuilder)localObject).append(localFile);
    ((StringBuilder)localObject).append(" does not match required extension for Preferences file: ");
    ((StringBuilder)localObject).append(localh.f());
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
}

/* Location:
 * Qualified Name:     S.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */