/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
package R4;

import R4.g;
import R4.i;
import R4.q;
import R4.r;
import android.util.Log;
import c2.c;
import c2.e;
import c2.f;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import r4.b;

public final class h
implements i {
    public static final a b = new a(null);
    public final b a;

    public h(b b8) {
        Intrinsics.checkNotNullParameter(b8, "transportFactoryProvider");
        this.a = b8;
    }

    public static /* synthetic */ byte[] b(h h8, q q8) {
        return h8.c(q8);
    }

    @Override
    public void a(q q8) {
        Intrinsics.checkNotNullParameter(q8, "sessionEvent");
        ((c2.g)this.a.get()).a("FIREBASE_APPQUALITY_SESSION", q.class, c2.b.b("json"), new g(this)).b(c.d(q8));
    }

    public final byte[] c(q arrby) {
        arrby = r.a.b().a(arrby);
        Intrinsics.checkNotNullExpressionValue(arrby, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session Event: ");
        stringBuilder.append((String)arrby);
        Log.d((String)"EventGDTLogger", (String)stringBuilder.toString());
        arrby = arrby.getBytes(kotlin.text.b.b);
        Intrinsics.checkNotNullExpressionValue(arrby, "this as java.lang.String).getBytes(charset)");
        return arrby;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

