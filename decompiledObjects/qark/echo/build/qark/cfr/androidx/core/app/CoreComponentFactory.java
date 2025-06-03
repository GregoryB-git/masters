/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.Intent
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory
extends AppComponentFactory {
    public static Object a(Object object) {
        return object;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String string2, Intent intent) {
        return (Activity)CoreComponentFactory.a((Object)super.instantiateActivity(classLoader, string2, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String string2) {
        return (Application)CoreComponentFactory.a((Object)super.instantiateApplication(classLoader, string2));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String string2) {
        return (ContentProvider)CoreComponentFactory.a((Object)super.instantiateProvider(classLoader, string2));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String string2, Intent intent) {
        return (BroadcastReceiver)CoreComponentFactory.a((Object)super.instantiateReceiver(classLoader, string2, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String string2, Intent intent) {
        return (Service)CoreComponentFactory.a((Object)super.instantiateService(classLoader, string2, intent));
    }
}

