package w;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16157a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f16158b;

    public e(int i10, int i11) {
        this.f16157a = new int[]{i10, i11};
        this.f16158b = new float[]{0.0f, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f16157a = new int[]{i10, i11, i12};
        this.f16158b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f16157a = new int[size];
        this.f16158b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f16157a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f16158b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }
}
