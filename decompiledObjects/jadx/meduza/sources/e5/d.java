package e5;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3942b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        int[] iArr = f3942b;
        int i11 = 0;
        while (true) {
            if (i11 >= 7) {
                i11 = -1;
                break;
            } else if (iArr[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }
}
