.class public final synthetic Lv3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;
.implements Ln9/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lv3/y;->a:I

    iput-object p1, p0, Lv3/y;->c:Ljava/lang/Object;

    iput p2, p0, Lv3/y;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/y;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li9/n;

    .line 4
    .line 5
    iget v1, p0, Lv3/y;->b:I

    .line 6
    .line 7
    iget-object v2, v0, Li9/n;->c:Li9/a0;

    .line 8
    .line 9
    invoke-interface {v2, v1}, Li9/a0;->h(I)Lk9/g;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v3

    .line 19
    :goto_0
    new-array v3, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v5, "Attempt to reject nonexistent batch!"

    .line 22
    .line 23
    invoke-static {v5, v4, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Li9/n;->c:Li9/a0;

    .line 27
    .line 28
    invoke-interface {v3, v2}, Li9/a0;->b(Lk9/g;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, Li9/n;->c:Li9/a0;

    .line 32
    .line 33
    invoke-interface {v3}, Li9/a0;->a()V

    .line 34
    .line 35
    .line 36
    iget-object v3, v0, Li9/n;->d:Li9/b;

    .line 37
    .line 38
    invoke-interface {v3, v1}, Li9/b;->f(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Li9/n;->f:Li9/h;

    .line 42
    .line 43
    invoke-virtual {v2}, Lk9/g;->b()Ljava/util/HashSet;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, v1, Li9/h;->a:Li9/g0;

    .line 48
    .line 49
    invoke-interface {v4, v3}, Li9/g0;->a(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v3}, Li9/h;->g(Ljava/util/Map;)Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Li9/n;->f:Li9/h;

    .line 57
    .line 58
    invoke-virtual {v2}, Lk9/g;->b()Ljava/util/HashSet;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Li9/h;->b(Ljava/lang/Iterable;)Lt8/c;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
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

.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lv3/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lv3/y;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lv3/d1;

    .line 10
    .line 11
    iget v1, p0, Lv3/y;->b:I

    .line 12
    .line 13
    check-cast p1, Lv3/f1$c;

    .line 14
    .line 15
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lv3/f1$c;->Y(Lv3/r1;I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    check-cast p1, Lw3/b;

    .line 22
    .line 23
    invoke-interface {p1}, Lw3/b;->S()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
