/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.identifiers.impl.c;
import com.yandex.metrica.identifiers.impl.e;
import com.yandex.metrica.identifiers.impl.f;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.i;
import com.yandex.metrica.identifiers.impl.j;
import com.yandex.metrica.identifiers.impl.l;
import com.yandex.metrica.identifiers.impl.m;
import com.yandex.metrica.identifiers.impl.n;
import com.yandex.metrica.identifiers.impl.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class o
implements i {
    private final e a;

    public o() {
        this(new e(p.a(), n.a, "yandex"));
    }

    @VisibleForTesting
    public o(@NotNull e e2) {
        Intrinsics.checkNotNullParameter((Object)e2, (String)"connectionController");
        this.a = e2;
    }

    private final g b(Context object) {
        object = (c)this.a.a((Context)object);
        String string = object.b();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"service.advId");
        boolean bl = object.d();
        return new g(l.b, new f("yandex", string, bl), null, 4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public g a(@NotNull Context var1_1) {
        Intrinsics.checkNotNullParameter((Object)var1_1, (String)"context");
        var2_5 /* !! */  = this.b(var1_1);
        this.a.b(var1_1);
        return var2_5 /* !! */ ;
        catch (Throwable var4_9) {
            var2_5 /* !! */  = l.d;
            var3_10 = new StringBuilder();
            var3_10.append("exception while fetching yandex adv_id: ");
            var3_10.append(var4_9.getMessage());
            var2_5 /* !! */  = new g((l)var2_5 /* !! */ , null, var3_10.toString(), 2);
lbl16:
            // 3 sources

            while (true) {
                var3_10 = this.a;
                ** GOTO lbl34
                break;
            }
            catch (j var2_6) {
                var2_5 /* !! */  = var2_6.getMessage();
                if (var2_5 /* !! */  == null) {
                    var2_5 /* !! */  = "unknown exception while binding yandex adv_id service";
                }
                var2_5 /* !! */  = new g(l.c, null, (String)var2_5 /* !! */ , 2);
                ** GOTO lbl16
                catch (m var2_7) {
                    var2_5 /* !! */  = var2_7.getMessage();
                    if (var2_5 /* !! */  == null) {
                        var2_5 /* !! */  = "No yandex adv_id service";
                    }
                    var2_5 /* !! */  = new g(l.c, null, (String)var2_5 /* !! */ , 2);
                    ** continue;
                }
lbl34:
                // 2 sources

                var3_10.b(var1_1);
                return var2_5 /* !! */ ;
                {
                    catch (Throwable var1_3) {
                        return var2_5 /* !! */ ;
                    }
                }
                catch (Throwable var2_8) {
                    block17: {
                        try {}
                        catch (Throwable var1_4) {
                            throw var2_8;
                        }
                        break block17;
                        catch (Throwable var1_2) {
                            return var2_5 /* !! */ ;
                        }
                    }
                    this.a.b(var1_1);
                    throw var2_8;
                }
            }
        }
    }
}

