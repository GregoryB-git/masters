// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I2;

import dalvik.system.PathClassLoader;

public final class e extends PathClassLoader
{
    public e(final String s, final ClassLoader classLoader) {
        super(s, classLoader);
    }
    
    public final Class loadClass(final String name, final boolean b) {
        Label_0026: {
            if (name.startsWith("java.") || name.startsWith("android.")) {
                break Label_0026;
            }
            try {
                return ((ClassLoader)this).findClass(name);
                return super.loadClass(name, b);
            }
            catch (ClassNotFoundException ex) {
                return super.loadClass(name, b);
            }
        }
    }
}
