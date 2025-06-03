package R;

import Q.b;
import W5.m;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

public abstract class a
{
  public static final i6.a a(String paramString, b paramb, g6.l paraml, I paramI)
  {
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paraml, "produceMigrations");
    Intrinsics.checkNotNullParameter(paramI, "scope");
    return new c(paramString, paramb, paraml, paramI);
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final List a(Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "it");
      return m.f();
    }
  }
}

/* Location:
 * Qualified Name:     R.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */