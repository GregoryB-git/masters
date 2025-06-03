package vn.hunghd.flutterdownloader;

import ad.d;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import d5.n;
import defpackage.f;
import defpackage.g;
import ec.i;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import lc.k;
import o2.j;
import o2.l;
import o2.q;
import p2.k0;
import rb.h;
import sb.u;
import vn.hunghd.flutterdownloader.c;
import x2.s;

/* loaded from: classes.dex */
public final class b implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f16130a;

    /* renamed from: b, reason: collision with root package name */
    public n f16131b;

    /* renamed from: c, reason: collision with root package name */
    public Context f16132c;

    /* renamed from: d, reason: collision with root package name */
    public long f16133d;

    /* renamed from: e, reason: collision with root package name */
    public int f16134e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public int f16135o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f16136p = new Object();

    public static Object c(MethodCall methodCall, String str) {
        Object argument = methodCall.argument(str);
        if (argument != null) {
            return argument;
        }
        throw new IllegalArgumentException(g.e("Required key '", str, "' was null").toString());
    }

    public final q a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15, String str5) {
        l.a aVar = new l.a(DownloadWorker.class);
        aVar.f11750c.f16838j = new o2.c(z15 ? 2 : 3, false, false, false, z13, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? sb.q.x(new LinkedHashSet()) : u.f14326a);
        aVar.f11751d.add("flutter_download_task");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e(timeUnit, "timeUnit");
        aVar.f11748a = true;
        s sVar = aVar.f11750c;
        sVar.f16840l = 1;
        long millis = timeUnit.toMillis(10L);
        if (millis > 18000000) {
            j.d().g(s.f16829x, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            j.d().g(s.f16829x, "Backoff delay duration less than minimum value");
        }
        sVar.f16841m = ic.g.N(millis, 10000L, 18000000L);
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put("saved_file", str2);
        hashMap.put("file_name", str3);
        hashMap.put("headers", str4);
        hashMap.put("show_notification", Boolean.valueOf(z10));
        hashMap.put("open_file_from_notification", Boolean.valueOf(z11));
        hashMap.put("is_resume", Boolean.valueOf(z12));
        hashMap.put("callback_handle", Long.valueOf(this.f16133d));
        hashMap.put("step", Integer.valueOf(this.f16134e));
        hashMap.put("debug", Boolean.valueOf(this.f == 1));
        hashMap.put("ignoreSsl", Boolean.valueOf(this.f16135o == 1));
        hashMap.put("save_in_public_storage", Boolean.valueOf(z14));
        hashMap.put("timeout", Integer.valueOf(i10));
        hashMap.put("proxy", str5);
        androidx.work.c cVar = new androidx.work.c(hashMap);
        androidx.work.c.e(cVar);
        aVar.f11750c.f16834e = cVar;
        return aVar.a();
    }

    public final void b(File file) {
        String[] strArr = {"_id"};
        String[] strArr2 = {file.getAbsolutePath()};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        i.d(uri, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = d().getContentResolver();
        i.d(contentResolver, "getContentResolver(...)");
        Cursor query = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                i.d(withAppendedId, "withAppendedId(...)");
                contentResolver.delete(withAppendedId, null, null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            i.d(withAppendedId2, "withAppendedId(...)");
            contentResolver.delete(withAppendedId2, null, null);
        }
        if (query != null) {
            query.close();
        }
    }

    public final Context d() {
        Context context = this.f16132c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void e(String str, ad.a aVar, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(aVar.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        MethodChannel methodChannel = this.f16130a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("updateProgress", hashMap);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        synchronized (this.f16136p) {
            if (this.f16130a == null) {
                this.f16132c = applicationContext;
                MethodChannel methodChannel = new MethodChannel(binaryMessenger, "vn.hunghd/downloader");
                this.f16130a = methodChannel;
                methodChannel.setMethodCallHandler(this);
                c cVar = c.f16137a;
                this.f16131b = new n(c.a.a(this.f16132c));
                h hVar = h.f13851a;
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        this.f16132c = null;
        MethodChannel methodChannel = this.f16130a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f16130a = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        Object obj;
        String str2;
        String str3;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        b bVar = this;
        i.e(methodCall, "call");
        i.e(result, "result");
        String str4 = methodCall.method;
        if (str4 != null) {
            String str5 = "status";
            String str6 = "saved_dir";
            switch (str4.hashCode()) {
                case -1594257912:
                    if (str4.equals("enqueue")) {
                        String str7 = (String) c(methodCall, WebViewActivity.URL_EXTRA);
                        String str8 = (String) c(methodCall, "saved_dir");
                        String str9 = (String) methodCall.argument("file_name");
                        String str10 = (String) c(methodCall, "headers");
                        int intValue = ((Number) c(methodCall, "timeout")).intValue();
                        boolean booleanValue = ((Boolean) c(methodCall, "show_notification")).booleanValue();
                        boolean booleanValue2 = ((Boolean) c(methodCall, "open_file_from_notification")).booleanValue();
                        boolean booleanValue3 = ((Boolean) c(methodCall, "requires_storage_not_low")).booleanValue();
                        boolean booleanValue4 = ((Boolean) c(methodCall, "save_in_public_storage")).booleanValue();
                        boolean booleanValue5 = ((Boolean) c(methodCall, "allow_cellular")).booleanValue();
                        q a10 = a(str7, str8, str9, str10, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5, (String) methodCall.argument("proxy"));
                        k0.d(d()).a(a10);
                        String uuid = a10.f11745a.toString();
                        i.d(uuid, "toString(...)");
                        result.success(uuid);
                        e(uuid, ad.a.f387a, 0);
                        n nVar = this.f16131b;
                        i.b(nVar);
                        SQLiteDatabase writableDatabase = ((c) nVar.f3532b).getWritableDatabase();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("task_id", uuid);
                        contentValues.put(WebViewActivity.URL_EXTRA, str7);
                        contentValues.put("status", (Integer) 1);
                        contentValues.put("progress", (Integer) 0);
                        contentValues.put("file_name", str9);
                        contentValues.put("saved_dir", str8);
                        contentValues.put("headers", str10);
                        contentValues.put("mime_type", "unknown");
                        contentValues.put("show_notification", Integer.valueOf(booleanValue ? 1 : 0));
                        contentValues.put("open_file_from_notification", Integer.valueOf(booleanValue2 ? 1 : 0));
                        contentValues.put("resumable", (Integer) 0);
                        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("save_in_public_storage", Integer.valueOf(booleanValue4 ? 1 : 0));
                        contentValues.put("allow_cellular", Integer.valueOf(booleanValue5 ? 1 : 0));
                        writableDatabase.beginTransaction();
                        try {
                            try {
                                writableDatabase.insertWithOnConflict("task", null, contentValues, 5);
                                writableDatabase.setTransactionSuccessful();
                            } finally {
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        return;
                    }
                    break;
                case -1367724422:
                    if (str4.equals("cancel")) {
                        k0.d(d()).c(UUID.fromString((String) c(methodCall, "task_id")));
                        result.success(null);
                        break;
                    }
                    break;
                case -934610812:
                    if (str4.equals("remove")) {
                        String str11 = (String) c(methodCall, "task_id");
                        boolean booleanValue6 = ((Boolean) c(methodCall, "should_delete_content")).booleanValue();
                        n nVar2 = bVar.f16131b;
                        i.b(nVar2);
                        ad.b e11 = nVar2.e(str11);
                        if (e11 == null) {
                            result.error("invalid_task_id", "not found task corresponding to given task id", null);
                            break;
                        } else {
                            ad.a aVar = e11.f395c;
                            if (aVar == ad.a.f387a || aVar == ad.a.f388b) {
                                k0.d(d()).c(UUID.fromString(str11));
                            }
                            if (booleanValue6) {
                                String str12 = e11.f;
                                if (str12 == null) {
                                    String str13 = e11.f397e;
                                    str12 = str13.substring(k.u0(str13, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 6) + 1, e11.f397e.length());
                                    i.d(str12, "substring(...)");
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(e11.f398g);
                                File file = new File(g.f(sb2, File.separator, str12));
                                if (file.exists()) {
                                    try {
                                        bVar.b(file);
                                    } catch (SecurityException unused) {
                                        Log.d("FlutterDownloader", "Failed to delete file in media store, will fall back to normal delete()");
                                    }
                                    file.delete();
                                }
                            }
                            n nVar3 = bVar.f16131b;
                            i.b(nVar3);
                            SQLiteDatabase writableDatabase2 = ((c) nVar3.f3532b).getWritableDatabase();
                            writableDatabase2.beginTransaction();
                            try {
                                try {
                                    writableDatabase2.delete("task", "task_id = ?", new String[]{str11});
                                    writableDatabase2.setTransactionSuccessful();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                writableDatabase2.endTransaction();
                                new u.u(d()).f14855b.cancel(null, e11.f393a);
                                result.success(null);
                                break;
                            } finally {
                            }
                        }
                    }
                    break;
                case -934426579:
                    String str14 = "invalid_task_id";
                    if (str4.equals("resume")) {
                        String str15 = (String) c(methodCall, "task_id");
                        n nVar4 = bVar.f16131b;
                        i.b(nVar4);
                        ad.b e13 = nVar4.e(str15);
                        boolean booleanValue7 = ((Boolean) c(methodCall, "requires_storage_not_low")).booleanValue();
                        int intValue2 = ((Number) c(methodCall, "timeout")).intValue();
                        String str16 = (String) methodCall.argument("proxy");
                        if (e13 == null) {
                            str = "not found task corresponding to given task id";
                        } else if (e13.f395c == ad.a.f) {
                            String str17 = e13.f;
                            if (str17 == null) {
                                String str18 = e13.f397e;
                                str17 = str18.substring(k.u0(str18, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 6) + 1, e13.f397e.length());
                                i.d(str17, "substring(...)");
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(e13.f398g);
                            if (new File(g.f(sb3, File.separator, str17)).exists()) {
                                q a11 = a(e13.f397e, e13.f398g, e13.f, e13.f399h, e13.f402k, e13.f403l, true, booleanValue7, e13.f405n, intValue2, e13.f406o, str16);
                                String uuid2 = a11.f11745a.toString();
                                i.d(uuid2, "toString(...)");
                                result.success(uuid2);
                                ad.a aVar2 = ad.a.f388b;
                                bVar = this;
                                bVar.e(uuid2, aVar2, e13.f396d);
                                n nVar5 = bVar.f16131b;
                                i.b(nVar5);
                                nVar5.h(str15, uuid2, aVar2, e13.f396d);
                                i.b(k0.d(d()).a(a11));
                                break;
                            } else {
                                n nVar6 = bVar.f16131b;
                                i.b(nVar6);
                                nVar6.j(str15, false);
                                str14 = "invalid_data";
                                str = "not found partial downloaded data, this task cannot be resumed";
                            }
                        } else {
                            str = "only paused task can be resumed";
                            str14 = "invalid_status";
                        }
                        result.error(str14, str, null);
                        break;
                    }
                    break;
                case -403218424:
                    if (str4.equals("registerCallback")) {
                        Object obj2 = methodCall.arguments;
                        i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        bVar.f16133d = Long.parseLong(String.valueOf(list.get(0)));
                        bVar.f16134e = Integer.parseInt(String.valueOf(list.get(1)));
                        result.success(null);
                        break;
                    }
                    break;
                case 3417674:
                    if (str4.equals("open")) {
                        String str19 = (String) c(methodCall, "task_id");
                        n nVar7 = bVar.f16131b;
                        i.b(nVar7);
                        ad.b e14 = nVar7.e(str19);
                        if (e14 != null) {
                            if (e14.f395c == ad.a.f389c) {
                                String str20 = e14.f397e;
                                String str21 = e14.f398g;
                                String str22 = e14.f;
                                if (str22 == null) {
                                    str22 = str20.substring(k.u0(str20, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 6) + 1, str20.length());
                                    i.d(str22, "substring(...)");
                                }
                                Intent b10 = d.f407a.b(d(), g.f(f.l(str21), File.separator, str22), e14.f400i);
                                if (b10 != null) {
                                    d().startActivity(b10);
                                    obj = Boolean.TRUE;
                                } else {
                                    obj = Boolean.FALSE;
                                }
                                result.success(obj);
                                break;
                            } else {
                                result.error("invalid_status", "only completed tasks can be opened", null);
                                break;
                            }
                        } else {
                            result.error("invalid_task_id", "not found task with id " + str19, null);
                            break;
                        }
                    }
                    break;
                case 106440182:
                    if (str4.equals("pause")) {
                        String str23 = (String) c(methodCall, "task_id");
                        n nVar8 = bVar.f16131b;
                        i.b(nVar8);
                        nVar8.j(str23, true);
                        k0.d(d()).c(UUID.fromString(str23));
                        result.success(null);
                        break;
                    }
                    break;
                case 108405416:
                    if (str4.equals("retry")) {
                        String str24 = (String) c(methodCall, "task_id");
                        n nVar9 = bVar.f16131b;
                        i.b(nVar9);
                        ad.b e15 = nVar9.e(str24);
                        boolean booleanValue8 = ((Boolean) c(methodCall, "requires_storage_not_low")).booleanValue();
                        int intValue3 = ((Number) c(methodCall, "timeout")).intValue();
                        String str25 = (String) methodCall.argument("proxy");
                        if (e15 != null) {
                            ad.a aVar3 = e15.f395c;
                            if (aVar3 == ad.a.f390d || aVar3 == ad.a.f391e) {
                                q a12 = a(e15.f397e, e15.f398g, e15.f, e15.f399h, e15.f402k, e15.f403l, false, booleanValue8, e15.f405n, intValue3, e15.f406o, str25);
                                String uuid3 = a12.f11745a.toString();
                                i.d(uuid3, "toString(...)");
                                result.success(uuid3);
                                ad.a aVar4 = ad.a.f387a;
                                bVar.e(uuid3, aVar4, e15.f396d);
                                n nVar10 = bVar.f16131b;
                                i.b(nVar10);
                                nVar10.h(str24, uuid3, aVar4, e15.f396d);
                                i.b(k0.d(d()).a(a12));
                                break;
                            } else {
                                str2 = "only failed and canceled task can be retried";
                                str3 = "invalid_status";
                            }
                        } else {
                            str2 = "not found task corresponding to given task id";
                            str3 = "invalid_task_id";
                        }
                        result.error(str3, str2, null);
                        break;
                    }
                    break;
                case 230377166:
                    Object[] objArr = "saved_dir";
                    if (str4.equals("loadTasksWithRawQuery")) {
                        String str26 = (String) c(methodCall, "query");
                        n nVar11 = bVar.f16131b;
                        i.b(nVar11);
                        Cursor rawQuery = ((c) nVar11.f3532b).getReadableDatabase().rawQuery(str26, null);
                        ArrayList arrayList = new ArrayList();
                        while (rawQuery.moveToNext()) {
                            arrayList.add(n.f(rawQuery));
                        }
                        rawQuery.close();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ad.b bVar2 = (ad.b) it.next();
                            HashMap hashMap = new HashMap();
                            hashMap.put("task_id", bVar2.f394b);
                            hashMap.put(str5, Integer.valueOf(bVar2.f395c.ordinal()));
                            hashMap.put("progress", Integer.valueOf(bVar2.f396d));
                            hashMap.put(WebViewActivity.URL_EXTRA, bVar2.f397e);
                            hashMap.put("file_name", bVar2.f);
                            Object[] objArr2 = objArr;
                            hashMap.put(objArr2, bVar2.f398g);
                            hashMap.put("time_created", Long.valueOf(bVar2.f404m));
                            hashMap.put("allow_cellular", Boolean.valueOf(bVar2.f406o));
                            arrayList2.add(hashMap);
                            str5 = str5;
                            objArr = objArr2;
                        }
                        result.success(arrayList2);
                        break;
                    }
                    break;
                case 476547271:
                    if (str4.equals("cancelAll")) {
                        k0 d10 = k0.d(d());
                        d10.getClass();
                        d10.f12880d.d(new y2.c(d10, "flutter_download_task"));
                        result.success(null);
                        break;
                    }
                    break;
                case 871091088:
                    if (str4.equals("initialize")) {
                        Object obj3 = methodCall.arguments;
                        i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list2 = (List) obj3;
                        long parseLong = Long.parseLong(String.valueOf(list2.get(0)));
                        bVar.f = Integer.parseInt(String.valueOf(list2.get(1)));
                        bVar.f16135o = Integer.parseInt(String.valueOf(list2.get(2)));
                        Context context = bVar.f16132c;
                        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("vn.hunghd.downloader.pref", 0) : null;
                        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) != null) {
                            putLong.apply();
                        }
                        result.success(null);
                        break;
                    }
                    break;
                case 1378870856:
                    if (str4.equals("loadTasks")) {
                        n nVar12 = bVar.f16131b;
                        i.b(nVar12);
                        Cursor query = ((c) nVar12.f3532b).getReadableDatabase().query("task", (String[]) nVar12.f3533c, null, null, null, null, null);
                        ArrayList arrayList3 = new ArrayList();
                        while (query.moveToNext()) {
                            arrayList3.add(n.f(query));
                        }
                        query.close();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            ad.b bVar3 = (ad.b) it2.next();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("task_id", bVar3.f394b);
                            hashMap2.put("status", Integer.valueOf(bVar3.f395c.ordinal()));
                            hashMap2.put("progress", Integer.valueOf(bVar3.f396d));
                            hashMap2.put(WebViewActivity.URL_EXTRA, bVar3.f397e);
                            hashMap2.put("file_name", bVar3.f);
                            hashMap2.put(str6, bVar3.f398g);
                            hashMap2.put("time_created", Long.valueOf(bVar3.f404m));
                            hashMap2.put("allow_cellular", Boolean.valueOf(bVar3.f406o));
                            arrayList4.add(hashMap2);
                            str6 = str6;
                        }
                        result.success(arrayList4);
                        break;
                    }
                    break;
            }
            return;
        }
        result.notImplemented();
    }
}
