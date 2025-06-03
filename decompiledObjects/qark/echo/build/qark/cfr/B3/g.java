/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ServiceInfo
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package B3;

import B3.f;
import B3.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class g {
    public final Object a;
    public final c b;

    public g(Object object, c c8) {
        this.a = object;
        this.b = c8;
    }

    public static /* synthetic */ ComponentRegistrar a(String string2) {
        return g.d(string2);
    }

    public static g c(Context context, Class class_) {
        return new g((Object)context, new b(class_, null));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static ComponentRegistrar d(String string2) {
        try {
            Class class_ = Class.forName((String)string2);
            if (!ComponentRegistrar.class.isAssignableFrom(class_)) throw new w(String.format((String)"Class %s is not an instance of %s", (Object[])new Object[]{string2, "com.google.firebase.components.ComponentRegistrar"}));
            return (ComponentRegistrar)class_.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (ClassNotFoundException classNotFoundException) {}
        Log.w((String)"ComponentDiscovery", (String)String.format((String)"Class %s is not an found.", (Object[])new Object[]{string2}));
        return null;
        catch (InvocationTargetException invocationTargetException) {}
        throw new w(String.format((String)"Could not instantiate %s", (Object[])new Object[]{string2}), (Throwable)invocationTargetException);
        catch (NoSuchMethodException noSuchMethodException) {}
        throw new w(String.format((String)"Could not instantiate %s", (Object[])new Object[]{string2}), (Throwable)noSuchMethodException);
        catch (InstantiationException instantiationException) {}
        throw new w(String.format((String)"Could not instantiate %s.", (Object[])new Object[]{string2}), (Throwable)instantiationException);
        catch (IllegalAccessException illegalAccessException) {}
        throw new w(String.format((String)"Could not instantiate %s.", (Object[])new Object[]{string2}), (Throwable)illegalAccessException);
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.b.a(this.a).iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)new f((String)iterator.next()));
        }
        return arrayList;
    }

    public static class b
    implements c {
        public final Class a;

        public b(Class class_) {
            this.a = class_;
        }

        public /* synthetic */ b(Class class_,  a8) {
            this(class_);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w((String)"ComponentDiscovery", (String)"Context has no PackageManager.");
                    return null;
                }
                if ((context = packageManager.getServiceInfo(new ComponentName(context, this.a), 128)) != null) return context.metaData;
                context = new StringBuilder();
                context.append((Object)this.a);
                context.append(" has no service info.");
                Log.w((String)"ComponentDiscovery", (String)context.toString());
                return null;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            Log.w((String)"ComponentDiscovery", (String)"Application info not found.");
            return null;
        }

        public List c(Context context) {
            if ((context = this.b(context)) == null) {
                Log.w((String)"ComponentDiscovery", (String)"Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String string2 : context.keySet()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(context.get(string2)) || !string2.startsWith("com.google.firebase.components:")) continue;
                arrayList.add((Object)string2.substring(31));
            }
            return arrayList;
        }
    }

    public static interface c {
        public List a(Object var1);
    }

}

