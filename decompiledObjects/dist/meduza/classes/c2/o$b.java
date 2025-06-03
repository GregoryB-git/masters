package c2;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.webkit.WebResourceResponse;
import d2.d;
import d2.o;
import f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public final class o$b
  implements o.c
{
  public static final String[] b = { "app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/" };
  public final File a;
  
  public o$b(Context paramContext, File paramFile)
  {
    try
    {
      localObject = new java/io/File;
      ((File)localObject).<init>(o.a(paramFile));
      a = ((File)localObject);
      if (a(paramContext)) {
        return;
      }
      paramContext = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("The given directory \"");
      ((StringBuilder)localObject).append(paramFile);
      ((StringBuilder)localObject).append("\" doesn't exist under an allowed app internal storage directory");
      paramContext.<init>(((StringBuilder)localObject).toString());
      throw paramContext;
    }
    catch (IOException paramContext)
    {
      Object localObject = f.l("Failed to resolve the canonical path for the given directory: ");
      ((StringBuilder)localObject).append(paramFile.getPath());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString(), paramContext);
    }
  }
  
  public final boolean a(Context paramContext)
  {
    String str1 = o.a(a);
    Object localObject = o.a(paramContext.getCacheDir());
    if (Build.VERSION.SDK_INT >= 24) {
      paramContext = d.e(paramContext);
    } else {
      paramContext = paramContext.getCacheDir().getParentFile();
    }
    paramContext = o.a(paramContext);
    if ((!str1.startsWith((String)localObject)) && (!str1.startsWith(paramContext))) {
      return false;
    }
    if ((!str1.equals(localObject)) && (!str1.equals(paramContext)))
    {
      String[] arrayOfString = b;
      for (int i = 0; i < 5; i++)
      {
        String str2 = arrayOfString[i];
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append(str2);
        if (str1.startsWith(((StringBuilder)localObject).toString())) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final WebResourceResponse handle(String paramString)
  {
    try
    {
      Object localObject1 = a;
      localObject2 = o.a((File)localObject1);
      Object localObject3 = new java/io/File;
      ((File)localObject3).<init>((File)localObject1, paramString);
      localObject3 = ((File)localObject3).getCanonicalPath();
      if (((String)localObject3).startsWith((String)localObject2))
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject3);
      }
      else
      {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject1 = new java/io/FileInputStream;
        ((FileInputStream)localObject1).<init>((File)localObject2);
        localObject3 = localObject1;
        if (((File)localObject2).getPath().endsWith(".svgz"))
        {
          localObject3 = new java/util/zip/GZIPInputStream;
          ((GZIPInputStream)localObject3).<init>((InputStream)localObject1);
        }
        return new WebResourceResponse(o.b(paramString), null, (InputStream)localObject3);
      }
      Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", new Object[] { paramString, a }));
    }
    catch (IOException localIOException)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Error opening the requested path: ");
      ((StringBuilder)localObject2).append(paramString);
      Log.e("WebViewAssetLoader", ((StringBuilder)localObject2).toString(), localIOException);
    }
    return new WebResourceResponse(null, null, null);
  }
}

/* Location:
 * Qualified Name:     c2.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */