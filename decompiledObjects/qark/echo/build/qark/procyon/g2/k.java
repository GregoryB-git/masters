// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

import android.os.BaseBundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Collections;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import android.util.Log;
import android.os.Bundle;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;

public class k implements e
{
    public final a a;
    public final i b;
    public final Map c;
    
    public k(final Context context, final i i) {
        this(new a(context), i);
    }
    
    public k(final a a, final i b) {
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public m a(final String s) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0085: {
            try {
                if (this.c.containsKey(s)) {
                    // monitorexit(this)
                    return this.c.get(s);
                }
            }
            finally {
                break Label_0085;
            }
            final String s2;
            final d b = this.a.b(s2);
            if (b == null) {
                // monitorexit(this)
                return null;
            }
            final m create = b.create(this.b.a(s2));
            this.c.put(s2, create);
            return create;
        }
    }
    // monitorexit(this)
    
    public static class a
    {
        public final Context a;
        public Map b;
        
        public a(final Context a) {
            this.b = null;
            this.a = a;
        }
        
        public static Bundle d(final Context context) {
            while (true) {
                try {
                    final PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                        return null;
                    }
                    final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class)TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        return null;
                    }
                    return serviceInfo.metaData;
                    Log.w("BackendRegistry", "Application info not found.");
                    return null;
                }
                catch (PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
        
        public final Map a(final Context context) {
            final Bundle d = d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            for (final String s : ((BaseBundle)d).keySet()) {
                final Object value = ((BaseBundle)d).get(s);
                if (value instanceof String && s.startsWith("backend:")) {
                    final String[] split = ((String)value).split(",", -1);
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final String trim = split[i].trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, s.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }
        
        public d b(final String s) {
            final String className = this.c().get(s);
            if (className == null) {
                return null;
            }
        Label_0124_Outer:
            while (true) {
                Label_0151: {
                    while (true) {
                        Label_0134: {
                            Label_0110: {
                                Label_0093: {
                                    try {
                                        return (d)Class.forName(className).asSubclass(d.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                                    }
                                    catch (InvocationTargetException ex) {}
                                    catch (NoSuchMethodException ex) {
                                        break Label_0093;
                                    }
                                    catch (InstantiationException ex2) {
                                        break Label_0110;
                                    }
                                    catch (IllegalAccessException ex2) {
                                        break Label_0134;
                                    }
                                    catch (ClassNotFoundException ex) {
                                        break Label_0151;
                                    }
                                    final String s2 = String.format("Could not instantiate %s", className);
                                    final InvocationTargetException ex;
                                    Log.w("BackendRegistry", s2, (Throwable)ex);
                                    return null;
                                }
                                final String s2 = String.format("Could not instantiate %s", className);
                                continue Label_0124_Outer;
                            }
                            final String s3 = String.format("Could not instantiate %s.", className);
                            final InstantiationException ex2;
                            Log.w("BackendRegistry", s3, (Throwable)ex2);
                            return null;
                        }
                        final String s3 = String.format("Could not instantiate %s.", className);
                        continue;
                    }
                }
                final String s2 = String.format("Class %s is not found.", className);
                continue;
            }
        }
        
        public final Map c() {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }
    }
}
