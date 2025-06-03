package i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f7349a;

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f7350a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f7350a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f7350a = (InputContentInfo) obj;
        }

        @Override // i0.e.c
        public final Uri a() {
            return this.f7350a.getContentUri();
        }

        @Override // i0.e.c
        public final void b() {
            this.f7350a.requestPermission();
        }

        @Override // i0.e.c
        public final Uri c() {
            return this.f7350a.getLinkUri();
        }

        @Override // i0.e.c
        public final Object d() {
            return this.f7350a;
        }

        @Override // i0.e.c
        public final ClipDescription getDescription() {
            return this.f7350a.getDescription();
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f7351a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f7352b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f7353c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f7351a = uri;
            this.f7352b = clipDescription;
            this.f7353c = uri2;
        }

        @Override // i0.e.c
        public final Uri a() {
            return this.f7351a;
        }

        @Override // i0.e.c
        public final void b() {
        }

        @Override // i0.e.c
        public final Uri c() {
            return this.f7353c;
        }

        @Override // i0.e.c
        public final Object d() {
            return null;
        }

        @Override // i0.e.c
        public final ClipDescription getDescription() {
            return this.f7352b;
        }
    }

    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f7349a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public e(a aVar) {
        this.f7349a = aVar;
    }
}
