.class public final Lgb/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Leb/n;

.field public final synthetic c:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;Lx0/f;Leb/n;)V
    .locals 0

    iput-object p1, p0, Lgb/u1;->c:Lgb/r1;

    iput-object p2, p0, Lgb/u1;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lgb/u1;->b:Leb/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lgb/u1;->c:Lgb/r1;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1;->s:Lgb/y;

    .line 4
    .line 5
    iget-object v2, p0, Lgb/u1;->a:Ljava/lang/Runnable;

    .line 6
    .line 7
    iget-object v0, v0, Lgb/r1;->i:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object v3, p0, Lgb/u1;->b:Leb/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v4, "callback"

    .line 15
    .line 16
    invoke-static {v2, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "executor"

    .line 20
    .line 21
    invoke-static {v0, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const-string v4, "source"

    .line 25
    .line 26
    invoke-static {v3, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lgb/y$a;

    .line 30
    .line 31
    invoke-direct {v4, v2, v0}, Lgb/y$a;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    iget-object v5, v1, Lgb/y;->b:Leb/n;

    .line 35
    .line 36
    if-eq v5, v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, v1, Lgb/y;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
