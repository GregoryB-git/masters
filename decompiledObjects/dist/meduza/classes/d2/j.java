package d2;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import java.util.List;

public final class j
{
  public static void a(SafeBrowsingResponse paramSafeBrowsingResponse, boolean paramBoolean)
  {
    paramSafeBrowsingResponse.backToSafety(paramBoolean);
  }
  
  public static Uri b()
  {
    return i.a();
  }
  
  public static void c(SafeBrowsingResponse paramSafeBrowsingResponse, boolean paramBoolean)
  {
    paramSafeBrowsingResponse.proceed(paramBoolean);
  }
  
  public static void d(List<String> paramList, ValueCallback<Boolean> paramValueCallback)
  {
    g.a(paramList, paramValueCallback);
  }
  
  public static void e(SafeBrowsingResponse paramSafeBrowsingResponse, boolean paramBoolean)
  {
    paramSafeBrowsingResponse.showInterstitial(paramBoolean);
  }
  
  public static void f(Context paramContext, ValueCallback<Boolean> paramValueCallback)
  {
    h.a(paramContext, paramValueCallback);
  }
}

/* Location:
 * Qualified Name:     d2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */