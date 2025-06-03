.class public final synthetic Lg9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg9/u;


# direct methods
.method public synthetic constructor <init>(Lg9/u;I)V
    .locals 0

    iput p2, p0, Lg9/n;->a:I

    iput-object p1, p0, Lg9/n;->b:Lg9/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lg9/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lg9/n;->b:Lg9/u;

    .line 8
    .line 9
    iget-object v0, v0, Lg9/u;->g:Li9/n;

    .line 10
    .line 11
    iget-object v1, v0, Li9/n;->a:Le9/a;

    .line 12
    .line 13
    new-instance v2, Lb/k;

    .line 14
    .line 15
    const/16 v3, 0xd

    .line 16
    .line 17
    invoke-direct {v2, v0, v3}, Lb/k;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const-string v0, "Delete All Indexes"

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_0
    iget-object v0, p0, Lg9/n;->b:Lg9/u;

    .line 27
    .line 28
    iget-object v0, v0, Lg9/u;->h:Lm9/h0;

    .line 29
    .line 30
    invoke-virtual {v0}, Lm9/h0;->b()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

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
