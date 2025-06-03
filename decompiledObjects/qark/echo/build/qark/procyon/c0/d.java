// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c0;

import android.support.v4.media.session.MediaControllerCompat;
import android.content.BroadcastReceiver$PendingResult;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.os.Build$VERSION;
import android.app.ForegroundServiceStartNotAllowedException;
import android.view.KeyEvent;
import android.support.v4.media.session.MediaSessionCompat;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.util.Log;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;
import android.content.BroadcastReceiver;

public abstract class d extends BroadcastReceiver
{
    public static ComponentName a(final Context context) {
        final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        final List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            final ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }
    
    public static ComponentName b(final Context context, final String str) {
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected 1 service that handles ");
        sb.append(str);
        sb.append(", found ");
        sb.append(queryIntentServices.size());
        throw new IllegalStateException(sb.toString());
    }
    
    public static KeyEvent c(final MediaSessionCompat mediaSessionCompat, final Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.b().a(keyEvent);
            return keyEvent;
        }
        return null;
    }
    
    public void d(final Intent intent, final ForegroundServiceStartNotAllowedException ex) {
        final StringBuilder sb = new StringBuilder();
        sb.append("caught exception when trying to start a foreground service from the background: ");
        sb.append(c0.a.a(ex));
        Log.e("MediaButtonReceiver", sb.toString());
    }
    
    public void onReceive(Context applicationContext, final Intent obj) {
        if (obj == null || !"android.intent.action.MEDIA_BUTTON".equals(obj.getAction()) || !obj.hasExtra("android.intent.extra.KEY_EVENT")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(obj);
            Log.d("MediaButtonReceiver", sb.toString());
            return;
        }
        final ComponentName b = b(applicationContext, "android.intent.action.MEDIA_BUTTON");
        if (b != null) {
            obj.setComponent(b);
            try {
                x.a.k(applicationContext, obj);
                return;
            }
            catch (IllegalStateException ex) {
                if (Build$VERSION.SDK_INT >= 31 && a.b(ex)) {
                    this.d(obj, a.a(ex));
                    return;
                }
                throw ex;
            }
        }
        final ComponentName b2 = b(applicationContext, "android.media.browse.MediaBrowserService");
        if (b2 != null) {
            final BroadcastReceiver$PendingResult goAsync = this.goAsync();
            applicationContext = applicationContext.getApplicationContext();
            final b b3 = new b(applicationContext, obj, goAsync);
            final MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b2, (MediaBrowserCompat.b)b3, null);
            b3.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
    
    public abstract static final class a
    {
        public static ForegroundServiceStartNotAllowedException a(final IllegalStateException ex) {
            return c0.b.a((Object)ex);
        }
        
        public static boolean b(final IllegalStateException ex) {
            return c.a((Object)ex);
        }
    }
    
    public static class b extends MediaBrowserCompat.b
    {
        public final Context c;
        public final Intent d;
        public final BroadcastReceiver$PendingResult e;
        public MediaBrowserCompat f;
        
        public b(final Context c, final Intent d, final BroadcastReceiver$PendingResult e) {
            this.c = c;
            this.d = d;
            this.e = e;
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
        
        public void f(final MediaBrowserCompat f) {
            this.f = f;
        }
    }
}
