package k6;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e0.f0;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import l6.d0;
import l6.f;
import l6.g;
import l6.h;
import l6.h.a;
import l6.h0;
import l6.l;
import l6.m;
import l6.m0;
import l6.o;
import l6.q;
import l6.r;
import l6.v;
import l6.w;
import l6.x0;
import l6.y0;
import l6.z0;

public abstract class d<O extends a.d>
{
  public final l6.d zaa;
  private final Context zab;
  private final String zac;
  private final a zad;
  private final a.d zae;
  private final l6.a zaf;
  private final Looper zag;
  private final int zah;
  private final e zai;
  private final o zaj;
  
  public d(Activity paramActivity, a<O> parama, O paramO, a parama1)
  {
    this(paramActivity, paramActivity, parama, paramO, parama1);
  }
  
  @Deprecated
  public d(Activity paramActivity, a<O> parama, O paramO, o paramo) {}
  
  private d(Context paramContext, Activity paramActivity, a parama, a.d paramd, a parama1)
  {
    if (paramContext != null)
    {
      if (parama != null)
      {
        if (parama1 != null)
        {
          Context localContext = paramContext.getApplicationContext();
          m6.j.j(localContext, "The provided context did not have an application context.");
          zab = localContext;
          if (Build.VERSION.SDK_INT >= 30) {
            paramContext = f0.c(paramContext);
          } else {
            paramContext = getApiFallbackAttributionTag(paramContext);
          }
          zac = paramContext;
          zad = parama;
          zae = paramd;
          zag = b;
          parama = new l6.a(parama, paramd, paramContext);
          zaf = parama;
          zai = new h0(this);
          paramd = l6.d.g(localContext);
          zaa = paramd;
          zah = p.getAndIncrement();
          zaj = a;
          if ((paramActivity != null) && (!(paramActivity instanceof GoogleApiActivity)) && (Looper.myLooper() == Looper.getMainLooper()))
          {
            parama1 = f.getFragment(paramActivity);
            paramActivity = (v)parama1.a(v.class, "ConnectionlessLifecycleHelper");
            paramContext = paramActivity;
            if (paramActivity == null) {
              paramContext = new v(parama1, paramd, j6.e.d);
            }
            e.add(parama);
            paramd.a(paramContext);
          }
          paramContext = v;
          paramContext.sendMessage(paramContext.obtainMessage(7, this));
          return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
      }
      throw new NullPointerException("Api must not be null.");
    }
    throw new NullPointerException("Null context is not permitted.");
  }
  
  @Deprecated
  public d(Context paramContext, a<O> parama, O paramO, Looper paramLooper, o paramo) {}
  
  public d(Context paramContext, a<O> parama, O paramO, a parama1)
  {
    this(paramContext, null, parama, paramO, parama1);
  }
  
  @Deprecated
  public d(Context paramContext, a<O> parama, O paramO, o paramo) {}
  
  private final com.google.android.gms.common.api.internal.a zad(int paramInt, com.google.android.gms.common.api.internal.a parama)
  {
    parama.zak();
    l6.d locald = zaa;
    locald.getClass();
    Object localObject = new m0(new x0(paramInt, parama), q.get(), this);
    localObject = v.obtainMessage(4, localObject);
    v.sendMessage((Message)localObject);
    return parama;
  }
  
  private final Task zae(int paramInt, q paramq)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    o localo = zaj;
    l6.d locald = zaa;
    locald.getClass();
    locald.f(localTaskCompletionSource, c, this);
    paramq = new m0(new y0(paramInt, paramq, localTaskCompletionSource, localo), q.get(), this);
    paramq = v.obtainMessage(4, paramq);
    v.sendMessage(paramq);
    return localTaskCompletionSource.getTask();
  }
  
  public e asGoogleApiClient()
  {
    return zai;
  }
  
  public m6.a.a createClientSettingsBuilder()
  {
    m6.a.a locala = new m6.a.a();
    Object localObject = zae;
    if ((localObject instanceof a.d.b))
    {
      localObject = ((a.d.b)localObject).r();
      if (localObject != null)
      {
        localObject = d;
        if (localObject == null) {
          break label86;
        }
        localObject = new Account((String)localObject, "com.google");
        break label88;
      }
    }
    localObject = zae;
    if ((localObject instanceof a.d.a)) {
      localObject = ((a.d.a)localObject).u();
    } else {
      label86:
      localObject = null;
    }
    label88:
    a = ((Account)localObject);
    localObject = zae;
    if ((localObject instanceof a.d.b))
    {
      localObject = ((a.d.b)localObject).r();
      if (localObject != null)
      {
        localObject = ((GoogleSignInAccount)localObject).D();
        break label134;
      }
    }
    localObject = Collections.emptySet();
    label134:
    if (b == null) {
      b = new r.d();
    }
    b.addAll((Collection)localObject);
    d = zab.getClass().getName();
    c = zab.getPackageName();
    return locala;
  }
  
