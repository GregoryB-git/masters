.class public final Le0/d0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/d0$d;->u(Landroid/view/View;Le0/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Le0/s0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Le0/t;


# direct methods
.method public constructor <init>(Landroid/view/View;Le0/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Le0/d0$d$a;->b:Landroid/view/View;

    iput-object p2, p0, Le0/d0$d$a;->c:Le0/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Le0/d0$d$a;->a:Le0/s0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 1
    invoke-static {p2, p1}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1e

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Le0/d0$d$a;->b:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {p2, v3}, Le0/d0$d;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Le0/d0$d$a;->a:Le0/s0;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Le0/s0;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-object p2, p0, Le0/d0$d$a;->c:Le0/t;

    .line 25
    .line 26
    check-cast p2, Lg/h;

    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Lg/h;->a(Landroid/view/View;Le0/s0;)Le0/s0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Le0/s0;->b()Landroid/view/WindowInsets;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    iput-object v0, p0, Le0/d0$d$a;->a:Le0/s0;

    .line 38
    .line 39
    iget-object p2, p0, Le0/d0$d$a;->c:Le0/t;

    .line 40
    .line 41
    check-cast p2, Lg/h;

    .line 42
    .line 43
    invoke-virtual {p2, p1, v0}, Lg/h;->a(Landroid/view/View;Le0/s0;)Le0/s0;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-lt v1, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, Le0/s0;->b()Landroid/view/WindowInsets;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_1
    invoke-static {p1}, Le0/d0$c;->c(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Le0/s0;->b()Landroid/view/WindowInsets;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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
