.class public abstract LB4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/a$b;


# instance fields
.field public final o:LB4/a;

.field public final p:Ljava/lang/ref/WeakReference;

.field public q:Z

.field public r:LN4/d;


# direct methods
.method public constructor <init>(LB4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LB4/b;->q:Z

    .line 6
    .line 7
    sget-object v0, LN4/d;->p:LN4/d;

    .line 8
    .line 9
    iput-object v0, p0, LB4/b;->r:LN4/d;

    .line 10
    .line 11
    iput-object p1, p0, LB4/b;->o:LB4/a;

    .line 12
    .line 13
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LB4/b;->p:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public b(LN4/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB4/b;->r:LN4/d;

    .line 2
    .line 3
    sget-object v1, LN4/d;->p:LN4/d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    :goto_0
    iput-object p1, p0, LB4/b;->r:LN4/d;

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-eq v0, p1, :cond_1

    .line 11
    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    sget-object p1, LN4/d;->s:LN4/d;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    :goto_1
    return-void
.end method

.method public c()LN4/d;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/b;->r:LN4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LB4/b;->o:LB4/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LB4/a;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LB4/b;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LB4/b;->o:LB4/a;

    .line 7
    .line 8
    invoke-virtual {v0}, LB4/a;->a()LN4/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LB4/b;->r:LN4/d;

    .line 13
    .line 14
    iget-object v0, p0, LB4/b;->o:LB4/a;

    .line 15
    .line 16
    iget-object v1, p0, LB4/b;->p:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LB4/a;->j(Ljava/lang/ref/WeakReference;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, LB4/b;->q:Z

    .line 23
    .line 24
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LB4/b;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LB4/b;->o:LB4/a;

    .line 7
    .line 8
    iget-object v1, p0, LB4/b;->p:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LB4/a;->o(Ljava/lang/ref/WeakReference;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, LB4/b;->q:Z

    .line 15
    .line 16
    return-void
.end method
