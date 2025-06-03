/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package kotlin.text;

import V5.m;
import g6.p;
import h6.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import l6.d;
import n6.b;

public final class c
implements b {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final p d;

    public c(CharSequence charSequence, int n8, int n9, p p8) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        Intrinsics.checkNotNullParameter(p8, "getNextMatch");
        this.a = charSequence;
        this.b = n8;
        this.c = n9;
        this.d = p8;
    }

    public static final /* synthetic */ p a(c c8) {
        return c8.d;
    }

    public static final /* synthetic */ int c(c c8) {
        return c8.c;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(){
            public int o;
            public int p;
            public int q;
            public l6.c r;
            public int s;
            {
                int n8;
                this.o = -1;
                this.p = n8 = d.d(c8.b, 0, c8.a.length());
                this.q = n8;
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public final void b() {
                block6 : {
                    block5 : {
                        block4 : {
                            var2_1 = this.q;
                            var1_2 = 0;
                            if (var2_1 < 0) {
                                this.o = 0;
                                this.r = null;
                                return;
                            }
                            var3_3 = c.c(this);
                            var2_1 = -1;
                            if (var3_3 <= 0) break block4;
                            this.s = var3_3 = this.s + 1;
                            if (var3_3 >= c.c(this)) break block5;
                        }
                        if (this.q <= c.b(this).length()) break block6;
                    }
                    var4_4 = new l6.c(this.p, s.x(c.b(this)));
                    ** GOTO lbl21
                }
                var4_4 = (m)c.a(this).invoke((Object)c.b(this), this.q);
                if (var4_4 == null) {
                    var4_4 = new l6.c(this.p, s.x(c.b(this)));
lbl21: // 2 sources:
                    this.r = var4_4;
                    var1_2 = var2_1;
                } else {
                    var3_3 = ((Number)var4_4.a()).intValue();
                    var2_1 = ((Number)var4_4.b()).intValue();
                    this.r = d.g(this.p, var3_3);
                    this.p = var3_3 += var2_1;
                    if (var2_1 == 0) {
                        var1_2 = 1;
                    }
                    var1_2 = var3_3 + var1_2;
                }
                this.q = var1_2;
                this.o = 1;
            }

            public l6.c d() {
                if (this.o == -1) {
                    this.b();
                }
                if (this.o != 0) {
                    l6.c c8 = this.r;
                    Intrinsics.c(c8, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.r = null;
                    this.o = -1;
                    return c8;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.o == -1) {
                    this.b();
                }
                if (this.o == 1) {
                    return true;
                }
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

}

