/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package O1;

import O1.Q;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import x1.B;
import x1.N;

public final class C {
    public static final a e = new a(null);
    public static final HashMap f = new HashMap();
    public final N a;
    public final String b;
    public StringBuilder c;
    public int d;

    public C(N n8, String string2) {
        Intrinsics.checkNotNullParameter((Object)n8, "behavior");
        Intrinsics.checkNotNullParameter(string2, "tag");
        this.d = 3;
        this.a = n8;
        this.b = Intrinsics.i("FacebookSDK.", Q.k(string2, "tag"));
        this.c = new StringBuilder();
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        if (this.g()) {
            this.c.append(string2);
        }
    }

    public final /* varargs */ void c(String string2, Object ... arrobject) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(arrobject, "args");
        if (this.g()) {
            StringBuilder stringBuilder = this.c;
            x x8 = x.a;
            arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
            string2 = String.format((String)string2, (Object[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
            stringBuilder.append(string2);
        }
    }

    public final void d(String string2, Object object) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        this.c("  %s:\t%s\n", string2, object);
    }

    public final void e() {
        String string2 = this.c.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "contents.toString()");
        this.f(string2);
        this.c = new StringBuilder();
    }

    public final void f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        e.a(this.a, this.d, this.b, string2);
    }

    public final boolean g() {
        B b8 = B.a;
        return B.H(this.a);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(N n8, int n9, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)n8, "behavior");
            Intrinsics.checkNotNullParameter(string2, "tag");
            Intrinsics.checkNotNullParameter(string3, "string");
            if (B.H(n8)) {
                String string4 = this.f(string3);
                string3 = string2;
                if (!i.s(string2, "FacebookSDK.", false, 2, null)) {
                    string3 = Intrinsics.i("FacebookSDK.", string2);
                }
                Log.println((int)n9, (String)string3, (String)string4);
                if (n8 == N.t) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(N n8, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)n8, "behavior");
            Intrinsics.checkNotNullParameter(string2, "tag");
            Intrinsics.checkNotNullParameter(string3, "string");
            this.a(n8, 3, string2, string3);
        }

        public final /* varargs */ void c(N n8, String string2, String string3, Object ... arrobject) {
            Intrinsics.checkNotNullParameter((Object)n8, "behavior");
            Intrinsics.checkNotNullParameter(string2, "tag");
            Intrinsics.checkNotNullParameter(string3, "format");
            Intrinsics.checkNotNullParameter(arrobject, "args");
            if (B.H(n8)) {
                x x8 = x.a;
                arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
                string3 = String.format((String)string3, (Object[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
                Intrinsics.checkNotNullExpressionValue(string3, "java.lang.String.format(format, *args)");
                this.a(n8, 3, string2, string3);
            }
        }

        public final void d(String string2) {
            synchronized (this) {
                Throwable throwable2;
                block4 : {
                    block3 : {
                        try {
                            Intrinsics.checkNotNullParameter(string2, "accessToken");
                            B b8 = B.a;
                            if (B.H(N.p)) break block3;
                            this.e(string2, "ACCESS_TOKEN_REMOVED");
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        public final void e(String string2, String string3) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(string2, "original");
                Intrinsics.checkNotNullParameter(string3, "replace");
                f.put((Object)string2, (Object)string3);
                return;
            }
        }

        public final String f(String string2) {
            synchronized (this) {
                Throwable throwable2;
                block4 : {
                    try {
                        for (Map.Entry entry : f.entrySet()) {
                            string2 = i.q(string2, (String)entry.getKey(), (String)entry.getValue(), false, 4, null);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return string2;
                }
                throw throwable2;
            }
        }
    }

}

