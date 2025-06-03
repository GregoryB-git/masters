package x2;

import android.database.Cursor;
import b.z;
import java.util.ArrayList;
import p1.j;
import p1.l;
import t1.f;

public final class o
  implements n
{
  public final j a;
  public final a b;
  
  public o(j paramj)
  {
    a = paramj;
    b = new a(paramj);
  }
  
  public final void a(m paramm)
  {
    a.b();
    a.c();
    try
    {
      b.f(paramm);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
  
  public final ArrayList b(String paramString)
  {
    l locall = l.C(1, "SELECT name FROM workname WHERE work_spec_id=?");
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
  
  public final class a
    extends p1.d
  {
    public a()
    {
      super(1);
    }
    
    public final String c()
    {
      return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
    
    public final void e(f paramf, Object paramObject)
    {
      m localm = (m)paramObject;
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
}

/* Location:
 * Qualified Name:     x2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */