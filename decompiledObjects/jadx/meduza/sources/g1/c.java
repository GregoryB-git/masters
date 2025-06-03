package g1;

import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends Service {

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f5713o = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public f f5714a;

    /* renamed from: b, reason: collision with root package name */
    public final C0091c f5715b = new C0091c("android.media.session.MediaController", -1, -1, null);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0091c> f5716c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final r.b<IBinder, C0091c> f5717d = new r.b<>();

    /* renamed from: e, reason: collision with root package name */
    public final n f5718e = new n(this);
    public MediaSessionCompat.Token f;

    public class a extends i<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ C0091c f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f5719g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Bundle f5720h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Bundle f5721i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C0091c c0091c, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = c0091c;
            this.f5719g = str;
            this.f5720h = bundle;
            this.f5721i = bundle2;
        }

        @Override // g1.c.i
        public final void d(List<MediaBrowserCompat.MediaItem> list) {
            List<MediaBrowserCompat.MediaItem> list2 = list;
            if (c.this.f5717d.getOrDefault(((m) this.f.f5728d).a(), null) != this.f) {
                if (c.f5713o) {
                    StringBuilder l10 = defpackage.f.l("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    l10.append(this.f.f5725a);
                    l10.append(" id=");
                    l10.append(this.f5719g);
                    Log.d("MBServiceCompat", l10.toString());
                    return;
                }
                return;
            }
            if ((this.f5744e & 1) != 0) {
                c cVar = c.this;
                Bundle bundle = this.f5720h;
                cVar.getClass();
                list2 = c.a(list2, bundle);
            }
            try {
                ((m) this.f.f5728d).b(this.f5719g, list2, this.f5720h, this.f5721i);
            } catch (RemoteException unused) {
                StringBuilder l11 = defpackage.f.l("Calling onLoadChildren() failed for id=");
                l11.append(this.f5719g);
                l11.append(" package=");
                l11.append(this.f.f5725a);
                Log.w("MBServiceCompat", l11.toString());
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5723a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f5724b;

        public b(Bundle bundle, String str) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f5723a = str;
            this.f5724b = bundle;
        }
    }

    /* renamed from: g1.c$c, reason: collision with other inner class name */
    public class C0091c implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f5725a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5726b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5727c;

        /* renamed from: d, reason: collision with root package name */
        public final l f5728d;

        /* renamed from: e, reason: collision with root package name */
        public final HashMap<String, List<d0.b<IBinder, Bundle>>> f5729e = new HashMap<>();
        public b f;

        /* renamed from: g1.c$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0091c c0091c = C0091c.this;
                c.this.f5717d.remove(((m) c0091c.f5728d).a());
            }
        }

        public C0091c(String str, int i10, int i11, l lVar) {
            this.f5725a = str;
            this.f5726b = i10;
            this.f5727c = i11;
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                new u(str, i10, i11);
            }
            this.f5728d = lVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c.this.f5718e.post(new a());
        }
    }

    public interface d {
        void onCreate();
    }

    public class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5732a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public a f5733b;

        /* renamed from: c, reason: collision with root package name */
        public Messenger f5734c;

        public class a extends MediaBrowserService {
            public a(c cVar) {
                attachBaseContext(cVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
            @Override // android.service.media.MediaBrowserService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
                /*
                    r11 = this;
                    android.support.v4.media.session.MediaSessionCompat.a(r14)
                    g1.c$e r0 = g1.c.e.this
                    r1 = 0
                    if (r14 != 0) goto La
                    r2 = r1
                    goto Lf
                La:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r14)
                Lf:
                    r14 = -1
                    if (r2 == 0) goto L6a
                    r0.getClass()
                    r3 = 0
                    java.lang.String r4 = "extra_client_version"
                    int r3 = r2.getInt(r4, r3)
                    if (r3 == 0) goto L6a
                    r2.remove(r4)
                    android.os.Messenger r3 = new android.os.Messenger
                    g1.c r4 = g1.c.this
                    g1.c$n r4 = r4.f5718e
                    r3.<init>(r4)
                    r0.f5734c = r3
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    r4 = 2
                    java.lang.String r5 = "extra_service_version"
                    r3.putInt(r5, r4)
                    android.os.Messenger r4 = r0.f5734c
                    android.os.IBinder r4 = r4.getBinder()
                    java.lang.String r5 = "extra_messenger"
                    r3.putBinder(r5, r4)
                    g1.c r4 = g1.c.this
                    android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.f
                    if (r4 == 0) goto L5a
                    android.support.v4.media.session.IMediaSession r4 = r4.a()
                    if (r4 != 0) goto L50
                    r4 = r1
                    goto L54
                L50:
                    android.os.IBinder r4 = r4.asBinder()
                L54:
                    java.lang.String r5 = "extra_session_binder"
                    r3.putBinder(r5, r4)
                    goto L5f
                L5a:
                    java.util.ArrayList r4 = r0.f5732a
                    r4.add(r3)
                L5f:
                    java.lang.String r4 = "extra_calling_pid"
                    int r14 = r2.getInt(r4, r14)
                    r2.remove(r4)
                    r8 = r14
                    goto L6c
                L6a:
                    r8 = r14
                    r3 = r1
                L6c:
                    g1.c$c r14 = new g1.c$c
                    g1.c r6 = g1.c.this
                    r10 = 0
                    r5 = r14
                    r7 = r12
                    r9 = r13
                    r5.<init>(r7, r8, r9, r10)
                    g1.c r12 = g1.c.this
                    r12.getClass()
                    g1.c r12 = g1.c.this
                    g1.c$b r12 = r12.b(r2)
                    g1.c r13 = g1.c.this
                    r13.getClass()
                    if (r12 != 0) goto L8b
                    r13 = r1
                    goto La9
                L8b:
                    android.os.Messenger r13 = r0.f5734c
                    if (r13 == 0) goto L96
                    g1.c r13 = g1.c.this
                    java.util.ArrayList<g1.c$c> r13 = r13.f5716c
                    r13.add(r14)
                L96:
                    if (r3 != 0) goto L9b
                    android.os.Bundle r3 = r12.f5724b
                    goto La2
                L9b:
                    android.os.Bundle r13 = r12.f5724b
                    if (r13 == 0) goto La2
                    r3.putAll(r13)
                La2:
                    g1.c$b r13 = new g1.c$b
                    java.lang.String r12 = r12.f5723a
                    r13.<init>(r3, r12)
                La9:
                    if (r13 != 0) goto Lac
                    goto Lb5
                Lac:
                    android.service.media.MediaBrowserService$BrowserRoot r1 = new android.service.media.MediaBrowserService$BrowserRoot
                    java.lang.String r12 = r13.f5723a
                    android.os.Bundle r13 = r13.f5724b
                    r1.<init>(r12, r13)
                Lb5:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: g1.c.e.a.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                e eVar = e.this;
                j jVar = new j(result);
                eVar.getClass();
                g1.g gVar = new g1.g(str, jVar);
                c cVar = c.this;
                C0091c c0091c = cVar.f5715b;
                cVar.d(str, gVar);
                c.this.getClass();
            }
        }

        public e() {
        }

        public void a(Bundle bundle, String str) {
            this.f5733b.notifyChildrenChanged(str);
        }
    }

    public class f extends e {

        public class a extends e.a {
            public a(c cVar) {
                super(cVar);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                f fVar = f.this;
                j jVar = new j(result);
                fVar.getClass();
                g1.i iVar = new g1.i(str, jVar);
                c cVar = c.this;
                C0091c c0091c = cVar.f5715b;
                cVar.e(str, iVar);
                c.this.getClass();
            }
        }

        public f() {
            super();
        }

        @Override // g1.c.d
        public void onCreate() {
            a aVar = new a(c.this);
            this.f5733b = aVar;
            aVar.onCreate();
        }
    }

    public class g extends f {

        public class a extends f.a {
            public a(c cVar) {
                super(cVar);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                c cVar = c.this;
                C0091c c0091c = cVar.f5715b;
                cVar.getClass();
                g gVar = g.this;
                j jVar = new j(result);
                gVar.getClass();
                g1.j jVar2 = new g1.j(gVar, str, jVar, bundle);
                c cVar2 = c.this;
                C0091c c0091c2 = cVar2.f5715b;
                cVar2.c(bundle, jVar2, str);
                c.this.getClass();
                c.this.getClass();
            }
        }

        public g() {
            super();
        }

        @Override // g1.c.e
        public final void a(Bundle bundle, String str) {
            this.f5733b.notifyChildrenChanged(str, bundle);
        }

        @Override // g1.c.f, g1.c.d
        public final void onCreate() {
            a aVar = new a(c.this);
            this.f5733b = aVar;
            aVar.onCreate();
        }
    }

    public class h extends g {
        public h(c cVar) {
            super();
        }
    }

    public static class i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5740a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5741b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5742c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5743d;

        /* renamed from: e, reason: collision with root package name */
        public int f5744e;

        public i(Object obj) {
            this.f5740a = obj;
        }

        public void a() {
            if (this.f5741b) {
                StringBuilder l10 = defpackage.f.l("detach() called when detach() had already been called for: ");
                l10.append(this.f5740a);
                throw new IllegalStateException(l10.toString());
            }
            if (this.f5742c) {
                StringBuilder l11 = defpackage.f.l("detach() called when sendResult() had already been called for: ");
                l11.append(this.f5740a);
                throw new IllegalStateException(l11.toString());
            }
            if (!this.f5743d) {
                this.f5741b = true;
            } else {
                StringBuilder l12 = defpackage.f.l("detach() called when sendError() had already been called for: ");
                l12.append(this.f5740a);
                throw new IllegalStateException(l12.toString());
            }
        }

        public final boolean b() {
            return this.f5741b || this.f5742c || this.f5743d;
        }

        public void c(Bundle bundle) {
            StringBuilder l10 = defpackage.f.l("It is not supported to send an error for ");
            l10.append(this.f5740a);
            throw new UnsupportedOperationException(l10.toString());
        }

        public void d(T t) {
            throw null;
        }

        public final void e(Bundle bundle) {
            if (this.f5742c || this.f5743d) {
                StringBuilder l10 = defpackage.f.l("sendError() called when either sendResult() or sendError() had already been called for: ");
                l10.append(this.f5740a);
                throw new IllegalStateException(l10.toString());
            }
            this.f5743d = true;
            c(bundle);
            throw null;
        }

        public final void f(T t) {
            if (this.f5742c || this.f5743d) {
                StringBuilder l10 = defpackage.f.l("sendResult() called when either sendResult() or sendError() had already been called for: ");
                l10.append(this.f5740a);
                throw new IllegalStateException(l10.toString());
            }
            this.f5742c = true;
            d(t);
        }
    }

    public static class j<T> {

        /* renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f5745a;

        public j(MediaBrowserService.Result result) {
            this.f5745a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t) {
            ArrayList arrayList = null;
            if (!(t instanceof List)) {
                if (!(t instanceof Parcel)) {
                    this.f5745a.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f5745a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            MediaBrowserService.Result result = this.f5745a;
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    public class k {
        public k() {
        }
    }

    public interface l {
    }

    public static class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f5747a;

        public m(Messenger messenger) {
            this.f5747a = messenger;
        }

        public final IBinder a() {
            return this.f5747a.getBinder();
        }

        public final void b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            c(3, bundle3);
        }

        public final void c(int i10, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f5747a.send(obtain);
        }
    }

    public final class n extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final k f5748a;

        public n(c cVar) {
            this.f5748a = cVar.new k();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    k kVar = this.f5748a;
                    String string = data.getString("data_package_name");
                    int i10 = data.getInt("data_calling_pid");
                    int i11 = data.getInt("data_calling_uid");
                    m mVar = new m(message.replyTo);
                    c cVar = c.this;
                    boolean z10 = false;
                    if (string == null) {
                        cVar.getClass();
                    } else {
                        String[] packagesForUid = cVar.getPackageManager().getPackagesForUid(i11);
                        int length = packagesForUid.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (packagesForUid[i12].equals(string)) {
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    if (z10) {
                        c.this.f5718e.a(new g1.k(i10, i11, bundle, kVar, mVar, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + string);
                case 2:
                    k kVar2 = this.f5748a;
                    c.this.f5718e.a(new g1.l(kVar2, new m(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    k kVar3 = this.f5748a;
                    c.this.f5718e.a(new g1.m(kVar3, new m(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                    return;
                case 4:
                    k kVar4 = this.f5748a;
                    c.this.f5718e.a(new g1.n(kVar4, new m(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                    return;
                case 5:
                    k kVar5 = this.f5748a;
                    String string2 = data.getString("data_media_item_id");
                    android.support.v4.os.a aVar = (android.support.v4.os.a) data.getParcelable("data_result_receiver");
                    m mVar2 = new m(message.replyTo);
                    kVar5.getClass();
                    if (TextUtils.isEmpty(string2) || aVar == null) {
                        return;
                    }
                    c.this.f5718e.a(new o(kVar5, mVar2, string2, aVar));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    k kVar6 = this.f5748a;
                    m mVar3 = new m(message.replyTo);
                    String string3 = data.getString("data_package_name");
                    c.this.f5718e.a(new p(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, kVar6, mVar3, string3));
                    return;
                case 7:
                    k kVar7 = this.f5748a;
                    c.this.f5718e.a(new q(kVar7, new m(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    k kVar8 = this.f5748a;
                    String string4 = data.getString("data_search_query");
                    android.support.v4.os.a aVar2 = (android.support.v4.os.a) data.getParcelable("data_result_receiver");
                    m mVar4 = new m(message.replyTo);
                    kVar8.getClass();
                    if (TextUtils.isEmpty(string4) || aVar2 == null) {
                        return;
                    }
                    c.this.f5718e.a(new r(kVar8, mVar4, string4, bundle4, aVar2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    k kVar9 = this.f5748a;
                    String string5 = data.getString("data_custom_action");
                    android.support.v4.os.a aVar3 = (android.support.v4.os.a) data.getParcelable("data_result_receiver");
                    m mVar5 = new m(message.replyTo);
                    kVar9.getClass();
                    if (TextUtils.isEmpty(string5) || aVar3 == null) {
                        return;
                    }
                    c.this.f5718e.a(new s(kVar9, mVar5, string5, bundle5, aVar3));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (!data.containsKey("data_calling_pid")) {
                    callingPid = -1;
                }
                return super.sendMessageAtTime(message, j10);
            }
            data.putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, j10);
        }
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i10 == -1 && i11 == -1) {
            return list;
        }
        int i12 = i11 * i10;
        int i13 = i12 + i11;
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.emptyList();
        }
        if (i13 > list.size()) {
            i13 = list.size();
        }
        return list.subList(i12, i13);
    }

    public abstract b b(Bundle bundle);

    public void c(Bundle bundle, i iVar, String str) {
        iVar.f5744e = 1;
        d(str, iVar);
    }

    public abstract void d(String str, i<List<MediaBrowserCompat.MediaItem>> iVar);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void e(String str, i<MediaBrowserCompat.MediaItem> iVar) {
        iVar.f5744e = 2;
        iVar.f(null);
    }

    public void f(Bundle bundle, g1.e eVar, String str) {
        eVar.f5744e = 4;
        eVar.f(null);
    }

    public final void g(String str, C0091c c0091c, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, c0091c, str, bundle, bundle2);
        if (bundle == null) {
            d(str, aVar);
        } else {
            c(bundle, aVar, str);
        }
        if (aVar.b()) {
            return;
        }
        StringBuilder l10 = defpackage.f.l("onLoadChildren must call detach() or sendResult() before returning for package=");
        l10.append(c0091c.f5725a);
        l10.append(" id=");
        l10.append(str);
        throw new IllegalStateException(l10.toString());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f5714a.f5733b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        f hVar = i10 >= 28 ? new h(this) : i10 >= 26 ? new g() : new f();
        this.f5714a = hVar;
        hVar.onCreate();
    }
}
