.class public final Lc4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/f$a;
    }
.end annotation


# static fields
.field public static final e:[I

.field public static final f:Lc4/f$a;

.field public static final g:Lc4/f$a;


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:Lo7/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lc4/f;->e:[I

    new-instance v0, Lc4/f$a;

    new-instance v1, Lr3/j;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lr3/j;-><init>(I)V

    invoke-direct {v0, v1}, Lc4/f$a;-><init>(Lc4/f$a$a;)V

    sput-object v0, Lc4/f;->f:Lc4/f$a;

    new-instance v0, Lc4/f$a;

    new-instance v1, Le0/d;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Le0/d;-><init>(I)V

    invoke-direct {v0, v1}, Lc4/f$a;-><init>(Lc4/f$a$a;)V

    sput-object v0, Lc4/f;->g:Lc4/f$a;

    return-void

    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 5
    .line 6
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 7
    .line 8
    iput-object v0, p0, Lc4/f;->d:Lo7/l0;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/net/Uri;Ljava/util/Map;)[Lc4/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lc4/h;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lc4/f;->e:[I

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p2}, Lb/z;->l(Ljava/util/Map;)I

    move-result p2

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    invoke-virtual {p0, p2, v0}, Lc4/f;->b(ILjava/util/ArrayList;)V

    :cond_0
    invoke-static {p1}, Lb/z;->m(Landroid/net/Uri;)I

    move-result p1

    if-eq p1, v3, :cond_1

    if-eq p1, p2, :cond_1

    invoke-virtual {p0, p1, v0}, Lc4/f;->b(ILjava/util/ArrayList;)V

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    if-eq v4, p2, :cond_2

    if-eq v4, p1, :cond_2

    invoke-virtual {p0, v4, v0}, Lc4/f;->b(ILjava/util/ArrayList;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lc4/h;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc4/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(ILjava/util/ArrayList;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x2

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    :pswitch_1
    new-instance p1, Le4/b;

    invoke-direct {p1}, Le4/b;-><init>()V

    goto/16 :goto_0

    :pswitch_2
    sget-object p1, Lc4/f;->g:Lc4/f$a;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lc4/f$a;->a([Ljava/lang/Object;)Lc4/h;

    move-result-object p1

    if-eqz p1, :cond_4

    goto/16 :goto_0

    :pswitch_3
    new-instance p1, Lh4/a;

    invoke-direct {p1}, Lh4/a;-><init>()V

    goto/16 :goto_0

    :pswitch_4
    new-instance p1, Ln4/a;

    invoke-direct {p1}, Ln4/a;-><init>()V

    goto/16 :goto_0

    :pswitch_5
    new-instance p1, Lm4/c0;

    new-instance v2, Lv5/c0;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Lv5/c0;-><init>(J)V

    new-instance v3, Lm4/g;

    iget-object v4, p0, Lc4/f;->d:Lo7/l0;

    invoke-direct {v3, v0, v4}, Lm4/g;-><init>(ILjava/util/List;)V

    invoke-direct {p1, v1, v2, v3}, Lm4/c0;-><init>(ILv5/c0;Lm4/g;)V

    goto/16 :goto_0

    :pswitch_6
    new-instance p1, Lm4/w;

    invoke-direct {p1}, Lm4/w;-><init>()V

    goto/16 :goto_0

    :pswitch_7
    new-instance p1, Ll4/c;

    invoke-direct {p1}, Ll4/c;-><init>()V

    goto/16 :goto_0

    :pswitch_8
    new-instance p1, Lk4/e;

    invoke-direct {p1}, Lk4/e;-><init>()V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lk4/g;

    invoke-direct {p1, v0}, Lk4/g;-><init>(I)V

    goto :goto_0

    :pswitch_9
    new-instance p1, Lj4/d;

    iget v1, p0, Lc4/f;->c:I

    iget-boolean v3, p0, Lc4/f;->a:Z

    or-int/2addr v1, v3

    iget-boolean v3, p0, Lc4/f;->b:Z

    if-eqz v3, :cond_0

    move v0, v2

    :cond_0
    or-int/2addr v0, v1

    invoke-direct {p1, v0}, Lj4/d;-><init>(I)V

    goto :goto_0

    :pswitch_a
    new-instance p1, Li4/d;

    invoke-direct {p1, v0}, Li4/d;-><init>(I)V

    goto :goto_0

    :pswitch_b
    new-instance p1, Lg4/b;

    invoke-direct {p1}, Lg4/b;-><init>()V

    goto :goto_0

    :pswitch_c
    sget-object p1, Lc4/f;->f:Lc4/f$a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-virtual {p1, v1}, Lc4/f$a;->a([Ljava/lang/Object;)Lc4/h;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lf4/b;

    invoke-direct {p1}, Lf4/b;-><init>()V

    goto :goto_0

    :pswitch_d
    new-instance p1, Ld4/a;

    iget-boolean v1, p0, Lc4/f;->a:Z

    or-int/2addr v1, v0

    iget-boolean v3, p0, Lc4/f;->b:Z

    if-eqz v3, :cond_2

    move v0, v2

    :cond_2
    or-int/2addr v0, v1

    invoke-direct {p1, v0}, Ld4/a;-><init>(I)V

    goto :goto_0

    :pswitch_e
    new-instance p1, Lm4/e;

    iget-boolean v1, p0, Lc4/f;->a:Z

    or-int/2addr v1, v0

    iget-boolean v3, p0, Lc4/f;->b:Z

    if-eqz v3, :cond_3

    move v0, v2

    :cond_3
    or-int/2addr v0, v1

    invoke-direct {p1, v0}, Lm4/e;-><init>(I)V

    goto :goto_0

    :pswitch_f
    new-instance p1, Lm4/c;

    invoke-direct {p1}, Lm4/c;-><init>()V

    goto :goto_0

    :pswitch_10
    new-instance p1, Lm4/a;

    invoke-direct {p1}, Lm4/a;-><init>()V

    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
