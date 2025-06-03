/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.MediaMetadata
 *  android.media.session.MediaController
 *  android.media.session.MediaController$Callback
 *  android.media.session.MediaController$PlaybackInfo
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Token
 *  android.media.session.PlaybackState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.os.ResultReceiver
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package android.support.v4.media.session;

import a0.n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MediaControllerCompat {
    public final b a;
    public final MediaSessionCompat.Token b;
    public final Set c;

    /*
     * Enabled aggressive block sorting
     */
    public MediaControllerCompat(Context object, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.c = Collections.synchronizedSet((Set)new HashSet());
        this.b = token;
        object = Build.VERSION.SDK_INT >= 29 ? new c((Context)object, token) : new MediaControllerImplApi21((Context)object, token);
        this.a = object;
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }

    public static void f(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(n.a, (Object)mediaControllerCompat);
        MediaControllerImplApi21.h(activity, mediaControllerCompat);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public PendingIntent b() {
        return this.a.a();
    }

    public MediaSessionCompat.Token c() {
        return this.b;
    }

    public void d(a a8) {
        this.e(a8, null);
    }

    public void e(a a8, Handler handler) {
        if (a8 != null) {
            if (!this.c.add((Object)a8)) {
                Log.w((String)"MediaControllerCompat", (String)"the callback has already been registered");
                return;
            }
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler();
            }
            a8.n(handler2);
            this.a.d(a8, handler2);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void g(a a8) {
        if (a8 != null) {
            if (!this.c.remove((Object)a8)) {
                Log.w((String)"MediaControllerCompat", (String)"the callback has never been registered");
                return;
            }
            try {
                this.a.b(a8);
                return;
            }
            finally {
                a8.n(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public static class MediaControllerImplApi21
    implements b {
        public final MediaController a;
        public final Object b = new Object();
        public final List c = new ArrayList();
        public HashMap d = new HashMap();
        public final MediaSessionCompat.Token e;

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            this.a = new MediaController(context, (MediaSession.Token)token.e());
            if (token.c() == null) {
                this.f();
            }
        }

        public static void h(Activity activity, MediaControllerCompat mediaControllerCompat) {
            mediaControllerCompat = mediaControllerCompat != null ? new MediaController((Context)activity, (MediaSession.Token)mediaControllerCompat.c().e()) : null;
            activity.setMediaController((MediaController)mediaControllerCompat);
        }

        @Override
        public PendingIntent a() {
            return this.a.getSessionActivity();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public final void b(android.support.v4.media.session.MediaControllerCompat$a a8) {
            block6 : {
                this.a.unregisterCallback(a8.a);
                Object object = this.b;
                // MONITORENTER : object
                Object object2 = this.e.c();
                if (object2 == null) break block6;
                object2 = (a)this.d.remove((Object)a8);
                if (object2 == null) return;
                {
                    a8.c = null;
                    this.e.c().u0((android.support.v4.media.session.a)object2);
                    return;
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in unregisterCallback.", (Throwable)remoteException);
                    return;
                }
            }
            this.c.remove((Object)a8);
            // MONITOREXIT : object
        }

        @Override
        public boolean c(KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public final void d(android.support.v4.media.session.MediaControllerCompat$a a8, Handler object) {
            this.a.registerCallback(a8.a, (Handler)object);
            object = this.b;
            // MONITORENTER : object
            if (this.e.c() == null) {
                a8.c = null;
                this.c.add((Object)a8);
                // MONITOREXIT : object
                return;
            }
            a a9 = new a(a8);
            this.d.put((Object)a8, (Object)a9);
            a8.c = a9;
            this.e.c().A(a9);
            a8.m(13, null, null);
            return;
            catch (RemoteException remoteException) {
                Log.e((String)"MediaControllerCompat", (String)"Dead object in registerCallback.", (Throwable)remoteException);
                return;
            }
        }

        public void e() {
            if (this.e.c() == null) {
                return;
            }
            for (android.support.v4.media.session.MediaControllerCompat$a a8 : this.c) {
                a a9 = new a(a8);
                this.d.put((Object)a8, (Object)a9);
                a8.c = a9;
                try {
                    this.e.c().A(a9);
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in registerCallback.", (Throwable)remoteException);
                    break;
                }
                a8.m(13, null, null);
            }
            this.c.clear();
        }

        public final void f() {
            this.g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        public void g(String string2, Bundle bundle, ResultReceiver resultReceiver) {
            this.a.sendCommand(string2, bundle, resultReceiver);
        }

        public static class ExtraBinderRequestResultReceiver
        extends ResultReceiver {
            public WeakReference o;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.o = new WeakReference((Object)mediaControllerImplApi21);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onReceiveResult(int n8, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21)this.o.get();
                if (mediaControllerImplApi21 == null) {
                    return;
                }
                if (bundle == null) {
                    return;
                }
                Object object = mediaControllerImplApi21.b;
                synchronized (object) {
                    mediaControllerImplApi21.e.f(b.a.n(w.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.e.g(v1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.e();
                    return;
                }
            }
        }

        public static class a
        extends a.c {
            public a(android.support.v4.media.session.MediaControllerCompat$a a8) {
                super(a8);
            }

            @Override
            public void C() {
                throw new AssertionError();
            }

            @Override
            public void E(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override
            public void X0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override
            public void g0(Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void l0(List list) {
                throw new AssertionError();
            }

            @Override
            public void x(CharSequence charSequence) {
                throw new AssertionError();
            }
        }

    }

    public static abstract class android.support.v4.media.session.MediaControllerCompat$a
    implements IBinder.DeathRecipient {
        public final MediaController.Callback a;
        public b b;
        public android.support.v4.media.session.a c;

        public android.support.v4.media.session.MediaControllerCompat$a() {
            this.a = new a(this);
        }

        public void a(d d8) {
        }

        public void b(boolean bl) {
        }

        public void binderDied() {
            this.m(8, null, null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int n8) {
        }

        public void i() {
        }

        public void j(String string2, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int n8) {
        }

        public void m(int n8, Object object, Bundle bundle) {
            b b8 = this.b;
            if (b8 != null) {
                object = b8.obtainMessage(n8, object);
                object.setData(bundle);
                object.sendToTarget();
            }
        }

        public void n(Handler handler) {
            if (handler == null) {
                handler = this.b;
                if (handler != null) {
                    handler.a = false;
                    handler.removeCallbacksAndMessages((Object)null);
                    this.b = null;
                    return;
                }
            } else {
                handler = new b(handler.getLooper());
                this.b = handler;
                handler.a = true;
            }
        }

        public static class a
        extends MediaController.Callback {
            public final WeakReference a;

            public a(android.support.v4.media.session.MediaControllerCompat$a a8) {
                this.a = new WeakReference((Object)a8);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.f((Object)playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.d(MediaMetadataCompat.b((Object)mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    if (a8.c != null) {
                        return;
                    }
                    a8.e(PlaybackStateCompat.a((Object)playbackState));
                }
            }

            public void onQueueChanged(List list) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.i();
                }
            }

            public void onSessionEvent(String string2, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.j(string2, bundle);
                }
            }
        }

        public class b
        extends Handler {
            public boolean a;

            public b(Looper looper) {
                super(looper);
                this.a = false;
            }

            public void handleMessage(Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    default: {
                        return;
                    }
                    case 13: {
                        a.this.k();
                        return;
                    }
                    case 12: {
                        a.this.l((Integer)message.obj);
                        return;
                    }
                    case 11: {
                        a.this.b((Boolean)message.obj);
                        return;
                    }
                    case 9: {
                        a.this.h((Integer)message.obj);
                        return;
                    }
                    case 8: {
                        a.this.i();
                        return;
                    }
                    case 7: {
                        message = (Bundle)message.obj;
                        MediaSessionCompat.a((Bundle)message);
                        a.this.c((Bundle)message);
                        return;
                    }
                    case 6: {
                        a.this.g((CharSequence)message.obj);
                        return;
                    }
                    case 5: {
                        a.this.f((List)message.obj);
                        return;
                    }
                    case 4: {
                        a.this.a((d)message.obj);
                        return;
                    }
                    case 3: {
                        a.this.d((MediaMetadataCompat)message.obj);
                        return;
                    }
                    case 2: {
                        a.this.e((PlaybackStateCompat)message.obj);
                        return;
                    }
                    case 1: 
                }
                Bundle bundle = message.getData();
                MediaSessionCompat.a(bundle);
                a.this.j((String)message.obj, bundle);
            }
        }

        public static abstract class c
        extends a.a {
            public final WeakReference b;

            public c(android.support.v4.media.session.MediaControllerCompat$a a8) {
                this.b = new WeakReference((Object)a8);
            }

            @Override
            public void J0(boolean bl) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(11, bl, null);
                }
            }

            @Override
            public void Q0(PlaybackStateCompat playbackStateCompat) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(2, playbackStateCompat, null);
                }
            }

            @Override
            public void d0(int n8) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(12, n8, null);
                }
            }

            @Override
            public void f0() {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(13, null, null);
                }
            }

            @Override
            public void m(int n8) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(9, n8, null);
                }
            }

            @Override
            public void t(String string2, Bundle bundle) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.b.get();
                if (a8 != null) {
                    a8.m(1, string2, bundle);
                }
            }

            @Override
            public void w(boolean bl) {
            }
        }

    }

    public static interface b {
        public PendingIntent a();

        public void b(a var1);

        public boolean c(KeyEvent var1);

        public void d(a var1, Handler var2);
    }

    public static class c
    extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static final class d {
        public final int a;
        public final AudioAttributesCompat b;
        public final int c;
        public final int d;
        public final int e;

        public d(int n8, AudioAttributesCompat audioAttributesCompat, int n9, int n10, int n11) {
            this.a = n8;
            this.b = audioAttributesCompat;
            this.c = n9;
            this.d = n10;
            this.e = n11;
        }
    }

}

