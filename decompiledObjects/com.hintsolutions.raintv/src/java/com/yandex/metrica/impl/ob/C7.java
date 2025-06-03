/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.google.protobuf.nano.ym.MessageNano
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.K6;
import com.yandex.metrica.impl.ob.L0;
import com.yandex.metrica.impl.ob.X6;
import com.yandex.metrica.impl.ob.Y6;
import com.yandex.metrica.impl.ob.Yl;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class c7
implements Yl<File, X6, String> {
    @NonNull
    private final K6 a;

    @VisibleForTesting
    public c7(@NonNull K6 k62) {
        this.a = k62;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public String a(@NonNull File var1_1, @NonNull X6 var2_4) {
        var1_1 /* !! */  = var1_1 /* !! */ .getAbsolutePath();
        if (var1_1 /* !! */  == null) lbl-1000:
        // 2 sources

        {
            while (true) {
                var1_1 /* !! */  = null;
lbl6:
                // 2 sources

                while (true) {
                    if (A2.a((byte[])var1_1 /* !! */ ) != false) return null;
                    var4_7 = this.a;
                    var3_5 /* !! */  = new Y6((byte[])var1_1 /* !! */ , var2_4);
                    return L0.a(MessageNano.toByteArray((MessageNano)var4_7.a((Y6)var3_5 /* !! */ )));
                }
                break;
            }
        }
        var3_5 /* !! */  = new File((String)var1_1 /* !! */ );
        var1_1 /* !! */  = new FileInputStream(var3_5 /* !! */ );
        var3_5 /* !! */  = (File)L0.a((InputStream)var1_1 /* !! */ );
        catch (Throwable var3_6) {
            ** continue;
        }
        {
            A2.a((Closeable)var1_1 /* !! */ );
            var1_1 /* !! */  = var3_5 /* !! */ ;
            ** continue;
            catch (Throwable var1_2) {
                var1_1 /* !! */  = null;
lbl23:
                // 2 sources

                while (true) {
                    A2.a((Closeable)var1_1 /* !! */ );
                    ** continue;
                    break;
                }
            }
        }
        catch (Throwable var1_3) {
            return null;
        }
    }
}

