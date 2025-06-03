package c5;

import android.net.Uri;
import d5.b;
import d5.i;
import d5.j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t5.n;
import v5.d0;

public final class d
{
  public static n a(j paramj, String paramString, i parami, int paramInt)
  {
    Map localMap = Collections.emptyMap();
    Uri localUri = d0.d(paramString, c);
    long l1 = a;
    long l2 = b;
    paramString = paramj.c();
    if (paramString != null) {
      paramj = paramString;
    } else {
      paramj = d0.d(b.get(0)).a, c).toString();
    }
    if (localUri != null) {
      return new n(localUri, 0L, 1, null, localMap, l1, l2, paramj, paramInt, null);
    }
    throw new IllegalStateException("The uri must be set.");
  }
}

/* Location:
 * Qualified Name:     c5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */