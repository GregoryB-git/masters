.class public final synthetic Li9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li9/n;

.field public final synthetic b:Lf9/j;

.field public final synthetic c:Li9/m1;

.field public final synthetic d:I

.field public final synthetic e:Lt8/e;


# direct methods
.method public synthetic constructor <init>(Li9/n;Lf9/j;Li9/m1;ILt8/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/j;->a:Li9/n;

    iput-object p2, p0, Li9/j;->b:Lf9/j;

    iput-object p3, p0, Li9/j;->c:Li9/m1;

    iput p4, p0, Li9/j;->d:I

    iput-object p5, p0, Li9/j;->e:Lt8/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Li9/j;->a:Li9/n;

    .line 2
    .line 3
    iget-object v1, p0, Li9/j;->b:Lf9/j;

    .line 4
    .line 5
    iget-object v2, p0, Li9/j;->c:Li9/m1;

    .line 6
    .line 7
    iget v3, p0, Li9/j;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Li9/j;->e:Lt8/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v5, v1, Lf9/j;->c:Lj9/q;

    .line 15
    .line 16
    iget-object v6, v2, Li9/m1;->e:Lj9/q;

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Lj9/q;->f(Lj9/q;)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-lez v5, :cond_0

    .line 23
    .line 24
    sget-object v5, Lma/h;->b:Lma/h$h;

    .line 25
    .line 26
    iget-object v6, v1, Lf9/j;->c:Lj9/q;

    .line 27
    .line 28
    invoke-virtual {v2, v5, v6}, Li9/m1;->a(Lma/h;Lj9/q;)Li9/m1;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v5, v0, Li9/n;->k:Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-virtual {v5, v3, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v5, v0, Li9/n;->i:Li9/l1;

    .line 38
    .line 39
    invoke-interface {v5, v2}, Li9/l1;->h(Li9/m1;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Li9/n;->i:Li9/l1;

    .line 43
    .line 44
    invoke-interface {v2, v3}, Li9/l1;->i(I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Li9/n;->i:Li9/l1;

    .line 48
    .line 49
    invoke-interface {v2, v4, v3}, Li9/l1;->b(Lt8/e;I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v0, v0, Li9/n;->j:Li9/a;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Li9/a;->c(Lf9/j;)V

    .line 55
    .line 56
    .line 57
    return-void
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
