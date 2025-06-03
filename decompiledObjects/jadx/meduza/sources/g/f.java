package g;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import g.g;
import g.p;
import g.r;
import j.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static r.a f5545a = new r.a(new r.b());

    /* renamed from: b, reason: collision with root package name */
    public static int f5546b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static a0.i f5547c = null;

    /* renamed from: d, reason: collision with root package name */
    public static a0.i f5548d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f5549e = null;
    public static boolean f = false;

    /* renamed from: o, reason: collision with root package name */
    public static final r.d<WeakReference<f>> f5550o = new r.d<>();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f5551p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final Object f5552q = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean m(Context context) {
        if (f5549e == null) {
            try {
                int i10 = p.f5634a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) p.class), Build.VERSION.SDK_INT >= 24 ? p.a.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f5549e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f5549e = Boolean.FALSE;
            }
        }
        return f5549e.booleanValue();
    }

    public static void v(f fVar) {
        synchronized (f5551p) {
            Iterator<WeakReference<f>> it = f5550o.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(Toolbar toolbar);

    public void B(int i10) {
    }

    public abstract void C(CharSequence charSequence);

    public abstract j.a D(a.InterfaceC0121a interfaceC0121a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public Context f() {
        return null;
    }

    public abstract g.b g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract g.a j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract boolean w(int i10);

    public abstract void x(int i10);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);
}
