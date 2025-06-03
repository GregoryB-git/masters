// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.concurrent.atomic.AtomicInteger;

public final class H
{
    public final AtomicInteger a;
    public final AtomicInteger b;
    
    public H() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
    }
    
    public int a() {
        return this.b.get();
    }
    
    public int b() {
        return this.a.get();
    }
    
    public void c() {
        this.b.getAndIncrement();
    }
    
    public void d() {
        this.a.getAndIncrement();
    }
    
    public void e() {
        this.b.set(0);
    }
}
