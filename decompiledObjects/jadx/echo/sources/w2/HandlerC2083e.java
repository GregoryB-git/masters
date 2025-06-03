package w2;

import android.os.Looper;
import android.os.Message;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC2083e extends L2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2081c f20340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2083e(C2081c c2081c, Looper looper) {
        super(looper);
        this.f20340a = c2081c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2081c.d(this.f20340a, message);
    }
}
