package s0;

import java.io.IOException;
import java.util.logging.Logger;
import s0.a;
import s0.a.AbstractC0215a;
import s0.g;
import s0.j;
import s0.o0;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0215a<MessageType, BuilderType>> implements o0 {
    public int memoizedHashCode = 0;

    /* renamed from: s0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0215a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0215a<MessageType, BuilderType>> implements o0.a {
    }

    @Override // s0.o0
    public final g.e c() {
        try {
            v vVar = (v) this;
            int d10 = vVar.d();
            g.e eVar = g.f13982b;
            byte[] bArr = new byte[d10];
            Logger logger = j.f14024c;
            j.b bVar = new j.b(bArr, d10);
            vVar.g(bVar);
            if (bVar.f - bVar.f14030g == 0) {
                return new g.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            StringBuilder l10 = defpackage.f.l("Serializing ");
            l10.append(getClass().getName());
            l10.append(" to a ");
            l10.append("ByteString");
            l10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(l10.toString(), e10);
        }
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    public final int i(c1 c1Var) {
        int h10 = h();
        if (h10 != -1) {
            return h10;
        }
        int e10 = c1Var.e(this);
        j(e10);
        return e10;
    }

    void j(int i10) {
        throw new UnsupportedOperationException();
    }
}
