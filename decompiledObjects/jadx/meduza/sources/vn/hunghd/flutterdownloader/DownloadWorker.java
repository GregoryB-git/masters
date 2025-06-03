package vn.hunghd.flutterdownloader;

import android.R;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import d5.n;
import dc.p;
import defpackage.g;
import ec.i;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.messaging.f;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import kc.h;
import lc.k;
import org.json.JSONException;
import org.json.JSONObject;
import sb.j;
import sb.m;
import u.q;
import u.u;
import vn.hunghd.flutterdownloader.DownloadWorker;
import vn.hunghd.flutterdownloader.c;
import x0.q0;

/* loaded from: classes.dex */
public final class DownloadWorker extends Worker implements MethodChannel.MethodCallHandler {
    public static final AtomicBoolean H;
    public static final ArrayDeque<List<Object>> I;
    public static FlutterEngine J;
    public static final ad.c K;
    public String A;
    public String B;
    public String C;
    public String D;
    public long E;
    public int F;
    public boolean G;
    public final Pattern f;

    /* renamed from: o, reason: collision with root package name */
    public final Pattern f16119o;

    /* renamed from: p, reason: collision with root package name */
    public final Pattern f16120p;

    /* renamed from: q, reason: collision with root package name */
    public MethodChannel f16121q;

    /* renamed from: r, reason: collision with root package name */
    public n f16122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16123s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16124u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16125v;

    /* renamed from: w, reason: collision with root package name */
    public int f16126w;

    /* renamed from: x, reason: collision with root package name */
    public int f16127x;

    /* renamed from: y, reason: collision with root package name */
    public String f16128y;

    /* renamed from: z, reason: collision with root package name */
    public String f16129z;

    public static final class a {
        public static final void a() {
            AtomicBoolean atomicBoolean = DownloadWorker.H;
            TrustManager[] trustManagerArr = {new vn.hunghd.flutterdownloader.a()};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                i.d(sSLContext, "getInstance(...)");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ad.c] */
    static {
        new a();
        H = new AtomicBoolean(false);
        I = new ArrayDeque<>();
        K = new HostnameVerifier() { // from class: ad.c
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                AtomicBoolean atomicBoolean = DownloadWorker.H;
                return true;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, "params");
        this.f = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
        this.f16119o = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");
        this.f16120p = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");
        new Handler(context.getMainLooper()).post(new f(2, this, context));
    }

