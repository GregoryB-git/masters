/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ForegroundServiceStartNotAllowedException
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.KeyEvent
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package c0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import c0.c;
import java.util.List;

public abstract class d
extends BroadcastReceiver {
    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        context = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (context.size() == 1) {
            context = ((ResolveInfo)context.get((int)0)).activityInfo;
            return new ComponentName(context.packageName, context.name);
        }
        if (context.size() > 1) {
            Log.w((String)"MediaButtonReceiver", (String)"More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    public static ComponentName b(Context context, String string2) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(string2);
        intent.setPackage(context.getPackageName());
        context = packageManager.queryIntentServices(intent, 0);
        if (context.size() == 1) {
            context = ((ResolveInfo)context.get((int)0)).serviceInfo;
            return new ComponentName(context.packageName, context.name);
        }
        if (context.isEmpty()) {
            return null;
        }
        packageManager = new StringBuilder();
        packageManager.append("Expected 1 service that handles ");
        packageManager.append(string2);
        packageManager.append(", found ");
        packageManager.append(context.size());
        throw new IllegalStateException(packageManager.toString());
    }

    public static KeyEvent c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals((Object)intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.b().a((KeyEvent)intent);
            return intent;
        }
        return null;
    }

    public void d(Intent intent, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        intent = new StringBuilder();
        intent.append("caught exception when trying to start a foreground service from the background: ");
        intent.append(c0.a.a(foregroundServiceStartNotAllowedException));
        Log.e((String)"MediaButtonReceiver", (String)intent.toString());
    }

    public void onReceive(Context object, Intent object2) {
        if (object2 != null && "android.intent.action.MEDIA_BUTTON".equals((Object)object2.getAction()) && object2.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName componentName = d.b((Context)object, "android.intent.action.MEDIA_BUTTON");
            if (componentName != null) {
                object2.setComponent(componentName);
                try {
                    x.a.k((Context)object, (Intent)object2);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    if (Build.VERSION.SDK_INT >= 31 && a.b(illegalStateException)) {
                        this.d((Intent)object2, a.a(illegalStateException));
                        return;
                    }
                    throw illegalStateException;
                }
            }
            componentName = d.b((Context)object, "android.media.browse.MediaBrowserService");
            if (componentName != null) {
                BroadcastReceiver.PendingResult pendingResult = this.goAsync();
                object = object.getApplicationContext();
                object2 = new b((Context)object, (Intent)object2, pendingResult);
                object = new MediaBrowserCompat((Context)object, componentName, (MediaBrowserCompat.b)object2, null);
                object2.f((MediaBrowserCompat)object);
                object.a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        object = new StringBuilder();
        object.append("Ignore unsupported intent: ");
        object.append(object2);
        Log.d((String)"MediaButtonReceiver", (String)object.toString());
    }

    public static final abstract class a {
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return c0.b.a((Object)illegalStateException);
        }

        public static boolean b(IllegalStateException illegalStateException) {
            return c.a((Object)illegalStateException);
        }
    }

    public static class b
    extends MediaBrowserCompat.b {
        public final Context c;
        public final Intent d;
        public final BroadcastReceiver.PendingResult e;
        public MediaBrowserCompat f;

        public b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        @Override
        public void a() {
            new MediaControllerCompat(this.c, this.f.c()).a((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.e();
        }

        @Override
        public void b() {
            this.e();
        }

        @Override
        public void c() {
            this.e();
        }

        public final void e() {
            this.f.b();
            this.e.finish();
        }

        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }
    }

}

