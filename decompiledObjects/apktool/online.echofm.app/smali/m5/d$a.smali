.class public Lm5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lm5/d;


# direct methods
.method public constructor <init>(Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/d$a;->o:Lm5/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 2
    .line 3
    invoke-static {v0}, Lm5/d;->Z(Lm5/d;)Lk0/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 11
    .line 12
    invoke-static {v0}, Lm5/d;->Z(Lm5/d;)Lk0/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ld0/D;->t()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-object v2, p0, Lm5/d$a;->o:Lm5/d;

    .line 21
    .line 22
    invoke-static {v2}, Lm5/d;->a0(Lm5/d;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 31
    .line 32
    invoke-static {v0}, Lm5/d;->b0(Lm5/d;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 36
    .line 37
    invoke-static {v0}, Lm5/d;->Z(Lm5/d;)Lk0/w;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Ld0/D;->f()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x2

    .line 46
    if-eq v0, v1, :cond_4

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    if-eq v0, v1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 53
    .line 54
    invoke-static {v0}, Lm5/d;->Z(Lm5/d;)Lk0/w;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Ld0/D;->u()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 65
    .line 66
    invoke-static {v0}, Lm5/d;->c0(Lm5/d;)Landroid/os/Handler;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-wide/16 v1, 0x1f4

    .line 71
    .line 72
    :goto_0
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 77
    .line 78
    invoke-static {v0}, Lm5/d;->c0(Lm5/d;)Landroid/os/Handler;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-wide/16 v1, 0x3e8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    iget-object v0, p0, Lm5/d$a;->o:Lm5/d;

    .line 86
    .line 87
    invoke-static {v0}, Lm5/d;->c0(Lm5/d;)Landroid/os/Handler;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-wide/16 v1, 0xc8

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_1
    return-void
.end method
