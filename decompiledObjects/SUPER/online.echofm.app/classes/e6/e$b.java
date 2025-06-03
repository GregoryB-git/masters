package e6;

import W5.b;
import g6.p;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

public final class e$b
  extends b
{
  public final ArrayDeque q;
  
  public e$b(e parame)
  {
    ArrayDeque localArrayDeque = new ArrayDeque();
    q = localArrayDeque;
    if (e.f(parame).isDirectory()) {
      localArrayDeque.push(g(e.f(parame)));
    } else if (e.f(parame).isFile()) {
      localArrayDeque.push(new b(e.f(parame)));
    } else {
      d();
    }
  }
  
  public void b()
  {
    File localFile = h();
    if (localFile != null) {
      e(localFile);
    } else {
      d();
    }
  }
  
  public final e.a g(File paramFile)
  {
    f localf = e.a(r);
    int i = d.a[localf.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        paramFile = new a(paramFile);
      } else {
        throw new V5.l();
      }
    }
    else {
      paramFile = new c(paramFile);
    }
    return paramFile;
  }
  
  public final File h()
  {
    File localFile;
    for (;;)
    {
      e.c localc = (e.c)q.peek();
      if (localc == null) {
        return null;
      }
      localFile = localc.b();
      if (localFile == null)
      {
        q.pop();
      }
      else
      {
        if ((Intrinsics.a(localFile, localc.a())) || (!localFile.isDirectory()) || (q.size() >= e.b(r))) {
          break;
        }
        q.push(g(localFile));
      }
    }
    return localFile;
  }
  
  public final class a
    extends e.a
  {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    
    public a(File paramFile)
    {
      super();
    }
    
    public File b()
    {
      if ((!e) && (c == null))
      {
        localObject = e.c(r);
        if ((localObject != null) && (!((Boolean)((g6.l)localObject).invoke(a())).booleanValue())) {
          return null;
        }
        localObject = a().listFiles();
        c = ((File[])localObject);
        if (localObject == null)
        {
          localObject = e.d(r);
          if (localObject != null) {
            ((p)localObject).invoke(a(), new a(a(), null, "Cannot list files in a directory", 2, null));
          }
          e = true;
        }
      }
      Object localObject = c;
      if (localObject != null)
      {
        int i = d;
        Intrinsics.b(localObject);
        if (i < localObject.length)
        {
          localObject = c;
          Intrinsics.b(localObject);
          i = d;
          d = (i + 1);
          return localObject[i];
        }
      }
      if (!b)
      {
        b = true;
        return a();
      }
      localObject = e.e(r);
      if (localObject != null) {
        ((g6.l)localObject).invoke(a());
      }
      return null;
    }
  }
  
  public final class b
    extends e.c
  {
    public boolean b;
    
    public b(File paramFile)
    {
      super();
    }
    
    public File b()
    {
      if (b) {
        return null;
      }
      b = true;
      return a();
    }
  }
  
  public final class c
    extends e.a
  {
    public boolean b;
    public File[] c;
    public int d;
    
    public c(File paramFile)
    {
      super();
    }
    
    public File b()
    {
      if (!b)
      {
        localObject = e.c(r);
        if ((localObject != null) && (!((Boolean)((g6.l)localObject).invoke(a())).booleanValue())) {
          return null;
        }
        b = true;
        return a();
      }
      Object localObject = c;
      if (localObject != null)
      {
        i = d;
        Intrinsics.b(localObject);
        if (i >= localObject.length)
        {
          localObject = e.e(r);
          if (localObject != null) {
            ((g6.l)localObject).invoke(a());
          }
          return null;
        }
      }
      if (c == null)
      {
        localObject = a().listFiles();
        c = ((File[])localObject);
        if (localObject == null)
        {
          localObject = e.d(r);
          if (localObject != null) {
            ((p)localObject).invoke(a(), new a(a(), null, "Cannot list files in a directory", 2, null));
          }
        }
        localObject = c;
        if (localObject != null)
        {
          Intrinsics.b(localObject);
          if (localObject.length != 0) {}
        }
        else
        {
          localObject = e.e(r);
          if (localObject != null) {
            ((g6.l)localObject).invoke(a());
          }
          return null;
        }
      }
      localObject = c;
      Intrinsics.b(localObject);
      int i = d;
      d = (i + 1);
      return localObject[i];
    }
  }
}

/* Location:
 * Qualified Name:     e6.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */