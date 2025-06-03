package android.support.v4.media.session;

import N4.h;
import a0.AbstractC0731n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
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
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import v1.AbstractC2049a;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final b f8190a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f8191b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8192c;

    public static class MediaControllerImplApi21 implements b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaController f8193a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f8194b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final List f8195c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public HashMap f8196d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public final MediaSessionCompat.Token f8197e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: o, reason: collision with root package name */
            public WeakReference f8198o;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f8198o = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i7, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f8198o.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f8194b) {
                    mediaControllerImplApi21.f8197e.f(b.a.n(w.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f8197e.g(AbstractC2049a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.e();
                }
            }
        }

        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void C() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void E(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void X0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void g0(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void l0(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void x(CharSequence charSequence) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f8197e = token;
            this.f8193a = new MediaController(context, (MediaSession.Token) token.e());
            if (token.c() == null) {
                f();
            }
        }

        public static void h(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.c().e()) : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent a() {
            return this.f8193a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void b(a aVar) {
            this.f8193a.unregisterCallback(aVar.f8199a);
            synchronized (this.f8194b) {
                if (this.f8197e.c() != null) {
                    try {
                        a aVar2 = (a) this.f8196d.remove(aVar);
                        if (aVar2 != null) {
                            aVar.f8201c = null;
                            this.f8197e.c().u0(aVar2);
                        }
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e7);
                    }
                } else {
                    this.f8195c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean c(KeyEvent keyEvent) {
            return this.f8193a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void d(a aVar, Handler handler) {
            this.f8193a.registerCallback(aVar.f8199a, handler);
            synchronized (this.f8194b) {
                if (this.f8197e.c() != null) {
                    a aVar2 = new a(aVar);
                    this.f8196d.put(aVar, aVar2);
                    aVar.f8201c = aVar2;
                    try {
                        this.f8197e.c().A(aVar2);
                        aVar.m(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    aVar.f8201c = null;
                    this.f8195c.add(aVar);
                }
            }
        }

        public void e() {
            if (this.f8197e.c() == null) {
                return;
            }
            for (a aVar : this.f8195c) {
                a aVar2 = new a(aVar);
                this.f8196d.put(aVar, aVar2);
                aVar.f8201c = aVar2;
                try {
                    this.f8197e.c().A(aVar2);
                    aVar.m(13, null, null);
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                }
            }
            this.f8195c.clear();
        }

        public final void f() {
            g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f8193a.sendCommand(str, bundle, resultReceiver);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final MediaController.Callback f8199a = new C0144a(this);

        /* renamed from: b, reason: collision with root package name */
        public b f8200b;

        /* renamed from: c, reason: collision with root package name */
        public android.support.v4.media.session.a f8201c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public static class C0144a extends MediaController.Callback {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f8202a;

            public C0144a(a aVar) {
                this.f8202a = new WeakReference(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.f8202a.get();
                if (aVar == null || aVar.f8201c != null) {
                    return;
                }
                aVar.e(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List list) {
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f8202a.get();
                if (aVar != null) {
                    aVar.j(str, bundle);
                }
            }
        }

        public class b extends Handler {

            /* renamed from: a, reason: collision with root package name */
            public boolean f8203a;

            public b(Looper looper) {
                super(looper);
                this.f8203a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f8203a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            a.this.j((String) message.obj, data);
                            break;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            a.this.a((d) message.obj);
                            break;
                        case 5:
                            a.this.f((List) message.obj);
                            break;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            a.this.c(bundle);
                            break;
                        case 8:
                            a.this.i();
                            break;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            break;
                        case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            a.this.l(((Integer) message.obj).intValue());
                            break;
                        case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            a.this.k();
                            break;
                    }
                }
            }
        }

        public static class c extends a.AbstractBinderC0146a {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference f8205b;

            public c(a aVar) {
                this.f8205b = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void J0(boolean z7) {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z7), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void Q0(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void d0(int i7) {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i7), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void f0() {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void m(int i7) {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i7), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void t(String str, Bundle bundle) {
                a aVar = (a) this.f8205b.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void w(boolean z7) {
            }
        }

        public void a(d dVar) {
        }

        public void b(boolean z7) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m(8, null, null);
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

        public void h(int i7) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i7) {
        }

        public void m(int i7, Object obj, Bundle bundle) {
            b bVar = this.f8200b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i7, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f8200b = bVar;
                bVar.f8203a = true;
            } else {
                b bVar2 = this.f8200b;
                if (bVar2 != null) {
                    bVar2.f8203a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f8200b = null;
                }
            }
        }
    }

    public interface b {
        PendingIntent a();

        void b(a aVar);

        boolean c(KeyEvent keyEvent);

        void d(a aVar, Handler handler);
    }

    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f8206a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioAttributesCompat f8207b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8208c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8209d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8210e;

        public d(int i7, AudioAttributesCompat audioAttributesCompat, int i8, int i9, int i10) {
            this.f8206a = i7;
            this.f8207b = audioAttributesCompat;
            this.f8208c = i8;
            this.f8209d = i9;
            this.f8210e = i10;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f8192c = Collections.synchronizedSet(new HashSet());
        this.f8191b = token;
        this.f8190a = Build.VERSION.SDK_INT >= 29 ? new c(context, token) : new MediaControllerImplApi21(context, token);
    }

    public static void f(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(AbstractC0731n.f7994a, mediaControllerCompat);
        MediaControllerImplApi21.h(activity, mediaControllerCompat);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f8190a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public PendingIntent b() {
        return this.f8190a.a();
    }

    public MediaSessionCompat.Token c() {
        return this.f8191b;
    }

    public void d(a aVar) {
        e(aVar, null);
    }

    public void e(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.f8192c.add(aVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.n(handler);
        this.f8190a.d(aVar, handler);
    }

    public void g(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.f8192c.remove(aVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f8190a.b(aVar);
        } finally {
            aVar.n(null);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }
}
