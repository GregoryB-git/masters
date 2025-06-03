package p1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ec.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import q1.b;
import t1.c.c;

public final class j$a<T extends j>
{
  public final Context a;
  public final Class<T> b;
  public final String c;
  public final ArrayList d;
  public final ArrayList e;
  public ArrayList f;
  public Executor g;
  public Executor h;
  public c.c i;
  public boolean j;
  public int k;
  public boolean l;
  public boolean m;
  public long n;
  public final j.c o;
  public LinkedHashSet p;
  public HashSet q;
  
  public j$a(Context paramContext, String paramString)
  {
    a = paramContext;
    b = WorkDatabase.class;
    c = paramString;
    d = new ArrayList();
    e = new ArrayList();
    f = new ArrayList();
    k = 1;
    l = true;
    n = -1L;
    o = new j.c();
    p = new LinkedHashSet();
  }
  
  public final void a(b... paramVarArgs)
  {
    if (q == null) {
      q = new HashSet();
    }
    int i1 = 0;
    int i2 = paramVarArgs.length;
    while (i1 < i2)
    {
      b localb = paramVarArgs[i1];
      HashSet localHashSet = q;
      i.b(localHashSet);
      localHashSet.add(Integer.valueOf(a));
      localHashSet = q;
      i.b(localHashSet);
      localHashSet.add(Integer.valueOf(b));
      i1++;
    }
    o.a((b[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
  }
}

/* Location:
 * Qualified Name:     p1.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */