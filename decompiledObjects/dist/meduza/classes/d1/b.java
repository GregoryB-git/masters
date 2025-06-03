package d1;

import android.app.Activity;
import android.os.Bundle;
import b1.o;
import b1.o0;
import b1.q0;
import b1.q0.b;
import b1.s0;
import b1.t;
import b1.w;
import b1.x;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import g;
import h6.e;
import h6.s;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;
import r.i;

public final class b
  extends a
{
  public final o a;
  public final c b;
  
  public b(o paramo, s0 params0)
  {
    a = paramo;
    b = ((c)new q0(params0, c.f).a(c.class));
  }
  
  @Deprecated
  public final void b(String paramString, PrintWriter paramPrintWriter)
  {
    c localc = b;
    if (d.c > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loaders:");
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("    ");
      String str = ((StringBuilder)localObject1).toString();
      for (int i = 0;; i++)
      {
        localObject1 = d;
        if (i >= c) {
          break;
        }
        a locala = (a)b[i];
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(d.a[i]);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        paramPrintWriter.print(str);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(a);
        paramPrintWriter.print(" mArgs=");
        paramPrintWriter.println(b);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mLoader=");
        paramPrintWriter.println(c);
        Object localObject2 = c;
        localObject1 = g.d(str, "  ");
        localObject2 = (e1.a)localObject2;
        localObject2.getClass();
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(a);
        paramPrintWriter.print(" mListener=");
        paramPrintWriter.println(b);
        if ((c) || (f))
        {
          paramPrintWriter.print((String)localObject1);
          paramPrintWriter.print("mStarted=");
          paramPrintWriter.print(c);
          paramPrintWriter.print(" mContentChanged=");
          paramPrintWriter.print(f);
          paramPrintWriter.print(" mProcessingChange=");
          paramPrintWriter.println(false);
        }
        if ((d) || (e))
        {
          paramPrintWriter.print((String)localObject1);
          paramPrintWriter.print("mAbandoned=");
          paramPrintWriter.print(d);
          paramPrintWriter.print(" mReset=");
          paramPrintWriter.println(e);
        }
        if (h != null)
        {
          paramPrintWriter.print((String)localObject1);
          paramPrintWriter.print("mTask=");
          paramPrintWriter.print(h);
          paramPrintWriter.print(" waiting=");
          h.getClass();
          paramPrintWriter.println(false);
        }
        if (i != null)
        {
          paramPrintWriter.print((String)localObject1);
          paramPrintWriter.print("mCancellingTask=");
          paramPrintWriter.print(i);
          paramPrintWriter.print(" waiting=");
          i.getClass();
          paramPrintWriter.println(false);
        }
        if (e != null)
        {
          paramPrintWriter.print(str);
          paramPrintWriter.print("mCallbacks=");
          paramPrintWriter.println(e);
          localObject1 = e;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append("  ");
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject1.getClass();
          paramPrintWriter.print((String)localObject2);
          paramPrintWriter.print("mDeliveredData=");
          paramPrintWriter.println(b);
        }
        paramPrintWriter.print(str);
        paramPrintWriter.print("mData=");
        localObject2 = c;
        localObject1 = locala.getValue();
        localObject2.getClass();
        localObject2 = new StringBuilder(64);
        if (localObject1 == null)
        {
          localObject1 = "null";
        }
        else
        {
          localObject1 = localObject1.getClass();
          ((StringBuilder)localObject2).append(((Class)localObject1).getSimpleName());
          ((StringBuilder)localObject2).append("{");
          ((StringBuilder)localObject2).append(Integer.toHexString(System.identityHashCode(localObject1)));
          localObject1 = "}";
        }
        ((StringBuilder)localObject2).append((String)localObject1);
        paramPrintWriter.println(((StringBuilder)localObject2).toString());
        paramPrintWriter.print(str);
        paramPrintWriter.print("mStarted=");
        paramPrintWriter.println(locala.hasActiveObservers());
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    Class localClass = a.getClass();
    localStringBuilder.append(localClass.getSimpleName());
    localStringBuilder.append("{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(localClass)));
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static final class a<D>
    extends w<D>
    implements e1.b.a<D>
  {
    public final int a = 0;
    public final Bundle b = null;
    public final e1.b<D> c;
    public o d;
    public b.b<D> e;
    public e1.b<D> f;
    
    public a(e parame)
    {
      c = parame;
      f = null;
      if (b == null)
      {
        b = this;
        a = 0;
        return;
      }
      throw new IllegalStateException("There is already a listener registered");
    }
    
    public final void a()
    {
      o localo = d;
      b.b localb = e;
      if ((localo != null) && (localb != null))
      {
        super.removeObserver(localb);
        observe(localo, localb);
      }
    }
    
    public final void onActive()
    {
      Object localObject = c;
      c = true;
      e = false;
      d = false;
      localObject = (e)localObject;
      j.drainPermits();
      ((e1.b)localObject).a();
      h = new e1.a.a((e1.a)localObject);
      ((e1.a)localObject).b();
    }
    
    public final void onInactive()
    {
      c.c = false;
    }
    
    public final void removeObserver(x<? super D> paramx)
    {
      super.removeObserver(paramx);
      d = null;
      e = null;
    }
    
    public final void setValue(D paramD)
    {
      super.setValue(paramD);
      paramD = f;
      if (paramD != null)
      {
        e = true;
        c = false;
        d = false;
        f = false;
        f = null;
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(a);
      localStringBuilder.append(" : ");
      Class localClass = c.getClass();
      localStringBuilder.append(localClass.getSimpleName());
      localStringBuilder.append("{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(localClass)));
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b<D>
    implements x<D>
  {
    public final a.a<D> a;
    public boolean b = false;
    
    public b(e1.b paramb, s params)
    {
      a = params;
    }
    
    public final void a(D paramD)
    {
      b = true;
      s locals = (s)a;
      locals.getClass();
      paramD = (Void)paramD;
      paramD = a;
      paramD.setResult(d, e);
      a.finish();
    }
    
    public final String toString()
    {
      return a.toString();
    }
  }
  
  public static final class c
    extends o0
  {
    public static final a f = new a();
    public i<b.a> d = new i();
    public boolean e = false;
    
    public final void b()
    {
      int i = d.c;
      int j = 0;
      while (j < i)
      {
        localObject1 = (b.a)d.b[j];
        c.a();
        c.d = true;
        localObject2 = e;
        if (localObject2 != null)
        {
          ((b.a)localObject1).removeObserver((x)localObject2);
          if (b) {
            a.getClass();
          }
        }
        e1.b localb = c;
        localObject2 = b;
        if (localObject2 != null)
        {
          if (localObject2 == localObject1)
          {
            b = null;
            e = true;
            c = false;
            d = false;
            f = false;
            j++;
          }
          else
          {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
          }
        }
        else {
          throw new IllegalStateException("No listener register");
        }
      }
      Object localObject1 = d;
      i = c;
      Object localObject2 = b;
      for (j = 0; j < i; j++) {
        localObject2[j] = null;
      }
      c = 0;
    }
    
    public static final class a
      implements q0.b
    {
      public final <T extends o0> T a(Class<T> paramClass)
      {
        return new b.c();
      }
      
      public final o0 b(Class paramClass, c1.b paramb)
      {
        return a(paramClass);
      }
    }
  }
}

/* Location:
 * Qualified Name:     d1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */