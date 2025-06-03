.class public final Lb/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/w$a;,
        Lb/w$b;,
        Lb/w$c;,
        Lb/w$d;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ld0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lsb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsb/i<",
            "Lb/p;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lb/p;

.field public e:Landroid/window/OnBackInvokedCallback;

.field public f:Landroid/window/OnBackInvokedDispatcher;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lb/w;-><init>(Ljava/lang/Runnable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/w;->a:Ljava/lang/Runnable;

    const/4 p1, 0x0

    iput-object p1, p0, Lb/w;->b:Ld0/a;

    new-instance p1, Lsb/i;

    invoke-direct {p1}, Lsb/i;-><init>()V

    iput-object p1, p0, Lb/w;->c:Lsb/i;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    sget-object p1, Lb/w$b;->a:Lb/w$b;

    new-instance v0, Lb/q;

    invoke-direct {v0, p0}, Lb/q;-><init>(Lb/w;)V

    new-instance v1, Lb/r;

    invoke-direct {v1, p0}, Lb/r;-><init>(Lb/w;)V

    new-instance v2, Lb/s;

    invoke-direct {v2, p0}, Lb/s;-><init>(Lb/w;)V

    new-instance v3, Lb/t;

    invoke-direct {v3, p0}, Lb/t;-><init>(Lb/w;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lb/w$b;->a(Ldc/l;Ldc/l;Ldc/a;Ldc/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lb/w$a;->a:Lb/w$a;

    new-instance v0, Lb/u;

    invoke-direct {v0, p0}, Lb/u;-><init>(Lb/w;)V

    invoke-virtual {p1, v0}, Lb/w$a;->a(Ldc/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb/w;->e:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb/p;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1}, Lb1/k;->b()Lb1/k$b;

    move-result-object v0

    sget-object v1, Lb1/k$b;->a:Lb1/k$b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lb/w$c;

    invoke-direct {v0, p0, p1, p2}, Lb/w$c;-><init>(Lb/w;Lb1/k;Lb/p;)V

    invoke-virtual {p2, v0}, Lb/p;->addCancellable(Lb/c;)V

    invoke-virtual {p0}, Lb/w;->d()V

    new-instance p1, Lb/w$e;

    invoke-direct {p1, p0}, Lb/w$e;-><init>(Lb/w;)V

    invoke-virtual {p2, p1}, Lb/p;->setEnabledChangedCallback$activity_release(Ldc/a;)V

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lb/w;->d:Lb/p;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lb/w;->c:Lsb/i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lb/p;

    invoke-virtual {v3}, Lb/p;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lb/p;

    :cond_2
    iput-object v1, p0, Lb/w;->d:Lb/p;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lb/p;->handleOnBackPressed()V

    return-void

    :cond_3
    iget-object v0, p0, Lb/w;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_4
    return-void
.end method

.method public final c(Z)V
    .locals 4

    iget-object v0, p0, Lb/w;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Lb/w;->e:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-boolean v3, p0, Lb/w;->g:Z

    if-nez v3, :cond_0

    sget-object p1, Lb/w$a;->a:Lb/w$a;

    invoke-virtual {p1, v0, v2, v1}, Lb/w$a;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb/w;->g:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lb/w;->g:Z

    if-eqz p1, :cond_1

    sget-object p1, Lb/w$a;->a:Lb/w$a;

    invoke-virtual {p1, v0, v1}, Lb/w$a;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Lb/w;->g:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    iget-boolean v0, p0, Lb/w;->h:Z

    iget-object v1, p0, Lb/w;->c:Lsb/i;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p;

    invoke-virtual {v2}, Lb/p;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Lb/w;->h:Z

    if-eq v3, v0, :cond_4

    iget-object v0, p0, Lb/w;->b:Ld0/a;

    if-eqz v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Ld0/a;->accept(Ljava/lang/Object;)V

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    invoke-virtual {p0, v3}, Lb/w;->c(Z)V

    :cond_4
    return-void
.end method
