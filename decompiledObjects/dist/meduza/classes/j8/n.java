package j8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import b.z;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k8.i;
import r8.h;
import sb.t;

public final class n
{
  public static final k t = new k();
  public final Context a;
  public final w b;
  public final r4.c c;
  public final l8.n d;
  public final i e;
  public final a0 f;
  public final p8.e g;
  public final a h;
  public final l8.f i;
  public final g8.a j;
  public final h8.a k;
  public final j l;
  public final d0 m;
  public v n;
  public h o = null;
  public final TaskCompletionSource<Boolean> p = new TaskCompletionSource();
  public final TaskCompletionSource<Boolean> q = new TaskCompletionSource();
  public final TaskCompletionSource<Void> r = new TaskCompletionSource();
  public final AtomicBoolean s = new AtomicBoolean(false);
  
  public n(Context paramContext, a0 parama0, w paramw, p8.e parame, r4.c paramc, a parama, l8.n paramn, l8.f paramf, d0 paramd0, g8.a parama1, h8.a parama2, j paramj, i parami)
  {
    a = paramContext;
    f = parama0;
    b = paramw;
    g = parame;
    c = paramc;
    h = parama;
    d = paramn;
    i = paramf;
    j = parama1;
    k = parama2;
    l = paramj;
    m = paramd0;
    e = parami;
  }
  
