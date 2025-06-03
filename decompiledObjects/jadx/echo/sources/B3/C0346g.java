package B3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r4.InterfaceC1922b;

/* renamed from: B3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f765a;

    /* renamed from: b, reason: collision with root package name */
    public final c f766b;

    /* renamed from: B3.g$b */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f767a;

        public b(Class cls) {
            this.f767a = cls;
        }

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f767a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f767a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // B3.C0346g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle b7 = b(context);
            if (b7 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b7.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b7.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: B3.g$c */
    public interface c {
        List a(Object obj);
    }

    public C0346g(Object obj, c cVar) {
        this.f765a = obj;
        this.f766b = cVar;
    }

    public static C0346g c(Context context, Class cls) {
        return new C0346g(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e7) {
            throw new w(String.format("Could not instantiate %s.", str), e7);
        } catch (InstantiationException e8) {
            throw new w(String.format("Could not instantiate %s.", str), e8);
        } catch (NoSuchMethodException e9) {
            throw new w(String.format("Could not instantiate %s", str), e9);
        } catch (InvocationTargetException e10) {
            throw new w(String.format("Could not instantiate %s", str), e10);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f766b.a(this.f765a)) {
            arrayList.add(new InterfaceC1922b() { // from class: B3.f
                @Override // r4.InterfaceC1922b
                public final Object get() {
                    ComponentRegistrar d7;
                    d7 = C0346g.d(str);
                    return d7;
                }
            });
        }
        return arrayList;
    }
}
