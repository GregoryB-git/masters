package c2;

import android.webkit.WebSettings;
import b1.v;
import d2.a;
import d2.i0;
import d2.j0;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class n {
    public static v a(WebSettings webSettings) {
        return new v((WebSettingsBoundaryInterface) zc.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j0.a.f3389a.f3363b).convertSettings(webSettings)));
    }

    public static void b(WebSettings webSettings, int i10) {
        a.c cVar = i0.f3366c;
        if (cVar.c()) {
            d2.d.o(webSettings, i10);
        } else {
            if (!cVar.d()) {
                throw i0.a();
            }
            ((WebSettingsBoundaryInterface) a(webSettings).f1801a).setDisabledActionModeMenuItems(i10);
        }
    }

    @Deprecated
    public static void c(WebSettings webSettings, int i10) {
        a.h hVar = i0.G;
        if (hVar.c()) {
            d2.m.d(webSettings, i10);
        } else {
            if (!hVar.d()) {
                throw i0.a();
            }
            ((WebSettingsBoundaryInterface) a(webSettings).f1801a).setForceDark(i10);
        }
    }

    public static void d(WebSettings webSettings, boolean z10) {
        a.e eVar = i0.f3365b;
        if (eVar.c()) {
            d2.f.e(webSettings, z10);
        } else {
            if (!eVar.d()) {
                throw i0.a();
            }
            ((WebSettingsBoundaryInterface) a(webSettings).f1801a).setSafeBrowsingEnabled(z10);
        }
    }
}
