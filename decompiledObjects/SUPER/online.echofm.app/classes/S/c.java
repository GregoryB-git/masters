package S;

import P.f;
import g6.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.I;

public final class c
{
  public static final c a = new c();
  
  public final f a(Q.b paramb, List paramList, I paramI, a parama)
  {
    Intrinsics.checkNotNullParameter(paramList, "migrations");
    Intrinsics.checkNotNullParameter(paramI, "scope");
    Intrinsics.checkNotNullParameter(parama, "produceFile");
    return new b(P.g.a.a(h.a, paramb, paramList, paramI, new a(parama)));
  }
  
  public static final class a
    extends l
    implements a
  {
    public a(a parama)
    {
      super();
    }
    
    public final File a()
    {
      File localFile = (File)o.invoke();
      Object localObject = e6.g.k(localFile);
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
}

/* Location:
 * Qualified Name:     S.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */