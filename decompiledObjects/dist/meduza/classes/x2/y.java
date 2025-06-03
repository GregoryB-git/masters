package x2;

import android.database.Cursor;
import b.z;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p1.j;
import p1.l;
import p1.p;
import t1.f;

public final class y
  implements x
{
  public final j a;
  public final a b;
  
  public y(j paramj)
  {
    a = paramj;
    b = new a(paramj);
    new b(paramj);
  }
  
  public final ArrayList a(String paramString)
  {
    l locall = l.C(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    Cursor localCursor = z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = localCursor.getString(0);
        }
        localArrayList.add(paramString);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final void b(String paramString, Set<String> paramSet)
  {
    i.e(paramSet, "tags");
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      c(new w((String)paramSet.next(), paramString));
    }
  }
  
  public final void c(w paramw)
  {
    a.b();
    a.c();
    try
    {
      b.f(paramw);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
  
  public final class a
    extends p1.d
  {
    public a()
    {
      super(1);
    }
    
    public final String c()
    {
      return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
    
    public final void e(f paramf, Object paramObject)
    {
      w localw = (w)paramObject;
      paramObject = a;
      if (paramObject == null) {
        paramf.d0(1);
      } else {
        paramf.n(1, (String)paramObject);
      }
      paramObject = b;
      if (paramObject == null) {
        paramf.d0(2);
      } else {
        paramf.n(2, (String)paramObject);
      }
    }
  }
  
  public final class b
    extends p
  {
    public b()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE FROM worktag WHERE work_spec_id=?";
    }
  }
}

/* Location:
 * Qualified Name:     x2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */