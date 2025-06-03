package A2;

import A2.AbstractC0317c;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import x2.C2188b;

/* loaded from: classes.dex */
public final class U extends M2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AbstractC0317c abstractC0317c, Looper looper) {
        super(looper);
        this.f393a = abstractC0317c;
    }

    public static final void a(Message message) {
        V v7 = (V) message.obj;
        v7.b();
        v7.e();
    }

    public static final boolean b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC0317c.a aVar;
        AbstractC0317c.a aVar2;
        C2188b c2188b;
        C2188b c2188b2;
        boolean z7;
        if (this.f393a.f412C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f393a.t()) || message.what == 5)) && !this.f393a.i()) {
            a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f393a.f438z = new C2188b(message.arg2);
            if (AbstractC0317c.h0(this.f393a)) {
                AbstractC0317c abstractC0317c = this.f393a;
                z7 = abstractC0317c.f410A;
                if (!z7) {
                    abstractC0317c.i0(3, null);
                    return;
                }
            }
            AbstractC0317c abstractC0317c2 = this.f393a;
            c2188b2 = abstractC0317c2.f438z;
            C2188b c2188b3 = c2188b2 != null ? abstractC0317c2.f438z : new C2188b(8);
            this.f393a.f428p.b(c2188b3);
            this.f393a.L(c2188b3);
            return;
        }
        if (i8 == 5) {
            AbstractC0317c abstractC0317c3 = this.f393a;
            c2188b = abstractC0317c3.f438z;
            C2188b c2188b4 = c2188b != null ? abstractC0317c3.f438z : new C2188b(8);
            this.f393a.f428p.b(c2188b4);
            this.f393a.L(c2188b4);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            C2188b c2188b5 = new C2188b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f393a.f428p.b(c2188b5);
            this.f393a.L(c2188b5);
            return;
        }
        if (i8 == 6) {
            this.f393a.i0(5, null);
            AbstractC0317c abstractC0317c4 = this.f393a;
            aVar = abstractC0317c4.f433u;
            if (aVar != null) {
                aVar2 = abstractC0317c4.f433u;
                aVar2.n(message.arg2);
            }
            this.f393a.M(message.arg2);
            AbstractC0317c.g0(this.f393a, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f393a.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((V) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
