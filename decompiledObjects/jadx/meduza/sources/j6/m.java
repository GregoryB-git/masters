package j6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f8511b = eVar;
        this.f8510a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int b10 = this.f8511b.b(this.f8510a);
        AtomicBoolean atomicBoolean = j.f8500a;
        if (b10 != 1 && b10 != 2 && b10 != 3 && b10 != 9) {
            z10 = false;
        }
        if (z10) {
            e eVar = this.f8511b;
            Context context = this.f8510a;
            Intent a10 = eVar.a(context, "n", b10);
            eVar.g(context, b10, a10 == null ? null : PendingIntent.getActivity(context, 0, a10, 201326592));
        }
    }
}
