package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class e<T> extends g<T> {
    public final a f;

    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f15214a;

        public a(e<T> eVar) {
            this.f15214a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ec.i.e(context, "context");
            ec.i.e(intent, "intent");
            this.f15214a.f(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
        this.f = new a(this);
    }

    @Override // v2.g
    public final void c() {
        o2.j.d().a(f.f15215a, getClass().getSimpleName() + ": registering receiver");
        this.f15217b.registerReceiver(this.f, e());
    }

    @Override // v2.g
    public final void d() {
        o2.j.d().a(f.f15215a, getClass().getSimpleName() + ": unregistering receiver");
        this.f15217b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
