// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C3;

import java.util.List;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class o implements ScheduledExecutorService
{
    public final ExecutorService o;
    public final ScheduledExecutorService p;
    
    public o(final ExecutorService o, final ScheduledExecutorService p2) {
        this.o = o;
        this.p = p2;
    }
    
    @Override
    public boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.o.awaitTermination(n, timeUnit);
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.o.execute(runnable);
    }
    
    @Override
    public List invokeAll(final Collection collection) {
        return this.o.invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.o.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public Object invokeAny(final Collection collection) {
        return this.o.invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.o.invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public boolean isShutdown() {
        return this.o.isShutdown();
    }
    
    @Override
    public boolean isTerminated() {
        return this.o.isTerminated();
    }
    
    @Override
    public ScheduledFuture schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return new p((p.c)new c(this, runnable, n, timeUnit));
    }
    
    @Override
    public ScheduledFuture schedule(final Callable callable, final long n, final TimeUnit timeUnit) {
        return new p((p.c)new h(this, callable, n, timeUnit));
    }
    
    @Override
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return new p((p.c)new f(this, runnable, n, n2, timeUnit));
    }
    
    @Override
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return new p((p.c)new g(this, runnable, n, n2, timeUnit));
    }
    
    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }
    
    @Override
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }
    
    @Override
    public Future submit(final Runnable runnable) {
        return this.o.submit(runnable);
    }
    
    @Override
    public Future submit(final Runnable runnable, final Object o) {
        return this.o.submit(runnable, o);
    }
    
    @Override
    public Future submit(final Callable callable) {
        return this.o.submit((Callable<Object>)callable);
    }
}
