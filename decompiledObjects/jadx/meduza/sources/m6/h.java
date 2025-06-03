package m6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f10278a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f10279b;

        public /* synthetic */ a(Object obj) {
            j.i(obj);
            this.f10279b = obj;
            this.f10278a = new ArrayList();
        }

        public final void a(Object obj, String str) {
            this.f10278a.add(defpackage.g.e(str, "=", String.valueOf(obj)));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f10279b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f10278a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f10278a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
