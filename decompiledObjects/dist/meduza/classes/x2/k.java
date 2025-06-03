package x2;

import android.database.Cursor;
import b.z;
import java.util.ArrayList;
import p1.p;
import p2.m0;
import t1.f;

public final class k
  implements j
{
  public final p1.j a;
  public final a b;
  public final b c;
  public final c d;
  
  public k(p1.j paramj)
  {
    a = paramj;
    b = new a(paramj);
    c = new b(paramj);
    d = new c(paramj);
  }
  
  public final ArrayList a()
  {
    p1.l locall = p1.l.C(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
    a.b();
    Cursor localCursor = z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        String str;
        if (localCursor.isNull(0)) {
          str = null;
        } else {
          str = localCursor.getString(0);
        }
        localArrayList.add(str);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final void b(l paraml)
  {
    String str = a;
    g(b, str);
  }
  
  public final i c(l paraml)
  {
    ec.i.e(paraml, "id");
    String str = a;
    return f(b, str);
  }
  
  public final void d(i parami)
  {
    a.b();
    a.c();
    try
    {
      b.f(parami);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
  
  public final void e(String paramString)
  {
    a.b();
    f localf = d.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      d.d(localf);
    }
  }
  
  public final i f(int paramInt, String paramString)
  {
    p1.l locall = p1.l.C(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    locall.F(2, paramInt);
    a.b();
    Object localObject1 = a;
    paramString = null;
    Object localObject2 = null;
    localObject1 = z.o((p1.j)localObject1, locall, false);
    try
    {
      int i = m0.J((Cursor)localObject1, "work_spec_id");
      int j = m0.J((Cursor)localObject1, "generation");
      paramInt = m0.J((Cursor)localObject1, "system_id");
      if (((Cursor)localObject1).moveToFirst())
      {
        if (((Cursor)localObject1).isNull(i)) {
          paramString = (String)localObject2;
        } else {
          paramString = ((Cursor)localObject1).getString(i);
        }
        paramString = new i(paramString, ((Cursor)localObject1).getInt(j), ((Cursor)localObject1).getInt(paramInt));
      }
      return paramString;
    }
    finally
    {
      ((Cursor)localObject1).close();
      locall.H();
    }
  }
  
  public final void g(int paramInt, String paramString)
  {
    a.b();
    f localf = c.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    localf.F(2, paramInt);
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      c.d(localf);
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
      return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
    
    public final void e(f paramf, Object paramObject)
    {
      paramObject = (i)paramObject;
      String str = a;
      if (str == null) {
        paramf.d0(1);
      } else {
        paramf.n(1, str);
      }
      paramf.F(2, b);
      paramf.F(3, c);
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
      return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
  }
  
  public final class c
    extends p
  {
    public c()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
  }
}

/* Location:
 * Qualified Name:     x2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */