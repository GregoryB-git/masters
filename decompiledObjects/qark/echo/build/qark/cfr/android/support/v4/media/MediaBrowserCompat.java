/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.ComponentName
 *  android.content.Context
 *  android.media.browse.MediaBrowser
 *  android.media.browse.MediaBrowser$ConnectionCallback
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Token
 *  android.os.BadParcelableException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.List
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
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
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserCompat {
    public static final boolean b = Log.isLoggable((String)"MediaBrowserCompat", (int)3);
    public final c a;

    /*
     * Enabled aggressive block sorting
     */
    public MediaBrowserCompat(Context object, ComponentName componentName, b b8, Bundle bundle) {
        object = Build.VERSION.SDK_INT >= 26 ? new f((Context)object, componentName, b8, bundle) : new e((Context)object, componentName, b8, bundle);
        this.a = object;
    }

    public void a() {
        Log.d((String)"MediaBrowserCompat", (String)"Connecting to a MediaBrowserService.");
        this.a.a();
    }

    public void b() {
        this.a.c();
    }

    public MediaSessionCompat.Token c() {
        return this.a.b();
    }

    public static class CustomActionResultReceiver
    extends b.b {
        @Override
        public void a(int n8, Bundle bundle) {
        }
    }

    public static class ItemReceiver
    extends b.b {
        @Override
        public void a(int n8, Bundle object) {
            Bundle bundle = object;
            if (object != null) {
                bundle = MediaSessionCompat.u((Bundle)object);
            }
            if (n8 == 0 && bundle != null && bundle.containsKey("media_item")) {
                object = bundle.getParcelable("media_item");
                if (object != null && !(object instanceof MediaItem)) {
                    throw null;
                }
                object = (MediaItem)object;
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static class MediaItem
    implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator(){

            public MediaItem a(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] b(int n8) {
                return new MediaItem[n8];
            }
        };
        public final int o;
        public final MediaDescriptionCompat p;

        public MediaItem(Parcel parcel) {
            this.o = parcel.readInt();
            this.p = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty((CharSequence)mediaDescriptionCompat.g())) {
                    this.o = n8;
                    this.p = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.o);
            stringBuilder.append(", mDescription=");
            stringBuilder.append((Object)this.p);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.o);
            this.p.writeToParcel(parcel, n8);
        }

    }

    public static class SearchResultReceiver
    extends b.b {
        @Override
        public void a(int n8, Bundle arrayList) {
            ArrayList arrayList2 = arrayList;
            if (arrayList != null) {
                arrayList2 = MediaSessionCompat.u((Bundle)arrayList);
            }
            if (n8 == 0 && arrayList2 != null && arrayList2.containsKey("search_results")) {
                arrayList = arrayList2.getParcelableArray("search_results");
                arrayList.getClass();
                arrayList2 = new ArrayList(arrayList.length);
                int n9 = arrayList.length;
                for (n8 = 0; n8 < n9; ++n8) {
                    arrayList2.add((Object)((MediaItem)arrayList[n8]));
                }
                throw null;
            }
            throw null;
        }
    }

    public static class a
    extends Handler {
        public final WeakReference a;
        public WeakReference b;

        public a(g g8) {
            this.a = new WeakReference((Object)g8);
        }

        public void a(Messenger messenger) {
            this.b = new WeakReference((Object)messenger);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void handleMessage(Message message) {
            Object object = this.b;
            if (object != null && object.get() != null) {
                if (this.a.get() == null) {
                    return;
                }
                Bundle bundle = message.getData();
                MediaSessionCompat.a(bundle);
                object = (g)this.a.get();
                Messenger messenger = (Messenger)this.b.get();
                try {
                    int n8 = message.what;
                    if (n8 == 1) {
                        Bundle bundle2 = bundle.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle2);
                        object.e(messenger, bundle.getString("data_media_item_id"), (MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle2);
                        return;
                    }
                    if (n8 == 2) {
                        object.d(messenger);
                        return;
                    }
                    if (n8 != 3) {
                        bundle = new StringBuilder();
                        bundle.append("Unhandled message: ");
                        bundle.append((Object)message);
                        bundle.append("\n  Client version: ");
                        bundle.append(1);
                        bundle.append("\n  Service version: ");
                        bundle.append(message.arg1);
                        Log.w((String)"MediaBrowserCompat", (String)bundle.toString());
                        return;
                    }
                    Bundle bundle3 = bundle.getBundle("data_options");
                    MediaSessionCompat.a(bundle3);
                    Bundle bundle4 = bundle.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle4);
                    object.h(messenger, bundle.getString("data_media_item_id"), (List)bundle.getParcelableArrayList("data_media_item_list"), bundle3, bundle4);
                    return;
                }
                catch (BadParcelableException badParcelableException) {}
                Log.e((String)"MediaBrowserCompat", (String)"Could not unparcel the data.");
                if (message.what == 1) {
                    object.d(messenger);
                }
            }
        }
    }

    public static abstract class android.support.v4.media.MediaBrowserCompat$b {
        public final MediaBrowser.ConnectionCallback a;
        public b b;

        public android.support.v4.media.MediaBrowserCompat$b() {
            this.a = new a();
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public void d(b b8) {
            this.b = b8;
        }

        public class a
        extends MediaBrowser.ConnectionCallback {
            public void onConnected() {
                b b8 = b.this.b;
                if (b8 != null) {
                    b8.f();
                }
                b.this.a();
            }

            public void onConnectionFailed() {
                b b8 = b.this.b;
                if (b8 != null) {
                    b8.g();
                }
                b.this.b();
            }

            public void onConnectionSuspended() {
                b b8 = b.this.b;
                if (b8 != null) {
                    b8.i();
                }
                b.this.c();
            }
        }

        public static interface b {
            public void f();

            public void g();

            public void i();
        }

    }

    public static interface c {
        public void a();

        public MediaSessionCompat.Token b();

        public void c();
    }

    public static abstract class d
    implements c,
    g,
    b.b {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final a d;
        public final t.a e;
        public int f;
        public h g;
        public Messenger h;
        public MediaSessionCompat.Token i;

        public d(Context context, ComponentName componentName, b b8, Bundle bundle) {
            this.d = new a(this);
            this.e = new t.a();
            this.a = context;
            bundle = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            b8.d(this);
            this.b = new MediaBrowser(context, componentName, b8.a, bundle);
        }

        @Override
        public void a() {
            this.b.connect();
        }

        @Override
        public MediaSessionCompat.Token b() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a((Object)this.b.getSessionToken());
            }
            return this.i;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void c() {
            block3 : {
                Messenger messenger;
                h h8 = this.g;
                if (h8 != null && (messenger = this.h) != null) {
                    try {
                        h8.c(messenger);
                        break block3;
                    }
                    catch (RemoteException remoteException) {}
                    Log.i((String)"MediaBrowserCompat", (String)"Remote error unregistering client messenger.");
                }
            }
            this.b.disconnect();
        }

        @Override
        public void d(Messenger messenger) {
        }

        @Override
        public void e(Messenger messenger, String string2, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public void f() {
            Object object;
            block6 : {
                block5 : {
                    try {
                        object = this.b.getExtras();
                        if (object != null) break block5;
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        Log.e((String)"MediaBrowserCompat", (String)"Unexpected IllegalStateException", (Throwable)illegalStateException);
                        return;
                    }
                }
                this.f = object.getInt("extra_service_version", 0);
                IBinder iBinder = w.d.a((Bundle)object, "extra_messenger");
                if (iBinder != null) {
                    this.g = new h(iBinder, this.c);
                    iBinder = new Messenger((Handler)this.d);
                    this.h = iBinder;
                    this.d.a((Messenger)iBinder);
                    this.g.a(this.a, this.h);
                }
                break block6;
                catch (RemoteException remoteException) {}
                Log.i((String)"MediaBrowserCompat", (String)"Remote error registering client messenger.");
            }
            if ((object = b.a.n(w.d.a((Bundle)object, "extra_session_binder"))) == null) return;
            this.i = MediaSessionCompat.Token.b((Object)this.b.getSessionToken(), (android.support.v4.media.session.b)object);
        }

        @Override
        public void g() {
        }

        @Override
        public void h(Messenger messenger, String string2, List list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            android.support.v4.media.a.a(this.e.get(string2));
            if (MediaBrowserCompat.b) {
                messenger = new StringBuilder();
                messenger.append("onLoadChildren for id that isn't subscribed id=");
                messenger.append(string2);
                Log.d((String)"MediaBrowserCompat", (String)messenger.toString());
            }
        }

        @Override
        public void i() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }
    }

    public static class e
    extends d {
        public e(Context context, ComponentName componentName, b b8, Bundle bundle) {
            super(context, componentName, b8, bundle);
        }
    }

    public static class f
    extends e {
        public f(Context context, ComponentName componentName, b b8, Bundle bundle) {
            super(context, componentName, b8, bundle);
        }
    }

    public static interface g {
        public void d(Messenger var1);

        public void e(Messenger var1, String var2, MediaSessionCompat.Token var3, Bundle var4);

        public void h(Messenger var1, String var2, List var3, Bundle var4, Bundle var5);
    }

    public static class h {
        public Messenger a;
        public Bundle b;

        public h(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        public void a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            this.b(6, bundle, messenger);
        }

        public final void b(int n8, Bundle bundle, Messenger messenger) {
            Message message = Message.obtain();
            message.what = n8;
            message.arg1 = 1;
            message.setData(bundle);
            message.replyTo = messenger;
            this.a.send(message);
        }

        public void c(Messenger messenger) {
            this.b(7, null, messenger);
        }
    }

}

