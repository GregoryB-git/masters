.class public final Le0/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/s0$j;,
        Le0/s0$k;,
        Le0/s0$i;,
        Le0/s0$h;,
        Le0/s0$g;,
        Le0/s0$f;,
        Le0/s0$a;,
        Le0/s0$d;,
        Le0/s0$c;,
        Le0/s0$b;,
        Le0/s0$e;
    }
.end annotation


# static fields
.field public static final b:Le0/s0;


# instance fields
.field public final a:Le0/s0$k;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Le0/s0$j;->l:Le0/s0;

    goto :goto_0

    :cond_0
    sget-object v0, Le0/s0$k;->b:Le0/s0;

    :goto_0
    sput-object v0, Le0/s0;->b:Le0/s0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le0/s0$k;

    invoke-direct {v0, p0}, Le0/s0$k;-><init>(Le0/s0;)V

    iput-object v0, p0, Le0/s0;->a:Le0/s0$k;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Le0/s0$j;

    invoke-direct {v0, p0, p1}, Le0/s0$j;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, Le0/s0;->a:Le0/s0$k;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Le0/s0$i;

    invoke-direct {v0, p0, p1}, Le0/s0$i;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, Le0/s0$h;

    invoke-direct {v0, p0, p1}, Le0/s0$h;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    new-instance v0, Le0/s0$g;

    invoke-direct {v0, p0, p1}, Le0/s0$g;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static a(Lx/b;IIII)Lx/b;
    .locals 5

    iget v0, p0, Lx/b;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lx/b;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lx/b;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lx/b;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lx/b;->a(IIII)Lx/b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;
    .locals 2

    .line 1
    new-instance v0, Le0/s0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Le0/s0;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-static {p1}, Le0/d0$e;->a(Landroid/view/View;)Le0/s0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object v1, v0, Le0/s0;->a:Le0/s0$k;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Le0/s0$k;->l(Le0/s0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p1, v0, Le0/s0;->a:Le0/s0$k;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Le0/s0$k;->d(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final b()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Le0/s0;->a:Le0/s0$k;

    instance-of v1, v0, Le0/s0$f;

    if-eqz v1, :cond_0

    check-cast v0, Le0/s0$f;

    iget-object v0, v0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Le0/s0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Le0/s0;

    iget-object v0, p0, Le0/s0;->a:Le0/s0$k;

    iget-object p1, p1, Le0/s0;->a:Le0/s0$k;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Le0/s0;->a:Le0/s0$k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Le0/s0$k;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method
