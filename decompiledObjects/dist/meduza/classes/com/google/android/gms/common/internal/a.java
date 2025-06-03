package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import j6.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l6.b0;
import l6.c0;
import l6.d0;
import m6.e;
import m6.k0;
import m6.l;
import m6.l0;
import m6.p0;
import m6.s0;
import m6.v0;

public abstract class a<T extends IInterface>
{
  public static final int CONNECT_STATE_CONNECTED = 4;
  public static final int CONNECT_STATE_DISCONNECTED = 1;
  public static final int CONNECT_STATE_DISCONNECTING = 5;
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = { "service_esmobile", "service_googleme" };
  public static final String KEY_PENDING_INTENT = "pendingIntent";
  private static final j6.d[] zze = new j6.d[0];
  private volatile String zzA;
  private volatile x6.a zzB;
  private j6.b zzC = null;
  private boolean zzD = false;
  private volatile l0 zzE = null;
  public v0 zza;
  public final Handler zzb;
  public c zzc;
  public AtomicInteger zzd = new AtomicInteger(0);
  private int zzf;
  private long zzg;
  private long zzh;
  private int zzi;
  private long zzj;
  private volatile String zzk = null;
  private final Context zzl;
  private final Looper zzm;
  private final m6.c zzn;
  private final f zzo;
  private final Object zzp = new Object();
  private final Object zzq = new Object();
  private IGmsServiceBroker zzr;
  private IInterface zzs;
  private final ArrayList zzt = new ArrayList();
  private i zzu;
  private int zzv = 1;
  private final a zzw;
  private final b zzx;
  private final int zzy;
  private final String zzz;
  
  public a(Context paramContext, Handler paramHandler, m6.c paramc, f paramf, int paramInt, a parama, b paramb)
  {
    if (paramContext != null)
    {
      zzl = paramContext;
      if (paramHandler != null)
      {
        zzb = paramHandler;
        zzm = paramHandler.getLooper();
        if (paramc != null)
        {
          zzn = paramc;
          if (paramf != null)
          {
            zzo = paramf;
            zzy = paramInt;
            zzw = parama;
            zzx = paramb;
            zzz = null;
            return;
          }
          throw new NullPointerException("API availability must not be null");
        }
        throw new NullPointerException("Supervisor must not be null");
      }
      throw new NullPointerException("Handler must not be null");
    }
    throw new NullPointerException("Context must not be null");
  }
  
  public a(Context paramContext, Looper paramLooper, int paramInt, a parama, b paramb, String paramString)
  {
    this(paramContext, paramLooper, locals0, localf, paramInt, parama, paramb, paramString);
  }
  
  public a(Context paramContext, Looper paramLooper, m6.c paramc, f paramf, int paramInt, a parama, b paramb, String paramString)
  {
    if (paramContext != null)
    {
      zzl = paramContext;
      if (paramLooper != null)
      {
        zzm = paramLooper;
        if (paramc != null)
        {
          zzn = paramc;
          if (paramf != null)
          {
            zzo = paramf;
            zzb = new h(this, paramLooper);
            zzy = paramInt;
            zzw = parama;
            zzx = paramb;
            zzz = paramString;
            return;
          }
          throw new NullPointerException("API availability must not be null");
        }
        throw new NullPointerException("Supervisor must not be null");
      }
      throw new NullPointerException("Looper must not be null");
    }
    throw new NullPointerException("Context must not be null");
  }
  
  public static void zzj(a parama, l0 paraml0)
  {
    zzE = paraml0;
    if (parama.usesClientTelemetry())
    {
      parama = d;
      m6.k localk = m6.k.a();
      if (parama == null) {
        parama = null;
      } else {
        parama = a;
      }
      if (parama == null) {}
      try
      {
        paraml0 = m6.k.c;
        for (;;)
        {
          a = paraml0;
          int i;
          int j;
          do
          {
            break label90;
            l locall = a;
            paraml0 = parama;
            if (locall == null) {
              break;
            }
            i = a;
            j = a;
          } while (i >= j);
          paraml0 = parama;
        }
        label90:
        return;
      }
      finally {}
    }
  }
  
