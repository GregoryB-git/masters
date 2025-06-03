.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"

.field private static final backgroundDispatcher:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lnc/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lnc/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static final firebaseApp:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lu7/f;",
            ">;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lu9/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final sessionLifecycleServiceBinder:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lea/j0;",
            ">;"
        }
    .end annotation
.end field

.field private static final sessionsSettings:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lga/h;",
            ">;"
        }
    .end annotation
.end field

.field private static final transportFactory:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Lh3/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lnc/a0;

    .line 2
    .line 3
    new-instance v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    .line 9
    .line 10
    const-class v1, Lu7/f;

    .line 11
    .line 12
    invoke-static {v1}, Ld8/t;->a(Ljava/lang/Class;)Ld8/t;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    .line 17
    .line 18
    const-class v1, Lu9/d;

    .line 19
    .line 20
    invoke-static {v1}, Ld8/t;->a(Ljava/lang/Class;)Ld8/t;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ld8/t;

    .line 25
    .line 26
    const-class v1, Ly7/a;

    .line 27
    .line 28
    new-instance v2, Ld8/t;

    .line 29
    .line 30
    invoke-direct {v2, v1, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    .line 34
    .line 35
    const-class v1, Ly7/b;

    .line 36
    .line 37
    new-instance v2, Ld8/t;

    .line 38
    .line 39
    invoke-direct {v2, v1, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ld8/t;

    .line 43
    .line 44
    const-class v0, Lh3/i;

    .line 45
    .line 46
    invoke-static {v0}, Ld8/t;->a(Ljava/lang/Class;)Ld8/t;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ld8/t;

    .line 51
    .line 52
    const-class v0, Lga/h;

    .line 53
    .line 54
    invoke-static {v0}, Ld8/t;->a(Ljava/lang/Class;)Ld8/t;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ld8/t;

    .line 59
    .line 60
    const-class v0, Lea/j0;

    .line 61
    .line 62
    invoke-static {v0}, Ld8/t;->a(Ljava/lang/Class;)Ld8/t;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Ld8/t;

    .line 67
    .line 68
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld8/u;)Lea/e0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(Ld8/c;)Lea/e0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ld8/u;)Lga/h;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$3(Ld8/c;)Lga/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ld8/u;)Lea/v;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$4(Ld8/c;)Lea/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ld8/u;)Lea/o;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(Ld8/c;)Lea/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ld8/u;)Lea/a0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$2(Ld8/c;)Lea/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ld8/u;)Lea/j0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$5(Ld8/c;)Lea/j0;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(Ld8/c;)Lea/o;
    .locals 5

    new-instance v0, Lea/o;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    invoke-interface {p0, v1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lu7/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ld8/t;

    invoke-interface {p0, v2}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[sessionsSettings]"

    invoke-static {v2, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lga/h;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    invoke-interface {p0, v3}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lub/h;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Ld8/t;

    invoke-interface {p0, v4}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[sessionLifecycleServiceBinder]"

    invoke-static {p0, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lea/j0;

    invoke-direct {v0, v1, v2, v3, p0}, Lea/o;-><init>(Lu7/f;Lga/h;Lub/h;Lea/j0;)V

    return-object v0
.end method

.method private static final getComponents$lambda$1(Ld8/c;)Lea/e0;
    .locals 1

    new-instance p0, Lea/e0;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lea/e0;-><init>(I)V

    return-object p0
.end method

.method private static final getComponents$lambda$2(Ld8/c;)Lea/a0;
    .locals 7

    new-instance v6, Lea/b0;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    invoke-interface {p0, v0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "container[firebaseApp]"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lu7/f;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ld8/t;

    invoke-interface {p0, v0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "container[firebaseInstallationsApi]"

    invoke-static {v0, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lu9/d;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ld8/t;

    invoke-interface {p0, v0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "container[sessionsSettings]"

    invoke-static {v0, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lga/h;

    new-instance v4, Lea/k;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ld8/t;

    invoke-interface {p0, v0}, Ld8/c;->c(Ld8/t;)Lt9/b;

    move-result-object v0

    const-string v5, "container.getProvider(transportFactory)"

    invoke-static {v0, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Lea/k;-><init>(Lt9/b;)V

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    invoke-interface {p0, v0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "container[backgroundDispatcher]"

    invoke-static {p0, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Lub/h;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lea/b0;-><init>(Lu7/f;Lu9/d;Lga/h;Lea/k;Lub/h;)V

    return-object v6
.end method

.method private static final getComponents$lambda$3(Ld8/c;)Lga/h;
    .locals 5

    new-instance v0, Lga/h;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    invoke-interface {p0, v1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lu7/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ld8/t;

    invoke-interface {p0, v2}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[blockingDispatcher]"

    invoke-static {v2, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lub/h;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    invoke-interface {p0, v3}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lub/h;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ld8/t;

    invoke-interface {p0, v4}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[firebaseInstallationsApi]"

    invoke-static {p0, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lu9/d;

    invoke-direct {v0, v1, v2, v3, p0}, Lga/h;-><init>(Lu7/f;Lub/h;Lub/h;Lu9/d;)V

    return-object v0
.end method

.method private static final getComponents$lambda$4(Ld8/c;)Lea/v;
    .locals 3

    .line 1
    new-instance v0, Lea/w;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lu7/f;

    .line 10
    .line 11
    invoke-virtual {v1}, Lu7/f;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v1, Lu7/f;->a:Landroid/content/Context;

    .line 15
    .line 16
    const-string v2, "container[firebaseApp].applicationContext"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    .line 22
    .line 23
    invoke-interface {p0, v2}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v2, "container[backgroundDispatcher]"

    .line 28
    .line 29
    invoke-static {p0, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p0, Lub/h;

    .line 33
    .line 34
    invoke-direct {v0, v1, p0}, Lea/w;-><init>(Landroid/content/Context;Lub/h;)V

    .line 35
    .line 36
    .line 37
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
.end method

.method private static final getComponents$lambda$5(Ld8/c;)Lea/j0;
    .locals 2

    new-instance v0, Lea/k0;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    invoke-interface {p0, v1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "container[firebaseApp]"

    invoke-static {p0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lu7/f;

    invoke-direct {v0, p0}, Lea/k0;-><init>(Lu7/f;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [Ld8/b;

    .line 3
    .line 4
    const-class v1, Lea/o;

    .line 5
    .line 6
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "fire-sessions"

    .line 11
    .line 12
    iput-object v2, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ld8/t;

    .line 15
    .line 16
    invoke-static {v3}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 21
    .line 22
    .line 23
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ld8/t;

    .line 24
    .line 25
    invoke-static {v4}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 30
    .line 31
    .line 32
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ld8/t;

    .line 33
    .line 34
    invoke-static {v5}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v1, v6}, Ld8/b$a;->a(Ld8/k;)V

    .line 39
    .line 40
    .line 41
    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Ld8/t;

    .line 42
    .line 43
    invoke-static {v6}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v1, v6}, Ld8/b$a;->a(Ld8/k;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Ld9/r;

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    invoke-direct {v6, v7}, Ld9/r;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object v6, v1, Ld8/b$a;->f:Ld8/e;

    .line 57
    .line 58
    invoke-virtual {v1, v7}, Ld8/b$a;->c(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v6, 0x0

    .line 66
    aput-object v1, v0, v6

    .line 67
    .line 68
    const-class v1, Lea/e0;

    .line 69
    .line 70
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v8, "session-generator"

    .line 75
    .line 76
    iput-object v8, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v8, Le0/d;

    .line 79
    .line 80
    invoke-direct {v8, v7}, Le0/d;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object v8, v1, Ld8/b$a;->f:Ld8/e;

    .line 84
    .line 85
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v8, 0x1

    .line 90
    aput-object v1, v0, v8

    .line 91
    .line 92
    const-class v1, Lea/a0;

    .line 93
    .line 94
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v9, "session-publisher"

    .line 99
    .line 100
    iput-object v9, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 101
    .line 102
    new-instance v9, Ld8/k;

    .line 103
    .line 104
    invoke-direct {v9, v3, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v9}, Ld8/b$a;->a(Ld8/k;)V

    .line 108
    .line 109
    .line 110
    sget-object v9, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ld8/t;

    .line 111
    .line 112
    invoke-static {v9}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-virtual {v1, v10}, Ld8/b$a;->a(Ld8/k;)V

    .line 117
    .line 118
    .line 119
    new-instance v10, Ld8/k;

    .line 120
    .line 121
    invoke-direct {v10, v4, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v10}, Ld8/b$a;->a(Ld8/k;)V

    .line 125
    .line 126
    .line 127
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ld8/t;

    .line 128
    .line 129
    new-instance v10, Ld8/k;

    .line 130
    .line 131
    invoke-direct {v10, v4, v8, v8}, Ld8/k;-><init>(Ld8/t;II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v10}, Ld8/b$a;->a(Ld8/k;)V

    .line 135
    .line 136
    .line 137
    new-instance v4, Ld8/k;

    .line 138
    .line 139
    invoke-direct {v4, v5, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 143
    .line 144
    .line 145
    new-instance v4, Ld9/p;

    .line 146
    .line 147
    const/4 v10, 0x5

    .line 148
    invoke-direct {v4, v10}, Ld9/p;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iput-object v4, v1, Ld8/b$a;->f:Ld8/e;

    .line 152
    .line 153
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    aput-object v1, v0, v7

    .line 158
    .line 159
    const-class v1, Lga/h;

    .line 160
    .line 161
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v4, "sessions-settings"

    .line 166
    .line 167
    iput-object v4, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 168
    .line 169
    new-instance v4, Ld8/k;

    .line 170
    .line 171
    invoke-direct {v4, v3, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 175
    .line 176
    .line 177
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ld8/t;

    .line 178
    .line 179
    invoke-static {v4}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 184
    .line 185
    .line 186
    new-instance v4, Ld8/k;

    .line 187
    .line 188
    invoke-direct {v4, v5, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 192
    .line 193
    .line 194
    new-instance v4, Ld8/k;

    .line 195
    .line 196
    invoke-direct {v4, v9, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 200
    .line 201
    .line 202
    new-instance v4, Ld9/q;

    .line 203
    .line 204
    invoke-direct {v4, v7}, Ld9/q;-><init>(I)V

    .line 205
    .line 206
    .line 207
    iput-object v4, v1, Ld8/b$a;->f:Ld8/e;

    .line 208
    .line 209
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    const/4 v4, 0x3

    .line 214
    aput-object v1, v0, v4

    .line 215
    .line 216
    const/4 v1, 0x4

    .line 217
    const-class v7, Lea/v;

    .line 218
    .line 219
    invoke-static {v7}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    const-string v9, "sessions-datastore"

    .line 224
    .line 225
    iput-object v9, v7, Ld8/b$a;->a:Ljava/lang/String;

    .line 226
    .line 227
    new-instance v9, Ld8/k;

    .line 228
    .line 229
    invoke-direct {v9, v3, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v9}, Ld8/b$a;->a(Ld8/k;)V

    .line 233
    .line 234
    .line 235
    new-instance v9, Ld8/k;

    .line 236
    .line 237
    invoke-direct {v9, v5, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v9}, Ld8/b$a;->a(Ld8/k;)V

    .line 241
    .line 242
    .line 243
    new-instance v5, Ld9/r;

    .line 244
    .line 245
    invoke-direct {v5, v4}, Ld9/r;-><init>(I)V

    .line 246
    .line 247
    .line 248
    iput-object v5, v7, Ld8/b$a;->f:Ld8/e;

    .line 249
    .line 250
    invoke-virtual {v7}, Ld8/b$a;->b()Ld8/b;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    aput-object v5, v0, v1

    .line 255
    .line 256
    const-class v1, Lea/j0;

    .line 257
    .line 258
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    const-string v5, "sessions-service-binder"

    .line 263
    .line 264
    iput-object v5, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 265
    .line 266
    new-instance v5, Ld8/k;

    .line 267
    .line 268
    invoke-direct {v5, v3, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 272
    .line 273
    .line 274
    new-instance v3, Le0/d;

    .line 275
    .line 276
    invoke-direct {v3, v4}, Le0/d;-><init>(I)V

    .line 277
    .line 278
    .line 279
    iput-object v3, v1, Ld8/b$a;->f:Ld8/e;

    .line 280
    .line 281
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    aput-object v1, v0, v10

    .line 286
    .line 287
    const/4 v1, 0x6

    .line 288
    const-string v3, "2.0.8"

    .line 289
    .line 290
    invoke-static {v2, v3}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    aput-object v2, v0, v1

    .line 295
    .line 296
    invoke-static {v0}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method
