package y2;

import androidx.work.impl.WorkDatabase;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o2.j;
import o2.o.b;
import p2.k0;
import p2.o;
import p2.q0;
import p2.r;
import x2.b;

public abstract class e
  implements Runnable
{
  public final o a = new o();
  
  public static void a(k0 paramk0, String paramString)
  {
    Object localObject1 = c;
    ??? = ((WorkDatabase)localObject1).u();
    Object localObject3 = ((WorkDatabase)localObject1).p();
    Object localObject4 = new LinkedList();
    ((LinkedList)localObject4).add(paramString);
    Object localObject5;
    while (!((AbstractCollection)localObject4).isEmpty())
    {
      localObject1 = (String)((LinkedList)localObject4).remove();
      localObject5 = ((x2.t)???).s((String)localObject1);
      if ((localObject5 != o.b.c) && (localObject5 != o.b.d)) {
        ((x2.t)???).w((String)localObject1);
      }
      ((LinkedList)localObject4).addAll(((b)localObject3).a((String)localObject1));
    }
    localObject1 = f;
    synchronized (k)
    {
      localObject4 = j.d();
      localObject5 = r.l;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Processor cancelling ");
      ((StringBuilder)localObject3).append(paramString);
      ((j)localObject4).a((String)localObject5, ((StringBuilder)localObject3).toString());
      i.add(paramString);
      localObject1 = ((r)localObject1).b(paramString);
      r.d(paramString, (q0)localObject1, 1);
      paramk0 = e.iterator();
      while (paramk0.hasNext()) {
        ((p2.t)paramk0.next()).c(paramString);
      }
      return;
    }
  }
  
  public abstract void b();
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 156	y2/e:b	()V
    //   4: aload_0
    //   5: getfield 17	y2/e:a	Lp2/o;
    //   8: getstatic 161	o2/m:a	Lo2/m$a$c;
    //   11: invokevirtual 164	p2/o:a	(Lo2/m$a;)V
    //   14: goto +19 -> 33
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 17	y2/e:a	Lp2/o;
    //   22: new 166	o2/m$a$a
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 169	o2/m$a$a:<init>	(Ljava/lang/Throwable;)V
    //   30: invokevirtual 164	p2/o:a	(Lo2/m$a;)V
    //   33: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	e
    //   17	10	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	14	17	finally
  }
}

/* Location:
 * Qualified Name:     y2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */