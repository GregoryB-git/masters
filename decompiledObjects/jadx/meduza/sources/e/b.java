package e;

import android.content.Intent;
import b.j;
import e.a;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.d;
import sb.m;
import sb.t;
import sb.y;
import sb.z;

/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // e.a
    public final Intent a(j jVar, Object obj) {
        String[] strArr = (String[]) obj;
        i.e(jVar, "context");
        i.e(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        i.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0064a b(j jVar, Object obj) {
        String[] strArr = (String[]) obj;
        i.e(jVar, "context");
        i.e(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0064a(t.f14325a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(v.a.checkSelfPermission(jVar, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        int H0 = y.H0(strArr.length);
        if (H0 < 16) {
            H0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H0);
        for (String str : strArr) {
            linkedHashMap.put(str, Boolean.TRUE);
        }
        return new a.C0064a(linkedHashMap);
    }

    @Override // e.a
    public final Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(m.j(arrayList2), m.j(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new d(it.next(), it2.next()));
                }
                return z.L0(arrayList3);
            }
        }
        return t.f14325a;
    }
}
