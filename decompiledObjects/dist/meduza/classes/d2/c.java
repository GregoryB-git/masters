package d2;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebMessagePort.WebMessageCallback;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.VisualStateCallback;
import c2.j;
import c2.k;
import c2.k.a;
import c2.p.a;

public final class c
{
  public static void a(WebMessagePort paramWebMessagePort)
  {
    paramWebMessagePort.close();
  }
  
  public static WebMessage b(j paramj)
  {
    int i = 0;
    paramj.a(0);
    String str = b;
    k[] arrayOfk = a;
    if (arrayOfk == null)
    {
      paramj = null;
    }
    else
    {
      int j = arrayOfk.length;
      paramj = new WebMessagePort[j];
      while (i < j)
      {
        paramj[i] = arrayOfk[i].b();
        i++;
      }
    }
    return new WebMessage(str, paramj);
  }
  
  public static WebMessagePort[] c(WebView paramWebView)
  {
    return paramWebView.createWebMessageChannel();
  }
  
  public static j d(WebMessage paramWebMessage)
  {
    String str = paramWebMessage.getData();
    WebMessagePort[] arrayOfWebMessagePort = paramWebMessage.getPorts();
    if (arrayOfWebMessagePort == null)
    {
      paramWebMessage = null;
    }
    else
    {
      paramWebMessage = new k[arrayOfWebMessagePort.length];
      for (int i = 0; i < arrayOfWebMessagePort.length; i++) {
        paramWebMessage[i] = new f0(arrayOfWebMessagePort[i]);
      }
    }
    return new j(str, paramWebMessage);
  }
  
  public static CharSequence e(WebResourceError paramWebResourceError)
  {
    return paramWebResourceError.getDescription();
  }
  
  public static int f(WebResourceError paramWebResourceError)
  {
    return paramWebResourceError.getErrorCode();
  }
  
  public static boolean g(WebSettings paramWebSettings)
  {
    return paramWebSettings.getOffscreenPreRaster();
  }
  
  public static void h(WebMessagePort paramWebMessagePort, WebMessage paramWebMessage)
  {
    paramWebMessagePort.postMessage(paramWebMessage);
  }
  
  public static void i(WebView paramWebView, long paramLong, p.a parama)
  {
    paramWebView.postVisualStateCallback(paramLong, new c(parama));
  }
  
  public static void j(WebView paramWebView, WebMessage paramWebMessage, Uri paramUri)
  {
    paramWebView.postWebMessage(paramWebMessage, paramUri);
  }
  
  public static void k(WebSettings paramWebSettings, boolean paramBoolean)
  {
    paramWebSettings.setOffscreenPreRaster(paramBoolean);
  }
  
  public static void l(WebMessagePort paramWebMessagePort, k.a parama)
  {
    paramWebMessagePort.setWebMessageCallback(new a(parama));
  }
  
  public static void m(WebMessagePort paramWebMessagePort, k.a parama, Handler paramHandler)
  {
    paramWebMessagePort.setWebMessageCallback(new b(parama), paramHandler);
  }
  
  public final class a
    extends WebMessagePort.WebMessageCallback
  {
    public a() {}
    
    public final void onMessage(WebMessagePort paramWebMessagePort, WebMessage paramWebMessage)
    {
      onMessage(new f0(paramWebMessagePort), c.d(paramWebMessage));
    }
  }
  
  public final class b
    extends WebMessagePort.WebMessageCallback
  {
    public b() {}
    
    public final void onMessage(WebMessagePort paramWebMessagePort, WebMessage paramWebMessage)
    {
      onMessage(new f0(paramWebMessagePort), c.d(paramWebMessage));
    }
  }
  
  public final class c
    extends WebView.VisualStateCallback
  {
    public c() {}
    
    public final void onComplete(long paramLong)
    {
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     d2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */