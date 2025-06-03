.class public final Lz2/p;
.super Lz2/X;
.source "SourceFile"


# instance fields
.field public final t:Lt/b;

.field public final u:Lz2/e;


# direct methods
.method public constructor <init>(Lz2/g;Lz2/e;Lx2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lz2/X;-><init>(Lz2/g;Lx2/j;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lt/b;

    .line 5
    .line 6
    invoke-direct {p1}, Lt/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lz2/p;->t:Lt/b;

    .line 10
    .line 11
    iput-object p2, p0, Lz2/p;->u:Lz2/e;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->o:Lz2/g;

    .line 14
    .line 15
    const-string p2, "ConnectionlessLifecycleHelper"

    .line 16
    .line 17
    invoke-interface {p1, p2, p0}, Lz2/g;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static u(Landroid/app/Activity;Lz2/e;Lz2/b;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->c(Landroid/app/Activity;)Lz2/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ConnectionlessLifecycleHelper"

    .line 6
    .line 7
    const-class v1, Lz2/p;

    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, Lz2/g;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lz2/p;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lz2/p;

    .line 18
    .line 19
    invoke-static {}, Lx2/j;->m()Lx2/j;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, p0, p1, v1}, Lz2/p;-><init>(Lz2/g;Lz2/e;Lx2/j;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const-string p0, "ApiKey cannot be null"

    .line 27
    .line 28
    invoke-static {p2, p0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, Lz2/p;->t:Lt/b;

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lt/b;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lz2/e;->c(Lz2/p;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lz2/p;->v()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    invoke-super {p0}, Lz2/X;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lz2/p;->v()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-super {p0}, Lz2/X;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz2/p;->u:Lz2/e;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lz2/e;->d(Lz2/p;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final m(Lx2/b;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/p;->u:Lz2/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lz2/e;->F(Lx2/b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/p;->u:Lz2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz2/e;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t()Lt/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/p;->t:Lt/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/p;->t:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/b;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lz2/p;->u:Lz2/e;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lz2/e;->c(Lz2/p;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
