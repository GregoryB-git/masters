.class public final Lb0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp2/m0;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lx/e$a;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/c;->a:Lp2/m0;

    iput-object p2, p0, Lb0/c;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lb0/l$a;)V
    .locals 3

    .line 1
    iget v0, p1, Lb0/l$a;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object p1, p1, Lb0/l$a;->a:Landroid/graphics/Typeface;

    .line 11
    .line 12
    iget-object v0, p0, Lb0/c;->a:Lp2/m0;

    .line 13
    .line 14
    iget-object v1, p0, Lb0/c;->b:Landroid/os/Handler;

    .line 15
    .line 16
    new-instance v2, Lb0/a;

    .line 17
    .line 18
    invoke-direct {v2, v0, p1}, Lb0/a;-><init>(Lp2/m0;Landroid/graphics/Typeface;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object p1, p0, Lb0/c;->a:Lp2/m0;

    .line 26
    .line 27
    iget-object v1, p0, Lb0/c;->b:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v2, Lb0/b;

    .line 30
    .line 31
    invoke-direct {v2, p1, v0}, Lb0/b;-><init>(Lp2/m0;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    :goto_1
    return-void
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
.end method
