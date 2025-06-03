package d;

import android.content.Context;
import android.content.Intent;
import d.AbstractC1161a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t.C1958a;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public final class b extends AbstractC1161a {
    public static Intent e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // d.AbstractC1161a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    @Override // d.AbstractC1161a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC1161a.C0185a b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new AbstractC1161a.C0185a(Collections.emptyMap());
        }
        C1958a c1958a = new C1958a();
        boolean z7 = true;
        for (String str : strArr) {
            boolean z8 = AbstractC2112a.a(context, str) == 0;
            c1958a.put(str, Boolean.valueOf(z8));
            if (!z8) {
                z7 = false;
            }
        }
        if (z7) {
            return new AbstractC1161a.C0185a(c1958a);
        }
        return null;
    }

    @Override // d.AbstractC1161a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map c(int i7, Intent intent) {
        if (i7 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(stringArrayExtra[i8], Boolean.valueOf(intArrayExtra[i8] == 0));
        }
        return hashMap;
    }
}
