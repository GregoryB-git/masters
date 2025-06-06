package y6;

import dalvik.system.PathClassLoader;

/* loaded from: classes.dex */
public final class c extends PathClassLoader {
    public c(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }
}
