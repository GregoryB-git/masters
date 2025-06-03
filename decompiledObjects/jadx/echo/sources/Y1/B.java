package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum B {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* renamed from: p, reason: collision with root package name */
    public static final a f7352p = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public final String f7356o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final B a(String str) {
            B[] valuesCustom = B.valuesCustom();
            int length = valuesCustom.length;
            int i7 = 0;
            while (i7 < length) {
                B b7 = valuesCustom[i7];
                i7++;
                if (Intrinsics.a(b7.toString(), str)) {
                    return b7;
                }
            }
            return B.FACEBOOK;
        }
    }

    B(String str) {
        this.f7356o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static B[] valuesCustom() {
        B[] valuesCustom = values();
        return (B[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7356o;
    }
}
