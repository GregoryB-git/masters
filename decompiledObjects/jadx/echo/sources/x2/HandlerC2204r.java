package x2;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: x2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC2204r extends K2.i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2196j f21199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2204r(C2196j c2196j, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21199b = c2196j;
        this.f21198a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        int g7 = this.f21199b.g(this.f21198a);
        if (this.f21199b.j(g7)) {
            this.f21199b.o(this.f21198a, g7);
        }
    }
}
