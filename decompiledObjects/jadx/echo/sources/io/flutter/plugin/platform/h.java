package io.flutter.plugin.platform;

import D5.o;
import I.X;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.plugin.platform.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f15065a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.o f15066b;

    /* renamed from: c, reason: collision with root package name */
    public final d f15067c;

    /* renamed from: d, reason: collision with root package name */
    public o.j f15068d;

    /* renamed from: e, reason: collision with root package name */
    public int f15069e;

    /* renamed from: f, reason: collision with root package name */
    public final o.h f15070f;

    public class a implements o.h {
        public a() {
        }

        @Override // D5.o.h
        public void a() {
            h.this.t();
        }

        @Override // D5.o.h
        public void f(boolean z7) {
            h.this.w(z7);
        }

        @Override // D5.o.h
        public void g(o.k kVar) {
            h.this.z(kVar);
        }

        @Override // D5.o.h
        public void h(List list) {
            h.this.A(list);
        }

        @Override // D5.o.h
        public void i(o.i iVar) {
            h.this.s(iVar);
        }

        @Override // D5.o.h
        public void j() {
            h.this.y();
        }

        @Override // D5.o.h
        public void k() {
            h.this.u();
        }

        @Override // D5.o.h
        public void l(String str) {
            h.this.v(str);
        }

        @Override // D5.o.h
        public void m(o.c cVar) {
            h.this.x(cVar);
        }

        @Override // D5.o.h
        public void n(o.g gVar) {
            h.this.F(gVar);
        }

        @Override // D5.o.h
        public CharSequence o(o.e eVar) {
            return h.this.r(eVar);
        }

        @Override // D5.o.h
        public void p(int i7) {
            h.this.B(i7);
        }

        @Override // D5.o.h
        public void q(String str) {
            h.this.D(str);
        }

        @Override // D5.o.h
        public boolean r() {
            return h.this.p();
        }

        @Override // D5.o.h
        public void s(o.j jVar) {
            h.this.C(jVar);
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15072a;

        public b(View view) {
            this.f15072a = view;
        }

        public final /* synthetic */ void b(int i7) {
            D5.o oVar;
            boolean z7;
            if ((i7 & 4) == 0) {
                oVar = h.this.f15066b;
                z7 = true;
            } else {
                oVar = h.this.f15066b;
                z7 = false;
            }
            oVar.m(z7);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i7) {
            this.f15072a.post(new Runnable() { // from class: io.flutter.plugin.platform.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.b(i7);
                }
            });
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15074a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15075b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f15076c;

        static {
            int[] iArr = new int[o.d.values().length];
            f15076c = iArr;
            try {
                iArr[o.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15076c[o.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.l.values().length];
            f15075b = iArr2;
            try {
                iArr2[o.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15075b[o.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[o.g.values().length];
            f15074a = iArr3;
            try {
                iArr3[o.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15074a[o.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15074a[o.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15074a[o.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15074a[o.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean a();

        void f(boolean z7);
    }

    public h(Activity activity, D5.o oVar, d dVar) {
        a aVar = new a();
        this.f15070f = aVar;
        this.f15065a = activity;
        this.f15066b = oVar;
        oVar.l(aVar);
        this.f15067c = dVar;
        this.f15069e = 1280;
    }

    public final void A(List list) {
        int i7 = list.size() == 0 ? 5894 : 1798;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int i9 = c.f15075b[((o.l) list.get(i8)).ordinal()];
            if (i9 == 1) {
                i7 &= -5;
            } else if (i9 == 2) {
                i7 &= -515;
            }
        }
        this.f15069e = i7;
        E();
    }

    public final void B(int i7) {
        this.f15065a.setRequestedOrientation(i7);
    }

    public final void C(o.j jVar) {
        Window window = this.f15065a.getWindow();
        X x7 = new X(window, window.getDecorView());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        o.d dVar = jVar.f1350b;
        if (dVar != null) {
            int i8 = c.f15076c[dVar.ordinal()];
            if (i8 == 1) {
                x7.b(true);
            } else if (i8 == 2) {
                x7.b(false);
            }
        }
        Integer num = jVar.f1349a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f1351c;
        if (bool != null && i7 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i7 >= 26) {
            o.d dVar2 = jVar.f1353e;
            if (dVar2 != null) {
                int i9 = c.f15076c[dVar2.ordinal()];
                if (i9 == 1) {
                    x7.a(true);
                } else if (i9 == 2) {
                    x7.a(false);
                }
            }
            Integer num2 = jVar.f1352d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f1354f;
        if (num3 != null && i7 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f1355g;
        if (bool2 != null && i7 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f15068d = jVar;
    }

    public final void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f15065a.startActivity(Intent.createChooser(intent, null));
    }

    public void E() {
        this.f15065a.getWindow().getDecorView().setSystemUiVisibility(this.f15069e);
        o.j jVar = this.f15068d;
        if (jVar != null) {
            C(jVar);
        }
    }

    public void F(o.g gVar) {
        int i7;
        View decorView = this.f15065a.getWindow().getDecorView();
        int i8 = c.f15074a[gVar.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                i9 = 3;
                if (i8 != 3) {
                    i9 = 4;
                    if (i8 == 4) {
                        i7 = 6;
                    } else if (i8 != 5) {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i9);
            return;
        }
        i7 = 0;
        decorView.performHapticFeedback(i7);
    }

    public final boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f15065a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void q() {
        this.f15066b.l(null);
    }

    public final CharSequence r(o.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f15065a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != o.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            AbstractC1995b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            AbstractC1995b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor openTypedAssetFileDescriptor = this.f15065a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f15065a);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        e = e7;
                        charSequence = text;
                        AbstractC1995b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (FileNotFoundException unused) {
                AbstractC1995b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return null;
            } catch (SecurityException e8) {
                AbstractC1995b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e8);
                return null;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public final void s(o.i iVar) {
        if (iVar == o.i.CLICK) {
            this.f15065a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        d dVar = this.f15067c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f15065a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).j().c();
            } else {
                activity.finish();
            }
        }
    }

    public final void u() {
        E();
    }

    public final void v(String str) {
        ((ClipboardManager) this.f15065a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public final void w(boolean z7) {
        d dVar = this.f15067c;
        if (dVar != null) {
            dVar.f(z7);
        }
    }

    public final void x(o.c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f15065a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f1324b, (Bitmap) null, cVar.f1323a));
            return;
        }
        g.a();
        this.f15065a.setTaskDescription(f.a(cVar.f1324b, 0, cVar.f1323a));
    }

    public final void y() {
        View decorView = this.f15065a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    public final void z(o.k kVar) {
        int i7;
        if (kVar == o.k.LEAN_BACK) {
            i7 = 1798;
        } else if (kVar == o.k.IMMERSIVE) {
            i7 = 3846;
        } else if (kVar == o.k.IMMERSIVE_STICKY) {
            i7 = 5894;
        } else if (kVar != o.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i7 = 1792;
        }
        this.f15069e = i7;
        E();
    }
}
