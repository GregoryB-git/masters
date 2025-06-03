// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.core.app;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.app.Application;
import android.app.Activity;
import android.content.Intent;
import android.app.AppComponentFactory;

public class CoreComponentFactory extends AppComponentFactory
{
    public static Object a(final Object o) {
        return o;
    }
    
    public Activity instantiateActivity(final ClassLoader classLoader, final String s, final Intent intent) {
        return (Activity)a(super.instantiateActivity(classLoader, s, intent));
    }
    
    public Application instantiateApplication(final ClassLoader classLoader, final String s) {
        return (Application)a(super.instantiateApplication(classLoader, s));
    }
    
    public ContentProvider instantiateProvider(final ClassLoader classLoader, final String s) {
        return (ContentProvider)a(super.instantiateProvider(classLoader, s));
    }
    
    public BroadcastReceiver instantiateReceiver(final ClassLoader classLoader, final String s, final Intent intent) {
        return (BroadcastReceiver)a(super.instantiateReceiver(classLoader, s, intent));
    }
    
    public Service instantiateService(final ClassLoader classLoader, final String s, final Intent intent) {
        return (Service)a(super.instantiateService(classLoader, s, intent));
    }
}
