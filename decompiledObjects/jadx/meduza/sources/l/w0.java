package l;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class w0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9486a = new Object();

    public static void a(Context context) {
        if ((context instanceof w0) || (context.getResources() instanceof y0)) {
            return;
        }
        context.getResources();
        int i10 = e1.f9332a;
    }
}
