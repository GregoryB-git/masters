.class public final Lw5/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/j$c;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final synthetic b:Lw5/g;


# direct methods
.method public constructor <init>(Lw5/g;Lo4/j;)V
    .locals 0

    iput-object p1, p0, Lw5/g$c;->b:Lw5/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lv5/e0;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lw5/g$c;->a:Landroid/os/Handler;

    invoke-interface {p2, p0, p1}, Lo4/j;->g(Lo4/j$c;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lw5/g$c;->b:Lw5/g;

    .line 2
    .line 3
    iget-object v1, v0, Lw5/g;->s1:Lw5/g$c;

    .line 4
    .line 5
    if-ne p0, v1, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, Lo4/m;->O:Lo4/j;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-wide v1, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v1, p1, v1

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iput-boolean v2, v0, Lo4/m;->D0:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lo4/m;->z0(J)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lw5/g;->I0()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lo4/m;->F0:Lz3/e;

    .line 32
    .line 33
    iget v3, v1, Lz3/e;->e:I

    .line 34
    .line 35
    add-int/2addr v3, v2

    .line 36
    iput v3, v1, Lz3/e;->e:I

    .line 37
    .line 38
    invoke-virtual {v0}, Lw5/g;->H0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, p2}, Lw5/g;->i0(J)V
    :try_end_0
    .catch Lv3/n; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p1

    .line 46
    iget-object p2, p0, Lw5/g$c;->b:Lw5/g;

    .line 47
    .line 48
    iput-object p1, p2, Lo4/m;->E0:Lv3/n;

    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
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

.method public final b(J)V
    .locals 4

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lw5/g$c;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v2, v2

    long-to-int p1, p1

    invoke-static {v0, v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lw5/g$c;->a:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lw5/g$c;->a(J)V

    :goto_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    sget v1, Lv5/e0;->a:I

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lw5/g$c;->a(J)V

    const/4 p1, 0x1

    return p1
.end method
