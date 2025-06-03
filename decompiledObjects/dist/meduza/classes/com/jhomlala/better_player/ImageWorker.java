package com.jhomlala.better_player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import androidx.work.d.a;
import androidx.work.d.a.a;
import androidx.work.d.a.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import pa.j;

public final class ImageWorker
  extends Worker
{
  public ImageWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  /* Error */
  public static Bitmap k(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: new 25	java/net/URL
    //   9: astore 4
    //   11: aload 4
    //   13: aload_0
    //   14: invokespecial 28	java/net/URL:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: invokevirtual 32	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   22: astore 5
    //   24: aload 5
    //   26: ldc 34
    //   28: invokestatic 37	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   31: aload 5
    //   33: checkcast 39	java/net/HttpURLConnection
    //   36: invokevirtual 45	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   39: astore 6
    //   41: aload 6
    //   43: astore_2
    //   44: aload 6
    //   46: astore 5
    //   48: new 47	android/graphics/BitmapFactory$Options
    //   51: astore 7
    //   53: aload 6
    //   55: astore_2
    //   56: aload 6
    //   58: astore 5
    //   60: aload 7
    //   62: invokespecial 50	android/graphics/BitmapFactory$Options:<init>	()V
    //   65: iconst_1
    //   66: istore 8
    //   68: iconst_1
    //   69: istore 9
    //   71: aload 6
    //   73: astore_2
    //   74: aload 6
    //   76: astore 5
    //   78: aload 7
    //   80: iconst_1
    //   81: putfield 54	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   84: aload 6
    //   86: astore_2
    //   87: aload 6
    //   89: astore 5
    //   91: aload 6
    //   93: aconst_null
    //   94: aload 7
    //   96: invokestatic 60	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   99: pop
    //   100: aload 6
    //   102: astore_2
    //   103: aload 6
    //   105: astore 5
    //   107: aload 6
    //   109: invokevirtual 65	java/io/InputStream:close	()V
    //   112: aload 6
    //   114: astore_2
    //   115: aload 6
    //   117: astore 5
    //   119: aload 4
    //   121: invokevirtual 32	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   124: astore 4
    //   126: aload 6
    //   128: astore_2
    //   129: aload 6
    //   131: astore 5
    //   133: aload 4
    //   135: ldc 34
    //   137: invokestatic 37	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   140: aload 6
    //   142: astore_2
    //   143: aload 6
    //   145: astore 5
    //   147: aload 4
    //   149: checkcast 39	java/net/HttpURLConnection
    //   152: invokevirtual 45	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   155: astore 6
    //   157: aload 6
    //   159: astore_2
    //   160: aload 6
    //   162: astore 5
    //   164: aload 7
    //   166: getfield 69	android/graphics/BitmapFactory$Options:outHeight	I
    //   169: istore 10
    //   171: aload 6
    //   173: astore_2
    //   174: aload 6
    //   176: astore 5
    //   178: aload 7
    //   180: getfield 72	android/graphics/BitmapFactory$Options:outWidth	I
    //   183: istore 11
    //   185: iload 10
    //   187: sipush 256
    //   190: if_icmpgt +11 -> 201
    //   193: iload 11
    //   195: sipush 256
    //   198: if_icmple +82 -> 280
    //   201: aload 6
    //   203: astore_2
    //   204: aload 6
    //   206: astore 5
    //   208: iload 10
    //   210: iconst_2
    //   211: idiv
    //   212: istore 10
    //   214: aload 6
    //   216: astore_2
    //   217: aload 6
    //   219: astore 5
    //   221: iload 11
    //   223: iconst_2
    //   224: idiv
    //   225: istore 11
    //   227: iload 9
    //   229: istore 8
    //   231: aload 6
    //   233: astore_2
    //   234: aload 6
    //   236: astore 5
    //   238: iload 10
    //   240: iload 9
    //   242: idiv
    //   243: sipush 256
    //   246: if_icmplt +34 -> 280
    //   249: iload 9
    //   251: istore 8
    //   253: aload 6
    //   255: astore_2
    //   256: aload 6
    //   258: astore 5
    //   260: iload 11
    //   262: iload 9
    //   264: idiv
    //   265: sipush 256
    //   268: if_icmplt +12 -> 280
    //   271: iload 9
    //   273: iconst_2
    //   274: imul
    //   275: istore 9
    //   277: goto -50 -> 227
    //   280: aload 6
    //   282: astore_2
    //   283: aload 6
    //   285: astore 5
    //   287: aload 7
    //   289: iload 8
    //   291: putfield 75	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   294: aload 6
    //   296: astore_2
    //   297: aload 6
    //   299: astore 5
    //   301: aload 7
    //   303: iconst_0
    //   304: putfield 54	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   307: aload 6
    //   309: astore_2
    //   310: aload 6
    //   312: astore 5
    //   314: aload 6
    //   316: aconst_null
    //   317: aload 7
    //   319: invokestatic 60	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   322: astore 4
    //   324: aload 4
    //   326: astore_0
    //   327: aload 6
    //   329: ifnull +98 -> 427
    //   332: aload 4
    //   334: astore_0
    //   335: aload 6
    //   337: astore 5
    //   339: goto +71 -> 410
    //   342: astore_0
    //   343: goto +87 -> 430
    //   346: astore_2
    //   347: aconst_null
    //   348: astore 5
    //   350: aload 5
    //   352: astore_2
    //   353: new 77	java/lang/StringBuilder
    //   356: astore 6
    //   358: aload 5
    //   360: astore_2
    //   361: aload 6
    //   363: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   366: aload 5
    //   368: astore_2
    //   369: aload 6
    //   371: ldc 80
    //   373: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: pop
    //   377: aload 5
    //   379: astore_2
    //   380: aload 6
    //   382: aload_0
    //   383: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: pop
    //   387: aload 5
    //   389: astore_2
    //   390: ldc 86
    //   392: aload 6
    //   394: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   397: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   400: pop
    //   401: aload_1
    //   402: astore_0
    //   403: aload 5
    //   405: ifnull +22 -> 427
    //   408: aload_3
    //   409: astore_0
    //   410: aload 5
    //   412: invokevirtual 65	java/io/InputStream:close	()V
    //   415: goto +12 -> 427
    //   418: astore_2
    //   419: ldc 86
    //   421: ldc 97
    //   423: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   426: pop
    //   427: aload_0
    //   428: areturn
    //   429: astore_0
    //   430: aload_2
    //   431: ifnull +19 -> 450
    //   434: aload_2
    //   435: invokevirtual 65	java/io/InputStream:close	()V
    //   438: goto +12 -> 450
    //   441: astore_2
    //   442: ldc 86
    //   444: ldc 97
    //   446: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   449: pop
    //   450: aload_0
    //   451: athrow
    //   452: astore_2
    //   453: goto -103 -> 350
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	456	0	paramString	String
    //   1	401	1	localObject1	Object
    //   3	307	2	localObject2	Object
    //   346	1	2	localException1	Exception
    //   352	38	2	localObject3	Object
    //   418	17	2	localException2	Exception
    //   441	1	2	localException3	Exception
    //   452	1	2	localException4	Exception
    //   5	404	3	localObject4	Object
    //   9	324	4	localObject5	Object
    //   22	389	5	localObject6	Object
    //   39	354	6	localObject7	Object
    //   51	267	7	localOptions	BitmapFactory.Options
    //   66	224	8	i	int
    //   69	207	9	j	int
    //   169	74	10	k	int
    //   183	82	11	m	int
    // Exception table:
    //   from	to	target	type
    //   6	41	342	finally
    //   6	41	346	java/lang/Exception
    //   410	415	418	java/lang/Exception
    //   48	53	429	finally
    //   60	65	429	finally
    //   78	84	429	finally
    //   91	100	429	finally
    //   107	112	429	finally
    //   119	126	429	finally
    //   133	140	429	finally
    //   147	157	429	finally
    //   164	171	429	finally
    //   178	185	429	finally
    //   208	214	429	finally
    //   221	227	429	finally
    //   238	249	429	finally
    //   260	271	429	finally
    //   287	294	429	finally
    //   301	307	429	finally
    //   314	324	429	finally
    //   353	358	429	finally
    //   361	366	429	finally
    //   369	377	429	finally
    //   380	387	429	finally
    //   390	401	429	finally
    //   434	438	441	java/lang/Exception
    //   48	53	452	java/lang/Exception
    //   60	65	452	java/lang/Exception
    //   78	84	452	java/lang/Exception
    //   91	100	452	java/lang/Exception
    //   107	112	452	java/lang/Exception
    //   119	126	452	java/lang/Exception
    //   133	140	452	java/lang/Exception
    //   147	157	452	java/lang/Exception
    //   164	171	452	java/lang/Exception
    //   178	185	452	java/lang/Exception
    //   208	214	452	java/lang/Exception
    //   221	227	452	java/lang/Exception
    //   238	249	452	java/lang/Exception
    //   260	271	452	java/lang/Exception
    //   287	294	452	java/lang/Exception
    //   301	307	452	java/lang/Exception
    //   314	324	452	java/lang/Exception
  }
  
  public static Bitmap l(String paramString)
  {
    try
    {
      Object localObject = new android/graphics/BitmapFactory$Options;
      ((BitmapFactory.Options)localObject).<init>();
      int i = 1;
      int j = 1;
      inJustDecodeBounds = true;
      int k = outHeight;
      int m = outWidth;
      if ((k > 256) || (m > 256))
      {
        k /= 2;
        m /= 2;
        for (;;)
        {
          i = j;
          if (k / j < 256) {
            break;
          }
          i = j;
          if (m / j < 256) {
            break;
          }
          j *= 2;
        }
      }
      inSampleSize = i;
      inJustDecodeBounds = false;
      localObject = BitmapFactory.decodeFile(paramString);
      paramString = (String)localObject;
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to get bitmap from internal url: ");
      localStringBuilder.append(paramString);
      Log.e("ImageWorker", localStringBuilder.toString());
      paramString = null;
    }
    return paramString;
  }
  
  public final d.a j()
  {
    d.a.a locala;
    try
    {
      Object localObject1 = b.b.d("url");
      if (localObject1 == null) {
        return new d.a.a();
      }
      if (j.b(Uri.parse((String)localObject1))) {
        localObject2 = k((String)localObject1);
      } else {
        localObject2 = l((String)localObject1);
      }
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append(((String)localObject1).hashCode());
      ((StringBuilder)localObject3).append(".png");
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(a.getCacheDir().getAbsolutePath());
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      if (localObject2 == null) {
        return new d.a.a();
      }
      localObject3 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject3).<init>((String)localObject1);
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject3);
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      ((HashMap)localObject2).put("filePath", localObject1);
      localObject1 = new androidx/work/c;
      ((c)localObject1).<init>((HashMap)localObject2);
      c.e((c)localObject1);
      localObject2 = new d.a.c((c)localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      locala = new d.a.a();
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.jhomlala.better_player.ImageWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */