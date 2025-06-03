package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import l6.p;
import p6.a;

public final class d
  implements Runnable
{
  public static final a c = new a("RevokeAccessOperation", new String[0]);
  public final String a;
  public final p b;
  
  public d(String paramString)
  {
    m6.j.e(paramString);
    a = paramString;
    b = new p(null);
  }
  
  public final void run()
  {
    Status localStatus1 = Status.o;
    Status localStatus2 = localStatus1;
    Status localStatus3 = localStatus1;
    try
    {
      Object localObject2 = new java/net/URL;
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      String str = a;
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      Object localObject3 = new java/lang/StringBuilder;
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).<init>();
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).append("https://accounts.google.com/o/oauth2/revoke?token=");
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).append(str);
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((URL)localObject2).<init>(((StringBuilder)localObject3).toString());
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      localObject3 = (HttpURLConnection)((URL)localObject2).openConnection();
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((URLConnection)localObject3).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      int i = ((HttpURLConnection)localObject3).getResponseCode();
      if (i == 200)
      {
        localStatus2 = localStatus1;
        localStatus3 = localStatus1;
        localStatus1 = Status.e;
      }
      else
      {
        localStatus2 = localStatus1;
        localStatus3 = localStatus1;
        c.c("Unable to revoke access!", new Object[0]);
      }
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      localObject2 = c;
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      localObject3 = new java/lang/StringBuilder;
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).<init>();
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).append("Response Code: ");
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((StringBuilder)localObject3).append(i);
      localStatus2 = localStatus1;
      localStatus3 = localStatus1;
      ((a)localObject2).a(((StringBuilder)localObject3).toString(), new Object[0]);
    }
    catch (Exception localException) {}catch (IOException localIOException)
    {
      break label259;
    }
    c.c("Exception when revoking access: ".concat(String.valueOf(localIOException.toString())), new Object[0]);
    Object localObject1 = localStatus2;
    break label283;
    label259:
    c.c("IOException when revoking access: ".concat(String.valueOf(localObject1.toString())), new Object[0]);
    localObject1 = localStatus3;
    label283:
    b.setResult((k6.j)localObject1);
  }
}

/* Location:
 * Qualified Name:     h6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */