package va;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p2.m0;
import v3.x0;

/* loaded from: classes.dex */
public class s implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: p, reason: collision with root package name */
    public static String f16077p;
    public static i t;

    /* renamed from: a, reason: collision with root package name */
    public Context f16081a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f16082b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f16073c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f16074d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f16075e = new Object();
    public static final Object f = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static int f16076o = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f16078q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static int f16079r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static int f16080s = 0;

    public static void a(s sVar, d dVar) {
        sVar.getClass();
        try {
            if (dVar.f16017d >= 1) {
                Log.d("Sqflite", dVar.h() + "closing database ");
            }
            dVar.a();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f16080s);
        }
        synchronized (f16075e) {
            if (f16074d.isEmpty() && t != null) {
                if (dVar.f16017d >= 1) {
                    Log.d("Sqflite", dVar.h() + "stopping thread");
                }
                t.b();
                t = null;
            }
        }
    }

    public static d b(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        d dVar = (d) f16074d.get(Integer.valueOf(intValue));
        if (dVar != null) {
            return dVar;
        }
        result.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        if (z10) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f16081a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f16082b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16081a = null;
        this.f16082b.setMethodCallHandler(null);
        this.f16082b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        char c10;
        final int i10;
        d dVar;
        d dVar2;
        String str = methodCall.method;
        str.getClass();
        int i11 = 8;
        boolean z10 = false;
        byte b10 = 0;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 107944136:
                if (str.equals("query")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        d dVar3 = null;
        switch (c10) {
            case 0:
                d b11 = b(methodCall, result);
                if (b11 == null) {
                    return;
                }
                t.a(b11, new o(methodCall, result, b11));
                return;
            case 1:
                int intValue = ((Integer) methodCall.argument("id")).intValue();
                d b12 = b(methodCall, result);
                if (b12 == null) {
                    return;
                }
                if ((b12.f16017d < 1 ? 0 : 1) != 0) {
                    Log.d("Sqflite", b12.h() + "closing " + intValue + " " + b12.f16015b);
                }
                String str2 = b12.f16015b;
                synchronized (f16075e) {
                    f16074d.remove(Integer.valueOf(intValue));
                    if (b12.f16014a) {
                        f16073c.remove(str2);
                    }
                }
                t.a(b12, new q(this, b12, result));
                return;
            case 2:
                Object argument = methodCall.argument("androidThreadPriority");
                if (argument != null) {
                    f16078q = ((Integer) argument).intValue();
                }
                Object argument2 = methodCall.argument("androidThreadCount");
                if (argument2 != null && !argument2.equals(Integer.valueOf(f16079r))) {
                    f16079r = ((Integer) argument2).intValue();
                    i iVar = t;
                    if (iVar != null) {
                        iVar.b();
                        t = null;
                    }
                }
                Integer num = (Integer) methodCall.argument("logLevel");
                if (num != null) {
                    f16076o = num.intValue();
                }
                result.success(null);
                return;
            case 3:
                final d b13 = b(methodCall, result);
                if (b13 == null) {
                    return;
                }
                i iVar2 = t;
                final byte b14 = b10 == true ? 1 : 0;
                iVar2.a(b13, new Runnable() { // from class: va.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b14) {
                            case 0:
                                MethodCall methodCall2 = methodCall;
                                MethodChannel.Result result2 = result;
                                d dVar4 = b13;
                                HashMap hashMap = s.f16073c;
                                wa.c cVar = new wa.c(methodCall2, result2);
                                dVar4.getClass();
                                dVar4.l(cVar, new g.q(25, dVar4, cVar));
                                break;
                            default:
                                MethodCall methodCall3 = methodCall;
                                MethodChannel.Result result3 = result;
                                d dVar5 = b13;
                                HashMap hashMap2 = s.f16073c;
                                wa.c cVar2 = new wa.c(methodCall3, result3);
                                dVar5.getClass();
                                dVar5.l(cVar2, new x0.f(23, dVar5, cVar2));
                                break;
                        }
                    }
                });
                return;
            case 4:
                d b15 = b(methodCall, result);
                if (b15 == null) {
                    return;
                }
                t.a(b15, new n(methodCall, result, b15));
                return;
            case 5:
                d b16 = b(methodCall, result);
                if (b16 == null) {
                    return;
                }
                t.a(b16, new n(methodCall, b16, result));
                return;
            case 6:
                String str3 = (String) methodCall.argument("path");
                synchronized (f16075e) {
                    if (m0.O(f16076o)) {
                        Log.d("Sqflite", "Look for " + str3 + " in " + f16073c.keySet());
                    }
                    HashMap hashMap = f16073c;
                    Integer num2 = (Integer) hashMap.get(str3);
                    if (num2 != null) {
                        HashMap hashMap2 = f16074d;
                        d dVar4 = (d) hashMap2.get(num2);
                        if (dVar4 != null && dVar4.f16021i.isOpen()) {
                            if (m0.O(f16076o)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(dVar4.h());
                                sb2.append("found single instance ");
                                sb2.append(dVar4.j() ? "(in transaction) " : "");
                                sb2.append(num2);
                                sb2.append(" ");
                                sb2.append(str3);
                                Log.d("Sqflite", sb2.toString());
                            }
                            hashMap2.remove(num2);
                            hashMap.remove(str3);
                            dVar3 = dVar4;
                        }
                    }
                }
                r rVar = new r(this, dVar3, str3, result);
                i iVar3 = t;
                if (iVar3 != null) {
                    iVar3.a(dVar3, rVar);
                    return;
                } else {
                    rVar.run();
                    return;
                }
            case 7:
                boolean equals = Boolean.TRUE.equals(methodCall.arguments());
                if (!equals) {
                    f16076o = 0;
                } else if (equals) {
                    f16076o = 1;
                }
                result.success(null);
                return;
            case '\b':
                final String str4 = (String) methodCall.argument("path");
                final Boolean bool = (Boolean) methodCall.argument("readOnly");
                final boolean z11 = str4 == null || str4.equals(":memory:");
                boolean z12 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || z11) ? false : true;
                if (z12) {
                    synchronized (f16075e) {
                        if (m0.O(f16076o)) {
                            Log.d("Sqflite", "Look for " + str4 + " in " + f16073c.keySet());
                        }
                        Integer num3 = (Integer) f16073c.get(str4);
                        if (num3 != null && (dVar2 = (d) f16074d.get(num3)) != null) {
                            if (dVar2.f16021i.isOpen()) {
                                if (m0.O(f16076o)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(dVar2.h());
                                    sb3.append("re-opened single instance ");
                                    sb3.append(dVar2.j() ? "(in transaction) " : "");
                                    sb3.append(num3);
                                    sb3.append(" ");
                                    sb3.append(str4);
                                    Log.d("Sqflite", sb3.toString());
                                }
                                result.success(c(num3.intValue(), true, dVar2.j()));
                                return;
                            }
                            if (m0.O(f16076o)) {
                                Log.d("Sqflite", dVar2.h() + "single instance database of " + str4 + " not opened");
                            }
                        }
                    }
                }
                Object obj = f16075e;
                synchronized (obj) {
                    i10 = f16080s + 1;
                    f16080s = i10;
                }
                d dVar5 = new d(this.f16081a, str4, i10, z12, f16076o);
                synchronized (obj) {
                    if (t == null) {
                        int i12 = f16079r;
                        int i13 = f16078q;
                        i kVar = i12 == 1 ? new k(i13) : new j(i12, i13);
                        t = kVar;
                        kVar.start();
                        dVar = dVar5;
                        if ((dVar.f16017d >= 1) != false) {
                            Log.d("Sqflite", dVar.h() + "starting worker pool with priority " + f16078q);
                        }
                    } else {
                        dVar = dVar5;
                    }
                    dVar.f16020h = t;
                    if (dVar.f16017d < 1) {
                        r6 = 0;
                    }
                    if (r6 != 0) {
                        Log.d("Sqflite", dVar.h() + "opened " + i10 + " " + str4);
                    }
                    final d dVar6 = dVar;
                    final boolean z13 = z12;
                    t.a(dVar, new Runnable() { // from class: va.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z14 = z11;
                            String str5 = str4;
                            MethodChannel.Result result2 = result;
                            Boolean bool2 = bool;
                            d dVar7 = dVar6;
                            MethodCall methodCall2 = methodCall;
                            boolean z15 = z13;
                            int i14 = i10;
                            synchronized (s.f) {
                                if (!z14) {
                                    try {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            result2.error("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                try {
                                    boolean equals2 = Boolean.TRUE.equals(bool2);
                                    boolean z16 = true;
                                    if (equals2) {
                                        dVar7.f16021i = SQLiteDatabase.openDatabase(dVar7.f16015b, null, 1, new c());
                                    } else {
                                        dVar7.k();
                                    }
                                    synchronized (s.f16075e) {
                                        if (z15) {
                                            s.f16073c.put(str5, Integer.valueOf(i14));
                                        }
                                        s.f16074d.put(Integer.valueOf(i14), dVar7);
                                    }
                                    if (dVar7.f16017d < 1) {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        Log.d("Sqflite", dVar7.h() + "opened " + i14 + " " + str5);
                                    }
                                    result2.success(s.c(i14, false, false));
                                } catch (Exception e10) {
                                    dVar7.i(e10, new wa.c(methodCall2, result2));
                                }
                            }
                        }
                    });
                }
                return;
            case '\t':
                d b17 = b(methodCall, result);
                if (b17 == null) {
                    return;
                }
                t.a(b17, new o(b17, methodCall, result));
                return;
            case '\n':
                String str5 = (String) methodCall.argument("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i14 = f16076o;
                    if (i14 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i14));
                    }
                    HashMap hashMap4 = f16074d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            d dVar7 = (d) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", dVar7.f16015b);
                            hashMap6.put("singleInstance", Boolean.valueOf(dVar7.f16014a));
                            int i15 = dVar7.f16017d;
                            if (i15 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i15));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                result.success(hashMap3);
                return;
            case 11:
                final d b18 = b(methodCall, result);
                if (b18 == null) {
                    return;
                }
                t.a(b18, new Runnable() { // from class: va.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r4) {
                            case 0:
                                MethodCall methodCall2 = methodCall;
                                MethodChannel.Result result2 = result;
                                d dVar42 = b18;
                                HashMap hashMap7 = s.f16073c;
                                wa.c cVar = new wa.c(methodCall2, result2);
                                dVar42.getClass();
                                dVar42.l(cVar, new g.q(25, dVar42, cVar));
                                break;
                            default:
                                MethodCall methodCall3 = methodCall;
                                MethodChannel.Result result3 = result;
                                d dVar52 = b18;
                                HashMap hashMap22 = s.f16073c;
                                wa.c cVar2 = new wa.c(methodCall3, result3);
                                dVar52.getClass();
                                dVar52.l(cVar2, new x0.f(23, dVar52, cVar2));
                                break;
                        }
                    }
                });
                return;
            case '\f':
                try {
                    z10 = new File((String) methodCall.argument("path")).exists();
                } catch (Exception unused) {
                }
                result.success(Boolean.valueOf(z10));
                return;
            case '\r':
                d b19 = b(methodCall, result);
                if (b19 == null) {
                    return;
                }
                t.a(b19, new x0(methodCall, result, b19, i11));
                return;
            case 14:
                StringBuilder l10 = defpackage.f.l("Android ");
                l10.append(Build.VERSION.RELEASE);
                result.success(l10.toString());
                return;
            case 15:
                if (f16077p == null) {
                    f16077p = this.f16081a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                result.success(f16077p);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
