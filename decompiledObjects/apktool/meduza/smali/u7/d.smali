.class public final synthetic Lu7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lu7/d;->a:I

    iput-object p2, p0, Lu7/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lu7/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu7/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu7/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lu7/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu7/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lu7/d;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ld8/i;

    .line 10
    .line 11
    iget-object v1, p0, Lu7/d;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ld8/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Ld8/b;->f:Ld8/e;

    .line 19
    .line 20
    new-instance v3, Ld8/u;

    .line 21
    .line 22
    invoke-direct {v3, v1, v0}, Ld8/u;-><init>(Ld8/b;Ld8/i;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v2, v3}, Ld8/e;->g(Ld8/u;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_1
    iget-object v0, p0, Lu7/d;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lu7/f;

    .line 33
    .line 34
    iget-object v1, p0, Lu7/d;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Landroid/content/Context;

    .line 37
    .line 38
    new-instance v2, Ly9/a;

    .line 39
    .line 40
    invoke-virtual {v0}, Lu7/f;->g()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v0, v0, Lu7/f;->d:Ld8/i;

    .line 45
    .line 46
    const-class v4, Lc9/c;

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Ld8/i;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lc9/c;

    .line 53
    .line 54
    invoke-direct {v2, v1, v3, v0}, Ly9/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lc9/c;)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :goto_0
    iget-object v0, p0, Lu7/d;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Landroid/content/Context;

    .line 61
    .line 62
    iget-object v1, p0, Lu7/d;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    new-instance v2, Lq9/g;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lq9/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
