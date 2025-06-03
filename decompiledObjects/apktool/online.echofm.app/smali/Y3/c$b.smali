.class public LY3/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:LY3/c;


# direct methods
.method public constructor <init>(LY3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY3/c$b;->a:LY3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LY3/c;LY3/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LY3/c$b;-><init>(LY3/c;)V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    iget-object v0, p0, LY3/c$b;->a:LY3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LY3/c;->e()Ljava/util/concurrent/ThreadFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, LY3/c$b;->a:LY3/c;

    .line 12
    .line 13
    invoke-virtual {v0}, LY3/c;->f()LV3/z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "FirebaseDatabaseWorker"

    .line 18
    .line 19
    invoke-interface {v0, p1, v1}, LV3/z;->a(Ljava/lang/Thread;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-interface {v0, p1, v1}, LV3/z;->b(Ljava/lang/Thread;Z)V

    .line 24
    .line 25
    .line 26
    new-instance v1, LY3/c$b$a;

    .line 27
    .line 28
    invoke-direct {v1, p0}, LY3/c$b$a;-><init>(LY3/c$b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, v1}, LV3/z;->c(Ljava/lang/Thread;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method
