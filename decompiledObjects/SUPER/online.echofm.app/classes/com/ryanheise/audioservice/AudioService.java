package com.ryanheise.audioservice;

import a0.d.e;
import a0.d.l;
import a0.o;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.b;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.b;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction.b;
import android.support.v4.media.session.PlaybackStateCompat.d;
import android.util.LruCache;
import android.view.KeyEvent;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import l5.b;
import l5.g;
import l5.h;
import l5.p;
import l5.q;
import l5.r;
import w.h.a;
import w.h.e;
import w.h.f;
import x2.f;
import x2.i;

public class AudioService
  extends a0.d
{
  public static AudioService R;
  public static PendingIntent S;
  public static e T;
  public static List U = new ArrayList();
  public static final Map V = new HashMap();
  public MediaSessionCompat A;
  public d B;
  public List C = new ArrayList();
  public List D = new ArrayList();
  public List E = new ArrayList();
  public int[] F;
  public MediaMetadataCompat G;
  public Bitmap H;
  public String I;
  public LruCache J;
  public boolean K = false;
  public l5.a L = l5.a.o;
  public int M;
  public int N;
  public boolean O;
  public final Handler P = new Handler(Looper.getMainLooper());
  public o Q;
  public io.flutter.embedding.engine.a x;
  public h y;
  public PowerManager.WakeLock z;
  
  public static int A(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int i = outHeight;
    int j = outWidth;
    int k = 1;
    int m = 1;
    if ((i > paramInt2) || (j > paramInt1))
    {
      i /= 2;
      j /= 2;
      for (;;)
      {
        k = m;
        if (i / m < paramInt2) {
          break;
        }
        k = m;
        if (j / m < paramInt1) {
          break;
        }
        m *= 2;
      }
    }
    return k;
  }
  
  public static MediaMetadataCompat K(String paramString)
  {
    return (MediaMetadataCompat)V.get(paramString);
  }
  
  public static void Q(e parame)
  {
    T = parame;
  }
  
  public static int d0(long paramLong)
  {
    if (paramLong == 4L) {
      return 91;
    }
    if (paramLong == 2L) {
      return 130;
    }
    return PlaybackStateCompat.h(paramLong);
  }
  
  public void B(h paramh)
  {
    y = paramh;
    Object localObject = c;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(getApplication().getPackageName());
      ((StringBuilder)localObject).append(".channel");
      localObject = ((StringBuilder)localObject).toString();
    }
    I = ((String)localObject);
    if (n != null)
    {
      localObject = getApplicationContext();
      Intent localIntent = new Intent(null);
      localIntent.setComponent(new ComponentName((Context)localObject, n));
      localIntent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
      S = PendingIntent.getActivity((Context)localObject, 1000, localIntent, 201326592);
    }
    else
    {
      S = null;
    }
    if (!b) {
      A.l(null);
    }
  }
  
  public h.a C(String paramString1, String paramString2, long paramLong)
  {
    return new h.a(O(paramString1), paramString2, y(paramLong));
  }
  
  public final void D()
  {
    NotificationManager localNotificationManager = M();
    if (x2.e.a(localNotificationManager, I) == null)
    {
      l5.c.a();
      NotificationChannel localNotificationChannel = i.a(I, y.d, 2);
      l5.d.a(localNotificationChannel, y.h);
      String str = y.e;
      if (str != null) {
        l5.e.a(localNotificationChannel, str);
      }
      f.a(localNotificationManager, localNotificationChannel);
    }
  }
  
  public PlaybackStateCompat.CustomAction E(r paramr)
  {
    int i = O(a);
    p localp = d;
    if (localp != null) {
      return new PlaybackStateCompat.CustomAction.b(a, b, i).b(U(d.b)).a();
    }
    if (Build.VERSION.SDK_INT >= 33)
    {
      long l = c;
      if (l == 1L) {
        return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.STOP", b, i).a();
      }
      if (l == 64L) {
        return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.FAST_FORWARD", b, i).a();
      }
      if (l == 8L) {
        return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.REWIND", b, i).a();
      }
    }
    return null;
  }
  
  public MediaMetadataCompat F(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Long paramLong, String paramString6, Boolean paramBoolean, String paramString7, String paramString8, String paramString9, RatingCompat paramRatingCompat, Map paramMap)
  {
    MediaMetadataCompat.b localb = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", paramString1).e("android.media.metadata.TITLE", paramString2);
    if (paramString3 != null) {
      localb.e("android.media.metadata.ALBUM", paramString3);
    }
    if (paramString4 != null) {
      localb.e("android.media.metadata.ARTIST", paramString4);
    }
    if (paramString5 != null) {
      localb.e("android.media.metadata.GENRE", paramString5);
    }
    if (paramLong != null) {
      localb.c("android.media.metadata.DURATION", paramLong.longValue());
    }
    if (paramString6 != null) {
      localb.e("android.media.metadata.DISPLAY_ICON_URI", paramString6);
    }
    long l;
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue()) {
        l = 1L;
      } else {
        l = 0L;
      }
      localb.c("playable_long", l);
    }
    if (paramString7 != null) {
      localb.e("android.media.metadata.DISPLAY_TITLE", paramString7);
    }
    if (paramString8 != null) {
      localb.e("android.media.metadata.DISPLAY_SUBTITLE", paramString8);
    }
    if (paramString9 != null) {
      localb.e("android.media.metadata.DISPLAY_DESCRIPTION", paramString9);
    }
    if (paramRatingCompat != null) {
      localb.d("android.media.metadata.RATING", paramRatingCompat);
    }
    if (paramMap != null)
    {
      paramString4 = paramMap.keySet().iterator();
      if (paramString4.hasNext())
      {
        paramString3 = (String)paramString4.next();
        paramString2 = paramMap.get(paramString3);
        if ((paramString2 instanceof Long)) {}
        for (l = ((Long)paramString2).longValue();; l = ((Integer)paramString2).intValue())
        {
          label266:
          localb.c(paramString3, l);
          break;
          if (!(paramString2 instanceof Integer)) {
            break label298;
          }
        }
        label298:
        if ((paramString2 instanceof String)) {}
        for (paramString2 = (String)paramString2;; paramString2 = paramString2.toString())
        {
          localb.e(paramString3, paramString2);
          break;
          if ((paramString2 instanceof Boolean))
          {
            if (((Boolean)paramString2).booleanValue())
            {
              l = 1L;
              break label266;
            }
            l = 0L;
            break label266;
          }
          if (!(paramString2 instanceof Double)) {
            break;
          }
        }
      }
    }
    paramString2 = localb.a();
    V.put(paramString1, paramString2);
    return paramString2;
  }
  
  public final void G()
  {
    if (A.e()) {
      A.g(false);
    }
    M().cancel(1124);
  }
  
  public final void H()
  {
    x.a.k(this, new Intent(this, AudioService.class));
    if (!A.e()) {
      A.g(true);
    }
    w();
    A.s(S);
    R();
  }
  
  public final void I()
  {
    S(false);
    X();
  }
  
  public final void J()
  {
    if (y.k) {
      I();
    }
  }
  
  public final h.e L()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      D();
    }
    h.e locale = new h.e(this, I).C(1).v(false).n(x());
    locale.w(O(y.g));
    return locale;
  }
  
  public final NotificationManager M()
  {
    return (NotificationManager)getSystemService("notification");
  }
  
  public int N()
  {
    int i = c.a[L.ordinal()];
    int j = 2;
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4)
        {
          if (i != 5)
          {
            if (i != 6) {
              return 0;
            }
            return 7;
          }
          if (K) {
            j = 3;
          }
          return j;
        }
        if (K) {
          j = 3;
        }
        return j;
      }
      return 6;
    }
    return 8;
  }
  
  public int O(String paramString)
  {
    Object localObject = paramString.split("/");
    paramString = localObject[0];
    localObject = localObject[1];
    return getResources().getIdentifier((String)localObject, paramString, getApplicationContext().getPackageName());
  }
  
  public void P()
  {
    e locale = T;
    if (locale == null) {
      return;
    }
    locale.b();
  }
  
  public final void R()
  {
    startForeground(1124, z());
    O = true;
  }
  
  public final void S(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      b.a(this, paramBoolean);
    } else {
      stopForeground(paramBoolean);
    }
  }
  
  /* Error */
  public Bitmap T(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 528	com/ryanheise/audioservice/AudioService:J	Landroid/util/LruCache;
    //   4: aload_1
    //   5: invokevirtual 531	android/util/LruCache:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast 533	android/graphics/Bitmap
    //   11: astore_3
    //   12: aload_3
    //   13: ifnull +5 -> 18
    //   16: aload_3
    //   17: areturn
    //   18: aload_1
    //   19: invokestatic 539	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   22: astore 4
    //   24: ldc_w 541
    //   27: aload 4
    //   29: invokevirtual 544	android/net/Uri:getScheme	()Ljava/lang/String;
    //   32: invokevirtual 548	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: istore 5
    //   37: aload_3
    //   38: astore 6
    //   40: iload 5
    //   42: ifeq +158 -> 200
    //   45: aload_2
    //   46: ifnull +121 -> 167
    //   49: getstatic 311	android/os/Build$VERSION:SDK_INT	I
    //   52: bipush 29
    //   54: if_icmplt +113 -> 167
    //   57: new 550	android/util/Size
    //   60: astore 6
    //   62: aload 6
    //   64: sipush 192
    //   67: sipush 192
    //   70: invokespecial 553	android/util/Size:<init>	(II)V
    //   73: aload_0
    //   74: invokevirtual 557	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   77: astore_2
    //   78: new 550	android/util/Size
    //   81: astore_3
    //   82: aload_0
    //   83: getfield 150	com/ryanheise/audioservice/AudioService:y	Ll5/h;
    //   86: getfield 559	l5/h:l	I
    //   89: istore 7
    //   91: iload 7
    //   93: istore 8
    //   95: iload 7
    //   97: iconst_m1
    //   98: if_icmpne +17 -> 115
    //   101: aload 6
    //   103: invokevirtual 562	android/util/Size:getWidth	()I
    //   106: istore 8
    //   108: goto +7 -> 115
    //   111: astore_1
    //   112: goto +246 -> 358
    //   115: aload_0
    //   116: getfield 150	com/ryanheise/audioservice/AudioService:y	Ll5/h;
    //   119: getfield 565	l5/h:m	I
    //   122: istore 9
    //   124: iload 9
    //   126: istore 7
    //   128: iload 9
    //   130: iconst_m1
    //   131: if_icmpne +10 -> 141
    //   134: aload 6
    //   136: invokevirtual 568	android/util/Size:getHeight	()I
    //   139: istore 7
    //   141: aload_3
    //   142: iload 8
    //   144: iload 7
    //   146: invokespecial 553	android/util/Size:<init>	(II)V
    //   149: aload_2
    //   150: aload 4
    //   152: aload_3
    //   153: aconst_null
    //   154: invokestatic 573	l5/f:a	(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;
    //   157: astore_2
    //   158: aload_2
    //   159: astore 6
    //   161: aload_2
    //   162: ifnonnull +38 -> 200
    //   165: aconst_null
    //   166: areturn
    //   167: aload_0
    //   168: invokevirtual 557	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   171: aload 4
    //   173: ldc_w 575
    //   176: invokevirtual 581	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   179: astore_2
    //   180: aload_2
    //   181: ifnull +17 -> 198
    //   184: aload_2
    //   185: invokevirtual 587	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   188: astore 6
    //   190: aload_3
    //   191: astore_2
    //   192: aload 6
    //   194: astore_3
    //   195: goto +10 -> 205
    //   198: aconst_null
    //   199: areturn
    //   200: aconst_null
    //   201: astore_3
    //   202: aload 6
    //   204: astore_2
    //   205: iload 5
    //   207: ifeq +7 -> 214
    //   210: aload_3
    //   211: ifnull +135 -> 346
    //   214: aload_0
    //   215: getfield 150	com/ryanheise/audioservice/AudioService:y	Ll5/h;
    //   218: getfield 559	l5/h:l	I
    //   221: iconst_m1
    //   222: if_icmpeq +103 -> 325
    //   225: new 107	android/graphics/BitmapFactory$Options
    //   228: astore 6
    //   230: aload 6
    //   232: invokespecial 588	android/graphics/BitmapFactory$Options:<init>	()V
    //   235: aload 6
    //   237: iconst_1
    //   238: putfield 591	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   241: aload_3
    //   242: ifnull +14 -> 256
    //   245: aload_3
    //   246: aconst_null
    //   247: aload 6
    //   249: invokestatic 597	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   252: pop
    //   253: goto +14 -> 267
    //   256: aload 4
    //   258: invokevirtual 600	android/net/Uri:getPath	()Ljava/lang/String;
    //   261: aload 6
    //   263: invokestatic 604	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   266: pop
    //   267: aload_0
    //   268: getfield 150	com/ryanheise/audioservice/AudioService:y	Ll5/h;
    //   271: astore_2
    //   272: aload 6
    //   274: aload 6
    //   276: aload_2
    //   277: getfield 559	l5/h:l	I
    //   280: aload_2
    //   281: getfield 565	l5/h:m	I
    //   284: invokestatic 606	com/ryanheise/audioservice/AudioService:A	(Landroid/graphics/BitmapFactory$Options;II)I
    //   287: putfield 609	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   290: aload 6
    //   292: iconst_0
    //   293: putfield 591	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   296: aload_3
    //   297: ifnull +14 -> 311
    //   300: aload_3
    //   301: aconst_null
    //   302: aload 6
    //   304: invokestatic 597	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   307: astore_2
    //   308: goto +38 -> 346
    //   311: aload 4
    //   313: invokevirtual 600	android/net/Uri:getPath	()Ljava/lang/String;
    //   316: aload 6
    //   318: invokestatic 604	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   321: astore_2
    //   322: goto -14 -> 308
    //   325: aload_3
    //   326: ifnull +11 -> 337
    //   329: aload_3
    //   330: invokestatic 612	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   333: astore_2
    //   334: goto +12 -> 346
    //   337: aload 4
    //   339: invokevirtual 600	android/net/Uri:getPath	()Ljava/lang/String;
    //   342: invokestatic 615	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   345: astore_2
    //   346: aload_0
    //   347: getfield 528	com/ryanheise/audioservice/AudioService:J	Landroid/util/LruCache;
    //   350: aload_1
    //   351: aload_2
    //   352: invokevirtual 616	android/util/LruCache:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   355: pop
    //   356: aload_2
    //   357: areturn
    //   358: aload_1
    //   359: invokevirtual 621	java/lang/Throwable:printStackTrace	()V
    //   362: aconst_null
    //   363: areturn
    //   364: astore_1
    //   365: goto -167 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	368	0	this	AudioService
    //   0	368	1	paramString1	String
    //   0	368	2	paramString2	String
    //   11	319	3	localObject1	Object
    //   22	316	4	localUri	Uri
    //   35	171	5	bool	boolean
    //   38	279	6	localObject2	Object
    //   89	56	7	i	int
    //   93	50	8	j	int
    //   122	10	9	k	int
    // Exception table:
    //   from	to	target	type
    //   18	37	111	java/lang/Exception
    //   49	91	111	java/lang/Exception
    //   101	108	111	java/lang/Exception
    //   115	124	111	java/lang/Exception
    //   134	141	111	java/lang/Exception
    //   141	158	111	java/lang/Exception
    //   167	180	111	java/lang/Exception
    //   184	190	111	java/lang/Exception
    //   214	241	111	java/lang/Exception
    //   245	253	111	java/lang/Exception
    //   256	267	111	java/lang/Exception
    //   267	296	111	java/lang/Exception
    //   300	308	111	java/lang/Exception
    //   311	322	111	java/lang/Exception
    //   329	334	111	java/lang/Exception
    //   337	346	111	java/lang/Exception
    //   346	356	111	java/lang/Exception
    //   49	91	364	java/io/FileNotFoundException
    //   49	91	364	java/io/IOException
    //   101	108	364	java/io/FileNotFoundException
    //   101	108	364	java/io/IOException
    //   115	124	364	java/io/FileNotFoundException
    //   115	124	364	java/io/IOException
    //   134	141	364	java/io/FileNotFoundException
    //   134	141	364	java/io/IOException
    //   141	158	364	java/io/FileNotFoundException
    //   141	158	364	java/io/IOException
    //   167	180	364	java/io/FileNotFoundException
    //   167	180	364	java/io/IOException
    //   184	190	364	java/io/FileNotFoundException
    //   184	190	364	java/io/IOException
  }
  
  public final Bundle U(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramMap = ((Map.Entry)localObject).getKey().toString();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof Integer)) {
        localBundle.putInt(paramMap, ((Integer)localObject).intValue());
      } else if ((localObject instanceof Long)) {
        localBundle.putLong(paramMap, ((Long)localObject).longValue());
      } else {
        localBundle.putString(paramMap, localObject.toString());
      }
    }
    return localBundle;
  }
  
  public final MediaMetadataCompat V(MediaMetadataCompat paramMediaMetadataCompat)
  {
    return new MediaMetadataCompat.b(paramMediaMetadataCompat).b("android.media.metadata.ALBUM_ART", H).b("android.media.metadata.DISPLAY_ICON", H).a();
  }
  
  public final void W()
  {
    if (A == null) {
      return;
    }
    G();
    A.f();
    A = null;
  }
  
  public final void X()
  {
    if (z.isHeld()) {
      z.release();
    }
  }
  
  public void Y(MediaMetadataCompat paramMediaMetadataCompat)
  {
    for (;;)
    {
      try
      {
        localObject = paramMediaMetadataCompat.i("artCacheFile");
        if (localObject != null)
        {
          H = T((String)localObject, null);
          paramMediaMetadataCompat = V(paramMediaMetadataCompat);
        }
      }
      finally
      {
        break label127;
      }
      localObject = paramMediaMetadataCompat.i("android.media.metadata.DISPLAY_ICON_URI");
      if ((localObject == null) || (!((String)localObject).startsWith("content:"))) {
        break;
      }
      H = T((String)localObject, paramMediaMetadataCompat.i("loadThumbnailUri"));
    }
    H = null;
    G = paramMediaMetadataCompat;
    A.m(paramMediaMetadataCompat);
    P.removeCallbacksAndMessages(null);
    paramMediaMetadataCompat = P;
    Object localObject = new l5/g;
    ((g)localObject).<init>(this);
    paramMediaMetadataCompat.post((Runnable)localObject);
    return;
    label127:
    throw paramMediaMetadataCompat;
  }
  
  public void Z(int paramInt, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3)
  {
    if (paramInt == 1)
    {
      A.o(3);
      Q = null;
    }
    else if (paramInt == 2)
    {
      if ((Q != null) && (paramInteger1.intValue() == Q.b()) && (paramInteger2.intValue() == Q.a())) {
        Q.f(paramInteger3.intValue());
      } else {
        Q = new b(paramInteger1.intValue(), paramInteger2.intValue(), paramInteger3.intValue());
      }
      A.p(Q);
    }
  }
  
  public void a0(List paramList)
  {
    try
    {
      U = paramList;
      A.q(paramList);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public void b0(List paramList, long paramLong1, int[] paramArrayOfInt, l5.a parama, boolean paramBoolean1, long paramLong2, long paramLong3, float paramFloat, long paramLong4, Integer paramInteger, String paramString, int paramInt1, int paramInt2, boolean paramBoolean2, Long paramLong)
  {
    boolean bool = Arrays.equals(paramArrayOfInt, F);
    int i = 1;
    if (paramList.equals(C)) {
      i = bool ^ true;
    }
    C = paramList;
    D.clear();
    E.clear();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (r)localIterator.next();
      localObject = E(paramList);
      if (localObject != null) {
        E.add(localObject);
      } else {
        D.add(C(a, b, c));
      }
    }
    F = paramArrayOfInt;
    bool = K;
    paramList = L;
    L = parama;
    K = paramBoolean1;
    M = paramInt1;
    N = paramInt2;
    paramArrayOfInt = new PlaybackStateCompat.d().c(paramLong1 | 0x37FECF).h(N(), paramLong2, paramFloat, paramLong4).e(paramLong3);
    Object localObject = E.iterator();
    while (((Iterator)localObject).hasNext()) {
      paramArrayOfInt.a((PlaybackStateCompat.CustomAction)((Iterator)localObject).next());
    }
    if (paramLong != null) {
      paramArrayOfInt.d(paramLong.longValue());
    }
    if ((paramInteger != null) && (paramString != null)) {}
    for (int j = paramInteger.intValue();; j = -987654)
    {
      paramArrayOfInt.f(j, paramString);
      break;
      if (paramString == null) {
        break;
      }
    }
    if (G != null)
    {
      paramInteger = new Bundle();
      paramInteger.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", G.e().g());
      paramArrayOfInt.g(paramInteger);
    }
    A.n(paramArrayOfInt.b());
    A.r(paramInt1);
    A.t(paramInt2);
    A.j(paramBoolean2);
    if ((!bool) && (paramBoolean1)) {
      H();
    } else if ((bool) && (!paramBoolean1)) {
      J();
    }
    paramArrayOfInt = l5.a.o;
    if ((paramList != paramArrayOfInt) && (parama == paramArrayOfInt)) {
      c0();
    } else if ((parama != paramArrayOfInt) && (i != 0)) {
      e0();
    }
  }
  
  public void c0()
  {
    G();
    stopSelf();
  }
  
  public final void e0()
  {
    if (O) {
      M().notify(1124, z());
    }
  }
  
  public d.e g(String paramString, int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramString = null;
    } else {
      paramString = Boolean.valueOf(paramBundle.getBoolean("android.service.media.extra.RECENT"));
    }
    paramBundle = paramString;
    if (paramString == null) {
      paramBundle = Boolean.FALSE;
    }
    Bundle localBundle = y.a();
    if (paramBundle.booleanValue()) {
      paramString = "recent";
    } else {
      paramString = "root";
    }
    return new d.e(paramString, localBundle);
  }
  
  public void h(String paramString, d.l paraml)
  {
    i(paramString, paraml, null);
  }
  
  public void i(String paramString, d.l paraml, Bundle paramBundle)
  {
    e locale = T;
    if (locale == null)
    {
      paraml.g(new ArrayList());
      return;
    }
    locale.s(paramString, paraml, paramBundle);
  }
  
  public void j(String paramString, d.l paraml)
  {
    e locale = T;
    if (locale == null)
    {
      paraml.g(null);
      return;
    }
    locale.m(paramString, paraml);
  }
  
  public void k(String paramString, Bundle paramBundle, d.l paraml)
  {
    e locale = T;
    if (locale == null)
    {
      paraml.g(new ArrayList());
      return;
    }
    locale.i(paramString, paramBundle, paraml);
  }
  
  public void onCreate()
  {
    super.onCreate();
    R = this;
    M = 0;
    N = 0;
    O = false;
    K = false;
    L = l5.a.o;
    A = new MediaSessionCompat(this, "media-session");
    B(new h(getApplicationContext()));
    A.k(4);
    Object localObject = new PlaybackStateCompat.d().c(3669711L);
    A.n(((PlaybackStateCompat.d)localObject).b());
    MediaSessionCompat localMediaSessionCompat = A;
    localObject = new d();
    B = ((d)localObject);
    localMediaSessionCompat.h((MediaSessionCompat.b)localObject);
    s(A.c());
    A.q(U);
    z = ((PowerManager)getSystemService("power")).newWakeLock(1, AudioService.class.getName());
    J = new a((int)(Runtime.getRuntime().maxMemory() / 1024L) / 8);
    x = a.B(this);
    System.out.println("flutterEngine warmed up");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    e locale = T;
    if (locale != null)
    {
      locale.D();
      T = null;
    }
    G = null;
    H = null;
    U.clear();
    V.clear();
    C.clear();
    J.evictAll();
    F = null;
    W();
    S(y.b ^ true);
    X();
    R = null;
    O = false;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    c0.d.c(A, paramIntent);
    return 2;
  }
  
  public void onTaskRemoved(Intent paramIntent)
  {
    e locale = T;
    if (locale != null) {
      locale.y();
    }
    super.onTaskRemoved(paramIntent);
  }
  
  public final void w()
  {
    if (!z.isHeld()) {
      z.acquire();
    }
  }
  
  public PendingIntent x()
  {
    Intent localIntent = new Intent(this, MediaButtonReceiver.class);
    localIntent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
    return PendingIntent.getBroadcast(this, 0, localIntent, 67108864);
  }
  
  public PendingIntent y(long paramLong)
  {
    int i = d0(paramLong);
    if (i == 0) {
      return null;
    }
    Intent localIntent = new Intent(this, MediaButtonReceiver.class);
    localIntent.setAction("android.intent.action.MEDIA_BUTTON");
    localIntent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
    return PendingIntent.getBroadcast(this, i, localIntent, 67108864);
  }
  
  public final Notification z()
  {
    Object localObject1 = F;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      int i = Math.min(3, D.size());
      localObject2 = new int[i];
      for (j = 0; j < i; j++) {
        localObject2[j] = j;
      }
    }
    localObject1 = L();
    Object localObject3 = G;
    if (localObject3 != null)
    {
      localObject3 = ((MediaMetadataCompat)localObject3).e();
      if (((MediaDescriptionCompat)localObject3).j() != null) {
        ((h.e)localObject1).l(((MediaDescriptionCompat)localObject3).j());
      }
      if (((MediaDescriptionCompat)localObject3).i() != null) {
        ((h.e)localObject1).k(((MediaDescriptionCompat)localObject3).i());
      }
      if (((MediaDescriptionCompat)localObject3).b() != null) {
        ((h.e)localObject1).z(((MediaDescriptionCompat)localObject3).b());
      }
      try
      {
        localObject3 = H;
        if (localObject3 != null) {
          ((h.e)localObject1).p((Bitmap)localObject3);
        }
      }
      finally
      {
        break label159;
      }
      break label163;
      label159:
      throw arrayOfInt;
    }
    label163:
    if (y.i) {
      ((h.e)localObject1).j(A.b().b());
    }
    int j = y.f;
    if (j != -1) {
      ((h.e)localObject1).i(j);
    }
    localObject3 = D.iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((h.e)localObject1).b((h.a)((Iterator)localObject3).next());
    }
    localObject3 = new b0.c().i(A.c());
    if (Build.VERSION.SDK_INT < 33) {
      ((b0.c)localObject3).j(arrayOfInt);
    }
    if (y.j)
    {
      ((b0.c)localObject3).k(true);
      ((b0.c)localObject3).h(y(1L));
      ((h.e)localObject1).t(true);
    }
    ((h.e)localObject1).y((h.f)localObject3);
    return ((h.e)localObject1).c();
  }
  
  public class a
    extends LruCache
  {
    public a(int paramInt)
    {
      super();
    }
    
    public int a(String paramString, Bitmap paramBitmap)
    {
      return paramBitmap.getByteCount() / 1024;
    }
  }
  
  public class b
    extends o
  {
    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      super(paramInt2, paramInt3);
    }
    
    public void d(int paramInt)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().H(paramInt);
    }
    
    public void e(int paramInt)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().x(paramInt);
    }
  }
  
  public class d
    extends MediaSessionCompat.b
  {
    public d() {}
    
    public void A()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().k();
    }
    
    public void B(long paramLong)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().G(paramLong);
    }
    
    public void C()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().g();
    }
    
    public final q E(KeyEvent paramKeyEvent)
    {
      int i = paramKeyEvent.getKeyCode();
      if ((i != 79) && (i != 85))
      {
        if (i != 87)
        {
          if (i != 88) {
            return q.o;
          }
          return q.q;
        }
        return q.p;
      }
      return q.o;
    }
    
    public void b(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().C(AudioService.K(paramMediaDescriptionCompat.g()));
    }
    
    public void c(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().v(AudioService.K(paramMediaDescriptionCompat.g()), paramInt);
    }
    
    public void e(String paramString, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      if ("com.ryanheise.audioservice.action.STOP".equals(paramString)) {
        AudioService.u().g();
      } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(paramString)) {
        AudioService.u().A();
      } else if ("com.ryanheise.audioservice.action.REWIND".equals(paramString)) {
        AudioService.u().r();
      } else {
        AudioService.u().E(paramString, paramBundle);
      }
    }
    
    public void f()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().A();
    }
    
    public boolean g(Intent paramIntent)
    {
      if (AudioService.u() == null) {
        return false;
      }
      paramIntent = (KeyEvent)paramIntent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
      if (paramIntent.getAction() == 0)
      {
        int i = paramIntent.getKeyCode();
        if (i != 79) {
          if (i != 130)
          {
            if ((i == 126) || (i == 127)) {}
          }
          else {
            switch (i)
            {
            default: 
              break;
            case 91: 
              i();
              break;
            case 90: 
              f();
              break;
            case 89: 
              r();
              break;
            case 86: 
              C();
              break;
              h();
              break;
            }
          }
        }
        AudioService.u().j(E(paramIntent));
      }
      return true;
    }
    
    public void h()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().w();
    }
    
    public void i()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().e();
    }
    
    public void j(String paramString, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().z(paramString, paramBundle);
    }
    
    public void k(String paramString, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().u(paramString, paramBundle);
    }
    
    public void l(Uri paramUri, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().I(paramUri, paramBundle);
    }
    
    public void m()
    {
      if (AudioService.u() == null) {
        return;
      }
      if (!AudioService.v(AudioService.this).e()) {
        AudioService.v(AudioService.this).g(true);
      }
      AudioService.u().p();
    }
    
    public void n(String paramString, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      if (!AudioService.v(AudioService.this).e()) {
        AudioService.v(AudioService.this).g(true);
      }
      AudioService.u().h(paramString, paramBundle);
    }
    
    public void o(String paramString, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      if (!AudioService.v(AudioService.this).e()) {
        AudioService.v(AudioService.this).g(true);
      }
      AudioService.u().F(paramString, paramBundle);
    }
    
    public void p(Uri paramUri, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      if (!AudioService.v(AudioService.this).e()) {
        AudioService.v(AudioService.this).g(true);
      }
      AudioService.u().q(paramUri, paramBundle);
    }
    
    public void q(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().n(AudioService.K(paramMediaDescriptionCompat.g()));
    }
    
    public void r()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().r();
    }
    
    public void s(long paramLong)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().B(paramLong);
    }
    
    public void t(boolean paramBoolean)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().f(paramBoolean);
    }
    
    public void u(float paramFloat)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().o(paramFloat);
    }
    
    public void v(RatingCompat paramRatingCompat)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().t(paramRatingCompat);
    }
    
    public void w(RatingCompat paramRatingCompat, Bundle paramBundle)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().J(paramRatingCompat, paramBundle);
    }
    
    public void x(int paramInt)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().c(paramInt);
    }
    
    public void y(int paramInt)
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().d(paramInt);
    }
    
    public void z()
    {
      if (AudioService.u() == null) {
        return;
      }
      AudioService.u().l();
    }
  }
  
  public static abstract interface e
  {
    public abstract void A();
    
    public abstract void B(long paramLong);
    
    public abstract void C(MediaMetadataCompat paramMediaMetadataCompat);
    
    public abstract void D();
    
    public abstract void E(String paramString, Bundle paramBundle);
    
    public abstract void F(String paramString, Bundle paramBundle);
    
    public abstract void G(long paramLong);
    
    public abstract void H(int paramInt);
    
    public abstract void I(Uri paramUri, Bundle paramBundle);
    
    public abstract void J(RatingCompat paramRatingCompat, Bundle paramBundle);
    
    public abstract void b();
    
    public abstract void c(int paramInt);
    
    public abstract void d(int paramInt);
    
    public abstract void e();
    
    public abstract void f(boolean paramBoolean);
    
    public abstract void g();
    
    public abstract void h(String paramString, Bundle paramBundle);
    
    public abstract void i(String paramString, Bundle paramBundle, d.l paraml);
    
    public abstract void j(q paramq);
    
    public abstract void k();
    
    public abstract void l();
    
    public abstract void m(String paramString, d.l paraml);
    
    public abstract void n(MediaMetadataCompat paramMediaMetadataCompat);
    
    public abstract void o(float paramFloat);
    
    public abstract void p();
    
    public abstract void q(Uri paramUri, Bundle paramBundle);
    
    public abstract void r();
    
    public abstract void s(String paramString, d.l paraml, Bundle paramBundle);
    
    public abstract void t(RatingCompat paramRatingCompat);
    
    public abstract void u(String paramString, Bundle paramBundle);
    
    public abstract void v(MediaMetadataCompat paramMediaMetadataCompat, int paramInt);
    
    public abstract void w();
    
    public abstract void x(int paramInt);
    
    public abstract void y();
    
    public abstract void z(String paramString, Bundle paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */