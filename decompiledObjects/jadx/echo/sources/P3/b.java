package P3;

/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4232a;

    public b(int i7) {
        this.f4232a = i7;
    }

    @Override // P3.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i7 = this.f4232a;
        if (length <= i7) {
            return stackTraceElementArr;
        }
        int i8 = i7 / 2;
        int i9 = i7 - i8;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i9);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i8, stackTraceElementArr2, i9, i8);
        return stackTraceElementArr2;
    }
}
