package Q3;

import V3.g;
import V3.k;
import V3.p;
import V3.q;
import android.text.TextUtils;
import i4.a;

public class h
{
  public final s3.e a;
  public final p b;
  public final g c;
  public a d;
  public V3.m e;
  
  public h(s3.e parame, p paramp, g paramg)
  {
    a = parame;
    b = paramp;
    c = paramg;
  }
  
  public static h d(s3.e parame)
  {
    String str = parame.r().d();
    Object localObject = str;
    if (str == null) {
      if (parame.r().g() != null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("https://");
        ((StringBuilder)localObject).append(parame.r().g());
        ((StringBuilder)localObject).append("-default-rtdb.firebaseio.com");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        throw new d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
      }
    }
    return e(parame, (String)localObject);
  }
  
  public static h e(s3.e parame, String paramString)
  {
    label133:
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        A2.n.j(parame, "Provided FirebaseApp must not be null.");
        localObject = (i)parame.k(i.class);
        A2.n.j(localObject, "Firebase Database component is not present.");
        parame = Y3.m.h(paramString);
        if (b.isEmpty())
        {
          parame = ((i)localObject).a(a);
          return parame;
        }
      }
    }
    finally
    {
      break label133;
      Object localObject = new Q3/d;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Specified Database URL '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ");
      localStringBuilder.append(b.toString());
      ((d)localObject).<init>(localStringBuilder.toString());
      throw ((Throwable)localObject);
      parame = new Q3/d;
      parame.<init>("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
      throw parame;
    }
  }
  
  public static String g()
  {
    return "20.3.0";
  }
  
  public final void b(String paramString)
  {
    if (e == null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Calls to ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("() must be made before any other usage of FirebaseDatabase instance.");
    throw new d(localStringBuilder.toString());
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	Q3/h:e	LV3/m;
    //   6: ifnonnull +37 -> 43
    //   9: aload_0
    //   10: getfield 25	Q3/h:b	LV3/p;
    //   13: aload_0
    //   14: getfield 128	Q3/h:d	Li4/a;
    //   17: invokevirtual 133	V3/p:a	(Li4/a;)V
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 27	Q3/h:c	LV3/g;
    //   25: aload_0
    //   26: getfield 25	Q3/h:b	LV3/p;
    //   29: aload_0
    //   30: invokestatic 138	V3/q:b	(LV3/f;LV3/p;LQ3/h;)LV3/m;
    //   33: putfield 31	Q3/h:e	LV3/m;
    //   36: goto +7 -> 43
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	h
    //   39	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	36	39	finally
  }
  
  public e f(String paramString)
  {
    c();
    if (paramString != null)
    {
      Y3.n.i(paramString);
      paramString = new k(paramString);
      return new e(e, paramString);
    }
    throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
  }
  
  public void h()
  {
    c();
    q.c(e);
  }
  
  public void i()
  {
    c();
    q.d(e);
  }
  
  public void j()
  {
    c();
    e.i0(new a());
  }
  
  public void k(l paraml)
  {
    try
    {
      b("setLogLevel");
      c.L(paraml);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public void l(long paramLong)
  {
    try
    {
      b("setPersistenceCacheSizeBytes");
      c.M(paramLong);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void m(boolean paramBoolean)
  {
    try
    {
      b("setPersistenceEnabled");
      c.N(paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void n(String paramString, int paramInt)
  {
    if (e == null)
    {
      d = new a(paramString, paramInt);
      return;
    }
    throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      h.a(h.this).a0();
    }
  }
}

/* Location:
 * Qualified Name:     Q3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */