package e0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f3752a;

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f3753a;

        public a(ClipData clipData, int i10) {
            this.f3753a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // e0.c.b
        public final void a(Uri uri) {
            this.f3753a.setLinkUri(uri);
        }

        @Override // e0.c.b
        public final void b(int i10) {
            this.f3753a.setFlags(i10);
        }

        @Override // e0.c.b
        public final c build() {
            return new c(new d(this.f3753a.build()));
        }

        @Override // e0.c.b
        public final void setExtras(Bundle bundle) {
            this.f3753a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: e0.c$c, reason: collision with other inner class name */
    public static final class C0066c implements b {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f3754a;

        /* renamed from: b, reason: collision with root package name */
        public int f3755b;

        /* renamed from: c, reason: collision with root package name */
        public int f3756c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f3757d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f3758e;

        public C0066c(ClipData clipData, int i10) {
            this.f3754a = clipData;
            this.f3755b = i10;
        }

        @Override // e0.c.b
        public final void a(Uri uri) {
            this.f3757d = uri;
        }

        @Override // e0.c.b
        public final void b(int i10) {
            this.f3756c = i10;
        }

        @Override // e0.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // e0.c.b
        public final void setExtras(Bundle bundle) {
            this.f3758e = bundle;
        }
    }

    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f3759a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f3759a = contentInfo;
        }

        @Override // e0.c.e
        public final ClipData a() {
            return this.f3759a.getClip();
        }

        @Override // e0.c.e
        public final ContentInfo b() {
            return this.f3759a;
        }

        @Override // e0.c.e
        public final int c() {
            return this.f3759a.getSource();
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("ContentInfoCompat{");
            l10.append(this.f3759a);
            l10.append("}");
            return l10.toString();
        }

        @Override // e0.c.e
        public final int w() {
            return this.f3759a.getFlags();
        }
    }

    public interface e {
        ClipData a();

        ContentInfo b();

        int c();

        int w();
    }

    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f3760a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3761b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3762c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f3763d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f3764e;

        public f(C0066c c0066c) {
            ClipData clipData = c0066c.f3754a;
            clipData.getClass();
            this.f3760a = clipData;
            int i10 = c0066c.f3755b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i10 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f3761b = i10;
            int i11 = c0066c.f3756c;
            if ((i11 & 1) == i11) {
                this.f3762c = i11;
                this.f3763d = c0066c.f3757d;
                this.f3764e = c0066c.f3758e;
            } else {
                StringBuilder l10 = defpackage.f.l("Requested flags 0x");
                l10.append(Integer.toHexString(i11));
                l10.append(", but only 0x");
                l10.append(Integer.toHexString(1));
                l10.append(" are allowed");
                throw new IllegalArgumentException(l10.toString());
            }
        }

        @Override // e0.c.e
        public final ClipData a() {
            return this.f3760a;
        }

        @Override // e0.c.e
        public final ContentInfo b() {
            return null;
        }

        @Override // e0.c.e
        public final int c() {
            return this.f3761b;
        }

        public final String toString() {
            String sb2;
            StringBuilder l10 = defpackage.f.l("ContentInfoCompat{clip=");
            l10.append(this.f3760a.getDescription());
            l10.append(", source=");
            int i10 = this.f3761b;
            l10.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            l10.append(", flags=");
            int i11 = this.f3762c;
            l10.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            if (this.f3763d == null) {
                sb2 = "";
            } else {
                StringBuilder l11 = defpackage.f.l(", hasLinkUri(");
                l11.append(this.f3763d.toString().length());
                l11.append(")");
                sb2 = l11.toString();
            }
            l10.append(sb2);
            return defpackage.g.f(l10, this.f3764e != null ? ", hasExtras" : "", "}");
        }

        @Override // e0.c.e
        public final int w() {
            return this.f3762c;
        }
    }

    public c(e eVar) {
        this.f3752a = eVar;
    }

    public final String toString() {
        return this.f3752a.toString();
    }
}
