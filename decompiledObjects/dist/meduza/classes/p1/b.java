package p1;

import android.content.Context;
import android.content.Intent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q1.a;
import t1.c.c;

public final class b
{
  public final Context a;
  public final String b;
  public final c.c c;
  public final j.c d;
  public final List<j.b> e;
  public final boolean f;
  public final int g;
  public final Executor h;
  public final Executor i;
  public final Intent j;
  public final boolean k;
  public final boolean l;
  public final Set<Integer> m;
  public final Callable<InputStream> n;
  public final List<Object> o;
  public final List<a> p;
  public final boolean q;
  
  public b(Context paramContext, String paramString, c.c paramc, j.c paramc1, ArrayList paramArrayList1, boolean paramBoolean1, int paramInt, Executor paramExecutor1, Executor paramExecutor2, boolean paramBoolean2, boolean paramBoolean3, LinkedHashSet paramLinkedHashSet, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    a = paramContext;
    b = paramString;
    c = paramc;
    d = paramc1;
    e = paramArrayList1;
    f = paramBoolean1;
    g = paramInt;
    h = paramExecutor1;
    i = paramExecutor2;
    j = null;
    k = paramBoolean2;
    l = paramBoolean3;
    m = paramLinkedHashSet;
    n = null;
    o = paramArrayList2;
    p = paramArrayList3;
    q = false;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    if (paramInt1 > paramInt2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if ((paramInt2 != 0) && (l)) {
      return false;
    }
    if (k)
    {
      Set localSet = m;
      bool2 = bool1;
      if (localSet == null) {
        break label71;
      }
      if (!localSet.contains(Integer.valueOf(paramInt1)))
      {
        bool2 = bool1;
        break label71;
      }
    }
    boolean bool2 = false;
    label71:
    return bool2;
  }
}

/* Location:
 * Qualified Name:     p1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */