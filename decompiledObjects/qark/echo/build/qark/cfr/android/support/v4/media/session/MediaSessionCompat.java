/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.MediaDescription
 *  android.media.MediaMetadata
 *  android.media.Rating
 *  android.media.VolumeProvider
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Callback
 *  android.media.session.MediaSession$QueueItem
 *  android.media.session.MediaSession$Token
 *  android.media.session.MediaSessionManager
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 *  android.media.session.PlaybackState
 *  android.net.Uri
 *  android.os.BadParcelableException
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.RemoteCallbackList
 *  android.os.RemoteException
 *  android.os.ResultReceiver
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.ViewConfiguration
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicReference
 */
package android.support.v4.media.session;

import a0.o;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
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
import android.os.IInterface;
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
import android.support.v4.media.a;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat {
    public static int d;
    public final c a;
    public final MediaControllerCompat b;
    public final ArrayList c = new ArrayList();

    public MediaSessionCompat(Context context, String string2) {
        this(context, string2, null, null);
    }

    public MediaSessionCompat(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, string2, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, string2, componentName, pendingIntent, bundle, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public MediaSessionCompat(Context context, String object, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, v1.d d8) {
        int n8;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName componentName2 = componentName;
        if (componentName == null) {
            componentName2 = componentName = c0.d.a(context);
            if (componentName == null) {
                Log.w((String)"MediaSessionCompat", (String)"Couldn't find a unique registered media button receiver in the given context.");
                componentName2 = componentName;
            }
        }
        componentName = pendingIntent;
        if (componentName2 != null) {
            componentName = pendingIntent;
            if (pendingIntent == null) {
                componentName = new Intent("android.intent.action.MEDIA_BUTTON");
                componentName.setComponent(componentName2);
                n8 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
                componentName = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)componentName, (int)n8);
            }
        }
        object = (n8 = Build.VERSION.SDK_INT) >= 29 ? new g(context, (String)object, d8, bundle) : (n8 >= 28 ? new f(context, (String)object, d8, bundle) : new e(context, (String)object, d8, bundle));
        this.a = object;
        object = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        object = new Handler((Looper)object);
        this.i(new b(){}, (Handler)object);
        this.a.q((PendingIntent)componentName);
        this.b = new MediaControllerCompat(context, this);
        if (d == 0) {
            d = (int)(TypedValue.applyDimension((int)1, (float)320.0f, (DisplayMetrics)context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat playbackStateCompat2;
        block8 : {
            long l8;
            long l9;
            block9 : {
                playbackStateCompat2 = playbackStateCompat;
                if (playbackStateCompat == null) break block8;
                l8 = playbackStateCompat.f();
                l9 = -1L;
                if (l8 == -1L) {
                    return playbackStateCompat;
                }
                if (playbackStateCompat.g() == 3 || playbackStateCompat.g() == 4) break block9;
                playbackStateCompat2 = playbackStateCompat;
                if (playbackStateCompat.g() != 5) break block8;
            }
            l8 = playbackStateCompat.c();
            playbackStateCompat2 = playbackStateCompat;
            if (l8 > 0L) {
                long l10 = SystemClock.elapsedRealtime();
                long l11 = (long)(playbackStateCompat.d() * (float)(l10 - l8)) + playbackStateCompat.f();
                l8 = l9;
                if (mediaMetadataCompat != null) {
                    l8 = l9;
                    if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                        l8 = mediaMetadataCompat.f("android.media.metadata.DURATION");
                    }
                }
                if (l8 < 0L || l11 <= l8) {
                    l8 = l11 < 0L ? 0L : l11;
                }
                playbackStateCompat2 = new PlaybackStateCompat.d(playbackStateCompat).h(playbackStateCompat.g(), l8, playbackStateCompat.d(), l10).b();
            }
        }
        return playbackStateCompat2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bundle u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        MediaSessionCompat.a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        }
        catch (BadParcelableException badParcelableException) {}
        Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the data.");
        return null;
    }

    public MediaControllerCompat b() {
        return this.b;
    }

    public Token c() {
        return this.a.b();
    }

    public boolean e() {
        return this.a.a();
    }

    public void f() {
        this.a.release();
    }

    public void g(boolean bl) {
        this.a.g(bl);
        Iterator iterator = this.c.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        a.a(iterator.next());
        throw null;
    }

    public void h(b b8) {
        this.i(b8, null);
    }

    public void i(b b8, Handler handler) {
        if (b8 == null) {
            this.a.m(null, null);
            return;
        }
        c c8 = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        c8.m(b8, handler);
    }

    public void j(boolean bl) {
        this.a.k(bl);
    }

    public void k(int n8) {
        this.a.c(n8);
    }

    public void l(PendingIntent pendingIntent) {
        this.a.q(pendingIntent);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.a.p(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.a.l(playbackStateCompat);
    }

    public void o(int n8) {
        this.a.n(n8);
    }

    public void p(o o8) {
        if (o8 != null) {
            this.a.r(o8);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void q(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem != null) {
                    if (hashSet.contains((Object)queueItem.d())) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Found duplicate queue id: ");
                        stringBuilder.append(queueItem.d());
                        Log.e((String)"MediaSessionCompat", (String)stringBuilder.toString(), (Throwable)new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add((Object)queueItem.d());
                    continue;
                }
                throw new IllegalArgumentException("queue shouldn't have null items");
            }
        }
        this.a.e(list);
    }

    public void r(int n8) {
        this.a.i(n8);
    }

    public void s(PendingIntent pendingIntent) {
        this.a.j(pendingIntent);
    }

    public void t(int n8) {
        this.a.s(n8);
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static final class QueueItem
    implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator(){

            public QueueItem a(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] b(int n8) {
                return new QueueItem[n8];
            }
        };
        public final MediaDescriptionCompat o;
        public final long p;
        public MediaSession.QueueItem q;

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long l8) {
            if (mediaDescriptionCompat != null) {
                if (l8 != -1L) {
                    this.o = mediaDescriptionCompat;
                    this.p = l8;
                    this.q = queueItem;
                    return;
                }
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            throw new IllegalArgumentException("Description cannot be null");
        }

        public QueueItem(Parcel parcel) {
            this.o = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.p = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long l8) {
            this(null, mediaDescriptionCompat, l8);
        }

        public static QueueItem a(Object object) {
            if (object != null) {
                object = (MediaSession.QueueItem)object;
                return new QueueItem((MediaSession.QueueItem)object, MediaDescriptionCompat.a((Object)b.b((MediaSession.QueueItem)object)), b.c((MediaSession.QueueItem)object));
            }
            return null;
        }

        public static List b(List list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                list = list.iterator();
                while (list.hasNext()) {
                    arrayList.add((Object)QueueItem.a(list.next()));
                }
                return arrayList;
            }
            return null;
        }

        public MediaDescriptionCompat c() {
            return this.o;
        }

        public long d() {
            return this.p;
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem;
            MediaSession.QueueItem queueItem2 = queueItem = this.q;
            if (queueItem == null) {
                this.q = queueItem2 = b.a((MediaDescription)this.o.f(), this.p);
            }
            return queueItem2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaSession.QueueItem {Description=");
            stringBuilder.append((Object)this.o);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.p);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            this.o.writeToParcel(parcel, n8);
            parcel.writeLong(this.p);
        }

        public static abstract class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long l8) {
                return new MediaSession.QueueItem(mediaDescription, l8);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static final class ResultReceiverWrapper
    implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator(){

            public ResultReceiverWrapper a(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] b(int n8) {
                return new ResultReceiverWrapper[n8];
            }
        };
        public ResultReceiver o;

        public ResultReceiverWrapper(Parcel parcel) {
            this.o = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            this.o.writeToParcel(parcel, n8);
        }

    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static final class Token
    implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator(){

            public Token a(Parcel parcel) {
                return new Token((Object)parcel.readParcelable(null));
            }

            public Token[] b(int n8) {
                return new Token[n8];
            }
        };
        public final Object o = new Object();
        public final Object p;
        public android.support.v4.media.session.b q;
        public v1.d r;

        public Token(Object object) {
            this(object, null, null);
        }

        public Token(Object object, android.support.v4.media.session.b b8) {
            this(object, b8, null);
        }

        public Token(Object object, android.support.v4.media.session.b b8, v1.d d8) {
            this.p = object;
            this.q = b8;
            this.r = d8;
        }

        public static Token a(Object object) {
            return Token.b(object, null);
        }

        public static Token b(Object object, android.support.v4.media.session.b b8) {
            if (object != null) {
                if (object instanceof MediaSession.Token) {
                    return new Token(object, b8);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public android.support.v4.media.session.b c() {
            Object object = this.o;
            synchronized (object) {
                return this.q;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public v1.d d() {
            Object object = this.o;
            synchronized (object) {
                return this.r;
            }
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.p;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Token)) {
                return false;
            }
            Object object2 = (Token)object;
            object = this.p;
            object2 = object2.p;
            if (object == null) {
                if (object2 == null) {
                    return true;
                }
                return false;
            }
            if (object2 == null) {
                return false;
            }
            return object.equals(object2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void f(android.support.v4.media.session.b b8) {
            Object object = this.o;
            synchronized (object) {
                this.q = b8;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void g(v1.d d8) {
            Object object = this.o;
            synchronized (object) {
                this.r = d8;
                return;
            }
        }

        public int hashCode() {
            Object object = this.p;
            if (object == null) {
                return 0;
            }
            return object.hashCode();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeParcelable((Parcelable)this.p, n8);
        }

    }

    public static abstract class android.support.v4.media.session.MediaSessionCompat$b {
        public final Object a = new Object();
        public final MediaSession.Callback b;
        public boolean c;
        public WeakReference d;
        public a e;

        public android.support.v4.media.session.MediaSessionCompat$b() {
            this.b = new b();
            this.d = new WeakReference((Object)null);
        }

        public void A() {
        }

        public void B(long l8) {
        }

        public void C() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void D(c c8, Handler handler) {
            Object object = this.a;
            synchronized (object) {
                a a8;
                Object var4_6;
                block5 : {
                    try {
                        this.d = new WeakReference((Object)c8);
                        a8 = this.e;
                        var4_6 = null;
                        if (a8 != null) {
                            a8.removeCallbacksAndMessages((Object)null);
                        }
                        break block5;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                a8 = var4_6;
                if (c8 != null) {
                    a8 = handler == null ? var4_6 : new a(handler.getLooper());
                }
                this.e = a8;
                return;
            }
        }

        public void a(c object, Handler handler) {
            if (!this.c) {
                return;
            }
            boolean bl = false;
            this.c = false;
            handler.removeMessages(1);
            object = object.f();
            long l8 = object == null ? 0L : object.b();
            boolean bl2 = object != null && object.g() == 3;
            boolean bl3 = (516L & l8) != 0L;
            if ((l8 & 514L) != 0L) {
                bl = true;
            }
            if (bl2 && bl) {
                this.h();
                return;
            }
            if (!bl2 && bl3) {
                this.i();
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
        }

        public void d(String string2, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String string2, Bundle bundle) {
        }

        public void f() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public boolean g(Intent object) {
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            Object object2 = this.a;
            // MONITORENTER : object2
            c c8 = (c)this.d.get();
            a a8 = this.e;
            // MONITOREXIT : object2
            if (c8 == null) return false;
            if (a8 == null) {
                return false;
            }
            if ((object = (KeyEvent)object.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) return false;
            if (object.getAction() != 0) {
                return false;
            }
            object2 = c8.t();
            int n8 = object.getKeyCode();
            if (n8 != 79 && n8 != 85) {
                this.a(c8, a8);
                return false;
            }
            if (object.getRepeatCount() != 0) {
                this.a(c8, a8);
                return true;
            }
            if (!this.c) {
                this.c = true;
                a8.sendMessageDelayed(a8.obtainMessage(1, object2), (long)ViewConfiguration.getDoubleTapTimeout());
                return true;
            }
            a8.removeMessages(1);
            this.c = false;
            object = c8.f();
            long l8 = object == null ? 0L : object.b();
            if ((l8 & 32L) == 0L) return true;
            this.z();
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String string2, Bundle bundle) {
        }

        public void k(String string2, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String string2, Bundle bundle) {
        }

        public void o(String string2, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long l8) {
        }

        public void t(boolean bl) {
        }

        public void u(float f8) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int n8) {
        }

        public void y(int n8) {
        }

        public void z() {
        }

        public class a
        extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void handleMessage(Message message) {
                if (message.what != 1) return;
                Object object = b.this.a;
                // MONITORENTER : object
                c c8 = (c)b.this.d.get();
                android.support.v4.media.session.MediaSessionCompat$b b8 = b.this;
                a a8 = b8.e;
                // MONITOREXIT : object
                if (c8 == null) return;
                if (b8 != c8.o()) return;
                if (a8 == null) {
                    return;
                }
                c8.d((a0.f)message.obj);
                b.this.a(c8, a8);
                c8.d(null);
            }
        }

        public class b
        extends MediaSession.Callback {
            public final void a(c c8) {
                c8.d(null);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final d b() {
                Object object = b.this.a;
                // MONITORENTER : object
                d d8 = (d)b.this.d.get();
                // MONITOREXIT : object
                if (d8 == null) return null;
                if (b.this != d8.o()) return null;
                return d8;
            }

            public final void c(c c8) {
                String string2;
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String string3 = string2 = c8.h();
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    string3 = "android.media.session.MediaController";
                }
                c8.d(new a0.f(string3, -1, -1));
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCommand(String object, Bundle object2, ResultReceiver object3) {
                d d8;
                block12 : {
                    d8 = this.b();
                    if (d8 == null) {
                        return;
                    }
                    MediaSessionCompat.a((Bundle)object2);
                    this.c(d8);
                    try {
                        block15 : {
                            block14 : {
                                Token token;
                                block13 : {
                                    boolean bl = object.equals((Object)"android.support.v4.media.session.command.GET_EXTRA_BINDER");
                                    token = null;
                                    Object var6_8 = null;
                                    if (bl) {
                                        object2 = new Bundle();
                                        token = d8.b();
                                        object = token.c();
                                        object = object == null ? var6_8 : object.asBinder();
                                        w.d.b((Bundle)object2, "android.support.v4.media.session.EXTRA_BINDER", (IBinder)object);
                                        v1.a.c((Bundle)object2, "android.support.v4.media.session.SESSION_TOKEN2", token.d());
                                        object3.send(0, (Bundle)object2);
                                        break block12;
                                    }
                                    bl = object.equals((Object)"android.support.v4.media.session.command.ADD_QUEUE_ITEM");
                                    if (bl) {
                                        b.this.b((MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                                        break block12;
                                    }
                                    bl = object.equals((Object)"android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
                                    if (bl) {
                                        b.this.c((MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), object2.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                                        break block12;
                                    }
                                    if (!object.equals((Object)"android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) break block13;
                                    object = b.this;
                                    object2 = (MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                                    break block14;
                                }
                                if (!object.equals((Object)"android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) break block15;
                                if (d8.i == null) break block12;
                                int n8 = object2.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                object = token;
                                if (n8 >= 0) {
                                    object = token;
                                    if (n8 < d8.i.size()) {
                                        object = (QueueItem)d8.i.get(n8);
                                    }
                                }
                                if (object == null) break block12;
                                object2 = b.this;
                                object3 = object.c();
                                object = object2;
                                object2 = object3;
                            }
                            object.q((MediaDescriptionCompat)object2);
                            break block12;
                        }
                        b.this.d((String)object, (Bundle)object2, (ResultReceiver)object3);
                        break block12;
                    }
                    catch (BadParcelableException badParcelableException) {}
                    Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the extra data.");
                }
                this.a(d8);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCustomAction(String object, Bundle bundle) {
                d d8;
                block23 : {
                    d8 = this.b();
                    if (d8 == null) {
                        return;
                    }
                    MediaSessionCompat.a(bundle);
                    this.c(d8);
                    try {
                        boolean bl = object.equals((Object)"android.support.v4.media.session.action.PLAY_FROM_URI");
                        if (bl) {
                            object = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            b.this.l((Uri)object, bundle);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.PREPARE")) {
                            b.this.m();
                        } else if (object.equals((Object)"android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            object = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            b.this.n((String)object, bundle);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            object = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            b.this.o((String)object, bundle);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            object = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            b.this.p((Uri)object, bundle);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            bl = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            b.this.t(bl);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            int n8 = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                            b.this.x(n8);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            int n9 = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                            b.this.y(n9);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.SET_RATING")) {
                            object = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            b.this.w((RatingCompat)object, bundle);
                        } else if (object.equals((Object)"android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            float f8 = bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            b.this.u(f8);
                        } else {
                            b.this.e((String)object, bundle);
                        }
                        break block23;
                    }
                    catch (BadParcelableException badParcelableException) {}
                    Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the data.");
                }
                this.a(d8);
            }

            public void onFastForward() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.f();
                this.a(d8);
            }

            public boolean onMediaButtonEvent(Intent intent) {
                d d8 = this.b();
                boolean bl = false;
                if (d8 == null) {
                    return false;
                }
                this.c(d8);
                boolean bl2 = b.this.g(intent);
                this.a(d8);
                if (bl2 || super.onMediaButtonEvent(intent)) {
                    bl = true;
                }
                return bl;
            }

            public void onPause() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.h();
                this.a(d8);
            }

            public void onPlay() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.i();
                this.a(d8);
            }

            public void onPlayFromMediaId(String string2, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.j(string2, bundle);
                this.a(d8);
            }

            public void onPlayFromSearch(String string2, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.k(string2, bundle);
                this.a(d8);
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.l(uri, bundle);
                this.a(d8);
            }

            public void onPrepare() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.m();
                this.a(d8);
            }

            public void onPrepareFromMediaId(String string2, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.n(string2, bundle);
                this.a(d8);
            }

            public void onPrepareFromSearch(String string2, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.o(string2, bundle);
                this.a(d8);
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                b.this.p(uri, bundle);
                this.a(d8);
            }

            public void onRewind() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.r();
                this.a(d8);
            }

            public void onSeekTo(long l8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.s(l8);
                this.a(d8);
            }

            public void onSetPlaybackSpeed(float f8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.u(f8);
                this.a(d8);
            }

            public void onSetRating(Rating rating) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.v(RatingCompat.a((Object)rating));
                this.a(d8);
            }

            public void onSkipToNext() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.z();
                this.a(d8);
            }

            public void onSkipToPrevious() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.A();
                this.a(d8);
            }

            public void onSkipToQueueItem(long l8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.B(l8);
                this.a(d8);
            }

            public void onStop() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                b.this.C();
                this.a(d8);
            }
        }

    }

    public static interface c {
        public boolean a();

        public Token b();

        public void c(int var1);

        public void d(a0.f var1);

        public void e(List var1);

        public PlaybackStateCompat f();

        public void g(boolean var1);

        public String h();

        public void i(int var1);

        public void j(PendingIntent var1);

        public void k(boolean var1);

        public void l(PlaybackStateCompat var1);

        public void m(b var1, Handler var2);

        public void n(int var1);

        public b o();

        public void p(MediaMetadataCompat var1);

        public void q(PendingIntent var1);

        public void r(o var1);

        public void release();

        public void s(int var1);

        public a0.f t();
    }

    public static abstract class d
    implements c {
        public final MediaSession a;
        public final a b;
        public final Token c;
        public final Object d = new Object();
        public Bundle e;
        public boolean f = false;
        public final RemoteCallbackList g = new RemoteCallbackList();
        public PlaybackStateCompat h;
        public List i;
        public MediaMetadataCompat j;
        public int k;
        public boolean l;
        public int m;
        public int n;
        public b o;
        public a0.f p;

        public d(Context context, String object, v1.d d8, Bundle bundle) {
            context = this.u(context, (String)object, bundle);
            this.a = context;
            this.b = object = new a(this);
            this.c = new Token((Object)context.getSessionToken(), (android.support.v4.media.session.b)object, d8);
            this.e = bundle;
            this.c(3);
        }

        @Override
        public boolean a() {
            return this.a.isActive();
        }

        @Override
        public Token b() {
            return this.c;
        }

        @Override
        public void c(int n8) {
            this.a.setFlags(n8 | 3);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void d(a0.f f8) {
            Object object = this.d;
            synchronized (object) {
                this.p = f8;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void e(List list) {
            MediaSession mediaSession;
            this.i = list;
            if (list == null) {
                mediaSession = this.a;
                list = null;
            } else {
                mediaSession = new ArrayList(list.size());
                list = list.iterator();
                while (list.hasNext()) {
                    mediaSession.add((Object)((MediaSession.QueueItem)((QueueItem)list.next()).e()));
                }
                MediaSession mediaSession2 = this.a;
                list = mediaSession;
                mediaSession = mediaSession2;
            }
            mediaSession.setQueue(list);
        }

        @Override
        public PlaybackStateCompat f() {
            return this.h;
        }

        @Override
        public void g(boolean bl) {
            this.a.setActive(bl);
        }

        @Override
        public String h() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                String string2 = (String)this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke((Object)this.a, new Object[0]);
                return string2;
            }
            catch (Exception exception) {
                Log.e((String)"MediaSessionCompat", (String)"Cannot execute MediaSession.getCallingPackage()", (Throwable)exception);
                return null;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void i(int var1_1) {
            if (this.m == var1_1) return;
            this.m = var1_1;
            var3_2 = this.d;
            // MONITORENTER : var3_2
            var2_3 = this.g.beginBroadcast() - 1;
lbl7: // 2 sources:
            if (var2_3 >= 0) {
                var4_4 = (android.support.v4.media.session.a)this.g.getBroadcastItem(var2_3);
                var4_4.m(var1_1);
            }
            this.g.finishBroadcast();
            // MONITOREXIT : var3_2
            return;
            catch (RemoteException var4_6) {}
            --var2_3;
            ** GOTO lbl7
        }

        @Override
        public void j(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void k(boolean var1_1) {
            if (this.l == var1_1) return;
            this.l = var1_1;
            var3_2 = this.d;
            // MONITORENTER : var3_2
            var2_3 = this.g.beginBroadcast() - 1;
lbl7: // 2 sources:
            if (var2_3 >= 0) {
                var4_4 = (android.support.v4.media.session.a)this.g.getBroadcastItem(var2_3);
                var4_4.J0(var1_1);
            }
            this.g.finishBroadcast();
            // MONITOREXIT : var3_2
            return;
            catch (RemoteException var4_6) {}
            --var2_3;
            ** GOTO lbl7
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void l(PlaybackStateCompat playbackStateCompat) {
            this.h = playbackStateCompat;
            object = this.d;
            // MONITORENTER : object
            n8 = this.g.beginBroadcast() - 1;
lbl6: // 2 sources:
            if (n8 >= 0) {
                a8 = (android.support.v4.media.session.a)this.g.getBroadcastItem(n8);
                a8.Q0(playbackStateCompat);
            }
            this.g.finishBroadcast();
            // MONITOREXIT : object
            object = this.a;
            playbackStateCompat = playbackStateCompat == null ? null : (PlaybackState)playbackStateCompat.e();
            object.setPlaybackState((PlaybackState)playbackStateCompat);
            return;
            catch (RemoteException remoteException) {}
            --n8;
            ** GOTO lbl6
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void m(b b8, Handler handler) {
            Object object = this.d;
            synchronized (object) {
                try {
                    this.o = b8;
                    MediaSession mediaSession = this.a;
                    MediaSession.Callback callback = b8 == null ? null : b8.b;
                    mediaSession.setCallback(callback, handler);
                    if (b8 != null) {
                        b8.D(this, handler);
                    }
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        @Override
        public void n(int n8) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(n8);
            this.a.setPlaybackToLocal(builder.build());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public b o() {
            Object object = this.d;
            synchronized (object) {
                return this.o;
            }
        }

        @Override
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            this.j = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            mediaMetadataCompat = mediaMetadataCompat == null ? null : (MediaMetadata)mediaMetadataCompat.g();
            mediaSession.setMetadata((MediaMetadata)mediaMetadataCompat);
        }

        @Override
        public void q(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override
        public void r(o o8) {
            this.a.setPlaybackToRemote((VolumeProvider)o8.c());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void release() {
            this.f = true;
            this.g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field field = this.a.getClass().getDeclaredField("mCallback");
                    field.setAccessible(true);
                    field = (Handler)field.get((Object)this.a);
                    if (field != null) {
                        field.removeCallbacksAndMessages((Object)null);
                    }
                }
                catch (Exception exception) {
                    Log.w((String)"MediaSessionCompat", (String)"Exception happened while accessing MediaSession.mCallback.", (Throwable)exception);
                }
            }
            this.a.setCallback(null);
            this.b.o();
            this.a.release();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void s(int var1_1) {
            if (this.n == var1_1) return;
            this.n = var1_1;
            var3_2 = this.d;
            // MONITORENTER : var3_2
            var2_3 = this.g.beginBroadcast() - 1;
lbl7: // 2 sources:
            if (var2_3 >= 0) {
                var4_4 = (android.support.v4.media.session.a)this.g.getBroadcastItem(var2_3);
                var4_4.d0(var1_1);
            }
            this.g.finishBroadcast();
            // MONITOREXIT : var3_2
            return;
            catch (RemoteException var4_6) {}
            --var2_3;
            ** GOTO lbl7
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public a0.f t() {
            Object object = this.d;
            synchronized (object) {
                return this.p;
            }
        }

        public MediaSession u(Context context, String string2, Bundle bundle) {
            return new MediaSession(context, string2);
        }

        public static class a
        extends b.a {
            public final AtomicReference b;

            public a(d d8) {
                this.b = new AtomicReference((Object)d8);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void A(android.support.v4.media.session.a object) {
                d d8 = (d)this.b.get();
                if (d8 == null) {
                    return;
                }
                a0.f f8 = new a0.f("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
                d8.g.register((IInterface)object, (Object)f8);
                object = d8.d;
                // MONITORENTER : object
                // MONITOREXIT : object
            }

            @Override
            public void A0(String string2, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void B(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public ParcelableVolumeInfo C0() {
                throw new AssertionError();
            }

            @Override
            public void D(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
                throw new AssertionError();
            }

            @Override
            public void E0() {
                throw new AssertionError();
            }

            @Override
            public void G0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public boolean H() {
                return false;
            }

            @Override
            public void H0(long l8) {
                throw new AssertionError();
            }

            @Override
            public void I(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override
            public void J(int n8, int n9, String string2) {
                throw new AssertionError();
            }

            @Override
            public void M(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public String N0() {
                throw new AssertionError();
            }

            @Override
            public void Q(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override
            public boolean R() {
                throw new AssertionError();
            }

            @Override
            public void S(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override
            public PendingIntent T() {
                throw new AssertionError();
            }

            @Override
            public int U() {
                d d8 = (d)this.b.get();
                if (d8 != null) {
                    return d8.n;
                }
                return -1;
            }

            @Override
            public void V(int n8) {
                throw new AssertionError();
            }

            @Override
            public int X() {
                d d8 = (d)this.b.get();
                if (d8 != null) {
                    return d8.k;
                }
                return 0;
            }

            @Override
            public void Y(String string2, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public boolean Y0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override
            public boolean b0() {
                d d8 = (d)this.b.get();
                if (d8 != null && d8.l) {
                    return true;
                }
                return false;
            }

            @Override
            public String e() {
                throw new AssertionError();
            }

            @Override
            public PlaybackStateCompat f() {
                d d8 = (d)this.b.get();
                if (d8 != null) {
                    return MediaSessionCompat.d(d8.h, d8.j);
                }
                return null;
            }

            @Override
            public void g() {
                throw new AssertionError();
            }

            @Override
            public void i(int n8) {
                throw new AssertionError();
            }

            @Override
            public void j() {
                throw new AssertionError();
            }

            @Override
            public void j0(String string2, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override
            public void k(boolean bl) {
                throw new AssertionError();
            }

            @Override
            public List k0() {
                return null;
            }

            @Override
            public void next() {
                throw new AssertionError();
            }

            public void o() {
                this.b.set((Object)null);
            }

            @Override
            public void o0() {
                throw new AssertionError();
            }

            @Override
            public void p() {
                throw new AssertionError();
            }

            @Override
            public CharSequence p0() {
                throw new AssertionError();
            }

            @Override
            public void previous() {
                throw new AssertionError();
            }

            @Override
            public int q() {
                d d8 = (d)this.b.get();
                if (d8 != null) {
                    return d8.m;
                }
                return -1;
            }

            @Override
            public Bundle r() {
                throw new AssertionError();
            }

            @Override
            public MediaMetadataCompat r0() {
                throw new AssertionError();
            }

            @Override
            public void s(int n8) {
                throw new AssertionError();
            }

            @Override
            public void s0(String string2, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void stop() {
                throw new AssertionError();
            }

            @Override
            public Bundle t0() {
                d d8 = (d)this.b.get();
                if (d8.e == null) {
                    return null;
                }
                return new Bundle(d8.e);
            }

            @Override
            public void u(float f8) {
                throw new AssertionError();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void u0(android.support.v4.media.session.a object) {
                d d8 = (d)this.b.get();
                if (d8 == null) {
                    return;
                }
                d8.g.unregister((IInterface)object);
                Binder.getCallingPid();
                Binder.getCallingUid();
                object = d8.d;
                // MONITORENTER : object
                // MONITOREXIT : object
            }

            @Override
            public void v0(String string2, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public long w0() {
                throw new AssertionError();
            }

            @Override
            public void y(String string2, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void y0(long l8) {
                throw new AssertionError();
            }

            @Override
            public void z(int n8, int n9, String string2) {
                throw new AssertionError();
            }

            @Override
            public void z0(boolean bl) {
            }
        }

    }

    public static class e
    extends d {
        public e(Context context, String string2, v1.d d8, Bundle bundle) {
            super(context, string2, d8, bundle);
        }
    }

    public static class f
    extends e {
        public f(Context context, String string2, v1.d d8, Bundle bundle) {
            super(context, string2, d8, bundle);
        }

        @Override
        public void d(a0.f f8) {
        }

        @Override
        public final a0.f t() {
            return new a0.f(android.support.v4.media.session.c.a(this.a));
        }
    }

    public static class g
    extends f {
        public g(Context context, String string2, v1.d d8, Bundle bundle) {
            super(context, string2, d8, bundle);
        }

        @Override
        public MediaSession u(Context context, String string2, Bundle bundle) {
            return android.support.v4.media.session.d.a(context, string2, bundle);
        }
    }

}

