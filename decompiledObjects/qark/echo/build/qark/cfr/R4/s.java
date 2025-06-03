/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 *  java.util.UUID
 */
package R4;

import R4.p;
import R4.x;
import g6.a;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.j;
import kotlin.text.i;

public final class s {
    public final boolean a;
    public final x b;
    public final a c;
    public final String d;
    public int e;
    public p f;

    public s(boolean bl, x x8, a a8) {
        Intrinsics.checkNotNullParameter(x8, "timeProvider");
        Intrinsics.checkNotNullParameter(a8, "uuidGenerator");
        this.a = bl;
        this.b = x8;
        this.c = a8;
        this.d = this.b();
        this.e = -1;
    }

    public /* synthetic */ s(boolean bl, x x8, a a8, int n8, g g8) {
        if ((n8 & 4) != 0) {
            a8 = .o;
        }
        this(bl, x8, a8);
    }

    public final p a() {
        int n8;
        this.e = n8 = this.e + 1;
        String string2 = n8 == 0 ? this.d : this.b();
        this.f = new p(string2, this.d, this.e, this.b.a());
        return this.d();
    }

    public final String b() {
        String string2 = ((UUID)this.c.invoke()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "uuidGenerator().toString()");
        string2 = i.q(string2, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return string2;
    }

    public final boolean c() {
        return this.a;
    }

    public final p d() {
        p p8 = this.f;
        if (p8 != null) {
            return p8;
        }
        Intrinsics.n("currentSession");
        return null;
    }

    public final boolean e() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

}

