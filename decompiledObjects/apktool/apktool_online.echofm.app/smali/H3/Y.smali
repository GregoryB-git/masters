.class public final synthetic LH3/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/Callable;

.field public final synthetic p:Ljava/util/concurrent/Executor;

.field public final synthetic q:LV2/k;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH3/Y;->o:Ljava/util/concurrent/Callable;

    .line 5
    .line 6
    iput-object p2, p0, LH3/Y;->p:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, LH3/Y;->q:LV2/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LH3/Y;->o:Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    iget-object v1, p0, LH3/Y;->p:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v2, p0, LH3/Y;->q:LV2/k;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LH3/c0;->e(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;LV2/k;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
