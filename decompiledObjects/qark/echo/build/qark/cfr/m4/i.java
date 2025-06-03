/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package m4;

import j4.b;
import j4.c;
import j4.e;
import j4.g;
import m4.f;

public class i
implements g {
    public boolean a = false;
    public boolean b = false;
    public c c;
    public final f d;

    public i(f f8) {
        this.d = f8;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public void b(c c8, boolean bl) {
        this.a = false;
        this.c = c8;
        this.b = bl;
    }

    @Override
    public g d(String string2) {
        this.a();
        this.d.i(this.c, string2, this.b);
        return this;
    }

    @Override
    public g e(boolean bl) {
        this.a();
        this.d.o(this.c, bl, this.b);
        return this;
    }
}

