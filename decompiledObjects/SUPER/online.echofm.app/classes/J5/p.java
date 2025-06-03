package J5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public abstract class p
{
  public static ArrayList a(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramThrowable.toString());
    localArrayList.add(paramThrowable.getClass().getSimpleName());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cause: ");
    localStringBuilder.append(paramThrowable.getCause());
    localStringBuilder.append(", Stacktrace: ");
    localStringBuilder.append(Log.getStackTraceString(paramThrowable));
    localArrayList.add(localStringBuilder.toString());
    return localArrayList;
  }
  
  public static abstract interface a
  {
    public abstract void b(String paramString, Boolean paramBoolean, p.f paramf);
    
    public abstract void d(String paramString, p.f paramf);
    
    public abstract void f(String paramString, Boolean paramBoolean, p.f paramf);
  }
  
  public static abstract interface b
  {
    public abstract void a(p.f paramf);
    
    public abstract void c(p.f paramf);
    
    public abstract void e(String paramString, p.d paramd, p.f paramf);
  }
  
  public static class c
    extends E5.p
  {
    public static final c d = new c();
    
    public Object g(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE)
      {
        if (paramByte != -127) {
          return super.g(paramByte, paramByteBuffer);
        }
        return p.e.a((ArrayList)f(paramByteBuffer));
      }
      return p.d.a((ArrayList)f(paramByteBuffer));
    }
    
    public void p(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof p.d)) {
        paramByteArrayOutputStream.write(128);
      }
      for (paramObject = ((p.d)paramObject).w();; paramObject = ((p.e)paramObject).f())
      {
        p(paramByteArrayOutputStream, paramObject);
        return;
        if (!(paramObject instanceof p.e)) {
          break;
        }
        paramByteArrayOutputStream.write(129);
      }
      super.p(paramByteArrayOutputStream, paramObject);
    }
  }
  
  public static final class d
  {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    
    public static d a(ArrayList paramArrayList)
    {
      d locald = new d();
      locald.j((String)paramArrayList.get(0));
      locald.l((String)paramArrayList.get(1));
      locald.s((String)paramArrayList.get(2));
      locald.t((String)paramArrayList.get(3));
      locald.m((String)paramArrayList.get(4));
      locald.n((String)paramArrayList.get(5));
      locald.u((String)paramArrayList.get(6));
      locald.r((String)paramArrayList.get(7));
      locald.v((String)paramArrayList.get(8));
      locald.o((String)paramArrayList.get(9));
      locald.i((String)paramArrayList.get(10));
      locald.q((String)paramArrayList.get(11));
      locald.p((String)paramArrayList.get(12));
      locald.k((String)paramArrayList.get(13));
      return locald;
    }
    
    public String b()
    {
      return a;
    }
    
    public String c()
    {
      return b;
    }
    
    public String d()
    {
      return f;
    }
    
    public String e()
    {
      return c;
    }
    
    public String f()
    {
      return d;
    }
    
    public String g()
    {
      return g;
    }
    
    public String h()
    {
      return i;
    }
    
    public void i(String paramString)
    {
      k = paramString;
    }
    
    public void j(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
    }
    
    public void k(String paramString)
    {
      n = paramString;
    }
    
    public void l(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"appId\" is null.");
    }
    
    public void m(String paramString)
    {
      e = paramString;
    }
    
    public void n(String paramString)
    {
      f = paramString;
    }
    
    public void o(String paramString)
    {
      j = paramString;
    }
    
    public void p(String paramString)
    {
      m = paramString;
    }
    
    public void q(String paramString)
    {
      l = paramString;
    }
    
    public void r(String paramString)
    {
      h = paramString;
    }
    
    public void s(String paramString)
    {
      if (paramString != null)
      {
        c = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
    }
    
    public void t(String paramString)
    {
      if (paramString != null)
      {
        d = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"projectId\" is null.");
    }
    
    public void u(String paramString)
    {
      g = paramString;
    }
    
    public void v(String paramString)
    {
      i = paramString;
    }
    
    public ArrayList w()
    {
      ArrayList localArrayList = new ArrayList(14);
      localArrayList.add(a);
      localArrayList.add(b);
      localArrayList.add(c);
      localArrayList.add(d);
      localArrayList.add(e);
      localArrayList.add(f);
      localArrayList.add(g);
      localArrayList.add(h);
      localArrayList.add(i);
      localArrayList.add(j);
      localArrayList.add(k);
      localArrayList.add(l);
      localArrayList.add(m);
      localArrayList.add(n);
      return localArrayList;
    }
    
    public static final class a
    {
      public String a;
      public String b;
      public String c;
      public String d;
      public String e;
      public String f;
      public String g;
      public String h;
      public String i;
      public String j;
      public String k;
      public String l;
      public String m;
      public String n;
      
      public p.d a()
      {
        p.d locald = new p.d();
        locald.j(a);
        locald.l(b);
        locald.s(c);
        locald.t(d);
        locald.m(e);
        locald.n(f);
        locald.u(g);
        locald.r(h);
        locald.v(i);
        locald.o(j);
        locald.i(k);
        locald.q(l);
        locald.p(m);
        locald.k(n);
        return locald;
      }
      
      public a b(String paramString)
      {
        a = paramString;
        return this;
      }
      
      public a c(String paramString)
      {
        b = paramString;
        return this;
      }
      
      public a d(String paramString)
      {
        f = paramString;
        return this;
      }
      
      public a e(String paramString)
      {
        c = paramString;
        return this;
      }
      
      public a f(String paramString)
      {
        d = paramString;
        return this;
      }
      
      public a g(String paramString)
      {
        g = paramString;
        return this;
      }
      
      public a h(String paramString)
      {
        i = paramString;
        return this;
      }
    }
  }
  
  public static final class e
  {
    public String a;
    public p.d b;
    public Boolean c;
    public Map d;
    
    public static e a(ArrayList paramArrayList)
    {
      e locale = new e();
      locale.c((String)paramArrayList.get(0));
      Object localObject = paramArrayList.get(1);
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = p.d.a((ArrayList)localObject);
      }
      locale.d((p.d)localObject);
      locale.b((Boolean)paramArrayList.get(2));
      locale.e((Map)paramArrayList.get(3));
      return locale;
    }
    
    public void b(Boolean paramBoolean)
    {
      c = paramBoolean;
    }
    
    public void c(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"name\" is null.");
    }
    
    public void d(p.d paramd)
    {
      if (paramd != null)
      {
        b = paramd;
        return;
      }
      throw new IllegalStateException("Nonnull field \"options\" is null.");
    }
    
    public void e(Map paramMap)
    {
      if (paramMap != null)
      {
        d = paramMap;
        return;
      }
      throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
    }
    
    public ArrayList f()
    {
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(a);
      Object localObject = b;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((p.d)localObject).w();
      }
      localArrayList.add(localObject);
      localArrayList.add(c);
      localArrayList.add(d);
      return localArrayList;
    }
    
    public static final class a
    {
      public String a;
      public p.d b;
      public Boolean c;
      public Map d;
      
      public p.e a()
      {
        p.e locale = new p.e();
        locale.c(a);
        locale.d(b);
        locale.b(c);
        locale.e(d);
        return locale;
      }
      
      public a b(Boolean paramBoolean)
      {
        c = paramBoolean;
        return this;
      }
      
      public a c(String paramString)
      {
        a = paramString;
        return this;
      }
      
      public a d(p.d paramd)
      {
        b = paramd;
        return this;
      }
      
      public a e(Map paramMap)
      {
        d = paramMap;
        return this;
      }
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(Object paramObject);
    
    public abstract void b(Throwable paramThrowable);
  }
}

/* Location:
 * Qualified Name:     J5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */