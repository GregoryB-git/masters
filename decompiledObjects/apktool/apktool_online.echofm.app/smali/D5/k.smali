.class public LD5/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/k$b;
    }
.end annotation


# instance fields
.field public a:LD5/k$b;

.field public b:LD5/k$b;

.field public c:Z

.field public final d:LE5/a;


# direct methods
.method public constructor <init>(LE5/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LD5/k;->a:LD5/k$b;

    iput-object v0, p0, LD5/k;->b:LD5/k$b;

    const/4 v0, 0x1

    iput-boolean v0, p0, LD5/k;->c:Z

    iput-object p1, p0, LD5/k;->d:LE5/a;

    return-void
.end method

.method public constructor <init>(Lw5/a;)V
    .locals 3

    .line 2
    new-instance v0, LE5/a;

    const-string v1, "flutter/lifecycle"

    sget-object v2, LE5/r;->b:LE5/r;

    invoke-direct {v0, p1, v1, v2}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    invoke-direct {p0, v0}, LD5/k;-><init>(LE5/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LD5/k;->a:LD5/k$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    sget-object v0, LD5/k$b;->o:LD5/k$b;

    .line 2
    .line 3
    iget-boolean v1, p0, LD5/k;->c:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    sget-object v0, LD5/k$b;->q:LD5/k$b;

    .line 2
    .line 3
    iget-boolean v1, p0, LD5/k;->c:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    sget-object v0, LD5/k$b;->s:LD5/k$b;

    .line 2
    .line 3
    iget-boolean v1, p0, LD5/k;->c:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    sget-object v0, LD5/k$b;->p:LD5/k$b;

    .line 2
    .line 3
    iget-boolean v1, p0, LD5/k;->c:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, LD5/k;->a:LD5/k$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LD5/k;->g(LD5/k$b;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g(LD5/k$b;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LD5/k;->a:LD5/k$b;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, LD5/k;->c:Z

    .line 6
    .line 7
    if-ne p2, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iput-boolean p2, p0, LD5/k;->c:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    sget-object v0, LD5/k$a;->a:[I

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    aget v0, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    if-eq v0, v1, :cond_2

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v0, p1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    if-eqz p2, :cond_4

    .line 45
    .line 46
    sget-object v0, LD5/k$b;->p:LD5/k$b;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    sget-object v0, LD5/k$b;->q:LD5/k$b;

    .line 50
    .line 51
    :goto_0
    iput-object p1, p0, LD5/k;->a:LD5/k$b;

    .line 52
    .line 53
    iput-boolean p2, p0, LD5/k;->c:Z

    .line 54
    .line 55
    iget-object p1, p0, LD5/k;->b:LD5/k$b;

    .line 56
    .line 57
    if-ne v0, p1, :cond_5

    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p2, "AppLifecycleState."

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 75
    .line 76
    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v1, "Sending "

    .line 93
    .line 94
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, " message."

    .line 101
    .line 102
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-string v1, "LifecycleChannel"

    .line 110
    .line 111
    invoke-static {v1, p2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object p2, p0, LD5/k;->d:LE5/a;

    .line 115
    .line 116
    invoke-virtual {p2, p1}, LE5/a;->c(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, LD5/k;->b:LD5/k$b;

    .line 120
    .line 121
    return-void
.end method
