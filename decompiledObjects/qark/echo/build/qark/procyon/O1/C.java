// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.Iterator;
import java.util.Map;
import android.util.Log;
import kotlin.text.i;
import x1.B;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.N;
import java.util.HashMap;

public final class C
{
    public static final a e;
    public static final HashMap f;
    public final N a;
    public final String b;
    public StringBuilder c;
    public int d;
    
    static {
        e = new a(null);
        f = new HashMap();
    }
    
    public C(final N a, final String s) {
        Intrinsics.checkNotNullParameter(a, "behavior");
        Intrinsics.checkNotNullParameter(s, "tag");
        this.d = 3;
        this.a = a;
        this.b = Intrinsics.i("FacebookSDK.", Q.k(s, "tag"));
        this.c = new StringBuilder();
    }
    
    public static final /* synthetic */ HashMap a() {
        return C.f;
    }
    
    public final void b(final String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        if (this.g()) {
            this.c.append(str);
        }
    }
    
    public final void c(String format, Object... copy) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(copy, "args");
        if (this.g()) {
            final StringBuilder c = this.c;
            final x a = x.a;
            copy = Arrays.copyOf(copy, copy.length);
            format = String.format(format, Arrays.copyOf(copy, copy.length));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            c.append(format);
        }
    }
    
    public final void d(final String s, final Object o) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(o, "value");
        this.c("  %s:\t%s\n", s, o);
    }
    
    public final void e() {
        final String string = this.c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        this.f(string);
        this.c = new StringBuilder();
    }
    
    public final void f(final String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        C.e.a(this.a, this.d, this.b, s);
    }
    
    public final boolean g() {
        final B a = B.a;
        return B.H(this.a);
    }
    
    public static final class a
    {
        public final void a(final N n, final int n2, final String s, String i) {
            Intrinsics.checkNotNullParameter(n, "behavior");
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(i, "string");
            if (B.H(n)) {
                final String f = this.f(i);
                i = s;
                if (!i.s(s, "FacebookSDK.", false, 2, null)) {
                    i = Intrinsics.i("FacebookSDK.", s);
                }
                Log.println(n2, i, f);
                if (n == N.t) {
                    new Exception().printStackTrace();
                }
            }
        }
        
        public final void b(final N n, final String s, final String s2) {
            Intrinsics.checkNotNullParameter(n, "behavior");
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(s2, "string");
            this.a(n, 3, s, s2);
        }
        
        public final void c(final N n, final String s, String format, Object... copy) {
            Intrinsics.checkNotNullParameter(n, "behavior");
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(copy, "args");
            if (B.H(n)) {
                final x a = x.a;
                copy = Arrays.copyOf(copy, copy.length);
                format = String.format(format, Arrays.copyOf(copy, copy.length));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                this.a(n, 3, s, format);
            }
        }
        
        public final void d(final String s) {
            // monitorenter(this)
            // monitorexit(this)
            Label_0038: {
                try {
                    Intrinsics.checkNotNullParameter(s, "accessToken");
                    final B a = B.a;
                    if (!B.H(N.p)) {
                        this.e(s, "ACCESS_TOKEN_REMOVED");
                    }
                }
                finally {
                    break Label_0038;
                }
                return;
            }
        }
        // monitorexit(this)
        
        public final void e(final String s, final String s2) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(s, "original");
                Intrinsics.checkNotNullParameter(s2, "replace");
                C.a().put(s, s2);
            }
        }
        
        public final String f(String q) {
            // monitorenter(this)
            // monitorexit(this)
            Label_0072: {
                try {
                    for (final Map.Entry<String, V> entry : C.a().entrySet()) {
                        q = i.q(q, entry.getKey(), (String)entry.getValue(), false, 4, null);
                    }
                }
                finally {
                    break Label_0072;
                }
                return;
            }
        }
        // monitorexit(this)
    }
}
