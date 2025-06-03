package com.google.firebase;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d8.t;
import d9.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import q9.c;
import r3.j;
import w3.v;
import y7.a;

public class FirebaseCommonRegistrar
  implements ComponentRegistrar
{
  public static String b(String paramString)
  {
    return paramString.replace(' ', '_').replace('/', '_');
  }
  
  public final List<d8.b<?>> getComponents()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = d8.b.b(ca.f.class);
    ((b.a)localObject).a(new k(2, 0, ca.d.class));
    f = new p(4);
    localArrayList.add(((b.a)localObject).b());
    localObject = new t(a.class, Executor.class);
    b.a locala = new b.a(c.class, new Class[] { q9.e.class, q9.f.class });
    locala.a(k.d(Context.class));
    locala.a(k.d(u7.f.class));
    locala.a(new k(2, 0, q9.d.class));
    locala.a(new k(1, 1, ca.f.class));
    locala.a(new k((t)localObject, 1, 0));
    f = new d(localObject, 2);
    localArrayList.add(locala.b());
    localArrayList.add(ca.e.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
    localArrayList.add(ca.e.a("fire-core", "21.0.0"));
    localArrayList.add(ca.e.a("device-name", b(Build.PRODUCT)));
    localArrayList.add(ca.e.a("device-model", b(Build.DEVICE)));
    localArrayList.add(ca.e.a("device-brand", b(Build.BRAND)));
    localArrayList.add(ca.e.b("android-target-sdk", new j(14)));
    localArrayList.add(ca.e.b("android-min-sdk", new e0.d(20)));
    localArrayList.add(ca.e.b("android-platform", new e0.e(19)));
    localArrayList.add(ca.e.b("android-installer", new v(14)));
    String str;
    try
    {
      localObject = rb.b.e.toString();
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      str = null;
    }
    if (str != null) {
      localArrayList.add(ca.e.a("kotlin", str));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.FirebaseCommonRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */