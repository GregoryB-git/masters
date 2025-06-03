package d2;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebMessagePort.WebMessageCallback;
import c2.k.a;

public final class c$a
  extends WebMessagePort.WebMessageCallback
{
  public c$a(k.a parama) {}
  
  public final void onMessage(WebMessagePort paramWebMessagePort, WebMessage paramWebMessage)
  {
    a.onMessage(new f0(paramWebMessagePort), c.d(paramWebMessage));
  }
}

/* Location:
 * Qualified Name:     d2.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */