package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f10709a = Logger.getLogger(J3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static String f10710b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static M3 a(Class cls) {
        String str;
        ClassLoader classLoader = X3.class.getClassLoader();
        if (cls.equals(M3.class)) {
            str = f10710b;
        } else {
            if (!cls.getPackage().equals(X3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        android.support.v4.media.a.a(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(e7);
                    } catch (NoSuchMethodException e8) {
                        throw new IllegalStateException(e8);
                    }
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(X3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e11) {
                    f10709a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + cls.getSimpleName(), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (M3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (M3) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }
}
