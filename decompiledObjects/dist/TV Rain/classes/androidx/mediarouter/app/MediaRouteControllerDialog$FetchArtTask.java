package androidx.mediarouter.app;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.core.util.ObjectsCompat;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class MediaRouteControllerDialog$FetchArtTask
  extends AsyncTask<Void, Void, Bitmap>
{
  private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120L;
  private int mBackgroundColor;
  private final Bitmap mIconBitmap;
  private final Uri mIconUri;
  private long mStartTimeMillis;
  
  public MediaRouteControllerDialog$FetchArtTask(MediaRouteControllerDialog paramMediaRouteControllerDialog)
  {
    Object localObject1 = mDescription;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((MediaDescriptionCompat)localObject1).getIconBitmap();
    }
    Object localObject3 = localObject1;
    if (MediaRouteControllerDialog.isBitmapRecycled((Bitmap)localObject1))
    {
      Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
      localObject3 = null;
    }
    mIconBitmap = ((Bitmap)localObject3);
    paramMediaRouteControllerDialog = mDescription;
    if (paramMediaRouteControllerDialog == null) {
      paramMediaRouteControllerDialog = (MediaRouteControllerDialog)localObject2;
    } else {
      paramMediaRouteControllerDialog = paramMediaRouteControllerDialog.getIconUri();
    }
    mIconUri = paramMediaRouteControllerDialog;
  }
  
  private InputStream openInputStreamByScheme(Uri paramUri)
    throws IOException
  {
    String str = paramUri.getScheme().toLowerCase();
    if ((!"android.resource".equals(str)) && (!"content".equals(str)) && (!"file".equals(str)))
    {
      paramUri = new URL(paramUri.toString()).openConnection();
      int i = MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS;
      paramUri.setConnectTimeout(i);
      paramUri.setReadTimeout(i);
      paramUri = paramUri.getInputStream();
    }
    else
    {
      paramUri = this$0.mContext.getContentResolver().openInputStream(paramUri);
    }
    if (paramUri == null) {
      paramUri = null;
    } else {
      paramUri = new BufferedInputStream(paramUri);
    }
    return paramUri;
  }
  
  /* Error */
  public Bitmap doInBackground(Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
    //   4: astore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: aconst_null
    //   8: astore_3
    //   9: aload_1
    //   10: ifnull +6 -> 16
    //   13: goto +535 -> 548
    //   16: aload_0
    //   17: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull +524 -> 546
    //   25: aload_0
    //   26: aload_1
    //   27: invokespecial 139	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   30: astore 4
    //   32: aload 4
    //   34: ifnonnull +84 -> 118
    //   37: aload 4
    //   39: astore_3
    //   40: aload 4
    //   42: astore_1
    //   43: new 141	java/lang/StringBuilder
    //   46: astore 5
    //   48: aload 4
    //   50: astore_3
    //   51: aload 4
    //   53: astore_1
    //   54: aload 5
    //   56: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   59: aload 4
    //   61: astore_3
    //   62: aload 4
    //   64: astore_1
    //   65: aload 5
    //   67: ldc -112
    //   69: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 4
    //   75: astore_3
    //   76: aload 4
    //   78: astore_1
    //   79: aload 5
    //   81: aload_0
    //   82: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   85: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload 4
    //   91: astore_3
    //   92: aload 4
    //   94: astore_1
    //   95: ldc 44
    //   97: aload 5
    //   99: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   105: pop
    //   106: aload 4
    //   108: ifnull +8 -> 116
    //   111: aload 4
    //   113: invokevirtual 157	java/io/InputStream:close	()V
    //   116: aconst_null
    //   117: areturn
    //   118: aload 4
    //   120: astore_3
    //   121: aload 4
    //   123: astore_1
    //   124: new 159	android/graphics/BitmapFactory$Options
    //   127: astore 6
    //   129: aload 4
    //   131: astore_3
    //   132: aload 4
    //   134: astore_1
    //   135: aload 6
    //   137: invokespecial 160	android/graphics/BitmapFactory$Options:<init>	()V
    //   140: aload 4
    //   142: astore_3
    //   143: aload 4
    //   145: astore_1
    //   146: aload 6
    //   148: iconst_1
    //   149: putfield 164	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   152: aload 4
    //   154: astore_3
    //   155: aload 4
    //   157: astore_1
    //   158: aload 4
    //   160: aconst_null
    //   161: aload 6
    //   163: invokestatic 170	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   166: pop
    //   167: aload 4
    //   169: astore_3
    //   170: aload 4
    //   172: astore_1
    //   173: aload 6
    //   175: getfield 173	android/graphics/BitmapFactory$Options:outWidth	I
    //   178: ifeq +267 -> 445
    //   181: aload 4
    //   183: astore_3
    //   184: aload 4
    //   186: astore_1
    //   187: aload 6
    //   189: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
    //   192: istore 7
    //   194: iload 7
    //   196: ifne +6 -> 202
    //   199: goto +246 -> 445
    //   202: aload 4
    //   204: astore_1
    //   205: aload 4
    //   207: invokevirtual 179	java/io/InputStream:reset	()V
    //   210: goto +121 -> 331
    //   213: astore_1
    //   214: aload 4
    //   216: astore_3
    //   217: aload 4
    //   219: astore_1
    //   220: aload 4
    //   222: invokevirtual 157	java/io/InputStream:close	()V
    //   225: aload 4
    //   227: astore_3
    //   228: aload 4
    //   230: astore_1
    //   231: aload_0
    //   232: aload_0
    //   233: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   236: invokespecial 139	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   239: astore 5
    //   241: aload 5
    //   243: astore 4
    //   245: aload 5
    //   247: ifnonnull +84 -> 331
    //   250: aload 5
    //   252: astore_3
    //   253: aload 5
    //   255: astore_1
    //   256: new 141	java/lang/StringBuilder
    //   259: astore 4
    //   261: aload 5
    //   263: astore_3
    //   264: aload 5
    //   266: astore_1
    //   267: aload 4
    //   269: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   272: aload 5
    //   274: astore_3
    //   275: aload 5
    //   277: astore_1
    //   278: aload 4
    //   280: ldc -112
    //   282: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload 5
    //   288: astore_3
    //   289: aload 5
    //   291: astore_1
    //   292: aload 4
    //   294: aload_0
    //   295: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   298: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload 5
    //   304: astore_3
    //   305: aload 5
    //   307: astore_1
    //   308: ldc 44
    //   310: aload 4
    //   312: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   318: pop
    //   319: aload 5
    //   321: ifnull +8 -> 329
    //   324: aload 5
    //   326: invokevirtual 157	java/io/InputStream:close	()V
    //   329: aconst_null
    //   330: areturn
    //   331: aload 4
    //   333: astore_3
    //   334: aload 4
    //   336: astore_1
    //   337: aload 6
    //   339: iconst_0
    //   340: putfield 164	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   343: aload 4
    //   345: astore_3
    //   346: aload 4
    //   348: astore_1
    //   349: aload_0
    //   350: getfield 25	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:this$0	Landroidx/mediarouter/app/MediaRouteControllerDialog;
    //   353: aload 6
    //   355: getfield 173	android/graphics/BitmapFactory$Options:outWidth	I
    //   358: aload 6
    //   360: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
    //   363: invokevirtual 183	androidx/mediarouter/app/MediaRouteControllerDialog:getDesiredArtHeight	(II)I
    //   366: istore 7
    //   368: aload 4
    //   370: astore_3
    //   371: aload 4
    //   373: astore_1
    //   374: aload 6
    //   376: iconst_1
    //   377: aload 6
    //   379: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
    //   382: iload 7
    //   384: idiv
    //   385: invokestatic 189	java/lang/Integer:highestOneBit	(I)I
    //   388: invokestatic 194	java/lang/Math:max	(II)I
    //   391: putfield 197	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   394: aload 4
    //   396: astore_3
    //   397: aload 4
    //   399: astore_1
    //   400: aload_0
    //   401: invokevirtual 201	android/os/AsyncTask:isCancelled	()Z
    //   404: istore 8
    //   406: iload 8
    //   408: ifeq +10 -> 418
    //   411: aload 4
    //   413: invokevirtual 157	java/io/InputStream:close	()V
    //   416: aconst_null
    //   417: areturn
    //   418: aload 4
    //   420: astore_3
    //   421: aload 4
    //   423: astore_1
    //   424: aload 4
    //   426: aconst_null
    //   427: aload 6
    //   429: invokestatic 170	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   432: astore 5
    //   434: aload 4
    //   436: invokevirtual 157	java/io/InputStream:close	()V
    //   439: aload 5
    //   441: astore_1
    //   442: goto +106 -> 548
    //   445: aload 4
    //   447: invokevirtual 157	java/io/InputStream:close	()V
    //   450: aconst_null
    //   451: areturn
    //   452: astore 4
    //   454: goto +11 -> 465
    //   457: astore_1
    //   458: goto +78 -> 536
    //   461: astore 4
    //   463: aconst_null
    //   464: astore_3
    //   465: aload_3
    //   466: astore_1
    //   467: new 141	java/lang/StringBuilder
    //   470: astore 5
    //   472: aload_3
    //   473: astore_1
    //   474: aload 5
    //   476: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   479: aload_3
    //   480: astore_1
    //   481: aload 5
    //   483: ldc -112
    //   485: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: pop
    //   489: aload_3
    //   490: astore_1
    //   491: aload 5
    //   493: aload_0
    //   494: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   497: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload_3
    //   502: astore_1
    //   503: ldc 44
    //   505: aload 5
    //   507: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   510: aload 4
    //   512: invokestatic 204	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   515: pop
    //   516: aload_3
    //   517: ifnull +29 -> 546
    //   520: aload_3
    //   521: invokevirtual 157	java/io/InputStream:close	()V
    //   524: goto +22 -> 546
    //   527: astore_3
    //   528: aload_1
    //   529: astore 4
    //   531: aload_3
    //   532: astore_1
    //   533: aload 4
    //   535: astore_3
    //   536: aload_3
    //   537: ifnull +7 -> 544
    //   540: aload_3
    //   541: invokevirtual 157	java/io/InputStream:close	()V
    //   544: aload_1
    //   545: athrow
    //   546: aconst_null
    //   547: astore_1
    //   548: aload_1
    //   549: invokestatic 42	androidx/mediarouter/app/MediaRouteControllerDialog:isBitmapRecycled	(Landroid/graphics/Bitmap;)Z
    //   552: ifeq +36 -> 588
    //   555: new 141	java/lang/StringBuilder
    //   558: dup
    //   559: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   562: astore_3
    //   563: aload_3
    //   564: ldc -50
    //   566: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: pop
    //   570: aload_3
    //   571: aload_1
    //   572: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: ldc 44
    //   578: aload_3
    //   579: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   585: pop
    //   586: aconst_null
    //   587: areturn
    //   588: aload_1
    //   589: ifnull +67 -> 656
    //   592: aload_1
    //   593: invokevirtual 212	android/graphics/Bitmap:getWidth	()I
    //   596: aload_1
    //   597: invokevirtual 215	android/graphics/Bitmap:getHeight	()I
    //   600: if_icmpge +56 -> 656
    //   603: new 217	androidx/palette/graphics/Palette$Builder
    //   606: dup
    //   607: aload_1
    //   608: invokespecial 220	androidx/palette/graphics/Palette$Builder:<init>	(Landroid/graphics/Bitmap;)V
    //   611: iconst_1
    //   612: invokevirtual 224	androidx/palette/graphics/Palette$Builder:maximumColorCount	(I)Landroidx/palette/graphics/Palette$Builder;
    //   615: invokevirtual 228	androidx/palette/graphics/Palette$Builder:generate	()Landroidx/palette/graphics/Palette;
    //   618: astore_3
    //   619: aload_3
    //   620: invokevirtual 234	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
    //   623: invokeinterface 239 1 0
    //   628: ifeq +6 -> 634
    //   631: goto +20 -> 651
    //   634: aload_3
    //   635: invokevirtual 234	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
    //   638: iconst_0
    //   639: invokeinterface 243 2 0
    //   644: checkcast 245	androidx/palette/graphics/Palette$Swatch
    //   647: invokevirtual 248	androidx/palette/graphics/Palette$Swatch:getRgb	()I
    //   650: istore_2
    //   651: aload_0
    //   652: iload_2
    //   653: putfield 250	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mBackgroundColor	I
    //   656: aload_1
    //   657: areturn
    //   658: astore_1
    //   659: goto -543 -> 116
    //   662: astore_1
    //   663: goto -334 -> 329
    //   666: astore_1
    //   667: goto -251 -> 416
    //   670: astore_1
    //   671: goto -232 -> 439
    //   674: astore_1
    //   675: goto -225 -> 450
    //   678: astore_1
    //   679: goto -133 -> 546
    //   682: astore_3
    //   683: goto -139 -> 544
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	686	0	this	FetchArtTask
    //   0	686	1	paramVarArgs	Void[]
    //   6	647	2	i	int
    //   8	513	3	localObject1	Object
    //   527	5	3	localObject2	Object
    //   535	100	3	localObject3	Object
    //   682	1	3	localIOException1	IOException
    //   30	416	4	localObject4	Object
    //   452	1	4	localIOException2	IOException
    //   461	50	4	localIOException3	IOException
    //   529	5	4	arrayOfVoid	Void[]
    //   46	460	5	localObject5	Object
    //   127	301	6	localOptions	android.graphics.BitmapFactory.Options
    //   192	193	7	j	int
    //   404	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   205	210	213	java/io/IOException
    //   43	48	452	java/io/IOException
    //   54	59	452	java/io/IOException
    //   65	73	452	java/io/IOException
    //   79	89	452	java/io/IOException
    //   95	106	452	java/io/IOException
    //   124	129	452	java/io/IOException
    //   135	140	452	java/io/IOException
    //   146	152	452	java/io/IOException
    //   158	167	452	java/io/IOException
    //   173	181	452	java/io/IOException
    //   187	194	452	java/io/IOException
    //   220	225	452	java/io/IOException
    //   231	241	452	java/io/IOException
    //   256	261	452	java/io/IOException
    //   267	272	452	java/io/IOException
    //   278	286	452	java/io/IOException
    //   292	302	452	java/io/IOException
    //   308	319	452	java/io/IOException
    //   337	343	452	java/io/IOException
    //   349	368	452	java/io/IOException
    //   374	394	452	java/io/IOException
    //   400	406	452	java/io/IOException
    //   424	434	452	java/io/IOException
    //   25	32	457	finally
    //   25	32	461	java/io/IOException
    //   43	48	527	finally
    //   54	59	527	finally
    //   65	73	527	finally
    //   79	89	527	finally
    //   95	106	527	finally
    //   124	129	527	finally
    //   135	140	527	finally
    //   146	152	527	finally
    //   158	167	527	finally
    //   173	181	527	finally
    //   187	194	527	finally
    //   205	210	527	finally
    //   220	225	527	finally
    //   231	241	527	finally
    //   256	261	527	finally
    //   267	272	527	finally
    //   278	286	527	finally
    //   292	302	527	finally
    //   308	319	527	finally
    //   337	343	527	finally
    //   349	368	527	finally
    //   374	394	527	finally
    //   400	406	527	finally
    //   424	434	527	finally
    //   467	472	527	finally
    //   474	479	527	finally
    //   481	489	527	finally
    //   491	501	527	finally
    //   503	516	527	finally
    //   111	116	658	java/io/IOException
    //   324	329	662	java/io/IOException
    //   411	416	666	java/io/IOException
    //   434	439	670	java/io/IOException
    //   445	450	674	java/io/IOException
    //   520	524	678	java/io/IOException
    //   540	544	682	java/io/IOException
  }
  
  public Bitmap getIconBitmap()
  {
    return mIconBitmap;
  }
  
  public Uri getIconUri()
  {
    return mIconUri;
  }
  
  public void onPostExecute(Bitmap paramBitmap)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    mFetchArtTask = null;
    if ((!ObjectsCompat.equals(mArtIconBitmap, mIconBitmap)) || (!ObjectsCompat.equals(this$0.mArtIconUri, mIconUri)))
    {
      localMediaRouteControllerDialog = this$0;
      mArtIconBitmap = mIconBitmap;
      mArtIconLoadedBitmap = paramBitmap;
      mArtIconUri = mIconUri;
      mArtIconBackgroundColor = mBackgroundColor;
      boolean bool = true;
      mArtIconIsLoaded = true;
      long l1 = SystemClock.uptimeMillis();
      long l2 = mStartTimeMillis;
      paramBitmap = this$0;
      if (l1 - l2 <= 120L) {
        bool = false;
      }
      paramBitmap.update(bool);
    }
  }
  
  public void onPreExecute()
  {
    mStartTimeMillis = SystemClock.uptimeMillis();
    this$0.clearLoadedBitmap();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.FetchArtTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */