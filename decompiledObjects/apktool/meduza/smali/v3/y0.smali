.class public final synthetic Lv3/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv3/z0$a;

.field public final synthetic c:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lv3/z0$a;Landroid/util/Pair;I)V
    .locals 0

    iput p3, p0, Lv3/y0;->a:I

    iput-object p1, p0, Lv3/y0;->b:Lv3/z0$a;

    iput-object p2, p0, Lv3/y0;->c:Landroid/util/Pair;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lv3/y0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lv3/y0;->b:Lv3/z0$a;

    .line 8
    .line 9
    iget-object v1, p0, Lv3/y0;->c:Landroid/util/Pair;

    .line 10
    .line 11
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 12
    .line 13
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 14
    .line 15
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lz4/t$b;

    .line 26
    .line 27
    invoke-interface {v0, v2, v1}, La4/g;->H(ILz4/t$b;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_0
    iget-object v0, p0, Lv3/y0;->b:Lv3/z0$a;

    .line 32
    .line 33
    iget-object v1, p0, Lv3/y0;->c:Landroid/util/Pair;

    .line 34
    .line 35
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 36
    .line 37
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 38
    .line 39
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lz4/t$b;

    .line 50
    .line 51
    invoke-interface {v0, v2, v1}, La4/g;->j0(ILz4/t$b;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
