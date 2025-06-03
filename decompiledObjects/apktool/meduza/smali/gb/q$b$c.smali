.class public final Lgb/q$b$c;
.super Lgb/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/q$b;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lgb/q$b;


# direct methods
.method public constructor <init>(Lgb/q$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgb/q$b$c;->b:Lgb/q$b;

    .line 2
    .line 3
    iget-object p1, p1, Lgb/q$b;->c:Lgb/q;

    .line 4
    .line 5
    iget-object p1, p1, Lgb/q;->f:Leb/p;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lgb/z;-><init>(Leb/p;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-static {}, Lpb/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lgb/q$b$c;->b:Lgb/q$b;

    .line 5
    .line 6
    iget-object v0, v0, Lgb/q$b;->c:Lgb/q;

    .line 7
    .line 8
    iget-object v0, v0, Lgb/q;->b:Lpb/c;

    .line 9
    .line 10
    invoke-static {}, Lpb/b;->a()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lgb/q$b$c;->b:Lgb/q$b;

    .line 19
    .line 20
    iget-object v1, v0, Lgb/q$b;->b:Leb/e1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_1
    iget-object v0, v0, Lgb/q$b;->a:Leb/e$a;

    .line 26
    .line 27
    invoke-virtual {v0}, Leb/e$a;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    :try_start_2
    iget-object v1, p0, Lgb/q$b$c;->b:Lgb/q$b;

    .line 33
    .line 34
    sget-object v2, Leb/e1;->f:Leb/e1;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "Failed to call onReady."

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, v1, Lgb/q$b;->b:Leb/e1;

    .line 47
    .line 48
    iget-object v1, v1, Lgb/q$b;->c:Lgb/q;

    .line 49
    .line 50
    iget-object v1, v1, Lgb/q;->j:Lgb/s;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Lgb/s;->n(Leb/e1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    :try_start_3
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_2
    move-exception v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    throw v0
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