  public Task<Boolean> disconnectService()
  {
    l6.d locald = zaa;
    locald.getClass();
    w localw = new w(getApiKey());
    Message localMessage = v.obtainMessage(14, localw);
    v.sendMessage(localMessage);
    return b.getTask();
  }
  
  public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doBestEffortWrite(T paramT)
  {
    zad(2, paramT);
    return paramT;
  }
  
  @ResultIgnorabilityUnspecified
  public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(q<A, TResult> paramq)
  {
    return zae(2, paramq);
  }
  
  public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doRead(T paramT)
  {
    zad(0, paramT);
    return paramT;
  }
  
  @ResultIgnorabilityUnspecified
  public <TResult, A extends a.b> Task<TResult> doRead(q<A, TResult> paramq)
  {
    return zae(0, paramq);
  }
  
  @ResultIgnorabilityUnspecified
  @Deprecated
  public <A extends a.b, T extends l<A, ?>, U extends r<A, ?>> Task<Void> doRegisterEventListener(T paramT, U paramU)
  {
    m6.j.i(paramT);
    throw null;
  }
  
  @ResultIgnorabilityUnspecified
  public <A extends a.b> Task<Void> doRegisterEventListener(m<A, ?> paramm)
  {
    m6.j.i(paramm);
    throw null;
  }
  
  @ResultIgnorabilityUnspecified
  public Task<Boolean> doUnregisterEventListener(h.a<?> parama)
  {
    return doUnregisterEventListener(parama, 0);
  }
  
  @ResultIgnorabilityUnspecified
  public Task<Boolean> doUnregisterEventListener(h.a<?> parama, int paramInt)
  {
    if (parama != null)
    {
      l6.d locald = zaa;
      locald.getClass();
      TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
      locald.f(localTaskCompletionSource, paramInt, this);
      parama = new m0(new z0(parama, localTaskCompletionSource), q.get(), this);
      parama = v.obtainMessage(13, parama);
      v.sendMessage(parama);
      return localTaskCompletionSource.getTask();
    }
    throw new NullPointerException("Listener key cannot be null.");
  }
  
  public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doWrite(T paramT)
  {
    zad(1, paramT);
    return paramT;
  }
  
  @ResultIgnorabilityUnspecified
  public <TResult, A extends a.b> Task<TResult> doWrite(q<A, TResult> paramq)
  {
    return zae(1, paramq);
  }
  
  public String getApiFallbackAttributionTag(Context paramContext)
  {
    return null;
  }
  
  public final l6.a<O> getApiKey()
  {
    return zaf;
  }
  
  public O getApiOptions()
  {
    return zae;
  }
  
  public Context getApplicationContext()
  {
    return zab;
  }
  
  public String getContextAttributionTag()
  {
    return zac;
  }
  
  @Deprecated
  public String getContextFeatureId()
  {
    return zac;
  }
  
  public Looper getLooper()
  {
    return zag;
  }
  
  public <L> h<L> registerListener(L paramL, String paramString)
  {
    Looper localLooper = zag;
    if (paramL != null)
    {
      m6.j.j(localLooper, "Looper must not be null");
      if (paramString != null) {
        return new h(localLooper, paramL, paramString);
      }
      throw new NullPointerException("Listener type must not be null");
    }
    throw new NullPointerException("Listener must not be null");
  }
  
  public final int zaa()
  {
    return zah;
  }
  
  public final a.f zab(Looper paramLooper, d0 paramd0)
  {
    Object localObject = createClientSettingsBuilder();
    localObject = new m6.a(a, b, c, d);
    a.a locala = zad.a;
    m6.j.i(locala);
    a.d locald = zae;
    paramd0 = locala.buildClient(zab, paramLooper, (m6.a)localObject, locald, paramd0, paramd0);
    paramLooper = getContextAttributionTag();
    if ((paramLooper != null) && ((paramd0 instanceof com.google.android.gms.common.internal.a))) {
      ((com.google.android.gms.common.internal.a)paramd0).setAttributionTag(paramLooper);
    }
    if ((paramLooper != null) && ((paramd0 instanceof l6.i))) {
      ((l6.i)paramd0).getClass();
    }
    return paramd0;
  }
  
  public final zact zac(Context paramContext, Handler paramHandler)
  {
    m6.a.a locala = createClientSettingsBuilder();
    return new zact(paramContext, paramHandler, new m6.a(a, b, c, d));
  }
  
  public static final class a
  {
    public static final a c = new a(new z4.i(1), Looper.getMainLooper());
    public final o a;
    public final Looper b;
    
    public a(o paramo, Looper paramLooper)
    {
      a = paramo;
      b = paramLooper;
    }
  }
}

/* Location:
 * Qualified Name:     k6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */