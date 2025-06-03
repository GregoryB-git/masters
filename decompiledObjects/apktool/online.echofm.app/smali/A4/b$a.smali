.class public LA4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA4/b;-><init>(Ls3/e;LR4/l;Ls3/n;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LC4/a;

.field public final synthetic b:LA4/b;


# direct methods
.method public constructor <init>(LA4/b;LC4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA4/b$a;->b:LA4/b;

    .line 2
    .line 3
    iput-object p2, p0, LA4/b$a;->a:LC4/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()LS4/b$a;
    .locals 1

    .line 1
    sget-object v0, LS4/b$a;->p:LS4/b$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(LS4/b$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LS4/b$b;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LJ4/a;->c(Ljava/lang/String;)LJ4/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/session/SessionManager;->updatePerfSession(LJ4/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LA4/b$a;->a:LC4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC4/a;->H()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LC4/a;->L()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method
