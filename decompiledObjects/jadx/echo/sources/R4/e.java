package R4;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ int a(double d7) {
        long doubleToLongBits = Double.doubleToLongBits(d7);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
