package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l6.b0;
import l6.c0;
import m6.k0;
import m6.l0;
import m6.p0;
import m6.v0;

/* loaded from: classes.dex */
public abstract class a<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile x6.a zzB;
    private j6.b zzC;
    private boolean zzD;
    private volatile l0 zzE;
    public v0 zza;
    public final Handler zzb;
    public c zzc;
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final m6.c zzn;
    private final j6.f zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private i zzu;
    private int zzv;
    private final InterfaceC0041a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final j6.d[] zze = new j6.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0041a {
        void r(int i10);

        void s(Bundle bundle);
    }

    public interface b {
        void g(j6.b bVar);
    }

    public interface c {
        void a(j6.b bVar);
    }

    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.a.c
        public final void a(j6.b bVar) {
            if (bVar.D()) {
                a aVar = a.this;
                aVar.getRemoteService(null, aVar.getScopes());
            } else if (a.this.zzx != null) {
                a.this.zzx.g(bVar);
            }
        }
    }

    public interface e {
    }

    public a(Context context, Handler handler, m6.c cVar, j6.f fVar, int i10, InterfaceC0041a interfaceC0041a, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.zzl = context;
        if (handler == null) {
            throw new NullPointerException("Handler must not be null");
        }
        this.zzb = handler;
        this.zzm = handler.getLooper();
        if (cVar == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.zzn = cVar;
        if (fVar == null) {
            throw new NullPointerException("API availability must not be null");
        }
        this.zzo = fVar;
        this.zzy = i10;
        this.zzw = interfaceC0041a;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r0.f10287a >= r2.f10287a) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzj(com.google.android.gms.common.internal.a r2, m6.l0 r3) {
        /*
            r2.zzE = r3
            boolean r2 = r2.usesClientTelemetry()
            if (r2 == 0) goto L2c
            m6.b r2 = r3.f10295d
            m6.k r3 = m6.k.a()
            if (r2 != 0) goto L12
            r2 = 0
            goto L14
        L12:
            m6.l r2 = r2.f10253a
        L14:
            monitor-enter(r3)
            if (r2 != 0) goto L1d
            m6.l r2 = m6.k.f10282c     // Catch: java.lang.Throwable -> L29
        L19:
            r3.f10283a = r2     // Catch: java.lang.Throwable -> L29
        L1b:
            monitor-exit(r3)
            goto L28
        L1d:
            m6.l r0 = r3.f10283a     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            int r0 = r0.f10287a     // Catch: java.lang.Throwable -> L29
            int r1 = r2.f10287a     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L1b
            goto L19
        L28:
            return
        L29:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.a.zzj(com.google.android.gms.common.internal.a, m6.l0):void");
    }

    public static /* bridge */ /* synthetic */ void zzk(a aVar, int i10) {
        int i11;
        int i12;
        synchronized (aVar.zzp) {
            i11 = aVar.zzv;
        }
        if (i11 == 3) {
            aVar.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = aVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, aVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(a aVar, int i10, int i11, IInterface iInterface) {
        synchronized (aVar.zzp) {
            if (aVar.zzv != i10) {
                return false;
            }
            aVar.zzp(i11, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(a aVar) {
        if (aVar.zzD || TextUtils.isEmpty(aVar.getServiceDescriptor()) || TextUtils.isEmpty(aVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(aVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i10, IInterface iInterface) {
        v0 v0Var;
        m6.j.b((i10 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    i iVar = this.zzu;
                    if (iVar != null) {
                        m6.c cVar = this.zzn;
                        String str = this.zza.f10329a;
                        m6.j.i(str);
                        String str2 = this.zza.f10330b;
                        zze();
                        boolean z10 = this.zza.f10331c;
                        cVar.getClass();
                        cVar.c(new p0(str, str2, z10), iVar);
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    i iVar2 = this.zzu;
                    if (iVar2 != null && (v0Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + v0Var.f10329a + " on " + v0Var.f10330b);
                        m6.c cVar2 = this.zzn;
                        String str3 = this.zza.f10329a;
                        m6.j.i(str3);
                        String str4 = this.zza.f10330b;
                        zze();
                        boolean z11 = this.zza.f10331c;
                        cVar2.getClass();
                        cVar2.c(new p0(str3, str4, z11), iVar2);
                        this.zzd.incrementAndGet();
                    }
                    i iVar3 = new i(this, this.zzd.get());
                    this.zzu = iVar3;
                    v0 v0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new v0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new v0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = v0Var2;
                    if (v0Var2.f10331c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f10329a)));
                    }
                    m6.c cVar3 = this.zzn;
                    String str5 = this.zza.f10329a;
                    m6.j.i(str5);
                    j6.b b10 = cVar3.b(new p0(str5, this.zza.f10330b, this.zza.f10331c), iVar3, zze(), getBindServiceExecutor());
                    if (!b10.D()) {
                        v0 v0Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + v0Var3.f10329a + " on " + v0Var3.f10330b);
                        int i11 = b10.f8470b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b10.f8471c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b10.f8471c);
                        }
                        zzl(i11, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    m6.j.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c10 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c10 == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), c10, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k0 k0Var = (k0) this.zzt.get(i10);
                    synchronized (k0Var) {
                        k0Var.f10284a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            append.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) k6.c.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public j6.d[] getApiFeatures() {
        return zze;
    }

    public x6.a getAttributionSourceWrapper() {
        return null;
    }

    public final j6.d[] getAvailableFeatures() {
        l0 l0Var = this.zzE;
        if (l0Var == null) {
            return null;
        }
        return l0Var.f10293b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        v0 v0Var;
        if (!isConnected() || (v0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return v0Var.f10330b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return j6.f.f8489a;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = Build.VERSION.SDK_INT;
        String str = this.zzA;
        int i11 = this.zzy;
        int i12 = j6.f.f8489a;
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f2828w;
        Bundle bundle = new Bundle();
        j6.d[] dVarArr = com.google.android.gms.common.internal.b.f2829x;
        com.google.android.gms.common.internal.b bVar = new com.google.android.gms.common.internal.b(6, i11, i12, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        bVar.f2833d = this.zzl.getPackageName();
        bVar.f2835o = getServiceRequestExtraArgs;
        if (set != null) {
            bVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            bVar.f2836p = account;
            if (iAccountAccessor != null) {
                bVar.f2834e = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            bVar.f2836p = getAccount();
        }
        bVar.f2837q = zze;
        bVar.f2838r = getApiFeatures();
        if (usesClientTelemetry()) {
            bVar.f2840u = true;
        }
        try {
            synchronized (this.zzq) {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.D(new zzd(this, this.zzd.get()), bVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t = (T) this.zzs;
            m6.j.j(t, "Client is connected but service is null");
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public m6.b getTelemetryConfiguration() {
        l0 l0Var = this.zzE;
        if (l0Var == null) {
            return null;
        }
        return l0Var.f10295d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(j6.b bVar) {
        this.zzi = bVar.f8470b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new j(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        c0 c0Var = (c0) eVar;
        c0Var.f9638a.A.f9655v.post(new b0(c0Var));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(x6.a aVar) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        if (cVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new k(this, i10, bundle)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.a.InterfaceC0041a r13, com.google.android.gms.common.internal.a.b r14, java.lang.String r15) {
        /*
            r9 = this;
            m6.s0 r3 = m6.c.a(r10)
            j6.f r4 = j6.f.f8490b
            m6.j.i(r13)
            m6.j.i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.a.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.a$a, com.google.android.gms.common.internal.a$b, java.lang.String):void");
    }

    public a(Context context, Looper looper, m6.c cVar, j6.f fVar, int i10, InterfaceC0041a interfaceC0041a, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.zzl = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        this.zzm = looper;
        if (cVar == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.zzn = cVar;
        if (fVar == null) {
            throw new NullPointerException("API availability must not be null");
        }
        this.zzo = fVar;
        this.zzb = new h(this, looper);
        this.zzy = i10;
        this.zzw = interfaceC0041a;
        this.zzx = bVar;
        this.zzz = str;
    }
}
