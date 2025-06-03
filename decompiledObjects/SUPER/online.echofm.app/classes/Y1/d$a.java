package Y1;

import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import q.e;

public final class d$a
{
  public final e a()
  {
    d.b().lock();
    d.c();
    d.d(null);
    d.b().unlock();
    return null;
  }
  
  public final void b(Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramUri, "url");
    c();
    d.b().lock();
    d.c();
    d.b().unlock();
  }
  
  public final void c()
  {
    d.b().lock();
    d.c();
    d.a();
    d.b().unlock();
  }
}

/* Location:
 * Qualified Name:     Y1.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */