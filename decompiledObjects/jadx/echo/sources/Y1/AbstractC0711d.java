package Y1;

import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1879b;

/* renamed from: Y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0711d extends q.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7392a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ReentrantLock f7393b = new ReentrantLock();

    /* renamed from: Y1.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final q.e a() {
            AbstractC0711d.f7393b.lock();
            AbstractC0711d.c();
            AbstractC0711d.d(null);
            AbstractC0711d.f7393b.unlock();
            return null;
        }

        public final void b(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            c();
            AbstractC0711d.f7393b.lock();
            AbstractC0711d.c();
            AbstractC0711d.f7393b.unlock();
        }

        public final void c() {
            AbstractC0711d.f7393b.lock();
            AbstractC0711d.c();
            AbstractC0711d.a();
            AbstractC0711d.f7393b.unlock();
        }
    }

    public static final /* synthetic */ AbstractC1879b a() {
        return null;
    }

    public static final /* synthetic */ q.e c() {
        return null;
    }

    public static final /* synthetic */ void d(q.e eVar) {
    }
}
