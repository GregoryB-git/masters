package c2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceResponse;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final List<d> f2225a;

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public d2.o f2226a;

        public a(Context context) {
            this.f2226a = new d2.o(context);
        }

        @Override // c2.o.c
        public final WebResourceResponse handle(String str) {
            try {
                d2.o oVar = this.f2226a;
                oVar.getClass();
                String substring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                InputStream open = oVar.f3402a.getAssets().open(substring, 2);
                if (substring.endsWith(".svgz")) {
                    open = new GZIPInputStream(open);
                }
                return new WebResourceResponse(d2.o.b(str), null, open);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f2227b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a, reason: collision with root package name */
        public final File f2228a;

        public b(Context context, File file) {
            try {
                this.f2228a = new File(d2.o.a(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                StringBuilder l10 = defpackage.f.l("Failed to resolve the canonical path for the given directory: ");
                l10.append(file.getPath());
                throw new IllegalArgumentException(l10.toString(), e10);
            }
        }

        public final boolean a(Context context) {
            String a10 = d2.o.a(this.f2228a);
            String a11 = d2.o.a(context.getCacheDir());
            String a12 = d2.o.a(Build.VERSION.SDK_INT >= 24 ? d2.d.e(context) : context.getCacheDir().getParentFile());
            if ((!a10.startsWith(a11) && !a10.startsWith(a12)) || a10.equals(a11) || a10.equals(a12)) {
                return false;
            }
            String[] strArr = f2227b;
            for (int i10 = 0; i10 < 5; i10++) {
                if (a10.startsWith(a12 + strArr[i10])) {
                    return false;
                }
            }
            return true;
        }

        @Override // c2.o.c
        public final WebResourceResponse handle(String str) {
            File file;
            try {
                File file2 = this.f2228a;
                String a10 = d2.o.a(file2);
                String canonicalPath = new File(file2, str).getCanonicalPath();
                file = canonicalPath.startsWith(a10) ? new File(canonicalPath) : null;
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (file == null) {
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f2228a));
                return new WebResourceResponse(null, null, null);
            }
            InputStream fileInputStream = new FileInputStream(file);
            if (file.getPath().endsWith(".svgz")) {
                fileInputStream = new GZIPInputStream(fileInputStream);
            }
            return new WebResourceResponse(d2.o.b(str), null, fileInputStream);
        }
    }

    public interface c {
        WebResourceResponse handle(String str);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2229a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2230b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2231c;

        /* renamed from: d, reason: collision with root package name */
        public final c f2232d;

        public d(String str, String str2, boolean z10, c cVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f2230b = str;
            this.f2231c = str2;
            this.f2229a = z10;
            this.f2232d = cVar;
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public d2.o f2233a;

        public e(Context context) {
            this.f2233a = new d2.o(context);
        }

        @Override // c2.o.c
        public final WebResourceResponse handle(String str) {
            StringBuilder sb2;
            String str2;
            try {
                return new WebResourceResponse(d2.o.b(str), null, this.f2233a.c(str));
            } catch (Resources.NotFoundException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str2 = "Resource not found from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str2 = "Error opening resource from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public o(ArrayList arrayList) {
        this.f2225a = arrayList;
    }

    public final WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        Iterator<d> it = this.f2225a.iterator();
        while (true) {
            c cVar = null;
            if (!it.hasNext()) {
                return null;
            }
            d next = it.next();
            next.getClass();
            if ((!uri.getScheme().equals("http") || next.f2229a) && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(next.f2230b) && uri.getPath().startsWith(next.f2231c))) {
                cVar = next.f2232d;
            }
            if (cVar != null && (handle = cVar.handle(uri.getPath().replaceFirst(next.f2231c, ""))) != null) {
                return handle;
            }
        }
    }
}
