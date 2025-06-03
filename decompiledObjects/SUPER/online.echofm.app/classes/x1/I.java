package x1;

import O1.P;
import T1.a;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

public class I
  extends AsyncTask
{
  public static final a d = new a(null);
  public static final String e = I.class.getCanonicalName();
  public final HttpURLConnection a;
  public final J b;
  public Exception c;
  
  public I(HttpURLConnection paramHttpURLConnection, J paramJ)
  {
    a = paramHttpURLConnection;
    b = paramJ;
  }
  
  public I(J paramJ)
  {
    this(null, paramJ);
  }
  
  /* Error */
  public List a(Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 59	T1/a:d	(Ljava/lang/Object;)Z
    //   4: istore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: iload_2
    //   8: ifeq +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_1
    //   14: ldc 61
    //   16: invokestatic 42	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 46	x1/I:a	Ljava/net/HttpURLConnection;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnonnull +22 -> 47
    //   28: aload_0
    //   29: getfield 48	x1/I:b	Lx1/J;
    //   32: invokevirtual 67	x1/J:i	()Ljava/util/List;
    //   35: astore_1
    //   36: goto +33 -> 69
    //   39: astore_1
    //   40: goto +31 -> 71
    //   43: astore_1
    //   44: goto +18 -> 62
    //   47: getstatic 73	x1/F:n	Lx1/F$c;
    //   50: aload_1
    //   51: aload_0
    //   52: getfield 48	x1/I:b	Lx1/J;
    //   55: invokevirtual 79	x1/F$c:o	(Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
    //   58: astore_1
    //   59: goto -23 -> 36
    //   62: aload_0
    //   63: aload_1
    //   64: putfield 81	x1/I:c	Ljava/lang/Exception;
    //   67: aload_3
    //   68: astore_1
    //   69: aload_1
    //   70: areturn
    //   71: aload_1
    //   72: aload_0
    //   73: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   76: aconst_null
    //   77: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	I
    //   0	78	1	paramVarArgs	Void[]
    //   4	4	2	bool	boolean
    //   6	62	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	19	39	finally
    //   19	24	39	finally
    //   28	36	39	finally
    //   47	59	39	finally
    //   62	67	39	finally
    //   19	24	43	java/lang/Exception
    //   28	36	43	java/lang/Exception
    //   47	59	43	java/lang/Exception
  }
  
  public void b(List paramList)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramList, "result");
      super.onPostExecute(paramList);
      paramList = c;
      if (paramList != null)
      {
        Object localObject = P.a;
        localObject = e;
        x localx = x.a;
        paramList = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[] { paramList.getMessage() }, 1));
        Intrinsics.checkNotNullExpressionValue(paramList, "java.lang.String.format(format, *args)");
        P.j0((String)localObject, paramList);
      }
    }
    finally
    {
      break label80;
    }
    return;
    label80:
    a.b(paramList, this);
  }
  
  public void onPreExecute()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      super.onPreExecute();
      if (B.D())
      {
        Object localObject1 = P.a;
        localObject1 = e;
        Object localObject3 = x.a;
        localObject3 = String.format("execute async task: %s", Arrays.copyOf(new Object[] { this }, 1));
        Intrinsics.checkNotNullExpressionValue(localObject3, "java.lang.String.format(format, *args)");
        P.j0((String)localObject1, (String)localObject3);
      }
    }
    finally
    {
      break label116;
    }
    Handler localHandler;
    if (b.S() == null)
    {
      if ((Thread.currentThread() instanceof HandlerThread))
      {
        localHandler = new android/os/Handler;
        localHandler.<init>();
      }
      else
      {
        localHandler = new Handler(Looper.getMainLooper());
      }
      b.e0(localHandler);
    }
    return;
    label116:
    a.b(localHandler, this);
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{RequestAsyncTask: ");
    ((StringBuilder)localObject).append(" connection: ");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", requests: ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
    return (String)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     x1.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */