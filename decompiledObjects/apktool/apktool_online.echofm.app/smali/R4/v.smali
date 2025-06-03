.class public final LR4/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LR4/x;

.field public final b:LX5/g;

.field public final c:LR4/u;

.field public final d:LT4/f;

.field public final e:LR4/s;

.field public f:J

.field public final g:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method public constructor <init>(LR4/x;LX5/g;LR4/u;LT4/f;LR4/s;)V
    .locals 1

    .line 1
    const-string v0, "timeProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundDispatcher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sessionInitiateListener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sessionsSettings"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sessionGenerator"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LR4/v;->a:LR4/x;

    .line 30
    .line 31
    iput-object p2, p0, LR4/v;->b:LX5/g;

    .line 32
    .line 33
    iput-object p3, p0, LR4/v;->c:LR4/u;

    .line 34
    .line 35
    iput-object p4, p0, LR4/v;->d:LT4/f;

    .line 36
    .line 37
    iput-object p5, p0, LR4/v;->e:LR4/s;

    .line 38
    .line 39
    invoke-interface {p1}, LR4/x;->b()J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    iput-wide p1, p0, LR4/v;->f:J

    .line 44
    .line 45
    invoke-virtual {p0}, LR4/v;->e()V

    .line 46
    .line 47
    .line 48
    new-instance p1, LR4/v$a;

    .line 49
    .line 50
    invoke-direct {p1, p0}, LR4/v$a;-><init>(LR4/v;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LR4/v;->g:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 54
    .line 55
    return-void
.end method

.method public static final synthetic a(LR4/v;)LR4/u;
    .locals 0

    .line 1
    iget-object p0, p0, LR4/v;->c:LR4/u;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LR4/v;->a:LR4/x;

    .line 2
    .line 3
    invoke-interface {v0}, LR4/x;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, LR4/v;->f:J

    .line 8
    .line 9
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LR4/v;->a:LR4/x;

    .line 2
    .line 3
    invoke-interface {v0}, LR4/x;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, LR4/v;->f:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lo6/a;->V(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v2, p0, LR4/v;->d:LT4/f;

    .line 14
    .line 15
    invoke-virtual {v2}, LT4/f;->c()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {v0, v1, v2, v3}, Lo6/a;->l(JJ)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, LR4/v;->e()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final d()Landroid/app/Application$ActivityLifecycleCallbacks;
    .locals 1

    .line 1
    iget-object v0, p0, LR4/v;->g:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()V
    .locals 8

    .line 1
    iget-object v0, p0, LR4/v;->e:LR4/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LR4/s;->a()LR4/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LR4/v;->b:LX5/g;

    .line 8
    .line 9
    invoke-static {v1}, Lp6/J;->a(LX5/g;)Lp6/I;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v5, LR4/v$b;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v5, p0, v0, v1}, LR4/v$b;-><init>(LR4/v;LR4/p;LX5/d;)V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static/range {v2 .. v7}, Lp6/g;->d(Lp6/I;LX5/g;Lp6/K;Lg6/p;ILjava/lang/Object;)Lp6/q0;

    .line 24
    .line 25
    .line 26
    return-void
.end method
