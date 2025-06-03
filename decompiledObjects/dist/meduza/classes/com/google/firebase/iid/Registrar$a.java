package com.google.firebase.iid;

import aa.l;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import b1.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import l3.j;
import p2.m0;
import r9.e;
import r9.h;

public final class Registrar$a
  implements s9.a
{
  public final FirebaseInstanceId a;
  
  public Registrar$a(FirebaseInstanceId paramFirebaseInstanceId)
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
      e locale = d;
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

/* Location:
 * Qualified Name:     com.google.firebase.iid.Registrar.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */