package g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f14411a;

    /* renamed from: b, reason: collision with root package name */
    public final i f14412b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f14413c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14414a;

        /* renamed from: b, reason: collision with root package name */
        public Map f14415b = null;

        public a(Context context) {
            this.f14414a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle d7 = d(context);
            if (d7 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d7.keySet()) {
                Object obj = d7.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public InterfaceC1317d b(String str) {
            String format;
            String format2;
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC1317d) Class.forName(str2).asSubclass(InterfaceC1317d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e7) {
                e = e7;
                format = String.format("Class %s is not found.", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (IllegalAccessException e8) {
                e = e8;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (InstantiationException e9) {
                e = e9;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (NoSuchMethodException e10) {
                e = e10;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (InvocationTargetException e11) {
                e = e11;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            }
        }

        public final Map c() {
            if (this.f14415b == null) {
                this.f14415b = a(this.f14414a);
            }
            return this.f14415b;
        }
    }

    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // g2.e
    public synchronized m a(String str) {
        if (this.f14413c.containsKey(str)) {
            return (m) this.f14413c.get(str);
        }
        InterfaceC1317d b7 = this.f14411a.b(str);
        if (b7 == null) {
            return null;
        }
        m create = b7.create(this.f14412b.a(str));
        this.f14413c.put(str, create);
        return create;
    }

    public k(a aVar, i iVar) {
        this.f14413c = new HashMap();
        this.f14411a = aVar;
        this.f14412b = iVar;
    }
}
