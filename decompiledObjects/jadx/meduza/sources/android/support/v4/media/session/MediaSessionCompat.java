package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import g1.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaSessionCompat {

    /* renamed from: d, reason: collision with root package name */
    public static int f482d;

    /* renamed from: a, reason: collision with root package name */
    public final d f483a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaControllerCompat f484b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f485c = new ArrayList<>();

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f486a;

        /* renamed from: b, reason: collision with root package name */
        public final long f487b;

        /* renamed from: c, reason: collision with root package name */
        public MediaSession.QueueItem f488c;

        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f486a = mediaDescriptionCompat;
            this.f487b = j10;
            this.f488c = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.f486a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f487b = parcel.readLong();
        }

        public static ArrayList a(List list) {
            QueueItem queueItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(queueItem2, MediaDescriptionCompat.a(b.b(queueItem2)), b.c(queueItem2));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("MediaSession.QueueItem {Description=");
            l10.append(this.f486a);
            l10.append(", Id=");
            l10.append(this.f487b);
            l10.append(" }");
            return l10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f486a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f487b);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public ResultReceiver f489a;

        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f489a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f489a.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Object f490a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final Object f491b;

        /* renamed from: c, reason: collision with root package name */
        public IMediaSession f492c;

        /* renamed from: d, reason: collision with root package name */
        public b2.e f493d;

        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj, IMediaSession iMediaSession, b2.e eVar) {
            this.f491b = obj;
            this.f492c = iMediaSession;
            this.f493d = eVar;
        }

        public final IMediaSession a() {
            IMediaSession iMediaSession;
            synchronized (this.f490a) {
                iMediaSession = this.f492c;
            }
            return iMediaSession;
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f490a) {
                IMediaSession iMediaSession = this.f492c;
                if (iMediaSession != null) {
                    bundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", iMediaSession.asBinder());
                }
                b2.e eVar = this.f493d;
                if (eVar != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("a", new ParcelImpl(eVar));
                    bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f491b;
            Object obj3 = ((Token) obj).f491b;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f491b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f491b, i10);
        }
    }

    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f496c;

        /* renamed from: e, reason: collision with root package name */
        public HandlerC0009a f498e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f494a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final b f495b = new b();

        /* renamed from: d, reason: collision with root package name */
        public WeakReference<b> f497d = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a, reason: collision with other inner class name */
        public class HandlerC0009a extends Handler {
            public HandlerC0009a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0009a handlerC0009a;
                if (message.what == 1) {
                    synchronized (a.this.f494a) {
                        bVar = a.this.f497d.get();
                        aVar = a.this;
                        handlerC0009a = aVar.f498e;
                    }
                    if (bVar == null || aVar != bVar.a() || handlerC0009a == null) {
                        return;
                    }
                    bVar.b((t) message.obj);
                    a.this.B(bVar, handlerC0009a);
                    bVar.b(null);
                }
            }
        }

        public class b extends MediaSession.Callback {
            public b() {
            }

            public static void b(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String f = cVar.f();
                if (TextUtils.isEmpty(f)) {
                    f = "android.media.session.MediaController";
                }
                cVar.b(new t(f, -1, -1));
            }

            public final c a() {
                c cVar;
                synchronized (a.this.f494a) {
                    cVar = (c) a.this.f497d.get();
                }
                if (cVar == null || a.this != cVar.a()) {
                    return null;
                }
                return cVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                b2.e eVar;
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = a10.f502b;
                        IMediaSession a11 = token.a();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a11 == null ? null : a11.asBinder());
                        synchronized (token.f490a) {
                            eVar = token.f493d;
                        }
                        if (eVar != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(eVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a.this.E((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a.this.H((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a.this.s0((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        a.this.M(str, bundle, resultReceiver);
                    } else if (a10.f507h != null) {
                        int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        QueueItem queueItem = (i10 < 0 || i10 >= a10.f507h.size()) ? null : a10.f507h.get(i10);
                        if (queueItem != null) {
                            a.this.s0(queueItem.f486a);
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        a.this.j0(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        a.this.n0();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        a.this.o0(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        a.this.q0(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        a.this.r0(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        a.this.v0(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        a.this.z0(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        a.this.A0(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        a.this.y0(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        a.this.w0(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        a.this.O(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.P();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                c a10 = a();
                if (a10 == null) {
                    return false;
                }
                b(a10);
                boolean Q = a.this.Q(intent);
                a10.b(null);
                return Q || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.U();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.V();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.f0(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.h0(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.j0(uri, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.n0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.o0(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.q0(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.r0(uri, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.t0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.u0(j10);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.w0(f);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.x0(RatingCompat.a(rating));
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.B0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.C0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.D0(j10);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.E0();
                a10.b(null);
            }
        }

        public void A0(int i10) {
        }

        public final void B(b bVar, HandlerC0009a handlerC0009a) {
            if (this.f496c) {
                this.f496c = false;
                handlerC0009a.removeMessages(1);
                PlaybackStateCompat d10 = bVar.d();
                long j10 = d10 == null ? 0L : d10.f524e;
                boolean z10 = d10 != null && d10.f520a == 3;
                boolean z11 = (516 & j10) != 0;
                boolean z12 = (j10 & 514) != 0;
                if (z10 && z12) {
                    U();
                } else {
                    if (z10 || !z11) {
                        return;
                    }
                    V();
                }
            }
        }

        public void B0() {
        }

        public void C0() {
        }

        public void D0(long j10) {
        }

        public void E(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void E0() {
        }

        public final void F0(b bVar, Handler handler) {
            synchronized (this.f494a) {
                this.f497d = new WeakReference<>(bVar);
                HandlerC0009a handlerC0009a = this.f498e;
                HandlerC0009a handlerC0009a2 = null;
                if (handlerC0009a != null) {
                    handlerC0009a.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    handlerC0009a2 = new HandlerC0009a(handler.getLooper());
                }
                this.f498e = handlerC0009a2;
            }
        }

        public void H(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void M(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void O(String str, Bundle bundle) {
        }

        public void P() {
        }

        public boolean Q(Intent intent) {
            b bVar;
            HandlerC0009a handlerC0009a;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f494a) {
                bVar = this.f497d.get();
                handlerC0009a = this.f498e;
            }
            if (bVar == null || handlerC0009a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            t c10 = bVar.c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                B(bVar, handlerC0009a);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                B(bVar, handlerC0009a);
            } else if (this.f496c) {
                handlerC0009a.removeMessages(1);
                this.f496c = false;
                PlaybackStateCompat d10 = bVar.d();
                if (((d10 == null ? 0L : d10.f524e) & 32) != 0) {
                    B0();
                }
            } else {
                this.f496c = true;
                handlerC0009a.sendMessageDelayed(handlerC0009a.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void U() {
        }

        public void V() {
        }

        public void f0(String str, Bundle bundle) {
        }

        public void h0(String str, Bundle bundle) {
        }

        public void j0(Uri uri, Bundle bundle) {
        }

        public void n0() {
        }

        public void o0(String str, Bundle bundle) {
        }

        public void q0(String str, Bundle bundle) {
        }

        public void r0(Uri uri, Bundle bundle) {
        }

        public void s0(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void t0() {
        }

        public void u0(long j10) {
        }

        public void v0(boolean z10) {
        }

        public void w0(float f) {
        }

        public void x0(RatingCompat ratingCompat) {
        }

        public void y0(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void z0(int i10) {
        }
    }

    public interface b {
        a a();

        void b(t tVar);

        t c();

        PlaybackStateCompat d();
    }

    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSession f501a;

        /* renamed from: b, reason: collision with root package name */
        public final Token f502b;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f504d;

        /* renamed from: g, reason: collision with root package name */
        public PlaybackStateCompat f506g;

        /* renamed from: h, reason: collision with root package name */
        public List<QueueItem> f507h;

        /* renamed from: i, reason: collision with root package name */
        public MediaMetadataCompat f508i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f509j;

        /* renamed from: k, reason: collision with root package name */
        public int f510k;

        /* renamed from: l, reason: collision with root package name */
        public int f511l;

        /* renamed from: m, reason: collision with root package name */
        public a f512m;

        /* renamed from: n, reason: collision with root package name */
        public t f513n;

        /* renamed from: c, reason: collision with root package name */
        public final Object f503c = new Object();

        /* renamed from: e, reason: collision with root package name */
        public boolean f505e = false;
        public final RemoteCallbackList<IMediaControllerCallback> f = new RemoteCallbackList<>();

        public class a extends IMediaSession.Stub {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f514a;

            public a(d dVar) {
                this.f514a = dVar;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void B2(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final CharSequence C0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void C1(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final ParcelableVolumeInfo E2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void F0(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void F1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void G(IMediaControllerCallback iMediaControllerCallback) {
                if (this.f514a.f505e) {
                    return;
                }
                this.f514a.f.register(iMediaControllerCallback, new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (this.f514a.f503c) {
                    this.f514a.getClass();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final MediaMetadataCompat H0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void J0(IMediaControllerCallback iMediaControllerCallback) {
                this.f514a.f.unregister(iMediaControllerCallback);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (this.f514a.f503c) {
                    this.f514a.getClass();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void J1(boolean z10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void L2(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void M() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void N(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void O(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String Q2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void R(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void R0(int i10, int i11) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void V0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void W2(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void Y(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean Z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void a0() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int a2() {
                return this.f514a.f511l;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void b0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void b2(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void c1(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PlaybackStateCompat d() {
                c cVar = this.f514a;
                return MediaSessionCompat.b(cVar.f506g, cVar.f508i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PendingIntent d0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean e2() {
                return this.f514a.f509j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void i0() {
                this.f514a.getClass();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle j() {
                if (this.f514a.f504d == null) {
                    return null;
                }
                return new Bundle(this.f514a.f504d);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void k2(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void l() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void n2(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final List<QueueItem> o2() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void r1(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void u(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean u1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final long w() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int x() {
                return this.f514a.f510k;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void x2(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void y0(int i10, int i11) {
                throw new AssertionError();
            }
        }

        public c(Context context, String str) {
            MediaSession e10 = e(context, str);
            this.f501a = e10;
            this.f502b = new Token(e10.getSessionToken(), new a((d) this), null);
            this.f504d = null;
            e10.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final a a() {
            a aVar;
            synchronized (this.f503c) {
                aVar = this.f512m;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void b(t tVar) {
            synchronized (this.f503c) {
                this.f513n = tVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public t c() {
            t tVar;
            synchronized (this.f503c) {
                tVar = this.f513n;
            }
            return tVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat d() {
            return this.f506g;
        }

        public MediaSession e(Context context, String str) {
            return new MediaSession(context, str);
        }

        public final String f() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f501a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f501a, new Object[0]);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        public final void g(a aVar, Handler handler) {
            synchronized (this.f503c) {
                this.f512m = aVar;
                this.f501a.setCallback(aVar == null ? null : aVar.f495b, handler);
                if (aVar != null) {
                    aVar.F0(this, handler);
                }
            }
        }
    }

    public static class d extends c {
        public d(Context context, String str) {
            super(context, str);
        }
    }

    public static class e extends d {
        public e(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final void b(t tVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final t c() {
            MediaSessionManager$RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.f501a.getCurrentControllerInfo();
            return new t(currentControllerInfo);
        }
    }

    public static class f extends e {
        public f(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public final MediaSession e(Context context, String str) {
            return new MediaSession(context, str, null);
        }
    }

    public interface g {
        void a();
    }

    public MediaSessionCompat(Context context, String str, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName componentName = null;
        int i10 = i1.a.f7354a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i11 = Build.VERSION.SDK_INT;
        d fVar = i11 >= 29 ? new f(context, str) : i11 >= 28 ? new e(context, str) : new d(context, str);
        this.f483a = fVar;
        f(new android.support.v4.media.session.a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        fVar.f501a.setMediaButtonReceiver(pendingIntent);
        this.f484b = new MediaControllerCompat(context, this);
        if (f482d == 0) {
            f482d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j10 = -1;
        if (playbackStateCompat.f521b == -1) {
            return playbackStateCompat;
        }
        int i10 = playbackStateCompat.f520a;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.f526p <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = ((long) (playbackStateCompat.f523d * (elapsedRealtime - r2))) + playbackStateCompat.f521b;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f455a.containsKey("android.media.metadata.DURATION")) {
            j10 = mediaMetadataCompat.f455a.getLong("android.media.metadata.DURATION", 0L);
        }
        long j12 = (j10 < 0 || j11 <= j10) ? j11 < 0 ? 0L : j11 : j10;
        ArrayList arrayList = new ArrayList();
        long j13 = playbackStateCompat.f522c;
        long j14 = playbackStateCompat.f524e;
        int i11 = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.f525o;
        ArrayList arrayList2 = playbackStateCompat.f527q;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f520a, j12, j13, playbackStateCompat.f523d, j14, i11, charSequence, elapsedRealtime, arrayList, playbackStateCompat.f528r, playbackStateCompat.f529s);
    }

    public static Bundle l(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final boolean c() {
        return this.f483a.f501a.isActive();
    }

    public final void d() {
        d dVar = this.f483a;
        dVar.f505e = true;
        dVar.f.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = dVar.f501a.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(dVar.f501a);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        dVar.f501a.setCallback(null);
        dVar.f501a.release();
    }

    public final void e(boolean z10) {
        this.f483a.f501a.setActive(z10);
        Iterator<g> it = this.f485c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void f(a aVar, Handler handler) {
        d dVar = this.f483a;
        if (handler == null) {
            handler = new Handler();
        }
        dVar.g(aVar, handler);
    }

    public final void g(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        d dVar = this.f483a;
        dVar.f508i = mediaMetadataCompat;
        MediaSession mediaSession = dVar.f501a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.f456b == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f456b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.f456b;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void h(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.f483a;
        dVar.f506g = playbackStateCompat;
        synchronized (dVar.f503c) {
            int beginBroadcast = dVar.f.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        dVar.f.getBroadcastItem(beginBroadcast).X2(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            dVar.f.finishBroadcast();
        }
        MediaSession mediaSession = dVar.f501a;
        if (playbackStateCompat.t == null) {
            PlaybackState.Builder d10 = PlaybackStateCompat.b.d();
            PlaybackStateCompat.b.x(d10, playbackStateCompat.f520a, playbackStateCompat.f521b, playbackStateCompat.f523d, playbackStateCompat.f526p);
            PlaybackStateCompat.b.u(d10, playbackStateCompat.f522c);
            PlaybackStateCompat.b.s(d10, playbackStateCompat.f524e);
            PlaybackStateCompat.b.v(d10, playbackStateCompat.f525o);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f527q) {
                PlaybackState.CustomAction customAction2 = customAction.f534e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e10 = PlaybackStateCompat.b.e(customAction.f530a, customAction.f531b, customAction.f532c);
                    PlaybackStateCompat.b.w(e10, customAction.f533d);
                    customAction2 = PlaybackStateCompat.b.b(e10);
                }
                PlaybackStateCompat.b.a(d10, customAction2);
            }
            PlaybackStateCompat.b.t(d10, playbackStateCompat.f528r);
            PlaybackStateCompat.c.b(d10, playbackStateCompat.f529s);
            playbackStateCompat.t = PlaybackStateCompat.b.c(d10);
        }
        mediaSession.setPlaybackState(playbackStateCompat.t);
    }

    public final void i(List<QueueItem> list) {
        MediaSession mediaSession;
        ArrayList arrayList;
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.f487b))) {
                    StringBuilder l10 = defpackage.f.l("Found duplicate queue id: ");
                    l10.append(queueItem.f487b);
                    Log.e("MediaSessionCompat", l10.toString(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.f487b));
            }
        }
        d dVar = this.f483a;
        dVar.f507h = list;
        if (list == null) {
            mediaSession = dVar.f501a;
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (QueueItem queueItem2 : list) {
                MediaSession.QueueItem queueItem3 = queueItem2.f488c;
                if (queueItem3 == null) {
                    queueItem3 = QueueItem.b.a(queueItem2.f486a.b(), queueItem2.f487b);
                    queueItem2.f488c = queueItem3;
                }
                arrayList2.add(queueItem3);
            }
            mediaSession = dVar.f501a;
            arrayList = arrayList2;
        }
        mediaSession.setQueue(arrayList);
    }

    public final void j(int i10) {
        d dVar = this.f483a;
        if (dVar.f510k != i10) {
            dVar.f510k = i10;
            synchronized (dVar.f503c) {
                int beginBroadcast = dVar.f.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            dVar.f.getBroadcastItem(beginBroadcast).q(i10);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        dVar.f.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void k(int i10) {
        d dVar = this.f483a;
        if (dVar.f511l != i10) {
            dVar.f511l = i10;
            synchronized (dVar.f503c) {
                int beginBroadcast = dVar.f.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            dVar.f.getBroadcastItem(beginBroadcast).g2(i10);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        dVar.f.finishBroadcast();
                    }
                }
            }
        }
    }
}