    public static String q(String str) {
        List list;
        String str2;
        if (str != null) {
            String[] strArr = {";"};
            final boolean z10 = false;
            String str3 = strArr[0];
            if (str3.length() == 0) {
                k.x0(0);
                final List j10 = j.j(strArr);
                h hVar = new h(new lc.b(str, 0, 0, new p() { // from class: lc.i
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // dc.p
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        rb.d dVar;
                        Object obj4;
                        List list2 = j10;
                        boolean z11 = z10;
                        CharSequence charSequence = (CharSequence) obj;
                        int intValue = ((Integer) obj2).intValue();
                        ec.i.e(charSequence, "$this$DelimitedRangesSequence");
                        if (z11 || list2.size() != 1) {
                            if (intValue < 0) {
                                intValue = 0;
                            }
                            ic.f fVar = new ic.f(intValue, charSequence.length());
                            if (charSequence instanceof String) {
                                int i10 = fVar.f7955b;
                                int i11 = fVar.f7956c;
                                if ((i11 > 0 && intValue <= i10) || (i11 < 0 && i10 <= intValue)) {
                                    while (true) {
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = it.next();
                                            String str4 = (String) obj4;
                                            if (h.l0(0, intValue, str4.length(), str4, (String) charSequence, z11)) {
                                                break;
                                            }
                                        }
                                        String str5 = (String) obj4;
                                        if (str5 == null) {
                                            if (intValue == i10) {
                                                break;
                                            }
                                            intValue += i11;
                                        } else {
                                            dVar = new rb.d(Integer.valueOf(intValue), str5);
                                            break;
                                        }
                                    }
                                }
                                dVar = null;
                            } else {
                                int i12 = fVar.f7955b;
                                int i13 = fVar.f7956c;
                                if ((i13 > 0 && intValue <= i12) || (i13 < 0 && i12 <= intValue)) {
                                    while (true) {
                                        Iterator it2 = list2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it2.next();
                                            String str6 = (String) obj3;
                                            if (k.w0(str6, charSequence, intValue, str6.length(), z11)) {
                                                break;
                                            }
                                        }
                                        String str7 = (String) obj3;
                                        if (str7 == null) {
                                            if (intValue == i12) {
                                                break;
                                            }
                                            intValue += i13;
                                        } else {
                                            dVar = new rb.d(Integer.valueOf(intValue), str7);
                                            break;
                                        }
                                    }
                                }
                                dVar = null;
                            }
                        } else {
                            int size = list2.size();
                            if (size == 0) {
                                throw new NoSuchElementException("List is empty.");
                            }
                            if (size != 1) {
                                throw new IllegalArgumentException("List has more than one element.");
                            }
                            String str8 = (String) list2.get(0);
                            int s02 = k.s0(charSequence, str8, intValue, false, 4);
                            if (s02 >= 0) {
                                dVar = new rb.d(Integer.valueOf(s02), str8);
                            }
                            dVar = null;
                        }
                        if (dVar != null) {
                            return new rb.d(dVar.f13844a, Integer.valueOf(((String) dVar.f13845b).length()));
                        }
                        return null;
                    }
                }));
                ArrayList arrayList = new ArrayList(m.j(hVar));
                Iterator<Object> it = hVar.iterator();
                while (it.hasNext()) {
                    ic.f fVar = (ic.f) it.next();
                    i.e(fVar, "range");
                    arrayList.add(str.subSequence(Integer.valueOf(fVar.f7954a).intValue(), Integer.valueOf(fVar.f7955b).intValue() + 1).toString());
                }
                list = arrayList;
            } else {
                list = k.y0(0, str, str3, false);
            }
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            if (strArr2 != null && (str2 = strArr2[0]) != null) {
                int length = str2.length() - 1;
                int i10 = 0;
                boolean z11 = false;
                while (i10 <= length) {
                    boolean z12 = i.f(str2.charAt(!z11 ? i10 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        length--;
                    } else if (z12) {
                        i10++;
                    } else {
                        z11 = true;
                    }
                }
                return str2.subSequence(i10, length + 1).toString();
            }
        }
        return null;
    }

    public static boolean u(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        i.d(externalStorageDirectory, "getExternalStorageDirectory(...)");
        if (str != null) {
            String path = externalStorageDirectory.getPath();
            i.d(path, "getPath(...)");
            if (lc.h.n0(str, path)) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(String str) {
        String q10 = q(str);
        return q10 != null && (lc.h.n0(q10, "image/") || lc.h.n0(q10, "video"));
    }

    public static URLConnection x(URL url, Proxy proxy) {
        URLConnection openConnection = proxy != null ? url.openConnection(proxy) : url.openConnection();
        i.d(openConnection, "openConnection(...)");
        return openConnection;
    }

    public final void A(Context context, String str, ad.a aVar, int i10, PendingIntent pendingIntent, boolean z10) {
        int i11;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.f1458b.f1436b.c("callback_handle")));
        String uuid = this.f1458b.f1435a.toString();
        i.d(uuid, "toString(...)");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(aVar.ordinal()));
        arrayList.add(Integer.valueOf(i10));
        AtomicBoolean atomicBoolean = H;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                new Handler(this.f1457a.getMainLooper()).post(new q0(22, this, arrayList));
            } else {
                I.add(arrayList);
            }
        }
        if (this.f16123s) {
            q qVar = new q(context, "FLUTTER_DOWNLOADER_NOTIFICATION");
            qVar.f14825e = q.b(str);
            qVar.f14826g = pendingIntent;
            qVar.d(8, true);
            qVar.d(16, true);
            qVar.f14829j = -1;
            int ordinal = aVar.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        str2 = this.B;
                    } else if (ordinal != 5) {
                        if (ordinal == 6) {
                            str2 = this.C;
                        }
                        qVar.f(0, 0);
                        qVar.d(2, false);
                        i11 = t();
                        qVar.B.icon = i11;
                    } else {
                        str2 = this.A;
                    }
                    qVar.c(str2);
                    qVar.f(0, 0);
                    qVar.d(2, false);
                    qVar.B.icon = R.drawable.stat_sys_download_done;
                }
                str2 = this.D;
                qVar.c(str2);
                qVar.f(0, 0);
                qVar.d(2, false);
                qVar.B.icon = R.drawable.stat_sys_download_done;
            } else if (i10 <= 0) {
                qVar.c(this.f16128y);
                qVar.f(0, 0);
                qVar.d(2, false);
                i11 = t();
                qVar.B.icon = i11;
            } else {
                if (i10 < 100) {
                    qVar.c(this.f16129z);
                    qVar.f(100, i10);
                    qVar.d(2, true);
                    i11 = R.drawable.stat_sys_download;
                    qVar.B.icon = i11;
                }
                str2 = this.D;
                qVar.c(str2);
                qVar.f(0, 0);
                qVar.d(2, false);
                qVar.B.icon = R.drawable.stat_sys_download_done;
            }
            if (System.currentTimeMillis() - this.E < 1000) {
                if (!z10) {
                    w("Update too frequently!!!!, this should be dropped");
                    return;
                }
                w("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            StringBuilder l10 = defpackage.f.l("Update notification: {notificationId: ");
            l10.append(this.f16127x);
            l10.append(", title: ");
            l10.append(str);
            l10.append(", status: ");
            l10.append(aVar);
            l10.append(", progress: ");
            l10.append(i10);
            l10.append('}');
            w(l10.toString());
            new u(context).b(this.f16127x, qVar.a());
            this.E = System.currentTimeMillis();
        }
    }

    @Override // androidx.work.d
    public final void g() {
        ad.b bVar;
        Context context = this.f1457a;
        i.d(context, "getApplicationContext(...)");
        c cVar = c.f16137a;
        this.f16122r = new n(c.a.a(context));
        String d10 = this.f1458b.f1436b.d(WebViewActivity.URL_EXTRA);
        String d11 = this.f1458b.f1436b.d("file_name");
        n nVar = this.f16122r;
        if (nVar != null) {
            String uuid = this.f1458b.f1435a.toString();
            i.d(uuid, "toString(...)");
            bVar = nVar.e(uuid);
        } else {
            bVar = null;
        }
        if (bVar == null || bVar.f395c != ad.a.f387a) {
            return;
        }
        if (d11 == null) {
            d11 = d10;
        }
        ad.a aVar = ad.a.f391e;
        A(context, d11, aVar, -1, null, true);
        n nVar2 = this.f16122r;
        if (nVar2 != null) {
            String uuid2 = this.f1458b.f1435a.toString();
            i.d(uuid2, "toString(...)");
            nVar2.g(uuid2, aVar, this.f16126w);
        }
    }

    @Override // androidx.work.Worker
    public final d.a j() {
        ad.b bVar;
        Object obj;
        boolean z10;
        boolean z11;
        int i10;
        c cVar = c.f16137a;
        this.f16122r = new n(c.a.a(this.f1457a));
        String d10 = this.f1458b.f1436b.d(WebViewActivity.URL_EXTRA);
        if (d10 == null) {
            throw new IllegalArgumentException("Argument 'url' should not be null");
        }
        String d11 = this.f1458b.f1436b.d("file_name");
        String d12 = this.f1458b.f1436b.d("saved_file");
        if (d12 == null) {
            throw new IllegalArgumentException("Argument 'saved_file' should not be null");
        }
        String d13 = this.f1458b.f1436b.d("headers");
        if (d13 == null) {
            throw new IllegalArgumentException("Argument 'headers' should not be null");
        }
        boolean b10 = this.f1458b.f1436b.b("is_resume");
        Object obj2 = this.f1458b.f1436b.f1455a.get("timeout");
        int intValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 15000;
        this.f16124u = this.f1458b.f1436b.b("debug");
        Object obj3 = this.f1458b.f1436b.f1455a.get("step");
        this.F = obj3 instanceof Integer ? ((Integer) obj3).intValue() : 10;
        this.f16125v = this.f1458b.f1436b.b("ignoreSsl");
        Resources resources = this.f1457a.getResources();
        this.f16128y = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_started);
        this.f16129z = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_in_progress);
        this.A = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_canceled);
        this.B = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_failed);
        this.C = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_paused);
        this.D = resources.getString(io.meduza.meduza.R.string.flutter_downloader_notification_complete);
        n nVar = this.f16122r;
        if (nVar != null) {
            String uuid = this.f1458b.f1435a.toString();
            i.d(uuid, "toString(...)");
            bVar = nVar.e(uuid);
        } else {
            bVar = null;
        }
        ad.b bVar2 = bVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DownloadWorker{url=");
        sb2.append(d10);
        sb2.append(",filename=");
        sb2.append(d11);
        sb2.append(",savedDir=");
        sb2.append(d12);
        sb2.append(",header=");
        sb2.append(d13);
        sb2.append(",isResume=");
        sb2.append(b10);
        sb2.append(",status=");
        if (bVar2 == null || (obj = bVar2.f395c) == null) {
            obj = "GONE";
        }
        sb2.append(obj);
        w(sb2.toString());
        if (bVar2 == null || bVar2.f395c == ad.a.f391e) {
            return new d.a.c();
        }
        this.f16123s = this.f1458b.f1436b.b("show_notification");
        this.t = this.f1458b.f1436b.b("open_file_from_notification");
        this.G = this.f1458b.f1436b.b("save_in_public_storage");
        this.f16127x = bVar2.f393a;
        Context context = this.f1457a;
        i.d(context, "getApplicationContext(...)");
        if (this.f16123s && (i10 = Build.VERSION.SDK_INT) >= 26) {
            Resources resources2 = this.f1457a.getResources();
            String string = resources2.getString(io.meduza.meduza.R.string.flutter_downloader_notification_channel_name);
            i.d(string, "getString(...)");
            String string2 = resources2.getString(io.meduza.meduza.R.string.flutter_downloader_notification_channel_description);
            i.d(string2, "getString(...)");
            z10 = b10;
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound(null, null);
            u uVar = new u(context);
            if (i10 >= 26) {
                u.b.a(uVar.f14855b, notificationChannel);
            }
        } else {
            z10 = b10;
        }
        Context context2 = this.f1457a;
        i.d(context2, "getApplicationContext(...)");
        String str = d11 == null ? d10 : d11;
        ad.a aVar = ad.a.f388b;
        int i11 = intValue;
        A(context2, str, aVar, bVar2.f396d, null, false);
        n nVar2 = this.f16122r;
        if (nVar2 != null) {
            String uuid2 = this.f1458b.f1435a.toString();
            i.d(uuid2, "toString(...)");
            nVar2.g(uuid2, aVar, bVar2.f396d);
        }
        if (new File(g.f(defpackage.f.l(d12), File.separator, d11)).exists()) {
            w("exists file for " + d11 + "automatic resuming...");
            z11 = true;
        } else {
            z11 = z10;
        }
        try {
            Context context3 = this.f1457a;
            i.d(context3, "getApplicationContext(...)");
            o(context3, d10, d12, d11, d13, z11, i11);
            l();
            this.f16122r = null;
            return new d.a.c();
        } catch (Exception e10) {
            Context context4 = this.f1457a;
            i.d(context4, "getApplicationContext(...)");
            String str2 = d11 == null ? d10 : d11;
            ad.a aVar2 = ad.a.f390d;
            A(context4, str2, aVar2, -1, null, true);
            n nVar3 = this.f16122r;
            if (nVar3 != null) {
                String uuid3 = this.f1458b.f1435a.toString();
                i.d(uuid3, "toString(...)");
                nVar3.g(uuid3, aVar2, this.f16126w);
            }
            e10.printStackTrace();
            this.f16122r = null;
            return new d.a.C0024a();
        }
    }

    public final void k(String str, String str2, String str3) {
        ContentValues contentValues;
        ContentResolver contentResolver;
        Uri uri;
        if (str3 == null || str2 == null || str == null) {
            return;
        }
        if (lc.h.n0(str3, "image/")) {
            contentValues = new ContentValues();
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("description", "");
            contentValues.put("mime_type", str3);
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("_data", str2);
            w("insert " + contentValues + " to MediaStore");
            contentResolver = this.f1457a.getContentResolver();
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (!lc.h.n0(str3, "video")) {
                return;
            }
            contentValues = new ContentValues();
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("description", "");
            contentValues.put("mime_type", str3);
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("_data", str2);
            w("insert " + contentValues + " to MediaStore");
            contentResolver = this.f1457a.getContentResolver();
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        contentResolver.insert(uri, contentValues);
    }

    public final void l() {
        n nVar = this.f16122r;
        i.b(nVar);
        String uuid = this.f1458b.f1435a.toString();
        i.d(uuid, "toString(...)");
        ad.b e10 = nVar.e(uuid);
        if (e10 == null || e10.f395c == ad.a.f389c || e10.f401j) {
            return;
        }
        String str = e10.f;
        if (str == null) {
            String str2 = e10.f397e;
            str = str2.substring(k.u0(str2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 6) + 1, e10.f397e.length());
            i.d(str, "substring(...)");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e10.f398g);
        File file = new File(g.f(sb2, File.separator, str));
        if (file.exists()) {
            file.delete();
        }
    }

    public final File m(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            if (!this.f16124u) {
                return null;
            }
            Log.e("DownloadWorker", "It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            if (!this.f16124u) {
                return null;
            }
            Log.e("DownloadWorker", "Create a file using java.io API failed ");
            return null;
        }
    }

    public final Uri n(String str, String str2) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        i.d(uri, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return this.f1457a.getContentResolver().insert(uri, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!this.f16124u) {
                return null;
            }
            Log.e("DownloadWorker", "Create a file using MediaStore API failed.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0622 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2 A[Catch: all -> 0x011d, IOException -> 0x0122, TryCatch #31 {IOException -> 0x0122, blocks: (B:348:0x0116, B:138:0x015b, B:142:0x01aa, B:144:0x01c6, B:149:0x01d2, B:151:0x01d9, B:156:0x01e5, B:173:0x0224), top: B:347:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5 A[Catch: all -> 0x011d, IOException -> 0x0122, TRY_LEAVE, TryCatch #31 {IOException -> 0x0122, blocks: (B:348:0x0116, B:138:0x015b, B:142:0x01aa, B:144:0x01c6, B:149:0x01d2, B:151:0x01d9, B:156:0x01e5, B:173:0x0224), top: B:347:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[Catch: all -> 0x05b3, IOException -> 0x05ba, TRY_LEAVE, TryCatch #38 {IOException -> 0x05ba, all -> 0x05b3, blocks: (B:3:0x000f, B:5:0x0013, B:7:0x0026, B:8:0x002c, B:10:0x0039, B:15:0x0045), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x05ad, IOException -> 0x05b0, TryCatch #35 {IOException -> 0x05b0, all -> 0x05ad, blocks: (B:18:0x0065, B:20:0x006b, B:23:0x0085, B:26:0x009a, B:28:0x00b6, B:355:0x00c2, B:356:0x00e7, B:357:0x00c7, B:359:0x00e0, B:361:0x05a5, B:362:0x05ac, B:364:0x0074), top: B:17:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: all -> 0x05ad, IOException -> 0x05b0, TRY_LEAVE, TryCatch #35 {IOException -> 0x05b0, all -> 0x05ad, blocks: (B:18:0x0065, B:20:0x006b, B:23:0x0085, B:26:0x009a, B:28:0x00b6, B:355:0x00c2, B:356:0x00e7, B:357:0x00c7, B:359:0x00e0, B:361:0x05a5, B:362:0x05ac, B:364:0x0074), top: B:17:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037c A[Catch: all -> 0x045d, IOException -> 0x0460, TryCatch #28 {IOException -> 0x0460, all -> 0x045d, blocks: (B:220:0x031d, B:234:0x0345, B:236:0x0351, B:237:0x0362, B:239:0x0368, B:241:0x0371, B:242:0x0376, B:244:0x037c, B:246:0x0385, B:247:0x038d, B:249:0x039c, B:251:0x03a2, B:253:0x03a8, B:255:0x03ae, B:256:0x03b5, B:275:0x03dc, B:277:0x03f0, B:280:0x040d, B:281:0x042d, B:284:0x0454, B:289:0x0418, B:291:0x0388, B:292:0x038b), top: B:219:0x031d }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039c A[Catch: all -> 0x045d, IOException -> 0x0460, TryCatch #28 {IOException -> 0x0460, all -> 0x045d, blocks: (B:220:0x031d, B:234:0x0345, B:236:0x0351, B:237:0x0362, B:239:0x0368, B:241:0x0371, B:242:0x0376, B:244:0x037c, B:246:0x0385, B:247:0x038d, B:249:0x039c, B:251:0x03a2, B:253:0x03a8, B:255:0x03ae, B:256:0x03b5, B:275:0x03dc, B:277:0x03f0, B:280:0x040d, B:281:0x042d, B:284:0x0454, B:289:0x0418, B:291:0x0388, B:292:0x038b), top: B:219:0x031d }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x038b A[Catch: all -> 0x045d, IOException -> 0x0460, TryCatch #28 {IOException -> 0x0460, all -> 0x045d, blocks: (B:220:0x031d, B:234:0x0345, B:236:0x0351, B:237:0x0362, B:239:0x0368, B:241:0x0371, B:242:0x0376, B:244:0x037c, B:246:0x0385, B:247:0x038d, B:249:0x039c, B:251:0x03a2, B:253:0x03a8, B:255:0x03ae, B:256:0x03b5, B:275:0x03dc, B:277:0x03f0, B:280:0x040d, B:281:0x042d, B:284:0x0454, B:289:0x0418, B:291:0x0388, B:292:0x038b), top: B:219:0x031d }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0074 A[Catch: all -> 0x05ad, IOException -> 0x05b0, TryCatch #35 {IOException -> 0x05b0, all -> 0x05ad, blocks: (B:18:0x0065, B:20:0x006b, B:23:0x0085, B:26:0x009a, B:28:0x00b6, B:355:0x00c2, B:356:0x00e7, B:357:0x00c7, B:359:0x00e0, B:361:0x05a5, B:362:0x05ac, B:364:0x0074), top: B:17:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.content.Context r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, int r33) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.o(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        i.e(methodCall, "call");
        i.e(result, "result");
        if (!methodCall.method.equals("didInitializeDispatcher")) {
            result.notImplemented();
            return;
        }
        synchronized (H) {
            while (true) {
                ArrayDeque<List<Object>> arrayDeque = I;
                if (arrayDeque.isEmpty()) {
                    H.set(true);
                    result.success(null);
                    rb.h hVar = rb.h.f13851a;
                } else {
                    MethodChannel methodChannel = this.f16121q;
                    if (methodChannel != null) {
                        methodChannel.invokeMethod("", arrayDeque.remove());
                    }
                }
            }
        }
    }

    public final String p(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = i.f(group.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = group.subSequence(i10, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale locale = Locale.US;
        i.d(locale, "US");
        String upperCase = obj.toUpperCase(locale);
        i.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f16120p.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f16119o.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 != null) {
                Locale locale = Locale.US;
                i.d(locale, "US");
                String upperCase = group2.toUpperCase(locale);
                i.d(upperCase, "toUpperCase(...)");
                str2 = upperCase;
            } else {
                str2 = null;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    public final String s(Uri uri) {
        try {
            Cursor query = this.f1457a.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query == null) {
                x6.b.L(query, null);
                return null;
            }
            try {
                String string = !query.moveToFirst() ? null : query.getString(query.getColumnIndexOrThrow("_data"));
                x6.b.L(query, null);
                return string;
            } finally {
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            if (this.f16124u) {
                Log.e("DownloadWorker", "Get a path for a MediaStore failed");
            }
            return null;
        }
    }

    public final int t() {
        try {
            ApplicationInfo applicationInfo = this.f1457a.getPackageManager().getApplicationInfo(this.f1457a.getPackageName(), 128);
            i.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final void w(String str) {
        if (this.f16124u) {
            Log.d("DownloadWorker", str);
        }
    }

    public final void y(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            w("Headers = " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                i.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final long z(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(g.f(defpackage.f.l(str2), File.separator, str)).length();
        w("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }
}
