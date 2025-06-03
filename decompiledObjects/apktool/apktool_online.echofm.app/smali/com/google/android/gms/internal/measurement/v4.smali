.class public final Lcom/google/android/gms/internal/measurement/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/b5;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/J4;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/J4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/z4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/z4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/v4;->b:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/B4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Z3;->c()Lcom/google/android/gms/internal/measurement/Z3;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/v4;->b()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/J4;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/B4;-><init>([Lcom/google/android/gms/internal/measurement/J4;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/v4;-><init>(Lcom/google/android/gms/internal/measurement/J4;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J4;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/a4;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/J4;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/v4;->a:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method public static b()Lcom/google/android/gms/internal/measurement/J4;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/J4;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/v4;->b:Lcom/google/android/gms/internal/measurement/J4;

    return-object v0
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/G4;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/x4;->a:[I

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/G4;->b()Lcom/google/android/gms/internal/measurement/V4;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/Z4;
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/a5;->o(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v4;->a:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/J4;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/G4;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/G4;->c()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/measurement/Y3;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a5;->u()Lcom/google/android/gms/internal/measurement/x5;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/P3;->b()Lcom/google/android/gms/internal/measurement/O3;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/G4;->a()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/O4;->j(Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/I4;)Lcom/google/android/gms/internal/measurement/O4;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a5;->f()Lcom/google/android/gms/internal/measurement/x5;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/P3;->a()Lcom/google/android/gms/internal/measurement/O3;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/G4;->a()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/O4;->j(Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/I4;)Lcom/google/android/gms/internal/measurement/O4;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/v4;->c(Lcom/google/android/gms/internal/measurement/G4;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Q4;->b()Lcom/google/android/gms/internal/measurement/P4;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/q4;->c()Lcom/google/android/gms/internal/measurement/q4;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a5;->u()Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/P3;->b()Lcom/google/android/gms/internal/measurement/O3;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/H4;->b()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/M4;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/G4;Lcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/M4;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/H4;->b()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/M4;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/G4;Lcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/M4;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/v4;->c(Lcom/google/android/gms/internal/measurement/G4;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Q4;->a()Lcom/google/android/gms/internal/measurement/P4;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/q4;->a()Lcom/google/android/gms/internal/measurement/q4;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a5;->f()Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v5

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/P3;->a()Lcom/google/android/gms/internal/measurement/O3;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/H4;->a()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/M4;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/G4;Lcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/M4;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/H4;->a()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/M4;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/G4;Lcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/M4;

    move-result-object p1

    return-object p1
.end method
