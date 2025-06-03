// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

public abstract class B0 extends F
{
    public abstract B0 H();
    
    public final String I() {
        final B0 c = W.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
    Label_0020_Outer:
        while (true) {
            while (true) {
                try {
                    B0 h = c.H();
                    while (true) {
                        if (this == h) {
                            return "Dispatchers.Main.immediate";
                        }
                        return null;
                        h = null;
                        continue Label_0020_Outer;
                    }
                }
                catch (UnsupportedOperationException ex) {}
                continue;
            }
        }
    }
}
