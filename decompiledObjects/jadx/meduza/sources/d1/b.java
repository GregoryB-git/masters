package d1;

import android.os.Bundle;
import b1.o;
import b1.o0;
import b1.q0;
import b1.s0;
import b1.w;
import b1.x;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import d1.a;
import defpackage.g;
import e1.a;
import e1.b;
import h6.e;
import h6.s;
import java.io.PrintWriter;
import r.i;

/* loaded from: classes.dex */
public final class b extends d1.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f3332a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3333b;

    public static class a<D> extends w<D> implements b.a<D> {

        /* renamed from: c, reason: collision with root package name */
        public final e1.b<D> f3336c;

        /* renamed from: d, reason: collision with root package name */
        public o f3337d;

        /* renamed from: e, reason: collision with root package name */
        public C0060b<D> f3338e;

        /* renamed from: a, reason: collision with root package name */
        public final int f3334a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f3335b = null;
        public e1.b<D> f = null;

        public a(e eVar) {
            this.f3336c = eVar;
            if (eVar.f3861b != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            eVar.f3861b = this;
            eVar.f3860a = 0;
        }

        public final void a() {
            o oVar = this.f3337d;
            C0060b<D> c0060b = this.f3338e;
            if (oVar == null || c0060b == null) {
                return;
            }
            super.removeObserver(c0060b);
            observe(oVar, c0060b);
        }

        @Override // b1.t
        public final void onActive() {
            e1.b<D> bVar = this.f3336c;
            bVar.f3862c = true;
            bVar.f3864e = false;
            bVar.f3863d = false;
            e eVar = (e) bVar;
            eVar.f7157j.drainPermits();
            eVar.a();
            eVar.f3858h = new a.RunnableC0067a();
            eVar.b();
        }

        @Override // b1.t
        public final void onInactive() {
            this.f3336c.f3862c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b1.t
        public final void removeObserver(x<? super D> xVar) {
            super.removeObserver(xVar);
            this.f3337d = null;
            this.f3338e = null;
        }

        @Override // b1.w, b1.t
        public final void setValue(D d10) {
            super.setValue(d10);
            e1.b<D> bVar = this.f;
            if (bVar != null) {
                bVar.f3864e = true;
                bVar.f3862c = false;
                bVar.f3863d = false;
                bVar.f = false;
                this.f = null;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f3334a);
            sb2.append(" : ");
            Class<?> cls = this.f3336c.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: d1.b$b, reason: collision with other inner class name */
    public static class C0060b<D> implements x<D> {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0059a<D> f3339a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3340b = false;

        public C0060b(e1.b bVar, s sVar) {
            this.f3339a = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b1.x
        public final void a(D d10) {
            this.f3340b = true;
            s sVar = (s) this.f3339a;
            sVar.getClass();
            SignInHubActivity signInHubActivity = sVar.f7170a;
            signInHubActivity.setResult(signInHubActivity.f2805d, signInHubActivity.f2806e);
            sVar.f7170a.finish();
        }

        public final String toString() {
            return this.f3339a.toString();
        }
    }

    public static class c extends o0 {
        public static final a f = new a();

        /* renamed from: d, reason: collision with root package name */
        public i<a> f3341d = new i<>();

        /* renamed from: e, reason: collision with root package name */
        public boolean f3342e = false;

        public static class a implements q0.b {
            @Override // b1.q0.b
            public final <T extends o0> T a(Class<T> cls) {
                return new c();
            }

            @Override // b1.q0.b
            public final o0 b(Class cls, c1.b bVar) {
                return a(cls);
            }
        }

        @Override // b1.o0
        public final void b() {
            int i10 = this.f3341d.f13504c;
            for (int i11 = 0; i11 < i10; i11++) {
                a aVar = (a) this.f3341d.f13503b[i11];
                aVar.f3336c.a();
                aVar.f3336c.f3863d = true;
                C0060b<D> c0060b = aVar.f3338e;
                if (c0060b != 0) {
                    aVar.removeObserver(c0060b);
                    if (c0060b.f3340b) {
                        c0060b.f3339a.getClass();
                    }
                }
                e1.b<D> bVar = aVar.f3336c;
                Object obj = bVar.f3861b;
                if (obj == null) {
                    throw new IllegalStateException("No listener register");
                }
                if (obj != aVar) {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
                bVar.f3861b = null;
                bVar.f3864e = true;
                bVar.f3862c = false;
                bVar.f3863d = false;
                bVar.f = false;
            }
            i<a> iVar = this.f3341d;
            int i12 = iVar.f13504c;
            Object[] objArr = iVar.f13503b;
            for (int i13 = 0; i13 < i12; i13++) {
                objArr[i13] = null;
            }
            iVar.f13504c = 0;
        }
    }

    public b(o oVar, s0 s0Var) {
        this.f3332a = oVar;
        this.f3333b = (c) new q0(s0Var, c.f).a(c.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        String str2;
        c cVar = this.f3333b;
        if (cVar.f3341d.f13504c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str3 = str + "    ";
        int i10 = 0;
        while (true) {
            i<a> iVar = cVar.f3341d;
            if (i10 >= iVar.f13504c) {
                return;
            }
            a aVar = (a) iVar.f13503b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f3341d.f13502a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(aVar.f3334a);
            printWriter.print(" mArgs=");
            printWriter.println(aVar.f3335b);
            printWriter.print(str3);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f3336c);
            Object obj = aVar.f3336c;
            String d10 = g.d(str3, "  ");
            e1.a aVar2 = (e1.a) obj;
            aVar2.getClass();
            printWriter.print(d10);
            printWriter.print("mId=");
            printWriter.print(aVar2.f3860a);
            printWriter.print(" mListener=");
            printWriter.println(aVar2.f3861b);
            if (aVar2.f3862c || aVar2.f) {
                printWriter.print(d10);
                printWriter.print("mStarted=");
                printWriter.print(aVar2.f3862c);
                printWriter.print(" mContentChanged=");
                printWriter.print(aVar2.f);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (aVar2.f3863d || aVar2.f3864e) {
                printWriter.print(d10);
                printWriter.print("mAbandoned=");
                printWriter.print(aVar2.f3863d);
                printWriter.print(" mReset=");
                printWriter.println(aVar2.f3864e);
            }
            if (aVar2.f3858h != null) {
                printWriter.print(d10);
                printWriter.print("mTask=");
                printWriter.print(aVar2.f3858h);
                printWriter.print(" waiting=");
                aVar2.f3858h.getClass();
                printWriter.println(false);
            }
            if (aVar2.f3859i != null) {
                printWriter.print(d10);
                printWriter.print("mCancellingTask=");
                printWriter.print(aVar2.f3859i);
                printWriter.print(" waiting=");
                aVar2.f3859i.getClass();
                printWriter.println(false);
            }
            if (aVar.f3338e != null) {
                printWriter.print(str3);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f3338e);
                C0060b<D> c0060b = aVar.f3338e;
                c0060b.getClass();
                printWriter.print(str3 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(c0060b.f3340b);
            }
            printWriter.print(str3);
            printWriter.print("mData=");
            Object obj2 = aVar.f3336c;
            D value = aVar.getValue();
            obj2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (value == 0) {
                str2 = "null";
            } else {
                Class<?> cls = value.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                str2 = "}";
            }
            sb2.append(str2);
            printWriter.println(sb2.toString());
            printWriter.print(str3);
            printWriter.print("mStarted=");
            printWriter.println(aVar.hasActiveObservers());
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f3332a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
