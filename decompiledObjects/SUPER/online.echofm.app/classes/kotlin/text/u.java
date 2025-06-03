package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import l6.d;

public class u
  extends t
{
  public static final String g0(String paramString, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    if (paramInt >= 0)
    {
      paramString = paramString.substring(d.b(paramInt, paramString.length()));
      Intrinsics.checkNotNullExpressionValue(paramString, "substring(...)");
      return paramString;
    }
    paramString = new StringBuilder();
    paramString.append("Requested character count ");
    paramString.append(paramInt);
    paramString.append(" is less than zero.");
    throw new IllegalArgumentException(paramString.toString().toString());
  }
  
  public static char h0(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    if (paramCharSequence.length() != 0) {
      return paramCharSequence.charAt(s.x(paramCharSequence));
    }
    throw new NoSuchElementException("Char sequence is empty.");
  }
}

/* Location:
 * Qualified Name:     kotlin.text.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */