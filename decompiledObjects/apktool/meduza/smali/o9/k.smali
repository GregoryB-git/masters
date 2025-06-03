.class public final Lo9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/i$a;


# instance fields
.field public final a:Lk3/y;


# direct methods
.method public constructor <init>(Lk3/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/k;->a:Lk3/y;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lo9/e;
    .locals 9

    .line 1
    iget-object v0, p0, Lo9/k;->a:Lk3/y;

    .line 2
    .line 3
    iget-object v1, v0, Lk3/y;->b:Lqb/a;

    .line 4
    .line 5
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move-object v3, v1

    .line 10
    check-cast v3, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, v0, Lk3/y;->c:Lqb/a;

    .line 13
    .line 14
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v4, v1

    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, v0, Lk3/y;->d:Lqb/a;

    .line 22
    .line 23
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v6, v1

    .line 28
    check-cast v6, Lo9/a;

    .line 29
    .line 30
    iget-object v1, v0, Lk3/y;->e:Lqb/a;

    .line 31
    .line 32
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v7, v1

    .line 37
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    iget-object v0, v0, Lk3/y;->f:Lqb/a;

    .line 40
    .line 41
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v8, v0

    .line 46
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 47
    .line 48
    new-instance v0, Lo9/e;

    .line 49
    .line 50
    move-object v2, v0

    .line 51
    move-object v5, p1

    .line 52
    invoke-direct/range {v2 .. v8}, Lo9/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo9/a;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    return-object v0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
