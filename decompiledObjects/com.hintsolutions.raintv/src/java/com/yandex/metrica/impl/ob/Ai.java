/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.I
 *  com.yandex.metrica.impl.ob.ci
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Set
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.functions.Function0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.Eh;
import com.yandex.metrica.impl.ob.I;
import com.yandex.metrica.impl.ob.ci;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ai {
    private static final Set<String> a = SetsKt.setOf((Object[])new String[]{"yandex_mobile_metrica_clids", "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"});
    @NotNull
    private static TimeProvider b = new SystemTimeProvider();
    @NotNull
    private static Eh c = new Eh();

    @JvmStatic
    @NotNull
    public static final Collection<String> a(@NotNull Collection<String> collection) {
        return CollectionsKt.i(collection, a);
    }

    @JvmStatic
    public static final boolean a(long l3) {
        boolean bl = b.currentTimeSeconds() > l3;
        return bl;
    }

    @JvmStatic
    public static final boolean a(@NotNull ci ci2) {
        boolean bl = ai.a(ci2.V()) && ai.a(ci2.i()) && ai.a(ci2.j());
        return bl;
    }

    @JvmStatic
    public static final boolean a(@NotNull ci ci2, @Nullable Collection<String> iterator, @Nullable Map<String, String> map, @NotNull Function0<I> function0) {
        boolean bl;
        block10: {
            block11: {
                boolean bl2 = false;
                boolean bl3 = iterator == null || iterator.isEmpty();
                if (bl3) {
                    return true;
                }
                if (iterator instanceof Collection && iterator.isEmpty()) break block11;
                for (String string : iterator) {
                    block12: {
                        switch (string.hashCode()) {
                            default: {
                                break;
                            }
                            case 1630523545: {
                                if (!string.equals((Object)"yandex_mobile_metrica_get_ad_url")) break;
                                bl = ai.a(ci2.p());
                                break block12;
                            }
                            case 1541938616: {
                                if (!string.equals((Object)"yandex_mobile_metrica_uuid")) break;
                                bl = ai.a(ci2.V());
                                break block12;
                            }
                            case 538565458: {
                                if (!string.equals((Object)"yandex_mobile_metrica_clids")) break;
                                bl = c.a(map, ci2, (I)function0.invoke());
                                break block12;
                            }
                            case 530390881: {
                                if (!string.equals((Object)"yandex_mobile_metrica_report_ad_url")) break;
                                bl = ai.a(ci2.G());
                                break block12;
                            }
                            case 299713912: {
                                if (!string.equals((Object)"appmetrica_device_id_hash")) break;
                                bl = ai.a(ci2.j());
                                break block12;
                            }
                            case -220514361: {
                                if (!string.equals((Object)"yandex_mobile_metrica_device_id")) break;
                                bl = ai.a(ci2.i());
                                break block12;
                            }
                        }
                        bl = ai.b(ci2) ^ true;
                    }
                    if (bl) continue;
                    bl = bl2;
                    break block10;
                }
            }
            bl = true;
        }
        return bl;
    }

    @JvmStatic
    public static final boolean a(@Nullable String string) {
        boolean bl = string == null || string.length() == 0;
        return bl ^ true;
    }

    @JvmStatic
    public static final boolean b(@NotNull ci ci2) {
        boolean bl;
        block3: {
            block2: {
                boolean bl2 = ci2.D();
                bl = false;
                if (bl2) break block2;
                long l3 = ci2.C();
                long l4 = ci2.O().a();
                boolean bl3 = b.currentTimeSeconds() > l3 + l4;
                if (!bl3) break block3;
            }
            bl = true;
        }
        return bl;
    }
}

