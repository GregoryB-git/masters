// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.content.ContextWrapper;
import android.os.IInterface;
import android.os.BaseBundle;
import android.os.Binder;
import java.util.Collection;
import android.text.TextUtils;
import android.media.browse.MediaBrowser$MediaItem;
import android.service.media.MediaBrowserService$Result;
import android.service.media.MediaBrowserService$BrowserRoot;
import android.content.Context;
import android.media.session.MediaSession$Token;
import android.os.Parcel;
import android.os.Handler;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.HashMap;
import android.os.IBinder$DeathRecipient;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.os.Build$VERSION;
import android.content.Intent;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import b.b;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import android.os.IBinder;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.media.session.MediaSessionCompat;
import t.a;
import java.util.ArrayList;
import android.app.Service;

public abstract class d extends Service
{
    public static final boolean w;
    public g o;
    public final n p;
    public final f q;
    public final ArrayList r;
    public final a s;
    public f t;
    public final q u;
    public MediaSessionCompat.Token v;
    
    static {
        w = Log.isLoggable("MBServiceCompat", 3);
    }
    
    public d() {
        this.p = new n();
        this.q = new f("android.media.session.MediaController", -1, -1, null, null);
        this.r = new ArrayList();
        this.s = new a();
        this.u = new q(this);
    }
    
    public void a(final String s, final f t, final IBinder binder, final Bundle bundle) {
        List<H.d> value;
        if ((value = t.g.get(s)) == null) {
            value = new ArrayList<H.d>();
        }
        for (final H.d d : value) {
            if (binder == d.a && c.a(bundle, (Bundle)d.b)) {
                return;
            }
        }
        value.add(new H.d(binder, bundle));
        t.g.put(s, value);
        this.o(s, t, bundle, null);
        this.t = t;
        this.l(s, bundle);
        this.t = null;
    }
    
    public List b(final List list, final Bundle bundle) {
        if (list == null) {
            return null;
        }
        final int int1 = ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE", -1);
        final int int2 = ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (int1 == -1 && int2 == -1) {
            return list;
        }
        final int n = int2 * int1;
        final int n2 = n + int2;
        if (int1 >= 0 && int2 >= 1 && n < list.size()) {
            int size;
            if ((size = n2) > list.size()) {
                size = list.size();
            }
            return list.subList(n, size);
        }
        return Collections.emptyList();
    }
    
