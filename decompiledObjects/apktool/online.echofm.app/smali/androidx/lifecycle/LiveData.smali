.class public abstract Landroidx/lifecycle/LiveData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/LiveData$b;,
        Landroidx/lifecycle/LiveData$c;,
        Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ln/b;

.field public c:I

.field public d:Z

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:I

.field public h:Z

.field public i:Z

.field public final j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/LiveData;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->a:Ljava/lang/Object;

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->b:Ln/b;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/LiveData;->c:I

    sget-object v0, Landroidx/lifecycle/LiveData;->k:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->f:Ljava/lang/Object;

    new-instance v1, Landroidx/lifecycle/LiveData$a;

    invoke-direct {v1, p0}, Landroidx/lifecycle/LiveData$a;-><init>(Landroidx/lifecycle/LiveData;)V

    iput-object v1, p0, Landroidx/lifecycle/LiveData;->j:Ljava/lang/Runnable;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->g:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lm/a;->d()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot invoke "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/lifecycle/LiveData;->c:I

    add-int/2addr p1, v0

    iput p1, p0, Landroidx/lifecycle/LiveData;->c:I

    iget-boolean p1, p0, Landroidx/lifecycle/LiveData;->d:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/lifecycle/LiveData;->d:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Landroidx/lifecycle/LiveData;->c:I

    if-eq v0, v2, :cond_5

    if-nez v0, :cond_1

    if-lez v2, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-lez v0, :cond_2

    if-nez v2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->f()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    move v0, v2

    goto :goto_0

    :cond_5
    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->d:Z

    return-void

    :goto_4
    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->d:Z

    throw p1
.end method

.method public final c(Landroidx/lifecycle/LiveData$c;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Landroidx/lifecycle/LiveData$c;->p:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$c;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$c;->b(Z)V

    return-void

    :cond_1
    iget v0, p1, Landroidx/lifecycle/LiveData$c;->q:I

    iget v1, p0, Landroidx/lifecycle/LiveData;->g:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    iput v1, p1, Landroidx/lifecycle/LiveData$c;->q:I

    iget-object p1, p1, Landroidx/lifecycle/LiveData$c;->o:Landroidx/lifecycle/m;

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    invoke-interface {p1, v0}, Landroidx/lifecycle/m;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroidx/lifecycle/LiveData$c;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->c(Landroidx/lifecycle/LiveData$c;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/lifecycle/LiveData;->b:Ln/b;

    invoke-virtual {v1}, Ln/b;->f()Ln/b$d;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/LiveData$c;

    invoke-virtual {p0, v2}, Landroidx/lifecycle/LiveData;->c(Landroidx/lifecycle/LiveData$c;)V

    iget-boolean v2, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-eqz v2, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z

    return-void
.end method

.method public e(Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    const-string v0, "observeForever"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/LiveData$b;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/LiveData$b;-><init>(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/m;)V

    iget-object v1, p0, Landroidx/lifecycle/LiveData;->b:Ln/b;

    invoke-virtual {v1, p1, v0}, Ln/b;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/LiveData$c;

    instance-of v1, p1, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData$c;->b(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()V
    .locals 0

    .line 1
    return-void
.end method

.method public g()V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LiveData;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/lifecycle/LiveData;->f:Ljava/lang/Object;

    sget-object v2, Landroidx/lifecycle/LiveData;->k:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/LiveData;->f:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lm/a;->d()Lm/a;

    move-result-object p1

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->j:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Lm/a;->c(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public i(Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    const-string v0, "removeObserver"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->b:Ln/b;

    invoke-virtual {v0, p1}, Ln/b;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/LiveData$c;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$c;->c()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$c;->b(Z)V

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "setValue"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    iget v0, p0, Landroidx/lifecycle/LiveData;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->g:I

    iput-object p1, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->d(Landroidx/lifecycle/LiveData$c;)V

    return-void
.end method
