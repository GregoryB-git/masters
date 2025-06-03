package j9;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends e<o> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f8700b = new o(Collections.emptyList());

    public o(List<String> list) {
        super(list);
    }

    public static o t(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(defpackage.g.e("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] split = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new o(arrayList);
    }

    @Override // j9.e
    public final String h() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f8677a.size(); i10++) {
            if (i10 > 0) {
                sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            }
            sb2.append(this.f8677a.get(i10));
        }
        return sb2.toString();
    }

    @Override // j9.e
    public final o l(List list) {
        return new o(list);
    }
}
