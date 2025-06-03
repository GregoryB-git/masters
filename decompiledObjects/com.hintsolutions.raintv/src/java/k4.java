/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator
 *  com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute
 *  java.lang.Object
 *  java.util.Comparator
 */
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

public final class k4
implements Comparator {
    public final int compare(Object object, Object object2) {
        return SessionReportingCoordinator.b((CrashlyticsReport.CustomAttribute)((CrashlyticsReport.CustomAttribute)object), (CrashlyticsReport.CustomAttribute)((CrashlyticsReport.CustomAttribute)object2));
    }
}

