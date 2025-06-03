package P3;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4231c;

    public a(int i7, d... dVarArr) {
        this.f4229a = i7;
        this.f4230b = dVarArr;
        this.f4231c = new b(i7);
    }

    @Override // P3.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f4229a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f4230b) {
            if (stackTraceElementArr2.length <= this.f4229a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f4229a ? this.f4231c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
