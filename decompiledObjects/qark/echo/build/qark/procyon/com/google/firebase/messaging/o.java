// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.concurrent.Executors;
import z4.c;
import z4.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import F2.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

public abstract class o
{
    public static Executor a(final String s) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new a(s));
    }
    
    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }
    
    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
    }
    
    public static ExecutorService d() {
        return b.a().a(new a("Firebase-Messaging-Intent-Handle"), c.p);
    }
    
    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
    }
    
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
    }
    
    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
    }
}
