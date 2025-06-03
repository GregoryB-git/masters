package com.google.firebase.iid;

import aa.l;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import b.a0;
import b.z;
import b1.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.b.a;
import d8.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.j;
import p2.m0;
import r9.h;
import u9.d;

public final class Registrar
  implements ComponentRegistrar
{
  public List<b<?>> getComponents()
  {
    Object localObject = b.b(FirebaseInstanceId.class);
    ((b.a)localObject).a(k.d(u7.f.class));
    ((b.a)localObject).a(k.b(ca.f.class));
    ((b.a)localObject).a(k.b(q9.f.class));
    ((b.a)localObject).a(k.d(d.class));
    f = z.o;
    ((b.a)localObject).c(1);
    localObject = ((b.a)localObject).b();
    b.a locala = b.b(s9.a.class);
    locala.a(k.d(FirebaseInstanceId.class));
    f = a0.V;
    return Arrays.asList(new b[] { localObject, locala.b(), ca.e.a("fire-iid", "21.1.0") });
  }
  
  public static final class a
    implements s9.a
  {
    public final FirebaseInstanceId a;
    
    public a(FirebaseInstanceId paramFirebaseInstanceId)
    {
      a = paramFirebaseInstanceId;
    }
    
    public final String a()
    {
      return a.h();
    }
    
    public final void b(String paramString)
    {
      Object localObject1 = a;
      FirebaseInstanceId.d(b);
      if (Looper.getMainLooper() != Looper.myLooper())
      {
        String str = ((FirebaseInstanceId)localObject1).f();
        r9.e locale = d;
        locale.getClass();
        Object localObject2 = new Bundle();
        ((BaseBundle)localObject2).putString("delete", "1");
        ((FirebaseInstanceId)localObject1).a(locale.a((Bundle)localObject2, str, paramString, "*").continueWith(r9.a.a, new v(locale)));
        localObject2 = FirebaseInstanceId.j;
        localObject1 = ((FirebaseInstanceId)localObject1).g();
        try
        {
          localObject1 = a.b((String)localObject1, paramString, "*");
          paramString = a.edit();
          paramString.remove((String)localObject1);
          paramString.commit();
          return;
        }
        finally
        {
          paramString = finally;
          throw paramString;
        }
      }
      throw new IOException("MAIN_THREAD");
    }
    
    public final void c(l paraml)
    {
      a.h.add(paraml);
    }
    
    public final Task<String> d()
    {
      Object localObject = a.h();
      if (localObject != null) {
        return Tasks.forResult(localObject);
      }
      localObject = a;
      FirebaseInstanceId.d(b);
      String str = h.a(b);
      return Tasks.forResult(null).continueWithTask(a, new j(localObject, str, "*")).continueWith(m0.A);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.Registrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */