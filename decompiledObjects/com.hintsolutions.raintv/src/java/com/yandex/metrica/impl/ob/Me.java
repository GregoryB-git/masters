/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.if;
import com.yandex.metrica.impl.ob.pe;
import java.util.concurrent.TimeUnit;

public class me
implements pe {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    @Nullable
    public if.b a(@Nullable String var1_1) {
        block18: {
            block19: {
                if (TextUtils.isEmpty((CharSequence)var1_1 /* !! */ ) || !(var5_6 = new Gl.a(var1_1 /* !! */ )).d("lon") || !var5_6.d("lat")) break block18;
                var3_7 = new if.b();
                var3_7.b = var5_6.getDouble("lon");
                var3_7.a = var5_6.getDouble("lat");
                var3_7.g = var5_6.optInt("altitude");
                var3_7.e = var5_6.optInt("direction");
                var3_7.d = var5_6.optInt("precision");
                var3_7.f = var5_6.optInt("speed");
                var3_7.c = TimeUnit.MILLISECONDS.toSeconds(var5_6.optLong("timestamp"));
                var2_8 = var5_6.d("provider");
                var4_9 = "";
                if (!var2_8) ** GOTO lbl30
                var2_8 = var5_6.has("provider");
                if (!var2_8) break block19;
                try {
                    var1_1 /* !! */  = var5_6.getString("provider");
                    ** GOTO lbl25
                }
                catch (Throwable var1_4) {
                    ** continue;
                }
            }
lbl22:
            // 2 sources

            while (true) {
                block21: {
                    block20: {
                        var1_1 /* !! */  = "";
lbl25:
                        // 3 sources

                        if ("gps".equals((Object)var1_1 /* !! */ )) {
                            var3_7.h = 1;
                            break block20;
                        }
                        if (!"network".equals((Object)var1_1 /* !! */ )) break block20;
                        var3_7.h = 2;
                    }
                    var1_1 /* !! */  = var3_7;
                    if (!var5_6.d("original_provider")) ** GOTO lbl47
                    var2_8 = var5_6.has("original_provider");
                    var1_1 /* !! */  = var4_9;
                    if (!var2_8) break block21;
                    var1_1 /* !! */  = var5_6.getString("original_provider");
                }
lbl40:
                // 2 sources

                while (true) {
                    var3_7.i = var1_1 /* !! */ ;
                    return var3_7.i;
                    break;
                }
                break;
            }
        }
lbl45:
        // 2 sources

        while (true) {
            var1_1 /* !! */  = null;
lbl47:
            // 3 sources

            return var1_1 /* !! */ ;
        }
        catch (Throwable var1_2) {
            ** continue;
        }
        catch (Throwable var1_3) {}
        finally {
            var1_1 /* !! */  = var3_7;
            ** continue;
        }
        catch (Throwable var1_5) {
            var1_1 /* !! */  = var4_9;
            ** continue;
        }
    }
}

