.class public final Le1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le1/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le1/c;


# direct methods
.method public constructor <init>(Le1/c;)V
    .locals 0

    iput-object p1, p0, Le1/c$a;->a:Le1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    iget-object v0, p0, Le1/c$a;->a:Le1/c;

    iget-object v0, v0, Le1/c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    const/16 v2, 0xa

    :try_start_0
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v2, p0, Le1/c$a;->a:Le1/c;

    invoke-virtual {v2}, Le1/c;->a()V

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Le1/c$a;->a:Le1/c;

    invoke-virtual {v1, v0}, Le1/c;->d(Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v2

    :try_start_1
    iget-object v3, p0, Le1/c$a;->a:Le1/c;

    iget-object v3, v3, Le1/c;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    iget-object v2, p0, Le1/c$a;->a:Le1/c;

    invoke-virtual {v2, v0}, Le1/c;->d(Ljava/lang/Object;)V

    throw v1
.end method
