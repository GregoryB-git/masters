package e6;

import g6.p;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class e
  implements n6.b
{
  public final File a;
  public final f b;
  public final g6.l c;
  public final g6.l d;
  public final p e;
  public final int f;
  
  public e(File paramFile, f paramf)
  {
    this(paramFile, paramf, null, null, null, 0, 32, null);
  }
  
  public e(File paramFile, f paramf, g6.l paraml1, g6.l paraml2, p paramp, int paramInt)
  {
    a = paramFile;
    b = paramf;
    c = paraml1;
    d = paraml2;
    e = paramp;
    f = paramInt;
  }
  
  public Iterator iterator()
  {
    return new b();
  }
  
  public static abstract class a
    extends e.c
  {
    public a(File paramFile)
    {
      super();
    }
  }
  
  public final class b
    extends W5.b
  {
    public final ArrayDeque q;
    
    public b()
    {
      ArrayDeque localArrayDeque = new ArrayDeque();
      q = localArrayDeque;
      if (e.f(e.this).isDirectory()) {
        localArrayDeque.push(g(e.f(e.this)));
      } else if (e.f(e.this).isFile()) {
        localArrayDeque.push(new b(e.f(e.this)));
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
      f localf = e.a(e.this);
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
          if ((Intrinsics.a(localFile, localc.a())) || (!localFile.isDirectory()) || (q.size() >= e.b(e.this))) {
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
          localObject = e.c(e.this);
          if ((localObject != null) && (!((Boolean)((g6.l)localObject).invoke(a())).booleanValue())) {
            return null;
          }
          localObject = a().listFiles();
          c = ((File[])localObject);
          if (localObject == null)
          {
            localObject = e.d(e.this);
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
        localObject = e.e(e.this);
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
          localObject = e.c(e.this);
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
            localObject = e.e(e.this);
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
            localObject = e.d(e.this);
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
            localObject = e.e(e.this);
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
  
  public static abstract class c
  {
    public final File a;
    
    public c(File paramFile)
    {
      a = paramFile;
    }
    
    public final File a()
    {
      return a;
    }
    
    public abstract File b();
  }
}

/* Location:
 * Qualified Name:     e6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */