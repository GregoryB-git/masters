/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  dalvik.system.PathClassLoader
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.String
 */
package I2;

import dalvik.system.PathClassLoader;

public final class e
extends PathClassLoader {
    public e(String string2, ClassLoader classLoader) {
        super(string2, classLoader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Class loadClass(String string2, boolean bl) {
        if (string2.startsWith("java.")) return super.loadClass(string2, bl);
        if (string2.startsWith("android.")) return super.loadClass(string2, bl);
        try {
            return this.findClass(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return super.loadClass(string2, bl);
        }
    }
}

