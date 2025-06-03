package r1;

import E.q;
import V5.t;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class n
{
  public static final b a = new b(null);
  
  public abstract Object a(a parama, X5.d paramd);
  
  public abstract Object b(X5.d paramd);
  
  public abstract Object c(Uri paramUri, InputEvent paramInputEvent, X5.d paramd);
  
  public abstract Object d(Uri paramUri, X5.d paramd);
  
  public abstract Object e(o paramo, X5.d paramd);
  
  public abstract Object f(p paramp, X5.d paramd);
  
  public static final class a
    extends n
  {
    public final MeasurementManager b;
    
    public a(MeasurementManager paramMeasurementManager)
    {
      b = paramMeasurementManager;
    }
    
    public a(Context paramContext)
    {
      this(j.a(paramContext));
    }
    
    public Object a(@NotNull a parama, @NotNull X5.d paramd)
    {
      p6.m localm = new p6.m(Y5.b.b(paramd), 1);
      localm.z();
      h.a(j(this), g(this, parama), new m(), q.a(localm));
      parama = localm.w();
      if (parama == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      if (parama == Y5.b.c()) {
        return parama;
      }
      return t.a;
    }
    
    public Object b(@NotNull X5.d paramd)
    {
      Object localObject = new p6.m(Y5.b.b(paramd), 1);
      ((p6.m)localObject).z();
      k.a(j(this), new m(), q.a((X5.d)localObject));
      localObject = ((p6.m)localObject).w();
      if (localObject == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      return localObject;
    }
    
    public Object c(@NotNull Uri paramUri, InputEvent paramInputEvent, @NotNull X5.d paramd)
    {
      p6.m localm = new p6.m(Y5.b.b(paramd), 1);
      localm.z();
      f.a(j(this), paramUri, paramInputEvent, new m(), q.a(localm));
      paramUri = localm.w();
      if (paramUri == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      if (paramUri == Y5.b.c()) {
        return paramUri;
      }
      return t.a;
    }
    
    public Object d(@NotNull Uri paramUri, @NotNull X5.d paramd)
    {
      p6.m localm = new p6.m(Y5.b.b(paramd), 1);
      localm.z();
      l.a(j(this), paramUri, new m(), q.a(localm));
      paramUri = localm.w();
      if (paramUri == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      if (paramUri == Y5.b.c()) {
        return paramUri;
      }
      return t.a;
    }
    
    public Object e(@NotNull o paramo, @NotNull X5.d paramd)
    {
      p6.m localm = new p6.m(Y5.b.b(paramd), 1);
      localm.z();
      g.a(j(this), h(this, paramo), new m(), q.a(localm));
      paramo = localm.w();
      if (paramo == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      if (paramo == Y5.b.c()) {
        return paramo;
      }
      return t.a;
    }
    
    public Object f(@NotNull p paramp, @NotNull X5.d paramd)
    {
      p6.m localm = new p6.m(Y5.b.b(paramd), 1);
      localm.z();
      c.a(j(this), i(this, paramp), new m(), q.a(localm));
      paramp = localm.w();
      if (paramp == Y5.b.c()) {
        Z5.h.c(paramd);
      }
      if (paramp == Y5.b.c()) {
        return paramp;
      }
      return t.a;
    }
    
    public final DeletionRequest k(a parama)
    {
      b.a();
      throw null;
    }
    
    public final WebSourceRegistrationRequest l(o paramo)
    {
      d.a();
      throw null;
    }
    
    public final WebTriggerRegistrationRequest m(p paramp)
    {
      e.a();
      throw null;
    }
  }
  
  public static final class b
  {
    public final n a(Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AdServicesInfo.version=");
      o1.a locala = o1.a.a;
      localStringBuilder.append(locala.a());
      Log.d("MeasurementManager", localStringBuilder.toString());
      if (locala.a() >= 5) {
        paramContext = new n.a(paramContext);
      } else {
        paramContext = null;
      }
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     r1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */