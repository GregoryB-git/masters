package p2;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void a(Context context) {
        LinkedHashMap linkedHashMap;
        StringBuilder sb2;
        ec.i.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        ec.i.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            o2.j.d().a(c0.f12860a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            ec.i.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(a.f12856a.a(context), "androidx.work.workdb");
            String[] strArr = c0.f12861b;
            int H0 = sb.y.H0(strArr.length);
            if (H0 < 16) {
                H0 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(H0);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            rb.d dVar = new rb.d(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = sb.y.I0(dVar);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        o2.j.d().g(c0.f12860a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        sb2 = new StringBuilder();
                        sb2.append("Migrated ");
                        sb2.append(file2);
                        sb2.append("to ");
                        sb2.append(file3);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("Renaming ");
                        sb2.append(file2);
                        sb2.append(" to ");
                        sb2.append(file3);
                        sb2.append(" failed");
                    }
                    o2.j.d().a(c0.f12860a, sb2.toString());
                }
            }
        }
    }
}
