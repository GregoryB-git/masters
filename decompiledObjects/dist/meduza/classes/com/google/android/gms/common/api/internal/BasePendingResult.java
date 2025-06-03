package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k6.e;
import k6.g;
import k6.g.a;
import k6.h;
import k6.k;
import k6.l;
import k6.m;
import l6.f1;
import l6.g1;
import l6.v0;
import l6.w0;

public abstract class BasePendingResult<R extends k6.j>
  extends g<R>
{
  public static final ThreadLocal zaa = new f1(0);
  private g1 resultGuardian;
  public final a zab;
  public final WeakReference zac;
  private final Object zae = new Object();
  private final CountDownLatch zaf = new CountDownLatch(1);
  private final ArrayList zag = new ArrayList();
  private k zah;
  private final AtomicReference zai = new AtomicReference();
  private k6.j zaj;
  private Status zak;
  private volatile boolean zal;
  private boolean zam;
  private boolean zan;
  private ICancelToken zao;
  private volatile v0 zap;
  private boolean zaq = false;
  
  @Deprecated
  public BasePendingResult()
  {
    zab = new a(Looper.getMainLooper());
    zac = new WeakReference(null);
  }
  
  @Deprecated
  public BasePendingResult(Looper paramLooper)
  {
    zab = new a(paramLooper);
    zac = new WeakReference(null);
  }
  
  public BasePendingResult(a<R> parama)
  {
    if (parama != null)
    {
      zab = parama;
      zac = new WeakReference(null);
      return;
    }
    throw new NullPointerException("CallbackHandler must not be null");
  }
  
  public BasePendingResult(e parame)
  {
    Looper localLooper;
    if (parame != null) {
      localLooper = parame.c();
    } else {
      localLooper = Looper.getMainLooper();
    }
    zab = new a(localLooper);
    zac = new WeakReference(parame);
  }
  
  private final k6.j zaa()
  {
    synchronized (zae)
    {
      m6.j.k(zal ^ true, "Result has already been consumed.");
      m6.j.k(isReady(), "Result is not ready.");
      k6.j localj = zaj;
      zaj = null;
      zah = null;
      zal = true;
      if ((w0)zai.getAndSet(null) == null)
      {
        m6.j.i(localj);
        return localj;
      }
      throw null;
    }
  }
  
  private final void zab(k6.j paramj)
  {
    zaj = paramj;
    zak = paramj.getStatus();
    zao = null;
    zaf.countDown();
    if (zam)
    {
      zah = null;
    }
    else
    {
      paramj = zah;
      if (paramj == null)
      {
        if ((zaj instanceof h)) {
          resultGuardian = new g1(this);
        }
      }
      else
      {
        zab.removeMessages(2);
        zab.a(paramj, zaa());
      }
    }
    paramj = zag;
    int i = paramj.size();
    for (int j = 0; j < i; j++) {
      ((g.a)paramj.get(j)).a(zak);
    }
    zag.clear();
  }
  
  public static void zal(k6.j paramj)
  {
    if ((paramj instanceof h)) {
      try
      {
        ((h)paramj).release();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(paramj)), localRuntimeException);
      }
    }
  }
  
  public final void addStatusListener(g.a parama)
  {
    boolean bool;
    if (parama != null) {
      bool = true;
    } else {
      bool = false;
    }
    m6.j.a("Callback cannot be null.", bool);
    synchronized (zae)
    {
      if (isReady()) {
        parama.a(zak);
      } else {
        zag.add(parama);
      }
      return;
    }
  }
  
  @ResultIgnorabilityUnspecified
  public final R await()
  {
    m6.j.h("await must not be called on the UI thread");
    boolean bool1 = zal;
    boolean bool2 = true;
    m6.j.k(bool1 ^ true, "Result has already been consumed");
    if (zap != null) {
      bool2 = false;
    }
    m6.j.k(bool2, "Cannot await if then() has been called.");
    try
    {
      zaf.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      forceFailureUnlessReady(Status.f);
    }
    m6.j.k(isReady(), "Result is not ready.");
    return zaa();
  }
  
  @ResultIgnorabilityUnspecified
  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L) {
      m6.j.h("await must not be called on the UI thread when time is greater than zero.");
    }
    boolean bool1 = zal;
    boolean bool2 = true;
    m6.j.k(bool1 ^ true, "Result has already been consumed.");
    if (zap != null) {
      bool2 = false;
    }
    m6.j.k(bool2, "Cannot await if then() has been called.");
    try
    {
      if (!zaf.await(paramLong, paramTimeUnit)) {
        forceFailureUnlessReady(Status.p);
      }
    }
    catch (InterruptedException paramTimeUnit)
    {
      forceFailureUnlessReady(Status.f);
    }
    m6.j.k(isReady(), "Result is not ready.");
    return zaa();
  }
  
  public void cancel()
  {
    ICancelToken localICancelToken;
    synchronized (zae)
    {
      if ((!zam) && (!zal))
      {
        localICancelToken = zao;
        if (localICancelToken == null) {}
      }
    }
    try
    {
      localICancelToken.cancel();
      zal(zaj);
      zam = true;
      zab(createFailedResult(Status.q));
      return;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public abstract R createFailedResult(Status paramStatus);
  
  @Deprecated
  public final void forceFailureUnlessReady(Status paramStatus)
  {
    synchronized (zae)
    {
      if (!isReady())
      {
        setResult(createFailedResult(paramStatus));
        zan = true;
      }
      return;
    }
  }
  
  public final boolean isCanceled()
  {
    synchronized (zae)
    {
      boolean bool = zam;
      return bool;
    }
  }
  
  public final boolean isReady()
  {
    return zaf.getCount() == 0L;
  }
  
  public final void setCancelToken(ICancelToken paramICancelToken)
  {
    synchronized (zae)
    {
      zao = paramICancelToken;
      return;
    }
  }
  
  public final void setResult(R paramR)
  {
    synchronized (zae)
    {
      if ((!zan) && (!zam))
      {
        isReady();
        m6.j.k(isReady() ^ true, "Results have already been set");
        m6.j.k(zal ^ true, "Result has already been consumed");
        zab(paramR);
        return;
      }
      zal(paramR);
      return;
    }
  }
  
  public final void setResultCallback(k<? super R> paramk)
  {
    localObject = zae;
    if (paramk == null) {}
    try
    {
      zah = null;
      return;
    }
    finally {}
    boolean bool1 = zal;
    boolean bool2 = true;
    m6.j.k(bool1 ^ true, "Result has already been consumed.");
    if (zap != null) {
      bool2 = false;
    }
    m6.j.k(bool2, "Cannot set callbacks if then() has been called.");
    if (isCanceled()) {
      return;
    }
    if (isReady()) {
      zab.a(paramk, zaa());
    } else {
      zah = paramk;
    }
  }
  
  public final void setResultCallback(k<? super R> paramk, long paramLong, TimeUnit paramTimeUnit)
  {
    localObject = zae;
    if (paramk == null) {}
    try
    {
      zah = null;
      return;
    }
    finally {}
    boolean bool1 = zal;
    boolean bool2 = true;
    m6.j.k(bool1 ^ true, "Result has already been consumed.");
    if (zap != null) {
      bool2 = false;
    }
    m6.j.k(bool2, "Cannot set callbacks if then() has been called.");
    if (isCanceled()) {
      return;
    }
    if (isReady())
    {
      zab.a(paramk, zaa());
    }
    else
    {
      zah = paramk;
      paramk = zab;
      paramLong = paramTimeUnit.toMillis(paramLong);
      paramk.sendMessageDelayed(paramk.obtainMessage(2, this), paramLong);
    }
  }
  
  public final <S extends k6.j> m<S> then(l<? super R, ? extends S> arg1)
  {
    m6.j.k(zal ^ true, "Result has already been consumed.");
    synchronized (zae)
    {
      ??? = zap;
      boolean bool1 = false;
      if (??? == null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      m6.j.k(bool2, "Cannot call then() twice.");
      boolean bool2 = bool1;
      if (zah == null) {
        bool2 = true;
      }
      m6.j.k(bool2, "Cannot call then() if callbacks are set.");
      m6.j.k(zam ^ true, "Cannot call then() if result was canceled.");
      zaq = true;
      ??? = new l6/v0;
      ((v0)???).<init>(zac);
      zap = ((v0)???);
      v0 localv01 = zap;
      synchronized (c)
      {
        localv01.getClass();
        m6.j.k(true, "Cannot call then() twice.");
        localv01.getClass();
        v0 localv02 = new l6/v0;
        localv02.<init>(e);
        a = localv02;
        localv01.c();
        if (isReady()) {
          zab.a(zap, zaa());
        } else {
          zah = zap;
        }
        return localv02;
      }
    }
  }
  
  public final void zak()
  {
    boolean bool1 = zaq;
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1) {
      if (((Boolean)zaa.get()).booleanValue()) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    zaq = bool3;
  }
  
  public final boolean zam()
  {
    synchronized (zae)
    {
      if (((e)zac.get() == null) || (!zaq)) {
        cancel();
      }
      boolean bool = isCanceled();
      return bool;
    }
  }
  
  public final void zan(w0 paramw0)
  {
    zai.set(paramw0);
  }
  
  public static final class a<R extends k6.j>
    extends zau
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void a(k paramk, k6.j paramj)
    {
      ThreadLocal localThreadLocal = BasePendingResult.zaa;
      m6.j.i(paramk);
      sendMessage(obtainMessage(1, new Pair(paramk, paramj)));
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 1)
      {
        if (i != 2)
        {
          Log.wtf("BasePendingResult", f.h("Don't know how to handle message: ", i), new Exception());
          return;
        }
        ((BasePendingResult)obj).forceFailureUnlessReady(Status.p);
        return;
      }
      Object localObject = (Pair)obj;
      paramMessage = (k)first;
      localObject = (k6.j)second;
      try
      {
        paramMessage.a((k6.j)localObject);
        return;
      }
      catch (RuntimeException paramMessage)
      {
        BasePendingResult.zal((k6.j)localObject);
        throw paramMessage;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.BasePendingResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */