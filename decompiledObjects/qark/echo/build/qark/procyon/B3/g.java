// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import android.os.BaseBundle;
import java.util.Collections;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.os.Bundle;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;

public final class g
{
    public final Object a;
    public final c b;
    
    public g(final Object a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    public static g c(final Context context, final Class clazz) {
        return new g(context, (c)new b(clazz, null));
    }
    
    public static ComponentRegistrar d(final String className) {
        while (true) {
            while (true) {
                try {
                    final Class<?> forName = Class.forName(className);
                    if (ComponentRegistrar.class.isAssignableFrom(forName)) {
                        return (ComponentRegistrar)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    }
                    throw new w(String.format("Class %s is not an instance of %s", className, "com.google.firebase.components.ComponentRegistrar"));
                    final IllegalAccessException ex;
                    throw new w(String.format("Could not instantiate %s.", className), ex);
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", className));
                    return null;
                }
                catch (ClassNotFoundException ex3) {
                    continue;
                }
                catch (InvocationTargetException ex4) {}
                catch (NoSuchMethodException ex5) {}
                catch (InstantiationException ex6) {}
                catch (IllegalAccessException ex2) {}
                break;
            }
            final IllegalAccessException ex2;
            final IllegalAccessException ex = ex2;
            continue;
        }
    }
    
    public List b() {
        final ArrayList<f> list = new ArrayList<f>();
        final Iterator<String> iterator = this.b.a(this.a).iterator();
        while (iterator.hasNext()) {
            list.add(new f(iterator.next()));
        }
        return list;
    }
    
    public static class b implements c
    {
        public final Class a;
        
        public b(final Class a) {
            this.a = a;
        }
        
        public final Bundle b(final Context context) {
            while (true) {
                try {
                    final PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("ComponentDiscovery", "Context has no PackageManager.");
                        return null;
                    }
                    final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                    if (serviceInfo == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.a);
                        sb.append(" has no service info.");
                        Log.w("ComponentDiscovery", sb.toString());
                        return null;
                    }
                    return serviceInfo.metaData;
                    Log.w("ComponentDiscovery", "Application info not found.");
                    return null;
                }
                catch (PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
        
        public List c(final Context context) {
            final Bundle b = this.b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            final ArrayList<String> list = new ArrayList<String>();
            for (final String s : ((BaseBundle)b).keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(((BaseBundle)b).get(s)) && s.startsWith("com.google.firebase.components:")) {
                    list.add(s.substring(31));
                }
            }
            return list;
        }
    }
    
    public interface c
    {
        List a(final Object p0);
    }
}
