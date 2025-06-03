package c2;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import android.webkit.WebResourceResponse;
import d2.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public final class o$a
  implements o.c
{
  public o a;
  
  public o$a(Context paramContext)
  {
    a = new o(paramContext);
  }
  
  public final WebResourceResponse handle(String paramString)
  {
    try
    {
      Object localObject1 = a;
      localObject1.getClass();
      if ((paramString.length() > 1) && (paramString.charAt(0) == '/')) {
        localObject2 = paramString.substring(1);
      } else {
        localObject2 = paramString;
      }
      InputStream localInputStream = a.getAssets().open((String)localObject2, 2);
      localObject1 = localInputStream;
      if (((String)localObject2).endsWith(".svgz"))
      {
        localObject1 = new java/util/zip/GZIPInputStream;
        ((GZIPInputStream)localObject1).<init>(localInputStream);
      }
      localObject2 = new WebResourceResponse(o.b(paramString), null, (InputStream)localObject1);
      return (WebResourceResponse)localObject2;
    }
    catch (IOException localIOException)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Error opening asset path: ");
      ((StringBuilder)localObject2).append(paramString);
      Log.e("WebViewAssetLoader", ((StringBuilder)localObject2).toString(), localIOException);
    }
    return new WebResourceResponse(null, null, null);
  }
}

/* Location:
 * Qualified Name:     c2.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */