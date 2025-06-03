package A;

import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import z.e;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f29a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // A.n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // A.n.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object e(Object[] objArr, int i7, b bVar) {
        return f(objArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i7, boolean z7, b bVar) {
        Object obj = null;
        int i8 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i7) * 2) + (bVar.b(obj2) == z7 ? 0 : 1);
            if (obj == null || i8 > abs) {
                obj = obj2;
                i8 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i7);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7);

    public Typeface c(Context context, InputStream inputStream) {
        File e7 = o.e(context);
        if (e7 == null) {
            return null;
        }
        try {
            if (o.d(e7, inputStream)) {
                return Typeface.createFromFile(e7.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e7.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        File e7 = o.e(context);
        if (e7 == null) {
            return null;
        }
        try {
            if (o.c(e7, resources, i7)) {
                return Typeface.createFromFile(e7.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e7.delete();
        }
    }

    public g.b g(g.b[] bVarArr, int i7) {
        return (g.b) e(bVarArr, i7, new a());
    }
}
