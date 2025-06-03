package d2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c2.C0819b;
import d2.d;
import e2.AbstractC1242a;
import e2.AbstractC1251j;
import e2.AbstractC1252k;
import e2.AbstractC1253l;
import e2.AbstractC1254m;
import e2.AbstractC1255n;
import e2.AbstractC1256o;
import e2.EnumC1257p;
import f2.h;
import f2.i;
import g2.f;
import g2.g;
import g2.m;
import j2.AbstractC1370a;
import j4.C1376b;
import j4.InterfaceC1375a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k2.AbstractC1461b;
import k2.InterfaceC1460a;
import k2.InterfaceC1462c;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1375a f13126a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f13127b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f13128c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f13129d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1791a f13130e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1791a f13131f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13132g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f13133a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1251j f13134b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13135c;

        public a(URL url, AbstractC1251j abstractC1251j, String str) {
            this.f13133a = url;
            this.f13134b = abstractC1251j;
            this.f13135c = str;
        }

        public a a(URL url) {
            return new a(url, this.f13134b, this.f13135c);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13136a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f13137b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13138c;

        public b(int i7, URL url, long j7) {
            this.f13136a = i7;
            this.f13137b = url;
            this.f13138c = j7;
        }
    }

    public d(Context context, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2) {
        this(context, interfaceC1791a, interfaceC1791a2, 130000);
    }

    public static int f(NetworkInfo networkInfo) {
        AbstractC1256o.b bVar;
        if (networkInfo == null) {
            bVar = AbstractC1256o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (AbstractC1256o.b.c(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = AbstractC1256o.b.COMBINED;
        }
        return bVar.e();
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC1256o.c.NONE.e() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            AbstractC1370a.d("CctTransportBackend", "Unable to find version code for package", e7);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f13137b;
        if (url == null) {
            return null;
        }
        AbstractC1370a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f13137b);
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Invalid url: " + str, e7);
        }
    }

    @Override // g2.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f13127b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f13128c).getSimOperator()).c("application_build", Integer.toString(h(this.f13128c))).d();
    }

    @Override // g2.m
    public g b(f fVar) {
        AbstractC1251j i7 = i(fVar);
        URL url = this.f13129d;
        if (fVar.c() != null) {
            try {
                C1205a c7 = C1205a.c(fVar.c());
                r3 = c7.e() != null ? c7.e() : null;
                if (c7.f() != null) {
                    url = n(c7.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC1461b.a(5, new a(url, i7, r3), new InterfaceC1460a() { // from class: d2.b
                @Override // k2.InterfaceC1460a
                public final Object apply(Object obj) {
                    d.b e7;
                    e7 = d.this.e((d.a) obj);
                    return e7;
                }
            }, new InterfaceC1462c() { // from class: d2.c
                @Override // k2.InterfaceC1462c
                public final Object a(Object obj, Object obj2) {
                    d.a l7;
                    l7 = d.l((d.a) obj, (d.b) obj2);
                    return l7;
                }
            });
            int i8 = bVar.f13136a;
            if (i8 == 200) {
                return g.e(bVar.f13138c);
            }
            if (i8 < 500 && i8 != 404) {
                return i8 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e7) {
            AbstractC1370a.d("CctTransportBackend", "Could not make request to the backend", e7);
            return g.f();
        }
    }

    public final b e(a aVar) {
        AbstractC1370a.f("CctTransportBackend", "Making request to: %s", aVar.f13133a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13133a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13132g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13135c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f13126a.b(aVar.f13134b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC1370a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC1370a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC1370a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m7 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC1255n.b(new BufferedReader(new InputStreamReader(m7))).c());
                            if (m7 != null) {
                                m7.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C1376b e7) {
            e = e7;
            AbstractC1370a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            AbstractC1370a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            AbstractC1370a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            AbstractC1370a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final AbstractC1251j i(f fVar) {
        AbstractC1253l.a j7;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j8 = iVar.j();
            if (hashMap.containsKey(j8)) {
                ((List) hashMap.get(j8)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j8, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            AbstractC1254m.a b7 = AbstractC1254m.a().f(EnumC1257p.DEFAULT).g(this.f13131f.a()).h(this.f13130e.a()).b(AbstractC1252k.a().c(AbstractC1252k.b.ANDROID_FIREBASE).b(AbstractC1242a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b7.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b7.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e7 = iVar3.e();
                C0819b b8 = e7.b();
                if (b8.equals(C0819b.b("proto"))) {
                    j7 = AbstractC1253l.j(e7.a());
                } else if (b8.equals(C0819b.b("json"))) {
                    j7 = AbstractC1253l.i(new String(e7.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC1370a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b8);
                }
                j7.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(AbstractC1256o.a().c(AbstractC1256o.c.c(iVar3.g("net-type"))).b(AbstractC1256o.b.c(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j7.b(iVar3.d());
                }
                arrayList3.add(j7.a());
            }
            b7.c(arrayList3);
            arrayList2.add(b7.a());
        }
        return AbstractC1251j.a(arrayList2);
    }

    public d(Context context, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, int i7) {
        this.f13126a = AbstractC1251j.b();
        this.f13128c = context;
        this.f13127b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13129d = n(C1205a.f13117c);
        this.f13130e = interfaceC1791a2;
        this.f13131f = interfaceC1791a;
        this.f13132g = i7;
    }
}
