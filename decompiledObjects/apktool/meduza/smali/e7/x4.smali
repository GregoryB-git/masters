.class public final Le7/x4;
.super Le7/v;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Le7/w4;


# direct methods
.method public synthetic constructor <init>(Le7/w4;Le7/c3;I)V
    .locals 0

    iput p3, p0, Le7/x4;->e:I

    iput-object p1, p0, Le7/x4;->f:Le7/w4;

    invoke-direct {p0, p2}, Le7/v;-><init>(Le7/c3;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Le7/x4;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/x4;->f:Le7/w4;

    .line 8
    .line 9
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Le7/w4;->C()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 23
    .line 24
    const-string v2, "Inactivity, disconnecting from the service"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Le7/w4;->B()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :goto_0
    iget-object v0, p0, Le7/x4;->f:Le7/w4;

    .line 34
    .line 35
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 40
    .line 41
    const-string v1, "Tasks have been queued for a long time"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
