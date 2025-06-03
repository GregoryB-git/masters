.class public final synthetic Lw5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj8/s;JLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw5/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/l;->c:Ljava/lang/Object;

    iput-wide p2, p0, Lw5/l;->b:J

    iput-object p4, p0, Lw5/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lw5/n$a;Landroid/view/Surface;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw5/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/l;->c:Ljava/lang/Object;

    iput-object p2, p0, Lw5/l;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lw5/l;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lw5/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lw5/l;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lw5/n$a;

    .line 10
    .line 11
    iget-object v1, p0, Lw5/l;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-wide v2, p0, Lw5/l;->b:J

    .line 14
    .line 15
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 16
    .line 17
    sget v4, Lv5/e0;->a:I

    .line 18
    .line 19
    invoke-interface {v0, v1, v2, v3}, Lw5/n;->l(Ljava/lang/Object;J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :goto_0
    iget-object v0, p0, Lw5/l;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lj8/s;

    .line 26
    .line 27
    iget-wide v1, p0, Lw5/l;->b:J

    .line 28
    .line 29
    iget-object v3, p0, Lw5/l;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, v0, Lj8/s;->h:Lj8/n;

    .line 34
    .line 35
    iget-object v4, v0, Lj8/n;->n:Lj8/v;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v4, v4, Lj8/v;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v4, 0x0

    .line 50
    :goto_1
    if-nez v4, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, Lj8/n;->i:Ll8/f;

    .line 53
    .line 54
    iget-object v0, v0, Ll8/f;->b:Ll8/d;

    .line 55
    .line 56
    invoke-interface {v0, v3, v1, v2}, Ll8/d;->c(Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
