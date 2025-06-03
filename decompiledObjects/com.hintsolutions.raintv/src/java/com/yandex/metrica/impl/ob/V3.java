/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.s0;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v3
implements s0<a, a> {
    @NotNull
    private final a a;
    @NotNull
    private final List<a> b;

    public v3(@NotNull a a2, @NotNull List<a> list) {
        this.a = a2;
        this.b = list;
    }

    @Override
    @NotNull
    public List<a> a() {
        return this.b;
    }

    @Override
    public Object b() {
        return this.a;
    }

    @NotNull
    public a c() {
        return this.a;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof v3)) break block3;
                object = (v3)object;
                if (Intrinsics.areEqual((Object)this.a, (Object)((v3)object).a) && Intrinsics.areEqual(this.b, ((v3)object).b)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<a> list = this.a;
        int n2 = 0;
        int n6 = list != null ? list.hashCode() : 0;
        list = this.b;
        if (list != null) {
            n2 = list.hashCode();
        }
        return n6 * 31 + n2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("ClidsInfo(chosen=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", candidates=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class a
    implements v0 {
        @Nullable
        private final Map<String, String> a;
        @NotNull
        private final u0 b;

        public a(@Nullable Map<String, String> map, @NotNull u0 u02) {
            this.a = map;
            this.b = u02;
        }

        @Override
        @NotNull
        public u0 a() {
            return this.b;
        }

        @Nullable
        public final Map<String, String> b() {
            return this.a;
        }

        public boolean equals(@Nullable Object object) {
            block2: {
                block3: {
                    if (this == object) break block2;
                    if (!(object instanceof a)) break block3;
                    object = (a)object;
                    if (Intrinsics.areEqual(this.a, ((a)object).a) && Intrinsics.areEqual((Object)((Object)this.b), (Object)((Object)((a)object).b))) break block2;
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object object = this.a;
            int n2 = 0;
            int n6 = object != null ? object.hashCode() : 0;
            object = this.b;
            if (object != null) {
                n2 = object.hashCode();
            }
            return n6 * 31 + n2;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = z2.t("Candidate(clids=");
            stringBuilder.append(this.a);
            stringBuilder.append(", source=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }
}

