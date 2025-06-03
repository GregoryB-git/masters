package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p2.m0;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f422b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final e f423a;

    public static class CustomActionResultReceiver extends android.support.v4.os.a {
        @Override // android.support.v4.os.a
        public final void a(int i10, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends android.support.v4.os.a {
        @Override // android.support.v4.os.a
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.l(bundle);
            }
            if (i10 != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f424a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaDescriptionCompat f425b;

        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f424a = parcel.readInt();
            this.f425b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f444a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f424a = i10;
            this.f425b = mediaDescriptionCompat;
        }

        public static void a(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                        mediaItem = new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem2)), a.b(mediaItem2));
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f424a + ", mDescription=" + this.f425b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f424a);
            this.f425b.writeToParcel(parcel, i10);
        }
    }

    public static class SearchResultReceiver extends android.support.v4.os.a {
        @Override // android.support.v4.os.a
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.l(bundle);
            }
            if (i10 != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    public static class a {
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        public static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f426a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<Messenger> f427b;

        public b(g gVar) {
            this.f426a = new WeakReference<>(gVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f427b;
            if (weakReference == null || weakReference.get() == null || this.f426a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = this.f426a.get();
            Messenger messenger = this.f427b.get();
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    MediaSessionCompat.a(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    gVar.b();
                } else if (i10 == 2) {
                    gVar.a();
                } else if (i10 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle);
                    MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    data.getParcelableArrayList("data_media_item_list");
                    gVar.c(messenger, string, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    gVar.a();
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final a f428a = new a();

        /* renamed from: b, reason: collision with root package name */
        public b f429b;

        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                b bVar = c.this.f429b;
                if (bVar != null) {
                    d dVar = (d) bVar;
                    try {
                        Bundle extras = dVar.f432b.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                dVar.f = new h(binder, dVar.f433c);
                                Messenger messenger = new Messenger(dVar.f434d);
                                dVar.f436g = messenger;
                                b bVar2 = dVar.f434d;
                                bVar2.getClass();
                                bVar2.f427b = new WeakReference<>(messenger);
                                try {
                                    h hVar = dVar.f;
                                    Context context = dVar.f431a;
                                    Messenger messenger2 = dVar.f436g;
                                    hVar.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", hVar.f439b);
                                    hVar.a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            IMediaSession asInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));
                            if (asInterface != null) {
                                MediaSession.Token sessionToken = dVar.f432b.getSessionToken();
                                dVar.f437h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, asInterface, null) : null;
                            }
                        }
                    } catch (IllegalStateException e10) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
                    }
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                b bVar = c.this.f429b;
                if (bVar != null) {
                    bVar.getClass();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                b bVar = c.this.f429b;
                if (bVar != null) {
                    d dVar = (d) bVar;
                    dVar.f = null;
                    dVar.f436g = null;
                    dVar.f437h = null;
                    b bVar2 = dVar.f434d;
                    bVar2.getClass();
                    bVar2.f427b = new WeakReference<>(null);
                }
                c.this.c();
            }
        }

        public interface b {
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }
    }

    public static class d implements g, c.b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f431a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaBrowser f432b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f433c;

        /* renamed from: d, reason: collision with root package name */
        public final b f434d = new b(this);

        /* renamed from: e, reason: collision with root package name */
        public final r.b<String, i> f435e = new r.b<>();
        public h f;

        /* renamed from: g, reason: collision with root package name */
        public Messenger f436g;

        /* renamed from: h, reason: collision with root package name */
        public MediaSessionCompat.Token f437h;

        public d(Context context, ComponentName componentName, c cVar) {
            this.f431a = context;
            Bundle bundle = new Bundle();
            this.f433c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            cVar.f429b = this;
            this.f432b = new MediaBrowser(context, componentName, cVar.f428a, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void c(Messenger messenger, String str, Bundle bundle) {
            if (this.f436g != messenger) {
                return;
            }
            i orDefault = this.f435e.getOrDefault(str, null);
            if (orDefault == null) {
                if (MediaBrowserCompat.f422b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            for (int i10 = 0; i10 < orDefault.f441b.size(); i10++) {
                if (m0.h((Bundle) orDefault.f441b.get(i10), bundle)) {
                    return;
                }
            }
        }
    }

    public static class e extends d {
        public e(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }
    }

    public static class f extends e {
        public f(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }
    }

    public interface g {
        void a();

        void b();

        void c(Messenger messenger, String str, Bundle bundle);
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public Messenger f438a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f439b;

        public h(IBinder iBinder, Bundle bundle) {
            this.f438a = new Messenger(iBinder);
            this.f439b = bundle;
        }

        public final void a(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f438a.send(obtain);
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f440a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f441b = new ArrayList();
    }

    public static abstract class j {

        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                j.this.getClass();
                j jVar = j.this;
                MediaItem.a(list);
                jVar.getClass();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str) {
                j.this.getClass();
            }
        }

        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                MediaItem.a(list);
                jVar.getClass();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j.this.getClass();
            }
        }

        public j() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new b();
            } else {
                new a();
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar) {
        this.f423a = Build.VERSION.SDK_INT >= 26 ? new f(context, componentName, cVar) : new e(context, componentName, cVar);
    }

    public final void a() {
        Messenger messenger;
        e eVar = this.f423a;
        h hVar = eVar.f;
        if (hVar != null && (messenger = eVar.f436g) != null) {
            try {
                hVar.a(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        eVar.f432b.disconnect();
    }
}
