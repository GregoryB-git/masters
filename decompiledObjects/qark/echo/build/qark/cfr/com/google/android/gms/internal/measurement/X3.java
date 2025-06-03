/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.ServiceConfigurationError
 *  java.util.ServiceLoader
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.M3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class X3 {
    public static final Logger a = Logger.getLogger((String)J3.class.getName());
    public static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M3 a(Class object) {
        String string2;
        ClassLoader classLoader = X3.class.getClassLoader();
        if (!object.equals(M3.class)) {
            if (!object.getPackage().equals((Object)X3.class.getPackage())) {
                throw new IllegalArgumentException(object.getName());
            }
            string2 = String.format((String)"%s.BlazeGenerated%sLoader", (Object[])new Object[]{object.getPackage().getName(), object.getSimpleName()});
        } else {
            string2 = b;
        }
        try {
            string2 = Class.forName((String)string2, (boolean)true, (ClassLoader)classLoader);
            try {
                a.a(string2.getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new IllegalStateException((Throwable)invocationTargetException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new IllegalStateException((Throwable)illegalAccessException);
            }
            catch (InstantiationException instantiationException) {
                throw new IllegalStateException((Throwable)instantiationException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new IllegalStateException((Throwable)noSuchMethodException);
            }
            throw null;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        Iterator iterator = ServiceLoader.load(X3.class, (ClassLoader)classLoader).iterator();
        classLoader = new ArrayList();
        do {
            if (!iterator.hasNext()) {
                if (classLoader.size() == 1) {
                    return (M3)classLoader.get(0);
                }
                if (classLoader.size() == 0) {
                    return null;
                }
                try {
                    return (M3)object.getMethod("combine", new Class[]{Collection.class}).invoke((Object)null, new Object[]{classLoader});
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new IllegalStateException((Throwable)invocationTargetException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalStateException((Throwable)illegalAccessException);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw new IllegalStateException((Throwable)noSuchMethodException);
                }
            }
            try {
                a.a(iterator.next());
            }
            catch (ServiceConfigurationError serviceConfigurationError) {
                Logger logger = a;
                Level level = Level.SEVERE;
                String string3 = object.getSimpleName();
                StringBuilder stringBuilder = new StringBuilder("Unable to load ");
                stringBuilder.append(string3);
                logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", stringBuilder.toString(), (Throwable)serviceConfigurationError);
                continue;
            }
            throw null;
            break;
        } while (true);
    }
}

