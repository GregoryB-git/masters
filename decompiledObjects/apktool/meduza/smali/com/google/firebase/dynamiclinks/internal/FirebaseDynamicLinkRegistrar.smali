.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld8/u;)Lv8/b;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(Ld8/c;)Lv8/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ld8/c;)Lv8/b;
    .locals 3

    new-instance v0, Lcom/google/firebase/dynamiclinks/internal/b;

    const-class v1, Lu7/f;

    invoke-interface {p0, v1}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu7/f;

    const-class v2, Lw7/a;

    invoke-interface {p0, v2}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/google/firebase/dynamiclinks/internal/b;-><init>(Lu7/f;Lt9/b;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lv8/b;

    .line 2
    .line 3
    invoke-static {v0}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "fire-dl"

    .line 8
    .line 9
    iput-object v1, v0, Ld8/b$a;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-class v2, Lu7/f;

    .line 12
    .line 13
    invoke-static {v2}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 18
    .line 19
    .line 20
    const-class v2, Lw7/a;

    .line 21
    .line 22
    invoke-static {v2}, Ld8/k;->b(Ljava/lang/Class;)Ld8/k;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ld9/p;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v2, v3}, Ld9/p;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v2, v0, Ld8/b$a;->f:Ld8/e;

    .line 36
    .line 37
    invoke-virtual {v0}, Ld8/b$a;->b()Ld8/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-array v2, v3, [Ld8/b;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    aput-object v0, v2, v3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    const-string v3, "22.1.0"

    .line 48
    .line 49
    invoke-static {v1, v3}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    aput-object v1, v2, v0

    .line 54
    .line 55
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
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
