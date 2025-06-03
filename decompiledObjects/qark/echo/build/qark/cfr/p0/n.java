/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.UUID
 */
package p0;

import j0.b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p0.v;

public interface n {
    public void a(v.a var1);

    public boolean b();

    public Map c();

    public UUID d();

    public void e(v.a var1);

    public boolean f(String var1);

    public a g();

    public int getState();

    public b h();

    public static class a
    extends IOException {
        public final int o;

        public a(Throwable throwable, int n8) {
            super(throwable);
            this.o = n8;
        }
    }

}

