package i1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import defpackage.f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7354a = 0;

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    public static class C0107a extends MediaBrowserCompat.c {

        /* renamed from: c, reason: collision with root package name */
        public final Context f7355c;

        /* renamed from: d, reason: collision with root package name */
        public final Intent f7356d;

        /* renamed from: e, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f7357e;
        public MediaBrowserCompat f;

        public C0107a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f7355c = context;
            this.f7356d = intent;
            this.f7357e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void a() {
            Context context = this.f7355c;
            MediaBrowserCompat.e eVar = this.f.f423a;
            if (eVar.f437h == null) {
                MediaSession.Token sessionToken = eVar.f432b.getSessionToken();
                eVar.f437h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, null, null) : null;
            }
            MediaSessionCompat.Token token = eVar.f437h;
            new ConcurrentHashMap();
            if (token == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = new MediaControllerCompat.MediaControllerImplApi21(context, token);
            KeyEvent keyEvent = (KeyEvent) this.f7356d.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            mediaControllerImplApi21.f469a.dispatchMediaButtonEvent(keyEvent);
            this.f.a();
            this.f7357e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void b() {
            this.f.a();
            this.f7357e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void c() {
            this.f.a();
            this.f7357e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder m10 = f.m("Expected 1 service that handles ", str, ", found ");
        m10.append(queryIntentServices.size());
        throw new IllegalStateException(m10.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName a10 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a10 != null) {
            intent.setComponent(a10);
            v.a.startForegroundService(context, intent);
            return;
        }
        ComponentName a11 = a(context, "android.media.browse.MediaBrowserService");
        if (a11 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0107a c0107a = new C0107a(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a11, c0107a);
        c0107a.f = mediaBrowserCompat;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.f423a.f432b.connect();
    }
}
