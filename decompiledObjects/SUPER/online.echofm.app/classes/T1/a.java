package T1;

import Q1.b;
import Q1.c;
import Q1.c.a;
import Q1.c.c;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a
{
  public static final a a = new a();
  public static final Set b = Collections.newSetFromMap(new WeakHashMap());
  public static boolean c;
  
  public static final void a()
  {
    c = true;
  }
  
  public static final void b(Throwable paramThrowable, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramObject, "o");
    if (!c) {
      return;
    }
    b.add(paramObject);
    if (B.p())
    {
      b.c(paramThrowable);
      paramObject = c.a.a;
      c.a.b(paramThrowable, c.c.s).g();
    }
    e(paramThrowable);
  }
  
  public static final boolean c()
  {
    return false;
  }
  
  public static final boolean d(Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramObject, "o");
    return b.contains(paramObject);
  }
  
  public static final void e(Throwable paramThrowable)
  {
    if (c()) {
      new Handler(Looper.getMainLooper()).post(new a(paramThrowable));
    }
  }
  
  public static final class a
    implements Runnable
  {
    public a(Throwable paramThrowable) {}
    
    public void run()
    {
      throw new RuntimeException(o);
    }
  }
}

/* Location:
 * Qualified Name:     T1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */