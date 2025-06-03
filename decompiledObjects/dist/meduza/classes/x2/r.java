package x2;

import androidx.work.c;
import p1.j;
import t1.f;

public final class r
  implements q
{
  public final j a;
  public final b b;
  public final c c;
  
  public r(j paramj)
  {
    a = paramj;
    new a(paramj);
    b = new b(paramj);
    c = new c(paramj);
  }
  
  public final void a(String paramString)
  {
    a.b();
    f localf = b.a();
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
      b.d(localf);
    }
  }
  
  public final void b()
  {
    a.b();
    f localf = c.a();
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
      return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
    
    public final void e(f paramf, Object paramObject)
    {
      paramObject = (p)paramObject;
      paramf.d0(1);
      paramObject = c.e(null);
      if (paramObject == null) {
        paramf.d0(2);
      } else {
        paramf.T((byte[])paramObject, 2);
      }
    }
  }
  
  public final class b
    extends p1.p
  {
    public b()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE from WorkProgress where work_spec_id=?";
    }
  }
  
  public final class c
    extends p1.p
  {
    public c()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE FROM WorkProgress";
    }
  }
}

/* Location:
 * Qualified Name:     x2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */