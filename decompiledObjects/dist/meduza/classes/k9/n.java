package k9;

import ka.d0;
import ka.d0.a;
import ka.u;
import ka.u.a;
import ma.n1;
import ma.n1.a;
import ma.w.a;
import u7.m;

public final class n
  implements p
{
  public static final n a = new n();
  
  public final d0 a(d0 paramd01, d0 paramd02)
  {
    return paramd02;
  }
  
  public final d0 b(m paramm, d0 paramd0)
  {
    Object localObject = d0.d0();
    ((d0.a)localObject).v("server_timestamp");
    d0 locald0 = (d0)((w.a)localObject).k();
    d0.a locala = d0.d0();
    localObject = n1.L();
    ((n1.a)localObject).p(a);
    int i = b;
    ((w.a)localObject).m();
    n1.H((n1)b, i);
    locala.w((n1.a)localObject);
    paramm = (d0)locala.k();
    localObject = u.M();
    ((u.a)localObject).p(locald0, "__type__");
    ((u.a)localObject).p(paramm, "__local_write_time__");
    paramm = paramd0;
    if (j9.p.c(paramd0)) {
      paramm = j9.p.b(paramd0);
    }
    if (paramm != null) {
      ((u.a)localObject).p(paramm, "__previous_value__");
    }
    paramm = d0.d0();
    paramm.t((u.a)localObject);
    return (d0)paramm.k();
  }
  
  public final d0 c(d0 paramd0)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     k9.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */