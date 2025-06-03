package i6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public v f7612c;
    public final /* synthetic */ z f;

    /* renamed from: a, reason: collision with root package name */
    public int f7610a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f7611b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: i6.s
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            u uVar = u.this;
            synchronized (uVar) {
                x xVar = (x) uVar.f7614e.get(i10);
                if (xVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                    return true;
                }
                uVar.f7614e.remove(i10);
                uVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    xVar.c(new z3.f("Not supported by GmsCore", (SecurityException) null));
                    return true;
                }
                xVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7613d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f7614e = new SparseArray();

    public /* synthetic */ u(z zVar) {
        this.f = zVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i11 = this.f7610a;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f7610a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f7610a = 4;
        u6.a.b().c(this.f.f7622a, this);
        z3.f fVar = new z3.f(str, securityException);
        Iterator it = this.f7613d.iterator();
        while (it.hasNext()) {
            ((x) it.next()).c(fVar);
        }
        this.f7613d.clear();
        for (int i12 = 0; i12 < this.f7614e.size(); i12++) {
            ((x) this.f7614e.valueAt(i12)).c(fVar);
        }
        this.f7614e.clear();
    }

    public final synchronized void c() {
        if (this.f7610a == 2 && this.f7613d.isEmpty() && this.f7614e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7610a = 3;
            u6.a.b().c(this.f.f7622a, this);
        }
    }

    public final synchronized boolean d(x xVar) {
        int i10 = this.f7610a;
        int i11 = 1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f7613d.add(xVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f7613d.add(xVar);
            this.f.f7623b.execute(new q(this, i12));
            return true;
        }
        this.f7613d.add(xVar);
        if (!(this.f7610a == 0)) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7610a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (u6.a.b().a(this.f.f7622a, intent, this, 1)) {
                this.f.f7623b.schedule(new f(this, i11), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.f7623b.execute(new p(0, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.f7623b.execute(new r(this, 0));
    }
}
