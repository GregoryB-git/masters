// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.util.Log;
import android.app.PendingIntent;
import android.os.IInterface;
import x2.b;
import android.os.Message;
import android.os.Looper;
import M2.e;

public final class U extends e
{
    public final /* synthetic */ c a;
    
    public U(final c a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public static final void a(final Message message) {
        final V v = (V)message.obj;
        v.b();
        v.e();
    }
    
    public static final boolean b(final Message message) {
        final int what = message.what;
        return what == 2 || what == 1 || what == 7;
    }
    
    public final void handleMessage(final Message message) {
        if (this.a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
            }
            return;
        }
        final int what = message.what;
        if ((what == 1 || what == 7 || (what == 4 && !this.a.t()) || message.what == 5) && !this.a.i()) {
            a(message);
            return;
        }
        final int what2 = message.what;
        PendingIntent pendingIntent = null;
        if (what2 == 4) {
            c.Z(this.a, new b(message.arg2));
            if (c.h0(this.a)) {
                final c a = this.a;
                if (!c.f0(a)) {
                    c.b0(a, 3, (IInterface)null);
                    return;
                }
            }
            final c a2 = this.a;
            b t;
            if (c.T(a2) != null) {
                t = c.T(a2);
            }
            else {
                t = new b(8);
            }
            this.a.p.b(t);
            this.a.L(t);
            return;
        }
        if (what2 == 5) {
            final c a3 = this.a;
            b t2;
            if (c.T(a3) != null) {
                t2 = c.T(a3);
            }
            else {
                t2 = new b(8);
            }
            this.a.p.b(t2);
            this.a.L(t2);
            return;
        }
        if (what2 == 3) {
            final Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent)obj;
            }
            final b b = new b(message.arg2, pendingIntent);
            this.a.p.b(b);
            this.a.L(b);
            return;
        }
        if (what2 == 6) {
            c.b0(this.a, 5, (IInterface)null);
            final c a4 = this.a;
            if (c.U(a4) != null) {
                c.U(a4).n(message.arg2);
            }
            this.a.M(message.arg2);
            c.g0(this.a, 5, 1, (IInterface)null);
            return;
        }
        if (what2 == 2 && !this.a.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((V)message.obj).c();
            return;
        }
        final int what3 = message.what;
        final StringBuilder sb = new StringBuilder();
        sb.append("Don't know how to handle message: ");
        sb.append(what3);
        Log.wtf("GmsClient", sb.toString(), (Throwable)new Exception());
    }
}
