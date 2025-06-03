.class public final Lgb/q$b$a;
.super Lgb/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/q$b;->b(Leb/s0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Leb/s0;

.field public final synthetic c:Lgb/q$b;


# direct methods
.method public constructor <init>(Lgb/q$b;Leb/s0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgb/q$b$a;->c:Lgb/q$b;

    .line 2
    .line 3
    iput-object p2, p0, Lgb/q$b$a;->b:Leb/s0;

    .line 4
    .line 5
    iget-object p1, p1, Lgb/q$b;->c:Lgb/q;

    .line 6
    .line 7
    iget-object p1, p1, Lgb/q;->f:Leb/p;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lgb/z;-><init>(Leb/p;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
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
    iget-object v0, p0, Lgb/q$b$a;->c:Lgb/q$b;

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
    iget-object v0, p0, Lgb/q$b$a;->c:Lgb/q$b;

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
    iget-object v1, p0, Lgb/q$b$a;->b:Leb/s0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Leb/e$a;->b(Leb/s0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    :try_start_2
    iget-object v1, p0, Lgb/q$b$a;->c:Lgb/q$b;

    .line 35
    .line 36
    sget-object v2, Leb/e1;->f:Leb/e1;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "Failed to read headers"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, v1, Lgb/q$b;->b:Leb/e1;

    .line 49
    .line 50
    iget-object v1, v1, Lgb/q$b;->c:Lgb/q;

    .line 51
    .line 52
    iget-object v1, v1, Lgb/q;->j:Lgb/s;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lgb/s;->n(Leb/e1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    .line 57
    :goto_0
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    :try_start_3
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    throw v0
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
