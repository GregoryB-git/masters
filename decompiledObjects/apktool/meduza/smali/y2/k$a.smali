.class public final Ly2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly2/k;->a(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ly2/k;


# direct methods
.method public constructor <init>(Ly2/k;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly2/k$a;->b:Ly2/k;

    iput-object p2, p0, Ly2/k$a;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ly2/k$a;->b:Ly2/k;

    iget-object v0, v0, Ly2/k;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly2/k$a;->b:Ly2/k;

    iget-object v1, v1, Ly2/k;->d:Lo/a;

    iget-object v2, p0, Ly2/k$a;->a:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lo/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Ly2/k$a;->b:Ly2/k;

    iget-object v3, v2, Ly2/k;->a:Ljava/lang/Object;

    if-nez v3, :cond_0

    if-eqz v1, :cond_0

    iput-object v1, v2, Ly2/k;->a:Ljava/lang/Object;

    iget-object v2, v2, Ly2/k;->e:Lb1/u;

    :goto_0
    invoke-virtual {v2, v1}, Lb1/w;->postValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Ly2/k$a;->b:Ly2/k;

    iput-object v1, v2, Ly2/k;->a:Ljava/lang/Object;

    iget-object v2, v2, Ly2/k;->e:Lb1/u;

    goto :goto_0

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
