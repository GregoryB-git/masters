.class public final Lm2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b;


# instance fields
.field public final a:LU5/a;

.field public final b:LU5/a;

.field public final c:LU5/a;

.field public final d:LU5/a;


# direct methods
.method public constructor <init>(LU5/a;LU5/a;LU5/a;LU5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm2/w;->a:LU5/a;

    .line 5
    .line 6
    iput-object p2, p0, Lm2/w;->b:LU5/a;

    .line 7
    .line 8
    iput-object p3, p0, Lm2/w;->c:LU5/a;

    .line 9
    .line 10
    iput-object p4, p0, Lm2/w;->d:LU5/a;

    .line 11
    .line 12
    return-void
.end method

.method public static a(LU5/a;LU5/a;LU5/a;LU5/a;)Lm2/w;
    .locals 1

    .line 1
    new-instance v0, Lm2/w;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lm2/w;-><init>(LU5/a;LU5/a;LU5/a;LU5/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ln2/d;Lm2/x;Lo2/b;)Lm2/v;
    .locals 1

    .line 1
    new-instance v0, Lm2/v;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lm2/v;-><init>(Ljava/util/concurrent/Executor;Ln2/d;Lm2/x;Lo2/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public b()Lm2/v;
    .locals 4

    .line 1
    iget-object v0, p0, Lm2/w;->a:LU5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object v1, p0, Lm2/w;->b:LU5/a;

    .line 10
    .line 11
    invoke-interface {v1}, LU5/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ln2/d;

    .line 16
    .line 17
    iget-object v2, p0, Lm2/w;->c:LU5/a;

    .line 18
    .line 19
    invoke-interface {v2}, LU5/a;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lm2/x;

    .line 24
    .line 25
    iget-object v3, p0, Lm2/w;->d:LU5/a;

    .line 26
    .line 27
    invoke-interface {v3}, LU5/a;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lo2/b;

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Lm2/w;->c(Ljava/util/concurrent/Executor;Ln2/d;Lm2/x;Lo2/b;)Lm2/v;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm2/w;->b()Lm2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
