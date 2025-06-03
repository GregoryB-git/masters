package d2;

import android.webkit.TracingController;
import c2.h;
import c2.i;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

public final class a0
  extends i
{
  public TracingController a;
  public TracingControllerBoundaryInterface b;
  
  public a0()
  {
    a.g localg = i0.z;
    if (localg.c())
    {
      a = l.a();
      b = null;
    }
    else
    {
      if (!localg.d()) {
        break label55;
      }
      a = null;
      b = j0.b.a.getTracingController();
    }
    return;
    label55:
    throw i0.a();
  }
  
  public final boolean a()
  {
    a.g localg = i0.z;
    if (localg.c())
    {
      if (a == null) {
        a = l.a();
      }
      return l.d(a);
    }
    if (localg.d())
    {
      if (b == null) {
        b = j0.b.a.getTracingController();
      }
      return b.isTracing();
    }
    throw i0.a();
  }
  
  public final void b(h paramh)
  {
    if (paramh != null)
    {
      a.g localg = i0.z;
      if (localg.c())
      {
        if (a == null) {
          a = l.a();
        }
        l.f(a, paramh);
      }
      else
      {
        if (!localg.d()) {
          break label88;
        }
        if (b == null) {
          b = j0.b.a.getTracingController();
        }
        b.start(a, b, c);
      }
      return;
      label88:
      throw i0.a();
    }
    throw new IllegalArgumentException("Tracing config must be non null");
  }
  
  public final boolean c(FileOutputStream paramFileOutputStream, ExecutorService paramExecutorService)
  {
    a.g localg = i0.z;
    if (localg.c())
    {
      if (a == null) {
        a = l.a();
      }
      return l.g(a, paramFileOutputStream, paramExecutorService);
    }
    if (localg.d())
    {
      if (b == null) {
        b = j0.b.a.getTracingController();
      }
      return b.stop(paramFileOutputStream, paramExecutorService);
    }
    throw i0.a();
  }
}

/* Location:
 * Qualified Name:     d2.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */