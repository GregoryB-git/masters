package y2;

import androidx.work.impl.WorkDatabase;
import x2.d;
import x2.e;

public final class j
{
  public static final int a(WorkDatabase paramWorkDatabase, String paramString)
  {
    Long localLong = paramWorkDatabase.q().a(paramString);
    int i = 0;
    int j;
    if (localLong != null) {
      j = (int)localLong.longValue();
    } else {
      j = 0;
    }
    if (j != Integer.MAX_VALUE) {
      i = j + 1;
    }
    paramWorkDatabase.q().b(new d(paramString, Long.valueOf(i)));
    return j;
  }
}

/* Location:
 * Qualified Name:     y2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */