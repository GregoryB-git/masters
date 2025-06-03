package d2;

import android.os.Looper;
import android.support.v4.media.session.b;
import android.webkit.TracingConfig.Builder;
import android.webkit.TracingController;
import android.webkit.WebView;
import c2.h;
import com.google.android.recaptcha.internal.a;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public final class l
{
  public static TracingController a()
  {
    return TracingController.getInstance();
  }
  
  public static ClassLoader b()
  {
    return k.g();
  }
  
  public static Looper c(WebView paramWebView)
  {
    return a.g(paramWebView);
  }
  
  public static boolean d(TracingController paramTracingController)
  {
    return paramTracingController.isTracing();
  }
  
  public static void e(String paramString)
  {
    b.o(paramString);
  }
  
  public static void f(TracingController paramTracingController, h paramh)
  {
    paramTracingController.start(new TracingConfig.Builder().addCategories(new int[] { a }).addCategories(b).setTracingMode(c).build());
  }
  
  public static boolean g(TracingController paramTracingController, OutputStream paramOutputStream, Executor paramExecutor)
  {
    return paramTracingController.stop(paramOutputStream, paramExecutor);
  }
}

/* Location:
 * Qualified Name:     d2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */