.class public final Lw1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;
.implements LB5/a;


# instance fields
.field public final a:Lw1/q;

.field public b:LE5/k;

.field public c:LB5/c;

.field public d:Lw1/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw1/q;

    .line 5
    .line 6
    invoke-direct {v0}, Lw1/q;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw1/m;->a:Lw1/q;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/m;->c:LB5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lw1/m;->a:Lw1/q;

    .line 6
    .line 7
    invoke-interface {v0, v1}, LB5/c;->d(LE5/m;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw1/m;->c:LB5/c;

    .line 11
    .line 12
    iget-object v1, p0, Lw1/m;->a:Lw1/q;

    .line 13
    .line 14
    invoke-interface {v0, v1}, LB5/c;->f(LE5/o;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/m;->c:LB5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lw1/m;->a:Lw1/q;

    .line 6
    .line 7
    invoke-interface {v0, v1}, LB5/c;->h(LE5/m;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw1/m;->c:LB5/c;

    .line 11
    .line 12
    iget-object v1, p0, Lw1/m;->a:Lw1/q;

    .line 13
    .line 14
    invoke-interface {v0, v1}, LB5/c;->e(LE5/o;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final c(Landroid/content/Context;LE5/c;)V
    .locals 3

    .line 1
    new-instance v0, LE5/k;

    .line 2
    .line 3
    const-string v1, "flutter.baseflow.com/permissions/methods"

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lw1/m;->b:LE5/k;

    .line 9
    .line 10
    new-instance p2, Lw1/l;

    .line 11
    .line 12
    new-instance v0, Lw1/a;

    .line 13
    .line 14
    invoke-direct {v0}, Lw1/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lw1/m;->a:Lw1/q;

    .line 18
    .line 19
    new-instance v2, Lw1/y;

    .line 20
    .line 21
    invoke-direct {v2}, Lw1/y;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, p1, v0, v1, v2}, Lw1/l;-><init>(Landroid/content/Context;Lw1/a;Lw1/q;Lw1/y;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lw1/m;->d:Lw1/l;

    .line 28
    .line 29
    iget-object p1, p0, Lw1/m;->b:LE5/k;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, LE5/k;->e(LE5/k$c;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/m;->d:Lw1/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lw1/l;->i(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/m;->b:LE5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object v1, p0, Lw1/m;->b:LE5/k;

    .line 8
    .line 9
    iput-object v1, p0, Lw1/m;->d:Lw1/l;

    .line 10
    .line 11
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/m;->d:Lw1/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lw1/l;->i(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public onAttachedToActivity(LB5/c;)V
    .locals 1

    .line 1
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lw1/m;->d(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lw1/m;->c:LB5/c;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw1/m;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Lw1/m;->c(Landroid/content/Context;LE5/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw1/m;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lw1/m;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw1/m;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw1/m;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(LB5/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/m;->onAttachedToActivity(LB5/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
