package ea;

import android.content.Context;
import android.util.Log;
import dc.l;
import dc.q;
import ec.j;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import nc.d0;
import nc.e0;
import p2.m0;
import r0.d;
import r0.d.a;

public final class w
  implements v
{
  public static final c e = new c();
  public static final q0.c f = m0.Y(u.a, new p0.a(b.a), 12);
  public final Context a;
  public final ub.h b;
  public final AtomicReference<p> c;
  public final f d;
  
  public w(Context paramContext, ub.h paramh)
  {
    a = paramContext;
    b = paramh;
    c = new AtomicReference();
    e.getClass();
    d = new f(new qc.i(f.a(paramContext, c.a[0]).getData(), new e(null)), this);
    x6.b.g0(e0.a(paramh), null, new a(this, null), 3);
  }
  
  public final String a()
  {
    Object localObject = (p)c.get();
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final void b(final String paramString)
  {
    ec.i.e(paramString, "sessionId");
    x6.b.g0(e0.a(b), null, new g(this, paramString, null), 3);
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$1", f="SessionDatastore.kt", l={82}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements dc.p<d0, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public a(w paramw, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(b, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = a;
      if (i != 0)
      {
        if (i == 1) {
          rb.f.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        rb.f.b(paramObject);
        Object localObject = b;
        paramObject = d;
        localObject = new a((w)localObject);
        a = 1;
        if (((w.f)paramObject).collect((qc.f)localObject, this) == locala) {
          return locala;
        }
      }
      return rb.h.a;
    }
    
    public static final class a<T>
      implements qc.f
    {
      public a(w paramw) {}
      
      public final Object emit(Object paramObject, ub.e parame)
      {
        paramObject = (p)paramObject;
        a.c.set(paramObject);
        return rb.h.a;
      }
    }
  }
  
  public static final class b
    extends j
    implements l<o0.a, d>
  {
    public static final b a = new b();
    
    public b()
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      o0.a locala = (o0.a)paramObject;
      ec.i.e(locala, "ex");
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("CorruptionException in sessions DataStore in ");
      ((StringBuilder)paramObject).append(t.b());
      ((StringBuilder)paramObject).append('.');
      Log.w("FirebaseSessionsRepo", ((StringBuilder)paramObject).toString(), locala);
      return new r0.a(true, 1);
    }
  }
  
  public static final class c
  {
    static
    {
      ec.p localp = new ec.p(c.class);
      ec.t.a.getClass();
      a = new jc.h[] { localp };
    }
  }
  
  public static final class d
  {
    public static final d.a<String> a = x6.b.u0("session_id");
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f="SessionDatastore.kt", l={76}, m="invokeSuspend")
  public static final class e
    extends wb.i
    implements q<qc.f<? super d>, Throwable, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public e(ub.e<? super e> parame)
    {
      super(parame);
    }
    
    public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
    {
      paramObject1 = (Throwable)paramObject1;
      paramObject2 = new e((ub.e)paramObject2);
      b = paramf;
      c = ((Throwable)paramObject1);
      return ((e)paramObject2).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = a;
      if (i != 0)
      {
        if (i == 1) {
          rb.f.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        rb.f.b(paramObject);
        qc.f localf = b;
        Log.e("FirebaseSessionsRepo", "Error reading stored session data.", c);
        paramObject = new r0.a(true, 1);
        b = null;
        a = 1;
        if (localf.emit(paramObject, this) == locala) {
          return locala;
        }
      }
      return rb.h.a;
    }
  }
  
  public static final class f
    implements qc.e<p>
  {
    public f(qc.i parami, w paramw) {}
    
    public final Object collect(qc.f paramf, ub.e parame)
    {
      paramf = a.collect(new a(paramf, jdField_this), parame);
      if (paramf == vb.a.a) {
        return paramf;
      }
      return rb.h.a;
    }
    
    public static final class a<T>
      implements qc.f
    {
      public a(qc.f paramf, w paramw) {}
      
      public final Object emit(Object paramObject, ub.e parame)
      {
        if ((parame instanceof a))
        {
          localObject1 = (a)parame;
          i = b;
          if ((i & 0x80000000) != 0)
          {
            b = (i + Integer.MIN_VALUE);
            parame = (ub.e)localObject1;
            break label50;
          }
        }
        parame = new a(this, parame);
        label50:
        Object localObject2 = a;
        Object localObject1 = vb.a.a;
        int i = b;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(localObject2);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(localObject2);
          localObject2 = a;
          paramObject = (d)paramObject;
          w localw = b;
          w.c localc = w.e;
          localw.getClass();
          paramObject = new p((String)((d)paramObject).b(w.d.a));
          b = 1;
          if (((qc.f)localObject2).emit(paramObject, parame) == localObject1) {
            return localObject1;
          }
        }
        return rb.h.a;
      }
      
      @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f="SessionDatastore.kt", l={223}, m="emit")
      public static final class a
        extends wb.c
      {
        public int b;
        
        public a(w.f.a parama, ub.e parame)
        {
          super();
        }
        
        public final Object invokeSuspend(Object paramObject)
        {
          a = paramObject;
          b |= 0x80000000;
          return c.emit(null, this);
        }
      }
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f="SessionDatastore.kt", l={89}, m="invokeSuspend")
  public static final class g
    extends wb.i
    implements dc.p<d0, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public g(w paramw, String paramString, ub.e<? super g> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new g(b, paramString, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((g)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = vb.a.a;
      int i = a;
      if ((i == 0) || (i == 1)) {}
      try
      {
        rb.f.b(paramObject);
      }
      catch (IOException paramObject)
      {
        Object localObject2;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Failed to update session Id: ");
        ((StringBuilder)localObject1).append(paramObject);
        Log.w("FirebaseSessionsRepo", ((StringBuilder)localObject1).toString());
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      rb.f.b(paramObject);
      paramObject = w.e;
      localObject2 = b.a;
      paramObject.getClass();
      localObject2 = w.f.a(localObject2, w.c.a[0]);
      paramObject = new ea/w$g$a;
      ((a)paramObject).<init>(paramString, null);
      a = 1;
      paramObject = r0.e.a((o0.i)localObject2, (dc.p)paramObject, this);
      if (paramObject == localObject1) {
        return localObject1;
      }
      return rb.h.a;
    }
    
    @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f="SessionDatastore.kt", l={}, m="invokeSuspend")
    public static final class a
      extends wb.i
      implements dc.p<r0.a, ub.e<? super rb.h>, Object>
    {
      public a(String paramString, ub.e<? super a> parame)
      {
        super(parame);
      }
      
      public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
      {
        parame = new a(b, parame);
        a = paramObject;
        return parame;
      }
      
      public final Object invoke(Object paramObject1, Object paramObject2)
      {
        return ((a)create((r0.a)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = vb.a.a;
        rb.f.b(paramObject);
        paramObject = (r0.a)a;
        localObject = w.d.a;
        ((r0.a)paramObject).d(w.d.a, b);
        return rb.h.a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     ea.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */