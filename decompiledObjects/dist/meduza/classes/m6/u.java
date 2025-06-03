package m6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j6.f;
import k6.a.f;

public final class u
{
  public final SparseIntArray a = new SparseIntArray();
  public f b;
  
  public u(f paramf)
  {
    j.i(paramf);
    b = paramf;
  }
  
  @ResultIgnorabilityUnspecified
  public final int a(Context paramContext, a.f paramf)
  {
    j.i(paramContext);
    j.i(paramf);
    boolean bool = paramf.requiresGooglePlayServices();
    int i = 0;
    if (!bool) {
      return 0;
    }
    int j = paramf.getMinApkVersion();
    int k = a.get(j, -1);
    if (k == -1)
    {
      for (k = 0; k < a.size(); k++)
      {
        int m = a.keyAt(k);
        if ((m > j) && (a.get(m) == 0))
        {
          k = i;
          break label114;
        }
      }
      k = -1;
      label114:
      if (k == -1) {
        k = b.c(paramContext, j);
      }
      a.put(j, k);
    }
    return k;
  }
}

/* Location:
 * Qualified Name:     m6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */