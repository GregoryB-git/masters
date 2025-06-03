package android.support.v4.media.session;

import a0.AbstractC0732o;
import a0.C0723f;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
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
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import v1.AbstractC2049a;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d, reason: collision with root package name */
    public static int f8211d;

    /* renamed from: a, reason: collision with root package name */
    public final c f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaControllerCompat f8213b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8214c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public final MediaDescriptionCompat f8215o;

        /* renamed from: p, reason: collision with root package name */
        public final long f8216p;

        /* renamed from: q, reason: collision with root package name */
        public MediaSession.QueueItem f8217q;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i7) {
                return new QueueItem[i7];
            }
        }

        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j7) {
                return new MediaSession.QueueItem(mediaDescription, j7);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j7) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j7 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f8215o = mediaDescriptionCompat;
            this.f8216p = j7;
            this.f8217q = queueItem;
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f8215o;
        }

        public long d() {
            return this.f8216p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem = this.f8217q;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem a7 = b.a((MediaDescription) this.f8215o.f(), this.f8216p);
            this.f8217q = a7;
            return a7;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f8215o + ", Id=" + this.f8216p + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            this.f8215o.writeToParcel(parcel, i7);
            parcel.writeLong(this.f8216p);
        }

        public QueueItem(Parcel parcel) {
            this.f8215o = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f8216p = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j7) {
            this(null, mediaDescriptionCompat, j7);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public ResultReceiver f8218o;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i7) {
                return new ResultReceiverWrapper[i7];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f8218o = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            this.f8218o.writeToParcel(parcel, i7);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public final Object f8219o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f8220p;

        /* renamed from: q, reason: collision with root package name */
        public android.support.v4.media.session.b f8221q;

        /* renamed from: r, reason: collision with root package name */
        public v1.d f8222r;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i7) {
                return new Token[i7];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        public static Token a(Object obj) {
            return b(obj, null);
        }

        public static Token b(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public android.support.v4.media.session.b c() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f8219o) {
                bVar = this.f8221q;
            }
            return bVar;
        }

        public v1.d d() {
            v1.d dVar;
            synchronized (this.f8219o) {
                dVar = this.f8222r;
            }
            return dVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.f8220p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f8220p;
            Object obj3 = ((Token) obj).f8220p;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public void f(android.support.v4.media.session.b bVar) {
            synchronized (this.f8219o) {
                this.f8221q = bVar;
            }
        }

        public void g(v1.d dVar) {
            synchronized (this.f8219o) {
                this.f8222r = dVar;
            }
        }

        public int hashCode() {
            Object obj = this.f8220p;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable((Parcelable) this.f8220p, i7);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, v1.d dVar) {
            this.f8219o = new Object();
            this.f8220p = obj;
            this.f8221q = bVar;
            this.f8222r = dVar;
        }
    }

    public class a extends b {
        public a() {
        }
    }

    public static abstract class b {

        /* renamed from: c, reason: collision with root package name */
        public boolean f8226c;

        /* renamed from: e, reason: collision with root package name */
        public a f8228e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f8224a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final MediaSession.Callback f8225b = new C0145b();

        /* renamed from: d, reason: collision with root package name */
        public WeakReference f8227d = new WeakReference(null);

        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f8224a) {
                        cVar = (c) b.this.f8227d.get();
                        bVar = b.this;
                        aVar = bVar.f8228e;
                    }
                    if (cVar == null || bVar != cVar.o() || aVar == null) {
                        return;
                    }
                    cVar.d((C0723f) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.d(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        public class C0145b extends MediaSession.Callback {
            public C0145b() {
            }

            public final void a(c cVar) {
                cVar.d(null);
            }

            public final d b() {
                d dVar;
                synchronized (b.this.f8224a) {
                    dVar = (d) b.this.f8227d.get();
                }
                if (dVar == null || b.this != dVar.o()) {
                    return null;
                }
                return dVar;
            }

            public final void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String h7 = cVar.h();
                if (TextUtils.isEmpty(h7)) {
                    h7 = "android.media.session.MediaController";
                }
                cVar.d(new C0723f(h7, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                b bVar;
                MediaDescriptionCompat c7;
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token b8 = b7.b();
                        android.support.v4.media.session.b c8 = b8.c();
                        if (c8 != null) {
                            asBinder = c8.asBinder();
                        }
                        w.d.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        AbstractC2049a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", b8.d());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            bVar = b.this;
                            c7 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            b.this.d(str, bundle, resultReceiver);
                        } else if (b7.f8239i != null) {
                            int i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i7 >= 0 && i7 < b7.f8239i.size()) {
                                queueItem = (QueueItem) b7.f8239i.get(i7);
                            }
                            if (queueItem != null) {
                                bVar = b.this;
                                c7 = queueItem.c();
                            }
                        }
                        bVar.q(c7);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        b.this.l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        b.this.p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        b.this.w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.f();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d b7 = b();
                if (b7 == null) {
                    return false;
                }
                c(b7);
                boolean g7 = b.this.g(intent);
                a(b7);
                return g7 || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.h();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.i();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.j(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.k(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.l(uri, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.m();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.n(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.o(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.p(uri, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.r();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j7) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.s(j7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f7) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.u(f7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.v(RatingCompat.a(rating));
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.z();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.A();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j7) {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.B(j7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.C();
                a(b7);
            }
        }

        public void A() {
        }

        public void B(long j7) {
        }

        public void C() {
        }

        public void D(c cVar, Handler handler) {
            synchronized (this.f8224a) {
                try {
                    this.f8227d = new WeakReference(cVar);
                    a aVar = this.f8228e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (cVar != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.f8228e = aVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void a(c cVar, Handler handler) {
            if (this.f8226c) {
                this.f8226c = false;
                handler.removeMessages(1);
                PlaybackStateCompat f7 = cVar.f();
                long b7 = f7 == null ? 0L : f7.b();
                boolean z7 = f7 != null && f7.g() == 3;
                boolean z8 = (516 & b7) != 0;
                boolean z9 = (b7 & 514) != 0;
                if (z7 && z9) {
                    h();
                } else {
                    if (z7 || !z8) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f8224a) {
                cVar = (c) this.f8227d.get();
                aVar = this.f8228e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C0723f t7 = cVar.t();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.f8226c) {
                aVar.removeMessages(1);
                this.f8226c = false;
                PlaybackStateCompat f7 = cVar.f();
                if (((f7 == null ? 0L : f7.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.f8226c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, t7), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j7) {
        }

        public void t(boolean z7) {
        }

        public void u(float f7) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i7) {
        }

        public void y(int i7) {
        }

        public void z() {
        }
    }

    public interface c {
        boolean a();

        Token b();

        void c(int i7);

        void d(C0723f c0723f);

        void e(List list);

        PlaybackStateCompat f();

        void g(boolean z7);

        String h();

        void i(int i7);

        void j(PendingIntent pendingIntent);

        void k(boolean z7);

        void l(PlaybackStateCompat playbackStateCompat);

        void m(b bVar, Handler handler);

        void n(int i7);

        b o();

        void p(MediaMetadataCompat mediaMetadataCompat);

        void q(PendingIntent pendingIntent);

        void r(AbstractC0732o abstractC0732o);

        void release();

        void s(int i7);

        C0723f t();
    }

    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSession f8231a;

        /* renamed from: b, reason: collision with root package name */
        public final a f8232b;

        /* renamed from: c, reason: collision with root package name */
        public final Token f8233c;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f8235e;

        /* renamed from: h, reason: collision with root package name */
        public PlaybackStateCompat f8238h;

        /* renamed from: i, reason: collision with root package name */
        public List f8239i;

        /* renamed from: j, reason: collision with root package name */
        public MediaMetadataCompat f8240j;

        /* renamed from: k, reason: collision with root package name */
        public int f8241k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f8242l;

        /* renamed from: m, reason: collision with root package name */
        public int f8243m;

        /* renamed from: n, reason: collision with root package name */
        public int f8244n;

        /* renamed from: o, reason: collision with root package name */
        public b f8245o;

        /* renamed from: p, reason: collision with root package name */
        public C0723f f8246p;

        /* renamed from: d, reason: collision with root package name */
        public final Object f8234d = new Object();

        /* renamed from: f, reason: collision with root package name */
        public boolean f8236f = false;

        /* renamed from: g, reason: collision with root package name */
        public final RemoteCallbackList f8237g = new RemoteCallbackList();

        public static class a extends b.a {

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReference f8247b;

            public a(d dVar) {
                this.f8247b = new AtomicReference(dVar);
            }

            @Override // android.support.v4.media.session.b
            public void A(android.support.v4.media.session.a aVar) {
                d dVar = (d) this.f8247b.get();
                if (dVar == null) {
                    return;
                }
                dVar.f8237g.register(aVar, new C0723f("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (dVar.f8234d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public void A0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo C0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void E0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean H() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void H0(long j7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J(int i7, int i8, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String N0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Q(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean R() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void S(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent T() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int U() {
                d dVar = (d) this.f8247b.get();
                if (dVar != null) {
                    return dVar.f8244n;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public void V(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int X() {
                d dVar = (d) this.f8247b.get();
                if (dVar != null) {
                    return dVar.f8241k;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void Y(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean Y0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean b0() {
                d dVar = (d) this.f8247b.get();
                return dVar != null && dVar.f8242l;
            }

            @Override // android.support.v4.media.session.b
            public String e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() {
                d dVar = (d) this.f8247b.get();
                if (dVar != null) {
                    return MediaSessionCompat.d(dVar.f8238h, dVar.f8240j);
                }
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k(boolean z7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List k0() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            public void o() {
                this.f8247b.set(null);
            }

            @Override // android.support.v4.media.session.b
            public void o0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence p0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int q() {
                d dVar = (d) this.f8247b.get();
                if (dVar != null) {
                    return dVar.f8243m;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public Bundle r() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat r0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle t0() {
                d dVar = (d) this.f8247b.get();
                if (dVar.f8235e == null) {
                    return null;
                }
                return new Bundle(dVar.f8235e);
            }

            @Override // android.support.v4.media.session.b
            public void u(float f7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u0(android.support.v4.media.session.a aVar) {
                d dVar = (d) this.f8247b.get();
                if (dVar == null) {
                    return;
                }
                dVar.f8237g.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (dVar.f8234d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public void v0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long w0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void y(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void y0(long j7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z(int i7, int i8, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z0(boolean z7) {
            }
        }

        public d(Context context, String str, v1.d dVar, Bundle bundle) {
            MediaSession u7 = u(context, str, bundle);
            this.f8231a = u7;
            a aVar = new a(this);
            this.f8232b = aVar;
            this.f8233c = new Token(u7.getSessionToken(), aVar, dVar);
            this.f8235e = bundle;
            c(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean a() {
            return this.f8231a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token b() {
            return this.f8233c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c(int i7) {
            this.f8231a.setFlags(i7 | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void d(C0723f c0723f) {
            synchronized (this.f8234d) {
                this.f8246p = c0723f;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(List list) {
            ArrayList arrayList;
            MediaSession mediaSession;
            this.f8239i = list;
            if (list == null) {
                mediaSession = this.f8231a;
                arrayList = null;
            } else {
                arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((MediaSession.QueueItem) ((QueueItem) it.next()).e());
                }
                mediaSession = this.f8231a;
            }
            mediaSession.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat f() {
            return this.f8238h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(boolean z7) {
            this.f8231a.setActive(z7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String h() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f8231a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f8231a, new Object[0]);
            } catch (Exception e7) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e7);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(int i7) {
            if (this.f8243m != i7) {
                this.f8243m = i7;
                synchronized (this.f8234d) {
                    for (int beginBroadcast = this.f8237g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f8237g.getBroadcastItem(beginBroadcast)).m(i7);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f8237g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(PendingIntent pendingIntent) {
            this.f8231a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void k(boolean z7) {
            if (this.f8242l != z7) {
                this.f8242l = z7;
                synchronized (this.f8234d) {
                    for (int beginBroadcast = this.f8237g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f8237g.getBroadcastItem(beginBroadcast)).J0(z7);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f8237g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(PlaybackStateCompat playbackStateCompat) {
            this.f8238h = playbackStateCompat;
            synchronized (this.f8234d) {
                for (int beginBroadcast = this.f8237g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f8237g.getBroadcastItem(beginBroadcast)).Q0(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f8237g.finishBroadcast();
            }
            this.f8231a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.e());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void m(b bVar, Handler handler) {
            synchronized (this.f8234d) {
                try {
                    this.f8245o = bVar;
                    this.f8231a.setCallback(bVar == null ? null : bVar.f8225b, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(int i7) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            this.f8231a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b o() {
            b bVar;
            synchronized (this.f8234d) {
                bVar = this.f8245o;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            this.f8240j = mediaMetadataCompat;
            this.f8231a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.g());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(PendingIntent pendingIntent) {
            this.f8231a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r(AbstractC0732o abstractC0732o) {
            this.f8231a.setPlaybackToRemote((VolumeProvider) abstractC0732o.c());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.f8236f = true;
            this.f8237g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f8231a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f8231a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e7) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                }
            }
            this.f8231a.setCallback(null);
            this.f8232b.o();
            this.f8231a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(int i7) {
            if (this.f8244n != i7) {
                this.f8244n = i7;
                synchronized (this.f8234d) {
                    for (int beginBroadcast = this.f8237g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f8237g.getBroadcastItem(beginBroadcast)).d0(i7);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f8237g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public C0723f t() {
            C0723f c0723f;
            synchronized (this.f8234d) {
                c0723f = this.f8246p;
            }
            return c0723f;
        }

        public MediaSession u(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }
    }

    public static class e extends d {
        public e(Context context, String str, v1.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }
    }

    public static class g extends f {
        public g(Context context, String str, v1.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public MediaSession u(Context context, String str, Bundle bundle) {
            return android.support.v4.media.session.d.a(context, str, bundle);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j7 = -1;
        if (playbackStateCompat.f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.g() != 3 && playbackStateCompat.g() != 4 && playbackStateCompat.g() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.c() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d7 = ((long) (playbackStateCompat.d() * (elapsedRealtime - r0))) + playbackStateCompat.f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j7 = mediaMetadataCompat.f("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.d(playbackStateCompat).h(playbackStateCompat.g(), (j7 < 0 || d7 <= j7) ? d7 < 0 ? 0L : d7 : j7, playbackStateCompat.d(), elapsedRealtime).b();
    }

    public static Bundle u(Bundle bundle) {
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

    public MediaControllerCompat b() {
        return this.f8213b;
    }

    public Token c() {
        return this.f8212a.b();
    }

    public boolean e() {
        return this.f8212a.a();
    }

    public void f() {
        this.f8212a.release();
    }

    public void g(boolean z7) {
        this.f8212a.g(z7);
        Iterator it = this.f8214c.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public void h(b bVar) {
        i(bVar, null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.f8212a.m(null, null);
            return;
        }
        c cVar = this.f8212a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.m(bVar, handler);
    }

    public void j(boolean z7) {
        this.f8212a.k(z7);
    }

    public void k(int i7) {
        this.f8212a.c(i7);
    }

    public void l(PendingIntent pendingIntent) {
        this.f8212a.q(pendingIntent);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.f8212a.p(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.f8212a.l(playbackStateCompat);
    }

    public void o(int i7) {
        this.f8212a.n(i7);
    }

    public void p(AbstractC0732o abstractC0732o) {
        if (abstractC0732o == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f8212a.r(abstractC0732o);
    }

    public void q(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                QueueItem queueItem = (QueueItem) it.next();
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.d()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.d(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.d()));
            }
        }
        this.f8212a.e(list);
    }

    public void r(int i7) {
        this.f8212a.i(i7);
    }

    public void s(PendingIntent pendingIntent) {
        this.f8212a.j(pendingIntent);
    }

    public void t(int i7) {
        this.f8212a.s(i7);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, v1.d dVar) {
        this.f8214c = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = c0.d.a(context)) == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.f8212a = i7 >= 29 ? new g(context, str, dVar, bundle) : i7 >= 28 ? new f(context, str, dVar, bundle) : new e(context, str, dVar, bundle);
        i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f8212a.q(pendingIntent);
        this.f8213b = new MediaControllerCompat(context, this);
        if (f8211d == 0) {
            f8211d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static class f extends e {
        public f(Context context, String str, v1.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public final C0723f t() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.f8231a.getCurrentControllerInfo();
            return new C0723f(currentControllerInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public void d(C0723f c0723f) {
        }
    }
}
