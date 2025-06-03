package b;

import android.os.Build.VERSION;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b1.k;
import b1.k.a;
import b1.k.b;
import b1.m;
import b1.o;
import dc.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class w
{
  public final Runnable a;
  public final d0.a<Boolean> b;
  public final sb.i<p> c;
  public p d;
  public OnBackInvokedCallback e;
  public OnBackInvokedDispatcher f;
  public boolean g;
  public boolean h;
  
  public w()
  {
    this(null);
  }
  
  public w(Runnable paramRunnable)
  {
    a = paramRunnable;
    b = null;
    c = new sb.i();
    int i = Build.VERSION.SDK_INT;
    if (i >= 33)
    {
      if (i >= 34) {
        paramRunnable = b.a.a(new q(this), new r(this), new s(this), new t(this));
      } else {
        paramRunnable = a.a.a(new u(this));
      }
      e = paramRunnable;
    }
  }
  
  public final void a(o paramo, p paramp)
  {
    ec.i.e(paramo, "owner");
    ec.i.e(paramp, "onBackPressedCallback");
    paramo = paramo.getLifecycle();
    if (paramo.b() == k.b.a) {
      return;
    }
    paramp.addCancellable(new c(paramo, paramp));
    d();
    paramp.setEnabledChangedCallback$activity_release(new e());
  }
  
  public final void b()
  {
    Object localObject1 = d;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = c;
      localObject1 = ((List)localObject2).listIterator(((List)localObject2).size());
      while (((ListIterator)localObject1).hasPrevious())
      {
        localObject2 = ((ListIterator)localObject1).previous();
        if (((p)localObject2).isEnabled()) {
          break label60;
        }
      }
      localObject2 = null;
      label60:
      localObject2 = (p)localObject2;
    }
    d = null;
    if (localObject2 != null)
    {
      ((p)localObject2).handleOnBackPressed();
      return;
    }
    localObject2 = a;
    if (localObject2 != null) {
      ((Runnable)localObject2).run();
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    OnBackInvokedDispatcher localOnBackInvokedDispatcher = f;
    OnBackInvokedCallback localOnBackInvokedCallback = e;
    if ((localOnBackInvokedDispatcher != null) && (localOnBackInvokedCallback != null)) {
      if ((paramBoolean) && (!g))
      {
        a.a.b(localOnBackInvokedDispatcher, 0, localOnBackInvokedCallback);
        g = true;
      }
      else if ((!paramBoolean) && (g))
      {
        a.a.c(localOnBackInvokedDispatcher, localOnBackInvokedCallback);
        g = false;
      }
    }
  }
  
  public final void d()
  {
    boolean bool1 = h;
    Object localObject = c;
    boolean bool2 = localObject instanceof Collection;
    boolean bool3 = false;
    if ((bool2) && (((Collection)localObject).isEmpty()))
    {
      bool2 = bool3;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool2 = bool3;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((p)((Iterator)localObject).next()).isEnabled());
      bool2 = true;
    }
    h = bool2;
    if (bool2 != bool1)
    {
      localObject = b;
      if (localObject != null) {
        ((d0.a)localObject).accept(Boolean.valueOf(bool2));
      }
      if (Build.VERSION.SDK_INT >= 33) {
        c(bool2);
      }
    }
  }
  
  public static final class a
  {
    public static final a a = new a();
    
    public final OnBackInvokedCallback a(dc.a<rb.h> parama)
    {
      ec.i.e(parama, "onBackInvoked");
      return new v(parama, 0);
    }
    
    public final void b(Object paramObject1, int paramInt, Object paramObject2)
    {
      ec.i.e(paramObject1, "dispatcher");
      ec.i.e(paramObject2, "callback");
      ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(paramInt, (OnBackInvokedCallback)paramObject2);
    }
    
    public final void c(Object paramObject1, Object paramObject2)
    {
      ec.i.e(paramObject1, "dispatcher");
      ec.i.e(paramObject2, "callback");
      ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
    }
  }
  
  public static final class b
  {
    public static final b a = new b();
    
    public final OnBackInvokedCallback a(l<? super b, rb.h> paraml1, final l<? super b, rb.h> paraml2, final dc.a<rb.h> parama1, final dc.a<rb.h> parama2)
    {
      ec.i.e(paraml1, "onBackStarted");
      ec.i.e(paraml2, "onBackProgressed");
      ec.i.e(parama1, "onBackInvoked");
      ec.i.e(parama2, "onBackCancelled");
      return new a(paraml1, paraml2, parama1, parama2);
    }
    
    public static final class a
      implements OnBackAnimationCallback
    {
      public a(l<? super b, rb.h> paraml1, l<? super b, rb.h> paraml2, dc.a<rb.h> parama1, dc.a<rb.h> parama2) {}
      
      public final void onBackCancelled()
      {
        parama2.invoke();
      }
      
      public final void onBackInvoked()
      {
        parama1.invoke();
      }
      
      public final void onBackProgressed(BackEvent paramBackEvent)
      {
        ec.i.e(paramBackEvent, "backEvent");
        paraml2.invoke(new b(paramBackEvent));
      }
      
      public final void onBackStarted(BackEvent paramBackEvent)
      {
        ec.i.e(paramBackEvent, "backEvent");
        a.invoke(new b(paramBackEvent));
      }
    }
  }
  
  public final class c
    implements m, c
  {
    public final k a;
    public final p b;
    public w.d c;
    
    public c(p paramp)
    {
      a = paramp;
      b = ((p)localObject);
      paramp.a(this);
    }
    
    public final void a(o paramo, k.a parama)
    {
      if (parama == k.a.ON_START)
      {
        parama = w.this;
        paramo = b;
        parama.getClass();
        ec.i.e(paramo, "onBackPressedCallback");
        c.addLast(paramo);
        w.d locald = new w.d(parama, paramo);
        paramo.addCancellable(locald);
        parama.d();
        paramo.setEnabledChangedCallback$activity_release(new x(parama));
        c = locald;
      }
      else if (parama == k.a.ON_STOP)
      {
        paramo = c;
        if (paramo != null) {
          paramo.cancel();
        }
      }
      else if (parama == k.a.ON_DESTROY)
      {
        cancel();
      }
    }
    
    public final void cancel()
    {
      a.c(this);
      b.removeCancellable(this);
      w.d locald = c;
      if (locald != null) {
        locald.cancel();
      }
      c = null;
    }
  }
  
  public final class d
    implements c
  {
    public final p a;
    
    public d()
    {
      p localp;
      a = localp;
    }
    
    public final void cancel()
    {
      c.remove(a);
      if (ec.i.a(d, a))
      {
        a.handleOnBackCancelled();
        d = null;
      }
      a.removeCancellable(this);
      dc.a locala = a.getEnabledChangedCallback$activity_release();
      if (locala != null) {
        locala.invoke();
      }
      a.setEnabledChangedCallback$activity_release(null);
    }
  }
}

/* Location:
 * Qualified Name:     b.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */