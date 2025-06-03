package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class e extends d.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.h f994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f995b;

    public e(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f994a = hVar;
        this.f995b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.h
    public final void a(Throwable th) {
        try {
            this.f994a.a(th);
        } finally {
            this.f995b.shutdown();
        }
    }

    @Override // androidx.emoji2.text.d.h
    public final void b(h hVar) {
        try {
            this.f994a.b(hVar);
        } finally {
            this.f995b.shutdown();
        }
    }
}
