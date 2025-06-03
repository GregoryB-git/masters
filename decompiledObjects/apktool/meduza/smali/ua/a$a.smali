.class public final Lua/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lua/a;


# direct methods
.method public constructor <init>(Lua/a;)V
    .locals 0

    iput-object p1, p0, Lua/a$a;->a:Lua/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 2
    .line 3
    iget-object v0, v0, Lua/a;->I:Lv3/d0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lv3/d0;->z()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lua/a$a;->a:Lua/a;

    .line 13
    .line 14
    iget-wide v3, v2, Lua/a;->o:J

    .line 15
    .line 16
    cmp-long v0, v0, v3

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lua/a;->E()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 24
    .line 25
    iget-object v0, v0, Lua/a;->I:Lv3/d0;

    .line 26
    .line 27
    invoke-virtual {v0}, Lv3/d0;->d()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x2

    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 39
    .line 40
    iget-object v0, v0, Lua/a;->I:Lv3/d0;

    .line 41
    .line 42
    invoke-virtual {v0}, Lv3/d0;->k()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 49
    .line 50
    iget-object v0, v0, Lua/a;->M:Landroid/os/Handler;

    .line 51
    .line 52
    const-wide/16 v1, 0x1f4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 56
    .line 57
    iget-object v0, v0, Lua/a;->M:Landroid/os/Handler;

    .line 58
    .line 59
    const-wide/16 v1, 0x3e8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    iget-object v0, p0, Lua/a$a;->a:Lua/a;

    .line 63
    .line 64
    iget-object v0, v0, Lua/a;->M:Landroid/os/Handler;

    .line 65
    .line 66
    const-wide/16 v1, 0xc8

    .line 67
    .line 68
    :goto_0
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 69
    .line 70
    .line 71
    :goto_1
    return-void
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
