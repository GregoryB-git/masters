// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G5;

import android.view.PointerIcon;
import D5.m;
import java.util.HashMap;

public class b
{
    public static HashMap c;
    public final c a;
    public final m b;
    
    public b(final c a, final m b) {
        this.a = a;
        (this.b = b).b((m.b)new m.b() {
            @Override
            public void a(final String s) {
                b.b(b.this).setPointerIcon(b.this.d(s));
            }
        });
    }
    
    public static /* synthetic */ c b(final b b) {
        return b.a;
    }
    
    public void c() {
        this.b.b(null);
    }
    
    public final PointerIcon d(final String s) {
        if (G5.b.c == null) {
            G5.b.c = new HashMap() {
                private static final long serialVersionUID = 1L;
                
                {
                    this.put("alias", 1010);
                    final Integer value = 1013;
                    this.put("allScroll", value);
                    this.put("basic", 1000);
                    this.put("cell", 1006);
                    this.put("click", 1002);
                    this.put("contextMenu", 1001);
                    this.put("copy", 1011);
                    final Integer value2 = 1012;
                    this.put("forbidden", value2);
                    this.put("grab", 1020);
                    this.put("grabbing", 1021);
                    this.put("help", 1003);
                    this.put("move", value);
                    this.put("none", 0);
                    this.put("noDrop", value2);
                    this.put("precise", 1007);
                    this.put("text", 1008);
                    final Integer value3 = 1014;
                    this.put("resizeColumn", value3);
                    final Integer value4 = 1015;
                    this.put("resizeDown", value4);
                    final Integer value5 = 1016;
                    this.put("resizeUpLeft", value5);
                    final Integer value6 = 1017;
                    this.put("resizeDownRight", value6);
                    this.put("resizeLeft", value3);
                    this.put("resizeLeftRight", value3);
                    this.put("resizeRight", value3);
                    this.put("resizeRow", value4);
                    this.put("resizeUp", value4);
                    this.put("resizeUpDown", value4);
                    this.put("resizeUpLeft", value6);
                    this.put("resizeUpRight", value5);
                    this.put("resizeUpLeftDownRight", value6);
                    this.put("resizeUpRightDownLeft", value5);
                    this.put("verticalText", 1009);
                    this.put("wait", 1004);
                    this.put("zoomIn", 1018);
                    this.put("zoomOut", 1019);
                }
            };
        }
        return this.a.b((int)G5.a.a(G5.b.c, (Object)s, (Object)1000));
    }
    
    public interface c
    {
        PointerIcon b(final int p0);
        
        void setPointerIcon(final PointerIcon p0);
    }
}
