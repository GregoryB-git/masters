/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package W2;

import W2.d;
import W2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class q {
    public final d a;
    public final boolean b;
    public final c c;
    public final int d;

    public q(c c8) {
        this(c8, false, d.f(), Integer.MAX_VALUE);
    }

    public q(c c8, boolean bl, d d8, int n8) {
        this.c = c8;
        this.b = bl;
        this.a = d8;
        this.d = n8;
    }

    public static q d(char c8) {
        return q.e(d.d(c8));
    }

    public static q e(d d8) {
        m.j(d8);
        return new q(new c(){

            public b b(q q8, CharSequence charSequence) {
                return new b(q8, charSequence){

                    @Override
                    public int g(int n8) {
                        return n8 + 1;
                    }

                    @Override
                    public int h(int n8) {
                        return d.this.c(this.q, n8);
                    }
                };
            }

        });
    }

    public List f(CharSequence charSequence) {
        m.j((Object)charSequence);
        charSequence = this.g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (charSequence.hasNext()) {
            arrayList.add((Object)((String)charSequence.next()));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public static abstract class b
    extends W2.b {
        public final CharSequence q;
        public final d r;
        public final boolean s;
        public int t = 0;
        public int u;

        public b(q q8, CharSequence charSequence) {
            this.r = q8.a;
            this.s = q8.b;
            this.u = q8.d;
            this.q = charSequence;
        }

        /*
         * Enabled aggressive block sorting
         */
        public String f() {
            int n8;
            int n9;
            int n10;
            do {
                n9 = this.t;
                do {
                    if ((n8 = this.t) == -1) {
                        return (String)this.d();
                    }
                    if ((n8 = this.h(n8)) == -1) {
                        n8 = this.q.length();
                        this.t = -1;
                    } else {
                        this.t = this.g(n8);
                    }
                    int n11 = this.t;
                    n10 = n9;
                    if (n11 != n9) break;
                    this.t = n8 = n11 + 1;
                    if (n8 <= this.q.length()) continue;
                    this.t = -1;
                } while (true);
                do {
                    n9 = n8;
                    if (n10 >= n8) break;
                    n9 = n8;
                    if (!this.r.e(this.q.charAt(n10))) break;
                    ++n10;
                } while (true);
                while (n9 > n10 && this.r.e(this.q.charAt(n9 - 1))) {
                    --n9;
                }
            } while (this.s && n10 == n9);
            n8 = this.u;
            if (n8 == 1) {
                n8 = this.q.length();
                this.t = -1;
                do {
                    n9 = n8;
                    if (n8 <= n10) return this.q.subSequence(n10, n9).toString();
                    {
                        n9 = n8;
                        if (!this.r.e(this.q.charAt(n8 - 1))) return this.q.subSequence(n10, n9).toString();
                        {
                            --n8;
                            continue;
                        }
                    }
                    break;
                } while (true);
            } else {
                this.u = n8 - 1;
            }
            return this.q.subSequence(n10, n9).toString();
        }

        public abstract int g(int var1);

        public abstract int h(int var1);
    }

    public static interface c {
        public Iterator a(q var1, CharSequence var2);
    }

}

