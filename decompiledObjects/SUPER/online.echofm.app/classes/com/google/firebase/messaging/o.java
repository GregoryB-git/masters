package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z4.b;
import z4.c;

public abstract class o
{
  public static Executor a(String paramString)
  {
    return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F2.a(paramString));
  }
  
  public static Executor b()
  {
    return a("Firebase-Messaging-File-Io");
  }
  
  public static ScheduledExecutorService c()
  {
    return new ScheduledThreadPoolExecutor(1, new F2.a("Firebase-Messaging-Init"));
  }
  
  public static ExecutorService d()
  {
    return b.a().a(new F2.a("Firebase-Messaging-Intent-Handle"), c.p);
  }
  
  public static ExecutorService e()
  {
    return Executors.newSingleThreadExecutor(new F2.a("Firebase-Messaging-Network-Io"));
  }
  
  public static ExecutorService f()
  {
    return Executors.newSingleThreadExecutor(new F2.a("Firebase-Messaging-Task"));
  }
  
  public static ScheduledExecutorService g()
  {
    return new ScheduledThreadPoolExecutor(1, new F2.a("Firebase-Messaging-Topics-Io"));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */