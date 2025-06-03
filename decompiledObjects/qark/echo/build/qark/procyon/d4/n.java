// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.Iterator;
import V3.k;

public interface n extends Comparable, Iterable
{
    public static final c l = new c() {
        @Override
        public int D(final n n) {
            if (n == this) {
                return 0;
            }
            return 1;
        }
        
        @Override
        public boolean Q(final d4.b b) {
            return false;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o == this;
        }
        
        @Override
        public boolean isEmpty() {
            return false;
        }
        
        @Override
        public n t() {
            return this;
        }
        
        @Override
        public String toString() {
            return "<Max Node>";
        }
        
        @Override
        public n v(final d4.b b) {
            if (b.s()) {
                return this.t();
            }
            return g.W();
        }
    };
    
    n A(final k p0);
    
    boolean B();
    
    int E();
    
    d4.b I(final d4.b p0);
    
    n J(final n p0);
    
    Object L(final boolean p0);
    
    n N(final d4.b p0, final n p1);
    
    String O(final b p0);
    
    Iterator P();
    
    boolean Q(final d4.b p0);
    
    String R();
    
    Object getValue();
    
    boolean isEmpty();
    
    n t();
    
    n v(final d4.b p0);
    
    n y(final k p0, final n p1);
    
    public enum b
    {
        o("V1", 0), 
        p("V2", 1);
        
        public b(final String name, final int ordinal) {
        }
    }
}
