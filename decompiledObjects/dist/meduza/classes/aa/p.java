package aa;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.net.URL;
import java.util.concurrent.Future;

public final class p
  implements Closeable
{
  public final URL a;
  public volatile Future<?> b;
  public Task<Bitmap> c;
  
  public p(URL paramURL)
  {
    a = paramURL;
  }
  
  public final void close()
  {
    b.cancel(true);
  }
  
  /* Error */
  public final Bitmap f()
  {
    // Byte code:
    //   0: ldc 35
    //   2: iconst_4
    //   3: invokestatic 41	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +28 -> 34
    //   9: ldc 43
    //   11: invokestatic 48	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: getfield 21	aa/p:a	Ljava/net/URL;
    //   20: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: ldc 35
    //   26: aload_1
    //   27: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 62	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   33: pop
    //   34: aload_0
    //   35: getfield 21	aa/p:a	Ljava/net/URL;
    //   38: invokevirtual 68	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   41: astore_1
    //   42: aload_1
    //   43: invokevirtual 74	java/net/URLConnection:getContentLength	()I
    //   46: ldc 75
    //   48: if_icmpgt +190 -> 238
    //   51: aload_1
    //   52: invokevirtual 79	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   55: astore_1
    //   56: new 81	aa/d$a
    //   59: astore_2
    //   60: aload_2
    //   61: aload_1
    //   62: invokespecial 84	aa/d$a:<init>	(Ljava/io/InputStream;)V
    //   65: aload_2
    //   66: invokestatic 89	aa/d:b	(Laa/d$a;)[B
    //   69: astore_2
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 93	java/io/InputStream:close	()V
    //   78: ldc 35
    //   80: iconst_2
    //   81: invokestatic 41	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   84: ifeq +42 -> 126
    //   87: ldc 95
    //   89: invokestatic 48	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: astore_1
    //   93: aload_1
    //   94: aload_2
    //   95: arraylength
    //   96: invokevirtual 98	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_1
    //   101: ldc 100
    //   103: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_1
    //   108: aload_0
    //   109: getfield 21	aa/p:a	Ljava/net/URL;
    //   112: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: ldc 35
    //   118: aload_1
    //   119: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 105	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   125: pop
    //   126: aload_2
    //   127: arraylength
    //   128: ldc 75
    //   130: if_icmpgt +78 -> 208
    //   133: aload_2
    //   134: iconst_0
    //   135: aload_2
    //   136: arraylength
    //   137: invokestatic 111	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   140: astore_1
    //   141: aload_1
    //   142: ifnull +39 -> 181
    //   145: ldc 35
    //   147: iconst_3
    //   148: invokestatic 41	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   151: ifeq +28 -> 179
    //   154: ldc 113
    //   156: invokestatic 48	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: astore_2
    //   160: aload_2
    //   161: aload_0
    //   162: getfield 21	aa/p:a	Ljava/net/URL;
    //   165: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: ldc 35
    //   171: aload_2
    //   172: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokestatic 116	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   178: pop
    //   179: aload_1
    //   180: areturn
    //   181: ldc 118
    //   183: invokestatic 48	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: astore_1
    //   187: aload_1
    //   188: aload_0
    //   189: getfield 21	aa/p:a	Ljava/net/URL;
    //   192: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: new 120	java/io/IOException
    //   199: dup
    //   200: aload_1
    //   201: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokespecial 123	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   207: athrow
    //   208: new 120	java/io/IOException
    //   211: dup
    //   212: ldc 125
    //   214: invokespecial 123	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   217: athrow
    //   218: astore_2
    //   219: aload_1
    //   220: ifnull +16 -> 236
    //   223: aload_1
    //   224: invokevirtual 93	java/io/InputStream:close	()V
    //   227: goto +9 -> 236
    //   230: astore_1
    //   231: aload_2
    //   232: aload_1
    //   233: invokevirtual 131	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   236: aload_2
    //   237: athrow
    //   238: new 120	java/io/IOException
    //   241: dup
    //   242: ldc -123
    //   244: invokespecial 123	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	p
    //   14	210	1	localObject1	Object
    //   230	3	1	localThrowable	Throwable
    //   59	113	2	localObject2	Object
    //   218	19	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   56	70	218	finally
    //   223	227	230	finally
  }
}

/* Location:
 * Qualified Name:     aa.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */