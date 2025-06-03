// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import java.util.Locale;
import kotlin.text.i;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import g6.a;

public final class s
{
    public final boolean a;
    public final x b;
    public final a c;
    public final String d;
    public int e;
    public p f;
    
    public s(final boolean a, final x b, final a c) {
        Intrinsics.checkNotNullParameter(b, "timeProvider");
        Intrinsics.checkNotNullParameter(c, "uuidGenerator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = this.b();
        this.e = -1;
    }
    
    public final p a() {
        final int e = this.e + 1;
        this.e = e;
        String s;
        if (e == 0) {
            s = this.d;
        }
        else {
            s = this.b();
        }
        this.f = new p(s, this.d, this.e, this.b.a());
        return this.d();
    }
    
    public final String b() {
        final String string = ((UUID)this.c.invoke()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "uuidGenerator().toString()");
        final String lowerCase = i.q(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
    
    public final boolean c() {
        return this.a;
    }
    
    public final p d() {
        final p f = this.f;
        if (f != null) {
            return f;
        }
        Intrinsics.n("currentSession");
        return null;
    }
    
    public final boolean e() {
        return this.f != null;
    }
}
