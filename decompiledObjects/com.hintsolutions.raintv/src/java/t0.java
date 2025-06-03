/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

public final class t0
implements FilenameFilter {
    public final int a;

    public /* synthetic */ t0(int n) {
        this.a = n;
    }

    public final boolean accept(File file, String string2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return CrashlyticsReportPersistence.b((File)file, (String)string2);
            }
        }
        return CrashlyticsReportPersistence.d((File)file, (String)string2);
    }
}

