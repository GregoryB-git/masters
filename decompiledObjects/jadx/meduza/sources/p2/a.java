package p2;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12856a = new a();

    public final File a(Context context) {
        ec.i.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        ec.i.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
