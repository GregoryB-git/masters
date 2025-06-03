.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
.end annotation


# static fields
.field public static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final backgroundDispatcher:LB3/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB3/F;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:LB3/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB3/F;"
        }
    .end annotation
.end field

.field private static final firebaseApp:LB3/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB3/F;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:LB3/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB3/F;"
        }
    .end annotation
.end field

.field private static final transportFactory:LB3/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB3/F;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v0, Ls3/e;

    invoke-static {v0}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LB3/F;

    const-class v0, Ls4/i;

    invoke-static {v0}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LB3/F;

    const-class v0, Ly3/a;

    const-class v1, Lp6/F;

    invoke-static {v0, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LB3/F;

    const-class v0, Ly3/b;

    invoke-static {v0, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LB3/F;

    const-class v0, Lc2/g;

    invoke-static {v0}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LB3/F;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LB3/e;)LR4/l;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-0(LB3/e;)LR4/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final getComponents$lambda-0(LB3/e;)LR4/l;
    .locals 7

    .line 1
    new-instance v6, LR4/l;

    .line 2
    .line 3
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LB3/F;

    .line 4
    .line 5
    invoke-interface {p0, v0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "container.get(firebaseApp)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Ls3/e;

    .line 16
    .line 17
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LB3/F;

    .line 18
    .line 19
    invoke-interface {p0, v0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "container.get(firebaseInstallationsApi)"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, Ls4/i;

    .line 30
    .line 31
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LB3/F;

    .line 32
    .line 33
    invoke-interface {p0, v0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "container.get(backgroundDispatcher)"

    .line 38
    .line 39
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v3, v0

    .line 43
    check-cast v3, Lp6/F;

    .line 44
    .line 45
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LB3/F;

    .line 46
    .line 47
    invoke-interface {p0, v0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v4, "container.get(blockingDispatcher)"

    .line 52
    .line 53
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move-object v4, v0

    .line 57
    check-cast v4, Lp6/F;

    .line 58
    .line 59
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LB3/F;

    .line 60
    .line 61
    invoke-interface {p0, v0}, LB3/e;->b(LB3/F;)Lr4/b;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string p0, "container.getProvider(transportFactory)"

    .line 66
    .line 67
    invoke-static {v5, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v6

    .line 71
    invoke-direct/range {v0 .. v5}, LR4/l;-><init>(Ls3/e;Ls4/i;Lp6/F;Lp6/F;Lr4/b;)V

    .line 72
    .line 73
    .line 74
    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LB3/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-class v0, LR4/l;

    invoke-static {v0}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v0

    const-string v1, "fire-sessions"

    invoke-virtual {v0, v1}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LB3/F;

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LB3/F;

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LB3/F;

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LB3/F;

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LB3/F;

    invoke-static {v2}, LB3/r;->l(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    new-instance v2, LR4/m;

    invoke-direct {v2}, LR4/m;-><init>()V

    invoke-virtual {v0, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v2, "1.1.0"

    invoke-static {v1, v2}, LO4/h;->b(Ljava/lang/String;Ljava/lang/String;)LB3/c;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LB3/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, LW5/m;->i([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
