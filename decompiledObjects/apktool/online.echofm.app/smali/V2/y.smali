.class public final LV2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LV2/j;

.field public final synthetic p:LV2/z;


# direct methods
.method public constructor <init>(LV2/z;LV2/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV2/y;->p:LV2/z;

    .line 2
    .line 3
    iput-object p2, p0, LV2/y;->o:LV2/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LV2/y;->p:LV2/z;

    .line 2
    .line 3
    invoke-static {v0}, LV2/z;->b(LV2/z;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LV2/y;->p:LV2/z;

    .line 9
    .line 10
    invoke-static {v1}, LV2/z;->a(LV2/z;)LV2/e;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, LV2/z;->a(LV2/z;)LV2/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, LV2/y;->o:LV2/j;

    .line 21
    .line 22
    invoke-interface {v1, v2}, LV2/e;->a(LV2/j;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v1
.end method
