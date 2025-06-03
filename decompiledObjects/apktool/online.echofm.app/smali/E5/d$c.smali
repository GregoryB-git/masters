.class public final LE5/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE5/d$c$a;
    }
.end annotation


# instance fields
.field public final a:LE5/d$d;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:LE5/d;


# direct methods
.method public constructor <init>(LE5/d;LE5/d$d;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE5/d$c;->c:LE5/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LE5/d$c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    iput-object p2, p0, LE5/d$c;->a:LE5/d$d;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic b(LE5/d$c;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, LE5/d$c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;LE5/c$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/d$c;->c:LE5/d;

    .line 2
    .line 3
    invoke-static {v0}, LE5/d;->a(LE5/d;)LE5/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, LE5/l;->e(Ljava/nio/ByteBuffer;)LE5/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "listen"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, LE5/d$c;->d(Ljava/lang/Object;LE5/c$b;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "cancel"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, LE5/d$c;->c(Ljava/lang/Object;LE5/c$b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/Object;LE5/c$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE5/d$c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LE5/d$b;

    .line 9
    .line 10
    const-string v2, "error"

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, LE5/d$c;->a:LE5/d$d;

    .line 15
    .line 16
    invoke-interface {v0, p1}, LE5/d$d;->a(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LE5/d$c;->c:LE5/d;

    .line 20
    .line 21
    invoke-static {p1}, LE5/d;->a(LE5/d;)LE5/l;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1, v1}, LE5/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catch_0
    move-exception p1

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "EventChannel#"

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, LE5/d$c;->c:LE5/d;

    .line 45
    .line 46
    invoke-static {v3}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v3, "Failed to close event stream"

    .line 58
    .line 59
    invoke-static {v0, v3, p1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, LE5/d$c;->c:LE5/d;

    .line 63
    .line 64
    invoke-static {v0}, LE5/d;->a(LE5/d;)LE5/l;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {v0, v2, p1, v1}, LE5/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_0
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    iget-object p1, p0, LE5/d$c;->c:LE5/d;

    .line 81
    .line 82
    invoke-static {p1}, LE5/d;->a(LE5/d;)LE5/l;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v0, "No active stream to cancel"

    .line 87
    .line 88
    invoke-interface {p1, v2, v0, v1}, LE5/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :goto_1
    return-void
.end method

.method public final d(Ljava/lang/Object;LE5/c$b;)V
    .locals 6

    .line 1
    new-instance v0, LE5/d$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LE5/d$c$a;-><init>(LE5/d$c;LE5/d$a;)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, LE5/d$c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LE5/d$b;

    .line 14
    .line 15
    const-string v3, "EventChannel#"

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    :try_start_0
    iget-object v2, p0, LE5/d$c;->a:LE5/d$d;

    .line 20
    .line 21
    invoke-interface {v2, v1}, LE5/d$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v2

    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, LE5/d$c;->c:LE5/d;

    .line 35
    .line 36
    invoke-static {v5}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "Failed to close existing event stream"

    .line 48
    .line 49
    invoke-static {v4, v5, v2}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    :goto_0
    :try_start_1
    iget-object v2, p0, LE5/d$c;->a:LE5/d$d;

    .line 53
    .line 54
    invoke-interface {v2, p1, v0}, LE5/d$d;->b(Ljava/lang/Object;LE5/d$b;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LE5/d$c;->c:LE5/d;

    .line 58
    .line 59
    invoke-static {p1}, LE5/d;->a(LE5/d;)LE5/l;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1, v1}, LE5/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception p1

    .line 72
    iget-object v0, p0, LE5/d$c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, LE5/d$c;->c:LE5/d;

    .line 86
    .line 87
    invoke-static {v2}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v2, "Failed to open event stream"

    .line 99
    .line 100
    invoke-static {v0, v2, p1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, LE5/d$c;->c:LE5/d;

    .line 104
    .line 105
    invoke-static {v0}, LE5/d;->a(LE5/d;)LE5/l;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v2, "error"

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {v0, v2, p1, v1}, LE5/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 120
    .line 121
    .line 122
    :goto_1
    return-void
.end method
