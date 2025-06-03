package x2;

import android.database.Cursor;
import b.z;
import java.util.ArrayList;
import p1.j;
import p1.l;
import t1.f;

public final class c
  implements b
{
  public final j a;
  public final a b;
  
  public c(j paramj)
  {
    a = paramj;
    b = new a(paramj);
  }
  
  public final ArrayList a(String paramString)
  {
    l locall = l.C(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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
  
  public final void b(a parama)
  {
    a.b();
    a.c();
    try
    {
      b.f(parama);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
  
  public final boolean c(String paramString)
  {
    boolean bool1 = true;
    l locall = l.C(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    paramString = a;
    boolean bool2 = false;
    Cursor localCursor = z.o(paramString, locall, false);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final boolean d(String paramString)
  {
    boolean bool1 = true;
    l locall = l.C(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    paramString = a;
    boolean bool2 = false;
    Cursor localCursor = z.o(paramString, locall, false);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      locall.H();
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
      return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
    
    public final void e(f paramf, Object paramObject)
    {
      paramObject = (a)paramObject;
      String str = a;
      if (str == null) {
        paramf.d0(1);
      } else {
        paramf.n(1, str);
      }
      paramObject = b;
      if (paramObject == null) {
        paramf.d0(2);
      } else {
        paramf.n(2, (String)paramObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     x2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */