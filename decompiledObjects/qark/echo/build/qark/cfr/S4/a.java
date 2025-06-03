/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package S4;

import S4.b;
import V5.o;
import W5.C;
import Z5.d;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import y6.a;
import y6.c;

public final class a {
    public static final a a = new a();
    public static final Map b = Collections.synchronizedMap((Map)new LinkedHashMap());

    public final void a(b.a a8) {
        Intrinsics.checkNotNullParameter((Object)a8, "subscriberName");
        Map map = b;
        if (map.containsKey((Object)a8)) {
            map = new StringBuilder();
            map.append("Dependency ");
            map.append((Object)a8);
            map.append(" already added.");
            Log.d((String)"SessionsDependencies", (String)map.toString());
            return;
        }
        Intrinsics.checkNotNullExpressionValue((Object)map, "dependencies");
        map.put((Object)a8, (Object)new a(c.a(true), null, 2, null));
    }

    public final a b(b.a a8) {
        Object object = b;
        Intrinsics.checkNotNullExpressionValue(object, "dependencies");
        object = object.get((Object)a8);
        if (object != null) {
            Intrinsics.checkNotNullExpressionValue(object, "dependencies.getOrElse(s\u2026load time.\"\n      )\n    }");
            return (a)object;
        }
        object = new StringBuilder();
        object.append("Cannot get dependency ");
        object.append((Object)a8);
        object.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(object.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object c(X5.d var1_1) {
        block7 : {
            if (!(var1_1 instanceof )) ** GOTO lbl-1000
            var3_3 = var1_1;
            var2_4 = var3_3.w;
            if ((var2_4 & Integer.MIN_VALUE) != 0) {
                var3_3.w = var2_4 + Integer.MIN_VALUE;
                var1_1 = var3_3;
            } else lbl-1000: // 2 sources:
            {
                var1_1 = new d((X5.d)var1_1){
                    public Object o;
                    public Object p;
                    public Object q;
                    public Object r;
                    public Object s;
                    public Object t;
                    public /* synthetic */ Object u;
                    public int w;

                    @Override
                    public final Object invokeSuspend(Object object) {
                        this.u = object;
                        this.w |= Integer.MIN_VALUE;
                        return this.c(this);
                    }
                };
            }
            var4_5 = var1_1.u;
            var10_6 = Y5.b.c();
            var2_4 = var1_1.w;
            if (var2_4 == 0) break block7;
            if (var2_4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            var3_3 = var1_1.t;
            var7_7 = (Map)var1_1.s;
            var5_8 = (y6.a)var1_1.r;
            var8_9 = (b.a)var1_1.q;
            var6_10 = (Iterator)var1_1.p;
            var9_11 = (Map)var1_1.o;
            o.b(var4_5);
            var4_5 = var1_1;
            var1_1 = var9_11;
            ** GOTO lbl49
        }
        o.b(var4_5);
        var4_5 = a.b;
        Intrinsics.checkNotNullExpressionValue(var4_5, "dependencies");
        var3_3 = new LinkedHashMap(C.a(var4_5.size()));
        var6_10 = var4_5.entrySet().iterator();
        var4_5 = var1_1;
        while (var6_10.hasNext() != false) {
            var1_1 = (Map.Entry)var6_10.next();
            var9_11 = var1_1.getKey();
            var8_9 = (b.a)var1_1.getKey();
            var5_8 = ((a)var1_1.getValue()).a();
            var4_5.o = var3_3;
            var4_5.p = var6_10;
            var4_5.q = var8_9;
            var4_5.r = var5_8;
            var4_5.s = var3_3;
            var4_5.t = var9_11;
            var4_5.w = 1;
            if (var5_8.a(null, (X5.d)var4_5) == var10_6) {
                return var10_6;
            }
            var1_1 = var3_3;
            var7_7 = var3_3;
            var3_3 = var9_11;
lbl49: // 3 sources:
            var8_9 = a.a.d((b.a)var8_9);
            var7_7.put(var3_3, var8_9);
            var3_3 = var1_1;
        }
        return var3_3;
        finally {
            var5_8.b(null);
        }
    }

    public final b d(b.a a8) {
        Intrinsics.checkNotNullParameter((Object)a8, "subscriberName");
        b b8 = this.b(a8).b();
        if (b8 != null) {
            return b8;
        }
        b8 = new StringBuilder();
        b8.append("Subscriber ");
        b8.append((Object)a8);
        b8.append(" has not been registered.");
        throw new IllegalStateException(b8.toString());
    }

    public final void e(b b8) {
        Intrinsics.checkNotNullParameter(b8, "subscriber");
        b.a a8 = b8.a();
        a a9 = this.b(a8);
        if (a9.b() != null) {
            b8 = new StringBuilder();
            b8.append("Subscriber ");
            b8.append((Object)a8);
            b8.append(" already registered.");
            Log.d((String)"SessionsDependencies", (String)b8.toString());
            return;
        }
        a9.c(b8);
        a.a.a(a9.a(), null, 1, null);
    }

    public static final class a {
        public final y6.a a;
        public b b;

        public a(y6.a a8, b b8) {
            Intrinsics.checkNotNullParameter(a8, "mutex");
            this.a = a8;
            this.b = b8;
        }

        public /* synthetic */ a(y6.a a8, b b8, int n8, g g8) {
            if ((n8 & 2) != 0) {
                b8 = null;
            }
            this(a8, b8);
        }

        public final y6.a a() {
            return this.a;
        }

        public final b b() {
            return this.b;
        }

        public final void c(b b8) {
            this.b = b8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!Intrinsics.a(this.a, object.a)) {
                return false;
            }
            if (!Intrinsics.a(this.b, object.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            b b8 = this.b;
            int n9 = b8 == null ? 0 : b8.hashCode();
            return n8 * 31 + n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dependency(mutex=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", subscriber=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

