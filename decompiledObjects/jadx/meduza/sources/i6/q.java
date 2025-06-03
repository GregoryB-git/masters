package i6;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.zact;
import e7.h0;
import e7.i5;
import e7.k3;
import e7.o4;
import e7.u6;
import e7.w4;
import java.util.concurrent.TimeUnit;
import l6.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7602a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7603b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f7602a = i10;
        this.f7603b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7602a) {
            case 0:
                break;
            case 1:
                ((g0) ((zact) this.f7603b).f2826u).b(new j6.b(4));
                return;
            case 2:
                Process.setThreadPriority(0);
                ((Runnable) this.f7603b).run();
                return;
            case 3:
                ((k3) this.f7603b).L();
                return;
            case 4:
                w4 w4Var = ((i5) this.f7603b).f4329c;
                ComponentName componentName = new ComponentName(((i5) this.f7603b).f4329c.zza(), "com.google.android.gms.measurement.AppMeasurementService");
                w4Var.l();
                if (w4Var.f4735e != null) {
                    w4Var.f4735e = null;
                    w4Var.zzj().f4067w.c("Disconnected from device MeasurementService", componentName);
                    w4Var.l();
                    w4Var.A();
                    return;
                }
                return;
            default:
                o4 o4Var = ((u6) this.f7603b).f4699a.F;
                if (o4Var == null) {
                    throw new IllegalStateException("Component not created");
                }
                o4Var.v(h0.f4283z.a(null).longValue());
                return;
        }
        while (true) {
            u uVar = (u) this.f7603b;
            synchronized (uVar) {
                if (uVar.f7610a == 2) {
                    if (uVar.f7613d.isEmpty()) {
                        uVar.c();
                    } else {
                        x xVar = (x) uVar.f7613d.poll();
                        uVar.f7614e.put(xVar.f7617a, xVar);
                        uVar.f.f7623b.schedule(new t(uVar, xVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(xVar)));
                        }
                        z zVar = uVar.f;
                        Messenger messenger = uVar.f7611b;
                        int i10 = xVar.f7619c;
                        Context context = zVar.f7622a;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = xVar.f7617a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", xVar.b());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle("data", xVar.f7620d);
                        obtain.setData(bundle);
                        try {
                            v vVar = uVar.f7612c;
                            Messenger messenger2 = vVar.f7615a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                k kVar = vVar.f7616b;
                                if (kVar == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                Messenger messenger3 = kVar.f7587a;
                                messenger3.getClass();
                                messenger3.send(obtain);
                            }
                        } catch (RemoteException e10) {
                            uVar.a(2, e10.getMessage());
                        }
                    }
                }
            }
        }
    }

    public q(Runnable runnable) {
        this.f7602a = 2;
        this.f7603b = runnable;
    }
}
