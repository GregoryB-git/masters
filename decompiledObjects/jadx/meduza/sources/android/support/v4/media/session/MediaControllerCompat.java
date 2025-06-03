package android.support.v4.media.session;

import android.app.Activity;
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
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import b2.e;
import com.ryanheise.audioservice.b;
import io.meduza.meduza.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final MediaControllerImplApi21 f466a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f467b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<a, Boolean> f468c = new ConcurrentHashMap<>();

    public static class MediaControllerImplApi21 {

        /* renamed from: a, reason: collision with root package name */
        public final MediaController f469a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f470b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f471c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public HashMap<a, a> f472d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        public final MediaSessionCompat.Token f473e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a, reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f474a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f474a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f474a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f470b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.f473e;
                    IMediaSession asInterface = IMediaSession.Stub.asInterface(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                    synchronized (token.f490a) {
                        token.f492c = asInterface;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.f473e;
                    e b10 = b2.a.b(bundle);
                    synchronized (token2.f490a) {
                        token2.f493d = b10;
                    }
                    mediaControllerImplApi21.a();
                }
            }
        }

        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void E1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void G1(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void c3(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void q0(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void x0(ArrayList arrayList) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void y1(CharSequence charSequence) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f473e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f491b);
            this.f469a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final void a() {
            if (this.f473e.a() == null) {
                return;
            }
            Iterator it = this.f471c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                this.f472d.put(aVar, aVar2);
                aVar.f477c = aVar2;
                try {
                    this.f473e.a().G(aVar2);
                    aVar.a(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f471c.clear();
        }

        public final void b(a aVar) {
            this.f469a.unregisterCallback(aVar.f475a);
            synchronized (this.f470b) {
                if (this.f473e.a() != null) {
                    try {
                        a remove = this.f472d.remove(aVar);
                        if (remove != null) {
                            aVar.f477c = null;
                            this.f473e.a().J0(remove);
                        }
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f471c.remove(aVar);
                }
            }
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final C0008a f475a = new C0008a(this);

        /* renamed from: b, reason: collision with root package name */
        public b f476b;

        /* renamed from: c, reason: collision with root package name */
        public MediaControllerImplApi21.a f477c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public static class C0008a extends MediaController.Callback {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f478a;

            public C0008a(a aVar) {
                this.f478a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f478a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    int i10 = Build.VERSION.SDK_INT;
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f478a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (this.f478a.get() != null) {
                    r.b<String, Integer> bVar = MediaMetadataCompat.f452d;
                    if (mediaMetadata != null) {
                        Parcel obtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f456b = mediaMetadata;
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f478a.get();
                if (aVar == null || aVar.f477c != null) {
                    return;
                }
                PlaybackStateCompat.a(playbackState);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                if (this.f478a.get() != null) {
                    MediaSessionCompat.QueueItem.a(list);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.f478a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                this.f478a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f478a.get();
            }
        }

        public class b extends Handler {

            /* renamed from: a, reason: collision with root package name */
            public boolean f479a;

            public b(Looper looper) {
                super(looper);
                this.f479a = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                a aVar;
                if (this.f479a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.a(message.getData());
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 2:
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 3:
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 4:
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 5:
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 6:
                            aVar = a.this;
                            aVar.getClass();
                            break;
                        case 7:
                            MediaSessionCompat.a((Bundle) message.obj);
                        case 8:
                        case 13:
                            a.this.getClass();
                            break;
                        case 9:
                        case 12:
                            aVar = a.this;
                            ((Integer) message.obj).intValue();
                            aVar.getClass();
                            break;
                        case 11:
                            aVar = a.this;
                            ((Boolean) message.obj).booleanValue();
                            aVar.getClass();
                            break;
                    }
                }
            }
        }

        public static class c extends IMediaControllerCallback.Stub {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f481a;

            public c(a aVar) {
                this.f481a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void X2(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f481a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void f1(boolean z10) {
                a aVar = this.f481a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z10), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void g2(int i10) {
                a aVar = this.f481a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i10), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void q(int i10) {
                a aVar = this.f481a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i10), null);
                }
            }
        }

        public final void a(int i10, Object obj, Bundle bundle) {
            b bVar = this.f476b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public final void b(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f476b = bVar;
                bVar.f479a = true;
            } else {
                b bVar2 = this.f476b;
                if (bVar2 != null) {
                    bVar2.f479a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f476b = null;
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            a(8, null, null);
        }
    }

    public static class b extends MediaControllerImplApi21 {
        public b(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static final class c {
        public c() {
            throw null;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f467b = token;
        this.f466a = new MediaControllerImplApi21(context, token);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token token = mediaSessionCompat.f483a.f502b;
        this.f467b = token;
        this.f466a = Build.VERSION.SDK_INT >= 29 ? new b(context, token) : new MediaControllerImplApi21(context, token);
    }

    public static void b(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, mediaControllerCompat);
        activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.f467b.f491b) : null);
    }

    public final void a(b.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f468c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        aVar.b(handler);
        MediaControllerImplApi21 mediaControllerImplApi21 = this.f466a;
        mediaControllerImplApi21.f469a.registerCallback(aVar.f475a, handler);
        synchronized (mediaControllerImplApi21.f470b) {
            if (mediaControllerImplApi21.f473e.a() != null) {
                MediaControllerImplApi21.a aVar2 = new MediaControllerImplApi21.a(aVar);
                mediaControllerImplApi21.f472d.put(aVar, aVar2);
                aVar.f477c = aVar2;
                try {
                    mediaControllerImplApi21.f473e.a().G(aVar2);
                    aVar.a(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                aVar.f477c = null;
                mediaControllerImplApi21.f471c.add(aVar);
            }
        }
    }
}
