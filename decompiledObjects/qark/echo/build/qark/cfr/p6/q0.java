/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.concurrent.CancellationException
 */
package p6;

import X5.g;
import g6.l;
import g6.p;
import java.util.concurrent.CancellationException;
import p6.X;
import p6.r;
import p6.t;

public interface q0
extends g.b {
    public static final b n = b.o;

    public boolean a();

    public X e(l var1);

    public q0 getParent();

    public r r(t var1);

    public CancellationException s();

    public boolean start();

    public X v(boolean var1, boolean var2, l var3);

    public void w(CancellationException var1);

    public static final abstract class a {
        public static /* synthetic */ void a(q0 q02, CancellationException cancellationException, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    cancellationException = null;
                }
                q02.w(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(q0 q02, Object object, p p8) {
            return g.b.a.a(q02, object, p8);
        }

        public static g.b c(q0 q02, g.c c8) {
            return g.b.a.b(q02, c8);
        }

        public static /* synthetic */ X d(q0 q02, boolean bl, boolean bl2, l l8, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    bl = false;
                }
                if ((n8 & 2) != 0) {
                    bl2 = true;
                }
                return q02.v(bl, bl2, l8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(q0 q02, g.c c8) {
            return g.b.a.c(q02, c8);
        }

        public static g f(q0 q02, g g8) {
            return g.b.a.d(q02, g8);
        }
    }

    public static final class b
    implements g.c {
        public static final /* synthetic */ b o;

        static {
            o = new b();
        }
    }

}

