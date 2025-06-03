package androidx.window.java.layout;

import H.a;
import V5.o;
import V5.t;
import X5.d;
import Z5.f;
import Z5.k;
import g6.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p6.I;
import s6.b;
import s6.c;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends k implements p {
    final /* synthetic */ a $consumer;
    final /* synthetic */ b $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(b bVar, a aVar, d dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    @Override // Z5.a
    @NotNull
    public final d create(Object obj, @NotNull d dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    @Override // Z5.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c7;
        c7 = Y5.d.c();
        int i7 = this.label;
        if (i7 == 0) {
            o.b(obj);
            b bVar = this.$flow;
            final a aVar = this.$consumer;
            c cVar = new c() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // s6.c
                public Object emit(T t7, @NotNull d dVar) {
                    a.this.accept(t7);
                    return t.f6803a;
                }
            };
            this.label = 1;
            if (bVar.a(cVar, this) == c7) {
                return c7;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        return t.f6803a;
    }

    @Override // g6.p
    public final Object invoke(@NotNull I i7, d dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(i7, dVar)).invokeSuspend(t.f6803a);
    }
}
