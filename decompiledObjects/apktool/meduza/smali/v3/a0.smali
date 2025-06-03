.class public final synthetic Lv3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv3/d1;


# direct methods
.method public synthetic constructor <init>(Lv3/d1;I)V
    .locals 0

    iput p2, p0, Lv3/a0;->a:I

    iput-object p1, p0, Lv3/a0;->b:Lv3/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lv3/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lv3/a0;->b:Lv3/d1;

    .line 8
    .line 9
    check-cast p1, Lv3/f1$c;

    .line 10
    .line 11
    iget-object v0, v0, Lv3/d1;->f:Lv3/n;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lv3/f1$c;->X(Lv3/n;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    iget-object v0, p0, Lv3/a0;->b:Lv3/d1;

    .line 18
    .line 19
    check-cast p1, Lv3/f1$c;

    .line 20
    .line 21
    iget-object v0, v0, Lv3/d1;->n:Lv3/e1;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lv3/f1$c;->c0(Lv3/e1;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :goto_0
    iget-object v0, p0, Lv3/a0;->b:Lv3/d1;

    .line 28
    .line 29
    check-cast p1, Lv3/f1$c;

    .line 30
    .line 31
    iget-boolean v1, v0, Lv3/d1;->g:Z

    .line 32
    .line 33
    invoke-interface {p1, v1}, Lv3/f1$c;->D(Z)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, v0, Lv3/d1;->g:Z

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lv3/f1$c;->I(Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
