/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.content.pm.PackageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2={"Lcom/onesignal/GetPackageInfoResult;", "", "successful", "", "packageInfo", "Landroid/content/pm/PackageInfo;", "(ZLandroid/content/pm/PackageInfo;)V", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "getSuccessful", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class GetPackageInfoResult {
    @Nullable
    private final PackageInfo packageInfo;
    private final boolean successful;

    public GetPackageInfoResult(boolean bl, @Nullable PackageInfo packageInfo) {
        this.successful = bl;
        this.packageInfo = packageInfo;
    }

    public static /* synthetic */ GetPackageInfoResult copy$default(GetPackageInfoResult getPackageInfoResult, boolean bl, PackageInfo packageInfo, int n, Object object) {
        if ((n & 1) != 0) {
            bl = getPackageInfoResult.successful;
        }
        if ((n & 2) != 0) {
            packageInfo = getPackageInfoResult.packageInfo;
        }
        return getPackageInfoResult.copy(bl, packageInfo);
    }

    public final boolean component1() {
        return this.successful;
    }

    @Nullable
    public final PackageInfo component2() {
        return this.packageInfo;
    }

    @NotNull
    public final GetPackageInfoResult copy(boolean bl, @Nullable PackageInfo packageInfo) {
        return new GetPackageInfoResult(bl, packageInfo);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof GetPackageInfoResult)) {
            return false;
        }
        object = (GetPackageInfoResult)object;
        if (this.successful != ((GetPackageInfoResult)object).successful) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.packageInfo, (Object)((GetPackageInfoResult)object).packageInfo);
    }

    @Nullable
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    public final boolean getSuccessful() {
        return this.successful;
    }

    public int hashCode() {
        PackageInfo packageInfo;
        int n;
        int n2 = n = this.successful;
        if (n != 0) {
            n2 = 1;
        }
        n = (packageInfo = this.packageInfo) == null ? 0 : packageInfo.hashCode();
        return n2 * 31 + n;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("GetPackageInfoResult(successful=");
        stringBuilder.append(this.successful);
        stringBuilder.append(", packageInfo=");
        stringBuilder.append((Object)this.packageInfo);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

