package c2;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import android.webkit.WebResourceResponse;
import d2.o;
import java.io.IOException;
import java.io.InputStream;

public final class o$e
  implements o.c
{
  public o a;
  
  public o$e(Context paramContext)
  {
    a = new o(paramContext);
  }
  
  public final WebResourceResponse handle(String paramString)
  {
    Object localObject;
    String str;
    try
    {
      localObject = a.c(paramString);
      localObject = new WebResourceResponse(o.b(paramString), null, (InputStream)localObject);
      return (WebResourceResponse)localObject;
    }
    catch (IOException localIOException)
    {
      localObject = new StringBuilder();
      str = "Error opening resource from the path: ";
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      localObject = new StringBuilder();
      str = "Resource not found from the path: ";
    }
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    Log.e("WebViewAssetLoader", ((StringBuilder)localObject).toString(), localNotFoundException);
    return new WebResourceResponse(null, null, null);
  }
}

/* Location:
 * Qualified Name:     c2.o.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */