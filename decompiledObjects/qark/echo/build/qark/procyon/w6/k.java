// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import p6.M;

public final class k extends h
{
    public final Runnable q;
    
    public k(final Runnable q, final long n, final i i) {
        super(n, i);
        this.q = q;
    }
    
    @Override
    public void run() {
        try {
            this.q.run();
        }
        finally {
            super.p.a();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(M.a(this.q));
        sb.append('@');
        sb.append(M.b(this.q));
        sb.append(", ");
        sb.append(super.o);
        sb.append(", ");
        sb.append(super.p);
        sb.append(']');
        return sb.toString();
    }
}
