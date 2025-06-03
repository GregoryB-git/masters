package com.google.firebase.messaging;

import A2.n;
import V2.j;
import V2.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class H
  implements Closeable
{
  public final URL o;
  public volatile Future p;
  public j q;
  
  public H(URL paramURL)
  {
    o = paramURL;
  }
  
  public static H e(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString);
      localObject = new H((URL)localObject);
      return (H)localObject;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Not downloading image, bad URL: ");
      localStringBuilder.append(paramString);
      Log.w("FirebaseMessaging", localStringBuilder.toString());
    }
    return null;
  }
  
  public Bitmap b()
  {
    if (Log.isLoggable("FirebaseMessaging", 4))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Starting download of: ");
      ((StringBuilder)localObject).append(o);
      Log.i("FirebaseMessaging", ((StringBuilder)localObject).toString());
    }
    Object localObject = c();
    localObject = BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length);
    if (localObject != null)
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Successfully downloaded image: ");
        localStringBuilder.append(o);
        Log.d("FirebaseMessaging", localStringBuilder.toString());
      }
      return (Bitmap)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Failed to decode image: ");
    ((StringBuilder)localObject).append(o);
    throw new IOException(((StringBuilder)localObject).toString());
  }
  
  /* Error */
  public final byte[] c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/google/firebase/messaging/H:o	Ljava/net/URL;
    //   4: invokevirtual 101	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 107	java/net/URLConnection:getContentLength	()I
    //   12: ldc 108
    //   14: if_icmpgt +123 -> 137
    //   17: aload_1
    //   18: invokevirtual 112	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   21: astore_1
    //   22: aload_1
    //   23: ldc2_w 113
    //   26: invokestatic 119	com/google/firebase/messaging/b:b	(Ljava/io/InputStream;J)Ljava/io/InputStream;
    //   29: invokestatic 122	com/google/firebase/messaging/b:d	(Ljava/io/InputStream;)[B
    //   32: astore_2
    //   33: aload_1
    //   34: ifnull +7 -> 41
    //   37: aload_1
    //   38: invokevirtual 127	java/io/InputStream:close	()V
    //   41: ldc 54
    //   43: iconst_2
    //   44: invokestatic 70	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   47: ifeq +51 -> 98
    //   50: new 45	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   57: astore_1
    //   58: aload_1
    //   59: ldc -127
    //   61: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_1
    //   66: aload_2
    //   67: arraylength
    //   68: invokevirtual 132	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_1
    //   73: ldc -122
    //   75: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_1
    //   80: aload_0
    //   81: getfield 19	com/google/firebase/messaging/H:o	Ljava/net/URL;
    //   84: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: ldc 54
    //   90: aload_1
    //   91: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokestatic 137	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   97: pop
    //   98: aload_2
    //   99: arraylength
    //   100: ldc 108
    //   102: if_icmpgt +5 -> 107
    //   105: aload_2
    //   106: areturn
    //   107: new 96	java/io/IOException
    //   110: dup
    //   111: ldc -117
    //   113: invokespecial 97	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   116: athrow
    //   117: astore_2
    //   118: aload_1
    //   119: ifnull +16 -> 135
    //   122: aload_1
    //   123: invokevirtual 127	java/io/InputStream:close	()V
    //   126: goto +9 -> 135
    //   129: astore_1
    //   130: aload_2
    //   131: aload_1
    //   132: invokevirtual 145	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   135: aload_2
    //   136: athrow
    //   137: new 96	java/io/IOException
    //   140: dup
    //   141: ldc -109
    //   143: invokespecial 97	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	H
    //   7	116	1	localObject1	Object
    //   129	3	1	localThrowable	Throwable
    //   32	74	2	arrayOfByte	byte[]
    //   117	19	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   22	33	117	finally
    //   122	126	129	finally
  }
  
  public void close()
  {
    p.cancel(true);
  }
  
  public j h()
  {
    return (j)n.i(q);
  }
  
  public void k(ExecutorService paramExecutorService)
  {
    k localk = new k();
    p = paramExecutorService.submit(new G(this, localk));
    q = localk.a();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */