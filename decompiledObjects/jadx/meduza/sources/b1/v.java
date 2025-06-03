package b1;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c8.a1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.i6;
import e7.j2;
import e7.t6;
import e7.y4;
import gb.q1;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import mobileproxy.LogWriter;
import mobileproxy.Mobileproxy;
import mobileproxy.Proxy;

/* loaded from: classes.dex */
public final class v implements z4.d0, t6, OnFailureListener, OnSuccessListener, Continuation, q1, p9.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f1801a;

    public /* synthetic */ v(int i10) {
        if (i10 == 8) {
            this.f1801a = new AtomicLong();
        } else if (i10 != 9) {
            this.f1801a = new HashMap();
        }
    }

    public static v f(Object obj) {
        if (obj != null) {
            return new v(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // e7.t6
    public void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((i6) this.f1801a).zzl().u(new y4(this, str, str2, bundle));
            return;
        }
        Object obj = this.f1801a;
        if (((i6) obj).t != null) {
            ((i6) obj).t.zzj().f4060o.c("AppId not known when logging event", str2);
        }
    }

    @Override // gb.q1
    public void b() {
        ((AtomicLong) this.f1801a).getAndAdd(1L);
    }

    @Override // z4.d0
    public long c() {
        long j10 = Long.MAX_VALUE;
        for (z4.d0 d0Var : (z4.d0[]) this.f1801a) {
            long c10 = d0Var.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // z4.d0
    public boolean d(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (z4.d0 d0Var : (z4.d0[]) this.f1801a) {
                long c11 = d0Var.c();
                boolean z12 = c11 != Long.MIN_VALUE && c11 <= j10;
                if (c11 == c10 || z12) {
                    z10 |= d0Var.d(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // z4.d0
    public long g() {
        long j10 = Long.MAX_VALUE;
        for (z4.d0 d0Var : (z4.d0[]) this.f1801a) {
            long g10 = d0Var.g();
            if (g10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // qb.a
    public Object get() {
        return this.f1801a;
    }

    @Override // z4.d0
    public void h(long j10) {
        for (z4.d0 d0Var : (z4.d0[]) this.f1801a) {
            d0Var.h(j10);
        }
    }

    @Override // z4.d0
    public boolean isLoading() {
        for (z4.d0 d0Var : (z4.d0[]) this.f1801a) {
            if (d0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    public String k(String str, String str2) {
        LogWriter newStderrLogWriter = Mobileproxy.newStderrLogWriter();
        ec.i.d(newStderrLogWriter, "newStderrLogWriter(...)");
        Proxy runProxy = Mobileproxy.runProxy("127.0.0.1:", Mobileproxy.newSmartStreamDialer(Mobileproxy.newListFromLines(str2), str, newStderrLogWriter));
        this.f1801a = runProxy;
        ec.i.b(runProxy);
        String address = runProxy.address();
        ec.i.d(address, "address(...)");
        return address;
    }

    public boolean m() {
        return TextUtils.isEmpty(((j2) this.f1801a).f4361b) && ((j2) this.f1801a).zzj().u(3);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof u7.i) {
            c8.r.f2508g.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            c8.r rVar = (c8.r) ((i6.t) this.f1801a).f7609c;
            int i10 = (int) rVar.f2510b;
            rVar.f2510b = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * rVar.f2510b : i10 != 960 ? 30L : 960L;
            rVar.f2509a = (rVar.f2510b * 1000) + System.currentTimeMillis();
            c8.r.f2508g.e("Scheduling refresh for " + rVar.f2509a, new Object[0]);
            rVar.f2513e.postDelayed(rVar.f, rVar.f2510b * 1000);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((TaskCompletionSource) this.f1801a).setResult(new a1((String) obj, null, null));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((r9.e) this.f1801a).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        String valueOf = String.valueOf(bundle);
        Log.w("FirebaseInstanceId", defpackage.g.f(new StringBuilder(valueOf.length() + 21), "Unexpected response: ", valueOf), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public /* synthetic */ v(Object obj) {
        this.f1801a = obj;
    }

    public /* synthetic */ v(Object obj, int i10) {
        this.f1801a = obj;
    }
}
