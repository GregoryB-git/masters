package S;

import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
  extends kotlin.jvm.internal.l
  implements g6.l
{
  public static final a o = new a();
  
  public a$a()
  {
    super(1);
  }
  
  public final CharSequence a(Map.Entry paramEntry)
  {
    Intrinsics.checkNotNullParameter(paramEntry, "entry");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("  ");
    localStringBuilder.append(((d.a)paramEntry.getKey()).a());
    localStringBuilder.append(" = ");
    localStringBuilder.append(paramEntry.getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     S.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */