package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class j0 {

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0760g f9021a;

        public a(AbstractC0760g abstractC0760g) {
            this.f9021a = abstractC0760g;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public byte a(int i7) {
            return this.f9021a.d(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int size() {
            return this.f9021a.size();
        }
    }

    public interface b {
        byte a(int i7);

        int size();
    }

    public static String a(AbstractC0760g abstractC0760g) {
        return b(new a(abstractC0760g));
    }

    public static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            int a7 = bVar.a(i7);
            if (a7 == 34) {
                str = "\\\"";
            } else if (a7 == 39) {
                str = "\\'";
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        str = "\\f";
                        break;
                    case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        str = "\\r";
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a7 >>> 6) & 3) + 48));
                            sb.append((char) (((a7 >>> 3) & 7) + 48));
                            a7 = (a7 & 7) + 48;
                        }
                        sb.append((char) a7);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(AbstractC0760g.q(str));
    }
}
