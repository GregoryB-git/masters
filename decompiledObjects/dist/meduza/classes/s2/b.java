package s2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import b.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import o2.o.b;
import x2.l;

public final class b
  implements p2.t
{
  public static final String f = o2.j.f("SystemJobScheduler");
  public final Context a;
  public final JobScheduler b;
  public final a c;
  public final WorkDatabase d;
  public final androidx.work.a e;
  
  public b(Context paramContext, WorkDatabase paramWorkDatabase, androidx.work.a parama)
  {
    a = paramContext;
    b = localJobScheduler;
    c = locala;
    d = paramWorkDatabase;
    e = parama;
  }
  
  /* Error */
  public static void a(JobScheduler paramJobScheduler, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 69	android/app/job/JobScheduler:cancel	(I)V
    //   5: goto +33 -> 38
    //   8: astore_0
    //   9: invokestatic 72	o2/j:d	()Lo2/j;
    //   12: getstatic 29	s2/b:f	Ljava/lang/String;
    //   15: invokestatic 78	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   18: ldc 80
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: iload_1
    //   27: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aastore
    //   31: invokestatic 92	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   34: aload_0
    //   35: invokevirtual 95	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   38: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramJobScheduler	JobScheduler
    //   0	39	1	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  public static ArrayList d(Context paramContext, JobScheduler paramJobScheduler, String paramString)
  {
    paramJobScheduler = f(paramContext, paramJobScheduler);
    if (paramJobScheduler == null) {
      return null;
    }
    paramContext = new ArrayList(2);
    paramJobScheduler = paramJobScheduler.iterator();
    while (paramJobScheduler.hasNext())
    {
      JobInfo localJobInfo = (JobInfo)paramJobScheduler.next();
      l locall = g(localJobInfo);
      if ((locall != null) && (paramString.equals(a))) {
        paramContext.add(Integer.valueOf(localJobInfo.getId()));
      }
    }
    return paramContext;
  }
  
  /* Error */
  public static ArrayList f(Context paramContext, JobScheduler paramJobScheduler)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 142	android/app/job/JobScheduler:getAllPendingJobs	()Ljava/util/List;
    //   4: astore_1
    //   5: goto +18 -> 23
    //   8: astore_1
    //   9: invokestatic 72	o2/j:d	()Lo2/j;
    //   12: getstatic 29	s2/b:f	Ljava/lang/String;
    //   15: ldc -112
    //   17: aload_1
    //   18: invokevirtual 95	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: aload_1
    //   24: ifnonnull +5 -> 29
    //   27: aconst_null
    //   28: areturn
    //   29: new 101	java/util/ArrayList
    //   32: dup
    //   33: aload_1
    //   34: invokeinterface 149 1 0
    //   39: invokespecial 103	java/util/ArrayList:<init>	(I)V
    //   42: astore_2
    //   43: new 151	android/content/ComponentName
    //   46: dup
    //   47: aload_0
    //   48: ldc -103
    //   50: invokespecial 156	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   53: astore_0
    //   54: aload_1
    //   55: invokeinterface 157 1 0
    //   60: astore_1
    //   61: aload_1
    //   62: invokeinterface 113 1 0
    //   67: ifeq +33 -> 100
    //   70: aload_1
    //   71: invokeinterface 117 1 0
    //   76: checkcast 119	android/app/job/JobInfo
    //   79: astore_3
    //   80: aload_0
    //   81: aload_3
    //   82: invokevirtual 161	android/app/job/JobInfo:getService	()Landroid/content/ComponentName;
    //   85: invokevirtual 162	android/content/ComponentName:equals	(Ljava/lang/Object;)Z
    //   88: ifeq -27 -> 61
    //   91: aload_2
    //   92: aload_3
    //   93: invokevirtual 138	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   96: pop
    //   97: goto -36 -> 61
    //   100: aload_2
    //   101: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramContext	Context
    //   0	102	1	paramJobScheduler	JobScheduler
    //   42	59	2	localArrayList	ArrayList
    //   79	14	3	localJobInfo	JobInfo
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  public static l g(JobInfo paramJobInfo)
  {
    paramJobInfo = paramJobInfo.getExtras();
    if (paramJobInfo != null) {}
    try
    {
      if (paramJobInfo.containsKey("EXTRA_WORK_SPEC_ID"))
      {
        int i = paramJobInfo.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
        paramJobInfo = new l(paramJobInfo.getString("EXTRA_WORK_SPEC_ID"), i);
        return paramJobInfo;
      }
    }
    catch (NullPointerException paramJobInfo)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final void c(String paramString)
  {
    Object localObject = d(a, b, paramString);
    if ((localObject != null) && (!((ArrayList)localObject).isEmpty()))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        int i = ((Integer)((Iterator)localObject).next()).intValue();
        a(b, i);
      }
      d.r().e(paramString);
    }
  }
  
  public final void e(x2.s... paramVarArgs)
  {
    g.s locals = new g.s(d);
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramVarArgs[j];
      d.c();
      try
      {
        Object localObject2 = d.u().t(a);
        Object localObject3;
        Object localObject4;
        if (localObject2 == null)
        {
          localObject2 = o2.j.d();
          localObject3 = f;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("Skipping scheduling ");
          ((StringBuilder)localObject4).append(a);
          ((StringBuilder)localObject4).append(" because it's no longer in the DB");
          ((o2.j)localObject2).g((String)localObject3, ((StringBuilder)localObject4).toString());
          d.n();
        }
        else
        {
          if (b != o.b.a)
          {
            localObject3 = o2.j.d();
            localObject2 = f;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append("Skipping scheduling ");
            ((StringBuilder)localObject4).append(a);
            ((StringBuilder)localObject4).append(" because it is no longer enqueued");
            ((o2.j)localObject3).g((String)localObject2, ((StringBuilder)localObject4).toString());
          }
          for (localObject1 = d;; localObject1 = d)
          {
            ((p1.j)localObject1).n();
            break;
            localObject2 = a0.s((x2.s)localObject1);
            localObject3 = d.r().c((l)localObject2);
            int k;
            if (localObject3 != null)
            {
              k = c;
            }
            else
            {
              e.getClass();
              k = e.h;
              localObject4 = (WorkDatabase)b;
              y2.i locali = new y2/i;
              locali.<init>(locals, k);
              localObject4 = ((p1.j)localObject4).m(locali);
              ec.i.d(localObject4, "workDatabase.runInTransa…            id\n        })");
              k = ((Number)localObject4).intValue();
            }
            if (localObject3 == null)
            {
              localObject3 = new x2/i;
              ((x2.i)localObject3).<init>(a, b, k);
              d.r().d((x2.i)localObject3);
            }
            h((x2.s)localObject1, k);
            if (Build.VERSION.SDK_INT == 23)
            {
              localObject2 = d(a, b, a);
              if (localObject2 != null)
              {
                k = ((ArrayList)localObject2).indexOf(Integer.valueOf(k));
                if (k >= 0) {
                  ((ArrayList)localObject2).remove(k);
                }
                if (!((ArrayList)localObject2).isEmpty())
                {
                  k = ((Integer)((ArrayList)localObject2).get(0)).intValue();
                }
                else
                {
                  e.getClass();
                  k = e.h;
                  localObject3 = (WorkDatabase)b;
                  localObject2 = new y2/i;
                  ((y2.i)localObject2).<init>(locals, k);
                  localObject2 = ((p1.j)localObject3).m((Callable)localObject2);
                  ec.i.d(localObject2, "workDatabase.runInTransa…            id\n        })");
                  k = ((Number)localObject2).intValue();
                }
                h((x2.s)localObject1, k);
              }
            }
          }
        }
        d.j();
        j++;
      }
      finally
      {
        d.j();
      }
    }
  }
  
  /* Error */
  public final void h(x2.s params, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 60	s2/b:c	Ls2/a;
    //   4: aload_1
    //   5: iload_2
    //   6: invokevirtual 340	s2/a:a	(Lx2/s;I)Landroid/app/job/JobInfo;
    //   9: astore_3
    //   10: invokestatic 72	o2/j:d	()Lo2/j;
    //   13: astore 4
    //   15: getstatic 29	s2/b:f	Ljava/lang/String;
    //   18: astore 5
    //   20: ldc_w 342
    //   23: invokestatic 346	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: astore 6
    //   28: aload 6
    //   30: aload_1
    //   31: getfield 226	x2/s:a	Ljava/lang/String;
    //   34: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload 6
    //   40: ldc_w 348
    //   43: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload 6
    //   49: iload_2
    //   50: invokevirtual 351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload 4
    //   56: aload 5
    //   58: aload 6
    //   60: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokevirtual 353	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_0
    //   67: getfield 58	s2/b:b	Landroid/app/job/JobScheduler;
    //   70: aload_3
    //   71: invokevirtual 357	android/app/job/JobScheduler:schedule	(Landroid/app/job/JobInfo;)I
    //   74: ifne +151 -> 225
    //   77: invokestatic 72	o2/j:d	()Lo2/j;
    //   80: astore 6
    //   82: new 234	java/lang/StringBuilder
    //   85: astore_3
    //   86: aload_3
    //   87: invokespecial 235	java/lang/StringBuilder:<init>	()V
    //   90: aload_3
    //   91: ldc_w 359
    //   94: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_3
    //   99: aload_1
    //   100: getfield 226	x2/s:a	Ljava/lang/String;
    //   103: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 6
    //   109: aload 5
    //   111: aload_3
    //   112: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokevirtual 250	o2/j:g	(Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload_1
    //   119: getfield 363	x2/s:q	Z
    //   122: ifeq +103 -> 225
    //   125: aload_1
    //   126: getfield 365	x2/s:r	I
    //   129: iconst_1
    //   130: if_icmpne +95 -> 225
    //   133: aload_1
    //   134: iconst_0
    //   135: putfield 363	x2/s:q	Z
    //   138: ldc_w 367
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_1
    //   148: getfield 226	x2/s:a	Ljava/lang/String;
    //   151: aastore
    //   152: invokestatic 370	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   155: astore 6
    //   157: invokestatic 72	o2/j:d	()Lo2/j;
    //   160: aload 5
    //   162: aload 6
    //   164: invokevirtual 353	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: aload_0
    //   168: aload_1
    //   169: iload_2
    //   170: invokevirtual 316	s2/b:h	(Lx2/s;I)V
    //   173: goto +52 -> 225
    //   176: astore 6
    //   178: invokestatic 72	o2/j:d	()Lo2/j;
    //   181: astore_3
    //   182: getstatic 29	s2/b:f	Ljava/lang/String;
    //   185: astore 5
    //   187: new 234	java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial 235	java/lang/StringBuilder:<init>	()V
    //   194: astore 4
    //   196: aload 4
    //   198: ldc_w 372
    //   201: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload 4
    //   207: aload_1
    //   208: invokevirtual 375	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload_3
    //   213: aload 5
    //   215: aload 4
    //   217: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: aload 6
    //   222: invokevirtual 95	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   225: return
    //   226: astore_1
    //   227: aload_0
    //   228: getfield 56	s2/b:a	Landroid/content/Context;
    //   231: aload_0
    //   232: getfield 58	s2/b:b	Landroid/app/job/JobScheduler;
    //   235: invokestatic 99	s2/b:f	(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    //   238: astore 5
    //   240: aload 5
    //   242: ifnull +12 -> 254
    //   245: aload 5
    //   247: invokevirtual 376	java/util/ArrayList:size	()I
    //   250: istore_2
    //   251: goto +5 -> 256
    //   254: iconst_0
    //   255: istore_2
    //   256: invokestatic 78	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   259: ldc_w 378
    //   262: iconst_3
    //   263: anewarray 4	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: iload_2
    //   269: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: aastore
    //   273: dup
    //   274: iconst_1
    //   275: aload_0
    //   276: getfield 62	s2/b:d	Landroidx/work/impl/WorkDatabase;
    //   279: invokevirtual 223	androidx/work/impl/WorkDatabase:u	()Lx2/t;
    //   282: invokeinterface 382 1 0
    //   287: invokeinterface 149 1 0
    //   292: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: aastore
    //   296: dup
    //   297: iconst_2
    //   298: aload_0
    //   299: getfield 64	s2/b:e	Landroidx/work/a;
    //   302: getfield 384	androidx/work/a:j	I
    //   305: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   308: aastore
    //   309: invokestatic 92	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   312: astore 5
    //   314: invokestatic 72	o2/j:d	()Lo2/j;
    //   317: getstatic 29	s2/b:f	Ljava/lang/String;
    //   320: aload 5
    //   322: invokevirtual 386	o2/j:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: new 337	java/lang/IllegalStateException
    //   328: dup
    //   329: aload 5
    //   331: aload_1
    //   332: invokespecial 389	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   335: astore_1
    //   336: aload_0
    //   337: getfield 64	s2/b:e	Landroidx/work/a;
    //   340: invokevirtual 280	java/lang/Object:getClass	()Ljava/lang/Class;
    //   343: pop
    //   344: aload_1
    //   345: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	b
    //   0	346	1	params	x2.s
    //   0	346	2	paramInt	int
    //   9	204	3	localObject1	Object
    //   13	203	4	localObject2	Object
    //   18	312	5	localObject3	Object
    //   26	137	6	localObject4	Object
    //   176	45	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   66	173	176	finally
    //   66	173	226	java/lang/IllegalStateException
  }
}

/* Location:
 * Qualified Name:     s2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */