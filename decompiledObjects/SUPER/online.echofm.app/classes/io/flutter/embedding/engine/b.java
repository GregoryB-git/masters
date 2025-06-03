package io.flutter.embedding.engine;

import D5.n;
import android.content.Context;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;
import w5.a.c;
import y5.f;

public class b
{
  public final List a = new ArrayList();
  
  public b(Context paramContext, String[] paramArrayOfString)
  {
    f localf = t5.a.e().c();
    if (!localf.l())
    {
      localf.p(paramContext.getApplicationContext());
      localf.h(paramContext.getApplicationContext(), paramArrayOfString);
    }
  }
  
  public a a(final b paramb)
  {
    Context localContext = paramb.b();
    a.c localc = paramb.c();
    String str = paramb.e();
    List localList = paramb.d();
    Object localObject = paramb.f();
    if (localObject == null) {
      for (;;)
      {
        localObject = new r();
      }
    }
    boolean bool1 = paramb.a();
    boolean bool2 = paramb.g();
    if (localc == null) {
      paramb = a.c.a();
    } else {
      paramb = localc;
    }
    if (a.size() == 0)
    {
      localObject = b(localContext, (r)localObject, bool1, bool2);
      if (str != null) {
        ((a)localObject).o().c(str);
      }
      ((a)localObject).k().k(paramb, localList);
      paramb = (b)localObject;
    }
    else
    {
      paramb = ((a)a.get(0)).A(localContext, paramb, str, localList, (r)localObject, bool1, bool2);
    }
    a.add(paramb);
    paramb.e(new a(paramb));
    return paramb;
  }
  
  public a b(Context paramContext, r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new a(paramContext, null, null, paramr, null, paramBoolean1, paramBoolean2, this);
  }
  
  public class a
    implements a.b
  {
    public a(a parama) {}
    
    public void a()
    {
      a.remove(paramb);
    }
    
    public void b() {}
  }
  
  public static class b
  {
    public Context a;
    public a.c b;
    public String c;
    public List d;
    public r e;
    public boolean f = true;
    public boolean g = false;
    
    public b(Context paramContext)
    {
      a = paramContext;
    }
    
    public boolean a()
    {
      return f;
    }
    
    public Context b()
    {
      return a;
    }
    
    public a.c c()
    {
      return b;
    }
    
    public List d()
    {
      return d;
    }
    
    public String e()
    {
      return c;
    }
    
    public r f()
    {
      return e;
    }
    
    public boolean g()
    {
      return g;
    }
    
    public b h(boolean paramBoolean)
    {
      f = paramBoolean;
      return this;
    }
    
    public b i(a.c paramc)
    {
      b = paramc;
      return this;
    }
    
    public b j(List paramList)
    {
      d = paramList;
      return this;
    }
    
    public b k(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public b l(boolean paramBoolean)
    {
      g = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */