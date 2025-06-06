package I2;

import dalvik.system.PathClassLoader;

/* loaded from: classes.dex */
public final class e extends PathClassLoader {
    public e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z7) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z7);
    }
}
