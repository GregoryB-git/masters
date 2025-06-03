package O1;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum I {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: p, reason: collision with root package name */
    public static final a f3747p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final EnumSet f3748q;

    /* renamed from: o, reason: collision with root package name */
    public final long f3753o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final EnumSet a(long j7) {
            EnumSet result = EnumSet.noneOf(I.class);
            Iterator it = I.f3748q.iterator();
            while (it.hasNext()) {
                I i7 = (I) it.next();
                if ((i7.h() & j7) != 0) {
                    result.add(i7);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }
    }

    static {
        EnumSet allOf = EnumSet.allOf(I.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        f3748q = allOf;
    }

    I(long j7) {
        this.f3753o = j7;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static I[] valuesCustom() {
        I[] valuesCustom = values();
        return (I[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long h() {
        return this.f3753o;
    }
}
