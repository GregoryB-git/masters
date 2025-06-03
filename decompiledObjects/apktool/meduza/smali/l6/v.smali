.class public final Ll6/v;
.super Ll6/e1;
.source "SourceFile"


# instance fields
.field public final e:Lr/d;

.field public final f:Ll6/d;


# direct methods
.method public constructor <init>(Ll6/g;Ll6/d;Lj6/e;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Ll6/e1;-><init>(Ll6/g;Lj6/e;)V

    new-instance p1, Lr/d;

    invoke-direct {p1}, Lr/d;-><init>()V

    iput-object p1, p0, Ll6/v;->e:Lr/d;

    iput-object p2, p0, Ll6/v;->f:Ll6/d;

    iget-object p1, p0, Ll6/f;->mLifecycleFragment:Ll6/g;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Ll6/g;->c(Ljava/lang/String;Ll6/f;)V

    return-void
.end method


# virtual methods
.method public final onResume()V
    .locals 1

    invoke-super {p0}, Ll6/f;->onResume()V

    iget-object v0, p0, Ll6/v;->e:Lr/d;

    invoke-virtual {v0}, Lr/d;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll6/v;->f:Ll6/d;

    invoke-virtual {v0, p0}, Ll6/d;->a(Ll6/v;)V

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    invoke-super {p0}, Ll6/e1;->onStart()V

    iget-object v0, p0, Ll6/v;->e:Lr/d;

    invoke-virtual {v0}, Lr/d;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll6/v;->f:Ll6/d;

    invoke-virtual {v0, p0}, Ll6/d;->a(Ll6/v;)V

    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 3

    invoke-super {p0}, Ll6/e1;->onStop()V

    iget-object v0, p0, Ll6/v;->f:Ll6/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ll6/d;->z:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Ll6/d;->s:Ll6/v;

    if-ne v2, p0, :cond_0

    const/4 v2, 0x0

    iput-object v2, v0, Ll6/d;->s:Ll6/v;

    iget-object v0, v0, Ll6/d;->t:Lr/d;

    invoke-virtual {v0}, Lr/d;->clear()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
