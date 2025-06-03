// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import V2.j;
import android.util.Log;
import Y5.b;
import X5.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import s4.i;

public final class o
{
    public static final a c;
    public final i a;
    public final R4.i b;
    
    static {
        c = new a(null);
    }
    
    public o(final i a, final R4.i b) {
        Intrinsics.checkNotNullParameter(a, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(b, "eventGDTLogger");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(q p2, final d d) {
        Z5.d d3 = null;
        Label_0051: {
            if (d instanceof o$b) {
                final Z5.d d2 = (o$b)d;
                final int u = d2.u;
                if ((u & Integer.MIN_VALUE) != 0x0) {
                    d2.u = u + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0051;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public Object r;
                public /* synthetic */ Object s;
                public final /* synthetic */ o t;
                public int u;
                
                @Override
                public final Object invokeSuspend(final Object s) {
                    this.s = s;
                    this.u |= Integer.MIN_VALUE;
                    return this.t.a(null, this);
                }
            };
        }
        Object o = d3.s;
        final Object c = Y5.b.c();
        final int u2 = d3.u;
        t c2 = null;
        o o2 = null;
        String s = null;
        Label_0330: {
            o o3 = null;
            t t2 = null;
            q q = null;
            Exception obj = null;
            Label_0222: {
                if (u2 != 0) {
                    if (u2 == 1) {
                        c2 = (t)d3.r;
                        final t t = (t)d3.q;
                        p2 = (q)d3.p;
                        o2 = (o3 = (o)d3.o);
                        t2 = t;
                        q = p2;
                        try {
                            V5.o.b(o);
                            break Label_0222;
                        }
                        catch (Exception obj) {
                            break Label_0222;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(o);
                c2 = p2.c();
                try {
                    final j a = this.a.a();
                    Intrinsics.checkNotNullExpressionValue(a, "firebaseInstallations.id");
                    d3.o = this;
                    d3.p = p2;
                    d3.q = c2;
                    d3.r = c2;
                    d3.u = 1;
                    o = z6.b.a(a, d3);
                    if (o == c) {
                        return c;
                    }
                    final t t = c2;
                    o2 = this;
                    Intrinsics.checkNotNullExpressionValue(o, "{\n        firebaseInstallations.id.await()\n      }");
                    s = (String)o;
                    break Label_0330;
                }
                catch (Exception ex) {
                    q = p2;
                    t2 = c2;
                    obj = ex;
                    o3 = this;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Error getting Firebase Installation ID: ");
            sb.append(obj);
            sb.append(". Using an empty ID");
            Log.e("SessionCoordinator", sb.toString());
            final String s2 = "";
            c2 = t2;
            s = s2;
            p2 = q;
            o2 = o3;
        }
        c2.g(s);
        try {
            o2.b.a(p2);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Successfully logged Session Start event: ");
            sb2.append(p2.c().e());
            Log.i("SessionCoordinator", sb2.toString());
        }
        catch (RuntimeException ex2) {
            Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", (Throwable)ex2);
        }
        return V5.t.a;
    }
    
    public static final class a
    {
    }
}