  private final void zzp(int paramInt, IInterface paramIInterface)
  {
    int i;
    if (paramInt != 4) {
      i = 0;
    } else {
      i = 1;
    }
    int j;
    if (paramIInterface == null) {
      j = 0;
    } else {
      j = 1;
    }
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    m6.j.b(bool);
    Object localObject1 = zzp;
    i locali;
    try
    {
      zzv = paramInt;
      zzs = paramIInterface;
      locali = null;
      if (paramInt == 1) {
        break label635;
      }
      if ((paramInt != 2) && (paramInt != 3))
      {
        if (paramInt != 4) {
          break label722;
        }
        m6.j.i(paramIInterface);
        onConnectedLocked(paramIInterface);
        break label722;
      }
      paramIInterface = zzu;
      if (paramIInterface != null)
      {
        localObject2 = zza;
        if (localObject2 != null)
        {
          localObject3 = a;
          localObject2 = b;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("Calling connect() while still connected, missing disconnect() for ");
          ((StringBuilder)localObject4).append((String)localObject3);
          ((StringBuilder)localObject4).append(" on ");
          ((StringBuilder)localObject4).append((String)localObject2);
          Log.e("GmsClient", ((StringBuilder)localObject4).toString());
          localObject4 = zzn;
          localObject5 = zza.a;
          m6.j.i(localObject5);
          localObject3 = zza.b;
          zze();
          bool = zza.c;
          localObject4.getClass();
          localObject2 = new m6/p0;
          ((p0)localObject2).<init>((String)localObject5, (String)localObject3, bool);
          ((m6.c)localObject4).c((p0)localObject2, paramIInterface);
          zzd.incrementAndGet();
        }
      }
    }
    finally
    {
      break label726;
    }
    Object localObject3 = new com/google/android/gms/common/internal/i;
    ((i)localObject3).<init>(this, zzd.get());
    zzu = ((i)localObject3);
    if ((zzv == 3) && (getLocalStartServiceAction() != null))
    {
      paramIInterface = new m6/v0;
      paramIInterface.<init>(getContext().getPackageName(), getLocalStartServiceAction(), false);
    }
    else
    {
      paramIInterface = new v0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
    }
    zza = paramIInterface;
    if ((c) && (getMinApkVersion() < 17895000))
    {
      paramIInterface = new java/lang/IllegalStateException;
      paramIInterface.<init>("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(zza.a)));
      throw paramIInterface;
    }
    m6.c localc = zzn;
    Object localObject2 = zza.a;
    m6.j.i(localObject2);
    String str = zza.b;
    Object localObject4 = zze();
    boolean bool = zza.c;
    Object localObject5 = getBindServiceExecutor();
    paramIInterface = new m6/p0;
    paramIInterface.<init>((String)localObject2, str, bool);
    localObject3 = localc.b(paramIInterface, (ServiceConnection)localObject3, (String)localObject4, (Executor)localObject5);
    if (!((j6.b)localObject3).D())
    {
      localObject2 = zza;
      paramIInterface = a;
      localObject2 = b;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("unable to connect to service: ");
      ((StringBuilder)localObject4).append(paramIInterface);
      ((StringBuilder)localObject4).append(" on ");
      ((StringBuilder)localObject4).append((String)localObject2);
      Log.w("GmsClient", ((StringBuilder)localObject4).toString());
      i = b;
      paramInt = i;
      if (i == -1) {
        paramInt = 16;
      }
      paramIInterface = locali;
      if (c != null)
      {
        paramIInterface = new android/os/Bundle;
        paramIInterface.<init>();
        paramIInterface.putParcelable("pendingIntent", c);
      }
      zzl(paramInt, paramIInterface, zzd.get());
      break label722;
      label635:
      locali = zzu;
      if (locali != null)
      {
        paramIInterface = zzn;
        localObject4 = zza.a;
        m6.j.i(localObject4);
        localObject3 = zza.b;
        zze();
        bool = zza.c;
        paramIInterface.getClass();
        localObject2 = new m6/p0;
        ((p0)localObject2).<init>((String)localObject4, (String)localObject3, bool);
        paramIInterface.c((p0)localObject2, locali);
        zzu = null;
      }
    }
    label722:
    return;
    label726:
    throw paramIInterface;
  }
  
  public void checkAvailabilityAndConnect()
  {
    int i = zzo.c(zzl, getMinApkVersion());
    if (i != 0)
    {
      zzp(1, null);
      triggerNotAvailable(new d(), i, null);
      return;
    }
    connect(new d());
  }
  
  public final void checkConnected()
  {
    if (isConnected()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  public void connect(c paramc)
  {
    if (paramc != null)
    {
      zzc = paramc;
      zzp(2, null);
      return;
    }
    throw new NullPointerException("Connection progress callbacks cannot be null.");
  }
  
  public abstract T createServiceInterface(IBinder paramIBinder);
  
  public void disconnect()
  {
    zzd.incrementAndGet();
    synchronized (zzt)
    {
      int i = zzt.size();
      int j = 0;
      while (j < i) {
        synchronized ((k0)zzt.get(j))
        {
          a = null;
          j++;
        }
      }
    }
  }
  
  public void disconnect(String paramString)
  {
    zzk = paramString;
    disconnect();
  }
  
  public void dump(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    synchronized (zzp)
    {
      int i = zzv;
      paramArrayOfString = zzs;
      synchronized (zzq)
      {
        Object localObject1 = zzr;
        paramPrintWriter.append(paramString).append("mConnectState=");
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i != 5) {
                  ??? = "UNKNOWN";
                } else {
                  ??? = "DISCONNECTING";
                }
              }
              else {
                ??? = "CONNECTED";
              }
            }
            else {
              ??? = "LOCAL_CONNECTING";
            }
          }
          else {
            ??? = "REMOTE_CONNECTING";
          }
        }
        else {
          ??? = "DISCONNECTED";
        }
        paramPrintWriter.print(???);
        paramPrintWriter.append(" mService=");
        if (paramArrayOfString == null) {
          paramPrintWriter.append("null");
        } else {
          paramPrintWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
        }
        paramPrintWriter.append(" mServiceBroker=");
        if (localObject1 == null) {
          paramPrintWriter.println("null");
        } else {
          paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)localObject1).asBinder())));
        }
        paramArrayOfString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        Object localObject2;
        long l;
        if (zzh > 0L)
        {
          localObject2 = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          l = zzh;
          ??? = paramArrayOfString.format(new Date(l));
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(l);
          ((StringBuilder)localObject1).append(" ");
          ((StringBuilder)localObject1).append(???);
          ((PrintWriter)localObject2).println(((StringBuilder)localObject1).toString());
        }
        if (zzg > 0L)
        {
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          i = zzf;
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3) {
                ??? = String.valueOf(i);
              } else {
                ??? = "CAUSE_DEAD_OBJECT_EXCEPTION";
              }
            }
            else {
              ??? = "CAUSE_NETWORK_LOST";
            }
          }
          else {
            ??? = "CAUSE_SERVICE_DISCONNECTED";
          }
          paramPrintWriter.append(???);
          localObject1 = paramPrintWriter.append(" lastSuspendedTime=");
          l = zzg;
          ??? = paramArrayOfString.format(new Date(l));
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(l);
          ((StringBuilder)localObject2).append(" ");
          ((StringBuilder)localObject2).append(???);
          ((PrintWriter)localObject1).println(((StringBuilder)localObject2).toString());
        }
        if (zzj > 0L)
        {
          paramPrintWriter.append(paramString).append("lastFailedStatus=").append(k6.c.a(zzi));
          paramString = paramPrintWriter.append(" lastFailedTime=");
          l = zzj;
          ??? = paramArrayOfString.format(new Date(l));
          paramPrintWriter = new StringBuilder();
          paramPrintWriter.append(l);
          paramPrintWriter.append(" ");
          paramPrintWriter.append(???);
          paramString.println(paramPrintWriter.toString());
        }
        return;
      }
    }
  }
  
  public boolean enableLocalFallback()
  {
    return false;
  }
  
  public Account getAccount()
  {
    return null;
  }
  
  public j6.d[] getApiFeatures()
  {
    return zze;
  }
  
  public x6.a getAttributionSourceWrapper()
  {
    return null;
  }
  
  public final j6.d[] getAvailableFeatures()
  {
    l0 locall0 = zzE;
    if (locall0 == null) {
      return null;
    }
    return b;
  }
  
  public Executor getBindServiceExecutor()
  {
    return null;
  }
  
  public Bundle getConnectionHint()
  {
    return null;
  }
  
  public final Context getContext()
  {
    return zzl;
  }
  
  public String getEndpointPackageName()
  {
    if (isConnected())
    {
      v0 localv0 = zza;
      if (localv0 != null) {
        return b;
      }
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public int getGCoreServiceId()
  {
    return zzy;
  }
  
  public Bundle getGetServiceRequestExtraArgs()
  {
    return new Bundle();
  }
  
  public String getLastDisconnectMessage()
  {
    return zzk;
  }
  
  public String getLocalStartServiceAction()
  {
    return null;
  }
  
  public final Looper getLooper()
  {
    return zzm;
  }
  
  public int getMinApkVersion()
  {
    return f.a;
  }
  
  public void getRemoteService(IAccountAccessor arg1, Set<Scope> paramSet)
  {
    Object localObject1 = getGetServiceRequestExtraArgs();
    int i = Build.VERSION.SDK_INT;
    String str = zzA;
    int j = zzy;
    i = f.a;
    Scope[] arrayOfScope = b.w;
    Object localObject2 = new Bundle();
    j6.d[] arrayOfd = b.x;
    localObject2 = new b(6, j, i, null, null, arrayOfScope, (Bundle)localObject2, null, arrayOfd, arrayOfd, true, 0, false, str);
    d = zzl.getPackageName();
    o = ((Bundle)localObject1);
    if (paramSet != null) {
      f = ((Scope[])paramSet.toArray(new Scope[0]));
    }
    if (requiresSignIn())
    {
      localObject1 = getAccount();
      paramSet = (Set<Scope>)localObject1;
      if (localObject1 == null) {
        paramSet = new Account("<<default account>>", "com.google");
      }
      p = paramSet;
      if (??? != null) {
        e = ???.asBinder();
      }
    }
    else if (requiresAccount())
    {
      p = getAccount();
    }
    q = zze;
    r = getApiFeatures();
    if (usesClientTelemetry()) {
      u = true;
    }
    try
    {
      try
      {
        synchronized (zzq)
        {
          paramSet = zzr;
          if (paramSet != null)
          {
            localObject1 = new com/google/android/gms/common/internal/zzd;
            ((zzd)localObject1).<init>(this, zzd.get());
            paramSet.D((e)localObject1, (b)localObject2);
          }
          else
          {
            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
          }
          return;
        }
        Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      }
      catch (RuntimeException ???) {}catch (RemoteException ???) {}
      onPostInitHandler(8, null, null, zzd.get());
      return;
    }
    catch (SecurityException ???)
    {
      throw ???;
    }
    catch (DeadObjectException ???)
    {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      triggerConnectionSuspended(3);
    }
  }
  
  public Set<Scope> getScopes()
  {
    return Collections.emptySet();
  }
  
  public final T getService()
  {
    synchronized (zzp)
    {
      if (zzv != 5)
      {
        checkConnected();
        localObject2 = zzs;
        m6.j.j(localObject2, "Client is connected but service is null");
        return (T)localObject2;
      }
      Object localObject2 = new android/os/DeadObjectException;
      ((DeadObjectException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public IBinder getServiceBrokerBinder()
  {
    synchronized (zzq)
    {
      Object localObject2 = zzr;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((IInterface)localObject2).asBinder();
      return (IBinder)localObject2;
    }
  }
  
  public abstract String getServiceDescriptor();
  
  public Intent getSignInIntent()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public abstract String getStartServiceAction();
  
  public String getStartServicePackage()
  {
    return "com.google.android.gms";
  }
  
  public m6.b getTelemetryConfiguration()
  {
    l0 locall0 = zzE;
    if (locall0 == null) {
      return null;
    }
    return d;
  }
  
  public boolean getUseDynamicLookup()
  {
    return getMinApkVersion() >= 211700000;
  }
  
  public boolean hasConnectionInfo()
  {
    return zzE != null;
  }
  
  public boolean isConnected()
  {
    synchronized (zzp)
    {
      boolean bool;
      if (zzv == 4) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public boolean isConnecting()
  {
    synchronized (zzp)
    {
      int i = zzv;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 2) {
        if (i == 3) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
  }
  
  public void onConnectedLocked(T paramT)
  {
    zzh = System.currentTimeMillis();
  }
  
  public void onConnectionFailed(j6.b paramb)
  {
    zzi = b;
    zzj = System.currentTimeMillis();
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzf = paramInt;
    zzg = System.currentTimeMillis();
  }
  
  public void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    paramIBinder = new j(this, paramInt1, paramIBinder, paramBundle);
    paramIBinder = zzb.obtainMessage(1, paramInt2, -1, paramIBinder);
    zzb.sendMessage(paramIBinder);
  }
  
  public void onUserSignOut(e parame)
  {
    parame = (c0)parame;
    a.A.v.post(new b0(parame));
  }
  
  public boolean providesSignIn()
  {
    return false;
  }
  
  public boolean requiresAccount()
  {
    return false;
  }
  
  public boolean requiresGooglePlayServices()
  {
    return true;
  }
  
  public boolean requiresSignIn()
  {
    return false;
  }
  
  public void setAttributionSourceWrapper(x6.a parama) {}
  
  public void setAttributionTag(String paramString)
  {
    zzA = paramString;
  }
  
  public void triggerConnectionSuspended(int paramInt)
  {
    int i = zzd.get();
    Message localMessage = zzb.obtainMessage(6, i, paramInt);
    zzb.sendMessage(localMessage);
  }
  
  public void triggerNotAvailable(c paramc, int paramInt, PendingIntent paramPendingIntent)
  {
    if (paramc != null)
    {
      zzc = paramc;
      int i = zzd.get();
      paramc = zzb.obtainMessage(3, i, paramInt, paramPendingIntent);
      zzb.sendMessage(paramc);
      return;
    }
    throw new NullPointerException("Connection progress callbacks cannot be null.");
  }
  
  public boolean usesClientTelemetry()
  {
    return false;
  }
  
  public final String zze()
  {
    String str1 = zzz;
    String str2 = str1;
    if (str1 == null) {
      str2 = zzl.getClass().getName();
    }
    return str2;
  }
  
  public final void zzl(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    paramBundle = new k(this, paramInt1, paramBundle);
    paramBundle = zzb.obtainMessage(7, paramInt2, -1, paramBundle);
    zzb.sendMessage(paramBundle);
  }
  
  public static abstract interface a
  {
    public abstract void r(int paramInt);
    
    public abstract void s(Bundle paramBundle);
  }
  
  public static abstract interface b
  {
    public abstract void g(j6.b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void a(j6.b paramb);
  }
  
  public final class d
    implements a.c
  {
    public d() {}
    
    public final void a(j6.b paramb)
    {
      if (paramb.D())
      {
        paramb = a.this;
        paramb.getRemoteService(null, paramb.getScopes());
        return;
      }
      if (a.zzc(a.this) != null) {
        a.zzc(a.this).g(paramb);
      }
    }
  }
  
  public static abstract interface e {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */