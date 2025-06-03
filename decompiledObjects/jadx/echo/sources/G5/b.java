package G5;

import D5.m;
import android.view.PointerIcon;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static HashMap f2109c;

    /* renamed from: a, reason: collision with root package name */
    public final c f2110a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2111b;

    public class a implements m.b {
        public a() {
        }

        @Override // D5.m.b
        public void a(String str) {
            b.this.f2110a.setPointerIcon(b.this.d(str));
        }
    }

    /* renamed from: G5.b$b, reason: collision with other inner class name */
    public class C0033b extends HashMap {
        private static final long serialVersionUID = 1;

        public C0033b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon b(int i7);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public b(c cVar, m mVar) {
        this.f2110a = cVar;
        this.f2111b = mVar;
        mVar.b(new a());
    }

    public void c() {
        this.f2111b.b(null);
    }

    public final PointerIcon d(String str) {
        Object orDefault;
        if (f2109c == null) {
            f2109c = new C0033b();
        }
        orDefault = f2109c.getOrDefault(str, 1000);
        return this.f2110a.b(((Integer) orDefault).intValue());
    }
}
