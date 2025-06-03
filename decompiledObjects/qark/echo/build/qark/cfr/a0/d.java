/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.media.browse.MediaBrowser
 *  android.media.browse.MediaBrowser$MediaItem
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Token
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 *  android.service.media.MediaBrowserService
 *  android.service.media.MediaBrowserService$BrowserRoot
 *  android.service.media.MediaBrowserService$Result
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package a0;

import a0.c;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t.a;

public abstract class d
extends Service {
    public static final boolean w = Log.isLoggable((String)"MBServiceCompat", (int)3);
    public g o;
    public final n p;
    public final f q;
    public final ArrayList r;
    public final a s;
    public f t;
    public final q u;
    public MediaSessionCompat.Token v;

    public d() {
        this.p = new n();
        this.q = new f("android.media.session.MediaController", -1, -1, null, null);
        this.r = new ArrayList();
        this.s = new a();
        this.u = new q(this);
    }

    public void a(String string2, f f8, IBinder iBinder, Bundle bundle) {
        List list;
        List list2 = list = (List)f8.g.get((Object)string2);
        if (list == null) {
            list2 = new ArrayList();
        }
        for (H.d d8 : list2) {
            if (iBinder != d8.a || !c.a(bundle, (Bundle)d8.b)) continue;
            return;
        }
        list2.add((Object)new H.d((Object)iBinder, (Object)bundle));
        f8.g.put((Object)string2, (Object)list2);
        this.o(string2, f8, bundle, null);
        this.t = f8;
        this.l(string2, bundle);
        this.t = null;
    }

    public List b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int n8 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int n9 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (n8 == -1 && n9 == -1) {
            return list;
        }
        int n10 = n9 * n8;
        int n11 = n10 + n9;
        if (n8 >= 0 && n9 >= 1 && n10 < list.size()) {
            n8 = n11;
            if (n11 > list.size()) {
                n8 = list.size();
            }
            return list.subList(n10, n8);
        }
        return Collections.emptyList();
    }

    public void c(Message message) {
        Bundle bundle = message.getData();
        switch (message.what) {
            default: {
                bundle = new StringBuilder();
                bundle.append("Unhandled message: ");
                bundle.append((Object)message);
                bundle.append("\n  Service version: ");
                bundle.append(2);
                bundle.append("\n  Client version: ");
                bundle.append(message.arg1);
                Log.w((String)"MBServiceCompat", (String)bundle.toString());
                return;
            }
            case 9: {
                Bundle bundle2 = bundle.getBundle("data_custom_action_extras");
                MediaSessionCompat.a(bundle2);
                this.p.h(bundle.getString("data_custom_action"), bundle2, (b.b)bundle.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 8: {
                Bundle bundle3 = bundle.getBundle("data_search_extras");
                MediaSessionCompat.a(bundle3);
                this.p.g(bundle.getString("data_search_query"), bundle3, (b.b)bundle.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 7: {
                this.p.i(new p(message.replyTo));
                return;
            }
            case 6: {
                Bundle bundle4 = bundle.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle4);
                this.p.e(new p(message.replyTo), bundle.getString("data_package_name"), bundle.getInt("data_calling_pid"), bundle.getInt("data_calling_uid"), bundle4);
                return;
            }
            case 5: {
                this.p.d(bundle.getString("data_media_item_id"), (b.b)bundle.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 4: {
                this.p.f(bundle.getString("data_media_item_id"), w.d.a(bundle, "data_callback_token"), new p(message.replyTo));
                return;
            }
            case 3: {
                Bundle bundle5 = bundle.getBundle("data_options");
                MediaSessionCompat.a(bundle5);
                this.p.a(bundle.getString("data_media_item_id"), w.d.a(bundle, "data_callback_token"), bundle5, new p(message.replyTo));
                return;
            }
            case 2: {
                this.p.c(new p(message.replyTo));
                return;
            }
            case 1: 
        }
        Bundle bundle6 = bundle.getBundle("data_root_hints");
        MediaSessionCompat.a(bundle6);
        this.p.b(bundle.getString("data_package_name"), bundle.getInt("data_calling_pid"), bundle.getInt("data_calling_uid"), bundle6, new p(message.replyTo));
    }

    public boolean d(String string2, int n8) {
        if (string2 == null) {
            return false;
        }
        String[] arrstring = this.getPackageManager().getPackagesForUid(n8);
        int n9 = arrstring.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (!arrstring[n8].equals((Object)string2)) continue;
            return true;
        }
        return false;
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
    }

    public void e(String string2, Bundle bundle) {
        if (string2 != null) {
            if (bundle != null) {
                this.o.c(string2, bundle);
                return;
            }
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void f(String string2, Bundle bundle, l l8) {
        l8.f(null);
    }

    public abstract e g(String var1, int var2, Bundle var3);

    public abstract void h(String var1, l var2);

    public abstract void i(String var1, l var2, Bundle var3);

    public abstract void j(String var1, l var2);

    public abstract void k(String var1, Bundle var2, l var3);

    public void l(String string2, Bundle bundle) {
    }

    public void m(String string2) {
    }

    public void n(String string2, Bundle bundle, f f8, b.b object) {
        object = new l(string2, (b.b)object){
            public final /* synthetic */ b.b f;
            {
                this.f = b8;
                super(object);
            }

            @Override
            public void d(Bundle bundle) {
                this.f.b(-1, bundle);
            }

            public void h(Bundle bundle) {
                this.f.b(0, bundle);
            }
        };
        this.t = f8;
        this.f(string2, bundle, (l)object);
        this.t = null;
        if (object.c()) {
            return;
        }
        f8 = new StringBuilder();
        f8.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        f8.append(string2);
        f8.append(" extras=");
        f8.append((Object)bundle);
        throw new IllegalStateException(f8.toString());
    }

    public void o(final String string2, final f f8, final Bundle bundle, Bundle object) {
        object = new l(string2, (Bundle)object){
            public final /* synthetic */ Bundle i;
            {
                this.i = bundle2;
                super(object);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void h(List list) {
                if (d.this.s.get((Object)f8.f.asBinder()) != f8) {
                    if (d.w) {
                        list = new StringBuilder();
                        list.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        list.append(f8.a);
                        list.append(" id=");
                        list.append(string2);
                        Log.d((String)"MBServiceCompat", (String)list.toString());
                    }
                    return;
                }
                List list2 = list;
                if ((this.b() & 1) != 0) {
                    list2 = d.this.b(list, bundle);
                }
                try {
                    f8.f.c(string2, list2, bundle, this.i);
                    return;
                }
                catch (RemoteException remoteException) {}
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Calling onLoadChildren() failed for id=");
                stringBuilder.append(string2);
                stringBuilder.append(" package=");
                stringBuilder.append(f8.a);
                Log.w((String)"MBServiceCompat", (String)stringBuilder.toString());
            }
        };
        this.t = f8;
        if (bundle == null) {
            this.h(string2, (l)object);
        } else {
            this.i(string2, (l)object, bundle);
        }
        this.t = null;
        if (object.c()) {
            return;
        }
        bundle = new StringBuilder();
        bundle.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        bundle.append(f8.a);
        bundle.append(" id=");
        bundle.append(string2);
        throw new IllegalStateException(bundle.toString());
    }

    public IBinder onBind(Intent intent) {
        return this.o.b(intent);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onCreate() {
        void var2_3;
        super.onCreate();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 28) {
            k k8 = new k();
        } else if (n8 >= 26) {
            j j8 = new j();
        } else {
            i i8 = new i();
        }
        this.o = var2_3;
        this.o.a();
    }

    public void onDestroy() {
        this.u.b();
    }

    public void p(String string2, f f8, b.b object) {
        object = new l(string2, (b.b)object){
            public final /* synthetic */ b.b f;
            {
                this.f = b8;
                super(object);
            }

            public void h(MediaBrowserCompat.MediaItem mediaItem) {
                if ((this.b() & 2) != 0) {
                    this.f.b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (Parcelable)mediaItem);
                this.f.b(0, bundle);
            }
        };
        this.t = f8;
        this.j(string2, (l)object);
        this.t = null;
        if (object.c()) {
            return;
        }
        f8 = new StringBuilder();
        f8.append("onLoadItem must call detach() or sendResult() before returning for id=");
        f8.append(string2);
        throw new IllegalStateException(f8.toString());
    }

    public void q(String string2, Bundle bundle, f f8, b.b object) {
        object = new l(string2, (b.b)object){
            public final /* synthetic */ b.b f;
            {
                this.f = b8;
                super(object);
            }

            public void h(List list) {
                if ((this.b() & 4) == 0 && list != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("search_results", (Parcelable[])list.toArray((Object[])new MediaBrowserCompat.MediaItem[0]));
                    this.f.b(0, bundle);
                    return;
                }
                this.f.b(-1, null);
            }
        };
        this.t = f8;
        this.k(string2, bundle, (l)object);
        this.t = null;
        if (object.c()) {
            return;
        }
        bundle = new StringBuilder();
        bundle.append("onSearch must call detach() or sendResult() before returning for query=");
        bundle.append(string2);
        throw new IllegalStateException(bundle.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean r(String var1_1, f var2_2, IBinder var3_3) {
        block7 : {
            block6 : {
                var5_5 = false;
                var4_6 = false;
                if (var3_3 != null) ** GOTO lbl9
                try {
                    var3_3 = var2_2.g.remove((Object)var1_1);
                    if (var3_3 != null) {
                        var4_6 = true;
                    }
                    break block6;
lbl9: // 1 sources:
                    var6_7 = (List)var2_2.g.get((Object)var1_1);
                    if (var6_7 == null) break block6;
                    var7_8 = var6_7.iterator();
                    while (var7_8.hasNext()) {
                        if (var3_3 != ((H.d)var7_8.next()).a) continue;
                        var7_8.remove();
                        var5_5 = true;
                    }
                }
                catch (Throwable var3_4) {
                    break block7;
                }
                var4_6 = var5_5;
                if (var6_7.size() == 0) {
                    var2_2.g.remove((Object)var1_1);
                    var4_6 = var5_5;
                }
            }
            this.t = var2_2;
            this.m(var1_1);
            this.t = null;
            return var4_6;
        }
        this.t = var2_2;
        this.m(var1_1);
        this.t = null;
        throw var3_4;
    }

    public void s(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.v == null) {
                this.v = token;
                this.o.d(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    public static final class e {
        public final String a;
        public final Bundle b;

        public e(String string2, Bundle bundle) {
            if (string2 != null) {
                this.a = string2;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    public class f
    implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final a0.f d;
        public final Bundle e;
        public final o f;
        public final HashMap g;
        public e h;

        public f(String string2, int n8, int n9, Bundle bundle, o o8) {
            this.g = new HashMap();
            this.a = string2;
            this.b = n8;
            this.c = n9;
            this.d = new a0.f(string2, n8, n9);
            this.e = bundle;
            this.f = o8;
        }

        public void binderDied() {
            d.this.u.post(new Runnable(){

                public void run() {
                    f f8 = f.this;
                    f8.d.this.s.remove((Object)f8.f.asBinder());
                }
            });
        }

    }

    public static interface g {
        public void a();

        public IBinder b(Intent var1);

        public void c(String var1, Bundle var2);

        public void d(MediaSessionCompat.Token var1);
    }

    public abstract class h
    implements g {
        public final List a;
        public MediaBrowserService b;
        public Messenger c;

        public h() {
            this.a = new ArrayList();
        }

        @Override
        public IBinder b(Intent intent) {
            return this.b.onBind(intent);
        }

        @Override
        public void c(String string2, Bundle bundle) {
            this.g(string2, bundle);
            this.e(string2, bundle);
        }

        @Override
        public void d(final MediaSessionCompat.Token token) {
            d.this.u.a(new Runnable(){

                public void run() {
                    h.this.j(token);
                }
            });
        }

        public void e(final String string2, final Bundle bundle) {
            d.this.u.post(new Runnable(){

                public void run() {
                    Iterator iterator = d.this.s.keySet().iterator();
                    while (iterator.hasNext()) {
                        Object object = (IBinder)iterator.next();
                        object = (f)d.this.s.get(object);
                        h.this.f((f)object, string2, bundle);
                    }
                }
            });
        }

        public void f(f f8, String string2, Bundle bundle) {
            List list = (List)f8.g.get((Object)string2);
            if (list != null) {
                for (H.d d8 : list) {
                    if (!c.b(bundle, (Bundle)d8.b)) continue;
                    d.this.o(string2, f8, (Bundle)d8.b, bundle);
                }
            }
        }

        public void g(String string2, Bundle bundle) {
            this.b.notifyChildrenChanged(string2);
        }

        public e h(String object, int n8, Bundle object2) {
            f f8;
            Object object3;
            int n9 = -1;
            if (object2 != null && object2.getInt("extra_client_version", 0) != 0) {
                object2.remove("extra_client_version");
                this.c = new Messenger((Handler)d.this.u);
                f8 = new Bundle();
                f8.putInt("extra_service_version", 2);
                w.d.b((Bundle)f8, "extra_messenger", this.c.getBinder());
                object3 = d.this.v;
                if (object3 != null) {
                    object3 = (object3 = object3.c()) == null ? null : object3.asBinder();
                    w.d.b((Bundle)f8, "extra_session_binder", (IBinder)object3);
                } else {
                    this.a.add((Object)f8);
                }
                n9 = object2.getInt("extra_calling_pid", -1);
                object2.remove("extra_calling_pid");
                object3 = f8;
            } else {
                object3 = null;
            }
            f8 = new f((String)object, n9, n8, (Bundle)object2, null);
            a0.d d8 = d.this;
            d8.t = f8;
            object2 = d8.g((String)object, n8, (Bundle)object2);
            object = d.this;
            object.t = null;
            if (object2 == null) {
                return null;
            }
            if (this.c != null) {
                object.r.add((Object)f8);
            }
            if (object3 == null) {
                object = object2.c();
            } else {
                object = object3;
                if (object2.c() != null) {
                    object3.putAll(object2.c());
                    object = object3;
                }
            }
            return new e(object2.d(), (Bundle)object);
        }

        public void i(String string2, m object) {
            object = new l(string2, (m)object){
                public final /* synthetic */ m f;
                {
                    this.f = m8;
                    super(object);
                }

                @Override
                public void a() {
                    this.f.a();
                }

                public void h(List list) {
                    if (list == null) {
                        list = Build.VERSION.SDK_INT >= 24 ? null : Collections.emptyList();
                    } else {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel parcel = Parcel.obtain();
                            mediaItem.writeToParcel(parcel, 0);
                            arrayList.add((Object)parcel);
                        }
                        list = arrayList;
                    }
                    this.f.c((Object)list);
                }
            };
            a0.d d8 = d.this;
            d8.t = d8.q;
            d8.h(string2, (l)object);
            d.this.t = null;
        }

        public void j(MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                b b8 = token.c();
                if (b8 != null) {
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        w.d.b((Bundle)iterator.next(), "extra_session_binder", b8.asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession.Token)token.e());
        }

        public abstract class d
        extends MediaBrowserService {
            public d(Context context) {
                this.attachBaseContext(context);
            }

            public MediaBrowserService.BrowserRoot onGetRoot(String object, int n8, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                h h8 = h.this;
                bundle = bundle == null ? null : new Bundle(bundle);
                object = h8.h((String)object, n8, bundle);
                if (object == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(((e)object).a, ((e)object).b);
            }

            public void onLoadChildren(String string2, MediaBrowserService.Result result) {
                h.this.i(string2, new m(result));
            }
        }

    }

    public class i
    extends h {
        @Override
        public void a() {
            b b8 = new b((Context)d.this);
            this.b = b8;
            b8.onCreate();
        }

        public void k(String string2, m object) {
            object = new l(string2, (m)object){
                public final /* synthetic */ m f;
                {
                    this.f = m8;
                    super(object);
                }

                @Override
                public void a() {
                    this.f.a();
                }

                /*
                 * Enabled aggressive block sorting
                 */
                public void h(MediaBrowserCompat.MediaItem object) {
                    Object object2;
                    if (object == null) {
                        object2 = this.f;
                        object = null;
                    } else {
                        object2 = Parcel.obtain();
                        object.writeToParcel((Parcel)object2, 0);
                        m m8 = this.f;
                        object = object2;
                        object2 = m8;
                    }
                    object2.c(object);
                }
            };
            d d8 = d.this;
            d8.t = d8.q;
            d8.j(string2, (l)object);
            d.this.t = null;
        }

        public class b
        extends h.d {
            public b(Context context) {
                super(context);
            }

            public void onLoadItem(String string2, MediaBrowserService.Result result) {
                i.this.k(string2, new m(result));
            }
        }

    }

    public class j
    extends i {
        @Override
        public void a() {
            b b8 = new b((Context)d.this);
            this.b = b8;
            b8.onCreate();
        }

        @Override
        public void g(String string2, Bundle bundle) {
            if (bundle != null) {
                a0.e.a(this.b, string2, bundle);
                return;
            }
            h.super.g(string2, bundle);
        }

        public void l(String string2, m object, Bundle bundle) {
            object = new l(string2, (m)object, bundle){
                public final /* synthetic */ m f;
                public final /* synthetic */ Bundle g;
                {
                    this.f = m8;
                    this.g = bundle;
                    super(object);
                }

                @Override
                public void a() {
                    this.f.a();
                }

                /*
                 * Enabled aggressive block sorting
                 */
                public void h(List list) {
                    Object object;
                    if (list == null) {
                        object = this.f;
                        list = null;
                    } else {
                        object = list;
                        if ((this.b() & 1) != 0) {
                            object = d.this.b(list, this.g);
                        }
                        list = new ArrayList(object.size());
                        object = object.iterator();
                        while (object.hasNext()) {
                            MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem)object.next();
                            Parcel parcel = Parcel.obtain();
                            mediaItem.writeToParcel(parcel, 0);
                            list.add((Object)parcel);
                        }
                        object = this.f;
                    }
                    object.c((Object)list);
                }
            };
            d d8 = d.this;
            d8.t = d8.q;
            d8.i(string2, (l)object, bundle);
            d.this.t = null;
        }

        public class b
        extends i.b {
            public b(Context context) {
                super(context);
            }

            public void onLoadChildren(String string2, MediaBrowserService.Result result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j j8 = j.this;
                d d8 = j8.d.this;
                d8.t = d8.q;
                j8.l(string2, new m(result), bundle);
                d.this.t = null;
            }
        }

    }

    public class k
    extends j {
    }

    public static abstract class l {
        public final Object a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;

        public l(Object object) {
            this.a = object;
        }

        public void a() {
            if (!this.b) {
                if (!this.c) {
                    if (!this.d) {
                        this.b = true;
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("detach() called when sendError() had already been called for: ");
                    stringBuilder.append(this.a);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("detach() called when sendResult() had already been called for: ");
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach() called when detach() had already been called for: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public int b() {
            return this.e;
        }

        public boolean c() {
            if (!(this.b || this.c || this.d)) {
                return false;
            }
            return true;
        }

        public void d(Bundle bundle) {
            bundle = new StringBuilder();
            bundle.append("It is not supported to send an error for ");
            bundle.append(this.a);
            throw new UnsupportedOperationException(bundle.toString());
        }

        public abstract void e(Object var1);

        public void f(Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                this.d(bundle);
                return;
            }
            bundle = new StringBuilder();
            bundle.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            bundle.append(this.a);
            throw new IllegalStateException(bundle.toString());
        }

        public void g(Object object) {
            if (!this.c && !this.d) {
                this.c = true;
                this.e(object);
                return;
            }
            object = new StringBuilder();
            object.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            object.append(this.a);
            throw new IllegalStateException(object.toString());
        }
    }

    public static class m {
        public MediaBrowserService.Result a;

        public m(MediaBrowserService.Result result) {
            this.a = result;
        }

        public void a() {
            this.a.detach();
        }

        public List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((Object)((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel)));
                parcel.recycle();
            }
            return arrayList;
        }

        public void c(Object object) {
            if (object instanceof List) {
                this.a.sendResult((Object)this.b((List)object));
                return;
            }
            if (object instanceof Parcel) {
                object = (Parcel)object;
                object.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel((Parcel)object));
                object.recycle();
                return;
            }
            this.a.sendResult((Object)null);
        }
    }

    public class n {
        public void a(final String string2, final IBinder iBinder, final Bundle bundle, final o o8) {
            d.this.u.a(new Runnable(){

                public void run() {
                    Object object = o8.asBinder();
                    if ((object = (f)d.this.s.get(object)) == null) {
                        object = new StringBuilder();
                        object.append("addSubscription for callback that isn't registered id=");
                        object.append(string2);
                        Log.w((String)"MBServiceCompat", (String)object.toString());
                        return;
                    }
                    d.this.a(string2, (f)object, iBinder, bundle);
                }
            });
        }

        public void b(final String string2, final int n8, final int n9, final Bundle bundle, final o o8) {
            if (d.this.d(string2, n9)) {
                d.this.u.a(new Runnable(){

                    /*
                     * Loose catch block
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Lifted jumps to return sites
                     */
                    public void run() {
                        IBinder iBinder = o8.asBinder();
                        d.this.s.remove((Object)iBinder);
                        f f8 = new f(string2, n8, n9, bundle, o8);
                        Object object = d.this;
                        object.t = f8;
                        f8.h = object = object.g(string2, n9, bundle);
                        d d8 = d.this;
                        d8.t = null;
                        if (object == null) {
                            iBinder = new StringBuilder();
                            iBinder.append("No root for client ");
                            iBinder.append(string2);
                            iBinder.append(" from service ");
                            iBinder.append(this.getClass().getName());
                            Log.i((String)"MBServiceCompat", (String)iBinder.toString());
                            o8.a();
                            return;
                        }
                        try {
                            d8.s.put((Object)iBinder, f8);
                            iBinder.linkToDeath((IBinder.DeathRecipient)f8, 0);
                            if (d.this.v == null) return;
                            o8.b(f8.h.d(), d.this.v, f8.h.c());
                            return;
                        }
                        catch (RemoteException remoteException) {}
                        catch (RemoteException remoteException) {}
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        stringBuilder.append(string2);
                        Log.w((String)"MBServiceCompat", (String)stringBuilder.toString());
                        return;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
                        stringBuilder2.append(string2);
                        Log.w((String)"MBServiceCompat", (String)stringBuilder2.toString());
                        d.this.s.remove((Object)iBinder);
                    }
                });
                return;
            }
            bundle = new StringBuilder();
            bundle.append("Package/uid mismatch: uid=");
            bundle.append(n9);
            bundle.append(" package=");
            bundle.append(string2);
            throw new IllegalArgumentException(bundle.toString());
        }

        public void c(final o o8) {
            d.this.u.a(new Runnable(){

                public void run() {
                    Object object = o8.asBinder();
                    if ((object = (f)d.this.s.remove(object)) != null) {
                        object.f.asBinder().unlinkToDeath((IBinder.DeathRecipient)object, 0);
                    }
                }
            });
        }

        public void d(final String string2, final b.b b8, final o o8) {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                if (b8 == null) {
                    return;
                }
                d.this.u.a(new Runnable(){

                    public void run() {
                        Object object = o8.asBinder();
                        if ((object = (f)d.this.s.get(object)) == null) {
                            object = new StringBuilder();
                            object.append("getMediaItem for callback that isn't registered id=");
                            object.append(string2);
                            Log.w((String)"MBServiceCompat", (String)object.toString());
                            return;
                        }
                        d.this.p(string2, (f)object, b8);
                    }
                });
            }
        }

        public void e(final o o8, final String string2, final int n8, final int n9, final Bundle bundle) {
            d.this.u.a(new Runnable(){

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public void run() {
                    f f8;
                    f f9;
                    IBinder iBinder;
                    block7 : {
                        Iterator iterator;
                        block9 : {
                            block8 : {
                                iBinder = o8.asBinder();
                                d.this.s.remove((Object)iBinder);
                                iterator = d.this.r.iterator();
                                do {
                                    boolean bl = iterator.hasNext();
                                    f8 = null;
                                    f9 = null;
                                    if (!bl) break block7;
                                    f f10 = (f)iterator.next();
                                } while (f10.c != n9);
                                if (TextUtils.isEmpty((CharSequence)string2)) break block8;
                                f8 = f9;
                                if (n8 > 0) break block9;
                            }
                            f8 = new f(f10.a, f10.b, f10.c, bundle, o8);
                        }
                        iterator.remove();
                    }
                    f9 = f8;
                    if (f8 == null) {
                        f9 = new f(string2, n8, n9, bundle, o8);
                    }
                    d.this.s.put((Object)iBinder, f9);
                    try {
                        iBinder.linkToDeath((IBinder.DeathRecipient)f9, 0);
                        return;
                    }
                    catch (RemoteException remoteException) {}
                    Log.w((String)"MBServiceCompat", (String)"IBinder is already dead.");
                }
            });
        }

        public void f(final String string2, final IBinder iBinder, final o o8) {
            d.this.u.a(new Runnable(){

                public void run() {
                    Object object = o8.asBinder();
                    if ((object = (f)d.this.s.get(object)) == null) {
                        object = new StringBuilder();
                        object.append("removeSubscription for callback that isn't registered id=");
                        object.append(string2);
                        Log.w((String)"MBServiceCompat", (String)object.toString());
                        return;
                    }
                    if (!d.this.r(string2, (f)object, iBinder)) {
                        object = new StringBuilder();
                        object.append("removeSubscription called for ");
                        object.append(string2);
                        object.append(" which is not subscribed");
                        Log.w((String)"MBServiceCompat", (String)object.toString());
                    }
                }
            });
        }

        public void g(final String string2, final Bundle bundle, final b.b b8, final o o8) {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                if (b8 == null) {
                    return;
                }
                d.this.u.a(new Runnable(){

                    public void run() {
                        Object object = o8.asBinder();
                        if ((object = (f)d.this.s.get(object)) == null) {
                            object = new StringBuilder();
                            object.append("search for callback that isn't registered query=");
                            object.append(string2);
                            Log.w((String)"MBServiceCompat", (String)object.toString());
                            return;
                        }
                        d.this.q(string2, bundle, (f)object, b8);
                    }
                });
            }
        }

        public void h(final String string2, final Bundle bundle, final b.b b8, final o o8) {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                if (b8 == null) {
                    return;
                }
                d.this.u.a(new Runnable(){

                    public void run() {
                        Object object = o8.asBinder();
                        if ((object = (f)d.this.s.get(object)) == null) {
                            object = new StringBuilder();
                            object.append("sendCustomAction for callback that isn't registered action=");
                            object.append(string2);
                            object.append(", extras=");
                            object.append((Object)bundle);
                            Log.w((String)"MBServiceCompat", (String)object.toString());
                            return;
                        }
                        d.this.n(string2, bundle, (f)object, b8);
                    }
                });
            }
        }

        public void i(final o o8) {
            d.this.u.a(new Runnable(){

                public void run() {
                    IBinder iBinder = o8.asBinder();
                    f f8 = (f)d.this.s.remove((Object)iBinder);
                    if (f8 != null) {
                        iBinder.unlinkToDeath((IBinder.DeathRecipient)f8, 0);
                    }
                }
            });
        }

    }

    public static interface o {
        public void a();

        public IBinder asBinder();

        public void b(String var1, MediaSessionCompat.Token var2, Bundle var3);

        public void c(String var1, List var2, Bundle var3, Bundle var4);
    }

    public static class p
    implements o {
        public final Messenger a;

        public p(Messenger messenger) {
            this.a = messenger;
        }

        @Override
        public void a() {
            this.d(2, null);
        }

        @Override
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override
        public void b(String string2, MediaSessionCompat.Token token, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt("extra_service_version", 2);
            bundle = new Bundle();
            bundle.putString("data_media_item_id", string2);
            bundle.putParcelable("data_media_session_token", (Parcelable)token);
            bundle.putBundle("data_root_hints", bundle2);
            this.d(1, bundle);
        }

        @Override
        public void c(String string2, List list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", string2);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                string2 = list instanceof ArrayList ? (ArrayList)list : new ArrayList((Collection)list);
                bundle3.putParcelableArrayList("data_media_item_list", (ArrayList)string2);
            }
            this.d(3, bundle3);
        }

        public final void d(int n8, Bundle bundle) {
            Message message = Message.obtain();
            message.what = n8;
            message.arg1 = 2;
            message.setData(bundle);
            this.a.send(message);
        }
    }

    public static final class q
    extends Handler {
        public d a;

        public q(d d8) {
            this.a = d8;
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == this.getLooper().getThread()) {
                runnable.run();
                return;
            }
            this.post(runnable);
        }

        public void b() {
            this.a = null;
        }

        public void handleMessage(Message message) {
            d d8 = this.a;
            if (d8 != null) {
                d8.c(message);
                return;
            }
            this.removeCallbacksAndMessages((Object)null);
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean sendMessageAtTime(Message message, long l8) {
            Bundle bundle = message.getData();
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            bundle.putInt("data_calling_uid", Binder.getCallingUid());
            int n8 = Binder.getCallingPid();
            if (n8 <= 0) {
                if (bundle.containsKey("data_calling_pid")) return super.sendMessageAtTime(message, l8);
                n8 = -1;
            }
            bundle.putInt("data_calling_pid", n8);
            return super.sendMessageAtTime(message, l8);
        }
    }

}

