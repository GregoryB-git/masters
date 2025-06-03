package G1;

import T1.a;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

public final class k
  extends AsyncTask
{
  public final String a;
  public final File b;
  public final a c;
  
  public k(String paramString, File paramFile, a parama)
  {
    a = paramString;
    b = paramFile;
    c = parama;
  }
  
  public Boolean a(String... paramVarArgs)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramVarArgs, "args");
      int i;
      Object localObject;
      FileOutputStream localFileOutputStream;
      return null;
    }
    finally
    {
      try
      {
        paramVarArgs = new java/net/URL;
        paramVarArgs.<init>(a);
        i = ((URLConnection)FirebasePerfUrlConnection.instrument(paramVarArgs.openConnection())).getContentLength();
        localObject = new java/io/DataInputStream;
        ((DataInputStream)localObject).<init>(FirebasePerfUrlConnection.openStream(paramVarArgs));
        paramVarArgs = new byte[i];
        ((DataInputStream)localObject).readFully(paramVarArgs);
        ((InputStream)localObject).close();
        localObject = new java/io/DataOutputStream;
        localFileOutputStream = new java/io/FileOutputStream;
        localFileOutputStream.<init>(b);
        ((DataOutputStream)localObject).<init>(localFileOutputStream);
        ((OutputStream)localObject).write(paramVarArgs);
        ((DataOutputStream)localObject).flush();
        ((OutputStream)localObject).close();
        paramVarArgs = Boolean.TRUE;
        return paramVarArgs;
      }
      catch (Exception paramVarArgs)
      {
        paramVarArgs = Boolean.FALSE;
        return paramVarArgs;
      }
      paramVarArgs = finally;
      a.b(paramVarArgs, this);
    }
  }
  
  /* Error */
  public void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 45	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: iload_1
    //   9: ifeq +25 -> 34
    //   12: aload_0
    //   13: getfield 35	G1/k:c	LG1/k$a;
    //   16: aload_0
    //   17: getfield 33	G1/k:b	Ljava/io/File;
    //   20: invokeinterface 120 2 0
    //   25: goto +9 -> 34
    //   28: astore_2
    //   29: aload_2
    //   30: aload_0
    //   31: invokestatic 117	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   34: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	k
    //   0	35	1	paramBoolean	boolean
    //   28	2	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   12	25	28	finally
  }
  
  public static abstract interface a
  {
    public abstract void a(File paramFile);
  }
}

/* Location:
 * Qualified Name:     G1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */