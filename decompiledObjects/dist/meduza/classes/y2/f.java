package y2;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.c.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import ec.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o2.o.b;
import o2.q;
import p2.k0;
import p2.o;
import p2.y;
import x2.b;
import x2.m;
import x2.n;
import x2.s;
import x2.s.b;
import x2.t;
import x2.x;

public final class f
  implements Runnable
{
  public static final String c = o2.j.f("EnqueueRunnable");
  public final y a;
  public final o b;
  
  public f(y paramy)
  {
    a = paramy;
    b = localo;
  }
  
  public static boolean a(y paramy)
  {
    Object localObject1 = h;
    if (localObject1 != null)
    {
      localObject2 = ((List)localObject1).iterator();
      bool1 = false;
      for (;;)
      {
        bool2 = bool1;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject3 = (y)((Iterator)localObject2).next();
        if (!i)
        {
          bool1 |= a((y)localObject3);
        }
        else
        {
          localObject1 = o2.j.d();
          localObject4 = c;
          localObject5 = f.l("Already enqueued work ids (");
          ((StringBuilder)localObject5).append(TextUtils.join(", ", f));
          ((StringBuilder)localObject5).append(")");
          ((o2.j)localObject1).g((String)localObject4, ((StringBuilder)localObject5).toString());
        }
      }
    }
    boolean bool2 = false;
    localObject1 = y.w(paramy);
    Object localObject4 = b;
    Object localObject6 = e;
    localObject1 = (String[])((Set)localObject1).toArray(new String[0]);
    String str1 = c;
    int i = d;
    o.b localb1 = o.b.a;
    Object localObject7 = o.b.c;
    Object localObject3 = o.b.f;
    Object localObject2 = o.b.d;
    b.c.getClass();
    long l1 = System.currentTimeMillis();
    Object localObject8 = c;
    boolean bool3;
    if ((localObject1 != null) && (localObject1.length > 0)) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    int m;
    if (bool3)
    {
      j = localObject1.length;
      bool4 = true;
      bool5 = false;
      bool6 = false;
      m = 0;
      for (;;)
      {
        bool7 = bool4;
        bool8 = bool5;
        bool1 = bool6;
        if (m >= j) {
          break;
        }
        localObject5 = localObject1[m];
        localObject9 = ((WorkDatabase)localObject8).u().t((String)localObject5);
        if (localObject9 == null)
        {
          localObject1 = o2.j.d();
          localObject3 = c;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Prerequisite ");
          ((StringBuilder)localObject2).append((String)localObject5);
          ((StringBuilder)localObject2).append(" doesn't exist; not enqueuing");
          ((o2.j)localObject1).b((String)localObject3, ((StringBuilder)localObject2).toString());
          break label534;
        }
        localObject5 = b;
        if (localObject5 == localObject7) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        bool4 &= bool1;
        if (localObject5 == localObject2)
        {
          bool1 = true;
        }
        else
        {
          bool1 = bool6;
          if (localObject5 == localObject3)
          {
            bool5 = true;
            bool1 = bool6;
          }
        }
        m++;
        bool6 = bool1;
      }
    }
    boolean bool7 = true;
    boolean bool8 = false;
    boolean bool1 = false;
    boolean bool6 = TextUtils.isEmpty(str1) ^ true;
    if ((bool6) && (!bool3)) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    label534:
    Object localObject10;
    Object localObject11;
    Object localObject12;
    if (bool5)
    {
      localObject5 = ((WorkDatabase)localObject8).u().g(str1);
      if (!((List)localObject5).isEmpty())
      {
        if ((i != 3) && (i != 4))
        {
          if (i == 2)
          {
            localObject9 = ((List)localObject5).iterator();
            do
            {
              if (!((Iterator)localObject9).hasNext()) {
                break;
              }
              localObject7 = nextb;
            } while ((localObject7 != localb1) && (localObject7 != o.b.b));
            bool1 = false;
            break label1660;
          }
          new d((k0)localObject4, str1).run();
          localObject9 = ((WorkDatabase)localObject8).u();
          localObject5 = ((List)localObject5).iterator();
          while (((Iterator)localObject5).hasNext()) {
            ((t)localObject9).a(nexta);
          }
          bool5 = true;
          bool4 = bool6;
          localObject5 = localObject1;
          bool6 = bool5;
          bool5 = bool1;
          break label968;
        }
        localObject10 = ((WorkDatabase)localObject8).p();
        localObject9 = new ArrayList();
        localObject5 = ((List)localObject5).iterator();
        bool3 = bool6;
        while (((Iterator)localObject5).hasNext())
        {
          localObject11 = (s.b)((Iterator)localObject5).next();
          bool4 = bool7;
          bool5 = bool8;
          bool6 = bool1;
          if (!((b)localObject10).d(a))
          {
            localObject12 = b;
            if (localObject12 == localObject7) {
              bool6 = true;
            } else {
              bool6 = false;
            }
            bool4 = bool7 & bool6;
            if (localObject12 == localObject2)
            {
              bool7 = true;
            }
            else
            {
              bool7 = bool1;
              if (localObject12 == localObject3)
              {
                bool8 = true;
                bool7 = bool1;
              }
            }
            ((ArrayList)localObject9).add(a);
            bool6 = bool7;
            bool5 = bool8;
          }
          bool7 = bool4;
          bool8 = bool5;
          bool1 = bool6;
        }
        bool4 = bool3;
        localObject5 = localObject9;
        bool5 = bool8;
        bool6 = bool1;
        if (i == 4) {
          if (!bool8)
          {
            localObject5 = localObject9;
            bool5 = bool8;
            bool6 = bool1;
            if (!bool1) {}
          }
          else
          {
            localObject5 = ((WorkDatabase)localObject8).u();
            localObject9 = ((t)localObject5).g(str1).iterator();
            while (((Iterator)localObject9).hasNext()) {
              ((t)localObject5).a(nexta);
            }
            localObject5 = Collections.emptyList();
            bool5 = false;
            bool6 = false;
          }
        }
        localObject1 = (String[])((List)localObject5).toArray((Object[])localObject1);
        if (localObject1.length > 0)
        {
          bool3 = true;
          bool1 = bool4;
          bool8 = bool5;
          break label951;
        }
        bool3 = false;
        bool1 = bool4;
        bool8 = bool5;
        break label951;
      }
    }
    boolean bool5 = bool6;
    bool6 = bool1;
    bool1 = bool5;
    label951:
    int j = 0;
    bool5 = bool6;
    boolean bool4 = bool1;
    bool6 = j;
    Object localObject5 = localObject1;
    label968:
    Object localObject9 = ((List)localObject6).iterator();
    localObject1 = localObject8;
    bool1 = bool6;
    localObject8 = localObject9;
    while (((Iterator)localObject8).hasNext())
    {
      localObject6 = (q)((Iterator)localObject8).next();
      localObject9 = b;
      if ((bool3) && (!bool7))
      {
        if (bool5) {
          b = ((o.b)localObject2);
        } else if (bool8) {
          b = ((o.b)localObject3);
        } else {
          b = o.b.e;
        }
      }
      else {
        n = l1;
      }
      if (b == localb1) {
        bool1 = true;
      }
      localObject7 = ((WorkDatabase)localObject1).u();
      i.e(e, "schedulers");
      if (Build.VERSION.SDK_INT < 26) {
        bool6 = true;
      } else {
        bool6 = false;
      }
      int k;
      if (bool6)
      {
        localObject12 = j;
        localObject10 = c;
        if ((!i.a(localObject10, ConstraintTrackingWorker.class.getName())) && ((d) || (e)))
        {
          localObject12 = new c.a();
          ((c.a)localObject12).a(e.a);
          ((c.a)localObject12).b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", (String)localObject10);
          androidx.work.c localc = new androidx.work.c(a);
          androidx.work.c.e(localc);
          String str2 = ConstraintTrackingWorker.class.getName();
          String str3 = a;
          o.b localb2 = b;
          localObject10 = d;
          localObject11 = f;
          long l2 = g;
          long l3 = h;
          long l4 = i;
          localObject12 = j;
          int n = k;
          int i1 = l;
          long l5 = m;
          long l6 = n;
          long l7 = o;
          long l8 = p;
          boolean bool9 = q;
          i = r;
          int i2 = s;
          m = t;
          long l9 = u;
          k = v;
          j = w;
          i.e(str3, "id");
          i.e(localb2, "state");
          i.e(localObject10, "inputMergerClassName");
          i.e(localObject11, "output");
          i.e(localObject12, "constraints");
          a0.j.p(i1, "backoffPolicy");
          a0.j.p(i, "outOfQuotaPolicy");
          localObject9 = new s(str3, localb2, str2, (String)localObject10, localc, (androidx.work.c)localObject11, l2, l3, l4, (o2.c)localObject12, n, i1, l5, l6, l7, l8, bool9, i, i2, m, l9, k, j);
        }
      }
      ((t)localObject7).b((s)localObject9);
      if (bool3)
      {
        j = localObject5.length;
        for (k = 0; k < j; k++)
        {
          localObject7 = localObject5[k];
          localObject9 = a.toString();
          i.d(localObject9, "id.toString()");
          localObject9 = new x2.a((String)localObject9, (String)localObject7);
          ((WorkDatabase)localObject1).p().b((x2.a)localObject9);
        }
      }
      localObject7 = ((WorkDatabase)localObject1).v();
      localObject9 = a.toString();
      i.d(localObject9, "id.toString()");
      ((x)localObject7).b((String)localObject9, c);
      if (bool4)
      {
        localObject9 = ((WorkDatabase)localObject1).s();
        localObject6 = a.toString();
        i.d(localObject6, "id.toString()");
        ((n)localObject9).a(new m(str1, (String)localObject6));
      }
    }
    label1660:
    paramy.i = true;
    return bool2 | bool1;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	y2/f:a	Lp2/y;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual 151	java/lang/Object:getClass	()Ljava/lang/Class;
    //   9: pop
    //   10: new 410	java/util/HashSet
    //   13: astore_2
    //   14: aload_2
    //   15: invokespecial 411	java/util/HashSet:<init>	()V
    //   18: aload_1
    //   19: aload_2
    //   20: invokestatic 414	p2/y:v	(Lp2/y;Ljava/util/HashSet;)Z
    //   23: ifne +112 -> 135
    //   26: aload_0
    //   27: getfield 34	y2/f:a	Lp2/y;
    //   30: getfield 109	p2/y:b	Lp2/k0;
    //   33: astore_2
    //   34: aload_2
    //   35: getfield 160	p2/k0:c	Landroidx/work/impl/WorkDatabase;
    //   38: astore_1
    //   39: aload_1
    //   40: invokevirtual 418	p1/j:c	()V
    //   43: aload_1
    //   44: aload_2
    //   45: getfield 142	p2/k0:b	Landroidx/work/a;
    //   48: aload_0
    //   49: getfield 34	y2/f:a	Lp2/y;
    //   52: invokestatic 423	y2/g:a	(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Lp2/y;)V
    //   55: aload_0
    //   56: getfield 34	y2/f:a	Lp2/y;
    //   59: invokestatic 65	y2/f:a	(Lp2/y;)Z
    //   62: istore_3
    //   63: aload_1
    //   64: invokevirtual 425	p1/j:n	()V
    //   67: aload_1
    //   68: invokevirtual 427	p1/j:j	()V
    //   71: iload_3
    //   72: ifeq +43 -> 115
    //   75: aload_0
    //   76: getfield 34	y2/f:a	Lp2/y;
    //   79: getfield 109	p2/y:b	Lp2/k0;
    //   82: getfield 430	p2/k0:a	Landroid/content/Context;
    //   85: ldc_w 432
    //   88: iconst_1
    //   89: invokestatic 437	y2/o:a	(Landroid/content/Context;Ljava/lang/Class;Z)V
    //   92: aload_0
    //   93: getfield 34	y2/f:a	Lp2/y;
    //   96: getfield 109	p2/y:b	Lp2/k0;
    //   99: astore_1
    //   100: aload_1
    //   101: getfield 142	p2/k0:b	Landroidx/work/a;
    //   104: aload_1
    //   105: getfield 160	p2/k0:c	Landroidx/work/impl/WorkDatabase;
    //   108: aload_1
    //   109: getfield 246	p2/k0:e	Ljava/util/List;
    //   112: invokestatic 442	p2/w:b	(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    //   115: aload_0
    //   116: getfield 36	y2/f:b	Lp2/o;
    //   119: getstatic 447	o2/m:a	Lo2/m$a$c;
    //   122: invokevirtual 450	p2/o:a	(Lo2/m$a;)V
    //   125: goto +72 -> 197
    //   128: astore_2
    //   129: aload_1
    //   130: invokevirtual 427	p1/j:j	()V
    //   133: aload_2
    //   134: athrow
    //   135: new 452	java/lang/IllegalStateException
    //   138: astore_1
    //   139: new 89	java/lang/StringBuilder
    //   142: astore_2
    //   143: aload_2
    //   144: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   147: aload_2
    //   148: ldc_w 454
    //   151: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_2
    //   156: aload_0
    //   157: getfield 34	y2/f:a	Lp2/y;
    //   160: invokevirtual 457	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload_2
    //   165: ldc 94
    //   167: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload_1
    //   172: aload_2
    //   173: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokespecial 459	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   179: aload_1
    //   180: athrow
    //   181: astore_1
    //   182: aload_0
    //   183: getfield 36	y2/f:b	Lp2/o;
    //   186: new 461	o2/m$a$a
    //   189: dup
    //   190: aload_1
    //   191: invokespecial 464	o2/m$a$a:<init>	(Ljava/lang/Throwable;)V
    //   194: invokevirtual 450	p2/o:a	(Lo2/m$a;)V
    //   197: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	f
    //   4	176	1	localObject1	Object
    //   181	10	1	localThrowable	Throwable
    //   13	32	2	localObject2	Object
    //   128	6	2	localObject3	Object
    //   142	31	2	localStringBuilder	StringBuilder
    //   62	10	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   43	67	128	finally
    //   0	43	181	finally
    //   67	71	181	finally
    //   75	115	181	finally
    //   115	125	181	finally
    //   129	135	181	finally
    //   135	181	181	finally
  }
}

/* Location:
 * Qualified Name:     y2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */