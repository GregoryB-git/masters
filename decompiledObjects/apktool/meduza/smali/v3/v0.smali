.class public final synthetic Lv3/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv3/z0$a;

.field public final synthetic c:Landroid/util/Pair;

.field public final synthetic d:Lz4/n;

.field public final synthetic e:Lz4/q;


# direct methods
.method public synthetic constructor <init>(Lv3/z0$a;Landroid/util/Pair;Lz4/n;Lz4/q;I)V
    .locals 0

    iput p5, p0, Lv3/v0;->a:I

    iput-object p1, p0, Lv3/v0;->b:Lv3/z0$a;

    iput-object p2, p0, Lv3/v0;->c:Landroid/util/Pair;

    iput-object p3, p0, Lv3/v0;->d:Lz4/n;

    iput-object p4, p0, Lv3/v0;->e:Lz4/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lv3/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lv3/v0;->b:Lv3/z0$a;

    .line 8
    .line 9
    iget-object v1, p0, Lv3/v0;->c:Landroid/util/Pair;

    .line 10
    .line 11
    iget-object v2, p0, Lv3/v0;->d:Lz4/n;

    .line 12
    .line 13
    iget-object v3, p0, Lv3/v0;->e:Lz4/q;

    .line 14
    .line 15
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 16
    .line 17
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 18
    .line 19
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lz4/t$b;

    .line 30
    .line 31
    invoke-interface {v0, v4, v1, v2, v3}, Lz4/w;->h0(ILz4/t$b;Lz4/n;Lz4/q;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_0
    iget-object v0, p0, Lv3/v0;->b:Lv3/z0$a;

    .line 36
    .line 37
    iget-object v1, p0, Lv3/v0;->c:Landroid/util/Pair;

    .line 38
    .line 39
    iget-object v2, p0, Lv3/v0;->d:Lz4/n;

    .line 40
    .line 41
    iget-object v3, p0, Lv3/v0;->e:Lz4/q;

    .line 42
    .line 43
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 44
    .line 45
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 46
    .line 47
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lz4/t$b;

    .line 58
    .line 59
    invoke-interface {v0, v4, v1, v2, v3}, Lz4/w;->n0(ILz4/t$b;Lz4/n;Lz4/q;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
