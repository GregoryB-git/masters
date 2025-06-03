package sb;

import ec.i;
import java.util.Collection;
import va.a;

public class m
  extends a
{
  public static final int j(Iterable paramIterable)
  {
    i.e(paramIterable, "<this>");
    int i;
    if ((paramIterable instanceof Collection)) {
      i = ((Collection)paramIterable).size();
    } else {
      i = 10;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     sb.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */