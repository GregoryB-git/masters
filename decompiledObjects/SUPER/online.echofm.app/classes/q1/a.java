package q1;

import V5.t;
import X5.d;
import Z5.k;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b3.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.I;
import p6.J;
import p6.W;
import p6.g;
import r1.n;
import r1.n.b;

public abstract class a
{
  public static final b a = new b(null);
  
  public static final a a(Context paramContext)
  {
    return a.a(paramContext);
  }
  
  public abstract e b();
  
  public abstract e c(Uri paramUri);
  
  public static final class a
    extends a
  {
    public final n b;
    
    public a(n paramn)
    {
      b = paramn;
    }
    
    @NotNull
    public e b()
    {
      return p1.b.c(g.b(J.a(W.a()), null, null, new b(this, null), 3, null), null, 1, null);
    }
    
    @NotNull
    public e c(@NotNull final Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramUri, "trigger");
      return p1.b.c(g.b(J.a(W.a()), null, null, new d(this, paramUri, null), 3, null), null, 1, null);
    }
    
    @NotNull
    public e e(@NotNull r1.a parama)
    {
      Intrinsics.checkNotNullParameter(parama, "deletionRequest");
      return p1.b.c(g.b(J.a(W.a()), null, null, new a(this, parama, null), 3, null), null, 1, null);
    }
    
    @NotNull
    public e f(@NotNull final Uri paramUri, final InputEvent paramInputEvent)
    {
      Intrinsics.checkNotNullParameter(paramUri, "attributionSource");
      return p1.b.c(g.b(J.a(W.a()), null, null, new c(this, paramUri, paramInputEvent, null), 3, null), null, 1, null);
    }
    
    @NotNull
    public e g(@NotNull r1.o paramo)
    {
      Intrinsics.checkNotNullParameter(paramo, "request");
      return p1.b.c(g.b(J.a(W.a()), null, null, new e(this, paramo, null), 3, null), null, 1, null);
    }
    
    @NotNull
    public e h(@NotNull r1.p paramp)
    {
      Intrinsics.checkNotNullParameter(paramp, "request");
      return p1.b.c(g.b(J.a(W.a()), null, null, new f(this, paramp, null), 3, null), null, 1, null);
    }
    
    public static final class a
      extends k
      implements g6.p
    {
      public int o;
      
      public a(a.a parama, r1.a parama1, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new a(p, null, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((a)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          paramObject = a.a.d(p);
          o = 1;
          if (((n)paramObject).a(null, this) == localObject) {
            return localObject;
          }
        }
        return t.a;
      }
    }
    
    public static final class b
      extends k
      implements g6.p
    {
      public int o;
      
      public b(a.a parama, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new b(p, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((b)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject1 = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          paramObject = a.a.d(p);
          o = 1;
          Object localObject2 = ((n)paramObject).b(this);
          paramObject = localObject2;
          if (localObject2 == localObject1) {
            return localObject1;
          }
        }
        return paramObject;
      }
    }
    
    public static final class c
      extends k
      implements g6.p
    {
      public int o;
      
      public c(a.a parama, Uri paramUri, InputEvent paramInputEvent, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new c(p, paramUri, paramInputEvent, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((c)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          n localn = a.a.d(p);
          Uri localUri = paramUri;
          paramObject = paramInputEvent;
          o = 1;
          if (localn.c(localUri, (InputEvent)paramObject, this) == localObject) {
            return localObject;
          }
        }
        return t.a;
      }
    }
    
    public static final class d
      extends k
      implements g6.p
    {
      public int o;
      
      public d(a.a parama, Uri paramUri, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new d(p, paramUri, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((d)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          paramObject = a.a.d(p);
          Uri localUri = paramUri;
          o = 1;
          if (((n)paramObject).d(localUri, this) == localObject) {
            return localObject;
          }
        }
        return t.a;
      }
    }
    
    public static final class e
      extends k
      implements g6.p
    {
      public int o;
      
      public e(a.a parama, r1.o paramo, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new e(p, null, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((e)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          paramObject = a.a.d(p);
          o = 1;
          if (((n)paramObject).e(null, this) == localObject) {
            return localObject;
          }
        }
        return t.a;
      }
    }
    
    public static final class f
      extends k
      implements g6.p
    {
      public int o;
      
      public f(a.a parama, r1.p paramp, d paramd)
      {
        super(paramd);
      }
      
      public final d create(Object paramObject, d paramd)
      {
        return new f(p, null, paramd);
      }
      
      public final Object invoke(I paramI, d paramd)
      {
        return ((f)create(paramI, paramd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Object localObject = Y5.b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(paramObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(paramObject);
          paramObject = a.a.d(p);
          o = 1;
          if (((n)paramObject).f(null, this) == localObject) {
            return localObject;
          }
        }
        return t.a;
      }
    }
  }
  
  public static final class b
  {
    public final a a(Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      paramContext = n.a.a(paramContext);
      if (paramContext != null) {
        paramContext = new a.a(paramContext);
      } else {
        paramContext = null;
      }
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     q1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */