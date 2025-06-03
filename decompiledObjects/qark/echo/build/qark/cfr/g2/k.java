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
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import g2.d;
import g2.e;
import g2.h;
import g2.i;
import g2.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class k
implements e {
    public final a a;
    public final i b;
    public final Map c = new HashMap();

    public k(Context context, i i8) {
        this(new a(context), i8);
    }

    public k(a a8, i i8) {
        this.a = a8;
        this.b = i8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public m a(String object) {
        synchronized (this) {
            Object object2;
            Throwable throwable2;
            block5 : {
                try {
                    if (this.c.containsKey(object)) {
                        return (m)this.c.get(object);
                    }
                    object2 = this.a.b((String)object);
                    if (object2 != null) break block5;
                }
                catch (Throwable throwable2) {}
                return null;
            }
            object2 = object2.create(this.b.a((String)object));
            this.c.put(object, object2);
            return object2;
            throw throwable2;
        }
    }

    public static class a {
        public final Context a;
        public Map b = null;

        public a(Context context) {
            this.a = context;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w((String)"BackendRegistry", (String)"Context has no PackageManager.");
                    return null;
                }
                if ((context = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) != null) return context.metaData;
                Log.w((String)"BackendRegistry", (String)"TransportBackendDiscovery has no service info.");
                return null;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            Log.w((String)"BackendRegistry", (String)"Application info not found.");
            return null;
        }

        public final Map a(Context context) {
            if ((context = a.d(context)) == null) {
                Log.w((String)"BackendRegistry", (String)"Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String string2 : context.keySet()) {
                String[] arrstring = context.get(string2);
                if (!(arrstring instanceof String) || !string2.startsWith("backend:")) continue;
                arrstring = ((String)arrstring).split(",", -1);
                int n8 = arrstring.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    String string3 = arrstring[i8].trim();
                    if (string3.isEmpty()) continue;
                    hashMap.put((Object)string3, (Object)string2.substring(8));
                }
            }
            return hashMap;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public d b(String object) {
            void var1_7;
            String string2;
            block11 : {
                block10 : {
                    void var1_8;
                    block12 : {
                        block9 : {
                            block8 : {
                                block7 : {
                                    string2 = (String)this.c().get(object);
                                    if (string2 == null) {
                                        return null;
                                    }
                                    try {
                                        return (d)Class.forName((String)string2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                    }
                                    catch (NoSuchMethodException noSuchMethodException) {
                                        break block7;
                                    }
                                    catch (InstantiationException instantiationException) {
                                        break block8;
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        break block9;
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        break block10;
                                    }
                                    string2 = String.format((String)"Could not instantiate %s", (Object[])new Object[]{string2});
                                    break block11;
                                }
                                string2 = String.format((String)"Could not instantiate %s", (Object[])new Object[]{string2});
                                break block11;
                            }
                            string2 = String.format((String)"Could not instantiate %s.", (Object[])new Object[]{string2});
                            break block12;
                        }
                        string2 = String.format((String)"Could not instantiate %s.", (Object[])new Object[]{string2});
                    }
                    Log.w((String)"BackendRegistry", (String)string2, (Throwable)var1_8);
                    return null;
                }
                string2 = String.format((String)"Class %s is not found.", (Object[])new Object[]{string2});
            }
            Log.w((String)"BackendRegistry", (String)string2, (Throwable)var1_7);
            return null;
        }

        public final Map c() {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }
    }

}

