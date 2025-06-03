package P3;

import java.util.HashMap;

/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4233a;

    public c(int i7) {
        this.f4233a = i7;
    }

    public static boolean b(StackTraceElement[] stackTraceElementArr, int i7, int i8) {
        int i9 = i8 - i7;
        if (i8 + i9 > stackTraceElementArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!stackTraceElementArr[i7 + i10].equals(stackTraceElementArr[i8 + i10])) {
                return false;
            }
        }
        return true;
    }

    public static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i7) {
        int i8;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !b(stackTraceElementArr, num.intValue(), i9)) {
                stackTraceElementArr2[i10] = stackTraceElementArr[i9];
                i10++;
                i11 = 1;
                i8 = i9;
            } else {
                int intValue = i9 - num.intValue();
                if (i11 < i7) {
                    System.arraycopy(stackTraceElementArr, i9, stackTraceElementArr2, i10, intValue);
                    i10 += intValue;
                    i11++;
                }
                i8 = (intValue - 1) + i9;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i9));
            i9 = i8 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        return stackTraceElementArr3;
    }

    @Override // P3.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c7 = c(stackTraceElementArr, this.f4233a);
        return c7.length < stackTraceElementArr.length ? c7 : stackTraceElementArr;
    }
}
