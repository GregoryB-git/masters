/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.PointerIcon
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package G5;

import D5.m;
import G5.a;
import android.view.PointerIcon;
import java.util.HashMap;

public class b {
    public static HashMap c;
    public final c a;
    public final m b;

    public b(c c8, m m8) {
        this.a = c8;
        this.b = m8;
        m8.b(new m.b(){

            @Override
            public void a(String string2) {
                b.this.a.setPointerIcon(b.this.d(string2));
            }
        });
    }

    public void c() {
        this.b.b(null);
    }

    public final PointerIcon d(String string2) {
        if (c == null) {
            c = new HashMap(){
                private static final long serialVersionUID = 1L;
                {
                    this.put((Object)"alias", (Object)1010);
                    b.this = Integer.valueOf((int)1013);
                    this.put((Object)"allScroll", (Object)b.this);
                    this.put((Object)"basic", (Object)1000);
                    this.put((Object)"cell", (Object)1006);
                    this.put((Object)"click", (Object)1002);
                    this.put((Object)"contextMenu", (Object)1001);
                    this.put((Object)"copy", (Object)1011);
                    Integer n8 = 1012;
                    this.put((Object)"forbidden", (Object)n8);
                    this.put((Object)"grab", (Object)1020);
                    this.put((Object)"grabbing", (Object)1021);
                    this.put((Object)"help", (Object)1003);
                    this.put((Object)"move", (Object)b.this);
                    this.put((Object)"none", (Object)0);
                    this.put((Object)"noDrop", (Object)n8);
                    this.put((Object)"precise", (Object)1007);
                    this.put((Object)"text", (Object)1008);
                    b.this = Integer.valueOf((int)1014);
                    this.put((Object)"resizeColumn", (Object)b.this);
                    n8 = 1015;
                    this.put((Object)"resizeDown", (Object)n8);
                    Integer n9 = 1016;
                    this.put((Object)"resizeUpLeft", (Object)n9);
                    Integer n10 = 1017;
                    this.put((Object)"resizeDownRight", (Object)n10);
                    this.put((Object)"resizeLeft", (Object)b.this);
                    this.put((Object)"resizeLeftRight", (Object)b.this);
                    this.put((Object)"resizeRight", (Object)b.this);
                    this.put((Object)"resizeRow", (Object)n8);
                    this.put((Object)"resizeUp", (Object)n8);
                    this.put((Object)"resizeUpDown", (Object)n8);
                    this.put((Object)"resizeUpLeft", (Object)n10);
                    this.put((Object)"resizeUpRight", (Object)n9);
                    this.put((Object)"resizeUpLeftDownRight", (Object)n10);
                    this.put((Object)"resizeUpRightDownLeft", (Object)n9);
                    this.put((Object)"verticalText", (Object)1009);
                    this.put((Object)"wait", (Object)1004);
                    this.put((Object)"zoomIn", (Object)1018);
                    this.put((Object)"zoomOut", (Object)1019);
                }
            };
        }
        int n8 = (Integer)a.a(c, string2, 1000);
        return this.a.b(n8);
    }

    public static interface c {
        public PointerIcon b(int var1);

        public void setPointerIcon(PointerIcon var1);
    }

}

