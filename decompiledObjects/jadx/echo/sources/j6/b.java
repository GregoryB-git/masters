package j6;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends j6.a {

    /* renamed from: q, reason: collision with root package name */
    public final a f15481q = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // j6.a
    public Random d() {
        Object obj = this.f15481q.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
