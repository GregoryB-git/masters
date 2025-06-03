package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import ec.i;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1388a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1389b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final a f1390c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final MultiInstanceInvalidationService$binder$1 f1391d = new MultiInstanceInvalidationService$binder$1(this);

    public static final class a extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            i.e(iMultiInstanceInvalidationCallback, "callback");
            i.e(obj, "cookie");
            MultiInstanceInvalidationService.this.f1389b.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f1391d;
    }
}
