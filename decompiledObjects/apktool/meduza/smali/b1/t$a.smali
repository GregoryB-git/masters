.class public final Lb1/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb1/t;


# direct methods
.method public constructor <init>(Lb1/t;)V
    .locals 0

    iput-object p1, p0, Lb1/t$a;->a:Lb1/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lb1/t$a;->a:Lb1/t;

    iget-object v0, v0, Lb1/t;->mDataLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb1/t$a;->a:Lb1/t;

    iget-object v1, v1, Lb1/t;->mPendingData:Ljava/lang/Object;

    iget-object v2, p0, Lb1/t$a;->a:Lb1/t;

    sget-object v3, Lb1/t;->NOT_SET:Ljava/lang/Object;

    iput-object v3, v2, Lb1/t;->mPendingData:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb1/t$a;->a:Lb1/t;

    invoke-virtual {v0, v1}, Lb1/t;->setValue(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
