.class public final Lcom/google/crypto/tink/shaded/protobuf/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/f0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/G$b;
    }
.end annotation


# static fields
.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/N;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/G$a;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/G$a;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/G;->b:Lcom/google/crypto/tink/shaded/protobuf/N;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/G;->b()Lcom/google/crypto/tink/shaded/protobuf/N;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/G;-><init>(Lcom/google/crypto/tink/shaded/protobuf/N;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/N;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/N;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/G;->a:Lcom/google/crypto/tink/shaded/protobuf/N;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/N;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/G$b;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/w;->c()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/G;->c()Lcom/google/crypto/tink/shaded/protobuf/N;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/shaded/protobuf/N;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/G$b;-><init>([Lcom/google/crypto/tink/shaded/protobuf/N;)V

    return-object v0
.end method

.method public static c()Lcom/google/crypto/tink/shaded/protobuf/N;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

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

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/N;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/G;->b:Lcom/google/crypto/tink/shaded/protobuf/N;

    return-object v0
.end method

.method public static d(Lcom/google/crypto/tink/shaded/protobuf/M;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/M;->b()Lcom/google/crypto/tink/shaded/protobuf/Z;

    move-result-object p0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/Z;->o:Lcom/google/crypto/tink/shaded/protobuf/Z;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 8

    .line 1
    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/G;->d(Lcom/google/crypto/tink/shaded/protobuf/M;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/W;->b()Lcom/google/crypto/tink/shaded/protobuf/U;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->b()Lcom/google/crypto/tink/shaded/protobuf/E;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->L()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/L;->b()Lcom/google/crypto/tink/shaded/protobuf/J;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->T(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/W;->b()Lcom/google/crypto/tink/shaded/protobuf/U;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->b()Lcom/google/crypto/tink/shaded/protobuf/E;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->L()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/L;->b()Lcom/google/crypto/tink/shaded/protobuf/J;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->T(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/G;->d(Lcom/google/crypto/tink/shaded/protobuf/M;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/W;->a()Lcom/google/crypto/tink/shaded/protobuf/U;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->a()Lcom/google/crypto/tink/shaded/protobuf/E;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->G()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->a()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/L;->a()Lcom/google/crypto/tink/shaded/protobuf/J;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->T(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/W;->a()Lcom/google/crypto/tink/shaded/protobuf/U;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->a()Lcom/google/crypto/tink/shaded/protobuf/E;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->H()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/L;->a()Lcom/google/crypto/tink/shaded/protobuf/J;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->T(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g0;->I(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/G;->a:Lcom/google/crypto/tink/shaded/protobuf/N;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/N;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/M;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->L()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/M;->c()Lcom/google/crypto/tink/shaded/protobuf/O;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/T;->m(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/O;)Lcom/google/crypto/tink/shaded/protobuf/T;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/g0;->G()Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->a()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/G;->e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p1

    return-object p1
.end method
