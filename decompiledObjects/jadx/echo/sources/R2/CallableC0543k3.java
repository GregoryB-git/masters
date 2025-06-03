package R2;

import A2.AbstractC0328n;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0917g7;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: R2.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0543k3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5374o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f5375p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5376q;

    public CallableC0543k3(R2 r22, W5 w52, Bundle bundle) {
        this.f5376q = r22;
        this.f5374o = w52;
        this.f5375p = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5376q.f4983b;
        d52.o0();
        d53 = this.f5376q.f4983b;
        W5 w52 = this.f5374o;
        Bundle bundle = this.f5375p;
        d53.e().n();
        if (!C0917g7.a() || !d53.c0().B(w52.f5115o, K.f4789L0) || w52.f5115o == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    d53.j().G().a("Uri sources and timestamps do not match");
                } else {
                    for (int i7 = 0; i7 < intArray.length; i7++) {
                        C0574p e02 = d53.e0();
                        String str = w52.f5115o;
                        int i8 = intArray[i7];
                        long j7 = longArray[i7];
                        AbstractC0328n.e(str);
                        e02.n();
                        e02.u();
                        try {
                            int delete = e02.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i8), String.valueOf(j7)});
                            e02.j().K().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i8), Long.valueOf(j7));
                        } catch (SQLiteException e7) {
                            e02.j().G().c("Error pruning trigger URIs. appId", Y1.v(str), e7);
                        }
                    }
                }
            }
        }
        return d53.e0().K0(w52.f5115o);
    }
}
