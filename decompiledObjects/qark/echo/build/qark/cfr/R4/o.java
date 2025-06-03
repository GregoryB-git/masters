/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package R4;

import R4.i;
import R4.q;
import R4.t;
import V2.j;
import Y5.b;
import Z5.d;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class o {
    public static final a c = new a(null);
    public final s4.i a;
    public final i b;

    public o(s4.i i8, i i9) {
        Intrinsics.checkNotNullParameter(i8, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(i9, "eventGDTLogger");
        this.a = i8;
        this.b = i9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object a(q var1_1, X5.d var2_4) {
        block12 : {
            block13 : {
                if (!(var2_4 instanceof )) ** GOTO lbl-1000
                var4_6 = var2_4;
                var3_7 = var4_6.u;
                if ((var3_7 & Integer.MIN_VALUE) != 0) {
                    var4_6.u = var3_7 + Integer.MIN_VALUE;
                    var2_4 = var4_6;
                } else lbl-1000: // 2 sources:
                {
                    var2_4 = new d((X5.d)var2_4){
                        public Object o;
                        public Object p;
                        public Object q;
                        public Object r;
                        public /* synthetic */ Object s;
                        public int u;

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.s = object;
                            this.u |= Integer.MIN_VALUE;
                            return this.a(null, this);
                        }
                    };
                }
                var9_8 = var2_4.s;
                var4_6 = b.c();
                var3_7 = var2_4.u;
                if (var3_7 != 0) {
                    if (var3_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    var7_9 = (t)var2_4.r;
                    var8_10 = (t)var2_4.q;
                    var1_1 = (q)var2_4.p;
                    var6_11 = var2_4 = (o)var2_4.o;
                    var5_12 = var8_10;
                    var4_6 = var1_1;
                    V5.o.b(var9_8);
                } else {
                    V5.o.b(var9_8);
                    var7_9 = var1_1.c();
                    var5_12 = this.a.a();
                    Intrinsics.checkNotNullExpressionValue(var5_12, "firebaseInstallations.id");
                    var2_4.o = this;
                    var2_4.p = var1_1;
                    var2_4.q = var7_9;
                    var2_4.r = var7_9;
                    var2_4.u = 1;
                    var9_8 = z6.b.a((j)var5_12, (X5.d)var2_4);
                    if (var9_8 == var4_6) {
                        return var4_6;
                    }
                    var8_10 = var7_9;
                    var2_4 = this;
                }
                var6_11 = var2_4;
                var5_12 = var8_10;
                var4_6 = var1_1;
                try {
                    Intrinsics.checkNotNullExpressionValue(var9_8, "{\n        firebaseInstallations.id.await()\n      }");
                    var6_11 = var2_4;
                    var5_12 = var8_10;
                    var4_6 = var1_1;
                    var5_12 = var8_10 = (String)var9_8;
                    break block12;
                }
                catch (Exception var1_2) {
                    break block13;
                }
                catch (Exception var2_5) {
                    var4_6 = var1_1;
                    var5_12 = var7_9;
                    var1_1 = var2_5;
                    var6_11 = this;
                }
            }
            var2_4 = new StringBuilder();
            var2_4.append("Error getting Firebase Installation ID: ");
            var2_4.append(var1_1);
            var2_4.append(". Using an empty ID");
            Log.e((String)"SessionCoordinator", (String)var2_4.toString());
            var1_1 = "";
            var7_9 = var5_12;
            var5_12 = var1_1;
            var1_1 = var4_6;
            var2_4 = var6_11;
        }
        var7_9.g((String)var5_12);
        try {
            var2_4.b.a((q)var1_1);
            var2_4 = new StringBuilder();
            var2_4.append("Successfully logged Session Start event: ");
            var2_4.append(var1_1.c().e());
            Log.i((String)"SessionCoordinator", (String)var2_4.toString());
            return V5.t.a;
        }
        catch (RuntimeException var1_3) {
            Log.e((String)"SessionCoordinator", (String)"Error logging Session Start event to DataTransport: ", (Throwable)var1_3);
        }
        return V5.t.a;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

