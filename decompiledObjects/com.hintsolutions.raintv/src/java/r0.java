/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
 *  com.google.firebase.crashlytics.internal.common.CrashlyticsCore
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

public final class r0
implements BreadcrumbHandler {
    public final CrashlyticsCore a;

    public /* synthetic */ r0(CrashlyticsCore crashlyticsCore) {
        this.a = crashlyticsCore;
    }

    public final void handleBreadcrumb(String string) {
        this.a.log(string);
    }
}

