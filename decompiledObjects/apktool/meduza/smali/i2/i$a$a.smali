.class public final Li2/i$a$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "Lj2/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Li2/i$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/i$a$a;

    invoke-direct {v0}, Li2/i$a$a;-><init>()V

    sput-object v0, Li2/i$a$a;->a:Li2/i$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Li2/i;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v2, Li2/h;

    .line 11
    .line 12
    new-instance v3, Lf2/b;

    .line 13
    .line 14
    invoke-direct {v3, v1}, Lf2/b;-><init>(Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v1, v3}, Li2/h;-><init>(Ljava/lang/ClassLoader;Lf2/b;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v0

    .line 22
    :goto_0
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v2}, Li2/h;->a()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    new-instance v3, Lf2/b;

    .line 31
    .line 32
    const-string v4, "loader"

    .line 33
    .line 34
    invoke-static {v1, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, v1}, Lf2/b;-><init>(Ljava/lang/ClassLoader;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Lf2/d;->a:Lf2/d;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lf2/d;->a()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v4, 0x2

    .line 50
    if-lt v1, v4, :cond_1

    .line 51
    .line 52
    new-instance v1, Lk2/d;

    .line 53
    .line 54
    invoke-direct {v1, v2}, Lk2/d;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v4, 0x1

    .line 59
    if-ne v1, v4, :cond_2

    .line 60
    .line 61
    new-instance v1, Lk2/c;

    .line 62
    .line 63
    invoke-direct {v1, v2, v3}, Lk2/c;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;Lf2/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance v1, Lk2/a;

    .line 68
    .line 69
    invoke-direct {v1}, Lk2/a;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :goto_1
    move-object v0, v1

    .line 73
    goto :goto_2

    .line 74
    :catchall_0
    sget-object v1, Li2/i$a;->a:Li2/i$a;

    .line 75
    .line 76
    :cond_3
    :goto_2
    return-object v0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
