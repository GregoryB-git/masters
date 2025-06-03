.class public final synthetic Ld9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/i;


# instance fields
.field public final synthetic a:Lg9/f0;

.field public final synthetic b:Lg9/k$a;

.field public final synthetic c:Lg9/d;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lg9/f0;Lg9/k$a;Lg9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/j;->a:Lg9/f0;

    iput-object p2, p0, Ld9/j;->b:Lg9/k$a;

    iput-object p3, p0, Ld9/j;->c:Lg9/d;

    const/4 p1, 0x0

    iput-object p1, p0, Ld9/j;->d:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ld9/j;->a:Lg9/f0;

    .line 2
    .line 3
    iget-object v1, p0, Ld9/j;->b:Lg9/k$a;

    .line 4
    .line 5
    iget-object v2, p0, Ld9/j;->c:Lg9/d;

    .line 6
    .line 7
    iget-object v3, p0, Ld9/j;->d:Landroid/app/Activity;

    .line 8
    .line 9
    check-cast p1, Lg9/u;

    .line 10
    .line 11
    invoke-virtual {p1}, Lg9/u;->d()V

    .line 12
    .line 13
    .line 14
    new-instance v4, Lg9/g0;

    .line 15
    .line 16
    invoke-direct {v4, v0, v1, v2}, Lg9/g0;-><init>(Lg9/f0;Lg9/k$a;Lg9/d;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lg9/u;->d:Ln9/a;

    .line 20
    .line 21
    new-instance v1, Lx0/f;

    .line 22
    .line 23
    const/16 v5, 0x12

    .line 24
    .line 25
    invoke-direct {v1, v5, p1, v4}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ld9/k;

    .line 32
    .line 33
    invoke-direct {v0, v2, p1, v4}, Ld9/k;-><init>(Lg9/d;Lg9/u;Lg9/g0;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v0}, Lg9/a;->a(Landroid/app/Activity;Ld9/b0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
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
