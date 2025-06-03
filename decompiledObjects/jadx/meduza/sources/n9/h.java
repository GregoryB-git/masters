package n9;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* loaded from: classes.dex */
public final class h {

    public static class a {
        public static void a(File file) {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e10) {
                throw new IOException("Failed to delete file " + file + ": " + e10);
            }
        }
    }

    public static void a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(file);
        } else {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }
}
