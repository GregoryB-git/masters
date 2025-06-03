.class public final LA4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/a;


# instance fields
.field public final a:LU5/a;

.field public final b:LU5/a;

.field public final c:LU5/a;

.field public final d:LU5/a;

.field public final e:LU5/a;

.field public final f:LU5/a;

.field public final g:LU5/a;


# direct methods
.method public constructor <init>(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA4/g;->a:LU5/a;

    .line 5
    .line 6
    iput-object p2, p0, LA4/g;->b:LU5/a;

    .line 7
    .line 8
    iput-object p3, p0, LA4/g;->c:LU5/a;

    .line 9
    .line 10
    iput-object p4, p0, LA4/g;->d:LU5/a;

    .line 11
    .line 12
    iput-object p5, p0, LA4/g;->e:LU5/a;

    .line 13
    .line 14
    iput-object p6, p0, LA4/g;->f:LU5/a;

    .line 15
    .line 16
    iput-object p7, p0, LA4/g;->g:LU5/a;

    .line 17
    .line 18
    return-void
.end method

.method public static a(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)LA4/g;
    .locals 9

    .line 1
    new-instance v8, LA4/g;

    .line 2
    .line 3
    move-object v0, v8

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    move-object v7, p6

    .line 11
    invoke-direct/range {v0 .. v7}, LA4/g;-><init>(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)V

    .line 12
    .line 13
    .line 14
    return-object v8
.end method

.method public static c(Ls3/e;Lr4/b;Ls4/i;Lr4/b;Lcom/google/firebase/perf/config/RemoteConfigManager;LC4/a;Lcom/google/firebase/perf/session/SessionManager;)LA4/e;
    .locals 9

    .line 1
    new-instance v8, LA4/e;

    .line 2
    .line 3
    move-object v0, v8

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    move-object v7, p6

    .line 11
    invoke-direct/range {v0 .. v7}, LA4/e;-><init>(Ls3/e;Lr4/b;Ls4/i;Lr4/b;Lcom/google/firebase/perf/config/RemoteConfigManager;LC4/a;Lcom/google/firebase/perf/session/SessionManager;)V

    .line 12
    .line 13
    .line 14
    return-object v8
.end method


# virtual methods
.method public b()LA4/e;
    .locals 8

    .line 1
    iget-object v0, p0, LA4/g;->a:LU5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ls3/e;

    .line 9
    .line 10
    iget-object v0, p0, LA4/g;->b:LU5/a;

    .line 11
    .line 12
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Lr4/b;

    .line 18
    .line 19
    iget-object v0, p0, LA4/g;->c:LU5/a;

    .line 20
    .line 21
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v3, v0

    .line 26
    check-cast v3, Ls4/i;

    .line 27
    .line 28
    iget-object v0, p0, LA4/g;->d:LU5/a;

    .line 29
    .line 30
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Lr4/b;

    .line 36
    .line 37
    iget-object v0, p0, LA4/g;->e:LU5/a;

    .line 38
    .line 39
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 45
    .line 46
    iget-object v0, p0, LA4/g;->f:LU5/a;

    .line 47
    .line 48
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, LC4/a;

    .line 54
    .line 55
    iget-object v0, p0, LA4/g;->g:LU5/a;

    .line 56
    .line 57
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v7, v0

    .line 62
    check-cast v7, Lcom/google/firebase/perf/session/SessionManager;

    .line 63
    .line 64
    invoke-static/range {v1 .. v7}, LA4/g;->c(Ls3/e;Lr4/b;Ls4/i;Lr4/b;Lcom/google/firebase/perf/config/RemoteConfigManager;LC4/a;Lcom/google/firebase/perf/session/SessionManager;)LA4/e;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA4/g;->b()LA4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
