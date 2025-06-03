package com.google.firebase.iid;

import V2.j;
import V2.m;
import p4.q;
import q4.a;
import q4.a.a;

public class Registrar$a
  implements a
{
  public final FirebaseInstanceId a;
  
  public Registrar$a(FirebaseInstanceId paramFirebaseInstanceId)
  {
    a = paramFirebaseInstanceId;
  }
  
  public String a()
  {
    return a.n();
  }
  
  public j b()
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

/* Location:
 * Qualified Name:     com.google.firebase.iid.Registrar.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */