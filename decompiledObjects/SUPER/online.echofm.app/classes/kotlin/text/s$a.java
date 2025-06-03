package kotlin.text;

import V5.m;
import V5.q;
import g6.p;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class s$a
  extends l
  implements p
{
  public s$a(List paramList, boolean paramBoolean)
  {
    super(2);
  }
  
  public final m a(CharSequence paramCharSequence, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "$this$$receiver");
    paramCharSequence = s.t(paramCharSequence, (Collection)o, paramInt, p, false);
    if (paramCharSequence != null) {
      paramCharSequence = q.a(paramCharSequence.c(), Integer.valueOf(((String)paramCharSequence.d()).length()));
    } else {
      paramCharSequence = null;
    }
    return paramCharSequence;
  }
}

/* Location:
 * Qualified Name:     kotlin.text.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */