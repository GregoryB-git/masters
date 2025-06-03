// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.Binder;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.Field;
import android.media.VolumeProvider;
import android.media.MediaMetadata;
import android.media.AudioAttributes$Builder;
import android.os.RemoteCallbackList;
import android.media.session.MediaSession;
import android.media.Rating;
import android.os.IBinder;
import a0.f;
import android.os.Message;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import android.media.session.MediaSession$Callback;
import android.media.session.MediaSession$Token;
import android.os.ResultReceiver;
import android.media.MediaDescription;
import android.os.Parcel;
import android.media.session.MediaSession$QueueItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import a0.o;
import java.util.Iterator;
import android.support.v4.media.a;
import android.os.BadParcelableException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.TypedValue;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import v1.d;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;

public class MediaSessionCompat
{
    public static int d;
    public final c a;
    public final MediaControllerCompat b;
    public final ArrayList c;
    
    public MediaSessionCompat(final Context context, final String s) {
        this(context, s, null, null);
    }
    
    public MediaSessionCompat(final Context context, final String s, final ComponentName componentName, final PendingIntent pendingIntent) {
        this(context, s, componentName, pendingIntent, null);
    }
    
    public MediaSessionCompat(final Context context, final String s, final ComponentName componentName, final PendingIntent pendingIntent, final Bundle bundle) {
        this(context, s, componentName, pendingIntent, bundle, null);
    }
    
    public MediaSessionCompat(final Context context, final String s, ComponentName a, final PendingIntent pendingIntent, final Bundle bundle, final v1.d d) {
        this.c = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            ComponentName component;
            if ((component = a) == null) {
                a = c0.d.a(context);
                if ((component = a) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    component = a;
                }
            }
            PendingIntent broadcast = pendingIntent;
            if (component != null && (broadcast = pendingIntent) == null) {
                final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(component);
                int n;
                if (Build$VERSION.SDK_INT >= 31) {
                    n = 33554432;
                }
                else {
                    n = 0;
                }
                broadcast = PendingIntent.getBroadcast(context, 0, intent, n);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            d a2;
            if (sdk_INT >= 29) {
                a2 = new g(context, s, d, bundle);
            }
            else if (sdk_INT >= 28) {
                a2 = new f(context, s, d, bundle);
            }
            else {
                a2 = new e(context, s, d, bundle);
            }
            this.a = (c)a2;
            Looper looper;
            if (Looper.myLooper() != null) {
                looper = Looper.myLooper();
            }
            else {
                looper = Looper.getMainLooper();
            }
            this.i((b)new b() {}, new Handler(looper));
            this.a.q(broadcast);
            this.b = new MediaControllerCompat(context, this);
            if (MediaSessionCompat.d == 0) {
                MediaSessionCompat.d = (int)(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
    
    public static void a(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
    
    public static PlaybackStateCompat d(final PlaybackStateCompat playbackStateCompat, final MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat b = playbackStateCompat;
        if (playbackStateCompat != null) {
            final long f = playbackStateCompat.f();
            final long n = -1L;
            if (f == -1L) {
                return playbackStateCompat;
            }
            if (playbackStateCompat.g() != 3 && playbackStateCompat.g() != 4) {
                b = playbackStateCompat;
                if (playbackStateCompat.g() != 5) {
                    return b;
                }
            }
            final long c = playbackStateCompat.c();
            b = playbackStateCompat;
            if (c > 0L) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final long n2 = (long)(playbackStateCompat.d() * (elapsedRealtime - c)) + playbackStateCompat.f();
                long f2 = n;
                if (mediaMetadataCompat != null) {
                    f2 = n;
                    if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                        f2 = mediaMetadataCompat.f("android.media.metadata.DURATION");
                    }
                }
                if (f2 < 0L || n2 <= f2) {
                    if (n2 < 0L) {
                        f2 = 0L;
                    }
                    else {
                        f2 = n2;
                    }
                }
                b = new PlaybackStateCompat.d(playbackStateCompat).h(playbackStateCompat.g(), f2, playbackStateCompat.d(), elapsedRealtime).b();
            }
        }
        return b;
    }
    
    public static Bundle u(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        while (true) {
            try {
                ((BaseBundle)bundle).isEmpty();
                return bundle;
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
                return null;
            }
            catch (BadParcelableException ex) {
                continue;
            }
            break;
        }
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
    
    public void g(final boolean b) {
        this.a.g(b);
        final Iterator<Object> iterator = (Iterator<Object>)this.c.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    public void h(final b b) {
        this.i(b, null);
    }
    
    public void i(final b b, Handler handler) {
        if (b == null) {
            this.a.m(null, null);
            return;
        }
        final c a = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        a.m(b, handler);
    }
    
    public void j(final boolean b) {
        this.a.k(b);
    }
    
    public void k(final int n) {
        this.a.c(n);
    }
    
    public void l(final PendingIntent pendingIntent) {
        this.a.q(pendingIntent);
    }
    
    public void m(final MediaMetadataCompat mediaMetadataCompat) {
        this.a.p(mediaMetadataCompat);
    }
    
    public void n(final PlaybackStateCompat playbackStateCompat) {
        this.a.l(playbackStateCompat);
    }
    
    public void o(final int n) {
        this.a.n(n);
    }
    
    public void p(final o o) {
        if (o != null) {
            this.a.r(o);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }
    
    public void q(final List list) {
        if (list != null) {
            final HashSet<Long> set = new HashSet<Long>();
            for (final QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (set.contains(queueItem.d())) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Found duplicate queue id: ");
                    sb.append(queueItem.d());
                    Log.e("MediaSessionCompat", sb.toString(), (Throwable)new IllegalArgumentException("id of each queue item should be unique"));
                }
                set.add(queueItem.d());
            }
        }
        this.a.e(list);
    }
    
    public void r(final int n) {
        this.a.i(n);
    }
    
    public void s(final PendingIntent pendingIntent) {
        this.a.j(pendingIntent);
    }
    
    public void t(final int n) {
        this.a.s(n);
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class QueueItem implements Parcelable
    {
        public static final Parcelable$Creator<QueueItem> CREATOR;
        public final MediaDescriptionCompat o;
        public final long p;
        public MediaSession$QueueItem q;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public QueueItem a(final Parcel parcel) {
                    return new QueueItem(parcel);
                }
                
                public QueueItem[] b(final int n) {
                    return new QueueItem[n];
                }
            };
        }
        
        public QueueItem(final MediaSession$QueueItem q, final MediaDescriptionCompat o, final long p3) {
            if (o == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (p3 != -1L) {
                this.o = o;
                this.p = p3;
                this.q = q;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        
        public QueueItem(final Parcel parcel) {
            this.o = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.p = parcel.readLong();
        }
        
        public QueueItem(final MediaDescriptionCompat mediaDescriptionCompat, final long n) {
            this(null, mediaDescriptionCompat, n);
        }
        
        public static QueueItem a(final Object o) {
            if (o != null) {
                final MediaSession$QueueItem mediaSession$QueueItem = (MediaSession$QueueItem)o;
                return new QueueItem(mediaSession$QueueItem, MediaDescriptionCompat.a(b.b(mediaSession$QueueItem)), b.c(mediaSession$QueueItem));
            }
            return null;
        }
        
        public static List b(final List list) {
            if (list != null) {
                final ArrayList<QueueItem> list2 = new ArrayList<QueueItem>(list.size());
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(a(iterator.next()));
                }
                return list2;
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
            MediaSession$QueueItem q;
            if ((q = this.q) == null) {
                q = b.a((MediaDescription)this.o.f(), this.p);
                this.q = q;
            }
            return q;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.o);
            sb.append(", Id=");
            sb.append(this.p);
            sb.append(" }");
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.o.writeToParcel(parcel, n);
            parcel.writeLong(this.p);
        }
        
        public abstract static class b
        {
            public static MediaSession$QueueItem a(final MediaDescription mediaDescription, final long n) {
                return new MediaSession$QueueItem(mediaDescription, n);
            }
            
            public static MediaDescription b(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getDescription();
            }
            
            public static long c(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getQueueId();
            }
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class ResultReceiverWrapper implements Parcelable
    {
        public static final Parcelable$Creator<ResultReceiverWrapper> CREATOR;
        public ResultReceiver o;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public ResultReceiverWrapper a(final Parcel parcel) {
                    return new ResultReceiverWrapper(parcel);
                }
                
                public ResultReceiverWrapper[] b(final int n) {
                    return new ResultReceiverWrapper[n];
                }
            };
        }
        
        public ResultReceiverWrapper(final Parcel parcel) {
            this.o = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.o.writeToParcel(parcel, n);
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class Token implements Parcelable
    {
        public static final Parcelable$Creator<Token> CREATOR;
        public final Object o;
        public final Object p;
        public b q;
        public v1.d r;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public Token a(final Parcel parcel) {
                    return new Token(parcel.readParcelable((ClassLoader)null));
                }
                
                public Token[] b(final int n) {
                    return new Token[n];
                }
            };
        }
        
        public Token(final Object o) {
            this(o, null, null);
        }
        
        public Token(final Object o, final b b) {
            this(o, b, null);
        }
        
        public Token(final Object p3, final b q, final v1.d r) {
            this.o = new Object();
            this.p = p3;
            this.q = q;
            this.r = r;
        }
        
        public static Token a(final Object o) {
            return b(o, null);
        }
        
        public static Token b(final Object o, final b b) {
            if (o == null) {
                return null;
            }
            if (o instanceof MediaSession$Token) {
                return new Token(o, b);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }
        
        public b c() {
            synchronized (this.o) {
                return this.q;
            }
        }
        
        public v1.d d() {
            synchronized (this.o) {
                return this.r;
            }
        }
        
        public int describeContents() {
            return 0;
        }
        
        public Object e() {
            return this.p;
        }
        
        @Override
        public boolean equals(Object p) {
            if (this == p) {
                return true;
            }
            if (!(p instanceof Token)) {
                return false;
            }
            final Token token = (Token)p;
            p = this.p;
            final Object p2 = token.p;
            if (p == null) {
                return p2 == null;
            }
            return p2 != null && p.equals(p2);
        }
        
        public void f(final b q) {
            synchronized (this.o) {
                this.q = q;
            }
        }
        
        public void g(final v1.d r) {
            synchronized (this.o) {
                this.r = r;
            }
        }
        
        @Override
        public int hashCode() {
            final Object p = this.p;
            if (p == null) {
                return 0;
            }
            return p.hashCode();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable((Parcelable)this.p, n);
        }
    }
    
    public abstract static class b
    {
        public final Object a;
        public final MediaSession$Callback b;
        public boolean c;
        public WeakReference d;
        public a e;
        
        public b() {
            this.a = new Object();
            this.b = new MediaSessionCompat.b.b();
            this.d = new WeakReference(null);
        }
        
        public void A() {
        }
        
        public void B(final long n) {
        }
        
        public void C() {
        }
        
        public void D(final c referent, final Handler handler) {
            while (true) {
                final Object a = this.a;
                // monitorenter(a)
            Label_0054_Outer:
                while (true) {
                    while (true) {
                        a a2 = null;
                        final Throwable t;
                        Label_0072: {
                            while (true) {
                                try {
                                    this.d = new WeakReference((T)referent);
                                    final a e = this.e;
                                    a2 = null;
                                    if (e != null) {
                                        e.removeCallbacksAndMessages((Object)null);
                                    }
                                    break Label_0072;
                                    final a e2 = new a(handler.getLooper());
                                    this.e = e2;
                                    // monitorexit(a)
                                    return;
                                    // monitorexit(a)
                                    throw t;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                        a e2 = a2;
                        if (t == null) {
                            continue;
                        }
                        if (handler == null) {
                            e2 = a2;
                            continue;
                        }
                        break;
                    }
                    continue Label_0054_Outer;
                }
            }
        }
        
        public void a(final c c, final Handler handler) {
            if (!this.c) {
                return;
            }
            boolean b = false;
            this.c = false;
            handler.removeMessages(1);
            final PlaybackStateCompat f = c.f();
            long b2;
            if (f == null) {
                b2 = 0L;
            }
            else {
                b2 = f.b();
            }
            final boolean b3 = f != null && f.g() == 3;
            final boolean b4 = (0x204L & b2) != 0x0L;
            if ((b2 & 0x202L) != 0x0L) {
                b = true;
            }
            if (b3 && b) {
                this.h();
                return;
            }
            if (!b3 && b4) {
                this.i();
            }
        }
        
        public void b(final MediaDescriptionCompat mediaDescriptionCompat) {
        }
        
        public void c(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
        }
        
        public void d(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
        }
        
        public void e(final String s, final Bundle bundle) {
        }
        
        public void f() {
        }
        
        public boolean g(final Intent intent) {
            if (Build$VERSION.SDK_INT >= 27) {
                return false;
            }
            Object o = this.a;
            synchronized (o) {
                final c c = (c)this.d.get();
                final a e = this.e;
                // monitorexit(o)
                if (c != null) {
                    if (e == null) {
                        return false;
                    }
                    final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        o = c.t();
                        final int keyCode = keyEvent.getKeyCode();
                        if (keyCode != 79 && keyCode != 85) {
                            this.a(c, e);
                            return false;
                        }
                        if (keyEvent.getRepeatCount() == 0) {
                            if (!this.c) {
                                this.c = true;
                                e.sendMessageDelayed(e.obtainMessage(1, o), (long)ViewConfiguration.getDoubleTapTimeout());
                                return true;
                            }
                            e.removeMessages(1);
                            this.c = false;
                            final PlaybackStateCompat f = c.f();
                            long b;
                            if (f == null) {
                                b = 0L;
                            }
                            else {
                                b = f.b();
                            }
                            if ((b & 0x20L) != 0x0L) {
                                this.z();
                                return true;
                            }
                        }
                        else {
                            this.a(c, e);
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        
        public void h() {
        }
        
        public void i() {
        }
        
        public void j(final String s, final Bundle bundle) {
        }
        
        public void k(final String s, final Bundle bundle) {
        }
        
        public void l(final Uri uri, final Bundle bundle) {
        }
        
        public void m() {
        }
        
        public void n(final String s, final Bundle bundle) {
        }
        
        public void o(final String s, final Bundle bundle) {
        }
        
        public void p(final Uri uri, final Bundle bundle) {
        }
        
        public void q(final MediaDescriptionCompat mediaDescriptionCompat) {
        }
        
        public void r() {
        }
        
        public void s(final long n) {
        }
        
        public void t(final boolean b) {
        }
        
        public void u(final float n) {
        }
        
        public void v(final RatingCompat ratingCompat) {
        }
        
        public void w(final RatingCompat ratingCompat, final Bundle bundle) {
        }
        
        public void x(final int n) {
        }
        
        public void y(final int n) {
        }
        
        public void z() {
        }
        
        public class a extends Handler
        {
            public a(final Looper looper) {
                super(looper);
            }
            
            public void handleMessage(final Message message) {
                if (message.what == 1) {
                    synchronized (MediaSessionCompat.b.this.a) {
                        final c c = (c)MediaSessionCompat.b.this.d.get();
                        final MediaSessionCompat.b a = MediaSessionCompat.b.this;
                        final a e = a.e;
                        // monitorexit(this.a.a)
                        if (c == null || a != c.o()) {
                            return;
                        }
                        if (e == null) {
                            return;
                        }
                        c.d((a0.f)message.obj);
                        MediaSessionCompat.b.this.a(c, e);
                        c.d(null);
                    }
                }
            }
        }
        
        public class b extends MediaSession$Callback
        {
            public final void a(final c c) {
                c.d(null);
            }
            
            public final d b() {
                synchronized (MediaSessionCompat.b.this.a) {
                    final d d = (d)MediaSessionCompat.b.this.d.get();
                    // monitorexit(this.a.a)
                    if (d != null && MediaSessionCompat.b.this == d.o()) {
                        return d;
                    }
                    return null;
                }
            }
            
            public final void c(final c c) {
                if (Build$VERSION.SDK_INT >= 28) {
                    return;
                }
                String h;
                if (TextUtils.isEmpty((CharSequence)(h = c.h()))) {
                    h = "android.media.session.MediaController";
                }
                c.d(new a0.f(h, -1, -1));
            }
            
            public void onCommand(final String s, Bundle bundle, final ResultReceiver resultReceiver) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                while (true) {
                    try {
                        final boolean equals = s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
                        final QueueItem queueItem = null;
                        final IBinder binder = null;
                        while (true) {
                            if (equals) {
                                bundle = new Bundle();
                                final Token b2 = b.b();
                                final android.support.v4.media.session.b c = b2.c();
                                IBinder binder2;
                                if (c == null) {
                                    binder2 = binder;
                                }
                                else {
                                    binder2 = ((IInterface)c).asBinder();
                                }
                                w.d.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", binder2);
                                v1.a.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", b2.d());
                                resultReceiver.send(0, bundle);
                            }
                            else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                                MediaSessionCompat.b.this.b((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                            }
                            else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                                MediaSessionCompat.b.this.c((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ((BaseBundle)bundle).getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                            }
                            else {
                                MediaSessionCompat.b a;
                                MediaDescriptionCompat mediaDescriptionCompat;
                                if (s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                                    a = MediaSessionCompat.b.this;
                                    mediaDescriptionCompat = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                                }
                                else {
                                    if (!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                        MediaSessionCompat.b.this.d(s, bundle, resultReceiver);
                                        break Label_0318;
                                    }
                                    if (b.i == null) {
                                        break Label_0318;
                                    }
                                    final int int1 = ((BaseBundle)bundle).getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                    Object o = queueItem;
                                    if (int1 >= 0) {
                                        o = queueItem;
                                        if (int1 < b.i.size()) {
                                            o = b.i.get(int1);
                                        }
                                    }
                                    if (o == null) {
                                        break Label_0318;
                                    }
                                    final MediaSessionCompat.b a2 = MediaSessionCompat.b.this;
                                    final MediaDescriptionCompat c2 = ((QueueItem)o).c();
                                    a = a2;
                                    mediaDescriptionCompat = c2;
                                }
                                a.q(mediaDescriptionCompat);
                            }
                            this.a(b);
                            return;
                            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                            continue;
                        }
                    }
                    catch (BadParcelableException ex) {}
                    continue;
                }
            }
            
            public void onCustomAction(String s, Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                while (true) {
                    try {
                        if (s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            final Uri uri = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.b.this.l(uri, bundle);
                        }
                        else if (s.equals("android.support.v4.media.session.action.PREPARE")) {
                            MediaSessionCompat.b.this.m();
                        }
                        else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            s = ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.b.this.n(s, bundle);
                        }
                        else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            s = ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.b.this.o(s, bundle);
                        }
                        else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            final Uri uri2 = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.b.this.p(uri2, bundle);
                        }
                        else if (s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            MediaSessionCompat.b.this.t(((BaseBundle)bundle).getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        }
                        else if (s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            MediaSessionCompat.b.this.x(((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        }
                        else if (s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            MediaSessionCompat.b.this.y(((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        }
                        else if (s.equals("android.support.v4.media.session.action.SET_RATING")) {
                            final RatingCompat ratingCompat = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.b.this.w(ratingCompat, bundle);
                        }
                        else if (s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            MediaSessionCompat.b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                        else {
                            MediaSessionCompat.b.this.e(s, bundle);
                        }
                        while (true) {
                            this.a(b);
                            return;
                            Log.e("MediaSessionCompat", "Could not unparcel the data.");
                            continue;
                        }
                    }
                    catch (BadParcelableException ex) {}
                    continue;
                }
            }
            
            public void onFastForward() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.f();
                this.a(b);
            }
            
            public boolean onMediaButtonEvent(final Intent intent) {
                final d b = this.b();
                boolean b2 = false;
                if (b == null) {
                    return false;
                }
                this.c(b);
                final boolean g = MediaSessionCompat.b.this.g(intent);
                this.a(b);
                if (g || super.onMediaButtonEvent(intent)) {
                    b2 = true;
                }
                return b2;
            }
            
            public void onPause() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.h();
                this.a(b);
            }
            
            public void onPlay() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.i();
                this.a(b);
            }
            
            public void onPlayFromMediaId(final String s, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.j(s, bundle);
                this.a(b);
            }
            
            public void onPlayFromSearch(final String s, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.k(s, bundle);
                this.a(b);
            }
            
            public void onPlayFromUri(final Uri uri, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.l(uri, bundle);
                this.a(b);
            }
            
            public void onPrepare() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.m();
                this.a(b);
            }
            
            public void onPrepareFromMediaId(final String s, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.n(s, bundle);
                this.a(b);
            }
            
            public void onPrepareFromSearch(final String s, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.o(s, bundle);
                this.a(b);
            }
            
            public void onPrepareFromUri(final Uri uri, final Bundle bundle) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(b);
                MediaSessionCompat.b.this.p(uri, bundle);
                this.a(b);
            }
            
            public void onRewind() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.r();
                this.a(b);
            }
            
            public void onSeekTo(final long n) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.s(n);
                this.a(b);
            }
            
            public void onSetPlaybackSpeed(final float n) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.u(n);
                this.a(b);
            }
            
            public void onSetRating(final Rating rating) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.v(RatingCompat.a(rating));
                this.a(b);
            }
            
            public void onSkipToNext() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.z();
                this.a(b);
            }
            
            public void onSkipToPrevious() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.A();
                this.a(b);
            }
            
            public void onSkipToQueueItem(final long n) {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.B(n);
                this.a(b);
            }
            
            public void onStop() {
                final d b = this.b();
                if (b == null) {
                    return;
                }
                this.c(b);
                MediaSessionCompat.b.this.C();
                this.a(b);
            }
        }
    }
    
    public interface c
    {
        boolean a();
        
        Token b();
        
        void c(final int p0);
        
        void d(final a0.f p0);
        
        void e(final List p0);
        
        PlaybackStateCompat f();
        
        void g(final boolean p0);
        
        String h();
        
        void i(final int p0);
        
        void j(final PendingIntent p0);
        
        void k(final boolean p0);
        
        void l(final PlaybackStateCompat p0);
        
        void m(final MediaSessionCompat.b p0, final Handler p1);
        
        void n(final int p0);
        
        MediaSessionCompat.b o();
        
        void p(final MediaMetadataCompat p0);
        
        void q(final PendingIntent p0);
        
        void r(final o p0);
        
        void release();
        
        void s(final int p0);
        
        a0.f t();
    }
    
    public abstract static class d implements c
    {
        public final MediaSession a;
        public final a b;
        public final Token c;
        public final Object d;
        public Bundle e;
        public boolean f;
        public final RemoteCallbackList g;
        public PlaybackStateCompat h;
        public List i;
        public MediaMetadataCompat j;
        public int k;
        public boolean l;
        public int m;
        public int n;
        public MediaSessionCompat.b o;
        public a0.f p;
        
        public d(final Context context, final String s, final v1.d d, final Bundle e) {
            this.d = new Object();
            this.f = false;
            this.g = new RemoteCallbackList();
            final MediaSession u = this.u(context, s, e);
            this.a = u;
            final a b = new a(this);
            this.b = b;
            this.c = new Token(u.getSessionToken(), b, d);
            this.e = e;
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
        public void c(final int n) {
            this.a.setFlags(n | 0x3);
        }
        
        @Override
        public void d(final a0.f p) {
            synchronized (this.d) {
                this.p = p;
            }
        }
        
        @Override
        public void e(final List i) {
            this.i = i;
            MediaSession a;
            List<MediaSession$QueueItem> queue;
            if (i == null) {
                a = this.a;
                queue = null;
            }
            else {
                final ArrayList<MediaSession$QueueItem> list = new ArrayList<MediaSession$QueueItem>(i.size());
                final Iterator<QueueItem> iterator = i.iterator();
                while (iterator.hasNext()) {
                    list.add((MediaSession$QueueItem)iterator.next().e());
                }
                final MediaSession a2 = this.a;
                queue = list;
                a = a2;
            }
            a.setQueue((List)queue);
        }
        
        @Override
        public PlaybackStateCompat f() {
            return this.h;
        }
        
        @Override
        public void g(final boolean active) {
            this.a.setActive(active);
        }
        
        @Override
        public String h() {
            if (Build$VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String)this.a.getClass().getMethod("getCallingPackage", (Class<?>[])new Class[0]).invoke(this.a, new Object[0]);
            }
            catch (Exception ex) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public void i(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/support/v4/media/session/MediaSessionCompat$d.m:I
            //     4: iload_1        
            //     5: if_icmpeq       85
            //     8: aload_0        
            //     9: iload_1        
            //    10: putfield        android/support/v4/media/session/MediaSessionCompat$d.m:I
            //    13: aload_0        
            //    14: getfield        android/support/v4/media/session/MediaSessionCompat$d.d:Ljava/lang/Object;
            //    17: astore_3       
            //    18: aload_3        
            //    19: monitorenter   
            //    20: aload_0        
            //    21: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    24: invokevirtual   android/os/RemoteCallbackList.beginBroadcast:()I
            //    27: iconst_1       
            //    28: isub           
            //    29: istore_2       
            //    30: iload_2        
            //    31: iflt            70
            //    34: aload_0        
            //    35: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    38: iload_2        
            //    39: invokevirtual   android/os/RemoteCallbackList.getBroadcastItem:(I)Landroid/os/IInterface;
            //    42: checkcast       Landroid/support/v4/media/session/a;
            //    45: astore          4
            //    47: aload           4
            //    49: iload_1        
            //    50: invokeinterface android/support/v4/media/session/a.m:(I)V
            //    55: goto            63
            //    58: astore          4
            //    60: goto            80
            //    63: iload_2        
            //    64: iconst_1       
            //    65: isub           
            //    66: istore_2       
            //    67: goto            30
            //    70: aload_0        
            //    71: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    74: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
            //    77: aload_3        
            //    78: monitorexit    
            //    79: return         
            //    80: aload_3        
            //    81: monitorexit    
            //    82: aload           4
            //    84: athrow         
            //    85: return         
            //    86: astore          4
            //    88: goto            63
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  20     30     58     85     Any
            //  34     47     58     85     Any
            //  47     55     86     91     Landroid/os/RemoteException;
            //  47     55     58     85     Any
            //  70     79     58     85     Any
            //  80     82     58     85     Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void j(final PendingIntent sessionActivity) {
            this.a.setSessionActivity(sessionActivity);
        }
        
        @Override
        public void k(final boolean p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/support/v4/media/session/MediaSessionCompat$d.l:Z
            //     4: iload_1        
            //     5: if_icmpeq       85
            //     8: aload_0        
            //     9: iload_1        
            //    10: putfield        android/support/v4/media/session/MediaSessionCompat$d.l:Z
            //    13: aload_0        
            //    14: getfield        android/support/v4/media/session/MediaSessionCompat$d.d:Ljava/lang/Object;
            //    17: astore_3       
            //    18: aload_3        
            //    19: monitorenter   
            //    20: aload_0        
            //    21: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    24: invokevirtual   android/os/RemoteCallbackList.beginBroadcast:()I
            //    27: iconst_1       
            //    28: isub           
            //    29: istore_2       
            //    30: iload_2        
            //    31: iflt            70
            //    34: aload_0        
            //    35: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    38: iload_2        
            //    39: invokevirtual   android/os/RemoteCallbackList.getBroadcastItem:(I)Landroid/os/IInterface;
            //    42: checkcast       Landroid/support/v4/media/session/a;
            //    45: astore          4
            //    47: aload           4
            //    49: iload_1        
            //    50: invokeinterface android/support/v4/media/session/a.J0:(Z)V
            //    55: goto            63
            //    58: astore          4
            //    60: goto            80
            //    63: iload_2        
            //    64: iconst_1       
            //    65: isub           
            //    66: istore_2       
            //    67: goto            30
            //    70: aload_0        
            //    71: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    74: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
            //    77: aload_3        
            //    78: monitorexit    
            //    79: return         
            //    80: aload_3        
            //    81: monitorexit    
            //    82: aload           4
            //    84: athrow         
            //    85: return         
            //    86: astore          4
            //    88: goto            63
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  20     30     58     85     Any
            //  34     47     58     85     Any
            //  47     55     86     91     Landroid/os/RemoteException;
            //  47     55     58     85     Any
            //  70     79     58     85     Any
            //  80     82     58     85     Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void l(final PlaybackStateCompat p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1        
            //     2: putfield        android/support/v4/media/session/MediaSessionCompat$d.h:Landroid/support/v4/media/session/PlaybackStateCompat;
            //     5: aload_0        
            //     6: getfield        android/support/v4/media/session/MediaSessionCompat$d.d:Ljava/lang/Object;
            //     9: astore_3       
            //    10: aload_3        
            //    11: monitorenter   
            //    12: aload_0        
            //    13: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    16: invokevirtual   android/os/RemoteCallbackList.beginBroadcast:()I
            //    19: iconst_1       
            //    20: isub           
            //    21: istore_2       
            //    22: iload_2        
            //    23: iflt            61
            //    26: aload_0        
            //    27: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    30: iload_2        
            //    31: invokevirtual   android/os/RemoteCallbackList.getBroadcastItem:(I)Landroid/os/IInterface;
            //    34: checkcast       Landroid/support/v4/media/session/a;
            //    37: astore          4
            //    39: aload           4
            //    41: aload_1        
            //    42: invokeinterface android/support/v4/media/session/a.Q0:(Landroid/support/v4/media/session/PlaybackStateCompat;)V
            //    47: goto            54
            //    50: astore_1       
            //    51: goto            98
            //    54: iload_2        
            //    55: iconst_1       
            //    56: isub           
            //    57: istore_2       
            //    58: goto            22
            //    61: aload_0        
            //    62: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    65: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
            //    68: aload_3        
            //    69: monitorexit    
            //    70: aload_0        
            //    71: getfield        android/support/v4/media/session/MediaSessionCompat$d.a:Landroid/media/session/MediaSession;
            //    74: astore_3       
            //    75: aload_1        
            //    76: ifnonnull       84
            //    79: aconst_null    
            //    80: astore_1       
            //    81: goto            92
            //    84: aload_1        
            //    85: invokevirtual   android/support/v4/media/session/PlaybackStateCompat.e:()Ljava/lang/Object;
            //    88: checkcast       Landroid/media/session/PlaybackState;
            //    91: astore_1       
            //    92: aload_3        
            //    93: aload_1        
            //    94: invokevirtual   android/media/session/MediaSession.setPlaybackState:(Landroid/media/session/PlaybackState;)V
            //    97: return         
            //    98: aload_3        
            //    99: monitorexit    
            //   100: aload_1        
            //   101: athrow         
            //   102: astore          4
            //   104: goto            54
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  12     22     50     102    Any
            //  26     39     50     102    Any
            //  39     47     102    107    Landroid/os/RemoteException;
            //  39     47     50     102    Any
            //  61     70     50     102    Any
            //  98     100    50     102    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void m(final MediaSessionCompat.b o, final Handler handler) {
            final Object d = this.d;
            // monitorenter(d)
            while (true) {
                try {
                    this.o = o;
                    final MediaSession a = this.a;
                    MediaSession$Callback b;
                    if (o == null) {
                        b = null;
                    }
                    else {
                        b = o.b;
                    }
                    a.setCallback(b, handler);
                    if (o != null) {
                        o.D(this, handler);
                    }
                    // monitorexit(d)
                    return;
                    // monitorexit(d)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void n(final int legacyStreamType) {
            final AudioAttributes$Builder audioAttributes$Builder = new AudioAttributes$Builder();
            audioAttributes$Builder.setLegacyStreamType(legacyStreamType);
            this.a.setPlaybackToLocal(audioAttributes$Builder.build());
        }
        
        @Override
        public MediaSessionCompat.b o() {
            synchronized (this.d) {
                return this.o;
            }
        }
        
        @Override
        public void p(final MediaMetadataCompat j) {
            this.j = j;
            final MediaSession a = this.a;
            MediaMetadata metadata;
            if (j == null) {
                metadata = null;
            }
            else {
                metadata = (MediaMetadata)j.g();
            }
            a.setMetadata(metadata);
        }
        
        @Override
        public void q(final PendingIntent mediaButtonReceiver) {
            this.a.setMediaButtonReceiver(mediaButtonReceiver);
        }
        
        @Override
        public void r(final o o) {
            this.a.setPlaybackToRemote((VolumeProvider)o.c());
        }
        
        @Override
        public void release() {
            this.f = true;
            this.g.kill();
            if (Build$VERSION.SDK_INT == 27) {
                try {
                    final Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    final Handler handler = (Handler)declaredField.get(this.a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object)null);
                    }
                }
                catch (Exception ex) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", (Throwable)ex);
                }
            }
            this.a.setCallback((MediaSession$Callback)null);
            this.b.o();
            this.a.release();
        }
        
        @Override
        public void s(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/support/v4/media/session/MediaSessionCompat$d.n:I
            //     4: iload_1        
            //     5: if_icmpeq       85
            //     8: aload_0        
            //     9: iload_1        
            //    10: putfield        android/support/v4/media/session/MediaSessionCompat$d.n:I
            //    13: aload_0        
            //    14: getfield        android/support/v4/media/session/MediaSessionCompat$d.d:Ljava/lang/Object;
            //    17: astore_3       
            //    18: aload_3        
            //    19: monitorenter   
            //    20: aload_0        
            //    21: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    24: invokevirtual   android/os/RemoteCallbackList.beginBroadcast:()I
            //    27: iconst_1       
            //    28: isub           
            //    29: istore_2       
            //    30: iload_2        
            //    31: iflt            70
            //    34: aload_0        
            //    35: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    38: iload_2        
            //    39: invokevirtual   android/os/RemoteCallbackList.getBroadcastItem:(I)Landroid/os/IInterface;
            //    42: checkcast       Landroid/support/v4/media/session/a;
            //    45: astore          4
            //    47: aload           4
            //    49: iload_1        
            //    50: invokeinterface android/support/v4/media/session/a.d0:(I)V
            //    55: goto            63
            //    58: astore          4
            //    60: goto            80
            //    63: iload_2        
            //    64: iconst_1       
            //    65: isub           
            //    66: istore_2       
            //    67: goto            30
            //    70: aload_0        
            //    71: getfield        android/support/v4/media/session/MediaSessionCompat$d.g:Landroid/os/RemoteCallbackList;
            //    74: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
            //    77: aload_3        
            //    78: monitorexit    
            //    79: return         
            //    80: aload_3        
            //    81: monitorexit    
            //    82: aload           4
            //    84: athrow         
            //    85: return         
            //    86: astore          4
            //    88: goto            63
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  20     30     58     85     Any
            //  34     47     58     85     Any
            //  47     55     86     91     Landroid/os/RemoteException;
            //  47     55     58     85     Any
            //  70     79     58     85     Any
            //  80     82     58     85     Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public a0.f t() {
            synchronized (this.d) {
                return this.p;
            }
        }
        
        public MediaSession u(final Context context, final String s, final Bundle bundle) {
            return new MediaSession(context, s);
        }
        
        public static class a extends android.support.v4.media.session.b.a
        {
            public final AtomicReference b;
            
            public a(final d initialValue) {
                this.b = new AtomicReference((V)initialValue);
            }
            
            public void A(final android.support.v4.media.session.a a) {
                final d d = this.b.get();
                if (d == null) {
                    return;
                }
                d.g.register((IInterface)a, (Object)new a0.f("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (d.d) {
                }
                // monitorexit(d.d)
            }
            
            public void A0(final String s, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public void B(final RatingCompat ratingCompat, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public ParcelableVolumeInfo C0() {
                throw new AssertionError();
            }
            
            public void D(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
                throw new AssertionError();
            }
            
            public void E0() {
                throw new AssertionError();
            }
            
            public void G0(final Uri uri, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public boolean H() {
                return false;
            }
            
            public void H0(final long n) {
                throw new AssertionError();
            }
            
            public void I(final RatingCompat ratingCompat) {
                throw new AssertionError();
            }
            
            public void J(final int n, final int n2, final String s) {
                throw new AssertionError();
            }
            
            public void M(final Uri uri, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public String N0() {
                throw new AssertionError();
            }
            
            public void Q(final MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
            
            public boolean R() {
                throw new AssertionError();
            }
            
            public void S(final MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
            
            public PendingIntent T() {
                throw new AssertionError();
            }
            
            public int U() {
                final d d = this.b.get();
                if (d != null) {
                    return d.n;
                }
                return -1;
            }
            
            public void V(final int n) {
                throw new AssertionError();
            }
            
            public int X() {
                final d d = this.b.get();
                if (d != null) {
                    return d.k;
                }
                return 0;
            }
            
            public void Y(final String s, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public boolean Y0(final KeyEvent keyEvent) {
                throw new AssertionError();
            }
            
            public boolean b0() {
                final d d = this.b.get();
                return d != null && d.l;
            }
            
            public String e() {
                throw new AssertionError();
            }
            
            public PlaybackStateCompat f() {
                final d d = this.b.get();
                if (d != null) {
                    return MediaSessionCompat.d(d.h, d.j);
                }
                return null;
            }
            
            public void g() {
                throw new AssertionError();
            }
            
            public void i(final int n) {
                throw new AssertionError();
            }
            
            public void j() {
                throw new AssertionError();
            }
            
            public void j0(final String s, final Bundle bundle, final ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }
            
            public void k(final boolean b) {
                throw new AssertionError();
            }
            
            public List k0() {
                return null;
            }
            
            public void next() {
                throw new AssertionError();
            }
            
            public void o() {
                this.b.set(null);
            }
            
            public void o0() {
                throw new AssertionError();
            }
            
            public void p() {
                throw new AssertionError();
            }
            
            public CharSequence p0() {
                throw new AssertionError();
            }
            
            public void previous() {
                throw new AssertionError();
            }
            
            public int q() {
                final d d = this.b.get();
                if (d != null) {
                    return d.m;
                }
                return -1;
            }
            
            public Bundle r() {
                throw new AssertionError();
            }
            
            public MediaMetadataCompat r0() {
                throw new AssertionError();
            }
            
            public void s(final int n) {
                throw new AssertionError();
            }
            
            public void s0(final String s, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public void stop() {
                throw new AssertionError();
            }
            
            public Bundle t0() {
                final d d = this.b.get();
                if (d.e == null) {
                    return null;
                }
                return new Bundle(d.e);
            }
            
            public void u(final float n) {
                throw new AssertionError();
            }
            
            public void u0(final android.support.v4.media.session.a a) {
                final d d = this.b.get();
                if (d == null) {
                    return;
                }
                d.g.unregister((IInterface)a);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (d.d) {
                }
                // monitorexit(d.d)
            }
            
            public void v0(final String s, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public long w0() {
                throw new AssertionError();
            }
            
            public void y(final String s, final Bundle bundle) {
                throw new AssertionError();
            }
            
            public void y0(final long n) {
                throw new AssertionError();
            }
            
            public void z(final int n, final int n2, final String s) {
                throw new AssertionError();
            }
            
            public void z0(final boolean b) {
            }
        }
    }
    
    public static class e extends d
    {
        public e(final Context context, final String s, final v1.d d, final Bundle bundle) {
            super(context, s, d, bundle);
        }
    }
    
    public static class f extends e
    {
        public f(final Context context, final String s, final v1.d d, final Bundle bundle) {
            super(context, s, d, bundle);
        }
        
        @Override
        public void d(final a0.f f) {
        }
        
        @Override
        public final a0.f t() {
            return new a0.f(c.a(super.a));
        }
    }
    
    public static class g extends f
    {
        public g(final Context context, final String s, final v1.d d, final Bundle bundle) {
            super(context, s, d, bundle);
        }
        
        @Override
        public MediaSession u(final Context context, final String s, final Bundle bundle) {
            return d.a(context, s, bundle);
        }
    }
}
