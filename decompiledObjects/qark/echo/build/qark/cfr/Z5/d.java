/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Z5;

import X5.e;
import X5.g;
import Z5.a;
import Z5.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class d
extends a {
    private final g _context;
    private transient X5.d intercepted;

    public d(X5.d d8) {
        g g8 = d8 != null ? d8.getContext() : null;
        this(d8, g8);
    }

    public d(X5.d d8, g g8) {
        super(d8);
        this._context = g8;
    }

    @NotNull
    @Override
    public g getContext() {
        g g8 = this._context;
        Intrinsics.b(g8);
        return g8;
    }

    @NotNull
    public final X5.d intercepted() {
        Object object;
        block2 : {
            block4 : {
                block3 : {
                    X5.d d8 = this.intercepted;
                    object = d8;
                    if (d8 != null) break block2;
                    object = (e)this.getContext().b(e.c);
                    if (object == null) break block3;
                    d8 = object.i(this);
                    object = d8;
                    if (d8 != null) break block4;
                }
                object = this;
            }
            this.intercepted = object;
        }
        return object;
    }

    @Override
    public void releaseIntercepted() {
        X5.d d8 = this.intercepted;
        if (d8 != null && d8 != this) {
            g.b b8 = this.getContext().b(e.c);
            Intrinsics.b(b8);
            ((e)b8).C(d8);
        }
        this.intercepted = c.o;
    }
}

