/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence
 *  com.hintsolutions.raintv.programs.ProgramsFragment
 *  java.io.File
 *  java.lang.Object
 *  java.util.Comparator
 *  ru.tvrain.core.data.Program
 */
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.hintsolutions.raintv.programs.ProgramsFragment;
import java.io.File;
import java.util.Comparator;
import ru.tvrain.core.data.Program;

public final class u0
implements Comparator {
    public final int a;

    public /* synthetic */ u0(int n) {
        this.a = n;
    }

    public final int compare(Object object, Object object2) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return ProgramsFragment.b((Program)((Program)object), (Program)((Program)object2));
            }
            case 1: {
                return CrashlyticsReportPersistence.a((File)((File)object), (File)((File)object2));
            }
            case 0: {
                return CrashlyticsReportPersistence.c((File)((File)object), (File)((File)object2));
            }
        }
        return ProgramsFragment.d((Program)((Program)object), (Program)((Program)object2));
    }
}