    public void c(final Message obj) {
        final Bundle data = obj.getData();
        switch (obj.what) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unhandled message: ");
                sb.append(obj);
                sb.append("\n  Service version: ");
                sb.append(2);
                sb.append("\n  Client version: ");
                sb.append(obj.arg1);
                Log.w("MBServiceCompat", sb.toString());
            }
            case 9: {
                final Bundle bundle = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.a(bundle);
                this.p.h(((BaseBundle)data).getString("data_custom_action"), bundle, (b)data.getParcelable("data_result_receiver"), new p(obj.replyTo));
            }
            case 8: {
                final Bundle bundle2 = data.getBundle("data_search_extras");
                MediaSessionCompat.a(bundle2);
                this.p.g(((BaseBundle)data).getString("data_search_query"), bundle2, (b)data.getParcelable("data_result_receiver"), new p(obj.replyTo));
            }
            case 7: {
                this.p.i(new p(obj.replyTo));
            }
            case 6: {
                final Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle3);
                this.p.e(new p(obj.replyTo), ((BaseBundle)data).getString("data_package_name"), ((BaseBundle)data).getInt("data_calling_pid"), ((BaseBundle)data).getInt("data_calling_uid"), bundle3);
            }
            case 5: {
                this.p.d(((BaseBundle)data).getString("data_media_item_id"), (b)data.getParcelable("data_result_receiver"), new p(obj.replyTo));
            }
            case 4: {
                this.p.f(((BaseBundle)data).getString("data_media_item_id"), w.d.a(data, "data_callback_token"), new p(obj.replyTo));
            }
            case 3: {
                final Bundle bundle4 = data.getBundle("data_options");
                MediaSessionCompat.a(bundle4);
                this.p.a(((BaseBundle)data).getString("data_media_item_id"), w.d.a(data, "data_callback_token"), bundle4, new p(obj.replyTo));
            }
            case 2: {
                this.p.c(new p(obj.replyTo));
            }
            case 1: {
                final Bundle bundle5 = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle5);
                this.p.b(((BaseBundle)data).getString("data_package_name"), ((BaseBundle)data).getInt("data_calling_pid"), ((BaseBundle)data).getInt("data_calling_uid"), bundle5, new p(obj.replyTo));
            }
        }
    }
    
    public boolean d(final String anObject, int i) {
        if (anObject == null) {
            return false;
        }
        final String[] packagesForUid = ((Context)this).getPackageManager().getPackagesForUid(i);
        int length;
        for (length = packagesForUid.length, i = 0; i < length; ++i) {
            if (packagesForUid[i].equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public void e(final String s, final Bundle bundle) {
        if (s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.o.c(s, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
    
    public void f(final String s, final Bundle bundle, final l l) {
        l.f(null);
    }
    
    public abstract e g(final String p0, final int p1, final Bundle p2);
    
    public abstract void h(final String p0, final l p1);
    
    public abstract void i(final String p0, final l p1, final Bundle p2);
    
    public abstract void j(final String p0, final l p1);
    
    public abstract void k(final String p0, final Bundle p1, final l p2);
    
    public void l(final String s, final Bundle bundle) {
    }
    
    public void m(final String s) {
    }
    
    public void n(final String str, final Bundle obj, final f t, final b b) {
        final l l = new l(str) {
            @Override
            public void d(final Bundle bundle) {
                b.b(-1, bundle);
            }
            
            public void h(final Bundle bundle) {
                b.b(0, bundle);
            }
        };
        this.t = t;
        this.f(str, obj, (l)l);
        this.t = null;
        if (((l)l).c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        sb.append(str);
        sb.append(" extras=");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    public void o(final String str, final f t, final Bundle bundle, final Bundle bundle2) {
        final l l = new l(str) {
            public void h(final List list) {
                if (d.this.s.get(t.f.asBinder()) != t) {
                    if (d.w) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        sb.append(t.a);
                        sb.append(" id=");
                        sb.append(str);
                        Log.d("MBServiceCompat", sb.toString());
                    }
                    return;
                }
                List b = list;
                if ((((l)this).b() & 0x1) != 0x0) {
                    b = d.this.b(list, bundle);
                }
                while (true) {
                    try {
                        t.f.c(str, b, bundle, bundle2);
                        return;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onLoadChildren() failed for id=");
                        sb2.append(str);
                        sb2.append(" package=");
                        sb2.append(t.a);
                        Log.w("MBServiceCompat", sb2.toString());
                    }
                    catch (RemoteException ex) {
                        continue;
                    }
                    break;
                }
            }
        };
        this.t = t;
        if (bundle == null) {
            this.h(str, (l)l);
        }
        else {
            this.i(str, (l)l, bundle);
        }
        this.t = null;
        if (((l)l).c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        sb.append(t.a);
        sb.append(" id=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    public IBinder onBind(final Intent intent) {
        return this.o.b(intent);
    }
    
    public void onCreate() {
        super.onCreate();
        final int sdk_INT = Build$VERSION.SDK_INT;
        h o;
        if (sdk_INT >= 28) {
            o = new k();
        }
        else if (sdk_INT >= 26) {
            o = new j();
        }
        else {
            o = new i();
        }
        (this.o = (g)o).a();
    }
    
    public void onDestroy() {
        this.u.b();
    }
    
    public void p(final String str, final f t, final b b) {
        final l l = new l(str) {
            public void h(final MediaBrowserCompat.MediaItem mediaItem) {
                if ((((l)this).b() & 0x2) != 0x0) {
                    b.b(-1, null);
                    return;
                }
                final Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (Parcelable)mediaItem);
                b.b(0, bundle);
            }
        };
        this.t = t;
        this.j(str, (l)l);
        this.t = null;
        if (((l)l).c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    public void q(final String str, final Bundle bundle, final f t, final b b) {
        final l l = new l(str) {
            public void h(final List list) {
                if ((((l)this).b() & 0x4) == 0x0 && list != null) {
                    final Bundle bundle = new Bundle();
                    bundle.putParcelableArray("search_results", (Parcelable[])list.toArray(new MediaBrowserCompat.MediaItem[0]));
                    b.b(0, bundle);
                    return;
                }
                b.b(-1, null);
            }
        };
        this.t = t;
        this.k(str, bundle, (l)l);
        this.t = null;
        if (((l)l).c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onSearch must call detach() or sendResult() before returning for query=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    public boolean r(final String key, final f f, final IBinder binder) {
        boolean b = false;
        boolean b2 = false;
        while (true) {
            Label_0048: {
                if (binder != null) {
                    break Label_0048;
                }
                Label_0145: {
                    try {
                        if (f.g.remove(key) != null) {
                            b2 = true;
                        }
                        this.t = f;
                        this.m(key);
                        this.t = null;
                        return b2;
                    }
                    finally {
                        break Label_0145;
                    }
                    break Label_0048;
                }
                this.t = f;
                this.m(key);
                this.t = null;
            }
            final List<H.d> list = f.g.get(key);
            if (list == null) {
                continue;
            }
            final Iterator<H.d> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (binder == iterator.next().a) {
                    iterator.remove();
                    b = true;
                }
            }
            b2 = b;
            if (list.size() == 0) {
                f.g.remove(key);
                b2 = b;
                continue;
            }
            continue;
        }
    }
    
    public void s(final MediaSessionCompat.Token v) {
        if (v == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.v == null) {
            this.v = v;
            this.o.d(v);
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
    
    public static final class e
    {
        public final String a;
        public final Bundle b;
        
        public e(final String a, final Bundle b) {
            if (a != null) {
                this.a = a;
                this.b = b;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        
        public static /* synthetic */ String a(final e e) {
            return e.a;
        }
        
        public static /* synthetic */ Bundle b(final e e) {
            return e.b;
        }
        
        public Bundle c() {
            return this.b;
        }
        
        public String d() {
            return this.a;
        }
    }
    
    public class f implements IBinder$DeathRecipient
    {
        public final String a;
        public final int b;
        public final int c;
        public final a0.f d;
        public final Bundle e;
        public final o f;
        public final HashMap g;
        public e h;
        public final /* synthetic */ d i;
        
        public f(final String a, final int b, final int c, final Bundle e, final o f) {
            this.g = new HashMap();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = new a0.f(a, b, c);
            this.e = e;
            this.f = f;
        }
        
        public void binderDied() {
            a0.d.this.u.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final f o = a0.d.f.this;
                    o.i.s.remove(o.f.asBinder());
                }
            });
        }
    }
    
    public interface g
    {
        void a();
        
        IBinder b(final Intent p0);
        
        void c(final String p0, final Bundle p1);
        
        void d(final MediaSessionCompat.Token p0);
    }
    
    public abstract class h implements g
    {
        public final List a;
        public MediaBrowserService b;
        public Messenger c;
        
        public h() {
            this.a = new ArrayList();
        }
        
        @Override
        public IBinder b(final Intent intent) {
            return this.b.onBind(intent);
        }
        
        @Override
        public void c(final String s, final Bundle bundle) {
            this.g(s, bundle);
            this.e(s, bundle);
        }
        
        @Override
        public void d(final MediaSessionCompat.Token token) {
            a0.d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    h.this.j(token);
                }
            });
        }
        
        public void e(final String s, final Bundle bundle) {
            a0.d.this.u.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final Iterator<IBinder> iterator = a0.d.this.s.keySet().iterator();
                    while (iterator.hasNext()) {
                        h.this.f((f)a0.d.this.s.get(iterator.next()), s, bundle);
                    }
                }
            });
        }
        
        public void f(final f f, final String key, final Bundle bundle) {
            final List<H.d> list = f.g.get(key);
            if (list != null) {
                for (final H.d d : list) {
                    if (a0.c.b(bundle, (Bundle)d.b)) {
                        a0.d.this.o(key, f, (Bundle)d.b, bundle);
                    }
                }
            }
        }
        
        public void g(final String s, final Bundle bundle) {
            this.b.notifyChildrenChanged(s);
        }
        
        public e h(final String s, final int n, final Bundle bundle) {
            int int1 = -1;
            Bundle bundle3;
            if (bundle != null && ((BaseBundle)bundle).getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.c = new Messenger((Handler)a0.d.this.u);
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putInt("extra_service_version", 2);
                w.d.b(bundle2, "extra_messenger", this.c.getBinder());
                final MediaSessionCompat.Token v = a0.d.this.v;
                if (v != null) {
                    final android.support.v4.media.session.b c = v.c();
                    IBinder binder;
                    if (c == null) {
                        binder = null;
                    }
                    else {
                        binder = ((IInterface)c).asBinder();
                    }
                    w.d.b(bundle2, "extra_session_binder", binder);
                }
                else {
                    this.a.add(bundle2);
                }
                int1 = ((BaseBundle)bundle).getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                bundle3 = bundle2;
            }
            else {
                bundle3 = null;
            }
            final f f = new f(s, int1, n, bundle, null);
            final a0.d d = a0.d.this;
            d.t = f;
            final e g = d.g(s, n, bundle);
            final a0.d d2 = a0.d.this;
            d2.t = null;
            if (g == null) {
                return null;
            }
            if (this.c != null) {
                d2.r.add(f);
            }
            Bundle c2;
            if (bundle3 == null) {
                c2 = g.c();
            }
            else {
                c2 = bundle3;
                if (g.c() != null) {
                    bundle3.putAll(g.c());
                    c2 = bundle3;
                }
            }
            return new e(g.d(), c2);
        }
        
        public void i(final String s, final m m) {
            final l l = new l(s) {
                @Override
                public void a() {
                    m.a();
                }
                
                public void h(List emptyList) {
                    if (emptyList == null) {
                        if (Build$VERSION.SDK_INT >= 24) {
                            emptyList = null;
                        }
                        else {
                            emptyList = Collections.emptyList();
                        }
                    }
                    else {
                        final ArrayList list = new ArrayList<MediaBrowserCompat.MediaItem>(emptyList.size());
                        for (final MediaBrowserCompat.MediaItem mediaItem : emptyList) {
                            final Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            list.add((MediaBrowserCompat.MediaItem)obtain);
                        }
                        emptyList = (List<MediaBrowserCompat.MediaItem>)list;
                    }
                    m.c(emptyList);
                }
            };
            final a0.d d = a0.d.this;
            d.t = d.q;
            d.h(s, (l)l);
            a0.d.this.t = null;
        }
        
        public void j(final MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                final android.support.v4.media.session.b c = token.c();
                if (c != null) {
                    final Iterator<Bundle> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        w.d.b(iterator.next(), "extra_session_binder", ((IInterface)c).asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession$Token)token.e());
        }
        
        public abstract class d extends MediaBrowserService
        {
            public d(final Context context) {
                ((ContextWrapper)this).attachBaseContext(context);
            }
            
            public MediaBrowserService$BrowserRoot onGetRoot(final String s, final int n, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final h o = h.this;
                if (bundle == null) {
                    bundle = null;
                }
                else {
                    bundle = new Bundle(bundle);
                }
                final e h = o.h(s, n, bundle);
                if (h == null) {
                    return null;
                }
                return new MediaBrowserService$BrowserRoot(e.a(h), e.b(h));
            }
            
            public void onLoadChildren(final String s, final MediaBrowserService$Result mediaBrowserService$Result) {
                h.this.i(s, new m(mediaBrowserService$Result));
            }
        }
    }
    
    public class i extends h
    {
        @Override
        public void a() {
            (super.b = new b((Context)d.this)).onCreate();
        }
        
        public void k(final String s, final m m) {
            final l l = new l(s) {
                @Override
                public void a() {
                    m.a();
                }
                
                public void h(final MediaBrowserCompat.MediaItem mediaItem) {
                    Object f;
                    Object o;
                    if (mediaItem == null) {
                        f = m;
                        o = null;
                    }
                    else {
                        final Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        final m f2 = m;
                        o = obtain;
                        f = f2;
                    }
                    ((m)f).c(o);
                }
            };
            final d e = d.this;
            e.t = e.q;
            e.j(s, (l)l);
            d.this.t = null;
        }
        
        public class b extends h.d
        {
            public b(final Context context) {
                (h)i.this.super(context);
            }
            
            public void onLoadItem(final String s, final MediaBrowserService$Result mediaBrowserService$Result) {
                i.this.k(s, new m(mediaBrowserService$Result));
            }
        }
    }
    
    public class j extends i
    {
        public final /* synthetic */ d f;
        
        @Override
        public void a() {
            (super.b = new b((Context)d.this)).onCreate();
        }
        
        @Override
        public void g(final String s, final Bundle bundle) {
            if (bundle != null) {
                e.a(super.b, s, bundle);
                return;
            }
            super.g(s, bundle);
        }
        
        public void l(final String s, final m m, final Bundle bundle) {
            final l l = new l(s) {
                @Override
                public void a() {
                    m.a();
                }
                
                public void h(final List list) {
                    m m;
                    ArrayList list2;
                    if (list == null) {
                        m = m;
                        list2 = null;
                    }
                    else {
                        List<MediaBrowserCompat.MediaItem> b = (List<MediaBrowserCompat.MediaItem>)list;
                        if ((((l)this).b() & 0x1) != 0x0) {
                            b = (List<MediaBrowserCompat.MediaItem>)d.this.b(list, bundle);
                        }
                        list2 = new ArrayList<Parcel>(b.size());
                        for (final MediaBrowserCompat.MediaItem mediaItem : b) {
                            final Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            list2.add(obtain);
                        }
                        m = m;
                    }
                    m.c(list2);
                }
            };
            final d f = d.this;
            f.t = f.q;
            f.i(s, (l)l, bundle);
            d.this.t = null;
        }
        
        public class b extends i.b
        {
            public b(final Context context) {
                (i)j.this.super(context);
            }
            
            public void onLoadChildren(final String s, final MediaBrowserService$Result mediaBrowserService$Result, final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final j q = j.this;
                final d f = q.f;
                f.t = f.q;
                q.l(s, new m(mediaBrowserService$Result), bundle);
                d.this.t = null;
            }
        }
    }
    
    public class k extends j
    {
    }
    
    public abstract static class l
    {
        public final Object a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        
        public l(final Object a) {
            this.a = a;
        }
        
        public void a() {
            if (this.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("detach() called when detach() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            if (this.c) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("detach() called when sendResult() had already been called for: ");
                sb2.append(this.a);
                throw new IllegalStateException(sb2.toString());
            }
            if (!this.d) {
                this.b = true;
                return;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("detach() called when sendError() had already been called for: ");
            sb3.append(this.a);
            throw new IllegalStateException(sb3.toString());
        }
        
        public int b() {
            return this.e;
        }
        
        public boolean c() {
            return this.b || this.c || this.d;
        }
        
        public void d(final Bundle bundle) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.a);
            throw new UnsupportedOperationException(sb.toString());
        }
        
        public abstract void e(final Object p0);
        
        public void f(final Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                this.d(bundle);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
        
        public void g(final Object o) {
            if (!this.c && !this.d) {
                this.c = true;
                this.e(o);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static class m
    {
        public MediaBrowserService$Result a;
        
        public m(final MediaBrowserService$Result a) {
            this.a = a;
        }
        
        public void a() {
            this.a.detach();
        }
        
        public List b(final List list) {
            if (list == null) {
                return null;
            }
            final ArrayList<MediaBrowser$MediaItem> list2 = new ArrayList<MediaBrowser$MediaItem>(list.size());
            for (final Parcel parcel : list) {
                parcel.setDataPosition(0);
                list2.add((MediaBrowser$MediaItem)MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return list2;
        }
        
        public void c(final Object o) {
            if (o instanceof List) {
                this.a.sendResult((Object)this.b((List)o));
                return;
            }
            if (o instanceof Parcel) {
                final Parcel parcel = (Parcel)o;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.a.sendResult((Object)null);
        }
    }
    
    public class n
    {
        public void a(final String s, final IBinder binder, final Bundle bundle, final o o) {
            d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    final f f = (f)d.this.s.get(o.asBinder());
                    if (f == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("addSubscription for callback that isn't registered id=");
                        sb.append(s);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    d.this.a(s, f, binder, bundle);
                }
            });
        }
        
        public void b(final String str, final int n, final int i, final Bundle bundle, final o o) {
            if (d.this.d(str, i)) {
                d.this.u.a(new Runnable() {
                    @Override
                    public void run() {
                        // 
                        // This method could not be decompiled.
                        // 
                        // Original Bytecode:
                        // 
                        //     1: getfield        a0/d$n$a.o:La0/d$o;
                        //     4: invokeinterface a0/d$o.asBinder:()Landroid/os/IBinder;
                        //     9: astore_1       
                        //    10: aload_0        
                        //    11: getfield        a0/d$n$a.t:La0/d$n;
                        //    14: getfield        a0/d$n.a:La0/d;
                        //    17: getfield        a0/d.s:Lt/a;
                        //    20: aload_1        
                        //    21: invokevirtual   t/h.remove:(Ljava/lang/Object;)Ljava/lang/Object;
                        //    24: pop            
                        //    25: new             La0/d$f;
                        //    28: dup            
                        //    29: aload_0        
                        //    30: getfield        a0/d$n$a.t:La0/d$n;
                        //    33: getfield        a0/d$n.a:La0/d;
                        //    36: aload_0        
                        //    37: getfield        a0/d$n$a.p:Ljava/lang/String;
                        //    40: aload_0        
                        //    41: getfield        a0/d$n$a.q:I
                        //    44: aload_0        
                        //    45: getfield        a0/d$n$a.r:I
                        //    48: aload_0        
                        //    49: getfield        a0/d$n$a.s:Landroid/os/Bundle;
                        //    52: aload_0        
                        //    53: getfield        a0/d$n$a.o:La0/d$o;
                        //    56: invokespecial   a0/d$f.<init>:(La0/d;Ljava/lang/String;IILandroid/os/Bundle;La0/d$o;)V
                        //    59: astore_2       
                        //    60: aload_0        
                        //    61: getfield        a0/d$n$a.t:La0/d$n;
                        //    64: getfield        a0/d$n.a:La0/d;
                        //    67: astore_3       
                        //    68: aload_3        
                        //    69: aload_2        
                        //    70: putfield        a0/d.t:La0/d$f;
                        //    73: aload_3        
                        //    74: aload_0        
                        //    75: getfield        a0/d$n$a.p:Ljava/lang/String;
                        //    78: aload_0        
                        //    79: getfield        a0/d$n$a.r:I
                        //    82: aload_0        
                        //    83: getfield        a0/d$n$a.s:Landroid/os/Bundle;
                        //    86: invokevirtual   a0/d.g:(Ljava/lang/String;ILandroid/os/Bundle;)La0/d$e;
                        //    89: astore_3       
                        //    90: aload_2        
                        //    91: aload_3        
                        //    92: putfield        a0/d$f.h:La0/d$e;
                        //    95: aload_0        
                        //    96: getfield        a0/d$n$a.t:La0/d$n;
                        //    99: getfield        a0/d$n.a:La0/d;
                        //   102: astore          4
                        //   104: aload           4
                        //   106: aconst_null    
                        //   107: putfield        a0/d.t:La0/d$f;
                        //   110: aload_3        
                        //   111: ifnonnull       212
                        //   114: new             Ljava/lang/StringBuilder;
                        //   117: dup            
                        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
                        //   121: astore_1       
                        //   122: aload_1        
                        //   123: ldc             "No root for client "
                        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   128: pop            
                        //   129: aload_1        
                        //   130: aload_0        
                        //   131: getfield        a0/d$n$a.p:Ljava/lang/String;
                        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   137: pop            
                        //   138: aload_1        
                        //   139: ldc             " from service "
                        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   144: pop            
                        //   145: aload_1        
                        //   146: aload_0        
                        //   147: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
                        //   150: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
                        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   156: pop            
                        //   157: ldc             "MBServiceCompat"
                        //   159: aload_1        
                        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                        //   163: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
                        //   166: pop            
                        //   167: aload_0        
                        //   168: getfield        a0/d$n$a.o:La0/d$o;
                        //   171: invokeinterface a0/d$o.a:()V
                        //   176: return         
                        //   177: new             Ljava/lang/StringBuilder;
                        //   180: dup            
                        //   181: invokespecial   java/lang/StringBuilder.<init>:()V
                        //   184: astore_1       
                        //   185: aload_1        
                        //   186: ldc             "Calling onConnectFailed() failed. Ignoring. pkg="
                        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   191: pop            
                        //   192: aload_1        
                        //   193: aload_0        
                        //   194: getfield        a0/d$n$a.p:Ljava/lang/String;
                        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   200: pop            
                        //   201: ldc             "MBServiceCompat"
                        //   203: aload_1        
                        //   204: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                        //   207: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
                        //   210: pop            
                        //   211: return         
                        //   212: aload           4
                        //   214: getfield        a0/d.s:Lt/a;
                        //   217: aload_1        
                        //   218: aload_2        
                        //   219: invokevirtual   t/h.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                        //   222: pop            
                        //   223: aload_1        
                        //   224: aload_2        
                        //   225: iconst_0       
                        //   226: invokeinterface android/os/IBinder.linkToDeath:(Landroid/os/IBinder$DeathRecipient;I)V
                        //   231: aload_0        
                        //   232: getfield        a0/d$n$a.t:La0/d$n;
                        //   235: getfield        a0/d$n.a:La0/d;
                        //   238: getfield        a0/d.v:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                        //   241: ifnull          327
                        //   244: aload_0        
                        //   245: getfield        a0/d$n$a.o:La0/d$o;
                        //   248: aload_2        
                        //   249: getfield        a0/d$f.h:La0/d$e;
                        //   252: invokevirtual   a0/d$e.d:()Ljava/lang/String;
                        //   255: aload_0        
                        //   256: getfield        a0/d$n$a.t:La0/d$n;
                        //   259: getfield        a0/d$n.a:La0/d;
                        //   262: getfield        a0/d.v:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                        //   265: aload_2        
                        //   266: getfield        a0/d$f.h:La0/d$e;
                        //   269: invokevirtual   a0/d$e.c:()Landroid/os/Bundle;
                        //   272: invokeinterface a0/d$o.b:(Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
                        //   277: return         
                        //   278: new             Ljava/lang/StringBuilder;
                        //   281: dup            
                        //   282: invokespecial   java/lang/StringBuilder.<init>:()V
                        //   285: astore_2       
                        //   286: aload_2        
                        //   287: ldc             "Calling onConnect() failed. Dropping client. pkg="
                        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   292: pop            
                        //   293: aload_2        
                        //   294: aload_0        
                        //   295: getfield        a0/d$n$a.p:Ljava/lang/String;
                        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   301: pop            
                        //   302: ldc             "MBServiceCompat"
                        //   304: aload_2        
                        //   305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                        //   308: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
                        //   311: pop            
                        //   312: aload_0        
                        //   313: getfield        a0/d$n$a.t:La0/d$n;
                        //   316: getfield        a0/d$n.a:La0/d;
                        //   319: getfield        a0/d.s:Lt/a;
                        //   322: aload_1        
                        //   323: invokevirtual   t/h.remove:(Ljava/lang/Object;)Ljava/lang/Object;
                        //   326: pop            
                        //   327: return         
                        //   328: astore_1       
                        //   329: goto            177
                        //   332: astore_2       
                        //   333: goto            278
                        //    Exceptions:
                        //  Try           Handler
                        //  Start  End    Start  End    Type                        
                        //  -----  -----  -----  -----  ----------------------------
                        //  167    176    328    212    Landroid/os/RemoteException;
                        //  212    277    332    327    Landroid/os/RemoteException;
                        // 
                        // The error that occurred was:
                        // 
                        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0212:
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
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
                });
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Package/uid mismatch: uid=");
            sb.append(i);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public void c(final o o) {
            d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    final f f = (f)d.this.s.remove(o.asBinder());
                    if (f != null) {
                        f.f.asBinder().unlinkToDeath((IBinder$DeathRecipient)f, 0);
                    }
                }
            });
        }
        
        public void d(final String s, final b b, final o o) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b == null) {
                    return;
                }
                d.this.u.a(new Runnable() {
                    @Override
                    public void run() {
                        final f f = (f)d.this.s.get(o.asBinder());
                        if (f == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("getMediaItem for callback that isn't registered id=");
                            sb.append(s);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        d.this.p(s, f, b);
                    }
                });
            }
        }
        
        public void e(final o o, final String s, final int n, final int n2, final Bundle bundle) {
            d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    final IBinder binder = o.asBinder();
                    d.this.s.remove(binder);
                    final Iterator iterator = d.this.r.iterator();
                    while (true) {
                        f f;
                        IBinder$DeathRecipient binder$DeathRecipient;
                        do {
                            final boolean hasNext = iterator.hasNext();
                            final Object o = null;
                            binder$DeathRecipient = null;
                            if (hasNext) {
                                f = iterator.next();
                            }
                            else {
                                Object o2;
                                if ((o2 = o) == null) {
                                    o2 = new f(s, n, n2, bundle, o);
                                }
                                d.this.s.put(binder, o2);
                                while (true) {
                                    try {
                                        binder.linkToDeath((IBinder$DeathRecipient)o2, 0);
                                        return;
                                        Log.w("MBServiceCompat", "IBinder is already dead.");
                                        return;
                                    }
                                    catch (RemoteException ex) {
                                        continue;
                                    }
                                    break;
                                }
                            }
                        } while (f.c != n2);
                        Label_0139: {
                            if (!TextUtils.isEmpty((CharSequence)s)) {
                                final Object o = binder$DeathRecipient;
                                if (n > 0) {
                                    break Label_0139;
                                }
                            }
                            final Object o = new f(f.a, f.b, f.c, bundle, o);
                        }
                        iterator.remove();
                        continue;
                    }
                }
            });
        }
        
        public void f(final String s, final IBinder binder, final o o) {
            d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    final f f = (f)d.this.s.get(o.asBinder());
                    if (f == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription for callback that isn't registered id=");
                        sb.append(s);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    if (!d.this.r(s, f, binder)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("removeSubscription called for ");
                        sb2.append(s);
                        sb2.append(" which is not subscribed");
                        Log.w("MBServiceCompat", sb2.toString());
                    }
                }
            });
        }
        
        public void g(final String s, final Bundle bundle, final b b, final o o) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b == null) {
                    return;
                }
                d.this.u.a(new Runnable() {
                    @Override
                    public void run() {
                        final f f = (f)d.this.s.get(o.asBinder());
                        if (f == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("search for callback that isn't registered query=");
                            sb.append(s);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        d.this.q(s, bundle, f, b);
                    }
                });
            }
        }
        
        public void h(final String s, final Bundle bundle, final b b, final o o) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b == null) {
                    return;
                }
                d.this.u.a(new Runnable() {
                    @Override
                    public void run() {
                        final f f = (f)d.this.s.get(o.asBinder());
                        if (f == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("sendCustomAction for callback that isn't registered action=");
                            sb.append(s);
                            sb.append(", extras=");
                            sb.append(bundle);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        d.this.n(s, bundle, f, b);
                    }
                });
            }
        }
        
        public void i(final o o) {
            d.this.u.a(new Runnable() {
                @Override
                public void run() {
                    final IBinder binder = o.asBinder();
                    final f f = (f)d.this.s.remove(binder);
                    if (f != null) {
                        binder.unlinkToDeath((IBinder$DeathRecipient)f, 0);
                    }
                }
            });
        }
    }
    
    public interface o
    {
        void a();
        
        IBinder asBinder();
        
        void b(final String p0, final MediaSessionCompat.Token p1, final Bundle p2);
        
        void c(final String p0, final List p1, final Bundle p2, final Bundle p3);
    }
    
    public static class p implements o
    {
        public final Messenger a;
        
        public p(final Messenger a) {
            this.a = a;
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
        public void b(final String s, final MediaSessionCompat.Token token, final Bundle bundle) {
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            ((BaseBundle)bundle2).putInt("extra_service_version", 2);
            final Bundle bundle3 = new Bundle();
            ((BaseBundle)bundle3).putString("data_media_item_id", s);
            bundle3.putParcelable("data_media_session_token", (Parcelable)token);
            bundle3.putBundle("data_root_hints", bundle2);
            this.d(1, bundle3);
        }
        
        @Override
        public void c(final String s, final List c, final Bundle bundle, final Bundle bundle2) {
            final Bundle bundle3 = new Bundle();
            ((BaseBundle)bundle3).putString("data_media_item_id", s);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (c != null) {
                ArrayList list;
                if (c instanceof ArrayList) {
                    list = (ArrayList<? extends E>)c;
                }
                else {
                    list = new ArrayList(c);
                }
                bundle3.putParcelableArrayList("data_media_item_list", list);
            }
            this.d(3, bundle3);
        }
        
        public final void d(final int what, final Bundle data) {
            final Message obtain = Message.obtain();
            obtain.what = what;
            obtain.arg1 = 2;
            obtain.setData(data);
            this.a.send(obtain);
        }
    }
    
    public static final class q extends Handler
    {
        public d a;
        
        public q(final d a) {
            this.a = a;
        }
        
        public void a(final Runnable runnable) {
            if (Thread.currentThread() == this.getLooper().getThread()) {
                runnable.run();
                return;
            }
            this.post(runnable);
        }
        
        public void b() {
            this.a = null;
        }
        
        public void handleMessage(final Message message) {
            final d a = this.a;
            if (a != null) {
                a.c(message);
                return;
            }
            this.removeCallbacksAndMessages((Object)null);
        }
        
        public boolean sendMessageAtTime(final Message message, final long n) {
            final Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            ((BaseBundle)data).putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (((BaseBundle)data).containsKey("data_calling_pid")) {
                    return super.sendMessageAtTime(message, n);
                }
                callingPid = -1;
            }
            ((BaseBundle)data).putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, n);
        }
    }
}
