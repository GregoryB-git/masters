/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.M0;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cb {
    private final M0 a;

    public cb(@NotNull Hh hh2, @NotNull M0 m02) {
        if (!hh2.e()) {
            m02 = null;
        }
        this.a = m02;
    }

    public final void a(@NotNull a object) {
        M0 m02 = this.a;
        if (m02 != null) {
            String string = ((a)object).d() ? "OK" : "FAILED";
            string = MapsKt.mutableMapOf((Pair[])new Pair[]{TuplesKt.to((Object)"status", (Object)string), TuplesKt.to((Object)"http_status", (Object)((a)object).b()), TuplesKt.to((Object)"size", (Object)((a)object).c())});
            if ((object = ((a)object).a()) != null) {
                string.put((Object)"reason", object);
            }
            m02.reportEvent("egress_status", (Map<String, Object>)MapsKt.toMap((Map)string));
        }
    }

    public static final class a {
        private final boolean a;
        private final int b;
        private final int c;
        @Nullable
        private final String d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        public a(boolean bl, int n4, int n5, @Nullable String string) {
            this.a = bl;
            this.b = n4;
            this.c = n5;
            this.d = string;
        }

        public /* synthetic */ a(boolean bl, int n4, int n5, String string, int n7) {
            if ((n7 & 1) != 0) {
                bl = false;
            }
            if ((n7 & 2) != 0) {
                n4 = 0;
            }
            if ((n7 & 4) != 0) {
                n5 = 0;
            }
            this(bl, n4, n5, null);
        }

        @Nullable
        public final String a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final boolean d() {
            return this.a;
        }

        public boolean equals(@Nullable Object object) {
            block2: {
                block3: {
                    if (this == object) break block2;
                    if (!(object instanceof a)) break block3;
                    object = (a)object;
                    if (this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c && Intrinsics.areEqual((Object)this.d, (Object)((a)object).d)) break block2;
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int n4;
            int n5 = n4 = this.a;
            if (n4 != 0) {
                n5 = 1;
            }
            int n7 = this.b;
            int n8 = this.c;
            String string = this.d;
            n4 = string != null ? string.hashCode() : 0;
            return ((n5 * 31 + n7) * 31 + n8) * 31 + n4;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = z2.t("RequestReport(success=");
            stringBuilder.append(this.a);
            stringBuilder.append(", httpStatus=");
            stringBuilder.append(this.b);
            stringBuilder.append(", size=");
            stringBuilder.append(this.c);
            stringBuilder.append(", failureReason=");
            return z2.s(stringBuilder, this.d, ")");
        }
    }
}

