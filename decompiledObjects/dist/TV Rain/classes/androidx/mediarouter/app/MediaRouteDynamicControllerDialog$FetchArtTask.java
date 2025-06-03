package androidx.mediarouter.app;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.core.util.ObjectsCompat;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class MediaRouteDynamicControllerDialog$FetchArtTask
  extends AsyncTask<Void, Void, Bitmap>
{
  private int mBackgroundColor;
  private final Bitmap mIconBitmap;
  private final Uri mIconUri;
  
  public MediaRouteDynamicControllerDialog$FetchArtTask(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog)
  {
    Object localObject1 = mDescription;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((MediaDescriptionCompat)localObject1).getIconBitmap();
    }
    Object localObject3 = localObject1;
    if (MediaRouteDynamicControllerDialog.isBitmapRecycled((Bitmap)localObject1))
    {
      Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
      localObject3 = null;
    }
    mIconBitmap = ((Bitmap)localObject3);
    paramMediaRouteDynamicControllerDialog = mDescription;
    if (paramMediaRouteDynamicControllerDialog == null) {
      paramMediaRouteDynamicControllerDialog = (MediaRouteDynamicControllerDialog)localObject2;
    } else {
      paramMediaRouteDynamicControllerDialog = paramMediaRouteDynamicControllerDialog.getIconUri();
    }
    mIconUri = paramMediaRouteDynamicControllerDialog;
  }
  
  private InputStream openInputStreamByScheme(Uri paramUri)
    throws IOException
  {
    String str = paramUri.getScheme().toLowerCase();
    if ((!"android.resource".equals(str)) && (!"content".equals(str)) && (!"file".equals(str)))
    {
      paramUri = new URL(paramUri.toString()).openConnection();
      paramUri.setConnectTimeout(30000);
      paramUri.setReadTimeout(30000);
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
    //   1: getfield 49	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
    //   4: astore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: aconst_null
    //   8: astore_3
    //   9: aload_1
    //   10: ifnull +6 -> 16
    //   13: goto +532 -> 545
    //   16: aload_0
    //   17: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull +521 -> 543
    //   25: aload_0
    //   26: aload_1
    //   27: invokespecial 131	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   30: astore 4
    //   32: aload 4
    //   34: ifnonnull +84 -> 118
    //   37: aload 4
    //   39: astore_3
    //   40: aload 4
    //   42: astore_1
    //   43: new 133	java/lang/StringBuilder
    //   46: astore 5
    //   48: aload 4
    //   50: astore_3
    //   51: aload 4
    //   53: astore_1
    //   54: aload 5
    //   56: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   59: aload 4
    //   61: astore_3
    //   62: aload 4
    //   64: astore_1
    //   65: aload 5
    //   67: ldc -120
    //   69: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 4
    //   75: astore_3
    //   76: aload 4
    //   78: astore_1
    //   79: aload 5
    //   81: aload_0
    //   82: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   85: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload 4
    //   91: astore_3
    //   92: aload 4
    //   94: astore_1
    //   95: ldc 39
    //   97: aload 5
    //   99: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   105: pop
    //   106: aload 4
    //   108: ifnull +8 -> 116
    //   111: aload 4
    //   113: invokevirtual 149	java/io/InputStream:close	()V
    //   116: aconst_null
    //   117: areturn
    //   118: aload 4
    //   120: astore_3
    //   121: aload 4
    //   123: astore_1
    //   124: new 151	android/graphics/BitmapFactory$Options
    //   127: astore 6
    //   129: aload 4
    //   131: astore_3
    //   132: aload 4
    //   134: astore_1
    //   135: aload 6
    //   137: invokespecial 152	android/graphics/BitmapFactory$Options:<init>	()V
    //   140: aload 4
    //   142: astore_3
    //   143: aload 4
    //   145: astore_1
    //   146: aload 6
    //   148: iconst_1
    //   149: putfield 156	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   152: aload 4
    //   154: astore_3
    //   155: aload 4
    //   157: astore_1
    //   158: aload 4
    //   160: aconst_null
    //   161: aload 6
    //   163: invokestatic 162	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   166: pop
    //   167: aload 4
    //   169: astore_3
    //   170: aload 4
    //   172: astore_1
    //   173: aload 6
    //   175: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   178: ifeq +266 -> 444
    //   181: aload 4
    //   183: astore_3
    //   184: aload 4
    //   186: astore_1
    //   187: aload 6
    //   189: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   192: istore 7
    //   194: iload 7
    //   196: ifne +6 -> 202
    //   199: goto +245 -> 444
    //   202: aload 4
    //   204: astore_1
    //   205: aload 4
    //   207: invokevirtual 171	java/io/InputStream:reset	()V
    //   210: goto +121 -> 331
    //   213: astore_1
    //   214: aload 4
    //   216: astore_3
    //   217: aload 4
    //   219: astore_1
    //   220: aload 4
    //   222: invokevirtual 149	java/io/InputStream:close	()V
    //   225: aload 4
    //   227: astore_3
    //   228: aload 4
    //   230: astore_1
    //   231: aload_0
    //   232: aload_0
    //   233: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   236: invokespecial 131	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   239: astore 5
    //   241: aload 5
    //   243: astore 4
    //   245: aload 5
    //   247: ifnonnull +84 -> 331
    //   250: aload 5
    //   252: astore_3
    //   253: aload 5
    //   255: astore_1
    //   256: new 133	java/lang/StringBuilder
    //   259: astore 4
    //   261: aload 5
    //   263: astore_3
    //   264: aload 5
    //   266: astore_1
    //   267: aload 4
    //   269: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   272: aload 5
    //   274: astore_3
    //   275: aload 5
    //   277: astore_1
    //   278: aload 4
    //   280: ldc -120
    //   282: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload 5
    //   288: astore_3
    //   289: aload 5
    //   291: astore_1
    //   292: aload 4
    //   294: aload_0
    //   295: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   298: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload 5
    //   304: astore_3
    //   305: aload 5
    //   307: astore_1
    //   308: ldc 39
    //   310: aload 4
    //   312: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   318: pop
    //   319: aload 5
    //   321: ifnull +8 -> 329
    //   324: aload 5
    //   326: invokevirtual 149	java/io/InputStream:close	()V
    //   329: aconst_null
    //   330: areturn
    //   331: aload 4
    //   333: astore_3
    //   334: aload 4
    //   336: astore_1
    //   337: aload 6
    //   339: iconst_0
    //   340: putfield 156	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   343: aload 4
    //   345: astore_3
    //   346: aload 4
    //   348: astore_1
    //   349: aload_0
    //   350: getfield 20	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:this$0	Landroidx/mediarouter/app/MediaRouteDynamicControllerDialog;
    //   353: getfield 110	androidx/mediarouter/app/MediaRouteDynamicControllerDialog:mContext	Landroid/content/Context;
    //   356: invokevirtual 175	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   359: getstatic 180	androidx/mediarouter/R$dimen:mr_cast_meta_art_size	I
    //   362: invokevirtual 186	android/content/res/Resources:getDimensionPixelSize	(I)I
    //   365: istore 7
    //   367: aload 4
    //   369: astore_3
    //   370: aload 4
    //   372: astore_1
    //   373: aload 6
    //   375: iconst_1
    //   376: aload 6
    //   378: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   381: iload 7
    //   383: idiv
    //   384: invokestatic 191	java/lang/Integer:highestOneBit	(I)I
    //   387: invokestatic 197	java/lang/Math:max	(II)I
    //   390: putfield 200	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   393: aload 4
    //   395: astore_3
    //   396: aload 4
    //   398: astore_1
    //   399: aload_0
    //   400: invokevirtual 204	android/os/AsyncTask:isCancelled	()Z
    //   403: istore 8
    //   405: iload 8
    //   407: ifeq +10 -> 417
    //   410: aload 4
    //   412: invokevirtual 149	java/io/InputStream:close	()V
    //   415: aconst_null
    //   416: areturn
    //   417: aload 4
    //   419: astore_3
    //   420: aload 4
    //   422: astore_1
    //   423: aload 4
    //   425: aconst_null
    //   426: aload 6
    //   428: invokestatic 162	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   431: astore 5
    //   433: aload 4
    //   435: invokevirtual 149	java/io/InputStream:close	()V
    //   438: aload 5
    //   440: astore_1
    //   441: goto +104 -> 545
    //   444: aload 4
    //   446: invokevirtual 149	java/io/InputStream:close	()V
    //   449: aconst_null
    //   450: areturn
    //   451: astore 4
    //   453: goto +11 -> 464
    //   456: astore_1
    //   457: goto +76 -> 533
    //   460: astore 4
    //   462: aconst_null
    //   463: astore_3
    //   464: aload_3
    //   465: astore_1
    //   466: new 133	java/lang/StringBuilder
    //   469: astore 5
    //   471: aload_3
    //   472: astore_1
    //   473: aload 5
    //   475: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   478: aload_3
    //   479: astore_1
    //   480: aload 5
    //   482: ldc -120
    //   484: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: pop
    //   488: aload_3
    //   489: astore_1
    //   490: aload 5
    //   492: aload_0
    //   493: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
    //   496: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   499: pop
    //   500: aload_3
    //   501: astore_1
    //   502: ldc 39
    //   504: aload 5
    //   506: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: aload 4
    //   511: invokestatic 207	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   514: pop
    //   515: aload_3
    //   516: ifnull +27 -> 543
    //   519: aload_3
    //   520: invokevirtual 149	java/io/InputStream:close	()V
    //   523: goto +20 -> 543
    //   526: astore 4
    //   528: aload_1
    //   529: astore_3
    //   530: aload 4
    //   532: astore_1
    //   533: aload_3
    //   534: ifnull +7 -> 541
    //   537: aload_3
    //   538: invokevirtual 149	java/io/InputStream:close	()V
    //   541: aload_1
    //   542: athrow
    //   543: aconst_null
    //   544: astore_1
    //   545: aload_1
    //   546: invokestatic 37	androidx/mediarouter/app/MediaRouteDynamicControllerDialog:isBitmapRecycled	(Landroid/graphics/Bitmap;)Z
    //   549: ifeq +36 -> 585
    //   552: new 133	java/lang/StringBuilder
    //   555: dup
    //   556: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   559: astore_3
    //   560: aload_3
    //   561: ldc -47
    //   563: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   566: pop
    //   567: aload_3
    //   568: aload_1
    //   569: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   572: pop
    //   573: ldc 39
    //   575: aload_3
    //   576: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   579: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   582: pop
    //   583: aconst_null
    //   584: areturn
    //   585: aload_1
    //   586: ifnull +67 -> 653
    //   589: aload_1
    //   590: invokevirtual 215	android/graphics/Bitmap:getWidth	()I
    //   593: aload_1
    //   594: invokevirtual 218	android/graphics/Bitmap:getHeight	()I
    //   597: if_icmpge +56 -> 653
    //   600: new 220	androidx/palette/graphics/Palette$Builder
    //   603: dup
    //   604: aload_1
    //   605: invokespecial 223	androidx/palette/graphics/Palette$Builder:<init>	(Landroid/graphics/Bitmap;)V
    //   608: iconst_1
    //   609: invokevirtual 227	androidx/palette/graphics/Palette$Builder:maximumColorCount	(I)Landroidx/palette/graphics/Palette$Builder;
    //   612: invokevirtual 231	androidx/palette/graphics/Palette$Builder:generate	()Landroidx/palette/graphics/Palette;
    //   615: astore_3
    //   616: aload_3
    //   617: invokevirtual 237	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
    //   620: invokeinterface 242 1 0
    //   625: ifeq +6 -> 631
    //   628: goto +20 -> 648
    //   631: aload_3
    //   632: invokevirtual 237	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
    //   635: iconst_0
    //   636: invokeinterface 246 2 0
    //   641: checkcast 248	androidx/palette/graphics/Palette$Swatch
    //   644: invokevirtual 251	androidx/palette/graphics/Palette$Swatch:getRgb	()I
    //   647: istore_2
    //   648: aload_0
    //   649: iload_2
    //   650: putfield 253	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mBackgroundColor	I
    //   653: aload_1
    //   654: areturn
    //   655: astore_1
    //   656: goto -540 -> 116
    //   659: astore_1
    //   660: goto -331 -> 329
    //   663: astore_1
    //   664: goto -249 -> 415
    //   667: astore_1
    //   668: goto -230 -> 438
    //   671: astore_1
    //   672: goto -223 -> 449
    //   675: astore_1
    //   676: goto -133 -> 543
    //   679: astore_3
    //   680: goto -139 -> 541
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	683	0	this	FetchArtTask
    //   0	683	1	paramVarArgs	Void[]
    //   6	644	2	i	int
    //   8	624	3	localObject1	Object
    //   679	1	3	localIOException1	IOException
    //   30	415	4	localObject2	Object
    //   451	1	4	localIOException2	IOException
    //   460	50	4	localIOException3	IOException
    //   526	5	4	localObject3	Object
    //   46	459	5	localObject4	Object
    //   127	300	6	localOptions	android.graphics.BitmapFactory.Options
    //   192	192	7	j	int
    //   403	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   205	210	213	java/io/IOException
    //   43	48	451	java/io/IOException
    //   54	59	451	java/io/IOException
    //   65	73	451	java/io/IOException
    //   79	89	451	java/io/IOException
    //   95	106	451	java/io/IOException
    //   124	129	451	java/io/IOException
    //   135	140	451	java/io/IOException
    //   146	152	451	java/io/IOException
    //   158	167	451	java/io/IOException
    //   173	181	451	java/io/IOException
    //   187	194	451	java/io/IOException
    //   220	225	451	java/io/IOException
    //   231	241	451	java/io/IOException
    //   256	261	451	java/io/IOException
    //   267	272	451	java/io/IOException
    //   278	286	451	java/io/IOException
    //   292	302	451	java/io/IOException
    //   308	319	451	java/io/IOException
    //   337	343	451	java/io/IOException
    //   349	367	451	java/io/IOException
    //   373	393	451	java/io/IOException
    //   399	405	451	java/io/IOException
    //   423	433	451	java/io/IOException
    //   25	32	456	finally
    //   25	32	460	java/io/IOException
    //   43	48	526	finally
    //   54	59	526	finally
    //   65	73	526	finally
    //   79	89	526	finally
    //   95	106	526	finally
    //   124	129	526	finally
    //   135	140	526	finally
    //   146	152	526	finally
    //   158	167	526	finally
    //   173	181	526	finally
    //   187	194	526	finally
    //   205	210	526	finally
    //   220	225	526	finally
    //   231	241	526	finally
    //   256	261	526	finally
    //   267	272	526	finally
    //   278	286	526	finally
    //   292	302	526	finally
    //   308	319	526	finally
    //   337	343	526	finally
    //   349	367	526	finally
    //   373	393	526	finally
    //   399	405	526	finally
    //   423	433	526	finally
    //   466	471	526	finally
    //   473	478	526	finally
    //   480	488	526	finally
    //   490	500	526	finally
    //   502	515	526	finally
    //   111	116	655	java/io/IOException
    //   324	329	659	java/io/IOException
    //   410	415	663	java/io/IOException
    //   433	438	667	java/io/IOException
    //   444	449	671	java/io/IOException
    //   519	523	675	java/io/IOException
    //   537	541	679	java/io/IOException
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
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    mFetchArtTask = null;
    if ((!ObjectsCompat.equals(mArtIconBitmap, mIconBitmap)) || (!ObjectsCompat.equals(this$0.mArtIconUri, mIconUri)))
    {
      localMediaRouteDynamicControllerDialog = this$0;
      mArtIconBitmap = mIconBitmap;
      mArtIconLoadedBitmap = paramBitmap;
      mArtIconUri = mIconUri;
      mArtIconBackgroundColor = mBackgroundColor;
      mArtIconIsLoaded = true;
      localMediaRouteDynamicControllerDialog.updateMetadataViews();
    }
  }
  
  public void onPreExecute()
  {
    this$0.clearLoadedBitmap();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.FetchArtTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */