/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicInteger
 */
package A2;

import A2.V;
import A2.c;
import M2.e;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import x2.b;

public final class U
extends e {
    public final /* synthetic */ c a;

    public U(c c8, Looper looper) {
        this.a = c8;
        super(looper);
    }

    public static final void a(Message object) {
        object = (V)object.obj;
        object.b();
        object.e();
    }

    public static final boolean b(Message message) {
        int n8 = message.what;
        if (n8 != 2 && n8 != 1) {
            if (n8 == 7) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void handleMessage(Message object) {
        if (this.a.C.get() != object.arg1) {
            if (U.b((Message)object)) {
                U.a((Message)object);
            }
            return;
        }
        int n8 = object.what;
        if (n8 != 1 && n8 != 7 && (n8 != 4 || this.a.t()) && object.what != 5 || this.a.i()) {
            n8 = object.what;
            Object object2 = null;
            if (n8 == 4) {
                c.Z(this.a, new b(object.arg2));
                if (c.h0(this.a) && !c.f0((c)(object = this.a))) {
                    c.b0((c)object, 3, null);
                    return;
                }
                object = this.a;
                object = c.T((c)object) != null ? c.T((c)object) : new b(8);
                this.a.p.b((b)object);
                this.a.L((b)object);
                return;
            }
            if (n8 == 5) {
                object = this.a;
                object = c.T((c)object) != null ? c.T((c)object) : new b(8);
                this.a.p.b((b)object);
                this.a.L((b)object);
                return;
            }
            if (n8 == 3) {
                Object object3 = object.obj;
                if (object3 instanceof PendingIntent) {
                    object2 = (PendingIntent)object3;
                }
                object = new b(object.arg2, (PendingIntent)object2);
                this.a.p.b((b)object);
                this.a.L((b)object);
                return;
            }
            if (n8 == 6) {
                c.b0(this.a, 5, null);
                object2 = this.a;
                if (c.U((c)object2) != null) {
                    c.U((c)object2).n(object.arg2);
                }
                this.a.M(object.arg2);
                c.g0(this.a, 5, 1, null);
                return;
            }
            if (n8 == 2 && !this.a.a()) {
                U.a((Message)object);
                return;
            }
            if (U.b((Message)object)) {
                ((V)object.obj).c();
                return;
            }
            n8 = object.what;
            object = new StringBuilder();
            object.append("Don't know how to handle message: ");
            object.append(n8);
            object2 = new Exception();
            Log.wtf((String)"GmsClient", (String)object.toString(), (Throwable)object2);
            return;
        }
        U.a((Message)object);
    }
}

