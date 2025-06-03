package Y;

import androidx.lifecycle.h;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static a b(h hVar) {
        return new b(hVar, ((u) hVar).d());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
