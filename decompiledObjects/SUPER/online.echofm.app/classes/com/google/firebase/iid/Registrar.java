package com.google.firebase.iid;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import V2.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p4.o;
import p4.p;
import p4.q;
import q4.a;
import q4.a.a;
import s3.e;

@Keep
public final class Registrar
  implements ComponentRegistrar
{
  @Keep
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(FirebaseInstanceId.class).b(r.k(e.class)).b(r.i(O4.i.class)).b(r.i(o4.j.class)).b(r.k(s4.i.class)).f(o.a).c().d(), c.e(a.class).b(r.k(FirebaseInstanceId.class)).f(p.a).d(), h.b("fire-iid", "21.1.0") });
  }
  
  public static class a
    implements a
  {
    public final FirebaseInstanceId a;
    
    public a(FirebaseInstanceId paramFirebaseInstanceId)
    {
      a = paramFirebaseInstanceId;
    }
    
    public String a()
    {
      return a.n();
    }
    
    public V2.j b()
    {
      String str = a.n();
      if (str != null) {
        return m.e(str);
      }
      return a.j().f(q.a);
    }
    
    public void c(String paramString1, String paramString2)
    {
      a.f(paramString1, paramString2);
    }
    
    public void d(a.a parama)
    {
      a.a(parama);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.Registrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */