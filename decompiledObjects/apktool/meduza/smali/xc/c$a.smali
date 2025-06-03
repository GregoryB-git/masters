.class public final Lxc/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a()Lxc/c;
    .locals 7

    .line 1
    sget-object v0, Lxc/c;->l:Lxc/c;

    .line 2
    .line 3
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lxc/c;->f:Lxc/c;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lxc/c;->i:Ljava/util/concurrent/locks/Condition;

    .line 16
    .line 17
    sget-wide v4, Lxc/c;->j:J

    .line 18
    .line 19
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 22
    .line 23
    .line 24
    sget-object v0, Lxc/c;->l:Lxc/c;

    .line 25
    .line 26
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lxc/c;->f:Lxc/c;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    sub-long/2addr v4, v1

    .line 38
    sget-wide v0, Lxc/c;->k:J

    .line 39
    .line 40
    cmp-long v0, v4, v0

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    sget-object v3, Lxc/c;->l:Lxc/c;

    .line 45
    .line 46
    :cond_0
    return-object v3

    .line 47
    :cond_1
    iget-wide v4, v0, Lxc/c;->g:J

    .line 48
    .line 49
    sub-long/2addr v4, v1

    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    cmp-long v1, v4, v1

    .line 53
    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    sget-object v0, Lxc/c;->i:Ljava/util/concurrent/locks/Condition;

    .line 57
    .line 58
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 59
    .line 60
    invoke-interface {v0, v4, v5, v1}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_2
    sget-object v1, Lxc/c;->l:Lxc/c;

    .line 65
    .line 66
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v0, Lxc/c;->f:Lxc/c;

    .line 70
    .line 71
    iput-object v2, v1, Lxc/c;->f:Lxc/c;

    .line 72
    .line 73
    iput-object v3, v0, Lxc/c;->f:Lxc/c;

    .line 74
    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
