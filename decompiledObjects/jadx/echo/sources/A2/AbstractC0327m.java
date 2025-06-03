package A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: A2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0327m {

    /* renamed from: A2.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f517a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f518b;

        public /* synthetic */ a(Object obj, S s7) {
            AbstractC0328n.i(obj);
            this.f518b = obj;
            this.f517a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f517a;
            AbstractC0328n.i(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f518b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f517a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append((String) this.f517a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
