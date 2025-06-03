package O1;

import W5.g;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.I;
import x1.K;
import x1.a.c;
import x1.o;
import x1.p;
import x1.r;

public final class V$e
  extends AsyncTask
{
  public final String a;
  public final Bundle b;
  public Exception[] c;
  
  public V$e(V paramV, String paramString, Bundle paramBundle)
  {
    a = paramString;
    b = paramBundle;
    c = new Exception[0];
  }
  
  public static final void c(String[] paramArrayOfString, int paramInt, e parame, CountDownLatch paramCountDownLatch, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfString, "$results");
    Intrinsics.checkNotNullParameter(parame, "this$0");
    Intrinsics.checkNotNullParameter(paramCountDownLatch, "$latch");
    Intrinsics.checkNotNullParameter(paramK, "response");
    try
    {
      r localr = paramK.b();
      Object localObject = "Error staging photo.";
      if (localr != null)
      {
        paramArrayOfString = localr.c();
        if (paramArrayOfString == null) {
          paramArrayOfString = (String[])localObject;
        }
        localObject = new x1/p;
        ((p)localObject).<init>(paramK, paramArrayOfString);
        throw ((Throwable)localObject);
      }
    }
    catch (Exception paramArrayOfString)
    {
      break label135;
      paramK = paramK.c();
      if (paramK != null)
      {
        paramK = paramK.optString("uri");
        if (paramK != null)
        {
          paramArrayOfString[paramInt] = paramK;
        }
        else
        {
          paramArrayOfString = new x1/o;
          paramArrayOfString.<init>("Error staging photo.");
          throw paramArrayOfString;
        }
      }
      else
      {
        paramArrayOfString = new x1/o;
        paramArrayOfString.<init>("Error staging photo.");
        throw paramArrayOfString;
        label135:
        c[paramInt] = paramArrayOfString;
      }
      paramCountDownLatch.countDown();
    }
  }
  
  public String[] b(Void... paramVarArgs)
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramVarArgs, "p0");
      String[] arrayOfString1 = b.getStringArray("media");
      if (arrayOfString1 == null) {
        return null;
      }
      String[] arrayOfString2 = new String[arrayOfString1.length];
      c = new Exception[arrayOfString1.length];
      Object localObject = new java/util/concurrent/CountDownLatch;
      ((CountDownLatch)localObject).<init>(arrayOfString1.length);
      paramVarArgs = new java/util/concurrent/ConcurrentLinkedQueue;
      paramVarArgs.<init>();
      x1.a locala = x1.a.z.e();
      int i;
      int j;
      int k;
      Uri localUri;
      W localW;
      a2.a locala1;
      label279:
      return null;
    }
    finally
    {
      try
      {
        i = arrayOfString1.length - 1;
        if (i >= 0) {
          for (j = 0;; j = k)
          {
            k = j + 1;
            if (isCancelled())
            {
              localObject = paramVarArgs.iterator();
              while (((Iterator)localObject).hasNext())
              {
                ((I)((Iterator)localObject).next()).cancel(true);
                continue;
                paramVarArgs = finally;
                break label279;
              }
              return null;
            }
            localUri = Uri.parse(arrayOfString1[j]);
            if (P.e0(localUri))
            {
              arrayOfString2[j] = localUri.toString();
              ((CountDownLatch)localObject).countDown();
            }
            else
            {
              localW = new O1/W;
              localW.<init>(arrayOfString2, j, this, (CountDownLatch)localObject);
              locala1 = a2.a.a;
              Intrinsics.checkNotNullExpressionValue(localUri, "uri");
              paramVarArgs.add(a2.a.a(locala, localUri, localW).l());
            }
            if (k > i) {
              break;
            }
          }
        }
        ((CountDownLatch)localObject).await();
        return arrayOfString2;
      }
      catch (Exception localException)
      {
        paramVarArgs = paramVarArgs.iterator();
        while (paramVarArgs.hasNext()) {
          ((I)paramVarArgs.next()).cancel(true);
        }
        return null;
      }
      T1.a.b(paramVarArgs, this);
    }
  }
  
  public void d(String[] paramArrayOfString)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      localObject1 = V.h(d);
      if (localObject1 != null) {
        ((Dialog)localObject1).dismiss();
      }
      localObject2 = c;
      int i = localObject2.length;
      j = 0;
      while (j < i)
      {
        localObject1 = localObject2[j];
        j++;
        if (localObject1 != null)
        {
          d.y((Throwable)localObject1);
          return;
        }
      }
    }
    finally
    {
      int j;
      break label272;
      if (paramArrayOfString == null)
      {
        localObject1 = d;
        paramArrayOfString = new x1/o;
        paramArrayOfString.<init>("Failed to stage photos for web dialog");
        ((V)localObject1).y(paramArrayOfString);
        return;
      }
      paramArrayOfString = g.b(paramArrayOfString);
      if (paramArrayOfString.contains(null))
      {
        localObject1 = d;
        paramArrayOfString = new x1/o;
        paramArrayOfString.<init>("Failed to stage photos for web dialog");
        ((V)localObject1).y(paramArrayOfString);
        return;
      }
      Object localObject1 = P.a;
      localObject1 = b;
      Object localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>((Collection)paramArrayOfString);
      P.p0((Bundle)localObject1, "media", localObject2);
      paramArrayOfString = H.b();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(B.w());
      ((StringBuilder)localObject1).append("/dialog/");
      ((StringBuilder)localObject1).append(a);
      paramArrayOfString = P.g(paramArrayOfString, ((StringBuilder)localObject1).toString(), b);
      V.m(d, paramArrayOfString.toString());
      paramArrayOfString = V.e(d);
      if (paramArrayOfString != null)
      {
        j = paramArrayOfString.getDrawable().getIntrinsicWidth();
        V.l(d, j / 2 + 1);
        return;
      }
      paramArrayOfString = new java/lang/IllegalStateException;
      paramArrayOfString.<init>("Required value was null.".toString());
      throw paramArrayOfString;
      label272:
      T1.a.b(paramArrayOfString, this);
    }
  }
}

/* Location:
 * Qualified Name:     O1.V.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */