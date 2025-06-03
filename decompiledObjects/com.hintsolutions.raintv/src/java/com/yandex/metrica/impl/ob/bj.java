/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.telephony.CellIdentityGsm
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.zj;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006\u00a8\u0006\n"}, d2={"Lcom/yandex/metrica/impl/ob/Bj;", "Lcom/yandex/metrica/impl/ob/zj;", "Landroid/telephony/CellIdentityGsm;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityGsm;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
@TargetApi(value=28)
@DoNotInline
public final class Bj
implements zj<CellIdentityGsm> {
    @Override
    @Nullable
    public Integer a(@NotNull CellIdentityGsm cellIdentityGsm) {
        return b.c(c.n(cellIdentityGsm));
    }

    @Override
    @Nullable
    public Integer b(@NotNull CellIdentityGsm cellIdentityGsm) {
        return b.c(c.y(cellIdentityGsm));
    }
}

