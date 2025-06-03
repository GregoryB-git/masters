.class public final synthetic Lx0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lx0/k;->a:I

    iput-object p1, p0, Lx0/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lx0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lx0/k;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lx0/y;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Lx0/y;->N()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/16 v1, 0x50

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {v0, p1}, Lx0/y;->n(Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, Lx0/k;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lx0/m;

    .line 35
    .line 36
    check-cast p1, Landroid/content/res/Configuration;

    .line 37
    .line 38
    invoke-static {v0, p1}, Lx0/m;->e(Lx0/m;Landroid/content/res/Configuration;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_0
    iget-object v0, p0, Lx0/k;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lpc/q;

    .line 45
    .line 46
    check-cast p1, Li2/k;

    .line 47
    .line 48
    invoke-interface {v0, p1}, Lpc/t;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
