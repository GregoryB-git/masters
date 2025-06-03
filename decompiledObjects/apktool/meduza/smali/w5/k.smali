.class public final synthetic Lw5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lw5/n$a;

.field public final synthetic c:I

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lw5/n$a;IJ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw5/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/k;->b:Lw5/n$a;

    iput p2, p0, Lw5/k;->c:I

    iput-wide p3, p0, Lw5/k;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lw5/n$a;JI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw5/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/k;->b:Lw5/n$a;

    iput-wide p2, p0, Lw5/k;->d:J

    iput p4, p0, Lw5/k;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lw5/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lw5/k;->b:Lw5/n$a;

    .line 8
    .line 9
    iget-wide v1, p0, Lw5/k;->d:J

    .line 10
    .line 11
    iget v3, p0, Lw5/k;->c:I

    .line 12
    .line 13
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 14
    .line 15
    sget v4, Lv5/e0;->a:I

    .line 16
    .line 17
    invoke-interface {v0, v3, v1, v2}, Lw5/n;->e(IJ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    iget-object v0, p0, Lw5/k;->b:Lw5/n$a;

    .line 22
    .line 23
    iget v1, p0, Lw5/k;->c:I

    .line 24
    .line 25
    iget-wide v2, p0, Lw5/k;->d:J

    .line 26
    .line 27
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 28
    .line 29
    sget v4, Lv5/e0;->a:I

    .line 30
    .line 31
    invoke-interface {v0, v1, v2, v3}, Lw5/n;->k(IJ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
