package ua;

import android.content.Context;
import defpackage.g;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15154a;

    /* renamed from: b, reason: collision with root package name */
    public final BinaryMessenger f15155b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15156c = new HashMap();

    public d(BinaryMessenger binaryMessenger, Context context) {
        this.f15154a = context;
        this.f15155b = binaryMessenger;
    }

    public final void a() {
        Iterator it = new ArrayList(this.f15156c.values()).iterator();
        while (it.hasNext()) {
            ((a) it.next()).V();
        }
        this.f15156c.clear();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        HashMap hashMap;
        String str = methodCall.method;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == 3237136) {
            if (str.equals("init")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 1999985120) {
            if (hashCode == 2146443344 && str.equals("disposeAllPlayers")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("disposePlayer")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            String str2 = (String) methodCall.argument("id");
            if (this.f15156c.containsKey(str2)) {
                result.error(g.e("Platform player ", str2, " already exists"), null, null);
                return;
            }
            this.f15156c.put(str2, new a(this.f15154a, this.f15155b, str2, (Map) methodCall.argument("audioLoadConfiguration"), (List) methodCall.argument("androidAudioEffects"), (Boolean) methodCall.argument("androidOffloadSchedulingEnabled")));
            result.success(null);
            return;
        }
        if (c10 == 1) {
            String str3 = (String) methodCall.argument("id");
            a aVar = (a) this.f15156c.get(str3);
            if (aVar != null) {
                aVar.V();
                this.f15156c.remove(str3);
            }
            hashMap = new HashMap();
        } else if (c10 != 2) {
            result.notImplemented();
            return;
        } else {
            a();
            hashMap = new HashMap();
        }
        result.success(hashMap);
    }
}
