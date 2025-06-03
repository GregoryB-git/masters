package w2;

import A2.AbstractC0328n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: w2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC2095q implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public C2096r f20357c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f20360f;

    /* renamed from: a, reason: collision with root package name */
    public int f20355a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f20356b = new Messenger(new L2.f(Looper.getMainLooper(), new Handler.Callback() { // from class: w2.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC2095q serviceConnectionC2095q = ServiceConnectionC2095q.this;
            int i7 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i7);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (serviceConnectionC2095q) {
                try {
                    AbstractC2098t abstractC2098t = (AbstractC2098t) serviceConnectionC2095q.f20359e.get(i7);
                    if (abstractC2098t == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i7);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    serviceConnectionC2095q.f20359e.remove(i7);
                    serviceConnectionC2095q.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC2098t.c(new C2099u(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC2098t.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    public final Queue f20358d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f20359e = new SparseArray();

    public /* synthetic */ ServiceConnectionC2095q(w wVar, AbstractC2094p abstractC2094p) {
        this.f20360f = wVar;
    }

    public final synchronized void a(int i7, String str) {
        b(i7, str, null);
    }

    public final synchronized void b(int i7, String str, Throwable th) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i8 = this.f20355a;
            if (i8 == 0) {
                throw new IllegalStateException();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f20355a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f20355a = 4;
            D2.b b7 = D2.b.b();
            context = this.f20360f.f20368a;
            b7.c(context, this);
            C2099u c2099u = new C2099u(i7, str, th);
            Iterator it = this.f20358d.iterator();
            while (it.hasNext()) {
                ((AbstractC2098t) it.next()).c(c2099u);
            }
            this.f20358d.clear();
            for (int i9 = 0; i9 < this.f20359e.size(); i9++) {
                ((AbstractC2098t) this.f20359e.valueAt(i9)).c(c2099u);
            }
            this.f20359e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f20360f.f20369b;
        scheduledExecutorService.execute(new Runnable() { // from class: w2.l
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC2098t abstractC2098t;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC2095q serviceConnectionC2095q = ServiceConnectionC2095q.this;
                while (true) {
                    synchronized (serviceConnectionC2095q) {
                        try {
                            if (serviceConnectionC2095q.f20355a != 2) {
                                return;
                            }
                            if (serviceConnectionC2095q.f20358d.isEmpty()) {
                                serviceConnectionC2095q.f();
                                return;
                            }
                            abstractC2098t = (AbstractC2098t) serviceConnectionC2095q.f20358d.poll();
                            serviceConnectionC2095q.f20359e.put(abstractC2098t.f20363a, abstractC2098t);
                            scheduledExecutorService2 = serviceConnectionC2095q.f20360f.f20369b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: w2.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC2095q.this.e(abstractC2098t.f20363a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(abstractC2098t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    context = serviceConnectionC2095q.f20360f.f20368a;
                    Messenger messenger = serviceConnectionC2095q.f20356b;
                    Message obtain = Message.obtain();
                    obtain.what = abstractC2098t.f20365c;
                    obtain.arg1 = abstractC2098t.f20363a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC2098t.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC2098t.f20366d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC2095q.f20357c.a(obtain);
                    } catch (RemoteException e7) {
                        serviceConnectionC2095q.a(2, e7.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f20355a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i7) {
        AbstractC2098t abstractC2098t = (AbstractC2098t) this.f20359e.get(i7);
        if (abstractC2098t != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i7);
            Log.w("MessengerIpcClient", sb.toString());
            this.f20359e.remove(i7);
            abstractC2098t.c(new C2099u(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        Context context;
        try {
            if (this.f20355a == 2 && this.f20358d.isEmpty() && this.f20359e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f20355a = 3;
                D2.b b7 = D2.b.b();
                context = this.f20360f.f20368a;
                b7.c(context, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(AbstractC2098t abstractC2098t) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i7 = this.f20355a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f20358d.add(abstractC2098t);
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            this.f20358d.add(abstractC2098t);
            c();
            return true;
        }
        this.f20358d.add(abstractC2098t);
        AbstractC0328n.l(this.f20355a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f20355a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            D2.b b7 = D2.b.b();
            context = this.f20360f.f20368a;
            if (b7.a(context, intent, this, 1)) {
                scheduledExecutorService = this.f20360f.f20369b;
                scheduledExecutorService.schedule(new Runnable() { // from class: w2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC2095q.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e7) {
            b(0, "Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f20360f.f20369b;
        scheduledExecutorService.execute(new Runnable() { // from class: w2.n
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2095q serviceConnectionC2095q = ServiceConnectionC2095q.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC2095q) {
                    if (iBinder2 == null) {
                        serviceConnectionC2095q.a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC2095q.f20357c = new C2096r(iBinder2);
                        serviceConnectionC2095q.f20355a = 2;
                        serviceConnectionC2095q.c();
                    } catch (RemoteException e7) {
                        serviceConnectionC2095q.a(0, e7.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f20360f.f20369b;
        scheduledExecutorService.execute(new Runnable() { // from class: w2.k
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2095q.this.a(2, "Service disconnected");
            }
        });
    }
}
