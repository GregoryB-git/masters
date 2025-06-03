package a0;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import b.C0784b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t.C1958a;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0721d extends Service {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f7887w = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: o, reason: collision with root package name */
    public g f7888o;

    /* renamed from: t, reason: collision with root package name */
    public f f7893t;

    /* renamed from: v, reason: collision with root package name */
    public MediaSessionCompat.Token f7895v;

    /* renamed from: p, reason: collision with root package name */
    public final n f7889p = new n();

    /* renamed from: q, reason: collision with root package name */
    public final f f7890q = new f("android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7891r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final C1958a f7892s = new C1958a();

    /* renamed from: u, reason: collision with root package name */
    public final q f7894u = new q(this);

    /* renamed from: a0.d$a */
    public class a extends l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f7896f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f7897g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Bundle f7898h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Bundle f7899i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f7896f = fVar;
            this.f7897g = str;
            this.f7898h = bundle;
            this.f7899i = bundle2;
        }

        @Override // a0.AbstractServiceC0721d.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(List list) {
            if (AbstractServiceC0721d.this.f7892s.get(this.f7896f.f7914f.asBinder()) != this.f7896f) {
                if (AbstractServiceC0721d.f7887w) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f7896f.f7909a + " id=" + this.f7897g);
                    return;
                }
                return;
            }
            if ((b() & 1) != 0) {
                list = AbstractServiceC0721d.this.b(list, this.f7898h);
            }
            try {
                this.f7896f.f7914f.c(this.f7897g, list, this.f7898h, this.f7899i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f7897g + " package=" + this.f7896f.f7909a);
            }
        }
    }

    /* renamed from: a0.d$b */
    public class b extends l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C0784b f7901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, C0784b c0784b) {
            super(obj);
            this.f7901f = c0784b;
        }

        @Override // a0.AbstractServiceC0721d.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((b() & 2) != 0) {
                this.f7901f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f7901f.b(0, bundle);
        }
    }

    /* renamed from: a0.d$c */
    public class c extends l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C0784b f7903f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, C0784b c0784b) {
            super(obj);
            this.f7903f = c0784b;
        }

        @Override // a0.AbstractServiceC0721d.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(List list) {
            if ((b() & 4) != 0 || list == null) {
                this.f7903f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f7903f.b(0, bundle);
        }
    }

    /* renamed from: a0.d$d, reason: collision with other inner class name */
    public class C0139d extends l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C0784b f7905f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0139d(Object obj, C0784b c0784b) {
            super(obj);
            this.f7905f = c0784b;
        }

        @Override // a0.AbstractServiceC0721d.l
        public void d(Bundle bundle) {
            this.f7905f.b(-1, bundle);
        }

        @Override // a0.AbstractServiceC0721d.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(Bundle bundle) {
            this.f7905f.b(0, bundle);
        }
    }

    /* renamed from: a0.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f7907a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f7908b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f7907a = str;
            this.f7908b = bundle;
        }

        public Bundle c() {
            return this.f7908b;
        }

        public String d() {
            return this.f7907a;
        }
    }

    /* renamed from: a0.d$f */
    public class f implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f7909a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7910b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7911c;

        /* renamed from: d, reason: collision with root package name */
        public final C0723f f7912d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f7913e;

        /* renamed from: f, reason: collision with root package name */
        public final o f7914f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap f7915g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public e f7916h;

        /* renamed from: a0.d$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                AbstractServiceC0721d.this.f7892s.remove(fVar.f7914f.asBinder());
            }
        }

        public f(String str, int i7, int i8, Bundle bundle, o oVar) {
            this.f7909a = str;
            this.f7910b = i7;
            this.f7911c = i8;
            this.f7912d = new C0723f(str, i7, i8);
            this.f7913e = bundle;
            this.f7914f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            AbstractServiceC0721d.this.f7894u.post(new a());
        }
    }

    /* renamed from: a0.d$g */
    public interface g {
        void a();

        IBinder b(Intent intent);

        void c(String str, Bundle bundle);

        void d(MediaSessionCompat.Token token);
    }

    /* renamed from: a0.d$h */
    public class h implements g {

        /* renamed from: a, reason: collision with root package name */
        public final List f7919a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public MediaBrowserService f7920b;

        /* renamed from: c, reason: collision with root package name */
        public Messenger f7921c;

        /* renamed from: a0.d$h$a */
        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ MediaSessionCompat.Token f7923o;

            public a(MediaSessionCompat.Token token) {
                this.f7923o = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.j(this.f7923o);
            }
        }

        /* renamed from: a0.d$h$b */
        public class b extends l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f7925f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj, m mVar) {
                super(obj);
                this.f7925f = mVar;
            }

            @Override // a0.AbstractServiceC0721d.l
            public void a() {
                this.f7925f.a();
            }

            @Override // a0.AbstractServiceC0721d.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(List list) {
                List list2;
                if (list == null) {
                    list2 = Build.VERSION.SDK_INT >= 24 ? null : Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    list2 = arrayList;
                }
                this.f7925f.c(list2);
            }
        }

        /* renamed from: a0.d$h$c */
        public class c implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f7927o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Bundle f7928p;

            public c(String str, Bundle bundle) {
                this.f7927o = str;
                this.f7928p = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = AbstractServiceC0721d.this.f7892s.keySet().iterator();
                while (it.hasNext()) {
                    h.this.f((f) AbstractServiceC0721d.this.f7892s.get((IBinder) it.next()), this.f7927o, this.f7928p);
                }
            }
        }

        /* renamed from: a0.d$h$d, reason: collision with other inner class name */
        public class C0140d extends MediaBrowserService {
            public C0140d(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                e h7 = h.this.h(str, i7, bundle == null ? null : new Bundle(bundle));
                if (h7 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(h7.f7907a, h7.f7908b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result) {
                h.this.i(str, new m(result));
            }
        }

        public h() {
        }

        @Override // a0.AbstractServiceC0721d.g
        public IBinder b(Intent intent) {
            return this.f7920b.onBind(intent);
        }

        @Override // a0.AbstractServiceC0721d.g
        public void c(String str, Bundle bundle) {
            g(str, bundle);
            e(str, bundle);
        }

        @Override // a0.AbstractServiceC0721d.g
        public void d(MediaSessionCompat.Token token) {
            AbstractServiceC0721d.this.f7894u.a(new a(token));
        }

        public void e(String str, Bundle bundle) {
            AbstractServiceC0721d.this.f7894u.post(new c(str, bundle));
        }

        public void f(f fVar, String str, Bundle bundle) {
            List<H.d> list = (List) fVar.f7915g.get(str);
            if (list != null) {
                for (H.d dVar : list) {
                    if (AbstractC0720c.b(bundle, (Bundle) dVar.f2115b)) {
                        AbstractServiceC0721d.this.o(str, fVar, (Bundle) dVar.f2115b, bundle);
                    }
                }
            }
        }

        public void g(String str, Bundle bundle) {
            this.f7920b.notifyChildrenChanged(str);
        }

        public e h(String str, int i7, Bundle bundle) {
            Bundle bundle2;
            int i8 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.f7921c = new Messenger(AbstractServiceC0721d.this.f7894u);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                w.d.b(bundle2, "extra_messenger", this.f7921c.getBinder());
                MediaSessionCompat.Token token = AbstractServiceC0721d.this.f7895v;
                if (token != null) {
                    android.support.v4.media.session.b c7 = token.c();
                    w.d.b(bundle2, "extra_session_binder", c7 == null ? null : c7.asBinder());
                } else {
                    this.f7919a.add(bundle2);
                }
                i8 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            f fVar = AbstractServiceC0721d.this.new f(str, i8, i7, bundle, null);
            AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
            abstractServiceC0721d.f7893t = fVar;
            e g7 = abstractServiceC0721d.g(str, i7, bundle);
            AbstractServiceC0721d abstractServiceC0721d2 = AbstractServiceC0721d.this;
            abstractServiceC0721d2.f7893t = null;
            if (g7 == null) {
                return null;
            }
            if (this.f7921c != null) {
                abstractServiceC0721d2.f7891r.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = g7.c();
            } else if (g7.c() != null) {
                bundle2.putAll(g7.c());
            }
            return new e(g7.d(), bundle2);
        }

        public void i(String str, m mVar) {
            b bVar = new b(str, mVar);
            AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
            abstractServiceC0721d.f7893t = abstractServiceC0721d.f7890q;
            abstractServiceC0721d.h(str, bVar);
            AbstractServiceC0721d.this.f7893t = null;
        }

        public void j(MediaSessionCompat.Token token) {
            if (!this.f7919a.isEmpty()) {
                android.support.v4.media.session.b c7 = token.c();
                if (c7 != null) {
                    Iterator it = this.f7919a.iterator();
                    while (it.hasNext()) {
                        w.d.b((Bundle) it.next(), "extra_session_binder", c7.asBinder());
                    }
                }
                this.f7919a.clear();
            }
            this.f7920b.setSessionToken((MediaSession.Token) token.e());
        }
    }

    /* renamed from: a0.d$i */
    public class i extends h {

        /* renamed from: a0.d$i$a */
        public class a extends l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f7932f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, m mVar) {
                super(obj);
                this.f7932f = mVar;
            }

            @Override // a0.AbstractServiceC0721d.l
            public void a() {
                this.f7932f.a();
            }

            @Override // a0.AbstractServiceC0721d.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(MediaBrowserCompat.MediaItem mediaItem) {
                Parcel obtain;
                m mVar;
                if (mediaItem == null) {
                    mVar = this.f7932f;
                    obtain = null;
                } else {
                    obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    mVar = this.f7932f;
                }
                mVar.c(obtain);
            }
        }

        /* renamed from: a0.d$i$b */
        public class b extends h.C0140d {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result result) {
                i.this.k(str, new m(result));
            }
        }

        public i() {
            super();
        }

        @Override // a0.AbstractServiceC0721d.g
        public void a() {
            b bVar = new b(AbstractServiceC0721d.this);
            this.f7920b = bVar;
            bVar.onCreate();
        }

        public void k(String str, m mVar) {
            a aVar = new a(str, mVar);
            AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
            abstractServiceC0721d.f7893t = abstractServiceC0721d.f7890q;
            abstractServiceC0721d.j(str, aVar);
            AbstractServiceC0721d.this.f7893t = null;
        }
    }

    /* renamed from: a0.d$j */
    public class j extends i {

        /* renamed from: a0.d$j$a */
        public class a extends l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f7936f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Bundle f7937g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f7936f = mVar;
                this.f7937g = bundle;
            }

            @Override // a0.AbstractServiceC0721d.l
            public void a() {
                this.f7936f.a();
            }

            @Override // a0.AbstractServiceC0721d.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(List list) {
                ArrayList arrayList;
                m mVar;
                if (list == null) {
                    mVar = this.f7936f;
                    arrayList = null;
                } else {
                    if ((b() & 1) != 0) {
                        list = AbstractServiceC0721d.this.b(list, this.f7937g);
                    }
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    mVar = this.f7936f;
                }
                mVar.c(arrayList);
            }
        }

        /* renamed from: a0.d$j$b */
        public class b extends i.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
                abstractServiceC0721d.f7893t = abstractServiceC0721d.f7890q;
                jVar.l(str, new m(result), bundle);
                AbstractServiceC0721d.this.f7893t = null;
            }
        }

        public j() {
            super();
        }

        @Override // a0.AbstractServiceC0721d.i, a0.AbstractServiceC0721d.g
        public void a() {
            b bVar = new b(AbstractServiceC0721d.this);
            this.f7920b = bVar;
            bVar.onCreate();
        }

        @Override // a0.AbstractServiceC0721d.h
        public void g(String str, Bundle bundle) {
            if (bundle != null) {
                this.f7920b.notifyChildrenChanged(str, bundle);
            } else {
                super.g(str, bundle);
            }
        }

        public void l(String str, m mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
            abstractServiceC0721d.f7893t = abstractServiceC0721d.f7890q;
            abstractServiceC0721d.i(str, aVar, bundle);
            AbstractServiceC0721d.this.f7893t = null;
        }
    }

    /* renamed from: a0.d$k */
    public class k extends j {
        public k() {
            super();
        }
    }

    /* renamed from: a0.d$l */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final Object f7941a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7942b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7943c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7944d;

        /* renamed from: e, reason: collision with root package name */
        public int f7945e;

        public l(Object obj) {
            this.f7941a = obj;
        }

        public void a() {
            if (this.f7942b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f7941a);
            }
            if (this.f7943c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f7941a);
            }
            if (!this.f7944d) {
                this.f7942b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f7941a);
        }

        public int b() {
            return this.f7945e;
        }

        public boolean c() {
            return this.f7942b || this.f7943c || this.f7944d;
        }

        public void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f7941a);
        }

        public abstract void e(Object obj);

        public void f(Bundle bundle) {
            if (!this.f7943c && !this.f7944d) {
                this.f7944d = true;
                d(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f7941a);
            }
        }

        public void g(Object obj) {
            if (!this.f7943c && !this.f7944d) {
                this.f7943c = true;
                e(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f7941a);
            }
        }
    }

    /* renamed from: a0.d$m */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f7946a;

        public m(MediaBrowserService.Result result) {
            this.f7946a = result;
        }

        public void a() {
            this.f7946a.detach();
        }

        public List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        public void c(Object obj) {
            if (obj instanceof List) {
                this.f7946a.sendResult(b((List) obj));
                return;
            }
            if (!(obj instanceof Parcel)) {
                this.f7946a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.f7946a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* renamed from: a0.d$n */
    public class n {

        /* renamed from: a0.d$n$a */
        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7948o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7949p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ int f7950q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ int f7951r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Bundle f7952s;

            public a(o oVar, String str, int i7, int i8, Bundle bundle) {
                this.f7948o = oVar;
                this.f7949p = str;
                this.f7950q = i7;
                this.f7951r = i8;
                this.f7952s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f7948o.asBinder();
                AbstractServiceC0721d.this.f7892s.remove(asBinder);
                f fVar = AbstractServiceC0721d.this.new f(this.f7949p, this.f7950q, this.f7951r, this.f7952s, this.f7948o);
                AbstractServiceC0721d abstractServiceC0721d = AbstractServiceC0721d.this;
                abstractServiceC0721d.f7893t = fVar;
                e g7 = abstractServiceC0721d.g(this.f7949p, this.f7951r, this.f7952s);
                fVar.f7916h = g7;
                AbstractServiceC0721d abstractServiceC0721d2 = AbstractServiceC0721d.this;
                abstractServiceC0721d2.f7893t = null;
                if (g7 != null) {
                    try {
                        abstractServiceC0721d2.f7892s.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (AbstractServiceC0721d.this.f7895v != null) {
                            this.f7948o.b(fVar.f7916h.d(), AbstractServiceC0721d.this.f7895v, fVar.f7916h.c());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f7949p);
                        AbstractServiceC0721d.this.f7892s.remove(asBinder);
                        return;
                    }
                }
                Log.i("MBServiceCompat", "No root for client " + this.f7949p + " from service " + getClass().getName());
                try {
                    this.f7948o.a();
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f7949p);
                }
            }
        }

        /* renamed from: a0.d$n$b */
        public class b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7954o;

            public b(o oVar) {
                this.f7954o = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.remove(this.f7954o.asBinder());
                if (fVar != null) {
                    fVar.f7914f.asBinder().unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: a0.d$n$c */
        public class c implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7956o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7957p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ IBinder f7958q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Bundle f7959r;

            public c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f7956o = oVar;
                this.f7957p = str;
                this.f7958q = iBinder;
                this.f7959r = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.get(this.f7956o.asBinder());
                if (fVar != null) {
                    AbstractServiceC0721d.this.a(this.f7957p, fVar, this.f7958q, this.f7959r);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f7957p);
            }
        }

        /* renamed from: a0.d$n$d, reason: collision with other inner class name */
        public class RunnableC0141d implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7961o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7962p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ IBinder f7963q;

            public RunnableC0141d(o oVar, String str, IBinder iBinder) {
                this.f7961o = oVar;
                this.f7962p = str;
                this.f7963q = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.get(this.f7961o.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f7962p);
                    return;
                }
                if (AbstractServiceC0721d.this.r(this.f7962p, fVar, this.f7963q)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.f7962p + " which is not subscribed");
            }
        }

        /* renamed from: a0.d$n$e */
        public class e implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7965o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7966p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ C0784b f7967q;

            public e(o oVar, String str, C0784b c0784b) {
                this.f7965o = oVar;
                this.f7966p = str;
                this.f7967q = c0784b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.get(this.f7965o.asBinder());
                if (fVar != null) {
                    AbstractServiceC0721d.this.p(this.f7966p, fVar, this.f7967q);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f7966p);
            }
        }

        /* renamed from: a0.d$n$f */
        public class f implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7969o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ int f7970p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f7971q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ int f7972r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Bundle f7973s;

            public f(o oVar, int i7, String str, int i8, Bundle bundle) {
                this.f7969o = oVar;
                this.f7970p = i7;
                this.f7971q = str;
                this.f7972r = i8;
                this.f7973s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder asBinder = this.f7969o.asBinder();
                AbstractServiceC0721d.this.f7892s.remove(asBinder);
                Iterator it = AbstractServiceC0721d.this.f7891r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it.next();
                    if (fVar2.f7911c == this.f7970p) {
                        fVar = (TextUtils.isEmpty(this.f7971q) || this.f7972r <= 0) ? AbstractServiceC0721d.this.new f(fVar2.f7909a, fVar2.f7910b, fVar2.f7911c, this.f7973s, this.f7969o) : null;
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = AbstractServiceC0721d.this.new f(this.f7971q, this.f7972r, this.f7970p, this.f7973s, this.f7969o);
                }
                AbstractServiceC0721d.this.f7892s.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: a0.d$n$g */
        public class g implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7975o;

            public g(o oVar) {
                this.f7975o = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f7975o.asBinder();
                f fVar = (f) AbstractServiceC0721d.this.f7892s.remove(asBinder);
                if (fVar != null) {
                    asBinder.unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: a0.d$n$h */
        public class h implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7977o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7978p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Bundle f7979q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C0784b f7980r;

            public h(o oVar, String str, Bundle bundle, C0784b c0784b) {
                this.f7977o = oVar;
                this.f7978p = str;
                this.f7979q = bundle;
                this.f7980r = c0784b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.get(this.f7977o.asBinder());
                if (fVar != null) {
                    AbstractServiceC0721d.this.q(this.f7978p, this.f7979q, fVar, this.f7980r);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f7978p);
            }
        }

        /* renamed from: a0.d$n$i */
        public class i implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ o f7982o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f7983p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Bundle f7984q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C0784b f7985r;

            public i(o oVar, String str, Bundle bundle, C0784b c0784b) {
                this.f7982o = oVar;
                this.f7983p = str;
                this.f7984q = bundle;
                this.f7985r = c0784b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) AbstractServiceC0721d.this.f7892s.get(this.f7982o.asBinder());
                if (fVar != null) {
                    AbstractServiceC0721d.this.n(this.f7983p, this.f7984q, fVar, this.f7985r);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f7983p + ", extras=" + this.f7984q);
            }
        }

        public n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            AbstractServiceC0721d.this.f7894u.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i7, int i8, Bundle bundle, o oVar) {
            if (AbstractServiceC0721d.this.d(str, i8)) {
                AbstractServiceC0721d.this.f7894u.a(new a(oVar, str, i7, i8, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i8 + " package=" + str);
        }

        public void c(o oVar) {
            AbstractServiceC0721d.this.f7894u.a(new b(oVar));
        }

        public void d(String str, C0784b c0784b, o oVar) {
            if (TextUtils.isEmpty(str) || c0784b == null) {
                return;
            }
            AbstractServiceC0721d.this.f7894u.a(new e(oVar, str, c0784b));
        }

        public void e(o oVar, String str, int i7, int i8, Bundle bundle) {
            AbstractServiceC0721d.this.f7894u.a(new f(oVar, i8, str, i7, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            AbstractServiceC0721d.this.f7894u.a(new RunnableC0141d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, C0784b c0784b, o oVar) {
            if (TextUtils.isEmpty(str) || c0784b == null) {
                return;
            }
            AbstractServiceC0721d.this.f7894u.a(new h(oVar, str, bundle, c0784b));
        }

        public void h(String str, Bundle bundle, C0784b c0784b, o oVar) {
            if (TextUtils.isEmpty(str) || c0784b == null) {
                return;
            }
            AbstractServiceC0721d.this.f7894u.a(new i(oVar, str, bundle, c0784b));
        }

        public void i(o oVar) {
            AbstractServiceC0721d.this.f7894u.a(new g(oVar));
        }
    }

    /* renamed from: a0.d$o */
    public interface o {
        void a();

        IBinder asBinder();

        void b(String str, MediaSessionCompat.Token token, Bundle bundle);

        void c(String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: a0.d$p */
    public static class p implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f7987a;

        public p(Messenger messenger) {
            this.f7987a = messenger;
        }

        @Override // a0.AbstractServiceC0721d.o
        public void a() {
            d(2, null);
        }

        @Override // a0.AbstractServiceC0721d.o
        public IBinder asBinder() {
            return this.f7987a.getBinder();
        }

        @Override // a0.AbstractServiceC0721d.o
        public void b(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }

        @Override // a0.AbstractServiceC0721d.o
        public void c(String str, List list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        public final void d(int i7, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i7;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f7987a.send(obtain);
        }
    }

    /* renamed from: a0.d$q */
    public static final class q extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public AbstractServiceC0721d f7988a;

        public q(AbstractServiceC0721d abstractServiceC0721d) {
            this.f7988a = abstractServiceC0721d;
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void b() {
            this.f7988a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractServiceC0721d abstractServiceC0721d = this.f7988a;
            if (abstractServiceC0721d != null) {
                abstractServiceC0721d.c(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j7) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (!data.containsKey("data_calling_pid")) {
                    callingPid = -1;
                }
                return super.sendMessageAtTime(message, j7);
            }
            data.putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, j7);
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<H.d> list = (List) fVar.f7915g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (H.d dVar : list) {
            if (iBinder == dVar.f2114a && AbstractC0720c.a(bundle, (Bundle) dVar.f2115b)) {
                return;
            }
        }
        list.add(new H.d(iBinder, bundle));
        fVar.f7915g.put(str, list);
        o(str, fVar, bundle, null);
        this.f7893t = fVar;
        l(str, bundle);
        this.f7893t = null;
    }

    public List b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i7 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i8 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i7 == -1 && i8 == -1) {
            return list;
        }
        int i9 = i8 * i7;
        int i10 = i9 + i8;
        if (i7 < 0 || i8 < 1 || i9 >= list.size()) {
            return Collections.emptyList();
        }
        if (i10 > list.size()) {
            i10 = list.size();
        }
        return list.subList(i9, i10);
    }

    public void c(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle);
                this.f7889p.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                break;
            case 2:
                this.f7889p.c(new p(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.a(bundle2);
                this.f7889p.a(data.getString("data_media_item_id"), w.d.a(data, "data_callback_token"), bundle2, new p(message.replyTo));
                break;
            case 4:
                this.f7889p.f(data.getString("data_media_item_id"), w.d.a(data, "data_callback_token"), new p(message.replyTo));
                break;
            case 5:
                this.f7889p.d(data.getString("data_media_item_id"), (C0784b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle3);
                this.f7889p.e(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.f7889p.i(new p(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.a(bundle4);
                this.f7889p.g(data.getString("data_search_query"), bundle4, (C0784b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.a(bundle5);
                this.f7889p.h(data.getString("data_custom_action"), bundle5, (C0784b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    public boolean d(String str, int i7) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i7)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void e(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f7888o.c(str, bundle);
    }

    public void f(String str, Bundle bundle, l lVar) {
        lVar.f(null);
    }

    public abstract e g(String str, int i7, Bundle bundle);

    public abstract void h(String str, l lVar);

    public abstract void i(String str, l lVar, Bundle bundle);

    public abstract void j(String str, l lVar);

    public abstract void k(String str, Bundle bundle, l lVar);

    public void n(String str, Bundle bundle, f fVar, C0784b c0784b) {
        C0139d c0139d = new C0139d(str, c0784b);
        this.f7893t = fVar;
        f(str, bundle, c0139d);
        this.f7893t = null;
        if (c0139d.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void o(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f7893t = fVar;
        if (bundle == null) {
            h(str, aVar);
        } else {
            i(str, aVar, bundle);
        }
        this.f7893t = null;
        if (aVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f7909a + " id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7888o.b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i7 = Build.VERSION.SDK_INT;
        this.f7888o = i7 >= 28 ? new k() : i7 >= 26 ? new j() : new i();
        this.f7888o.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f7894u.b();
    }

    public void p(String str, f fVar, C0784b c0784b) {
        b bVar = new b(str, c0784b);
        this.f7893t = fVar;
        j(str, bVar);
        this.f7893t = null;
        if (bVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    public void q(String str, Bundle bundle, f fVar, C0784b c0784b) {
        c cVar = new c(str, c0784b);
        this.f7893t = fVar;
        k(str, bundle, cVar);
        this.f7893t = null;
        if (cVar.c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    public boolean r(String str, f fVar, IBinder iBinder) {
        boolean z7 = false;
        try {
            if (iBinder != null) {
                List list = (List) fVar.f7915g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((H.d) it.next()).f2114a) {
                            it.remove();
                            z7 = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.f7915g.remove(str);
                    }
                }
            } else if (fVar.f7915g.remove(str) != null) {
                z7 = true;
            }
            return z7;
        } finally {
            this.f7893t = fVar;
            m(str);
            this.f7893t = null;
        }
    }

    public void s(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f7895v != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f7895v = token;
        this.f7888o.d(token);
    }

    public void m(String str) {
    }

    public void l(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
