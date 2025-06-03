// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import android.util.Log;
import c2.c;
import c2.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import r4.b;

public final class h implements i
{
    public static final a b;
    public final b a;
    
    static {
        b = new a(null);
    }
    
    public h(final b a) {
        Intrinsics.checkNotNullParameter(a, "transportFactoryProvider");
        this.a = a;
    }
    
    @Override
    public void a(final q q) {
        Intrinsics.checkNotNullParameter(q, "sessionEvent");
        ((c2.g)this.a.get()).a("FIREBASE_APPQUALITY_SESSION", q.class, c2.b.b("json"), new R4.g(this)).b(c.d(q));
    }
    
    public final byte[] c(final q q) {
        final String a = r.a.b().a(q);
        Intrinsics.checkNotNullExpressionValue(a, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        final StringBuilder sb = new StringBuilder();
        sb.append("Session Event: ");
        sb.append(a);
        Log.d("EventGDTLogger", sb.toString());
        final byte[] bytes = a.getBytes(kotlin.text.b.b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    public static final class a
    {
    }
}
