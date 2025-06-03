.class public final synthetic Le8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Le8/f;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Le8/g$b;


# direct methods
.method public synthetic constructor <init>(Le8/f;Ljava/util/concurrent/Callable;Le8/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/e;->a:Le8/f;

    iput-object p2, p0, Le8/e;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Le8/e;->c:Le8/g$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le8/e;->a:Le8/f;

    iget-object v1, p0, Le8/e;->b:Ljava/util/concurrent/Callable;

    iget-object v2, p0, Le8/e;->c:Le8/g$b;

    iget-object v0, v0, Le8/f;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Lw/g;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v1, v2}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
