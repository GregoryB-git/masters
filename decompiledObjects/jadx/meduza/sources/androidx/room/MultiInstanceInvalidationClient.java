package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import b.d;
import ec.i;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.e;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1377c;

    /* renamed from: d, reason: collision with root package name */
    public int f1378d;

    /* renamed from: e, reason: collision with root package name */
    public e.c f1379e;
    public IMultiInstanceInvalidationService f;

    /* renamed from: g, reason: collision with root package name */
    public final MultiInstanceInvalidationClient$callback$1 f1380g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f1381h;

    /* renamed from: i, reason: collision with root package name */
    public final u.a f1382i;

    /* renamed from: j, reason: collision with root package name */
    public final d f1383j;

    public static final class a extends e.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // p1.e.c
        public final void a(Set<String> set) {
            i.e(set, "tables");
            if (MultiInstanceInvalidationClient.this.f1381h.get()) {
                return;
            }
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f;
                if (iMultiInstanceInvalidationService != null) {
                    int i10 = multiInstanceInvalidationClient.f1378d;
                    Object[] array = set.toArray(new String[0]);
                    i.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    iMultiInstanceInvalidationService.K2(i10, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.e(componentName, "name");
            i.e(iBinder, "service");
            MultiInstanceInvalidationClient.this.f = IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f1377c.execute(multiInstanceInvalidationClient.f1382i);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            i.e(componentName, "name");
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f1377c.execute(multiInstanceInvalidationClient.f1383j);
            MultiInstanceInvalidationClient.this.f = null;
        }
    }

    public MultiInstanceInvalidationClient(Context context, String str, Intent intent, e eVar, Executor executor) {
        this.f1375a = str;
        this.f1376b = eVar;
        this.f1377c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f1380g = new MultiInstanceInvalidationClient$callback$1(this);
        this.f1381h = new AtomicBoolean(false);
        b bVar = new b();
        this.f1382i = new u.a(this, 3);
        this.f1383j = new d(this, 4);
        Object[] array = eVar.f12770d.keySet().toArray(new String[0]);
        i.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f1379e = new a((String[]) array);
        applicationContext.bindService(intent, bVar, 1);
    }
}
