package androidx.webkit;

import d2.i0;
import d2.l;
import d2.z.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ProcessGlobalConfig
{
  public static final Object d = new Object();
  public static boolean e = false;
  private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference();
  public String a;
  public String b;
  public String c;
  
  public static void a(ProcessGlobalConfig paramProcessGlobalConfig)
  {
    synchronized (d)
    {
      int i;
      if (!e)
      {
        i = 1;
        e = true;
        ??? = new HashMap();
      }
      try
      {
        localObject2 = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject2 = ((Field)localObject2).get(null);
        if (localObject2 != null) {
          j = 1;
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        int j;
        for (;;) {}
      }
      j = 0;
      if (j == 0)
      {
        if (a != null) {
          if (i0.A.b()) {
            l.e(a);
          } else {
            ((HashMap)???).put("DATA_DIRECTORY_SUFFIX", a);
          }
        }
        localObject2 = b;
        if (localObject2 != null) {
          ((HashMap)???).put("DATA_DIRECTORY_BASE_PATH", localObject2);
        }
        paramProcessGlobalConfig = c;
        if (paramProcessGlobalConfig != null) {
          ((HashMap)???).put("CACHE_DIRECTORY_BASE_PATH", paramProcessGlobalConfig);
        }
        paramProcessGlobalConfig = sProcessGlobalConfig;
        do
        {
          if (paramProcessGlobalConfig.compareAndSet(null, ???))
          {
            j = i;
            break;
          }
        } while (paramProcessGlobalConfig.get() == null);
        j = 0;
        if (j != 0) {
          return;
        }
        throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
      }
      throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
      paramProcessGlobalConfig = new java/lang/IllegalStateException;
      paramProcessGlobalConfig.<init>("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
      throw paramProcessGlobalConfig;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.webkit.ProcessGlobalConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */