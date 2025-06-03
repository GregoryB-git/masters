.class public LE4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls3/e;

.field public final b:Ls4/i;

.field public final c:Lr4/b;

.field public final d:Lr4/b;


# direct methods
.method public constructor <init>(Ls3/e;Ls4/i;Lr4/b;Lr4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE4/a;->a:Ls3/e;

    .line 5
    .line 6
    iput-object p2, p0, LE4/a;->b:Ls4/i;

    .line 7
    .line 8
    iput-object p3, p0, LE4/a;->c:Lr4/b;

    .line 9
    .line 10
    iput-object p4, p0, LE4/a;->d:Lr4/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LC4/a;
    .locals 1

    .line 1
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Ls3/e;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/a;->a:Ls3/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ls4/i;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/a;->b:Ls4/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lr4/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/a;->c:Lr4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()Lcom/google/firebase/perf/session/SessionManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g()Lr4/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/a;->d:Lr4/b;

    .line 2
    .line 3
    return-object v0
.end method
