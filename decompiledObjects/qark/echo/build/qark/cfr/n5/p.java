/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package n5;

import n5.k;
import n5.l;
import n5.m;
import n5.q;
import n5.s;
import n5.u;

public abstract class p {
    public static void a(q q8, k object, Runnable runnable) {
        object = object == null ? null : new l((k)object){
            public final /* synthetic */ k a;
            {
                this.a = k8;
            }

            @Override
            public int a() {
                return this.a.c;
            }

            @Override
            public boolean b() {
                return this.a.F();
            }
        };
        q8.c(new m((l)object, runnable));
    }

    public static q b(String string2, int n8, int n9) {
        if (n8 == 1) {
            return new u(string2, n9);
        }
        return new s(string2, n8, n9);
    }

}

