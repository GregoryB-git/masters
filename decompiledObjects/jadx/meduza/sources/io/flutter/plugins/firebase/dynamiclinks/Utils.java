package io.flutter.plugins.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import v8.c;
import w8.a;

/* loaded from: classes.dex */
public class Utils {
    public static Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    public static Map<String, Object> getMapFromPendingDynamicLinkData(c cVar) {
        String str;
        if (cVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        a aVar = cVar.f16008b;
        Uri parse = (aVar == null || (str = aVar.f16442b) == null) ? null : Uri.parse(str);
        hashMap.put("link", parse != null ? parse.toString() : null);
        HashMap hashMap2 = new HashMap();
        r4.c cVar2 = cVar.f16007a;
        for (String str2 : (cVar2 == null ? new Bundle() : new Bundle((Bundle) cVar2.f13613c)).keySet()) {
            r4.c cVar3 = cVar.f16007a;
            hashMap2.put(str2, (cVar3 == null ? new Bundle() : new Bundle((Bundle) cVar3.f13613c)).get(str2).toString());
        }
        hashMap.put("utmParameters", hashMap2);
        HashMap hashMap3 = new HashMap();
        a aVar2 = cVar.f16008b;
        hashMap3.put("clickTimestamp", Long.valueOf(aVar2 == null ? 0L : aVar2.f16444d));
        a aVar3 = cVar.f16008b;
        hashMap3.put("minimumVersion", Integer.valueOf(aVar3 == null ? 0 : aVar3.f16443c));
        hashMap.put("android", hashMap3);
        return hashMap;
    }
}
