package n7;

/* loaded from: classes.dex */
public class w extends RuntimeException {
    public /* synthetic */ w() {
    }

    public /* synthetic */ w(int i10) {
        super(i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }

    public /* synthetic */ w(String str) {
        super(str);
    }

    public /* synthetic */ w(String str, Throwable th) {
        super(str, th);
    }
}
