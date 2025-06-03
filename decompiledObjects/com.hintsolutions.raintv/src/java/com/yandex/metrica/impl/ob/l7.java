/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.internal.Reflection
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.a8;
import com.yandex.metrica.impl.ob.ah;
import com.yandex.metrica.impl.ob.bh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class L7
implements a8 {
    private final Context a;
    private final String b;
    private final B0 c;

    public L7(@NotNull Context context, @NotNull String string2, @NotNull B0 b02) {
        this.a = context;
        this.b = string2;
        this.c = b02;
    }

    @Override
    public void a(@NotNull String string2) {
        block4: {
            Object object = this.c.a(this.a, this.b);
            if (object == null) break block4;
            try {
                FilesKt.c((File)object, (String)string2);
            }
            catch (Throwable throwable) {
                Object object2 = bh.a();
                object = MapsKt.mapOf((Pair[])new Pair[]{TuplesKt.to((Object)"fileName", (Object)this.b), TuplesKt.to((Object)"exception", (Object)Reflection.getOrCreateKotlinClass((Class)throwable.getClass()).getSimpleName())});
                ((ah)object2).reportEvent("vital_data_provider_write_exception", (Map<String, Object>)object);
                object = bh.a();
                object2 = z2.t("Error during writing file with name ");
                object2.append(this.b);
                object2 = object2.toString();
                ((ah)object).reportError((String)object2, throwable);
            }
            catch (FileNotFoundException fileNotFoundException) {
                M0 m0 = bh.a();
                object = MapsKt.mapOf((Pair)TuplesKt.to((Object)"fileName", (Object)this.b));
                ((ah)m0).reportEvent("vital_data_provider_write_file_not_found", (Map<String, Object>)object);
            }
        }
    }

    @Override
    @Nullable
    public String c() {
        Object object;
        block5: {
            block4: {
                object = this.c.a(this.a, this.b);
                if (object == null) break block4;
                try {
                    object = FilesKt.b((File)object);
                    break block5;
                }
                catch (Throwable throwable) {
                    Object object2 = bh.a();
                    Object object3 = MapsKt.mapOf((Pair[])new Pair[]{TuplesKt.to((Object)"fileName", (Object)this.b), TuplesKt.to((Object)"exception", (Object)Reflection.getOrCreateKotlinClass((Class)throwable.getClass()).getSimpleName())});
                    ((ah)object2).reportEvent("vital_data_provider_read_exception", (Map<String, Object>)object3);
                    object3 = bh.a();
                    object2 = z2.t("Error during reading file with name ");
                    object2.append(this.b);
                    object2 = object2.toString();
                    ((ah)object3).reportError((String)object2, throwable);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    M0 m0 = bh.a();
                    object = MapsKt.mapOf((Pair)TuplesKt.to((Object)"fileName", (Object)this.b));
                    ((ah)m0).reportEvent("vital_data_provider_read_file_not_found", (Map<String, Object>)object);
                }
            }
            object = null;
        }
        return object;
    }
}

