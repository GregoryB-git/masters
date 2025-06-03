package t5;

import io.flutter.embedding.engine.FlutterJNI.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import y5.f;

public final class a
{
  public static a d;
  public static boolean e;
  public f a;
  public FlutterJNI.c b;
  public ExecutorService c;
  
  public a(f paramf, x5.a parama, FlutterJNI.c paramc, ExecutorService paramExecutorService)
  {
    a = paramf;
    b = paramc;
    c = paramExecutorService;
  }
  
  public static a e()
  {
    e = true;
    if (d == null) {
      d = new b().a();
    }
    return d;
  }
  
  public x5.a a()
  {
    return null;
  }
  
  public ExecutorService b()
  {
    return c;
  }
  
  public f c()
  {
    return a;
  }
  
  public FlutterJNI.c d()
  {
    return b;
  }
  
  public static final class b
  {
    public f a;
    public FlutterJNI.c b;
    public ExecutorService c;
    
    public a a()
    {
      b();
      return new a(a, null, b, c, null);
    }
    
    public final void b()
    {
      if (b == null) {
        b = new FlutterJNI.c();
      }
      if (c == null) {
        c = Executors.newCachedThreadPool(new a(null));
      }
      if (a == null) {
        a = new f(b.a(), c);
      }
    }
    
    public class a
      implements ThreadFactory
    {
      public int a = 0;
      
      public a() {}
      
      public Thread newThread(Runnable paramRunnable)
      {
        paramRunnable = new Thread(paramRunnable);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("flutter-worker-");
        int i = a;
        a = (i + 1);
        localStringBuilder.append(i);
        paramRunnable.setName(localStringBuilder.toString());
        return paramRunnable;
      }
    }
  }
}

/* Location:
 * Qualified Name:     t5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */