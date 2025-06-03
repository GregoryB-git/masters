package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import k6.a;
import l6.q;
import u7.f;

/* loaded from: classes.dex */
public final class b extends v8.b {

    /* renamed from: a, reason: collision with root package name */
    public final k6.d<a.d.c> f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.b<w7.a> f3121b;

    /* renamed from: c, reason: collision with root package name */
    public final f f3122c;

    public static class a extends IDynamicLinksCallbacks.Stub {
        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void K0(Status status, w8.d dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void m2(Status status, w8.a aVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.firebase.dynamiclinks.internal.b$b, reason: collision with other inner class name */
    public static class BinderC0052b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final TaskCompletionSource<v8.d> f3123a;

        public BinderC0052b(TaskCompletionSource<v8.d> taskCompletionSource) {
            this.f3123a = taskCompletionSource;
        }

        @Override // com.google.firebase.dynamiclinks.internal.b.a, com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public final void K0(Status status, w8.d dVar) {
            a0.K(status, dVar, this.f3123a);
        }
    }

    public static final class c extends q<com.google.firebase.dynamiclinks.internal.a, v8.d> {

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f3124d;

        public c(Bundle bundle) {
            super(null, false, 13202);
            this.f3124d = bundle;
        }

        @Override // l6.q
        public final void a(a.f fVar, TaskCompletionSource taskCompletionSource) {
            com.google.firebase.dynamiclinks.internal.a aVar = (com.google.firebase.dynamiclinks.internal.a) fVar;
            BinderC0052b binderC0052b = new BinderC0052b(taskCompletionSource);
            Bundle bundle = this.f3124d;
            aVar.getClass();
            try {
                ((IDynamicLinksService) aVar.getService()).L(binderC0052b, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public static class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final TaskCompletionSource<v8.c> f3125a;

        /* renamed from: b, reason: collision with root package name */
        public final t9.b<w7.a> f3126b;

        public d(t9.b<w7.a> bVar, TaskCompletionSource<v8.c> taskCompletionSource) {
            this.f3126b = bVar;
            this.f3125a = taskCompletionSource;
        }

        @Override // com.google.firebase.dynamiclinks.internal.b.a, com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public final void m2(Status status, w8.a aVar) {
            Bundle bundle;
            w7.a aVar2;
            a0.K(status, aVar == null ? null : new v8.c(aVar), this.f3125a);
            if (aVar == null || (bundle = aVar.D().getBundle("scionData")) == null || bundle.keySet() == null || (aVar2 = this.f3126b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                aVar2.b("fdl", str, bundle.getBundle(str));
            }
        }
    }

    public static final class e extends q<com.google.firebase.dynamiclinks.internal.a, v8.c> {

        /* renamed from: d, reason: collision with root package name */
        public final String f3127d;

        /* renamed from: e, reason: collision with root package name */
        public final t9.b<w7.a> f3128e;

        public e(t9.b<w7.a> bVar, String str) {
            super(null, false, 13201);
            this.f3127d = str;
            this.f3128e = bVar;
        }

        @Override // l6.q
        public final void a(a.f fVar, TaskCompletionSource taskCompletionSource) {
            com.google.firebase.dynamiclinks.internal.a aVar = (com.google.firebase.dynamiclinks.internal.a) fVar;
            d dVar = new d(this.f3128e, taskCompletionSource);
            String str = this.f3127d;
            aVar.getClass();
            try {
                ((IDynamicLinksService) aVar.getService()).R1(dVar, str);
            } catch (RemoteException unused) {
            }
        }
    }

    public b(f fVar, t9.b<w7.a> bVar) {
        fVar.a();
        this.f3120a = new w8.c(fVar.f15084a);
        this.f3122c = fVar;
        this.f3121b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public static void d(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // v8.b
    public final v8.a a() {
        return new v8.a(this);
    }

    @Override // v8.b
    public final Task<v8.c> b(Intent intent) {
        Task doWrite = this.f3120a.doWrite(new e(this.f3121b, intent != null ? intent.getDataString() : null));
        if (intent == null) {
            return doWrite;
        }
        w8.a aVar = (w8.a) n6.d.a(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", w8.a.CREATOR);
        v8.c cVar = aVar != null ? new v8.c(aVar) : null;
        return cVar != null ? Tasks.forResult(cVar) : doWrite;
    }

    @Override // v8.b
    public final Task<v8.c> c(Uri uri) {
        return this.f3120a.doWrite(new e(this.f3121b, uri.toString()));
    }
}
