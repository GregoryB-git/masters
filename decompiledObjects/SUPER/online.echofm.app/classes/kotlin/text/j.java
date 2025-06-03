package kotlin.text;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public class j
{
  public static void a(Appendable paramAppendable, Object paramObject, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramAppendable, "<this>");
    if (paraml != null) {
      paramObject = paraml.invoke(paramObject);
    }
    for (paramObject = (CharSequence)paramObject;; paramObject = String.valueOf(paramObject))
    {
      paramAppendable.append((CharSequence)paramObject);
      return;
      if ((paramObject != null) && ((paramObject instanceof CharSequence))) {
        break;
      }
      if ((paramObject instanceof Character))
      {
        paramAppendable.append(((Character)paramObject).charValue());
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.text.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */