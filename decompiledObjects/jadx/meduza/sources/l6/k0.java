package l6;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class k0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f9698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9699b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9701d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9702e;

    public k0(d dVar, int i10, a aVar, long j10, long j11) {
        this.f9698a = dVar;
        this.f9699b = i10;
        this.f9700c = aVar;
        this.f9701d = j10;
        this.f9702e = j11;
    }

    public static m6.b a(d0 d0Var, com.google.android.gms.common.internal.a aVar, int i10) {
        m6.b telemetryConfiguration = aVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f10254b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f10256d;
        boolean z10 = false;
        if (iArr == null) {
            int[] iArr2 = telemetryConfiguration.f;
            if (iArr2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= iArr2.length) {
                        break;
                    }
                    if (iArr2[i11] == i10) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (z10) {
                    return null;
                }
            }
        } else {
            int i12 = 0;
            while (true) {
                if (i12 >= iArr.length) {
                    break;
                }
                if (iArr[i12] == i10) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (!z10) {
                return null;
            }
        }
        if (d0Var.f9667z < telemetryConfiguration.f10257e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        int i14;
        if (this.f9698a.b()) {
            m6.l lVar = m6.k.a().f10283a;
            if (lVar == null || lVar.f10288b) {
                d0 d0Var = (d0) this.f9698a.f9652r.get(this.f9700c);
                if (d0Var != null) {
                    Object obj = d0Var.f9658b;
                    if (obj instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) obj;
                        int i15 = 0;
                        boolean z10 = this.f9701d > 0;
                        int gCoreServiceId = aVar.getGCoreServiceId();
                        int i16 = 100;
                        if (lVar != null) {
                            z10 &= lVar.f10289c;
                            int i17 = lVar.f10290d;
                            int i18 = lVar.f10291e;
                            i10 = lVar.f10287a;
                            if (aVar.hasConnectionInfo() && !aVar.isConnecting()) {
                                m6.b a10 = a(d0Var, aVar, this.f9699b);
                                if (a10 == null) {
                                    return;
                                }
                                boolean z11 = a10.f10255c && this.f9701d > 0;
                                i18 = a10.f10257e;
                                z10 = z11;
                            }
                            i12 = i17;
                            i11 = i18;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        d dVar = this.f9698a;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else {
                            if (!task.isCanceled()) {
                                Exception exception = task.getException();
                                if (exception instanceof k6.b) {
                                    Status status = ((k6.b) exception).getStatus();
                                    i16 = status.f2816a;
                                    j6.b bVar = status.f2819d;
                                    if (bVar != null) {
                                        i13 = bVar.f8470b;
                                        i15 = i16;
                                    }
                                } else {
                                    i15 = 101;
                                    i13 = -1;
                                }
                            }
                            i15 = i16;
                            i13 = -1;
                        }
                        if (z10) {
                            long j12 = this.f9701d;
                            long j13 = this.f9702e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i14 = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = currentTimeMillis;
                            j10 = j12;
                        } else {
                            j10 = 0;
                            j11 = 0;
                            i14 = -1;
                        }
                        dVar.getClass();
                        dVar.f9655v.sendMessage(dVar.f9655v.obtainMessage(18, new l0(new m6.g(this.f9699b, i15, i13, j10, j11, null, null, gCoreServiceId, i14), i10, i12, i11)));
                    }
                }
            }
        }
    }
}
