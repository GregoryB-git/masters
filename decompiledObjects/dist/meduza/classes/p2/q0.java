package p2;

import android.content.Context;
import androidx.work.WorkerParameters.a;
import androidx.work.d;
import androidx.work.d.a;
import androidx.work.d.a.a;
import androidx.work.d.a.b;
import androidx.work.d.a.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o2.o.b;
import x2.q;
import x2.s;
import x2.t;
import y2.o;

public final class q0
  implements Runnable
{
  public static final String z = o2.j.f("WorkerWrapper");
  public Context a;
  public final String b;
  public s c;
  public d d;
  public a3.b e;
  public d.a f = new d.a.a();
  public androidx.work.a o;
  public m0 p;
  public w2.a q;
  public WorkDatabase r;
  public t s;
  public x2.b t;
  public List<String> u;
  public String v;
  public z2.c<Boolean> w = new z2.c();
  public final z2.c<d.a> x = new z2.c();
  public volatile int y = 65280;
  
  public q0(a parama)
  {
    a = a;
    e = c;
    q = b;
    Object localObject = f;
    c = ((s)localObject);
    b = a;
    localObject = h;
    d = null;
    localObject = d;
    o = ((androidx.work.a)localObject);
    p = c;
    localObject = e;
    r = ((WorkDatabase)localObject);
    s = ((WorkDatabase)localObject).u();
    t = r.p();
    u = g;
  }
  
  public final void a(d.a parama)
  {
    Object localObject1;
    Object localObject2;
    if ((parama instanceof d.a.c))
    {
      localObject1 = o2.j.d();
      localObject2 = z;
      parama = f.l("Worker result SUCCESS for ");
      parama.append(v);
      ((o2.j)localObject1).e((String)localObject2, parama.toString());
      if (!c.c())
      {
        r.c();
        try
        {
          s.e(o.b.c, b);
          parama = f).a;
          s.l(b, parama);
          p.getClass();
          long l = System.currentTimeMillis();
          parama = t.a(b).iterator();
          while (parama.hasNext())
          {
            localObject1 = (String)parama.next();
            if ((s.s((String)localObject1) == o.b.e) && (t.c((String)localObject1)))
            {
              o2.j localj = o2.j.d();
              localObject2 = z;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append("Setting status to enqueued for ");
              localStringBuilder.append((String)localObject1);
              localj.e((String)localObject2, localStringBuilder.toString());
              s.e(o.b.a, (String)localObject1);
              s.m((String)localObject1, l);
            }
          }
          r.n();
        }
        finally
        {
          r.j();
          f(false);
        }
      }
    }
    else
    {
      if ((parama instanceof d.a.b))
      {
        parama = o2.j.d();
        localObject2 = z;
        localObject1 = f.l("Worker result RETRY for ");
        ((StringBuilder)localObject1).append(v);
        parama.e((String)localObject2, ((StringBuilder)localObject1).toString());
        d();
        return;
      }
      parama = o2.j.d();
      localObject1 = z;
      localObject2 = f.l("Worker result FAILURE for ");
      ((StringBuilder)localObject2).append(v);
      parama.e((String)localObject1, ((StringBuilder)localObject2).toString());
      if (!c.c()) {
        break label387;
      }
    }
    e();
    return;
    label387:
    h();
  }
  
  public final void b(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString);
    while (!localLinkedList.isEmpty())
    {
      paramString = (String)localLinkedList.remove();
      if (s.s(paramString) != o.b.f) {
        s.e(o.b.d, paramString);
      }
      localLinkedList.addAll(t.a(paramString));
    }
  }
  
  public final void c()
  {
    if (!i())
    {
      r.c();
      try
      {
        o.b localb = s.s(b);
        r.t().a(b);
        if (localb == null)
        {
          f(false);
        }
        else if (localb == o.b.b)
        {
          a(f);
        }
        else if (!localb.f())
        {
          y = 65024;
          d();
        }
        r.n();
      }
      finally
      {
        r.j();
      }
    }
  }
  
  public final void d()
  {
    r.c();
    try
    {
      s.e(o.b.a, b);
      Object localObject1 = s;
      Object localObject2 = b;
      p.getClass();
      ((t)localObject1).m((String)localObject2, System.currentTimeMillis());
      localObject2 = s;
      localObject1 = b;
      ((t)localObject2).j(c.v, (String)localObject1);
      s.f(b, -1L);
      r.n();
      return;
    }
    finally
    {
      r.j();
      f(true);
    }
  }
  
  public final void e()
  {
    r.c();
    try
    {
      Object localObject1 = s;
      Object localObject2 = b;
      p.getClass();
      ((t)localObject1).m((String)localObject2, System.currentTimeMillis());
      s.e(o.b.a, b);
      s.u(b);
      localObject2 = s;
      localObject1 = b;
      ((t)localObject2).j(c.v, (String)localObject1);
      s.d(b);
      s.f(b, -1L);
      r.n();
      return;
    }
    finally
    {
      r.j();
      f(false);
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    r.c();
    try
    {
      if (!r.u().p()) {
        o.a(a, RescheduleReceiver.class, false);
      }
      if (paramBoolean)
      {
        s.e(o.b.a, b);
        t localt = s;
        String str = b;
        localt.o(y, str);
        s.f(b, -1L);
      }
      r.n();
      r.j();
      w.i(Boolean.valueOf(paramBoolean));
      return;
    }
    finally
    {
      r.j();
    }
  }
  
  public final void g()
  {
    Object localObject1 = s.s(b);
    Object localObject2;
    Object localObject3;
    boolean bool;
    if (localObject1 == o.b.b)
    {
      localObject1 = o2.j.d();
      localObject2 = z;
      localObject3 = f.l("Status for ");
      ((StringBuilder)localObject3).append(b);
      ((StringBuilder)localObject3).append(" is RUNNING; not doing any work and rescheduling for later execution");
      ((o2.j)localObject1).a((String)localObject2, ((StringBuilder)localObject3).toString());
      bool = true;
    }
    else
    {
      localObject2 = o2.j.d();
      localObject3 = z;
      StringBuilder localStringBuilder = f.l("Status for ");
      localStringBuilder.append(b);
      localStringBuilder.append(" is ");
      localStringBuilder.append(localObject1);
      localStringBuilder.append(" ; not doing any work");
      ((o2.j)localObject2).a((String)localObject3, localStringBuilder.toString());
      bool = false;
    }
    f(bool);
  }
  
  public final void h()
  {
    r.c();
    try
    {
      b(b);
      androidx.work.c localc = f).a;
      t localt = s;
      String str = b;
      localt.j(c.v, str);
      s.l(b, localc);
      r.n();
      return;
    }
    finally
    {
      r.j();
      f(false);
    }
  }
  
  public final boolean i()
  {
    if (y != 65280)
    {
      o2.j localj = o2.j.d();
      Object localObject = z;
      StringBuilder localStringBuilder = f.l("Work interrupted for ");
      localStringBuilder.append(v);
      localj.a((String)localObject, localStringBuilder.toString());
      localObject = s.s(b);
      if (localObject == null) {
        f(false);
      } else {
        f(((o.b)localObject).f() ^ true);
      }
      return true;
    }
    return false;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 132	p2/q0:u	Ljava/util/List;
    //   4: astore_1
    //   5: new 149	java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 349
    //   12: invokespecial 351	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: astore_2
    //   16: aload_2
    //   17: aload_0
    //   18: getfield 95	p2/q0:b	Ljava/lang/String;
    //   21: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_2
    //   26: ldc_w 353
    //   29: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_1
    //   34: invokeinterface 203 1 0
    //   39: astore_1
    //   40: iconst_1
    //   41: istore_3
    //   42: aload_1
    //   43: invokeinterface 208 1 0
    //   48: istore 4
    //   50: iconst_0
    //   51: istore 5
    //   53: iload 4
    //   55: ifeq +41 -> 96
    //   58: aload_1
    //   59: invokeinterface 212 1 0
    //   64: checkcast 214	java/lang/String
    //   67: astore 6
    //   69: iload_3
    //   70: ifeq +8 -> 78
    //   73: iconst_0
    //   74: istore_3
    //   75: goto +11 -> 86
    //   78: aload_2
    //   79: ldc_w 355
    //   82: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_2
    //   87: aload 6
    //   89: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: goto -51 -> 42
    //   96: aload_2
    //   97: ldc_w 357
    //   100: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_0
    //   105: aload_2
    //   106: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: putfield 147	p2/q0:v	Ljava/lang/String;
    //   112: getstatic 227	o2/o$b:a	Lo2/o$b;
    //   115: astore_1
    //   116: aload_0
    //   117: invokevirtual 279	p2/q0:i	()Z
    //   120: ifeq +6 -> 126
    //   123: goto +907 -> 1030
    //   126: aload_0
    //   127: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   130: invokevirtual 166	p1/j:c	()V
    //   133: aload_0
    //   134: getfield 89	p2/q0:c	Lx2/s;
    //   137: astore_2
    //   138: aload_2
    //   139: getfield 358	x2/s:b	Lo2/o$b;
    //   142: aload_1
    //   143: if_acmpeq +67 -> 210
    //   146: aload_0
    //   147: invokevirtual 360	p2/q0:g	()V
    //   150: aload_0
    //   151: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   154: invokevirtual 234	p1/j:n	()V
    //   157: invokestatic 138	o2/j:d	()Lo2/j;
    //   160: astore_2
    //   161: getstatic 55	p2/q0:z	Ljava/lang/String;
    //   164: astore_1
    //   165: new 149	java/lang/StringBuilder
    //   168: astore 6
    //   170: aload 6
    //   172: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   175: aload 6
    //   177: aload_0
    //   178: getfield 89	p2/q0:c	Lx2/s;
    //   181: getfield 362	x2/s:c	Ljava/lang/String;
    //   184: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload 6
    //   190: ldc_w 364
    //   193: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload_2
    //   198: aload_1
    //   199: aload 6
    //   201: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokevirtual 332	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   207: goto +104 -> 311
    //   210: aload_2
    //   211: invokevirtual 162	x2/s:c	()Z
    //   214: ifne +34 -> 248
    //   217: aload_0
    //   218: getfield 89	p2/q0:c	Lx2/s;
    //   221: astore_2
    //   222: aload_2
    //   223: getfield 358	x2/s:b	Lo2/o$b;
    //   226: aload_1
    //   227: if_acmpne +15 -> 242
    //   230: aload_2
    //   231: getfield 367	x2/s:k	I
    //   234: ifle +8 -> 242
    //   237: iconst_1
    //   238: istore_3
    //   239: goto +5 -> 244
    //   242: iconst_0
    //   243: istore_3
    //   244: iload_3
    //   245: ifeq +76 -> 321
    //   248: aload_0
    //   249: getfield 111	p2/q0:p	Lp2/m0;
    //   252: invokevirtual 186	java/lang/Object:getClass	()Ljava/lang/Class;
    //   255: pop
    //   256: invokestatic 192	java/lang/System:currentTimeMillis	()J
    //   259: aload_0
    //   260: getfield 89	p2/q0:c	Lx2/s;
    //   263: invokevirtual 369	x2/s:a	()J
    //   266: lcmp
    //   267: ifge +54 -> 321
    //   270: invokestatic 138	o2/j:d	()Lo2/j;
    //   273: getstatic 55	p2/q0:z	Ljava/lang/String;
    //   276: ldc_w 371
    //   279: iconst_1
    //   280: anewarray 4	java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: aload_0
    //   286: getfield 89	p2/q0:c	Lx2/s;
    //   289: getfield 362	x2/s:c	Ljava/lang/String;
    //   292: aastore
    //   293: invokestatic 375	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   296: invokevirtual 332	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   299: aload_0
    //   300: iconst_1
    //   301: invokevirtual 240	p2/q0:f	(Z)V
    //   304: aload_0
    //   305: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   308: invokevirtual 234	p1/j:n	()V
    //   311: aload_0
    //   312: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   315: invokevirtual 237	p1/j:j	()V
    //   318: goto +712 -> 1030
    //   321: aload_0
    //   322: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   325: invokevirtual 234	p1/j:n	()V
    //   328: aload_0
    //   329: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   332: invokevirtual 237	p1/j:j	()V
    //   335: aload_0
    //   336: getfield 89	p2/q0:c	Lx2/s;
    //   339: invokevirtual 162	x2/s:c	()Z
    //   342: ifeq +14 -> 356
    //   345: aload_0
    //   346: getfield 89	p2/q0:c	Lx2/s;
    //   349: getfield 377	x2/s:e	Landroidx/work/c;
    //   352: astore_2
    //   353: goto +207 -> 560
    //   356: aload_0
    //   357: getfield 105	p2/q0:o	Landroidx/work/a;
    //   360: getfield 380	androidx/work/a:e	Lo2/k;
    //   363: astore_2
    //   364: aload_0
    //   365: getfield 89	p2/q0:c	Lx2/s;
    //   368: getfield 382	x2/s:d	Ljava/lang/String;
    //   371: astore 6
    //   373: aload_2
    //   374: invokevirtual 186	java/lang/Object:getClass	()Ljava/lang/Class;
    //   377: pop
    //   378: aload 6
    //   380: ldc_w 384
    //   383: invokestatic 389	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   386: getstatic 392	o2/g:a	Ljava/lang/String;
    //   389: astore_2
    //   390: aload 6
    //   392: invokestatic 398	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   395: iconst_0
    //   396: anewarray 394	java/lang/Class
    //   399: invokevirtual 402	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   402: iconst_0
    //   403: anewarray 4	java/lang/Object
    //   406: invokevirtual 408	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   409: astore_2
    //   410: aload_2
    //   411: ldc_w 410
    //   414: invokestatic 412	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   417: aload_2
    //   418: checkcast 414	o2/f
    //   421: astore_2
    //   422: goto +55 -> 477
    //   425: astore 7
    //   427: invokestatic 138	o2/j:d	()Lo2/j;
    //   430: astore_2
    //   431: getstatic 392	o2/g:a	Ljava/lang/String;
    //   434: astore 8
    //   436: new 149	java/lang/StringBuilder
    //   439: dup
    //   440: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   443: astore 9
    //   445: aload 9
    //   447: ldc_w 416
    //   450: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload 9
    //   456: aload 6
    //   458: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: pop
    //   462: aload_2
    //   463: aload 8
    //   465: aload 9
    //   467: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: aload 7
    //   472: invokevirtual 419	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   475: aconst_null
    //   476: astore_2
    //   477: aload_2
    //   478: ifnonnull +31 -> 509
    //   481: invokestatic 138	o2/j:d	()Lo2/j;
    //   484: astore_2
    //   485: getstatic 55	p2/q0:z	Ljava/lang/String;
    //   488: astore_1
    //   489: ldc_w 421
    //   492: invokestatic 145	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: astore 6
    //   497: aload_0
    //   498: getfield 89	p2/q0:c	Lx2/s;
    //   501: getfield 382	x2/s:d	Ljava/lang/String;
    //   504: astore 7
    //   506: goto +260 -> 766
    //   509: new 423	java/util/ArrayList
    //   512: dup
    //   513: invokespecial 424	java/util/ArrayList:<init>	()V
    //   516: astore 6
    //   518: aload 6
    //   520: aload_0
    //   521: getfield 89	p2/q0:c	Lx2/s;
    //   524: getfield 377	x2/s:e	Landroidx/work/c;
    //   527: invokevirtual 425	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   530: pop
    //   531: aload 6
    //   533: aload_0
    //   534: getfield 122	p2/q0:s	Lx2/t;
    //   537: aload_0
    //   538: getfield 95	p2/q0:b	Ljava/lang/String;
    //   541: invokeinterface 427 2 0
    //   546: invokevirtual 428	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   549: pop
    //   550: aload_2
    //   551: aload 6
    //   553: invokevirtual 431	o2/f:a	(Ljava/util/ArrayList;)Landroidx/work/c;
    //   556: astore_2
    //   557: goto -204 -> 353
    //   560: aload_0
    //   561: getfield 95	p2/q0:b	Ljava/lang/String;
    //   564: invokestatic 437	java/util/UUID:fromString	(Ljava/lang/String;)Ljava/util/UUID;
    //   567: astore 7
    //   569: aload_0
    //   570: getfield 132	p2/q0:u	Ljava/util/List;
    //   573: astore 6
    //   575: aload_0
    //   576: getfield 89	p2/q0:c	Lx2/s;
    //   579: getfield 367	x2/s:k	I
    //   582: istore_3
    //   583: aload_0
    //   584: getfield 105	p2/q0:o	Landroidx/work/a;
    //   587: astore 10
    //   589: aload 10
    //   591: getfield 440	androidx/work/a:a	Ljava/util/concurrent/ExecutorService;
    //   594: astore 8
    //   596: aload_0
    //   597: getfield 81	p2/q0:e	La3/b;
    //   600: astore 9
    //   602: aload 10
    //   604: getfield 443	androidx/work/a:d	Lo2/r;
    //   607: astore 11
    //   609: new 445	y2/a0
    //   612: astore 10
    //   614: new 447	androidx/work/WorkerParameters
    //   617: dup
    //   618: aload 7
    //   620: aload_2
    //   621: aload 6
    //   623: aload 8
    //   625: aload 9
    //   627: aload 11
    //   629: new 449	y2/z
    //   632: dup
    //   633: aload_0
    //   634: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   637: aload_0
    //   638: getfield 85	p2/q0:q	Lw2/a;
    //   641: aload_0
    //   642: getfield 81	p2/q0:e	La3/b;
    //   645: invokespecial 452	y2/z:<init>	(Landroidx/work/impl/WorkDatabase;Lw2/a;La3/b;)V
    //   648: invokespecial 455	androidx/work/WorkerParameters:<init>	(Ljava/util/UUID;Landroidx/work/c;Ljava/util/List;Ljava/util/concurrent/ExecutorService;La3/b;Lo2/r;Ly2/z;)V
    //   651: astore_2
    //   652: aload_0
    //   653: getfield 101	p2/q0:d	Landroidx/work/d;
    //   656: ifnonnull +29 -> 685
    //   659: aload_0
    //   660: aload_0
    //   661: getfield 105	p2/q0:o	Landroidx/work/a;
    //   664: getfield 443	androidx/work/a:d	Lo2/r;
    //   667: aload_0
    //   668: getfield 77	p2/q0:a	Landroid/content/Context;
    //   671: aload_0
    //   672: getfield 89	p2/q0:c	Lx2/s;
    //   675: getfield 362	x2/s:c	Ljava/lang/String;
    //   678: aload_2
    //   679: invokevirtual 460	o2/s:a	(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/d;
    //   682: putfield 101	p2/q0:d	Landroidx/work/d;
    //   685: aload_0
    //   686: getfield 101	p2/q0:d	Landroidx/work/d;
    //   689: astore 6
    //   691: aload 6
    //   693: ifnonnull +31 -> 724
    //   696: invokestatic 138	o2/j:d	()Lo2/j;
    //   699: astore_2
    //   700: getstatic 55	p2/q0:z	Ljava/lang/String;
    //   703: astore_1
    //   704: ldc_w 462
    //   707: invokestatic 145	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   710: astore 6
    //   712: aload_0
    //   713: getfield 89	p2/q0:c	Lx2/s;
    //   716: getfield 362	x2/s:c	Ljava/lang/String;
    //   719: astore 7
    //   721: goto +45 -> 766
    //   724: aload 6
    //   726: getfield 467	androidx/work/d:d	Z
    //   729: ifeq +62 -> 791
    //   732: invokestatic 138	o2/j:d	()Lo2/j;
    //   735: astore_2
    //   736: getstatic 55	p2/q0:z	Ljava/lang/String;
    //   739: astore_1
    //   740: ldc_w 469
    //   743: invokestatic 145	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   746: astore 6
    //   748: aload 6
    //   750: aload_0
    //   751: getfield 89	p2/q0:c	Lx2/s;
    //   754: getfield 362	x2/s:c	Ljava/lang/String;
    //   757: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: ldc_w 471
    //   764: astore 7
    //   766: aload 6
    //   768: aload 7
    //   770: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: pop
    //   774: aload_2
    //   775: aload_1
    //   776: aload 6
    //   778: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   781: invokevirtual 473	o2/j:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   784: aload_0
    //   785: invokevirtual 252	p2/q0:h	()V
    //   788: goto +242 -> 1030
    //   791: aload 6
    //   793: iconst_1
    //   794: putfield 467	androidx/work/d:d	Z
    //   797: aload_0
    //   798: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   801: invokevirtual 166	p1/j:c	()V
    //   804: iload 5
    //   806: istore_3
    //   807: aload_0
    //   808: getfield 122	p2/q0:s	Lx2/t;
    //   811: aload_0
    //   812: getfield 95	p2/q0:b	Ljava/lang/String;
    //   815: invokeinterface 217 2 0
    //   820: aload_1
    //   821: if_acmpne +52 -> 873
    //   824: aload_0
    //   825: getfield 122	p2/q0:s	Lx2/t;
    //   828: getstatic 288	o2/o$b:b	Lo2/o$b;
    //   831: aload_0
    //   832: getfield 95	p2/q0:b	Ljava/lang/String;
    //   835: invokeinterface 176 3 0
    //   840: pop
    //   841: aload_0
    //   842: getfield 122	p2/q0:s	Lx2/t;
    //   845: aload_0
    //   846: getfield 95	p2/q0:b	Ljava/lang/String;
    //   849: invokeinterface 475 2 0
    //   854: pop
    //   855: aload_0
    //   856: getfield 122	p2/q0:s	Lx2/t;
    //   859: sipush 65280
    //   862: aload_0
    //   863: getfield 95	p2/q0:b	Ljava/lang/String;
    //   866: invokeinterface 318 3 0
    //   871: iconst_1
    //   872: istore_3
    //   873: aload_0
    //   874: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   877: invokevirtual 234	p1/j:n	()V
    //   880: aload_0
    //   881: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   884: invokevirtual 237	p1/j:j	()V
    //   887: iload_3
    //   888: ifeq +138 -> 1026
    //   891: aload_0
    //   892: invokevirtual 279	p2/q0:i	()Z
    //   895: ifeq +6 -> 901
    //   898: goto +132 -> 1030
    //   901: new 477	y2/x
    //   904: dup
    //   905: aload_0
    //   906: getfield 77	p2/q0:a	Landroid/content/Context;
    //   909: aload_0
    //   910: getfield 89	p2/q0:c	Lx2/s;
    //   913: aload_0
    //   914: getfield 101	p2/q0:d	Landroidx/work/d;
    //   917: aload_2
    //   918: getfield 480	androidx/work/WorkerParameters:f	Lo2/e;
    //   921: aload_0
    //   922: getfield 81	p2/q0:e	La3/b;
    //   925: invokespecial 483	y2/x:<init>	(Landroid/content/Context;Lx2/s;Landroidx/work/d;Lo2/e;La3/b;)V
    //   928: astore_2
    //   929: aload_0
    //   930: getfield 81	p2/q0:e	La3/b;
    //   933: invokeinterface 488 1 0
    //   938: aload_2
    //   939: invokevirtual 494	a3/c$a:execute	(Ljava/lang/Runnable;)V
    //   942: aload_2
    //   943: getfield 496	y2/x:a	Lz2/c;
    //   946: astore_2
    //   947: aload_0
    //   948: getfield 72	p2/q0:x	Lz2/c;
    //   951: new 498	x0/f
    //   954: dup
    //   955: iconst_1
    //   956: aload_0
    //   957: aload_2
    //   958: invokespecial 501	x0/f:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   961: new 503	y2/u
    //   964: dup
    //   965: invokespecial 504	y2/u:<init>	()V
    //   968: invokevirtual 509	z2/a:f	(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   971: aload_2
    //   972: new 511	p2/o0
    //   975: dup
    //   976: aload_0
    //   977: aload_2
    //   978: invokespecial 514	p2/o0:<init>	(Lp2/q0;Lz2/c;)V
    //   981: aload_0
    //   982: getfield 81	p2/q0:e	La3/b;
    //   985: invokeinterface 488 1 0
    //   990: invokevirtual 509	z2/a:f	(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   993: aload_0
    //   994: getfield 147	p2/q0:v	Ljava/lang/String;
    //   997: astore_2
    //   998: aload_0
    //   999: getfield 72	p2/q0:x	Lz2/c;
    //   1002: new 516	p2/p0
    //   1005: dup
    //   1006: aload_0
    //   1007: aload_2
    //   1008: invokespecial 519	p2/p0:<init>	(Lp2/q0;Ljava/lang/String;)V
    //   1011: aload_0
    //   1012: getfield 81	p2/q0:e	La3/b;
    //   1015: invokeinterface 522 1 0
    //   1020: invokevirtual 509	z2/a:f	(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   1023: goto +7 -> 1030
    //   1026: aload_0
    //   1027: invokevirtual 360	p2/q0:g	()V
    //   1030: return
    //   1031: astore_2
    //   1032: aload_0
    //   1033: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   1036: invokevirtual 237	p1/j:j	()V
    //   1039: aload_2
    //   1040: athrow
    //   1041: astore_2
    //   1042: aload_0
    //   1043: getfield 115	p2/q0:r	Landroidx/work/impl/WorkDatabase;
    //   1046: invokevirtual 237	p1/j:j	()V
    //   1049: aload_2
    //   1050: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1051	0	this	q0
    //   4	817	1	localObject1	Object
    //   15	993	2	localObject2	Object
    //   1031	9	2	localObject3	Object
    //   1041	9	2	localObject4	Object
    //   41	847	3	i	int
    //   48	6	4	bool	boolean
    //   51	754	5	j	int
    //   67	725	6	localObject5	Object
    //   425	46	7	localException	Exception
    //   504	265	7	localObject6	Object
    //   434	190	8	localObject7	Object
    //   443	183	9	localObject8	Object
    //   587	26	10	localObject9	Object
    //   607	21	11	localr	o2.r
    // Exception table:
    //   from	to	target	type
    //   390	422	425	java/lang/Exception
    //   807	871	1031	finally
    //   873	880	1031	finally
    //   133	207	1041	finally
    //   210	237	1041	finally
    //   248	311	1041	finally
    //   321	328	1041	finally
  }
  
  public static final class a
  {
    public Context a;
    public w2.a b;
    public a3.b c;
    public androidx.work.a d;
    public WorkDatabase e;
    public s f;
    public final List<String> g;
    public WorkerParameters.a h = new WorkerParameters.a();
    
    public a(Context paramContext, androidx.work.a parama, a3.b paramb, w2.a parama1, WorkDatabase paramWorkDatabase, s params, ArrayList paramArrayList)
    {
      a = paramContext.getApplicationContext();
      c = paramb;
      b = parama1;
      d = parama;
      e = paramWorkDatabase;
      f = params;
      g = paramArrayList;
    }
  }
}

/* Location:
 * Qualified Name:     p2.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */