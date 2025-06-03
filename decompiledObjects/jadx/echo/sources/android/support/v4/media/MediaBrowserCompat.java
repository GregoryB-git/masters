package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
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
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import b.C0784b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import t.C1958a;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8142b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final c f8143a;

    public static class CustomActionResultReceiver extends C0784b {
        @Override // b.C0784b
        public void a(int i7, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends C0784b {
        @Override // b.C0784b
        public void a(int i7, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i7 != 0) {
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

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public final int f8144o;

        /* renamed from: p, reason: collision with root package name */
        public final MediaDescriptionCompat f8145p;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i7) {
                return new MediaItem[i7];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f8144o = parcel.readInt();
            this.f8145p = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f8144o + ", mDescription=" + this.f8145p + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f8144o);
            this.f8145p.writeToParcel(parcel, i7);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.g())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f8144o = i7;
            this.f8145p = mediaDescriptionCompat;
        }
    }

    public static class SearchResultReceiver extends C0784b {
        @Override // b.C0784b
        public void a(int i7, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i7 != 0) {
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

    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f8146a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f8147b;

        public a(g gVar) {
            this.f8146a = new WeakReference(gVar);
        }

        public void a(Messenger messenger) {
            this.f8147b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f8147b;
            if (weakReference == null || weakReference.get() == null || this.f8146a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = (g) this.f8146a.get();
            Messenger messenger = (Messenger) this.f8147b.get();
            try {
                int i7 = message.what;
                if (i7 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    gVar.e(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i7 == 2) {
                    gVar.d(messenger);
                } else if (i7 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    gVar.h(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    gVar.d(messenger);
                }
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowser.ConnectionCallback f8148a = new a();

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0143b f8149b;

        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC0143b interfaceC0143b = b.this.f8149b;
                if (interfaceC0143b != null) {
                    interfaceC0143b.f();
                }
                b.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC0143b interfaceC0143b = b.this.f8149b;
                if (interfaceC0143b != null) {
                    interfaceC0143b.g();
                }
                b.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC0143b interfaceC0143b = b.this.f8149b;
                if (interfaceC0143b != null) {
                    interfaceC0143b.i();
                }
                b.this.c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        public interface InterfaceC0143b {
            void f();

            void g();

            void i();
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public void d(InterfaceC0143b interfaceC0143b) {
            this.f8149b = interfaceC0143b;
        }
    }

    public interface c {
        void a();

        MediaSessionCompat.Token b();

        void c();
    }

    public static class d implements c, g, b.InterfaceC0143b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f8151a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaBrowser f8152b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f8153c;

        /* renamed from: d, reason: collision with root package name */
        public final a f8154d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        public final C1958a f8155e = new C1958a();

        /* renamed from: f, reason: collision with root package name */
        public int f8156f;

        /* renamed from: g, reason: collision with root package name */
        public h f8157g;

        /* renamed from: h, reason: collision with root package name */
        public Messenger f8158h;

        /* renamed from: i, reason: collision with root package name */
        public MediaSessionCompat.Token f8159i;

        public d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f8151a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f8153c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.d(this);
            this.f8152b = new MediaBrowser(context, componentName, bVar.f8148a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            this.f8152b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public MediaSessionCompat.Token b() {
            if (this.f8159i == null) {
                this.f8159i = MediaSessionCompat.Token.a(this.f8152b.getSessionToken());
            }
            return this.f8159i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            Messenger messenger;
            h hVar = this.f8157g;
            if (hVar != null && (messenger = this.f8158h) != null) {
                try {
                    hVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f8152b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void d(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void e(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0143b
        public void f() {
            try {
                Bundle extras = this.f8152b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f8156f = extras.getInt("extra_service_version", 0);
                IBinder a7 = w.d.a(extras, "extra_messenger");
                if (a7 != null) {
                    this.f8157g = new h(a7, this.f8153c);
                    Messenger messenger = new Messenger(this.f8154d);
                    this.f8158h = messenger;
                    this.f8154d.a(messenger);
                    try {
                        this.f8157g.a(this.f8151a, this.f8158h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b n7 = b.a.n(w.d.a(extras, "extra_session_binder"));
                if (n7 != null) {
                    this.f8159i = MediaSessionCompat.Token.b(this.f8152b.getSessionToken(), n7);
                }
            } catch (IllegalStateException e7) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e7);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0143b
        public void g() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f8158h != messenger) {
                return;
            }
            android.support.v4.media.a.a(this.f8155e.get(str));
            if (MediaBrowserCompat.f8142b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0143b
        public void i() {
            this.f8157g = null;
            this.f8158h = null;
            this.f8159i = null;
            this.f8154d.a(null);
        }
    }

    public static class e extends d {
        public e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public static class f extends e {
        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public interface g {
        void d(Messenger messenger);

        void e(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public Messenger f8160a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f8161b;

        public h(IBinder iBinder, Bundle bundle) {
            this.f8160a = new Messenger(iBinder);
            this.f8161b = bundle;
        }

        public void a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f8161b);
            b(6, bundle, messenger);
        }

        public final void b(int i7, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i7;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f8160a.send(obtain);
        }

        public void c(Messenger messenger) {
            b(7, null, messenger);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.f8143a = Build.VERSION.SDK_INT >= 26 ? new f(context, componentName, bVar, bundle) : new e(context, componentName, bVar, bundle);
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f8143a.a();
    }

    public void b() {
        this.f8143a.c();
    }

    public MediaSessionCompat.Token c() {
        return this.f8143a.b();
    }
}