  public static Task a(n paramn)
  {
    paramn.getClass();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = g;
    Object localObject2 = t;
    localObject2 = p8.e.e(c.listFiles((FilenameFilter)localObject2)).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      File localFile = (File)((Iterator)localObject2).next();
      try
      {
        l1 = Long.parseLong(localFile.getName().substring(3));
        i1 = 0;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        long l1;
        int i1;
        label85:
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor;
        StringBuilder localStringBuilder = f.l("Could not parse app exception timestamp from file ");
        localStringBuilder.append(localFile.getName());
        Log.w("FirebaseCrashlytics", localStringBuilder.toString(), null);
      }
      try
      {
        Class.forName("com.google.firebase.crash.FirebaseCrash");
        i1 = 1;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        break label85;
      }
      if (i1 != 0)
      {
        Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
        localObject1 = Tasks.forResult(null);
      }
      else
      {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
          Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
        }
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        localObject1 = new j8/p;
        ((p)localObject1).<init>(paramn, l1);
        localObject1 = Tasks.call(localScheduledThreadPoolExecutor, (Callable)localObject1);
      }
      localArrayList.add(localObject1);
      localFile.delete();
    }
    return Tasks.whenAll(localArrayList);
  }
  
  public static String f()
  {
    Object localObject1 = n.class.getClassLoader();
    if (localObject1 == null)
    {
      Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
    }
    else
    {
      localObject2 = ((ClassLoader)localObject1).getResourceAsStream("META-INF/version-control-info.textproto");
      localObject1 = localObject2;
      if (localObject2 != null) {
        break label46;
      }
      Log.i("FirebaseCrashlytics", "No version control information found", null);
    }
    localObject1 = null;
    label46:
    if (localObject1 == null) {
      return null;
    }
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", "Read version control info", null);
    }
    Object localObject2 = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i1 = ((InputStream)localObject1).read(arrayOfByte);
      if (i1 == -1) {
        break;
      }
      ((ByteArrayOutputStream)localObject2).write(arrayOfByte, 0, i1);
    }
    return Base64.encodeToString(((ByteArrayOutputStream)localObject2).toByteArray(), 0);
  }
  
  /* Error */
  public final void b(boolean paramBoolean1, h paramh, boolean paramBoolean2)
  {
    // Byte code:
    //   0: invokestatic 287	k8/i:a	()V
    //   3: aload_0
    //   4: getfield 102	j8/n:m	Lj8/d0;
    //   7: getfield 292	j8/d0:b	Lp8/c;
    //   10: astore 4
    //   12: aload 4
    //   14: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: pop
    //   18: new 115	java/util/ArrayList
    //   21: dup
    //   22: new 294	java/util/TreeSet
    //   25: dup
    //   26: aload 4
    //   28: getfield 298	p8/c:b	Lp8/e;
    //   31: getfield 300	p8/e:d	Ljava/io/File;
    //   34: invokevirtual 304	java/io/File:list	()[Ljava/lang/String;
    //   37: invokestatic 130	p8/e:e	([Ljava/lang/Object;)Ljava/util/List;
    //   40: invokespecial 307	java/util/TreeSet:<init>	(Ljava/util/Collection;)V
    //   43: invokevirtual 311	java/util/TreeSet:descendingSet	()Ljava/util/NavigableSet;
    //   46: invokespecial 312	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   49: astore 5
    //   51: aload 5
    //   53: invokevirtual 316	java/util/ArrayList:size	()I
    //   56: iload_1
    //   57: if_icmpgt +23 -> 80
    //   60: ldc -84
    //   62: iconst_2
    //   63: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   66: ifeq +13 -> 79
    //   69: ldc -84
    //   71: ldc_w 318
    //   74: aconst_null
    //   75: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   78: pop
    //   79: return
    //   80: aload 5
    //   82: iload_1
    //   83: invokevirtual 325	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   86: checkcast 152	java/lang/String
    //   89: astore 6
    //   91: iload_3
    //   92: ifeq +638 -> 730
    //   95: aload_2
    //   96: checkcast 327	r8/f
    //   99: invokevirtual 330	r8/f:b	()Lr8/c;
    //   102: getfield 335	r8/c:b	Lr8/c$a;
    //   105: getfield 340	r8/c$a:b	Z
    //   108: ifeq +622 -> 730
    //   111: getstatic 346	android/os/Build$VERSION:SDK_INT	I
    //   114: istore 7
    //   116: iload 7
    //   118: bipush 30
    //   120: if_icmplt +581 -> 701
    //   123: aload_0
    //   124: getfield 80	j8/n:a	Landroid/content/Context;
    //   127: ldc_w 348
    //   130: invokevirtual 354	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   133: checkcast 356	android/app/ActivityManager
    //   136: invokestatic 361	e0/f0:d	(Landroid/app/ActivityManager;)Ljava/util/List;
    //   139: astore 8
    //   141: aload 8
    //   143: invokeinterface 362 1 0
    //   148: ifeq +532 -> 680
    //   151: new 364	l8/f
    //   154: dup
    //   155: aload_0
    //   156: getfield 86	j8/n:g	Lp8/e;
    //   159: aload 6
    //   161: invokespecial 367	l8/f:<init>	(Lp8/e;Ljava/lang/String;)V
    //   164: astore 9
    //   166: aload_0
    //   167: getfield 86	j8/n:g	Lp8/e;
    //   170: astore_2
    //   171: aload_0
    //   172: getfield 104	j8/n:e	Lk8/i;
    //   175: astore 10
    //   177: new 369	l8/h
    //   180: dup
    //   181: aload_2
    //   182: invokespecial 372	l8/h:<init>	(Lp8/e;)V
    //   185: astore 4
    //   187: new 374	l8/n
    //   190: dup
    //   191: aload 6
    //   193: aload_2
    //   194: aload 10
    //   196: invokespecial 377	l8/n:<init>	(Ljava/lang/String;Lp8/e;Lk8/i;)V
    //   199: astore 11
    //   201: aload 11
    //   203: getfield 380	l8/n:d	Ll8/n$a;
    //   206: getfield 385	l8/n$a:a	Ljava/util/concurrent/atomic/AtomicMarkableReference;
    //   209: invokevirtual 390	java/util/concurrent/atomic/AtomicMarkableReference:getReference	()Ljava/lang/Object;
    //   212: checkcast 392	l8/e
    //   215: aload 4
    //   217: aload 6
    //   219: iconst_0
    //   220: invokevirtual 395	l8/h:c	(Ljava/lang/String;Z)Ljava/util/Map;
    //   223: invokevirtual 398	l8/e:c	(Ljava/util/Map;)V
    //   226: aload 11
    //   228: getfield 400	l8/n:e	Ll8/n$a;
    //   231: getfield 385	l8/n$a:a	Ljava/util/concurrent/atomic/AtomicMarkableReference;
    //   234: invokevirtual 390	java/util/concurrent/atomic/AtomicMarkableReference:getReference	()Ljava/lang/Object;
    //   237: checkcast 392	l8/e
    //   240: aload 4
    //   242: aload 6
    //   244: iconst_1
    //   245: invokevirtual 395	l8/h:c	(Ljava/lang/String;Z)Ljava/util/Map;
    //   248: invokevirtual 398	l8/e:c	(Ljava/util/Map;)V
    //   251: aload 11
    //   253: getfield 402	l8/n:g	Ljava/util/concurrent/atomic/AtomicMarkableReference;
    //   256: aload 4
    //   258: aload 6
    //   260: invokevirtual 405	l8/h:d	(Ljava/lang/String;)Ljava/lang/String;
    //   263: iconst_0
    //   264: invokevirtual 409	java/util/concurrent/atomic/AtomicMarkableReference:set	(Ljava/lang/Object;Z)V
    //   267: aload 11
    //   269: getfield 412	l8/n:f	Ll8/l;
    //   272: astore 12
    //   274: aload_2
    //   275: aload 6
    //   277: ldc_w 414
    //   280: invokevirtual 417	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   283: astore 13
    //   285: aload 13
    //   287: invokevirtual 420	java/io/File:exists	()Z
    //   290: ifeq +216 -> 506
    //   293: aload 13
    //   295: invokevirtual 424	java/io/File:length	()J
    //   298: lconst_0
    //   299: lcmp
    //   300: ifne +6 -> 306
    //   303: goto +203 -> 506
    //   306: new 426	java/io/FileInputStream
    //   309: astore 4
    //   311: aload 4
    //   313: aload 13
    //   315: invokespecial 429	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   318: aload 4
    //   320: astore_2
    //   321: aload 4
    //   323: invokestatic 434	j8/g:j	(Ljava/io/FileInputStream;)Ljava/lang/String;
    //   326: invokestatic 437	l8/h:b	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   329: astore 10
    //   331: aload 4
    //   333: astore_2
    //   334: new 220	java/lang/StringBuilder
    //   337: astore 14
    //   339: aload 4
    //   341: astore_2
    //   342: aload 14
    //   344: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   347: aload 4
    //   349: astore_2
    //   350: aload 14
    //   352: ldc_w 440
    //   355: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: pop
    //   359: aload 4
    //   361: astore_2
    //   362: aload 14
    //   364: aload 10
    //   366: invokevirtual 443	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload 4
    //   372: astore_2
    //   373: aload 14
    //   375: ldc_w 445
    //   378: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload 4
    //   384: astore_2
    //   385: aload 14
    //   387: aload 6
    //   389: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: pop
    //   393: aload 4
    //   395: astore_2
    //   396: aload 14
    //   398: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: astore 14
    //   403: aload 4
    //   405: astore_2
    //   406: ldc -84
    //   408: iconst_3
    //   409: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   412: ifeq +15 -> 427
    //   415: aload 4
    //   417: astore_2
    //   418: ldc -84
    //   420: aload 14
    //   422: aconst_null
    //   423: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   426: pop
    //   427: aload 4
    //   429: ldc_w 447
    //   432: invokestatic 450	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   435: aload 10
    //   437: astore_2
    //   438: goto +104 -> 542
    //   441: astore 4
    //   443: goto +53 -> 496
    //   446: astore 10
    //   448: goto +15 -> 463
    //   451: astore 4
    //   453: aconst_null
    //   454: astore_2
    //   455: goto +41 -> 496
    //   458: astore 10
    //   460: aconst_null
    //   461: astore 4
    //   463: aload 4
    //   465: astore_2
    //   466: ldc -84
    //   468: ldc_w 452
    //   471: aload 10
    //   473: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   476: pop
    //   477: aload 4
    //   479: astore_2
    //   480: aload 13
    //   482: invokestatic 454	l8/h:f	(Ljava/io/File;)V
    //   485: aload 4
    //   487: ldc_w 447
    //   490: invokestatic 450	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   493: goto +45 -> 538
    //   496: aload_2
    //   497: ldc_w 447
    //   500: invokestatic 450	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   503: aload 4
    //   505: athrow
    //   506: new 220	java/lang/StringBuilder
    //   509: dup
    //   510: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   513: astore_2
    //   514: aload_2
    //   515: ldc_w 456
    //   518: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: aload_2
    //   523: aload 6
    //   525: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: pop
    //   529: aload 13
    //   531: aload_2
    //   532: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   535: invokestatic 459	l8/h:g	(Ljava/io/File;Ljava/lang/String;)V
    //   538: invokestatic 465	java/util/Collections:emptyList	()Ljava/util/List;
    //   541: astore_2
    //   542: aload 12
    //   544: monitorenter
    //   545: aload 12
    //   547: getfield 470	l8/l:a	Ljava/util/ArrayList;
    //   550: invokevirtual 473	java/util/ArrayList:clear	()V
    //   553: aload_2
    //   554: astore 4
    //   556: aload_2
    //   557: invokeinterface 362 1 0
    //   562: aload 12
    //   564: getfield 475	l8/l:b	I
    //   567: if_icmple +75 -> 642
    //   570: new 220	java/lang/StringBuilder
    //   573: astore 4
    //   575: aload 4
    //   577: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   580: aload 4
    //   582: ldc_w 477
    //   585: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: pop
    //   589: aload 4
    //   591: iconst_0
    //   592: invokevirtual 480	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: aload 4
    //   598: ldc_w 482
    //   601: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   604: pop
    //   605: aload 4
    //   607: aload 12
    //   609: getfield 475	l8/l:b	I
    //   612: invokevirtual 480	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   615: pop
    //   616: ldc -84
    //   618: aload 4
    //   620: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   623: aconst_null
    //   624: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   627: pop
    //   628: aload_2
    //   629: iconst_0
    //   630: aload 12
    //   632: getfield 475	l8/l:b	I
    //   635: invokeinterface 486 3 0
    //   640: astore 4
    //   642: aload 12
    //   644: getfield 470	l8/l:a	Ljava/util/ArrayList;
    //   647: aload 4
    //   649: invokevirtual 490	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   652: pop
    //   653: aload 12
    //   655: monitorexit
    //   656: aload_0
    //   657: getfield 102	j8/n:m	Lj8/d0;
    //   660: aload 6
    //   662: aload 8
    //   664: aload 9
    //   666: aload 11
    //   668: invokevirtual 493	j8/d0:f	(Ljava/lang/String;Ljava/util/List;Ll8/f;Ll8/n;)V
    //   671: goto +78 -> 749
    //   674: astore_2
    //   675: aload 12
    //   677: monitorexit
    //   678: aload_2
    //   679: athrow
    //   680: ldc_w 495
    //   683: aload 6
    //   685: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   688: astore_2
    //   689: ldc -84
    //   691: iconst_2
    //   692: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   695: ifeq +54 -> 749
    //   698: goto +21 -> 719
    //   701: ldc_w 501
    //   704: iload 7
    //   706: invokestatic 504	f:h	(Ljava/lang/String;I)Ljava/lang/String;
    //   709: astore_2
    //   710: ldc -84
    //   712: iconst_2
    //   713: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   716: ifeq +33 -> 749
    //   719: ldc -84
    //   721: aload_2
    //   722: aconst_null
    //   723: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   726: pop
    //   727: goto +22 -> 749
    //   730: ldc -84
    //   732: iconst_2
    //   733: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   736: ifeq +13 -> 749
    //   739: ldc -84
    //   741: ldc_w 506
    //   744: aconst_null
    //   745: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   748: pop
    //   749: iload_3
    //   750: ifeq +136 -> 886
    //   753: aload_0
    //   754: getfield 96	j8/n:j	Lg8/a;
    //   757: aload 6
    //   759: invokeinterface 511 2 0
    //   764: ifeq +122 -> 886
    //   767: ldc_w 513
    //   770: aload 6
    //   772: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   775: astore_2
    //   776: ldc -84
    //   778: iconst_2
    //   779: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   782: ifeq +11 -> 793
    //   785: ldc -84
    //   787: aload_2
    //   788: aconst_null
    //   789: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   792: pop
    //   793: aload_0
    //   794: getfield 96	j8/n:j	Lg8/a;
    //   797: aload 6
    //   799: invokeinterface 516 2 0
    //   804: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   807: pop
    //   808: new 220	java/lang/StringBuilder
    //   811: dup
    //   812: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   815: astore_2
    //   816: aload_2
    //   817: ldc_w 518
    //   820: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: pop
    //   824: aload_2
    //   825: aload 6
    //   827: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   830: pop
    //   831: ldc -84
    //   833: aload_2
    //   834: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   837: aconst_null
    //   838: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   841: pop
    //   842: new 220	java/lang/StringBuilder
    //   845: dup
    //   846: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   849: astore_2
    //   850: aload_2
    //   851: ldc_w 520
    //   854: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: pop
    //   858: aload_2
    //   859: aload 6
    //   861: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: pop
    //   865: ldc -84
    //   867: aload_2
    //   868: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   871: aconst_null
    //   872: invokestatic 251	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   875: pop
    //   876: ldc -84
    //   878: ldc_w 522
    //   881: aconst_null
    //   882: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   885: pop
    //   886: iload_1
    //   887: ifeq +16 -> 903
    //   890: aload 5
    //   892: iconst_0
    //   893: invokevirtual 325	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   896: checkcast 152	java/lang/String
    //   899: astore_2
    //   900: goto +38 -> 938
    //   903: aload_0
    //   904: getfield 100	j8/n:l	Lj8/j;
    //   907: getfield 527	j8/j:b	Lj8/i;
    //   910: astore 4
    //   912: aload 4
    //   914: monitorenter
    //   915: aload 4
    //   917: getfield 532	j8/i:b	Ljava/lang/String;
    //   920: aconst_null
    //   921: invokestatic 538	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   924: ifne +9 -> 933
    //   927: aload 4
    //   929: aconst_null
    //   930: putfield 532	j8/i:b	Ljava/lang/String;
    //   933: aload 4
    //   935: monitorexit
    //   936: aconst_null
    //   937: astore_2
    //   938: aload_0
    //   939: getfield 102	j8/n:m	Lj8/d0;
    //   942: astore 4
    //   944: invokestatic 543	java/lang/System:currentTimeMillis	()J
    //   947: ldc2_w 544
    //   950: ldiv
    //   951: lstore 15
    //   953: aload 4
    //   955: getfield 292	j8/d0:b	Lp8/c;
    //   958: astore 4
    //   960: aload 4
    //   962: getfield 298	p8/c:b	Lp8/e;
    //   965: astore 10
    //   967: aload 10
    //   969: ldc_w 547
    //   972: invokevirtual 550	p8/e:a	(Ljava/lang/String;)V
    //   975: aload 10
    //   977: ldc_w 552
    //   980: invokevirtual 550	p8/e:a	(Ljava/lang/String;)V
    //   983: aload 10
    //   985: getfield 554	p8/e:a	Ljava/lang/String;
    //   988: invokevirtual 557	java/lang/String:isEmpty	()Z
    //   991: iconst_1
    //   992: ixor
    //   993: ifeq +108 -> 1101
    //   996: aload 10
    //   998: ldc_w 559
    //   1001: invokevirtual 550	p8/e:a	(Ljava/lang/String;)V
    //   1004: new 220	java/lang/StringBuilder
    //   1007: dup
    //   1008: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   1011: astore 6
    //   1013: aload 6
    //   1015: ldc_w 561
    //   1018: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1021: pop
    //   1022: aload 6
    //   1024: getstatic 564	java/io/File:pathSeparator	Ljava/lang/String;
    //   1027: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1030: pop
    //   1031: aload 6
    //   1033: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1036: astore 6
    //   1038: aload 10
    //   1040: getfield 566	p8/e:b	Ljava/io/File;
    //   1043: invokevirtual 420	java/io/File:exists	()Z
    //   1046: ifeq +55 -> 1101
    //   1049: aload 10
    //   1051: getfield 566	p8/e:b	Ljava/io/File;
    //   1054: new 568	p8/d
    //   1057: dup
    //   1058: aload 6
    //   1060: invokespecial 570	p8/d:<init>	(Ljava/lang/String;)V
    //   1063: invokevirtual 573	java/io/File:list	(Ljava/io/FilenameFilter;)[Ljava/lang/String;
    //   1066: astore 6
    //   1068: aload 6
    //   1070: ifnull +31 -> 1101
    //   1073: aload 6
    //   1075: arraylength
    //   1076: istore 7
    //   1078: iconst_0
    //   1079: istore_1
    //   1080: iload_1
    //   1081: iload 7
    //   1083: if_icmpge +18 -> 1101
    //   1086: aload 10
    //   1088: aload 6
    //   1090: iload_1
    //   1091: aaload
    //   1092: invokevirtual 550	p8/e:a	(Ljava/lang/String;)V
    //   1095: iinc 1 1
    //   1098: goto -18 -> 1080
    //   1101: new 294	java/util/TreeSet
    //   1104: dup
    //   1105: aload 4
    //   1107: getfield 298	p8/c:b	Lp8/e;
    //   1110: getfield 300	p8/e:d	Ljava/io/File;
    //   1113: invokevirtual 304	java/io/File:list	()[Ljava/lang/String;
    //   1116: invokestatic 130	p8/e:e	([Ljava/lang/Object;)Ljava/util/List;
    //   1119: invokespecial 307	java/util/TreeSet:<init>	(Ljava/util/Collection;)V
    //   1122: invokevirtual 311	java/util/TreeSet:descendingSet	()Ljava/util/NavigableSet;
    //   1125: astore 10
    //   1127: aload_2
    //   1128: ifnull +12 -> 1140
    //   1131: aload 10
    //   1133: aload_2
    //   1134: invokeinterface 578 2 0
    //   1139: pop
    //   1140: aload 10
    //   1142: invokeinterface 579 1 0
    //   1147: bipush 8
    //   1149: if_icmpgt +6 -> 1155
    //   1152: goto +95 -> 1247
    //   1155: aload 10
    //   1157: invokeinterface 579 1 0
    //   1162: bipush 8
    //   1164: if_icmple +83 -> 1247
    //   1167: aload 10
    //   1169: invokeinterface 584 1 0
    //   1174: checkcast 152	java/lang/String
    //   1177: astore_2
    //   1178: ldc_w 586
    //   1181: aload_2
    //   1182: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1185: astore 6
    //   1187: ldc -84
    //   1189: iconst_3
    //   1190: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1193: ifeq +12 -> 1205
    //   1196: ldc -84
    //   1198: aload 6
    //   1200: aconst_null
    //   1201: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1204: pop
    //   1205: aload 4
    //   1207: getfield 298	p8/c:b	Lp8/e;
    //   1210: astore 6
    //   1212: aload 6
    //   1214: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1217: pop
    //   1218: new 123	java/io/File
    //   1221: dup
    //   1222: aload 6
    //   1224: getfield 300	p8/e:d	Ljava/io/File;
    //   1227: aload_2
    //   1228: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1231: invokestatic 591	p8/e:d	(Ljava/io/File;)Z
    //   1234: pop
    //   1235: aload 10
    //   1237: aload_2
    //   1238: invokeinterface 578 2 0
    //   1243: pop
    //   1244: goto -89 -> 1155
    //   1247: aload 10
    //   1249: invokeinterface 594 1 0
    //   1254: astore 10
    //   1256: aload 10
    //   1258: invokeinterface 142 1 0
    //   1263: ifeq +972 -> 2235
    //   1266: aload 10
    //   1268: invokeinterface 146 1 0
    //   1273: checkcast 152	java/lang/String
    //   1276: astore 6
    //   1278: ldc_w 596
    //   1281: aload 6
    //   1283: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1286: astore_2
    //   1287: ldc -84
    //   1289: iconst_2
    //   1290: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1293: ifeq +11 -> 1304
    //   1296: ldc -84
    //   1298: aload_2
    //   1299: aconst_null
    //   1300: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1303: pop
    //   1304: aload 4
    //   1306: getfield 298	p8/c:b	Lp8/e;
    //   1309: astore 5
    //   1311: getstatic 599	p8/c:i	Lp8/a;
    //   1314: astore_2
    //   1315: aload 5
    //   1317: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1320: pop
    //   1321: new 123	java/io/File
    //   1324: dup
    //   1325: aload 5
    //   1327: getfield 300	p8/e:d	Ljava/io/File;
    //   1330: aload 6
    //   1332: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1335: astore 5
    //   1337: aload 5
    //   1339: invokevirtual 602	java/io/File:mkdirs	()Z
    //   1342: pop
    //   1343: aload 5
    //   1345: aload_2
    //   1346: invokevirtual 127	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   1349: invokestatic 130	p8/e:e	([Ljava/lang/Object;)Ljava/util/List;
    //   1352: astore_2
    //   1353: aload_2
    //   1354: invokeinterface 603 1 0
    //   1359: ifeq +35 -> 1394
    //   1362: ldc_w 605
    //   1365: aload 6
    //   1367: ldc_w 607
    //   1370: invokestatic 610	g:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1373: astore_2
    //   1374: ldc -84
    //   1376: iconst_2
    //   1377: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1380: ifeq +818 -> 2198
    //   1383: ldc -84
    //   1385: aload_2
    //   1386: aconst_null
    //   1387: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1390: pop
    //   1391: goto +807 -> 2198
    //   1394: aload_2
    //   1395: invokestatic 614	java/util/Collections:sort	(Ljava/util/List;)V
    //   1398: new 115	java/util/ArrayList
    //   1401: dup
    //   1402: invokespecial 116	java/util/ArrayList:<init>	()V
    //   1405: astore 5
    //   1407: aload_2
    //   1408: invokeinterface 136 1 0
    //   1413: astore_2
    //   1414: iconst_0
    //   1415: istore_3
    //   1416: aload_2
    //   1417: invokeinterface 142 1 0
    //   1422: ifeq +218 -> 1640
    //   1425: aload_2
    //   1426: invokeinterface 146 1 0
    //   1431: checkcast 123	java/io/File
    //   1434: astore 8
    //   1436: getstatic 617	p8/c:g	Ln8/a;
    //   1439: astore 9
    //   1441: aload 8
    //   1443: invokestatic 620	p8/c:d	(Ljava/io/File;)Ljava/lang/String;
    //   1446: astore 11
    //   1448: aload 9
    //   1450: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1453: pop
    //   1454: new 622	android/util/JsonReader
    //   1457: astore 9
    //   1459: new 624	java/io/StringReader
    //   1462: astore 12
    //   1464: aload 12
    //   1466: aload 11
    //   1468: invokespecial 625	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   1471: aload 9
    //   1473: aload 12
    //   1475: invokespecial 628	android/util/JsonReader:<init>	(Ljava/io/Reader;)V
    //   1478: aload 9
    //   1480: invokestatic 633	n8/a:e	(Landroid/util/JsonReader;)Lm8/l;
    //   1483: astore 11
    //   1485: aload 9
    //   1487: invokevirtual 636	android/util/JsonReader:close	()V
    //   1490: aload 5
    //   1492: aload 11
    //   1494: invokevirtual 212	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1497: pop
    //   1498: iload_3
    //   1499: ifne +53 -> 1552
    //   1502: aload 8
    //   1504: invokevirtual 150	java/io/File:getName	()Ljava/lang/String;
    //   1507: astore 9
    //   1509: aload 9
    //   1511: ldc_w 638
    //   1514: invokevirtual 641	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1517: ifeq +23 -> 1540
    //   1520: aload 9
    //   1522: ldc_w 643
    //   1525: invokevirtual 646	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1528: istore 17
    //   1530: iload 17
    //   1532: ifeq +8 -> 1540
    //   1535: iconst_1
    //   1536: istore_1
    //   1537: goto +5 -> 1542
    //   1540: iconst_0
    //   1541: istore_1
    //   1542: iload_1
    //   1543: ifeq +6 -> 1549
    //   1546: goto +6 -> 1552
    //   1549: goto -135 -> 1414
    //   1552: iconst_1
    //   1553: istore_3
    //   1554: goto -138 -> 1416
    //   1557: astore 11
    //   1559: aload 9
    //   1561: invokevirtual 636	android/util/JsonReader:close	()V
    //   1564: goto +12 -> 1576
    //   1567: astore 9
    //   1569: aload 11
    //   1571: aload 9
    //   1573: invokevirtual 652	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1576: aload 11
    //   1578: athrow
    //   1579: astore 11
    //   1581: new 281	java/io/IOException
    //   1584: astore 9
    //   1586: aload 9
    //   1588: aload 11
    //   1590: invokespecial 654	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   1593: aload 9
    //   1595: athrow
    //   1596: astore 11
    //   1598: new 220	java/lang/StringBuilder
    //   1601: dup
    //   1602: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   1605: astore 9
    //   1607: aload 9
    //   1609: ldc_w 656
    //   1612: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1615: pop
    //   1616: aload 9
    //   1618: aload 8
    //   1620: invokevirtual 443	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1623: pop
    //   1624: ldc -84
    //   1626: aload 9
    //   1628: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1631: aload 11
    //   1633: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1636: pop
    //   1637: goto -221 -> 1416
    //   1640: aload 5
    //   1642: invokevirtual 657	java/util/ArrayList:isEmpty	()Z
    //   1645: ifeq +40 -> 1685
    //   1648: new 220	java/lang/StringBuilder
    //   1651: dup
    //   1652: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   1655: astore_2
    //   1656: aload_2
    //   1657: ldc_w 659
    //   1660: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1663: pop
    //   1664: aload_2
    //   1665: aload 6
    //   1667: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1670: pop
    //   1671: ldc -84
    //   1673: aload_2
    //   1674: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1677: aconst_null
    //   1678: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1681: pop
    //   1682: goto +516 -> 2198
    //   1685: new 369	l8/h
    //   1688: dup
    //   1689: aload 4
    //   1691: getfield 298	p8/c:b	Lp8/e;
    //   1694: invokespecial 372	l8/h:<init>	(Lp8/e;)V
    //   1697: aload 6
    //   1699: invokevirtual 405	l8/h:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1702: astore 9
    //   1704: aload 4
    //   1706: getfield 661	p8/c:d	Lj8/j;
    //   1709: getfield 527	j8/j:b	Lj8/i;
    //   1712: astore 8
    //   1714: aload 8
    //   1716: monitorenter
    //   1717: aload 8
    //   1719: getfield 532	j8/i:b	Ljava/lang/String;
    //   1722: aload 6
    //   1724: invokestatic 538	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1727: ifeq +12 -> 1739
    //   1730: aload 8
    //   1732: getfield 663	j8/i:c	Ljava/lang/String;
    //   1735: astore_2
    //   1736: goto +94 -> 1830
    //   1739: aload 8
    //   1741: getfield 665	j8/i:a	Lp8/e;
    //   1744: astore_2
    //   1745: getstatic 668	j8/i:d	Lj8/h;
    //   1748: astore 11
    //   1750: aload_2
    //   1751: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1754: pop
    //   1755: new 123	java/io/File
    //   1758: astore 12
    //   1760: aload 12
    //   1762: aload_2
    //   1763: getfield 300	p8/e:d	Ljava/io/File;
    //   1766: aload 6
    //   1768: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1771: aload 12
    //   1773: invokevirtual 602	java/io/File:mkdirs	()Z
    //   1776: pop
    //   1777: aload 12
    //   1779: aload 11
    //   1781: invokevirtual 127	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   1784: invokestatic 130	p8/e:e	([Ljava/lang/Object;)Ljava/util/List;
    //   1787: astore_2
    //   1788: aload_2
    //   1789: invokeinterface 603 1 0
    //   1794: ifeq +18 -> 1812
    //   1797: ldc -84
    //   1799: ldc_w 670
    //   1802: aconst_null
    //   1803: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1806: pop
    //   1807: aconst_null
    //   1808: astore_2
    //   1809: goto +21 -> 1830
    //   1812: aload_2
    //   1813: getstatic 673	j8/i:e	Lq5/i;
    //   1816: invokestatic 677	java/util/Collections:min	(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
    //   1819: checkcast 123	java/io/File
    //   1822: invokevirtual 150	java/io/File:getName	()Ljava/lang/String;
    //   1825: iconst_4
    //   1826: invokevirtual 156	java/lang/String:substring	(I)Ljava/lang/String;
    //   1829: astore_2
    //   1830: aload 8
    //   1832: monitorexit
    //   1833: aload 4
    //   1835: getfield 298	p8/c:b	Lp8/e;
    //   1838: aload 6
    //   1840: ldc_w 679
    //   1843: invokevirtual 417	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   1846: astore 8
    //   1848: getstatic 617	p8/c:g	Ln8/a;
    //   1851: astore 11
    //   1853: aload 8
    //   1855: invokestatic 620	p8/c:d	(Ljava/io/File;)Ljava/lang/String;
    //   1858: astore 12
    //   1860: aload 11
    //   1862: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1865: pop
    //   1866: aload 12
    //   1868: invokestatic 682	n8/a:i	(Ljava/lang/String;)Lm8/b;
    //   1871: lload 15
    //   1873: aload 9
    //   1875: iload_3
    //   1876: invokevirtual 687	m8/f0:n	(JLjava/lang/String;Z)Lm8/b;
    //   1879: astore 11
    //   1881: new 689	m8/b$a
    //   1884: astore 9
    //   1886: aload 9
    //   1888: aload 11
    //   1890: invokespecial 692	m8/b$a:<init>	(Lm8/f0;)V
    //   1893: aload 9
    //   1895: aload_2
    //   1896: putfield 694	m8/b$a:g	Ljava/lang/String;
    //   1899: aload 11
    //   1901: getfield 699	m8/b:k	Lm8/f0$e;
    //   1904: astore 11
    //   1906: aload 11
    //   1908: ifnull +26 -> 1934
    //   1911: aload 11
    //   1913: invokevirtual 704	m8/f0$e:m	()Lm8/h$a;
    //   1916: astore 11
    //   1918: aload 11
    //   1920: aload_2
    //   1921: putfield 707	m8/h$a:c	Ljava/lang/String;
    //   1924: aload 9
    //   1926: aload 11
    //   1928: invokevirtual 710	m8/h$a:a	()Lm8/h;
    //   1931: putfield 712	m8/b$a:j	Lm8/f0$e;
    //   1934: aload 9
    //   1936: invokevirtual 715	m8/b$a:a	()Lm8/b;
    //   1939: astore 11
    //   1941: aload 11
    //   1943: getfield 699	m8/b:k	Lm8/f0$e;
    //   1946: ifnull +202 -> 2148
    //   1949: new 689	m8/b$a
    //   1952: astore 9
    //   1954: aload 9
    //   1956: aload 11
    //   1958: invokespecial 692	m8/b$a:<init>	(Lm8/f0;)V
    //   1961: aload 11
    //   1963: getfield 699	m8/b:k	Lm8/f0$e;
    //   1966: invokevirtual 704	m8/f0$e:m	()Lm8/h$a;
    //   1969: astore 11
    //   1971: aload 11
    //   1973: aload 5
    //   1975: putfield 718	m8/h$a:k	Ljava/util/List;
    //   1978: aload 9
    //   1980: aload 11
    //   1982: invokevirtual 710	m8/h$a:a	()Lm8/h;
    //   1985: putfield 712	m8/b$a:j	Lm8/f0$e;
    //   1988: aload 9
    //   1990: invokevirtual 715	m8/b$a:a	()Lm8/b;
    //   1993: astore 5
    //   1995: aload 5
    //   1997: getfield 699	m8/b:k	Lm8/f0$e;
    //   2000: astore 9
    //   2002: aload 9
    //   2004: ifnonnull +6 -> 2010
    //   2007: goto +191 -> 2198
    //   2010: new 220	java/lang/StringBuilder
    //   2013: astore 11
    //   2015: aload 11
    //   2017: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   2020: aload 11
    //   2022: ldc_w 720
    //   2025: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2028: pop
    //   2029: aload 11
    //   2031: aload_2
    //   2032: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2035: pop
    //   2036: aload 11
    //   2038: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2041: astore_2
    //   2042: ldc -84
    //   2044: iconst_3
    //   2045: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   2048: ifeq +11 -> 2059
    //   2051: ldc -84
    //   2053: aload_2
    //   2054: aconst_null
    //   2055: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2058: pop
    //   2059: iload_3
    //   2060: ifeq +41 -> 2101
    //   2063: aload 4
    //   2065: getfield 298	p8/c:b	Lp8/e;
    //   2068: astore 11
    //   2070: aload 9
    //   2072: invokevirtual 722	m8/f0$e:h	()Ljava/lang/String;
    //   2075: astore 9
    //   2077: aload 11
    //   2079: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   2082: pop
    //   2083: new 123	java/io/File
    //   2086: astore_2
    //   2087: aload_2
    //   2088: aload 11
    //   2090: getfield 724	p8/e:f	Ljava/io/File;
    //   2093: aload 9
    //   2095: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   2098: goto +35 -> 2133
    //   2101: aload 4
    //   2103: getfield 298	p8/c:b	Lp8/e;
    //   2106: astore_2
    //   2107: aload 9
    //   2109: invokevirtual 722	m8/f0$e:h	()Ljava/lang/String;
    //   2112: astore 9
    //   2114: aload_2
    //   2115: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   2118: pop
    //   2119: new 123	java/io/File
    //   2122: dup
    //   2123: aload_2
    //   2124: getfield 726	p8/e:e	Ljava/io/File;
    //   2127: aload 9
    //   2129: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   2132: astore_2
    //   2133: aload_2
    //   2134: getstatic 729	n8/a:a	La9/d;
    //   2137: aload 5
    //   2139: invokevirtual 734	a9/d:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   2142: invokestatic 736	p8/c:e	(Ljava/io/File;Ljava/lang/String;)V
    //   2145: goto +53 -> 2198
    //   2148: new 283	java/lang/IllegalStateException
    //   2151: astore_2
    //   2152: aload_2
    //   2153: ldc_w 738
    //   2156: invokespecial 739	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   2159: aload_2
    //   2160: athrow
    //   2161: astore 5
    //   2163: new 220	java/lang/StringBuilder
    //   2166: dup
    //   2167: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   2170: astore_2
    //   2171: aload_2
    //   2172: ldc_w 741
    //   2175: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2178: pop
    //   2179: aload_2
    //   2180: aload 8
    //   2182: invokevirtual 443	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2185: pop
    //   2186: ldc -84
    //   2188: aload_2
    //   2189: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2192: aload 5
    //   2194: invokestatic 180	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2197: pop
    //   2198: aload 4
    //   2200: getfield 298	p8/c:b	Lp8/e;
    //   2203: astore_2
    //   2204: aload_2
    //   2205: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   2208: pop
    //   2209: new 123	java/io/File
    //   2212: dup
    //   2213: aload_2
    //   2214: getfield 300	p8/e:d	Ljava/io/File;
    //   2217: aload 6
    //   2219: invokespecial 588	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   2222: invokestatic 591	p8/e:d	(Ljava/io/File;)Z
    //   2225: pop
    //   2226: goto -970 -> 1256
    //   2229: astore_2
    //   2230: aload 8
    //   2232: monitorexit
    //   2233: aload_2
    //   2234: athrow
    //   2235: aload 4
    //   2237: getfield 743	p8/c:c	Lr8/h;
    //   2240: checkcast 327	r8/f
    //   2243: invokevirtual 330	r8/f:b	()Lr8/c;
    //   2246: getfield 746	r8/c:a	Lr8/c$b;
    //   2249: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   2252: pop
    //   2253: aload 4
    //   2255: invokevirtual 749	p8/c:b	()Ljava/util/ArrayList;
    //   2258: astore_2
    //   2259: aload_2
    //   2260: invokevirtual 316	java/util/ArrayList:size	()I
    //   2263: istore_1
    //   2264: iload_1
    //   2265: iconst_4
    //   2266: if_icmpgt +6 -> 2272
    //   2269: goto +40 -> 2309
    //   2272: aload_2
    //   2273: iconst_4
    //   2274: iload_1
    //   2275: invokevirtual 750	java/util/ArrayList:subList	(II)Ljava/util/List;
    //   2278: invokeinterface 136 1 0
    //   2283: astore_2
    //   2284: aload_2
    //   2285: invokeinterface 142 1 0
    //   2290: ifeq +19 -> 2309
    //   2293: aload_2
    //   2294: invokeinterface 146 1 0
    //   2299: checkcast 123	java/io/File
    //   2302: invokevirtual 229	java/io/File:delete	()Z
    //   2305: pop
    //   2306: goto -22 -> 2284
    //   2309: return
    //   2310: astore_2
    //   2311: aload 4
    //   2313: monitorexit
    //   2314: aload_2
    //   2315: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2316	0	this	n
    //   0	2316	1	paramBoolean1	boolean
    //   0	2316	2	paramh	h
    //   0	2316	3	paramBoolean2	boolean
    //   10	418	4	localObject1	Object
    //   441	1	4	localObject2	Object
    //   451	1	4	localObject3	Object
    //   461	1851	4	localObject4	Object
    //   49	2089	5	localObject5	Object
    //   2161	32	5	localIOException1	IOException
    //   89	2129	6	localObject6	Object
    //   114	970	7	bool1	boolean
    //   139	2092	8	localObject7	Object
    //   164	1396	9	localObject8	Object
    //   1567	5	9	localThrowable	Throwable
    //   1584	544	9	localObject9	Object
    //   175	261	10	localObject10	Object
    //   446	1	10	localException1	Exception
    //   458	14	10	localException2	Exception
    //   965	302	10	localObject11	Object
    //   199	1294	11	localObject12	Object
    //   1557	20	11	localObject13	Object
    //   1579	10	11	localIllegalStateException	IllegalStateException
    //   1596	36	11	localIOException2	IOException
    //   1748	341	11	localObject14	Object
    //   272	1595	12	localObject15	Object
    //   283	247	13	localFile	File
    //   337	84	14	localObject16	Object
    //   951	921	15	l1	long
    //   1528	3	17	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   321	331	441	finally
    //   334	339	441	finally
    //   342	347	441	finally
    //   350	359	441	finally
    //   362	370	441	finally
    //   373	382	441	finally
    //   385	393	441	finally
    //   396	403	441	finally
    //   406	415	441	finally
    //   418	427	441	finally
    //   466	477	441	finally
    //   480	485	441	finally
    //   321	331	446	java/lang/Exception
    //   334	339	446	java/lang/Exception
    //   342	347	446	java/lang/Exception
    //   350	359	446	java/lang/Exception
    //   362	370	446	java/lang/Exception
    //   373	382	446	java/lang/Exception
    //   385	393	446	java/lang/Exception
    //   396	403	446	java/lang/Exception
    //   406	415	446	java/lang/Exception
    //   418	427	446	java/lang/Exception
    //   306	318	451	finally
    //   306	318	458	java/lang/Exception
    //   545	553	674	finally
    //   556	642	674	finally
    //   642	653	674	finally
    //   1478	1485	1557	finally
    //   1559	1564	1567	finally
    //   1454	1478	1579	java/lang/IllegalStateException
    //   1485	1490	1579	java/lang/IllegalStateException
    //   1569	1576	1579	java/lang/IllegalStateException
    //   1576	1579	1579	java/lang/IllegalStateException
    //   1436	1454	1596	java/io/IOException
    //   1454	1478	1596	java/io/IOException
    //   1485	1490	1596	java/io/IOException
    //   1490	1498	1596	java/io/IOException
    //   1502	1530	1596	java/io/IOException
    //   1569	1576	1596	java/io/IOException
    //   1576	1579	1596	java/io/IOException
    //   1581	1596	1596	java/io/IOException
    //   1848	1906	2161	java/io/IOException
    //   1911	1934	2161	java/io/IOException
    //   1934	2002	2161	java/io/IOException
    //   2010	2059	2161	java/io/IOException
    //   2063	2098	2161	java/io/IOException
    //   2101	2133	2161	java/io/IOException
    //   2133	2145	2161	java/io/IOException
    //   2148	2161	2161	java/io/IOException
    //   1717	1736	2229	finally
    //   1739	1807	2229	finally
    //   1812	1830	2229	finally
    //   915	933	2310	finally
  }
  
  /* Error */
  public final void c(String paramString, Boolean paramBoolean)
  {
    // Byte code:
    //   0: invokestatic 543	java/lang/System:currentTimeMillis	()J
    //   3: ldc2_w 544
    //   6: ldiv
    //   7: lstore_3
    //   8: ldc_w 753
    //   11: aload_1
    //   12: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   15: astore 5
    //   17: ldc -84
    //   19: iconst_3
    //   20: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   23: ifeq +12 -> 35
    //   26: ldc -84
    //   28: aload 5
    //   30: aconst_null
    //   31: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   34: pop
    //   35: getstatic 759	java/util/Locale:US	Ljava/util/Locale;
    //   38: astore 6
    //   40: aload 6
    //   42: ldc_w 761
    //   45: iconst_1
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: ldc_w 763
    //   54: aastore
    //   55: invokestatic 767	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   58: astore 7
    //   60: aload_0
    //   61: getfield 82	j8/n:f	Lj8/a0;
    //   64: astore 8
    //   66: aload_0
    //   67: getfield 90	j8/n:h	Lj8/a;
    //   70: astore 9
    //   72: aload 8
    //   74: getfield 770	j8/a0:c	Ljava/lang/String;
    //   77: astore 10
    //   79: aload 9
    //   81: getfield 774	j8/a:f	Ljava/lang/String;
    //   84: astore 5
    //   86: aload 9
    //   88: getfield 775	j8/a:g	Ljava/lang/String;
    //   91: astore 11
    //   93: aload 8
    //   95: invokevirtual 778	j8/a0:c	()Lj8/b0$a;
    //   98: checkcast 780	j8/c
    //   101: getfield 781	j8/c:a	Ljava/lang/String;
    //   104: astore 8
    //   106: aload 9
    //   108: getfield 783	j8/a:d	Ljava/lang/String;
    //   111: ifnull +9 -> 120
    //   114: iconst_4
    //   115: istore 12
    //   117: goto +6 -> 123
    //   120: iconst_1
    //   121: istore 12
    //   123: new 785	m8/c0
    //   126: dup
    //   127: aload 10
    //   129: aload 5
    //   131: aload 11
    //   133: aload 8
    //   135: iload 12
    //   137: invokestatic 788	f:e	(I)I
    //   140: aload 9
    //   142: getfield 791	j8/a:h	Lg8/c;
    //   145: invokespecial 794	m8/c0:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILg8/c;)V
    //   148: astore 13
    //   150: getstatic 797	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   153: astore 11
    //   155: getstatic 800	android/os/Build$VERSION:CODENAME	Ljava/lang/String;
    //   158: astore 8
    //   160: new 802	m8/e0
    //   163: dup
    //   164: aload 11
    //   166: aload 8
    //   168: invokestatic 804	j8/g:h	()Z
    //   171: invokespecial 807	m8/e0:<init>	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   174: astore 14
    //   176: aload_0
    //   177: getfield 80	j8/n:a	Landroid/content/Context;
    //   180: astore 15
    //   182: new 809	android/os/StatFs
    //   185: dup
    //   186: invokestatic 815	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   189: invokevirtual 818	java/io/File:getPath	()Ljava/lang/String;
    //   192: invokespecial 819	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   195: astore 5
    //   197: aload 5
    //   199: invokevirtual 822	android/os/StatFs:getBlockCount	()I
    //   202: i2l
    //   203: lstore 16
    //   205: aload 5
    //   207: invokevirtual 825	android/os/StatFs:getBlockSize	()I
    //   210: i2l
    //   211: lstore 18
    //   213: getstatic 830	j8/g$a:a	Lj8/g$a;
    //   216: astore 10
    //   218: getstatic 835	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   221: astore 9
    //   223: aload 9
    //   225: invokestatic 840	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   228: ifeq +33 -> 261
    //   231: aload 10
    //   233: astore 5
    //   235: ldc -84
    //   237: iconst_2
    //   238: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   241: ifeq +54 -> 295
    //   244: ldc -84
    //   246: ldc_w 842
    //   249: aconst_null
    //   250: invokestatic 321	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   253: pop
    //   254: aload 10
    //   256: astore 5
    //   258: goto +37 -> 295
    //   261: aload 9
    //   263: aload 6
    //   265: invokevirtual 846	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   268: astore 5
    //   270: getstatic 849	j8/g$a:b	Ljava/util/HashMap;
    //   273: aload 5
    //   275: invokevirtual 854	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   278: checkcast 827	j8/g$a
    //   281: astore 5
    //   283: aload 5
    //   285: ifnonnull +10 -> 295
    //   288: aload 10
    //   290: astore 5
    //   292: goto +3 -> 295
    //   295: aload 5
    //   297: invokevirtual 859	java/lang/Enum:ordinal	()I
    //   300: istore 20
    //   302: getstatic 862	android/os/Build:MODEL	Ljava/lang/String;
    //   305: astore 5
    //   307: invokestatic 868	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   310: invokevirtual 871	java/lang/Runtime:availableProcessors	()I
    //   313: istore 21
    //   315: aload 15
    //   317: invokestatic 874	j8/g:a	(Landroid/content/Context;)J
    //   320: lstore 22
    //   322: invokestatic 876	j8/g:g	()Z
    //   325: istore 24
    //   327: invokestatic 878	j8/g:c	()I
    //   330: istore 12
    //   332: getstatic 881	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   335: astore 10
    //   337: getstatic 884	android/os/Build:PRODUCT	Ljava/lang/String;
    //   340: astore 15
    //   342: new 886	m8/d0
    //   345: dup
    //   346: iload 20
    //   348: aload 5
    //   350: iload 21
    //   352: lload 22
    //   354: lload 16
    //   356: lload 18
    //   358: lmul
    //   359: iload 24
    //   361: iload 12
    //   363: aload 10
    //   365: aload 15
    //   367: invokespecial 889	m8/d0:<init>	(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V
    //   370: astore 25
    //   372: aload_0
    //   373: getfield 96	j8/n:j	Lg8/a;
    //   376: aload_1
    //   377: aload 7
    //   379: lload_3
    //   380: new 891	m8/b0
    //   383: dup
    //   384: aload 13
    //   386: aload 14
    //   388: aload 25
    //   390: invokespecial 894	m8/b0:<init>	(Lm8/c0;Lm8/e0;Lm8/d0;)V
    //   393: invokeinterface 897 6 0
    //   398: aload_2
    //   399: invokevirtual 902	java/lang/Boolean:booleanValue	()Z
    //   402: ifeq +123 -> 525
    //   405: aload_1
    //   406: ifnull +119 -> 525
    //   409: aload_0
    //   410: getfield 92	j8/n:d	Ll8/n;
    //   413: astore 7
    //   415: aload 7
    //   417: getfield 903	l8/n:c	Ljava/lang/String;
    //   420: astore_2
    //   421: aload_2
    //   422: monitorenter
    //   423: aload 7
    //   425: aload_1
    //   426: putfield 903	l8/n:c	Ljava/lang/String;
    //   429: aload 7
    //   431: getfield 380	l8/n:d	Ll8/n$a;
    //   434: invokevirtual 906	l8/n$a:a	()Ljava/util/Map;
    //   437: astore 13
    //   439: aload 7
    //   441: getfield 412	l8/n:f	Ll8/l;
    //   444: astore 25
    //   446: aload 25
    //   448: monitorenter
    //   449: new 115	java/util/ArrayList
    //   452: astore 14
    //   454: aload 14
    //   456: aload 25
    //   458: getfield 470	l8/l:a	Ljava/util/ArrayList;
    //   461: invokespecial 312	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   464: aload 14
    //   466: invokestatic 910	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   469: astore 14
    //   471: aload 25
    //   473: monitorexit
    //   474: aload 7
    //   476: getfield 912	l8/n:b	Lk8/i;
    //   479: getfield 915	k8/i:b	Lk8/b;
    //   482: astore 25
    //   484: new 917	l8/m
    //   487: astore 26
    //   489: aload 26
    //   491: aload 7
    //   493: aload_1
    //   494: aload 13
    //   496: aload 14
    //   498: invokespecial 920	l8/m:<init>	(Ll8/n;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    //   501: aload 25
    //   503: aload 26
    //   505: invokevirtual 925	k8/b:a	(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    //   508: pop
    //   509: aload_2
    //   510: monitorexit
    //   511: goto +14 -> 525
    //   514: astore_1
    //   515: aload 25
    //   517: monitorexit
    //   518: aload_1
    //   519: athrow
    //   520: astore_1
    //   521: aload_2
    //   522: monitorexit
    //   523: aload_1
    //   524: athrow
    //   525: aload_0
    //   526: getfield 94	j8/n:i	Ll8/f;
    //   529: aload_1
    //   530: invokevirtual 926	l8/f:a	(Ljava/lang/String;)V
    //   533: aload_0
    //   534: getfield 100	j8/n:l	Lj8/j;
    //   537: getfield 527	j8/j:b	Lj8/i;
    //   540: astore_2
    //   541: aload_2
    //   542: monitorenter
    //   543: aload_2
    //   544: getfield 532	j8/i:b	Ljava/lang/String;
    //   547: aload_1
    //   548: invokestatic 538	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   551: ifne +20 -> 571
    //   554: aload_2
    //   555: getfield 665	j8/i:a	Lp8/e;
    //   558: aload_1
    //   559: aload_2
    //   560: getfield 663	j8/i:c	Ljava/lang/String;
    //   563: invokestatic 929	j8/i:a	(Lp8/e;Ljava/lang/String;Ljava/lang/String;)V
    //   566: aload_2
    //   567: aload_1
    //   568: putfield 532	j8/i:b	Ljava/lang/String;
    //   571: aload_2
    //   572: monitorexit
    //   573: aload_0
    //   574: getfield 102	j8/n:m	Lj8/d0;
    //   577: astore_2
    //   578: aload_2
    //   579: getfield 932	j8/d0:a	Lj8/t;
    //   582: astore 7
    //   584: aload 7
    //   586: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   589: pop
    //   590: getstatic 935	m8/f0:a	Ljava/nio/charset/Charset;
    //   593: astore 13
    //   595: new 689	m8/b$a
    //   598: dup
    //   599: invokespecial 936	m8/b$a:<init>	()V
    //   602: astore 13
    //   604: aload 13
    //   606: ldc_w 763
    //   609: putfield 937	m8/b$a:a	Ljava/lang/String;
    //   612: aload 7
    //   614: getfield 941	j8/t:c	Lj8/a;
    //   617: getfield 942	j8/a:a	Ljava/lang/String;
    //   620: astore 14
    //   622: aload 14
    //   624: ifnull +952 -> 1576
    //   627: aload 13
    //   629: aload 14
    //   631: putfield 943	m8/b$a:b	Ljava/lang/String;
    //   634: aload 7
    //   636: getfield 945	j8/t:b	Lj8/a0;
    //   639: invokevirtual 778	j8/a0:c	()Lj8/b0$a;
    //   642: checkcast 780	j8/c
    //   645: getfield 781	j8/c:a	Ljava/lang/String;
    //   648: astore 14
    //   650: aload 14
    //   652: ifnull +913 -> 1565
    //   655: aload 13
    //   657: aload 14
    //   659: putfield 946	m8/b$a:d	Ljava/lang/String;
    //   662: aload 13
    //   664: aload 7
    //   666: getfield 945	j8/t:b	Lj8/a0;
    //   669: invokevirtual 778	j8/a0:c	()Lj8/b0$a;
    //   672: checkcast 780	j8/c
    //   675: getfield 947	j8/c:b	Ljava/lang/String;
    //   678: putfield 949	m8/b$a:e	Ljava/lang/String;
    //   681: aload 13
    //   683: aload 7
    //   685: getfield 945	j8/t:b	Lj8/a0;
    //   688: invokevirtual 778	j8/a0:c	()Lj8/b0$a;
    //   691: checkcast 780	j8/c
    //   694: getfield 950	j8/c:c	Ljava/lang/String;
    //   697: putfield 951	m8/b$a:f	Ljava/lang/String;
    //   700: aload 7
    //   702: getfield 941	j8/t:c	Lj8/a;
    //   705: astore 14
    //   707: aload 14
    //   709: getfield 774	j8/a:f	Ljava/lang/String;
    //   712: astore 25
    //   714: aload 25
    //   716: ifnull +838 -> 1554
    //   719: aload 13
    //   721: aload 25
    //   723: putfield 953	m8/b$a:h	Ljava/lang/String;
    //   726: aload 14
    //   728: getfield 775	j8/a:g	Ljava/lang/String;
    //   731: astore 26
    //   733: aload 26
    //   735: ifnull +808 -> 1543
    //   738: aload 13
    //   740: aload 26
    //   742: putfield 955	m8/b$a:i	Ljava/lang/String;
    //   745: aload 13
    //   747: iconst_4
    //   748: putfield 957	m8/b$a:c	I
    //   751: aload 13
    //   753: aload 13
    //   755: getfield 960	m8/b$a:m	B
    //   758: iconst_1
    //   759: ior
    //   760: i2b
    //   761: i2b
    //   762: putfield 960	m8/b$a:m	B
    //   765: new 706	m8/h$a
    //   768: dup
    //   769: invokespecial 961	m8/h$a:<init>	()V
    //   772: astore 14
    //   774: aload 14
    //   776: iconst_0
    //   777: putfield 963	m8/h$a:f	Z
    //   780: aload 14
    //   782: getfield 964	m8/h$a:m	B
    //   785: iconst_2
    //   786: ior
    //   787: i2b
    //   788: istore 12
    //   790: aload 14
    //   792: lload_3
    //   793: putfield 967	m8/h$a:d	J
    //   796: aload 14
    //   798: iload 12
    //   800: iconst_1
    //   801: ior
    //   802: i2b
    //   803: i2b
    //   804: putfield 964	m8/h$a:m	B
    //   807: aload_1
    //   808: ifnull +724 -> 1532
    //   811: aload 14
    //   813: aload_1
    //   814: putfield 968	m8/h$a:b	Ljava/lang/String;
    //   817: getstatic 969	j8/t:g	Ljava/lang/String;
    //   820: astore_1
    //   821: aload_1
    //   822: ifnull +699 -> 1521
    //   825: aload 14
    //   827: aload_1
    //   828: putfield 970	m8/h$a:a	Ljava/lang/String;
    //   831: aload 7
    //   833: getfield 945	j8/t:b	Lj8/a0;
    //   836: astore 27
    //   838: aload 27
    //   840: getfield 770	j8/a0:c	Ljava/lang/String;
    //   843: astore_1
    //   844: aload_1
    //   845: ifnull +665 -> 1510
    //   848: aload 25
    //   850: ifnull +649 -> 1499
    //   853: aload 27
    //   855: invokevirtual 778	j8/a0:c	()Lj8/b0$a;
    //   858: checkcast 780	j8/c
    //   861: getfield 781	j8/c:a	Ljava/lang/String;
    //   864: astore 27
    //   866: aload 7
    //   868: getfield 941	j8/t:c	Lj8/a;
    //   871: getfield 791	j8/a:h	Lg8/c;
    //   874: astore 28
    //   876: aload 28
    //   878: getfield 975	g8/c:b	Lg8/c$a;
    //   881: ifnonnull +17 -> 898
    //   884: aload 28
    //   886: new 977	g8/c$a
    //   889: dup
    //   890: aload 28
    //   892: invokespecial 980	g8/c$a:<init>	(Lg8/c;)V
    //   895: putfield 975	g8/c:b	Lg8/c$a;
    //   898: aload 28
    //   900: getfield 975	g8/c:b	Lg8/c$a;
    //   903: getfield 981	g8/c$a:a	Ljava/lang/String;
    //   906: astore 29
    //   908: aload 7
    //   910: getfield 941	j8/t:c	Lj8/a;
    //   913: getfield 791	j8/a:h	Lg8/c;
    //   916: astore 28
    //   918: aload 28
    //   920: getfield 975	g8/c:b	Lg8/c$a;
    //   923: ifnonnull +17 -> 940
    //   926: aload 28
    //   928: new 977	g8/c$a
    //   931: dup
    //   932: aload 28
    //   934: invokespecial 980	g8/c$a:<init>	(Lg8/c;)V
    //   937: putfield 975	g8/c:b	Lg8/c$a;
    //   940: aload 14
    //   942: new 983	m8/i
    //   945: dup
    //   946: aload_1
    //   947: aload 25
    //   949: aload 26
    //   951: aload 27
    //   953: aload 29
    //   955: aload 28
    //   957: getfield 975	g8/c:b	Lg8/c$a;
    //   960: getfield 984	g8/c$a:b	Ljava/lang/String;
    //   963: invokespecial 987	m8/i:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   966: putfield 990	m8/h$a:g	Lm8/f0$e$a;
    //   969: new 992	m8/z$a
    //   972: dup
    //   973: invokespecial 993	m8/z$a:<init>	()V
    //   976: astore_1
    //   977: aload_1
    //   978: iconst_3
    //   979: putfield 995	m8/z$a:a	I
    //   982: aload_1
    //   983: aload_1
    //   984: getfield 997	m8/z$a:e	B
    //   987: iconst_1
    //   988: ior
    //   989: i2b
    //   990: i2b
    //   991: putfield 997	m8/z$a:e	B
    //   994: aload_1
    //   995: aload 11
    //   997: putfield 998	m8/z$a:b	Ljava/lang/String;
    //   1000: aload_1
    //   1001: aload 8
    //   1003: putfield 999	m8/z$a:c	Ljava/lang/String;
    //   1006: aload_1
    //   1007: invokestatic 804	j8/g:h	()Z
    //   1010: putfield 1001	m8/z$a:d	Z
    //   1013: aload_1
    //   1014: aload_1
    //   1015: getfield 997	m8/z$a:e	B
    //   1018: iconst_2
    //   1019: ior
    //   1020: i2b
    //   1021: i2b
    //   1022: putfield 997	m8/z$a:e	B
    //   1025: aload 14
    //   1027: aload_1
    //   1028: invokevirtual 1004	m8/z$a:a	()Lm8/z;
    //   1031: putfield 1007	m8/h$a:i	Lm8/f0$e$e;
    //   1034: new 809	android/os/StatFs
    //   1037: dup
    //   1038: invokestatic 815	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   1041: invokevirtual 818	java/io/File:getPath	()Ljava/lang/String;
    //   1044: invokespecial 819	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   1047: astore_1
    //   1048: aload 9
    //   1050: invokestatic 840	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1053: istore 24
    //   1055: bipush 7
    //   1057: istore 12
    //   1059: iload 24
    //   1061: ifeq +6 -> 1067
    //   1064: goto +36 -> 1100
    //   1067: getstatic 1009	j8/t:f	Ljava/util/HashMap;
    //   1070: aload 9
    //   1072: aload 6
    //   1074: invokevirtual 846	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   1077: invokevirtual 854	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1080: checkcast 1011	java/lang/Integer
    //   1083: astore 6
    //   1085: aload 6
    //   1087: ifnonnull +6 -> 1093
    //   1090: goto +10 -> 1100
    //   1093: aload 6
    //   1095: invokevirtual 1014	java/lang/Integer:intValue	()I
    //   1098: istore 12
    //   1100: invokestatic 868	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   1103: invokevirtual 871	java/lang/Runtime:availableProcessors	()I
    //   1106: istore 20
    //   1108: aload 7
    //   1110: getfield 1015	j8/t:a	Landroid/content/Context;
    //   1113: invokestatic 874	j8/g:a	(Landroid/content/Context;)J
    //   1116: lstore_3
    //   1117: aload_1
    //   1118: invokevirtual 822	android/os/StatFs:getBlockCount	()I
    //   1121: i2l
    //   1122: lstore 22
    //   1124: aload_1
    //   1125: invokevirtual 825	android/os/StatFs:getBlockSize	()I
    //   1128: i2l
    //   1129: lstore 16
    //   1131: invokestatic 876	j8/g:g	()Z
    //   1134: istore 24
    //   1136: invokestatic 878	j8/g:c	()I
    //   1139: istore 21
    //   1141: new 1017	m8/k$a
    //   1144: dup
    //   1145: invokespecial 1018	m8/k$a:<init>	()V
    //   1148: astore_1
    //   1149: aload_1
    //   1150: iload 12
    //   1152: putfield 1019	m8/k$a:a	I
    //   1155: aload_1
    //   1156: getfield 1021	m8/k$a:j	B
    //   1159: iconst_1
    //   1160: ior
    //   1161: i2b
    //   1162: istore 12
    //   1164: aload_1
    //   1165: aload 5
    //   1167: putfield 1022	m8/k$a:b	Ljava/lang/String;
    //   1170: aload_1
    //   1171: iload 20
    //   1173: putfield 1023	m8/k$a:c	I
    //   1176: iload 12
    //   1178: iconst_2
    //   1179: ior
    //   1180: i2b
    //   1181: istore 12
    //   1183: aload_1
    //   1184: lload_3
    //   1185: putfield 1024	m8/k$a:d	J
    //   1188: iload 12
    //   1190: iconst_4
    //   1191: ior
    //   1192: i2b
    //   1193: istore 12
    //   1195: aload_1
    //   1196: lload 22
    //   1198: lload 16
    //   1200: lmul
    //   1201: putfield 1026	m8/k$a:e	J
    //   1204: iload 12
    //   1206: bipush 8
    //   1208: ior
    //   1209: i2b
    //   1210: istore 12
    //   1212: aload_1
    //   1213: iload 24
    //   1215: putfield 1027	m8/k$a:f	Z
    //   1218: iload 12
    //   1220: bipush 16
    //   1222: ior
    //   1223: i2b
    //   1224: istore 12
    //   1226: aload_1
    //   1227: iload 21
    //   1229: putfield 1029	m8/k$a:g	I
    //   1232: aload_1
    //   1233: iload 12
    //   1235: bipush 32
    //   1237: ior
    //   1238: i2b
    //   1239: i2b
    //   1240: putfield 1021	m8/k$a:j	B
    //   1243: aload_1
    //   1244: aload 10
    //   1246: putfield 1030	m8/k$a:h	Ljava/lang/String;
    //   1249: aload_1
    //   1250: aload 15
    //   1252: putfield 1031	m8/k$a:i	Ljava/lang/String;
    //   1255: aload 14
    //   1257: aload_1
    //   1258: invokevirtual 1034	m8/k$a:a	()Lm8/k;
    //   1261: putfield 1037	m8/h$a:j	Lm8/f0$e$c;
    //   1264: aload 14
    //   1266: iconst_3
    //   1267: putfield 1039	m8/h$a:l	I
    //   1270: aload 14
    //   1272: aload 14
    //   1274: getfield 964	m8/h$a:m	B
    //   1277: iconst_4
    //   1278: ior
    //   1279: i2b
    //   1280: i2b
    //   1281: putfield 964	m8/h$a:m	B
    //   1284: aload 13
    //   1286: aload 14
    //   1288: invokevirtual 710	m8/h$a:a	()Lm8/h;
    //   1291: putfield 712	m8/b$a:j	Lm8/f0$e;
    //   1294: aload 13
    //   1296: invokevirtual 715	m8/b$a:a	()Lm8/b;
    //   1299: astore 5
    //   1301: aload_2
    //   1302: getfield 292	j8/d0:b	Lp8/c;
    //   1305: astore 10
    //   1307: aload 10
    //   1309: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1312: pop
    //   1313: aload 5
    //   1315: getfield 699	m8/b:k	Lm8/f0$e;
    //   1318: astore_2
    //   1319: aload_2
    //   1320: ifnonnull +25 -> 1345
    //   1323: ldc -84
    //   1325: iconst_3
    //   1326: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1329: ifeq +169 -> 1498
    //   1332: ldc -84
    //   1334: ldc_w 1041
    //   1337: aconst_null
    //   1338: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1341: pop
    //   1342: goto +156 -> 1498
    //   1345: aload_2
    //   1346: invokevirtual 722	m8/f0$e:h	()Ljava/lang/String;
    //   1349: astore_1
    //   1350: getstatic 617	p8/c:g	Ln8/a;
    //   1353: invokevirtual 113	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1356: pop
    //   1357: getstatic 729	n8/a:a	La9/d;
    //   1360: aload 5
    //   1362: invokevirtual 734	a9/d:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   1365: astore 5
    //   1367: aload 10
    //   1369: getfield 298	p8/c:b	Lp8/e;
    //   1372: aload_1
    //   1373: ldc_w 679
    //   1376: invokevirtual 417	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   1379: aload 5
    //   1381: invokestatic 736	p8/c:e	(Ljava/io/File;Ljava/lang/String;)V
    //   1384: aload 10
    //   1386: getfield 298	p8/c:b	Lp8/e;
    //   1389: aload_1
    //   1390: ldc_w 1043
    //   1393: invokevirtual 417	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   1396: astore 5
    //   1398: aload_2
    //   1399: invokevirtual 1045	m8/f0$e:j	()J
    //   1402: lstore_3
    //   1403: new 1047	java/io/OutputStreamWriter
    //   1406: astore_2
    //   1407: new 1049	java/io/FileOutputStream
    //   1410: astore 10
    //   1412: aload 10
    //   1414: aload 5
    //   1416: invokespecial 1050	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   1419: aload_2
    //   1420: aload 10
    //   1422: getstatic 1052	p8/c:e	Ljava/nio/charset/Charset;
    //   1425: invokespecial 1055	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   1428: aload_2
    //   1429: ldc_w 1057
    //   1432: invokevirtual 1061	java/io/Writer:write	(Ljava/lang/String;)V
    //   1435: aload 5
    //   1437: lload_3
    //   1438: ldc2_w 544
    //   1441: lmul
    //   1442: invokevirtual 1065	java/io/File:setLastModified	(J)Z
    //   1445: pop
    //   1446: aload_2
    //   1447: invokevirtual 1066	java/io/OutputStreamWriter:close	()V
    //   1450: goto +48 -> 1498
    //   1453: astore 5
    //   1455: aload_2
    //   1456: invokevirtual 1066	java/io/OutputStreamWriter:close	()V
    //   1459: goto +10 -> 1469
    //   1462: astore_2
    //   1463: aload 5
    //   1465: aload_2
    //   1466: invokevirtual 652	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1469: aload 5
    //   1471: athrow
    //   1472: astore_2
    //   1473: ldc_w 1068
    //   1476: aload_1
    //   1477: invokestatic 499	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1480: astore_1
    //   1481: ldc -84
    //   1483: iconst_3
    //   1484: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1487: ifeq +11 -> 1498
    //   1490: ldc -84
    //   1492: aload_1
    //   1493: aload_2
    //   1494: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1497: pop
    //   1498: return
    //   1499: new 1070	java/lang/NullPointerException
    //   1502: dup
    //   1503: ldc_w 1072
    //   1506: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1509: athrow
    //   1510: new 1070	java/lang/NullPointerException
    //   1513: dup
    //   1514: ldc_w 1075
    //   1517: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1520: athrow
    //   1521: new 1070	java/lang/NullPointerException
    //   1524: dup
    //   1525: ldc_w 1077
    //   1528: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1531: athrow
    //   1532: new 1070	java/lang/NullPointerException
    //   1535: dup
    //   1536: ldc_w 1075
    //   1539: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1542: athrow
    //   1543: new 1070	java/lang/NullPointerException
    //   1546: dup
    //   1547: ldc_w 1079
    //   1550: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1553: athrow
    //   1554: new 1070	java/lang/NullPointerException
    //   1557: dup
    //   1558: ldc_w 1081
    //   1561: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1564: athrow
    //   1565: new 1070	java/lang/NullPointerException
    //   1568: dup
    //   1569: ldc_w 1083
    //   1572: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1575: athrow
    //   1576: new 1070	java/lang/NullPointerException
    //   1579: dup
    //   1580: ldc_w 1085
    //   1583: invokespecial 1073	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   1586: athrow
    //   1587: astore_1
    //   1588: aload_2
    //   1589: monitorexit
    //   1590: aload_1
    //   1591: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1592	0	this	n
    //   0	1592	1	paramString	String
    //   0	1592	2	paramBoolean	Boolean
    //   7	1431	3	l1	long
    //   15	1421	5	localObject1	Object
    //   1453	17	5	localObject2	Object
    //   38	1056	6	localObject3	Object
    //   58	1051	7	localObject4	Object
    //   64	938	8	localObject5	Object
    //   70	1001	9	localObject6	Object
    //   77	1344	10	localObject7	Object
    //   91	905	11	str1	String
    //   115	1123	12	i1	int
    //   148	1147	13	localObject8	Object
    //   174	1113	14	localObject9	Object
    //   180	1071	15	localObject10	Object
    //   203	996	16	l2	long
    //   211	146	18	l3	long
    //   300	872	20	i2	int
    //   313	915	21	i3	int
    //   320	877	22	l4	long
    //   325	889	24	bool	boolean
    //   370	578	25	localObject11	Object
    //   487	463	26	localObject12	Object
    //   836	116	27	localObject13	Object
    //   874	82	28	localc	g8.c
    //   906	48	29	str2	String
    // Exception table:
    //   from	to	target	type
    //   449	471	514	finally
    //   423	449	520	finally
    //   471	511	520	finally
    //   515	520	520	finally
    //   521	523	520	finally
    //   1428	1446	1453	finally
    //   1455	1459	1462	finally
    //   1350	1428	1472	java/io/IOException
    //   1446	1450	1472	java/io/IOException
    //   1463	1469	1472	java/io/IOException
    //   1469	1472	1472	java/io/IOException
    //   543	571	1587	finally
  }
  
  public final boolean d(h paramh)
  {
    i.a();
    v localv = n;
    int i1;
    if ((localv != null) && (e.get())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
      return false;
    }
    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
      Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
    }
    try
    {
      b(true, paramh, true);
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
      }
      return true;
    }
    catch (Exception paramh)
    {
      Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", paramh);
    }
    return false;
  }
  
  public final String e()
  {
    Object localObject = m.b;
    localObject.getClass();
    localObject = new TreeSet(p8.e.e(b.d.list())).descendingSet();
    if (!((Set)localObject).isEmpty()) {
      localObject = (String)((SortedSet)localObject).first();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  /* Error */
  public final void g(h arg1, Thread paramThread, Throwable paramThrowable, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 220	java/lang/StringBuilder
    //   5: astore 5
    //   7: aload 5
    //   9: invokespecial 438	java/lang/StringBuilder:<init>	()V
    //   12: aload 5
    //   14: ldc_w 1115
    //   17: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: aload 5
    //   23: aload_3
    //   24: invokevirtual 443	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload 5
    //   30: ldc_w 1117
    //   33: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: aload_2
    //   40: invokevirtual 1120	java/lang/Thread:getName	()Ljava/lang/String;
    //   43: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload 5
    //   49: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: astore 5
    //   54: ldc -84
    //   56: iconst_3
    //   57: invokestatic 190	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   60: ifeq +12 -> 72
    //   63: ldc -84
    //   65: aload 5
    //   67: aconst_null
    //   68: invokestatic 194	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   71: pop
    //   72: invokestatic 543	java/lang/System:currentTimeMillis	()J
    //   75: lstore 6
    //   77: aload_0
    //   78: getfield 104	j8/n:e	Lk8/i;
    //   81: getfield 1122	k8/i:a	Lk8/b;
    //   84: astore 5
    //   86: new 6	j8/n$a
    //   89: astore 8
    //   91: aload 8
    //   93: aload_0
    //   94: lload 6
    //   96: aload_3
    //   97: aload_2
    //   98: aload_1
    //   99: iload 4
    //   101: invokespecial 1125	j8/n$a:<init>	(Lj8/n;JLjava/lang/Throwable;Ljava/lang/Thread;Lr8/h;Z)V
    //   104: aload 5
    //   106: getfield 1128	k8/b:b	Ljava/lang/Object;
    //   109: astore_1
    //   110: aload_1
    //   111: monitorenter
    //   112: aload 5
    //   114: getfield 1131	k8/b:c	Lcom/google/android/gms/tasks/Task;
    //   117: astore 9
    //   119: aload 5
    //   121: getfield 1134	k8/b:a	Ljava/util/concurrent/ExecutorService;
    //   124: astore_2
    //   125: new 1136	aa/m0
    //   128: astore_3
    //   129: aload_3
    //   130: aload 8
    //   132: bipush 7
    //   134: invokespecial 1139	aa/m0:<init>	(Ljava/lang/Object;I)V
    //   137: aload 9
    //   139: aload_2
    //   140: aload_3
    //   141: invokevirtual 1145	com/google/android/gms/tasks/Task:continueWithTask	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;
    //   144: astore_2
    //   145: aload 5
    //   147: aload_2
    //   148: putfield 1131	k8/b:c	Lcom/google/android/gms/tasks/Task;
    //   151: aload_1
    //   152: monitorexit
    //   153: iload 4
    //   155: ifne +35 -> 190
    //   158: aload_2
    //   159: invokestatic 1150	j8/e0:a	(Lcom/google/android/gms/tasks/Task;)V
    //   162: goto +28 -> 190
    //   165: astore_1
    //   166: ldc -84
    //   168: ldc_w 1152
    //   171: aload_1
    //   172: invokestatic 1106	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   175: pop
    //   176: goto +14 -> 190
    //   179: astore_1
    //   180: ldc -84
    //   182: ldc_w 1154
    //   185: aconst_null
    //   186: invokestatic 1106	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   189: pop
    //   190: aload_0
    //   191: monitorexit
    //   192: return
    //   193: astore_2
    //   194: aload_1
    //   195: monitorexit
    //   196: aload_2
    //   197: athrow
    //   198: astore_1
    //   199: aload_0
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	n
    //   0	203	2	paramThread	Thread
    //   0	203	3	paramThrowable	Throwable
    //   0	203	4	paramBoolean	boolean
    //   5	141	5	localObject	Object
    //   75	20	6	l1	long
    //   89	42	8	locala	a
    //   117	21	9	localTask	Task
    // Exception table:
    //   from	to	target	type
    //   158	162	165	java/lang/Exception
    //   158	162	179	java/util/concurrent/TimeoutException
    //   112	153	193	finally
    //   194	196	193	finally
    //   2	72	198	finally
    //   72	112	198	finally
    //   158	162	198	finally
    //   166	176	198	finally
    //   180	190	198	finally
    //   196	198	198	finally
  }
  
  public final void h()
  {
    try
    {
      String str = f();
      if (str != null)
      {
        i("com.crashlytics.version-control-info", str);
        Log.i("FirebaseCrashlytics", "Saved version control info", null);
      }
    }
    catch (IOException localIOException)
    {
      Log.w("FirebaseCrashlytics", "Unable to save version control info", localIOException);
    }
  }
  
  public final void i(String paramString1, String paramString2)
  {
    try
    {
      d.e.b(paramString1, paramString2);
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString2 = a;
      if (paramString2 != null)
      {
        int i1;
        if ((getApplicationInfoflags & 0x2) != 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          throw paramString1;
        }
      }
      Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
    }
  }
  
  public final void j(final Task<r8.c> paramTask)
  {
    ??? = m.b;
    boolean bool = p8.e.e(b.e.listFiles()).isEmpty();
    int i1 = 0;
    if ((!bool) || (!p8.e.e(b.f.listFiles()).isEmpty()) || (!p8.e.e(b.g.listFiles()).isEmpty())) {
      i1 = 1;
    }
    if (i1 == 0)
    {
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
      }
      p.trySetResult(Boolean.FALSE);
      return;
    }
    z localz = z.e;
    localz.q("Crash reports are available to be sent.");
    Object localObject2;
    if (b.b())
    {
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
      }
      p.trySetResult(Boolean.FALSE);
      ??? = Tasks.forResult(Boolean.TRUE);
    }
    else
    {
      localz.h("Automatic data collection is disabled.");
      localz.q("Notifying that unsent reports are available.");
      p.trySetResult(Boolean.TRUE);
      localObject2 = b;
    }
    synchronized (c)
    {
      localObject2 = d.getTask();
      ??? = ((Task)localObject2).onSuccessTask(new i6.e());
      localz.h("Waiting for send/deleteUnsentReports to be called.");
      ??? = k8.a.a((Task)???, q.getTask());
      ((Task)???).onSuccessTask(e.a, new b(paramTask));
      return;
    }
  }
  
  public final class a
    implements Callable<Task<Void>>
  {
    public final Object call()
    {
      long l = a / 1000L;
      Object localObject1 = f.e();
      if (localObject1 == null)
      {
        Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
      }
      else
      {
        f.c.d();
        Object localObject2 = f.m;
        Object localObject3 = b;
        Object localObject4 = c;
        localObject2.getClass();
        Object localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append("Persisting fatal event for session ");
        ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = ((StringBuilder)localObject5).toString();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
          Log.v("FirebaseCrashlytics", (String)localObject5, null);
        }
        ((d0)localObject2).e((Throwable)localObject3, (Thread)localObject4, "crash", new l8.c((String)localObject1, l, t.a), true);
        localObject2 = f;
        l = a;
        localObject2.getClass();
        try
        {
          localObject2 = g;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append(".ae");
          ((StringBuilder)localObject3).append(l);
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject2.getClass();
          localObject4 = new java/io/File;
          ((File)localObject4).<init>(c, (String)localObject3);
          if (!((File)localObject4).createNewFile())
          {
            localObject2 = new java/io/IOException;
            ((IOException)localObject2).<init>("Create new file failed.");
            throw ((Throwable)localObject2);
          }
        }
        catch (IOException localIOException)
        {
          Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", localIOException);
          f.b(false, d, false);
          f.c(fa, Boolean.valueOf(e));
          if (f.b.b()) {
            break label318;
          }
        }
      }
      return Tasks.forResult(null);
      label318:
      localObject1 = ((TaskCompletionSource)d).i.get()).getTask().onSuccessTask(f.e.a, new m(this, (String)localObject1));
      return localObject1;
    }
  }
  
  public final class b
    implements SuccessContinuation<Boolean, Void>
  {
    public final Task then(Object paramObject)
    {
      paramObject = (Boolean)paramObject;
      if (!((Boolean)paramObject).booleanValue())
      {
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
          Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        p8.e locale = b.g;
        paramObject = n.t;
        paramObject = p8.e.e(c.listFiles((FilenameFilter)paramObject)).iterator();
        while (((Iterator)paramObject).hasNext()) {
          ((File)((Iterator)paramObject).next()).delete();
        }
        paramObject = b.m.b;
        p8.c.a(p8.e.e(b.e.listFiles()));
        p8.c.a(p8.e.e(b.f.listFiles()));
        p8.c.a(p8.e.e(b.g.listFiles()));
        b.r.trySetResult(null);
        paramObject = Tasks.forResult(null);
      }
      else
      {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
          Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean bool = ((Boolean)paramObject).booleanValue();
        paramObject = b.b;
        if (!bool) {
          break label235;
        }
        h.trySetResult(null);
        paramObject = paramTask.onSuccessTask(b.e.a, new o(this));
      }
      return (Task)paramObject;
      label235:
      paramObject.getClass();
      throw new IllegalStateException("An invalid data collection token was used.");
    }
  }
}

/* Location:
 * Qualified Name:     j8.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */