package c2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.webkit.WebResourceResponse;
import d2.d;
import f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

public final class o
{
  public final List<d> a;
  
  public o(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public final WebResourceResponse a(Uri paramUri)
  {
    Iterator localIterator = a.iterator();
    Object localObject;
    do
    {
      d locald;
      do
      {
        boolean bool = localIterator.hasNext();
        localObject = null;
        if (!bool) {
          break;
        }
        locald = (d)localIterator.next();
        locald.getClass();
        if (((!paramUri.getScheme().equals("http")) || (a)) && ((paramUri.getScheme().equals("http")) || (paramUri.getScheme().equals("https"))) && (paramUri.getAuthority().equals(b)) && (paramUri.getPath().startsWith(c))) {
          localObject = d;
        }
      } while (localObject == null);
      localObject = ((c)localObject).handle(paramUri.getPath().replaceFirst(c, ""));
    } while (localObject == null);
    return (WebResourceResponse)localObject;
    return null;
  }
  
  public static final class a
    implements o.c
  {
    public d2.o a;
    
    public a(Context paramContext)
    {
      a = new d2.o(paramContext);
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
        localObject2 = new WebResourceResponse(d2.o.b(paramString), null, (InputStream)localObject1);
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
  
  public static final class b
    implements o.c
  {
    public static final String[] b = { "app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/" };
    public final File a;
    
    public b(Context paramContext, File paramFile)
    {
      try
      {
        localObject = new java/io/File;
        ((File)localObject).<init>(d2.o.a(paramFile));
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
      String str1 = d2.o.a(a);
      Object localObject = d2.o.a(paramContext.getCacheDir());
      if (Build.VERSION.SDK_INT >= 24) {
        paramContext = d.e(paramContext);
      } else {
        paramContext = paramContext.getCacheDir().getParentFile();
      }
      paramContext = d2.o.a(paramContext);
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
        localObject2 = d2.o.a((File)localObject1);
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
          return new WebResourceResponse(d2.o.b(paramString), null, (InputStream)localObject3);
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
  
  public static abstract interface c
  {
    public abstract WebResourceResponse handle(String paramString);
  }
  
  public static final class d
  {
    public final boolean a;
    public final String b;
    public final String c;
    public final o.c d;
    
    public d(String paramString1, String paramString2, boolean paramBoolean, o.c paramc)
    {
      if ((!paramString2.isEmpty()) && (paramString2.charAt(0) == '/'))
      {
        if (paramString2.endsWith("/"))
        {
          b = paramString1;
          c = paramString2;
          a = paramBoolean;
          d = paramc;
          return;
        }
        throw new IllegalArgumentException("Path should end with a slash '/'");
      }
      throw new IllegalArgumentException("Path should start with a slash '/'.");
    }
  }
  
  public static final class e
    implements o.c
  {
    public d2.o a;
    
    public e(Context paramContext)
    {
      a = new d2.o(paramContext);
    }
    
    public final WebResourceResponse handle(String paramString)
    {
      Object localObject;
      String str;
      try
      {
        localObject = a.c(paramString);
        localObject = new WebResourceResponse(d2.o.b(paramString), null, (InputStream)localObject);
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
}

/* Location:
 * Qualified Name:     c2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */